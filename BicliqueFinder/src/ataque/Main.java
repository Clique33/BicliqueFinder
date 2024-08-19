/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ataque;

import util.Range;
import cifras.Cipher;
import biclique.Biclique;
import cifras.Future;
import cifras.Rijndael;
import cifras.Serpent;
import util.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Frog33
 */
public class Main {
    static String ciphers[] = {"rijndael", "future", "serpent"};
    /**
     * Método principal do programa, capaz de encontrar bicliques para a cifra
     * em questão a partir dos argumentos da linha de comando, através do método
     * <code>attack</code>, ou compilar os resultados de ataques anteriores,
     * através do método <code>unifyFiles</code>.
     * @param args .
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
//        System.out.println(Util.allCombinationsOfWords(new Future(), 2, true).size());
        for (int i = 0; i  < 2; i++) {
            for (int j = 0; j < 2; j++) {
                attack(
                        Util.concat(
                                new String[]{
                                        "-cipher","future",
                                        "-types","delta,delta",
                                        "-ki",i+","+j,
                                        "-begin","0",
                                        "-end","10",
                                        "-nt","1",
                                        "-v",""+new Future().getINDEX_OF_STATE_POST_KEY(5),"3",
                                        "-ranges","0:32;0:32"
                                },
                                args
                        )
                );
            }
        }
//        unifyFiles(9, Util.toIntegerList(0));
   }
    
    /**
     * Método que compila os resultados de buscas anteriores por bicliques,
     * salvas no diretório raiz. Para tal, ele percorre todos os arquivos do
     * diretório em busca dos que contém resultados válidos, inclusive os que se
     * encontram em outros diretórios dentro da raiz. É NECESSÁRIO QUE SEJA
     * PASSADA A DEFINIÇÃO DE V.
     * 
     * \textcolor{red}{DEFINIÇÃO DE V deveria ser incorporada no programa}
     * 
     * 
     * @param stateOfV estado da variável v
     * @param wordsOfV palavras associadas à variável v
     */
    public static void unifyFiles(int stateOfV, List<Integer> wordsOfV){
        List<Biclique> result = new ArrayList<>();
        // Contém todos os arquivos no diretório raíz ou nos diretórios dentro 
        //dele após a busca.
        List<File> files = new LinkedList<>();
        
        //--------begin-Apenas-arquivos---------
        files.addAll(Arrays.asList(new File(".").listFiles()));
        File f;
        int i = 0;
        while(i < files.size()){
            if (files.get(i).isDirectory()) {
                f = new File(files.get(i).getPath());
                files.remove(i--);
                files.addAll(Arrays.asList(f.listFiles()));
            }
            i++;
        }
        //----------end-Apenas-arquivos-------
        
        //----------begin-Criar-bicliques-para-cada-arquivo-válido----------
        Scanner scanner = null;
        String biclique, aux;
        i = 0;
        for (File file : files) {
            System.out.println("file "+i+"/"+(files.size()-1)+" curr file > "+file.getPath());
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException ex) {
                //Nunca acontece
                System.err.println("De alguma forma ocorreu um erro na busca "
                        + "por arquivos");
            }
            while(scanner.hasNextLine()){
                biclique = "";
                while(scanner.hasNextLine()){
                    biclique = scanner.nextLine();
//                    System.out.println("lido: "+biclique);
                    if(biclique.equals("Biclique{")) break;
                    biclique = "";
                }
                while(scanner.hasNextLine()){
                    aux = scanner.nextLine();
//                    System.out.println("lido: "+strAux);
                    if(aux.split(" ")[0].equals("data")) break;
                    biclique += "\n" + aux;
//                    System.out.println("partial biclique : "+biclique);
                }
//                System.out.println("biclique >>");
//                System.out.println(biclique);
//                System.out.println("<< biclique");
                if(!biclique.equals("")){
//                    System.out.println("final : "+biclique);
                    result.addAll(Biclique.stringToBicliqueAES(biclique, stateOfV, wordsOfV));
                }
            }
            i++;
        }        
        //----------end-Criar-bicliques-para-cada-arquivo-válido----------
        
        //----------begin-Ordena-bicliques-por-complexidade-de-tempo----------
        result.sort((Biclique b1, Biclique b2) -> {
            if(Math.abs(b1.computeTimeComplexity(false) - b2.computeTimeComplexity(false)) < 0.001){
                if(b1.computeDataComplexityFast() > b2.computeDataComplexityFast()) return 1;
                if(b1.computeDataComplexityFast() < b2.computeDataComplexityFast()) return -1;
            }
            if(b1.computeTimeComplexity(false) > b2.computeTimeComplexity(false)) return 1;
            if(b1.computeTimeComplexity(false) < b2.computeTimeComplexity(false)) return -1;
            return 0;
        });
        //----------end-Ordena-bicliques-por-complexidade-de-tempo----------
        
        //----------end-Arquivo-com-melhores-bicliques----------
        if (result.isEmpty()) return;
        String filename = "bicliques.txt";
        
        try(PrintWriter pw = new PrintWriter(new File(filename))){
            for (int j = 0; j < result.size(); j++) pw.println(result.get(j));
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado?");
        }
        //----------begin-Arquivo-com-melhores-bicliques----------
    }
    
    /**
     * Método que busca as bicliques para o Rijndael de acordo com os argumentos 
     * passados.
     * 
     * -ki &lt; indexes &gt;   : informa quais índices de chave serão usados em
     * cada RelatedKeyDifferential dos testes (ex. "8,8,8").
     * 
     * -types &lt; types &gt;  : informa os tipos das RelatedKeyDifferential's
     * (ex. "nabla,nabla,delta").
     * 
     * -ranges &lt; ranges &gt;: informa as Range's de teste, ou seja, quais
     * tipos de bicliques serão buscadas (ex. "0,40;10,20;0,40"). Varia de 0 até
     * a quantidade máxima de possibilidades previamente estabelecida. No caso
     * do Rijndael, são 40 possibilidades: apenas um byte ativo na chave (16
     * possibilidades) e pares de bytes na mesma linha, porém em colunas
     * diferentes (24 possibilidades).
     * 
     * -nt &lt; num &gt;       : informa o número de threads a serem usadas no
     * teste.
     * @param args .
     * @param c cifra alvo do ataque.
     */
    public static void attack(String[] args) throws InstantiationException, IllegalAccessException{
//        System.out.println(Arrays.toString(args));
        Arrays.sort(ciphers);
        Cipher cipher = new Rijndael();
        int keyIndexes[] = {8,8,8};
        List<Integer> wordsOfV = Util.toIntegerList(0);
        int stateOfV = 9,
            beginBiclique = 29,
            endBiclique = cipher.getNUM_STATES()-1;
        Range ranges[] = {new Range(0, 40), new Range(0, 40), new Range(0, 40)};
        String types[] = {"nabla", "nabla", "delta"};
//        List<int[]> relevantWords = Util.allWords(cipher);
//        relevantWords.addAll(Util.allPairsOfColumns(cipher));
//        System.out.println("size:"+relevantWords.size()+" -> [");
//        for (int i[] : relevantWords) {
//            System.out.println("\t"+Arrays.toString(i));
//        }System.out.println("]");
        int nthreads = 1;
        
        List<Range[]> rangesOfThreads = new ArrayList<>(1);
        rangesOfThreads.add(ranges);
        
        String arg;
        String[] strAux;
        int[] intAux;
        int a;
        
        for (int i = 0; i < args.length; i++) {
            switch(args[i]){
                case "-ki":
                    strAux = args[++i].split(",");
                    keyIndexes = new int[strAux.length];
                    for (int j = 0; j < keyIndexes.length; j++) 
                        keyIndexes[j] = Integer.parseInt(strAux[j]);
                    break;
//                case "-kirange":
//                    strAux = args[++i].split(",");
//                    keyIndexes = new int[strAux.length];
//                    for (int j = 0; j < keyIndexes.length; j++) 
//                        keyIndexes[j] = Integer.parseInt(strAux[i]);
//                    break;
                case "-types":
                    types = args[++i].split(",");
                    break;
                case "-v":
                    stateOfV = Integer.parseInt(args[++i]);
                    strAux = args[++i].split(",");
                    intAux = new int[strAux.length];
                    for (int j = 0; j < strAux.length; j++) 
                        intAux[j] = Integer.parseInt(strAux[j]);
                    wordsOfV = Util.toIntegerList(intAux);
                    break;
                case "-cipher":
                    arg = args[++i];
                    a = Arrays.binarySearch(ciphers, arg);
                    if(a != -1){
                        switch(ciphers[a]){
                            case "future":
                                cipher = new Future();
                                break;
                            case "serpent":
                                cipher = new Serpent();
                                break;
                            case "rijndael":
                                cipher = new Rijndael();
                                break;
                            default:
                                System.out.println("The only acceptable ciphers are "+Arrays.toString(ciphers).substring(1,ciphers.length-1));
                                System.exit(1);
                        }
                    }
                    break;
                case "-ranges":
                    strAux = args[++i].split(";");
                    ranges = new Range[strAux.length];
                    for (int j = 0; j < ranges.length; j++) 
                        ranges[j] = new Range(Integer.parseInt(strAux[j].split(":")[0]), Integer.parseInt(strAux[j].split(":")[1]));
                    break;
                case "-nt":
                    nthreads = Integer.parseInt(args[++i]);               
                    break;
                case "-begin":
                    beginBiclique = Integer.parseInt(args[++i]);               
                    break;
                case "-end":
                    endBiclique = Integer.parseInt(args[++i]);               
                    break;
            }
        }
        Range temp1[] = ranges[0].partition(nthreads);
        Range temp2[];
        rangesOfThreads = new ArrayList<>();

        for (Range range : temp1) {
            temp2 = new Range[ranges.length];
            temp2[0] = range;
            System.arraycopy(ranges, 1, temp2, 1, ranges.length - 1);
            rangesOfThreads.add(temp2);
        }     
        
        System.out.println("Attack {");
        System.out.println("\t cipher : " + cipher.getClass().toString().substring(cipher.getClass().toString().lastIndexOf(".")+1));
        System.out.println("\t key indexes : " + Arrays.toString(keyIndexes));
        System.out.println("\t types : " + Arrays.toString(types));
        System.out.println("\t biclique from #" + beginBiclique + " up to #"+endBiclique);
        if(wordsOfV.size() == 1)
            System.out.println("\t v is the word " + wordsOfV.get(0)+ " from state #"+stateOfV);
        else System.out.println("\t v is the word " + wordsOfV.get(0)+ " from state #"+stateOfV);
        System.out.println("\t testing ranges : " + Arrays.toString(ranges));
        System.out.print("\t number of threads : " + nthreads);
        if (nthreads == 1) 
            System.out.println("};");
        else{
            System.out.println("\n\t ranges of each thread : ");
            for (Range[] r : rangesOfThreads) {
                System.out.println("\t "+Arrays.toString(r));
            }
            System.out.println("};");
        }
        
        List<int[]> relevantWords = Util.allCombinationsOfWords(cipher, 2, true);
//        Collections.shuffle(relevantWords);
//        for (int[] relevantWord : relevantWords) {
//            System.out.println(Arrays.toString(relevantWord));
//        }
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < rangesOfThreads.size(); i++) {
            ranges = rangesOfThreads.get(i);
            threads.add(new Thread(
                    new BicliqueTester(
                            relevantWords, 
                            beginBiclique, 
                            endBiclique == cipher.getNUM_STATES()-1 ? cipher.getNUM_STATES()-1 : endBiclique, 
                            keyIndexes, 
                            ranges,
                            types,
                            cipher.getClass(),
                            stateOfV,
                            wordsOfV
                    )
            ));
            threads.get(i).start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted for some reason");
            }
        }
        System.out.println("finished keys "+Arrays.toString(keyIndexes));
    }
}
