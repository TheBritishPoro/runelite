import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("InvType")
public class InvType extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static IndexDataBase field3226;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("inventoryCache")
   static NodeCache inventoryCache;
   @ObfuscatedName("ch")
   @Export("middleMouseMovesCamera")
   static boolean middleMouseMovesCamera;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 690841177
   )
   @Export("size")
   public int size;

   static {
      inventoryCache = new NodeCache(64);
   }

   InvType() {
      this.size = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "884121490"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4805(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "646065158"
   )
   void method4805(Buffer var1, int var2) {
      if(var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "843953881"
   )
   @Export("groundItemSpawned")
   static final void groundItemSpawned(int var0, int var1) {
      Deque var2 = Client.groundItemDeque[class13.plane][var0][var1];
      if(var2 == null) {
         MapIcon.region.removeGroundItemPile(class13.plane, var0, var1);
      } else {
         long var3 = -99999999L;
         Item var5 = null;

         Item var6;
         for(var6 = (Item)var2.getFront(); var6 != null; var6 = (Item)var2.getNext()) {
            ItemComposition var7 = TextureProvider.getItemDefinition(var6.id);
            long var8 = (long)var7.price;
            if(var7.isStackable == 1) {
               var8 *= (long)(var6.quantity + 1);
            }

            if(var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if(var5 == null) {
            MapIcon.region.removeGroundItemPile(class13.plane, var0, var1);
         } else {
            var2.addTail(var5);
            Item var12 = null;
            Item var11 = null;

            for(var6 = (Item)var2.getFront(); var6 != null; var6 = (Item)var2.getNext()) {
               if(var6.id != var5.id) {
                  if(var12 == null) {
                     var12 = var6;
                  }

                  if(var12.id != var6.id && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = class76.method1804(var0, var1, 3, false, 0);
            MapIcon.region.addItemPile(class13.plane, var0, var1, WorldMapType2.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class13.plane), var5, var9, var12, var11);
         }
      }
   }
}
