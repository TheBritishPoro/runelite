import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class220 {
   @ObfuscatedName("e")
   static final byte[] field2527;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   Buffer field2530;
   @ObfuscatedName("w")
   int field2519;
   @ObfuscatedName("s")
   int[] field2520;
   @ObfuscatedName("l")
   int[] field2521;
   @ObfuscatedName("u")
   int[] field2525;
   @ObfuscatedName("q")
   int[] field2523;
   @ObfuscatedName("k")
   int field2524;
   @ObfuscatedName("x")
   long field2526;

   static {
      field2527 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

   class220(byte[] var1) {
      this.field2530 = new Buffer((byte[])null);
      this.method4328(var1);
   }

   class220() {
      this.field2530 = new Buffer((byte[])null);
   }

   @ObfuscatedName("z")
   void method4328(byte[] var1) {
      this.field2530.payload = var1;
      this.field2530.offset = 10;
      int var2 = this.field2530.readUnsignedShort();
      this.field2519 = this.field2530.readUnsignedShort();
      this.field2524 = 500000;
      this.field2520 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field2530.offset += var5) {
         int var4 = this.field2530.readInt();
         var5 = this.field2530.readInt();
         if(var4 == 1297379947) {
            this.field2520[var3] = this.field2530.offset;
            ++var3;
         }
      }

      this.field2526 = 0L;
      this.field2521 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2521[var3] = this.field2520[var3];
      }

      this.field2525 = new int[var2];
      this.field2523 = new int[var2];
   }

   @ObfuscatedName("w")
   void method4329() {
      this.field2530.payload = null;
      this.field2520 = null;
      this.field2521 = null;
      this.field2525 = null;
      this.field2523 = null;
   }

   @ObfuscatedName("s")
   boolean method4345() {
      return this.field2530.payload != null;
   }

   @ObfuscatedName("l")
   int method4331() {
      return this.field2521.length;
   }

   @ObfuscatedName("u")
   void method4350(int var1) {
      this.field2530.offset = this.field2521[var1];
   }

   @ObfuscatedName("q")
   void method4333(int var1) {
      this.field2521[var1] = this.field2530.offset;
   }

   @ObfuscatedName("i")
   void method4334() {
      this.field2530.offset = -1;
   }

   @ObfuscatedName("x")
   void method4335(int var1) {
      int var2 = this.field2530.readVarInt();
      this.field2525[var1] += var2;
   }

   @ObfuscatedName("e")
   int method4336(int var1) {
      int var2 = this.method4327(var1);
      return var2;
   }

   @ObfuscatedName("p")
   int method4327(int var1) {
      byte var2 = this.field2530.payload[this.field2530.offset];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field2523[var1] = var5;
         ++this.field2530.offset;
      } else {
         var5 = this.field2523[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method4337(var1, var5);
      } else {
         int var3 = this.field2530.readVarInt();
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field2530.payload[this.field2530.offset] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field2530.offset;
               this.field2523[var1] = var4;
               return this.method4337(var1, var4);
            }
         }

         this.field2530.offset += var3;
         return 0;
      }
   }

   @ObfuscatedName("b")
   int method4337(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field2530.readUnsignedByte();
         var4 = this.field2530.readVarInt();
         if(var7 == 47) {
            this.field2530.offset += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field2530.read24BitInt();
            var4 -= 3;
            int var6 = this.field2525[var1];
            this.field2526 += (long)var6 * (long)(this.field2524 - var5);
            this.field2524 = var5;
            this.field2530.offset += var4;
            return 2;
         } else {
            this.field2530.offset += var4;
            return 3;
         }
      } else {
         byte var3 = field2527[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field2530.readUnsignedByte() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field2530.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("n")
   long method4338(int var1) {
      return this.field2526 + (long)var1 * (long)this.field2524;
   }

   @ObfuscatedName("f")
   int method4339() {
      int var1 = this.field2521.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field2521[var4] >= 0 && this.field2525[var4] < var3) {
            var2 = var4;
            var3 = this.field2525[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("g")
   boolean method4340() {
      int var1 = this.field2521.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field2521[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("m")
   void method4341(long var1) {
      this.field2526 = var1;
      int var3 = this.field2521.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2525[var4] = 0;
         this.field2523[var4] = 0;
         this.field2530.offset = this.field2520[var4];
         this.method4335(var4);
         this.field2521[var4] = this.field2530.offset;
      }

   }
}
