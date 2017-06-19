import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Rasterizer2D")
public class Rasterizer2D extends CacheableNode {
   @ObfuscatedName("al")
   public static int field3752;
   @ObfuscatedName("af")
   @Export("graphicsPixelsWidth")
   public static int graphicsPixelsWidth;
   @ObfuscatedName("ae")
   @Export("graphicsPixelsHeight")
   public static int graphicsPixelsHeight;
   @ObfuscatedName("ap")
   @Export("drawingAreaTop")
   public static int drawingAreaTop;
   @ObfuscatedName("ak")
   @Export("drawingAreaRight")
   public static int drawingAreaRight;
   @ObfuscatedName("ax")
   @Export("graphicsPixels")
   public static int[] graphicsPixels;
   @ObfuscatedName("ab")
   @Export("drawingAreaBottom")
   protected static int drawingAreaBottom;

   @ObfuscatedName("dk")
   @Export("setRasterBuffer")
   public static void setRasterBuffer(int[] var0, int var1, int var2) {
      graphicsPixels = var0;
      graphicsPixelsWidth = var1;
      graphicsPixelsHeight = var2;
      method4833(0, 0, var1, var2);
   }

   @ObfuscatedName("dy")
   static void method4817(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= drawingAreaTop && var1 < drawingAreaRight) {
         if(var0 < field3752) {
            var2 -= field3752 - var0;
            var0 = field3752;
         }

         if(var0 + var2 > drawingAreaBottom) {
            var2 = drawingAreaBottom - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var9 = var0 + graphicsPixelsWidth * var1;

         for(int var10 = 0; var10 < var2; ++var10) {
            int var11 = var5 * (graphicsPixels[var9] >> 16 & 255);
            int var12 = var5 * (graphicsPixels[var9] >> 8 & 255);
            int var13 = var5 * (graphicsPixels[var9] & 255);
            int var14 = (var8 + var13 >> 8) + (var11 + var6 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            graphicsPixels[var9++] = var14;
         }
      }

   }

   @ObfuscatedName("dv")
   public static void method4818(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var8 += (drawingAreaTop - var1) * var9;
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = graphicsPixelsWidth - var2;
      int var19 = var0 + graphicsPixelsWidth * var1;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = graphicsPixels[var19];
            var23 = var22 & 16711680;
            int var24 = var23 <= var12?var23:(var11 == 0?var12:var15 + (var11 * var23 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 <= var13?var25:(var11 == 0?var13:var16 + (var11 * var25 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 <= var14?var27:(var11 == 0?var14:(var11 * var27 >> 8) + var17);
            graphicsPixels[var19++] = var28 + var24 + var26;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var7 != var6) {
               var10 = var8 * var7 + (65536 - var8) * var6 >> 16;
               var11 = 256 - var10;
            }

            if(var5 != var4) {
               var23 = ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) + ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var10 * var12 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var10 * var14 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("de")
   public static void method4819(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var8 += (drawingAreaTop - var1) * var9;
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = graphicsPixelsWidth - var2;
      int var19 = var0 + graphicsPixelsWidth * var1;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = graphicsPixels[var19];
            var23 = var22 & 16711680;
            int var24 = var23 >= var12?var23:(var11 == 0?var12:var15 + (var11 * var23 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 >= var13?var25:(var11 == 0?var13:var16 + (var11 * var25 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 >= var14?var27:(var11 == 0?var14:(var11 * var27 >> 8) + var17);
            graphicsPixels[var19++] = var28 + var24 + var26;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var7 != var6) {
               var10 = var7 * var8 + var6 * (65536 - var8) >> 16;
               var11 = 256 - var10;
            }

            if(var5 != var4) {
               var23 = ((var5 & '\uff00') * var22 + (var4 & '\uff00') * var21 & 16711680) + (var22 * (var5 & 16711935) + (var4 & 16711935) * var21 & -16711936) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var10 * var12 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var10 * var14 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("dn")
   public static void method4821(int[] var0) {
      field3752 = var0[0];
      drawingAreaTop = var0[1];
      drawingAreaBottom = var0[2];
      drawingAreaRight = var0[3];
   }

   @ObfuscatedName("db")
   public static void method4822(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var5 == var4 && var7 == var6?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      int var12 = var4;
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var8 += (drawingAreaTop - var1) * var9;
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var13 = graphicsPixelsWidth - var2;
      int var14 = var0 + graphicsPixelsWidth * var1;

      for(int var15 = -var3; var15 < 0; ++var15) {
         int var16;
         int var17;
         for(var16 = -var2; var16 < 0; ++var16) {
            var17 = graphicsPixels[var14];
            int var18 = var17 + var12;
            int var19 = (var12 & 16711935) + (var17 & 16711935);
            int var20 = (var18 - var19 & 65536) + (var19 & 16777472);
            if(var11 == 0) {
               graphicsPixels[var14++] = var18 - var20 | var20 - (var20 >>> 8);
            } else {
               int var21 = var18 - var20 | var20 - (var20 >>> 8);
               graphicsPixels[var14++] = (var11 * (var17 & 16711935) >> 8 & 16711935) + ((var21 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var21 & '\uff00') >> 8 & '\uff00') + (var11 * (var17 & '\uff00') >> 8 & '\uff00');
            }
         }

         if(var9 > 0) {
            var8 += var9;
            var16 = 65536 - var8 >> 8;
            var17 = var8 >> 8;
            if(var7 != var6) {
               var10 = var7 * var8 + var6 * (65536 - var8) >> 16;
               var11 = 256 - var10;
            }

            if(var5 != var4) {
               var12 = ((var4 & '\uff00') * var16 + (var5 & '\uff00') * var17 & 16711680) + ((var4 & 16711935) * var16 + (var5 & 16711935) * var17 & -16711936) >>> 8;
            }
         }

         var14 += var13;
      }

   }

   @ObfuscatedName("dq")
   static void method4823(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method4839(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < drawingAreaTop) {
            var4 = drawingAreaTop;
         }

         int var5 = var2 + var1 + 1;
         if(var5 > drawingAreaRight) {
            var5 = drawingAreaRight;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field3752) {
               var12 = field3752;
            }

            var13 = var0 + var8;
            if(var13 > drawingAreaBottom) {
               var13 = drawingAreaBottom;
            }

            var14 = graphicsPixelsWidth * var6 + var12;

            for(var15 = var12; var15 < var13; ++var15) {
               graphicsPixels[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field3752) {
               var12 = field3752;
            }

            var13 = var0 + var8;
            if(var13 > drawingAreaBottom - 1) {
               var13 = drawingAreaBottom - 1;
            }

            var14 = graphicsPixelsWidth * var6 + var12;

            for(var15 = var12; var15 <= var13; ++var15) {
               graphicsPixels[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }
      }

   }

   @ObfuscatedName("dx")
   public static void method4824(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method4823(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var9 = var1 - var2;
            if(var9 < drawingAreaTop) {
               var9 = drawingAreaTop;
            }

            int var10 = var2 + var1 + 1;
            if(var10 > drawingAreaRight) {
               var10 = drawingAreaRight;
            }

            int var11 = var9;
            int var12 = var2 * var2;
            int var13 = 0;
            int var14 = var1 - var9;
            int var15 = var14 * var14;
            int var16 = var15 - var14;
            if(var1 > var10) {
               var1 = var10;
            }

            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var11 < var1) {
               while(var16 <= var12 || var15 <= var12) {
                  var15 += var13 + var13;
                  var16 += var13++ + var13;
               }

               var20 = var0 - var13 + 1;
               if(var20 < field3752) {
                  var20 = field3752;
               }

               var21 = var13 + var0;
               if(var21 > drawingAreaBottom) {
                  var21 = drawingAreaBottom;
               }

               var22 = var11 * graphicsPixelsWidth + var20;

               for(var23 = var20; var23 < var21; ++var23) {
                  var17 = var5 * (graphicsPixels[var22] >> 16 & 255);
                  var18 = var5 * (graphicsPixels[var22] >> 8 & 255);
                  var19 = var5 * (graphicsPixels[var22] & 255);
                  var24 = (var19 + var8 >> 8) + (var7 + var18 >> 8 << 8) + (var17 + var6 >> 8 << 16);
                  graphicsPixels[var22++] = var24;
               }

               ++var11;
               var15 -= var14-- + var14;
               var16 -= var14 + var14;
            }

            var13 = var2;
            var14 = -var14;
            var16 = var12 + var14 * var14;
            var15 = var16 - var2;

            for(var16 -= var14; var11 < var10; var15 += var14++ + var14) {
               while(var16 > var12 && var15 > var12) {
                  var16 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               var20 = var0 - var13;
               if(var20 < field3752) {
                  var20 = field3752;
               }

               var21 = var13 + var0;
               if(var21 > drawingAreaBottom - 1) {
                  var21 = drawingAreaBottom - 1;
               }

               var22 = var11 * graphicsPixelsWidth + var20;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var17 = var5 * (graphicsPixels[var22] >> 16 & 255);
                  var18 = var5 * (graphicsPixels[var22] >> 8 & 255);
                  var19 = var5 * (graphicsPixels[var22] & 255);
                  var24 = (var8 + var19 >> 8) + (var6 + var17 >> 8 << 16) + (var7 + var18 >> 8 << 8);
                  graphicsPixels[var22++] = var24;
               }

               ++var11;
               var16 += var14 + var14;
            }
         }
      }

   }

   @ObfuscatedName("dm")
   public static void method4825(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      var4 = (var5 * (var4 & '\uff00') >> 8 & '\uff00') + (var5 * (var4 & 16711935) >> 8 & 16711935);
      int var6 = 256 - var5;
      int var7 = graphicsPixelsWidth - var2;
      int var8 = var0 + graphicsPixelsWidth * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = graphicsPixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            graphicsPixels[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("dz")
   public static void method4826(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var5 = graphicsPixelsWidth - var2;
      int var6 = var0 + graphicsPixelsWidth * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            graphicsPixels[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("dt")
   public static void method4827() {
      int var0 = 0;

      int var1;
      for(var1 = graphicsPixelsWidth * graphicsPixelsHeight - 7; var0 < var1; graphicsPixels[var0++] = 0) {
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
         graphicsPixels[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; graphicsPixels[var0++] = 0) {
         ;
      }

   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "9135624"
   )
   public static void method4830(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var6 += (drawingAreaTop - var1) * var7;
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var8 = graphicsPixelsWidth - var2;
      int var9 = var0 + graphicsPixelsWidth * var1;

      for(int var10 = -var3; var10 < 0; ++var10) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var5 & 16711935) * var12 + var11 * (var4 & 16711935) & -16711936) + ((var5 & '\uff00') * var12 + (var4 & '\uff00') * var11 & 16711680) >>> 8;

         for(int var14 = -var2; var14 < 0; ++var14) {
            graphicsPixels[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }

   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void method4831(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if(var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < graphicsPixelsWidth && var1 < graphicsPixelsHeight) {
         int var8 = 0;
         int var9 = 0;
         if(var0 < 0) {
            var8 -= var0;
            var2 += var0;
         }

         if(var1 < 0) {
            var9 -= var1;
            var3 += var1;
         }

         if(var0 + var2 > graphicsPixelsWidth) {
            var2 = graphicsPixelsWidth - var0;
         }

         if(var3 + var1 > graphicsPixelsHeight) {
            var3 = graphicsPixelsHeight - var1;
         }

         int var10 = var6.length / var7;
         int var11 = graphicsPixelsWidth - var2;
         int var12 = var4 >>> 24;
         int var13 = var5 >>> 24;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if(var12 == 255 && var13 == 255) {
            var14 = var0 + (var9 + var1) * graphicsPixelsWidth + var8;

            for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
               for(var16 = var0 + var8; var16 < var2 + var0 + var8; ++var16) {
                  var17 = (var15 - var1) % var10;
                  var18 = (var16 - var0) % var7;
                  if(var6[var18 + var17 * var7] != 0) {
                     graphicsPixels[var14++] = var5;
                  } else {
                     graphicsPixels[var14++] = var4;
                  }
               }

               var14 += var11;
            }
         } else {
            var14 = var0 + (var9 + var1) * graphicsPixelsWidth + var8;

            for(var15 = var9 + var1; var15 < var3 + var1 + var9; ++var15) {
               for(var16 = var0 + var8; var16 < var2 + var0 + var8; ++var16) {
                  var17 = (var15 - var1) % var10;
                  var18 = (var16 - var0) % var7;
                  int var19 = var4;
                  if(var6[var18 + var17 * var7] != 0) {
                     var19 = var5;
                  }

                  int var20 = var19 >>> 24;
                  int var21 = 255 - var20;
                  int var22 = graphicsPixels[var14];
                  int var23 = ((var22 & '\uff00') * var21 + (var19 & '\uff00') * var20 & 16711680) + ((var22 & 16711935) * var21 + (var19 & 16711935) * var20 & -16711936) >> 8;
                  graphicsPixels[var14++] = var23;
               }

               var14 += var11;
            }
         }
      }

   }

   @ObfuscatedName("di")
   public static void method4833(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > graphicsPixelsWidth) {
         var2 = graphicsPixelsWidth;
      }

      if(var3 > graphicsPixelsHeight) {
         var3 = graphicsPixelsHeight;
      }

      field3752 = var0;
      drawingAreaTop = var1;
      drawingAreaBottom = var2;
      drawingAreaRight = var3;
   }

   @ObfuscatedName("do")
   public static void method4834(int var0, int var1, int var2, int var3) {
      if(var1 >= drawingAreaTop && var1 < drawingAreaRight) {
         if(var0 < field3752) {
            var2 -= field3752 - var0;
            var0 = field3752;
         }

         if(var0 + var2 > drawingAreaBottom) {
            var2 = drawingAreaBottom - var0;
         }

         int var4 = var0 + graphicsPixelsWidth * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            graphicsPixels[var5 + var4] = var3;
         }
      }

   }

   @ObfuscatedName("dw")
   public static void method4836(int var0, int var1, int var2, int var3) {
      if(var0 >= field3752 && var0 < drawingAreaBottom) {
         if(var1 < drawingAreaTop) {
            var2 -= drawingAreaTop - var1;
            var1 = drawingAreaTop;
         }

         if(var2 + var1 > drawingAreaRight) {
            var2 = drawingAreaRight - var1;
         }

         int var4 = var0 + graphicsPixelsWidth * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            graphicsPixels[var5 * graphicsPixelsWidth + var4] = var3;
         }
      }

   }

   @ObfuscatedName("ez")
   static void method4837(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field3752 && var0 < drawingAreaBottom) {
         if(var1 < drawingAreaTop) {
            var2 -= drawingAreaTop - var1;
            var1 = drawingAreaTop;
         }

         if(var2 + var1 > drawingAreaRight) {
            var2 = drawingAreaRight - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var9 = var0 + graphicsPixelsWidth * var1;

         for(int var10 = 0; var10 < var2; ++var10) {
            int var11 = var5 * (graphicsPixels[var9] >> 16 & 255);
            int var12 = var5 * (graphicsPixels[var9] >> 8 & 255);
            int var13 = var5 * (graphicsPixels[var9] & 255);
            int var14 = (var13 + var8 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            graphicsPixels[var9] = var14;
            var9 += graphicsPixelsWidth;
         }
      }

   }

   @ObfuscatedName("ey")
   public static void method4838(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method4834(var0, var1, var2 + 1, var4);
         } else {
            method4834(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if(var2 == 0) {
         if(var3 >= 0) {
            method4836(var0, var1, var3 + 1, var4);
         } else {
            method4836(var0, var3 + var1, -var3 + 1, var4);
         }
      } else {
         if(var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '耀';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field3752) {
               var1 += var5 * (field3752 - var0);
               var0 = field3752;
            }

            if(var2 >= drawingAreaBottom) {
               var2 = drawingAreaBottom - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= drawingAreaTop && var6 < drawingAreaRight) {
                  graphicsPixels[var6 * graphicsPixelsWidth + var0] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '耀';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < drawingAreaTop) {
               var0 += var5 * (drawingAreaTop - var1);
               var1 = drawingAreaTop;
            }

            if(var3 >= drawingAreaRight) {
               var3 = drawingAreaRight - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field3752 && var6 < drawingAreaBottom) {
                  graphicsPixels[var1 * graphicsPixelsWidth + var6] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }
      }

   }

   @ObfuscatedName("eo")
   static void method4839(int var0, int var1, int var2) {
      if(var0 >= field3752 && var1 >= drawingAreaTop && var0 < drawingAreaBottom && var1 < drawingAreaRight) {
         graphicsPixels[var0 + graphicsPixelsWidth * var1] = var2;
      }

   }

   @ObfuscatedName("es")
   public static void method4840(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + graphicsPixelsWidth * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            graphicsPixels[var6++] = var2;
         }

         var5 += graphicsPixelsWidth;
      }

   }

   @ObfuscatedName("dp")
   public static void method4841(int var0, int var1, int var2, int var3, int var4, int var5) {
      method4817(var0, var1, var2, var4, var5);
      method4817(var0, var3 + var1 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method4837(var0, var1 + 1, var3 - 2, var4, var5);
         method4837(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("da")
   public static void method4862(int var0, int var1, int var2, int var3) {
      if(field3752 < var0) {
         field3752 = var0;
      }

      if(drawingAreaTop < var1) {
         drawingAreaTop = var1;
      }

      if(drawingAreaBottom > var2) {
         drawingAreaBottom = var2;
      }

      if(drawingAreaRight > var3) {
         drawingAreaRight = var3;
      }

   }

   @ObfuscatedName("dj")
   public static void method4874(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var5 == var4 && var7 == var6?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3752) {
         var2 -= field3752 - var0;
         var0 = field3752;
      }

      if(var1 < drawingAreaTop) {
         var8 += (drawingAreaTop - var1) * var9;
         var3 -= drawingAreaTop - var1;
         var1 = drawingAreaTop;
      }

      if(var0 + var2 > drawingAreaBottom) {
         var2 = drawingAreaBottom - var0;
      }

      if(var3 + var1 > drawingAreaRight) {
         var3 = drawingAreaRight - var1;
      }

      int var12 = var4 >> 16;
      int var13 = (var4 & '\uff00') >> 8;
      int var14 = var4 & 255;
      int var15 = graphicsPixelsWidth - var2;
      int var16 = var0 + graphicsPixelsWidth * var1;

      for(int var17 = 0; var17 < var3; ++var17) {
         int var18;
         int var19;
         int var20;
         for(var18 = -var2; var18 < 0; ++var18) {
            var19 = graphicsPixels[var16];
            var20 = var19 >> 16;
            int var21 = (var19 & '\uff00') >> 8;
            int var22 = var19 & 255;
            int var23;
            int var24;
            int var25;
            if(var11 == 0) {
               var23 = var20 < 127?var20 * var12 >> 7:255 - ((255 - var12) * (255 - var20) >> 7);
               var24 = var21 < 127?var13 * var21 >> 7:255 - ((255 - var13) * (255 - var21) >> 7);
               var25 = var22 < 127?var22 * var14 >> 7:255 - ((255 - var22) * (255 - var14) >> 7);
            } else {
               var23 = var20 < 127?(var10 * var20 * var12 >> 7) + var11 * var20 >> 8:var10 * (255 - ((255 - var12) * (255 - var20) >> 7)) + var11 * var20 >> 8;
               var24 = var21 < 127?(var10 * var13 * var21 >> 7) + var11 * var21 >> 8:var10 * (255 - ((255 - var13) * (255 - var21) >> 7)) + var11 * var21 >> 8;
               var25 = var22 < 127?(var10 * var22 * var14 >> 7) + var11 * var22 >> 8:var10 * (255 - ((255 - var14) * (255 - var22) >> 7)) + var11 * var22 >> 8;
            }

            graphicsPixels[var16++] = var25 + (var23 << 16) + (var24 << 8);
         }

         if(var9 > 0) {
            var8 += var9;
            var18 = 65536 - var8 >> 8;
            var19 = var8 >> 8;
            if(var7 != var6) {
               var10 = var8 * var7 + (65536 - var8) * var6 >> 16;
               var11 = 256 - var10;
            }

            if(var5 != var4) {
               var20 = ((var5 & '\uff00') * var19 + var18 * (var4 & '\uff00') & 16711680) + (var19 * (var5 & 16711935) + (var4 & 16711935) * var18 & -16711936) >>> 8;
               var12 = var20 >> 16;
               var13 = (var20 & '\uff00') >> 8;
               var14 = var20 & 255;
            }
         }

         var16 += var15;
      }

   }

   @ObfuscatedName("df")
   public static void method4880() {
      field3752 = 0;
      drawingAreaTop = 0;
      drawingAreaBottom = graphicsPixelsWidth;
      drawingAreaRight = graphicsPixelsHeight;
   }

   @ObfuscatedName("dg")
   public static void method4884(int[] var0) {
      var0[0] = field3752;
      var0[1] = drawingAreaTop;
      var0[2] = drawingAreaBottom;
      var0[3] = drawingAreaRight;
   }

   @ObfuscatedName("dh")
   public static void method4888(int var0, int var1, int var2, int var3, int var4) {
      method4834(var0, var1, var2, var4);
      method4834(var0, var3 + var1 - 1, var2, var4);
      method4836(var0, var1, var3, var4);
      method4836(var0 + var2 - 1, var1, var3, var4);
   }

   static {
      drawingAreaTop = 0;
      drawingAreaRight = 0;
      field3752 = 0;
      drawingAreaBottom = 0;
   }
}
