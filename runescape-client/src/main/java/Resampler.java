import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Resampler")
public class Resampler {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static IndexedSprite field1352;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 135122197
   )
   @Export("storedSampleRateRatio")
   int storedSampleRateRatio;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 343750491
   )
   @Export("playbackSampleRateRatio")
   int playbackSampleRateRatio;
   @ObfuscatedName("q")
   @Export("resampleTable")
   int[][] resampleTable;

   public Resampler(int var1, int var2) {
      if(var2 != var1) {
         int var4 = var1;
         int var5 = var2;
         if(var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.storedSampleRateRatio = var1;
         this.playbackSampleRateRatio = var2;
         this.resampleTable = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.resampleTable[var7];
            double var9 = (double)var7 / (double)var1 + 6.0D;
            int var11 = (int)Math.floor(var9 - 7.0D + 1.0D);
            if(var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(7.0D + var9);
            if(var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * 3.141592653589793D;
               double var17 = var13;
               if(var15 < -1.0E-4D || var15 > 1.0E-4D) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
               var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
            }
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "160754994"
   )
   @Export("resampleIfNecessary")
   byte[] resampleIfNecessary(byte[] var1) {
      if(this.resampleTable != null) {
         int var2 = (int)((long)this.playbackSampleRateRatio * (long)var1.length / (long)this.storedSampleRateRatio) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.resampleTable[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var7 * var8[var9];
            }

            var5 += this.playbackSampleRateRatio;
            var9 = var5 / this.storedSampleRateRatio;
            var4 += var9;
            var5 -= var9 * this.storedSampleRateRatio;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + 32768 >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "715273606"
   )
   int method2240(int var1) {
      if(this.resampleTable != null) {
         var1 = (int)((long)var1 * (long)this.playbackSampleRateRatio / (long)this.storedSampleRateRatio);
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "149890453"
   )
   int method2241(int var1) {
      if(this.resampleTable != null) {
         var1 = (int)((long)this.playbackSampleRateRatio * (long)var1 / (long)this.storedSampleRateRatio) + 6;
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Z",
      garbageValue = "1"
   )
   public static boolean method2249(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if(var6 >= var5) {
            var1 = var3;
            break;
         }

         label86: {
            char var7 = var0.charAt(var6);
            if(var6 == 0) {
               if(var7 == '-') {
                  var2 = true;
                  break label86;
               }

               if(var7 == '+') {
                  break label86;
               }
            }

            int var9;
            if(var7 >= '0' && var7 <= '9') {
               var9 = var7 - '0';
            } else if(var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - '7';
            } else {
               if(var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 'W';
            }

            if(var9 >= 10) {
               var1 = false;
               break;
            }

            if(var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if(var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-879743478"
   )
   static int method2238(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class69.intStack[--class69.intStackSize];
         var3 = class26.getWidget(var4);
      } else {
         var3 = var2?class276.field3561:KitDefinition.field3301;
      }

      if(var0 == 1100) {
         class69.intStackSize -= 2;
         var3.scrollX = class69.intStack[class69.intStackSize];
         if(var3.scrollX > var3.scrollWidth - var3.width) {
            var3.scrollX = var3.scrollWidth - var3.width;
         }

         if(var3.scrollX < 0) {
            var3.scrollX = 0;
         }

         var3.scrollY = class69.intStack[class69.intStackSize + 1];
         if(var3.scrollY > var3.scrollHeight - var3.height) {
            var3.scrollY = var3.scrollHeight - var3.height;
         }

         if(var3.scrollY < 0) {
            var3.scrollY = 0;
         }

         Player.method1114(var3);
         return 1;
      } else if(var0 == 1101) {
         var3.textColor = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1102) {
         var3.filled = class69.intStack[--class69.intStackSize] == 1;
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1103) {
         var3.opacity = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1104) {
         var3.lineWidth = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1105) {
         var3.spriteId = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1106) {
         var3.textureId = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1107) {
         var3.spriteTiling = class69.intStack[--class69.intStackSize] == 1;
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1108) {
         var3.modelType = 1;
         var3.modelId = class69.intStack[--class69.intStackSize];
         Player.method1114(var3);
         return 1;
      } else if(var0 == 1109) {
         class69.intStackSize -= 6;
         var3.offsetX2d = class69.intStack[class69.intStackSize];
         var3.offsetY2d = class69.intStack[class69.intStackSize + 1];
         var3.rotationX = class69.intStack[class69.intStackSize + 2];
         var3.rotationZ = class69.intStack[class69.intStackSize + 3];
         var3.rotationY = class69.intStack[class69.intStackSize + 4];
         var3.modelZoom = class69.intStack[class69.intStackSize + 5];
         Player.method1114(var3);
         return 1;
      } else {
         int var8;
         if(var0 == 1110) {
            var8 = class69.intStack[--class69.intStackSize];
            if(var8 != var3.field2595) {
               var3.field2595 = var8;
               var3.field2728 = 0;
               var3.field2613 = 0;
               Player.method1114(var3);
            }

            return 1;
         } else if(var0 == 1111) {
            var3.field2662 = class69.intStack[--class69.intStackSize] == 1;
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1112) {
            String var7 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
            if(!var7.equals(var3.text)) {
               var3.text = var7;
               Player.method1114(var3);
            }

            return 1;
         } else if(var0 == 1113) {
            var3.fontId = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1114) {
            class69.intStackSize -= 3;
            var3.field2669 = class69.intStack[class69.intStackSize];
            var3.field2681 = class69.intStack[class69.intStackSize + 1];
            var3.field2668 = class69.intStack[class69.intStackSize + 2];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1115) {
            var3.textShadowed = class69.intStack[--class69.intStackSize] == 1;
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1116) {
            var3.borderThickness = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1117) {
            var3.sprite2 = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1118) {
            var3.flippedVertically = class69.intStack[--class69.intStackSize] == 1;
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1119) {
            var3.flippedHorizontally = class69.intStack[--class69.intStackSize] == 1;
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1120) {
            class69.intStackSize -= 2;
            var3.scrollWidth = class69.intStack[class69.intStackSize];
            var3.scrollHeight = class69.intStack[class69.intStackSize + 1];
            Player.method1114(var3);
            if(var4 != -1 && var3.type == 0) {
               GameSocket.method3388(GameCanvas.widgets[var4 >> 16], var3, false);
            }

            return 1;
         } else if(var0 == 1121) {
            Varcs.method1921(var3.id, var3.index);
            Client.field744 = var3;
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1122) {
            var3.field2641 = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1123) {
            var3.field2631 = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1124) {
            var3.field2608 = class69.intStack[--class69.intStackSize];
            Player.method1114(var3);
            return 1;
         } else if(var0 == 1125) {
            var8 = class69.intStack[--class69.intStackSize];
            class316 var6 = (class316)class76.forOrdinal(WorldMapRegion.method423(), var8);
            if(var6 != null) {
               var3.field2701 = var6;
               Player.method1114(var3);
            }

            return 1;
         } else {
            boolean var5;
            if(var0 == 1126) {
               var5 = class69.intStack[--class69.intStackSize] == 1;
               var3.field2639 = var5;
               return 1;
            } else if(var0 == 1127) {
               var5 = class69.intStack[--class69.intStackSize] == 1;
               var3.field2726 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "158001383"
   )
   static final int method2248(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }
}
