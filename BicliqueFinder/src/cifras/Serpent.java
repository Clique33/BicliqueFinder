/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import util.ByteArray;
import util.Util;
import util.WordSize;

/**
 *
 * @author clique
 */
public class Serpent extends Cipher{
    
    /**
     * Chave Secreta.
     */
    private List<ByteArray> secretKey;
    /**
     * List com todas as subchaves.
     */
    private List<ByteArray> internalExpandedKey;
    
    public Serpent(){
        this(new ByteArray(32), 0);
    }
    public Serpent(ByteArray key, int round){
        super(key, round);
    }

    @Override
    public ByteArray getExpandedKey(ByteArray key, int round) {
        setKey(key, round);
        return getExpandedKey();
    }

    @Override
    public ByteArray getExpandedKey() {
//        System.out.println(internalExpandedKey);
        return ByteArray.concatenateAll(Util.copyList(internalExpandedKey));
    }

    @Override
    public int getAMOUNT_OF_KEYS() {
        return 2;
    }

    @Override
    public int getBLOCK_SIZE_IN_BYTES() {
        return 16;
    }

    @Override
    public int getROUND_KEY_SIZE_IN_BYTES() {
        return 16;
    }

    @Override
    public int getNUM_ROUNDS() {
        return 32;
    }

    @Override
    public int getNUM_KEYS() {
        return 33;
    }

    @Override
    public int getNUM_STATES() {
        return 97;
    }

    @Override
    public int getNUM_SBOXES_TOTAL() {
        int totalStates = getBLOCK_SIZE_IN_WORDS()/getWORD_SIZE() * 32;
        int totalKeys = getKEY_SIZE_IN_BYTES()/getWORD_SIZE()*getNUM_KEYS()*32;
        return totalStates + totalKeys;
    }

    @Override
    public int getWORD_SIZE() {
        return WordSize.NIBBLE.value();
    }

    @Override
    public int getINDEX_OF_PRE_KEY(int state) {
        if(state == 95) return 32;
        if(state % 3 == 0) return state/3;
        return -1;
    }

    @Override
    public int getINDEX_OF_STATE_PRE_KEY(int index) {
        if(index < 0 || index >= getNUM_KEYS()) return -1;
        if(index == 32) return 95;
        return index*3;
    }

    @Override
    public int[] getINDEXES_OF_PRE_SBOX_STATES() {
        return Arrays.copyOfRange(getINDEXES_OF_POST_ADD_KEY(), 0, 32);
    }

    @Override
    public int[] getINDEXES_OF_PRE_ADD_KEY() {
        int []res = new int[getNUM_KEYS()];
        
        for (int i = 0; i < res.length-1; i++) 
            res[i] = i*3;
        res[res.length-1] = 95;
        
        return res;
    }

    @Override
    public int[] getSBOX_RELEVANT_KEY_WORDS() {
        int result[] = new int[getKEY_SIZE_IN_BYTES()];
        for (int i = 0; i < result.length; i++)
            result[i] = i;
        return result;
    }

    @Override
    public int[] getSBOX_RELEVANT_STATE_WORDS() {
        int result[] = new int[getBLOCK_SIZE_IN_BYTES()];
        for (int i = 0; i < result.length; i++)
            result[i] = i;
        return result;
    }

    @Override
    public void setKey(ByteArray key, int round) {
        List<ByteArray> keys = ByteArray.partition(key,2);
        try {
            internalExpandedKey = expandKey(keys, round);
            secretKey = Util.copyList(keys.subList(0, 2));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<ByteArray> encryptForward(ByteArray block, int fromState, int toState) {
        if(toState < fromState)
            throw new RuntimeException("toState must be bigger than fromState.("+toState+"<="+fromState);
        if(toState >= getNUM_STATES()) toState = getNUM_STATES()-1;
        if(fromState < 0) fromState = 0;
        
        ByteArray previous,curr;
        List<ByteArray> result = new ArrayList<>(toState-fromState);
        result.add(block);
        for (int i = fromState; i < toState; i++) {
            previous = result.get(result.size()-1);
        
            if(getINDEX_OF_PRE_KEY(i) != -1)
                curr = addKey(previous, internalExpandedKey.get(getINDEX_OF_PRE_KEY(i)));
            else if(getINDEX_OF_POST_KEY(i) != -1)
                curr = SB(previous, getINDEX_OF_POST_KEY(i));
            else
                curr = L(previous);
            
            result.add(curr);
        }
        
        return result;
    }
    
    

    @Override
    public List<ByteArray> encryptBackwards(ByteArray block, int fromState, int toState) {
        if(fromState < toState)
            throw new RuntimeException("fromState must be bigger than toState.("+fromState+"<="+toState);
        if(fromState >= getNUM_STATES()) fromState = getNUM_STATES()-1;
        if(toState < 0) toState = 0;
        
        List<ByteArray> result = new ArrayList<>(fromState-toState);
        ByteArray curr,previous = block.clone();
        
        for (int i = fromState; i >0; i--) {
        
            if(getINDEX_OF_POST_KEY(i) != -1){
                curr = addKey(previous, internalExpandedKey.get(getINDEX_OF_POST_KEY(i)));
            }
            else if(getINDEX_OF_PRE_KEY(i) != -1){
                if(i  != 95){
                    curr = L_1(previous);
                }
                else{
                    curr = SB_1(previous, getINDEX_OF_PRE_KEY(i)-1);
                }
            }
            else{
                curr = SB_1(previous, getINDEX_OF_POST_KEY(i-1));
            }
            
            result.add(curr);
            previous = result.get(result.size()-1);
        }
        Collections.reverse(result);
        return result;
    }
    
    public static void main(String[] args) {
        Serpent serpent = new Serpent();
        
        int i = 0;
        for (ByteArray b : serpent.encryptFull(new ByteArray(16), 0)) {
            if (i < 10) 
                System.out.println("estado  "+i+++" = "+b);
            else
                System.out.println("estado "+i+++" = "+b);
        }
    }
    
    public ByteArray addKey(ByteArray block, ByteArray key){
        return ByteArray.xor(block,key);
    }
    
    /**
     * Aplica a transformação linear L ao estado, gerando um novo ByteArray.
     * 
     * @param estado
     * @return 
     */
    public ByteArray L(ByteArray estado){
        List<ByteArray> X = ByteArray.nCopies(new ByteArray(4), 4);
        
        for (int i = 0; i < X.size(); i++)
            X.set(i,estado.getSubBytes(i*4,(i+1)*4)); 
        
        X.get(0).rotateBits(13, true);
        X.get(2).rotateBits(3, true);
        X.get(1).autoXor(X.get(1),X.get(0),X.get(3));
        X.get(3).autoXor(X.get(3),X.get(2),ByteArray.shiftBits(X.get(0), 3, true));
        
        X.get(1).rotateBits(1, true);
        X.get(3).rotateBits(7, true);
        X.get(0).autoXor(X.get(0),X.get(1),X.get(3));
        X.get(2).autoXor(X.get(2),X.get(3),ByteArray.shiftBits(X.get(1), 7, true));
        
        X.get(0).rotateBits(5, true);
        X.get(2).rotateBits(22, true);
                
        return ByteArray.concatenateAll(X);
    }
    
    
    /**
     * Aplica a inversa da transformação linear L ao estado, gerando um novo
     * ByteArray.
     * 
     * @param estado
     * @return 
     */
    public ByteArray L_1(ByteArray estado){
        List<ByteArray> X = ByteArray.nCopies(new ByteArray(4), 4);
        
        for (int i = 0; i < X.size(); i++)
            X.set(i,estado.getSubBytes(i*4,(i+1)*4)); 
        
        X.get(2).rotateBits(22, false);
        X.get(0).rotateBits(5, false);
        
        X.get(2).autoXor(X.get(2),X.get(3),ByteArray.shiftBits(X.get(1), 7, true));
        X.get(0).autoXor(X.get(0),X.get(1),X.get(3));
        
        X.get(3).rotateBits(7, false);
        X.get(1).rotateBits(1, false);
        
        X.get(3).autoXor(X.get(3),X.get(2),ByteArray.shiftBits(X.get(0), 3, true));
        X.get(1).autoXor(X.get(1),X.get(0),X.get(3));
        
        X.get(2).rotateBits(3, false);
        X.get(0).rotateBits(13, false);
        
        return ByteArray.concatenateAll(X);
    }
    
    /**
     * Aplica a Sbox Si a todos os nibbles do estado passado.
     * 
     * @param estado 
     * @param i
     * @return 
     */
    public ByteArray SB(ByteArray estado, int i){
        ByteArray result = new ByteArray(estado.length());
        
        for (int j = 0; j < estado.length(WordSize.NIBBLE); j++)
            result.setNibble(j, SBOX[i][estado.getNibble(j)]);
        
        return result;
    }
    
    /**
     * Aplica a Sbox Si a todos os nibbles do estado passado.
     * 
     */
    public ByteArray SB_1(ByteArray estado, int i){
        ByteArray result = new ByteArray(estado.length());
        
        for (int j = 0; j < estado.length(WordSize.NIBBLE); j++)
            result.setNibble(j, INVERSE_SBOX[i][estado.getNibble(j)]);
        
        return result;
    }
    
    private List<ByteArray> expandKey(List<ByteArray> keys, int round) {        
        List<ByteArray> W = generateW(keys, round);
        List<ByteArray> K = ByteArray.nCopies(new ByteArray(4), W.size());
        for (int i = 0; i < K.size(); i++) {
//            System.out.println("i "+i+" : SB"+getSboxIndex(i));
            for (int j = 0; j < K.get(i).length()*2; j++) {
                K.get(i).setNibble(j, SBOX[getSboxIndex(i)][W.get(i).getNibble(j)]);
            }
        }
//        int i = 0;
//        for (ByteArray b : K)
//            System.out.println("K"+i+++" : "+ b);
        List<ByteArray> result = new ArrayList<>(getNUM_KEYS());
        for (int i = 0; i < getNUM_KEYS(); i++) 
            result.add(Util.concat(K.get(4*i+0),K.get(4*i+1),K.get(4*i+2),K.get(4*i+3)));
        
        return result;
    }
    
    /**
     * Cria W a partir de duas subchaves em sequência.
     */
    private List<ByteArray> generateW(List<ByteArray> keys, int round){
        if(round > getNUM_KEYS()-2 || round < 0)
            throw new RuntimeException("Maximum key round is "+(getNUM_KEYS()-2));
        if(keys.size() != 2)
            throw new RuntimeException("The amount of necessary keys is 2.");
        if(keys.get(0).getNumCols() > getROUND_KEY_SIZE_IN_BYTES()||
           keys.get(1).getNumCols() > getROUND_KEY_SIZE_IN_BYTES())
            throw new RuntimeException("Each key must have "+getKEY_SIZE_IN_BYTES()+" bytes.");
        
        List<ByteArray> W = ByteArray.nCopies(new ByteArray(4),
                                                      getNUM_KEYS()*4);
        ByteArray curr;
        ByteArray bytearrayi = new ByteArray(4);
        
        setWi(W, keys.get(0), round, true);
        setWi(W, keys.get(1), round+1, true);
        
        int indexFirstWordSet = getWordIndex(round)[0];
        int indexLastWordSet = getWordIndex(round+1)[3];
        
        for (int i = indexLastWordSet+1; i < W.size(); i++) {
            bytearrayi.set(0, i);
            curr = ByteArray.xor(W.get(i-8),W.get(i-5),W.get(i-3),W.get(i-1),PHI,bytearrayi);
            curr.rotateBits(11, true);
            W.get(i).autoXor(curr);
        }
        for (int i = indexFirstWordSet-1; i >= 0; i--) {
            bytearrayi.set(0, i+8);
            curr = W.get(i+8).clone();
            curr.rotateBits(11, false);
            curr = ByteArray.xor(curr,W.get(i+7),W.get(i+5),W.get(i+3),PHI,bytearrayi);
            W.get(i).autoXor(curr);
        }
        
        return W;
    }
    
    /**
     * Modifica W adicionando as chaves.
     */
    private void setWi(List<ByteArray> W, ByteArray key, int round, boolean inverse){
        int[][] SB = getSbox(inverse);
        int [] aux = getWordIndex(round);
        int k = 0;
        for (int i : aux) 
            for (int j = 0; j < 8; j++)
                W.get(i).setNibble(j, SB[getSboxIndex(i)][key.getNibble(k++)]);
    }
    
    /**
     * Retorna SBOX ou INVERSE_SBOX.
     */
    private int[][] getSbox(boolean inverse){
        return inverse ? INVERSE_SBOX : SBOX;
    }
    
    /**
     * Retorna o índice da Sbox para a palavra Wi das subchaves.
     */
    private int getSboxIndex(int i){
        return (35-(i%33))%32 > 0 ? (35-(i%33))%32 : -((35-(i%33))%32);
    }
    
    /**
     * Retorna os índices das palavras Wi da subchave na rodada passada.
     */
    private int[] getWordIndex(int round){
        
        return new int[]{round*4,round*4+1,round*4+2,round*4+3};
    }
    
    /**
     * Dados da cifra.
     */
    private static final int[][] SBOX = {
                            {14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},
                            {0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},
                            {4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},
                            {15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13},
                            {15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},
                            {3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},
                            {0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},
                            {13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9},
                            {10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},
                            {13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},
                            {13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},
                            {1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12},
                            {7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},
                            {13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},
                            {10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},
                            {3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14},
                            {2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},
                            {14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},
                            {4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},
                            {11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3},
                            {12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},
                            {10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},
                            {9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},
                            {4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13},
                            {4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},
                            {13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},
                            {1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},
                            {6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12},
                            {13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},
                            {1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},
                            {7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},
                            {2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}
    };
    
    private static final int[][] INVERSE_SBOX = {
                            {14, 3, 4, 8, 1, 12, 10, 15, 7, 13, 9, 6, 11, 2, 0, 5},
                            {0, 7, 5, 14, 3, 13, 9, 2, 15, 12, 8, 11, 10, 6, 4, 1},
                            {15, 1, 6, 12, 0, 14, 5, 11, 3, 10, 13, 7, 9, 4, 2, 8},
                            {13, 6, 3, 10, 4, 8, 14, 7, 2, 5, 12, 9, 1, 15, 11, 0},
                            {13, 1, 10, 6, 7, 14, 4, 9, 2, 8, 15, 5, 12, 11, 3, 0},
                            {9, 10, 5, 0, 2, 15, 12, 3, 6, 13, 11, 14, 8, 1, 7, 4},
                            {0, 7, 14, 13, 5, 8, 11, 2, 9, 12, 4, 3, 10, 6, 1, 15},
                            {12, 3, 7, 4, 6, 13, 9, 10, 1, 15, 2, 8, 11, 0, 14, 5},
                            {1, 8, 14, 5, 13, 7, 4, 11, 15, 2, 0, 12, 10, 9, 3, 6},
                            {2, 15, 8, 4, 5, 10, 6, 1, 9, 3, 7, 13, 12, 0, 11, 14},
                            {7, 9, 10, 6, 2, 12, 1, 15, 4, 3, 13, 8, 11, 0, 14, 5},
                            {3, 0, 14, 11, 8, 13, 4, 7, 6, 5, 1, 12, 15, 2, 10, 9},
                            {4, 8, 9, 3, 14, 11, 5, 0, 10, 6, 7, 12, 13, 1, 2, 15},
                            {6, 12, 10, 7, 8, 3, 4, 9, 1, 15, 13, 2, 11, 0, 14, 5},
                            {3, 9, 13, 10, 15, 12, 1, 6, 14, 2, 0, 5, 4, 7, 11, 8},
                            {2, 5, 14, 0, 9, 10, 3, 13, 7, 8, 4, 11, 12, 6, 15, 1},
                            {13, 3, 0, 10, 2, 9, 7, 4, 8, 15, 5, 6, 1, 12, 14, 11},
                            {9, 7, 2, 12, 4, 8, 15, 5, 14, 13, 11, 1, 3, 6, 0, 10},
                            {14, 2, 1, 13, 0, 11, 12, 6, 7, 9, 4, 3, 10, 5, 15, 8},
                            {10, 4, 6, 15, 13, 14, 8, 3, 1, 11, 12, 0, 2, 7, 5, 9},
                            {8, 1, 5, 10, 11, 14, 6, 13, 7, 4, 2, 15, 0, 9, 12, 3},
                            {12, 9, 3, 14, 2, 7, 8, 4, 15, 6, 0, 13, 5, 10, 11, 1},
                            {9, 12, 4, 7, 10, 3, 15, 8, 5, 0, 11, 14, 6, 13, 1, 2},
                            {13, 10, 2, 1, 0, 5, 12, 11, 14, 4, 7, 8, 3, 15, 9, 6},
                            {5, 15, 2, 8, 0, 12, 14, 11, 6, 10, 13, 1, 9, 7, 3, 4},
                            {1, 6, 12, 9, 4, 10, 15, 3, 14, 5, 7, 2, 11, 0, 8, 13},
                            {12, 0, 15, 5, 1, 13, 10, 6, 11, 14, 8, 2, 4, 3, 7, 9},
                            {10, 4, 13, 14, 5, 9, 0, 7, 3, 8, 6, 1, 15, 2, 12, 11},
                            {13, 7, 1, 10, 3, 12, 4, 15, 2, 9, 8, 6, 14, 0, 11, 5},
                            {12, 0, 15, 5, 7, 9, 10, 6, 3, 14, 4, 11, 8, 2, 13, 1},
                            {8, 3, 7, 13, 2, 14, 9, 0, 15, 4, 10, 1, 5, 11, 6, 12},
                            {11, 1, 0, 12, 4, 13, 14, 3, 6, 10, 5, 15, 9, 7, 2, 8}

    };
    private static final ByteArray PHI = new ByteArray(Util.getBytes(0x9e3779b9));
}
