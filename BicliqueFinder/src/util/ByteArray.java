package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Representa a abstração de um vetor de Bytes, podendo assumir qualquer formato
 * de matriz, caso necessário. Trata-se da Classe base, sendo utilizada em todas
 * as partes da ferramenta.
 * 
 */
public class ByteArray implements Cloneable {
      
    /**
     * Método de testes da classe.
     * @param args .
     */
    public static void testador(String[] args){
        /*ByteArray b2;
        ByteArray b = new ByteArray(8);
        ByteArray row = new ByteArray(4);
        ByteArray col = new ByteArray(2);
        b.randomize();
        b.rowsFirst = false;
        System.out.println(b + " " + b.getShape());
        b.setShape("2x4");
        System.out.println(b + " " + b.getShape());
        //b.setByte(0, 3, 255);
        //System.out.println(b + " " + b.getShape());
        b2 = b.getColumn(3);
        System.out.println(b2 + " " + b2.getShape());
        b2 = b.getRow(1);
        System.out.println(b2 + " " + b2.getShape());
        //b.setRow(0,b2);
        //System.out.println(b + " " + b.getShape());*/
        
        ByteArray b = new ByteArray(16);
        b.randomize();
        //b.setShape("2x4");
        System.out.println(b.amountOfWords(32));
        //System.out.println(b);
        //b.rotateRow(1);
        //System.out.println(b);
    }

    /**
     *  Cria uma List contendo 'n' cópias do ByteArray passado.
     *
     * @param b Elemento a fazer parte da List
     * @param n tamanho da lista final
     * @return nova List contendo n cópias de b
     */
    public static List<ByteArray> nCopies(ByteArray b, int n) {
        List<ByteArray> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(b.clone());
        }
        return result;
    }

    /**
     *  Cria uma List contendo os ByteArrays passados.
     *
     * @param args ByteArrays que farão parte da list
     * @return nova List contendo os ByteArrays passados
     */
    public static List<ByteArray> toByteArrayList(ByteArray... args) {
        List<ByteArray> result = new ArrayList<>(args.length);
        for (ByteArray b : args) {
            result.add(b);
        }
        return result;
    }
    
    /**
     * Particiona e retorna o ByteArray 'key' em 'k' partes iguais.
     * 
     * @param key
     * @param k
     * @return 
     */
    public static List<ByteArray> partition(ByteArray key, int k) {
        if(key.length()%k != 0)
            throw new RuntimeException("the sizes of the partitions must divide"
                    + "the byte size of the original ByteArray: "+key.length()
                    + "%" + k + " = " + (key.length()%k));
        
        List<ByteArray> result = new ArrayList<>(k);
        int chunkSize = key.length()/k;
        
        for (int i = 0; i < key.length(); i+=chunkSize) 
            result.add(key.getSubBytes(i, i+chunkSize));
        
        return result;
    }
    
    /**
     * Número de linhas no formato do ByteArray.
     */
    private int numRows;
    /**
     * Número de colunas no formato do ByteArray.
     */
    private int numCols;
    /**
     * Representação dos valores do ByteArray.
     */
    protected short[] array = new short[0];      
    /**
     * Se verdadeiro, nas posições (x,y) dos ByteArrays o x representa as linhas
     * e y as colunas. Caso contrário, x representa as colunas e y as linhas.
     */ 
    public boolean rowsFirst;
    
    /**
     * Cria um ByteArray zerado com 'length' bytes.
     * @param length tamanho em bytes do ByteArray
     */
    public ByteArray(int length) {
        this.array = new short[length];
        try {
            setShape(""+1+"x"+array.length, WordSize.BYTE);
        } catch (Exception ex) {
            //Never happens
        }
        rowsFirst = true;
    }
    

    /**
     * Cria um ByteArray a partir da String passada. A String é formatada entre
     * colchetes, onde cada byte é separado por vírgulas ou |, sendo o byte
     * representado por dois valores hexadecimais consecutivos.
     * 
     * Ex: [00,50,fa,00|00] -> Gera um ByteArray de length 5 com todos os bytes
     * zerados, exceto pelo byte 1 que recebe 0x50 e o byte 4 que recebe 0xFA.
     * 
     * @param bytearray String devidamente formatada
     */
    public ByteArray(String bytearray) {
        this(bytearray.substring(1,bytearray.length()-1).replace('|', ',').split(",").length);
        String[] bytes = bytearray.substring(1,bytearray.length()-1).replace('|', ',').split(",");
        
        for (int i = 0; i < this.length(); i++)
            this.set(i, Integer.parseInt(bytes[i],16));
    }

    /**
     * USADO APENAS NO SERPENT DESCONTINUADO
     * 
     * Cria um novo ByteArray com a mesma quantidade de bytes que o comprimento 
     * do vetor 'values' e valores iguais aos valores de 'values'. O i-ésimo
     * byte do novo ByteArray é o byte menos significativo do i-ésimo valor de
     * 'values'.
     * 
     * @param values Vetor com os valores a serem inseridos no ByteArray
     */
    public ByteArray(int[] values) {
        this.array = new short[values.length];

        for (int i = 0; i < values.length; i++) {
                array[i] = (short)(values[i] & 0xFF);
        }
        try {
            setShape(""+1+"x"+array.length, WordSize.BYTE);
        } catch (Exception ex) {
            //Never happens
        }
        rowsFirst = true;
    }
        
    /**
     * Retorna a quantidade de bytes do ByteArray.
     * @return .
     */
    public final int length() {
        return array.length;
    }
        
    /**
     * Retorna a quantidade de palavras de tamanho wordsize do ByteArray.
     * @param wordSize tamanho de palavra.
     * @return .
     */
    public int length(WordSize wordSize) {
        switch(wordSize){
            case BIT:
                return length()*8;
            case BYTE:
                return length();
            default:
                if(length(WordSize.BIT)%wordSize.value() != 0)
                    throw new RuntimeException("The length in bits is not divisible by " + wordSize);

                return length(WordSize.BIT)/wordSize.value();
        }
        
    }

    /** 
     * Cria uma nova lista cujos elementos são de 'source', porém a ordem é
     * invertida.
     * 
     * @param source a lista de onde os elementos serão inseridos.
     * @return .
     */ 
    public static ArrayList<ByteArray> reverse(ArrayList<ByteArray> source){
        ArrayList<ByteArray> result = new ArrayList<>();
        for (int i = source.size()-1; i >= 0; i--) result.add(source.get(i));
        return result;
    }
    
    /**
     * Altera o ByteArray atual, ao ativar as palavras listadas em 'words' e o
     * retorna.
     * 
     * @param words posições das palavras a serem ativadas
     * @param wordsize tamanho em bits das palavras
     * @return 
     */ 
    public ByteArray activateWords(Iterable<Integer> words, int wordsize){
        for (Integer i : words) setWord(wordsize,i, 0xff);
        return this;
    }
    
    /**
     * Retorna a quantidade de palavras de tamanho 'wordSize' existem no
     * ByteArray.
     * 
     * @param wordSize tamanho em bits das palavras.
     * @return .
     */ 
    public double amountOfWords(int wordSize){
        int aux = 1;
        double multiplier = 8;
        
        while(aux < wordSize){
            aux*=2;
            multiplier/=2;
        }
        
        return this.length()*multiplier;
    }
    
    /**
     * Cria um novo ByteArray composto pela concatenação de todos os ByteArrays
     * presentes em 'list'
     * 
     * @param list sequência de ByteArrays a serem concatenados.
     * @return .
     */
    public static ByteArray concatenateAll(List<ByteArray> list){
        int totalSize = 0;
        for (ByteArray elem : list) totalSize+=elem.length();
        
        ByteArray result = new ByteArray(totalSize);
        int index = 0;
        
        for (ByteArray elem : list) {
            result.copyBytes(elem, 0, index);
            index+=elem.length();
        }
        return result;
    }
    
    /**
     * Cria um novo ByteArray composto pela concatenação de todos os ByteArrays
     * presentes em 'list'
     * 
     * @param list sequência de ByteArrays a serem concatenados.
     * @return .
     */
    public static ByteArray concatenateAll(ByteArray... list){
        int totalSize = 0;
        for (ByteArray elem : list) totalSize+=elem.length();
        
        ByteArray result = new ByteArray(totalSize);
        int index = 0;
        
        for (ByteArray elem : list) {
            result.copyBytes(elem, 0, index);
            index+=elem.length();
        }
        return result;
    }
    
    /**
     * Getter que retorna o formato atual do ByteArray.
     * @return .
     */    
    public String getShape() {
        return numRows + "x" + numCols;
    }
    
    /**
     * Getter que retorna o formato atual do ByteArray.
     * @param wordsize
     * @return .
     */    
    public String getShape(WordSize wordsize) {
        if(numRows*numCols != length(wordsize)){
            numRows = 1;
            numCols = length(wordsize);
        }
        return numRows + "x" + numCols;
    }
    
    /**
     * Getter simples para a quantidade de linhas no ByteArray.
     * @return .
     */      
    public int getNumRows() {
        return numRows;
    }
    
    /**
     * Getter simples para a quantidade de colunas no ByteArray.
     * @return .
     */       
    public int getNumCols() {
        return numCols;
    }
    
    /**
     * Altera o formato do ByteArray atual de acordo com 'shape'.
     * 
     * @param shape novo formato do ByteArray.
     * @param wordsize the value of wordsize
     * @throws java.lang.RuntimeException pode ser lançado se o formato não for válido.
     */
    public final void setShape(String shape, WordSize wordsize) {
        
//        System.out.println("setShape:" + shape);
        String[] splitedShape = shape.split("x");
        //System.out.println(splitedShape[0] + " " + splitedShape[1]);
        
        if(splitedShape.length != 2) throw new RuntimeException("Formato Inválido: precisa estar no formato 'int'x'int' (ex. 4x3)");
        
        int num1, num2;
        try{
            num1 = Integer.parseInt(splitedShape[0]);
            num2 = Integer.parseInt(splitedShape[1]);
        }catch(NumberFormatException ex){
            throw new RuntimeException("Formato Inválido: precisa estar no formato 'int'x'int' (ex. 4x3). Em vez disso, '"+splitedShape[0]+"'x'"+splitedShape[1]+"'");
        }
        if(num1*num2 != length(wordsize)) throw new RuntimeException("Formato Inválido: o produto do primeiro("+num1
                                                    +") e segundo ("+num2+") números devem ser iguais ao comprimento "
                                                    + "("+length(wordsize)+") do ByteArray ("+num1*num2+ "!=" +length(wordsize)+").");
        numRows = num1;
        numCols = num2;
//        System.out.println(getShape());
    }
    
    /**
     * Retorna o Byte na posição 'row' e 'col' ([row,col]).
     * 
     * @param row linha do Byte
     * @param col coluna do Byte
     * @return .
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */
    private short getByte(int row, int col) {
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows);
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        
        if(rowsFirst)   return this.get(row*numCols + col);
        else            return this.get(col*numRows + row);
    }
    
    /**
     * Retorna o nibble na posição 'row' e 'col' ([row,col]).
     * 
     * @param row linha do Nibble
     * @param col coluna do Nibble
     * @return .
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */
    private short getNibble(int row, int col) {
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows);
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        
        if(rowsFirst)   return (short)getNibble(row*numCols + col);
        else            return (short)getNibble(col*numRows + row);
    }
    
    
    /**
     * Retorna a palavra na posição 'row' e 'col' ([row,col]).
     * 
     * @param wordsize
     * @param row linha da palavra
     * @param col coluna da palavra
     * @return .
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */
    public short getWord(WordSize wordsize, int row, int col){
        switch(wordsize.value()){
            case 4:
                return getNibble(row, col);
            case 8:
                return getByte(row, col);
            default:
                throw new RuntimeException("Tamanho de palavra não aceito");
        }
    }
    /**
     * Retorna o Byte na posição pos.
     * 
     * @param pos posição do byte.
     * @return .
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */
    public short getByte(int pos) {
        return getByte(0, pos);
    }
    
    /**
     * Altera o Byte na posição 'row' e 'col' ([row,col]) com o valor 'value'.
     * 
     * @param row linha do Byte
     * @param col coluna do Byte
     * @param value valor a ser colocado
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */    
    private void setByte(int row, int col, int value) {
        //System.out.println(numRows + " " + numCols);
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows + "("+row+")");
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        
        if(rowsFirst)   this.set(row*numCols + col, value);
        else            this.set(col*numRows + row, value);
    }
    
    /**
     * Altera o Nibble na posição 'row' e 'col' ([row,col]) com o valor 'value'.
     * 
     * @param row linha do Nibble
     * @param col coluna do Nibble
     * @param value valor a ser colocado
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */    
    private void setNibble(int row, int col, int value) {
        //System.out.println(numRows + " " + numCols);
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows + "("+row+")");
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        
        if(rowsFirst)   setNibble(row*numCols + col, value);
        else            setNibble(col*numRows + row, value);
    }
    
    /**
     * Altera a palavra na posição 'row' e 'col' ([row,col]) com o valor 'value'.
     * 
     * @param row linha da palavra
     * @param col coluna da palavra
     * @param value valor a ser colocado
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */    
    private void setWord(WordSize wordsize, int row, int col, int value) {
        switch(wordsize.value()){
            case 4:
                setNibble(row, col,value);
                break;
            case 8:
                setByte(row, col,value);
                break;
            default:
                throw new RuntimeException("Tamanho de palavra não aceito");
        }
    }
    
    /**
     * Altera o Byte na posição 'pos' com o valor 'value'.
     * 
     * @param pos posição do Byte
     * @param value valor a ser colocado
     * @throws java.lang.RuntimeException caso a linha/coluna não esteja na range
     * válida.
     */    
    public void setByte(int pos, int value) {
        setByte(0, pos, value);
    }
    
    /**
     * Cria um novo ByteArray contendo apenas a coluna 'col' do objeto.
     * 
     * @param col coluna do Byte
     * @return .
     * @throws java.lang.Exception caso a coluna não esteja na range válida.
     */    
    public ByteArray getColumn(int col) {
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        
        ByteArray result = new ByteArray(numRows);
        result.setShape(numRows+"x1", WordSize.BYTE);
        for (int i = 0; i < result.numRows; i++) result.setByte(i, 0, getByte(i, col));
        
        
        return result;
    }
    
    /**
     * Altera a coluna 'col' do ByteArray com os valores em 'value'.
     * 
     * @param col coluna do Byte.
     * @param value o ByteArray a ser colocado na coluna 'col'.
     * @throws java.lang.Exception caso a coluna não esteja na range válida ou 
     * 'value' não tenha o comprimento adequado. 
     */   
    public void setColumn(int col, ByteArray value){
        if(value.length() != numRows) throw new RuntimeException("Invalid Value: must have the same length as rows in the target. (Value has length "+value.length()+" but should be "+numRows);
        if(col < 0 || col >= numCols) throw new RuntimeException("Invalid Column: must be non negative and smaller than "+numCols);
        //System.out.println(value);
        for (int i = 0; i < numRows; i++) setByte(i, col, value.get(i));
        
    }
    
    /**
     * Cria um novo ByteArray contendo apenas a linha 'row' do objeto.
     * 
     * @param row coluna do Byte
     * @param wordsize
     * @return .
     */       
    public ByteArray getRow(int row, WordSize wordsize) {
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows);
        
        ByteArray result = new ByteArray(numCols*wordsize.value()/WordSize.BYTE.value());
        result.getShape(wordsize);
        for (int i = 0; i < result.numCols; i++) 
            result.setWord(
                    wordsize.value(), 
                    i, 
                    getWord(wordsize, row, i)
            );
        
        return result;
    }

    /**
     * Altera a linha 'row' do ByteArray com os valores em 'value'.
     * 
     * @param row linha do Byte
     * @param value o ByteArray a ser colocado na linha 'row' 
     * @param wordsize 
     */   
    public void setRow(int row, ByteArray value, WordSize wordsize) {
        if(value.length(wordsize) != numCols) throw new RuntimeException("Invalid Value: must have the same length as rows in the target. (Value has length "+value.length()+" but should be "+numRows);
        if(row < 0 || row >= numRows) throw new RuntimeException("Invalid Row: must be non negative and smaller than "+numRows);
        
        for (int i = 0; i < numCols; i++) setWord(wordsize,row, i, value.getWord(wordsize.value(),i));
    }
    
    /**
     * Altera a linha 'row' do ByteArray empurrando os bytes uma posição para a
     * direita.
     * 
     * @param row linha do a ser alterada
     * @param wordsize
     */     
    public void rotateRow(int row, WordSize wordsize) {
//        System.out.println("-------begin rotateRow-------");
        ByteArray aux_row = getRow(row, wordsize);
//        System.out.println(aux_row);
        int aux = aux_row.getWord(wordsize.value(), 0);
        
        for (int i = 0; i < aux_row.length(wordsize)-1; i++) {
//            System.out.println(aux_row.getWord(wordsize.value(),i+1));
            aux_row.setWord(
                    wordsize.value(), 
                    i, 
                    aux_row.getWord(wordsize.value(),i+1)
            );
//            System.out.println(aux_row);
            
        }
        aux_row.setWord(wordsize.value(),aux_row.length(wordsize)-1, aux);
        
        setRow(row, aux_row, wordsize);
    }
    
    /**
     * Rotaciona o ByteArray empurrando os bits n posições para o lado passado.
     * 
     * @param n Número de rotações para a esquerda.
     * @param left se true, rotaciona para esquerda e para direita caso
     * contrário.
     */     
    public void rotateBits(int n, boolean left) {
        
        if (left) for (int i = 0; i < n; i++) rotateLeft();
        else for (int i = 0; i < n; i++) rotateRight();
    }
    
    
    /**
     * Faz o shift no ByteArray empurrando os bits n posições para o lado
     * passado.
     * 
     * @param n Número de shifts para a esquerda.
     * @param left se true, rotaciona para esquerda e para direita caso
     * contrário.
     */     
    public void shiftBits(int n, boolean left) {
        
        if (left) for (int i = 0; i < n; i++) shiftLeft();
        else for (int i = 0; i < n; i++) shiftRight();
    }
    
    /**
     * Rotaciona o ByteArray empurrando os bits uma posição para a
     * esquerda.
     */     
    private void rotateLeft() {
        int carry = 0,currByte;
        for (int i = this.length()-1; i >= 0; i--) {
            currByte = getByte(i);
            setByte(i, currByte<<1 ^ carry);
            carry = (currByte>>7)&1;
        }
        setByte(this.length()-1, getByte(this.length()-1) ^ carry);
    }
    
    /**
     * Shifta o ByteArray empurrando os bits uma posição para a
     * esquerda.
     */     
    private void shiftLeft() {
        int carry = 0,currByte;
        for (int i = this.length()-1; i >= 0; i--) {
            currByte = getByte(i);
            setByte(i, currByte<<1 ^ carry);
            carry = (currByte>>7)&1;
        }
    }
    
    /**
     * Rotaciona o ByteArray empurrando os bits uma posição para a
     * direita.
     */     
    private void rotateRight() {
        int carry = 0,currByte;
        for (int i = 0; i < length(); i++) {
            currByte = getByte(i);
            setByte(i, (currByte>>1)&0x7F ^ (carry<<7)&0x80);
            carry = currByte&1;
        }
        setByte(0, getByte(0)&0x7F ^ (carry<<7)&0x80);
    }
    
    
    /**
     * Shifta o ByteArray empurrando os bits uma posição para a
     * direita.
     */     
    private void shiftRight() {
        int carry = 0,currByte;
        for (int i = 0; i < length(); i++) {
            currByte = getByte(i);
            setByte(i, (currByte>>1)&0x7F ^ (carry<<7)&0x80);
            carry = currByte&1;
        }
    }
    
    /**
     * Altera todos os bytes do ByteArray ao aplicar o AND com o BteArray
     * 'other'.
     * @param other ByteArray que aplicará o AND.
     * @return a própria instância modificada.
     */
    public ByteArray and(ByteArray other) {
            for (int i = 0; i < array.length; i++) {
                    array[i] &= other.array[i];
            }

            return this;
    }
    
    /**
     * Altera todos os bytes do ByteArray ao aplicar o OR com o BteArray
     * 'other'.
     * @param other ByteArray que aplicará o OR.
     * @return a própria instância modificada.
     */
    public ByteArray or(ByteArray other) {
        if (array.length <= other.array.length) 
            for (int i = 0; i < array.length; i++) 
                array[i] |= other.array[i];
        else 
            for (int i = 0; i < other.array.length; i++) 
                array[i] |= other.array[i];    
        return this;
    }
    
    /**
     * Altera todos os bytes do ByteArray ao aplicar o XOR com o BteArray
     * 'other'. 
     * @param other ByteArray que aplicará o XOR.
     * @return a própria instância modificada.
     */
    public ByteArray autoXor(ByteArray other) {
        if(getShape().equals(other.getShape())){
            if (array.length <= other.array.length) 
                for (int i = 0; i < array.length; i++) 
                    array[i] ^= other.array[i];
            else 
                for (int i = 0; i < other.array.length; i++) 
                    array[i] ^= other.array[i];
            return this;
        }
        if(numRows*numCols == other.numRows*other.numCols){
            String originalShape = other.getShape();
            try {
                other.setShape(getShape(), WordSize.BYTE);
                ByteArray result = autoXor(other);
                other.setShape(originalShape, WordSize.BYTE);
                return result;
            } catch (Exception ex) {
                Logger.getLogger(ByteArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (array.length <= other.array.length)
            for (int i = 0; i < array.length; i++) 
                array[i] ^= other.array[i];
        else 
            for (int i = 0; i < other.array.length; i++) 
                array[i] ^= other.array[i];
        return this;
    }
    
    /**
     * Altera todos os bytes do ByteArray ao aplicar o XOR com os ByteArrays
     * 'others'. 
     * @param others ByteArray que aplicará o XOR.
     * @return a própria instância modificada.
     */
    public ByteArray autoXor(ByteArray... others) {
        ByteArray result = new ByteArray(others[0].length());
        for (ByteArray b : others) 
            result.autoXor(b);
        for (int i = 0; i < this.length(); i++) 
            this.set(i, result.get(i));
        
        return this;
    }
    
    /**
     * Altera todos os bytes do ByteArray ao aplicar o XOR com os BteArrays
     * em 'others'.
     * @param others ByteArrays que aplicarão o XOR.
     */
//    public void autoXor(ByteArray... others){
//        ByteArray result = ByteArray.xor(others);
//        this.copyBytes(result, 0, 0);
//    }
    
    /**
     * Cria uma nova List de ByteArray's dada pelo Xor das List's 'one' e
     * 'other'. Caso uma lista seja maior que a outra, os elementos fora além 
     * dos índices válidos para a menor serão ignorados.
     * 
     * @param one List
     * @param other ByteArray que aplicará o XOR.
     * @return a própria instância modificada.
     */
    public static List<ByteArray> autoXor(List<ByteArray> one, List<ByteArray> other) {
            List<ByteArray> result = new ArrayList<>();

            if (one.size() < other.size())  result.addAll(one);
            else result.addAll(other);

            for (int i = 0; i < result.size(); i++) {
                result.get(i).xor(other.get(i));
            }
            return result;
    }
    /** 
     * Cria uma deep copy deste ByteArray.
     * @return .
     * @see java.lang.Object#clone()
     */
    @Override
    public ByteArray clone() {
        ByteArray copy = new ByteArray(length());

        for (int i = 0; i < array.length; i++) copy.set(i, get(i));
        try {
            copy.setShape(getShape(), WordSize.BYTE);
        } catch (Exception ex) {
            //never happens
        }
        return copy;
    }

    /**
     * Modifica o ByteArray atual ao copiar todos os bytes da posição
     * <code>sourceFrom</code> do vetor <code>source</code> até o final,
     * começando na posição <code>destinationIndex</code> deste ByteArray.
     * @param source .
     * @param sourceFrom .
     * @param destinationIndex .
     */
    public void copyBytes(ByteArray source, int sourceFrom, int destinationIndex) {
            int numBytes = source.length() - sourceFrom; 
            copyBytes(source, sourceFrom, destinationIndex, numBytes);
    }

    /**
     * Modifica o ByteArray atual ao copiar uma sequência de
     * <code>numBytes</code> bytes da posição <code>sourceFrom</code> do vetor
     * <code>source</code>, começando na posição <code>destinationIndex</code>
     * deste ByteArray. 
     * 
     * @param source .
     * @param sourceFrom .
     * @param destinationIndex .
     * @param numBytes .
     * @throws ArrayIndexOutOfBoundsException If <code>sourceFrom</code> or <code>destinationIndex</code>
     * are less than zero, or if the length of the source array or the current array is not great enough.   
     */
    public void copyBytes(ByteArray source, int sourceFrom, int destinationIndex, int numBytes) {
            if (source.length() < sourceFrom + numBytes) {
                    throw new ArrayIndexOutOfBoundsException();
            } else if (length() < destinationIndex + numBytes) {
                    throw new ArrayIndexOutOfBoundsException();
            } else if (sourceFrom < 0) {
                    throw new ArrayIndexOutOfBoundsException();
            } else if (destinationIndex < 0) {
                    throw new ArrayIndexOutOfBoundsException();
            }

            for (int i = 0; i < numBytes; i++) {
                    array[destinationIndex + i] = source.array[sourceFrom + i];
            }
    }

    /**
     * Conta e retorna a quantidade de bits diferentes de zero no ByteArray.  
     * @return .
     */
    public int countNumActiveBits() {
            int numActiveBits = 0;
            int value;
            final int mask = 1; 

            for (int i = 0; i < array.length; i++) {
                    value = array[i];
                    for (int j = 0; j < 8; j++) {
                            if ((value & mask) != 0) {
                                    numActiveBits++;
                            }
                            value >>= 1;
                    }
            }

            return numActiveBits;
    }

    /**
     * Conta e retorna a quantidade de bytes diferentes de zero no ByteArray.
     * @return .
     */
    public int countNumActiveBytes() {
            int numActiveBytes = 0;

            for (int i = 0; i < array.length; i++) {
                    if (array[i] != 0) {
                            numActiveBytes++;
                    }
            }

            return numActiveBytes;
    }

    /**
     * Conta e retorna a quantidade de palavras (de tamanho
     * <code>wordSize</code>) diferentes de zero no ByteArray.
     * 
     * @param wordSize tamanho das palavras
     * @return .
     */
    public int countNumActiveWords(int wordSize) {
        int result = 0;

        for (int i = 0; i < amountOfWords(wordSize); i++) 
            if(getWord(wordSize, i) != 0)
                result++;
        
        return result;
    }

    /**
     * Retorna verdadeiro se o i-ésimo byte deste ByteArray é igual ao i-ésimo
     * byte de <code>other</code>, para todo i entre 0 e tamanho do ByteArray.
     * Ambos precisam ter o mesmo comprimento, caso contrário, retorn falso.
     * @param other .
     * @return .
     */
    public boolean equals(ByteArray other) {
        if (array.length != other.array.length) {
            return false;
        }

        return Arrays.equals(array, other.array);
    }

    /**
     * Retorna o valor do byte na posição <code>position</code>.
     * @param position .
     * @return .
     */
    public short get(int position) {
            return array[position];
    }

    /**
     * DEVERIA SER DESCONTINUADO
     * 
     * Retorna uma cópia do array interno do ByteArray.
     * @return .
     */
    public short[] getArray() {
        return Arrays.copyOf(array,array.length);
    }
    
    /**
     * Retorna um novo ByteArray com os primeiros 'amount' bytes iguais ao
     * deste.
     * @param amount .
     * @return .
     */
    public ByteArray getFirstBytes(int amount) {
        ByteArray result = new ByteArray(amount);
        for (int i = 0; i < amount; i++) {
            result.set(i, this.get(i));
        }
        return result;
    }
    /**
     * Retorna um novo ByteArray com os bytes entre 'initialByte'(inclusive) e 
     * 'finalByte'(exclusivo).
     * 
     * @param initialByte
     * @param finalByte
     * @return .
     */
    public ByteArray getSubBytes(int initialByte, int finalByte) {
        if(finalByte <= initialByte)
            throw new RuntimeException("finalbyte must be bigger than initial");
        ByteArray result = new ByteArray(finalByte - initialByte);
        for (int i = 0; i < result.length(); i++) {
            result.set(i, this.get(i+initialByte));
        }
        return result;
    }
    /**
     * DEVERIA SER DESCONTINUADO (SUBSTITUÍDO PELO XOR)
     * 
     * Returns the byte-wise XOR difference of this byte array and the given <code>other</code> byte array.
     * @param other .
     * @return Returns a copy, does not modify the current byte array, does not modify the other byte array.
     * @throws Error If the lengths are not equal.
     */
    public ByteArray getDifference(ByteArray other) {
        if (other.length() != length()) 
            throw new RuntimeException("Comprimentos não são iguais: " +
                length() + " e " + other.length() + ".");
        ByteArray result = this.clone();
        result.autoXor(other);
        return result;
    }
    
    /**
     * Retorna o valor da palavra na posição <code>position</code> deste
     * ByteArray. 
     * 
     * @param wordSize tamanho da palavra (apenas 4 ou 8)
     * @param position posição da palavra
     * @return .
     * @exception RuntimeException Aceita apenas bytes ou nibbles 
     */
    public int getWord(int wordSize, int position){
        if(wordSize == 4) return getNibble(position);
        if(wordSize == 8) return get(position);
        throw new RuntimeException("O tamanho de palavra passado ainda não foi implementado: "+wordSize);
    }

    /**
     * Altera o valor da palavra na posição <code>position</code> deste
     * ByteArray por <code>value</code>. 
     * 
     * @param wordSize tamanho da palavra (apenas 4 ou 8)
     * @param position posição da palavra
     * @param value valor a ser inserido na posição
     * @exception RuntimeException Aceita apenas bytes ou nibbles 
     */
    public void setWord(int wordSize, int position, int value){
        switch (wordSize) {
            case 4:
                setNibble(position, value);
                break;
            case 8:
                set(position, value);
                break;
            default:
                throw new RuntimeException("O tamanho de palavra passado ainda não foi implementado: "+wordSize);
        }
    }

    /**
     * Retorna o valor do nibble na posição <code>position</code> deste
     * ByteArray. 
     * 
     * @param position posição da palavra 
     * @return  .
     */
    public int getNibble(int position) {
//        System.out.println("getNibble: "+position);
        if ((position & 1) == 0)
            return (array[position / 2]  >> 4) & 0xF;
        else
            return array[(--position) / 2] & 0xF;
    }

    /**
     * Retorna verdadeiro se todos os bytes deste ByteArray estão ativados (são
     * diferentes de zero).
     * @return .
     */
    public boolean isFullyActive() {
        for (int i = 0; i < array.length; i++) 
            if (array[i] == 0) 
                return false;
        return true;
    }


    /**
     * Seta todos os bytes deste ByteArray em um valor aleatório entre 
     * [0 - 255] e o retorna.
     * @return .
     */
    public ByteArray randomize() {
        for (int i = 0; i < array.length; i++) 
            array[i] = (short)(Math.round(Math.random() * 0xFF) & 0xFF);
        return this;
    }
    
    /**
     * Seta o byte na posição <code>position</code> deste ByteArray com o valor
     * <code>value</code> e o retorna.
     * @param position .
     * @param value .
     * @return 
     */
    public final ByteArray set(int position, int value) {
            array[position] = (short)(value & 0xFF);
            return this;
    }

    /**
     * Seta o nibble na posição <code>position</code> deste ByteArray com o
     * valor <code>value</code>.
     * @param position .
     * @param value .
     * @return retorna uma referência a este ByteArray.
     */
    public ByteArray setNibble(int position, int value) {
        int byteIndex = (int)(position / 2);

        if ((position & 0x1) == 0) { // is even => set higher four bits
            array[byteIndex] = (short)((array[byteIndex] & 0x0F) | ((value << 4) & 0xF0));
        } else { // is odd => set lower four bits
            array[byteIndex] = (short)((array[byteIndex] & 0xF0) | (value & 0xF));
        }
        return this;
    }

    /**
     * DEVERIA SER DESCONTINUADO (APENAS USADO NO ATAQUE SERPENT)
     * 
     * Retorna uma deepcopy que copia os elementos deste ByteArray a partir do
     * índice <code>from</code> até o índice <code>to</code>, incluindo 
     * <code>from</code>, e excluindo <code>to</code>. No resultado, esses 
     * valores são colocados no range <code>0 --- (to - from - 1)</code>.
     * @param from .
     * @param to .
     * @return .
     */
    public ByteArray splice(int from, int to) {
            ByteArray result = new ByteArray(to - from);
            int max = to - from;

            for (int i = 0; i < max; i++) {
                result.array[i] = array[i + from];
            }

            return result;
    }

    /**
     * DEVERIA SER DESCONTINUADO (APENAS USADO NO ATAQUE SERPENT).
     * 
     * @param position .
     * @return .
     */    
    public int readUInt(int position) {
            return (array[position] & 0xff) << 24 
                    | (array[position + 1] & 0xff) << 16
                    | (array[position + 2] & 0xff) << 8
                    | (array[position + 3] & 0xff);
    }

    /**
     * DEVERIA SER DESCONTINUADO (APENAS USADO NO ATAQUE SERPENT).
     * 
     * @return .
     */ 
    public int[] readUInts() {
            final int numWords = array.length / 4;
            final int[] result = new int[numWords];

            for (int i = 0, index = 0; i < array.length; i += 4, index++) {
                    result[index] = (array[i] & 0xff) << 24
                            | (array[i + 1] & 0xff) << 16
                            | (array[i + 2] & 0xff) << 8
                            | (array[i + 3] & 0xff);
            }

            return result;
    }
    
    /**
     * DEVERIA SER DESCONTINUADO (APENAS USADO NO ATAQUE SERPENT).
     * 
     * @param position .
     * @param value .
     */ 
    public void writeUInt(int position, int value) {
            array[position] = (short)((value >>> 24) & 0xff);
            array[position + 1] = (short)((value >>> 16) & 0xff);
            array[position + 2] = (short)((value >>> 8) & 0xff);
            array[position + 3] = (short)(value & 0xff);
    }

    /**
     * DEVERIA SER DESCONTINUADO (APENAS USADO NO ATAQUE SERPENT).
     * 
     * @param words .
     */     
    public void writeUInts(int[] words) {
            for (int i = 0; i < words.length; i++) {
                    writeUInt(0 + 4 * i, words[i]);
            }
    }
    
    /**
     * Cria uma List de ByteArray composta por pedaços de tamanho
     * <code>chunkSize</code> deste ByteArray.
     * 
     * @param chunkSize .
     * @return .
     */ 
    public ArrayList<ByteArray> split(int chunkSize){
        ArrayList<ByteArray> result = new ArrayList<>();
        ByteArray aux;
        for (int i = 0; i < this.length()/chunkSize; i++) {
            aux = new ByteArray(chunkSize);
            aux.copyBytes(this,i*chunkSize, 0,chunkSize);
            result.add(aux);
        }
        return result;
    }

    /**
     * Retorna uma List com as posições das palavras ativas deste ByteArray. 
     * Somente são aceitos nibbles e bytes.
     * 
     * @param wordsize tamanho da palavra (deve ser 4 ou 8)
     * @return .
     */ 
    public ArrayList<Integer> getActiveWords(int wordsize){
        if(wordsize == 8) return getActiveBytes();
        if(wordsize == 4) return getActiveNibbles();
        throw new RuntimeException("ByteArray.getActiveWords() não implementado"
                            + "para este tamanho de palavra: '"+wordsize+"'");
    }

    /**
     * Retorna uma List com as posições dos nibbles ativos deste ByteArray.
     * 
     * @return .
     */ 
    public ArrayList<Integer> getActiveNibbles(){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < this.length()*2; i++) 
            if(this.getNibble(i)!= 0) result.add(i);

        return result;
    }

    /**
     * Retorna uma List com as posições dos bytes ativos deste ByteArray.
     * 
     * @return .
     */ 
    public ArrayList<Integer> getActiveBytes(){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < this.length(); i++) 
            if(this.get(i)!= 0) result.add(i);

        return result;
    }

    /**
     * Altera todos os valores dos bytes deste ByteArray para <code>value</code>.
     * @param value .
     * @param wordSize
     */ 
    public ByteArray fill(int value, WordSize wordSize) {
        if(Math.log(value)/Math.log(2) >= wordSize.value())
            throw new RuntimeException("Value is too big to fill (\\u"+Integer.toBinaryString(value)+").");
        for (int i = 0; i < length(wordSize); i++)
            setWord(wordSize.value(),i, value);
        return this;
    }
    
    @Override
    public String toString() {
        try {
            if (array == null) 
                return "";            

            String output = "", v;
            WordSize wordsize = WordSize.BYTE;
            if(numCols*numRows == length(WordSize.NIBBLE))
                wordsize = WordSize.NIBBLE;
            
            for (int i = 0; i < numRows; i++) {
                if(i > 0) output += "\n ";
                for (int j = 0; j < numCols; j++) {
                    if (j > 0) {
                        if (j % 4 == 0)  output += "|";
                        else  output += ",";                        
                    }

                    v = Integer.toHexString(getWord(wordsize,i, j));

                    if (v.length() < 2 && wordsize == WordSize.BYTE) v = "0" + v;
                    else if (v.length() > 2) v = v.substring(v.length() - 2);
                    
                    output += v;
                }
            }
            return "[" + output + "]";
        } catch (Exception ex) {
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }
        return "";
    }
    
    
    /**
     * Cria uma nova List de ByteArray's dada pelo Xor das List's 'one' e
     * 'other'. As listas devem ter o mesmo tamanho.
     * 
     * @param one List
     * @param other ByteArray que aplicará o XOR.
     * @return a própria instância modificada.
     */
    public static List<ByteArray> xor(List<ByteArray> one, List<ByteArray> other) {
            if (one.size() != other.size())  
                throw new RuntimeException("Both lists must have the same size: "
                            + "one("+one.size()+") != other("+other.size()+")");

            List<ByteArray> result = new ArrayList<>(one.size());
            for (int i = 0; i < one.size(); i++) 
                result.add(ByteArray.xor(one.get(i),other.get(i)));
            
            return result;
    }
    
    /**
     * Cria um novo ByteArray dado pelo Xor de todos os ByteArrays passados.
     * 
     * @param args 
     * @return novo ByteArray dado pelo Xor de todos os ByteArrays passados.
     */
    public static ByteArray xor(ByteArray... args) {
        if(!allSameLength(args)) 
            throw new RuntimeException("All ByteArrays must be of the same size for the xor.");
        ByteArray result = new ByteArray(args[0].length());
        
        for (ByteArray arg : args) result.autoXor(arg);
        
        return result;
    }
    
    /**
     * Cria um novo ByteArray dado pelo passado rotacionado n bits para o lado
     * indicado.
     * 
     * @param b ByteArray original
     * @param n Número de rotações para a esquerda.
     * @param left se true, rotaciona para esquerda e para direita caso
     * contrário.
     * @return novo ByteArray dado pelo Xor de todos os ByteArrays passados.
     */
    public static ByteArray rotateBits(ByteArray b, int n, boolean left) {
        ByteArray result = b.clone();
        result.rotateBits(n, left);
        return result;
    }
    
    /**
     * Cria um novo ByteArray dado pelo passado shiftando n bits para o lado
     * indicado.
     * 
     * @param b ByteArray original
     * @param n Número de rotações para a esquerda.
     * @param left se true, rotaciona para esquerda e para direita caso
     * contrário.
     * @return novo ByteArray dado pelo Xor de todos os ByteArrays passados.
     */
    public static ByteArray shiftBits(ByteArray b, int n, boolean left) {
        ByteArray result = b.clone();
        result.shiftBits(n, left);
        return result;
    }
    
    /**
     * Retorna um ByteArray a partir da String passada no mesmo formato que o
     * produzido pelo método toString desta classe.
     * 
     * @param bytearray versão em string do ByteArray
     * @return 
     */
    public static ByteArray toByteArray(String bytearray) {
        String[] bytes = bytearray.substring(1,bytearray.length()-1).replace('|', ',').split(",");
        ByteArray result = new ByteArray(bytes.length);
        for (int i = 0; i < result.length(); i++)
            result.set(i, Integer.parseInt(bytes[i],16));
        return result;
    }
    /**
     * Retorna uma lista com 'n' ByteArrays de tamanho 'length' composto por 0s
     * 
     * @param length
     * @param n
     * @return 
     */
    public static List<ByteArray> emptyByteArrayList(int length,int n) {
        return nCopies(new ByteArray(length), n);
    }

    private static boolean allSameLength(ByteArray[] arr){
        int length = arr[0].length();
        
        for (int i = 0; i < arr.length; i++) 
            if(length != arr[i].length())
                return false;
            
        
        return true;        
    }
}
