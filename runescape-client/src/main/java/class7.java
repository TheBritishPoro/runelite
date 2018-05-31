import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
final class class7 implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field42;
   @ObfuscatedName("l")
   @Export("indexedSpriteOffsetXs")
   static int[] indexedSpriteOffsetXs;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = -567041405
   )
   @Export("cameraPitch")
   static int cameraPitch;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-657628450"
   )
   int method76(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.field20 < var2.field20?-1:(var2.field20 == var1.field20?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method76((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)Z",
      garbageValue = "24612"
   )
   public static boolean method83(int var0) {
      return (var0 >> 28 & 1) != 0;
   }
}
