/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.ByteArray;
import util.Util;

/**
 *
 * @author clique
 */
public class FutureTest {
    
    public FutureTest() {
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
     * Test of testExpandKey method, of class Future.
     */
    @Test
    public void testExpandKey() {
        System.out.println("testExpandKey");
        List<ByteArray> exp;
        List<ByteArray> correto = new ArrayList<>();
//        correto.add(new ByteArray("[35,56,26,a4]"));
//        correto.add(new ByteArray("[cf,1d,ce,88]"));
//        correto.add(new ByteArray("[aa,c4,d4,86]"));
//        correto.add(new ByteArray("[e3,b9,d1,19]"));
//        correto.add(new ByteArray("[58,9a,90,d5]"));
//        correto.add(new ByteArray("[77,3a,23,3c]"));
//        correto.add(new ByteArray("[13,52,1a,ab]"));
//        correto.add(new ByteArray("[e7,44,67,8e]"));
//        correto.add(new ByteArray("[6a,43,55,62]"));
//        correto.add(new ByteArray("[e8,8c,f1,dc]"));
//        correto.add(new ByteArray("[48,6a,ac,4d]"));
//        ByteArray bytearray = new ByteArray("[00,00,00,00|"
//                                           + "00,00,00,00|"
//                                           + "01,23,45,67|"
//                                           + "89,ab,cd,ef]");
        ByteArray bytearray = new ByteArray("[00,00,00,00|"
                                           + "00,00,00,00|"
                                           + "00,00,00,00|"
                                           + "00,00,00,00]");
        List<ByteArray> part_bytearray = ByteArray.partition(bytearray, 2);
//        System.out.println("bytearray : "+bytearray);
        Future future = new Future(bytearray, 0);
        correto = ByteArray.partition(future.getExpandedKey(),11);
//        System.out.println("correto : "+correto);
        for (int i = 1; i < 10; i++) {
            exp = future.expandKey(ByteArray.concatenateAll(correto.get(i),correto.get(i+1)), i);
//            System.out.println("correto : "+correto);
//            System.out.println("exp     : "+exp);
            for (int j = 0; j < correto.size(); j++) 
                assertTrue(correto.get(j).equals(exp.get(j)));
            
//            System.out.println("K0||K1("+i+")  :"+exp);
//            System.out.println("K0 = curr<<<"+Util.eRotacao(part_bytearray.get(0),exp.get(0)));
//            System.out.println("K1 = curr<<<"+Util.eRotacao(part_bytearray.get(1),exp.get(1)));
        }
        
//        System.out.println("testExpandKey");
//        Future future;
//        ByteArray key,key2;
//        List<ByteArray> exp;
//        int j;
//        for (int i = 0; i < 1; i++) {
//            System.out.println("------ teste "+i+" ------");
//            key = new ByteArray(16).randomize();
//            future = new Future(key, 0);
//            System.out.println("k1: "+key);
//            System.out.println("expanded-k1: "+future.getExpandedKey());
//            
//            exp = ByteArray.partition(future.getExpandedKey(), 11);
//            System.out.println("exp : "+exp);
//            key2 = ByteArray.concatenateAll(exp.get(6),exp.get(7));
//            future = new Future(key2, 6);
//            System.out.println("k2: "+key2);
//            System.out.println("expanded-k2: "+future.getExpandedKey());
//
//            System.out.println("------  fim  "+i+" ------");
//            j = 0;
//            for (ByteArray b : ByteArray.partition(future.getExpandedKey(),11)) {
//                System.out.println(b+"\n"+exp.get(j));
//                assertTrue(b.equals(exp.get(j++)));
//            }
//            
//        }
    }

    /**
     * Test of testSubBytes method, of class Future.
     */
    @Test
    public void testSubBytes() {
        System.out.println("testSubBytes");
        Future future = new Future();
        ByteArray key,key2;
        for (int i = 0; i < 1; i++) {
            System.out.println("------ teste "+i+" ------");
            key = new ByteArray(8).randomize();
            System.out.println("b1: "+key);
            key2 = future.subBytes(key);
            System.out.println("b2: "+key2);
            key2 = future.invertedSubBytes(key2);
            System.out.println("b3: "+key2);
            System.out.println("------  fim  "+i+" ------");
            assertTrue(key.equals(key2));
        }
    }
    /**
     * Test of testSubBytes method, of class Future.
     */
    @Test
    public void testShiftRows() {
        System.out.println("testShiftRows");
        Future future = new Future();
        ByteArray key,key2;
        for (int i = 0; i < 1; i++) {
//            System.out.println("------ teste "+i+" ------");
            key = new ByteArray(8).randomize();
//            System.out.println("b1: "+key);
            key2 = future.shiftRows(key);
//            System.out.println("b2: "+key2);
            key2 = future.invertedShiftRows(key2);
//            System.out.println("b3: "+key2);
//            System.out.println("------  fim  "+i+" ------");
            assertTrue(key.equals(key2));
        }
    }
    @Test
    public void testMixCollumns() {
        System.out.println("testMixcollumns");
        Future future = new Future();
        ByteArray key,key2;
        for (int i = 0; i < 1; i++) {
            System.out.println("------ teste "+i+" ------");
            key = new ByteArray(8).randomize();
            System.out.println("b1: "+key);
            key2 = future.mixCollumns(key);
            System.out.println("b2: "+key2);
            key2 = future.invertedMixCollumns(key2);
            System.out.println("b3: "+key2);
            System.out.println("------  fim  "+i+" ------");
            assertTrue(key.equals(key2));
        }
    }
    @Test
    public void testEncryption() {
        System.out.println("testEncryption");
        Future future = new Future(new ByteArray("[00,00,"
                                                + "00,00|"
                                                + "00,00,"
                                                + "00,00|"
                                                + "f0,0f,"
                                                + "f0,0f|"
                                                + "ff,00,"
                                                + "0f,f0|"), 0);
        System.out.println("full key("+future.getExpandedKey().length()+") : "+future.getExpandedKey());
        ByteArray p = new ByteArray(8);
        List<ByteArray> ciphertext,plaintext;
        for (int i = 0; i < 1; i++) {
            System.out.println("------ teste "+i+" ------");
//            plaintext = new ByteArray(8).randomize();
            System.out.println("P: "+p);
            ciphertext = future.encryptFull(p,0);
            System.out.println("C: "+ciphertext);
            plaintext = future.encryptFull(ciphertext.get(40),40);
            System.out.println("P: "+plaintext);
            for (int j = 0; j < ciphertext.size(); j++) {
                assertTrue(ciphertext.get(j).equals(plaintext.get(j)));
            }
        }
    }
}
