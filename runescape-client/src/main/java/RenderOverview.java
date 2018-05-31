import java.util.Arrays;
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

@ObfuscatedName("lw")
@Implements("RenderOverview")
public class RenderOverview {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   IndexDataBase field3828;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   Font field3820;
   @ObfuscatedName("b")
   @Export("mapFonts")
   HashMap mapFonts;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   IndexedSprite[] field3822;
   @ObfuscatedName("f")
   @Export("worldMapDataByIdentifier")
   HashMap worldMapDataByIdentifier;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "La;"
   )
   WorldMapData field3838;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "La;"
   )
   @Export("worldMapData")
   WorldMapData worldMapData;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "La;"
   )
   WorldMapData field3826;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   @Export("worldMapManager")
   WorldMapManager worldMapManager;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   class320 field3850;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 640072687
   )
   @Export("worldMapX")
   int worldMapX;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 314484059
   )
   @Export("worldMapY")
   int worldMapY;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1575595231
   )
   @Export("worldMapTargetX")
   int worldMapTargetX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1578040029
   )
   @Export("worldMapTargetY")
   int worldMapTargetY;
   @ObfuscatedName("h")
   @Export("worldMapZoom")
   float worldMapZoom;
   @ObfuscatedName("c")
   @Export("worldMapZoomTarget")
   float worldMapZoomTarget;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 210351443
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1371520523
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1930449845
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1765168797
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 341806885
   )
   int field3857;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1881066871
   )
   int field3840;
   @ObfuscatedName("as")
   boolean field3841;
   @ObfuscatedName("an")
   HashSet field3842;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1533461197
   )
   int field3855;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -501402207
   )
   int field3819;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 280848309
   )
   int field3845;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 952249319
   )
   int field3846;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1195910985
   )
   int field3847;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1408517871
   )
   int field3817;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 4567340279869879809L
   )
   long field3849;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 562409135
   )
   int field3864;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1462470627
   )
   int field3851;
   @ObfuscatedName("al")
   boolean field3852;
   @ObfuscatedName("aq")
   HashSet field3853;
   @ObfuscatedName("ad")
   HashSet field3843;
   @ObfuscatedName("aj")
   HashSet field3844;
   @ObfuscatedName("ax")
   HashSet field3856;
   @ObfuscatedName("am")
   boolean field3854;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1605454263
   )
   int field3861;
   @ObfuscatedName("bk")
   final int[] field3859;
   @ObfuscatedName("bp")
   List field3860;
   @ObfuscatedName("bi")
   Iterator field3848;
   @ObfuscatedName("bj")
   HashSet field3862;
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   Coordinates field3863;
   @ObfuscatedName("bq")
   public boolean field3839;
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   SpritePixels field3865;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -699671279
   )
   int field3866;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -630279697
   )
   int field3811;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -2005376561
   )
   int field3868;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 503210017
   )
   int field3869;

   static {
      fontNameVerdana11 = FontName.field3673;
      fontNameVerdana13 = FontName.field3670;
      fontNameVerdana15 = FontName.field3669;
   }

   public RenderOverview() {
      this.worldMapTargetX = -1;
      this.worldMapTargetY = -1;
      this.worldMapDisplayWidth = -1;
      this.worldMapDisplayHeight = -1;
      this.worldMapDisplayX = -1;
      this.worldMapDisplayY = -1;
      this.field3857 = 3;
      this.field3840 = 50;
      this.field3841 = false;
      this.field3842 = null;
      this.field3855 = -1;
      this.field3819 = -1;
      this.field3845 = -1;
      this.field3846 = -1;
      this.field3847 = -1;
      this.field3817 = -1;
      this.field3852 = true;
      this.field3853 = new HashSet();
      this.field3843 = new HashSet();
      this.field3844 = new HashSet();
      this.field3856 = new HashSet();
      this.field3854 = false;
      this.field3861 = 0;
      this.field3859 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field3862 = new HashSet();
      this.field3863 = null;
      this.field3839 = false;
      this.field3811 = -1;
      this.field3868 = -1;
      this.field3869 = -1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lkj;Ljava/util/HashMap;[Lly;B)V",
      garbageValue = "5"
   )
   public void method6000(IndexDataBase var1, Font var2, HashMap var3, IndexedSprite[] var4) {
      this.field3822 = var4;
      this.field3828 = var1;
      this.field3820 = var2;
      this.mapFonts = new HashMap();
      this.mapFonts.put(Size.field70, var3.get(fontNameVerdana11));
      this.mapFonts.put(Size.field71, var3.get(fontNameVerdana13));
      this.mapFonts.put(Size.field72, var3.get(fontNameVerdana15));
      this.field3850 = new class320(var1);
      int var5 = this.field3828.getFile(MapCacheArchiveNames.DETAILS.name);
      int[] var6 = this.field3828.getChilds(var5);
      this.worldMapDataByIdentifier = new HashMap(var6.length);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         Buffer var8 = new Buffer(this.field3828.getConfigData(var5, var6[var7]));
         WorldMapData var9 = new WorldMapData();
         var9.loadMapData(var8, var6[var7]);
         this.worldMapDataByIdentifier.put(var9.getIdentifier(), var9);
         if(var9.method208()) {
            this.field3838 = var9;
         }
      }

      this.method6015(this.field3838);
      this.field3826 = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "15"
   )
   public int method6094() {
      return this.field3828.tryLoadRecordByNames(this.field3838.getIdentifier(), MapCacheArchiveNames.AREA.name)?100:this.field3828.archiveLoadPercentByName(this.field3838.getIdentifier());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2020883954"
   )
   public void method6013() {
      WorldComparator.method7();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIZIIIII)V",
      garbageValue = "-767391754"
   )
   public void method6003(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if(this.field3850.method5987()) {
         this.moveTowardZoomTarget();
         this.moveTowardLocationTarget();
         if(var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.worldMapZoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.worldMapZoom));
            List var10 = this.worldMapManager.method487(this.worldMapX - var8 / 2 - 1, this.worldMapY - var9 / 2 - 1, var8 / 2 + this.worldMapX + 1, var9 / 2 + this.worldMapY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            MapIcon var13;
            ScriptEvent var14;
            MapIconReference var15;
            for(var12 = var10.iterator(); var12.hasNext(); class68.method1696(var14)) {
               var13 = (MapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new MapIconReference(var13.areaId, var13.field243, var13.field236);
               var14.method1024(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
               if(this.field3862.contains(var13)) {
                  var14.method1025(17);
               } else {
                  var14.method1025(15);
               }
            }

            var12 = this.field3862.iterator();

            while(var12.hasNext()) {
               var13 = (MapIcon)var12.next();
               if(!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new MapIconReference(var13.areaId, var13.field243, var13.field236);
                  var14.method1024(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
                  var14.method1025(16);
                  class68.method1696(var14);
               }
            }

            this.field3862 = var11;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIZZB)V",
      garbageValue = "110"
   )
   public void method6174(int var1, int var2, boolean var3, boolean var4) {
      long var5 = Buffer.method3547();
      this.method6036(var1, var2, var4, var5);
      if(!this.hasTargetPosition() && (var4 || var3)) {
         if(var4) {
            this.field3847 = var1;
            this.field3817 = var2;
            this.field3845 = this.worldMapX;
            this.field3846 = this.worldMapY;
         }

         if(this.field3845 != -1) {
            int var7 = var1 - this.field3847;
            int var8 = var2 - this.field3817;
            this.setWorldMapPosition(this.field3845 - (int)((float)var7 / this.worldMapZoomTarget), (int)((float)var8 / this.worldMapZoomTarget) + this.field3846, false);
         }
      } else {
         this.method6009();
      }

      if(var4) {
         this.field3849 = var5;
         this.field3864 = var1;
         this.field3851 = var2;
      }

   }

   @ObfuscatedName("q")
   void method6036(int var1, int var2, boolean var3, long var4) {
      if(this.worldMapData != null) {
         int var6 = (int)((float)this.worldMapX + ((float)(var1 - this.worldMapDisplayX) - (float)this.method6142() * this.worldMapZoom / 2.0F) / this.worldMapZoom);
         int var7 = (int)((float)this.worldMapY - ((float)(var2 - this.worldMapDisplayY) - (float)this.method6038() * this.worldMapZoom / 2.0F) / this.worldMapZoom);
         this.field3863 = this.worldMapData.method205(var6 + this.worldMapData.getMinX() * 64, var7 + this.worldMapData.getMinY() * 64);
         if(this.field3863 != null && var3) {
            boolean var8 = Client.rights >= 2;
            if(var8 && KeyFocusListener.keyPressed[82] && KeyFocusListener.keyPressed[81]) {
               WorldMapDecoration.method197(this.field3863.worldX, this.field3863.worldY, this.field3863.plane, false);
            } else {
               boolean var9 = true;
               if(this.field3852) {
                  int var10 = var1 - this.field3864;
                  int var11 = var2 - this.field3851;
                  if(var4 - this.field3849 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                     var9 = false;
                  }
               }

               if(var9) {
                  PacketNode var12 = class26.method433(ClientPacket.field2190, Client.field626.field1218);
                  var12.packetBuffer.method3673(this.field3863.bitpack());
                  Client.field626.method1980(var12);
                  this.field3849 = 0L;
               }
            }
         }
      } else {
         this.field3863 = null;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1696035308"
   )
   @Export("moveTowardZoomTarget")
   void moveTowardZoomTarget() {
      if(class21.field175 != null) {
         this.worldMapZoom = this.worldMapZoomTarget;
      } else {
         if(this.worldMapZoom < this.worldMapZoomTarget) {
            this.worldMapZoom = Math.min(this.worldMapZoomTarget, this.worldMapZoom / 30.0F + this.worldMapZoom);
         }

         if(this.worldMapZoom > this.worldMapZoomTarget) {
            this.worldMapZoom = Math.max(this.worldMapZoomTarget, this.worldMapZoom - this.worldMapZoom / 30.0F);
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1083036855"
   )
   @Export("moveTowardLocationTarget")
   void moveTowardLocationTarget() {
      if(this.hasTargetPosition()) {
         int var1 = this.worldMapTargetX - this.worldMapX;
         int var2 = this.worldMapTargetY - this.worldMapY;
         if(var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.setWorldMapPosition(var1 + this.worldMapX, var2 + this.worldMapY, true);
         if(this.worldMapTargetX == this.worldMapX && this.worldMapTargetY == this.worldMapY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "1580354499"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int worldMapX, int worldMapY, boolean changeSurface) {
      this.worldMapX = worldMapX;
      this.worldMapY = worldMapY;
      Buffer.method3547();
      if(changeSurface) {
         this.method6009();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1442758929"
   )
   final void method6009() {
      this.field3817 = -1;
      this.field3847 = -1;
      this.field3846 = -1;
      this.field3845 = -1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1688865495"
   )
   @Export("hasTargetPosition")
   boolean hasTargetPosition() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIS)La;",
      garbageValue = "-9559"
   )
   @Export("getWorldMapDataContainingCoord")
   public WorldMapData getWorldMapDataContainingCoord(int var1, int var2, int var3) {
      Iterator var4 = this.worldMapDataByIdentifier.values().iterator();

      WorldMapData var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapData)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-2147350367"
   )
   public void method6011(int var1, int var2, int var3, boolean var4) {
      WorldMapData var5 = this.getWorldMapDataContainingCoord(var1, var2, var3);
      if(var5 == null) {
         if(!var4) {
            return;
         }

         var5 = this.field3838;
      }

      boolean var6 = false;
      if(var5 != this.field3826 || var4) {
         this.field3826 = var5;
         this.method6015(var5);
         var6 = true;
      }

      if(var6 || var4) {
         this.method6058(var1, var2, var3);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "914816910"
   )
   public void method6012(int var1) {
      WorldMapData var2 = this.getWorldMapDataByFileId(var1);
      if(var2 != null) {
         this.method6015(var2);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1089700319"
   )
   public int method6153() {
      return this.worldMapData == null?-1:this.worldMapData.getFileId();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)La;",
      garbageValue = "7"
   )
   public WorldMapData method6014() {
      return this.worldMapData;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-118"
   )
   void method6015(WorldMapData var1) {
      if(this.worldMapData == null || var1 != this.worldMapData) {
         this.initializeWorldMap(var1);
         this.method6058(-1, -1, -1);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(La;I)V",
      garbageValue = "1835547139"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapData var1) {
      this.worldMapData = var1;
      this.worldMapManager = new WorldMapManager(this.field3822, this.mapFonts);
      this.field3850.method5995(this.worldMapData.getIdentifier());
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(La;Lha;Lha;ZB)V",
      garbageValue = "64"
   )
   public void method6073(WorldMapData var1, Coordinates var2, Coordinates var3, boolean var4) {
      if(var1 != null) {
         if(this.worldMapData == null || var1 != this.worldMapData) {
            this.initializeWorldMap(var1);
         }

         if(!var4 && this.worldMapData.containsCoord(var2.plane, var2.worldX, var2.worldY)) {
            this.method6058(var2.plane, var2.worldX, var2.worldY);
         } else {
            this.method6058(var3.plane, var3.worldX, var3.worldY);
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "1"
   )
   void method6058(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method213(var1, var2, var3);
         if(var4 == null) {
            var4 = this.worldMapData.method213(this.worldMapData.method218(), this.worldMapData.method217(), this.worldMapData.method219());
         }

         this.setWorldMapPosition(var4[0] - this.worldMapData.getMinX() * 64, var4[1] - this.worldMapData.getMinY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
         this.worldMapZoom = this.worldMapZoomPercentToFloat(this.worldMapData.getInitialMapSurfaceZoom());
         this.worldMapZoomTarget = this.worldMapZoom;
         this.field3860 = null;
         this.field3848 = null;
         this.worldMapManager.method482();
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "115608881"
   )
   @Export("extractWorldmap")
   public void extractWorldmap(int graphicsX, int graphicsY, int width, int height, int gameCycle) {
      int[] var6 = new int[4];
      Rasterizer2D.copyDrawRegion(var6);
      Rasterizer2D.setDrawRegion(graphicsX, graphicsY, width + graphicsX, graphicsY + height);
      Rasterizer2D.Rasterizer2D_fillRectangle(graphicsX, graphicsY, width, height, -16777216);
      int var7 = this.field3850.method5988();
      if(var7 < 100) {
         this.method6024(graphicsX, graphicsY, width, height, var7);
      } else {
         if(!this.worldMapManager.getLoaded()) {
            this.worldMapManager.load(this.field3828, this.worldMapData.getIdentifier(), Client.isMembers);
            if(!this.worldMapManager.getLoaded()) {
               return;
            }
         }

         if(this.field3842 != null) {
            ++this.field3819;
            if(this.field3819 % this.field3840 == 0) {
               this.field3819 = 0;
               ++this.field3855;
            }

            if(this.field3855 >= this.field3857 && !this.field3841) {
               this.field3842 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)width / this.worldMapZoom));
         int var9 = (int)Math.ceil((double)((float)height / this.worldMapZoom));
         this.worldMapManager.drawMapRegion(this.worldMapX - var8 / 2, this.worldMapY - var9 / 2, var8 / 2 + this.worldMapX, var9 / 2 + this.worldMapY, graphicsX, graphicsY, width + graphicsX, graphicsY + height);
         boolean var10;
         if(!this.field3854) {
            var10 = false;
            if(gameCycle - this.field3861 > 100) {
               this.field3861 = gameCycle;
               var10 = true;
            }

            this.worldMapManager.drawMapIcons(this.worldMapX - var8 / 2, this.worldMapY - var9 / 2, var8 / 2 + this.worldMapX, var9 / 2 + this.worldMapY, graphicsX, graphicsY, width + graphicsX, graphicsY + height, this.field3856, this.field3842, this.field3819, this.field3840, var10);
         }

         this.method6182(graphicsX, graphicsY, width, height, var8, var9);
         var10 = Client.rights >= 2;
         if(var10 && this.field3839 && this.field3863 != null) {
            this.field3820.method5522("Coord: " + this.field3863, Rasterizer2D.draw_region_x + 10, Rasterizer2D.drawingAreaTop + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = graphicsX;
         this.worldMapDisplayY = graphicsY;
         Rasterizer2D.setDrawRegion(var6);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIIII)Z",
      garbageValue = "-383028288"
   )
   boolean method6020(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.field3865 == null?true:(this.field3865.width == var1 && this.field3865.height == var2?(this.worldMapManager.field276 != this.field3866?true:(this.field3869 != Client.field650?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var2 + var4 < var6:true))):true);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "41"
   )
   void method6182(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class21.field175 != null) {
         int var7 = 512 / (this.worldMapManager.field276 * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.method6002() - var5 / 2 - var7;
         int var12 = this.method6035() - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - this.field3811) * this.worldMapManager.field276;
         int var14 = var2 - this.worldMapManager.field276 * (var7 - (var12 - this.field3868));
         if(this.method6020(var8, var9, var13, var14, var3, var4)) {
            if(this.field3865 != null && this.field3865.width == var8 && this.field3865.height == var9) {
               Arrays.fill(this.field3865.pixels, 0);
            } else {
               this.field3865 = new SpritePixels(var8, var9);
            }

            this.field3811 = this.method6002() - var5 / 2 - var7;
            this.field3868 = this.method6035() - var6 / 2 - var7;
            this.field3866 = this.worldMapManager.field276;
            class21.field175.method4776(this.field3811, this.field3868, this.field3865, (float)this.field3866 / var10);
            this.field3869 = Client.field650;
            var13 = var1 - (var7 + var11 - this.field3811) * this.worldMapManager.field276;
            var14 = var2 - this.worldMapManager.field276 * (var7 - (var12 - this.field3868));
         }

         Rasterizer2D.fillRectangle(var1, var2, var3, var4, 0, 128);
         if(var10 == 1.0F) {
            this.field3865.method5861(var13, var14, 192);
         } else {
            this.field3865.method5904(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-56"
   )
   @Export("extractData")
   public void extractData(int var1, int var2, int var3, int var4) {
      if(this.field3850.method5987()) {
         if(!this.worldMapManager.getLoaded()) {
            this.worldMapManager.load(this.field3828, this.worldMapData.getIdentifier(), Client.isMembers);
            if(!this.worldMapManager.getLoaded()) {
               return;
            }
         }

         this.worldMapManager.method486(var1, var2, var3, var4, this.field3842, this.field3819, this.field3840);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-26743"
   )
   public void method6023(int var1) {
      this.worldMapZoomTarget = this.worldMapZoomPercentToFloat(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IIIIIB)V",
      garbageValue = "0"
   )
   void method6024(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      Rasterizer2D.drawRectangle(var7 - 152, var8, 304, 34, -65536);
      Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.field3820.drawTextCentered("Loading...", var7, var6 + var8, -1, -1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)F",
      garbageValue = "-1588852449"
   )
   @Export("worldMapZoomPercentToFloat")
   float worldMapZoomPercentToFloat(int var1) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(var1 == 50?2.0F:(var1 == 75?3.0F:(var1 == 100?4.0F:8.0F))));
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1802681801"
   )
   public int method6026() {
      return 1.0D == (double)this.worldMapZoomTarget?25:(1.5D == (double)this.worldMapZoomTarget?37:(2.0D == (double)this.worldMapZoomTarget?50:((double)this.worldMapZoomTarget == 3.0D?75:((double)this.worldMapZoomTarget == 4.0D?100:200))));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "400054201"
   )
   public void method6027() {
      this.field3850.method5985();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1729229911"
   )
   public boolean method6096() {
      return this.field3850.method5987();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(II)La;",
      garbageValue = "-1585158345"
   )
   @Export("getWorldMapDataByFileId")
   public WorldMapData getWorldMapDataByFileId(int var1) {
      Iterator var2 = this.worldMapDataByIdentifier.values().iterator();

      WorldMapData var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (WorldMapData)var2.next();
      } while(var3.getFileId() != var1);

      return var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-123"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int surfaceX, int surfaceY) {
      if(this.worldMapData != null && this.worldMapData.surfaceContainsPosition(surfaceX, surfaceY)) {
         this.worldMapTargetX = surfaceX - this.worldMapData.getMinX() * 64;
         this.worldMapTargetY = surfaceY - this.worldMapData.getMinY() * 64;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "65"
   )
   public void method6031(int var1, int var2) {
      if(this.worldMapData != null) {
         this.setWorldMapPosition(var1 - this.worldMapData.getMinX() * 64, var2 - this.worldMapData.getMinY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "469904059"
   )
   public void method6046(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method213(var1, var2, var3);
         if(var4 != null) {
            this.setWorldMapPositionTarget(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "96"
   )
   public void method6033(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method213(var1, var2, var3);
         if(var4 != null) {
            this.method6031(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1656428330"
   )
   public int method6002() {
      return this.worldMapData == null?-1:this.worldMapX + this.worldMapData.getMinX() * 64;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1934425663"
   )
   public int method6035() {
      return this.worldMapData == null?-1:this.worldMapY + this.worldMapData.getMinY() * 64;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Lha;",
      garbageValue = "1824829427"
   )
   public Coordinates method6001() {
      return this.worldMapData == null?null:this.worldMapData.method205(this.method6002(), this.method6035());
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "102"
   )
   public int method6142() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-871007097"
   )
   public int method6038() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-27"
   )
   public void method6089(int var1) {
      if(var1 >= 1) {
         this.field3857 = var1;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-95"
   )
   public void method6040() {
      this.field3857 = 3;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-85"
   )
   public void method6041(int var1) {
      if(var1 >= 1) {
         this.field3840 = var1;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public void method6042() {
      this.field3840 = 50;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1525183262"
   )
   public void method6034(boolean var1) {
      this.field3841 = var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2131592771"
   )
   public void method6106(int var1) {
      this.field3842 = new HashSet();
      this.field3842.add(Integer.valueOf(var1));
      this.field3855 = 0;
      this.field3819 = 0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "778543526"
   )
   public void method6152(int var1) {
      this.field3842 = new HashSet();
      this.field3855 = 0;
      this.field3819 = 0;

      for(int var2 = 0; var2 < Area.mapAreaType.length; ++var2) {
         if(Area.mapAreaType[var2] != null && Area.mapAreaType[var2].field3240 == var1) {
            this.field3842.add(Integer.valueOf(Area.mapAreaType[var2].id));
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "120"
   )
   public void method6114() {
      this.field3842 = null;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1268087883"
   )
   public void method6047(boolean var1) {
      this.field3854 = !var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "64"
   )
   public void method6048(int var1, boolean var2) {
      if(!var2) {
         this.field3853.add(Integer.valueOf(var1));
      } else {
         this.field3853.remove(Integer.valueOf(var1));
      }

      this.method6053();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "2092620528"
   )
   public void method6049(int var1, boolean var2) {
      if(!var2) {
         this.field3843.add(Integer.valueOf(var1));
      } else {
         this.field3843.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < Area.mapAreaType.length; ++var3) {
         if(Area.mapAreaType[var3] != null && Area.mapAreaType[var3].field3240 == var1) {
            int var4 = Area.mapAreaType[var3].id;
            if(!var2) {
               this.field3844.add(Integer.valueOf(var4));
            } else {
               this.field3844.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method6053();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "432395832"
   )
   public boolean method6050() {
      return !this.field3854;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "21"
   )
   public boolean method6051(int var1) {
      return !this.field3853.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1955762729"
   )
   public boolean method6052(int var1) {
      return !this.field3843.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-248986247"
   )
   void method6053() {
      this.field3856.clear();
      this.field3856.addAll(this.field3853);
      this.field3856.addAll(this.field3844);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-766143801"
   )
   public void method6158(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field3850.method5987()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.worldMapZoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.worldMapZoom));
         List var9 = this.worldMapManager.method487(this.worldMapX - var7 / 2 - 1, this.worldMapY - var8 / 2 - 1, var7 / 2 + this.worldMapX + 1, var8 / 2 + this.worldMapY + 1, var1, var2, var3, var4, var5, var6);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               MapIcon var11 = (MapIcon)var10.next();
               Area var12 = Area.mapAreaType[var11.areaId];
               var13 = false;

               for(int var14 = this.field3859.length - 1; var14 >= 0; --var14) {
                  if(var12.field3244[var14] != null) {
                     class50.addMenuEntry(var12.field3244[var14], var12.field3255, this.field3859[var14], var11.areaId, var11.field243.bitpack(), var11.field236.bitpack());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(ILha;I)Lha;",
      garbageValue = "1593225606"
   )
   public Coordinates method6100(int var1, Coordinates var2) {
      if(!this.field3850.method5987()) {
         return null;
      } else if(!this.worldMapManager.getLoaded()) {
         return null;
      } else if(!this.worldMapData.surfaceContainsPosition(var2.worldX, var2.worldY)) {
         return null;
      } else {
         HashMap var3 = this.worldMapManager.method489();
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(var4 != null && !var4.isEmpty()) {
            MapIcon var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               MapIcon var8;
               int var11;
               do {
                  if(!var7.hasNext()) {
                     return var5.field236;
                  }

                  var8 = (MapIcon)var7.next();
                  int var9 = var8.field236.worldX - var2.worldX;
                  int var10 = var8.field236.worldY - var2.worldY;
                  var11 = var9 * var9 + var10 * var10;
                  if(var11 == 0) {
                     return var8.field236;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(IILha;Lha;B)V",
      garbageValue = "14"
   )
   @Export("onMapClicked")
   public void onMapClicked(int var1, int var2, Coordinates var3, Coordinates var4) {
      ScriptEvent var5 = new ScriptEvent();
      MapIconReference var6 = new MapIconReference(var2, var3, var4);
      var5.method1024(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.method1025(10);
         break;
      case 1009:
         var5.method1025(11);
         break;
      case 1010:
         var5.method1025(12);
         break;
      case 1011:
         var5.method1025(13);
         break;
      case 1012:
         var5.method1025(14);
      }

      class68.method1696(var5);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(S)Lab;",
      garbageValue = "32070"
   )
   public MapIcon method6146() {
      if(!this.field3850.method5987()) {
         return null;
      } else if(!this.worldMapManager.getLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapManager.method489();
         this.field3860 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field3860.addAll(var3);
         }

         this.field3848 = this.field3860.iterator();
         return this.method6186();
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(B)Lab;",
      garbageValue = "-46"
   )
   public MapIcon method6186() {
      return this.field3848 == null?null:(!this.field3848.hasNext()?null:(MapIcon)this.field3848.next());
   }
}
