import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("GameCanvas")
public final class GameCanvas extends Canvas {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1710290887
   )
   @Export("revision")
   public static int revision;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[[Lhi;"
   )
   @Export("widgets")
   public static Widget[][] widgets;
   @ObfuscatedName("z")
   @Export("component")
   Component component;

   GameCanvas(Component var1) {
      this.component = var1;
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }
}
