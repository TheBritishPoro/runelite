import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   static class157 field869;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 701830261
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1275517341
   )
   int field859;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1431899603
   )
   @Export("level")
   int level;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1725586571
   )
   @Export("type")
   int type;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 963481089
   )
   @Export("x")
   int x;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -773006769
   )
   @Export("y")
   int y;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -3180471
   )
   int field865;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -66772787
   )
   int field866;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 920179015
   )
   @Export("id")
   int id;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 208398471
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2065155657
   )
   int field864;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -37170881
   )
   @Export("delay")
   int delay;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1332159199
   )
   @Export("hitpoints")
   int hitpoints;

   PendingSpawn() {
      this.delay = 0;
      this.hitpoints = -1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lfn;",
      garbageValue = "2059542848"
   )
   public static PacketNode method1536() {
      PacketNode var0;
      if(PacketNode.field2258 == 0) {
         var0 = new PacketNode();
      } else {
         var0 = PacketNode.packetBufferNodes[--PacketNode.field2258];
      }

      var0.clientPacket = null;
      var0.field2253 = 0;
      var0.packetBuffer = new PacketBuffer(5000);
      return var0;
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-149430841"
   )
   static final void method1537(int var0, int var1, boolean var2) {
      if(!var2 || var0 != WorldMapType2.field224 || class34.field301 != var1) {
         WorldMapType2.field224 = var0;
         class34.field301 = var1;
         MouseInput.setGameState(25);
         class83.method1933("Loading - please wait.", true);
         int var3 = baseX;
         int var4 = Client.baseY;
         baseX = (var0 - 6) * 8;
         Client.baseY = (var1 - 6) * 8;
         int var5 = baseX - var3;
         int var6 = Client.baseY - var4;
         var3 = baseX;
         var4 = Client.baseY;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            NPC var8 = Client.cachedNPCs[var7];
            if(var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.pathX[var9] -= var5;
                  var8.pathY[var9] -= var6;
               }

               var8.x -= var5 * 128;
               var8.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var21 = Client.cachedPlayers[var7];
            if(var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.pathX[var9] -= var5;
                  var21.pathY[var9] -= var6;
               }

               var21.x -= var5 * 128;
               var21.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if(var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if(var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var18 != var13; var13 += var22) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var5 + var13;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if(var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.groundItemDeque[var17][var13][var14] = Client.groundItemDeque[var17][var15][var16];
                  } else {
                     Client.groundItemDeque[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.getFront(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.getNext()) {
            var19.x -= var5;
            var19.y -= var6;
            if(var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
               var19.unlink();
            }
         }

         if(Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.queuedSoundEffectCount = 0;
         Client.field822 = false;
         CacheFile.cameraX -= var5 << 7;
         Coordinates.cameraY -= var6 << 7;
         CacheFile.field1428 -= var5 << 7;
         GrandExchangeEvent.field23 -= var6 << 7;
         Client.field651 = -1;
         Client.graphicsObjectDeque.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].reset();
         }

      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(Lbu;IIBB)V",
      garbageValue = "-55"
   )
   static final void method1538(Player var0, int var1, int var2, byte var3) {
      int var4 = var0.pathX[0];
      int var5 = var0.pathY[0];
      int var6 = var0.getSize();
      if(var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if(var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var9 = var0.getSize();
            Client.field849.field2043 = var1;
            Client.field849.field2048 = var2;
            Client.field849.field2042 = 1;
            Client.field849.field2045 = 1;
            class59 var10 = Client.field849;
            int var11 = ItemLayer.method2566(var4, var5, var9, var10, Client.collisionMaps[var0.field567], true, Client.field850, Client.field596);
            if(var11 >= 1) {
               for(int var12 = 0; var12 < var11 - 1; ++var12) {
                  var0.method1105(Client.field850[var12], Client.field596[var12], var3);
               }

            }
         }
      }
   }
}
