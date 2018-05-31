import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class265 extends CacheableNode {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3334;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   IterableHashTable field3335;

   static {
      field3334 = new NodeCache(64);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12113"
   )
   public void method4961() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1049647297"
   )
   public void method4960(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4967(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "49"
   )
   void method4967(Buffer var1, int var2) {
      if(var2 == 249) {
         this.field3335 = KeyFocusListener.readStringIntParameters(var1, this.field3335);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1625397785"
   )
   public int method4962(int var1, int var2) {
      return FriendManager.method1668(this.field3335, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1321856430"
   )
   public String method4963(int var1, String var2) {
      return WorldMapRectangle.method171(this.field3335, var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-15504"
   )
   public static String method4976(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }
}
