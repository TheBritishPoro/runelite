import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("DecorativeObject")
public final class DecorativeObject {
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = -470021269
   )
   static int field1834;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 855735479
   )
   @Export("renderFlag")
   int renderFlag;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2145900331
   )
   @Export("floor")
   int floor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -568631363
   )
   @Export("x")
   int x;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -970601677
   )
   @Export("y")
   int y;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 409489705
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -995153033
   )
   @Export("offsetX")
   int offsetX;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1452216279
   )
   @Export("offsetY")
   int offsetY;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -9170110495421091263L
   )
   @Export("hash")
   public long hash;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1910323591
   )
   @Export("renderInfoBitPacked")
   int renderInfoBitPacked;

   DecorativeObject() {
      this.hash = 0L;
      this.renderInfoBitPacked = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lce;",
      garbageValue = "-1297454162"
   )
   static Script method3099(int var0) {
      Script var1 = (Script)Script.field1190.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Client.indexScripts.getConfigData(var0, 0);
         if(var2 == null) {
            return null;
         } else {
            var1 = class10.newScript(var2);
            Script.field1190.put(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SB)V",
      garbageValue = "4"
   )
   public static void method3100(String[] var0, short[] var1) {
      method3101(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-659552878"
   )
   static void method3101(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method3101(var0, var1, var2, var5 - 1);
         method3101(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "30"
   )
   static final void method3098() {
      short var0 = 256;
      int var1;
      if(class78.field1088 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class78.field1088 > 768) {
               AttackOption.field1077[var1] = class33.method558(CombatInfo1.field936[var1], class185.field2364[var1], 1024 - class78.field1088);
            } else if(class78.field1088 > 256) {
               AttackOption.field1077[var1] = class185.field2364[var1];
            } else {
               AttackOption.field1077[var1] = class33.method558(class185.field2364[var1], CombatInfo1.field936[var1], 256 - class78.field1088);
            }
         }
      } else if(class78.field1094 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class78.field1094 > 768) {
               AttackOption.field1077[var1] = class33.method558(CombatInfo1.field936[var1], class11.field69[var1], 1024 - class78.field1094);
            } else if(class78.field1094 > 256) {
               AttackOption.field1077[var1] = class11.field69[var1];
            } else {
               AttackOption.field1077[var1] = class33.method558(class11.field69[var1], CombatInfo1.field936[var1], 256 - class78.field1094);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            AttackOption.field1077[var1] = CombatInfo1.field936[var1];
         }
      }

      Rasterizer2D.setDrawRegion(class78.field1082, 9, class78.field1082 + 128, var0 + 7);
      class78.field1092.method5849(class78.field1082, 0);
      Rasterizer2D.noClip();
      var1 = 0;
      int var2 = GameSocket.rasterProvider.width * 9 + class78.field1082;

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class78.field1093[var3] * (var0 - var3) / var0;
         var5 = var4 + 22;
         if(var5 < 0) {
            var5 = 0;
         }

         var1 += var5;

         for(var6 = var5; var6 < 128; ++var6) {
            var7 = SoundTaskDataProvider.field357[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = AttackOption.field1077[var7];
               var10 = GameSocket.rasterProvider.pixels[var2];
               GameSocket.rasterProvider.pixels[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + GameSocket.rasterProvider.width - 128;
      }

      Rasterizer2D.setDrawRegion(class78.field1082 + 765 - 128, 9, class78.field1082 + 765, var0 + 7);
      class78.field1087.method5849(class78.field1082 + 382, 0);
      Rasterizer2D.noClip();
      var1 = 0;
      var2 = GameSocket.rasterProvider.width * 9 + class78.field1082 + 637 + 24;

      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class78.field1093[var3] * (var0 - var3) / var0;
         var5 = 103 - var4;
         var2 += var4;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = SoundTaskDataProvider.field357[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = AttackOption.field1077[var7];
               var10 = GameSocket.rasterProvider.pixels[var2];
               GameSocket.rasterProvider.pixels[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var9 * (var10 & 65280) + var8 * (var7 & 65280) & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += GameSocket.rasterProvider.width - var5 - var4;
      }

   }
}
