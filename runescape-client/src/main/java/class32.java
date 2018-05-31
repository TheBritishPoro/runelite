import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class32 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 2003642713
   )
   int field282;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1427733301
   )
   int field287;
   @ObfuscatedName("s")
   int[][] field283;
   @ObfuscatedName("l")
   int[][] field281;
   @ObfuscatedName("u")
   int[][] field285;
   @ObfuscatedName("q")
   int[][] field286;

   class32(int var1, int var2) {
      this.field282 = var1;
      this.field287 = var2;
      this.field283 = new int[var1][var2];
      this.field281 = new int[var1][var2];
      this.field285 = new int[var1][var2];
      this.field286 = new int[var1][var2];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILiq;S)V",
      garbageValue = "11065"
   )
   void method541(int var1, int var2, int var3, FloorUnderlayDefinition var4) {
      if(var4 != null) {
         if(var3 + var1 >= 0 && var3 + var2 >= 0) {
            if(var1 - var3 <= this.field282 && var2 - var3 <= this.field287) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field282, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field287, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field283[var9][var10] += var4.hue * 256 / var4.hueMultiplier;
                     this.field281[var9][var10] += var4.saturation;
                     this.field285[var9][var10] += var4.lightness;
                     ++this.field286[var9][var10];
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   int method547(int var1, int var2) {
      if(var1 >= 0 && var2 >= 0 && var1 < this.field282 && var2 < this.field287) {
         if(this.field285[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field283[var1][var2] / this.field286[var1][var2];
            int var4 = this.field281[var1][var2] / this.field286[var1][var2];
            int var5 = this.field285[var1][var2] / this.field286[var1][var2];
            return class143.method3167((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "15233496"
   )
   static int method540(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 100) {
         class69.intStackSize -= 3;
         var3 = class69.intStack[class69.intStackSize];
         var4 = class69.intStack[class69.intStackSize + 1];
         int var5 = class69.intStack[class69.intStackSize + 2];
         if(var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = class26.getWidget(var3);
            if(var6.children == null) {
               var6.children = new Widget[var5 + 1];
            }

            if(var6.children.length <= var5) {
               Widget[] var7 = new Widget[var5 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if(var5 > 0 && var6.children[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.index = var5;
               var12.hasScript = true;
               var6.children[var5] = var12;
               if(var2) {
                  class276.field3561 = var12;
               } else {
                  KitDefinition.field3301 = var12;
               }

               Player.method1114(var6);
               return 1;
            }
         }
      } else {
         Widget var9;
         if(var0 == 101) {
            var9 = var2?class276.field3561:KitDefinition.field3301;
            Widget var10 = class26.getWidget(var9.id);
            var10.children[var9.index] = null;
            Player.method1114(var10);
            return 1;
         } else if(var0 == 102) {
            var9 = class26.getWidget(class69.intStack[--class69.intStackSize]);
            var9.children = null;
            Player.method1114(var9);
            return 1;
         } else if(var0 != 200) {
            if(var0 == 201) {
               var9 = class26.getWidget(class69.intStack[--class69.intStackSize]);
               if(var9 != null) {
                  class69.intStack[++class69.intStackSize - 1] = 1;
                  if(var2) {
                     class276.field3561 = var9;
                  } else {
                     KitDefinition.field3301 = var9;
                  }
               } else {
                  class69.intStack[++class69.intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class69.intStackSize -= 2;
            var3 = class69.intStack[class69.intStackSize];
            var4 = class69.intStack[class69.intStackSize + 1];
            Widget var11 = class146.getWidgetChild(var3, var4);
            if(var11 != null && var4 != -1) {
               class69.intStack[++class69.intStackSize - 1] = 1;
               if(var2) {
                  class276.field3561 = var11;
               } else {
                  KitDefinition.field3301 = var11;
               }
            } else {
               class69.intStack[++class69.intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2015845683"
   )
   @Export("getSmoothNoise")
   static final int getSmoothNoise(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = AbstractByteBuffer.getSmoothNoise2D(var3, var5);
      int var8 = AbstractByteBuffer.getSmoothNoise2D(var3 + 1, var5);
      int var9 = AbstractByteBuffer.getSmoothNoise2D(var3, var5 + 1);
      int var10 = AbstractByteBuffer.getSmoothNoise2D(var3 + 1, var5 + 1);
      int var11 = SceneTilePaint.method2870(var7, var8, var4, var2);
      int var12 = SceneTilePaint.method2870(var9, var10, var4, var2);
      return SceneTilePaint.method2870(var11, var12, var6, var2);
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;I)V",
      garbageValue = "2071314705"
   )
   static void method548(IndexData var0, String var1) {
      class52 var2 = new class52(var0, var1);
      Client.field781.add(var2);
   }
}
