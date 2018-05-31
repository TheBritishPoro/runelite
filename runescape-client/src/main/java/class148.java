import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class148 implements class147 {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1540985035
   )
   @Export("idxCount")
   public static int idxCount;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-75"
   )
   static void method3195(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(World.field946[var5] != var0) {
            var2[var4] = World.field946[var5];
            var3[var4] = World.field939[var5];
            ++var4;
         }
      }

      World.field946 = var2;
      World.field939 = var3;
      MapLabel.method282(World.worldList, 0, World.worldList.length - 1, World.field946, World.field939);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-557133146"
   )
   public static boolean method3196() {
      try {
         if(class217.field2460 == 2) {
            if(class177.field2285 == null) {
               class177.field2285 = Track1.getMusicFile(class138.field1871, class217.field2461, class217.field2462);
               if(class177.field2285 == null) {
                  return false;
               }
            }

            if(Item.field1149 == null) {
               Item.field1149 = new class98(class217.field2458, class217.field2464);
            }

            if(class217.field2459.method4198(class177.field2285, class177.field2284, Item.field1149, 22050)) {
               class217.field2459.method4199();
               class217.field2459.method4236(class309.field3740);
               class217.field2459.method4267(class177.field2285, class217.field2463);
               class217.field2460 = 0;
               class177.field2285 = null;
               Item.field1149 = null;
               class138.field1871 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class217.field2459.method4202();
         class217.field2460 = 0;
         class177.field2285 = null;
         Item.field1149 = null;
         class138.field1871 = null;
      }

      return false;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2017324363"
   )
   public static boolean method3197(int var0) {
      return (var0 >> 31 & 1) != 0;
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void method3198() {
      if(class138.localPlayer.x >> 7 == Client.destinationX && class138.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

   }
}
