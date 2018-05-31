import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class238 {
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "111587198"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = WorldMapType2.getTileHeight(var0, var1, class13.plane) - var2;
         var0 -= CacheFile.cameraX;
         var3 -= SceneTilePaint.cameraZ;
         var1 -= Coordinates.cameraY;
         int var4 = Graphics3D.SINE[class7.cameraPitch];
         int var5 = Graphics3D.COSINE[class7.cameraPitch];
         int var6 = Graphics3D.SINE[DynamicObject.cameraYaw];
         int var7 = Graphics3D.COSINE[DynamicObject.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var3 * var4 + var5 * var1 >> 16;
         if(var1 >= 50) {
            Client.screenX = var0 * Client.scale / var1 + Client.viewportWidth / 2;
            Client.screenY = var8 * Client.scale / var1 + Client.viewportHeight / 2;
         } else {
            Client.screenX = -1;
            Client.screenY = -1;
         }

      } else {
         Client.screenX = -1;
         Client.screenY = -1;
      }
   }
}
