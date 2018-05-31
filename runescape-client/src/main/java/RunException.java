import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("z")
   public static Applet field1938;
   @ObfuscatedName("w")
   public static String field1939;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1026373275
   )
   public static int field1940;
   @ObfuscatedName("u")
   String field1941;
   @ObfuscatedName("q")
   @Export("parent")
   Throwable parent;

   RunException(Throwable var1, String var2) {
      this.field1941 = var2;
      this.parent = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-105"
   )
   public static boolean method3247(int var0) {
      return var0 >= WorldMapDecorationType.field2759.rsOrdinal && var0 <= WorldMapDecorationType.field2764.rsOrdinal;
   }
}
