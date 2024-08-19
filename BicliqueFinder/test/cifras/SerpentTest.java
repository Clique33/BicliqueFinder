/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

import java.util.Arrays;
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
public class SerpentTest {
    
    public SerpentTest() {
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
     * Test of getNUM_WORDS_KEY_DELTA method, of class Serpent.
     */
    @Test
    public void testSBEncriptForward() {
        ByteArray b1 = new ByteArray(new int[]{ 0x11,0x22,0x33,0x44,
                                                0x55,0x66,0x77,0x88,
                                                0x99,0xAA,0xBB,0xCC,
                                                0xDD,0xEE,0xFF,0xFF});
        String testes[] =   ("[44,dd,11,22|ff,bb,88,33|aa,66,cc,55|99,00,77,77]\n" +
                            "[ff,77,44,ee|22,dd,11,aa|66,cc,bb,99|55,33,88,88]\n" +
                            "[11,ee,88,dd|66,22,bb,ff|cc,99,77,33|aa,55,00,00]\n" +
                            "[cc,88,22,44|99,11,77,55|bb,33,ee,aa|00,66,dd,dd]\n" +
                            "[11,88,ee,66|bb,33,44,99|77,22,dd,cc|00,55,aa,aa]\n" +
                            "[dd,44,77,ff|22,88,ee,cc|00,11,aa,66|99,bb,55,55]\n" +
                            "[ee,77,bb,aa|44,dd,11,55|88,cc,66,99|33,22,ff,ff]\n" +
                            "[88,aa,11,33|ff,44,22,bb|66,77,cc,00|55,ee,99,99]\n" +
                            "[00,99,ee,66|33,ff,55,11|dd,cc,77,bb|44,22,88,88]\n" +
                            "[77,00,99,33|44,66,aa,22|88,55,ee,cc|bb,ff,11,11]\n" +
                            "[66,44,99,88|ff,33,00,bb|11,22,cc,55|aa,ee,77,77]\n" +
                            "[aa,dd,00,66|99,88,77,44|ff,ee,33,bb|55,22,cc,cc]\n" +
                            "[dd,ee,33,00|66,99,aa,11|22,88,55,bb|cc,44,ff,ff]\n" +
                            "[88,bb,55,66|ff,00,33,44|77,22,cc,11|aa,ee,99,99]\n" +
                            "[66,99,00,cc|bb,77,dd,ff|11,33,ee,55|22,88,44,44]\n" +
                            "[ff,00,66,aa|11,dd,88,99|44,55,bb,cc|77,22,ee,ee]\n" +
                            "[cc,44,11,77|aa,bb,66,88|55,33,ff,dd|00,ee,99,99]\n" +
                            "[bb,22,cc,44|77,dd,11,55|00,ff,aa,33|99,88,66,66]\n" +
                            "[22,11,bb,aa|dd,77,88,ff|99,cc,55,66|33,00,ee,ee]\n" +
                            "[88,cc,77,11|ee,22,dd,66|ff,00,99,aa|44,55,33,33]\n" +
                            "[11,aa,ff,99|22,66,88,00|dd,33,44,ee|77,55,bb,bb]\n" +
                            "[ff,44,22,77|cc,99,55,66|11,dd,ee,00|bb,33,88,88]\n" +
                            "[ee,ff,55,22|88,cc,33,77|00,44,aa,11|dd,bb,66,66]\n" +
                            "[33,22,cc,99|55,ff,aa,bb|ee,11,77,66|00,88,dd,dd]\n" +
                            "[bb,22,ee,ff|00,88,dd,33|cc,99,77,55|aa,66,11,11]\n" +
                            "[00,bb,77,44|99,11,aa,ee|33,55,cc,22|ff,88,66,66]\n" +
                            "[44,bb,dd,cc|33,77,ee,aa|ff,66,88,00|55,99,22,22]\n" +
                            "[bb,dd,88,11|44,aa,77,99|55,00,ff,ee|22,33,cc,cc]\n" +
                            "[22,88,44,66|ff,bb,11,aa|99,33,ee,55|00,cc,77,77]\n" +
                            "[ff,dd,88,aa|33,77,44,cc|55,66,bb,00|ee,99,22,22]\n" +
                            "[bb,44,11,99|cc,ee,22,00|66,aa,dd,ff|33,55,88,88]\n" +
                            "[11,ee,77,44|aa,88,dd,ff|cc,99,00,33|55,66,bb,bb]").split("\n");
        ByteArray correto;
        
        Serpent serpent = new Serpent(ByteArray.concatenateAll(b1,b1),31);
        List<ByteArray> result;
        
        for (int i = 0; i < 32; i++) {
            correto = ByteArray.toByteArray(testes[i]);
            result = serpent.encryptForward(b1, 3*i+1, 3*i+2);
            assertTrue(result.get(result.size()-1).equals(correto));
        }
    }

    /**
     * Test of getNUM_WORDS_KEY_DELTA method, of class Serpent.
     */
    @Test
    public void testSB() {
        System.out.println(Arrays.toString(new Serpent().getINDEXES_OF_PRE_SBOX_STATES()));
        ByteArray b1 = new ByteArray(new int[]{ 0x11,0x22,0x33,0x44,
                                                0x55,0x66,0x77,0x88,
                                                0x99,0xAA,0xBB,0xCC,
                                                0xDD,0xEE,0xFF,0xFF});
        
        ByteArray b2 = new ByteArray(new int[]{ 0x00,0xBB,0x77,0x44,
                                                0x44,0xBB,0xDD,0xCC,
                                                0xBB,0xDD,0x88,0x11,
                                                0x22,0x88,0x44,0x66});
        
        ByteArray correto;
        Serpent serpent = new Serpent(ByteArray.concatenateAll(b1,b2),31);
//        ByteArray teste = serpent.encryptForward(b3, 0, 0)
        for (int i = 0; i < 32; i++) {
            correto = serpent.SB(b1, i);
            assertTrue(b1.equals(serpent.SB_1(correto,i)));
        }
    }
    
    /**
     * Test of L method, of class Serpent.
     */
    @Test
    public void testL() {
        //testado no papel
        ByteArray correto = new ByteArray(new int[]{ 0xEB,0x93,0x55,0x1D,
                                                     0x11,0xB6,0x33,0x7A,
                                                     0x12,0x25,0x7D,0xF5,
                                                     0x90,0x02,0x29,0xC5});
        
        ByteArray b2 = new ByteArray(new int[]{ 0x00,0xBB,0x77,0x44,
                                                0x44,0xBB,0xDD,0xCC,
                                                0xBB,0xDD,0x88,0x11,
                                                0x22,0x88,0x44,0x66});
        
        Serpent serpent = new Serpent(ByteArray.concatenateAll(correto,b2),31);
        ByteArray postL = serpent.L(b2);
        
        for (int i = 0; i < 16; i++) {
            assertTrue("post["+i+"] = "+Integer.toHexString(postL.get(i))+
                     "\ntest["+i+"] = "+Integer.toHexString(correto.get(i)),postL.get(i)==correto.get(i));
        }
    }
    
    /**
     * Test of L_1 method, of class Serpent.
     */
    @Test
    public void testL_1() {
        //testado no papel
        ByteArray correto = new ByteArray(new int[]{ 0x00,0xBB,0x77,0x44,
                                                     0x44,0xBB,0xDD,0xCC,
                                                     0xBB,0xDD,0x88,0x11,
                                                     0x22,0x88,0x44,0x66});
        
        ByteArray b2 = new ByteArray(new int[]{ 0xEB,0x93,0x55,0x1D,
                                                0x11,0xB6,0x33,0x7A,
                                                0x12,0x25,0x7D,0xF5,
                                                0x90,0x02,0x29,0xC5});
        
        Serpent serpent = new Serpent(ByteArray.concatenateAll(correto,b2),31);
        ByteArray postL = serpent.L_1(b2);
        
        for (int i = 0; i < 16; i++) {
            assertTrue("post["+i+"] = "+Integer.toHexString(postL.get(i))+
                     "\ntest["+i+"] = "+Integer.toHexString(correto.get(i)),postL.get(i)==correto.get(i));
        }
    }
    /**
     * Test of L_1 method, of class Serpent.
     */
    @Test
    public void testLs() {
        //testado no papel
        ByteArray teste = new ByteArray(new int[]{ 0x00,0xBB,0x77,0x44,
                                                     0x44,0xBB,0xDD,0xCC,
                                                     0xBB,0xDD,0x88,0x11,
                                                     0x22,0x88,0x44,0x66});
        
        Serpent serpent = new Serpent(ByteArray.concatenateAll(teste,teste),31);
        ByteArray postL = serpent.L(teste);
        ByteArray postL_1 = serpent.L_1(postL);
        
        for (int i = 0; i < 16; i++) {
            assertTrue("teste["+i+"] = "+Integer.toHexString(teste.get(i))+
                     "\npostL_1["+i+"] = "+Integer.toHexString(postL.get(i)),teste.get(i)==postL_1.get(i));
        }
    }
    
    /**
     * Test of encryptFull method, of class Serpent.
     */
    @Test
    public void testEncryptFull() {
        Serpent serpent = new Serpent();
        
        String testes[] = ( "[00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
                            "[00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]\n" +
                            "[ee,ee,ee,ee|ee,ee,ee,ee|ee,ee,ee,ee|ee,ee,ee,ee]\n" +
                            "[bb,bb,db,bb|bb,bb,bb,bb|93,04,44,44|bb,bb,b8,bb]\n" +
                            "[bb,bb,db,bb|bb,bb,bb,bb|93,04,44,44|bb,bb,b8,bb]\n" +
                            "[bb,bb,5b,bb|bb,bb,bb,bb|64,0e,ee,ee|bb,bb,ba,bb]\n" +
                            "[c4,54,7f,30|d6,ee,ec,ee|04,db,2e,8e|3b,bb,38,60]\n" +
                            "[5d,97,b3,ad|cc,0d,1c,68|cb,30,ef,c0|c8,79,0d,de]\n" +
                            "[6a,cb,78,9a|33,4a,13,2f|37,84,50,34|3f,bc,4a,a5]\n" +
                            "[51,30,50,45|c7,ca,29,a6|37,36,d9,ad|82,50,e6,7d]\n" +
                            "[25,97,25,50|de,0e,4b,ce|d3,57,aa,9f|fa,c4,ce,a3]\n" +
                            "[89,b7,89,9f|06,f6,4e,a6|02,97,33,bd|d3,a4,a6,32]\n" +
                            "[15,1e,ea,bf|48,c2,33,44|b3,cd,3e,42|41,59,35,27]\n" +
                            "[5b,0e,5a,16|7c,08,b2,bc|ed,a3,58,e9|b5,35,60,e0]\n" +
                            "[bd,f5,b2,13|4c,f9,d8,dc|50,2e,b9,57|db,eb,3f,5f]\n" +
                            "[48,eb,a6,16|42,a1,20,7a|53,a5,d0,7f|46,a4,0a,f4]\n" +
                            "[0e,78,ea,94|46,38,ec,04|32,ba,55,2d|4e,5d,1d,80]\n" +
                            "[3b,ec,b1,0f|f8,7c,b6,3f|74,a1,22,49|fb,29,d9,c3]\n" +
                            "[66,18,c1,25|2a,e9,11,03|ef,11,9e,68|97,f8,30,77]\n" +
                            "[dc,69,6a,cd|b2,ba,f5,89|b4,c6,4e,67|42,09,b1,0f]\n" +
                            "[39,d8,dc,93|67,6c,f4,58|6a,9d,a2,d1|a7,08,6e,0f]\n" +
                            "[eb,e6,7e,a2|b7,ed,fa,d9|07,06,4c,35|bb,20,ae,17]\n" +
                            "[c7,70,27,a0|98,c7,d9,90|68,b6,ca,07|23,48,ab,d2]\n" +
                            "[02,2d,a2,7d|6b,02,56,6d|4b,c4,07,d2|a1,3b,7c,5a]\n" +
                            "[70,58,91,ff|fc,ed,14,e4|2f,26,e2,8f|b3,20,70,2e]\n" +
                            "[30,24,25,75|a5,82,16,4e|d2,83,32,b8|25,91,0f,64]\n" +
                            "[ea,96,93,53|c3,19,0f,62|49,1e,e9,71|93,d0,a8,f6]\n" +
                            "[a5,27,df,7d|05,47,b5,8d|cb,b4,4a,5e|3a,04,f6,24]\n" +
                            "[30,da,01,fd|d2,97,db,a1|ac,fe,30,e6|63,f3,64,7d]\n" +
                            "[9d,b5,d7,1b|b0,8a,be,57|5c,1f,9d,f6|69,19,63,ab]\n" +
                            "[61,5f,71,a0|c6,e1,5c,94|47,7b,d6,9c|7f,08,d4,af]\n" +
                            "[aa,86,7a,d5|4b,16,4d,70|bf,54,c8,73|8b,06,26,4a]\n" +
                            "[22,b3,02,af|8c,63,8a,0d|c7,f8,5b,09|bc,d3,43,82]\n" +
                            "[d8,60,34,83|a1,ca,5b,b2|c3,81,6c,ef|df,5c,be,40]\n" +
                            "[b3,b4,40,fb|5b,c3,6a,3d|90,f6,51,75|7b,69,40,bf]\n" +
                            "[30,36,61,c3|93,b0,8e,05|f1,c8,9a,79|73,8f,61,3c]\n" +
                            "[0e,c2,b6,d2|58,0f,12,7e|40,63,63,23|04,41,61,ce]\n" +
                            "[3a,13,5e,32|47,99,01,c3|59,91,97,1f|a7,21,1c,19]\n" +
                            "[38,d3,64,3e|0a,22,7d,b3|62,2d,2a,df|8a,ed,db,d2]\n" +
                            "[29,bf,22,4d|d8,90,c2,f7|61,21,14,b4|dd,5a,fc,ff]\n" +
                            "[07,10,c8,ab|75,a7,d2,c6|72,f9,25,c9|f2,69,81,3a]\n" +
                            "[d3,8d,14,2c|3f,23,ab,10|3b,97,bf,17|9b,07,48,52]\n" +
                            "[9e,db,37,cc|0d,42,f2,66|84,2d,bd,5e|cb,31,b1,a9]\n" +
                            "[7c,bd,e9,e1|ce,2b,8c,9a|06,ff,45,7b|64,e2,2b,73]\n" +
                            "[d5,e2,81,86|58,9e,f5,13|a7,44,cb,de|7c,89,9e,d0]\n" +
                            "[9e,ab,54,25|e8,4f,62,fe|c5,a2,47,70|94,8a,e2,e3]\n" +
                            "[d7,0c,9f,dc|cc,96,e5,8f|7c,1d,35,d5|c9,dc,60,d4]\n" +
                            "[78,3c,4e,7c|cc,4d,21,9e|8c,f7,61,71|c4,7c,d3,7a]\n" +
                            "[fc,62,76,ca|03,fc,fb,c7|de,91,05,a3|dd,d0,67,76]\n" +
                            "[db,7e,3f,8c|04,52,59,04|54,c1,73,8c|8a,56,a3,db]\n" +
                            "[0f,6e,19,8d|27,a4,a5,27|a7,dc,61,8d|83,ab,31,0f]\n" +
                            "[fa,99,e6,ad|ce,7c,6b,8a|0f,d8,93,f3|62,99,05,52]\n" +
                            "[7b,63,5b,db|fe,d0,ab,f3|8a,80,8d,f4|fc,8e,0c,db]\n" +
                            "[1a,dc,7a,9a|68,9e,fa,6c|5f,5e,59,64|63,58,e3,9a]\n" +
                            "[cc,18,ce,23|09,2a,b5,5b|b4,fd,ec,55|98,19,30,71]\n" +
                            "[a2,24,03,b0|ff,e1,77,b5|47,c6,c3,82|ed,58,ab,6c]\n" +
                            "[c1,1a,4b,54|ee,02,88,5d|a8,67,6b,f1|03,df,c5,76]\n" +
                            "[05,18,76,fb|49,6f,aa,11|a2,0b,30,e9|d8,2d,f1,85]\n" +
                            "[40,59,fd,01|8e,0d,99,33|bf,42,84,34|27,d2,1d,4d]\n" +
                            "[1b,ef,34,b8|65,b4,ff,77|93,1c,61,71|cd,4c,84,14]\n" +
                            "[30,79,6e,3e|9c,de,f0,3c|6f,1f,14,4b|8b,ca,38,30]\n" +
                            "[b0,5f,62,d5|b1,60,be,2e|8e,ad,35,b6|88,f1,bb,8f]\n" +
                            "[4c,2b,6a,72|41,6c,45,a5|05,37,f2,46|00,b1,44,0b]\n" +
                            "[44,ba,0e,51|59,26,90,56|24,41,2e,ac|be,4d,09,a1]\n" +
                            "[c6,61,c0,fd|f8,04,52,51|0b,e0,c2,9f|56,49,52,27]\n" +
                            "[09,9f,0a,8b|86,a7,c4,cf|ae,3a,04,18|c9,71,c4,45]\n" +
                            "[25,25,c3,35|5d,0e,c3,73|47,38,f1,c5|15,76,8c,59]\n" +
                            "[a1,08,a4,96|f5,77,c3,9b|21,b2,b5,c1|c3,2a,84,75]\n" +
                            "[4e,97,42,0c|68,33,15,0a|fe,af,a8,1e|15,f4,72,38]\n" +
                            "[3e,4f,78,50|2b,0d,dd,c1|e9,8c,4b,63|42,be,2f,d1]\n" +
                            "[3a,b6,32,5b|e3,89,85,a0|6d,7d,f9,14|dd,cf,9a,7c]\n" +
                            "[c1,7f,c2,57|8c,be,b5,14|f0,a0,de,39|00,6d,e1,a6]\n" +
                            "[e2,25,36,d1|e9,33,59,3a|1b,20,b0,b9|9e,68,88,a3]\n" +
                            "[91,fe,10,a7|49,a4,3f,dc|96,99,bb,3c|11,18,9f,98]\n" +
                            "[cb,16,b4,9d|fc,9f,e1,a5|c8,cc,77,e5|bb,b3,c1,c3]\n" +
                            "[66,ce,b9,ea|23,7f,32,09|42,97,c8,11|a6,da,fe,a4]\n" +
                            "[ea,57,0c,c5|0b,46,e9,68|4d,59,94,a0|1a,5c,96,47]\n" +
                            "[85,9a,d2,29|dc,41,83,1e|4f,93,34,5d|05,92,31,4a]\n" +
                            "[8c,65,25,39|07,2d,05,cf|4f,de,c4,16|91,0b,1c,55]\n" +
                            "[52,4a,ff,47|08,77,1d,d8|7d,cc,7b,d9|68,4a,87,d9]\n" +
                            "[3b,c6,22,ce|1a,ee,45,5a|e5,00,e8,5f|7a,c6,ae,5f]\n" +
                            "[6a,05,f7,71|48,e2,58,fb|d1,d7,b0,23|07,eb,b0,38]\n" +
                            "[92,4c,4c,4e|02,40,08,2a|74,e6,9c,2f|6a,5c,0a,9d]\n" +
                            "[5d,1e,1e,13|6d,16,69,d0|71,3a,5e,dc|a0,4e,60,52]\n" +
                            "[22,6f,6f,43|1d,34,c4,42|de,35,15,40|c7,e5,d4,9b]\n" +
                            "[07,9c,65,60|c5,f1,cb,88|26,41,a1,68|a9,80,07,cd]\n" +
                            "[d1,95,bf,bd|5f,72,5e,aa|8b,62,32,ba|39,ad,d1,50]\n" +
                            "[ad,ab,79,b2|a2,50,6b,91|ce,bc,fb,b5|80,ca,8a,6e]\n" +
                            "[98,89,0f,79|6f,ae,b5,28|e3,d8,be,ce|80,fc,67,0d]\n" +
                            "[5c,c5,12,45|72,69,b3,dc|98,ec,b9,09|c1,20,74,1e]\n" +
                            "[07,47,44,d0|22,02,d8,b4|d1,b1,9e,76|00,70,49,0a]\n" +
                            "[88,f6,65,e6|8a,bd,d4,76|b2,44,2f,25|6f,b1,9b,39]\n" +
                            "[00,8e,ec,5e|0a,d3,39,2e|d4,99,48,4c|e8,db,6d,16]\n" +
                            "[a3,62,82,70|7f,07,28,52|cd,80,32,65|27,97,fc,50]\n" +
                            "[1c,f4,77,17|7f,53,19,10|01,c3,db,15|d1,a7,83,c6]\n" +
                            "[13,b4,dd,1d|db,a7,1c,12|21,37,50,1a|51,9d,f7,38]\n" +
                            "[75,c4,30,66|7c,88,f8,8a|b6,5a,0c,f7|fb,4d,61,2a]").split("\n");
        
        ByteArray finalByteArray = ByteArray.toByteArray("[75,c4,30,66|7c,88,f8,8a|b6,5a,0c,f7|fb,4d,61,2a]");
        List<ByteArray> encript;
        
        ByteArray b,f;
        for (int i = 0; i < testes.length-1; i++) {
            encript = serpent.encryptFull(ByteArray.toByteArray(testes[i]), i);
            assertTrue(""+encript,encript.get(encript.size()-1).equals(finalByteArray));
            assertTrue(""+encript,encript.get(0).equals(new ByteArray(16)));
            
        }
    }
}
