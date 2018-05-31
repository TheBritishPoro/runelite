import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class151 implements Runnable {
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = -1606452513
   )
   static int field1933;
   @ObfuscatedName("z")
   Thread field1930;
   @ObfuscatedName("w")
   InputStream field1937;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 254778797
   )
   int field1934;
   @ObfuscatedName("l")
   byte[] field1932;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 60058349
   )
   int field1931;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1081366057
   )
   int field1929;
   @ObfuscatedName("k")
   IOException field1935;

   class151(InputStream var1, int var2) {
      this.field1931 = 0;
      this.field1929 = 0;
      this.field1937 = var1;
      this.field1934 = var2 + 1;
      this.field1932 = new byte[this.field1934];
      this.field1930 = new Thread(this);
      this.field1930.setDaemon(true);
      this.field1930.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1623980181"
   )
   boolean method3219(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < this.field1934) {
         synchronized(this) {
            int var3;
            if(this.field1931 <= this.field1929) {
               var3 = this.field1929 - this.field1931;
            } else {
               var3 = this.field1934 - this.field1931 + this.field1929;
            }

            if(var3 < var1) {
               if(this.field1935 != null) {
                  throw new IOException(this.field1935.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-200801409"
   )
   int method3217() throws IOException {
      synchronized(this) {
         int var2;
         if(this.field1931 <= this.field1929) {
            var2 = this.field1929 - this.field1931;
         } else {
            var2 = this.field1934 - this.field1931 + this.field1929;
         }

         if(var2 <= 0 && this.field1935 != null) {
            throw new IOException(this.field1935.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1567970843"
   )
   int method3218() throws IOException {
      synchronized(this) {
         if(this.field1931 == this.field1929) {
            if(this.field1935 != null) {
               throw new IOException(this.field1935.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field1932[this.field1931] & 255;
            this.field1931 = (this.field1931 + 1) % this.field1934;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "2131824940"
   )
   int method3224(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field1931 <= this.field1929) {
               var5 = this.field1929 - this.field1931;
            } else {
               var5 = this.field1934 - this.field1931 + this.field1929;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(var3 == 0 && this.field1935 != null) {
               throw new IOException(this.field1935.toString());
            } else {
               if(var3 + this.field1931 <= this.field1934) {
                  System.arraycopy(this.field1932, this.field1931, var1, var2, var3);
               } else {
                  int var6 = this.field1934 - this.field1931;
                  System.arraycopy(this.field1932, this.field1931, var1, var2, var6);
                  System.arraycopy(this.field1932, 0, var1, var6 + var2, var3 - var6);
               }

               this.field1931 = (var3 + this.field1931) % this.field1934;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "17"
   )
   void method3215() {
      synchronized(this) {
         if(this.field1935 == null) {
            this.field1935 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field1930.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field1935 != null) {
                  return;
               }

               if(this.field1931 == 0) {
                  var1 = this.field1934 - this.field1929 - 1;
               } else if(this.field1931 <= this.field1929) {
                  var1 = this.field1934 - this.field1929;
               } else {
                  var1 = this.field1931 - this.field1929 - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.field1937.read(this.field1932, this.field1929, var1);
            if(var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field1935 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field1929 = (var7 + this.field1929) % this.field1934;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "512337969"
   )
   static File method3238(String var0) {
      if(!class158.field1979) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class158.field1975.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(class158.field1974, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class158.field1975.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if(var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1833118422"
   )
   static int method3240(int var0, Script var1, boolean var2) {
      if(var0 == 6200) {
         class69.intStackSize -= 2;
         Client.field802 = (short)class69.intStack[class69.intStackSize];
         if(Client.field802 <= 0) {
            Client.field802 = 256;
         }

         Client.field829 = (short)class69.intStack[class69.intStackSize + 1];
         if(Client.field829 <= 0) {
            Client.field829 = 205;
         }

         return 1;
      } else if(var0 == 6201) {
         class69.intStackSize -= 2;
         Client.field848 = (short)class69.intStack[class69.intStackSize];
         if(Client.field848 <= 0) {
            Client.field848 = 256;
         }

         Client.field831 = (short)class69.intStack[class69.intStackSize + 1];
         if(Client.field831 <= 0) {
            Client.field831 = 320;
         }

         return 1;
      } else if(var0 == 6202) {
         class69.intStackSize -= 4;
         Client.field832 = (short)class69.intStack[class69.intStackSize];
         if(Client.field832 <= 0) {
            Client.field832 = 1;
         }

         Client.field833 = (short)class69.intStack[class69.intStackSize + 1];
         if(Client.field833 <= 0) {
            Client.field833 = 32767;
         } else if(Client.field833 < Client.field832) {
            Client.field833 = Client.field832;
         }

         Client.field834 = (short)class69.intStack[class69.intStackSize + 2];
         if(Client.field834 <= 0) {
            Client.field834 = 1;
         }

         Client.field835 = (short)class69.intStack[class69.intStackSize + 3];
         if(Client.field835 <= 0) {
            Client.field835 = 32767;
         } else if(Client.field835 < Client.field834) {
            Client.field835 = Client.field834;
         }

         return 1;
      } else if(var0 == 6203) {
         if(Client.field784 != null) {
            class43.method714(0, 0, Client.field784.width, Client.field784.height, false);
            class69.intStack[++class69.intStackSize - 1] = Client.viewportWidth;
            class69.intStack[++class69.intStackSize - 1] = Client.viewportHeight;
         } else {
            class69.intStack[++class69.intStackSize - 1] = -1;
            class69.intStack[++class69.intStackSize - 1] = -1;
         }

         return 1;
      } else if(var0 == 6204) {
         class69.intStack[++class69.intStackSize - 1] = Client.field848;
         class69.intStack[++class69.intStackSize - 1] = Client.field831;
         return 1;
      } else if(var0 == 6205) {
         class69.intStack[++class69.intStackSize - 1] = Client.field802;
         class69.intStack[++class69.intStackSize - 1] = Client.field829;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Ljava/lang/String;",
      garbageValue = "-2016324060"
   )
   static String method3239(Widget var0) {
      return Signlink.method3252(class24.getWidgetClickMask(var0)) == 0?null:(var0.targetVerb != null && var0.targetVerb.trim().length() != 0?var0.targetVerb:null);
   }
}
