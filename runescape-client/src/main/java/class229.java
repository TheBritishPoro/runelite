import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class229 {
   @ObfuscatedName("j")
   @Export("osName")
   static String osName;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      longValue = -2450894852858471875L
   )
   static long field2589;
   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      signature = "Lbf;"
   )
   @Export("topContextMenuRow")
   static ContextMenuRow topContextMenuRow;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lir;III)Lll;",
      garbageValue = "-1568727836"
   )
   @Export("getSpriteAsSpritePixels")
   public static SpritePixels getSpriteAsSpritePixels(IndexDataBase var0, int var1, int var2) {
      return !class306.method5660(var0, var1, var2)?null:CombatInfoListHolder.method1781();
   }
}
