import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("WallObject")
public final class WallObject {
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   @Export("compass")
   static SpritePixels compass;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1613465741
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -270553885
   )
   @Export("floor")
   int floor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2118250899
   )
   @Export("x")
   int x;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -995723823
   )
   @Export("y")
   int y;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1144492251
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = -8915690867096141623L
   )
   @Export("hash")
   public long hash;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -445260767
   )
   @Export("config")
   int config;

   WallObject() {
      this.hash = 0L;
      this.config = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Z",
      garbageValue = "-1563749679"
   )
   static boolean method3071(String var0, int var1) {
      return class13.method112(var0, var1, "openjs");
   }
}
