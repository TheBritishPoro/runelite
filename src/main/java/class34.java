import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class34 {
   @ObfuscatedName("w")
   static int[] field779 = new int[2048];
   @ObfuscatedName("q")
   static int[] field780 = new int[2048];
   @ObfuscatedName("e")
   static byte[] field781 = new byte[2048];
   @ObfuscatedName("r")
   static byte[] field782 = new byte[2048];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1396292729
   )
   static int field783 = 0;
   @ObfuscatedName("k")
   static int[] field784 = new int[2048];
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1112069495
   )
   static int field785 = 0;
   @ObfuscatedName("n")
   static int[] field786 = new int[2048];
   @ObfuscatedName("m")
   static int[] field788 = new int[2048];
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1404006947
   )
   static int field789 = 0;
   @ObfuscatedName("b")
   static int[] field790 = new int[2048];
   @ObfuscatedName("h")
   static Buffer[] field791 = new Buffer[2048];
   @ObfuscatedName("o")
   static Buffer field792 = new Buffer(new byte[5000]);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-122"
   )
   static void method754(int var0, int var1, int var2, int var3) {
      XItemContainer var4 = (XItemContainer)XItemContainer.itemContainers.method3936((long)var0);
      if(var4 == null) {
         var4 = new XItemContainer();
         XItemContainer.itemContainers.method3940(var4, (long)var0);
      }

      if(var4.itemIds.length <= var1) {
         int[] var5 = new int[1 + var1];
         int[] var6 = new int[1 + var1];

         int var7;
         for(var7 = 0; var7 < var4.itemIds.length; ++var7) {
            var5[var7] = var4.itemIds[var7];
            var6[var7] = var4.stackSizes[var7];
         }

         for(var7 = var4.itemIds.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.itemIds = var5;
         var4.stackSizes = var6;
      }

      var4.itemIds[var1] = var2;
      var4.stackSizes[var1] = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1834218044"
   )
   public static void method755(int var0) {
      class186.field3010 = 1;
      CollisionData.field1970 = null;
      class140.field2184 = -1;
      class186.field3009 = -1;
      class11.field176 = 0;
      MessageNode.field814 = false;
      class144.field2222 = var0;
   }
}
