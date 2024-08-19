/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biclique;

import cifras.Cipher;
import cifras.Future;
import cifras.Rijndael;
import cifras.Serpent;
import java.util.List;
import util.ByteArray;
import util.Util;

/**
 *
 * @author clique
 */
public class ImplementedBicliqueAttacks {
    
    static final int PRINT_ALL = 1;
    static final int PRINT = 2;
    static final int RECOMPUTATION = 3;
    static final int DELTA = 4;
    static final int DELTA1 = DELTA;
    static final int DELTA2 = 5;
    static final int NABLA = 6;
    static final int NABLA1 = NABLA;
    static final int NABLA2 = 7;
    
    private static void print(Biclique b, int option){
        
        switch(option){
            case PRINT:
                System.out.println(b);
                break;
            case PRINT_ALL:
                b.printAll();
                break;
            case RECOMPUTATION:
                System.out.println(Util.toTikzDiagramRecomputation(b));
                break;
            case DELTA:
                System.out.println(Util.toTikzDiagramRelatedKeyDifferential(b.getDeltas().get(0), "blue"));
                break;
            case DELTA2:
                System.out.println(Util.toTikzDiagramRelatedKeyDifferential(b.getDeltas().get(1), "salmon"));
                break;
            case NABLA:
                System.out.println(Util.toTikzDiagramRelatedKeyDifferential(b.getNablas().get(0), "green"));
                break;
            case NABLA2:
                System.out.println(Util.toTikzDiagramRelatedKeyDifferential(b.getNablas().get(1), "darkgreen"));
                break;
        }
    }
    
    public static void current(int option) {
        
//        Biclique{///possivelmente o melhor
//      deltas :
//	deltas :
//	key : 0, 1
//	keyDiff : [00,00,00,00|00,00,00,00|00,0f,00,00|00,00,00,00]
//	
//	nablas :
//	key : 0, 1
//	keyDiff : [00,00,00,00|00,00,00,00|f0,00,00,00|00,00,00,00]
//        }
        Future future = new Future();
        int fromstate = future.getINDEX_OF_STATE_POST_KEY(7),
            tostate   = future.getINDEX_OF_STATE_POST_KEY(10);
        System.out.println("biclique from "+fromstate+ " up to "+tostate);
        
        Biclique b = new Biclique(   
                Util.concat(
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|00,0f,00,00|00,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "delta"
                        ),
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|f0,00,00,00|00,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "nabla")
                ), 
                future.getINDEX_OF_STATE_POST_KEY(4), 
                Util.toIntegerList(3)
        );
        print(b,option);
    }

    public static void futureBest(int option){
        
//        TESTE Future MELHOR ATÉ AGORA
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
        print(b,option);
    }

    public static void futureArtigo(int option){
        
//        TESTE Future DO ARTIGO
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
                                         "[00,ff,0f,f0|0f,f0,0f,f0|00,00,00,00|00,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "delta"
                        ),
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|f0,0f,f0,0f|ff,00,0f,f0]"),
                                0,
                                new Future(),
                                new Future(),
                                "nabla")
                ), 
                future.getINDEX_OF_STATE_POST_KEY(4), 
                Util.toIntegerList(3)
        );
        print(b,option);
    }

    public static void futureEstrela(int option){
        
//        TESTE Future ESTRELA
        Future future = new Future();
        int fromstate = 0,
            tostate   = 10;
        System.out.println("biclique from "+fromstate+ " up to "+tostate);
        
        Biclique b = new Biclique(   
                Util.concat(
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|00,00,00,00|00,00,f0,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "delta"
                        ),
                        new RelatedKeyDifferential(
                                fromstate,
                                tostate,
                                ByteArray.toByteArray(
                                         "[00,00,00,00|00,00,00,00|00,0f,00,00|0,00,00,00]"),
                                0,
                                new Future(),
                                new Future(),
                                "delta")
                ), 
                future.getINDEX_OF_STATE_POST_KEY(5), 
                Util.toIntegerList(3)
        );
        print(b,option);
    }

    public static void serpentFirst1(int option){
        
//        TESTE SERPENT1 (First biclique of Serpent)
        Biclique b = new Biclique(   Util.concat(
                                new RelatedKeyDifferential(85,
                                        96,
                                        ByteArray.toByteArray("[00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00|"
                                                             + "00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,0f]"),
                                        29,
                                        new Serpent(),
                                        new Serpent(),
                                        "delta"),
                                new RelatedKeyDifferential(85,
                                        96,
                                        ByteArray.toByteArray("[00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00|"
                                                             + "00,00,00,00|00,00,f0,00|00,00,00,00|00,00,00,00]"),
                                        31,
                                        new Serpent(),
                                        new Serpent(),
                                        "nabla")), 
                        6, 
                        Util.toIntegerList(6,7));
        print(b,option);
    }

    public static void serpentFirst2(int option){
        
        ////TESTE SERPENT2 (First biclique of Serpent)
        Biclique b = new Biclique(   Util.concat(
                                new RelatedKeyDifferential(88,
                                        96,
                                        ByteArray.toByteArray("[00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00|"
                                                             + "00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,ff]"),
                                        30,
                                        new Serpent(),
                                        new Serpent(),
                                        "delta"),
                                new RelatedKeyDifferential(88,
                                        96,
                                        ByteArray.toByteArray("[00,00,00,00|00,0f,f0,00|00,00,00,00|00,00,00,00|"
                                                             + "00,00,00,00|00,00,00,00|00,00,00,00|00,00,00,00]"),
                                        31,
                                        new Serpent(),
                                        new Serpent(),
                                        "nabla")), 
                        6, 
                        Util.toIntegerList(6,7));
        print(b,option);
    }

    public static void rijndaelFastestMinimal(int option){
        
//        TESTE AES FASTEST (Bicliques with Minimal Data and Time Complexity for AES)
        Biclique b = new Biclique(   
                                Util.concat(new RelatedKeyDifferential(
                                        new Rijndael().getINDEX_OF_STATE_POST_KEY(7),
                                        new Rijndael().getNUM_STATES()-1,
                                        ByteArray.toByteArray("[ff,ff,ff,ff|00,00,00,00|00,00,00,00|00,00,00,00"),
                                        9,
                                        new Rijndael(),
                                        new Rijndael(),
                                        "delta"),
                                        new RelatedKeyDifferential(
                                        new Rijndael().getINDEX_OF_STATE_POST_KEY(7),
                                        new Rijndael().getNUM_STATES()-1,
                                        ByteArray.toByteArray("[00,00,00,00|00,ff,ff,00|00,00,00,00|00,00,00,00"),
                                        9,
                                        new Rijndael(),
                                        new Rijndael(),
                                        "nabla")),
                                
                                new Rijndael().getINDEX_OF_STATE_POST_KEY(3),
                                Util.toIntegerList(3));
        print(b,option);        
    }

    public static void rijndaelFastestFullCodebook(int option){
        
        ///AES BOGANOV FASTEST (using all codebook)
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(2, 0xff);
        keyDiff.set(3, 0xff);
        RelatedKeyDifferential c = new RelatedKeyDifferential(5, 16, keyDiff, 2, cipher1, cipher2, "delta");
//        System.out.println(c);
        
        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(0, 0xff);
        keyDiff.set(2, 0xff);
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(5, 16, keyDiff, 2, cipher1, cipher2, "nabla");
//        System.out.println(c2);
        
        Biclique b = new Biclique(Util.concat(c, c2), 29, Util.toIntegerList(3));
        print(b,option);
    }

    public static void rijndaelStar(int option){
        
//        ///AES BOGANOV STAR
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(2, 0xff);
        RelatedKeyDifferential c = new RelatedKeyDifferential(0, 5, keyDiff, 0, cipher1, cipher2, "delta");
//        System.out.println(c);
        
        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(0, 0xff);
        keyDiff.set(1, 0xff);
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(0, 5, keyDiff, 0, cipher1, cipher2, "delta");
//        System.out.println(c2);
        
        Biclique b = new Biclique(Util.concat(c, c2), 21, Util.toIntegerList(3));
        print(b,option);
    }

    public static void rijndaelFastest(int option){
        
//        ///AES BOGANOV FASTEST (not using full codebook) - Tudo indica estar errado no paper.
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(0, 0xff);
        keyDiff.set(1, 0xff);
        keyDiff.set(2, 0xff);
        keyDiff.set(3, 0xff);
        RelatedKeyDifferential c = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 9, cipher1, cipher2, "delta");
//        System.out.println(c);

        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(5, 0xff);
        keyDiff.set(6, 0xff);
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 9, cipher1, cipher2, "nabla");
//        System.out.println(c2);

        Biclique b = new Biclique(Util.concat(c, c2), 9, Util.toIntegerList(3));
        print(b,option);
    }

    public static void rijndaelTao1(int option){
        
        ///AES TAO 1
        Cipher cipher1,cipher2;
        ByteArray keyDiff1,keyDiff2,keyDiff3;
        RelatedKeyDifferential c1, c2, c3;

        cipher1 = new Rijndael();
        cipher2 = new Rijndael();
        keyDiff1 = ByteArray.toByteArray("[00,00,00,00|ff,00,ff,00|00,00,00,00|00,00,00,00]");
        keyDiff2 = ByteArray.toByteArray("[ff,00,ff,00|00,00,00,00|00,00,00,00|00,00,00,00]");
        keyDiff3 = ByteArray.toByteArray("[00,00,00,00|00,00,00,00|00,ff,00,00|00,00,00,00]");
        c1 = new RelatedKeyDifferential(29,
                                        cipher1.getNUM_STATES()-1,
                                        keyDiff1,
                                        8,
                                        cipher1,
                                        cipher2,
                                        "nabla");
        c2 = new RelatedKeyDifferential(29,
                                        cipher1.getNUM_STATES()-1,
                                        keyDiff2,
                                        8,
                                        cipher1,
                                        cipher2,
                                        "nabla");
        c3 = new RelatedKeyDifferential(29,
                                        cipher1.getNUM_STATES()-1,
                                        keyDiff3,
                                        8,
                                        cipher1,
                                        cipher2,
                                        "delta");
        Biclique b = new Biclique(   Util.concat(c1, c2, c3),
                        9,
                        Util.toIntegerList(0));
        print(b,option);
    }

    public static void rijndaelTao2(int option){
        
        ///AES TAO 2
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(4, 0xff);
        keyDiff.set(6, 0xff);
        RelatedKeyDifferential c = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 8, cipher1, cipher2, "nabla");
//        System.out.println(keyDiff);
        
        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(0, 0xff);
        keyDiff.set(2, 0xff);
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 8, cipher1, cipher2, "nabla");
//        System.out.println(keyDiff);

        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(13, 0xff);
        RelatedKeyDifferential c3 = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 8, cipher1, cipher2, "delta");
//        System.out.println(keyDiff);
        
        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(2, 0xff);
        RelatedKeyDifferential c4 = new RelatedKeyDifferential(29, cipher1.getNUM_STATES()-1, keyDiff, 8, cipher1, cipher2, "delta");
//        System.out.println(keyDiff);

        Biclique b = new Biclique(Util.concat(Util.concat(Util.concat(c, c2), c3), c4),9,Util.toIntegerList(0));
        print(b,option);
    }

    public static void rijndaelOriginal(int option){
        
        ///AES BOGDANOV ORIGINAL
        Cipher cipher1 = new Rijndael();
        Cipher cipher2 = new Rijndael();
        ByteArray keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(2, 0xff);
        keyDiff.set(3, 0xff);
        RelatedKeyDifferential c = new RelatedKeyDifferential(
                                                    29, 
                                                    cipher1.getNUM_STATES() - 1,
                                                    keyDiff, 
                                                    8, 
                                                    cipher1, 
                                                    cipher2,
                                                    "delta");
        //System.out.println(c);
        keyDiff = new ByteArray(cipher1.getBLOCK_SIZE_IN_BYTES());
        keyDiff.set(4, 0xff);
        keyDiff.set(6, 0xff);
        RelatedKeyDifferential c2 = new RelatedKeyDifferential(
                                                29, 
                                                cipher1.getNUM_STATES() - 1, 
                                                keyDiff, 
                                                8, 
                                                cipher1, 
                                                cipher2, 
                                                "nabla");
        //System.out.println(c2);
        Biclique b = new Biclique(Util.concat(c, c2),9,Util.toIntegerList(0));
        b.printAll();
//        System.out.println(Util.toTikzDiagramRecomputation(b));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c,"blue"));
//        System.out.println(Util.toTikzDiagramRelatedKeyDifferential(c2,"green"));
    }
}
