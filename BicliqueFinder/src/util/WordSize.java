/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author clique
 */
public enum WordSize {
    LONG(64),INT(32),SHORT(16),BYTE(8), NIBBLE(4),PAIR(2),BIT(1);
    
    private final int value;
    
    private WordSize(int value){
        this.value = value;
    }
    
    public int value(){
        return value;
    }
    
    public static WordSize getWordSize(int value){
        for (WordSize w : values()) if(value == w.value) return w;
        throw new RuntimeException("Invalid size for WordSize");
    }
}
