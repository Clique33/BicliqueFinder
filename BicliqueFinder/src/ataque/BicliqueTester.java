/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ataque;

import util.Range;
import cifras.Rijndael;
import cifras.Cipher;
import biclique.Biclique;
import util.ByteArray;
import biclique.RelatedKeyDifferential;
import cifras.Serpent;
import util.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe que tem por objetivo encontrar todas as Biclique's independentes
 * dentre todas as possibilidades dadas pela lista de diferenciais de chave
 * (dada por <code>relevantWords</code>), pelas Range's que restringem as
 * diferenciais a serem testadas (dadas por <code>ranges</code>), os índices das
 * diferenças de chave iniciais (dados por <code>keyIndexes</code>) e a
 * definição da variável v (entre outros detalhes).
 *
 * @author Frog33
 */
public class BicliqueTester implements Runnable{
    
    /**
     * Método de testes da classe.
     * @param args .
     */
    public static void main(String[] args) throws Exception{
        
//        testeBiclique(new Serpent());
        testeBicliqueAES();
    }

    private static void testeBiclique(Cipher c) {
        ByteArray diferencaDelta = ByteArray.toByteArray(
                "[00,00,00,F0|00,00,00,00|00,00,00,00|00,00,00,00]");
        RelatedKeyDifferential delta = new RelatedKeyDifferential(91,
                                                                  96, 
                                                                  diferencaDelta,
                                                                  31, 
                                                                  new Serpent(),
                                                                  new Serpent(),
                                                                  "DELTA");
        
        ByteArray diferencaNabla = ByteArray.toByteArray(
                "[00,00,00,00|00,0F,00,00|00,00,00,00|00,00,00,00]");
        RelatedKeyDifferential nabla = new RelatedKeyDifferential(91,
                                                                  96, 
                                                                  diferencaNabla,
                                                                  18, 
                                                                  new Serpent(),
                                                                  new Serpent(),
                                                                  "NABLA");
        
        Biclique biclique = new Biclique(Util.concat(delta, nabla), 
                                        75, 
                                        Util.toIntegerList(31));
        System.out.println(biclique);
    }
    
    
    private static void testeBicliqueAES(){
//        Cipher cipher1 = new Rijndael();
//        Cipher cipher2 = new Rijndael();
//        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
//        keyDiff.set(4, 0xff);
//        keyDiff.set(6, 0xff);
//        RelatedKeyDifferential c = new RelatedKeyDifferential(0, keyDiff, 8, cipher1, cipher2, "nabla");
//
//        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
//        keyDiff.set(0, 0xff);
//        keyDiff.set(2, 0xff);
//        RelatedKeyDifferential c2 = new RelatedKeyDifferential(0, keyDiff, 8, cipher1, cipher2, "nabla");
//
//        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
//        keyDiff.set(9, 0xff);
//        RelatedKeyDifferential c3 = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 8, cipher1, cipher2, "delta");
//        
//        List<List<RelatedKeyDifferential>> diffs = new ArrayList<>();
//        diffs.add(Util.concat(Util.concat(c, c2),c3));
//        BicliqueTester bt = new BicliqueTester(diffs, 9, Util.toIntegerList(0));
//        bt.run();
//        System.out.println(bt.independentBicliques);

        Cipher cipher = new Rijndael();
        int keyIndexes[] = {8,8,8};
        List<Integer> wordsOfV = Util.toIntegerList(0);
        int stateOfV = 9;
        Range ranges[] = {new Range(39, 40), new Range(10, 20), new Range(9, 10)};
        String types[] = {"nabla", "nabla", "delta"};
        List<int[]> relevantWords = Util.allWords(cipher);
        relevantWords.addAll(Util.allPairsOfColumns(cipher));
        BicliqueTester bt = new BicliqueTester( relevantWords, 29, 0, 
                                                keyIndexes, 
                                                ranges,
                                                types,
                                                new Rijndael().getClass(),
                                                stateOfV,
                                                wordsOfV);
        bt.run();
        for (int i = 0; i < bt.independentBicliques.size(); i++) {
            System.out.println(bt.independentBicliques.get(i));
            System.out.println(bt.independentBicliques.get(i).computeTimeComplexity(false));
            System.out.println(bt.independentBicliques.get(i).computeDataComplexityFast());
        }
    }
    /**
     * Estado onde a variável v é definida.
     */
    private int stateOfV;
    /**
     * Palavras do estado que pertencem à variável v.
     */
    private List<Integer> wordsOfV;
    /**
     * Classe que representa a Cifra em questão.
     */
    private Class<Cipher> classe;
    /**
     * List com todas as possibilidades de palavras ativas para a cifra em
     * questão. No caso de Rijndael são 40 possibilidades.
     */
    private List<int[]> relevantWords;
    /**
     * Vetor de índices de chaves para cada RelatedKeyDifferential pertencente a
     * cada posição de <code>differentials</code>.
     */
    private int keyIndexes[];
    /**
     * Vetor de Range's que representam quais palavras de
     * <code>relevantWords</code>.serão usadas para gerar cada
     * RelatedKeyDifferential pertencente a cada posição de
     * <code>differentials</code>.
     */
    private Range ranges[];
    /**
     * Vetor de tipos que representam quais os tipos de cada
     * RelatedKeyDifferential pertencente a cada posição de
     * <code>differentials</code>.
     */
    private String types[];
    /**
     * List de List's de RelatedKeyDifferential's, onde cada posição representa
     * as RelatedKeyDifferential's de uma biclique específica. É construída pelo
     * método <code>createDifferentials</code>.
     */
    private List<List<RelatedKeyDifferential>> differentials;
    /**
     * List contendo apenas as Bicliques independentes encontradas a partir das
     * possíveis List's de RelatedKeyDifferentia's geradas por 
     * <code>createDifferentials</code>. É construída pelo método <code>run</code>.
     */
    private List<Biclique> independentBicliques;
    
    /**
     * FromState utilizado por todos os deltas;
     */
    private int fromStateDelta;
    /**
     * FromState utilizado por todos os deltas;
     */
    private int toState;
    /**
     * FromState utilizado por todos os nablas;
     */
    private int fromStateNabla;
    
    /**
     * Construtor utilizado na criação de bicliques para
     * RelatedKeyDifferential's obtidas a partir de uma List que indica as
     * palavras relevantes para as diferenciais.
     * 
     * @param relevantWords List de palavras relevantes para a busca por
     * bicliques.
     * @param fromStateDelta the value of fromStateDelta
     * @param endBiclique
     * @param keyIndexes vetor de índices dos conjuntos geradores de cada
 RelatedKeyDifferential.
     * @param ranges vetor de Range's que representam as bicliques que serão 
 buscadas pelo programa para cada RelatedKeyDifferential.
     * @param types vetor de tipos das RelatedKeyDifferential's (DELTA ou NABLA)
     * @param classe classe que representa a cifra (atualmente Rijndael ou
 OldSerpent)
     * @param stateOfV Índice do estado à qual v pertence
     * @param wordsOfV List de índices das palavras pertencentes a v
     * @exception RuntimeException se os comprimentos de
     * <code>keyIndexes</code>, <code>ranges</code> e <code>types</code> não 
     * forem iguais.
     */    
    public BicliqueTester(  
            List<int[]> relevantWords, 
            int fromStateDelta, 
            int endBiclique, 
            int[] keyIndexes, 
            Range[] ranges, 
            String[] types, 
            Class classe, 
            int stateOfV, 
            List<Integer> wordsOfV
    ){
        
        if(keyIndexes.length != types.length || keyIndexes.length != ranges.length)
            throw new RuntimeException("As quantidade de índices de chave, "
                                         + "tipos e Range's devem ser iguais.");
        
        this.differentials = new ArrayList<>();     
        this.classe = classe;
        this.stateOfV = stateOfV;
        this.wordsOfV = new ArrayList<>();
        this.wordsOfV.addAll(wordsOfV);
        this.relevantWords = relevantWords; 
        this.fromStateDelta = fromStateDelta;
        this.fromStateNabla = 0;
        this.toState = endBiclique;
        this.keyIndexes = Arrays.copyOf(keyIndexes,keyIndexes.length);
        this.ranges = Arrays.copyOf(ranges,ranges.length);
        this.types = Arrays.copyOf(types,types.length);
        System.out.println("new BicliqueTester(");
        System.out.println("\t classe : "+this.classe);
        System.out.println("\t stateOfV : "+this.stateOfV);
        System.out.println("\t wordsOfV : "+this.wordsOfV);
        System.out.println("\t relevantWords : [too big]");
        System.out.println("\t keyIndexes : "+Arrays.toString(this.keyIndexes));
        System.out.println("\t ranges : "+Arrays.toString(this.ranges));
        System.out.println("\t types : "+Arrays.toString(this.types));
        System.out.println(");");
        independentBicliques = new LinkedList<>();
    }
    
    /**
     * Método usado para controle do vetor de contadores, onde cada posição i do
     * vetor representa o valor atual dentro da Range i no perdorrer delas.
     * Funciona como o incremento em uma notação posicional numérica, apenas o 
     * índice menos significativo é incrementado, caso atinja o limite, ele 
     * volta para o zero e o próximo é incrementado e assim por diante.
     * 
     * Exemplo. (Ranges 1...3 e 0..2)
     * 
     * counters[0] = 1;counters[1] = 0;
     * updateCounters(counters);
     * //counters = {1,1}
     * updateCounters(counters);
     * //counters = {2,0}
     * updateCounters(counters);
     * //counters = {2,1}
     * 
     */
    private void updateCounters(int counters[]){
        for (int i = counters.length-1; i >=0; i--) {
            if (counters[i] != ranges[i].end - 1){
                counters[i]++;
                break;
            }else counters[i] = ranges[i].begin;
        }
    }
    
    /**
     * Caso todos os contadores estejam no seu valor inicial, então todos os 
     * possíveis valores foram percorridos e a busca terminou.
     */
    private boolean isDone(int counters[]){
        for (int i = 0; i < counters.length; i++) 
            if(counters[i] != ranges[i].begin) return false;
        return true;        
    }
    
    /**
     * POR ALGUM MOTIVO OS FROMSTATE'S ESTÃO HARDCODED
     * 
     * Cria o atributo <code>differentials</code> a partir dos valores dos
     * atributos <code>keyIndexes</code>, <code>ranges</code>,
     * <code>types</code> e <code>relevantWords</code>.
     * @throws java.lang.InstantiationException pode ser lançada na criação de
     * nova instância para uma subclasse de Cipher.
     * @throws java.lang.IllegalAccessException pode ser lançada na criação de
     * nova instância para uma subclasse de Cipher
     */
    private void createDifferentials() throws InstantiationException,
                                               IllegalAccessException{
        
        Cipher cipher = classe.newInstance();
        int mask, counters[] = new int[ranges.length], total = 0;
        ByteArray keyDifference;
        List<RelatedKeyDifferential> aux;
        int progress = 0;
        double percentage = Range.sum(ranges)/(double)100;
        System.out.print("\nBuilding Differentials...\nProgress : " + 0 + "%");
        
        long initialTime = System.currentTimeMillis();
        for (int i = 0; i < counters.length; i++) 
            counters[i] = ranges[i].begin;
        
        
        while(true){
//            System.out.println("Execution number " + total);
            aux = new ArrayList<>();
            for (int i = 0; i < counters.length; i++) {
                keyDifference = new ByteArray(cipher.getKEY_SIZE_IN_BYTES()*cipher.getAMOUNT_OF_KEYS());
                for (Integer j : relevantWords.get(counters[i])) {
                    mask = (1<<cipher.getWORD_SIZE()) - 1;
                    keyDifference.setWord(cipher.getWORD_SIZE(), j, mask);
                }
//                System.out.println((i+1)+"° key diff : " + keyDifference);
                if(types[i].toLowerCase().equals("nabla"))
                    aux.add(new RelatedKeyDifferential( fromStateNabla,
                                                        cipher.getNUM_STATES()-1,
                                                        keyDifference,
                                                        keyIndexes[i],
                                                        classe.newInstance(),
                                                        classe.newInstance(),
                                                        types[i]));
                else//delta
                    aux.add(new RelatedKeyDifferential( fromStateDelta, 
                                                        toState,
                                                        keyDifference,
                                                        keyIndexes[i],
                                                        classe.newInstance(),
                                                        classe.newInstance(),
                                                        types[i]));
            }
            differentials.add(aux);
            
            updateCounters(counters);
            total++;
            if (total%percentage == 0) {
                progress++;
                System.out.print("\rProgress : " + progress + "%");
            }
            if (isDone(counters)) break;
        }
        long elapsedTime[] = Util.msToTime(System.currentTimeMillis() - initialTime);
        System.out.print("\rProgress : " + 100 + "%\n");
        System.out.println("Total time : " + elapsedTime[0] + "h " + elapsedTime[1] 
                + "m " + elapsedTime[2] + "s " + elapsedTime[3] + "ms.");
    }
    
    /**
     * Método que busca as bicliques independentes, podendo ser paralelizado em 
     * threads.
     */
    @Override
    public void run() {
        if (ranges != null) {
            try {
                createDifferentials();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Biclique biclique;
        int cont = 0, progress = 0;
        double percentage = Range.sum(ranges)/(double)100;
        System.out.print("\nTesting Bicliques\nProgress : " + 0 + "%");
        
        long initialTime = System.currentTimeMillis();
        for (List<RelatedKeyDifferential> curr : differentials) {
//            System.out.print("\nnew Biclique {");
//            for (RelatedKeyDifferential rkd : curr) {
//                System.out.println("new RelatedKeyDifferential(");
//                System.out.println("\t fromstate : "+rkd.getFromState());
//                System.out.println("\t tostate : "+rkd.getToState());
//                System.out.println("\t keydifference : "+rkd.getKeyDifference());
//                System.out.println("\t keyIndex : "+rkd.getKeyIndex());
//                System.out.println("\t cipher1 : "+rkd.getCiphers()[0]);
//                System.out.println("\t cipher2 : "+rkd.getCiphers()[1]);
//                System.out.println("\t type : "+rkd.getType());
//                System.out.println(");");
//            }
//            System.out.print("\n};");
            biclique = new Biclique(curr, stateOfV, wordsOfV);
            if(biclique.checkIndependence()){
                independentBicliques.add(biclique);
//                biclique.printAll();
            }
            cont++;
            if (cont%percentage == 0) {
                progress++;
                System.out.print("\rProgress : " + progress + "%");
            }
        }
        long elapsedTime[] = Util.msToTime(System.currentTimeMillis() - initialTime);
        System.out.print("\rProgress : " + 100 + "%\n");
        System.out.println("Total time : " + elapsedTime[0] + "h " + elapsedTime[1] 
                + "m " + elapsedTime[2] + "s " + elapsedTime[3] + "ms.");
        System.out.println(cont + " bicliques tested.");
        
        sortIndependent();
        save();
    }
    
    /**
     * Método que ordena as bicliques independentes encontradas pela mais
     * rápida.
     */
    private void sortIndependent(){
        independentBicliques.sort((Biclique b1, Biclique b2) -> {
            if(Math.abs(b1.computeTimeComplexity(false) - b2.computeTimeComplexity(false)) < 0.001){
                if(b1.computeDataComplexityFast() > b2.computeDataComplexityFast()) return 1;
                if(b1.computeDataComplexityFast() < b2.computeDataComplexityFast()) return -1;
            }
            if(b1.computeTimeComplexity(false) > b2.computeTimeComplexity(false)) return 1;
            if(b1.computeTimeComplexity(false) < b2.computeTimeComplexity(false)) return -1;
            return 0;
        });
    }
    
    /**
     * Método que salva em arquivo as informações das bicliques independentes 
     * encontradas.
     */
    private void save(){
        if (independentBicliques.isEmpty()){
            System.out.println("FAILURE : found no independent bicliques");
            return;
        }
        System.out.println("SUCCESS : found "+independentBicliques.size()
                            + " independent bicliques!");
        System.out.println("The best found is");
        System.out.println(independentBicliques.get(0));
        String filename = "";
        
        for (int i = 0; i < ranges.length; i++) 
            filename += (i+1)+"°keyIndex_"+keyIndexes[i]+"-"+(i+1)+"°range_"+ranges[i].begin+"_"+ranges[i].end+" ";
        filename += ".txt";
        
        try(PrintWriter pw = new PrintWriter(new File(filename))){
            for (int i = 0; i < independentBicliques.size(); i++) 
                pw.println(independentBicliques.get(i));
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado?");
        }
    }
}
