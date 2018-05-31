import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = -127094665
   )
   @Export("cameraYaw")
   static int cameraYaw;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -718862821
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 715597741
   )
   @Export("type")
   int type;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 811632703
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 263990655
   )
   @Export("level")
   int level;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1730539295
   )
   @Export("sceneX")
   int sceneX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2035092851
   )
   @Export("sceneY")
   int sceneY;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   Sequence field1202;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1387682185
   )
   @Export("animFrame")
   int animFrame;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -71136025
   )
   @Export("animCycleCount")
   int animCycleCount;

   @ObfuscatedSignature(
      signature = "(IIIIIIIZLdf;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.level = var4;
      this.sceneX = var5;
      this.sceneY = var6;
      if(var7 != -1) {
         this.field1202 = TotalQuantityComparator.getAnimation(var7);
         this.animFrame = 0;
         this.animCycleCount = Client.gameCycle - 1;
         if(this.field1202.replyMode == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if(this.field1202 == var10.field1202) {
               this.animFrame = var10.animFrame;
               this.animCycleCount = var10.animCycleCount;
               return;
            }
         }

         if(var8 && this.field1202.frameStep != -1) {
            this.animFrame = (int)(Math.random() * (double)this.field1202.frameIDs.length);
            this.animCycleCount -= (int)(Math.random() * (double)this.field1202.frameLengths[this.animFrame]);
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Model getModel() {
      if(this.field1202 != null) {
         int var1 = Client.gameCycle - this.animCycleCount;
         if(var1 > 100 && this.field1202.frameStep > 0) {
            var1 = 100;
         }

         label55: {
            do {
               do {
                  if(var1 <= this.field1202.frameLengths[this.animFrame]) {
                     break label55;
                  }

                  var1 -= this.field1202.frameLengths[this.animFrame];
                  ++this.animFrame;
               } while(this.animFrame < this.field1202.frameIDs.length);

               this.animFrame -= this.field1202.frameStep;
            } while(this.animFrame >= 0 && this.animFrame < this.field1202.frameIDs.length);

            this.field1202 = null;
         }

         this.animCycleCount = Client.gameCycle - var1;
      }

      ObjectComposition var12 = FileOnDisk.getObjectDefinition(this.id);
      if(var12.impostorIds != null) {
         var12 = var12.getImpostor();
      }

      if(var12 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if(this.orientation != 1 && this.orientation != 3) {
            var2 = var12.width;
            var3 = var12.length;
         } else {
            var2 = var12.length;
            var3 = var12.width;
         }

         int var4 = (var2 >> 1) + this.sceneX;
         int var5 = (var2 + 1 >> 1) + this.sceneX;
         int var6 = (var3 >> 1) + this.sceneY;
         int var7 = (var3 + 1 >> 1) + this.sceneY;
         int[][] var8 = class50.tileHeights[this.level];
         int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2;
         int var10 = (this.sceneX << 7) + (var2 << 6);
         int var11 = (this.sceneY << 7) + (var3 << 6);
         return var12.method5032(this.type, this.orientation, var8, var10, var9, var11, this.field1202, this.animFrame);
      }
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static final void method1962() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      if(Client.field655 == 0) {
         var0 = class138.localPlayer.x;
         var1 = class138.localPlayer.y;
         if(CacheFile.field1428 - var0 < -500 || CacheFile.field1428 - var0 > 500 || GrandExchangeEvent.field23 - var1 < -500 || GrandExchangeEvent.field23 - var1 > 500) {
            CacheFile.field1428 = var0;
            GrandExchangeEvent.field23 = var1;
         }

         if(var0 != CacheFile.field1428) {
            CacheFile.field1428 += (var0 - CacheFile.field1428) / 16;
         }

         if(var1 != GrandExchangeEvent.field23) {
            GrandExchangeEvent.field23 += (var1 - GrandExchangeEvent.field23) / 16;
         }

         var2 = CacheFile.field1428 >> 7;
         var3 = GrandExchangeEvent.field23 >> 7;
         var4 = WorldMapType2.getTileHeight(CacheFile.field1428, GrandExchangeEvent.field23, class13.plane);
         var5 = 0;
         int var6;
         if(var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for(var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
               for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                  int var8 = class13.plane;
                  if(var8 < 3 && (class50.tileSettings[1][var6][var7] & 2) == 2) {
                     ++var8;
                  }

                  int var9 = var4 - class50.tileHeights[var8][var6][var7];
                  if(var9 > var5) {
                     var5 = var9;
                  }
               }
            }
         }

         var6 = var5 * 192;
         if(var6 > 98048) {
            var6 = 98048;
         }

         if(var6 < 32768) {
            var6 = 32768;
         }

         if(var6 > Client.field738) {
            Client.field738 += (var6 - Client.field738) / 24;
         } else if(var6 < Client.field738) {
            Client.field738 += (var6 - Client.field738) / 80;
         }

         ItemComposition.field3478 = WorldMapType2.getTileHeight(class138.localPlayer.x, class138.localPlayer.y, class13.plane) - Client.field644;
      } else if(Client.field655 == 1) {
         DState.method3527();
         short var10 = -1;
         if(KeyFocusListener.keyPressed[33]) {
            var10 = 0;
         } else if(KeyFocusListener.keyPressed[49]) {
            var10 = 1024;
         }

         if(KeyFocusListener.keyPressed[48]) {
            if(var10 == 0) {
               var10 = 1792;
            } else if(var10 == 1024) {
               var10 = 1280;
            } else {
               var10 = 1536;
            }
         } else if(KeyFocusListener.keyPressed[50]) {
            if(var10 == 0) {
               var10 = 256;
            } else if(var10 == 1024) {
               var10 = 768;
            } else {
               var10 = 512;
            }
         }

         byte var11 = 0;
         if(KeyFocusListener.keyPressed[35]) {
            var11 = -1;
         } else if(KeyFocusListener.keyPressed[51]) {
            var11 = 1;
         }

         var2 = 0;
         if(var10 >= 0 || var11 != 0) {
            var2 = KeyFocusListener.keyPressed[81]?Client.field661:Client.field750;
            var2 *= 16;
            Client.field613 = var10;
            Client.field659 = var11;
         }

         if(Client.field657 < var2) {
            Client.field657 += var2 / 8;
            if(Client.field657 > var2) {
               Client.field657 = var2;
            }
         } else if(Client.field657 > var2) {
            Client.field657 = Client.field657 * 9 / 10;
         }

         if(Client.field657 > 0) {
            var3 = Client.field657 / 16;
            if(Client.field613 >= 0) {
               var0 = Client.field613 - cameraYaw & 2047;
               var4 = Graphics3D.SINE[var0];
               var5 = Graphics3D.COSINE[var0];
               CacheFile.field1428 += var4 * var3 / 65536;
               GrandExchangeEvent.field23 += var3 * var5 / 65536;
            }

            if(Client.field659 != 0) {
               ItemComposition.field3478 += var3 * Client.field659;
               if(ItemComposition.field3478 > 0) {
                  ItemComposition.field3478 = 0;
               }
            }
         } else {
            Client.field613 = -1;
            Client.field659 = -1;
         }

         if(KeyFocusListener.keyPressed[13]) {
            Client.field626.method1980(class26.method433(ClientPacket.field2142, Client.field626.field1218));
            Client.field655 = 0;
         }
      }

      if(MouseInput.mouseCurrentButton == 4 && InvType.middleMouseMovesCamera) {
         var0 = MouseInput.mouseLastY * 673804999 - Client.field654;
         Client.field652 = var0 * 2;
         Client.field654 = var0 != -1 && var0 != 1?(MouseInput.mouseLastY * 673804999 + Client.field654) / 2:MouseInput.mouseLastY * 673804999;
         var1 = Client.field653 - MouseInput.mouseLastX;
         Client.field608 = var1 * 2;
         Client.field653 = var1 != -1 && var1 != 1?(MouseInput.mouseLastX + Client.field653) / 2:MouseInput.mouseLastX;
      } else {
         if(KeyFocusListener.keyPressed[96]) {
            Client.field608 += (-24 - Client.field608) / 2;
         } else if(KeyFocusListener.keyPressed[97]) {
            Client.field608 += (24 - Client.field608) / 2;
         } else {
            Client.field608 /= 2;
         }

         if(KeyFocusListener.keyPressed[98]) {
            Client.field652 += (12 - Client.field652) / 2;
         } else if(KeyFocusListener.keyPressed[99]) {
            Client.field652 += (-12 - Client.field652) / 2;
         } else {
            Client.field652 /= 2;
         }

         Client.field654 = MouseInput.mouseLastY * 673804999;
         Client.field653 = MouseInput.mouseLastX;
      }

      Client.mapAngle = Client.field608 / 2 + Client.mapAngle & 2047;
      Client.cameraPitchTarget += Client.field652 / 2;
      if(Client.cameraPitchTarget < 128) {
         Client.cameraPitchTarget = 128;
      }

      if(Client.cameraPitchTarget > 383) {
         Client.cameraPitchTarget = 383;
      }

   }
}
