import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bh")
public class class53 {
   @ObfuscatedName("e")
   class70[] field985 = new class70[10];
   @ObfuscatedName("f")
   int field986;
   @ObfuscatedName("k")
   int field987;

   class53(Buffer var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte();
         if(var3 != 0) {
            --var1.offset;
            this.field985[var2] = new class70();
            this.field985[var2].method1348(var1);
         }
      }

      this.field986 = var1.readUnsignedShort();
      this.field987 = var1.readUnsignedShort();
   }

   @ObfuscatedName("e")
   public class55 method938() {
      byte[] var1 = this.method940();
      return new class55(22050, var1, 22050 * this.field986 / 1000, 22050 * this.field987 / 1000);
   }

   @ObfuscatedName("k")
   final byte[] method940() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field985[var2] != null && this.field985[var2].field1159 + this.field985[var2].field1166 > var1) {
            var1 = this.field985[var2].field1159 + this.field985[var2].field1166;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field985[var4] != null) {
               int var5 = this.field985[var4].field1159 * 22050 / 1000;
               int var6 = this.field985[var4].field1166 * 22050 / 1000;
               int[] var7 = this.field985[var4].method1346(var5, this.field985[var4].field1159);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("f")
   public final int method946() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field985[var2] != null && this.field985[var2].field1166 / 20 < var1) {
            var1 = this.field985[var2].field1166 / 20;
         }
      }

      if(this.field986 < this.field987 && this.field986 / 20 < var1) {
         var1 = this.field986 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field985[var2] != null) {
               this.field985[var2].field1166 -= var1 * 20;
            }
         }

         if(this.field986 < this.field987) {
            this.field986 -= var1 * 20;
            this.field987 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("i")
   public static class53 method950(class182 var0, int var1, int var2) {
      byte[] var3 = var0.method3211(var1, var2);
      return var3 == null?null:new class53(new Buffer(var3));
   }
}
