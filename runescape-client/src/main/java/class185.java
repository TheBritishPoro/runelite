import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class185 {
   @ObfuscatedName("e")
   static final int[] field2361;
   @ObfuscatedName("p")
   static final int[] field2362;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   @Export("NetCache_reference")
   public static Buffer NetCache_reference;
   @ObfuscatedName("h")
   static int[] field2364;

   static {
      field2361 = new int[2048];
      field2362 = new int[2048];
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2361[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field2362[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "29745"
   )
   public static void method3787() {
      if(MouseInput.mouse != null) {
         MouseInput var0 = MouseInput.mouse;
         synchronized(MouseInput.mouse) {
            MouseInput.mouse = null;
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ZZI)I",
      garbageValue = "-249249572"
   )
   public static int method3786(boolean var0, boolean var1) {
      byte var2 = 0;
      int var3 = var2 + class250.NetCache_pendingPriorityResponsesCount + class250.NetCache_pendingPriorityWritesCount;
      return var3;
   }
}
