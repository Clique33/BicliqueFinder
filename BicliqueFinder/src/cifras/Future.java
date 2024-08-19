/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.ByteArray;
import util.WordSize;

/**
 *
 * @author clique
 */
public class Future extends Cipher{
    
    public static final int S[] ={
            1  , 3  , 0  , 2  , 
            7  , 0xe, 4  , 0xd, 
            9  , 0xa, 0xc, 6  , 
            0xf, 5  , 8  , 0xb
    };
    public static final int IS[] = {
            2  , 0  , 3  , 1  , 
            6  , 0xd, 0xb, 4  , 
            0xe, 8  , 9  , 0xf, 
            0xa, 7  , 5  , 0xc
    };
    public static final ByteArray RC[] = {
        new ByteArray(8),//{00,00,00,00,00,00,00,00}
        new ByteArray(8)
            .set(0, 0x12)//{12,48,24,81,48,12,81,24},
            .set(1, 0x48)
            .set(2, 0x24)
            .set(3, 0x81)
            .set(4, 0x48)
            .set(5, 0x12)
            .set(6, 0x81)
            .set(7, 0x24),
        new ByteArray(8)
            .set(0, 0x24)//{24,81,48,12,81,24,12,48}
            .set(1, 0x81)
            .set(2, 0x48)
            .set(3, 0x12)
            .set(4, 0x81)
            .set(5, 0x24)
            .set(6, 0x12)
            .set(7, 0x48),
        new ByteArray(8)
            .set(0, 0x48)//{48,12,81,24,12,48,24,81}
            .set(1, 0x12)
            .set(2, 0x81)
            .set(3, 0x24)
            .set(4, 0x12)
            .set(5, 0x48)
            .set(6, 0x24)
            .set(7, 0x81),
        new ByteArray(8)
            .set(0, 0x81)//{81,24,12,48,24,81,48,12}
            .set(1, 0x24)
            .set(2, 0x12)
            .set(3, 0x48)
            .set(4, 0x24)
            .set(5, 0x81)
            .set(6, 0x48)
            .set(7, 0x12),
        new ByteArray(8),//{00,00,00,00,00,00,00,00}
        new ByteArray(8)
            .set(0, 0x12)//{12,48,24,81,48,12,81,24},
            .set(1, 0x48)
            .set(2, 0x24)
            .set(3, 0x81)
            .set(4, 0x48)
            .set(5, 0x12)
            .set(6, 0x81)
            .set(7, 0x24),
        new ByteArray(8)
            .set(0, 0x24)//{24,81,48,12,81,24,12,48}
            .set(1, 0x81)
            .set(2, 0x48)
            .set(3, 0x12)
            .set(4, 0x81)
            .set(5, 0x24)
            .set(6, 0x12)
            .set(7, 0x48),
        new ByteArray(8)
            .set(0, 0x48)//{48,12,81,24,12,48,24,81}
            .set(1, 0x12)
            .set(2, 0x81)
            .set(3, 0x24)
            .set(4, 0x12)
            .set(5, 0x48)
            .set(6, 0x24)
            .set(7, 0x81),
        new ByteArray(8)
            .set(0, 0x81)//{81,24,12,48,24,81,48,12}
            .set(1, 0x24)
            .set(2, 0x12)
            .set(3, 0x48)
            .set(4, 0x24)
            .set(5, 0x81)
            .set(6, 0x48)
            .set(7, 0x12),
        new ByteArray(8),//{00,00,00,00,00,00,00,00}
    };
    
    /**
     * Chave Secreta.
     */
    private ByteArray secretKey;
    /**
     * List com todas as subchaves.
     */
    private ArrayList<ByteArray> internalExpandedKey;
    
    public Future() {
        this(new ByteArray(16), 0);
    }
    public Future(ByteArray key, int round){
        super(key, round);
    }

    @Override
    public ByteArray getExpandedKey(ByteArray key, int round) {        
        return ByteArray.concatenateAll(internalExpandedKey);
    }

    @Override
    public ByteArray getExpandedKey() {
        return getExpandedKey(secretKey, 0);
    }

    @Override
    public int getAMOUNT_OF_KEYS() {
        return 2;
    }

    @Override
    public int getBLOCK_SIZE_IN_BYTES() {
        return 8;
    }

    @Override
    public int getROUND_KEY_SIZE_IN_BYTES() {
        return 8;
    }

    @Override
    public int getNUM_ROUNDS() {
        return 10;
    }

    @Override
    public int getNUM_KEYS() {
        return 11;
    }

    @Override
    public int getNUM_STATES() {
        return 41;
    }

    @Override
    public int getNUM_SBOXES_TOTAL() {
        return 16*getINDEXES_OF_PRE_SBOX_STATES().length; //sboxes of states
    }

    @Override
    public int getWORD_SIZE() {
        return WordSize.NIBBLE.value();
    }

    @Override
    public int[] getINDEXES_OF_PRE_SBOX_STATES() {
        int[] result = {1,5,9,13,17,21,25,29,33,37};
        return result;
    }

    @Override
    public int[] getINDEXES_OF_PRE_ADD_KEY() {
        int[] result = {0,4,8,12,16,20,24,28,32,36,39};
        return result;
    }

    @Override
    public int[] getSBOX_RELEVANT_KEY_WORDS() {
        int result[] = new int[getBLOCK_SIZE_IN_WORDS()];
        for (int i = 0; i < result.length; i++) result[i] = i;
        return result;
    }

    @Override
    public int[] getSBOX_RELEVANT_STATE_WORDS() {
        int result[] = new int[getBLOCK_SIZE_IN_WORDS()];
        for (int i = 0; i < result.length; i++) result[i] = i;
        return result;
    }
    
    @Override
    public void setKey(ByteArray key, int round) {
        internalExpandedKey = expandKey(key, round);
        secretKey = key.clone();
    }

    public ArrayList<ByteArray> expandKey(ByteArray key, int round) {
//        System.out.println("expandKey("+key+","+round+")");
        ArrayList<ByteArray> result = new ArrayList<>(getNUM_KEYS());
        List<ByteArray> X = ByteArray.partition(key, 2);
        ByteArray bytearray;
        int a = 0, b = 1;
        
        if(round%2 == 1){
            bytearray = X.get(0);
            X.set(0, X.get(1));
            X.set(1, bytearray);
//            System.out.println("before X: "+X);
            X.get(0).autoXor(RC[round+1]);
            X.get(1).autoXor(RC[round]);
//            System.out.println("middle X: "+X);
            X.get(0).rotateBits(5 * ((round+1)/2), false);
            X.get(1).rotateBits(5 * Math.floorDiv(round,2), false);
        }else if(round != 0){
//            System.out.println("before X: "+X);
            X.get(0).autoXor(RC[round]);
            X.get(1).autoXor(RC[round+1]);
//            System.out.println("middle X: "+X);
            X.get(0).rotateBits(5 * (round/2), false);
            X.get(1).rotateBits(5 * Math.floorDiv(round+1,2), false);
        }
//        System.out.println("after  X: "+X);
        
        
        for (int i = 0; i < getNUM_KEYS(); i++) {
            if(i % 2 == 1){
                bytearray = X.get(1).clone();
                bytearray.rotateBits(5 * Math.floorDiv(i,2), true);
                bytearray.autoXor(RC[i]);
            }else{
                bytearray = X.get(0).clone();
                bytearray.rotateBits(5 * (i/2), true);
                bytearray.autoXor(RC[i]);
            }
            result.add(bytearray);
        }
        return (ArrayList<ByteArray>)result;
    }

    @Override
    public ArrayList<ByteArray> encryptForward(ByteArray block, int fromState, int toState) {
        ArrayList<ByteArray> internalStates = new ArrayList<>();
        ByteArray currBlock = block.clone();
        internalStates.add(block);
        
        for (int i = fromState; i < toState; i++) {
            switch (i%4) {
                case 0:
                    currBlock = addKey(currBlock, internalExpandedKey.get(i/4));
                    internalStates.add(currBlock);
                    break;
                case 1:
                    currBlock = subBytes(currBlock);
                    internalStates.add(currBlock);
                    break;
                case 2:
                    if(i != 38) currBlock = mixCollumns(currBlock);
                    else currBlock = shiftRows(currBlock);
                    internalStates.add(currBlock);
                    break;
                default:
                    
                    if(i != 39) currBlock = shiftRows(currBlock);
                    else currBlock = addKey(currBlock, internalExpandedKey.get(10));
                    internalStates.add(currBlock);
                    break;
            }
        }
        
        return internalStates;       
    }

    @Override
    public ArrayList<ByteArray> encryptBackwards(ByteArray block, int fromState, int toState) {
        ArrayList<ByteArray> internalStates = new ArrayList<>();
        ByteArray currBlock = block.clone();
        
        for (int i = fromState; i > toState; i--) {
            switch (i%4) {
                case 3:
                    if(i != 39) currBlock = invertedMixCollumns(currBlock);
                    else currBlock = invertedShiftRows(currBlock);
                    internalStates.add(currBlock);
                    break;
                case 2:
                    currBlock = invertedSubBytes(currBlock);
                    internalStates.add(currBlock);
                    break;
                case 1:
                    currBlock = addKey(currBlock,internalExpandedKey.get((i-1)/4));
                    internalStates.add(currBlock);
                    break;
                default:
                    if(i != 40) currBlock = invertedShiftRows(currBlock);
                    else currBlock = addKey(currBlock,internalExpandedKey.get(10));
                    internalStates.add(currBlock);
                    break;
            }
        }
        internalStates = ByteArray.reverse(internalStates);
        
        return internalStates; 
    }

    private ByteArray addKey(ByteArray block, ByteArray key) {
        return block.clone().autoXor(key);
    }

    public ByteArray subBytes(ByteArray block) {
        ByteArray result = block.clone();
        for (int i = 0; i < block.length(WordSize.NIBBLE); i++) 
            result.setNibble(i, S[block.getNibble(i)]);
        return result;
    }

    public ByteArray invertedSubBytes(ByteArray block) {
        ByteArray result = block.clone();
        for (int i = 0; i < block.length(WordSize.NIBBLE); i++) 
            result.setNibble(i, IS[block.getNibble(i)]);
        
        return result;
    }

    public ByteArray shiftRows(ByteArray block) {
        ByteArray result = block.clone();
        String originalShape = result.getShape(WordSize.NIBBLE);
        
        if(!originalShape.equals("4x4")) result.setShape("4x4", WordSize.NIBBLE);
        for (int i = 0; i < result.getNumRows(); i++) 
            for (int j = 0; j < result.getNumRows()-i; j++) result.rotateRow(i, WordSize.NIBBLE);
        if(!originalShape.equals("4x4")) result.setShape(originalShape, WordSize.NIBBLE);
                   
        return result;
    }
    
    public ByteArray invertedShiftRows(ByteArray block) {
        ByteArray result = block.clone();
        String originalShape = result.getShape(WordSize.NIBBLE);
        if(!originalShape.equals("4x4")) result.setShape("4x4", WordSize.NIBBLE);
        for (int i = 0; i < result.getNumRows(); i++) 
            for (int j = 0; j < i; j++)
                result.rotateRow(i, WordSize.NIBBLE);
        if(!originalShape.equals("4x4")) result.setShape(originalShape, WordSize.NIBBLE);
                   
        return result;
    }
    
    public ByteArray mixCollumns(ByteArray block) {
        ByteArray result = block.clone();
        
        for (int i = 0; i < 4; i++) {
            result.setNibble(i,     multiplicaGF16(8, block.getNibble(i)) ^ 
                                    multiplicaGF16(9, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(1, block.getNibble(i+8)) ^
                                    multiplicaGF16(8, block.getNibble(i+12))
            ); 
            result.setNibble(i+4,   multiplicaGF16(3, block.getNibble(i)) ^ 
                                    multiplicaGF16(2, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(9, block.getNibble(i+8)) ^
                                    multiplicaGF16(9, block.getNibble(i+12))
            ); 
            result.setNibble(i+8,   multiplicaGF16(2, block.getNibble(i)) ^ 
                                    multiplicaGF16(3, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(8, block.getNibble(i+8)) ^
                                    multiplicaGF16(9, block.getNibble(i+12))
            ); 
            result.setNibble(i+12,  multiplicaGF16(9, block.getNibble(i)) ^ 
                                    multiplicaGF16(9, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(8, block.getNibble(i+8)) ^
                                    multiplicaGF16(1, block.getNibble(i+12))
            ); 
        }
        
        return result;
    }
    public ByteArray invertedMixCollumns(ByteArray block) {
//        possivel inversa
//        [1 , 8 , 9, 9]
//        [13, 4 , 8, 1]
//        [13, 13, 1, 8]
//        [8 , 1 , 9, 8]
//        possivel inversa
//        [1, 13, 13, 8]
//        [8, 4 , 13, 1]
//        [9, 8, 1 , 9]
//        [9, 1 , 8 , 8]
        ByteArray result = block.clone();
        
        for (int i = 0; i < 4; i++) {
            result.setNibble(i,     multiplicaGF16(1 , block.getNibble(i)) ^ 
                                    multiplicaGF16(13, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(13, block.getNibble(i+8)) ^
                                    multiplicaGF16(8 , block.getNibble(i+12))
            ); 
            result.setNibble(i+4,   multiplicaGF16(8, block.getNibble(i)) ^ 
                                    multiplicaGF16(4, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(13, block.getNibble(i+8)) ^
                                    multiplicaGF16(1, block.getNibble(i+12))
            ); 
            result.setNibble(i+8,   multiplicaGF16(9, block.getNibble(i)) ^ 
                                    multiplicaGF16(8, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(1, block.getNibble(i+8)) ^
                                    multiplicaGF16(9, block.getNibble(i+12))
            ); 
            result.setNibble(i+12,  multiplicaGF16(9, block.getNibble(i)) ^ 
                                    multiplicaGF16(1, block.getNibble(i+4)) ^ 
                                    multiplicaGF16(8, block.getNibble(i+8)) ^
                                    multiplicaGF16(8, block.getNibble(i+12))
            ); 
        }
        
        return result;
    }
    
    public void next(int vet[], int min, int max){
        boolean carry = true;
        for (int i = vet.length-1; i >= 0; i--) {
            if(carry){
                if(++vet[i] == max){
                    vet[i] = min;
                    carry = true;
                }else 
                    carry = false;
            }else 
                break;
        }
        
    }
    
    private List<int[]> possibilidades(int row[][], int right[]){
        int possibilidades[] = {1,1,1,1};
        int base[] = {1,1,1,1};
        List<int[]> result = new ArrayList<>();
        boolean fim = false;
        
        while(true){
                if((multiplicaGF16(row[0][0], possibilidades[0]) ^
                    multiplicaGF16(row[0][1], possibilidades[1]) ^
                    multiplicaGF16(row[0][2], possibilidades[2]) ^
                    multiplicaGF16(row[0][3], possibilidades[3])) == right[0]){
                        if((multiplicaGF16(row[1][0], possibilidades[0]) ^
                        multiplicaGF16(row[1][1], possibilidades[1]) ^
                        multiplicaGF16(row[1][2], possibilidades[2]) ^
                        multiplicaGF16(row[1][3], possibilidades[3])) == right[1]){
                            if((multiplicaGF16(row[2][0], possibilidades[0]) ^
                            multiplicaGF16(row[2][1], possibilidades[1]) ^
                            multiplicaGF16(row[2][2], possibilidades[2]) ^
                            multiplicaGF16(row[2][3], possibilidades[3])) == right[2]){
                                if((multiplicaGF16(row[3][0], possibilidades[0]) ^
                                multiplicaGF16(row[3][1], possibilidades[1]) ^
                                multiplicaGF16(row[3][2], possibilidades[2]) ^
                                multiplicaGF16(row[3][3], possibilidades[3])) == right[3]){
                                    result.add(Arrays.copyOf(possibilidades, 4));
                                }
                            }
                        }
                }  
                next(possibilidades, 1, 16);
                if(Arrays.equals(base, possibilidades)) break;
            }
        return result;
    } 
        
    public ByteArray possibleInvertedMixCollumns(ByteArray block) {
        int base[] = {1,1,1,1};
        int p[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        int mds[][] = {
            {8,9,1,8},
            {3,2,9,9},
            {2,3,8,9},
            {9,9,8,1}
        };
        
        List<int[]> linha0 = possibilidades(mds, new int[]{1,0,0,0});
        System.out.println("linha0");
        for (int[] poss : linha0) {
            System.out.println(Arrays.toString(poss));
        }
        
        List<int[]> linha1 = possibilidades(mds, new int[]{0,1,0,0});
        System.out.println("linha1");
        for (int[] poss : linha1) {
            System.out.println(Arrays.toString(poss));
        }
        List<int[]> linha2 = possibilidades(mds, new int[]{0,0,1,0});
        System.out.println("linha2");
        for (int[] poss : linha2) {
            System.out.println(Arrays.toString(poss));
        }
        List<int[]> linha3 = possibilidades(mds, new int[]{0,0,0,1});
        System.out.println("linha3");
        for (int[] poss : linha3) {
            System.out.println(Arrays.toString(poss));
        }
        
        int invmds[][] = {
            {1, 13, 13, 8},
            {8, 4 , 13, 1},
            {9, 8, 1 , 9},
            {9, 1 , 8 , 8}
        };
        System.out.println("invmds : "+Arrays.deepToString(invmds));
        int result[][] = {
            {1,9,1,8},
            {8,2,9,9},
            {9,3,8,9},
            {9,9,8,1}
        };
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    result[i][j] ^= multiplicaGF16(mds[i][k],invmds[k][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        long cont = 0;
        int aux;
//        do{
//            while( (multiplicaGF16(8, possibilidades[0][0]) ^
//                    multiplicaGF16(9, possibilidades[0][1]) ^
//                    multiplicaGF16(1, possibilidades[0][2]) ^
//                    multiplicaGF16(8, possibilidades[0][3])) != 1
//            ){
//                next(possibilidades[0], 1, 16);
//            }
////            System.out.println("atual0 : "+ Arrays.toString(possibilidades[0]));
//            next(possibilidades[1], 1, 16);
//            while( (multiplicaGF16(3, possibilidades[1][0]) ^
//                    multiplicaGF16(2, possibilidades[1][1]) ^
//                    multiplicaGF16(9, possibilidades[1][2]) ^
//                    multiplicaGF16(9, possibilidades[1][3])) != 0
//            ){
//                next(possibilidades[1], 1, 16);
//            }
////            System.out.println("atual1 : "+ Arrays.toString(possibilidades[1]));
//            next(possibilidades[2], 1, 16);
//            while( (multiplicaGF16(2, possibilidades[2][0]) ^
//                    multiplicaGF16(3, possibilidades[2][1]) ^
//                    multiplicaGF16(8, possibilidades[2][2]) ^
//                    multiplicaGF16(9, possibilidades[2][3])) != 0
//            ){
//                next(possibilidades[2], 1, 16);
//            }
////            System.out.println("atual2 : "+ Arrays.toString(possibilidades[2]));
//            next(possibilidades[3], 1, 16);
//            while( (multiplicaGF16(9, possibilidades[3][0]) ^
//                    multiplicaGF16(9, possibilidades[3][1]) ^
//                    multiplicaGF16(8, possibilidades[3][2]) ^
//                    multiplicaGF16(1, possibilidades[3][3])) != 0
//            ){
//                next(possibilidades[3], 1, 16);
//            }
////            System.out.println("atual3 : "+ Arrays.toString(possibilidades[3]));
//            System.out.println("---testing---");
//            System.out.println(Arrays.toString(possibilidades[0]));
//            System.out.println(Arrays.toString(possibilidades[1]));
//            System.out.println(Arrays.toString(possibilidades[2]));
//            System.out.println(Arrays.toString(possibilidades[3]));
//            result = mixCollumns(block.clone());
//            for (int i = 0; i < 4; i++) {
//                result.setNibble(i,     multiplicaGF16(possibilidades[0][0 ], block.getNibble(i)) ^ 
//                                        multiplicaGF16(possibilidades[0][1 ], block.getNibble(i+4)) ^ 
//                                        multiplicaGF16(possibilidades[0][2 ], block.getNibble(i+8)) ^
//                                        multiplicaGF16(possibilidades[0][3 ], block.getNibble(i+12))
//                ); 
//                result.setNibble(i+4,   multiplicaGF16(possibilidades[1][0 ], block.getNibble(i)) ^ 
//                                        multiplicaGF16(possibilidades[1][1 ], block.getNibble(i+4)) ^ 
//                                        multiplicaGF16(possibilidades[1][2 ], block.getNibble(i+8)) ^
//                                        multiplicaGF16(possibilidades[1][3 ], block.getNibble(i+12))
//                ); 
//                result.setNibble(i+8,   multiplicaGF16(possibilidades[2][0 ], block.getNibble(i)) ^ 
//                                        multiplicaGF16(possibilidades[2][1], block.getNibble(i+4)) ^ 
//                                        multiplicaGF16(possibilidades[2][2], block.getNibble(i+8)) ^
//                                        multiplicaGF16(possibilidades[2][3], block.getNibble(i+12))
//                ); 
//                result.setNibble(i+12,  multiplicaGF16(possibilidades[3][0], block.getNibble(i)) ^ 
//                                        multiplicaGF16(possibilidades[3][1], block.getNibble(i+4)) ^ 
//                                        multiplicaGF16(possibilidades[3][2], block.getNibble(i+8)) ^
//                                        multiplicaGF16(possibilidades[3][3], block.getNibble(i+12))
//                ); 
//            }
//            
//            System.out.println("-------------");
//            next(possibilidades[0], 1, 16);
//        }while( !Arrays.equals(base, possibilidades[0]) || 
//                !Arrays.equals(base, possibilidades[1]) || 
//                !Arrays.equals(base, possibilidades[2]) || 
//                !Arrays.equals(base, possibilidades[3]));
        
        return null;
    }
    
    /**
     * Multiplica a por b em GF(16), com o polinômio x⁴ + x + 1.
     * 
     * @param a
     * @param b
     * @return 
     */
    public int multiplicaGF16(int a, int b){
        int polinomio = 0x13;
        int total = 0;
        for (int i = 0; i < totalBits(b); i++) {
            if(getBitAt(b, i)) total ^= a<<i;
        }
        while(totalBits(total) >= totalBits(polinomio)){
            total ^= (polinomio<<(totalBits(total)-totalBits(polinomio)));
        }
        return total;
    }
    
    public boolean getBitAt(int a, int pos){
        if(pos > totalBits(a)) return false;
        return ((a>>pos)&0x1) == 1;
    }
    public int totalBits(int a){
        switch(a){
            case 0:case 1:
                return 1;
            case 2:
                return 2;
            case 4:
                return 3;
            case 8:
                return 4;
            case 16:
                return 5;
            case 32:
                return 6;
            case 64:
                return 7;
            case 128:
                return 8;
            default:
                return (int)Math.ceil(Math.log(a)/Math.log(2));
        }
    }    
}
