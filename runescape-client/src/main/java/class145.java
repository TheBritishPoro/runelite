import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class145 extends class283 {
   @ObfuscatedName("z")
   final boolean field1903;

   public class145(boolean var1) {
      this.field1903 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "2025986991"
   )
   int method3182(ChatPlayer var1, ChatPlayer var2) {
      return var1.world != 0 && var2.world != 0?(this.field1903?var1.getRsName().compareCleanName(var2.getRsName()):var2.getRsName().compareCleanName(var1.getRsName())):this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3182((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "763302428"
   )
   public static boolean method3188(int var0) {
      return (var0 >> 30 & 1) != 0;
   }
}
