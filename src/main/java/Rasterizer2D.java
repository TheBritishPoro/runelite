import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("Rasterizer2D")
public class Rasterizer2D extends CacheableNode {
   @ObfuscatedName("az")
   public static int field3746;
   @ObfuscatedName("ay")
   @Export("graphicsPixelsWidth")
   public static int graphicsPixelsWidth;
   @ObfuscatedName("ah")
   @Export("graphicsPixelsHeight")
   public static int graphicsPixelsHeight;
   @ObfuscatedName("aq")
   public static int field3749;
   @ObfuscatedName("ac")
   public static int field3750;
   @ObfuscatedName("z")
   @Export("graphicsPixels")
   public static int[] graphicsPixels;
   @ObfuscatedName("af")
   protected static int field3752;

   @ObfuscatedName("cq")
   public static void method4998(int var0, int var1, int var2, int var3) {
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

      field3749 = var0;
      field3746 = var1;
      field3752 = var2;
      field3750 = var3;
   }

   @ObfuscatedName("dg")
   public static void method4999(int var0, int var1, int var2, int var3) {
      if(field3749 < var0) {
         field3749 = var0;
      }

      if(field3746 < var1) {
         field3746 = var1;
      }

      if(field3752 > var2) {
         field3752 = var2;
      }

      if(field3750 > var3) {
         field3750 = var3;
      }

   }

   @ObfuscatedName("dr")
   public static void method5000(int[] var0) {
      var0[0] = field3749;
      var0[1] = field3746;
      var0[2] = field3752;
      var0[3] = field3750;
   }

   @ObfuscatedName("dm")
   public static void method5001(int[] var0) {
      field3749 = var0[0];
      field3746 = var0[1];
      field3752 = var0[2];
      field3750 = var0[3];
   }

   @ObfuscatedName("dx")
   public static void method5002() {
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

   @ObfuscatedName("dk")
   static void method5003(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method5019(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field3746) {
            var4 = field3746;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field3750) {
            var5 = field3750;
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
            if(var12 < field3749) {
               var12 = field3749;
            }

            var13 = var0 + var8;
            if(var13 > field3752) {
               var13 = field3752;
            }

            var14 = var12 + var6 * graphicsPixelsWidth;

            for(var15 = var12; var15 < var13; ++var15) {
               graphicsPixels[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field3749) {
               var12 = field3749;
            }

            var13 = var0 + var8;
            if(var13 > field3752 - 1) {
               var13 = field3752 - 1;
            }

            var14 = var12 + var6 * graphicsPixelsWidth;

            for(var15 = var12; var15 <= var13; ++var15) {
               graphicsPixels[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   @ObfuscatedName("ds")
   public static void method5004(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method5003(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if(var12 < field3746) {
               var12 = field3746;
            }

            int var13 = var1 + var2 + 1;
            if(var13 > field3750) {
               var13 = field3750;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < field3749) {
                  var20 = field3749;
               }

               var21 = var0 + var16;
               if(var21 > field3752) {
                  var21 = field3752;
               }

               var22 = var20 + var14 * graphicsPixelsWidth;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (graphicsPixels[var22] >> 16 & 255) * var5;
                  var10 = (graphicsPixels[var22] >> 8 & 255) * var5;
                  var11 = (graphicsPixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  graphicsPixels[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < field3749) {
                  var20 = field3749;
               }

               var21 = var0 + var16;
               if(var21 > field3752 - 1) {
                  var21 = field3752 - 1;
               }

               var22 = var20 + var14 * graphicsPixelsWidth;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (graphicsPixels[var22] >> 16 & 255) * var5;
                  var10 = (graphicsPixels[var22] >> 8 & 255) * var5;
                  var11 = (graphicsPixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  graphicsPixels[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   @ObfuscatedName("du")
   public static void method5007(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var4 == var5 && var6 == var7?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      int var12 = var4;
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var8 += (field3746 - var1) * var9;
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var13 = graphicsPixelsWidth - var2;
      int var14 = var0 + var1 * graphicsPixelsWidth;

      for(int var15 = -var3; var15 < 0; ++var15) {
         int var16;
         int var17;
         for(var16 = -var2; var16 < 0; ++var16) {
            var17 = graphicsPixels[var14];
            int var18 = var12 + var17;
            int var19 = (var12 & 16711935) + (var17 & 16711935);
            int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
            if(var11 == 0) {
               graphicsPixels[var14++] = var18 - var20 | var20 - (var20 >>> 8);
            } else {
               int var21 = var18 - var20 | var20 - (var20 >>> 8);
               graphicsPixels[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var21 & '\uff00') * var10 >> 8 & '\uff00') + ((var17 & 16711935) * var11 >> 8 & 16711935) + ((var17 & '\uff00') * var11 >> 8 & '\uff00');
            }
         }

         if(var9 > 0) {
            var8 += var9;
            var16 = 65536 - var8 >> 8;
            var17 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var12 = ((var4 & 16711935) * var16 + (var5 & 16711935) * var17 & -16711936) + ((var4 & '\uff00') * var16 + (var5 & '\uff00') * var17 & 16711680) >>> 8;
            }
         }

         var14 += var13;
      }

   }

   @ObfuscatedName("cv")
   public static void method5009() {
      field3749 = 0;
      field3746 = 0;
      field3752 = graphicsPixelsWidth;
      field3750 = graphicsPixelsHeight;
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "9135624"
   )
   public static void method5010(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var6 += (field3746 - var1) * var7;
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var8 = graphicsPixelsWidth - var2;
      int var9 = var0 + var1 * graphicsPixelsWidth;

      for(int var10 = -var3; var10 < 0; ++var10) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

         for(int var14 = -var2; var14 < 0; ++var14) {
            graphicsPixels[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }

   }

   @ObfuscatedName("dz")
   public static void method5011(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var8 += (field3746 - var1) * var9;
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = graphicsPixelsWidth - var2;
      int var19 = var0 + var1 * graphicsPixelsWidth;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = graphicsPixels[var19];
            var23 = var22 & 16711680;
            int var24 = var23 >= var12?var23:(var11 == 0?var12:var15 + (var23 * var11 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 >= var13?var25:(var11 == 0?var13:var16 + (var25 * var11 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 >= var14?var27:(var11 == 0?var14:var17 + (var27 * var11 >> 8));
            graphicsPixels[var19++] = var24 + var26 + var28;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var12 * var10 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var14 * var10 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("dq")
   public static void method5012(int var0, int var1, int var2, int var3, int var4) {
      method5014(var0, var1, var2, var4);
      method5014(var0, var1 + var3 - 1, var2, var4);
      method5076(var0, var1, var3, var4);
      method5076(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("dw")
   public static void method5013(int var0, int var1, int var2, int var3, int var4, int var5) {
      method5015(var0, var1, var2, var4, var5);
      method5015(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method5017(var0, var1 + 1, var3 - 2, var4, var5);
         method5017(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("dl")
   public static void method5014(int var0, int var1, int var2, int var3) {
      if(var1 >= field3746 && var1 < field3750) {
         if(var0 < field3749) {
            var2 -= field3749 - var0;
            var0 = field3749;
         }

         if(var0 + var2 > field3752) {
            var2 = field3752 - var0;
         }

         int var4 = var0 + var1 * graphicsPixelsWidth;

         for(int var5 = 0; var5 < var2; ++var5) {
            graphicsPixels[var4 + var5] = var3;
         }

      }
   }

   @ObfuscatedName("di")
   static void method5015(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field3746 && var1 < field3750) {
         if(var0 < field3749) {
            var2 -= field3749 - var0;
            var0 = field3749;
         }

         if(var0 + var2 > field3752) {
            var2 = field3752 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * graphicsPixelsWidth;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (graphicsPixels[var12] >> 16 & 255) * var5;
            int var10 = (graphicsPixels[var12] >> 8 & 255) * var5;
            int var11 = (graphicsPixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            graphicsPixels[var12++] = var14;
         }

      }
   }

   @ObfuscatedName("dj")
   static void method5017(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field3749 && var0 < field3752) {
         if(var1 < field3746) {
            var2 -= field3746 - var1;
            var1 = field3746;
         }

         if(var1 + var2 > field3750) {
            var2 = field3750 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * graphicsPixelsWidth;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (graphicsPixels[var12] >> 16 & 255) * var5;
            int var10 = (graphicsPixels[var12] >> 8 & 255) * var5;
            int var11 = (graphicsPixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            graphicsPixels[var12] = var14;
            var12 += graphicsPixelsWidth;
         }

      }
   }

   @ObfuscatedName("ct")
   @Export("setRasterBuffer")
   public static void setRasterBuffer(int[] var0, int var1, int var2) {
      graphicsPixels = var0;
      graphicsPixelsWidth = var1;
      graphicsPixelsHeight = var2;
      method4998(0, 0, var1, var2);
   }

   @ObfuscatedName("dd")
   static void method5019(int var0, int var1, int var2) {
      if(var0 >= field3749 && var1 >= field3746 && var0 < field3752 && var1 < field3750) {
         graphicsPixels[var0 + var1 * graphicsPixelsWidth] = var2;
      }
   }

   @ObfuscatedName("dn")
   public static void method5020(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * graphicsPixelsWidth;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            graphicsPixels[var6++] = var2;
         }

         var5 += graphicsPixelsWidth;
      }

   }

   static {
      field3746 = 0;
      field3750 = 0;
      field3749 = 0;
      field3752 = 0;
   }

   @ObfuscatedName("de")
   public static void method5042(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var5 = graphicsPixelsWidth - var2;
      int var6 = var0 + var1 * graphicsPixelsWidth;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            graphicsPixels[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("dv")
   public static void method5048(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = graphicsPixelsWidth - var2;
      int var8 = var0 + var1 * graphicsPixelsWidth;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = graphicsPixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            graphicsPixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("dp")
   public static void method5055(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method5014(var0, var1, var2 + 1, var4);
         } else {
            method5014(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method5076(var0, var1, var3 + 1, var4);
         } else {
            method5076(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
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
            if(var0 < field3749) {
               var1 += var5 * (field3749 - var0);
               var0 = field3749;
            }

            if(var2 >= field3752) {
               var2 = field3752 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field3746 && var6 < field3750) {
                  graphicsPixels[var0 + var6 * graphicsPixelsWidth] = var4;
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
            if(var1 < field3746) {
               var0 += var5 * (field3746 - var1);
               var1 = field3746;
            }

            if(var3 >= field3750) {
               var3 = field3750 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field3749 && var6 < field3752) {
                  graphicsPixels[var6 + var1 * graphicsPixelsWidth] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("db")
   public static void method5063(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var8 += (field3746 - var1) * var9;
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = graphicsPixelsWidth - var2;
      int var19 = var0 + var1 * graphicsPixelsWidth;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = graphicsPixels[var19];
            var23 = var22 & 16711680;
            int var24 = var23 <= var12?var23:(var11 == 0?var12:var15 + (var23 * var11 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 <= var13?var25:(var11 == 0?var13:var16 + (var25 * var11 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 <= var14?var27:(var11 == 0?var14:var17 + (var27 * var11 >> 8));
            graphicsPixels[var19++] = var24 + var26 + var28;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var12 * var10 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var14 * var10 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("da")
   public static void method5073(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var4 == var5 && var6 == var7?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field3749) {
         var2 -= field3749 - var0;
         var0 = field3749;
      }

      if(var1 < field3746) {
         var8 += (field3746 - var1) * var9;
         var3 -= field3746 - var1;
         var1 = field3746;
      }

      if(var0 + var2 > field3752) {
         var2 = field3752 - var0;
      }

      if(var1 + var3 > field3750) {
         var3 = field3750 - var1;
      }

      int var12 = var4 >> 16;
      int var13 = (var4 & '\uff00') >> 8;
      int var14 = var4 & 255;
      int var18 = graphicsPixelsWidth - var2;
      int var19 = var0 + var1 * graphicsPixelsWidth;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = graphicsPixels[var19];
            var23 = var22 >> 16;
            int var24 = (var22 & '\uff00') >> 8;
            int var25 = var22 & 255;
            int var15;
            int var16;
            int var17;
            if(var11 == 0) {
               var15 = var23 < 127?var12 * var23 >> 7:255 - ((255 - var12) * (255 - var23) >> 7);
               var16 = var24 < 127?var13 * var24 >> 7:255 - ((255 - var13) * (255 - var24) >> 7);
               var17 = var25 < 127?var14 * var25 >> 7:255 - ((255 - var14) * (255 - var25) >> 7);
            } else {
               var15 = var23 < 127?(var12 * var23 * var10 >> 7) + var23 * var11 >> 8:(255 - ((255 - var12) * (255 - var23) >> 7)) * var10 + var23 * var11 >> 8;
               var16 = var24 < 127?(var13 * var24 * var10 >> 7) + var24 * var11 >> 8:(255 - ((255 - var13) * (255 - var24) >> 7)) * var10 + var24 * var11 >> 8;
               var17 = var25 < 127?(var14 * var25 * var10 >> 7) + var25 * var11 >> 8:(255 - ((255 - var14) * (255 - var25) >> 7)) * var10 + var25 * var11 >> 8;
            }

            graphicsPixels[var19++] = (var15 << 16) + (var16 << 8) + var17;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 >> 16;
               var13 = (var23 & '\uff00') >> 8;
               var14 = var23 & 255;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("dt")
   public static void method5076(int var0, int var1, int var2, int var3) {
      if(var0 >= field3749 && var0 < field3752) {
         if(var1 < field3746) {
            var2 -= field3746 - var1;
            var1 = field3746;
         }

         if(var1 + var2 > field3750) {
            var2 = field3750 - var1;
         }

         int var4 = var0 + var1 * graphicsPixelsWidth;

         for(int var5 = 0; var5 < var2; ++var5) {
            graphicsPixels[var4 + var5 * graphicsPixelsWidth] = var3;
         }

      }
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void method5079(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if(var0 + var2 >= 0 && var1 + var3 >= 0) {
         if(var0 < graphicsPixelsWidth && var1 < graphicsPixelsHeight) {
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

            if(var1 + var3 > graphicsPixelsHeight) {
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
               var14 = (var1 + var9) * graphicsPixelsWidth + var0 + var8;

               for(var15 = var1 + var9; var15 < var1 + var9 + var3; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     if(var6[var17 * var7 + var18] != 0) {
                        graphicsPixels[var14++] = var5;
                     } else {
                        graphicsPixels[var14++] = var4;
                     }
                  }

                  var14 += var11;
               }
            } else {
               var14 = (var1 + var9) * graphicsPixelsWidth + var0 + var8;

               for(var15 = var1 + var9; var15 < var1 + var9 + var3; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     int var19 = var4;
                     if(var6[var17 * var7 + var18] != 0) {
                        var19 = var5;
                     }

                     int var20 = var19 >>> 24;
                     int var21 = 255 - var20;
                     int var22 = graphicsPixels[var14];
                     int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + ((var19 & '\uff00') * var20 + (var22 & '\uff00') * var21 & 16711680) >> 8;
                     graphicsPixels[var14++] = var23;
                  }

                  var14 += var11;
               }
            }

         }
      }
   }
}
