import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class159 extends class157 {
   @ObfuscatedName("z")
   Socket field1982;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lej;"
   )
   class151 field1980;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   GameSocket field1983;

   class159(Socket var1, int var2, int var3) throws IOException {
      this.field1982 = var1;
      this.field1982.setSoTimeout(30000);
      this.field1982.setTcpNoDelay(true);
      this.field1982.setReceiveBufferSize(65536);
      this.field1982.setSendBufferSize(65536);
      this.field1980 = new class151(this.field1982.getInputStream(), var2);
      this.field1983 = new GameSocket(this.field1982.getOutputStream(), var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   public boolean vmethod3350(int var1) throws IOException {
      return this.field1980.method3219(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
   )
   public int vmethod3349() throws IOException {
      return this.field1980.method3217();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
   )
   public int vmethod3353() throws IOException {
      return this.field1980.method3218();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
   )
   public int vmethod3351(byte[] var1, int var2, int var3) throws IOException {
      return this.field1980.method3224(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
   )
   public void vmethod3347(byte[] var1, int var2, int var3) throws IOException {
      this.field1983.read(var1, var2, var3);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
   )
   public void vmethod3346() {
      this.field1983.method3384();

      try {
         this.field1982.close();
      } catch (IOException var2) {
         ;
      }

      this.field1980.method3215();
   }

   protected void finalize() {
      this.vmethod3346();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "-826976613"
   )
   @Export("byteArrayToObject")
   public static Object byteArrayToObject(byte[] var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !AbstractByteBuffer.directBufferUnavailable) {
            try {
               DirectByteBuffer var2 = new DirectByteBuffer();
               var2.put(var0);
               return var2;
            } catch (Throwable var3) {
               AbstractByteBuffer.directBufferUnavailable = true;
            }
         }

         return var0;
      }
   }
}
