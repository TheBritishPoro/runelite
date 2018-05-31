import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapManager")
public final class WorldMapManager {
   @ObfuscatedName("z")
   @Export("loaded")
   boolean loaded;
   @ObfuscatedName("w")
   @Export("loading")
   boolean loading;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lao;"
   )
   class33 field265;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   SpritePixels field266;
   @ObfuscatedName("u")
   HashMap field267;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[[Lh;"
   )
   @Export("mapRegions")
   WorldMapRegion[][] mapRegions;
   @ObfuscatedName("k")
   HashMap field269;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   IndexedSprite[] field279;
   @ObfuscatedName("x")
   @Export("mapFonts")
   final HashMap mapFonts;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1298084395
   )
   @Export("mapSurfaceBaseOffsetX")
   int mapSurfaceBaseOffsetX;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1151941721
   )
   @Export("mapSurfaceBaseOffsetY")
   int mapSurfaceBaseOffsetY;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -572130391
   )
   int field274;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1931488771
   )
   int field270;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 984068981
   )
   public int field276;

   @ObfuscatedSignature(
      signature = "([Lly;Ljava/util/HashMap;)V"
   )
   public WorldMapManager(IndexedSprite[] var1, HashMap var2) {
      this.loaded = false;
      this.loading = false;
      this.field269 = new HashMap();
      this.field276 = 0;
      this.field279 = var1;
      this.mapFonts = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;ZB)V",
      garbageValue = "2"
   )
   @Export("load")
   public void load(IndexDataBase var1, String var2, boolean var3) {
      if(!this.loading) {
         this.loaded = false;
         this.loading = true;
         System.nanoTime();
         int var4 = var1.getFile(MapCacheArchiveNames.DETAILS.name);
         int var5 = var1.getChild(var4, var2);
         Buffer var6 = new Buffer(var1.takeRecordByNames(MapCacheArchiveNames.DETAILS.name, var2));
         Buffer var7 = new Buffer(var1.takeRecordByNames(MapCacheArchiveNames.COMPOSITE_MAP.name, var2));
         Buffer var8 = new Buffer(var1.takeRecordByNames(var2, MapCacheArchiveNames.AREA.name));
         System.nanoTime();
         System.nanoTime();
         this.field265 = new class33();

         try {
            this.field265.method550(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field265.method217();
         this.field265.method218();
         this.field265.method219();
         this.mapSurfaceBaseOffsetX = this.field265.getMinX() * 64;
         this.mapSurfaceBaseOffsetY = this.field265.getMinY() * 64;
         this.field274 = (this.field265.method214() - this.field265.getMinX() + 1) * 64;
         this.field270 = (this.field265.method249() - this.field265.getMinY() + 1) * 64;
         int var17 = this.field265.method214() - this.field265.getMinX() + 1;
         int var10 = this.field265.method249() - this.field265.getMinY() + 1;
         System.nanoTime();
         System.nanoTime();
         WorldMapRegion.field188.method4006();
         WorldMapRegion.field189.method4006();
         this.mapRegions = new WorldMapRegion[var17][var10];
         Iterator var11 = this.field265.field292.iterator();

         while(var11.hasNext()) {
            class10 var12 = (class10)var11.next();
            int var13 = var12.field127;
            int var14 = var12.field117;
            int var15 = var13 - this.field265.getMinX();
            int var16 = var14 - this.field265.getMinY();
            this.mapRegions[var15][var16] = new WorldMapRegion(var13, var14, this.field265.method211(), this.mapFonts);
            this.mapRegions[var15][var16].method400(var12, this.field265.field290);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if(this.mapRegions[var18][var19] == null) {
                  this.mapRegions[var18][var19] = new WorldMapRegion(this.field265.getMinX() + var18, this.field265.getMinY() + var19, this.field265.method211(), this.mapFonts);
                  this.mapRegions[var18][var19].method287(this.field265.field291, this.field265.field290);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4644(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, var2)) {
            byte[] var21 = var1.takeRecordByNames(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, var2);
            this.field266 = class284.method5324(var21);
         }

         System.nanoTime();
         var1.method4702();
         var1.reset();
         this.loaded = true;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-109"
   )
   public final void method482() {
      this.field267 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "-102"
   )
   @Export("drawMapRegion")
   public final void drawMapRegion(int var1, int var2, int var3, int var4, int x1, int y1, int x2, int y2) {
      int[] var9 = Rasterizer2D.graphicsPixels;
      int var10 = Rasterizer2D.graphicsPixelsWidth;
      int var11 = Rasterizer2D.graphicsPixelsHeight;
      int[] var12 = new int[4];
      Rasterizer2D.copyDrawRegion(var12);
      WorldMapRectangle var13 = this.getRegionRectForViewport(var1, var2, var3, var4);
      float var14 = this.getPixelsPerTile(x2 - x1, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field276 = var15;
      if(!this.field269.containsKey(Integer.valueOf(var15))) {
         class35 var16 = new class35(var15);
         var16.method592();
         this.field269.put(Integer.valueOf(var15), var16);
      }

      WorldMapRegion[] var22 = new WorldMapRegion[8];

      int var17;
      int var18;
      for(var17 = var13.worldMapRegionX; var17 < var13.worldMapRegionX + var13.worldMapRegionWidth; ++var17) {
         for(var18 = var13.worldMapRegionY; var18 < var13.worldMapRegionY + var13.worldMapRegionHeight; ++var18) {
            this.method485(var17, var18, var22);
            this.mapRegions[var17][var18].method290(var15, (class35)this.field269.get(Integer.valueOf(var15)), var22, this.field279);
         }
      }

      Rasterizer2D.setRasterBuffer(var9, var10, var11);
      Rasterizer2D.setDrawRegion(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.mapSurfaceBaseOffsetX + var1;
      int var19 = var2 + this.mapSurfaceBaseOffsetY;

      for(int var20 = var13.worldMapRegionX; var20 < var13.worldMapRegionWidth + var13.worldMapRegionX; ++var20) {
         for(int var21 = var13.worldMapRegionY; var21 < var13.worldMapRegionHeight + var13.worldMapRegionY; ++var21) {
            this.mapRegions[var20][var21].method314(x1 + var17 * (this.mapRegions[var20][var21].field191 * 64 - var18) / 64, y2 - var17 * (this.mapRegions[var20][var21].field192 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-1738532416"
   )
   @Export("drawMapIcons")
   public final void drawMapIcons(int x1, int y1, int x2, int y2, int graphicsX1, int var6, int graphicsX2, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.getRegionRectForViewport(x1, y1, x2, y2);
      float var15 = this.getPixelsPerTile(graphicsX2 - graphicsX1, x2 - x1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.mapSurfaceBaseOffsetX + x1;
      int var18 = y1 + this.mapSurfaceBaseOffsetY;

      int var19;
      int var20;
      for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
         for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionY + var14.worldMapRegionHeight; ++var20) {
            if(var13) {
               this.mapRegions[var19][var20].method340();
            }

            this.mapRegions[var19][var20].method382(graphicsX1 + var16 * (this.mapRegions[var19][var20].field191 * 64 - var17) / 64, var8 - var16 * (this.mapRegions[var19][var20].field192 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
            for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionHeight + var14.worldMapRegionY; ++var20) {
               this.mapRegions[var19][var20].drawFlashingMapIcons(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II[Lh;I)V",
      garbageValue = "1440038510"
   )
   void method485(int var1, int var2, WorldMapRegion[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.mapRegions.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.mapRegions[0].length - 1;
      if(var7) {
         var3[class240.field3101.rsOrdinal()] = null;
      } else {
         var3[class240.field3101.rsOrdinal()] = this.mapRegions[var1][var2 + 1];
      }

      var3[class240.field3107.rsOrdinal()] = !var7 && !var5?this.mapRegions[var1 + 1][var2 + 1]:null;
      var3[class240.field3103.rsOrdinal()] = !var7 && !var4?this.mapRegions[var1 - 1][var2 + 1]:null;
      var3[class240.field3097.rsOrdinal()] = var5?null:this.mapRegions[var1 + 1][var2];
      var3[class240.field3102.rsOrdinal()] = var4?null:this.mapRegions[var1 - 1][var2];
      var3[class240.field3100.rsOrdinal()] = var6?null:this.mapRegions[var1][var2 - 1];
      var3[class240.field3099.rsOrdinal()] = !var6 && !var5?this.mapRegions[var1 + 1][var2 - 1]:null;
      var3[class240.field3098.rsOrdinal()] = !var6 && !var4?this.mapRegions[var1 - 1][var2 - 1]:null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "2097379080"
   )
   public void method486(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(this.field266 != null) {
         this.field266.method5853(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field267 == null) {
               this.method505();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if(!var8.hasNext()) {
                     return;
                  }

                  int var9 = ((Integer)var8.next()).intValue();
                  var10 = (List)this.field267.get(Integer.valueOf(var9));
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  MapIcon var12 = (MapIcon)var11.next();
                  int var13 = var3 * (var12.field236.worldX - this.mapSurfaceBaseOffsetX) / this.field274;
                  int var14 = var4 - (var12.field236.worldY - this.mapSurfaceBaseOffsetY) * var4 / this.field270;
                  Rasterizer2D.method5784(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-1764374656"
   )
   public List method487(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.getRegionRectForViewport(var1, var2, var3, var4);
         float var13 = this.getPixelsPerTile(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.mapSurfaceBaseOffsetX + var1;
         int var16 = var2 + this.mapSurfaceBaseOffsetY;

         for(int var17 = var12.worldMapRegionX; var17 < var12.worldMapRegionX + var12.worldMapRegionWidth; ++var17) {
            for(int var18 = var12.worldMapRegionY; var18 < var12.worldMapRegionY + var12.worldMapRegionHeight; ++var18) {
               List var19 = this.mapRegions[var17][var18].method319(var5 + var14 * (this.mapRegions[var17][var18].field191 * 64 - var15) / 64, var8 + var6 - var14 * (this.mapRegions[var17][var18].field192 * 64 - var16 + 64) / 64, var14, var9, var10);
               if(!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIS)Lt;",
      garbageValue = "1596"
   )
   @Export("getRegionRectForViewport")
   WorldMapRectangle getRegionRectForViewport(int x1, int y1, int x2, int y2) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.mapSurfaceBaseOffsetX + x1;
      int var7 = y1 + this.mapSurfaceBaseOffsetY;
      int var8 = x2 + this.mapSurfaceBaseOffsetX;
      int var9 = y2 + this.mapSurfaceBaseOffsetY;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.worldMapRegionWidth = var12 - var10 + 1;
      var5.worldMapRegionHeight = var13 - var11 + 1;
      var5.worldMapRegionX = var10 - this.field265.getMinX();
      var5.worldMapRegionY = var11 - this.field265.getMinY();
      if(var5.worldMapRegionX < 0) {
         var5.worldMapRegionWidth += var5.worldMapRegionX;
         var5.worldMapRegionX = 0;
      }

      if(var5.worldMapRegionX > this.mapRegions.length - var5.worldMapRegionWidth) {
         var5.worldMapRegionWidth = this.mapRegions.length - var5.worldMapRegionX;
      }

      if(var5.worldMapRegionY < 0) {
         var5.worldMapRegionHeight += var5.worldMapRegionY;
         var5.worldMapRegionY = 0;
      }

      if(var5.worldMapRegionY > this.mapRegions[0].length - var5.worldMapRegionHeight) {
         var5.worldMapRegionHeight = this.mapRegions[0].length - var5.worldMapRegionY;
      }

      var5.worldMapRegionWidth = Math.min(var5.worldMapRegionWidth, this.mapRegions.length);
      var5.worldMapRegionHeight = Math.min(var5.worldMapRegionHeight, this.mapRegions[0].length);
      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2090974664"
   )
   @Export("getLoaded")
   public boolean getLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "-63"
   )
   public HashMap method489() {
      this.method505();
      return this.field267;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "21"
   )
   void method505() {
      if(this.field267 == null) {
         this.field267 = new HashMap();
      }

      this.field267.clear();

      for(int var1 = 0; var1 < this.mapRegions.length; ++var1) {
         for(int var2 = 0; var2 < this.mapRegions[var1].length; ++var2) {
            List var3 = this.mapRegions[var1][var2].method356();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               MapIcon var5 = (MapIcon)var4.next();
               if(!this.field267.containsKey(Integer.valueOf(var5.areaId))) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field267.put(Integer.valueOf(var5.areaId), var6);
               } else {
                  List var7 = (List)this.field267.get(Integer.valueOf(var5.areaId));
                  var7.add(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)F",
      garbageValue = "-168004314"
   )
   @Export("getPixelsPerTile")
   float getPixelsPerTile(int graphicsDiff, int worldDiff) {
      float var3 = (float)graphicsDiff / (float)worldDiff;
      if(var3 > 8.0F) {
         return 8.0F;
      } else if(var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F?(float)var4:var3;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1780304289"
   )
   @Export("adjustHSLListness0")
   static final int adjustHSLListness0(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-28"
   )
   static void method484() {
      Client.field626.method1978();
      Client.field626.packetBuffer.offset = 0;
      Client.field626.serverPacket = null;
      Client.field626.field1215 = null;
      Client.field626.field1226 = null;
      Client.field626.field1227 = null;
      Client.field626.packetLength = 0;
      Client.field626.field1228 = 0;
      Client.field598 = 0;
      Client.menuOptionCount = 0;
      Client.isMenuOpen = false;
      Client.field810 = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.cachedPlayers[var0] = null;
      }

      class138.localPlayer = null;

      for(var0 = 0; var0 < Client.cachedNPCs.length; ++var0) {
         NPC var1 = Client.cachedNPCs[var0];
         if(var1 != null) {
            var1.interacting = -1;
            var1.field898 = false;
         }
      }

      ItemContainer.itemContainers = new HashTable(32);
      MouseInput.setGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field697[var0] = true;
      }

      PacketNode var3 = class26.method433(ClientPacket.field2215, Client.field626.field1218);
      PacketBuffer var4 = var3.packetBuffer;
      int var2 = Client.isResized?2:1;
      var4.putByte(var2);
      var3.packetBuffer.putShort(Varcs.canvasWidth);
      var3.packetBuffer.putShort(BuildType.canvasHeight);
      Client.field626.method1980(var3);
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-248203091"
   )
   static final void method516() {
      if(Client.field627 > 0) {
         SoundTask.method2213();
      } else {
         Client.field804.method5262();
         MouseInput.setGameState(40);
         PendingSpawn.field869 = Client.field626.getSocket();
         Client.field626.method1984();
      }
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "993240466"
   )
   static final void method500(boolean var0, PacketBuffer var1) {
      while(true) {
         if(var1.bitsAvail(Client.field626.packetLength) >= 27) {
            int var2 = var1.getBits(15);
            if(var2 != 32767) {
               boolean var3 = false;
               if(Client.cachedNPCs[var2] == null) {
                  Client.cachedNPCs[var2] = new NPC();
                  var3 = true;
               }

               NPC var4 = Client.cachedNPCs[var2];
               Client.npcIndices[++Client.npcIndexesCount - 1] = var2;
               var4.npcCycle = Client.gameCycle;
               int var5;
               if(var0) {
                  var5 = var1.getBits(8);
                  if(var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.getBits(5);
                  if(var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = Client.field706[var1.getBits(3)];
               if(var3) {
                  var4.orientation = var4.angle = var6;
               }

               int var7 = var1.getBits(1);
               int var8;
               if(var0) {
                  var8 = var1.getBits(8);
                  if(var8 > 127) {
                     var8 -= 256;
                  }
               } else {
                  var8 = var1.getBits(5);
                  if(var8 > 15) {
                     var8 -= 32;
                  }
               }

               var4.composition = HorizontalAlignment.getNpcDefinition(var1.getBits(14));
               int var9 = var1.getBits(1);
               if(var9 == 1) {
                  Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var2;
               }

               var4.field874 = var4.composition.size;
               var4.field924 = var4.composition.rotation;
               if(var4.field924 == 0) {
                  var4.angle = 0;
               }

               var4.field899 = var4.composition.walkingAnimation;
               var4.field880 = var4.composition.rotate180Animation;
               var4.field870 = var4.composition.rotate90RightAnimation;
               var4.field882 = var4.composition.rotate90LeftAnimation;
               var4.idlePoseAnimation = var4.composition.standingAnimation;
               var4.field877 = var4.composition.field3496;
               var4.field878 = var4.composition.field3486;
               var4.method1788(class138.localPlayer.pathX[0] + var5, class138.localPlayer.pathY[0] + var8, var7 == 1);
               continue;
            }
         }

         var1.byteAccess();
         return;
      }
   }
}
