import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("GZipDecompressor")
public class GZipDecompressor {
   @ObfuscatedName("k")
   @Export("validInterfaces")
   static boolean[] validInterfaces;
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexSprites")
   static IndexData indexSprites;
   @ObfuscatedName("z")
   @Export("inflator")
   Inflater inflator;

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   GZipDecompressor(int var1, int var2, int var3) {
   }

   public GZipDecompressor() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;[BI)V",
      garbageValue = "641933971"
   )
   @Export("decompress")
   public void decompress(Buffer var1, byte[] var2) {
      if(var1.payload[var1.offset] == 31 && var1.payload[var1.offset + 1] == -117) {
         if(this.inflator == null) {
            this.inflator = new Inflater(true);
         }

         try {
            this.inflator.setInput(var1.payload, var1.offset + 10, var1.payload.length - (var1.offset + 8 + 10));
            this.inflator.inflate(var2);
         } catch (Exception var4) {
            this.inflator.reset();
            throw new RuntimeException("");
         }

         this.inflator.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lii;",
      garbageValue = "-1879492666"
   )
   public static VarCString method3485(int var0) {
      VarCString var1 = (VarCString)VarCString.field3260.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarCString.field3264.getConfigData(15, var0);
         var1 = new VarCString();
         if(var2 != null) {
            var1.method4852(new Buffer(var2));
         }

         VarCString.field3260.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-6945047"
   )
   static void method3487(Buffer var0, int var1) {
      byte[] var2 = var0.payload;
      if(Client.field620 == null) {
         Client.field620 = new byte[24];
      }

      class193.method3873(var2, var1, Client.field620, 0, 24);
      class146.method3190(var0, var1);
   }
}
