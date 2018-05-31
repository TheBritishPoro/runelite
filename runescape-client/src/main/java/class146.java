import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public enum class146 implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1908(3, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1910(1, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1907(2, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1905(0, 3);

   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1737035263
   )
   public final int field1909;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -999687567
   )
   final int field1906;

   class146(int var3, int var4) {
      this.field1909 = var3;
      this.field1906 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field1906;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "5"
   )
   @Export("nextPowerOfTwo")
   public static int nextPowerOfTwo(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Lhi;",
      garbageValue = "-1708513832"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = class26.getWidget(var0);
      return var1 == -1?var2:(var2 != null && var2.children != null && var1 < var2.children.length?var2.children[var1]:null);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "0"
   )
   public static void method3190(Buffer var0, int var1) {
      if(class155.randomDat != null) {
         try {
            class155.randomDat.seek(0L);
            class155.randomDat.write(var0.payload, var1, 24);
         } catch (Exception var3) {
            ;
         }
      }

   }
}
