import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("GameSocket")
public class GameSocket implements Runnable {
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   @Export("rasterProvider")
   public static BufferProvider rasterProvider;
   @ObfuscatedName("bl")
   @Export("sessionToken")
   static String sessionToken;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1930449729
   )
   @Export("currentPressedKey")
   public static int currentPressedKey;
   @ObfuscatedName("z")
   Thread field2008;
   @ObfuscatedName("w")
   OutputStream field2006;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -837409575
   )
   int field2015;
   @ObfuscatedName("l")
   byte[] field2012;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 769097443
   )
   int field2010;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2146315675
   )
   int field2005;
   @ObfuscatedName("k")
   IOException field2011;
   @ObfuscatedName("i")
   boolean field2009;

   GameSocket(OutputStream var1, int var2) {
      this.field2010 = 0;
      this.field2005 = 0;
      this.field2006 = var1;
      this.field2015 = var2 + 1;
      this.field2012 = new byte[this.field2015];
      this.field2008 = new Thread(this);
      this.field2008.setDaemon(true);
      this.field2008.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1097599728"
   )
   boolean method3390() {
      if(this.field2009) {
         try {
            this.field2006.close();
            if(this.field2011 == null) {
               this.field2011 = new IOException("");
            }
         } catch (IOException var2) {
            if(this.field2011 == null) {
               this.field2011 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1100841407"
   )
   @Export("read")
   void read(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.field2011 != null) {
               throw new IOException(this.field2011.toString());
            } else {
               int var5;
               if(this.field2010 <= this.field2005) {
                  var5 = this.field2015 - this.field2005 + this.field2010 - 1;
               } else {
                  var5 = this.field2010 - this.field2005 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + this.field2005 <= this.field2015) {
                     System.arraycopy(var1, var2, this.field2012, this.field2005, var3);
                  } else {
                     int var6 = this.field2015 - this.field2005;
                     System.arraycopy(var1, var2, this.field2012, this.field2005, var6);
                     System.arraycopy(var1, var6 + var2, this.field2012, 0, var3 - var6);
                  }

                  this.field2005 = (var3 + this.field2005) % this.field2015;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1681840837"
   )
   void method3384() {
      synchronized(this) {
         this.field2009 = true;
         this.notifyAll();
      }

      try {
         this.field2008.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field2011 != null) {
                  return;
               }

               if(this.field2010 <= this.field2005) {
                  var1 = this.field2005 - this.field2010;
               } else {
                  var1 = this.field2015 - this.field2010 + this.field2005;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.field2006.flush();
               } catch (IOException var11) {
                  this.field2011 = var11;
                  return;
               }

               if(this.method3390()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field2010 <= this.field2015) {
               this.field2006.write(this.field2012, this.field2010, var1);
            } else {
               int var7 = this.field2015 - this.field2010;
               this.field2006.write(this.field2012, this.field2010, var7);
               this.field2006.write(this.field2012, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field2011 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2010 = (var1 + this.field2010) % this.field2015;
         }
      } while(!this.method3390());

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-397804509"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      Varbit var2 = (Varbit)Varbit.varbits.get((long)var0);
      Varbit var1;
      if(var2 != null) {
         var1 = var2;
      } else {
         byte[] var7 = Varbit.varbit_ref.getConfigData(14, var0);
         var2 = new Varbit();
         if(var7 != null) {
            var2.decode(new Buffer(var7));
         }

         Varbit.varbits.put(var2, (long)var0);
         var1 = var2;
      }

      int var3 = var1.configId;
      int var4 = var1.leastSignificantBit;
      int var5 = var1.mostSignificantBit;
      int var6 = class225.varpsMasks[var5 - var4];
      return class225.clientVarps[var3] >> var4 & var6;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "([Lhi;Lhi;ZI)V",
      garbageValue = "96383462"
   )
   static void method3388(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0?var1.scrollWidth:var1.width;
      int var4 = var1.scrollHeight != 0?var1.scrollHeight:var1.height;
      class304.method5635(var0, var1.id, var3, var4, var2);
      if(var1.children != null) {
         class304.method5635(var1.children, var1.id, var3, var4, var2);
      }

      WidgetNode var5 = (WidgetNode)Client.componentTable.get((long)var1.id);
      if(var5 != null) {
         Script.method1946(var5.id, var3, var4, var2);
      }

      if(var1.contentType == 1337) {
         ;
      }

   }
}
