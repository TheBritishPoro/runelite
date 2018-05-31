import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ContextMenuRow")
public class ContextMenuRow {
   @ObfuscatedName("a")
   @Export("osNameLC")
   public static String osNameLC;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -952252275
   )
   @Export("type")
   int type;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -229344617
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1272979127
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1365690249
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("u")
   @Export("option")
   String option;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "51"
   )
   public static int method1802(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }
}
