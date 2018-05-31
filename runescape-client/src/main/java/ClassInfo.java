import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ClassInfo")
public class ClassInfo extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 751933843
   )
   static int field3757;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("scriptMapIconReference")
   static MapIconReference scriptMapIconReference;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1515270287
   )
   int field3758;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 893643005
   )
   @Export("count")
   int count;
   @ObfuscatedName("s")
   @Export("type")
   int[] type;
   @ObfuscatedName("l")
   @Export("errorIdentifiers")
   int[] errorIdentifiers;
   @ObfuscatedName("u")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("q")
   int[] field3753;
   @ObfuscatedName("k")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("i")
   @Export("args")
   byte[][][] args;
}
