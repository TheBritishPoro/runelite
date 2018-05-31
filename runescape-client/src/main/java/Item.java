import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("Item")
public final class Item extends Renderable {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   public static class98 field1149;
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexTrack1")
   static IndexData indexTrack1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 540016053
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 119742129
   )
   @Export("quantity")
   int quantity;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Model getModel() {
      return TextureProvider.getItemDefinition(this.id).getModel(this.quantity);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)Lbx;",
      garbageValue = "-27003"
   )
   static Preferences method1859() {
      FileOnDisk var0 = null;
      Preferences var1 = new Preferences();

      try {
         var0 = MapLabel.getPreferencesFile("", ItemLayer.field1455.name, false);
         byte[] var2 = new byte[(int)var0.length()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.read(var2, var3, var2.length - var3);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Preferences(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(var0 != null) {
            var0.close();
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1165618806"
   )
   public static void method1866(int var0) {
      MouseInput.mouseIdleTicks = var0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "916064134"
   )
   public static int method1864(int var0) {
      return KeyFocusListener.method673(class120.field1647[var0]);
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-41"
   )
   static final void method1865(Actor var0) {
      if(var0.field918 == Client.gameCycle || var0.animation == -1 || var0.actionAnimationDisable != 0 || var0.actionFrameCycle + 1 > TotalQuantityComparator.getAnimation(var0.animation).frameLengths[var0.actionFrame]) {
         int var1 = var0.field918 - var0.field917;
         int var2 = Client.gameCycle - var0.field917;
         int var3 = var0.field913 * 128 + var0.field874 * 64;
         int var4 = var0.field915 * 128 + var0.field874 * 64;
         int var5 = var0.field916 * 128 + var0.field874 * 64;
         int var6 = var0.field929 * 128 + var0.field874 * 64;
         var0.x = (var2 * var5 + var3 * (var1 - var2)) / var1;
         var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1;
      }

      var0.field923 = 0;
      var0.orientation = var0.field919;
      var0.angle = var0.orientation;
   }
}
