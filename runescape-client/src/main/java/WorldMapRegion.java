import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   static class201 field188;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   static class201 field189;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   static final Coordinates field193;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1247610435
   )
   int field191;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1988652209
   )
   int field192;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lp;"
   )
   class10 field197;
   @ObfuscatedName("b")
   LinkedList field195;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1028613213
   )
   int field194;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1441464419
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("g")
   List field196;
   @ObfuscatedName("m")
   HashMap field199;
   @ObfuscatedName("r")
   @Export("mapFonts")
   final HashMap mapFonts;

   static {
      field188 = new class201(37748736, 256);
      field189 = new class201(256, 256);
      field193 = new Coordinates();
   }

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.field191 = var1;
      this.field192 = var2;
      this.field195 = new LinkedList();
      this.field196 = new LinkedList();
      this.field199 = new HashMap();
      this.field194 = var3 | -16777216;
      this.mapFonts = var4;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIIS)V",
      garbageValue = "-4430"
   )
   void method314(int var1, int var2, int var3) {
      int var5 = this.field191;
      int var6 = this.field192;
      int var7 = this.pixelsPerTile;
      SpritePixels var4 = (SpritePixels)field188.method3997(class43.method716(var5, var6, var7));
      if(var4 != null) {
         if(var3 == this.pixelsPerTile * 64) {
            var4.method5849(var1, var2);
         } else {
            var4.method5872(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lp;Ljava/util/List;I)V",
      garbageValue = "-463048404"
   )
   void method400(class10 var1, List var2) {
      this.field199.clear();
      this.field197 = var1;
      this.method294(0, 0, 64, 64, this.field197);
      this.method289(var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;B)V",
      garbageValue = "89"
   )
   void method287(HashSet var1, List var2) {
      this.field199.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class34 var4 = (class34)var3.next();
         if(var4.method149() == this.field191 && var4.method168() == this.field192) {
            this.field195.add(var4);
            this.method294(var4.method565() * 8, var4.method563() * 8, 8, 8, var4);
         }
      }

      this.method289(var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIILr;I)V",
      garbageValue = "-1457555663"
   )
   void method294(int var1, int var2, int var3, int var4, class16 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label55:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            Coordinates var8 = new Coordinates(0, var6, var7);

            for(int var9 = 0; var9 < var5.field121; ++var9) {
               WorldMapDecoration[] var10 = var5.decorations[var9][var6][var7];
               if(var10 != null && var10.length != 0) {
                  WorldMapDecoration[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     WorldMapDecoration var13 = var11[var12];
                     Area var14 = this.method348(var13.objectDefinitionId);
                     if(var14 != null) {
                        Coordinates var15 = new Coordinates(var9, this.field191 * 64 + var6, this.field192 * 64 + var7);
                        Coordinates var16 = null;
                        if(this.field197 != null) {
                           var16 = new Coordinates(this.field197.field120 + var9, var6 + this.field197.field127 * 64, var7 + this.field197.field117 * 64);
                        } else {
                           class34 var17 = (class34)var5;
                           var16 = new Coordinates(var9 + var17.field120, var6 + var17.field127 * 64 + var17.method584() * 8, var17.field117 * 64 + var7 + var17.method564() * 8);
                        }

                        MapIcon var18 = new MapIcon(var14.id, var16, var15, this.createMapLabel(var14));
                        this.field199.put(var8, var18);
                        continue label55;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;B)V",
      garbageValue = "-10"
   )
   void method289(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class13 var3 = (class13)var2.next();
         if(var3.field88.worldX >> 6 == this.field191 && var3.field88.worldY >> 6 == this.field192) {
            MapIcon var4 = new MapIcon(var3.field83, var3.field88, var3.field88, this.method306(var3.field83));
            this.field196.add(var4);
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILai;[Lh;[Lly;I)V",
      garbageValue = "2109575831"
   )
   void method290(int var1, class35 var2, WorldMapRegion[] var3, IndexedSprite[] var4) {
      this.pixelsPerTile = var1;
      if(this.field197 != null || !this.field195.isEmpty()) {
         int var6 = this.field191;
         int var7 = this.field192;
         SpritePixels var5 = (SpritePixels)field188.method3997(class43.method716(var6, var7, var1));
         if(var5 == null) {
            class21 var8 = this.method297(this.field191, this.field192, var3);
            SpritePixels var9 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
            var9.setRaster();
            if(this.field197 != null) {
               this.method293(var2, var3, var4, var8);
            } else {
               this.method373(var2, var4, var8);
            }

            PacketNode.method3458(var9, this.field191, this.field192, this.pixelsPerTile);
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "1346650712"
   )
   void method382(int var1, int var2, int var3, HashSet var4) {
      if(var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "476011751"
   )
   @Export("drawFlashingMapIcons")
   void drawFlashingMapIcons(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field199.values().iterator();

      while(var4.hasNext()) {
         MapIcon var5 = (MapIcon)var4.next();
         if(var1.contains(Integer.valueOf(var5.areaId))) {
            Area var6 = Area.mapAreaType[var5.areaId];
            this.method307(var6, var5.screenX, var5.screenY, var2, var3);
         }
      }

      this.method309(var1, var2, var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lai;[Lh;[Lly;Lj;I)V",
      garbageValue = "-488045984"
   )
   void method293(class35 var1, WorldMapRegion[] var2, IndexedSprite[] var3, class21 var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method320(var5, var6, this.field197, var1, var4);
            this.method296(var5, var6, this.field197, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method295(var5, var6, this.field197, var1, var3);
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lai;[Lly;Lj;B)V",
      garbageValue = "-48"
   )
   void method373(class35 var1, IndexedSprite[] var2, class21 var3) {
      Iterator var4 = this.field195.iterator();

      class34 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class34)var4.next();

         for(var6 = var5.method565() * 8; var6 < var5.method565() * 8 + 8; ++var6) {
            for(var7 = var5.method563() * 8; var7 < var5.method563() * 8 + 8; ++var7) {
               this.method320(var6, var7, var5, var1, var3);
               this.method296(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field195.iterator();

      while(var4.hasNext()) {
         var5 = (class34)var4.next();

         for(var6 = var5.method565() * 8; var6 < var5.method565() * 8 + 8; ++var6) {
            for(var7 = var5.method563() * 8; var7 < var5.method563() * 8 + 8; ++var7) {
               this.method295(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;[Lly;I)V",
      garbageValue = "1267553766"
   )
   void method295(int var1, int var2, class16 var3, class35 var4, IndexedSprite[] var5) {
      this.method304(var1, var2, var3);
      this.method406(var1, var2, var3, var5);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;Lj;I)V",
      garbageValue = "126232194"
   )
   void method320(int var1, int var2, class16 var3, class35 var4, class21 var5) {
      int var6 = var3.field125[0][var1][var2] - 1;
      int var7 = var3.field123[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.field194);
      }

      int var8 = 16711935;
      if(var7 != -1) {
         var8 = class6.method69(var7, this.field194);
      }

      if(var7 > -1 && var3.field124[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         int var9 = this.method302(var1, var2, var3, var5);
         if(var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method606(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field124[0][var1][var2], var3.field116[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;I)V",
      garbageValue = "1017441024"
   )
   void method296(int var1, int var2, class16 var3, class35 var4) {
      for(int var5 = 1; var5 < var3.field121; ++var5) {
         int var6 = var3.field123[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var7 = class6.method69(var6, this.field194);
            if(var3.field124[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method606(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field124[var5][var1][var2], var3.field116[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II[Lh;I)Lj;",
      garbageValue = "-1376488982"
   )
   class21 method297(int var1, int var2, WorldMapRegion[] worldMapRegions) {
      class21 var4 = (class21)field189.method3997(class43.method716(var1, var2, 0));
      class21 var5 = var4;
      if(var4 == null) {
         var5 = this.method298(worldMapRegions);
         Size.method104(var5, var1, var2);
      }

      return var5;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "([Lh;B)Lj;",
      garbageValue = "6"
   )
   class21 method298(WorldMapRegion[] var1) {
      class32 var2 = new class32(64, 64);
      if(this.field197 != null) {
         this.method300(0, 0, 64, 64, this.field197, var2);
      } else {
         Iterator var3 = this.field195.iterator();

         while(var3.hasNext()) {
            class34 var4 = (class34)var3.next();
            this.method300(var4.method565() * 8, var4.method563() * 8, 8, 8, var4, var2);
         }
      }

      this.method299(var1, var2);
      class21 var5 = new class21();
      var5.method265(var2);
      return var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Lh;Lan;I)V",
      garbageValue = "1463076234"
   )
   void method299(WorldMapRegion[] var1, class32 var2) {
      class240[] var3 = class9.method85();
      class240[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class240 var6 = var4[var5];
         if(var1[var6.rsOrdinal()] != null) {
            byte var7 = 0;
            byte var8 = 0;
            byte var9 = 64;
            byte var10 = 64;
            byte var11 = 0;
            byte var12 = 0;
            switch(var6.field3104) {
            case 0:
               var8 = 59;
               var10 = 5;
               var11 = 59;
               var9 = 5;
               break;
            case 1:
               var11 = 59;
               var9 = 5;
               break;
            case 2:
               var12 = 59;
               var10 = 5;
               var7 = 59;
               var9 = 5;
               break;
            case 3:
               var8 = 59;
               var10 = 5;
               break;
            case 4:
               var11 = 59;
               var12 = 59;
               var9 = 5;
               var10 = 5;
               break;
            case 5:
               var8 = 59;
               var10 = 5;
               var7 = 59;
               var9 = 5;
               break;
            case 6:
               var12 = 59;
               var10 = 5;
               break;
            case 7:
               var7 = 59;
               var9 = 5;
            }

            this.method301(var11, var12, var7, var8, var9, var10, var1[var6.rsOrdinal()], var2);
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIILr;Lan;I)V",
      garbageValue = "1938287225"
   )
   void method300(int var1, int var2, int var3, int var4, class16 var5, class32 var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            int var9 = var5.field125[0][var7][var8] - 1;
            if(var9 != -1) {
               FloorUnderlayDefinition var10 = class49.getUnderlayDefinition(var9);
               var6.method541(var7, var8, 5, var10);
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIIILh;Lan;I)V",
      garbageValue = "2106846136"
   )
   void method301(int var1, int var2, int var3, int var4, int var5, int var6, WorldMapRegion var7, class32 var8) {
      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            int var11 = var7.method322(var9 + var1, var10 + var2);
            if(var11 != -1) {
               FloorUnderlayDefinition var12 = class49.getUnderlayDefinition(var11);
               var8.method541(var3 + var9, var10 + var4, 5, var12);
            }
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IILr;Lj;I)I",
      garbageValue = "-2041354337"
   )
   int method302(int var1, int var2, class16 var3, class21 var4) {
      return var3.field125[0][var1][var2] == 0?this.field194:var4.method272(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IILr;[Lly;I)V",
      garbageValue = "-1488997280"
   )
   void method406(int var1, int var2, class16 var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.field121; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if(var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               if(!RunException.method3247(var9.decoration)) {
                  int var11 = var9.decoration;
                  boolean var10 = var11 == WorldMapDecorationType.field2776.rsOrdinal;
                  if(!var10) {
                     continue;
                  }
               }

               ObjectComposition var12 = FileOnDisk.getObjectDefinition(var9.objectDefinitionId);
               if(var12.mapSceneId != -1) {
                  if(var12.mapSceneId != 46 && var12.mapSceneId != 52) {
                     var4[var12.mapSceneId].method5825(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                  } else {
                     var4[var12.mapSceneId].method5825(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IILr;B)V",
      garbageValue = "-83"
   )
   void method304(int var1, int var2, class16 var3) {
      for(int var4 = 0; var4 < var3.field121; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               if(FaceNormal.method3073(var8.decoration)) {
                  ObjectComposition var9 = FileOnDisk.getObjectDefinition(var8.objectDefinitionId);
                  int var10 = var9.int1 != 0?-3407872:-3355444;
                  if(var8.decoration == WorldMapDecorationType.field2773.rsOrdinal) {
                     this.method321(var1, var2, var8.rotation, var10);
                  }

                  if(var8.decoration == WorldMapDecorationType.field2755.rsOrdinal) {
                     this.method321(var1, var2, var8.rotation, -3355444);
                     this.method321(var1, var2, var8.rotation + 1, var10);
                  }

                  if(var8.decoration == WorldMapDecorationType.field2757.rsOrdinal) {
                     if(var8.rotation == 0) {
                        Rasterizer2D.method5736(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if(var8.rotation == 1) {
                        Rasterizer2D.method5736(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if(var8.rotation == 2) {
                        Rasterizer2D.method5736(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }

                     if(var8.rotation == 3) {
                        Rasterizer2D.method5736(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }
                  }

                  if(var8.decoration == WorldMapDecorationType.field2758.rsOrdinal) {
                     int var11 = var8.rotation % 2;
                     int var12;
                     if(var11 == 0) {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.method5736(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.method5736(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-22"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field199.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         Coordinates var9 = (Coordinates)var8.getKey();
         int var10 = (int)((float)var9.worldX * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.worldY * var5 - var6);
         MapIcon var12 = (MapIcon)var8.getValue();
         if(var12 != null) {
            var12.screenX = var10;
            var12.screenY = var11;
            Area var13 = Area.mapAreaType[var12.areaId];
            if(!var3.contains(Integer.valueOf(var13.method4821()))) {
               this.method308(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "1896087870"
   )
   void method309(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field196.iterator();

      while(var4.hasNext()) {
         MapIcon var5 = (MapIcon)var4.next();
         Area var6 = Area.mapAreaType[var5.areaId];
         if(var6 != null && var1.contains(Integer.valueOf(var6.method4821()))) {
            this.method307(var6, var5.screenX, var5.screenY, var2, var3);
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lie;IIIII)V",
      garbageValue = "112631536"
   )
   void method307(Area var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.getMapIcon(false);
      if(var6 != null) {
         var6.drawAt(var2 - var6.width / 2, var3 - var6.height / 2);
         if(var4 % var5 < var5 / 2) {
            Rasterizer2D.method5784(var2, var3, 15, 16776960, 128);
            Rasterizer2D.method5784(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lab;IIFI)V",
      garbageValue = "-1276060102"
   )
   void method308(MapIcon var1, int var2, int var3, float var4) {
      Area var5 = Area.mapAreaType[var1.areaId];
      this.method317(var5, var2, var3);
      this.method362(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Lie;III)V",
      garbageValue = "-1923264171"
   )
   void method317(Area var1, int var2, int var3) {
      SpritePixels var4 = var1.getMapIcon(false);
      if(var4 != null) {
         int var5 = this.method288(var4, var1.horizontalAlignment);
         int var6 = this.method284(var4, var1.verticalAlignment);
         var4.drawAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lab;Lie;IIFB)V",
      garbageValue = "1"
   )
   void method362(MapIcon mapIcon, Area var2, int var3, int var4, float var5) {
      if(mapIcon.field246 != null) {
         if(mapIcon.field246.fontSize.method103(var5)) {
            Font var6 = (Font)this.mapFonts.get(mapIcon.field246.fontSize);
            var6.method5526(mapIcon.field246.text, var3 - mapIcon.field246.field184 / 2, var4, mapIcon.field246.field184, mapIcon.field246.field182, -16777216 | var2.field3242, 0, 1, 0, var6.verticalSpace / 2);
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-39"
   )
   @Export("drawMapLinks")
   void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field196.iterator();

      while(var6.hasNext()) {
         MapIcon var7 = (MapIcon)var6.next();
         int var8 = var7.field236.worldX % 64;
         int var9 = var7.field236.worldY % 64;
         var7.screenX = (int)((float)var1 + var5 * (float)var8);
         var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
         if(!var3.contains(Integer.valueOf(var7.areaId))) {
            this.method308(var7, var7.screenX, var7.screenY, var5);
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   void method340() {
      if(this.field197 != null) {
         for(int var1 = 0; var1 < 64; ++var1) {
            for(int var2 = 0; var2 < 64; ++var2) {
               this.method313(var1, var2, this.field197);
            }
         }
      } else {
         Iterator var5 = this.field195.iterator();

         while(var5.hasNext()) {
            class34 var6 = (class34)var5.next();

            for(int var3 = var6.method565() * 8; var3 < var6.method565() * 8 + 8; ++var3) {
               for(int var4 = var6.method563() * 8; var4 < var6.method563() * 8 + 8; ++var4) {
                  this.method313(var3, var4, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IILr;I)V",
      garbageValue = "602031848"
   )
   void method313(int var1, int var2, class16 var3) {
      field193.set(0, var1, var2);

      for(int var4 = 0; var4 < var3.field121; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               Area var9 = this.method348(var8.objectDefinitionId);
               if(var9 != null) {
                  MapIcon var10 = (MapIcon)this.field199.get(field193);
                  if(var10 != null) {
                     if(var10.areaId != var9.id) {
                        MapIcon var16 = new MapIcon(var9.id, var10.field243, var10.field236, this.createMapLabel(var9));
                        this.field199.put(new Coordinates(field193), var16);
                        var10 = var16;
                     }

                     int var15 = var10.field243.plane - var10.field236.plane;
                     var10.field236.plane = var4;
                     var10.field243.plane = var15 + var4;
                     return;
                  }

                  Coordinates var11 = new Coordinates(var4, this.field191 * 64 + var1, this.field192 * 64 + var2);
                  Coordinates var12 = null;
                  if(this.field197 != null) {
                     var12 = new Coordinates(this.field197.field120 + var4, this.field197.field127 * 64 + var1, var2 + this.field197.field117 * 64);
                  } else {
                     Iterator var13 = this.field195.iterator();

                     while(var13.hasNext()) {
                        class34 var14 = (class34)var13.next();
                        if(var14.method562(var1, var2)) {
                           var12 = new Coordinates(var4 + var14.field120, var1 + var14.field127 * 64 + var14.method584() * 8, var2 + var14.field117 * 64 + var14.method564() * 8);
                           break;
                        }
                     }
                  }

                  if(var12 != null) {
                     var10 = new MapIcon(var9.id, var12, var11, this.createMapLabel(var9));
                     this.field199.put(new Coordinates(field193), var10);
                     return;
                  }
               }
            }
         }
      }

      this.field199.remove(field193);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lll;Ljd;I)I",
      garbageValue = "624399097"
   )
   int method288(SpritePixels var1, HorizontalAlignment var2) {
      switch(var2.value) {
      case 0:
         return -var1.width / 2;
      case 1:
         return 0;
      default:
         return -var1.width;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Lll;Lis;I)I",
      garbageValue = "105388050"
   )
   int method284(SpritePixels var1, VerticalAlignment var2) {
      switch(var2.value) {
      case 1:
         return -var1.height / 2;
      case 2:
         return 0;
      default:
         return -var1.height;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(II)Lie;",
      garbageValue = "764273111"
   )
   Area method348(int var1) {
      ObjectComposition var2 = FileOnDisk.getObjectDefinition(var1);
      if(var2.impostorIds != null) {
         var2 = var2.getImpostor();
         if(var2 == null) {
            return null;
         }
      }

      return var2.mapIconId != -1?Area.mapAreaType[var2.mapIconId]:null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(II)Ld;",
      garbageValue = "1836375512"
   )
   MapLabel method306(int var1) {
      Area var2 = Area.mapAreaType[var1];
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Lie;I)Ld;",
      garbageValue = "1728647620"
   )
   @Export("createMapLabel")
   MapLabel createMapLabel(Area area) {
      if(area.name != null && this.mapFonts != null && this.mapFonts.get(Size.field70) != null) {
         Size var2 = Size.method101(area.field3243);
         if(var2 == null) {
            return null;
         } else {
            Font var3 = (Font)this.mapFonts.get(var2);
            if(var3 == null) {
               return null;
            } else {
               int var4 = var3.method5520(area.name, 1000000);
               String[] var5 = new String[var4];
               var3.method5518(area.name, (int[])null, var5);
               int var6 = var5.length * var3.verticalSpace / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.getTextWidth(var10);
                  if(var11 > var7) {
                     var7 = var11;
                  }
               }

               return new MapLabel(area.name, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "-1031458872"
   )
   List method319(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field199.values().iterator();

            MapIcon var8;
            while(var7.hasNext()) {
               var8 = (MapIcon)var7.next();
               if(var8.method464(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field196.iterator();

            while(var7.hasNext()) {
               var8 = (MapIcon)var7.next();
               if(var8.method464(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/List;",
      garbageValue = "23"
   )
   List method356() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field196);
      var1.addAll(this.field199.values());
      return var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-60"
   )
   void method321(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(var3 == 0) {
         Rasterizer2D.method5738(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 1) {
         Rasterizer2D.method5736(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 2) {
         Rasterizer2D.method5738(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 3) {
         Rasterizer2D.method5736(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1433133625"
   )
   int method322(int var1, int var2) {
      if(this.field197 != null) {
         return this.field197.method153(var1, var2);
      } else {
         if(!this.field195.isEmpty()) {
            Iterator var3 = this.field195.iterator();

            while(var3.hasNext()) {
               class34 var4 = (class34)var3.next();
               if(var4.method562(var1, var2)) {
                  return var4.method153(var1, var2);
               }
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Lli;",
      garbageValue = "-13"
   )
   public static class316[] method423() {
      return new class316[]{class316.field3771, class316.field3775, class316.field3774, class316.field3772, class316.field3773};
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILir;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-469912607"
   )
   public static void method422(int var0, IndexDataBase var1, String var2, String var3, int var4, boolean var5) {
      int var6 = var1.getFile(var2);
      int var7 = var1.getChild(var6, var3);
      World.method1602(var0, var1, var6, var7, var4, var5);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "488772559"
   )
   @Export("encodeStringCp1252")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if(var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if(var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if(var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if(var7 == 402) {
            var3[var6 + var4] = -125;
         } else if(var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if(var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if(var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if(var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if(var7 == 710) {
            var3[var6 + var4] = -120;
         } else if(var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if(var7 == 352) {
            var3[var6 + var4] = -118;
         } else if(var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if(var7 == 338) {
            var3[var6 + var4] = -116;
         } else if(var7 == 381) {
            var3[var6 + var4] = -114;
         } else if(var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if(var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if(var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if(var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if(var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if(var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if(var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if(var7 == 732) {
            var3[var6 + var4] = -104;
         } else if(var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if(var7 == 353) {
            var3[var6 + var4] = -102;
         } else if(var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if(var7 == 339) {
            var3[var6 + var4] = -100;
         } else if(var7 == 382) {
            var3[var6 + var4] = -98;
         } else if(var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }
}
