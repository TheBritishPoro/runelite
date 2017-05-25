import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dq")
@Implements("SoundEffect3")
public class SoundEffect3 {
   @ObfuscatedName("i")
   int[] field1691;
   @ObfuscatedName("u")
   int[][][] field1693;
   @ObfuscatedName("p")
   static float field1694;
   @ObfuscatedName("g")
   int[] field1695;
   @ObfuscatedName("t")
   static int[][] field1696;
   @ObfuscatedName("q")
   int[][][] field1697;
   @ObfuscatedName("v")
   static float[][] field1698;
   @ObfuscatedName("l")
   static int field1699;

   @ObfuscatedName("i")
   float method2304(int var1, int var2, float var3) {
      float var4 = (float)this.field1697[var1][0][var2] + var3 * (float)(this.field1697[var1][1][var2] - this.field1697[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   SoundEffect3() {
      this.field1691 = new int[2];
      this.field1693 = new int[2][2][4];
      this.field1697 = new int[2][2][4];
      this.field1695 = new int[2];
   }

   @ObfuscatedName("u")
   float method2305(int var1, int var2, float var3) {
      float var4 = (float)this.field1693[var1][0][var2] + var3 * (float)(this.field1693[var1][1][var2] - this.field1693[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2313(var4);
   }

   @ObfuscatedName("g")
   final void method2307(Buffer var1, SoundEffect2 var2) {
      int var3 = var1.readUnsignedByte();
      this.field1691[0] = var3 >> 4;
      this.field1691[1] = var3 & 15;
      if(var3 != 0) {
         this.field1695[0] = var1.readUnsignedShort();
         this.field1695[1] = var1.readUnsignedShort();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1691[var5]; ++var6) {
               this.field1693[var5][0][var6] = var1.readUnsignedShort();
               this.field1697[var5][0][var6] = var1.readUnsignedShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1691[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field1693[var5][1][var6] = var1.readUnsignedShort();
                  this.field1697[var5][1][var6] = var1.readUnsignedShort();
               } else {
                  this.field1693[var5][1][var6] = this.field1693[var5][0][var6];
                  this.field1697[var5][1][var6] = this.field1697[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.field1695[1] != this.field1695[0]) {
            var2.method2104(var1);
         }
      } else {
         int[] var7 = this.field1695;
         this.field1695[1] = 0;
         var7[0] = 0;
      }

   }

   static {
      field1698 = new float[2][8];
      field1696 = new int[2][8];
   }

   @ObfuscatedName("h")
   static float method2313(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @ObfuscatedName("q")
   int method2318(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.field1695[0] + (float)(this.field1695[1] - this.field1695[0]) * var2;
         var3 *= 0.0030517578F;
         field1694 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field1699 = (int)(field1694 * 65536.0F);
      }

      if(this.field1691[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2304(var1, 0, var2);
         field1698[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method2305(var1, 0, var2));
         field1698[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field1691[var1]; ++var4) {
            var3 = this.method2304(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method2305(var1, var4, var2));
            float var6 = var3 * var3;
            field1698[var1][var4 * 2 + 1] = field1698[var1][var4 * 2 - 1] * var6;
            field1698[var1][var4 * 2] = field1698[var1][var4 * 2 - 1] * var5 + field1698[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field1698[var1][var7] += field1698[var1][var7 - 1] * var5 + field1698[var1][var7 - 2] * var6;
            }

            field1698[var1][1] += field1698[var1][0] * var5 + var6;
            field1698[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.field1691[0] * 2; ++var4) {
               field1698[0][var4] *= field1694;
            }
         }

         for(var4 = 0; var4 < this.field1691[var1] * 2; ++var4) {
            field1696[var1][var4] = (int)(field1698[var1][var4] * 65536.0F);
         }

         return this.field1691[var1] * 2;
      }
   }
}
