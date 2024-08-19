/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import java.lang.reflect.Method;
import util.ByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.Util;

/**
 * Classe que representa a cifra para o ataque biclique.
 * 
 * Como restrição, as cifras devem ser baseadas em palavras de tamanho fixo e a
 * única fonte de não-linearidade deve ser a aplicação de S-boxes.
 *
 * @author ´Gabriel
 */
public abstract class Cipher {
    
    /**
     * DEVE SER DESCONTINUADO
     * 
     * Variável que indica a rodada da subchave da diferença de chave base do
     * ataque. Usado apenas no ataque antigo.
     */
    private int roundOfFirstKeyToBeApplied;
    /**
     * Tamanho de palavra utilizada na cifra.  Deve obrigatoriamente ser setada
     * no início de qualquer construtor para as filhas de Cipher através do
     * método <code>setWordSize</code>.
     */
    private int wordSize;
    
    /**
     * Construtor que inicia uma Cipher com chaves secreta
     * <code>key</code> a partir da rodada <code>round</code>, não sendo estas
     * necessariamente a chave secreta. Para utilizar subchaves, basta escolher
     * o <code>round</code> diferente de 0.
     * @param key .
     * @param round .
     */
    public Cipher(ByteArray key,int round){
        setKey(key,round);
    }

    /**
     * Construtor base que inicia a Cipher sem uma chave específica. É
     * utilizado para obter informações pertinentes à Cifra, independente de
     * chave, como quantidade de rodadas, tamanho de palavra, etc.
     */
    public Cipher(){
    }
    
    /**
     * Altera e retorna a Cipher para seu estado inicial, com nova chave
     * <code>key</code> a partir de determinada rodada <code>round</code>.
     * @param key .
     * @param round .
     * @return .
     */
    public Cipher reset(ByteArray key,int round){
        setKey(key,round);
        return this;
    }
    
    /**
     * Altera e retorna a Cipher para seu estado inicial, com nova chave
     * secreta <code>key</code>.
     * @param key .
     * @return .
     */    
    public Cipher reset(ByteArray key){
        setKey(key,0);
        return this;
    }
        
    /**
     * Altera o tamanho de palavra utilizada pela Cipher para
     * <code>value</code>. Deve obrigatoriamente ser setada no início de
     * qualquer construtor para as filhas de Cipher.
     * @param value .
     */
    protected void setWordSize(int value){
        wordSize = value;
    }
    
    /**
     * DEVE SER DESCONTINUADO
     * 
     * Altera a variável que indica a rodada da subchave da diferença de chave
     * base do ataque dada por <code>round</code>. Usado apenas no ataque
     * antigo.
     * @param round .
     */
    public void setRoundOfFirstKeyToBeApplied(int round){
        roundOfFirstKeyToBeApplied = round;
    }
    
    /**
     * Método que encripta <code>block</code> (índice do estado dado por
     * <code>fromState</code>) até as duas pontas da cifra. <code>toState</code>
     * parece ser desnecessário neste caso.
     * 
     * @param block ByteArray que representa o bloco base
     * @param fromState estado do bloco base
     * @param toState estado final do que seria a biclique. TALVEZ NÃO SEJA
     * NECESSÁRIO
     * 
     * @return Uma List com todos os estados gerados a partir do bloco na rodada 
     * passada, com a chave setada no construtor.
     */
    public List<ByteArray> encryptFull(ByteArray block, int fromState, int toState) {
        boolean debug = false;

        List<ByteArray> result = new ArrayList<>(getNUM_STATES());
        List<ByteArray> aux;

        //Antes da biclique
        aux = encryptBackwards(block, fromState, 0);
        result.addAll(aux);

        //A biclique
        aux = encryptForward(block, fromState, toState);
        result.addAll(aux);

        //Após a biclique. Precisa remover o último caso toState não seja
        //o último estado da Cipher, pois o método usado acrescenta o 
        //estado final.
        if(toState != getNUM_STATES() - 1){
            aux = encryptForward(result.remove(result.size()-1), toState, getNUM_STATES() - 1);
            result.addAll(aux);
        }            
        
        return result;
    }
    
    /**
     * Método que encripta <code>block</code> (índice do estado dado por
     * <code>fromState</code>) até as duas pontas da cifra.
     * 
     * @param block ByteArray que representa o bloco base
     * @param fromState estado do bloco base
     * 
     * @return Uma List com todos os estados gerados a partir do bloco na rodada 
     * passada, com a chave setada no construtor.
     */
    public List<ByteArray> encryptFull(ByteArray block, int fromState){
        return encryptFull(block, fromState, getNUM_STATES()-1);
    }
    
    /**
     * Retorna um ByteArray contendo todos os bits de chave (subchaves), gerados
     * a partir da chave <code>key</code> a partir da rodada <code>round</code>. 
     * @param key .
     * @param round .
     * @return .
     */
    public abstract ByteArray getExpandedKey(ByteArray key, int round);
    /**
     * Retorna um ByteArray contendo todos os bits de chave (subchaves). 
     * @return .
     */
    public abstract ByteArray getExpandedKey();
    /**
     * Getter para a quantidade de subchaves que a Cipher utiliza. 
     * @return .
     */
    public abstract int getAMOUNT_OF_KEYS();
    /**
     * Getter para o tamanho dos estados da Cipher em bytes. 
     * @return .
     */
    public abstract int getBLOCK_SIZE_IN_BYTES();
    /**
     * Getter para o tamanho dos estados da Cipher em palavras de tamanho
     * <code>wordSize</code>. 
     * @return .
     */
    public int getBLOCK_SIZE_IN_WORDS(){
        return getBLOCK_SIZE_IN_BYTES() * 8 / getWORD_SIZE();
    }
    /**
     * Getter para o tamanho da chave secreta da Cipher em bytes. 
     * @return .
     */
    public int getKEY_SIZE_IN_BYTES(){
        return getROUND_KEY_SIZE_IN_BYTES();
    }
    /**
     * Getter para o tamanho da chave secreta da Cipher em palavras de acordo
     * com <code>getWordSize()</code>.
     * @return .
     */
    public int getKEY_SIZE_IN_WORDS(){
        return getKEY_SIZE_IN_BYTES() * 8 / getWORD_SIZE();
    }
    /**
     * Getter para o tamanho das subchaves da Cipher em bytes. 
     * @return .
     */
    public abstract int getROUND_KEY_SIZE_IN_BYTES();
    /**
     * Getter para a quantidade de rodadas da Cipher. 
     * @return .
     */
    public abstract int getNUM_ROUNDS();
    /**
     * Getter para a quantidade de subchaves da Cipher. 
     * @return .
     */
    public abstract int getNUM_KEYS();
    /**
     * Getter para a quantidade de estados da Cipher. 
     * @return .
     */
    public abstract int getNUM_STATES();
    /**
     * Getter para a quantidade total de S-boxes que devem ser aplicadas ao
     * longo de uma encriptação completa da Cipher.
     * @return .
     */
    public abstract int getNUM_SBOXES_TOTAL();
    /**
     * Getter para o tamanho da palavra da Cipher. 
     * @return .
     */
    public abstract int getWORD_SIZE();
    /**
     * Retorna o índice da subchave que será aplicada sobre o estado
     * <code>state</code> caso este seja um estado pré mistura com a chave. Caso
     * contrário, retorna -1.
     * @param state .
     * @return .
     */
    public int getINDEX_OF_PRE_KEY(int state) {
        int[] indexes = getINDEXES_OF_PRE_ADD_KEY();
        int index = Arrays.binarySearch(indexes, state);
        if(index < 0) return -1;
        return index;
    }
    /**
     * Retorna o índice da subchave que resultou no estado <code>state</code>
     * após mistura com o estado anterior. Caso este não seja um estado pós-
     * mistura com a chave, retorna -1.
     * @param state .
     * @return .
     */
    public int getINDEX_OF_POST_KEY(int state) {
        int[] indexes = getINDEXES_OF_POST_ADD_KEY();
        int index = Arrays.binarySearch(indexes, state);
        if(index < 0) return -1;
        return index;
    }
    /**
     * Retorna o índice do estado antes da mistura com a subchave
     * <code>index</code>. Caso <code>index</code> não seja válido, retorna -1.
     * @param index.
     * @return .
     */
    public int getINDEX_OF_STATE_PRE_KEY(int index) {
        int[] indexes = getINDEXES_OF_PRE_ADD_KEY();
        if(index < 0 || index >= indexes.length) return -1;
        return indexes[index];
    }
    /**
     * Retorna o índice do estado após a mistura com a subchave
     * <code>index</code>. Caso <code>index</code> não seja válido, retorna -1.
     * @param index .
     * @return .
     */
    public int getINDEX_OF_STATE_POST_KEY(int index) {
        int[] indexes = getINDEXES_OF_POST_ADD_KEY();
        if(index < 0 || index >= indexes.length) return -1;
        return indexes[index];
    }
    /**
     * Retorna um vetor com os índices de todos os estados da Cipher 
     * imediatamente antes da aplicação das S-boxes.
     * @return .
     */
    public abstract int[] getINDEXES_OF_PRE_SBOX_STATES();
    /**
     * Retorna um vetor com os índices de todos os estados da Cipher 
     * imediatamente após a aplicação das S-boxes.
     * @return .
     */
    public int[] getINDEXES_OF_POST_SBOX_STATES() {
        int []preStates = getINDEXES_OF_PRE_SBOX_STATES();
        int []res = Arrays.copyOf(preStates, preStates.length);
        for (int i = 0; i < res.length; i++) res[i]++;
        return res;
    }
    /**
     * Retorna um vetor com os índices de todos os estados da Cipher 
     * imediatamente antes da mistura com uma subchave.
     * @return .
     */
    public abstract int[] getINDEXES_OF_PRE_ADD_KEY();
    /**
     * Retorna um vetor com os índices de todos os estados da Cipher 
     * imediatamente após a mistura com uma subchave.
     * @return .
     */
    public int[] getINDEXES_OF_POST_ADD_KEY(){
        int result[] = getINDEXES_OF_PRE_ADD_KEY();
        for (int i = 0; i < result.length; i++) result[i]++;
        return result;
    }
    /**
     * Retorna um vetor com os índices de todas as palavras das subchaves da
     * Cipher que envolvem aplicação de S-boxes.
     * @return .
     */
    public abstract int[] getSBOX_RELEVANT_KEY_WORDS();
    /**
     * Retorna um vetor com os índices de todas as palavras dos estados da
     * Cipher que envolvem aplicação de S-boxes.
     * @return .
     */
    public abstract int[] getSBOX_RELEVANT_STATE_WORDS();
    
    /**
    * Este método expande a subchave <code>key</code> da rodada
    * <code>round</code> para frente, gerando todos os bits de chave. Deve ser
    * armazenado em alguma variável interna da Cipher.
     * @param key .
     * @param round .
    */
    public abstract void setKey(ByteArray key, int round);
    
    /**
    * Este método retorna uma List com todos os estados, sendo o primeior o estado
    * no índice <code>fromState</code>, dado por <code>block</code>, até o
    * índice <code>toState</code>, aplicando as operações corretamente.
     * @param block .
     * @param fromState .
     * @param toState .
     * @return .
    */
    public abstract List<ByteArray> encryptForward(ByteArray block, int fromState, int toState);
    
    /**
    * Este método retorna uma List com todos os estados, iniciando com o estado
    * no índice  antes de <code>fromState</code>, dado por <code>block</code>, até o
    * índice <code>toState</code>, aplicando as inversas das operações, na ordem
    * inversa à ordem de encriptação.
     * @param block .
     * @param fromState .
     * @param toState .
     * @return .
    */
    public abstract List<ByteArray> encryptBackwards(ByteArray block, int fromState, int toState);
    
    
    /**
     * Método que imprime na tela os resultados de todos os métodos disponíveis
     * em um objeto de alguma subclasse de Cipher. Deve ser utilizado para testar 
     * todos getters da cifra implementada.
     * 
     * @param ignoreNonTestables se setado ignora os métodos que não podem ser testados
     * @throws java.lang.Exception Gera erros caso os métodos chamados não tenham
     * sido implementados ou se eles lançarem erros por si só.
     */
    public void printAllConfigurations(boolean ignoreNonTestables) throws Exception{
        String className = this.getClass().toString(), aux[];
        int index,contPrinted=0,contAbstract=0;
        
        for (Method method : Cipher.class.getMethods()) {
            if(method.toString().contains("printAllConfigurations")) continue;
            if(method.toString().contains("cifras.")){
                aux = Util.splitString(method.toString(),".",method.toString().indexOf("("));
                
                index = 0;
                for (int i = 0; i < aux.length; i++) 
                    if(aux[i].contains("("))
                        index = i;
                
//                System.out.print(aux[index].substring(0));
                
                try{
                    if(method.getParameterCount() != 0){
                        if(!ignoreNonTestables)
                            System.out.println(aux[index].substring(0)+" não é possível testar vários parâmetros.");
                    }else{
                        Object obj = method.invoke(this);
                        if(obj instanceof int[])
                            System.out.println(aux[index].substring(0)+" = "+Arrays.toString((int[])obj));
                        else System.out.println(aux[index].substring(0)+" = "+obj);
                    }
                }catch(RuntimeException r){
                    System.out.println(aux[index].substring(0)+" gerou erro: "+r.getMessage());
                } 
            }
        }
    }
    public static void testador(String[] args) throws Exception{
        new Serpent(new ByteArray(32),0).printAllConfigurations(false);
    }
}
