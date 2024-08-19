/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import biclique.Biclique;
import biclique.RelatedKeyDifferential;
import cifras.Cipher;
import cifras.Future;
import cifras.Rijndael;
import cifras.Serpent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clique
 */
public class UtilTest {
    
    public UtilTest() {
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
     * Test of concat method, of class Util.
     */
    @Test
    public void testAllCombinationsOfWords() {
        System.out.println("testAllCombinationsOfWords");
        System.out.println(Util.allCombinationsOfWords(new Future(), 4, true).size());
    }
    /**
     * Test of toTikzDiagramRecomputation method, of class Util.
     * 
     */
    @Test
    public void getDiagramRijndaelStar() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        int fromstate = 0,
            tostate   = 3;
        
        ByteArray keyDiff = ByteArray.toByteArray("[ff,ff,00,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff, 
                                                            0, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff2, 
                                                            1, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
//        System.out.println(Util.toTikzDiagramRecomputation(new Biclique(
//                Util.concat(c,c2),
//                cipher1.getINDEX_OF_STATE_PRE_KEY(5),
//                Util.toIntegerList(3))));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"blue"));
    }
    /**
     * Test of toTikzDiagramRecomputation method, of class Util.
     * 
     */
    @Test
    public void getDiagramRijndaelFastest() {
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        int fromstate = cipher1.getINDEX_OF_STATE_POST_KEY(1),
            tostate   = cipher1.getINDEX_OF_STATE_PRE_KEY(4);
        
        ByteArray keyDiff = ByteArray.toByteArray("[00,00,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate,
                                                            keyDiff, 
                                                            2, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[ff,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                            fromstate,
                                                            tostate, 
                                                            keyDiff2, 
                                                            4, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
        
//        System.out.println(Util.toTikzDiagramRecomputation(new Biclique(
//                Util.concat(c,c2),
//                cipher1.getINDEX_OF_STATE_POST_KEY(7),
//                Util.toIntegerList(3))));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));

    }
    /**
     * Test of toTikzDiagramRecomputation method, of class Util.
     * 
     */
    @Test
    public void getDiagramRijndaelUnbalanced() {
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
//      
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
        assertEquals("delta is wrong", TestConstants.RIJNDAEL_UNBALANCED_DELTA.value(), Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));
        assertEquals("nabla0 is wrong", TestConstants.RIJNDAEL_UNBALANCED_NABLA0.value(), Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c3,"green"));
        assertEquals("nabla1 is wrong", TestConstants.RIJNDAEL_UNBALANCED_NABLA1.value(), Util.toTikzDiagramRelatedKeyDifferential(c3,"green"));
        
//        System.out.println(Util.toTikzDiagramRecomputation(new Biclique(
//                Util.concat(c,c2,c3),
//                cipher1.getINDEX_OF_STATE_POST_KEY(2),
//                Util.toIntegerList(0))));
        assertEquals(   "recomputation is wrong",
                        TestConstants.RIJNDAEL_UNBALANCED_RECOMPUTATION.value(),
                        Util.toTikzDiagramRecomputation(new Biclique(
                                                            Util.concat(c,c2,c3),
                                                            cipher1.getINDEX_OF_STATE_POST_KEY(2),
                                                            Util.toIntegerList(0))));

    }
    /**
     * Test of toTikzDiagramRecomputation method, of class Util.
     * 
     */
    @Test
    public void getDiagramRijndaelBalanced() {
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
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
        assertEquals("delta0 is wrong", TestConstants.RIJNDAEL_BALANCED_DELTA0.value(), Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"blue"));
        assertEquals("delta1 is wrong", TestConstants.RIJNDAEL_BALANCED_DELTA1.value(), Util.toTikzDiagramRelatedKeyDifferential(c2,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c3,"green"));
        assertEquals("nabla0 is wrong", TestConstants.RIJNDAEL_BALANCED_NABLA0.value(), Util.toTikzDiagramRelatedKeyDifferential(c3,"green"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c4,"green"));
        assertEquals("nabla1 is wrong", TestConstants.RIJNDAEL_BALANCED_NABLA1.value(), Util.toTikzDiagramRelatedKeyDifferential(c4,"green"));
        
        System.out.println(Util.toTikzDiagramRecomputation(new Biclique(
                Util.concat(c,c2,c3,c4),
                cipher1.getINDEX_OF_STATE_POST_KEY(2),
                Util.toIntegerList(0))));
        assertEquals(   "recomputation is wrong",
                        TestConstants.RIJNDAEL_BALANCED_RECOMPUTATION.value(),
                        Util.toTikzDiagramRecomputation(new Biclique(
                                                            Util.concat(c,c2,c3,c4),
                                                            cipher1.getINDEX_OF_STATE_POST_KEY(2),
                                                            Util.toIntegerList(0))));
    }
    
    /**
     * Test of toTikzDiagramRecomputation method, of class Util.
     * 
     */
    @Test
    public void getDiagramSerpent() {
        Cipher cipher1 = new Serpent();
        Cipher cipher2 = new Serpent();
        ByteArray keyDiff = ByteArray.toByteArray("[00,00,00,00|00,0f,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                            91, 
                                                            cipher1.getNUM_STATES()-1, 
                                                            keyDiff, 
                                                            18, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "nabla");
        
        ByteArray keyDiff2 = ByteArray.toByteArray("[00,00,00,f0|00,00,00,00|00,00,00,00|00,00,00,00]");
        
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                            91, 
                                                            cipher1.getNUM_STATES()-1, 
                                                            keyDiff2, 
                                                            31, 
                                                            cipher1, 
                                                            cipher2, 
                                                            "delta");
//      
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
        assertEquals("delta is wrong", TestConstants.SERPENT_DELTA_P1.value()+TestConstants.SERPENT_DELTA_P2.value(), Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));
        assertEquals("nabla is wrong", TestConstants.SERPENT_NABLA_P1.value()+TestConstants.SERPENT_NABLA_P2.value(), Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));

//        System.out.println(Util.toTikzDiagramRecomputation(new Biclique(
//                Util.concat(c,c2),
//                cipher1.getINDEX_OF_STATE_PRE_KEY(25),
//                Util.toIntegerList(31))));
        assertEquals(   "recomputation is wrong",
                        TestConstants.SERPENT_RECOMPUTATION_P1.value()+TestConstants.SERPENT_RECOMPUTATION_P2.value(),
                        Util.toTikzDiagramRecomputation(new Biclique(
                                                            Util.concat(c,c2),
                                                            cipher1.getINDEX_OF_STATE_PRE_KEY(25),
                                                            Util.toIntegerList(31))));
    }
    
}
