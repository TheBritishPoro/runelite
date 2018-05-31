import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("GroundObject")
public final class GroundObject {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2142827601
   )
   @Export("floor")
   int floor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1478604641
   )
   @Export("x")
   int x;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 563274733
   )
   @Export("y")
   int y;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -786866146567173785L
   )
   @Export("hash")
   public long hash;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 599749567
   )
   @Export("renderInfoBitPacked")
   int renderInfoBitPacked;
}
