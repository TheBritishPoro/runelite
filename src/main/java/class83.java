import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cf")
@Implements("ModIcon")
public final class class83 extends class82 {
   @ObfuscatedName("k")
   @Export("width")
   public int field1496;
   @ObfuscatedName("g")
   @Export("palette")
   public int[] field1497;
   @ObfuscatedName("r")
   @Export("originalWidth")
   public int field1498;
   @ObfuscatedName("l")
   @Export("pixels")
   public byte[] field1499;
   @ObfuscatedName("h")
   @Export("offsetX")
   public int field1500;
   @ObfuscatedName("s")
   @Export("offsetY")
   public int field1501;
   @ObfuscatedName("u")
   @Export("originalHeight")
   public int field1502;
   @ObfuscatedName("e")
   @Export("height")
   public int field1503;

   @ObfuscatedName("l")
   public void method1952() {
      if(this.field1498 != this.field1496 || this.field1503 != this.field1502) {
         byte[] var1 = new byte[this.field1496 * this.field1502];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field1503; ++var3) {
            for(int var4 = 0; var4 < this.field1498; ++var4) {
               var1[var4 + this.field1500 + (var3 + this.field1501) * this.field1496] = this.field1499[var2++];
            }
         }

         this.field1499 = var1;
         this.field1498 = this.field1496;
         this.field1503 = this.field1502;
         this.field1500 = 0;
         this.field1501 = 0;
      }
   }

   @ObfuscatedName("r")
   public void method1954(int var1, int var2) {
      var1 += this.field1500;
      var2 += this.field1501;
      int var3 = var1 + var2 * class82.field1490;
      int var4 = 0;
      int var5 = this.field1503;
      int var6 = this.field1498;
      int var7 = class82.field1490 - var6;
      int var8 = 0;
      int var9;
      if(var2 < class82.field1492) {
         var9 = class82.field1492 - var2;
         var5 -= var9;
         var2 = class82.field1492;
         var4 += var9 * var6;
         var3 += var9 * class82.field1490;
      }

      if(var2 + var5 > class82.field1489) {
         var5 -= var2 + var5 - class82.field1489;
      }

      if(var1 < class82.field1491) {
         var9 = class82.field1491 - var1;
         var6 -= var9;
         var1 = class82.field1491;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > class82.field1495) {
         var9 = var1 + var6 - class82.field1495;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method1955(class82.field1493, this.field1499, this.field1497, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("e")
   static void method1955(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   @ObfuscatedName("g")
   public void method1960(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1497.length; ++var4) {
         int var5 = this.field1497[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field1497[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field1497[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.field1497[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }
}
