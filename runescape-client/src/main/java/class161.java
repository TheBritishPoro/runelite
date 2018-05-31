import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public final class class161 extends class157 implements Runnable {
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("crossSprites")
   static SpritePixels[] crossSprites;
   @ObfuscatedName("z")
   InputStream field1988;
   @ObfuscatedName("w")
   OutputStream field1986;
   @ObfuscatedName("s")
   Socket field1985;
   @ObfuscatedName("l")
   boolean field1990;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lev;"
   )
   Signlink field1989;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   Task field1987;
   @ObfuscatedName("k")
   byte[] field1994;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -540627
   )
   int field1992;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1830674929
   )
   int field1993;
   @ObfuscatedName("e")
   boolean field1998;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -841887779
   )
   final int field1995;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1684221721
   )
   final int field1996;

   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;Lev;I)V"
   )
   public class161(Socket var1, Signlink var2, int var3) throws IOException {
      this.field1990 = false;
      this.field1992 = 0;
      this.field1993 = 0;
      this.field1998 = false;
      this.field1989 = var2;
      this.field1985 = var1;
      this.field1995 = var3;
      this.field1996 = var3 - 100;
      this.field1985.setSoTimeout(30000);
      this.field1985.setTcpNoDelay(true);
      this.field1985.setReceiveBufferSize(65536);
      this.field1985.setSendBufferSize(65536);
      this.field1988 = this.field1985.getInputStream();
      this.field1986 = this.field1985.getOutputStream();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   public boolean vmethod3350(int var1) throws IOException {
      return this.field1990?false:this.field1988.available() >= var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
   )
   public int vmethod3349() throws IOException {
      return this.field1990?0:this.field1988.available();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
   )
   public int vmethod3353() throws IOException {
      return this.field1990?0:this.field1988.read();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
   )
   public int vmethod3351(byte[] var1, int var2, int var3) throws IOException {
      if(this.field1990) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field1988.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
   )
   public void vmethod3347(byte[] var1, int var2, int var3) throws IOException {
      this.method3352(var1, var2, var3);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
   )
   public void vmethod3346() {
      if(!this.field1990) {
         synchronized(this) {
            this.field1990 = true;
            this.notifyAll();
         }

         if(this.field1987 != null) {
            while(this.field1987.status == 0) {
               Actor.method1539(1L);
            }

            if(this.field1987.status == 1) {
               try {
                  ((Thread)this.field1987.value).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field1987 = null;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-436228985"
   )
   void method3352(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field1990) {
         if(this.field1998) {
            this.field1998 = false;
            throw new IOException();
         } else {
            if(this.field1994 == null) {
               this.field1994 = new byte[this.field1995];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field1994[this.field1993] = var1[var5 + var2];
                  this.field1993 = (this.field1993 + 1) % this.field1995;
                  if((this.field1996 + this.field1992) % this.field1995 == this.field1993) {
                     throw new IOException();
                  }
               }

               if(this.field1987 == null) {
                  this.field1987 = this.field1989.createRunnable(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field1993 == this.field1992) {
                     if(this.field1990) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field1992;
                  if(this.field1993 >= this.field1992) {
                     var1 = this.field1993 - this.field1992;
                  } else {
                     var1 = this.field1995 - this.field1992;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field1986.write(this.field1994, var2, var1);
               } catch (IOException var9) {
                  this.field1998 = true;
               }

               this.field1992 = (var1 + this.field1992) % this.field1995;

               try {
                  if(this.field1993 == this.field1992) {
                     this.field1986.flush();
                  }
               } catch (IOException var8) {
                  this.field1998 = true;
               }
               continue;
            }

            try {
               if(this.field1988 != null) {
                  this.field1988.close();
               }

               if(this.field1986 != null) {
                  this.field1986.close();
               }

               if(this.field1985 != null) {
                  this.field1985.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field1994 = null;
            break;
         }
      } catch (Exception var12) {
         UnitPriceComparator.processClientError((String)null, var12);
      }

   }

   protected void finalize() {
      this.vmethod3346();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1286925984"
   )
   public static boolean method3362(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
