/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class ByteArrayTest {
    
    public ByteArrayTest() {
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
     * Test of getFirstBytes method, of class ByteArray.
     */
    @Test
    public void testGetFirstBytes() {
        ByteArray instance = new ByteArray(new int[]{0x2F,0x1A,0x3B,0x0D,0x6E
        });
        ByteArray teste1byte = new ByteArray(new int[]{0x2F});
        ByteArray teste2bytes = new ByteArray(new int[]{0x2F,0x1A});
        ByteArray teste3bytes = new ByteArray(new int[]{0x2F,0x1A,0x3B});
        ByteArray teste4bytes = new ByteArray(new int[]{0x2F,0x1A,0x3B,0x0D});
        ByteArray teste5bytes = new ByteArray(new int[]{0x2F,0x1A,0x3B,0x0D,0x6E});
        
        assertTrue(instance.getFirstBytes(1).equals(teste1byte));
        assertTrue(instance.getFirstBytes(2).equals(teste2bytes));
        assertTrue(instance.getFirstBytes(3).equals(teste3bytes));
        assertTrue(instance.getFirstBytes(4).equals(teste4bytes));
        assertTrue(instance.getFirstBytes(5).equals(teste5bytes));
    }

    /**
     * Test of fill method, of class ByteArray.
     */
    @Test
    public void testFill() {
        ByteArray instance = new ByteArray(16).fill(0xab, WordSize.BYTE);
        ByteArray correto = ByteArray.toByteArray("[ab,ab,ab,ab|ab,ab,ab,ab|ab,ab,ab,ab|ab,ab,ab,ab]");
        
        assertTrue(instance+"\n"+correto,instance.equals(correto));
    }
    /**
     * Test of getSubBytes method, of class ByteArray.
     */
    @Test
    public void testGetSubBytes() {
        ByteArray instance = new ByteArray(new int[]{0x2F,0x1A,0x3B,0x0D,0x6E
        });
        ByteArray teste01byte = new ByteArray(new int[]{0x2F});
        ByteArray teste24bytes = new ByteArray(new int[]{0x3B,0x0D});
        ByteArray teste14bytes = new ByteArray(new int[]{0x1A,0x3B,0x0D});
        ByteArray teste45bytes = new ByteArray(new int[]{0x6E});
        ByteArray teste05bytes = new ByteArray(new int[]{0x2F,0x1A,0x3B,0x0D,0x6E});
        
        assertTrue(instance.getSubBytes(0,1).equals(teste01byte));
        assertTrue(instance.getSubBytes(2,4).equals(teste24bytes));
        assertTrue(instance.getSubBytes(1,4).equals(teste14bytes));
        assertTrue(instance.getSubBytes(4,5).equals(teste45bytes));
        assertTrue(instance.getSubBytes(0,5).equals(teste05bytes));
    }
    /**
     * Test of getSubBytes method, of class ByteArray.
     */
    @Test
    public void testRotateBits() {
        ByteArray instance = new ByteArray(new int[]{0x2F,0x1A,0x3B
        });
        ByteArray testeRotate3R  = new ByteArray(new int[]{0x65,0xE3,0x47});
        ByteArray testeRotate5R  = new ByteArray(new int[]{0xD9,0x78,0xD1});
        ByteArray testeRotate8R  = new ByteArray(new int[]{0x3B,0x2F,0x1A});
        ByteArray testeRotate16R = new ByteArray(new int[]{0x1A,0x3B,0x2F});
        ByteArray testeRotate3L  = new ByteArray(new int[]{0x78,0xD1,0xD9});
        ByteArray testeRotate5L  = new ByteArray(new int[]{0xE3,0x47,0x65});
        ByteArray testeRotate8L  = new ByteArray(new int[]{0x1A,0x3B,0x2F});
        ByteArray testeRotate16L = new ByteArray(new int[]{0x3B,0x2F,0x1A});
        ByteArray curr;
        
        curr = ByteArray.rotateBits(instance, 3, false);
//        System.out.println(curr+"\n"+ testeRotate3R);
        assertTrue(curr.equals(testeRotate3R));
        
        curr = ByteArray.rotateBits(instance, 5, false);
//        System.out.println(curr+"\n"+ testeRotate5R);
        assertTrue(curr.equals(testeRotate5R));
        
        curr = ByteArray.rotateBits(instance, 8, false);
//        System.out.println(curr+"\n"+ testeRotate8R);
        assertTrue(curr.equals(testeRotate8R));
        
        curr = ByteArray.rotateBits(instance, 16, false);
//        System.out.println(curr+"\n"+ testeRotate16R);
        assertTrue("Erro em testeRotate12R",curr.equals(testeRotate16R));
        
        curr = ByteArray.rotateBits(instance, 3, true);
//        System.out.println(curr+"\n"+ testeRotate3L);
        assertTrue(curr.equals(testeRotate3L));
        
        curr = ByteArray.rotateBits(instance, 5, true);
//        System.out.println(curr+"\n"+ testeRotate5L);
        assertTrue(curr.equals(testeRotate5L));
        
        curr = ByteArray.rotateBits(instance, 8, true);
//        System.out.println(curr+"\n"+ testeRotate8L);
        assertTrue(curr.equals(testeRotate8L));
        
        curr = ByteArray.rotateBits(instance, 16, true);
//        System.out.println(curr+"\n"+ testeRotate16L);
        assertTrue(curr.equals(testeRotate16L));
        
    }
    /**
     * Test of getSubBytes method, of class ByteArray.
     */
    @Test
    public void testShiftBits() {
        ByteArray instance = new ByteArray(new int[]{0x2F,0x1A,0x3B
        });
        ByteArray testeShift3R  = new ByteArray(new int[]{0x05,0xE3,0x47});
        ByteArray testeShift5R  = new ByteArray(new int[]{0x01,0x78,0xD1});
        ByteArray testeShift8R  = new ByteArray(new int[]{0X00,0x2F,0x1A});
        ByteArray testeShift16R = new ByteArray(new int[]{0x00,0x00,0x2F});
        ByteArray testeShift3L  = new ByteArray(new int[]{0x78,0xD1,0xD8});
        ByteArray testeShift5L  = new ByteArray(new int[]{0xE3,0x47,0x60});
        ByteArray testeShift8L  = new ByteArray(new int[]{0x1A,0x3B,0x00});
        ByteArray testeShift16L = new ByteArray(new int[]{0x3B,0x00,0x00});
        ByteArray curr;
        
        curr = ByteArray.shiftBits(instance, 3, false);
//        System.out.println(curr+"\n"+ testeShift3R);
        assertTrue(curr.equals(testeShift3R));
        
        curr = ByteArray.shiftBits(instance, 5, false);
//        System.out.println(curr+"\n"+ testeShift5R);
        assertTrue(curr.equals(testeShift5R));
        
        curr = ByteArray.shiftBits(instance, 8, false);
//        System.out.println(curr+"\n"+ testeShift8R);
        assertTrue(curr.equals(testeShift8R));
        
        curr = ByteArray.shiftBits(instance, 16, false);
//        System.out.println(curr+"\n"+ testeShift16R);
        assertTrue("Erro em testeShift12R",curr.equals(testeShift16R));
        
        curr = ByteArray.shiftBits(instance, 3, true);
//        System.out.println(curr+"\n"+ testeShift3L);
        assertTrue(curr.equals(testeShift3L));
        
        curr = ByteArray.shiftBits(instance, 5, true);
//        System.out.println(curr+"\n"+ testeShift5L);
        assertTrue(curr.equals(testeShift5L));
        
        curr = ByteArray.shiftBits(instance, 8, true);
//        System.out.println(curr+"\n"+ testeShift8L);
        assertTrue(curr.equals(testeShift8L));
        
        curr = ByteArray.shiftBits(instance, 16, true);
//        System.out.println(curr+"\n"+ testeShift16L);
        assertTrue(curr.equals(testeShift16L));
    }
    /**
     * Test of testToByteArray method, of class ByteArray.
     */
    @Test
    public void testToByteArray() {
        String teste = "[44,dd,11,22|ff,bb,88,33|aa,66,cc,55|99,00,77,77]";
        ByteArray correto = new ByteArray(new int[]{ 0x44,0xDD,0x11,0x22,
                                                     0xFF,0xBB,0x88,0x33,
                                                     0xAA,0x66,0xCC,0x55,
                                                     0x99,0x00,0x77,0x77});
        assertTrue(ByteArray.toByteArray(teste).equals(correto));
    }
    /**
     * Test of testToByteArray method, of class ByteArray.
     */
    @Test
    public void testStringConstructor() {
        String stringTeste = "[44,dd,11,22|ff,bb,88,33|aa,66,cc,55|99,00,77,77]";
        ByteArray correto = new ByteArray(new int[]{ 0x44,0xDD,0x11,0x22,
                                                     0xFF,0xBB,0x88,0x33,
                                                     0xAA,0x66,0xCC,0x55,
                                                     0x99,0x00,0x77,0x77});
        ByteArray teste = new ByteArray(stringTeste);
        assertTrue(teste.equals(correto));
    }
    
    /**
     * Test of partition method, of class ByteArray.
     */
    @Test
    public void testPartition() {
        String testes[] = {"[44,dd,11,22]","[ff,bb,88,33]","[aa,66,cc,55]","[99,00,77,77]"};
        ByteArray testesB[] = new ByteArray[]{  ByteArray.toByteArray(testes[0]),
                                                ByteArray.toByteArray(testes[1]),
                                                ByteArray.toByteArray(testes[2]),
                                                ByteArray.toByteArray(testes[3])};
        ByteArray correto = new ByteArray(new int[]{ 0x44,0xDD,0x11,0x22,
                                                     0xFF,0xBB,0x88,0x33,
                                                     0xAA,0x66,0xCC,0x55,
                                                     0x99,0x00,0x77,0x77});
        for (int i : new int[]{1,2,4,8,16}) {
            assertTrue(correto.equals(ByteArray.concatenateAll(ByteArray.partition(correto,i))));
            System.out.println(ByteArray.partition(correto,i));
        }
    }
}
