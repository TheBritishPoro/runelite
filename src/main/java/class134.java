import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public final class class134 {
   @ObfuscatedName("s")
   static byte[] field2084 = new byte[520];
   @ObfuscatedName("j")
   class228 field2085 = null;
   @ObfuscatedName("p")
   class228 field2086 = null;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 363612395
   )
   int field2087;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -39289963
   )
   int field2088 = '\ufde8';
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -892295217
   )
   static int field2089;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I[BIZS)Z",
      garbageValue = "-9885"
   )
   boolean method2848(int var1, byte[] var2, int var3, boolean var4) {
      class228 var5 = this.field2085;
      class228 var6 = this.field2085;
      synchronized(this.field2085) {
         try {
            int var7;
            boolean var8;
            boolean var10000;
            if(var4) {
               if(this.field2086.method4126() < (long)(6 * var1 + 6)) {
                  var8 = false;
                  var10000 = var8;
                  return var10000;
               }

               this.field2086.method4141((long)(var1 * 6));
               this.field2086.method4131(field2084, 0, 6);
               var7 = ((field2084[4] & 255) << 8) + ((field2084[3] & 255) << 16) + (field2084[5] & 255);
               if(var7 <= 0 || (long)var7 > this.field2085.method4126() / 520L) {
                  var8 = false;
                  var10000 = var8;
                  return var10000;
               }
            } else {
               var7 = (int)((this.field2085.method4126() + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            field2084[0] = (byte)(var3 >> 16);
            field2084[1] = (byte)(var3 >> 8);
            field2084[2] = (byte)var3;
            field2084[3] = (byte)(var7 >> 16);
            field2084[4] = (byte)(var7 >> 8);
            field2084[5] = (byte)var7;
            this.field2086.method4141((long)(6 * var1));
            this.field2086.method4128(field2084, 0, 6);
            int var9 = 0;
            int var10 = 0;

            while(true) {
               if(var9 < var3) {
                  label129: {
                     int var11 = 0;
                     int var12;
                     if(var4) {
                        this.field2085.method4141((long)(520 * var7));

                        try {
                           this.field2085.method4131(field2084, 0, 8);
                        } catch (EOFException var16) {
                           break label129;
                        }

                        var12 = ((field2084[0] & 255) << 8) + (field2084[1] & 255);
                        int var13 = (field2084[3] & 255) + ((field2084[2] & 255) << 8);
                        var11 = (field2084[6] & 255) + ((field2084[4] & 255) << 16) + ((field2084[5] & 255) << 8);
                        int var14 = field2084[7] & 255;
                        if(var12 != var1 || var13 != var10 || this.field2087 != var14) {
                           var8 = false;
                           var10000 = var8;
                           return var10000;
                        }

                        if(var11 < 0 || (long)var11 > this.field2085.method4126() / 520L) {
                           var8 = false;
                           var10000 = var8;
                           return var10000;
                        }
                     }

                     if(0 == var11) {
                        var4 = false;
                        var11 = (int)((this.field2085.method4126() + 519L) / 520L);
                        if(0 == var11) {
                           ++var11;
                        }

                        if(var11 == var7) {
                           ++var11;
                        }
                     }

                     if(var3 - var9 <= 512) {
                        var11 = 0;
                     }

                     field2084[0] = (byte)(var1 >> 8);
                     field2084[1] = (byte)var1;
                     field2084[2] = (byte)(var10 >> 8);
                     field2084[3] = (byte)var10;
                     field2084[4] = (byte)(var11 >> 16);
                     field2084[5] = (byte)(var11 >> 8);
                     field2084[6] = (byte)var11;
                     field2084[7] = (byte)this.field2087;
                     this.field2085.method4141((long)(520 * var7));
                     this.field2085.method4128(field2084, 0, 8);
                     var12 = var3 - var9;
                     if(var12 > 512) {
                        var12 = 512;
                     }

                     this.field2085.method4128(var2, var9, var12);
                     var9 += var12;
                     var7 = var11;
                     ++var10;
                     continue;
                  }
               }

               var8 = true;
               var10000 = var8;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I[BII)Z",
      garbageValue = "1538089381"
   )
   public boolean method2849(int var1, byte[] var2, int var3) {
      class228 var4 = this.field2085;
      class228 var5 = this.field2085;
      synchronized(this.field2085) {
         if(var3 >= 0 && var3 <= this.field2088) {
            boolean var6 = this.method2848(var1, var2, var3, true);
            if(!var6) {
               var6 = this.method2848(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(ILclass228;Lclass228;I)V",
      garbageValue = "500000"
   )
   public class134(int var1, class228 var2, class228 var3, int var4) {
      this.field2087 = var1;
      this.field2085 = var2;
      this.field2086 = var3;
      this.field2088 = var4;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-1653666518"
   )
   public byte[] method2854(int var1) {
      class228 var2 = this.field2085;
      class228 var3 = this.field2085;
      synchronized(this.field2085) {
         byte[] var10000;
         try {
            Object var4;
            if(this.field2086.method4126() < (long)(var1 * 6 + 6)) {
               var4 = null;
               var10000 = (byte[])((byte[])var4);
               return var10000;
            }

            this.field2086.method4141((long)(6 * var1));
            this.field2086.method4131(field2084, 0, 6);
            int var5 = (field2084[2] & 255) + ((field2084[0] & 255) << 16) + ((field2084[1] & 255) << 8);
            int var6 = ((field2084[4] & 255) << 8) + ((field2084[3] & 255) << 16) + (field2084[5] & 255);
            if(var5 < 0 || var5 > this.field2088) {
               var4 = null;
               var10000 = (byte[])((byte[])var4);
               return var10000;
            }

            if(var6 > 0 && (long)var6 <= this.field2085.method4126() / 520L) {
               byte[] var7 = new byte[var5];
               int var8 = 0;
               int var9 = 0;

               while(var8 < var5) {
                  if(var6 == 0) {
                     var4 = null;
                     var10000 = (byte[])((byte[])var4);
                     return var10000;
                  }

                  this.field2085.method4141((long)(var6 * 520));
                  int var10 = var5 - var8;
                  if(var10 > 512) {
                     var10 = 512;
                  }

                  this.field2085.method4131(field2084, 0, 8 + var10);
                  int var11 = ((field2084[0] & 255) << 8) + (field2084[1] & 255);
                  int var12 = ((field2084[2] & 255) << 8) + (field2084[3] & 255);
                  int var13 = (field2084[6] & 255) + ((field2084[4] & 255) << 16) + ((field2084[5] & 255) << 8);
                  int var14 = field2084[7] & 255;
                  if(var1 == var11 && var9 == var12 && var14 == this.field2087) {
                     if(var13 >= 0 && (long)var13 <= this.field2085.method4126() / 520L) {
                        for(int var15 = 0; var15 < var10; ++var15) {
                           var7[var8++] = field2084[8 + var15];
                        }

                        var6 = var13;
                        ++var9;
                        continue;
                     }

                     var4 = null;
                     var10000 = (byte[])((byte[])var4);
                     return var10000;
                  }

                  var4 = null;
                  var10000 = (byte[])((byte[])var4);
                  return var10000;
               }

               var10000 = var7;
               return var10000;
            }

            var4 = null;
            var10000 = (byte[])((byte[])var4);
         } catch (IOException var17) {
            return null;
         }

         return var10000;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "230"
   )
   public static boolean method2855() {
      long var0 = class12.method162();
      int var2 = (int)(var0 - class171.field2728);
      class171.field2728 = var0;
      if(var2 > 200) {
         var2 = 200;
      }

      class171.field2739 += var2;
      if(class171.field2737 == 0 && class171.field2732 == 0 && class171.field2745 == 0 && 0 == class171.field2730) {
         return true;
      } else if(class171.field2731 == null) {
         return false;
      } else {
         try {
            if(class171.field2739 > 30000) {
               throw new IOException();
            } else {
               class172 var3;
               class119 var4;
               while(class171.field2732 < 20 && class171.field2730 > 0) {
                  var3 = (class172)class171.field2729.method3780();
                  var4 = new class119(4);
                  var4.method2477(1);
                  var4.method2606((int)var3.field3125);
                  class171.field2731.method2964(var4.field2007, 0, 4);
                  class171.field2726.method3778(var3, var3.field3125);
                  --class171.field2730;
                  ++class171.field2732;
               }

               while(class171.field2737 < 20 && class171.field2745 > 0) {
                  var3 = (class172)class171.field2743.method3863();
                  var4 = new class119(4);
                  var4.method2477(0);
                  var4.method2606((int)var3.field3125);
                  class171.field2731.method2964(var4.field2007, 0, 4);
                  var3.method3876();
                  class171.field2736.method3778(var3, var3.field3125);
                  --class171.field2745;
                  ++class171.field2737;
               }

               for(int var5 = 0; var5 < 100; ++var5) {
                  int var6 = class171.field2731.method2962();
                  if(var6 < 0) {
                     throw new IOException();
                  }

                  if(var6 == 0) {
                     break;
                  }

                  class171.field2739 = 0;
                  byte var7 = 0;
                  if(class124.field2045 == null) {
                     var7 = 8;
                  } else if(class171.field2733 == 0) {
                     var7 = 1;
                  }

                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  if(var7 > 0) {
                     var8 = var7 - class171.field2738.field2005;
                     if(var8 > var6) {
                        var8 = var6;
                     }

                     class171.field2731.method2961(class171.field2738.field2007, class171.field2738.field2005, var8);
                     if(0 != class171.field2744) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           class171.field2738.field2007[var9 + class171.field2738.field2005] ^= class171.field2744;
                        }
                     }

                     class171.field2738.field2005 += var8;
                     if(class171.field2738.field2005 < var7) {
                        break;
                     }

                     if(null == class124.field2045) {
                        class171.field2738.field2005 = 0;
                        var9 = class171.field2738.method2492();
                        var10 = class171.field2738.method2584();
                        int var12 = class171.field2738.method2492();
                        var11 = class171.field2738.method2497();
                        long var13 = (long)((var9 << 16) + var10);
                        class172 var15 = (class172)class171.field2726.method3777(var13);
                        class10.field166 = true;
                        if(null == var15) {
                           var15 = (class172)class171.field2736.method3777(var13);
                           class10.field166 = false;
                        }

                        if(var15 == null) {
                           throw new IOException();
                        }

                        int var16 = var12 == 0?5:9;
                        class124.field2045 = var15;
                        class171.field2735 = new class119(class124.field2045.field2750 + var16 + var11);
                        class171.field2735.method2477(var12);
                        class171.field2735.method2480(var11);
                        class171.field2733 = 8;
                        class171.field2738.field2005 = 0;
                     } else if(class171.field2733 == 0) {
                        if(-1 == class171.field2738.field2007[0]) {
                           class171.field2733 = 1;
                           class171.field2738.field2005 = 0;
                        } else {
                           class124.field2045 = null;
                        }
                     }
                  } else {
                     var8 = class171.field2735.field2007.length - class124.field2045.field2750;
                     var9 = 512 - class171.field2733;
                     if(var9 > var8 - class171.field2735.field2005) {
                        var9 = var8 - class171.field2735.field2005;
                     }

                     if(var9 > var6) {
                        var9 = var6;
                     }

                     class171.field2731.method2961(class171.field2735.field2007, class171.field2735.field2005, var9);
                     if(class171.field2744 != 0) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           class171.field2735.field2007[class171.field2735.field2005 + var10] ^= class171.field2744;
                        }
                     }

                     class171.field2735.field2005 += var9;
                     class171.field2733 += var9;
                     if(var8 == class171.field2735.field2005) {
                        if(class124.field2045.field3125 == 16711935L) {
                           class171.field2742 = class171.field2735;

                           for(var10 = 0; var10 < 256; ++var10) {
                              class168 var20 = class171.field2746[var10];
                              if(null != var20) {
                                 class171.field2742.field2005 = 5 + 8 * var10;
                                 var11 = class171.field2742.method2497();
                                 int var21 = class171.field2742.method2497();
                                 var20.method3313(var11, var21);
                              }
                           }
                        } else {
                           class171.field2740.reset();
                           class171.field2740.update(class171.field2735.field2007, 0, var8);
                           var10 = (int)class171.field2740.getValue();
                           if(class124.field2045.field2748 != var10) {
                              try {
                                 class171.field2731.method2960();
                              } catch (Exception var18) {
                                 ;
                              }

                              ++class171.field2727;
                              class171.field2731 = null;
                              class171.field2744 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class171.field2727 = 0;
                           class171.field2741 = 0;
                           class124.field2045.field2752.method3314((int)(class124.field2045.field3125 & 65535L), class171.field2735.field2007, 16711680L == (class124.field2045.field3125 & 16711680L), class10.field166);
                        }

                        class124.field2045.method3898();
                        if(class10.field166) {
                           --class171.field2732;
                        } else {
                           --class171.field2737;
                        }

                        class171.field2733 = 0;
                        class124.field2045 = null;
                        class171.field2735 = null;
                     } else {
                        if(512 != class171.field2733) {
                           break;
                        }

                        class171.field2733 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var19) {
            try {
               class171.field2731.method2960();
            } catch (Exception var17) {
               ;
            }

            ++class171.field2741;
            class171.field2731 = null;
            return false;
         }
      }
   }
}
