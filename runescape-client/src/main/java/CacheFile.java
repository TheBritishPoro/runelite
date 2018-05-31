import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("CacheFile")
public class CacheFile {
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = -616699681
   )
   @Export("cameraX")
   static int cameraX;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = -1361811045
   )
   static int field1428;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   @Export("accessFile")
   FileOnDisk accessFile;
   @ObfuscatedName("w")
   @Export("readPayload")
   byte[] readPayload;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -3424543290675881475L
   )
   long field1417;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1746214469
   )
   int field1421;
   @ObfuscatedName("u")
   @Export("writePayload")
   byte[] writePayload;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 3274252712356881353L
   )
   long field1420;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2034614507
   )
   int field1426;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 3254553962279722903L
   )
   @Export("position")
   long position;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 2659913085887693439L
   )
   @Export("length")
   long length;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -1520059601555540455L
   )
   @Export("capacity")
   long capacity;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -4630283547641529923L
   )
   long field1427;

   @ObfuscatedSignature(
      signature = "(Ldv;II)V"
   )
   public CacheFile(FileOnDisk var1, int var2, int var3) throws IOException {
      this.field1417 = -1L;
      this.field1420 = -1L;
      this.field1426 = 0;
      this.accessFile = var1;
      this.capacity = this.length = var1.length();
      this.readPayload = new byte[var2];
      this.writePayload = new byte[var3];
      this.position = 0L;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129971155"
   )
   @Export("close")
   public void close() throws IOException {
      this.flush();
      this.accessFile.close();
   }

   @ObfuscatedName("w")
   @Export("seek")
   public void seek(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.position = var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "711180324"
   )
   @Export("length")
   public long length() {
      return this.capacity;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1031181832"
   )
   @Export("read")
   public void read(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1873838718"
   )
   @Export("read")
   public void read(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-1L != this.field1420 && this.position >= this.field1420 && this.position + (long)var3 <= (long)this.field1426 + this.field1420) {
            System.arraycopy(this.writePayload, (int)(this.position - this.field1420), var1, var2, var3);
            this.position += (long)var3;
            return;
         }

         long var4 = this.position;
         int var7 = var3;
         int var8;
         if(this.position >= this.field1417 && this.position < (long)this.field1421 + this.field1417) {
            var8 = (int)((long)this.field1421 - (this.position - this.field1417));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.readPayload, (int)(this.position - this.field1417), var1, var2, var8);
            this.position += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.readPayload.length) {
            this.accessFile.seek(this.position);

            for(this.field1427 = this.position; var3 > 0; var3 -= var8) {
               var8 = this.accessFile.read(var1, var2, var3);
               if(var8 == -1) {
                  break;
               }

               this.field1427 += (long)var8;
               this.position += (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.load();
            var8 = var3;
            if(var3 > this.field1421) {
               var8 = this.field1421;
            }

            System.arraycopy(this.readPayload, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.position += (long)var8;
         }

         if(-1L != this.field1420) {
            if(this.field1420 > this.position && var3 > 0) {
               var8 = var2 + (int)(this.field1420 - this.position);
               if(var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.position;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if(this.field1420 >= var4 && this.field1420 < var4 + (long)var7) {
               var13 = this.field1420;
            } else if(var4 >= this.field1420 && var4 < this.field1420 + (long)this.field1426) {
               var13 = var4;
            }

            if((long)this.field1426 + this.field1420 > var4 && this.field1420 + (long)this.field1426 <= var4 + (long)var7) {
               var10 = this.field1420 + (long)this.field1426;
            } else if((long)var7 + var4 > this.field1420 && var4 + (long)var7 <= (long)this.field1426 + this.field1420) {
               var10 = (long)var7 + var4;
            }

            if(var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.writePayload, (int)(var13 - this.field1420), var1, (int)(var13 - var4) + var2, var12);
               if(var10 > this.position) {
                  var3 = (int)((long)var3 - (var10 - this.position));
                  this.position = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field1427 = -1L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1728368269"
   )
   @Export("load")
   void load() throws IOException {
      this.field1421 = 0;
      if(this.field1427 != this.position) {
         this.accessFile.seek(this.position);
         this.field1427 = this.position;
      }

      int var1;
      for(this.field1417 = this.position; this.field1421 < this.readPayload.length; this.field1421 += var1) {
         var1 = this.accessFile.read(this.readPayload, this.field1421, this.readPayload.length - this.field1421);
         if(var1 == -1) {
            break;
         }

         this.field1427 += (long)var1;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1219631347"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + this.position > this.capacity) {
            this.capacity = (long)var3 + this.position;
         }

         if(-1L != this.field1420 && (this.position < this.field1420 || this.position > this.field1420 + (long)this.field1426)) {
            this.flush();
         }

         if(-1L != this.field1420 && this.position + (long)var3 > (long)this.writePayload.length + this.field1420) {
            int var4 = (int)((long)this.writePayload.length - (this.position - this.field1420));
            System.arraycopy(var1, var2, this.writePayload, (int)(this.position - this.field1420), var4);
            this.position += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field1426 = this.writePayload.length;
            this.flush();
         }

         if(var3 <= this.writePayload.length) {
            if(var3 > 0) {
               if(this.field1420 == -1L) {
                  this.field1420 = this.position;
               }

               System.arraycopy(var1, var2, this.writePayload, (int)(this.position - this.field1420), var3);
               this.position += (long)var3;
               if(this.position - this.field1420 > (long)this.field1426) {
                  this.field1426 = (int)(this.position - this.field1420);
               }

            }
         } else {
            if(this.field1427 != this.position) {
               this.accessFile.seek(this.position);
               this.field1427 = this.position;
            }

            this.accessFile.write(var1, var2, var3);
            this.field1427 += (long)var3;
            if(this.field1427 > this.length) {
               this.length = this.field1427;
            }

            long var9 = -1L;
            long var6 = -1L;
            if(this.position >= this.field1417 && this.position < this.field1417 + (long)this.field1421) {
               var9 = this.position;
            } else if(this.field1417 >= this.position && this.field1417 < this.position + (long)var3) {
               var9 = this.field1417;
            }

            if((long)var3 + this.position > this.field1417 && (long)var3 + this.position <= (long)this.field1421 + this.field1417) {
               var6 = (long)var3 + this.position;
            } else if((long)this.field1421 + this.field1417 > this.position && this.field1417 + (long)this.field1421 <= this.position + (long)var3) {
               var6 = (long)this.field1421 + this.field1417;
            }

            if(var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.position), this.readPayload, (int)(var9 - this.field1417), var8);
            }

            this.position += (long)var3;
         }
      } catch (IOException var12) {
         this.field1427 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-4"
   )
   @Export("flush")
   void flush() throws IOException {
      if(-1L != this.field1420) {
         if(this.field1420 != this.field1427) {
            this.accessFile.seek(this.field1420);
            this.field1427 = this.field1420;
         }

         this.accessFile.write(this.writePayload, 0, this.field1426);
         this.field1427 += (long)(this.field1426 * 1776216003) * 2034614507L;
         if(this.field1427 > this.length) {
            this.length = this.field1427;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field1420 >= this.field1417 && this.field1420 < this.field1417 + (long)this.field1421) {
            var1 = this.field1420;
         } else if(this.field1417 >= this.field1420 && this.field1417 < (long)this.field1426 + this.field1420) {
            var1 = this.field1417;
         }

         if((long)this.field1426 + this.field1420 > this.field1417 && this.field1420 + (long)this.field1426 <= (long)this.field1421 + this.field1417) {
            var3 = (long)this.field1426 + this.field1420;
         } else if((long)this.field1421 + this.field1417 > this.field1420 && (long)this.field1421 + this.field1417 <= (long)this.field1426 + this.field1420) {
            var3 = (long)this.field1421 + this.field1417;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.writePayload, (int)(var1 - this.field1420), this.readPayload, (int)(var1 - this.field1417), var5);
         }

         this.field1420 = -1L;
         this.field1426 = 0;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZIZI)I",
      garbageValue = "623148827"
   )
   static int method2503(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class26.method428(var0, var1, var2, var3);
      if(var6 != 0) {
         return var3?-var6:var6;
      } else if(var4 == -1) {
         return 0;
      } else {
         int var7 = class26.method428(var0, var1, var4, var5);
         return var5?-var7:var7;
      }
   }

   @ObfuscatedName("q")
   public static int method2484(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
