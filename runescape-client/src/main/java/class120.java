import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class120 {
   @ObfuscatedName("z")
   @Export("Viewport_containsMouse")
   public static boolean Viewport_containsMouse;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2004293301
   )
   @Export("Viewport_mouseX")
   static int Viewport_mouseX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1960982477
   )
   @Export("Viewport_mouseY")
   static int Viewport_mouseY;
   @ObfuscatedName("l")
   @Export("Viewport_false0")
   static boolean Viewport_false0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1347288675
   )
   static int field1657;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2010243593
   )
   static int field1659;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1154137323
   )
   static int field1651;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -160115827
   )
   static int field1654;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1132219127
   )
   static int field1655;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 127802141
   )
   @Export("Viewport_entityCountAtMouse")
   public static int Viewport_entityCountAtMouse;
   @ObfuscatedName("g")
   public static long[] field1647;

   static {
      Viewport_containsMouse = false;
      Viewport_mouseX = 0;
      Viewport_mouseY = 0;
      Viewport_false0 = false;
      Viewport_entityCountAtMouse = 0;
      field1647 = new long[1000];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIZIZB)V",
      garbageValue = "40"
   )
   static void method2781(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if(var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = World.worldList[var6];
         World.worldList[var6] = World.worldList[var1];
         World.worldList[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if(CacheFile.method2503(World.worldList[var9], var8, var2, var3, var4, var5) <= 0) {
               World var10 = World.worldList[var9];
               World.worldList[var9] = World.worldList[var7];
               World.worldList[var7++] = var10;
            }
         }

         World.worldList[var1] = World.worldList[var7];
         World.worldList[var7] = var8;
         method2781(var0, var7 - 1, var2, var3, var4, var5);
         method2781(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
