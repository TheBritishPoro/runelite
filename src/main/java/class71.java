import java.util.Random;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bj")
public class class71 {
   @ObfuscatedName("t")
   static int[] field1337;
   @ObfuscatedName("u")
   class57 field1338;
   @ObfuscatedName("j")
   static int[] field1339;
   @ObfuscatedName("b")
   class57 field1340;
   @ObfuscatedName("l")
   class57 field1341;
   @ObfuscatedName("v")
   static int[] field1342;
   @ObfuscatedName("n")
   class57 field1343;
   @ObfuscatedName("m")
   class57 field1344;
   @ObfuscatedName("g")
   int[] field1345 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("i")
   static int[] field1346;
   @ObfuscatedName("w")
   static int[] field1347 = new int['耀'];
   @ObfuscatedName("k")
   int field1348 = 0;
   @ObfuscatedName("d")
   class57 field1349;
   @ObfuscatedName("q")
   class63 field1350;
   @ObfuscatedName("o")
   int field1351 = 100;
   @ObfuscatedName("x")
   class57 field1352;
   @ObfuscatedName("e")
   int field1353 = 0;
   @ObfuscatedName("s")
   int[] field1354 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("p")
   class57 field1355;
   @ObfuscatedName("r")
   int[] field1356 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("h")
   int field1357 = 500;
   @ObfuscatedName("c")
   static int[] field1358;
   @ObfuscatedName("a")
   static int[] field1360;
   @ObfuscatedName("z")
   static int[] field1361;
   @ObfuscatedName("f")
   class57 field1362;

   @ObfuscatedName("u")
   final int method1622(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field1342[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?field1347[var1 / 2607 & 32767] * var2:0)));
   }

   @ObfuscatedName("x")
   final void method1623(class119 var1) {
      this.field1362 = new class57();
      this.field1362.method1292(var1);
      this.field1338 = new class57();
      this.field1338.method1292(var1);
      int var2 = var1.method2554();
      if(var2 != 0) {
         --var1.field1998;
         this.field1352 = new class57();
         this.field1352.method1292(var1);
         this.field1340 = new class57();
         this.field1340.method1292(var1);
      }

      var2 = var1.method2554();
      if(var2 != 0) {
         --var1.field1998;
         this.field1341 = new class57();
         this.field1341.method1292(var1);
         this.field1349 = new class57();
         this.field1349.method1292(var1);
      }

      var2 = var1.method2554();
      if(var2 != 0) {
         --var1.field1998;
         this.field1343 = new class57();
         this.field1343.method1292(var1);
         this.field1344 = new class57();
         this.field1344.method1292(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method2567();
         if(var4 == 0) {
            break;
         }

         this.field1345[var3] = var4;
         this.field1354[var3] = var1.method2566();
         this.field1356[var3] = var1.method2567();
      }

      this.field1348 = var1.method2567();
      this.field1351 = var1.method2567();
      this.field1357 = var1.method2556();
      this.field1353 = var1.method2556();
      this.field1350 = new class63();
      this.field1355 = new class57();
      this.field1350.method1350(var1, this.field1355);
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '耀'; ++var1) {
         field1347[var1] = (var0.nextInt() & 2) - 1;
      }

      field1342 = new int['耀'];

      for(var1 = 0; var1 < '耀'; ++var1) {
         field1342[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1337 = new int[220500];
      field1358 = new int[5];
      field1346 = new int[5];
      field1360 = new int[5];
      field1361 = new int[5];
      field1339 = new int[5];
   }

   @ObfuscatedName("f")
   final int[] method1630(int var1, int var2) {
      class120.method2748(field1337, 0, var1);
      if(var2 < 10) {
         return field1337;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1362.method1294();
         this.field1338.method1294();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field1352 != null) {
            this.field1352.method1294();
            this.field1340.method1294();
            var5 = (int)((double)(this.field1352.field1214 - this.field1352.field1213) * 32.768D / var3);
            var6 = (int)((double)this.field1352.field1213 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field1341 != null) {
            this.field1341.method1294();
            this.field1349.method1294();
            var8 = (int)((double)(this.field1341.field1214 - this.field1341.field1213) * 32.768D / var3);
            var9 = (int)((double)this.field1341.field1213 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field1345[var11] != 0) {
               field1358[var11] = 0;
               field1346[var11] = (int)((double)this.field1356[var11] * var3);
               field1360[var11] = (this.field1345[var11] << 14) / 100;
               field1361[var11] = (int)((double)(this.field1362.field1214 - this.field1362.field1213) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1354[var11]) / var3);
               field1339[var11] = (int)((double)this.field1362.field1213 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1362.method1295(var1);
            var13 = this.field1338.method1295(var1);
            if(this.field1352 != null) {
               var14 = this.field1352.method1295(var1);
               var15 = this.field1340.method1295(var1);
               var12 += this.method1622(var7, var15, this.field1352.field1210) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field1341 != null) {
               var14 = this.field1341.method1295(var1);
               var15 = this.field1349.method1295(var1);
               var13 = var13 * ((this.method1622(var10, var15, this.field1341.field1210) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field1345[var14] != 0) {
                  var15 = var11 + field1346[var14];
                  if(var15 < var1) {
                     field1337[var15] += this.method1622(field1358[var14], var13 * field1360[var14] >> 15, this.field1362.field1210);
                     field1358[var14] += (var12 * field1361[var14] >> 16) + field1339[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field1343 != null) {
            this.field1343.method1294();
            this.field1344.method1294();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1343.method1295(var1);
               var16 = this.field1344.method1295(var1);
               if(var20) {
                  var12 = this.field1343.field1213 + ((this.field1343.field1214 - this.field1343.field1213) * var15 >> 8);
               } else {
                  var12 = this.field1343.field1213 + ((this.field1343.field1214 - this.field1343.field1213) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field1337[var14] = 0;
               }
            }
         }

         if(this.field1348 > 0 && this.field1351 > 0) {
            var11 = (int)((double)this.field1348 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1337[var12] += field1337[var12 - var11] * this.field1351 / 100;
            }
         }

         if(this.field1350.field1257[0] > 0 || this.field1350.field1257[1] > 0) {
            this.field1355.method1294();
            var11 = this.field1355.method1295(var1 + 1);
            var12 = this.field1350.method1345(0, (float)var11 / 65536.0F);
            var13 = this.field1350.method1345(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1337[var14 + var12] * (long)class63.field1259 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1337[var14 + var12 - 1 - var17] * (long)class63.field1254[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1337[var14 - 1 - var17] * (long)class63.field1254[1][var17] >> 16);
                  }

                  field1337[var14] = var16;
                  var11 = this.field1355.method1295(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1337[var14 + var12] * (long)class63.field1259 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1337[var14 + var12 - 1 - var18] * (long)class63.field1254[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1337[var14 - 1 - var18] * (long)class63.field1254[1][var18] >> 16);
                     }

                     field1337[var14] = var17;
                     var11 = this.field1355.method1295(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1337[var14 + var12 - 1 - var18] * (long)class63.field1254[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1337[var14 - 1 - var18] * (long)class63.field1254[1][var18] >> 16);
                        }

                        field1337[var14] = var17;
                        this.field1355.method1295(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1350.method1345(0, (float)var11 / 65536.0F);
                  var13 = this.field1350.method1345(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field1337[var11] < -32768) {
               field1337[var11] = -32768;
            }

            if(field1337[var11] > 32767) {
               field1337[var11] = 32767;
            }
         }

         return field1337;
      }
   }
}
