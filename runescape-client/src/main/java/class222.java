import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class222 extends TaskDataNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhg;"
   )
   class218 field2545;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Deque field2543;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lca;"
   )
   class88 field2544;

   @ObfuscatedSignature(
      signature = "(Lhg;)V"
   )
   class222(class218 var1) {
      this.field2543 = new Deque();
      this.field2544 = new class88();
      this.field2545 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lhn;[IIIIB)V",
      garbageValue = "-60"
   )
   void method4387(class219 var1, int[] var2, int var3, int var4, int var5) {
      if((this.field2545.field2478[var1.field2500] & 4) != 0 && var1.field2508 < 0) {
         int var6 = this.field2545.field2483[var1.field2500] / AbstractSoundSystem.sampleRate;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field2514) / var6;
            if(var7 > var4) {
               var1.field2514 += var4 * var6;
               break;
            }

            var1.field2512.vmethod4385(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field2514 += var6 * var7 - 1048576;
            int var8 = AbstractSoundSystem.sampleRate / 100;
            int var9 = 262144 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class103 var10 = var1.field2512;
            if(this.field2545.field2471[var1.field2500] == 0) {
               var1.field2512 = class103.method2256(var1.field2496, var10.method2351(), var10.method2262(), var10.method2263());
            } else {
               var1.field2512 = class103.method2256(var1.field2496, var10.method2351(), 0, var10.method2263());
               this.field2545.method4208(var1, var1.field2517.field2534[var1.field2502] < 0);
               var1.field2512.method2408(var8, var10.method2262());
            }

            if(var1.field2517.field2534[var1.field2502] < 0) {
               var1.field2512.method2258(-1);
            }

            var10.method2269(var8);
            var10.vmethod4385(var2, var3, var5 - var3);
            if(var10.method2273()) {
               this.field2544.method2032(var10);
            }
         }
      }

      var1.field2512.vmethod4385(var2, var3, var4);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhn;II)V",
      garbageValue = "-1604012040"
   )
   void method4388(class219 var1, int var2) {
      if((this.field2545.field2478[var1.field2500] & 4) != 0 && var1.field2508 < 0) {
         int var3 = this.field2545.field2483[var1.field2500] / AbstractSoundSystem.sampleRate;
         int var4 = (var3 + 1048575 - var1.field2514) / var3;
         var1.field2514 = var3 * var2 + var1.field2514 & 1048575;
         if(var4 <= var2) {
            if(this.field2545.field2471[var1.field2500] == 0) {
               var1.field2512 = class103.method2256(var1.field2496, var1.field2512.method2351(), var1.field2512.method2262(), var1.field2512.method2263());
            } else {
               var1.field2512 = class103.method2256(var1.field2496, var1.field2512.method2351(), 0, var1.field2512.method2263());
               this.field2545.method4208(var1, var1.field2517.field2534[var1.field2502] < 0);
            }

            if(var1.field2517.field2534[var1.field2502] < 0) {
               var1.field2512.method2258(-1);
            }

            var2 = var1.field2514 / var3;
         }
      }

      var1.field2512.vmethod4386(var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod4382() {
      class219 var1 = (class219)this.field2543.getFront();
      return (TaskDataNode)(var1 == null?null:(var1.field2512 != null?var1.field2512:this.vmethod4389()));
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod4389() {
      class219 var1;
      do {
         var1 = (class219)this.field2543.getNext();
         if(var1 == null) {
            return null;
         }
      } while(var1.field2512 == null);

      return var1.field2512;
   }

   @ObfuscatedName("x")
   protected int vmethod4395() {
      return 0;
   }

   @ObfuscatedName("e")
   protected void vmethod4385(int[] var1, int var2, int var3) {
      this.field2544.vmethod4385(var1, var2, var3);

      for(class219 var6 = (class219)this.field2543.getFront(); var6 != null; var6 = (class219)this.field2543.getNext()) {
         if(!this.field2545.method4230(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= var6.field2513) {
                  this.method4387(var6, var1, var4, var5, var4 + var5);
                  var6.field2513 -= var5;
                  break;
               }

               this.method4387(var6, var1, var4, var6.field2513, var4 + var5);
               var4 += var6.field2513;
               var5 -= var6.field2513;
            } while(!this.field2545.method4231(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("b")
   protected void vmethod4386(int var1) {
      this.field2544.vmethod4386(var1);

      for(class219 var3 = (class219)this.field2543.getFront(); var3 != null; var3 = (class219)this.field2543.getNext()) {
         if(!this.field2545.method4230(var3)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field2513) {
                  this.method4388(var3, var2);
                  var3.field2513 -= var2;
                  break;
               }

               this.method4388(var3, var3.field2513);
               var2 -= var3.field2513;
            } while(!this.field2545.method4231(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1679554365"
   )
   @Export("sendConInfo")
   public static void sendConInfo(boolean var0) {
      if(class250.NetCache_socket != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.putByte(var0?2:3);
            var1.put24bitInt(0);
            class250.NetCache_socket.vmethod3347(var1.payload, 0, 4);
         } catch (IOException var4) {
            try {
               class250.NetCache_socket.vmethod3346();
            } catch (Exception var3) {
               ;
            }

            ++class250.field3215;
            class250.NetCache_socket = null;
         }

      }
   }
}
