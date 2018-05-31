import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("CombatInfoListHolder")
public class CombatInfoListHolder extends Node {
   @ObfuscatedName("at")
   static Image field1028;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   @Export("combatInfo2")
   CombatInfo2 combatInfo2;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   @Export("combatInfo1")
   CombatInfoList combatInfo1;

   @ObfuscatedSignature(
      signature = "(Lja;)V"
   )
   CombatInfoListHolder(CombatInfo2 var1) {
      this.combatInfo1 = new CombatInfoList();
      this.combatInfo2 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "2106192110"
   )
   void method1772(int var1, int var2, int var3, int var4) {
      CombatInfo1 var5 = null;
      int var6 = 0;

      for(CombatInfo1 var7 = (CombatInfo1)this.combatInfo1.last(); var7 != null; var7 = (CombatInfo1)this.combatInfo1.previous()) {
         ++var6;
         if(var7.cycle == var1) {
            var7.set(var1, var2, var3, var4);
            return;
         }

         if(var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            this.combatInfo1.addLast(new CombatInfo1(var1, var2, var3, var4));
         }

      } else {
         CombatInfoList.method4036(new CombatInfo1(var1, var2, var3, var4), var5);
         if(var6 >= 4) {
            this.combatInfo1.last().unlink();
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Lbn;",
      garbageValue = "1625981633"
   )
   CombatInfo1 method1773(int var1) {
      CombatInfo1 var2 = (CombatInfo1)this.combatInfo1.last();
      if(var2 != null && var2.cycle <= var1) {
         for(CombatInfo1 var3 = (CombatInfo1)this.combatInfo1.previous(); var3 != null && var3.cycle <= var1; var3 = (CombatInfo1)this.combatInfo1.previous()) {
            var2.unlink();
            var2 = var3;
         }

         if(this.combatInfo2.field3313 + var2.cycle + var2.int2 > var1) {
            return var2;
         } else {
            var2.unlink();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "44"
   )
   boolean method1774() {
      return this.combatInfo1.isEmpty();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "792090098"
   )
   static SpritePixels method1781() {
      SpritePixels var0 = new SpritePixels();
      var0.maxWidth = class305.indexedSpriteWidth;
      var0.maxHeight = class319.indexedSpriteHeight;
      var0.offsetX = class7.indexedSpriteOffsetXs[0];
      var0.offsetY = class225.indexedSpriteOffsetYs[0];
      var0.width = class319.indexSpriteWidths[0];
      var0.height = class319.indexedSpriteHeights[0];
      int var1 = var0.height * var0.width;
      byte[] var2 = class319.spritePixels[0];
      var0.pixels = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.pixels[var3] = PacketNode.indexedSpritePalette[var2[var3] & 255];
      }

      class7.indexedSpriteOffsetXs = null;
      class225.indexedSpriteOffsetYs = null;
      class319.indexSpriteWidths = null;
      class319.indexedSpriteHeights = null;
      PacketNode.indexedSpritePalette = null;
      class319.spritePixels = null;
      return var0;
   }
}
