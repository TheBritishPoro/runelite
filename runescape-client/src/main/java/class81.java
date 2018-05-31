import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class81 {
   @ObfuscatedName("s")
   static byte[] field1156;
   @ObfuscatedName("l")
   static byte[] field1153;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lgk;"
   )
   static Buffer[] field1157;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1161097351
   )
   @Export("playerIndexesCount")
   static int playerIndexesCount;
   @ObfuscatedName("k")
   @Export("playerIndices")
   static int[] playerIndices;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 92024931
   )
   static int field1160;
   @ObfuscatedName("x")
   static int[] field1161;
   @ObfuscatedName("e")
   @Export("Players_regions")
   static int[] Players_regions;
   @ObfuscatedName("p")
   @Export("Players_orientations")
   static int[] Players_orientations;
   @ObfuscatedName("b")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -757311547
   )
   static int field1165;
   @ObfuscatedName("f")
   static int[] field1166;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   static Buffer field1154;
   @ObfuscatedName("ab")
   static int[] field1169;

   static {
      field1156 = new byte[2048];
      field1153 = new byte[2048];
      field1157 = new Buffer[2048];
      playerIndexesCount = 0;
      playerIndices = new int[2048];
      field1160 = 0;
      field1161 = new int[2048];
      Players_regions = new int[2048];
      Players_orientations = new int[2048];
      Players_targetIndices = new int[2048];
      field1165 = 0;
      field1166 = new int[2048];
      field1154 = new Buffer(new byte[5000]);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1864987128"
   )
   static final int method1884() {
      return class120.Viewport_mouseX;
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      signature = "(Lhi;B)Z",
      garbageValue = "-10"
   )
   static boolean method1885(Widget var0) {
      return var0.isHidden;
   }
}
