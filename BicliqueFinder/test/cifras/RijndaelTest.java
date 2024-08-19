/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.ByteArray;

/**
 *
 * @author clique
 */
public class RijndaelTest {
    
    public RijndaelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shiftRows method, of class Rijndael.
     */
    @Test
    public void testShiftRows() {
        
        System.out.println("testShiftRows");
        Rijndael rijndael = new Rijndael();
        ByteArray key = new ByteArray(16).randomize();
        ByteArray key2= key.clone();
        
        int aux = key2.get(4);
        key2.set(4, key2.get(7));
        key2.set(7, key2.get(6));
        key2.set(6, key2.get(5));
        key2.set(5, aux);
        
        aux = key2.get(8);
        key2.set(8 , key2.get(10));
        key2.set(10, aux);
        aux = key2.get(9);
        key2.set(9 , key2.get(11));
        key2.set(11, aux);
        
        aux = key2.get(12);
        key2.set(12, key2.get(13));
        key2.set(13, key2.get(14));
        key2.set(14, key2.get(15));
        key2.set(15, aux);
        
        System.out.println(key);
        System.out.println(rijndael.invertedShiftRows(key));
        System.out.println(key2);
        assertTrue(key2.equals(rijndael.invertedShiftRows(key)));
        
        
//        for (int i = 0; i < 100; i++) {
//            System.out.println("------ teste "+i+" ------");
//            key = new ByteArray(8).randomize();
//            System.out.println("b1: "+key);
//            key2 = rijndael.subBytes(key);
//            System.out.println("b2: "+key2);
//            key2 = rijndael.invertedSubBytes(key2);
//            System.out.println("b3: "+key2);
//            System.out.println("------  fim  "+i+" ------");
//            assertTrue(key.equals(key2));
//        }
    }
    
}
