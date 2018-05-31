import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class25 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final class25 field212;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final class25 field209;
   @ObfuscatedName("c")
   @Export("tt")
   static int[] tt;
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("mapscene")
   static IndexedSprite[] mapscene;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1536539371
   )
   final int field211;

   static {
      field212 = new class25(0);
      field209 = new class25(1);
   }

   class25(int var1) {
      this.field211 = var1;
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Z",
      garbageValue = "2065048163"
   )
   static final boolean method426(Widget var0) {
      int var1 = var0.contentType;
      if(var1 == 205) {
         Client.field627 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if(var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.field841.method4478(var2, var3 == 1);
         }

         if(var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.field841.method4493(var2, var3 == 1);
         }

         if(var1 == 324) {
            Client.field841.method4465(false);
         }

         if(var1 == 325) {
            Client.field841.method4465(true);
         }

         if(var1 == 326) {
            PacketNode var4 = class26.method433(ClientPacket.field2173, Client.field626.field1218);
            Client.field841.method4466(var4.packetBuffer);
            Client.field626.method1980(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
