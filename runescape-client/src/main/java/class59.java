import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class59 extends class166 {
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("vorbisIndex")
   static IndexData vorbisIndex;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILfk;B)Z",
      garbageValue = "27"
   )
   protected boolean vmethod3440(int var1, int var2, int var3, CollisionData var4) {
      return var2 == super.field2043 && var3 == super.field2048;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "249825908"
   )
   static String method1076() {
      return class10.preferences.hideUsername?class265.method4976(class78.username):class78.username;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "46558014"
   )
   static void method1079() {
      if(class78.field1101) {
         class78.field1083 = null;
         class78.field1084 = null;
         class78.runeSprites = null;
         class78.field1092 = null;
         class78.field1087 = null;
         class78.logoSprite = null;
         FrameMap.titlemuteSprite = null;
         class235.field2783 = null;
         class78.field1089 = null;
         class166.field2047 = null;
         class13.slFlagSprites = null;
         class126.slArrowSprites = null;
         MapIcon.slStarSprites = null;
         class232.field2752 = null;
         CombatInfo1.field936 = null;
         class185.field2364 = null;
         class11.field69 = null;
         AttackOption.field1077 = null;
         AbstractByteBuffer.field2367 = null;
         class81.field1169 = null;
         SoundTaskDataProvider.field357 = null;
         class76.field1073 = null;
         class26.method427(2);
         class222.sendConInfo(true);
         class78.field1101 = false;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "16"
   )
   static byte[] method1075(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12265"
   )
   static void method1078() {
      if(GrandExchangeOffer.loadWorlds()) {
         class78.worldSelectShown = true;
      }

   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(Lba;II)V",
      garbageValue = "1397155000"
   )
   static final void method1080(Actor var0, int var1) {
      if(var0.field917 > Client.gameCycle) {
         int var2 = var0.field917 - Client.gameCycle;
         int var3 = var0.field913 * 128 + var0.field874 * 64;
         int var4 = var0.field915 * 128 + var0.field874 * 64;
         var0.x += (var3 - var0.x) / var2;
         var0.y += (var4 - var0.y) / var2;
         var0.field923 = 0;
         var0.orientation = var0.field919;
      } else if(var0.field918 >= Client.gameCycle) {
         Item.method1865(var0);
      } else {
         class35.method609(var0);
      }

      if(var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.animation = -1;
         var0.graphic = -1;
         var0.field917 = 0;
         var0.field918 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field874 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field874 * 64;
         var0.method1540();
      }

      if(class138.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.animation = -1;
         var0.graphic = -1;
         var0.field917 = 0;
         var0.field918 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field874 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field874 * 64;
         var0.method1540();
      }

      TotalQuantityComparator.method26(var0);
      FontName.method5502(var0);
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "52245424"
   )
   static void method1077() {
      Client.menuOptionCount = 0;
      Client.isMenuOpen = false;
      Client.menuOptions[0] = "Cancel";
      Client.menuTargets[0] = "";
      Client.menuTypes[0] = 1006;
      Client.menuBooleanArray[0] = false;
      Client.menuOptionCount = 1;
   }
}
