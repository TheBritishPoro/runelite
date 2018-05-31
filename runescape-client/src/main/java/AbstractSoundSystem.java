import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("AbstractSoundSystem")
public class AbstractSoundSystem {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2011144979
   )
   @Export("sampleRate")
   public static int sampleRate;
   @ObfuscatedName("q")
   @Export("audioHighMemory")
   protected static boolean audioHighMemory;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lcr;"
   )
   @Export("soundTaskDataProvider")
   public static class89 soundTaskDataProvider;
   @ObfuscatedName("f")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   TaskDataNode field1311;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 175968633
   )
   int field1298;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 3596213632832081127L
   )
   long field1305;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1071187089
   )
   @Export("offset")
   int offset;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 515202779
   )
   int field1303;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 2049583437
   )
   int field1306;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -4154193984933604857L
   )
   long field1294;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1453548117
   )
   int field1304;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1903884361
   )
   int field1307;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1788167479
   )
   int field1308;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = 4750042735159967147L
   )
   long field1301;
   @ObfuscatedName("v")
   boolean field1310;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 647567121
   )
   int field1313;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   TaskDataNode[] field1312;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   TaskDataNode[] field1309;

   protected AbstractSoundSystem() {
      this.field1298 = 32;
      this.field1305 = Buffer.method3547();
      this.field1294 = 0L;
      this.field1304 = 0;
      this.field1307 = 0;
      this.field1308 = 0;
      this.field1301 = 0L;
      this.field1310 = true;
      this.field1313 = 0;
      this.field1312 = new TaskDataNode[8];
      this.field1309 = new TaskDataNode[8];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2015063069"
   )
   protected void vmethod2176() throws Exception {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "255"
   )
   protected void create(int var1) throws Exception {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "83"
   )
   @Export("size")
   protected int size() throws Exception {
      return this.offset;
   }

   @ObfuscatedName("l")
   protected void write() throws Exception {
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1323448603"
   )
   protected void close() {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047206903"
   )
   protected void flush() throws Exception {
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "-1537187837"
   )
   public final synchronized void method2143(TaskDataNode var1) {
      this.field1311 = var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "947574541"
   )
   public final synchronized void method2144() {
      if(this.samples != null) {
         long var1 = Buffer.method3547();

         try {
            if(this.field1294 != 0L) {
               if(var1 < this.field1294) {
                  return;
               }

               this.create(this.offset);
               this.field1294 = 0L;
               this.field1310 = true;
            }

            int var3 = this.size();
            if(this.field1308 - var3 > this.field1304) {
               this.field1304 = this.field1308 - var3;
            }

            int var4 = this.field1303 + this.field1306;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.offset) {
               this.offset += 1024;
               if(this.offset > 16384) {
                  this.offset = 16384;
               }

               this.close();
               this.create(this.offset);
               var3 = 0;
               this.field1310 = true;
               if(var4 + 256 > this.offset) {
                  var4 = this.offset - 256;
                  this.field1306 = var4 - this.field1303;
               }
            }

            while(var3 < var4) {
               this.method2149(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if(var1 > this.field1301) {
               if(!this.field1310) {
                  if(this.field1304 == 0 && this.field1307 == 0) {
                     this.close();
                     this.field1294 = var1 + 2000L;
                     return;
                  }

                  this.field1306 = Math.min(this.field1307, this.field1304);
                  this.field1307 = this.field1304;
               } else {
                  this.field1310 = false;
               }

               this.field1304 = 0;
               this.field1301 = var1 + 2000L;
            }

            this.field1308 = var3;
         } catch (Exception var7) {
            this.close();
            this.field1294 = 2000L + var1;
         }

         try {
            if(var1 > 500000L + this.field1305) {
               var1 = this.field1305;
            }

            while(var1 > 5000L + this.field1305) {
               this.method2188(256);
               this.field1305 += (long)(256000 / sampleRate);
            }
         } catch (Exception var6) {
            this.field1305 = var1;
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1969429173"
   )
   public final void method2145() {
      this.field1310 = true;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-58675993"
   )
   @Export("tryFlush")
   public final synchronized void tryFlush() {
      this.field1310 = true;

      try {
         this.flush();
      } catch (Exception var2) {
         this.close();
         this.field1294 = Buffer.method3547() + 2000L;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-917768670"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if(class69.task != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == class69.task.systems[var2]) {
               class69.task.systems[var2] = null;
            }

            if(class69.task.systems[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            UrlRequester.field1855.shutdownNow();
            UrlRequester.field1855 = null;
            class69.task = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "52"
   )
   final void method2188(int var1) {
      this.field1313 -= var1;
      if(this.field1313 < 0) {
         this.field1313 = 0;
      }

      if(this.field1311 != null) {
         this.field1311.vmethod4386(var1);
      }

   }

   @ObfuscatedName("ao")
   final void method2149(int[] var1, int var2) {
      int var3 = var2;
      if(audioHighMemory) {
         var3 = var2 << 1;
      }

      class193.method3895(var1, 0, var3);
      this.field1313 -= var2;
      if(this.field1311 != null && this.field1313 <= 0) {
         this.field1313 += sampleRate >> 4;
         Script.method1956(this.field1311);
         this.method2184(this.field1311, this.field1311.vmethod2435());
         int var4 = 0;
         int var5 = 255;

         int var6;
         TaskDataNode var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  TaskDataNode var11 = this.field1312[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if(var11 == null) {
                           break label98;
                        }

                        AbstractIntegerNode0 var12 = var11.data;
                        if(var12 != null && var12.int1 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1382;
                        } else {
                           var11.field1385 = true;
                           int var13 = var11.vmethod4395();
                           var4 += var13;
                           if(var12 != null) {
                              var12.int1 += var13;
                           }

                           if(var4 >= this.field1298) {
                              break label104;
                           }

                           TaskDataNode var14 = var11.vmethod4382();
                           if(var14 != null) {
                              for(int var15 = var11.field1384; var14 != null; var14 = var11.vmethod4389()) {
                                 this.method2184(var14, var15 * var14.vmethod2435() >> 8);
                              }
                           }

                           TaskDataNode var18 = var11.field1382;
                           var11.field1382 = null;
                           if(var10 == null) {
                              this.field1312[var7] = var18;
                           } else {
                              var10.field1382 = var18;
                           }

                           if(var18 == null) {
                              this.field1309[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            TaskDataNode var16 = this.field1312[var6];
            TaskDataNode[] var17 = this.field1312;
            this.field1309[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1382;
               var16.field1382 = null;
            }
         }
      }

      if(this.field1313 < 0) {
         this.field1313 = 0;
      }

      if(this.field1311 != null) {
         this.field1311.vmethod4385(var1, 0, var2);
      }

      this.field1305 = Buffer.method3547();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldo;II)V",
      garbageValue = "465802976"
   )
   final void method2184(TaskDataNode var1, int var2) {
      int var3 = var2 >> 5;
      TaskDataNode var4 = this.field1309[var3];
      if(var4 == null) {
         this.field1312[var3] = var1;
      } else {
         var4.field1382 = var1;
      }

      this.field1309[var3] = var1;
      var1.field1384 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Len;"
   )
   public static RunException method2195(Throwable var0, String var1) {
      RunException var2;
      if(var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.field1941 = var2.field1941 + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }
}
