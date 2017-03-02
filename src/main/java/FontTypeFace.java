import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("FontTypeFace")
public abstract class FontTypeFace extends Rasterizer2D {
   @ObfuscatedName("u")
   static int field3098 = 0;
   @ObfuscatedName("l")
   int[] field3099;
   @ObfuscatedName("i")
   int[] field3100;
   @ObfuscatedName("r")
   @Export("modIcons")
   public static ModIcon[] modIcons;
   @ObfuscatedName("z")
   static int field3102 = -1;
   @ObfuscatedName("b")
   byte[][] field3103 = new byte[256][];
   @ObfuscatedName("n")
   public int field3104 = 0;
   @ObfuscatedName("f")
   public int field3105;
   @ObfuscatedName("m")
   static int field3106 = 256;
   @ObfuscatedName("c")
   static Random field3107 = new Random();
   @ObfuscatedName("x")
   byte[] field3108;
   @ObfuscatedName("k")
   int[] field3109;
   @ObfuscatedName("p")
   static int field3110 = -1;
   @ObfuscatedName("s")
   static int field3111 = -1;
   @ObfuscatedName("t")
   int[] field3112;
   @ObfuscatedName("y")
   static int field3113 = 0;
   @ObfuscatedName("w")
   static int field3114 = 0;
   @ObfuscatedName("h")
   int[] field3115;
   @ObfuscatedName("a")
   public int field3116;
   @ObfuscatedName("q")
   static int field3117 = 0;
   @ObfuscatedName("o")
   static int field3118 = -1;
   @ObfuscatedName("v")
   static String[] field3119 = new String[100];

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IIII)V",
      garbageValue = "-1"
   )
   public void method3965(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3994(var4, var5);
         this.method3983(var1, var2 - this.method3969(var1), var3);
      }
   }

   FontTypeFace(byte[] var1) {
      this.method3966(var1);
   }

   @ObfuscatedName("y")
   void method3966(byte[] var1) {
      this.field3099 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field3099.length; ++var2) {
            this.field3099[var2] = var1[var2] & 255;
         }

         this.field3104 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var12 = 0; var12 < 256; ++var12) {
            this.field3099[var12] = var1[var2++] & 255;
         }

         int[] var3 = new int[256];
         int[] var4 = new int[256];

         int var11;
         for(var11 = 0; var11 < 256; ++var11) {
            var3[var11] = var1[var2++] & 255;
         }

         for(var11 = 0; var11 < 256; ++var11) {
            var4[var11] = var1[var2++] & 255;
         }

         byte[][] var5 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var5[var6] = new byte[var3[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var5[var6].length; ++var8) {
               var7 += var1[var2++];
               var5[var6][var8] = var7;
            }
         }

         byte[][] var10 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var10[var13] = new byte[var3[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var10[var13].length; ++var9) {
               var14 += var1[var2++];
               var10[var13][var9] = var14;
            }
         }

         this.field3108 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field3108[(var13 << 8) + var8] = (byte)method4033(var5, var10, var4, this.field3099, var3, var13, var8);
                  }
               }
            }
         }

         this.field3104 = var4[32] + var3[32];
      }

   }

   @ObfuscatedName("aa")
   static void method3967(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("m")
   int method3968(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field3099[Varbit.method3627(var1) & 255];
   }

   @ObfuscatedName("u")
   public int method3969(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              String var9 = var7.substring(4);
                              int var8 = class152.method2838(var9, 10, true);
                              var4 += modIcons[var8].width;
                              var3 = -1;
                           } catch (Exception var12) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.field3099[(char)(Varbit.method3627(var6) & 255)];
                  if(this.field3108 != null && var3 != -1) {
                     var4 += this.field3108[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("q")
   int method3970(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method3968('<');
                     if(this.field3108 != null && var11 != -1) {
                        var4 += this.field3108[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method3968('>');
                     if(this.field3108 != null && var11 != -1) {
                        var4 += this.field3108[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        String var18 = var16.substring(4);
                        int var17 = class152.method2838(var18, 10, true);
                        var4 += modIcons[var17].width;
                        var11 = 0;
                     } catch (Exception var22) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method3968(var15);
                     if(this.field3108 != null && var11 != -1) {
                        var4 += this.field3108[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var21 = var6.toString();
         if(var21.length() > var5) {
            var3[var12++] = var21.substring(var5, var21.length());
         }

         return var12;
      }
   }

   @ObfuscatedName("c")
   public int method3971(String var1, int var2) {
      int var3 = this.method3970(var1, new int[]{var2}, field3119);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method3969(field3119[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("ai")
   static void method3972(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * Rasterizer2D.graphicsPixelsWidth;
      int var8 = Rasterizer2D.graphicsPixelsWidth - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < Rasterizer2D.field3187) {
         var11 = Rasterizer2D.field3187 - var2;
         var4 -= var11;
         var2 = Rasterizer2D.field3187;
         var10 += var11 * var3;
         var7 += var11 * Rasterizer2D.graphicsPixelsWidth;
      }

      if(var2 + var4 > Rasterizer2D.field3182) {
         var4 -= var2 + var4 - Rasterizer2D.field3182;
      }

      if(var1 < Rasterizer2D.field3186) {
         var11 = Rasterizer2D.field3186 - var1;
         var3 -= var11;
         var1 = Rasterizer2D.field3186;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var1 + var3 > Rasterizer2D.field3185) {
         var11 = var1 + var3 - Rasterizer2D.field3185;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method3967(Rasterizer2D.graphicsPixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("e")
   public static String method3973(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var6 = 0; var6 < var1; ++var6) {
         char var4 = var0.charAt(var6);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var3 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var3.append("<lt>");
         } else if(var5 == 62) {
            var3.append("<gt>");
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IIII)V",
      garbageValue = "-1"
   )
   public void method3974(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3994(var4, var5);
         this.method3983(var1, var2, var3);
      }
   }

   @ObfuscatedName("d")
   public void method3975(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3994(var4, var5);
         field3106 = var6;
         this.method3983(var1, var2, var3);
      }
   }

   FontTypeFace(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3109 = var2;
      this.field3115 = var3;
      this.field3100 = var4;
      this.field3112 = var5;
      this.method3966(var1);
      this.field3103 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field3115[var10] < var8 && this.field3112[var10] != 0) {
            var8 = this.field3115[var10];
         }

         if(this.field3115[var10] + this.field3112[var10] > var9) {
            var9 = this.field3115[var10] + this.field3112[var10];
         }
      }

      this.field3105 = this.field3104 - var8;
      this.field3116 = var9 - this.field3104;
   }

   @ObfuscatedName("ac")
   public void method3981(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3994(var4, var5);
         field3107.setSeed((long)var6);
         field3106 = 192 + (field3107.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field3107.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method3986(var1, var2, var3, var7, (int[])null);
      }
   }

   @ObfuscatedName("v")
   public int method3982(String var1, int var2) {
      return this.method3970(var1, new int[]{var2}, field3119);
   }

   @ObfuscatedName("am")
   void method3983(String var1, int var2, int var3) {
      var3 -= this.field3104;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(Varbit.method3627(var1.charAt(var6)) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = Overlay.method3854(var8.substring(4));
                              ModIcon var10 = modIcons[var9];
                              var10.method4191(var2, var3 + this.field3104 - var10.originalHeight);
                              var2 += var10.width;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else {
                           this.method4045(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 160) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.field3108 != null && var5 != -1) {
                     var2 += this.field3108[(var5 << 8) + var7];
                  }

                  int var12 = this.field3100[var7];
                  var9 = this.field3112[var7];
                  if(var7 != 32) {
                     if(field3106 == 256) {
                        if(field3118 != -1) {
                           method3989(this.field3103[var7], var2 + this.field3109[var7] + 1, var3 + this.field3115[var7] + 1, var12, var9, field3118);
                        }

                        this.vmethod3987(this.field3103[var7], var2 + this.field3109[var7], var3 + this.field3115[var7], var12, var9, field3114);
                     } else {
                        if(field3118 != -1) {
                           method3972(this.field3103[var7], var2 + this.field3109[var7] + 1, var3 + this.field3115[var7] + 1, var12, var9, field3118, field3106);
                        }

                        this.vmethod3988(this.field3103[var7], var2 + this.field3109[var7], var3 + this.field3115[var7], var12, var9, field3114, field3106);
                     }
                  } else if(field3098 > 0) {
                     field3117 += field3098;
                     var2 += field3117 >> 8;
                     field3117 &= 255;
                  }

                  int var13 = this.field3099[var7];
                  if(field3102 != -1) {
                     Rasterizer2D.method4091(var2, var3 + (int)((double)this.field3104 * 0.7D), var13, field3102);
                  }

                  if(field3110 != -1) {
                     Rasterizer2D.method4091(var2, var3 + this.field3104 + 1, var13, field3110);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   void method3984(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field3098 = (var2 - this.method3969(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("as")
   void method3986(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3104;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(Varbit.method3627(var1.charAt(var9)) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = Overlay.method3854(var11.substring(4));
                              ModIcon var15 = modIcons[var14];
                              var15.method4191(var2 + var12, var3 + this.field3104 - var15.originalHeight + var13);
                              var2 += var15.width;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method4045(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field3108 != null && var7 != -1) {
                     var2 += this.field3108[(var7 << 8) + var10];
                  }

                  int var17 = this.field3100[var10];
                  var12 = this.field3112[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field3106 == 256) {
                        if(field3118 != -1) {
                           method3989(this.field3103[var10], var2 + this.field3109[var10] + 1 + var13, var3 + this.field3115[var10] + 1 + var14, var17, var12, field3118);
                        }

                        this.vmethod3987(this.field3103[var10], var2 + this.field3109[var10] + var13, var3 + this.field3115[var10] + var14, var17, var12, field3114);
                     } else {
                        if(field3118 != -1) {
                           method3972(this.field3103[var10], var2 + this.field3109[var10] + 1 + var13, var3 + this.field3115[var10] + 1 + var14, var17, var12, field3118, field3106);
                        }

                        this.vmethod3988(this.field3103[var10], var2 + this.field3109[var10] + var13, var3 + this.field3115[var10] + var14, var17, var12, field3114, field3106);
                     }
                  } else if(field3098 > 0) {
                     field3117 += field3098;
                     var2 += field3117 >> 8;
                     field3117 &= 255;
                  }

                  int var18 = this.field3099[var10];
                  if(field3102 != -1) {
                     Rasterizer2D.method4091(var2, var3 + (int)((double)this.field3104 * 0.7D), var18, field3102);
                  }

                  if(field3110 != -1) {
                     Rasterizer2D.method4091(var2, var3 + this.field3104, var18, field3110);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("b")
   abstract void vmethod3987(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("l")
   abstract void vmethod3988(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("ay")
   static void method3989(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D.graphicsPixelsWidth;
      int var7 = Rasterizer2D.graphicsPixelsWidth - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.field3187) {
         var10 = Rasterizer2D.field3187 - var2;
         var4 -= var10;
         var2 = Rasterizer2D.field3187;
         var9 += var10 * var3;
         var6 += var10 * Rasterizer2D.graphicsPixelsWidth;
      }

      if(var2 + var4 > Rasterizer2D.field3182) {
         var4 -= var2 + var4 - Rasterizer2D.field3182;
      }

      if(var1 < Rasterizer2D.field3186) {
         var10 = Rasterizer2D.field3186 - var1;
         var3 -= var10;
         var1 = Rasterizer2D.field3186;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > Rasterizer2D.field3185) {
         var10 = var1 + var3 - Rasterizer2D.field3185;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method4027(Rasterizer2D.graphicsPixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedName("af")
   public void method3990(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3994(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3986(var1, var2 - this.method3969(var1) / 2, var3, var7, var8);
      }
   }

   @ObfuscatedName("an")
   void method3994(int var1, int var2) {
      field3102 = -1;
      field3110 = -1;
      field3111 = var2;
      field3118 = var2;
      field3113 = var1;
      field3114 = var1;
      field3106 = 256;
      field3098 = 0;
      field3117 = 0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IIII)V",
      garbageValue = "-1"
   )
   public void method4006(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3994(var4, var5);
         this.method3983(var1, var2 - this.method3969(var1) / 2, var3);
      }
   }

   @ObfuscatedName("aw")
   public void method4020(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method3994(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method3986(var1, var2 - this.method3969(var1) / 2, var3, (int[])null, var10);
      }
   }

   @ObfuscatedName("at")
   static void method4027(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("w")
   static int method4033(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("ab")
   public void method4040(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3994(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3986(var1, var2 - this.method3969(var1) / 2, var3, (int[])null, var7);
      }
   }

   @ObfuscatedName("aj")
   public int method4042(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method3994(var6, var7);
         if(var10 == 0) {
            var10 = this.field3104;
         }

         int[] var11 = new int[]{var4};
         if(var5 < this.field3105 + this.field3116 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method3970(var1, var11, field3119);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field3105;
         } else if(var9 == 1) {
            var13 = var3 + this.field3105 + (var5 - this.field3105 - this.field3116 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field3116 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field3105 - this.field3116 - (var12 - 1) * var10) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field3105 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method3983(field3119[var14], var2, var13);
            } else if(var8 == 1) {
               this.method3983(field3119[var14], var2 + (var4 - this.method3969(field3119[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method3983(field3119[var14], var2 + var4 - this.method3969(field3119[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method3983(field3119[var14], var2, var13);
            } else {
               this.method3984(field3119[var14], var4);
               this.method3983(field3119[var14], var2, var13);
               field3098 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   @ObfuscatedName("ae")
   void method4045(String var1) {
      try {
         int var2;
         String var3;
         if(var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class152.method2838(var3, 16, true);
            field3114 = var2;
         } else if(var1.equals("/col")) {
            field3114 = field3113;
         } else if(var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class152.method2838(var3, 16, true);
            field3102 = var2;
         } else if(var1.equals("str")) {
            field3102 = 8388608;
         } else if(var1.equals("/str")) {
            field3102 = -1;
         } else if(var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class152.method2838(var3, 16, true);
            field3110 = var2;
         } else if(var1.equals("u")) {
            field3110 = 0;
         } else if(var1.equals("/u")) {
            field3110 = -1;
         } else if(var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class152.method2838(var3, 16, true);
            field3118 = var2;
         } else if(var1.equals("shad")) {
            field3118 = 0;
         } else if(var1.equals("/shad")) {
            field3118 = field3111;
         } else if(var1.equals("br")) {
            this.method3994(field3113, field3111);
         }
      } catch (Exception var5) {
         ;
      }

   }
}
