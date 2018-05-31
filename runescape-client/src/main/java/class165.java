import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class165 {
   @ObfuscatedName("s")
   static int[][] field2035;
   @ObfuscatedName("l")
   static int[][] field2041;
   @ObfuscatedName("u")
   @Export("tileOverlayIds")
   static byte[][][] tileOverlayIds;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 294749139
   )
   static int field2037;
   @ObfuscatedName("i")
   static int[] field2039;
   @ObfuscatedName("x")
   static int[] field2038;

   static {
      field2035 = new int[128][128];
      field2041 = new int[128][128];
      field2039 = new int[4096];
      field2038 = new int[4096];
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2015697461"
   )
   static final boolean method3437() {
      return class120.Viewport_containsMouse;
   }
}
