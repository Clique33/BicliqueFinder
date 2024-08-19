/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import biclique.Biclique;
import biclique.HasStateDiferences;
import cifras.Cipher;
import biclique.RelatedKeyDifferential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe contendo métodos estáticos utilitários
 *
 * @author Frog33
 */
public class Util {
    
    /**
     * Cria um ByteArray a partir de um vetor de ByteArrays, concatenando todos.
     * 
     * @param args 
     * @return 
     */
    public static ByteArray concat(ByteArray... args){
        ByteArray result = new ByteArray(args.length*args[0].length());
        
        int i = 0;
        for (ByteArray b : args) 
            for (int j = 0; j < b.length(); j++) 
                result.set(i++, b.get(j));
            
        return result;
    }
    /**
     * Cria um array ao concatenar dois outros.
     * 
     * @param args 
     * @return 
     */
    public static String[] concat(String[]... args){
        int total = 0, dest = 0;
        for (String[] arg : args) total += arg.length;
        String result[] = new String[total];
        for (String[] arg : args) {
            System.arraycopy(arg, 0, result, dest, arg.length);
            dest += arg.length;
        }
        return result;
    }
        
    /**
     * Cria uma List &lt; RelatedKeyDifferential &lt; a partir das 
     * RelatedKeyDifferentials passadas.
     * 
     * @param args
     * @return Uma lista contendo as RelatedKeyDifferential's a e b
     */
    public static List<RelatedKeyDifferential> concat(RelatedKeyDifferential... args){
        ArrayList<RelatedKeyDifferential> result = new ArrayList<>();
        result.addAll(Arrays.asList(args));
        return result;
    }
    /**
     * Cria uma List composta pelas versões ativas da lista original.
     * 
     * @param byteArrays
     * @param wordSize
     * @return 
     */
    public static List<ByteArray> getActiveList(List<ByteArray> byteArrays,int wordSize){
        List<ByteArray> result = new ArrayList<>(byteArrays.size());
        for (ByteArray b : byteArrays) {
            result.add(new ByteArray(b.length())
                        .activateWords(b.getActiveWords(wordSize), wordSize)
                      );
        }
        return result;
    }
    
    /**
     * Retorna a quantidade de rotações para a esquerda que devem ser feitas
     * para que one seja igual a other. Caso a quantidade seja igual ao tamanho
     * em bits de one, então não é possível.
     * 
     * @param one
     * @param other
     * @return 
     */
    public static int eRotacao(ByteArray one, ByteArray other){
        if(one.length(WordSize.BIT) != other.length(WordSize.BIT))
            return one.length(WordSize.BIT);
        ByteArray aux;
        for (int i = 0; i < one.length(WordSize.BIT); i++) {
            aux = other.clone();
            aux.rotateBits(i, true);
//            System.out.println("one : "+one);
//            System.out.println("aux : "+aux);
            if(one.equals(aux)) return i;
        }
        return one.length(WordSize.BIT);
    }
    
    /**
     * Cria uma nova List que acrescenta a RelatedKeyDifferential b ao final da 
     * List a
     * 
     * @param a a lista inicial
     * @param b o elemento a ser acrescentado ao final da lista
     * @return Uma nova List contendo todos os elementos de a e, ao final, b
     */   
    public static List<RelatedKeyDifferential> concat(List<RelatedKeyDifferential> a, RelatedKeyDifferential b){
        ArrayList<RelatedKeyDifferential> result = new ArrayList<>();
        result.addAll(a);result.add(b);
        return result;
    }
    
    /**
     * Cria uma nova List que acrescenta a RelatedKeyDifferential b ao final da 
     * List a
     * 
     * @param a a lista inicial
     * @param b o elemento a ser acrescentado ao final da lista
     * @return Uma nova List contendo todos os elementos de a e, ao final, b
     */   
    public static List<RelatedKeyDifferential> concat(List<RelatedKeyDifferential> a, List<RelatedKeyDifferential> b){
        ArrayList<RelatedKeyDifferential> result = new ArrayList<>();
        result.addAll(a);result.addAll(b);
        return result;
    }
        
    /**
     * Cria uma nova List a partir da concatenação das Lists a e b.
     * 
     * @param a a primeira lista
     * @param b a segunda lista
     * @return Uma nova List contendo todos os elementos de a e, ao final, todos
     * os elementos de b
     */
    public static List<RelatedKeyDifferential> concat(RelatedKeyDifferential a, List<RelatedKeyDifferential> b){
        ArrayList<RelatedKeyDifferential> result = new ArrayList<>();
        result.add(a);result.addAll(b);
        return result;
    }
    
    /**
     * Transforma o tempo passado em milissegundos para (h,m,s,ms)
     *
     * @param ms tempo em milissegundos
     * @return um vetor de quatro posições indicando o tempo no formato (h,m,s,ms) 
     */
    public static long[] msToTime(long ms){
        long result[] = {0,0,0,0};
        result[3] = ms%1000;
        ms /= 1000;
        result[2] = ms%60;
        ms /= 60;
        result[1] = ms%60;
        ms /= 60;
        result[0] = ms;
        return result;
    }
        
    /**
     *  Cria uma List contendo todos os elementos do vetor passado por
     * parâmetro.
     * 
     * @param ints Elementos que farão parte da nova List
     * @return nova List contendo os elementos de ints
     */
    public static List<Integer> toIntegerList(int... ints){
        List<Integer> result = new ArrayList<>(ints.length);
        for (int i : ints) 
            result.add(i);
        return result;
    }
    
        
    /**
     *  Cria uma List contendo todos os inteiros entre a e b, inclusive. Para
     * tal, b não pode ser menor que a.
     * 
     * @param a Elemento a fazer parte da List
     * @param b Elemento a fazer parte da List
     * @param range se true, indica lista de todos entre a e b. Se falso, apenas 
     * a e b.   
     * @return nova List contendo apenas i
     * @exception RuntimeException b deve ser maior ou igual a a
     */
    public static List<Integer> toIntegerList(int a, int b,boolean range){
        if(!range) return toIntegerList(a,b);
        if(b < a) throw new RuntimeException("O parâmetro b não pode ser menor que a");
        List<Integer> result = new ArrayList<>(b-a+1);
        for (int i = a; i <= b; i++) 
            result.add(i);
        return result;
    }
    
    /**
     * Cria um vetor com as k partições da List lista. 
     * 
     * @param lista List a ser particionada
     * @param k número de partições a serem geradas
     * @return vetor com as partições geradas
     */
    public static List<Integer[]>[] partition(List<Integer[]> lista, int k){
        List<Integer[]>[] result = new List[k];
        for (int i = 0; i < k; i++) {
            result[i] = new LinkedList<>();
        }
        int j = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(result[j].size() == lista.size()/k && j < lista.size()%k){
                result[j++].add(lista.get(i));
            }else if(result[j].size() == lista.size()/k-1 && j >= lista.size()%k){
                result[j++].add(lista.get(i));
            }else{
                result[j].add(lista.get(i));
            }
        }
        return result;
    }
    
    /**
     * Retorna uma List com vetores de inteiros, onde cada vetor contém os
     * índices de todos os bytes das chaves da Cipher <code>cipher</code>.
     * @param cipher .
     * @return .
     */
    public static List<int[]> allWords(Cipher cipher) {
        List<int[]> result = new ArrayList<>();
        int[] aux;
        for (int i = 0; i < cipher.getKEY_SIZE_IN_WORDS(); i++) {
            aux = new int[1];
            aux[0] = i;
            result.add(aux);
        }
        return result;
    } 

    /**
     * Retorna uma List com vetores de inteiros, onde cada vetor contém os
     * índices de todos os pares de bytes de chave da Cipher <code>cipher</code>
     * que estão na mesma linha, porém em colunas diferentes. 
     * 
     * Este método é útil, pois diferenças de chave geradas a partir deste tipo
     * de associação ativa menos bytes nas diferenciais geradas pela sua
     * propagação nas diferenciais.
     * @param cipher .
     * @return .
     */
    public static List<int[]> allPairsOfColumns(Cipher cipher) {
        int[] aux;
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < cipher.getKEY_SIZE_IN_BYTES(); i++) {
            for (int j = i + 1; j < i / 4 * 4 + 4; j++) {
                aux = new int[2];
                aux[0] = i;
                aux[1] = j;
                result.add(aux);
            }
        }
        return result;
    }

    /**
     * Retorna uma List com vetores de inteiros, onde cada vetor contém os
     * índices de todas as combynações de palavras de chave da Cipher
     * <code>cipher</code>.
     * 
     * Este método é útil, pois diferenças de chave geradas a partir deste tipo
     * de associação ativa menos bytes nas diferenciais geradas pela sua
     * propagação nas diferenciais.
     * @param cipher .
     * @param combinationSize tamanho da combinação a ser retornada
     * @param allUpTo se verdadeiro, indica que o retorno possui todas as
     * combinações de 1 até <code>combinationSize</code>
     * @return .
     */
    public static List<int[]> allCombinationsOfWords(Cipher cipher, int combinationSize, boolean allUpTo) {
        boolean carry,running = true;
        int max = 0;
        List<int[]> result = new ArrayList<>();
        int i[] = new int[combinationSize];
        for (int j = 1; j < combinationSize; j++) i[j] = i[j-1]+1;
        
        if(allUpTo){
            for (int j = 1; j < combinationSize; j++) {
                result.addAll(allCombinationsOfWords(cipher,j,false));
            }
        }
        
        while(running){
            carry = true;
            max = cipher.getKEY_SIZE_IN_WORDS()*cipher.getAMOUNT_OF_KEYS();
//            System.out.println(Arrays.toString(i));
            result.add(Arrays.copyOf(i, combinationSize));
            for (int j = i.length-1; j >= 0; j--) {
                if(carry){
                    i[j]++;
                    if(i[j] < max){
                        for (int k = j+1; k < i.length; k++) {
                            i[k] = i[k-1]+1;
                        }
                        carry = false;
                    }else if(j == 0){
                        running = false;
                    }else{
                        if(i[j-1]+2 <=cipher.getKEY_SIZE_IN_WORDS()){
                            i[j] = i[j-1]+2;
                        }
                        else{
                            i[j] = i[j-1]+1;
                        }
                    }
                    max--;
                }else
                    break;
            }
        }
        return result;
    }
    
    
    /**
     * Implementa o split para Strings até certo índice.
     * 
     * @param string string a ser dividida.
     * @param character character que indica os pontos do split
     * @param upToIndex índice final. A partir dele o character é ignorado
     * @return vetor com as partes de string que foram quebradas.
     */
    public static String[] splitString(String string, String character, int upToIndex){
        List<String> res = new LinkedList<>();
        upToIndex = string.length()-upToIndex;
        int seqIndex;
        while(!string.equals("")){
            seqIndex = string.indexOf(character);
            if(seqIndex == -1 || seqIndex > string.length()-upToIndex) break;
            res.add(string.substring(0,seqIndex));
            string = string.substring(seqIndex+1);
        }
        if(!string.equals("")) res.add(string);
        return res.toArray(new String[0]);
    }
    
    /**
     * Implementa o split para Strings.
     * 
     * @param string string a ser dividida.
     * @param character character que indica os pontos do split
     * @return vetor com as partes de string que foram quebradas.
     */
    public static String[] splitString(String string, String character){
        return splitString(string, character, string.length());
    }
    
    /**
     * Cria uma List com cópias dos ByteArrays da lista passada.
     * 
     * @param list Lista a ser copiada
     * @return nova List cópias dos elementos de list
     */
    public static List<ByteArray> copyList(List<ByteArray> list){
        List<ByteArray> result = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) 
            result.add(list.get(i).clone());
        return result;
    }
    
    /**
     * Cria um arquivo .tex para visualização de biclique através do pacote tikz.
     * 
     * @param b Biclique a ser vizualizada
     * @return 
     */
    public static String toTikzDiagramRecomputation(Biclique b){
        String result = tikzHeader(b.getRecomputation());
        
        int i = 0,
            xor = 0, 
            limit = b.getRecomputation().getCiphers()[0].getBLOCK_SIZE_IN_WORDS()/ 4;
        for (ByteArray state : b.getRecomputation().getStateDifferences()) {
            result += "	\\node(state"+i+")[";
            if(i == 0){}
            else if(b.getCipher().getINDEX_OF_POST_KEY(i)!=-1) {      
                result +=                      "below of=xor"+(xor-1);
            }else{
                result +=                      "below of=state"+(i-1)+", yshift=-2cm";
            }
                
                result += "]{"+Util.getTabular(
                                state, 
                                WordSize.getWordSize(b.getCipher().getWORD_SIZE()), 
                                "grey")+
                        "};\n" +
                " 		\\node(numberOfState"+i+")[right of=state"+i+",xshift="+(0.1*limit)+"cm]{$\\#"+i+"$};\n";
            
            if(b.getCipher().getINDEX_OF_PRE_KEY(i)!=-1)
                result +="		\\node(xor"+xor+++")[below of=state"+i+"]{$\\oplus$};\n";
            i++;
        }
        
        limit = b.getRecomputation().getCiphers()[0].getKEY_SIZE_IN_WORDS()/ 4;
        result += "    % Draw keys\n";
        
        RelatedKeyDifferential base = b.getRecomputation();
        for (int k = 0; k < base.getCiphers()[0].getNUM_KEYS();k++){
            result += "	\\node(K"+k+")[left of=xor"+k+", xshift=-"+(0.25*limit)+"cm]{"+Util.getTabular(
                                base.getKeyDifference(k), 
                                WordSize.getWordSize(b.getCipher().getWORD_SIZE()), 
                                "salmon")+"};\n" +
                                                        "		\\node(numberK"+k+")[left of=K"+k+",xshift=-"+(0.125*limit)+"cm]{$\\$"+k+"$};\n";
        }
        
        
        result += "    % Draw edges\n";
        
        i = 0;xor = 0;
        for (ByteArray state : b.getRecomputation().getStateDifferences()) {
            if(i >= b.getRecomputation().getStateDifferences().size()-1) continue;
            if(b.getCipher().getINDEX_OF_PRE_KEY(i)!= -1){
                result += "	\\path [line] (state"+i+") -- (xor"+xor+");\n" +
                        "	\\path [line] (xor"+xor+") -- (state"+(i+1)+");\n";
                xor++;
            }else{
                result += "	\\path [line] (state"+i+") --  node{\\begin{tabular}{l}\n" +
                            "                                        SB \\\\\n" +
                            "                                        SR \\\\ \n" +
                            "                                        MC\n" +
                            "                                    \\end{tabular}} (state"+(i+1)+");\n";
            }
            i++;
        }
        
        for (int k = 0; k < base.getCiphers()[0].getNUM_KEYS();k++){
            result += "	\\path [line] (K"+k+") -- (xor"+k+");\n";
        }
        
        return result + "\\end{tikzpicture}\n" +
                        "\\end{document}";
    }
    
    
    /**
     * Cria um arquivo .tex para visualização da RelatedKeyDifferential passada 
     * através do pacote tikz.
     * 
     * @param r
     * @param color
     * @return 
     */
    public static String toTikzDiagramRelatedKeyDifferential(RelatedKeyDifferential r,String color){
        String result = tikzHeader(r);
        
        int i = 0,
            xor = 0, 
            limit = r.getCiphers()[0].getBLOCK_SIZE_IN_WORDS()/ 4;
        
        for (ByteArray state : r.getStateDifferences()) {
            result += "	\\node(state"+i+")[";
            if(i == 0){}
            else if(r.getCiphers()[0].getINDEX_OF_POST_KEY(i)!=-1) {      
                result +=                      "below of=xor"+(xor-1);
            }else{
                result +=                      "below of=state"+(i-1)+", yshift=-2cm";
            }
                
                result += "]{"+Util.getTabular(
                                state, 
                                WordSize.getWordSize(r.getCiphers()[0].getWORD_SIZE()), 
                                color)+
                        "};\n" +
                " 		\\node(numberOfState"+i+")[right of=state"+i+",xshift="+(0.1*limit)+"cm]{$\\#"+i+"$};\n";
            
            if(r.getCiphers()[0].getINDEX_OF_PRE_KEY(i)!=-1)
                result +="		\\node(xor"+xor+++")[below of=state"+i+"]{$\\oplus$};\n";
            i++;
        }
        
        result += "    % Draw keys\n";
        
        limit = r.getCiphers()[0].getKEY_SIZE_IN_WORDS() / 4;
        RelatedKeyDifferential base = r;
        
        for (int k = 0; k < base.getCiphers()[0].getNUM_KEYS();k++){
            result += "	\\node(K"+k+")[left of=xor"+k+", xshift=-"+(0.25*limit)+"cm]{"+Util.getTabular(
                                base.getKeyDifference(k), 
                                WordSize.getWordSize(r.getCiphers()[0].getWORD_SIZE()), 
                                color)+"};\n" +
                                                        "		\\node(numberK"+k+")[left of=K"+k+",xshift=-"+(0.125*limit)+"cm]{$\\$"+k+"$};\n";
        }
        
        
        result += "    % Draw edges\n";
        
        i = 0;xor = 0;
        for (ByteArray state : r.getStateDifferences()) {
            if(i >= r.getStateDifferences().size()-1) continue;
            if(r.getCiphers()[0].getINDEX_OF_PRE_KEY(i)!= -1){
                result += "	\\path [line] (state"+i+") -- (xor"+xor+");\n" +
                        "	\\path [line] (xor"+xor+") -- (state"+(i+1)+");\n";
                xor++;
            }else{
                result += "	\\path [line] (state"+i+") --  node{\\begin{tabular}{l}\n" +
                            "                                        SB \\\\\n" +
                            "                                        SR \\\\ \n" +
                            "                                        MC\n" +
                            "                                    \\end{tabular}} (state"+(i+1)+");\n";
            }
            i++;
        }
        
        for (int k = 0; k < base.getCiphers()[0].getNUM_KEYS();k++){
            result += "	\\path [line] (K"+k+") -- (xor"+k+");\n";
        }
        
        return result + "\\end{tikzpicture}\n" +
                        "\\end{document}";
    }
    
    /**
     * Retorna o cabeçalho do documento latex para geração do diagrama para a 
     * RelatedKeyDifferential passada.
     */
    private static String tikzHeader(HasStateDiferences h){
        return "\\documentclass{article}\n" +
                        "\\usepackage[paperheight="+(1.6*h.getStateDifferences().size())+"in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
                        "\\usepackage[table,xcdraw]{xcolor}\n" +
                        "\\usepackage{tikz}\n" +
                        "\\usetikzlibrary{shapes, arrows}\n" +
                        "\n" +
                        "\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
                        "\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
                        "\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
                        "\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
                        "\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
                        "\n" +
                        "\\begin{document}\n" +
                        "\\pagestyle{empty}\n" +
                        "% Define block styles\n" +
                        "\\tikzstyle{line} = [draw, -latex']\n" +
                        "   \n" +
                        "\\centering\n" +
                        "\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
                        "% Draw States\n";
    }
    
    /**
     * Retorna a auto concatenação de 's' 'n' vezes.
     */
    private static String autoConcat(String s, int n){
        String result = "";
        for (int i = 0; i < n; i++) result += s;
        return result;
    }
    
    /**
     * Retorna a tabela LaTex do ByteArray passado.
     * 
     * @param b
     * @param wordSize tamanho de palavra a ser utilizada
     * @param color
     * @return 
     */
    public static String getTabular(ByteArray b,WordSize wordSize,String color){
//        System.out.println(b);
        int limit = b.length(wordSize)/4;
        String result = "\\begin{tabular}{|"+autoConcat("l|", limit)+"}\n		";
        for (int i = 0; i < b.length(wordSize); i++) {
            if(i%limit == 0)
                result += "\\hline\n		";
            
            if(b.getWord(wordSize.value(), i) != 0)
                result += "\\"+color;
            
            if(i%limit == limit-1)
                result += "\\\\";
            else
                result += "&";
                
        }
        
        return result += "\\hline\n		\\end{tabular}";
    }
    
    
    /**
     * Método de testes da classe.
     * @param args .
     */
    public static void main(String[] args){
//        System.out.println(allCombinationsOfWords(new Future(), 2, true).size());

        System.out.println(Arrays.toString(
                Util.concat(
                        new String[]{
                            "casa",
                            "carro",
                            "caminhão",
                        },
                        new String[]{
                            "vassoura",
                            "chinelo",
                            "palhaço",
                        },
                        new String[]{
                            "manivela",
                            "açúcar",
                            "vacilão",
                        },
                        new String[]{
                            "saco",
                            "vazio",
                            "pirata",
                        }
                )
        ));

//        List<Integer[]> nablaActive = new LinkedList<>();
//        Integer aux[];
//        for (int j1 = 0; j1 < new Rijndael().getBLOCK_SIZE_IN_WORDS(); j1++) {
//            for (int j2 = j1+4; j2 < 16; j2+=4){ 
//                aux = new Integer[2];
//                aux[0] = j1;
//                aux[1] = j2;
//                nablaActive.add(aux);
//            }
//        }
//        System.out.println(Arrays.deepToString(nablaActive.toArray()));
//        List<Integer[]>[] partitions = partition(nablaActive,4);
//        for (int i = 0; i < 4; i++) {
//           System.out.println(Arrays.deepToString(partitions[i].toArray()));
//        }
//        String teste = "public abstract void cifras.Cipher.setKey(util.ByteArray,int)";
//        System.out.println(teste.indexOf("("));
//        System.out.println(Arrays.toString(
//                splitString(teste, 
//                ".", teste.indexOf("("))));
    }  

    public static int[] getBytes(int i) {
        return new int[]{(i>>24)&0xFF,(i>>16)&0xFF,(i>>8)&0xFF,i&0xFF};
    }
    
    /**
     * Retorna a versão em String da hash da String passada com SHA-256.
     *
     * NAO TESTADO
     * @param s
     * @return 
     */
    public static String getHash(String s){
        String result = "";
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            result = new String(hash.digest(s.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static double log2(double a) {
        return Math.log(a) / Math.log(2);
    }
}
