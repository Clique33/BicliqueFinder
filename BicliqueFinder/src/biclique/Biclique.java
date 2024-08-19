package biclique;

import util.ByteArray;
import util.Util;
import cifras.Cipher;
import cifras.Future;
import cifras.Rijndael;
import cifras.Serpent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import util.WordSize;


/**
 * Classe que representa bicliques, dada por pelo menos um par de 
 * RelatedKeyDifferential's, dependendo da biclique utilizada.
 * 
 */
public class Biclique {
    
    public static List<RelatedKeyDifferential> manyFromOne(RelatedKeyDifferential rkd){
        List<RelatedKeyDifferential> result = new ArrayList<>();
        int wordsize = rkd.getCiphers()[0].getWORD_SIZE();
        ByteArray bytearray;
        
        int j = 0;
        for (Integer i : rkd.getKeyDifference().getActiveWords(wordsize)) {
            bytearray = new ByteArray(rkd.getKeyDifference().length());
            bytearray.setWord(wordsize, i, (int)Math.pow(2, wordsize) - 1);
//            System.out.println(bytearray);
            result.add(
                    new RelatedKeyDifferential(
                            rkd.getFromState(),
                            rkd.getToState(), 
                            bytearray,
                            rkd.getKeyIndex(), 
                            rkd.getCiphers()[0],
                            rkd.getCiphers()[1],
                            rkd.getType()
                    )
            );
//            System.out.println(result.get(j++).getKeyDifference());
        }
        return result;
    }
    /**
     * Método de testes de Biclique.
     * @param args .
     */
    public static void main(String args[]){
        String ataqueAtual = "future star";
        int option = ImplementedBicliqueAttacks.PRINT_ALL;
        
        switch(ataqueAtual){
            case "atual":
                ImplementedBicliqueAttacks.current(option);
                break;
            case "future best":
                ImplementedBicliqueAttacks.futureBest(option);
                break;
            case "future artigo":
                ImplementedBicliqueAttacks.futureArtigo(option);
                break;
            case "future star":
                ImplementedBicliqueAttacks.futureEstrela(option);
                break;
            case "serpent first1":
                ImplementedBicliqueAttacks.serpentFirst1(option);
                break;
            case "serpent first2":
                ImplementedBicliqueAttacks.serpentFirst2(option);
                break;
            case "rijndael fastest minimal":
                ImplementedBicliqueAttacks.rijndaelFastestMinimal(option);
                break;
            case "rijndael fastest fullcodebook":
                ImplementedBicliqueAttacks.rijndaelFastestFullCodebook(option);
                break;
            case "rijndael star":
                ImplementedBicliqueAttacks.rijndaelStar(option);
                break;
            case "rijndael fastest":
                ImplementedBicliqueAttacks.rijndaelFastest(option);
                break;
            case "rijndael tao1":
                ImplementedBicliqueAttacks.rijndaelTao1(option);
                break;
            case "rijndael tao2":
                ImplementedBicliqueAttacks.rijndaelTao2(option);
                break;
            case "rijndael original":
                ImplementedBicliqueAttacks.rijndaelOriginal(option);
                break;
        }

    }

    /**
     * O primeiro objeto da cifra em que a biclique será criada. Dois são
     * necessários para geração de diferenças e diferenciais.
     */
    private Cipher cipher1;
    /**
     * O primeiro objeto da cifra em que a biclique será criada. Dois são
     * necessários para geração de diferenças e diferenciais.
     */
    private Cipher cipher2;
    /**
     * As RelatedKeyDifferential's que são na direção DELTA. Dependendo do
     * ataque, podem haver 0 ou mais.
     */
    private List<RelatedKeyDifferential> deltaDifferentials;
    /**
     * As RelatedKeyDifferential's que são na direção NABLA. Dependendo do
     * ataque, podem haver 0 ou mais.
     */
    private List<RelatedKeyDifferential> nablaDifferentials;
    /**
     * A StateDifferential que representa apenas as palavras da cifra em questão
     * que afetam a variável v, utilizada na etapa de <i>meet in the middle</i>.
     */
    private RelatedKeyDifferential affectV;
    /**
     * Quantidade de palavras que são utilizadas para a variável v na etapa de
     * <i>meet in the middle</i>. 
     */
    private int sizeOfV;
    /**
     * O estado em que está a variável v, utilizada na etapa de
     * <i>meet in the middle</i>.
     */
    private int stateOfV;
    /**
     * O estado inicial da Biclique. Na teoria, deveria ser igual a fromState.
     */
    private int stateOfBiclique;
    /**
     * O estado inicial das RelatedKeyDifferential's.
     */
    private int fromState;
    /**
     * O estado inicial das RelatedKeyDifferential's.
     */
    private int toState;

    /**
     * Construtor que cria uma Biclique a partir da List de
     * RelatedKeyDifferential's <code>differentials</code> e da definição da 
     * variável v, dada pelas palavras <code>wordsOfV</code> e pelo estado 
     * <code>stateOfV</code>. 
     * 
     * @param differentials .
     * @param stateOfV .
     * @param wordsOfV .
     * @exception RuntimeException pode ser lançado se a List é nula, vazia,
     * possui apenas uma RelatedKeyDifferential ou se possuir alguma
     * RelatedKeyDifferential nula. 
     */
    public Biclique(List<RelatedKeyDifferential> differentials,
                    int stateOfV,
                    List<Integer> wordsOfV) {
        deltaDifferentials = new LinkedList<>();
        nablaDifferentials = new LinkedList<>();
        if (differentials == null || differentials.isEmpty()) 
            throw new RuntimeException("Não há diferenciais na lista passada");   
        if (differentials.size() == 1) 
            throw new RuntimeException("Não há diferenciais o suficiente na "
                                                             + "lista passada"); 
        differentials.forEach((diff) -> {
            if(diff == null)
                throw new RuntimeException("Existem diferenciais nulas na lista"
                                                                  + " passada");
            if (diff.isDelta()) 
                deltaDifferentials.add(diff);
            else 
                nablaDifferentials.add(diff);
        });
//        if (deltaDifferentials.isEmpty()) 
//            System.out.println("Estrela no final da cifra"); 
//        if (nablaDifferentials.isEmpty()) 
//            System.out.println("Estrela no início da cifra"); 
        if(!deltaDifferentials.isEmpty()){
            this.stateOfBiclique = deltaDifferentials.get(0).getFromState();
            this.fromState = deltaDifferentials.get(0).getFromState();
            this.toState = deltaDifferentials.get(0).getToState();
        }else{
            this.stateOfBiclique = nablaDifferentials.get(0).getFromState();
            this.fromState = nablaDifferentials.get(0).getFromState();
            this.toState = nablaDifferentials.get(0).getToState();
        }
        this.stateOfV = stateOfV;
        this.sizeOfV = wordsOfV.size();
        
        cipher1 = differentials.get(0).getCiphers()[0];
        cipher2 = differentials.get(0).getCiphers()[1];

        ByteArray difference = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        for (Integer i : wordsOfV) difference.setWord(cipher1.getWORD_SIZE(),i,0xff);
        affectV = new RelatedKeyDifferential(
                new StateDifferential(difference, stateOfV, cipher1, cipher2));
        prepareRecomputation();
    }

    /**
     * Modifica o atributo <code>affectV</code> para que permaneçam somente as
     * palavras que afetam a variável v, ou seja, que são relevantes na
     * etapa de recomputação. 
     * @return uma List com as quantidades de palavras ativas relevantes para
     * frente (indice 0), para trás (indice 1) e nas subchaves (indice 2).
     */
    private List<Integer> onlyRelevantV(){
        List<Integer> result = new ArrayList<>(3);
        List<Integer> relevant = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        List<Integer> relevantForward = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        List<Integer> relevantBackward = Util.toIntegerList(cipher1.getINDEXES_OF_POST_SBOX_STATES());
        
        int finalBackward = isInicio() ? cipher1.getNUM_STATES() - 1 : fromState;
        int inicioForward = isInicio() ? toState : 0;
                
        for (int i = 0; i < relevantForward.size(); i++) 
            if(relevantForward.get(i) >= stateOfV || relevantForward.get(i) < inicioForward)
                relevantForward.remove(i--);
        for (int i = 0; i < relevantBackward.size(); i++) 
            if(relevantBackward.get(i) <= stateOfV || relevantBackward.get(i) > finalBackward)
                relevantBackward.remove(i--);   
        for (int i = 0; i < relevant.size(); i++) 
            if(relevant.get(i) > fromState && relevant.get(i) < toState)
                relevant.remove(i--);     
        
        result.add(affectV.getNumActive(relevantForward, true));
        result.add(affectV.getNumActive(relevantBackward, true));
        result.add(affectV.getNumActive(relevant, true));
            
        return result;
    }

    /**
     * Retorna uma List com as quantidades de Sboxes que afetam palavras
     * relevantes nos estados e nas chaves, durante a etapa de pré-computação da
     * biclique, de acordo com o método original.
     * 
     * @return uma List com as quantidades de Sboxes que afetam palavras
     * relevantes para frente (indice 0) e para trás (indice 1).
     */
    private List<Integer> onlyRevelantPrecomp(){
        List<Integer> result = new ArrayList<>(2);
        int aux = 0;
        List<Integer> relevantForward = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        List<Integer> relevantBackward = Util.toIntegerList(cipher1.getINDEXES_OF_POST_SBOX_STATES());
        List<Integer> relevantKeyForward = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_ADD_KEY());
        List<Integer> relevantKeyBackward = Util.toIntegerList(cipher1.getINDEXES_OF_POST_ADD_KEY());

        for (int i = 0; i < relevantForward.size(); i++) 
            if(relevantForward.get(i) >= stateOfV)
                relevantForward.remove(i--);
        for (int i = 0; i < relevantBackward.size(); i++) 
            if(relevantBackward.get(i) >= stateOfBiclique || relevantBackward.get(i) <= stateOfV)
                relevantBackward.remove(i--);  
        for (int i = 0; i < relevantKeyForward.size(); i++) 
            if(relevantKeyForward.get(i) >= stateOfV)
                relevantKeyForward.remove(i--);
        for (int i = 0; i < relevantKeyBackward.size(); i++) 
            if(relevantKeyBackward.get(i) >= stateOfBiclique || relevantKeyBackward.get(i) <= stateOfV)
                relevantKeyBackward.remove(i--);  


        //states for deltas
        for (int i : relevantForward) 
            aux +=deltaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        //keys for deltas
        for (int i : relevantKeyForward)
            aux +=cipher1.getSBOX_RELEVANT_KEY_WORDS().length;
        result.add(aux);

        aux = 0;
        //states for nablas
        for (int i : relevantBackward)
            aux += nablaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        //keys for nablas
        for (int i : relevantKeyBackward)
            aux += cipher1.getSBOX_RELEVANT_KEY_WORDS().length;
        result.add(aux);
        
        
        return result;
    }
    

    /**
     * Retorna uma List com as quantidades de Sboxes que afetam palavras
     * relevantes nos estados e nas chaves, durante a etapa de pré-computação da
     * biclique, de acordo com o método de Tao et al.
     * 
     * @return uma List com as quantidades de Sboxes que afetam palavras
     * relevantes para frente (indice 0) e para trás (indice 1).
     */
    private List<Integer> onlyRevelantPrecompTao(){
        List<Integer> result = new ArrayList<>(3);
        int aux, cont, amountWords;
        List<Integer> relevantForward = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        List<Integer> relevantBackward = Util.toIntegerList(cipher1.getINDEXES_OF_POST_SBOX_STATES());
        List<Integer> relevantKeyForward = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_ADD_KEY());
        List<Integer> relevantKeyBackward = Util.toIntegerList(cipher1.getINDEXES_OF_POST_ADD_KEY());
        
//        System.out.println("Pre filtro :");
//        System.out.println("relevantForward : "+relevantForward);
//        System.out.println("relevantBackward : "+relevantBackward);
//        System.out.println("relevantKeyForward : "+relevantKeyForward);
//        System.out.println("relevantKeyBackward : "+relevantKeyBackward);
//        System.out.println("-----------------------------------------");

        //Get only the relevant states for forward precomputation
        if(nablaDifferentials.size()>0){
            amountWords = (int)nablaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
            for (int i = 0; i < relevantForward.size(); i++) {
                //Somente os estados fora da biclique são relevantes
                if(relevantForward.get(i) >= stateOfV)
                    relevantForward.remove(i--);
                //Caso todos os bytes sejam afetados, não é necessário pré-computar
                else{
                    cont = 0;
                    for (int j = 0; j < amountWords; j++) 
                        if (nablaDifferentials.get(0).getStateDifference(relevantForward.get(i)).getWord(cipher1.getWORD_SIZE(), j) != 0)
                            cont++;
                    if(cont == amountWords)
                        relevantForward.remove(i--);
                }
            }
        }
        
//        System.out.println("Pos filtro :");
//        System.out.println("relevantForward : "+relevantForward);
//        System.out.println("-----------------------------------------");
//        
        //Get only the relevant states for backward precomputation
        amountWords = (int)deltaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        for (int i = 0; i < relevantBackward.size(); i++) {
//            System.out.println("state diference "+relevantBackward.get(j)+" : "+deltaDifferentials.get(0).getStateDifference(relevantBackward.get(j)));
            //Somente os estados fora da biclique e pós estado V são relevantes
            if(relevantBackward.get(i) >= stateOfBiclique || relevantBackward.get(i) <= stateOfV)
                relevantBackward.remove(i--); 
            //Caso todos os bytes sejam afetados, não é necessário pré-computar
            else{
                cont = 0;
                for (int j = 0; j < amountWords; j++) 
                    if (deltaDifferentials.get(0).getStateDifference(relevantBackward.get(i)).getWord(cipher1.getWORD_SIZE(), j) != 0)
                        cont++;
                if(cont == amountWords)
                    relevantBackward.remove(i--);
            } 
        }
        
//        System.out.println("Pos filtro :");
//        System.out.println("relevantBackward : "+relevantBackward);
//        System.out.println("-----------------------------------------");
//        
        //Get only the relevant keys for forward precomputation
        for (int i = 0; i < relevantKeyForward.size(); i++) {
            if(relevantKeyForward.get(i) >= stateOfV)
                relevantKeyForward.remove(i--);
            else
                if(!relevantForward.contains(relevantKeyForward.get(i)+1))
                    relevantKeyForward.remove(i--);            
        }
//        System.out.println("Pos filtro :");
//        System.out.println("relevantKeyForward : "+relevantKeyForward);
//        System.out.println("-----------------------------------------");
        
        //Get only the relevant keys for backward precomputation
        for (int i = 0; i < relevantKeyBackward.size(); i++) {
            if(relevantKeyBackward.get(i) >= stateOfBiclique || relevantKeyBackward.get(i) <= stateOfV)
                relevantKeyBackward.remove(i--);
            else
                if(!relevantBackward.contains(relevantKeyBackward.get(i)+1))
                    relevantKeyBackward.remove(i--);            
        }
        
//        System.out.println("Pos filtro :");
//        System.out.println("relevantKeyBackward : "+relevantKeyBackward);
//        System.out.println("-----------------------------------------");

//        System.out.println("relevantForward : "+relevantForward);
//        System.out.println("relevantBackward : "+relevantBackward);
//        System.out.println("relevantKeyForward : "+relevantKeyForward);
//        System.out.println("relevantKeyBackward : "+relevantKeyBackward);
        aux = 0;
        amountWords = (int)deltaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        //states for deltas
        for (int i : relevantForward)
            aux +=amountWords;
        amountWords = (int)deltaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        //keys for deltas
        for (int i : relevantKeyForward)
            aux += cipher1.getSBOX_RELEVANT_KEY_WORDS().length;
        result.add(aux);
        
        aux = 0;
        //states for nablas
        for (int i : relevantBackward)
            aux +=amountWords;     
        //keys for nablas
        for (int i : relevantKeyBackward)
            aux += cipher1.getSBOX_RELEVANT_KEY_WORDS().length;
        result.add(aux);
        
        return result;
    }

    /**
     * Cria e retorna uma List com as quantidades de Sboxes que afetam palavras
     * relevantes na computação das chaves.
     * 
     * @return uma List com as quantidades de Sboxes que afetam palavras
     * relevantes nas chaves para frente (indice 0) e para trás (indice 1).
     */
    private List<Integer> onlyRevelantKeys(){
        int aux;
        List<Integer> result = new ArrayList<>(2);
        List<Integer> relevantForwardStates = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_ADD_KEY());
        List<Integer> relevantBackwardStates = Util.toIntegerList(cipher1.getINDEXES_OF_POST_ADD_KEY());

        for (int i = 0; i < relevantForwardStates.size(); i++) 
            if(relevantForwardStates.get(i) >= stateOfV)
                relevantForwardStates.remove(i--);
        for (int i = 0; i < relevantBackwardStates.size(); i++) 
            if(relevantBackwardStates.get(i) >= stateOfBiclique || relevantBackwardStates.get(i) <= stateOfV)
                relevantBackwardStates.remove(i--);  

        int relevantWords[] = cipher1.getSBOX_RELEVANT_KEY_WORDS();

        aux = 0;
        for (int word : relevantWords) 
            for(RelatedKeyDifferential nabla : nablaDifferentials)
                for (int forwardState : relevantForwardStates) 
                    if (affectV.getStateDifference(forwardState).getWord(cipher1.getWORD_SIZE(), word) != 0 &&
                        nabla.getKeyDifference(cipher1.getINDEX_OF_PRE_KEY(forwardState)).getWord(cipher1.getWORD_SIZE(), word) != 0)
                        aux++;
        result.add(aux);

        aux = 0;
        for (int word : relevantWords) 
            for(RelatedKeyDifferential delta : deltaDifferentials)
                for (int backwardState : relevantBackwardStates) 
                    if (affectV.getStateDifference(backwardState).getWord(cipher1.getWORD_SIZE(), word) != 0 &&
                        delta.getKeyDifference(cipher1.getINDEX_OF_POST_KEY(backwardState)).getWord(cipher1.getWORD_SIZE(), word) != 0)
                        aux++;
        result.add(aux);
        
        System.out.println("relevant keys : "+result);
        return result;
    }

    /**
     * Retorna a quantidade de Sboxes que afetam palavras relevantes nos estados
     * e nas chaves, durante a construção da biclique.
     * @return  .
     */
    private int onlyRevelantBiclique(){
        int result = 0, amountWords;
        List<Integer> relevantStates = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        List<Integer> relevantKeys = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_ADD_KEY());

        for (int i = 0; i < relevantStates.size(); i++) 
            if(relevantStates.get(i) < stateOfBiclique)
                relevantStates.remove(i--); 
        
        for (int i = 0; i < relevantKeys.size(); i++) 
            if(relevantKeys.get(i) < relevantStates.get(0))
                relevantKeys.remove(i--); 
//        
//        System.out.println("relevantStates : " + relevantStates);
//        System.out.println("relevantKeys : " + relevantKeys);

        amountWords = (int)deltaDifferentials.get(0).getStateDifference(0).amountOfWords(cipher1.getWORD_SIZE());
        //states for deltas
        for (Integer relevantState : relevantStates)
            result+= amountWords;
        
        //keys for deltas
        for (Integer relevantKey : relevantKeys) 
            result += cipher1.getSBOX_RELEVANT_KEY_WORDS().length;        
        
//        System.out.println("result : "+result);
        return result;
    }

    /**
     * Retorna verdadeiro se as RelatedKeyDifferential's são independentes, de
     * acordo com os tipos de bicliques às quais estão associadas, e falso caso 
     * contrário, delimitados pelos atributos <code>fromState</code> e
     * <code>toState</code> desta Biclique.
     * @return .
     */
    public boolean checkIndependence(){
        return checkIndependence(fromState, toState);
    }

    /**
     * Retorna verdadeiro se as RelatedKeyDifferential's são independentes, de
     * acordo com os tipos de bicliques às quais estão associadas, e falso caso 
     * contrário, delimitados pelos estados <code>fromState</code> e
     * <code>toState</code>.
     * @param fromState .
     * @param toState .
     * @return .
     */
    private boolean checkIndependence(int fromState, int toState){
        
        if(!isEstrela()){// Se não é estrela testa independência entre deltas e nablas apenas
            for(RelatedKeyDifferential delta : deltaDifferentials)
                for(RelatedKeyDifferential nabla : nablaDifferentials)
                    if(!isIndependentThroughStates(delta, nabla, fromState, toState))
                        return false;
        }else{ // Se é estrela, testa apenas os deltas, ou apenas os nablas
            if(isInicio()){// Se está no início testa apenas os deltas.
                for(int i = 0; i < deltaDifferentials.size(); i++)
                    for(int j = 0; j < deltaDifferentials.size(); j++)
                        if(i != j)
                            if(!isIndependentThroughStates( deltaDifferentials.get(i),
                                                            deltaDifferentials.get(j),
                                                            fromState, toState))
                                return false;
            }else {// Se está no início testa apenas os nablas.
                for(int i = 0; i < nablaDifferentials.size(); i++)
                    for(int j = 0; j < nablaDifferentials.size(); j++)
                        if(i != j)
                            if(!isIndependentThroughStates( nablaDifferentials.get(i),
                                                            nablaDifferentials.get(j),
                                                            fromState, toState))
                                return false;
            }
        }
        return true;
    }

    /**
     * Retorna a potência do custo de tempo da computação dos estados na etapa
     * de construção da biclique desta Biclique.
     * @return .
     */
    private double computeCBiclique(){
        double multiplier, dimension, pot;
               
        multiplier = Math.log(deltaDifferentials.size() + nablaDifferentials.size())/Math.log(2);
                
        dimension = cipher1.getWORD_SIZE();
        
        pot = Math.log(onlyRevelantBiclique()/(double)cipher1.getNUM_SBOXES_TOTAL())/Math.log(2);

        return multiplier + dimension + pot;
    }

    /**
     * Retorna a potência do custo de tempo de computação das chaves de toda a 
     * cifra desta Biclique, de acordo com o método original.
     * @return .
     */
    private double computeCKeys(){
        List<Integer> relevantKeys;
        double aux, totalKeys, potForward, potBackward;

        relevantKeys = onlyRevelantKeys();
        totalKeys = cipher1.getWORD_SIZE()*(nablaDifferentials.size() + deltaDifferentials.size());

        aux = (double)relevantKeys.get(0)/cipher1.getNUM_SBOXES_TOTAL();
        potForward = Math.log(aux)/Math.log(2);

        aux = (double)relevantKeys.get(1)/cipher1.getNUM_SBOXES_TOTAL();
        potBackward = Math.log(aux)/Math.log(2);

//            System.out.println("totalKeys : " + totalKeys);
//            System.out.println("potForward : " + potForward);
//            System.out.println("potBackward : " + potBackward);

        return totalKeys + potForward + potBackward;
    }

    /**
     * Retorna a potência do custo de tempo de computação das chaves de toda a 
     * cifra desta Biclique, de acordo com o método de Tao et al.
     * @return .
     */
    private double computeCKeysTao(){
        int relevantKeys;
        double aux, totalKeys;

        relevantKeys = cipher1.getINDEX_OF_PRE_KEY(fromState)+1;
        totalKeys = cipher1.getWORD_SIZE()*(nablaDifferentials.size()-1 + deltaDifferentials.size()) + 1;

//        System.out.println("Sbox relevant words size : " + cipher1.getSBOX_RELEVANT_KEY_WORDS().length);
//        System.out.println("Relevant keys size : " + relevantKeys);
//        System.out.println("Sbox total : " + cipher1.getNUM_SBOXES_TOTAL());
        
        aux = cipher1.getSBOX_RELEVANT_KEY_WORDS().length*relevantKeys/(double)cipher1.getNUM_SBOXES_TOTAL();

        return totalKeys + Math.log(aux)/Math.log(2);
    }

    /**
     * Retorna a potência do custo de tempo de computação do oráculo necessário
     * à geração de pares para o ataque.
     * @return .
     */
    private double computeCOracle(){
        if(isEstrela()) return 0;
        return  cipher1.getWORD_SIZE()*deltaDifferentials.size();
    }
    
    /**
     * Retorna a potência do custo de tempo de computação dos estados na fase de 
     * pré-computação desta Biclique, de acordo com o método original.
     * @return .
     */
    private double computeCPrecomp(){
        List<Integer> aux = onlyRevelantPrecomp();
        double s1, s2;

        s1 = Double.valueOf(aux.get(0))/cipher1.getNUM_SBOXES_TOTAL();
        s2 = Double.valueOf(aux.get(1))/cipher1.getNUM_SBOXES_TOTAL();

        double deltas = Math.pow(2, cipher1.getWORD_SIZE()*deltaDifferentials.size());
        double nablas = Math.pow(2, cipher1.getWORD_SIZE()*nablaDifferentials.size());
        double pot = Math.log(deltas * s1 + nablas * s2)/Math.log(2);
        return  pot;
    }
    
    /**
     * Retorna a potência do custo de tempo de computação dos estados na fase de 
     * pré-computação desta Biclique, para bicliques estrela.
     * @return .
     */
    private double computeCPrecompStar(){
        return cipher1.getWORD_SIZE() +0.5;
    }

    /**
     * Retorna a potência do custo de tempo de computação dos estados na fase de 
     * pré-computação desta Biclique, de acordo com o método  de Tao et al.
     * @return .
     */
    private double computeCPrecompTao(){
        List<Integer> aux = onlyRevelantPrecompTao();
        double multiplier,pot;
        int  totalKeys;
        
        multiplier = Math.log(nablaDifferentials.size() + deltaDifferentials.size())/Math.log(2);
        totalKeys = cipher1.getWORD_SIZE()*(nablaDifferentials.size()-1 + deltaDifferentials.size());
        
//        System.out.println("precomp forward : " + temp.get(0));
//        System.out.println("precomp backward : " + temp.get(0));
//        System.out.println("Sbox total : " + (double)cipher1.getNUM_SBOXES_TOTAL());
        
        pot = Math.log((aux.get(0) + aux.get(1))/(double)cipher1.getNUM_SBOXES_TOTAL())/Math.log(2);
        
//        System.out.println(multiplier+" + "+totalKeys+" + "+pot);
        
        return multiplier + totalKeys + pot;
    }

    /**
     * Retorna a potência do custo de tempo de computação dos estados na fase de 
     * recomputação desta Biclique.
     * @return .
     */    
    private double computeCRecomp(){
        List<Integer> aux = onlyRelevantV();
//        double sboxes = Double.valueOf(aux.get(0) + aux.get(1));//Uses forward and backward separately
        double sboxes = Double.valueOf(aux.get(2));//Uses both as one
        int totalDiffs = nablaDifferentials.size()+deltaDifferentials.size();
        double pot = Math.log(sboxes/cipher1.getNUM_SBOXES_TOTAL())/Math.log(2);
        return pot + cipher1.getWORD_SIZE()*totalDiffs;
    }

    /**
     * Retorna a potência do custo de tempo de retestar os candidatos à chave,
     * de acordo com o método original.
     * @return .
     */    
    private double computeCFalpos(){
        return deltaDifferentials.size()+nablaDifferentials.size() >= sizeOfV ? 
                (deltaDifferentials.size()+nablaDifferentials.size() - sizeOfV)*cipher1.getWORD_SIZE() :
                0;
    }

    /**
     * Retorna a potência do custo de tempo de retestar os candidatos à chave,
     * de acordo com o método de Tao et al.
     * @return .
     */      
    private double computeCFalposTao(){

        double numFalpos = (deltaDifferentials.size()+nablaDifferentials.size())*cipher1.getWORD_SIZE()-(double)cipher1.getWORD_SIZE();

        List<Integer> auxStates = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());

        for (int i = 0; i < auxStates.size(); i++) 
            if(auxStates.get(i) > stateOfV)
                auxStates.remove(i--);
        
//        System.out.println("auxStates : "+auxStates);

        double totalSboxes = auxStates.size() * cipher1.getSBOX_RELEVANT_STATE_WORDS().length/(double)cipher1.getNUM_SBOXES_TOTAL();
//        System.out.println("totalSboxes : "+totalSboxes);
        totalSboxes = Math.log(totalSboxes)/Math.log(2);
        
//        System.out.println(numFalpos+" + "+totalSboxes);
        return numFalpos + totalSboxes;
    }
    
    /**
     * Retorna o custo total de tempo do ataque. DEVE SER ALTERADO PARA NÃO
     * DEPENDER DE ALTERAÇÃO MANUAL.
     * 
     * @param debug quando verdadeira, printa informações sobre o cálculo de
     * complexidade de tempo.
     * @return .
     */ 
    public double computeTimeComplexity(boolean debug){
        return computeTimeComplexityFuture(debug);
    }
    
    /**
     * Retorna o custo total de tempo do ataque, de acordo com o método de Tao
     * et al. DEVE SER ALTERADO PARA NÃO DEPENDER DE ALTERAÇÃO MANUAL.
     * 
     * @param debug quando verdadeira, printa informações sobre o cálculo de
     * complexidade de tempo.
     * @return .
     */ 
    private double computeTimeComplexityTao(boolean debug){
        double Cbiclique, Cprecomp, Ckeys, Crecomp, Cfalpos, Coracle;
        Cbiclique = Math.pow(2, computeCBiclique());
        Ckeys =     Math.pow(2, computeCKeysTao());
        Cprecomp =  Math.pow(2, computeCPrecompTao());
        Crecomp =   Math.pow(2, computeCRecomp());
        Cfalpos =   Math.pow(2, computeCFalposTao()); 
        Coracle =   Math.pow(2, computeCOracle()); 

        if(debug){
            System.out.println("Cbiclique : "+ computeCBiclique());
            System.out.println("Coracle : "+ computeCOracle());
            System.out.println("Ckeys : "+ computeCKeysTao());
            System.out.println("Cprecomp : "+ computeCPrecompTao());
            System.out.println("Crecomp : "+ computeCRecomp());
            System.out.println("Cfalpos : "+ computeCFalposTao());
        }

        return Math.log(Cbiclique + Ckeys + Cprecomp + Crecomp + Cfalpos + Coracle)/Math.log(2);
    }
    
    /**
     * Retorna o custo total de tempo do ataque, de acordo com o método para
     * bicliques estrela. DEVE SER ALTERADO PARA NÃO DEPENDER DE ALTERAÇÃO
     * MANUAL.
     * 
     * @param debug quando verdadeira, printa informações sobre o cálculo de
     * complexidade de tempo.
     * @return .
     */ 
    private double computeTimeComplexityStar(boolean debug){
        double Cprecomp, Crecomp, Cfalpos;
        Cprecomp =  Math.pow(2, computeCPrecompStar());
        Crecomp =   Math.pow(2, computeCRecomp());
        Cfalpos =   Math.pow(2, computeCFalpos()); 

        if(debug){
            System.out.println("Cprecomp : "+ computeCPrecompStar());
            System.out.println("Crecomp : "+ computeCRecomp());
            System.out.println("Cfalpos : "+ computeCFalpos());
        }

        return Math.log(Cprecomp + Crecomp + Cfalpos)/Math.log(2);
    }
    
    /**
     * Retorna o custo total de dados do ataque de forma rápida, porém sem
     * conferir a possibilidade de algumas palavras serem sempre idênticas.
     * @return .
     */ 
    public int computeDataComplexityFast(){
        int result = 0;
        boolean active;
        for (int i = 0; i < cipher1.getBLOCK_SIZE_IN_WORDS(); i++) {
            active = false;
            for (RelatedKeyDifferential diff : deltaDifferentials) 
                if (diff.getStateDifference(cipher1.getNUM_STATES() - 1).getWord(cipher1.getWORD_SIZE(), i) != 0) 
                    active = true;
            for (RelatedKeyDifferential diff : nablaDifferentials) 
                if (diff.getStateDifference(cipher1.getNUM_STATES() - 1).getWord(cipher1.getWORD_SIZE(), i) != 0) 
                    active = true;
            if(active) result++;
        }
        return result * cipher1.getWORD_SIZE();
    }
    
    /**
     * Retorna o custo total de dados do ataque conferindo a possibilidade de
     * algumas palavras serem sempre idênticas. Nesses casos, os idênticos são
     * contados apenas uma vez.
     * @return .
     */
    public int computeDataComplexity(){
        List<List<Integer>> iguais = new ArrayList<>();

        List<Integer> result = computeDataComplexity(isInicio());
                
        return result.size()*cipher1.getWORD_SIZE();
    }
       
    public List<Integer> computeDataComplexity(boolean beginning){
        List<Integer> aux, possible;
        List<Integer> result = new ArrayList<>(); 
        List<List<Integer>> iguais = new ArrayList<>();
        
        int state;
        List<RelatedKeyDifferential> differentials;
        if(beginning){
            state = 0;
            differentials = nablaDifferentials;
        }
        else{
            state = cipher1.getNUM_STATES()-1;
            differentials = deltaDifferentials;
        }
        
        for (RelatedKeyDifferential diff : differentials) {
            possible = diff.getStateDifference(state).getActiveWords(cipher1.getWORD_SIZE());
            for (int i = 0; i < possible.size(); i++){
                aux = getEqualWords(diff, state, possible.get(i));
                if(aux.size()>1){
                    iguais.add(aux);
                    for (int j = 1; j < aux.size(); j++) 
                        possible.remove(aux.get(j));                        
                }
            }
//                System.out.println("iguais : "+iguais);
            for (int i = 0; i < possible.size(); i++)
                if(!result.contains(possible.get(i)))
                    result.add(possible.get(i));
        }
//        System.out.println("iguais : " + iguais);
//        System.out.println("result : " + result);
        return result;
    }

       
    /**
     * Retorna uma lista com todos os índices de palavras que são iguais a 
     * 'wordIndex', para todas as possibilidades da RelatedKeyDifferential
     * 'curr', no estado 'stateIndex'.
     * 
     * @param curr .
     * @param stateIndex .
     * @param wordIndex .
     * @return .
     */
    private List<Integer> getEqualWords( RelatedKeyDifferential curr,
                                        int stateIndex,
                                        int wordIndex){
//        System.out.println("getEqualWords("+curr.getKeyDifference()+","+stateIndex+","+wordIndex+")");
        ByteArray aux;
        
        List<ByteArray> keyDifferences = ByteArray.partition(curr.getKeyDifference(), curr.getCiphers()[0].getAMOUNT_OF_KEYS());
        
        List<List<Integer>> activeWordsIndexes = new ArrayList<>(keyDifferences.size());
        
        for (ByteArray keyDiff : keyDifferences) 
            activeWordsIndexes.add(keyDiff.getActiveWords(cipher1.getWORD_SIZE()));
        
        
        List<Integer> iguais = 
                curr.getStateDifference(stateIndex).
                                        getActiveWords(cipher1.getWORD_SIZE());
//        System.out.println("possiveis: "+iguais);
//        System.out.println("keyDiff: "+keyDifferences);
//        System.out.println("indexes: "+activeWordsIndexes);
                
        for (int k = 1; k < 0x1<<cipher1.getWORD_SIZE(); k++) {
            aux = new ByteArray(cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS());
            for (int i = 0; i < activeWordsIndexes.size(); i++) {
                for (int j = 0; j < activeWordsIndexes.get(i).size(); j++) {
                    aux.setWord(cipher1.getWORD_SIZE(),
                            i*cipher1.getKEY_SIZE_IN_WORDS() + activeWordsIndexes.get(i).get(j), 
                            k);
                }
            }
            curr.getEqualWords(aux, stateIndex, wordIndex, iguais);
        }
//        System.out.println("iguais: "+iguais);
        return iguais;
    }
        
    /**
     * Retorna o custo total de tempo, formatado em uma String como nos artigos
     * de acordo com o método de computação utilizado. DEVE SER ALTERADO PARA
     * NÃO DEPENDER DE ALTERAÇÃO MANUAL.
     * @param whichComp forma de cálculo da complexidade de tempo
     * @return .
     */    
    private String toStringTimeComplexity(String whichComp){
        int numGroups = cipher1.getKEY_SIZE_IN_BYTES()*cipher1.getAMOUNT_OF_KEYS()*8 - (deltaDifferentials.size()+nablaDifferentials.size())*cipher1.getWORD_SIZE();
        double groupComplexity;
        switch (whichComp) {
            case "tao"://false)
                groupComplexity = computeTimeComplexityTao(true);
                break;
            case "star"://true)
                groupComplexity = computeTimeComplexityStar(false);
                break;
            case "future"://true)
                groupComplexity = computeTimeComplexityFuture(false);
                break;
            default:
                groupComplexity = computeTimeComplexity(true);
                break;
        }
        return "TimeComplexity = 2^{"+numGroups+"} * 2^{"+new DecimalFormat("0.00").format(groupComplexity)+"} = 2^{"+new DecimalFormat("0.00").format(numGroups+groupComplexity)+"}";        
    }
    
    
    /**
     * Retorna a versão formatada em String da complexidade de Dados do ataque.
     * @return .
     */
    private String toStringDataComplexity(){
        return "DataComplexity = 2^{"+computeDataComplexity()+"}";        
    }
    
    public List<RelatedKeyDifferential> getDeltas(){
        return deltaDifferentials;
    }
    
    public List<RelatedKeyDifferential> getNablas(){
        return nablaDifferentials;
    }
    
    public RelatedKeyDifferential getRecomputation(){
        return affectV;
    }
    
    /**
     * Printa todas as informações sobre este ataque.
     */
    public void printAll(){
        System.out.println(toStringPrintAll());        
    }
    
    /**
     * Retorna todas as informações sobre este ataque como uma String.
     * 
     * @return 
     */
    public String toStringPrintAll(){
        String result = "";
        result += ("begin biclique{")+"\n";
        
        result += ("deltas{")+"\n";
        for (RelatedKeyDifferential keyDiff : deltaDifferentials) {
            result += ("Subkey #" + keyDiff.getKeyIndex())+"\n";
            result += ("Key Difference :\n"+keyDiff.getKeyDifference()+"\n\n");
            result += ("Full differential :\n"+keyDiff);
        }
        result += ("\n"+"}"+"\n");
        
        result += ("nablas{")+"\n";
        for (RelatedKeyDifferential keyDiff : nablaDifferentials) {
            result += ("Subkey #" + keyDiff.getKeyIndex())+"\n";
            result += ("Key Difference :\n"+keyDiff.getKeyDifference()+"\n\n");
            result += ("Full differential :\n"+keyDiff);
        }
        result += "\n"+("}")+"\n";
        
        result += ("Recomputation :\n"+affectV)+"\n";
        result += ("A total of "+onlyRelevantV().get(2)+" Sboxes need to be recomputed (out of "+cipher1.getNUM_SBOXES_TOTAL()+")")+"\n";
        
        result += ("Biclique spans from internal state: #"+fromState+" till state #"+toState)+"\n";
        result += ("Is independent : "+checkIndependence())+"\n";
        
        result += ("time complexity : " + toStringTimeComplexity("future"))+"\n";
        result += ("data complexity : " + toStringDataComplexity())+"\n";
        
        result += ("}end biclique")+"\n";
        return result;
        
    }

    @Override
    public boolean equals(Object object) {
        try {
            Biclique other = (Biclique)object;

            if (other == null) {
                return false;
            } else {
                return  deltaDifferentials.equals(other.deltaDifferentials)
                        && nablaDifferentials.equals(other.nablaDifferentials);
            }
        } catch (Exception e) {
            return false;
        }
    }	

    /**
     * Retorna verdadeiro se esta Biclique é baseada em estrelas.
     */
    private boolean isEstrela() {
        return deltaDifferentials.isEmpty() || nablaDifferentials.isEmpty();
    }

    /**
     * Retorna verdadeiro se esta Biclique é balanceada.
     */
    private boolean isBalanced() {
        return deltaDifferentials.size() == nablaDifferentials.size();
    }
    /**
     * Retorna verdadeiro se esta Biclique é balanceada.
     */
    private boolean isUnbalanced() {
        return !isEstrela() && deltaDifferentials.size() != nablaDifferentials.size();
    }

    /**
     * Retorna verdadeiro se a biclique é construída no ínicio da cifra.
     */
    private boolean isInicio() {
        return fromState == 0;
    }
    

    /**
     * Retorna verdadeiro se a biclique é construída no final da cifra.
     */
    private boolean isFinal() {
        return toState == cipher1.getNUM_STATES() - 1;
    }


    /**
     * Retorna verdadeiro somente se as RelatedKeyDifferential's
     * <code>diff1</code> e <code>diff2</code> são independentes entre os
     * estados <code>fromState</code> e <code>toState</code>.
     */
    private boolean isIndependentThroughStates(RelatedKeyDifferential diff1, RelatedKeyDifferential diff2, int fromState, int toState) {
        int result = 0;
        List<Integer>   keys = new ArrayList<>(),
                        states = Util.toIntegerList(cipher1.getINDEXES_OF_PRE_SBOX_STATES());
        
        // state independence (all states, not only Sbox related ones)
        for (int state = fromState; state < toState; state++) 
//            if(states.contains(state)) // Provavelmente é suficiente para garantir independência
                for (int word : cipher1.getSBOX_RELEVANT_STATE_WORDS()) 
                    if(diff1.getStateDifference(state).getWord(cipher1.getWORD_SIZE(),word) != 0 &&
                       diff2.getStateDifference(state).getWord(cipher1.getWORD_SIZE(),word) != 0)
                        return false;
        // get the relevant keys
        for (int i = 0; i < cipher1.getAMOUNT_OF_KEYS(); i++) 
            if( cipher1.getINDEX_OF_STATE_POST_KEY(i) > fromState &
                cipher1.getINDEX_OF_STATE_POST_KEY(i) <= toState)
                keys.add(i);
        // key independence (all states, not only Sbox related ones)
        for (int key : keys) 
            for (int word : cipher1.getSBOX_RELEVANT_KEY_WORDS()) 
                if( diff1.getKeyDifference(key).getWord(cipher1.getWORD_SIZE(), word) != 0 &&
                    diff2.getKeyDifference(key).getWord(cipher1.getWORD_SIZE(), word) != 0)
                    return false;
        
        return true;
    }

    /**
     * Altera o atributo <code>affectV</code> de forma a prepará-lo para o tipo
     * de ataque dado pelo construtor.
     */
    private void prepareRecomputation() {
        boolean aux;
        
        if(!isEstrela()){
            if(isFinal()){
                // Pi1,i2,...  -> v 
                for (int i = 0; i < stateOfV; i++) {
                    for (RelatedKeyDifferential nabla : nablaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    nabla.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                        if(cipher1.getINDEX_OF_POST_KEY(i) != -1){
                            
                            for (RelatedKeyDifferential delta : deltaDifferentials){
                                for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                                     aux =   affectV.getStateDifference(i)
                                                  .getWord(cipher1.getWORD_SIZE(), j) != 0 
                                             &&
                                             delta.getKeyDifference(cipher1.getINDEX_OF_POST_KEY(i))
                                                  .getWord(cipher1.getWORD_SIZE(), j) != 0
                                             &&
                                             nabla.getKeyDifference(cipher1.getINDEX_OF_POST_KEY(i))
                                                  .getWord(cipher1.getWORD_SIZE(), j) != 0;
                                     affectV.getKeyDifference(cipher1.getINDEX_OF_POST_KEY(i))
                                            .setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                                } 
                            }
                        }
                    }
                }
                // v <- Sj1,j2,...
                for (int i = stateOfV + 1; i < stateOfBiclique; i++) {
                    for (RelatedKeyDifferential delta : deltaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    delta.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                        if(cipher1.getINDEX_OF_PRE_KEY(i) != -1){
                            for (RelatedKeyDifferential nabla : nablaDifferentials){
                                for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                                    aux =   affectV.getStateDifference(i)
                                                 .getWord(cipher1.getWORD_SIZE(), j) != 0 
                                            &&
                                            delta.getKeyDifference(cipher1.getINDEX_OF_PRE_KEY(i))
                                                 .getWord(cipher1.getWORD_SIZE(), j) != 0
                                            &&
                                            nabla.getKeyDifference(cipher1.getINDEX_OF_PRE_KEY(i))
                                                 .getWord(cipher1.getWORD_SIZE(), j) != 0;
                                    affectV.getKeyDifference(cipher1.getINDEX_OF_PRE_KEY(i))
                                           .setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                                } 
                            }
                        }
                    }
                }
            }
            if(isInicio()){throw new UnsupportedOperationException("Not implemented bicliques in the beginning");}
            else{
                // 0 -> lim <- fromState -- biclique -- toState -> lim2 <- END
                int lim = stateOfV < fromState ? stateOfV : fromState;
                int lim2 = stateOfV < fromState ? cipher1.getNUM_STATES()-1 : stateOfV;
                
                for (int i = 0; i < lim; i++) {
                    for (RelatedKeyDifferential delta : deltaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    delta.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                    }
                }
                for (int i = lim; i < fromState; i++) {
                    for (RelatedKeyDifferential nabla : nablaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    nabla.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                    }
                }
                for (int i = toState; i < lim2; i++) {
                    for (RelatedKeyDifferential nabla : nablaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    nabla.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                    }
                }
                for (int i = lim2; i < cipher1.getNUM_STATES()-1; i++) {
                    for (RelatedKeyDifferential delta : deltaDifferentials) {
                        for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                            aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                                    delta.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                            affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                        }
                    }
                }
                
            }
        }else if(isInicio()){// em estrelas um delta aje como nabla na recomputação
            RelatedKeyDifferential nabla, delta;
            delta = deltaDifferentials.get(0);
            nabla = deltaDifferentials.get(1);
            
            // Pi1,i2,...  -> v 
            for (int i = 0; i < stateOfV; i++) {
                for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                    aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                            nabla.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                            delta.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                    affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                }
            }
            // v <- Sj1,j2,...
            for (int i = stateOfV + 1; i < cipher1.getNUM_STATES(); i++) {
                for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) {
                    aux =   affectV.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                            delta.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0 &&
                            nabla.getStateDifference(i).getWord(cipher1.getWORD_SIZE(), j) != 0;
                    affectV.getStateDifference(i).setWord(cipher1.getWORD_SIZE(),j, aux ? 0xaa : 0);
                }
            }
            
        }
        //Biclique
        int toState = isFinal() ? this.toState + 1: this.toState;
        for (int i = fromState; i < toState; i++) {
            
            for (int j = 0; j < cipher1.getBLOCK_SIZE_IN_WORDS(); j++) 
                affectV.getStateDifference(i)
                       .setWord(cipher1.getWORD_SIZE(),j, 0);
            
            if(cipher1.getINDEX_OF_PRE_KEY(i) != -1){
                for (int j = 0; j < cipher1.getKEY_SIZE_IN_WORDS(); j++) 
                    affectV.getKeyDifference(cipher1.getINDEX_OF_PRE_KEY(i))
                           .setWord(cipher1.getWORD_SIZE(),j, 0);
            }
        }
    }
    
    /** 
     * Método que cria uma List de Biclique's a partir de uma String
     * <code>s</code> de resutados da busca por bicliques. Além disso, deve-se 
     * conhecer a definição da variável v utilizada na busca.
     * @param s .
     * @param stateOfV .
     * @param wordsOfV .
     * @return .
     */
    public static List<Biclique> stringToBicliqueAES(String s, 
                                                     int stateOfV, 
                                                     List<Integer> wordsOfV){
        List<Biclique> result = new ArrayList<>();
        List<RelatedKeyDifferential> differentials;
        ByteArray keyDifference;
        int keyIndex, DELTA = -5, NABLA = -6, i, amountBicliques, 
                                                              contBicliques = 0;
        String temp, state, diff;
        String[] splitedDiff, aux;
        
        aux = s.split("\n");
        amountBicliques = 0;
        for (String str : aux)
            if(str.equals("Biclique{")) amountBicliques++;
        
//        System.out.println(Arrays.toString(aux));
        
        i = 0;
        while(i < aux.length) {
            System.out.print("\rCurrent Biclique : "+contBicliques+"/"
                                                          +(amountBicliques-1));
            differentials = new ArrayList<>();
            i++;//Linha inicial passou
            
            if (aux[i++].trim().equals("deltas :")) {
                state = "DELTA";
            }else {
                state = "NABLA";
            }
            
            while(!aux[i].trim().equals("")){
//                System.out.println("begining : "+aux[j].trim());
                keyIndex = Integer.parseInt(aux[i++].split(" ")[2]);
//                System.out.println("keyIndex : "+keyIndex);
                diff = aux[i++].split(" ")[2];
                diff = diff.substring(1, diff.length()-1);
                splitedDiff = diff.replace("|", ",").split(",");
                
                keyDifference = new ByteArray(new Rijndael().getBLOCK_SIZE_IN_BYTES()
                                                                              );
                for (int j = 0; j < splitedDiff.length; j++) 
                    if (!splitedDiff[j].equals("00")) 
                        keyDifference.set(j, 0xff);
                    
                
//                System.out.println("diff : " + Arrays.toString(splitedDiff));
//                System.out.println(state+" diff : "+new RelatedKeyDifferential(29, new Rijndael().getNUM_STATES()-1,  keyDifference, keyIndex, new Rijndael(), new Rijndael(), state).getKeyDifference(keyIndex));
                differentials.add(new RelatedKeyDifferential( 29, 
                                                    new Rijndael().getNUM_STATES()-1, 
                                                    keyDifference,
                                                    keyIndex,
                                                    new Rijndael(),
                                                    new Rijndael(),
                                                    state)
                );
            }
            i++;
            
            if (aux[i++].trim().equals("deltas :")) {
                state = "DELTA";
            }else {
                state = "NABLA";
            }
            
            while(!aux[i].trim().equals("")){
//                System.out.println("begining : "+aux[j].trim());
                keyIndex = Integer.parseInt(aux[i++].split(" ")[2]);
//                System.out.println("keyIndex : "+keyIndex);
                diff = aux[i++].split(" ")[2];
                diff = diff.substring(1, diff.length()-1);
                splitedDiff = diff.replace("|", ",").split(",");
                
                keyDifference = new ByteArray(new Rijndael().getBLOCK_SIZE_IN_BYTES());
                for (int j = 0; j < splitedDiff.length; j++) 
                    if (!splitedDiff[j].equals("00")) 
                        keyDifference.set(j, 0xff);
                    
                
//                System.out.println(state+" diff : "+new RelatedKeyDifferential(0, keyDifference, keyIndex, new Rijndael(), new Rijndael(), state).getKeyDifference(keyIndex));
                differentials.add(new RelatedKeyDifferential(29, new Rijndael().getNUM_STATES()-1, keyDifference, keyIndex, new Rijndael(), new Rijndael(), state));
            }
            i++;
            //Complexidade de Tempo
            temp = aux[i].split(" ")[aux[i++].split(" ").length-1].replace(",", ".");
//            System.out.println("time complexity : "+Double.parseDouble(temp.substring(3, temp.length()-1)));
            //Complexidade de Dados
            temp = aux[i].split(" ")[aux[i++].split(" ").length-1].replace(",", ".");
//            System.out.println("data complexity : "+Integer.parseInt(temp.substring(3, temp.length()-1)));
            result.add(new Biclique(differentials, stateOfV, wordsOfV));
            contBicliques++;
        }
        System.out.println("");
        return result;
    }
    
    @Override
    public String toString() {
        String result = "Biclique{\n\tdeltas :\n\t";
        for (RelatedKeyDifferential delta : deltaDifferentials) {
            result += "key : " + delta.getKeyIndex();
            for (int i = 1; i < cipher1.getAMOUNT_OF_KEYS(); i++) {
                result += ", " + (delta.getKeyIndex()+i);
            }
            result += "\n\tkeyDiff : " + delta.getKeyDifference() + "\n\t";
        }
        result += "\n\tnablas :\n\t";
        for (RelatedKeyDifferential nabla : nablaDifferentials) {
            result += "key : " + nabla.getKeyIndex();
            for (int i = 1; i < cipher1.getAMOUNT_OF_KEYS(); i++) {
                result += ", " + (nabla.getKeyIndex()+i);
            }
                    
            result += "\n\tkeyDiff : " + nabla.getKeyDifference() + "\n\t";
        }
        result += "\n\ttime complexity : " + toStringTimeComplexity("future");
        result += "\n\tdata complexity : " + toStringDataComplexity();
        result += "\n\tTotal #Sboxes : " + onlyRelevantV().get(2);
        return result + "\n}";
    }

    public Cipher getCipher() {
        return cipher1;
    }

    public int getFromState() {
        return fromState;
    }

    public int getToState() {
        return toState;
    }

    
    /**
     * Retorna o custo total de tempo do ataque, de acordo com o método para
     * bicliques na cifra future. DEVE SER ALTERADO PARA NÃO DEPENDER DE ALTERAÇÃO
     * MANUAL.
     * 
     * @param debug quando verdadeira, printa informações sobre o cálculo de
     * complexidade de tempo.
     * @return .
     */ 
    private double computeTimeComplexityFuture(boolean debug) {
        double Cfirst, Cprecomp, Crecomp, Cfalpos;
        Cfirst =  computeCFirstBicliqueFuture();
        Cprecomp =  computeCPrecompFuture();
        Crecomp =   computeCRecompFuture();
        Cfalpos =   computeCFalposFuture(); 

        if(debug){
            System.out.println("Cfirst : "+ Util.log2(computeCFirstBicliqueFuture()));
            System.out.println("Cprecomp : "+ Util.log2(computeCPrecompFuture()));
            System.out.println("Crecomp : "+ Util.log2(computeCRecompFuture()));
            System.out.println("Cfalpos : "+ Util.log2(computeCFalposFuture()));
        }

        return Math.log(Cfirst+Cprecomp + Crecomp + Cfalpos)/Math.log(2);
    }

    private double computeCFirstBicliqueFuture() {
        int numSboxes = 0;
        int auxPreSbox[] = cipher1.getINDEXES_OF_PRE_SBOX_STATES();
        Arrays.sort(auxPreSbox);
        int auxPostSbox[] = cipher1.getINDEXES_OF_POST_SBOX_STATES();
        Arrays.sort(auxPostSbox);
        
        for (RelatedKeyDifferential rkd : deltaDifferentials) {
            for (int i = fromState; i <= toState; i++) {
                if(Arrays.binarySearch(auxPreSbox,i) >= 0){
                    numSboxes += rkd
                                .getStateDifference(i)
                                .countNumActiveWords(cipher1.getWORD_SIZE());
                }
            }
        }
        
        for (RelatedKeyDifferential rkd : nablaDifferentials) {
            for (int i = fromState; i <= toState; i++) {
                if(Arrays.binarySearch(auxPostSbox,i) >= 0){
                    numSboxes += rkd
                                .getStateDifference(i)
                                .countNumActiveWords(cipher1.getWORD_SIZE());
                    
                }
            }
        }
        double percentStates = (double)(toState+1-fromState)/cipher1.getNUM_STATES();
        double percentSboxes = (double)numSboxes/160;
        double numberOfTimes = (Math.pow(2, 4)-1);
//        System.out.println("computeCFirstBicliqueFuture");
//        System.out.println("#Sboxes Biclique is "+numSboxes);
//        System.out.println("#Sboxes Biclique is "+numSboxes);
//        System.out.println("percentSboxes : "+ percentSboxes);
//        System.out.println("percentStates : "+ percentStates);
        return numberOfTimes*(percentSboxes) + percentStates;
    }

    private double computeCPrecompFuture() {
        int state;
        if(isEstrela()) state = cipher1.getNUM_STATES() - toState;
        else state = fromState;
//        System.out.println("computeCPrecompFuture : "+(Math.pow(2, 4)*(double)(state)/cipher1.getNUM_STATES()));
//        System.out.println("percentStates : " + (double)(state)/cipher1.getNUM_STATES());
        return Math.pow(2, 4)*((double)(state)/cipher1.getNUM_STATES());
    }

    private double computeCRecompFuture() {
        double base = (Math.pow(2, 8)-Math.pow(2, 4));
        double percentSboxes = (double)(onlyRelevantV().get(2))/cipher1.getNUM_SBOXES_TOTAL();
//        System.out.println("----computeCRecompFuture : "+(base*percentSboxes));
//        System.out.println("base : "+base);
//        System.out.println("percentSboxes : "+percentSboxes);
//        System.out.println("----computeCRecompFuture : "+(base*percentSboxes));
        return base*percentSboxes;
    }

    /**
     * Retorna a potência do custo de tempo de retestar os candidatos à chave,
     * de acordo com o método original.
     * @return .
     */    
    private double computeCFalposFuture(){
        
        if(deltaDifferentials.size()+nablaDifferentials.size() < sizeOfV) return 0;
        int numSboxes = 0;
        int auxPreSbox[] = cipher1.getINDEXES_OF_PRE_SBOX_STATES();
        Arrays.sort(auxPreSbox);
        int auxPostSbox[] = cipher1.getINDEXES_OF_POST_SBOX_STATES();
        Arrays.sort(auxPostSbox);
        
        for (RelatedKeyDifferential rkd : deltaDifferentials) {
            for (int i = stateOfV; i <= fromState; i++) {
                if(Arrays.binarySearch(auxPostSbox,i) >= 0){
                    numSboxes += rkd
                                .getStateDifference(i)
                                .countNumActiveWords(cipher1.getWORD_SIZE());
                }
            }
        }
        List<RelatedKeyDifferential> aux;
        if(nablaDifferentials.isEmpty()) aux = deltaDifferentials;
        else aux = nablaDifferentials;
        for (RelatedKeyDifferential rkd : aux) {
            for (int i = 0; i <= stateOfV; i++) {
                if(Arrays.binarySearch(auxPreSbox,i) >= 0){
                    numSboxes += rkd
                                .getStateDifference(i)
                                .countNumActiveWords(cipher1.getWORD_SIZE());
                    
                }
            }
        }
        double percentSboxes = (double)numSboxes/cipher1.getNUM_SBOXES_TOTAL();
        double amountWords = Math.pow(2,(deltaDifferentials.size()+nablaDifferentials.size() - sizeOfV)*cipher1.getWORD_SIZE());

//        System.out.println("----computeCFalposFuture----");
//        System.out.println("percentSboxes : "+percentSboxes);
//        System.out.println("numSboxes : "+numSboxes);
//        System.out.println("amountWords : "+amountWords);
//        System.out.println("----computeCFalposFuture----");
        
        return amountWords*percentSboxes;
        
    }
}
