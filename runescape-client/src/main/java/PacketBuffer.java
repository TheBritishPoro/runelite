import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("PacketBuffer")
public final class PacketBuffer extends Buffer {
   @ObfuscatedName("e")
   static final int[] field2374;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("cipher")
   ISAACCipher cipher;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1018793601
   )
   @Export("bitPosition")
   int bitPosition;

   static {
      field2374 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1024436616"
   )
   @Export("seed")
   public void seed(int[] var1) {
      this.cipher = new ISAACCipher(var1);
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(Lgs;B)V",
      garbageValue = "-62"
   )
   @Export("setIsaacCipher")
   public void setIsaacCipher(ISAACCipher var1) {
      this.cipher = var1;
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-123"
   )
   @Export("putOpcode")
   public void putOpcode(int var1) {
      super.payload[++super.offset - 1] = (byte)(var1 + this.cipher.nextInt());
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1803042160"
   )
   @Export("readOpcode")
   public int readOpcode() {
      return super.payload[++super.offset - 1] - this.cipher.nextInt() & 255;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1051001340"
   )
   public boolean method3821() {
      int var1 = super.payload[super.offset] - this.cipher.method3853() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1043804078"
   )
   public int method3841() {
      int var1 = super.payload[++super.offset - 1] - this.cipher.nextInt() & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (super.payload[++super.offset - 1] - this.cipher.nextInt() & 255);
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1583313616"
   )
   @Export("bitAccess")
   public void bitAccess() {
      this.bitPosition = super.offset * 8;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "597450860"
   )
   @Export("getBits")
   public int getBits(int var1) {
      int var2 = this.bitPosition >> 3;
      int var3 = 8 - (this.bitPosition & 7);
      int var4 = 0;

      for(this.bitPosition += var1; var1 > var3; var3 = 8) {
         var4 += (super.payload[var2++] & field2374[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var3 == var1) {
         var4 += super.payload[var2] & field2374[var3];
      } else {
         var4 += super.payload[var2] >> var3 - var1 & field2374[var1];
      }

      return var4;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-535357999"
   )
   @Export("byteAccess")
   public void byteAccess() {
      super.offset = (this.bitPosition + 7) / 8;
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "16711935"
   )
   @Export("bitsAvail")
   public int bitsAvail(int var1) {
      return var1 * 8 - this.bitPosition;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IS)Lkb;",
      garbageValue = "255"
   )
   public static class307 method3847(int var0) {
      class307[] var1 = new class307[]{class307.field3733, class307.field3732, class307.field3734};
      class307[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class307 var4 = var2[var3];
         if(var0 == var4.field3735) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "24564"
   )
   static void method3848() {
      Object var0 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_lock) {
         if(IndexStoreActionHandler.field3179 == 0) {
            IndexStoreActionHandler.IndexStoreActionHandler_thread = new Thread(new IndexStoreActionHandler());
            IndexStoreActionHandler.IndexStoreActionHandler_thread.setDaemon(true);
            IndexStoreActionHandler.IndexStoreActionHandler_thread.start();
            IndexStoreActionHandler.IndexStoreActionHandler_thread.setPriority(5);
         }

         IndexStoreActionHandler.field3179 = 600;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;Ljava/lang/String;B)I",
      garbageValue = "100"
   )
   public static int method3840(Buffer var0, String var1) {
      int var2 = var0.offset;
      byte[] var3 = JagexGame.method4618(var1);
      var0.putShortSmart(var3.length);
      var0.offset += class300.huffman.compress(var3, 0, var3.length, var0.payload, var0.offset);
      return var0.offset - var2;
   }
}
