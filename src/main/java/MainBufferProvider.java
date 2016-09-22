import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("MainBufferProvider")
public final class MainBufferProvider extends BufferProvider {
   @ObfuscatedName("a")
   Component field1503;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;III)V",
      garbageValue = "138016631"
   )
   @Export("draw")
   public final void draw(Graphics var1, int var2, int var3) {
      var1.drawImage(super.image, var2, var3, this.field1503);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IILjava/awt/Component;I)V",
      garbageValue = "-557590795"
   )
   @Export("init")
   final void init(int var1, int var2, Component var3) {
      super.width = var1;
      super.height = var2;
      super.pixels = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null);
      super.image = new BufferedImage(var5, var6, false, new Hashtable());
      this.field1503 = var3;
      this.method1716();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIIB)V",
      garbageValue = "1"
   )
   @Export("drawSub")
   public final void drawSub(Graphics var1, int var2, int var3, int var4, int var5) {
      Shape var6 = var1.getClip();
      var1.clipRect(var2, var3, var4, var5);
      var1.drawImage(super.image, 0, 0, this.field1503);
      var1.setClip(var6);
   }
}
