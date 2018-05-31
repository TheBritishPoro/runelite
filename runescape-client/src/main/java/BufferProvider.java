import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("BufferProvider")
public abstract class BufferProvider {
   @ObfuscatedName("s")
   @Export("pixels")
   public int[] pixels;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1014528671
   )
   @Export("width")
   public int width;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1281652493
   )
   @Export("height")
   public int height;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1986786716"
   )
   @Export("drawFull")
   public abstract void drawFull(int var1, int var2);

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-661513186"
   )
   @Export("draw")
   public abstract void draw(int var1, int var2, int var3, int var4);

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "14976"
   )
   @Export("setRaster")
   public final void setRaster() {
      Rasterizer2D.setRasterBuffer(this.pixels, this.width, this.height);
   }
}
