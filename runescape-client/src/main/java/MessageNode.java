import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MessageNode")
public class MessageNode extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -216410853
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 279680387
   )
   @Export("tick")
   int tick;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1058139231
   )
   @Export("type")
   int type;
   @ObfuscatedName("l")
   @Export("name")
   String name;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Name field534;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field539;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field536;
   @ObfuscatedName("i")
   @Export("sender")
   String sender;
   @ObfuscatedName("x")
   @Export("value")
   String value;

   @Hook(
      value = "setMessage",
      end = true
   )
   MessageNode(int var1, String var2, String var3, String var4) {
      this.field539 = class289.field3633;
      this.field536 = class289.field3633;
      int var5 = ++class83.field1186 - 1;
      this.id = var5;
      this.tick = Client.gameCycle;
      this.type = var1;
      this.name = var2;
      this.method1044();
      this.sender = var3;
      this.value = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "27"
   )
   @Export("setMessage")
   @Hook(
      value = "setMessage",
      end = true
   )
   void setMessage(int var1, String var2, String var3, String var4) {
      int var5 = ++class83.field1186 - 1;
      this.id = var5;
      this.tick = Client.gameCycle;
      this.type = var1;
      this.name = var2;
      this.method1044();
      this.sender = var3;
      this.value = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1016035319"
   )
   void method1048() {
      this.field539 = class289.field3633;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1033770680"
   )
   final boolean method1040() {
      if(this.field539 == class289.field3633) {
         this.method1041();
      }

      return this.field539 == class289.field3631;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1665152249"
   )
   void method1041() {
      this.field539 = DState.friendManager.friendContainer.isMember(this.field534)?class289.field3631:class289.field3634;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "725816073"
   )
   void method1042() {
      this.field536 = class289.field3633;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1678594295"
   )
   final boolean method1043() {
      if(this.field536 == class289.field3633) {
         this.method1061();
      }

      return this.field536 == class289.field3631;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2118903561"
   )
   void method1061() {
      this.field536 = DState.friendManager.ignoreContainer.isMember(this.field534)?class289.field3631:class289.field3634;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2077717645"
   )
   final void method1044() {
      if(this.name != null) {
         this.field534 = new Name(class139.method3138(this.name), MapIconReference.loginType);
      } else {
         this.field534 = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "-1743479306"
   )
   public static void method1069(IndexDataBase var0) {
      FloorUnderlayDefinition.underlay_ref = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;III)Lkj;",
      garbageValue = "-2132588897"
   )
   public static Font method1058(IndexDataBase var0, IndexDataBase var1, int var2, int var3) {
      if(!class306.method5660(var0, var2, var3)) {
         return null;
      } else {
         byte[] var5 = var1.getConfigData(var2, var3);
         Font var4;
         if(var5 == null) {
            var4 = null;
         } else {
            Font var6 = new Font(var5, class7.indexedSpriteOffsetXs, class225.indexedSpriteOffsetYs, class319.indexSpriteWidths, class319.indexedSpriteHeights, PacketNode.indexedSpritePalette, class319.spritePixels);
            class7.indexedSpriteOffsetXs = null;
            class225.indexedSpriteOffsetYs = null;
            class319.indexSpriteWidths = null;
            class319.indexedSpriteHeights = null;
            PacketNode.indexedSpritePalette = null;
            class319.spritePixels = null;
            var4 = var6;
         }

         return var4;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "15"
   )
   static void method1053(String var0, boolean var1, String var2, boolean var3) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(class45.field379.startsWith("win") && !var3) {
            WallObject.method3071(var0, 0);
            return;
         }

         if(class45.field379.startsWith("mac")) {
            class13.method112(var0, 1, var2);
            return;
         }

         WallObject.method3071(var0, 2);
      } else {
         WallObject.method3071(var0, 3);
      }

   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(Lba;IB)V",
      garbageValue = "-9"
   )
   @Export("characterToScreen")
   static final void characterToScreen(Actor var0, int var1) {
      class238.worldToScreen(var0.x, var0.y, var1);
   }
}
