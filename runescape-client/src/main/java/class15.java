import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public enum class15 implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field108(2, (byte)0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field107(3, (byte)1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field112(0, (byte)2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field106(1, (byte)3);

   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -640646291
   )
   @Export("worldMapType")
   final int worldMapType;
   @ObfuscatedName("q")
   final byte field111;

   class15(int worldMapType, byte var4) {
      this.worldMapType = worldMapType;
      this.field111 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field111;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)[Lm;",
      garbageValue = "-1961233435"
   )
   @Export("getWorldMapTypes")
   static class15[] getWorldMapTypes() {
      return new class15[]{field106, field107, field108, field112};
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2126633421"
   )
   static final void method148() {
      WorldMapType3.flush(false);
      Client.field633 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < class171.field2252.length; ++var1) {
         if(FontName.landMapFileIds[var1] != -1 && class171.field2252[var1] == null) {
            class171.field2252[var1] = FileRequest.indexMaps.getConfigData(FontName.landMapFileIds[var1], 0);
            if(class171.field2252[var1] == null) {
               var0 = false;
               ++Client.field633;
            }
         }

         if(class9.landRegionFileIds[var1] != -1 && MapCacheArchiveNames.field253[var1] == null) {
            MapCacheArchiveNames.field253[var1] = FileRequest.indexMaps.getConfigDataKeys(class9.landRegionFileIds[var1], 0, FriendManager.xteaKeys[var1]);
            if(MapCacheArchiveNames.field253[var1] == null) {
               var0 = false;
               ++Client.field633;
            }
         }
      }

      if(!var0) {
         Client.field751 = 1;
      } else {
         Client.field635 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < class171.field2252.length; ++var1) {
            byte[] var2 = MapCacheArchiveNames.field253[var1];
            if(var2 != null) {
               var3 = (class143.mapRegions[var1] >> 8) * 64 - PendingSpawn.baseX;
               var4 = (class143.mapRegions[var1] & 255) * 64 - Client.baseY;
               if(Client.isDynamicRegion) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= class33.method557(var2, var3, var4);
            }
         }

         if(!var0) {
            Client.field751 = 2;
         } else {
            if(Client.field751 != 0) {
               class83.method1933("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            class54.method1017();
            MapIcon.region.reset();

            for(var1 = 0; var1 < 4; ++var1) {
               Client.collisionMaps[var1].reset();
            }

            int var44;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var44 = 0; var44 < 104; ++var44) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     class50.tileSettings[var1][var44][var3] = 0;
                  }
               }
            }

            class54.method1017();
            SoundTaskDataProvider.method695();
            var1 = class171.field2252.length;

            for(class68 var62 = (class68)class68.field985.getFront(); var62 != null; var62 = (class68)class68.field985.getNext()) {
               if(var62.field993 != null) {
                  MapIconReference.field310.method2009(var62.field993);
                  var62.field993 = null;
               }

               if(var62.field980 != null) {
                  MapIconReference.field310.method2009(var62.field980);
                  var62.field980 = null;
               }
            }

            class68.field985.clear();
            WorldMapType3.flush(true);
            int var6;
            int var7;
            int var9;
            int var10;
            int var11;
            int var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var19;
            int var20;
            int var21;
            int var46;
            int var49;
            int var52;
            if(!Client.isDynamicRegion) {
               byte[] var5;
               for(var44 = 0; var44 < var1; ++var44) {
                  var3 = (class143.mapRegions[var44] >> 8) * 64 - PendingSpawn.baseX;
                  var4 = (class143.mapRegions[var44] & 255) * 64 - Client.baseY;
                  var5 = class171.field2252[var44];
                  if(var5 != null) {
                     class54.method1017();
                     var6 = WorldMapType2.field224 * 8 - 48;
                     var7 = class34.field301 * 8 - 48;
                     CollisionData[] var8 = Client.collisionMaps;

                     for(var9 = 0; var9 < 4; ++var9) {
                        for(var10 = 0; var10 < 64; ++var10) {
                           for(var11 = 0; var11 < 64; ++var11) {
                              if(var10 + var3 > 0 && var3 + var10 < 103 && var11 + var4 > 0 && var11 + var4 < 103) {
                                 var8[var9].flags[var10 + var3][var4 + var11] &= -16777217;
                              }
                           }
                        }
                     }

                     Buffer var45 = new Buffer(var5);

                     for(var10 = 0; var10 < 4; ++var10) {
                        for(var11 = 0; var11 < 64; ++var11) {
                           for(var12 = 0; var12 < 64; ++var12) {
                              World.loadTerrain(var45, var10, var11 + var3, var12 + var4, var6, var7, 0);
                           }
                        }
                     }
                  }
               }

               for(var44 = 0; var44 < var1; ++var44) {
                  var3 = (class143.mapRegions[var44] >> 8) * 64 - PendingSpawn.baseX;
                  var4 = (class143.mapRegions[var44] & 255) * 64 - Client.baseY;
                  var5 = class171.field2252[var44];
                  if(var5 == null && class34.field301 < 800) {
                     class54.method1017();
                     class177.method3510(var3, var4, 64, 64);
                  }
               }

               WorldMapType3.flush(true);

               for(var44 = 0; var44 < var1; ++var44) {
                  byte[] var48 = MapCacheArchiveNames.field253[var44];
                  if(var48 != null) {
                     var4 = (class143.mapRegions[var44] >> 8) * 64 - PendingSpawn.baseX;
                     var46 = (class143.mapRegions[var44] & 255) * 64 - Client.baseY;
                     class54.method1017();
                     Region var50 = MapIcon.region;
                     CollisionData[] var51 = Client.collisionMaps;
                     Buffer var66 = new Buffer(var48);
                     var9 = -1;

                     while(true) {
                        var10 = var66.method3563();
                        if(var10 == 0) {
                           break;
                        }

                        var9 += var10;
                        var11 = 0;

                        while(true) {
                           var12 = var66.getUSmart();
                           if(var12 == 0) {
                              break;
                           }

                           var11 += var12 - 1;
                           var49 = var11 & 63;
                           var14 = var11 >> 6 & 63;
                           var15 = var11 >> 12;
                           var16 = var66.readUnsignedByte();
                           var17 = var16 >> 2;
                           var52 = var16 & 3;
                           var19 = var4 + var14;
                           var20 = var49 + var46;
                           if(var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                              var21 = var15;
                              if((class50.tileSettings[1][var19][var20] & 2) == 2) {
                                 var21 = var15 - 1;
                              }

                              CollisionData var55 = null;
                              if(var21 >= 0) {
                                 var55 = var51[var21];
                              }

                              class171.addObject(var15, var19, var20, var9, var52, var17, var50, var55);
                           }
                        }
                     }
                  }
               }
            }

            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var32;
            int var33;
            int var34;
            int var35;
            int var36;
            int var38;
            int var39;
            int var40;
            int var47;
            if(Client.isDynamicRegion) {
               CollisionData[] var18;
               Buffer var56;
               for(var44 = 0; var44 < 4; ++var44) {
                  class54.method1017();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var71 = false;
                        var6 = Client.instanceTemplateChunks[var44][var3][var4];
                        if(var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var47 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class143.mapRegions.length; ++var12) {
                              if(class143.mapRegions[var12] == var11 && class171.field2252[var12] != null) {
                                 byte[] var13 = class171.field2252[var12];
                                 var14 = var3 * 8;
                                 var15 = var4 * 8;
                                 var16 = (var9 & 7) * 8;
                                 var17 = (var10 & 7) * 8;
                                 var18 = Client.collisionMaps;

                                 for(var19 = 0; var19 < 8; ++var19) {
                                    for(var20 = 0; var20 < 8; ++var20) {
                                       if(var14 + var19 > 0 && var14 + var19 < 103 && var20 + var15 > 0 && var20 + var15 < 103) {
                                          var18[var44].flags[var14 + var19][var20 + var15] &= -16777217;
                                       }
                                    }
                                 }

                                 var56 = new Buffer(var13);

                                 for(var20 = 0; var20 < 4; ++var20) {
                                    for(var21 = 0; var21 < 64; ++var21) {
                                       for(var22 = 0; var22 < 64; ++var22) {
                                          if(var20 == var7 && var21 >= var16 && var21 < var16 + 8 && var22 >= var17 && var22 < var17 + 8) {
                                             var27 = var21 & 7;
                                             var28 = var22 & 7;
                                             var29 = var47 & 3;
                                             if(var29 == 0) {
                                                var26 = var27;
                                             } else if(var29 == 1) {
                                                var26 = var28;
                                             } else if(var29 == 2) {
                                                var26 = 7 - var27;
                                             } else {
                                                var26 = 7 - var28;
                                             }

                                             World.loadTerrain(var56, var44, var26 + var14, var15 + ContextMenuRow.method1802(var21 & 7, var22 & 7, var47), 0, 0, var47);
                                          } else {
                                             World.loadTerrain(var56, 0, -1, -1, 0, 0, 0);
                                          }
                                       }
                                    }
                                 }

                                 var71 = true;
                                 break;
                              }
                           }
                        }

                        if(!var71) {
                           Timer.method3338(var44, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var44 = 0; var44 < 13; ++var44) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceTemplateChunks[0][var44][var3];
                     if(var4 == -1) {
                        class177.method3510(var44 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               WorldMapType3.flush(true);

               for(var44 = 0; var44 < 4; ++var44) {
                  class54.method1017();

                  for(var3 = 0; var3 < 13; ++var3) {
                     label1302:
                     for(var4 = 0; var4 < 13; ++var4) {
                        var46 = Client.instanceTemplateChunks[var44][var3][var4];
                        if(var46 != -1) {
                           var6 = var46 >> 24 & 3;
                           var7 = var46 >> 1 & 3;
                           var47 = var46 >> 14 & 1023;
                           var9 = var46 >> 3 & 2047;
                           var10 = (var47 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < class143.mapRegions.length; ++var11) {
                              if(class143.mapRegions[var11] == var10 && MapCacheArchiveNames.field253[var11] != null) {
                                 byte[] var58 = MapCacheArchiveNames.field253[var11];
                                 var49 = var3 * 8;
                                 var14 = var4 * 8;
                                 var15 = (var47 & 7) * 8;
                                 var16 = (var9 & 7) * 8;
                                 Region var53 = MapIcon.region;
                                 var18 = Client.collisionMaps;
                                 var56 = new Buffer(var58);
                                 var20 = -1;

                                 while(true) {
                                    var21 = var56.method3563();
                                    if(var21 == 0) {
                                       continue label1302;
                                    }

                                    var20 += var21;
                                    var22 = 0;

                                    while(true) {
                                       var23 = var56.getUSmart();
                                       if(var23 == 0) {
                                          break;
                                       }

                                       var22 += var23 - 1;
                                       var24 = var22 & 63;
                                       var25 = var22 >> 6 & 63;
                                       var26 = var22 >> 12;
                                       var27 = var56.readUnsignedByte();
                                       var28 = var27 >> 2;
                                       var29 = var27 & 3;
                                       if(var6 == var26 && var25 >= var15 && var25 < var15 + 8 && var24 >= var16 && var24 < var16 + 8) {
                                          ObjectComposition var59 = FileOnDisk.getObjectDefinition(var20);
                                          var33 = var25 & 7;
                                          var34 = var24 & 7;
                                          var36 = var59.width;
                                          int var60 = var59.length;
                                          if((var29 & 1) == 1) {
                                             var38 = var36;
                                             var36 = var60;
                                             var60 = var38;
                                          }

                                          var35 = var7 & 3;
                                          if(var35 == 0) {
                                             var32 = var33;
                                          } else if(var35 == 1) {
                                             var32 = var34;
                                          } else if(var35 == 2) {
                                             var32 = 7 - var33 - (var36 - 1);
                                          } else {
                                             var32 = 7 - var34 - (var60 - 1);
                                          }

                                          var38 = var49 + var32;
                                          var39 = var14 + ChatLineBuffer.method1970(var25 & 7, var24 & 7, var7, var59.width, var59.length, var29);
                                          if(var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                             var40 = var44;
                                             if((class50.tileSettings[1][var38][var39] & 2) == 2) {
                                                var40 = var44 - 1;
                                             }

                                             CollisionData var61 = null;
                                             if(var40 >= 0) {
                                                var61 = var18[var40];
                                             }

                                             class171.addObject(var44, var38, var39, var20, var7 + var29 & 3, var28, var53, var61);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            WorldMapType3.flush(true);
            class54.method1017();
            Region var63 = MapIcon.region;
            CollisionData[] var72 = Client.collisionMaps;

            for(var4 = 0; var4 < 4; ++var4) {
               for(var46 = 0; var46 < 104; ++var46) {
                  for(var6 = 0; var6 < 104; ++var6) {
                     if((class50.tileSettings[var4][var46][var6] & 1) == 1) {
                        var7 = var4;
                        if((class50.tileSettings[1][var46][var6] & 2) == 2) {
                           var7 = var4 - 1;
                        }

                        if(var7 >= 0) {
                           var72[var7].method3395(var46, var6);
                        }
                     }
                  }
               }
            }

            class50.field457 += (int)(Math.random() * 5.0D) - 2;
            if(class50.field457 < -8) {
               class50.field457 = -8;
            }

            if(class50.field457 > 8) {
               class50.field457 = 8;
            }

            class50.field455 += (int)(Math.random() * 5.0D) - 2;
            if(class50.field455 < -16) {
               class50.field455 = -16;
            }

            if(class50.field455 > 16) {
               class50.field455 = 16;
            }

            for(var4 = 0; var4 < 4; ++var4) {
               byte[][] var64 = class50.field447[var4];
               var11 = (int)Math.sqrt(5100.0D);
               var12 = var11 * 768 >> 8;

               for(var49 = 1; var49 < 103; ++var49) {
                  for(var14 = 1; var14 < 103; ++var14) {
                     var15 = class50.tileHeights[var4][var14 + 1][var49] - class50.tileHeights[var4][var14 - 1][var49];
                     var16 = class50.tileHeights[var4][var14][var49 + 1] - class50.tileHeights[var4][var14][var49 - 1];
                     var17 = (int)Math.sqrt((double)(var16 * var16 + var15 * var15 + 65536));
                     var52 = (var15 << 8) / var17;
                     var19 = 65536 / var17;
                     var20 = (var16 << 8) / var17;
                     var21 = (var52 * -50 + var20 * -50 + var19 * -10) / var12 + 96;
                     var22 = (var64[var14 - 1][var49] >> 2) + (var64[var14][var49 - 1] >> 2) + (var64[var14 + 1][var49] >> 3) + (var64[var14][var49 + 1] >> 3) + (var64[var14][var49] >> 1);
                     class50.field448[var14][var49] = var21 - var22;
                  }
               }

               for(var49 = 0; var49 < 104; ++var49) {
                  class50.floorHues[var49] = 0;
                  class305.floorSaturations[var49] = 0;
                  NPC.field1035[var49] = 0;
                  Varbit.floorMultiplier[var49] = 0;
                  BuildType.field3137[var49] = 0;
               }

               for(var49 = -5; var49 < 109; ++var49) {
                  for(var14 = 0; var14 < 104; ++var14) {
                     var15 = var49 + 5;
                     if(var15 >= 0 && var15 < 104) {
                        var16 = class50.tileUnderlayIds[var4][var15][var14] & 255;
                        if(var16 > 0) {
                           FloorUnderlayDefinition var73 = class49.getUnderlayDefinition(var16 - 1);
                           class50.floorHues[var14] += var73.hue;
                           class305.floorSaturations[var14] += var73.saturation;
                           NPC.field1035[var14] += var73.lightness;
                           Varbit.floorMultiplier[var14] += var73.hueMultiplier;
                           ++BuildType.field3137[var14];
                        }
                     }

                     var16 = var49 - 5;
                     if(var16 >= 0 && var16 < 104) {
                        var17 = class50.tileUnderlayIds[var4][var16][var14] & 255;
                        if(var17 > 0) {
                           FloorUnderlayDefinition var67 = class49.getUnderlayDefinition(var17 - 1);
                           class50.floorHues[var14] -= var67.hue;
                           class305.floorSaturations[var14] -= var67.saturation;
                           NPC.field1035[var14] -= var67.lightness;
                           Varbit.floorMultiplier[var14] -= var67.hueMultiplier;
                           --BuildType.field3137[var14];
                        }
                     }
                  }

                  if(var49 >= 1 && var49 < 103) {
                     var14 = 0;
                     var15 = 0;
                     var16 = 0;
                     var17 = 0;
                     var52 = 0;

                     for(var19 = -5; var19 < 109; ++var19) {
                        var20 = var19 + 5;
                        if(var20 >= 0 && var20 < 104) {
                           var14 += class50.floorHues[var20];
                           var15 += class305.floorSaturations[var20];
                           var16 += NPC.field1035[var20];
                           var17 += Varbit.floorMultiplier[var20];
                           var52 += BuildType.field3137[var20];
                        }

                        var21 = var19 - 5;
                        if(var21 >= 0 && var21 < 104) {
                           var14 -= class50.floorHues[var21];
                           var15 -= class305.floorSaturations[var21];
                           var16 -= NPC.field1035[var21];
                           var17 -= Varbit.floorMultiplier[var21];
                           var52 -= BuildType.field3137[var21];
                        }

                        if(var19 >= 1 && var19 < 103 && (!Client.lowMemory || (class50.tileSettings[0][var49][var19] & 2) != 0 || (class50.tileSettings[var4][var49][var19] & 16) == 0)) {
                           if(var4 < class50.field442) {
                              class50.field442 = var4;
                           }

                           var22 = class50.tileUnderlayIds[var4][var49][var19] & 255;
                           var23 = class165.tileOverlayIds[var4][var49][var19] & 255;
                           if(var22 > 0 || var23 > 0) {
                              var24 = class50.tileHeights[var4][var49][var19];
                              var25 = class50.tileHeights[var4][var49 + 1][var19];
                              var26 = class50.tileHeights[var4][var49 + 1][var19 + 1];
                              var27 = class50.tileHeights[var4][var49][var19 + 1];
                              var28 = class50.field448[var49][var19];
                              var29 = class50.field448[var49 + 1][var19];
                              int var30 = class50.field448[var49 + 1][var19 + 1];
                              int var31 = class50.field448[var49][var19 + 1];
                              var32 = -1;
                              var33 = -1;
                              if(var22 > 0) {
                                 var34 = var14 * 256 / var17;
                                 var35 = var15 / var52;
                                 var36 = var16 / var52;
                                 var32 = class34.method560(var34, var35, var36);
                                 var34 = var34 + class50.field457 & 255;
                                 var36 += class50.field455;
                                 if(var36 < 0) {
                                    var36 = 0;
                                 } else if(var36 > 255) {
                                    var36 = 255;
                                 }

                                 var33 = class34.method560(var34, var35, var36);
                              }

                              if(var4 > 0) {
                                 boolean var69 = true;
                                 if(var22 == 0 && class50.tileOverlayPath[var4][var49][var19] != 0) {
                                    var69 = false;
                                 }

                                 if(var23 > 0 && !GrandExchangeEvents.getOverlayDefinition(var23 - 1).isHidden) {
                                    var69 = false;
                                 }

                                 if(var69 && var24 == var25 && var24 == var26 && var24 == var27) {
                                    class37.field325[var4][var49][var19] |= 2340;
                                 }
                              }

                              var34 = 0;
                              if(var33 != -1) {
                                 var34 = Graphics3D.colorPalette[Resampler.method2248(var33, 96)];
                              }

                              if(var23 == 0) {
                                 var63.addTile(var4, var49, var19, 0, 0, -1, var24, var25, var26, var27, Resampler.method2248(var32, var28), Resampler.method2248(var32, var29), Resampler.method2248(var32, var30), Resampler.method2248(var32, var31), 0, 0, 0, 0, var34, 0);
                              } else {
                                 var35 = class50.tileOverlayPath[var4][var49][var19] + 1;
                                 byte var70 = WorldMapDecoration.overlayRotations[var4][var49][var19];
                                 Overlay var37 = GrandExchangeEvents.getOverlayDefinition(var23 - 1);
                                 var38 = var37.texture;
                                 int var41;
                                 int var42;
                                 if(var38 >= 0) {
                                    var40 = Graphics3D.textureLoader.getAverageTextureRGB(var38);
                                    var39 = -1;
                                 } else if(var37.color == 16711935) {
                                    var39 = -2;
                                    var38 = -1;
                                    var40 = -2;
                                 } else {
                                    var39 = class34.method560(var37.hue, var37.saturation, var37.lightness);
                                    var41 = var37.hue + class50.field457 & 255;
                                    var42 = var37.lightness + class50.field455;
                                    if(var42 < 0) {
                                       var42 = 0;
                                    } else if(var42 > 255) {
                                       var42 = 255;
                                    }

                                    var40 = class34.method560(var41, var37.saturation, var42);
                                 }

                                 var41 = 0;
                                 if(var40 != -2) {
                                    var41 = Graphics3D.colorPalette[WorldMapManager.adjustHSLListness0(var40, 96)];
                                 }

                                 if(var37.otherRgbColor != -1) {
                                    var42 = var37.otherHue + class50.field457 & 255;
                                    int var43 = var37.otherLightness + class50.field455;
                                    if(var43 < 0) {
                                       var43 = 0;
                                    } else if(var43 > 255) {
                                       var43 = 255;
                                    }

                                    var40 = class34.method560(var42, var37.otherSaturation, var43);
                                    var41 = Graphics3D.colorPalette[WorldMapManager.adjustHSLListness0(var40, 96)];
                                 }

                                 var63.addTile(var4, var49, var19, var35, var70, var38, var24, var25, var26, var27, Resampler.method2248(var32, var28), Resampler.method2248(var32, var29), Resampler.method2248(var32, var30), Resampler.method2248(var32, var31), WorldMapManager.adjustHSLListness0(var39, var28), WorldMapManager.adjustHSLListness0(var39, var29), WorldMapManager.adjustHSLListness0(var39, var30), WorldMapManager.adjustHSLListness0(var39, var31), var34, var41);
                              }
                           }
                        }
                     }
                  }
               }

               for(var49 = 1; var49 < 103; ++var49) {
                  for(var14 = 1; var14 < 103; ++var14) {
                     if((class50.tileSettings[var4][var14][var49] & 8) != 0) {
                        var19 = 0;
                     } else if(var4 > 0 && (class50.tileSettings[1][var14][var49] & 2) != 0) {
                        var19 = var4 - 1;
                     } else {
                        var19 = var4;
                     }

                     var63.setPhysicalLevel(var4, var14, var49, var19);
                  }
               }

               class50.tileUnderlayIds[var4] = null;
               class165.tileOverlayIds[var4] = null;
               class50.tileOverlayPath[var4] = null;
               WorldMapDecoration.overlayRotations[var4] = null;
               class50.field447[var4] = null;
            }

            var63.applyLighting(-50, -10, -50);

            for(var4 = 0; var4 < 104; ++var4) {
               for(var46 = 0; var46 < 104; ++var46) {
                  if((class50.tileSettings[1][var4][var46] & 2) == 2) {
                     var63.setBridge(var4, var46);
                  }
               }
            }

            var4 = 1;
            var46 = 2;
            var6 = 4;

            for(var7 = 0; var7 < 4; ++var7) {
               if(var7 > 0) {
                  var4 <<= 3;
                  var46 <<= 3;
                  var6 <<= 3;
               }

               for(var47 = 0; var47 <= var7; ++var47) {
                  for(var9 = 0; var9 <= 104; ++var9) {
                     for(var10 = 0; var10 <= 104; ++var10) {
                        short var68;
                        if((class37.field325[var47][var10][var9] & var4) != 0) {
                           var11 = var9;
                           var12 = var9;
                           var49 = var47;

                           for(var14 = var47; var11 > 0 && (class37.field325[var47][var10][var11 - 1] & var4) != 0; --var11) {
                              ;
                           }

                           while(var12 < 104 && (class37.field325[var47][var10][var12 + 1] & var4) != 0) {
                              ++var12;
                           }

                           label1030:
                           while(var49 > 0) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if((class37.field325[var49 - 1][var10][var15] & var4) == 0) {
                                    break label1030;
                                 }
                              }

                              --var49;
                           }

                           label1019:
                           while(var14 < var7) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if((class37.field325[var14 + 1][var10][var15] & var4) == 0) {
                                    break label1019;
                                 }
                              }

                              ++var14;
                           }

                           var15 = (var12 - var11 + 1) * (var14 + 1 - var49);
                           if(var15 >= 8) {
                              var68 = 240;
                              var17 = class50.tileHeights[var14][var10][var11] - var68;
                              var52 = class50.tileHeights[var49][var10][var11];
                              Region.addOcclude(var7, 1, var10 * 128, var10 * 128, var11 * 128, var12 * 128 + 128, var17, var52);

                              for(var19 = var49; var19 <= var14; ++var19) {
                                 for(var20 = var11; var20 <= var12; ++var20) {
                                    class37.field325[var19][var10][var20] &= ~var4;
                                 }
                              }
                           }
                        }

                        if((class37.field325[var47][var10][var9] & var46) != 0) {
                           var11 = var10;
                           var12 = var10;
                           var49 = var47;

                           for(var14 = var47; var11 > 0 && (class37.field325[var47][var11 - 1][var9] & var46) != 0; --var11) {
                              ;
                           }

                           while(var12 < 104 && (class37.field325[var47][var12 + 1][var9] & var46) != 0) {
                              ++var12;
                           }

                           label1083:
                           while(var49 > 0) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if((class37.field325[var49 - 1][var15][var9] & var46) == 0) {
                                    break label1083;
                                 }
                              }

                              --var49;
                           }

                           label1072:
                           while(var14 < var7) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if((class37.field325[var14 + 1][var15][var9] & var46) == 0) {
                                    break label1072;
                                 }
                              }

                              ++var14;
                           }

                           var15 = (var12 - var11 + 1) * (var14 + 1 - var49);
                           if(var15 >= 8) {
                              var68 = 240;
                              var17 = class50.tileHeights[var14][var11][var9] - var68;
                              var52 = class50.tileHeights[var49][var11][var9];
                              Region.addOcclude(var7, 2, var11 * 128, var12 * 128 + 128, var9 * 128, var9 * 128, var17, var52);

                              for(var19 = var49; var19 <= var14; ++var19) {
                                 for(var20 = var11; var20 <= var12; ++var20) {
                                    class37.field325[var19][var20][var9] &= ~var46;
                                 }
                              }
                           }
                        }

                        if((class37.field325[var47][var10][var9] & var6) != 0) {
                           var11 = var10;
                           var12 = var10;
                           var49 = var9;

                           for(var14 = var9; var49 > 0 && (class37.field325[var47][var10][var49 - 1] & var6) != 0; --var49) {
                              ;
                           }

                           while(var14 < 104 && (class37.field325[var47][var10][var14 + 1] & var6) != 0) {
                              ++var14;
                           }

                           label1136:
                           while(var11 > 0) {
                              for(var15 = var49; var15 <= var14; ++var15) {
                                 if((class37.field325[var47][var11 - 1][var15] & var6) == 0) {
                                    break label1136;
                                 }
                              }

                              --var11;
                           }

                           label1125:
                           while(var12 < 104) {
                              for(var15 = var49; var15 <= var14; ++var15) {
                                 if((class37.field325[var47][var12 + 1][var15] & var6) == 0) {
                                    break label1125;
                                 }
                              }

                              ++var12;
                           }

                           if((var14 - var49 + 1) * (var12 - var11 + 1) >= 4) {
                              var15 = class50.tileHeights[var47][var11][var49];
                              Region.addOcclude(var7, 4, var11 * 128, var12 * 128 + 128, var49 * 128, var14 * 128 + 128, var15, var15);

                              for(var16 = var11; var16 <= var12; ++var16) {
                                 for(var17 = var49; var17 <= var14; ++var17) {
                                    class37.field325[var47][var16][var17] &= ~var6;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            WorldMapType3.flush(true);
            var4 = class50.field442;
            if(var4 > class13.plane) {
               var4 = class13.plane;
            }

            if(var4 < class13.plane - 1) {
               var4 = class13.plane - 1;
            }

            if(Client.lowMemory) {
               MapIcon.region.setup(class50.field442);
            } else {
               MapIcon.region.setup(0);
            }

            for(var46 = 0; var46 < 104; ++var46) {
               for(var6 = 0; var6 < 104; ++var6) {
                  InvType.groundItemSpawned(var46, var6);
               }
            }

            class54.method1017();
            Timer.method3342();
            ObjectComposition.field3391.reset();
            PacketNode var65;
            if(Buffer.clientInstance.method801()) {
               var65 = class26.method433(ClientPacket.field2148, Client.field626.field1218);
               var65.packetBuffer.putInt(1057001181);
               Client.field626.method1980(var65);
            }

            if(!Client.isDynamicRegion) {
               var46 = (WorldMapType2.field224 - 6) / 8;
               var6 = (WorldMapType2.field224 + 6) / 8;
               var7 = (class34.field301 - 6) / 8;
               var47 = (class34.field301 + 6) / 8;

               for(var9 = var46 - 1; var9 <= var6 + 1; ++var9) {
                  for(var10 = var7 - 1; var10 <= var47 + 1; ++var10) {
                     if(var9 < var46 || var9 > var6 || var10 < var7 || var10 > var47) {
                        FileRequest.indexMaps.method4648("m" + var9 + "_" + var10);
                        FileRequest.indexMaps.method4648("l" + var9 + "_" + var10);
                     }
                  }
               }
            }

            MouseInput.setGameState(30);
            class54.method1017();
            class49.method952();
            var65 = class26.method433(ClientPacket.field2224, Client.field626.field1218);
            Client.field626.method1980(var65);
            class43.timer.vmethod3330();

            for(var6 = 0; var6 < 32; ++var6) {
               GameEngine.field394[var6] = 0L;
            }

            for(var6 = 0; var6 < 32; ++var6) {
               GameEngine.field404[var6] = 0L;
            }

            class8.field48 = 0;
         }
      }
   }
}
