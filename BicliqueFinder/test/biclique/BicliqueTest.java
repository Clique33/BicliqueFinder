/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biclique;

import cifras.Cipher;
import cifras.Future;
import cifras.Rijndael;
import java.util.Arrays;
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
 * @author ´Gabriel
 */
public class BicliqueTest {
    
    public BicliqueTest() {
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

    @Test
    public void testRijndaelFastest() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray("[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]");
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                    5,
                                                    16, 
                                                    keyDiff, 
                                                    2, 
                                                    cipher1, 
                                                    cipher2, 
                                                    "delta");
//        System.out.println(c);
        
        keyDiff = new ByteArray("[ff,00,ff,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                    5,
                                                    16, 
                                                    keyDiff, 
                                                    2, 
                                                    cipher1, 
                                                    cipher2, 
                                                    "nabla");
//        System.out.println(c2);
        String correto[] = (
"begin biclique{\n" +
"deltas{\n" +
"Subkey #2\n" +
"Key Difference :\n" +
"[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,00,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K1 = [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K4 = [00,00,aa,aa|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K5 = [00,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K6 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K7 = [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K8 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K9 = [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K10 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"#0 : [00,00,aa,aa|00,00,00,aa|aa,00,00,00|aa,aa,00,00]\n" +
"#1 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#2 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#3 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#4 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#5 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#6 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#7 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#8 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#9 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#10 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#11 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#12 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,00,aa,aa]\n" +
"#13 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [00,00,aa,aa|00,aa,aa,00|aa,aa,00,00|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#25 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#26 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#27 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#28 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#29 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#30 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#31 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#32 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#33 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#34 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#35 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#36 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#37 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#38 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#39 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#40 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"]\n" +
"}\n" +
"nablas{\n" +
"Subkey #2\n" +
"Key Difference :\n" +
"[ff,00,ff,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,00,00,00|00,00,00,00|00,00,00,00|aa,aa,00,00]\n" +
"K1 = [aa,aa,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K2 = [aa,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K4 = [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K5 = [aa,aa,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [aa,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K7 = [aa,aa,00,00|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K8 = [aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00]\n" +
"K9 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"K10 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"#0 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#1 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#2 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#3 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#4 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#5 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#6 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#7 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#8 : [bb,bb,bb,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#9 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#10 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#11 : [bb,bb,00,00|bb,bb,00,00|bb,bb,00,00|bb,bb,00,00]\n" +
"#12 : [bb,bb,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#13 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#14 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#15 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#16 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#17 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#18 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#19 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#20 : [bb,00,00,00|bb,00,00,00|bb,00,00,00|bb,00,00,00]\n" +
"#21 : [bb,bb,bb,bb|bb,00,00,00|bb,00,00,00|bb,00,00,00]\n" +
"#22 : [bb,bb,bb,bb|bb,00,00,00|bb,00,00,00|bb,00,00,00]\n" +
"#23 : [bb,bb,bb,bb|00,00,00,bb|00,00,bb,00|00,bb,00,00]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#32 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#33 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#34 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#35 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#36 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#37 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#38 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#39 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#40 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"]\n" +
"}\n" +
"Recomputation :\n" +
"[K0 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,aa,aa|00,00,00,aa|aa,00,00,00|aa,aa,00,00]\n" +
"#1 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#2 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#3 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#4 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#5 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#6 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#7 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#8 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#9 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#10 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#11 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#12 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#13 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#14 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#15 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#16 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#17 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#18 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#19 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#20 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#21 : [aa,aa,aa,aa|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#22 : [aa,aa,aa,aa|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#23 : [aa,aa,aa,aa|00,00,00,aa|00,00,aa,00|00,aa,00,00]\n" +
"#24 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#25 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#26 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#27 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#28 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#33 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#34 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#35 : [00,00,00,aa|00,00,aa,00|00,aa,00,00|aa,00,00,00]\n" +
"#36 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#37 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#38 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#39 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#40 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"]\n" +
"A total of 37 Sboxes need to be recomputed (out of 200)\n" +
"Biclique spans from internal state: #5 till state #16\n" +
"Is independent : true\n" +
"time complexity : TimeComplexity = 2^{112} * 2^{13.64} = 2^{125.64}\n" +
"data complexity : DataComplexity = 2^{128}\n" +
"}end biclique\n" +
"\n" +
"").split("\n");
        Biclique b = new Biclique(Util.concat(c, c2),29, Util.toIntegerList(3));
        String teste[] = b.toStringPrintAll().split("\n");
        for (int i = 0; i < correto.length; i++) {
//            System.out.println(teste[i]+"|"+correto[i]);
            assertTrue(teste[i]+"|"+correto[i],teste[i].equals(correto[i]));
        }
    }

    @Test
    public void testRijndaelStar() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        int fromstate = 0,
            tostate   = 3;
        
        ByteArray keyDiff = ByteArray.toByteArray("[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff, 
                                                            1, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[ff,ff,00,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff2, 
                                                            0, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
//        System.out.println(c2);
        String correto[] = ("begin biclique{\n" +
"deltas{\n" +
"Subkey #1\n" +
"Key Difference :\n" +
"[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K3 = [00,00,aa,aa|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K4 = [00,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K5 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K6 = [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K7 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K8 = [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K9 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K10 = [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#2 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#3 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#4 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#5 : [00,00,aa,aa|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#6 : [00,00,aa,aa|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#7 : [00,00,aa,aa|00,aa,00,00|aa,00,00,00|00,00,00,aa]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#25 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#26 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#27 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#28 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#29 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#30 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#31 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#32 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#33 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#34 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#35 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#36 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#37 : [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"#38 : [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"#39 : [aa,00,aa,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,aa,aa]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]Subkey #0\n" +
"Key Difference :\n" +
"[ff,ff,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [aa,aa,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [aa,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K4 = [aa,aa,00,00|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K5 = [aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00]\n" +
"K6 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"K7 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K8 = [aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K9 = [aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00]\n" +
"K10 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#2 : [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#3 : [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#4 : [aa,aa,00,00|aa,aa,00,00|aa,aa,00,00|aa,aa,00,00]\n" +
"#5 : [aa,aa,00,00|aa,aa,00,00|aa,aa,00,00|aa,aa,00,00]\n" +
"#6 : [aa,aa,00,00|aa,aa,00,00|aa,aa,00,00|aa,aa,00,00]\n" +
"#7 : [aa,aa,00,00|aa,00,00,aa|00,00,aa,aa|00,aa,aa,00]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#25 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#26 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#27 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#28 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#29 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#30 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#31 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#32 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#33 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#34 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#35 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#36 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,00,aa,aa|aa,aa,00,aa]\n" +
"#37 : [aa,aa,aa,aa|00,aa,00,aa|00,00,aa,aa|00,00,00,aa]\n" +
"#38 : [aa,aa,aa,aa|00,aa,00,aa|00,00,aa,aa|00,00,00,aa]\n" +
"#39 : [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"}\n" +
"nablas{\n" +
"\n" +
"}\n" +
"Recomputation :\n" +
"[K0 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#2 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#3 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#4 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#5 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#6 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#7 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#25 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#26 : [00,00,00,aa|aa,00,00,00|00,aa,00,00|00,00,aa,00]\n" +
"#27 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#28 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#33 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#34 : [00,00,00,aa|00,00,00,aa|00,00,00,aa|00,00,00,aa]\n" +
"#35 : [00,00,00,aa|00,00,aa,00|00,aa,00,00|aa,00,00,00]\n" +
"#36 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,00,aa,aa|aa,aa,00,aa]\n" +
"#37 : [aa,00,aa,00|00,aa,00,aa|00,00,aa,00|00,00,00,aa]\n" +
"#38 : [aa,00,aa,00|00,aa,00,aa|00,00,aa,00|00,00,00,aa]\n" +
"#39 : [aa,00,aa,00|aa,00,aa,00|aa,00,00,00|aa,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"A total of 79 Sboxes need to be recomputed (out of 200)\n" +
"Biclique spans from internal state: #0 till state #3\n" +
"Is independent : true\n" +
"time complexity : TimeComplexity = 2^{112} * 2^{14.69} = 2^{126.69}\n" +
"data complexity : DataComplexity = 2^{0}\n" +
"}end biclique\n" +
"\n" +
"").split("\n");
        Biclique b = new Biclique(Util.concat(c, c2),29, Util.toIntegerList(3));
//        b.printAll();
        String teste[] = b.toStringPrintAll().split("\n");
        for (int i = 0; i < correto.length; i++) {
            assertTrue(teste[i]+"|"+correto[i],teste[i].equals(correto[i]));
        }
    }

    @Test
    public void testRijndaelUnbalanced() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        int fromstate = cipher1.getINDEX_OF_STATE_POST_KEY(7),
            tostate   = cipher1.getINDEX_OF_STATE_POST_KEY(10);
        
        ByteArray keyDiff = ByteArray.toByteArray("[00,00,ff,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff, 
                                                            7, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[00,00,00,00|ff,ff,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff2, 
                                                            9, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
        
        ByteArray keyDiff3 = ByteArray.toByteArray("[ff,ff,00,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c3 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff3, 
                                                            9, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
        String correto[] = (
"begin biclique{\n" +
"deltas{\n" +
"Subkey #7\n" +
"Key Difference :\n" +
"[00,00,ff,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,00,aa,aa|aa,00,00,00|00,00,aa,aa|aa,00,aa,00]\n" +
"K1 = [00,00,aa,00|00,00,00,00|00,00,aa,00|aa,aa,aa,aa]\n" +
"K2 = [00,00,aa,aa|00,00,00,00|aa,aa,00,00|aa,00,aa,00]\n" +
"K3 = [00,00,aa,00|00,00,00,00|aa,00,00,00|00,00,aa,aa]\n" +
"K4 = [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,aa,00]\n" +
"K5 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,00,00]\n" +
"K6 = [00,00,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K7 = [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K10 = [00,00,aa,aa|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"#0 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#1 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#2 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#3 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#4 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#5 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#6 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#7 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [00,00,aa,aa|00,00,00,aa|aa,00,00,00|aa,aa,00,00]\n" +
"#25 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#26 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#27 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#28 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#34 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#35 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#36 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,00,aa,aa]\n" +
"#37 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#38 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#39 : [00,00,aa,aa|00,aa,aa,00|aa,aa,00,00|aa,aa,aa,aa]\n" +
"#40 : [00,00,aa,aa|00,aa,aa,00|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"]\n" +
"}\n" +
"nablas{\n" +
"Subkey #9\n" +
"Key Difference :\n" +
"[00,00,00,00|ff,ff,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"K1 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K2 = [aa,aa,00,00|aa,00,00,00|00,00,00,00|aa,00,aa,00]\n" +
"K3 = [aa,00,00,00|aa,aa,aa,aa|00,00,00,00|aa,aa,00,00]\n" +
"K4 = [aa,aa,aa,aa|aa,00,aa,00|00,00,00,00|aa,00,00,00]\n" +
"K5 = [aa,00,aa,00|aa,aa,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [aa,aa,00,00|aa,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [aa,00,00,00|aa,aa,aa,aa|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|aa,00,aa,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|aa,aa,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|aa,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [bb,bb,bb,bb|bb,00,bb,00|bb,bb,00,00|bb,00,00,00]\n" +
"#2 : [bb,bb,bb,bb|bb,00,bb,00|bb,bb,00,00|bb,00,00,00]\n" +
"#3 : [bb,bb,bb,bb|00,bb,00,bb|00,00,bb,bb|00,bb,00,00]\n" +
"#4 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#5 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#6 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#7 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#8 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#9 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#10 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#11 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#12 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#13 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#14 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#15 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#16 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#17 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#18 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#19 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#20 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#21 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#22 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#23 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#32 : [bb,bb,00,00|bb,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#33 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#34 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#35 : [bb,bb,00,00|bb,bb,00,00|bb,bb,00,00|bb,bb,00,00]\n" +
"#36 : [00,00,00,00|bb,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|bb,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]Subkey #9\n" +
"Key Difference :\n" +
"[ff,ff,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K1 = [aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K2 = [aa,00,00,00|00,00,00,00|aa,00,aa,00|aa,aa,00,00]\n" +
"K3 = [aa,aa,aa,aa|00,00,00,00|aa,aa,00,00|aa,00,00,00]\n" +
"K4 = [aa,00,aa,00|00,00,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K5 = [aa,aa,00,00|00,00,00,00|00,00,00,00|aa,00,aa,00]\n" +
"K6 = [aa,00,00,00|00,00,00,00|00,00,00,00|aa,aa,00,00]\n" +
"K7 = [aa,aa,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K8 = [aa,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [bb,00,bb,00|bb,bb,00,00|bb,00,00,00|bb,bb,bb,bb]\n" +
"#2 : [bb,00,bb,00|bb,bb,00,00|bb,00,00,00|bb,bb,bb,bb]\n" +
"#3 : [bb,00,bb,00|bb,00,00,bb|00,00,bb,00|bb,bb,bb,bb]\n" +
"#4 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#5 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#6 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#7 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#8 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#9 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#10 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#11 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#12 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#13 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#14 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#15 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#16 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#17 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#18 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#19 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#20 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#21 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#22 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#23 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#32 : [bb,bb,bb,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#33 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#34 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#35 : [bb,bb,00,00|bb,bb,00,00|bb,bb,00,00|bb,bb,00,00]\n" +
"#36 : [bb,bb,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"}\n" +
"Recomputation :\n" +
"[K0 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [aa,00,aa,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#2 : [aa,00,aa,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#3 : [aa,00,aa,00|00,00,00,aa|00,00,aa,00|00,aa,00,00]\n" +
"#4 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#5 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#6 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#7 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#8 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#9 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#10 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#11 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#12 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#13 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#14 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#15 : [aa,00,00,00|00,00,00,aa|00,00,aa,00|00,aa,00,00]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [00,00,aa,aa|00,00,00,aa|aa,00,00,00|aa,aa,00,00]\n" +
"#25 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#26 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#27 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#28 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#34 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#35 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#36 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"A total of 50 Sboxes need to be recomputed (out of 200)\n" +
"Biclique spans from internal state: #29 till state #40\n" +
"Is independent : true\n" +
"time complexity : TimeComplexity = 2^{104} * 2^{22.02} = 2^{126.02}\n" +
"data complexity : DataComplexity = 2^{88}\n" +
"}end biclique\n" +
"\n" +
"").split("\n");
        Biclique b = new Biclique(
                            Util.concat(c,c2,c3),
                            cipher1.getINDEX_OF_STATE_POST_KEY(2),
                            Util.toIntegerList(0));
//        b.printAll();
        String teste[] = b.toStringPrintAll().split("\n");
        for (int i = 0; i < correto.length; i++) {
            assertTrue(teste[i]+"|"+correto[i],teste[i].equals(correto[i]));
        }
    }
    
    @Test
    public void testRijndaelBalanced() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        int fromstate = cipher1.getINDEX_OF_STATE_POST_KEY(7),
            tostate   = cipher1.getINDEX_OF_STATE_POST_KEY(10);
        
        ByteArray keyDiff = ByteArray.toByteArray("[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff, 
                                                            8, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[00,00,00,00|00,00,00,00|00,00,00,00|00,ff,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                                fromstate,
                                                                tostate,
                                                                keyDiff2, 
                                                                9, 
                                                                cipher1, 
                                                                cipher2, 
                                                                "delta");
        
        ByteArray keyDiff3 = ByteArray.toByteArray("[ff,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c3 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff3, 
                                                            10, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
        
        ByteArray keyDiff4 = ByteArray.toByteArray("[00,00,00,00|ff,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c4 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff4, 
                                                            10, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
//      
        String correto[] = (
"begin biclique{\n" +
"deltas{\n" +
"Subkey #8\n" +
"Key Difference :\n" +
"[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,00,aa,aa|aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K1 = [00,00,aa,00|00,00,00,00|aa,00,aa,00|aa,aa,aa,aa]\n" +
"K2 = [00,00,aa,aa|00,00,00,00|aa,aa,00,00|aa,00,aa,00]\n" +
"K3 = [00,00,aa,00|00,00,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K4 = [00,00,aa,aa|00,00,00,00|00,00,00,00|aa,00,aa,00]\n" +
"K5 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,00,00]\n" +
"K6 = [00,00,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K7 = [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,aa,00|00,00,00,00|00,00,00,00|aa,aa,aa,aa]\n" +
"K10 = [00,00,aa,aa|00,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"#0 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#1 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#2 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#3 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#4 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#5 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#6 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#7 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [00,00,aa,aa|00,00,00,aa|aa,00,00,00|aa,aa,00,00]\n" +
"#25 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#26 : [00,00,aa,00|00,00,00,aa|aa,00,00,00|00,aa,00,00]\n" +
"#27 : [00,00,aa,00|00,00,aa,00|00,00,aa,00|00,00,aa,00]\n" +
"#28 : [00,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#34 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#35 : [00,00,aa,aa|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#36 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,00,aa,aa]\n" +
"#37 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#38 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|aa,aa,aa,aa]\n" +
"#39 : [00,00,aa,aa|00,aa,aa,00|aa,aa,00,00|aa,aa,aa,aa]\n" +
"#40 : [00,00,aa,aa|00,aa,aa,00|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"]Subkey #9\n" +
"Key Difference :\n" +
"[00,00,00,00|00,00,00,00|00,00,00,00|00,ff,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,aa,00,00|aa,aa,aa,aa|aa,aa,aa,aa|00,aa,aa,00]\n" +
"K1 = [aa,00,00,00|00,aa,00,aa|aa,aa,aa,00|00,aa,00,00]\n" +
"K2 = [00,00,00,00|00,aa,aa,00|aa,aa,00,00|00,aa,aa,aa]\n" +
"K3 = [00,00,00,00|00,aa,00,00|aa,aa,aa,aa|00,aa,00,aa]\n" +
"K4 = [00,00,00,00|aa,00,00,00|00,aa,00,aa|00,aa,aa,00]\n" +
"K5 = [00,00,00,00|00,00,00,00|00,aa,aa,00|00,aa,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00|00,aa,00,00|00,aa,aa,aa]\n" +
"K7 = [00,00,00,00|00,00,00,00|aa,00,00,00|00,aa,00,aa]\n" +
"K8 = [00,00,00,00|00,00,00,00|00,00,00,00|00,aa,aa,00]\n" +
"K9 = [00,00,00,00|00,00,00,00|00,00,00,00|00,aa,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00|00,00,00,00|00,aa,aa,aa]\n" +
"#0 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#1 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#2 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#3 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#4 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#5 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#6 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#7 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [aa,aa,00,aa|aa,aa,aa,00|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#25 : [aa,aa,00,aa|aa,aa,aa,00|00,aa,aa,aa|aa,00,aa,aa]\n" +
"#26 : [aa,aa,00,aa|aa,aa,aa,00|00,aa,aa,aa|aa,00,aa,aa]\n" +
"#27 : [aa,aa,00,aa|aa,aa,00,aa|aa,aa,00,aa|aa,aa,00,aa]\n" +
"#28 : [00,00,00,00|00,00,00,00|aa,00,00,00|00,aa,00,aa]\n" +
"#29 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,00,00|00,00,00,00|00,00,00,00|00,aa,aa,00]\n" +
"#34 : [00,00,00,00|00,00,00,00|00,00,00,00|00,aa,aa,00]\n" +
"#35 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,aa,aa]\n" +
"#36 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,00,aa,aa]\n" +
"#37 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,aa,aa,aa]\n" +
"#38 : [00,00,aa,aa|00,00,aa,aa|00,00,aa,aa|00,aa,aa,aa]\n" +
"#39 : [00,00,aa,aa|00,aa,aa,00|aa,aa,00,00|aa,00,aa,aa]\n" +
"#40 : [00,00,aa,aa|00,aa,aa,00|aa,aa,00,00|aa,aa,aa,aa]\n" +
"]\n" +
"}\n" +
"nablas{\n" +
"Subkey #10\n" +
"Key Difference :\n" +
"[ff,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K1 = [aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa|aa,00,aa,00]\n" +
"K2 = [aa,00,00,00|00,00,00,00|aa,00,aa,00|aa,aa,00,00]\n" +
"K3 = [aa,aa,aa,aa|00,00,00,00|aa,aa,00,00|aa,00,00,00]\n" +
"K4 = [aa,00,aa,00|00,00,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K5 = [aa,aa,00,00|00,00,00,00|00,00,00,00|aa,00,aa,00]\n" +
"K6 = [aa,00,00,00|00,00,00,00|00,00,00,00|aa,aa,00,00]\n" +
"K7 = [aa,aa,aa,aa|00,00,00,00|00,00,00,00|aa,00,00,00]\n" +
"K8 = [aa,00,aa,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [aa,aa,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [bb,00,bb,00|bb,bb,00,00|bb,00,00,00|bb,bb,bb,bb]\n" +
"#2 : [bb,00,bb,00|bb,bb,00,00|bb,00,00,00|bb,bb,bb,bb]\n" +
"#3 : [bb,00,bb,00|bb,00,00,bb|00,00,bb,00|bb,bb,bb,bb]\n" +
"#4 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#5 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#6 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#7 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#8 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#9 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#10 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#11 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#12 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#13 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#14 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#15 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#16 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#17 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#18 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#19 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#20 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#21 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#22 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#23 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#32 : [bb,bb,bb,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#33 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#34 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#35 : [bb,bb,00,00|bb,bb,00,00|bb,bb,00,00|bb,bb,00,00]\n" +
"#36 : [bb,bb,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [bb,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]Subkey #10\n" +
"Key Difference :\n" +
"[00,00,00,00|ff,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [aa,aa,aa,aa|aa,00,aa,00|aa,aa,00,00|aa,00,00,00]\n" +
"K1 = [aa,00,aa,00|aa,aa,00,00|aa,00,00,00|aa,aa,aa,aa]\n" +
"K2 = [aa,aa,00,00|aa,00,00,00|00,00,00,00|aa,00,aa,00]\n" +
"K3 = [aa,00,00,00|aa,aa,aa,aa|00,00,00,00|aa,aa,00,00]\n" +
"K4 = [aa,aa,aa,aa|aa,00,aa,00|00,00,00,00|aa,00,00,00]\n" +
"K5 = [aa,00,aa,00|aa,aa,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [aa,aa,00,00|aa,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [aa,00,00,00|aa,aa,aa,aa|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|aa,00,aa,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|aa,aa,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|aa,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [bb,bb,bb,bb|bb,00,bb,00|bb,bb,00,00|bb,00,00,00]\n" +
"#2 : [bb,bb,bb,bb|bb,00,bb,00|bb,bb,00,00|bb,00,00,00]\n" +
"#3 : [bb,bb,bb,bb|00,bb,00,bb|00,00,bb,bb|00,bb,00,00]\n" +
"#4 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#5 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#6 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#7 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#8 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#9 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#10 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#11 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#12 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#13 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#14 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#15 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#16 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#17 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#18 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#19 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#20 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#21 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#22 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#23 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#32 : [bb,bb,00,00|bb,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#33 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#34 : [bb,bb,00,00|00,bb,bb,00|00,00,bb,bb|bb,00,00,bb]\n" +
"#35 : [bb,bb,00,00|bb,bb,00,00|bb,bb,00,00|bb,bb,00,00]\n" +
"#36 : [00,00,00,00|bb,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,bb,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|bb,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"}\n" +
"Recomputation :\n" +
"[K0 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#1 : [aa,00,aa,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#2 : [aa,00,aa,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#3 : [aa,00,aa,00|00,00,00,aa|00,00,aa,00|00,aa,00,00]\n" +
"#4 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#5 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#6 : [aa,00,00,00|00,aa,00,00|00,00,aa,00|00,00,00,aa]\n" +
"#7 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#8 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#9 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#10 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#11 : [aa,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#12 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#13 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#14 : [aa,00,00,00|aa,00,00,00|aa,00,00,00|aa,00,00,00]\n" +
"#15 : [aa,00,00,00|00,00,00,aa|00,00,aa,00|00,aa,00,00]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#20 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#21 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#22 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#23 : [aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#24 : [00,00,00,aa|00,00,00,00|aa,00,00,00|aa,aa,00,00]\n" +
"#25 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#26 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#27 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#28 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#34 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#35 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#36 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"]\n" +
"A total of 46 Sboxes need to be recomputed (out of 200)\n" +
"Biclique spans from internal state: #29 till state #40\n" +
"Is independent : true\n" +
"time complexity : TimeComplexity = 2^{96} * 2^{29.90} = 2^{125.90}\n" +
"data complexity : DataComplexity = 2^{88}\n" +
"}end biclique\n"+
"").split("\n");
        Biclique b = new Biclique(
                                Util.concat(c,c2,c3,c4),
                                cipher1.getINDEX_OF_STATE_POST_KEY(2),
                                Util.toIntegerList(0));
        b.printAll();
        String teste[] = b.toStringPrintAll().split("\n");
        for (int i = 0; i < correto.length; i++) {
            assertTrue(teste[i]+"|"+correto[i],teste[i].equals(correto[i]));
        }
    }
    
    
    @Test
    public void testFuture() {
        Future future = new Future();
        int fromstate = future.getINDEX_OF_STATE_POST_KEY(6),
            tostate   = future.getINDEX_OF_STATE_POST_KEY(10);
        System.out.println("biclique from "+fromstate+ " up to "+tostate);
        
        Biclique b = new Biclique(   
                Util.concat(
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,0f,00,00|00,00,00,00|00,00,00,00|00,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "delta"
                        ),
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|00,00,00,00|f0,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "nabla")
                ), 
                future.getINDEX_OF_STATE_POST_KEY(4), 
                Util.toIntegerList(3)
        );
//      
        String correto[] = (
"begin biclique{\n" +
"deltas{\n" +
"Subkey #0\n" +
"Key Difference :\n" +
"[00,0f,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,0a,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00]\n" +
"K2 = [0a,a0,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00]\n" +
"K4 = [aa,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00]\n" +
"K6 = [a0,00,00,00|00,00,00,0a]\n" +
"K7 = [00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,a0]\n" +
"K9 = [00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,aa,00]\n" +
"#0 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#1 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#2 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#3 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#4 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#5 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#6 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#7 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#8 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#9 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#10 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#11 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#12 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#13 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#14 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#15 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#16 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#17 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#18 : [aa,aa,aa,aa|aa,aa,aa,aa]\n" +
"#19 : [a0,a0,0a,0a|a0,a0,0a,0a]\n" +
"#20 : [a0,a0,a0,a0|a0,a0,a0,a0]\n" +
"#21 : [a0,a0,a0,a0|a0,a0,a0,a0]\n" +
"#22 : [a0,a0,a0,a0|a0,a0,a0,a0]\n" +
"#23 : [a0,00,00,00|00,00,00,a0]\n" +
"#24 : [a0,00,00,00|00,00,00,0a]\n" +
"#25 : [00,00,00,00|00,00,00,00]\n" +
"#26 : [00,00,00,00|00,00,00,00]\n" +
"#27 : [00,00,00,00|00,00,00,00]\n" +
"#28 : [00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,00,00|00,00,00,a0]\n" +
"#34 : [00,00,00,00|00,00,00,a0]\n" +
"#35 : [00,a0,00,a0|00,a0,00,a0]\n" +
"#36 : [00,a0,0a,00|a0,00,00,0a]\n" +
"#37 : [00,a0,0a,00|a0,00,00,0a]\n" +
"#38 : [00,a0,0a,00|a0,00,00,0a]\n" +
"#39 : [00,a0,a0,00|00,a0,a0,00]\n" +
"#40 : [00,a0,a0,00|00,a0,aa,00]\n" +
"]\n" +
"}\n" +
"nablas{\n" +
"Subkey #0\n" +
"Key Difference :\n" +
"[00,00,00,00|00,00,00,00|00,00,00,00|f0,00,00,00]\n" +
"\n" +
"Full differential :\n" +
"[K0 = [00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|a0,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,aa|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,0a,a0|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,aa,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00]\n" +
"K9 = [00,0a,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00]\n" +
"#1 : [00,00,00,00|00,00,00,00]\n" +
"#2 : [00,00,00,00|00,00,00,00]\n" +
"#3 : [00,00,00,00|00,00,00,00]\n" +
"#4 : [00,00,00,00|00,00,00,00]\n" +
"#5 : [00,00,00,00|b0,00,00,00]\n" +
"#6 : [00,00,00,00|b0,00,00,00]\n" +
"#7 : [b0,00,b0,00|b0,00,b0,00]\n" +
"#8 : [b0,00,00,0b|00,b0,0b,00]\n" +
"#9 : [b0,00,00,0b|00,b0,0b,00]\n" +
"#10 : [b0,00,00,0b|00,b0,0b,00]\n" +
"#11 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#12 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#13 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#14 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#15 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#16 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#17 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#18 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#19 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#20 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#21 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#22 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#23 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#24 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#25 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#26 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#27 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#28 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#29 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#30 : [bb,bb,bb,bb|bb,bb,bb,bb]\n" +
"#31 : [00,0b,b0,00|0b,00,00,b0]\n" +
"#32 : [00,0b,00,0b|00,0b,00,0b]\n" +
"#33 : [00,0b,00,0b|00,0b,00,0b]\n" +
"#34 : [00,0b,00,0b|00,0b,00,0b]\n" +
"#35 : [00,0b,00,00|00,00,00,00]\n" +
"#36 : [00,0b,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00]\n" +
"]\n" +
"}\n" +
"Recomputation :\n" +
"[K0 = [00,00,00,00|00,00,00,00]\n" +
"K1 = [00,00,00,00|00,00,00,00]\n" +
"K2 = [00,00,00,00|00,00,00,00]\n" +
"K3 = [00,00,00,00|00,00,00,00]\n" +
"K4 = [00,00,00,00|00,00,00,00]\n" +
"K5 = [00,00,00,00|00,00,00,00]\n" +
"K6 = [00,00,00,00|00,00,00,00]\n" +
"K7 = [00,00,00,00|00,00,00,00]\n" +
"K8 = [00,00,00,00|00,00,00,00]\n" +
"K9 = [00,00,00,00|00,00,00,00]\n" +
"K10 = [00,00,00,00|00,00,00,00]\n" +
"#0 : [00,00,00,00|00,00,00,00]\n" +
"#1 : [00,00,00,00|00,00,00,00]\n" +
"#2 : [00,00,00,00|00,00,00,00]\n" +
"#3 : [00,00,00,00|00,00,00,00]\n" +
"#4 : [00,00,00,00|00,00,00,00]\n" +
"#5 : [00,00,00,00|a0,00,00,00]\n" +
"#6 : [00,00,00,00|a0,00,00,00]\n" +
"#7 : [a0,00,a0,00|a0,00,a0,00]\n" +
"#8 : [a0,00,00,0a|00,a0,0a,00]\n" +
"#9 : [a0,00,00,0a|00,a0,0a,00]\n" +
"#10 : [a0,00,00,0a|00,a0,0a,00]\n" +
"#11 : [00,0a,a0,00|0a,00,00,a0]\n" +
"#12 : [00,0a,00,0a|00,0a,00,0a]\n" +
"#13 : [00,0a,00,0a|00,0a,00,0a]\n" +
"#14 : [00,0a,00,0a|00,0a,00,0a]\n" +
"#15 : [00,0a,00,00|00,00,00,00]\n" +
"#16 : [00,0a,00,00|00,00,00,00]\n" +
"#17 : [00,0a,00,00|00,00,00,00]\n" +
"#18 : [00,0a,00,00|00,00,00,00]\n" +
"#19 : [00,00,00,0a|00,00,00,0a]\n" +
"#20 : [00,00,00,a0|00,00,a0,00]\n" +
"#21 : [00,00,00,a0|00,00,a0,00]\n" +
"#22 : [00,00,00,a0|00,00,a0,00]\n" +
"#23 : [a0,00,00,00|00,00,00,a0]\n" +
"#24 : [a0,00,00,00|00,00,00,0a]\n" +
"#25 : [00,00,00,00|00,00,00,00]\n" +
"#26 : [00,00,00,00|00,00,00,00]\n" +
"#27 : [00,00,00,00|00,00,00,00]\n" +
"#28 : [00,00,00,00|00,00,00,00]\n" +
"#29 : [00,00,00,00|00,00,00,00]\n" +
"#30 : [00,00,00,00|00,00,00,00]\n" +
"#31 : [00,00,00,00|00,00,00,00]\n" +
"#32 : [00,00,00,00|00,00,00,00]\n" +
"#33 : [00,00,00,00|00,00,00,00]\n" +
"#34 : [00,00,00,00|00,00,00,00]\n" +
"#35 : [00,00,00,00|00,00,00,00]\n" +
"#36 : [00,00,00,00|00,00,00,00]\n" +
"#37 : [00,00,00,00|00,00,00,00]\n" +
"#38 : [00,00,00,00|00,00,00,00]\n" +
"#39 : [00,00,00,00|00,00,00,00]\n" +
"#40 : [00,00,00,00|00,00,00,00]\n" +
"]\n" +
"A total of 12 Sboxes need to be recomputed (out of 160)\n" +
"Biclique spans from internal state: #25 till state #40\n" +
"Is independent : true\n" +
"time complexity : TimeComplexity = 2^{120} * 2^{5.08} = 2^{125.08}\n" +
"data complexity : DataComplexity = 2^{20}\n" +
"}end biclique\n" +
"").split("\n");
        b.printAll();
        String teste[] = b.toStringPrintAll().split("\n");
        for (int i = 0; i < correto.length; i++) {
            assertTrue(teste[i]+"|"+correto[i],teste[i].equals(correto[i]));
        }
    }
}
