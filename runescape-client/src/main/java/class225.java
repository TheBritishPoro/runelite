import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class225 {
   @ObfuscatedName("z")
   @Export("varpsMasks")
   static int[] varpsMasks;
   @ObfuscatedName("w")
   @Export("serverVarps")
   public static int[] serverVarps;
   @ObfuscatedName("s")
   @Export("clientVarps")
   public static int[] clientVarps;
   @ObfuscatedName("u")
   @Export("indexedSpriteOffsetYs")
   static int[] indexedSpriteOffsetYs;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   static Task field2556;

   static {
      varpsMasks = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         varpsMasks[var1] = var0 - 1;
         var0 += var0;
      }

      serverVarps = new int[2000];
      clientVarps = new int[2000];
   }
}
