import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class141 extends class283 {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 325680983
   )
   static int field1885;
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Widget field1888;
   @ObfuscatedName("z")
   final boolean field1886;

   public class141(boolean var1) {
      this.field1886 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-2110971659"
   )
   int method3153(ChatPlayer var1, ChatPlayer var2) {
      return var1.world != 0 && var2.world != 0?(this.field1886?var1.field3627 - var2.field3627:var2.field3627 - var1.field3627):this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3153((ChatPlayer)var1, (ChatPlayer)var2);
   }
}
