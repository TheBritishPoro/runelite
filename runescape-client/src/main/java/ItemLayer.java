import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   static JagexGame field1455;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("bottom")
   Renderable bottom;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1713209305
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -487172753
   )
   @Export("x")
   int x;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -629897321
   )
   @Export("y")
   int y;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("middle")
   Renderable middle;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("top")
   Renderable top;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      longValue = -7021382517737045299L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -766143801
   )
   @Export("height")
   int height;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;Z[I[II)I",
      garbageValue = "190310969"
   )
   public static int method2566(int var0, int var1, int var2, class166 var3, CollisionData var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            class165.field2035[var8][var9] = 0;
            class165.field2041[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      byte var13;
      int var14;
      int var15;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var28;
      int var30;
      int var31;
      int var33;
      if(var2 == 1) {
         var10 = var0;
         var11 = var1;
         byte var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         class165.field2035[var12][var13] = 99;
         class165.field2041[var12][var13] = 0;
         byte var16 = 0;
         var17 = 0;
         class165.field2039[var16] = var0;
         var33 = var16 + 1;
         class165.field2038[var16] = var1;
         int[][] var18 = var4.flags;

         boolean var29;
         while(true) {
            if(var33 == var17) {
               WorldMapDecoration.field152 = var10;
               class165.field2037 = var11;
               var29 = false;
               break;
            }

            var10 = class165.field2039[var17];
            var11 = class165.field2038[var17];
            var17 = var17 + 1 & 4095;
            var30 = var10 - var14;
            var31 = var11 - var15;
            var19 = var10 - var4.x;
            var20 = var11 - var4.y;
            if(var3.vmethod3440(1, var10, var11, var4)) {
               WorldMapDecoration.field152 = var10;
               class165.field2037 = var11;
               var29 = true;
               break;
            }

            var21 = class165.field2041[var30][var31] + 1;
            if(var30 > 0 && class165.field2035[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
               class165.field2039[var33] = var10 - 1;
               class165.field2038[var33] = var11;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 - 1][var31] = 2;
               class165.field2041[var30 - 1][var31] = var21;
            }

            if(var30 < 127 && class165.field2035[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
               class165.field2039[var33] = var10 + 1;
               class165.field2038[var33] = var11;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 + 1][var31] = 8;
               class165.field2041[var30 + 1][var31] = var21;
            }

            if(var31 > 0 && class165.field2035[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class165.field2039[var33] = var10;
               class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30][var31 - 1] = 1;
               class165.field2041[var30][var31 - 1] = var21;
            }

            if(var31 < 127 && class165.field2035[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class165.field2039[var33] = var10;
               class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30][var31 + 1] = 4;
               class165.field2041[var30][var31 + 1] = var21;
            }

            if(var30 > 0 && var31 > 0 && class165.field2035[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class165.field2039[var33] = var10 - 1;
               class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 - 1][var31 - 1] = 3;
               class165.field2041[var30 - 1][var31 - 1] = var21;
            }

            if(var30 < 127 && var31 > 0 && class165.field2035[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class165.field2039[var33] = var10 + 1;
               class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 + 1][var31 - 1] = 9;
               class165.field2041[var30 + 1][var31 - 1] = var21;
            }

            if(var30 > 0 && var31 < 127 && class165.field2035[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class165.field2039[var33] = var10 - 1;
               class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 - 1][var31 + 1] = 6;
               class165.field2041[var30 - 1][var31 + 1] = var21;
            }

            if(var30 < 127 && var31 < 127 && class165.field2035[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class165.field2039[var33] = var10 + 1;
               class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               class165.field2035[var30 + 1][var31 + 1] = 12;
               class165.field2041[var30 + 1][var31 + 1] = var21;
            }
         }

         var28 = var29;
      } else if(var2 == 2) {
         var28 = SoundTaskDataProvider.method693(var0, var1, var3, var4);
      } else {
         var28 = class21.method273(var0, var1, var2, var3, var4);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = WorldMapDecoration.field152;
      var30 = class165.field2037;
      if(!var28) {
         var31 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.field2043;
         var17 = var3.field2048;
         int var27 = var3.field2042;
         var19 = var3.field2045;

         for(var20 = var33 - var32; var20 <= var32 + var33; ++var20) {
            for(var21 = var17 - var32; var21 <= var32 + var17; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if(var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class165.field2041[var22][var23] < 100) {
                  int var24 = 0;
                  if(var20 < var33) {
                     var24 = var33 - var20;
                  } else if(var20 > var27 + var33 - 1) {
                     var24 = var20 - (var27 + var33 - 1);
                  }

                  int var25 = 0;
                  if(var21 < var17) {
                     var25 = var17 - var21;
                  } else if(var21 > var17 + var19 - 1) {
                     var25 = var21 - (var17 + var19 - 1);
                  }

                  int var26 = var24 * var24 + var25 * var25;
                  if(var26 < var31 || var31 == var26 && class165.field2041[var22][var23] < var14) {
                     var31 = var26;
                     var14 = class165.field2041[var22][var23];
                     var11 = var20;
                     var30 = var21;
                  }
               }
            }
         }

         if(var31 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if(var0 == var11 && var30 == var1) {
         return 0;
      } else {
         var13 = 0;
         class165.field2039[var13] = var11;
         var31 = var13 + 1;
         class165.field2038[var13] = var30;

         for(var14 = var15 = class165.field2035[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class165.field2035[var11 - var9][var30 - var10]) {
            if(var15 != var14) {
               var15 = var14;
               class165.field2039[var31] = var11;
               class165.field2038[var31++] = var30;
            }

            if((var14 & 2) != 0) {
               ++var11;
            } else if((var14 & 8) != 0) {
               --var11;
            }

            if((var14 & 1) != 0) {
               ++var30;
            } else if((var14 & 4) != 0) {
               --var30;
            }
         }

         var33 = 0;

         while(var31-- > 0) {
            var6[var33] = class165.field2039[var31];
            var7[var33++] = class165.field2038[var31];
            if(var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "464504900"
   )
   static final void method2564(int var0) {
      if(var0 >= 0) {
         int var1 = Client.menuActionParams0[var0];
         int var2 = Client.menuActionParams1[var0];
         int var3 = Client.menuTypes[var0];
         int var4 = Client.menuIdentifiers[var0];
         String var5 = Client.menuOptions[var0];
         String var6 = Client.menuTargets[var0];
         KeyFocusListener.menuAction(var1, var2, var3, var4, var5, var6, MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(Lhi;II)Ljava/lang/String;",
      garbageValue = "878774611"
   )
   static String method2565(Widget var0, int var1) {
      return !SoundTask.method2214(class24.getWidgetClickMask(var0), var1) && var0.onOpListener == null?null:(var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0?var0.actions[var1]:null);
   }
}
