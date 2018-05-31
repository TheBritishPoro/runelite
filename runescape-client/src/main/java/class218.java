import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class218 extends TaskDataNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   HashTable field2481;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 457776721
   )
   int field2466;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1323407617
   )
   int field2474;
   @ObfuscatedName("u")
   int[] field2468;
   @ObfuscatedName("q")
   int[] field2469;
   @ObfuscatedName("k")
   int[] field2473;
   @ObfuscatedName("i")
   int[] field2484;
   @ObfuscatedName("x")
   int[] field2472;
   @ObfuscatedName("e")
   int[] field2467;
   @ObfuscatedName("p")
   int[] field2465;
   @ObfuscatedName("b")
   int[] field2475;
   @ObfuscatedName("n")
   int[] field2476;
   @ObfuscatedName("y")
   int[] field2478;
   @ObfuscatedName("a")
   int[] field2479;
   @ObfuscatedName("j")
   int[] field2480;
   @ObfuscatedName("d")
   int[] field2471;
   @ObfuscatedName("h")
   int[] field2482;
   @ObfuscatedName("c")
   int[] field2483;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "[[Lhn;"
   )
   class219[][] field2470;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "[[Lhn;"
   )
   class219[][] field2485;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class220 field2486;
   @ObfuscatedName("ab")
   boolean field2487;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 803571383
   )
   int field2488;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1528762725
   )
   int field2489;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = 6073614026251895677L
   )
   long field2490;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 3476685645422985587L
   )
   long field2491;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Lhz;"
   )
   class222 field2492;

   public class218() {
      this.field2466 = 256;
      this.field2474 = 1000000;
      this.field2468 = new int[16];
      this.field2469 = new int[16];
      this.field2473 = new int[16];
      this.field2484 = new int[16];
      this.field2472 = new int[16];
      this.field2467 = new int[16];
      this.field2465 = new int[16];
      this.field2475 = new int[16];
      this.field2476 = new int[16];
      this.field2478 = new int[16];
      this.field2479 = new int[16];
      this.field2480 = new int[16];
      this.field2471 = new int[16];
      this.field2482 = new int[16];
      this.field2483 = new int[16];
      this.field2470 = new class219[16][128];
      this.field2485 = new class219[16][128];
      this.field2486 = new class220();
      this.field2492 = new class222(this);
      this.field2481 = new HashTable(128);
      this.method4216();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1769486649"
   )
   public synchronized void method4236(int var1) {
      this.field2466 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "392205958"
   )
   public int method4288() {
      return this.field2466;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhq;Lir;Lcn;II)Z",
      garbageValue = "1013201658"
   )
   synchronized boolean method4198(Track1 var1, IndexDataBase var2, class98 var3, int var4) {
      var1.method4412();
      boolean var5 = true;
      int[] var6 = null;
      if(var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.field2547.first(); var7 != null; var7 = (ByteArrayNode)var1.field2547.next()) {
         int var8 = (int)var7.hash;
         class221 var9 = (class221)this.field2481.get((long)var8);
         if(var9 == null) {
            byte[] var11 = var2.takeRecordFlat(var8);
            class221 var10;
            if(var11 == null) {
               var10 = null;
            } else {
               var10 = new class221(var11);
            }

            var9 = var10;
            if(var10 == null) {
               var5 = false;
               continue;
            }

            this.field2481.put(var10, (long)var8);
         }

         if(!var9.method4372(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if(var5) {
         var1.method4413();
      }

      return var5;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2111468279"
   )
   synchronized void method4199() {
      for(class221 var1 = (class221)this.field2481.first(); var1 != null; var1 = (class221)this.field2481.next()) {
         var1.method4373();
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1788128150"
   )
   public synchronized void method4200() {
      for(class221 var1 = (class221)this.field2481.first(); var1 != null; var1 = (class221)this.field2481.next()) {
         var1.unlink();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected synchronized TaskDataNode vmethod4382() {
      return this.field2492;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected synchronized TaskDataNode vmethod4389() {
      return null;
   }

   @ObfuscatedName("x")
   protected synchronized int vmethod4395() {
      return 0;
   }

   @ObfuscatedName("e")
   protected synchronized void vmethod4385(int[] var1, int var2, int var3) {
      if(this.field2486.method4345()) {
         int var4 = this.field2486.field2519 * this.field2474 / AbstractSoundSystem.sampleRate;

         do {
            long var5 = this.field2490 + (long)var3 * (long)var4;
            if(this.field2491 - var5 >= 0L) {
               this.field2490 = var5;
               break;
            }

            int var7 = (int)((this.field2491 - this.field2490 + (long)var4 - 1L) / (long)var4);
            this.field2490 += (long)var4 * (long)var7;
            this.field2492.vmethod4385(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method4277();
         } while(this.field2486.method4345());
      }

      this.field2492.vmethod4385(var1, var2, var3);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lhq;ZI)V",
      garbageValue = "1233433858"
   )
   synchronized void method4267(Track1 var1, boolean var2) {
      this.method4202();
      this.field2486.method4328(var1.field2546);
      this.field2487 = var2;
      this.field2490 = 0L;
      int var3 = this.field2486.method4331();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2486.method4350(var4);
         this.field2486.method4335(var4);
         this.field2486.method4333(var4);
      }

      this.field2488 = this.field2486.method4339();
      this.field2489 = this.field2486.field2525[this.field2488];
      this.field2491 = this.field2486.method4338(this.field2489);
   }

   @ObfuscatedName("b")
   protected synchronized void vmethod4386(int var1) {
      if(this.field2486.method4345()) {
         int var2 = this.field2486.field2519 * this.field2474 / AbstractSoundSystem.sampleRate;

         do {
            long var3 = (long)var1 * (long)var2 + this.field2490;
            if(this.field2491 - var3 >= 0L) {
               this.field2490 = var3;
               break;
            }

            int var5 = (int)((this.field2491 - this.field2490 + (long)var2 - 1L) / (long)var2);
            this.field2490 += (long)var5 * (long)var2;
            this.field2492.vmethod4386(var5);
            var1 -= var5;
            this.method4277();
         } while(this.field2486.method4345());
      }

      this.field2492.vmethod4386(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "27"
   )
   public synchronized void method4202() {
      this.field2486.method4329();
      this.method4216();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1343580600"
   )
   public synchronized boolean method4203() {
      return this.field2486.method4345();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2070435347"
   )
   public synchronized void method4257(int var1, int var2) {
      this.method4205(var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "-9665"
   )
   void method4205(int var1, int var2) {
      this.field2484[var1] = var2;
      this.field2467[var1] = var2 & -128;
      this.method4206(var1, var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "75"
   )
   void method4206(int var1, int var2) {
      if(var2 != this.field2472[var1]) {
         this.field2472[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field2485[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "254280843"
   )
   void method4305(int var1, int var2, int var3) {
      this.method4209(var1, var2, 64);
      if((this.field2478[var1] & 2) != 0) {
         for(class219 var4 = (class219)this.field2492.field2543.getTail(); var4 != null; var4 = (class219)this.field2492.field2543.getPrevious()) {
            if(var4.field2500 == var1 && var4.field2508 < 0) {
               this.field2470[var1][var4.field2502] = null;
               this.field2470[var1][var2] = var4;
               int var5 = (var4.field2504 * var4.field2503 >> 12) + var4.field2516;
               var4.field2516 += var2 - var4.field2502 << 8;
               var4.field2503 = var5 - var4.field2516;
               var4.field2504 = 4096;
               var4.field2502 = var2;
               return;
            }
         }
      }

      class221 var9 = (class221)this.field2481.get((long)this.field2472[var1]);
      if(var9 != null) {
         RawAudioNode var8 = var9.field2533[var2];
         if(var8 != null) {
            class219 var6 = new class219();
            var6.field2500 = var1;
            var6.field2517 = var9;
            var6.field2496 = var8;
            var6.field2511 = var9.field2537[var2];
            var6.field2498 = var9.field2538[var2];
            var6.field2502 = var2;
            var6.field2507 = var3 * var3 * var9.field2532[var2] * var9.field2540 + 1024 >> 11;
            var6.field2501 = var9.field2536[var2] & 255;
            var6.field2516 = (var2 << 8) - (var9.field2534[var2] & 32767);
            var6.field2505 = 0;
            var6.field2506 = 0;
            var6.field2497 = 0;
            var6.field2508 = -1;
            var6.field2495 = 0;
            if(this.field2471[var1] == 0) {
               var6.field2512 = class103.method2256(var8, this.method4249(var6), this.method4222(var6), this.method4286(var6));
            } else {
               var6.field2512 = class103.method2256(var8, this.method4249(var6), 0, this.method4286(var6));
               this.method4208(var6, var9.field2534[var2] < 0);
            }

            if(var9.field2534[var2] < 0) {
               var6.field2512.method2258(-1);
            }

            if(var6.field2498 >= 0) {
               class219 var7 = this.field2485[var1][var6.field2498];
               if(var7 != null && var7.field2508 < 0) {
                  this.field2470[var1][var7.field2502] = null;
                  var7.field2508 = 0;
               }

               this.field2485[var1][var6.field2498] = var6;
            }

            this.field2492.field2543.addFront(var6);
            this.field2470[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lhn;ZI)V",
      garbageValue = "1940134269"
   )
   void method4208(class219 var1, boolean var2) {
      int var3 = var1.field2496.audioBuffer.length;
      int var4;
      if(var2 && var1.field2496.field1281) {
         int var5 = var3 + var3 - var1.field2496.startPosition;
         var4 = (int)((long)var5 * (long)this.field2471[var1.field2500] >> 6);
         var3 <<= 8;
         if(var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field2512.method2307();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.field2471[var1.field2500] >> 6);
      }

      var1.field2512.method2264(var4);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1229887011"
   )
   void method4209(int var1, int var2, int var3) {
      class219 var4 = this.field2470[var1][var2];
      if(var4 != null) {
         this.field2470[var1][var2] = null;
         if((this.field2478[var1] & 2) != 0) {
            for(class219 var5 = (class219)this.field2492.field2543.getFront(); var5 != null; var5 = (class219)this.field2492.field2543.getNext()) {
               if(var5.field2500 == var4.field2500 && var5.field2508 < 0 && var4 != var5) {
                  var4.field2508 = 0;
                  break;
               }
            }
         } else {
            var4.field2508 = 0;
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-962421621"
   )
   void method4210(int var1, int var2, int var3) {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1379201347"
   )
   void method4211(int var1, int var2) {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "-29508"
   )
   void method4212(int var1, int var2) {
      this.field2465[var1] = var2;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "70"
   )
   void method4213(int var1) {
      for(class219 var2 = (class219)this.field2492.field2543.getFront(); var2 != null; var2 = (class219)this.field2492.field2543.getNext()) {
         if(var1 < 0 || var2.field2500 == var1) {
            if(var2.field2512 != null) {
               var2.field2512.method2269(AbstractSoundSystem.sampleRate / 100);
               if(var2.field2512.method2273()) {
                  this.field2492.field2544.method2032(var2.field2512);
               }

               var2.method4322();
            }

            if(var2.field2508 < 0) {
               this.field2470[var2.field2500][var2.field2502] = null;
            }

            var2.unlink();
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1809929257"
   )
   void method4241(int var1) {
      if(var1 >= 0) {
         this.field2468[var1] = 12800;
         this.field2469[var1] = 8192;
         this.field2473[var1] = 16383;
         this.field2465[var1] = 8192;
         this.field2475[var1] = 0;
         this.field2476[var1] = 8192;
         this.method4278(var1);
         this.method4218(var1);
         this.field2478[var1] = 0;
         this.field2479[var1] = 32767;
         this.field2480[var1] = 256;
         this.field2471[var1] = 0;
         this.method4309(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method4241(var1);
         }

      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2037469354"
   )
   void method4215(int var1) {
      for(class219 var2 = (class219)this.field2492.field2543.getFront(); var2 != null; var2 = (class219)this.field2492.field2543.getNext()) {
         if((var1 < 0 || var2.field2500 == var1) && var2.field2508 < 0) {
            this.field2470[var2.field2500][var2.field2502] = null;
            var2.field2508 = 0;
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2143238650"
   )
   void method4216() {
      this.method4213(-1);
      this.method4241(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field2472[var1] = this.field2484[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field2467[var1] = this.field2484[var1] & -128;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-84179680"
   )
   void method4278(int var1) {
      if((this.field2478[var1] & 2) != 0) {
         for(class219 var2 = (class219)this.field2492.field2543.getFront(); var2 != null; var2 = (class219)this.field2492.field2543.getNext()) {
            if(var2.field2500 == var1 && this.field2470[var1][var2.field2502] == null && var2.field2508 < 0) {
               var2.field2508 = 0;
            }
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-16188"
   )
   void method4218(int var1) {
      if((this.field2478[var1] & 4) != 0) {
         for(class219 var2 = (class219)this.field2492.field2543.getFront(); var2 != null; var2 = (class219)this.field2492.field2543.getNext()) {
            if(var2.field2500 == var1) {
               var2.field2514 = 0;
            }
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1648204035"
   )
   void method4219(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if(var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method4209(var3, var4, var5);
      } else if(var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var5 > 0) {
            this.method4305(var3, var4, var5);
         } else {
            this.method4209(var3, var4, 64);
         }

      } else if(var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method4210(var3, var4, var5);
      } else if(var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var4 == 0) {
            this.field2467[var3] = (var5 << 14) + (this.field2467[var3] & -2080769);
         }

         if(var4 == 32) {
            this.field2467[var3] = (var5 << 7) + (this.field2467[var3] & -16257);
         }

         if(var4 == 1) {
            this.field2475[var3] = (var5 << 7) + (this.field2475[var3] & -16257);
         }

         if(var4 == 33) {
            this.field2475[var3] = var5 + (this.field2475[var3] & -128);
         }

         if(var4 == 5) {
            this.field2476[var3] = (var5 << 7) + (this.field2476[var3] & -16257);
         }

         if(var4 == 37) {
            this.field2476[var3] = var5 + (this.field2476[var3] & -128);
         }

         if(var4 == 7) {
            this.field2468[var3] = (var5 << 7) + (this.field2468[var3] & -16257);
         }

         if(var4 == 39) {
            this.field2468[var3] = var5 + (this.field2468[var3] & -128);
         }

         if(var4 == 10) {
            this.field2469[var3] = (var5 << 7) + (this.field2469[var3] & -16257);
         }

         if(var4 == 42) {
            this.field2469[var3] = var5 + (this.field2469[var3] & -128);
         }

         if(var4 == 11) {
            this.field2473[var3] = (var5 << 7) + (this.field2473[var3] & -16257);
         }

         if(var4 == 43) {
            this.field2473[var3] = var5 + (this.field2473[var3] & -128);
         }

         if(var4 == 64) {
            if(var5 >= 64) {
               this.field2478[var3] |= 1;
            } else {
               this.field2478[var3] &= -2;
            }
         }

         if(var4 == 65) {
            if(var5 >= 64) {
               this.field2478[var3] |= 2;
            } else {
               this.method4278(var3);
               this.field2478[var3] &= -3;
            }
         }

         if(var4 == 99) {
            this.field2479[var3] = (var5 << 7) + (this.field2479[var3] & 127);
         }

         if(var4 == 98) {
            this.field2479[var3] = (this.field2479[var3] & 16256) + var5;
         }

         if(var4 == 101) {
            this.field2479[var3] = (var5 << 7) + (this.field2479[var3] & 127) + 16384;
         }

         if(var4 == 100) {
            this.field2479[var3] = (this.field2479[var3] & 16256) + var5 + 16384;
         }

         if(var4 == 120) {
            this.method4213(var3);
         }

         if(var4 == 121) {
            this.method4241(var3);
         }

         if(var4 == 123) {
            this.method4215(var3);
         }

         int var6;
         if(var4 == 6) {
            var6 = this.field2479[var3];
            if(var6 == 16384) {
               this.field2480[var3] = (var5 << 7) + (this.field2480[var3] & -16257);
            }
         }

         if(var4 == 38) {
            var6 = this.field2479[var3];
            if(var6 == 16384) {
               this.field2480[var3] = var5 + (this.field2480[var3] & -128);
            }
         }

         if(var4 == 16) {
            this.field2471[var3] = (var5 << 7) + (this.field2471[var3] & -16257);
         }

         if(var4 == 48) {
            this.field2471[var3] = var5 + (this.field2471[var3] & -128);
         }

         if(var4 == 81) {
            if(var5 >= 64) {
               this.field2478[var3] |= 4;
            } else {
               this.method4218(var3);
               this.field2478[var3] &= -5;
            }
         }

         if(var4 == 17) {
            this.method4309(var3, (var5 << 7) + (this.field2482[var3] & -16257));
         }

         if(var4 == 49) {
            this.method4309(var3, var5 + (this.field2482[var3] & -128));
         }

      } else if(var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method4206(var3, var4 + this.field2467[var3]);
      } else if(var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method4211(var3, var4);
      } else if(var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method4212(var3, var4);
      } else {
         var2 = var1 & 255;
         if(var2 == 255) {
            this.method4216();
         }
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2103498086"
   )
   void method4309(int var1, int var2) {
      this.field2482[var1] = var2;
      this.field2483[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "497644695"
   )
   int method4249(class219 var1) {
      int var2 = (var1.field2503 * var1.field2504 >> 12) + var1.field2516;
      var2 += (this.field2465[var1.field2500] - 8192) * this.field2480[var1.field2500] >> 12;
      class216 var3 = var1.field2511;
      int var4;
      if(var3.field2452 > 0 && (var3.field2453 > 0 || this.field2475[var1.field2500] > 0)) {
         var4 = var3.field2453 << 2;
         int var5 = var3.field2454 << 1;
         if(var1.field2499 < var5) {
            var4 = var4 * var1.field2499 / var5;
         }

         var4 += this.field2475[var1.field2500] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2509 & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(var1.field2496.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)AbstractSoundSystem.sampleRate + 0.5D);
      return var4 < 1?1:var4;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "2064514172"
   )
   int method4222(class219 var1) {
      class216 var2 = var1.field2511;
      int var3 = this.field2473[var1.field2500] * this.field2468[var1.field2500] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field2507 + 16384 >> 15;
      var3 = var3 * this.field2466 + 128 >> 8;
      if(var2.field2448 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2505 * (double)var2.field2448) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if(var2.field2447 != null) {
         var4 = var1.field2506;
         var5 = var2.field2447[var1.field2497 + 1];
         if(var1.field2497 < var2.field2447.length - 2) {
            var6 = (var2.field2447[var1.field2497] & 255) << 8;
            var7 = (var2.field2447[var1.field2497 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field2447[var1.field2497 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if(var1.field2508 > 0 && var2.field2449 != null) {
         var4 = var1.field2508;
         var5 = var2.field2449[var1.field2495 + 1];
         if(var1.field2495 < var2.field2449.length - 2) {
            var6 = (var2.field2449[var1.field2495] & 255) << 8;
            var7 = (var2.field2449[var1.field2495 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field2449[var1.field2495 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "1858181418"
   )
   int method4286(class219 var1) {
      int var2 = this.field2469[var1.field2500];
      return var2 < 8192?var2 * var1.field2501 + 32 >> 6:16384 - ((128 - var1.field2501) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1502621602"
   )
   void method4277() {
      int var1 = this.field2488;
      int var2 = this.field2489;

      long var3;
      for(var3 = this.field2491; var2 == this.field2489; var3 = this.field2486.method4338(var2)) {
         while(var2 == this.field2486.field2525[var1]) {
            this.field2486.method4350(var1);
            int var5 = this.field2486.method4336(var1);
            if(var5 == 1) {
               this.field2486.method4334();
               this.field2486.method4333(var1);
               if(this.field2486.method4340()) {
                  if(!this.field2487 || var2 == 0) {
                     this.method4216();
                     this.field2486.method4329();
                     return;
                  }

                  this.field2486.method4341(var3);
               }
               break;
            }

            if((var5 & 128) != 0) {
               this.method4219(var5);
            }

            this.field2486.method4335(var1);
            this.field2486.method4333(var1);
         }

         var1 = this.field2486.method4339();
         var2 = this.field2486.field2525[var1];
      }

      this.field2488 = var1;
      this.field2489 = var2;
      this.field2491 = var3;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(Lhn;I)Z",
      garbageValue = "724893779"
   )
   boolean method4230(class219 var1) {
      if(var1.field2512 == null) {
         if(var1.field2508 >= 0) {
            var1.unlink();
            if(var1.field2498 > 0 && var1 == this.field2485[var1.field2500][var1.field2498]) {
               this.field2485[var1.field2500][var1.field2498] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lhn;[IIII)Z",
      garbageValue = "-549826874"
   )
   boolean method4231(class219 var1, int[] var2, int var3, int var4) {
      var1.field2513 = AbstractSoundSystem.sampleRate / 100;
      if(var1.field2508 < 0 || var1.field2512 != null && !var1.field2512.method2272()) {
         int var5 = var1.field2504;
         if(var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2476[var1.field2500]) + 0.5D);
            if(var5 < 0) {
               var5 = 0;
            }

            var1.field2504 = var5;
         }

         var1.field2512.method2270(this.method4249(var1));
         class216 var6 = var1.field2511;
         boolean var7 = false;
         ++var1.field2499;
         var1.field2509 += var6.field2452;
         double var8 = (double)((var1.field2502 - 60 << 8) + (var1.field2503 * var1.field2504 >> 12)) * 5.086263020833333E-6D;
         if(var6.field2448 > 0) {
            if(var6.field2451 > 0) {
               var1.field2505 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2451) + 0.5D);
            } else {
               var1.field2505 += 128;
            }
         }

         if(var6.field2447 != null) {
            if(var6.field2450 > 0) {
               var1.field2506 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2450 * var8) + 0.5D);
            } else {
               var1.field2506 += 128;
            }

            while(var1.field2497 < var6.field2447.length - 2 && var1.field2506 > (var6.field2447[var1.field2497 + 2] & 255) << 8) {
               var1.field2497 += 2;
            }

            if(var6.field2447.length - 2 == var1.field2497 && var6.field2447[var1.field2497 + 1] == 0) {
               var7 = true;
            }
         }

         if(var1.field2508 >= 0 && var6.field2449 != null && (this.field2478[var1.field2500] & 1) == 0 && (var1.field2498 < 0 || var1 != this.field2485[var1.field2500][var1.field2498])) {
            if(var6.field2446 > 0) {
               var1.field2508 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2446 * var8) + 0.5D);
            } else {
               var1.field2508 += 128;
            }

            while(var1.field2495 < var6.field2449.length - 2 && var1.field2508 > (var6.field2449[var1.field2495 + 2] & 255) << 8) {
               var1.field2495 += 2;
            }

            if(var6.field2449.length - 2 == var1.field2495) {
               var7 = true;
            }
         }

         if(var7) {
            var1.field2512.method2269(var1.field2513);
            if(var2 != null) {
               var1.field2512.vmethod4385(var2, var3, var4);
            } else {
               var1.field2512.vmethod4386(var4);
            }

            if(var1.field2512.method2273()) {
               this.field2492.field2544.method2032(var1.field2512);
            }

            var1.method4322();
            if(var1.field2508 >= 0) {
               var1.unlink();
               if(var1.field2498 > 0 && var1 == this.field2485[var1.field2500][var1.field2498]) {
                  this.field2485[var1.field2500][var1.field2498] = null;
               }
            }

            return true;
         } else {
            var1.field2512.method2268(var1.field2513, this.method4222(var1), this.method4286(var1));
            return false;
         }
      } else {
         var1.method4322();
         var1.unlink();
         if(var1.field2498 > 0 && var1 == this.field2485[var1.field2500][var1.field2498]) {
            this.field2485[var1.field2500][var1.field2498] = null;
         }

         return true;
      }
   }
}
