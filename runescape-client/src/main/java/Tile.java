import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1853859971
   )
   @Export("renderLevel")
   int renderLevel;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -27555673
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -870268689
   )
   @Export("x")
   int x;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -983890313
   )
   @Export("y")
   int y;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldi;"
   )
   @Export("paint")
   SceneTilePaint paint;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldq;"
   )
   @Export("overlay")
   SceneTileModel overlay;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ldr;"
   )
   @Export("wallObject")
   WallObject wallObject;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Leo;"
   )
   @Export("decorativeObject")
   DecorativeObject decorativeObject;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   @Export("groundObject")
   GroundObject groundObject;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldp;"
   )
   @Export("itemLayer")
   ItemLayer itemLayer;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -76030315
   )
   @Export("entityCount")
   int entityCount;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "[Lek;"
   )
   @Export("objects")
   GameObject[] objects;
   @ObfuscatedName("n")
   @Export("entityFlags")
   int[] entityFlags;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1631809613
   )
   @Export("flags")
   int flags;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1667803599
   )
   @Export("physicalLevel")
   int physicalLevel;
   @ObfuscatedName("m")
   @Export("draw")
   boolean draw;
   @ObfuscatedName("r")
   @Export("visible")
   boolean visible;
   @ObfuscatedName("t")
   @Export("drawEntities")
   boolean drawEntities;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -2030779537
   )
   @Export("wallCullDirection")
   int wallCullDirection;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 532885129
   )
   @Export("wallUncullDirection")
   int wallUncullDirection;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -620643465
   )
   @Export("wallCullOppositeDirection")
   int wallCullOppositeDirection;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1932031791
   )
   @Export("wallDrawFlags")
   int wallDrawFlags;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   @Export("bridge")
   Tile bridge;

   Tile(int var1, int var2, int var3) {
      this.objects = new GameObject[5];
      this.entityFlags = new int[5];
      this.flags = 0;
      this.renderLevel = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }
}
