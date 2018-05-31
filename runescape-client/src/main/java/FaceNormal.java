import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("FaceNormal")
public class FaceNormal {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -894344701
   )
   @Export("x")
   int x;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -860995101
   )
   @Export("y")
   int y;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1876022181
   )
   @Export("z")
   int z;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1923991029"
   )
   public static boolean method3073(int var0) {
      return var0 >= WorldMapDecorationType.field2773.rsOrdinal && var0 <= WorldMapDecorationType.field2757.rsOrdinal || var0 == WorldMapDecorationType.field2758.rsOrdinal;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "1157214039"
   )
   public static void method3072(IndexDataBase var0) {
      VarCInt.field3258 = var0;
   }
}
