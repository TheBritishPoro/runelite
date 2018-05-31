import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class294 extends class209 {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 796810475
   )
   public int field3665;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   public Name field3662;
   @ObfuscatedName("u")
   public short field3664;

   @ObfuscatedSignature(
      signature = "(Lkm;I)V"
   )
   class294(Name var1, int var2) {
      this.field3665 = (int)(Buffer.method3547() / 1000L);
      this.field3662 = var1;
      this.field3664 = (short)var2;
   }
}
