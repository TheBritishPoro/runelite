import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public final class class49 {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   @Export("listFetcher")
   static UrlRequest listFetcher;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Liq;",
      garbageValue = "860567064"
   )
   @Export("getUnderlayDefinition")
   public static FloorUnderlayDefinition getUnderlayDefinition(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.underlays.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorUnderlayDefinition.underlay_ref.getConfigData(1, var0);
         var1 = new FloorUnderlayDefinition();
         if(var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.post();
         FloorUnderlayDefinition.underlays.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-66"
   )
   static void method952() {
      class50.tileUnderlayIds = null;
      class165.tileOverlayIds = null;
      class50.tileOverlayPath = null;
      WorldMapDecoration.overlayRotations = null;
      class37.field325 = null;
      class50.field447 = null;
      class50.field448 = null;
      class50.floorHues = null;
      class305.floorSaturations = null;
      NPC.field1035 = null;
      Varbit.floorMultiplier = null;
      BuildType.field3137 = null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)[Lly;",
      garbageValue = "2064294997"
   )
   static IndexedSprite[] method950() {
      IndexedSprite[] var0 = new IndexedSprite[class319.indexedSpriteCount];

      for(int var1 = 0; var1 < class319.indexedSpriteCount; ++var1) {
         IndexedSprite var2 = var0[var1] = new IndexedSprite();
         var2.originalWidth = class305.indexedSpriteWidth;
         var2.originalHeight = class319.indexedSpriteHeight;
         var2.offsetX = class7.indexedSpriteOffsetXs[var1];
         var2.offsetY = class225.indexedSpriteOffsetYs[var1];
         var2.width = class319.indexSpriteWidths[var1];
         var2.height = class319.indexedSpriteHeights[var1];
         var2.palette = PacketNode.indexedSpritePalette;
         var2.pixels = class319.spritePixels[var1];
      }

      class7.indexedSpriteOffsetXs = null;
      class225.indexedSpriteOffsetYs = null;
      class319.indexSpriteWidths = null;
      class319.indexedSpriteHeights = null;
      PacketNode.indexedSpritePalette = null;
      class319.spritePixels = null;
      return var0;
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "35"
   )
   static final void method951(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 2048 - var3 & 2047;
      int var7 = 2048 - var4 & 2047;
      int var8 = 0;
      int var9 = 0;
      int var10 = var5;
      int var11;
      int var12;
      int var13;
      if(var6 != 0) {
         var11 = Graphics3D.SINE[var6];
         var12 = Graphics3D.COSINE[var6];
         var13 = var12 * var9 - var5 * var11 >> 16;
         var10 = var12 * var5 + var9 * var11 >> 16;
         var9 = var13;
      }

      if(var7 != 0) {
         var11 = Graphics3D.SINE[var7];
         var12 = Graphics3D.COSINE[var7];
         var13 = var8 * var12 + var11 * var10 >> 16;
         var10 = var10 * var12 - var8 * var11 >> 16;
         var8 = var13;
      }

      CacheFile.cameraX = var0 - var8;
      SceneTilePaint.cameraZ = var1 - var9;
      Coordinates.cameraY = var2 - var10;
      class7.cameraPitch = var3;
      DynamicObject.cameraYaw = var4;
      if(Client.field655 == 1 && Client.rights >= 2 && Client.gameCycle % 50 == 0 && (CacheFile.field1428 >> 7 != class138.localPlayer.x >> 7 || GrandExchangeEvent.field23 >> 7 != class138.localPlayer.y >> 7)) {
         var11 = class138.localPlayer.field567;
         var12 = (CacheFile.field1428 >> 7) + PendingSpawn.baseX;
         var13 = (GrandExchangeEvent.field23 >> 7) + Client.baseY;
         WorldMapDecoration.method197(var12, var13, var11, true);
      }

   }
}
