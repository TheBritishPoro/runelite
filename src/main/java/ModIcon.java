import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cj")
@Implements("ModIcon")
public final class ModIcon extends class82 {
   @ObfuscatedName("x")
   @Export("pixels")
   public byte[] pixels;
   @ObfuscatedName("m")
   @Export("originalHeight")
   public int originalHeight;
   @ObfuscatedName("r")
   @Export("palette")
   public int[] palette;
   @ObfuscatedName("z")
   @Export("height")
   public int height;
   @ObfuscatedName("j")
   @Export("originalWidth")
   public int originalWidth;
   @ObfuscatedName("b")
   @Export("offsetY")
   public int offsetY;
   @ObfuscatedName("l")
   @Export("width")
   public int width;
   @ObfuscatedName("i")
   @Export("offsetX")
   public int offsetX;

   @ObfuscatedName("x")
   public void method1895() {
      if(this.originalWidth != this.width || this.height != this.originalHeight) {
         byte[] var1 = new byte[this.width * this.originalHeight];
         int var2 = 0;

         for(int var3 = 0; var3 < this.height; ++var3) {
            for(int var4 = 0; var4 < this.originalWidth; ++var4) {
               var1[var4 + this.offsetX + (var3 + this.offsetY) * this.width] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.originalWidth = this.width;
         this.height = this.originalHeight;
         this.offsetX = 0;
         this.offsetY = 0;
      }
   }

   @ObfuscatedName("j")
   public void method1896(int var1, int var2) {
      var1 += this.offsetX;
      var2 += this.offsetY;
      int var3 = var1 + var2 * class82.graphicsPixelsWidth;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.originalWidth;
      int var7 = class82.graphicsPixelsWidth - var6;
      int var8 = 0;
      int var9;
      if(var2 < class82.field1450) {
         var9 = class82.field1450 - var2;
         var5 -= var9;
         var2 = class82.field1450;
         var4 += var9 * var6;
         var3 += var9 * class82.graphicsPixelsWidth;
      }

      if(var2 + var5 > class82.field1451) {
         var5 -= var2 + var5 - class82.field1451;
      }

      if(var1 < class82.field1452) {
         var9 = class82.field1452 - var1;
         var6 -= var9;
         var1 = class82.field1452;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > class82.field1453) {
         var9 = var1 + var6 - class82.field1453;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method1897(class82.graphicsPixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("z")
   static void method1897(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("r")
   public void method1900(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.palette.length; ++var4) {
         int var5 = this.palette[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.palette[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }
}
