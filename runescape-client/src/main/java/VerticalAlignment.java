import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3224(2, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3222(1, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3221(0, 2);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -71275381
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -199100421
   )
   final int field3225;

   VerticalAlignment(int var3, int var4) {
      this.value = var3;
      this.field3225 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field3225;
   }
}
