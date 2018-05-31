import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("CombatInfo1")
public class CombatInfo1 extends Node {
   @ObfuscatedName("d")
   static int[] field936;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -854731803
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1588453017
   )
   @Export("healthRatio")
   int healthRatio;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1549500065
   )
   @Export("health")
   int health;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2023364683
   )
   @Export("int2")
   int int2;

   CombatInfo1(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-2116871828"
   )
   @Export("set")
   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "66"
   )
   static void method1560() {
      class224.field2554 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class143.method3167((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
         class224.field2554[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < class224.field2554.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class143.method3167((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class224.field2554.length; ++var0) {
            class224.field2554[var0] = var4;
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-95"
   )
   static int method1558(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 6600) {
         var3 = class13.plane;
         int var13 = (class138.localPlayer.x >> 7) + PendingSpawn.baseX;
         int var5 = (class138.localPlayer.y >> 7) + Client.baseY;
         WorldMapType1.method196().method6011(var3, var13, var5, true);
         return 1;
      } else {
         WorldMapData var15;
         if(var0 == 6601) {
            var3 = class69.intStack[--class69.intStackSize];
            String var20 = "";
            var15 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
            if(var15 != null) {
               var20 = var15.getName();
            }

            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var20;
            return 1;
         } else if(var0 == 6602) {
            var3 = class69.intStack[--class69.intStackSize];
            WorldMapType1.method196().method6012(var3);
            return 1;
         } else if(var0 == 6603) {
            class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6026();
            return 1;
         } else if(var0 == 6604) {
            var3 = class69.intStack[--class69.intStackSize];
            WorldMapType1.method196().method6023(var3);
            return 1;
         } else if(var0 == 6605) {
            class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6096()?1:0;
            return 1;
         } else {
            Coordinates var19;
            if(var0 == 6606) {
               var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
               WorldMapType1.method196().setWorldMapPositionTarget(var19.worldX, var19.worldY);
               return 1;
            } else if(var0 == 6607) {
               var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
               WorldMapType1.method196().method6031(var19.worldX, var19.worldY);
               return 1;
            } else if(var0 == 6608) {
               var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
               WorldMapType1.method196().method6046(var19.plane, var19.worldX, var19.worldY);
               return 1;
            } else if(var0 == 6609) {
               var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
               WorldMapType1.method196().method6033(var19.plane, var19.worldX, var19.worldY);
               return 1;
            } else if(var0 == 6610) {
               class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6002();
               class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6035();
               return 1;
            } else {
               WorldMapData var17;
               if(var0 == 6611) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var17 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                  if(var17 == null) {
                     class69.intStack[++class69.intStackSize - 1] = 0;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = var17.method256().bitpack();
                  }

                  return 1;
               } else if(var0 == 6612) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var17 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                  if(var17 == null) {
                     class69.intStack[++class69.intStackSize - 1] = 0;
                     class69.intStack[++class69.intStackSize - 1] = 0;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = (var17.method214() - var17.getMinX() + 1) * 64;
                     class69.intStack[++class69.intStackSize - 1] = (var17.method249() - var17.getMinY() + 1) * 64;
                  }

                  return 1;
               } else if(var0 == 6613) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var17 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                  if(var17 == null) {
                     class69.intStack[++class69.intStackSize - 1] = 0;
                     class69.intStack[++class69.intStackSize - 1] = 0;
                     class69.intStack[++class69.intStackSize - 1] = 0;
                     class69.intStack[++class69.intStackSize - 1] = 0;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = var17.getMinX() * 64;
                     class69.intStack[++class69.intStackSize - 1] = var17.getMinY() * 64;
                     class69.intStack[++class69.intStackSize - 1] = var17.method214() * 64 + 64 - 1;
                     class69.intStack[++class69.intStackSize - 1] = var17.method249() * 64 + 64 - 1;
                  }

                  return 1;
               } else if(var0 == 6614) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var17 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                  if(var17 == null) {
                     class69.intStack[++class69.intStackSize - 1] = -1;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = var17.getInitialMapSurfaceZoom();
                  }

                  return 1;
               } else if(var0 == 6615) {
                  var19 = WorldMapType1.method196().method6001();
                  if(var19 == null) {
                     class69.intStack[++class69.intStackSize - 1] = -1;
                     class69.intStack[++class69.intStackSize - 1] = -1;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = var19.worldX;
                     class69.intStack[++class69.intStackSize - 1] = var19.worldY;
                  }

                  return 1;
               } else if(var0 == 6616) {
                  class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6153();
                  return 1;
               } else if(var0 == 6617) {
                  var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
                  var17 = WorldMapType1.method196().method6014();
                  if(var17 == null) {
                     class69.intStack[++class69.intStackSize - 1] = -1;
                     class69.intStack[++class69.intStackSize - 1] = -1;
                     return 1;
                  } else {
                     int[] var18 = var17.method213(var19.plane, var19.worldX, var19.worldY);
                     if(var18 == null) {
                        class69.intStack[++class69.intStackSize - 1] = -1;
                        class69.intStack[++class69.intStackSize - 1] = -1;
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = var18[0];
                        class69.intStack[++class69.intStackSize - 1] = var18[1];
                     }

                     return 1;
                  }
               } else {
                  Coordinates var11;
                  if(var0 == 6618) {
                     var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
                     var17 = WorldMapType1.method196().method6014();
                     if(var17 == null) {
                        class69.intStack[++class69.intStackSize - 1] = -1;
                        class69.intStack[++class69.intStackSize - 1] = -1;
                        return 1;
                     } else {
                        var11 = var17.method205(var19.worldX, var19.worldY);
                        if(var11 == null) {
                           class69.intStack[++class69.intStackSize - 1] = -1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = var11.bitpack();
                        }

                        return 1;
                     }
                  } else {
                     int var6;
                     int var7;
                     int var8;
                     Coordinates var9;
                     Coordinates var16;
                     if(var0 == 6619) {
                        class69.intStackSize -= 2;
                        var3 = class69.intStack[class69.intStackSize];
                        var16 = new Coordinates(class69.intStack[class69.intStackSize + 1]);
                        var15 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                        var6 = class138.localPlayer.field567;
                        var7 = (class138.localPlayer.x >> 7) + PendingSpawn.baseX;
                        var8 = (class138.localPlayer.y >> 7) + Client.baseY;
                        var9 = new Coordinates(var6, var7, var8);
                        WorldMapType1.method196().method6073(var15, var9, var16, false);
                        return 1;
                     } else if(var0 == 6620) {
                        class69.intStackSize -= 2;
                        var3 = class69.intStack[class69.intStackSize];
                        var16 = new Coordinates(class69.intStack[class69.intStackSize + 1]);
                        var15 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                        var6 = class138.localPlayer.field567;
                        var7 = (class138.localPlayer.x >> 7) + PendingSpawn.baseX;
                        var8 = (class138.localPlayer.y >> 7) + Client.baseY;
                        var9 = new Coordinates(var6, var7, var8);
                        WorldMapType1.method196().method6073(var15, var9, var16, true);
                        return 1;
                     } else if(var0 == 6621) {
                        class69.intStackSize -= 2;
                        var3 = class69.intStack[class69.intStackSize];
                        var16 = new Coordinates(class69.intStack[class69.intStackSize + 1]);
                        var15 = WorldMapType1.method196().getWorldMapDataByFileId(var3);
                        if(var15 == null) {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                           return 1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = var15.containsCoord(var16.plane, var16.worldX, var16.worldY)?1:0;
                           return 1;
                        }
                     } else if(var0 == 6622) {
                        class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6142();
                        class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6038();
                        return 1;
                     } else if(var0 == 6623) {
                        var19 = new Coordinates(class69.intStack[--class69.intStackSize]);
                        var17 = WorldMapType1.method196().getWorldMapDataContainingCoord(var19.plane, var19.worldX, var19.worldY);
                        if(var17 == null) {
                           class69.intStack[++class69.intStackSize - 1] = -1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = var17.getFileId();
                        }

                        return 1;
                     } else if(var0 == 6624) {
                        WorldMapType1.method196().method6089(class69.intStack[--class69.intStackSize]);
                        return 1;
                     } else if(var0 == 6625) {
                        WorldMapType1.method196().method6040();
                        return 1;
                     } else if(var0 == 6626) {
                        WorldMapType1.method196().method6041(class69.intStack[--class69.intStackSize]);
                        return 1;
                     } else if(var0 == 6627) {
                        WorldMapType1.method196().method6042();
                        return 1;
                     } else {
                        boolean var14;
                        if(var0 == 6628) {
                           var14 = class69.intStack[--class69.intStackSize] == 1;
                           WorldMapType1.method196().method6034(var14);
                           return 1;
                        } else if(var0 == 6629) {
                           var3 = class69.intStack[--class69.intStackSize];
                           WorldMapType1.method196().method6106(var3);
                           return 1;
                        } else if(var0 == 6630) {
                           var3 = class69.intStack[--class69.intStackSize];
                           WorldMapType1.method196().method6152(var3);
                           return 1;
                        } else if(var0 == 6631) {
                           WorldMapType1.method196().method6114();
                           return 1;
                        } else if(var0 == 6632) {
                           var14 = class69.intStack[--class69.intStackSize] == 1;
                           WorldMapType1.method196().method6047(var14);
                           return 1;
                        } else {
                           boolean var4;
                           if(var0 == 6633) {
                              class69.intStackSize -= 2;
                              var3 = class69.intStack[class69.intStackSize];
                              var4 = class69.intStack[class69.intStackSize + 1] == 1;
                              WorldMapType1.method196().method6048(var3, var4);
                              return 1;
                           } else if(var0 == 6634) {
                              class69.intStackSize -= 2;
                              var3 = class69.intStack[class69.intStackSize];
                              var4 = class69.intStack[class69.intStackSize + 1] == 1;
                              WorldMapType1.method196().method6049(var3, var4);
                              return 1;
                           } else if(var0 == 6635) {
                              class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6050()?1:0;
                              return 1;
                           } else if(var0 == 6636) {
                              var3 = class69.intStack[--class69.intStackSize];
                              class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6051(var3)?1:0;
                              return 1;
                           } else if(var0 == 6637) {
                              var3 = class69.intStack[--class69.intStackSize];
                              class69.intStack[++class69.intStackSize - 1] = WorldMapType1.method196().method6052(var3)?1:0;
                              return 1;
                           } else if(var0 == 6638) {
                              class69.intStackSize -= 2;
                              var3 = class69.intStack[class69.intStackSize];
                              var16 = new Coordinates(class69.intStack[class69.intStackSize + 1]);
                              var11 = WorldMapType1.method196().method6100(var3, var16);
                              if(var11 == null) {
                                 class69.intStack[++class69.intStackSize - 1] = -1;
                              } else {
                                 class69.intStack[++class69.intStackSize - 1] = var11.bitpack();
                              }

                              return 1;
                           } else {
                              MapIcon var12;
                              if(var0 == 6639) {
                                 var12 = WorldMapType1.method196().method6146();
                                 if(var12 == null) {
                                    class69.intStack[++class69.intStackSize - 1] = -1;
                                    class69.intStack[++class69.intStackSize - 1] = -1;
                                 } else {
                                    class69.intStack[++class69.intStackSize - 1] = var12.areaId;
                                    class69.intStack[++class69.intStackSize - 1] = var12.field236.bitpack();
                                 }

                                 return 1;
                              } else if(var0 == 6640) {
                                 var12 = WorldMapType1.method196().method6186();
                                 if(var12 == null) {
                                    class69.intStack[++class69.intStackSize - 1] = -1;
                                    class69.intStack[++class69.intStackSize - 1] = -1;
                                 } else {
                                    class69.intStack[++class69.intStackSize - 1] = var12.areaId;
                                    class69.intStack[++class69.intStackSize - 1] = var12.field236.bitpack();
                                 }

                                 return 1;
                              } else {
                                 Area var10;
                                 if(var0 == 6693) {
                                    var3 = class69.intStack[--class69.intStackSize];
                                    var10 = Area.mapAreaType[var3];
                                    if(var10.name == null) {
                                       class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                                    } else {
                                       class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var10.name;
                                    }

                                    return 1;
                                 } else if(var0 == 6694) {
                                    var3 = class69.intStack[--class69.intStackSize];
                                    var10 = Area.mapAreaType[var3];
                                    class69.intStack[++class69.intStackSize - 1] = var10.field3243;
                                    return 1;
                                 } else if(var0 == 6695) {
                                    var3 = class69.intStack[--class69.intStackSize];
                                    var10 = Area.mapAreaType[var3];
                                    if(var10 == null) {
                                       class69.intStack[++class69.intStackSize - 1] = -1;
                                    } else {
                                       class69.intStack[++class69.intStackSize - 1] = var10.field3240;
                                    }

                                    return 1;
                                 } else if(var0 == 6696) {
                                    var3 = class69.intStack[--class69.intStackSize];
                                    var10 = Area.mapAreaType[var3];
                                    if(var10 == null) {
                                       class69.intStack[++class69.intStackSize - 1] = -1;
                                    } else {
                                       class69.intStack[++class69.intStackSize - 1] = var10.spriteId;
                                    }

                                    return 1;
                                 } else if(var0 == 6697) {
                                    class69.intStack[++class69.intStackSize - 1] = ClassInfo.scriptMapIconReference.areaId;
                                    return 1;
                                 } else if(var0 == 6698) {
                                    class69.intStack[++class69.intStackSize - 1] = ClassInfo.scriptMapIconReference.field311.bitpack();
                                    return 1;
                                 } else if(var0 == 6699) {
                                    class69.intStack[++class69.intStackSize - 1] = ClassInfo.scriptMapIconReference.field308.bitpack();
                                    return 1;
                                 } else {
                                    return 2;
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

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Lhi;IIZI)V",
      garbageValue = "-1969536993"
   )
   static void method1563(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if(var0.dynamicWidth == 0) {
         var0.width = var0.originalWidth;
      } else if(var0.dynamicWidth == 1) {
         var0.width = var1 - var0.originalWidth;
      } else if(var0.dynamicWidth == 2) {
         var0.width = var0.originalWidth * var1 >> 14;
      }

      if(var0.buttonType == 0) {
         var0.height = var0.originalHeight;
      } else if(var0.buttonType == 1) {
         var0.height = var2 - var0.originalHeight;
      } else if(var0.buttonType == 2) {
         var0.height = var2 * var0.originalHeight >> 14;
      }

      if(var0.dynamicWidth == 4) {
         var0.width = var0.height * var0.field2622 / var0.field2623;
      }

      if(var0.buttonType == 4) {
         var0.height = var0.field2623 * var0.width / var0.field2622;
      }

      if(var0.contentType == 1337) {
         Client.field784 = var0;
      }

      if(var3 && var0.onResizeListener != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.source = var0;
         var6.params = var0.onResizeListener;
         Client.field638.addFront(var6);
      }

   }
}
