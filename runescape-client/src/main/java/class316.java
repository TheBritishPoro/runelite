import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public enum class316 implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   field3775(0, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   field3771(1, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   field3772(2, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   field3773(3, 3),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   field3774(4, 4);

   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1008174629
   )
   public final int field3776;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1612299179
   )
   final int field3770;

   class316(int var3, int var4) {
      this.field3776 = var3;
      this.field3770 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field3770;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)I",
      garbageValue = "256"
   )
   @Export("getLength")
   public static int getLength(String var0) {
      return var0.length() + 1;
   }
}
