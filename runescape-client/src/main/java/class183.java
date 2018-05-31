import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class183 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1482189207
   )
   static int field2344;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2077994379
   )
   static int field2346;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 298568903
   )
   static int field2342;
   @ObfuscatedName("l")
   static byte[][] field2340;
   @ObfuscatedName("u")
   static byte[][] field2343;
   @ObfuscatedName("q")
   static byte[][] field2345;
   @ObfuscatedName("k")
   static int[] field2348;
   @ObfuscatedName("i")
   static int[] field2347;
   @ObfuscatedName("x")
   static byte[][][] field2341;

   static {
      field2344 = 0;
      field2346 = 0;
      field2342 = 0;
      field2340 = new byte[1000][];
      field2343 = new byte[250][];
      field2345 = new byte[50][];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "-2010983682"
   )
   static synchronized byte[] method3773(int var0, boolean var1) {
      byte[] var2;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field2344 > 0) {
         var2 = field2340[--field2344];
         field2340[field2344] = null;
         return var2;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field2346 > 0) {
         var2 = field2343[--field2346];
         field2343[field2346] = null;
         return var2;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field2342 > 0) {
         var2 = field2345[--field2342];
         field2345[field2342] = null;
         return var2;
      }

      if(field2341 != null) {
         for(int var4 = 0; var4 < field2348.length; ++var4) {
            if(field2348[var4] != var0) {
               if(var0 < field2348[var4]) {
                  ;
               }
            } else if(field2347[var4] > 0) {
               byte[] var3 = field2341[var4][--field2347[var4]];
               field2341[var4][field2347[var4]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }
}
