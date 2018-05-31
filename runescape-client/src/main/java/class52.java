import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class52 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   final IndexData field469;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2021923253
   )
   final int field468;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2092559043
   )
   int field467;

   @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;)V"
   )
   class52(IndexData var1, String var2) {
      this.field467 = 0;
      this.field469 = var1;
      this.field468 = var1.size();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1326289978"
   )
   boolean method1000() {
      this.field467 = 0;

      for(int var1 = 0; var1 < this.field468; ++var1) {
         if(!this.field469.method4734(var1) || this.field469.method4725(var1)) {
            ++this.field467;
         }
      }

      return this.field467 >= this.field468;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1142628793"
   )
   public static boolean method1002(char var0) {
      return var0 >= ' ' && var0 <= '~'?true:(var0 >= 160 && var0 <= 255?true:var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376);
   }
}
