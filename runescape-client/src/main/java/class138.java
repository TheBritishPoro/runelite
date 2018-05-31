import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class138 extends class283 {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field1871;
   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "Lbu;"
   )
   @Export("localPlayer")
   static Player localPlayer;
   @ObfuscatedName("z")
   final boolean field1872;

   public class138(boolean var1) {
      this.field1872 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-1072609889"
   )
   int method3128(ChatPlayer var1, ChatPlayer var2) {
      return Client.world == var1.world && var2.world == Client.world?(this.field1872?var1.getRsName().compareCleanName(var2.getRsName()):var2.getRsName().compareCleanName(var1.getRsName())):this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3128((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IB)I",
      garbageValue = "-22"
   )
   public static int method3137(CharSequence var0, int var1) {
      return class68.parseInt(var0, var1, true);
   }
}
