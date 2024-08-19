package biclique;

import util.ByteArray;
import cifras.Cipher;
import cifras.Rijndael;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma sequência de diferenças de estados de uma dada
 * cifra.
 * 
 */
public class StateDifferential implements Cloneable,HasStateDiferences{
    
    /**
     * Método de testes da classe.
     * 
     * @param args .
     */
    public static void testador(String[] args){
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray diff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        diff.set(0, 0xff);
        StateDifferential c = new StateDifferential(diff, 9, cipher1, cipher2);
        System.out.println(c);
    }
    
    /**
     * Diferença usada para gerar a diferencial dos estados.
     * 
     */
    private final ByteArray difference;
    
    /**
     * Índice do estado onde a diferença é aplicada.
     */
    private final int stateIndex;
    
    /**
     * A lista de diferenças de estado que representa a diferencial completa. 
     * Ela é alcançada ao propagar a diferença <code>difference</code> pela
     * cifra.
     */
    private final List<ByteArray> stateDifferences = new ArrayList<>();

    /**
     * Cifra necessária para propagar um dos elementos do par, gerando as
     * diferenças.
     */
    private final Cipher cipher1;  
    
    /**
     * Cifra necessária para propagar o outro elemento do par, gerando as
     * diferenças.
     */
    private final Cipher cipher2;  
    
    /**
     * Getter Simples para <code>cipher1</code> e <code>cipher2</code>.
     * @return .
     */
    public Cipher[] getCiphers(){
        Cipher ciphers[] = {cipher1, cipher2};
        return ciphers;
    }    

    /**
     * Construtor padrão que recebe a diferença e o índice do estado e propaga
     * esta diferença para o resto das cifras. Precisa de duas instâncias de
     * Cipher da cifra em questão.
     * 
     * @param difference diferença do estado a ser propagada
     * @param stateIndex índice do estado
     * @param cipher1 instância da Cifra em questão
     * @param cipher2 instância da Cifra em questão
     */
    public StateDifferential(ByteArray difference, int stateIndex, Cipher cipher1, Cipher cipher2) {

        this.difference = difference;
        this.stateIndex = stateIndex;
        this.cipher1 = cipher1;
        this.cipher2 = cipher2;
                
        for (int i = 0; i < cipher1.getNUM_STATES(); i++) 
            stateDifferences.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));    
        
        propagate();
    }
    
    /**
     * Retorna o número de palavras ativas apenas nos estados relevantes
     * desta StateDifferential.
     * 
     * @param relevantStates os índices dos estados relevantes.
     * @return .
     */
    public int getNumActive(List<Integer> relevantStates){
        int result = 0;
        
        if (relevantStates == null)        
            for (ByteArray b : stateDifferences) 
                result += b.countNumActiveWords(cipher1.getWORD_SIZE());
        else
            for (int i : relevantStates)
                result += stateDifferences.get(i).countNumActiveWords(cipher1.getWORD_SIZE());
                
        return result;
    }
    
    /**
     * Computa todas as PALAVRAS que são ativadas pela diferença
     * <code>difference</code> no estado de índice <code>stateIndex</code>. 
     */
    public final void propagate(){
        // aux representa cada possibilidade para as palavras ativas,
        //passando por todas as diferenças de 1 até WORD_SIZE-1 (para bytes
        //seria 1 até 255). Atualmente todas as palavras ativas testam o mesmo 
        //valor simultaneamente.
        ByteArray aux;
        List<Integer> indexActiveWords = this.difference.getActiveWords(cipher1.getWORD_SIZE());
        List<ByteArray> currStateDifferences;
        int marker, AMOUNT_WORDS = cipher1.getBLOCK_SIZE_IN_BYTES()*8/cipher1.getWORD_SIZE();
        

        for (int k = 1; k < 0x1<<cipher1.getWORD_SIZE(); k++) {
            aux = new ByteArray(AMOUNT_WORDS);
            for (int i = 0; i < indexActiveWords.size(); i++) 
                aux.setWord(cipher1.getWORD_SIZE(),(int)indexActiveWords.get(i), k);

            currStateDifferences = computeStateDifferences(aux);
            
            // marker é o valor que representa uma palavra ativa. Para nibbles é
            //0xA e para bytes é 0xAA.
            marker = 0xA;   
            if(cipher1.getWORD_SIZE() == 8) marker = 0xAA;
                  
            // Caso uma palavra tenha sido ativada pelo aux atual, esta é passada
            //para o stateDifferences do objeto atual.
            for (int i = 0; i < this.stateDifferences.size(); i++) 
                for (int j = 0; j < AMOUNT_WORDS; j++) 
                    if(currStateDifferences.get(i).getWord(cipher1.getWORD_SIZE(),j) != 0)
                        this.stateDifferences.get(i).setWord(cipher1.getWORD_SIZE(),j, marker);
        }
    }
    
    /**
     * Calcula a diferencial de estados a partir da diferença de estados
     * <code>stateDiff</code>.
     *
     * @param stateDiff é a diferença de estados usada para a propagação.
     * @return List com todas as diferenças de estados
     */
    private List<ByteArray> computeStateDifferences(ByteArray stateDiff){  
        List<ByteArray> states1,states2, stateDifferences = new ArrayList<>();
        ByteArray key, state1, state2;
                
        key = new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS());   //Chave Base
           
        cipher1.reset(key);//Usada para expandir a chave
        cipher2.reset(key);//Usada para expandir a chave 2

        state1 = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());//Estado Base
        state1.randomize();
        state2 = state1.clone().autoXor(stateDiff);        //Estado Base 2

        states1 = cipher1.encryptFull(state1, stateIndex);
        states2 = cipher2.encryptFull(state2, stateIndex);
        
        for (int i = 0; i < states1.size(); i++)
            stateDifferences.add(states1.get(i).clone().autoXor(states2.get(i))); 
        
        return stateDifferences;
    }
    
    /**
     * TO BE RETESTED AFTER REMOVING andElementsIfNotZeroAt
     * Altera as diferenças de todos os estados ao aplicar o AND com a
     * StateDifferential <code>other</code>.
     * @param other StateDifferential que aplicará o AND.
     * @return a própria instância modificada.
     */
    public StateDifferential and(StateDifferential other) {
        final int numStates = stateDifferences.size();

        for (int round = 0; round < numStates; round++) 
            if (stateDifferences.get(round) != null && other.stateDifferences.get(round) != null) 
                stateDifferences.get(round).and(other.stateDifferences.get(round));
            //andElementsIfNotZeroAt(stateDifferences, other.stateDifferences, round); //

        return this;
    }

    /**
     * TO BE RETESTED AFTER REMOVING orElementsIfNotZeroAt
     * Altera as diferenças de todos os estados ao aplicar o OR com a
     * StateDifferential <code>other</code>.
     * @param other StateDifferential que aplicará o OR.
     * @return a própria instância modificada.
     */
    public StateDifferential or(StateDifferential other) {
        final int numStates = stateDifferences.size();

        for (int round = 0; round < numStates; round++) 
            if (stateDifferences.get(round) != null && other.stateDifferences.get(round) != null) 
                stateDifferences.get(round).or(other.stateDifferences.get(round));
            //orElementsIfNotZeroAt(stateDifferences, other.stateDifferences, round);
        

        return this;
    }
    
     /**
     * TO BE RETESTED AFTER REMOVING xorElementsIfNotZeroAt
     * Altera as diferenças de todos os estados ao aplicar o XOR com a
     * StateDifferential <code>other</code>.
     * @param other StateDifferential que aplicará o XOR.
     * @return a própria instância modificada.
     */
    public StateDifferential xor(StateDifferential other) {
        final int numStates = stateDifferences.size();

        for (int round = 0; round < numStates; round++) 
            if (stateDifferences.get(round) != null && other.stateDifferences.get(round) != null) 
                stateDifferences.get(round).autoXor(other.stateDifferences.get(round));
            //xorElementsIfNotZeroAt(stateDifferences, other.stateDifferences, round);        

        return this;
    }
    
    /** 
     * Cria uma deep copy deste Statedifferential.
     * @return .
     * @see java.lang.Object#clone()
     */
    @Override
    public StateDifferential clone() {
        StateDifferential copy = new StateDifferential(this.difference,
                                            this.stateIndex, this.cipher1, this.cipher2);
         
        for (int state = 0; state < this.stateDifferences.size(); state++)
            copy.stateDifferences.set(state, this.stateDifferences.get(state).clone());
            

        return copy;
    }
    
    @Override
    public boolean equals(Object object) {
        try {
            StateDifferential other = (StateDifferential)object;

            if (other == null) {
                return false;
            } else {
                return  stateIndex == other.stateIndex
                        && stateDifferences.equals(other.stateDifferences)
                        && difference.equals(other.difference)
                        && cipher1.equals(other.cipher1)
                        && cipher2.equals(other.cipher2);
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Retorna a diferença do estado <code>round</code>.
     * @param round .
     * @return .
     */
    public ByteArray getDifference(int round) {
        return stateDifferences.get(round);
    }

    /**
     * Seta a diferença do estado <code>round</code> com <code>difference</code>.
     * @param round .
     * @param difference .
     */
    public void setdifference(int round, ByteArray difference) {
        stateDifferences.set(round, difference);
    }

    /**
     * Retorna as diferenças de estados
     * @return 
     */
    public List<ByteArray> getStateDifferences() {
        return stateDifferences;
    }
    
    /**
     * Existe apenas para auxiliar toString().
     */
    private String updateString(List<ByteArray> differences, int round, String identifier) {
            ByteArray difference = differences.get(round);
            String result = "";

            if (difference != null) {
                if (identifier.equals(" key   "))
                    result = "K" + round + " = " + difference + "\n";
                else
                    result = "#" + round + " : " + difference + "\n";
            }

            return result;
    }

    @Override
    public String toString() {
        String result = "";

        for (int state = 0; state < stateDifferences.size(); state++) 
            result += updateString(stateDifferences, state, " state ");

        return "[" + result + "]";
    }
}
