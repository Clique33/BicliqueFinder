package biclique;

import util.ByteArray;
import cifras.Cipher;
import java.util.ArrayList;
import java.util.List;
import util.WordSize;

/**
 * Classe que representa diferenciais de chaves relacionadas.
 */
public class RelatedKeyDifferential implements Cloneable,HasStateDiferences{
    
    /**
     * Método de testes da classe.
     * 
     * @param args .
     */
    public static void testador(String[] args){
        
//        Cipher cifra1 = new Rijndael();
//        Cipher cifra2 = new Rijndael();
//        
//        ByteArray key1 = new ByteArray(cifra1.getBLOCK_SIZE_IN_BYTES()).randomize();
//        ByteArray key2 = ByteArray.xor(key1,new ByteArray(cifra1.getBLOCK_SIZE_IN_BYTES()).set(4, 0xFF));
//        
//        ByteArray state1 = new ByteArray(cifra1.getBLOCK_SIZE_IN_BYTES()).randomize();
//        ByteArray state2 = state1.clone();
//        
//        System.out.println("key:\n\t"+ByteArray.xor(key1,key2));  
//        System.out.println("states:\n\t"+ByteArray.xor(state1,state2));    
//        
//        cifra1.reset(key1, 8);
//        cifra2.reset(key2, 8);
//        
//        System.out.println("diffkeys:\n\t"+ByteArray.xor(
//                                                cifra1.getExpandedKey(),
//                                                cifra2.getExpandedKey())); 
//        
//        List<ByteArray> allStates1 = cifra1.encryptFull(
//                                                state1, 
//                                                cifra1.getNUM_STATES()-1
//                                    );
//        List<ByteArray> allStates2 = cifra2.encryptFull(
//                                                state2, 
//                                                cifra2.getNUM_STATES()-1
//                                    );
//        
//        System.out.println("allStates1:\n\t"+allStates1); 
//        System.out.println("allStates2:\n\t"+allStates2); 
//        System.out.println("diffAllStates:\n\t"+ByteArray.xor(allStates1,allStates2));   
        
        // Como teste, é usada a biclique original de Bogdanov.
        ///Test DELTA
//        Cipher cipher1 = new Rijndael();
//        Cipher cipher2 = new Rijndael();
//        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
////        keyDiff.set(2, 0xff);   //only DELTA
////        keyDiff.set(3, 0xff);   //only DELTA
//        keyDiff.set(4, 0xff);   //only NABLA
//        keyDiff.set(6, 0xff);   //only NABLA
//        RelatedKeyDifferential c = new RelatedKeyDifferential(  
//                                                        29, 
//                                                        cipher1.getNUM_STATES()-1, 
//                                                        keyDiff, 
//                                                        8,
//                                                        cipher1,
//                                                        cipher2,
//                                                        "nabla");
//        System.out.println(c);
//        ///Test NABLA
//        Cipher cipher1 = new Rijndael();
//        Cipher cipher2 = new Rijndael();
//        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
//        keyDiff.set(2, 0xff);
//        keyDiff.set(3, 0xff);
//        RelatedKeyDifferential c = new RelatedKeyDifferential(  cipher1.getInitialStateBiclique(), 
//                                                        cipher1.getNUM_STATES()-1, 
//                                                        keyDiff, 
//                                                        8,
//                                                        cipher1,
//                                                        cipher2,
//                                                        "nabla");
//        System.out.println(c);
    }
    
    /**
     * Estado inicial da RelatedKeyDifferential.
     */
    private int fromState;
    /**
     * Estado final da RelatedKeyDifferential.
     */
    private int toState;
    /**
     * List de diferenças de chave relacionadas.
     */
    private final List<ByteArray> keyDifferences = new ArrayList<>();
    /**
     * List de diferenças de estado.
     */
    private List<ByteArray> stateDifferences = new ArrayList<>();
    /**
     * Diferença de chave base para a RelatedKeyDifferential.
     */
    private ByteArray keyDifference;
    /**
     * Índice da chave base para a RelatedKeyDifferential.
     */
    private int keyIndex;
    /**
     * Tipo da RelatedKeyDifferentital. Pode assumir os valores "DELTA" ou
     * "NABLA".
     */
    private String type;    
    /**
     * Primeiro objeto da cifra em questão necessário para gerar a
     * RelatedkeyDifferential.
     */
    private Cipher cipher1;  
    /**
     * Segundo objeto da cifra em questão necessário para gerar a
     * RelatedkeyDifferential.
     */
    private Cipher cipher2;  
    
    /**
     * Construtor único de RelatedKeyDifferential.
     * @param fromState estado inicial da biclique a qual está associada.
     * @param toState estado final da biclique a qual está associada.
     * @param keyDifference diferença de chave base
     * @param keyIndex índice da diferença de chave base
     * @param cipher1 objeto1 para geração de diferenciais da cifra em questão
     * @param cipher2 objeto2 para geração de diferenciais da cifra em questão
     * @param type tipo da RelatedKeyDifferential. "DELTA" ou "NABLA".
     * 
     * @exception RuntimeException . 
     */
    public RelatedKeyDifferential(int fromState, int toState, ByteArray keyDifference, int keyIndex, Cipher cipher1, Cipher cipher2, String type) {
        if(!type.toUpperCase().equals("DELTA") && !type.toUpperCase().equals(
                "NABLA")) throw new RuntimeException("Tipo precisa ser "
                        + "\"DELTA\" ou \"NABLA\"");
        
        this.type = type.toUpperCase();
        this.keyDifference = keyDifference.clone();
        this.keyIndex = keyIndex;
        this.cipher1 = cipher1;
        this.cipher2 = cipher2;
        this.fromState = fromState;
        this.toState = toState;        
        
        for (int i = 0; i < cipher1.getNUM_STATES(); i++)
            stateDifferences.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
        
        for (int i = 0; i < cipher1.getNUM_KEYS(); i++) 
            keyDifferences.add(new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()));
        
        //System.out.println("begin keys");
        propagateToKeys();
        //System.out.println("end keys");
//        System.out.println("begin states");
        propagateToStates();
//        System.out.println("end states");
//        int i = 0;
//        for (ByteArray b : stateDifferences) {
//            System.out.println(i+++" : "+b);
//        }
    }

    /**
     * Construtor apenas para AffectV em biclique.
     * 
     */
    RelatedKeyDifferential(StateDifferential s) {
        this(   0, 
                s.getCiphers()[0].getNUM_STATES()-1, 
                new ByteArray(
                        s.getCiphers()[0].getAMOUNT_OF_KEYS() * 
                        s.getCiphers()[0].getKEY_SIZE_IN_BYTES()), 
                0, 
                s.getCiphers()[0], 
                s.getCiphers()[1], 
                "delta");
        this.stateDifferences = s.getStateDifferences();
    }
    
    /**
     * Retorna verdadeiro caso o tipo da RelatedKeyDifferential seja DELTA e 
     * falso caso contrário.
     * @return .
     */    
    public boolean isDelta(){
        return type.equals("DELTA");
    }

    /**
     * Getter para o índice da chave base desta RelatedKeyDifferential.
     * @return .
     */      
    public int getKeyIndex(){
        return keyIndex;
    }

    /**
     * Getter para o tipo desta RelatedKeyDifferential.
     * @return .
     */ 
    public String getType() {
        return type;
    }

    /**
     * Getter para a diferença de chave base desta RelatedKeyDifferential.
     * @return .
     */      
    public ByteArray getKeyDifference(){
        return keyDifference.clone();
    }

    /**
     * Getter para os objetos da cifra desta RelatedKeyDifferential.
     * @return .
     */      
    public Cipher[] getCiphers(){
        Cipher ciphers[] = {cipher1, cipher2};
        return ciphers;
    } 

    /**
     * Getter para o estado inicial desta RelatedKeyDifferential.
     * @return .
     */  
    public int getFromState() {
        return fromState;
    }

    /**
     * Getter para o estado final desta RelatedKeyDifferential.
     * @return .
     */  
    public int getToState() {
        return toState;
    }
	
    /**
     * Getter para a diferença de chave na rodada <code>round</code> desta
     * RelatedKeyDifferential.
     * @param round .
     * @return .
     */  
    public ByteArray getKeyDifference(int round) {
        return keyDifferences.get(round);
    }

    /**
     * Getter para as diferenças de estados desta RelatedKeyDifferential.
     * 
     * @return .
     */
    @Override
    public List<ByteArray> getStateDifferences() {
        return stateDifferences;
    }

    /**
     * Getter para a diferença de estado <code>state</code> desta
     * RelatedKeyDifferential.
     * @param state .
     * @return .
     */
    public ByteArray getStateDifference(int state) {
        return stateDifferences.get(state);
    }
    
    /**
     * Computa todas as PALAVRAS que são ativadas pela diferença de chave nas 
     * subchaves da cifra (a chave expandida).
     */
    private void propagateToKeys(){      
        ByteArray key1, key2, keyDifference;
        List<Integer> indexActiveWords = this.keyDifference.getActiveWords(cipher1.getWORD_SIZE());
        int AMOUNT_WORDS = cipher1.getBLOCK_SIZE_IN_BYTES()*8/cipher1.getWORD_SIZE();
        
        key1 = new ByteArray(AMOUNT_WORDS);
        cipher1.reset(key1, keyIndex);
        for (int i = 1; i < 0x1<<cipher1.getWORD_SIZE(); i++) {
            key2 = key1.clone();

            for (int k = 0; k < indexActiveWords.size(); k++)
                key2.setWord(cipher1.getWORD_SIZE(),indexActiveWords.get(k), i);

            cipher2.reset(key2, keyIndex);

            keyDifference = cipher1.getExpandedKey(key1, keyIndex).clone().getDifference(cipher2.getExpandedKey(key2, keyIndex));

            int marker = 0xA;   //Marcador de palavras ativas
            if(cipher1.getWORD_SIZE() == 8) marker = 0xAA;

            for (int k = 0; k < keyDifference.amountOfWords(cipher1.getWORD_SIZE()); k++) {
                int key = k/AMOUNT_WORDS;
                int word = k%AMOUNT_WORDS;

                if (keyDifferences.get(key).getWord(cipher1.getWORD_SIZE(),word)==0 && keyDifference.getWord(cipher1.getWORD_SIZE(),k)!=0) 
                    keyDifferences.get(key).setWord(cipher1.getWORD_SIZE(),word,marker);
            }   
        }
    }
    
    /**
     * Computa todas as PALAVRAS que são ativadas pela diferencial de chaves
     * relacionadas nabla nos estados da cifra. 
     */
    private void propagateToStates(){
        ByteArray aux;
        List<Integer> indexActiveWords = this.keyDifference.getActiveWords(cipher1.getWORD_SIZE());
        List<ByteArray> currDifferential;
        int marker, AMOUNT_WORDS = cipher1.getBLOCK_SIZE_IN_BYTES()*8/cipher1.getWORD_SIZE();
       
        for (int k = 1; k < 0x1<<cipher1.getWORD_SIZE(); k++) {
            aux = new ByteArray(AMOUNT_WORDS);
            for (int i = 0; i < indexActiveWords.size(); i++) 
                aux.setWord(cipher1.getWORD_SIZE(),indexActiveWords.get(i), k);

            currDifferential = computeDifferential(aux);
            
            if (type.endsWith("NABLA")) {
                marker = 0xB;   //Marcador de palavras ativas
                if(cipher1.getWORD_SIZE() == 8) marker = 0xBB;
            }else{
                marker = 0xA;   //Marcador de palavras ativas
                if(cipher1.getWORD_SIZE() == 8) marker = 0xAA;
            }
            for (int i = 0; i < this.stateDifferences.size(); i++) 
                for (int j = 0; j < AMOUNT_WORDS; j++) 
                    if(currDifferential.get(i).getWord(cipher1.getWORD_SIZE(),j) != 0)
                        this.stateDifferences.get(i).setWord(cipher1.getWORD_SIZE(),j, marker);
        }
    }
    /**
     * Calcula a diferencial a partir da diferença de chave 'keyDiff'
     * em toda a cifra.
     *
     * @param keyDiff é a diferença de chave usada para recuperar a diferencial
     *              nabla.
     * @return Retorna a diferença de cada um dos estados da cifra, dada a
     * diferença de chave keyDiff.
     */
    private List<ByteArray> computeDifferential(ByteArray keyDiff){  
        List<ByteArray> allStates1,//Representa as palavras afetadas nos estados pela key1 a partir da biclique
                        allStates2,//Representa as palavras afetadas nos estados pela key2 a partir da biclique
                        allStates3,//Representa as palavras afetadas nos estados pela key1 para a recomputação
                        allStates4,//Representa as palavras afetadas nos estados pela key2 para a recomputação
                        allStatesDiff = new ArrayList<>();
        ByteArray key1, key2, state1, state2;
                
        key1 = new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS());   //Chave Base
        key1.randomize();
        key2 = keyDiff.clone().autoXor(key1);                                               //Chave Base 2
        
        cipher1.reset(key1,keyIndex);//Usada para expandir a chave
        cipher2.reset(key2,keyIndex);//Usada para expandir a chave 2

        state1 = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());      //Estado Base
        state1.randomize();
        state2 = state1.clone();                                       //Estado Base 2

        
        if (type.equals("NABLA")) {
            allStates1 = cipher1.encryptFull(state1, toState, toState);
            allStates2 = cipher2.encryptFull(state2, toState, toState);
            if(toState == cipher1.getNUM_STATES()-1){ // Significa que a biclique está no final da cifra
                allStates3 = cipher1.encryptFull(state1, 0);
                allStates4 = cipher2.encryptFull(state2, 0);
            }else if (fromState ==  0){ // Significa que a biclique está no início da cifra
                allStates3 = new ArrayList<>();
                allStates4 = new ArrayList<>();
                for (int i = 0; i < allStates1.size(); i++) {  // Dummys para não interferir na criação de allStatesDiff
                    allStates3.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
                    allStates3.get(i).fill(0xf,WordSize.getWordSize(cipher1.getWORD_SIZE()));
                    allStates4.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
                }
            }else{// Significa que a biclique está no meio da cifra
                List<ByteArray> allStates5,//Representa as palavras afetadas nos estados pela key1 para a recomputação de volta
                                allStates6,//Representa as palavras afetadas nos estados pela key2 para a recomputação de volta
                                allStates7,//Representa as palavras afetadas nos estados pela key1 para a recomputação de ida
                                allStates8;//Representa as palavras afetadas nos estados pela key2 para a recomputação de ida
                allStates3 = new ArrayList<>();
                allStates4 = new ArrayList<>();
                allStates5 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1);
                allStates6 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1);
                allStates7 = cipher1.encryptFull(state1, 0, toState);
                allStates8 = cipher2.encryptFull(state2, 0, toState);
                for (int i = 0; i < allStates5.size(); i++){
                    allStates3.add(allStates5.get(i).clone().and(allStates7.get(i).clone())); 
                    allStates4.add(allStates6.get(i).clone().and(allStates8.get(i).clone())); 
                }
            }
            
        }else{//DELTA
            allStates1 = cipher1.encryptFull(state1, fromState, toState);
            allStates2 = cipher2.encryptFull(state2, fromState, toState);
            
            if(toState == cipher1.getNUM_STATES()-1){ // Significa que a biclique está no final da cifra
                allStates3 = new ArrayList<>();
                allStates4 = new ArrayList<>();
                for (int i = 0; i < allStates1.size(); i++) {  // Dummys para não interferir na criação de allStatesDiff
                    allStates3.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
                    allStates3.get(i).fill(0xf,WordSize.getWordSize(cipher1.getWORD_SIZE()));
                    allStates4.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
                }
            }else if (fromState ==  0){ // Significa que a biclique está no início da cifra
                allStates3 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1);
                allStates4 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1);
                
            }else{// Significa que a biclique está no meio da cifra
                List<ByteArray> allStates5,//Representa as palavras afetadas nos estados pela key1 para a recomputação de volta
                                allStates6,//Representa as palavras afetadas nos estados pela key2 para a recomputação de volta
                                allStates7,//Representa as palavras afetadas nos estados pela key1 para a recomputação de ida
                                allStates8;//Representa as palavras afetadas nos estados pela key2 para a recomputação de ida
                allStates3 = new ArrayList<>();
                allStates4 = new ArrayList<>();
                allStates5 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1);
                allStates6 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1);
                allStates7 = cipher1.encryptFull(state1, 0, toState);
                allStates8 = cipher2.encryptFull(state2, 0, toState);
                
                for (int i = 0; i < allStates5.size(); i++){
                    allStates3.add(allStates5.get(i).clone().and(allStates7.get(i).clone())); 
                    allStates4.add(allStates6.get(i).clone().and(allStates8.get(i).clone())); 
                }
            }
            
        }
        
        for (int i = 0; i < allStates1.size(); i++)
            allStatesDiff.add(allStates1.get(i).clone().autoXor(allStates2.get(i)).and(allStates3.get(i).clone().autoXor(allStates4.get(i)))); 
        
//        System.out.println("allStatesDiff : \n");
//        for (ByteArray b : allStatesDiff) 
//            System.out.println(b);
        
        
        return allStatesDiff;
    }
    
    
    /**
     * REFAZER, A DOCUMENTAÇÃO DESTA ESTÁ ERRADA EM SEGUIDA, ALTERAR 
     * BICLIQUE_GETWORDS
     * 
     * Retorna as palavras do estado passado que são iguais à palavra passada 
     * com a diferença de chave passada caso esta palavra esteja ativa. Caso
     * contrário, retorna uma lista vazia. 
     *
     * @param keyDiff é a diferença de chave usada para recuperar a diferencial
     *              nabla.
     * @param stateIndex .
     * @param wordIndex .
     * @param possible .
     * @return Retorna a lista de todas as palavras que o parâmetro é sempre é
     * igual.
     */
    public List<Integer> getEqualWords( ByteArray keyDiff, 
                                        int stateIndex, 
                                        int wordIndex, 
                                        List<Integer> possible){  
        List<ByteArray> allStates1,//Representa as palavras afetadas nos estados pela key1 a partir da biclique
                        allStates2,//Representa as palavras afetadas nos estados pela key2 a partir da biclique
                        allStates3,//Representa as palavras afetadas nos estados pela key1 para a recomputação
                        allStates4,//Representa as palavras afetadas nos estados pela key2 para a recomputação
                        allStatesDiff = new ArrayList<>();
        ByteArray key1, key2, state1, state2;
                
        key1 = new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS())
                                                                        .randomize();
        key2 = ByteArray.xor(keyDiff,key1);                                                           //Chave Base 2

        cipher1.reset(key1,keyIndex);//Usada para expandir a chave
        cipher2.reset(key2,keyIndex);//Usada para expandir a chave 2

        state1 = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()).randomize();
        state2 = state1.clone();                                       //Estado Base 2

        
        if (type.equals("NABLA")) {
            allStates1 = cipher1.encryptFull(state1, toState, toState);
            allStates2 = cipher2.encryptFull(state2, toState, toState);
        }else{//DELTA
            allStates1 = cipher1.encryptFull(state1, fromState, toState);
            allStates2 = cipher2.encryptFull(state2, fromState, toState);
        }
        
        for (int i = 0; i < allStates1.size(); i++)
            allStatesDiff.add(allStates1.get(i).clone()
                    .autoXor(allStates2.get(i)
                    )
            );             
//        System.out.println("tipo: "+type);
//        System.out.println("state: "+toState);
//        System.out.println("diff atual :\n");
//        for (int i = 0; i < allStates1.size(); i++)
//            System.out.println(ByteArray.xor(allStates1.get(i),allStates2.get(i)));
        
        
//        System.out.println("diff atual :\n");
//        for (ByteArray b : allStatesDiff) 
//            System.out.println(b);
        
        List<Integer> result = new ArrayList<>();
        
//        if(allStatesDiff.get(stateIndex).get(wordIndex) == 0) return result;
        
        int aux = allStatesDiff.get(stateIndex).getWord(cipher1.getWORD_SIZE(),wordIndex);
        for (int i = 0; i < possible.size(); i++) 
            if(i != wordIndex && aux == allStatesDiff.get(stateIndex).getWord(cipher1.getWORD_SIZE(),possible.get(i)))
                result.add(i);
            else possible.remove(i);
        
//        System.out.println("state : "+stateIndex+" word : "+wordIndex);
//        System.out.println("result : "+result);
//        System.out.println("last state : "+allStatesDiff.get(stateIndex));
        
        return result;
    }
    
//    public List<Integer> getEqualWordsTestes(   ByteArray keyDiff, 
//                                                int stateIndex, 
//                                                int wordIndex, 
//                                                List<Integer> possible){  
//        List<ByteArray> allStates1,//Representa as palavras afetadas nos estados pela key1 a partir da biclique
//                        allStates2,//Representa as palavras afetadas nos estados pela key2 a partir da biclique
//                        allStatesDiff = new ArrayList<>();
//        ByteArray key1, key2, state1, state2;
//                
//        key1 = new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS()).randomize();
//        key2 = ByteArray.xor(keyDiff,key1);                                                 //Chave Base 2
//
//        cipher1.reset(key1,keyIndex);//Usada para expandir a chave
//        cipher2.reset(key2,keyIndex);//Usada para expandir a chave 2
//
//        state1 = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()).randomize();
//        state2 = state1.clone();                                       //Estado Base 2
//
//        
//        if (type.equals("NABLA")) {
//            allStates1 = cipher1.encryptFull(state1, toState, toState);
//            allStates2 = cipher2.encryptFull(state2, toState, toState);
////            System.out.println("allStates1.size() : " + allStates1.size());
//            if(toState == cipher1.getNUM_STATES()-1){ // Significa que a biclique está no final da cifra
//                allStates3 = cipher1.encryptFull(state1, 0, toState);
//                allStates4 = cipher2.encryptFull(state2, 0, toState);
//            }else if (fromState ==  0){ // Significa que a biclique está no início da cifra
//                allStates3 = new ArrayList<>();
//                allStates4 = new ArrayList<>();
//                for (int i = 0; i < allStates1.size(); i++) {  // Dummys para não interferir na criação de allStatesDiff
//                    allStates3.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
//                    allStates3.get(i).fill(0xf,WordSize.getWordSize(cipher1.getWORD_SIZE()));
//                    allStates4.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
//                }
//            }else{// Significa que a biclique está no meio da cifra
//                List<ByteArray> allStates5,//Representa as palavras afetadas nos estados pela key1 para a recomputação para trás
//                                allStates6,//Representa as palavras afetadas nos estados pela key2 para a recomputação para trás
//                                allStates7,//Representa as palavras afetadas nos estados pela key1 para a recomputação para frente
//                                allStates8;//Representa as palavras afetadas nos estados pela key2 para a recomputação para frente
//                allStates3 = new ArrayList<>();
//                allStates4 = new ArrayList<>();
//                allStates5 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                allStates6 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                allStates7 = cipher1.encryptFull(state1, 0, toState);
//                allStates8 = cipher2.encryptFull(state2, 0, toState);
//                for (int i = 0; i < allStates5.size(); i++){
//                    allStates3.add(allStates5.get(i).clone().and(allStates7.get(i).clone())); 
//                    allStates4.add(allStates6.get(i).clone().and(allStates8.get(i).clone())); 
//                }
//            }
//            
//        }else{//DELTA
//            allStates1 = cipher1.encryptFull(state1, fromState, toState);
//            allStates2 = cipher2.encryptFull(state2, fromState, toState);
//            
//            if(toState == cipher1.getNUM_STATES()-1){ // Significa que a biclique está no final da cifra
//                allStates3 = new ArrayList<>();
//                allStates4 = new ArrayList<>();
//                for (int i = 0; i < allStates1.size(); i++) {  // Dummys para não interferir na criação de allStatesDiff
//                    allStates3.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
//                    allStates3.get(i).fill(0xf,WordSize.getWordSize(cipher1.getWORD_SIZE()));
//                    allStates4.add(new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES()));
//                }
//            }else if (fromState ==  0){ // Significa que a biclique está no início da cifra
//                allStates3 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                allStates4 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                
//            }else{// Significa que a biclique está no meio da cifra
//                List<ByteArray> allStates5,//Representa as palavras afetadas nos estados pela key1 para a recomputação de volta
//                                allStates6,//Representa as palavras afetadas nos estados pela key2 para a recomputação de volta
//                                allStates7,//Representa as palavras afetadas nos estados pela key1 para a recomputação de ida
//                                allStates8;//Representa as palavras afetadas nos estados pela key2 para a recomputação de ida
//                allStates3 = new ArrayList<>();
//                allStates4 = new ArrayList<>();
//                allStates5 = cipher1.encryptFull(state1, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                allStates6 = cipher2.encryptFull(state2, cipher1.getNUM_STATES() - 1, cipher1.getNUM_STATES() - 1);
//                allStates7 = cipher1.encryptFull(state1, 0, toState);
//                allStates8 = cipher2.encryptFull(state2, 0, toState);
//                
//                for (int i = 0; i < allStates5.size(); i++){
//                    allStates3.add(allStates5.get(i).clone().and(allStates7.get(i).clone())); 
//                    allStates4.add(allStates6.get(i).clone().and(allStates8.get(i).clone())); 
//                }
//            }
//            
//        }
//        
//        for (int i = 0; i < allStates1.size(); i++)
//            allStatesDiff.add(allStates1.get(i).clone().xor(allStates2.get(i)).and(allStates3.get(i).clone().xor(allStates4.get(i)))); 
//        
////        System.out.println("allStatesDiff : \n");
////        for (ByteArray b : allStatesDiff) 
////            System.out.println(b);
//        
//        List<Integer> result = new ArrayList<>();
//        
////        if(allStatesDiff.get(stateIndex).get(wordIndex) == 0) return result;
//        
//        int aux = allStatesDiff.get(stateIndex).getWord(cipher1.getWORD_SIZE(),wordIndex);
//        for (int i = 0; i < possible.size(); i++) 
//            if(i != wordIndex && aux == allStatesDiff.get(stateIndex).getWord(cipher1.getWORD_SIZE(),possible.get(i)))
//                result.add(i);
//            else possible.remove(i);
//        
////        System.out.println("state : "+stateIndex+" word : "+wordIndex);
////        System.out.println("result : "+result);
////        System.out.println("last state : "+allStatesDiff.get(stateIndex));
//        
//        return result;
//    }
//    

    /** 
     * Cria uma deep copy deste RelatedKeyDifferential.
     * @return .
     * @see java.lang.Object#clone()
     */
    @Override
    public RelatedKeyDifferential clone() {
        RelatedKeyDifferential copy = new RelatedKeyDifferential(this.fromState, this.toState, this.keyDifference,
                                            this.keyIndex, this.cipher1, this.cipher2, this.type);
        
        for (int round = 0; round <= this.keyDifferences.size(); round++) 
            copy.keyDifferences.set(round, this.keyDifferences.get(round).clone());
            
        for (int state = 0; state < this.stateDifferences.size(); state++)
            copy.stateDifferences.set(state, this.stateDifferences.get(state).clone());
            

        return copy;
    }

    
    /**
     * Conta e retorna o número de palavras ativas apenas dos blocos relevantes
     * desta RelatedKeyDifferential. Os blocos podem ser estados ou subchaves 
     * 
     * @param relevantBlocks List com os índices dos estados relevantes
     * @param isState se true os blocos são estados e se false são subchaves.
     * @return .
     */
    public int getNumActive(List<Integer> relevantBlocks, boolean isState){
        int result = 0;
        if(isState){
//            if (relevantBlocks == null)        
//                for (ByteArray b : stateDifferences) 
//                    result += b.countNumActiveWords(cipher1.getWORD_SIZE());
//            else
            for (int i : relevantBlocks) 
                result += stateDifferences.get(i).countNumActiveWords(cipher1.getWORD_SIZE());

        }else{
            for (int i : relevantBlocks) 
                result += keyDifferences.get(i).countNumActiveWords(cipher1.getWORD_SIZE());
        }
        return result;
    }
    
    /**
     * Existe apenas para auxiliar o toString().
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

        for (int round = 0; round < keyDifferences.size(); round++) 
            result += updateString(keyDifferences, round, " key   ");
        
        for (int state = 0; state < stateDifferences.size(); state++) 
            result += updateString(stateDifferences, state, " state ");

        return "[" + result + "]";
    }
}
