import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class70 extends class208 {
   @ObfuscatedName("s")
   boolean field1270;
   @ObfuscatedName("h")
   int field1271;
   @ObfuscatedName("m")
   int field1272;
   @ObfuscatedName("ab")
   static float[] field1273;
   @ObfuscatedName("r")
   static class73[] field1274;
   @ObfuscatedName("n")
   static int field1275;
   @ObfuscatedName("z")
   int field1276;
   @ObfuscatedName("c")
   static int field1277;
   @ObfuscatedName("ao")
   int field1278;
   @ObfuscatedName("l")
   static int field1279;
   @ObfuscatedName("u")
   static int field1280;
   @ObfuscatedName("e")
   boolean field1281;
   @ObfuscatedName("i")
   static byte[] field1282;
   @ObfuscatedName("a")
   static class67[] field1283;
   @ObfuscatedName("p")
   static class68[] field1284;
   @ObfuscatedName("q")
   static boolean[] field1285;
   @ObfuscatedName("b")
   static int[] field1286;
   @ObfuscatedName("t")
   static boolean field1287 = false;
   @ObfuscatedName("y")
   float[] field1288;
   @ObfuscatedName("x")
   int field1289;
   @ObfuscatedName("d")
   static class60[] field1290;
   @ObfuscatedName("g")
   int field1291;
   @ObfuscatedName("k")
   static float[] field1292;
   @ObfuscatedName("o")
   static float[] field1293;
   @ObfuscatedName("v")
   static float[] field1294;
   @ObfuscatedName("f")
   static float[] field1295;
   @ObfuscatedName("au")
   static float[] field1296;
   @ObfuscatedName("aq")
   static float[] field1297;
   @ObfuscatedName("ay")
   int field1298;
   @ObfuscatedName("am")
   static int[] field1299;
   @ObfuscatedName("an")
   static int[] field1300;
   @ObfuscatedName("aj")
   byte[] field1301;
   @ObfuscatedName("w")
   int field1302;
   @ObfuscatedName("j")
   byte[][] field1303;

   @ObfuscatedName("n")
   static class70 method1525(class167 var0, int var1, int var2) {
      if(!method1551(var0)) {
         var0.method3294(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method3217(var1, var2);
         return var3 == null?null:new class70(var3);
      }
   }

   @ObfuscatedName("m")
   static int method1527() {
      int var0 = field1282[field1277] >> field1275 & 1;
      ++field1275;
      field1277 += field1275 >> 3;
      field1275 &= 7;
      return var0;
   }

   @ObfuscatedName("x")
   void method1528(byte[] var1) {
      class119 var2 = new class119(var1);
      this.field1271 = var2.method2505();
      this.field1272 = var2.method2505();
      this.field1276 = var2.method2505();
      this.field1289 = var2.method2505();
      if(this.field1289 < 0) {
         this.field1289 = ~this.field1289;
         this.field1281 = true;
      }

      int var3 = var2.method2505();
      this.field1303 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method2500();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method2511(var7, 0, var5);
         this.field1303[var4] = var7;
      }

   }

   @ObfuscatedName("j")
   static float method1529(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfuscatedName("i")
   float[] method1530(int var1) {
      method1548(this.field1303[var1], 0);
      method1527();
      int var2 = method1533(class21.method581(field1286.length - 1));
      boolean var3 = field1285[var2];
      int var4 = var3?field1280:field1279;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method1527() != 0;
         var6 = method1527() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field1279 >> 2);
         var9 = (var4 >> 2) + (field1279 >> 2);
         var10 = field1279 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1279 >> 2);
         var12 = var4 - (var4 >> 2) + (field1279 >> 2);
         var13 = field1279 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class68 var14 = field1284[field1286[var2]];
      int var16 = var14.field1263;
      int var17 = var14.field1264[var16];
      boolean var15 = !field1283[var17].method1488();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field1262; ++var17) {
         class60 var18 = field1290[var14.field1265[var17]];
         float[] var19 = field1292;
         var18.method1265(var19, var4 >> 1, var40);
      }

      int var41;
      if(!var15) {
         var17 = var14.field1263;
         var41 = var14.field1264[var17];
         field1283[var41].method1486(field1292, var4 >> 1);
      }

      int var42;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field1292[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field1292;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3?field1296:field1293;
         float[] var22 = var3?field1297:field1294;
         float[] var23 = var3?field1273:field1295;
         int[] var24 = var3?field1300:field1299;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class21.method581(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1292[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1292[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if(this.field1302 > 0) {
         var41 = this.field1302 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if(!this.field1270) {
            for(var42 = 0; var42 < this.field1291; ++var42) {
               var45 = (this.field1302 >> 1) + var42;
               var43[var42] += this.field1288[var45];
            }
         }

         if(!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field1292[var42];
            }
         }
      }

      float[] var44 = this.field1288;
      this.field1288 = field1292;
      field1292 = var44;
      this.field1302 = var4;
      this.field1291 = var12 - (var4 >> 1);
      this.field1270 = var15;
      return var43;
   }

   @ObfuscatedName("l")
   class62 method1531(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field1301 == null) {
            this.field1302 = 0;
            this.field1288 = new float[field1280];
            this.field1301 = new byte[this.field1272];
            this.field1298 = 0;
            this.field1278 = 0;
         }

         for(; this.field1278 < this.field1303.length; ++this.field1278) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1530(this.field1278);
            if(var2 != null) {
               int var3 = this.field1298;
               int var4 = var2.length;
               if(var4 > this.field1272 - var3) {
                  var4 = this.field1272 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1301[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field1298;
               }

               this.field1298 = var3;
            }
         }

         this.field1288 = null;
         byte[] var7 = this.field1301;
         this.field1301 = null;
         return new class62(this.field1271, var7, this.field1276, this.field1289, this.field1281);
      }
   }

   class70(byte[] var1) {
      this.method1528(var1);
   }

   @ObfuscatedName("z")
   static int method1533(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field1275; var0 -= var3) {
         var3 = 8 - field1275;
         int var4 = (1 << var3) - 1;
         var1 += (field1282[field1277] >> field1275 & var4) << var2;
         field1275 = 0;
         ++field1277;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field1282[field1277] >> field1275 & var3) << var2;
         field1275 += var0;
      }

      return var1;
   }

   @ObfuscatedName("e")
   static void method1547(byte[] var0) {
      method1548(var0, 0);
      field1279 = 1 << method1533(4);
      field1280 = 1 << method1533(4);
      field1292 = new float[field1280];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field1280:field1279;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var13[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var14[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = class21.method581(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = class20.method563(var11, var10);
         }

         if(var1 != 0) {
            field1296 = var6;
            field1297 = var13;
            field1273 = var14;
            field1300 = var15;
         } else {
            field1293 = var6;
            field1294 = var13;
            field1295 = var14;
            field1299 = var15;
         }
      }

      var1 = method1533(8) + 1;
      field1274 = new class73[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field1274[var2] = new class73();
      }

      var2 = method1533(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method1533(16);
      }

      var2 = method1533(6) + 1;
      field1283 = new class67[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field1283[var3] = new class67();
      }

      var3 = method1533(6) + 1;
      field1290 = new class60[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field1290[var4] = new class60();
      }

      var4 = method1533(6) + 1;
      field1284 = new class68[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field1284[var5] = new class68();
      }

      var5 = method1533(6) + 1;
      field1285 = new boolean[var5];
      field1286 = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         field1285[var12] = method1527() != 0;
         method1533(16);
         method1533(16);
         field1286[var12] = method1533(8);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "0"
   )
   static void method1548(byte[] var0, int var1) {
      field1282 = var0;
      field1277 = var1;
      field1275 = 0;
   }

   @ObfuscatedName("c")
   static boolean method1551(class167 var0) {
      if(!field1287) {
         byte[] var1 = var0.method3217(0, 0);
         if(var1 == null) {
            return false;
         }

         method1547(var1);
         field1287 = true;
      }

      return true;
   }
}
