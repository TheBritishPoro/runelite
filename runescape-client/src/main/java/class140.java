import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class140 extends class283 {
   @ObfuscatedName("z")
   final boolean field1883;

   public class140(boolean var1) {
      this.field1883 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-359404132"
   )
   int method3147(ChatPlayer var1, ChatPlayer var2) {
      return Client.world == var1.world && var2.world == Client.world?(this.field1883?var1.field3627 - var2.field3627:var2.field3627 - var1.field3627):this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3147((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-1"
   )
   public static boolean method3150(int var0) {
      return (var0 >> 29 & 1) != 0;
   }
}
