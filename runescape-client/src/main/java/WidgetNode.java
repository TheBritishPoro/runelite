import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("WidgetNode")
public class WidgetNode extends Node {
   @ObfuscatedName("rz")
   @ObfuscatedGetter(
      intValue = -150808717
   )
   static int field495;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1708585715
   )
   @Export("scriptStringStackSize")
   static int scriptStringStackSize;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -432145823
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1556790455
   )
   @Export("owner")
   int owner;
   @ObfuscatedName("s")
   boolean field496;

   WidgetNode() {
      this.field496 = false;
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "(IIIILll;Lhv;B)V",
      garbageValue = "103"
   )
   @Export("drawDot")
   static final void drawDot(int var0, int var1, int var2, int var3, SpritePixels var4, class224 var5) {
      if(var4 != null) {
         int var6 = Client.mapAngle & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if(var7 <= 6400) {
            int var8 = Graphics3D.SINE[var6];
            int var9 = Graphics3D.COSINE[var6];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if(var7 > 2500) {
               var4.method5867(var10 + var5.field2553 / 2 - var4.maxWidth / 2, var5.field2549 / 2 - var11 - var4.maxHeight / 2, var0, var1, var5.field2553, var5.field2549, var5.field2551, var5.field2550);
            } else {
               var4.drawAt(var0 + var10 + var5.field2553 / 2 - var4.maxWidth / 2, var5.field2549 / 2 + var1 - var11 - var4.maxHeight / 2);
            }

         }
      }
   }
}
