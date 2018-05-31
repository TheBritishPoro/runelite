import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public final class class305 {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -259078735
   )
   @Export("indexedSpriteWidth")
   static int indexedSpriteWidth;
   @ObfuscatedName("p")
   @Export("floorSaturations")
   static int[] floorSaturations;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lly;",
      garbageValue = "1052310546"
   )
   static IndexedSprite method5658() {
      IndexedSprite var0 = new IndexedSprite();
      var0.originalWidth = indexedSpriteWidth;
      var0.originalHeight = class319.indexedSpriteHeight;
      var0.offsetX = class7.indexedSpriteOffsetXs[0];
      var0.offsetY = class225.indexedSpriteOffsetYs[0];
      var0.width = class319.indexSpriteWidths[0];
      var0.height = class319.indexedSpriteHeights[0];
      var0.palette = PacketNode.indexedSpritePalette;
      var0.pixels = class319.spritePixels[0];
      class7.indexedSpriteOffsetXs = null;
      class225.indexedSpriteOffsetYs = null;
      class319.indexSpriteWidths = null;
      class319.indexedSpriteHeights = null;
      PacketNode.indexedSpritePalette = null;
      class319.spritePixels = null;
      return var0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1903036691"
   )
   static int method5659(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
      } else {
         var3 = var2?class276.field3561:KitDefinition.field3301;
      }

      if(var0 == 1927) {
         if(class69.field1009 >= 10) {
            throw new RuntimeException();
         } else if(var3.onResizeListener == null) {
            return 0;
         } else {
            ScriptEvent var4 = new ScriptEvent();
            var4.source = var3;
            var4.params = var3.onResizeListener;
            var4.field514 = class69.field1009 + 1;
            Client.field638.addFront(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
