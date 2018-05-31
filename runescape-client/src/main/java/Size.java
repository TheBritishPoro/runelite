import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
@Implements("Size")
public class Size {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Size field70;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Size field71;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Size field72;
   @ObfuscatedName("l")
   final String field73;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2147190539
   )
   final int field79;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 94613509
   )
   final int field75;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -321383721
   )
   final int field76;

   static {
      field70 = new Size("SMALL", 0, 0, 4);
      field71 = new Size("MEDIUM", 2, 1, 2);
      field72 = new Size("LARGE", 1, 2, 0);
   }

   Size(String var1, int var2, int var3, int var4) {
      this.field73 = var1;
      this.field79 = var2;
      this.field75 = var3;
      this.field76 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(FB)Z",
      garbageValue = "-53"
   )
   boolean method103(float var1) {
      return var1 >= (float)this.field76;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ln;",
      garbageValue = "-15"
   )
   static Size method101(int var0) {
      Size[] var1 = new Size[]{field72, field70, field71};
      Size[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Size var4 = var2[var3];
         if(var0 == var4.field75) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lj;III)V",
      garbageValue = "-442042913"
   )
   static void method104(class21 var0, int var1, int var2) {
      WorldMapRegion.field189.method4007(var0, class43.method716(var1, var2, 0));
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "65280"
   )
   static final int method108() {
      if(class10.preferences.hideRoofs) {
         return class13.plane;
      } else {
         int var0 = 3;
         if(class7.cameraPitch < 310) {
            int var1;
            int var2;
            if(Client.field655 == 1) {
               var1 = CacheFile.field1428 >> 7;
               var2 = GrandExchangeEvent.field23 >> 7;
            } else {
               var1 = class138.localPlayer.x >> 7;
               var2 = class138.localPlayer.y >> 7;
            }

            int var3 = CacheFile.cameraX >> 7;
            int var4 = Coordinates.cameraY >> 7;
            if(var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return class13.plane;
            }

            if(var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return class13.plane;
            }

            if((class50.tileSettings[class13.plane][var3][var4] & 4) != 0) {
               var0 = class13.plane;
            }

            int var5;
            if(var1 > var3) {
               var5 = var1 - var3;
            } else {
               var5 = var3 - var1;
            }

            int var6;
            if(var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            int var8;
            if(var5 > var6) {
               var7 = var6 * 65536 / var5;
               var8 = 32768;

               while(var3 != var1) {
                  if(var3 < var1) {
                     ++var3;
                  } else if(var3 > var1) {
                     --var3;
                  }

                  if((class50.tileSettings[class13.plane][var3][var4] & 4) != 0) {
                     var0 = class13.plane;
                  }

                  var8 += var7;
                  if(var8 >= 65536) {
                     var8 -= 65536;
                     if(var4 < var2) {
                        ++var4;
                     } else if(var4 > var2) {
                        --var4;
                     }

                     if((class50.tileSettings[class13.plane][var3][var4] & 4) != 0) {
                        var0 = class13.plane;
                     }
                  }
               }
            } else if(var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var2 != var4) {
                  if(var4 < var2) {
                     ++var4;
                  } else if(var4 > var2) {
                     --var4;
                  }

                  if((class50.tileSettings[class13.plane][var3][var4] & 4) != 0) {
                     var0 = class13.plane;
                  }

                  var8 += var7;
                  if(var8 >= 65536) {
                     var8 -= 65536;
                     if(var3 < var1) {
                        ++var3;
                     } else if(var3 > var1) {
                        --var3;
                     }

                     if((class50.tileSettings[class13.plane][var3][var4] & 4) != 0) {
                        var0 = class13.plane;
                     }
                  }
               }
            }
         }

         if(class138.localPlayer.x >= 0 && class138.localPlayer.y >= 0 && class138.localPlayer.x < 13312 && class138.localPlayer.y < 13312) {
            if((class50.tileSettings[class13.plane][class138.localPlayer.x >> 7][class138.localPlayer.y >> 7] & 4) != 0) {
               var0 = class13.plane;
            }

            return var0;
         } else {
            return class13.plane;
         }
      }
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIII)V",
      garbageValue = "-1825826206"
   )
   static final void method102(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if(var9 != null && (!var9.hasScript || var9.type == 0 || var9.hasListener || class24.getWidgetClickMask(var9) != 0 || var9 == Client.field752 || var9.contentType == 1338) && var9.parentId == var1 && (!var9.hasScript || !class81.method1885(var9))) {
            int var10 = var9.relativeX + var6;
            int var11 = var7 + var9.relativeY;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var42;
            if(var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else if(var9.type == 9) {
               var16 = var10;
               var17 = var11;
               int var18 = var10 + var9.width;
               var42 = var11 + var9.height;
               if(var18 < var10) {
                  var16 = var18;
                  var18 = var10;
               }

               if(var42 < var11) {
                  var17 = var42;
                  var42 = var11;
               }

               ++var18;
               ++var42;
               var12 = var16 > var2?var16:var2;
               var13 = var17 > var3?var17:var3;
               var14 = var18 < var4?var18:var4;
               var15 = var42 < var5?var42:var5;
            } else {
               var16 = var10 + var9.width;
               var17 = var11 + var9.height;
               var12 = var10 > var2?var10:var2;
               var13 = var11 > var3?var11:var3;
               var14 = var16 < var4?var16:var4;
               var15 = var17 < var5?var17:var5;
            }

            if(var9 == Client.draggedWidget) {
               Client.field772 = true;
               Client.field696 = var10;
               Client.field760 = var11;
            }

            if(!var9.hasScript || var12 < var14 && var13 < var15) {
               var16 = MouseInput.mouseLastX;
               var17 = MouseInput.mouseLastY * 673804999;
               if(MouseInput.mouseLastButton != 0) {
                  var16 = MouseInput.mouseLastPressedX;
                  var17 = MouseInput.mouseLastPressedY;
               }

               boolean var56 = var16 >= var12 && var17 >= var13 && var16 < var14 && var17 < var15;
               int var23;
               int var24;
               int var25;
               int var28;
               int var59;
               if(var9.contentType == 1337) {
                  if(!Client.field625 && !Client.isMenuOpen && var56) {
                     if(Client.itemSelectionState == 0 && !Client.spellSelected) {
                        class50.addMenuEntry("Walk here", "", 23, 0, var16 - var12, var17 - var13);
                     }

                     long var19 = -1L;
                     long var21 = -1L;
                     var23 = 0;

                     while(true) {
                        var25 = class120.Viewport_entityCountAtMouse;
                        if(var23 >= var25) {
                           if(var19 != -1L) {
                              var23 = class37.method662(var19);
                              var24 = CacheFile.method2484(var19);
                              Player var39 = Client.cachedPlayers[Client.field707];
                              class221.method4371(var39, Client.field707, var23, var24);
                           }
                           break;
                        }

                        long var49 = WorldMapData.method262(var23);
                        if(var49 != var21) {
                           label1671: {
                              var21 = var49;
                              var28 = TotalQuantityComparator.method32(var23);
                              var59 = WorldMapType2.method435(var23);
                              long var32 = class120.field1647[var23];
                              int var31 = (int)(var32 >>> 14 & 3L);
                              int var51 = Item.method1864(var23);
                              if(var31 == 2 && MapIcon.region.method2902(class13.plane, var28, var59, var49) >= 0) {
                                 ObjectComposition var33 = FileOnDisk.getObjectDefinition(var51);
                                 if(var33.impostorIds != null) {
                                    var33 = var33.getImpostor();
                                 }

                                 if(var33 == null) {
                                    break label1671;
                                 }

                                 if(Client.itemSelectionState == 1) {
                                    class50.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class6.getColTags(65535) + var33.name, 1, var51, var28, var59);
                                 } else if(Client.spellSelected) {
                                    if((Actor.field932 & 4) == 4) {
                                       class50.addMenuEntry(Client.field612, Client.field739 + " " + "->" + " " + class6.getColTags(65535) + var33.name, 2, var51, var28, var59);
                                    }
                                 } else {
                                    String[] var34 = var33.actions;
                                    if(var34 != null) {
                                       for(int var35 = 4; var35 >= 0; --var35) {
                                          if(var34[var35] != null) {
                                             short var36 = 0;
                                             if(var35 == 0) {
                                                var36 = 3;
                                             }

                                             if(var35 == 1) {
                                                var36 = 4;
                                             }

                                             if(var35 == 2) {
                                                var36 = 5;
                                             }

                                             if(var35 == 3) {
                                                var36 = 6;
                                             }

                                             if(var35 == 4) {
                                                var36 = 1001;
                                             }

                                             class50.addMenuEntry(var34[var35], class6.getColTags(65535) + var33.name, var36, var51, var28, var59);
                                          }
                                       }
                                    }

                                    class50.addMenuEntry("Examine", class6.getColTags(65535) + var33.name, 1002, var33.id, var28, var59);
                                 }
                              }

                              Player var37;
                              int var52;
                              NPC var53;
                              int var64;
                              int[] var70;
                              if(var31 == 1) {
                                 NPC var60 = Client.cachedNPCs[var51];
                                 if(var60 == null) {
                                    break label1671;
                                 }

                                 if(var60.composition.size == 1 && (var60.x & 127) == 64 && (var60.y & 127) == 64) {
                                    for(var52 = 0; var52 < Client.npcIndexesCount; ++var52) {
                                       var53 = Client.cachedNPCs[Client.npcIndices[var52]];
                                       if(var53 != null && var60 != var53 && var53.composition.size == 1 && var53.x == var60.x && var60.y == var53.y) {
                                          MapIcon.method474(var53.composition, Client.npcIndices[var52], var28, var59);
                                       }
                                    }

                                    var52 = class81.playerIndexesCount;
                                    var70 = class81.playerIndices;

                                    for(var64 = 0; var64 < var52; ++var64) {
                                       var37 = Client.cachedPlayers[var70[var64]];
                                       if(var37 != null && var37.x == var60.x && var37.y == var60.y) {
                                          class221.method4371(var37, var70[var64], var28, var59);
                                       }
                                    }
                                 }

                                 MapIcon.method474(var60.composition, var51, var28, var59);
                              }

                              if(var31 == 0) {
                                 Player var61 = Client.cachedPlayers[var51];
                                 if(var61 == null) {
                                    break label1671;
                                 }

                                 if((var61.x & 127) == 64 && (var61.y & 127) == 64) {
                                    for(var52 = 0; var52 < Client.npcIndexesCount; ++var52) {
                                       var53 = Client.cachedNPCs[Client.npcIndices[var52]];
                                       if(var53 != null && var53.composition.size == 1 && var61.x == var53.x && var53.y == var61.y) {
                                          MapIcon.method474(var53.composition, Client.npcIndices[var52], var28, var59);
                                       }
                                    }

                                    var52 = class81.playerIndexesCount;
                                    var70 = class81.playerIndices;

                                    for(var64 = 0; var64 < var52; ++var64) {
                                       var37 = Client.cachedPlayers[var70[var64]];
                                       if(var37 != null && var37 != var61 && var61.x == var37.x && var37.y == var61.y) {
                                          class221.method4371(var37, var70[var64], var28, var59);
                                       }
                                    }
                                 }

                                 if(var51 != Client.field707) {
                                    class221.method4371(var61, var51, var28, var59);
                                 } else {
                                    var19 = var49;
                                 }
                              }

                              if(var31 == 3) {
                                 Deque var63 = Client.groundItemDeque[class13.plane][var28][var59];
                                 if(var63 != null) {
                                    for(Item var62 = (Item)var63.getTail(); var62 != null; var62 = (Item)var63.getPrevious()) {
                                       ItemComposition var71 = TextureProvider.getItemDefinition(var62.id);
                                       if(Client.itemSelectionState == 1) {
                                          class50.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class6.getColTags(16748608) + var71.name, 16, var62.id, var28, var59);
                                       } else if(Client.spellSelected) {
                                          if((Actor.field932 & 1) == 1) {
                                             class50.addMenuEntry(Client.field612, Client.field739 + " " + "->" + " " + class6.getColTags(16748608) + var71.name, 17, var62.id, var28, var59);
                                          }
                                       } else {
                                          String[] var54 = var71.groundActions;

                                          for(int var55 = 4; var55 >= 0; --var55) {
                                             if(var54 != null && var54[var55] != null) {
                                                byte var38 = 0;
                                                if(var55 == 0) {
                                                   var38 = 18;
                                                }

                                                if(var55 == 1) {
                                                   var38 = 19;
                                                }

                                                if(var55 == 2) {
                                                   var38 = 20;
                                                }

                                                if(var55 == 3) {
                                                   var38 = 21;
                                                }

                                                if(var55 == 4) {
                                                   var38 = 22;
                                                }

                                                class50.addMenuEntry(var54[var55], class6.getColTags(16748608) + var71.name, var38, var62.id, var28, var59);
                                             } else if(var55 == 2) {
                                                class50.addMenuEntry("Take", class6.getColTags(16748608) + var71.name, 20, var62.id, var28, var59);
                                             }
                                          }

                                          class50.addMenuEntry("Examine", class6.getColTags(16748608) + var71.name, 1004, var62.id, var28, var59);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        ++var23;
                     }
                  }
               } else if(var9.contentType == 1338) {
                  MapIconReference.method632(var9, var10, var11);
               } else {
                  if(var9.contentType == 1400) {
                     ItemContainer.renderOverview.method6003(MouseInput.mouseLastX, MouseInput.mouseLastY * 673804999, var56, var10, var11, var9.width, var9.height);
                  }

                  int var20;
                  int var22;
                  int var43;
                  boolean var67;
                  if(!Client.isMenuOpen && var56) {
                     if(var9.contentType == 1400) {
                        ItemContainer.renderOverview.method6158(var10, var11, var9.width, var9.height, var16, var17);
                     } else {
                        var42 = var16 - var10;
                        var20 = var17 - var11;
                        if(var9.field2709 == 1) {
                           class50.addMenuEntry(var9.tooltip, "", 24, 0, 0, var9.id);
                        }

                        String var44;
                        if(var9.field2709 == 2 && !Client.spellSelected) {
                           var44 = class151.method3239(var9);
                           if(var44 != null) {
                              class50.addMenuEntry(var44, class6.getColTags(65280) + var9.spellName, 25, 0, -1, var9.id);
                           }
                        }

                        if(var9.field2709 == 3) {
                           class50.addMenuEntry("Close", "", 26, 0, 0, var9.id);
                        }

                        if(var9.field2709 == 4) {
                           class50.addMenuEntry(var9.tooltip, "", 28, 0, 0, var9.id);
                        }

                        if(var9.field2709 == 5) {
                           class50.addMenuEntry(var9.tooltip, "", 29, 0, 0, var9.id);
                        }

                        if(var9.field2709 == 6 && Client.field744 == null) {
                           class50.addMenuEntry(var9.tooltip, "", 30, 0, -1, var9.id);
                        }

                        if(var9.type == 2) {
                           var43 = 0;

                           for(var22 = 0; var22 < var9.height; ++var22) {
                              for(var23 = 0; var23 < var9.width; ++var23) {
                                 var24 = var23 * (var9.paddingX + 32);
                                 var25 = var22 * (var9.paddingY + 32);
                                 if(var43 < 20) {
                                    var24 += var9.xSprites[var43];
                                    var25 += var9.field2738[var43];
                                 }

                                 if(var42 >= var24 && var20 >= var25 && var42 < var24 + 32 && var20 < var25 + 32) {
                                    Client.field691 = var43;
                                    Occluder.field1819 = var9;
                                    if(var9.itemIds[var43] > 0) {
                                       ItemComposition var26 = TextureProvider.getItemDefinition(var9.itemIds[var43] - 1);
                                       if(Client.itemSelectionState == 1 && class145.method3188(class24.getWidgetClickMask(var9))) {
                                          if(var9.id != class187.field2372 || var43 != class13.selectedItemIndex) {
                                             class50.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class6.getColTags(16748608) + var26.name, 31, var26.id, var43, var9.id);
                                          }
                                       } else if(Client.spellSelected && class145.method3188(class24.getWidgetClickMask(var9))) {
                                          if((Actor.field932 & 16) == 16) {
                                             class50.addMenuEntry(Client.field612, Client.field739 + " " + "->" + " " + class6.getColTags(16748608) + var26.name, 32, var26.id, var43, var9.id);
                                          }
                                       } else {
                                          String[] var27 = var26.inventoryActions;
                                          var28 = -1;
                                          if(Client.field726) {
                                             boolean var29 = Client.field727 || KeyFocusListener.keyPressed[81];
                                             if(var29) {
                                                var28 = var26.getShiftClickActionIndex();
                                             }
                                          }

                                          if(class145.method3188(class24.getWidgetClickMask(var9))) {
                                             for(var59 = 4; var59 >= 3; --var59) {
                                                if(var28 != var59) {
                                                   ScriptEvent.method1027(var9, var26, var43, var59, false);
                                                }
                                             }
                                          }

                                          if(class148.method3197(class24.getWidgetClickMask(var9))) {
                                             class50.addMenuEntry("Use", class6.getColTags(16748608) + var26.name, 38, var26.id, var43, var9.id);
                                          }

                                          if(class145.method3188(class24.getWidgetClickMask(var9))) {
                                             for(var59 = 2; var59 >= 0; --var59) {
                                                if(var59 != var28) {
                                                   ScriptEvent.method1027(var9, var26, var43, var59, false);
                                                }
                                             }

                                             if(var28 >= 0) {
                                                ScriptEvent.method1027(var9, var26, var43, var28, true);
                                             }
                                          }

                                          var27 = var9.configActions;
                                          if(var27 != null) {
                                             for(var59 = 4; var59 >= 0; --var59) {
                                                if(var27[var59] != null) {
                                                   byte var30 = 0;
                                                   if(var59 == 0) {
                                                      var30 = 39;
                                                   }

                                                   if(var59 == 1) {
                                                      var30 = 40;
                                                   }

                                                   if(var59 == 2) {
                                                      var30 = 41;
                                                   }

                                                   if(var59 == 3) {
                                                      var30 = 42;
                                                   }

                                                   if(var59 == 4) {
                                                      var30 = 43;
                                                   }

                                                   class50.addMenuEntry(var27[var59], class6.getColTags(16748608) + var26.name, var30, var26.id, var43, var9.id);
                                                }
                                             }
                                          }

                                          class50.addMenuEntry("Examine", class6.getColTags(16748608) + var26.name, 1005, var26.id, var43, var9.id);
                                       }
                                    }
                                 }

                                 ++var43;
                              }
                           }
                        }

                        if(var9.hasScript) {
                           if(Client.spellSelected) {
                              var22 = class24.getWidgetClickMask(var9);
                              var67 = (var22 >> 21 & 1) != 0;
                              if(var67 && (Actor.field932 & 32) == 32) {
                                 class50.addMenuEntry(Client.field612, Client.field739 + " " + "->" + " " + var9.opBase, 58, 0, var9.index, var9.id);
                              }
                           } else {
                              for(var43 = 9; var43 >= 5; --var43) {
                                 String var46 = ItemLayer.method2565(var9, var43);
                                 if(var46 != null) {
                                    class50.addMenuEntry(var46, var9.opBase, 1007, var43 + 1, var9.index, var9.id);
                                 }
                              }

                              var44 = class151.method3239(var9);
                              if(var44 != null) {
                                 class50.addMenuEntry(var44, var9.opBase, 25, 0, var9.index, var9.id);
                              }

                              for(var22 = 4; var22 >= 0; --var22) {
                                 String var47 = ItemLayer.method2565(var9, var22);
                                 if(var47 != null) {
                                    class50.addMenuEntry(var47, var9.opBase, 57, var22 + 1, var9.index, var9.id);
                                 }
                              }

                              var23 = class24.getWidgetClickMask(var9);
                              boolean var58 = (var23 & 1) != 0;
                              if(var58) {
                                 class50.addMenuEntry("Continue", "", 30, 0, var9.index, var9.id);
                              }
                           }
                        }
                     }
                  }

                  if(var9.type == 0) {
                     if(!var9.hasScript && class81.method1885(var9) && var9 != class143.field1897) {
                        continue;
                     }

                     method102(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     if(var9.children != null) {
                        method102(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     }

                     WidgetNode var40 = (WidgetNode)Client.componentTable.get((long)var9.id);
                     if(var40 != null) {
                        if(var40.owner == 0 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15 && !Client.isMenuOpen) {
                           for(ScriptEvent var41 = (ScriptEvent)Client.field638.getFront(); var41 != null; var41 = (ScriptEvent)Client.field638.getNext()) {
                              if(var41.boolean1) {
                                 var41.unlink();
                                 var41.source.field2731 = false;
                              }
                           }

                           if(class6.field39 == 0) {
                              Client.draggedWidget = null;
                              Client.field752 = null;
                           }

                           if(!Client.isMenuOpen) {
                              class59.method1077();
                           }
                        }

                        var20 = var40.id;
                        if(CombatInfo2.loadWidget(var20)) {
                           method102(GameCanvas.widgets[var20], -1, var12, var13, var14, var15, var10, var11);
                        }
                     }
                  }

                  if(var9.hasScript) {
                     ScriptEvent var65;
                     if(!var9.noClickThrough) {
                        if(var9.noScrollThrough && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15) {
                           for(var65 = (ScriptEvent)Client.field638.getFront(); var65 != null; var65 = (ScriptEvent)Client.field638.getNext()) {
                              if(var65.boolean1 && var65.source.onScrollWheelListener == var65.params) {
                                 var65.unlink();
                              }
                           }
                        }
                     } else if(MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15) {
                        for(var65 = (ScriptEvent)Client.field638.getFront(); var65 != null; var65 = (ScriptEvent)Client.field638.getNext()) {
                           if(var65.boolean1) {
                              var65.unlink();
                              var65.source.field2731 = false;
                           }
                        }

                        if(class6.field39 == 0) {
                           Client.draggedWidget = null;
                           Client.field752 = null;
                        }

                        if(!Client.isMenuOpen) {
                           class59.method1077();
                        }
                     }

                     if(MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15) {
                        var56 = true;
                     } else {
                        var56 = false;
                     }

                     boolean var66 = false;
                     if((MouseInput.mouseCurrentButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseCurrentButton == 4) && var56) {
                        var66 = true;
                     }

                     boolean var57 = false;
                     if((MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= var12 && MouseInput.mouseLastPressedY >= var13 && MouseInput.mouseLastPressedX < var14 && MouseInput.mouseLastPressedY < var15) {
                        var57 = true;
                     }

                     if(var57) {
                        ClientPacket.method3447(var9, MouseInput.mouseLastPressedX - var10, MouseInput.mouseLastPressedY - var11);
                     }

                     if(var9.contentType == 1400) {
                        ItemContainer.renderOverview.method6174(var16, var17, var56 & var66, var56 & var57);
                     }

                     if(Client.draggedWidget != null && var9 != Client.draggedWidget && var56) {
                        var22 = class24.getWidgetClickMask(var9);
                        var67 = (var22 >> 20 & 1) != 0;
                        if(var67) {
                           Client.draggedOnWidget = var9;
                        }
                     }

                     if(var9 == Client.field752) {
                        Client.field601 = true;
                        Client.field757 = var10;
                        Client.field758 = var11;
                     }

                     if(var9.hasListener) {
                        ScriptEvent var68;
                        if(var56 && Client.mouseWheelRotation != 0 && var9.onScrollWheelListener != null) {
                           var68 = new ScriptEvent();
                           var68.boolean1 = true;
                           var68.source = var9;
                           var68.mouseY = Client.mouseWheelRotation;
                           var68.params = var9.onScrollWheelListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.draggedWidget != null || class276.field3559 != null || Client.isMenuOpen) {
                           var57 = false;
                           var66 = false;
                           var56 = false;
                        }

                        if(!var9.field2674 && var57) {
                           var9.field2674 = true;
                           if(var9.onClickListener != null) {
                              var68 = new ScriptEvent();
                              var68.boolean1 = true;
                              var68.source = var9;
                              var68.mouseX = MouseInput.mouseLastPressedX - var10;
                              var68.mouseY = MouseInput.mouseLastPressedY - var11;
                              var68.params = var9.onClickListener;
                              Client.field638.addFront(var68);
                           }
                        }

                        if(var9.field2674 && var66 && var9.onClickRepeatListener != null) {
                           var68 = new ScriptEvent();
                           var68.boolean1 = true;
                           var68.source = var9;
                           var68.mouseX = MouseInput.mouseLastX - var10;
                           var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                           var68.params = var9.onClickRepeatListener;
                           Client.field638.addFront(var68);
                        }

                        if(var9.field2674 && !var66) {
                           var9.field2674 = false;
                           if(var9.onReleaseListener != null) {
                              var68 = new ScriptEvent();
                              var68.boolean1 = true;
                              var68.source = var9;
                              var68.mouseX = MouseInput.mouseLastX - var10;
                              var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                              var68.params = var9.onReleaseListener;
                              Client.field779.addFront(var68);
                           }
                        }

                        if(var66 && var9.onHoldListener != null) {
                           var68 = new ScriptEvent();
                           var68.boolean1 = true;
                           var68.source = var9;
                           var68.mouseX = MouseInput.mouseLastX - var10;
                           var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                           var68.params = var9.onHoldListener;
                           Client.field638.addFront(var68);
                        }

                        if(!var9.field2731 && var56) {
                           var9.field2731 = true;
                           if(var9.onMouseOverListener != null) {
                              var68 = new ScriptEvent();
                              var68.boolean1 = true;
                              var68.source = var9;
                              var68.mouseX = MouseInput.mouseLastX - var10;
                              var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                              var68.params = var9.onMouseOverListener;
                              Client.field638.addFront(var68);
                           }
                        }

                        if(var9.field2731 && var56 && var9.onMouseRepeatListener != null) {
                           var68 = new ScriptEvent();
                           var68.boolean1 = true;
                           var68.source = var9;
                           var68.mouseX = MouseInput.mouseLastX - var10;
                           var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                           var68.params = var9.onMouseRepeatListener;
                           Client.field638.addFront(var68);
                        }

                        if(var9.field2731 && !var56) {
                           var9.field2731 = false;
                           if(var9.onMouseLeaveListener != null) {
                              var68 = new ScriptEvent();
                              var68.boolean1 = true;
                              var68.source = var9;
                              var68.mouseX = MouseInput.mouseLastX - var10;
                              var68.mouseY = MouseInput.mouseLastY * 673804999 - var11;
                              var68.params = var9.onMouseLeaveListener;
                              Client.field779.addFront(var68);
                           }
                        }

                        if(var9.onTimerListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onTimerListener;
                           Client.field778.addFront(var68);
                        }

                        ScriptEvent var45;
                        if(var9.onVarTransmitListener != null && Client.pendingVarbitCount > var9.field2683) {
                           if(var9.varTransmitTriggers != null && Client.pendingVarbitCount - var9.field2683 <= 32) {
                              label1369:
                              for(var43 = var9.field2683; var43 < Client.pendingVarbitCount; ++var43) {
                                 var22 = Client.pendingVarbitChanges[var43 & 31];

                                 for(var23 = 0; var23 < var9.varTransmitTriggers.length; ++var23) {
                                    if(var22 == var9.varTransmitTriggers[var23]) {
                                       var45 = new ScriptEvent();
                                       var45.source = var9;
                                       var45.params = var9.onVarTransmitListener;
                                       Client.field638.addFront(var45);
                                       break label1369;
                                    }
                                 }
                              }
                           } else {
                              var68 = new ScriptEvent();
                              var68.source = var9;
                              var68.params = var9.onVarTransmitListener;
                              Client.field638.addFront(var68);
                           }

                           var9.field2683 = Client.pendingVarbitCount;
                        }

                        if(var9.onInvTransmitListener != null && Client.field767 > var9.field2735) {
                           if(var9.invTransmitTriggers != null && Client.field767 - var9.field2735 <= 32) {
                              label1345:
                              for(var43 = var9.field2735; var43 < Client.field767; ++var43) {
                                 var22 = Client.interfaceItemTriggers[var43 & 31];

                                 for(var23 = 0; var23 < var9.invTransmitTriggers.length; ++var23) {
                                    if(var22 == var9.invTransmitTriggers[var23]) {
                                       var45 = new ScriptEvent();
                                       var45.source = var9;
                                       var45.params = var9.onInvTransmitListener;
                                       Client.field638.addFront(var45);
                                       break label1345;
                                    }
                                 }
                              }
                           } else {
                              var68 = new ScriptEvent();
                              var68.source = var9;
                              var68.params = var9.onInvTransmitListener;
                              Client.field638.addFront(var68);
                           }

                           var9.field2735 = Client.field767;
                        }

                        if(var9.onStatTransmitListener != null && Client.changedSkillsCount > var9.field2702) {
                           if(var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2702 <= 32) {
                              label1321:
                              for(var43 = var9.field2702; var43 < Client.changedSkillsCount; ++var43) {
                                 var22 = Client.changedSkills[var43 & 31];

                                 for(var23 = 0; var23 < var9.statTransmitTriggers.length; ++var23) {
                                    if(var22 == var9.statTransmitTriggers[var23]) {
                                       var45 = new ScriptEvent();
                                       var45.source = var9;
                                       var45.params = var9.onStatTransmitListener;
                                       Client.field638.addFront(var45);
                                       break label1321;
                                    }
                                 }
                              }
                           } else {
                              var68 = new ScriptEvent();
                              var68.source = var9;
                              var68.params = var9.onStatTransmitListener;
                              Client.field638.addFront(var68);
                           }

                           var9.field2702 = Client.changedSkillsCount;
                        }

                        if(Client.chatCycle > var9.field2697 && var9.onChatTransmitListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onChatTransmitListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.field647 > var9.field2697 && var9.onFriendTransmitListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onFriendTransmitListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.field828 > var9.field2697 && var9.onClanTransmitListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onClanTransmitListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.field793 > var9.field2697 && var9.onStockTransmitListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onStockTransmitListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.field774 > var9.field2697 && var9.onCamFinishedListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onCamFinishedListener;
                           Client.field638.addFront(var68);
                        }

                        if(Client.field775 > var9.field2697 && var9.onMiscTransmitListener != null) {
                           var68 = new ScriptEvent();
                           var68.source = var9;
                           var68.params = var9.onMiscTransmitListener;
                           Client.field638.addFront(var68);
                        }

                        var9.field2697 = Client.cycleCntr;
                        if(var9.onKeyListener != null) {
                           for(var43 = 0; var43 < Client.field799; ++var43) {
                              ScriptEvent var69 = new ScriptEvent();
                              var69.source = var9;
                              var69.typedKeyCode = Client.field773[var43];
                              var69.typedKeyChar = Client.field800[var43];
                              var69.params = var9.onKeyListener;
                              Client.field638.addFront(var69);
                           }
                        }
                     }
                  }

                  if(!var9.hasScript && Client.draggedWidget == null && class276.field3559 == null && !Client.isMenuOpen) {
                     if((var9.field2713 >= 0 || var9.field2632 != 0) && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15) {
                        if(var9.field2713 >= 0) {
                           class143.field1897 = var0[var9.field2713];
                        } else {
                           class143.field1897 = var9;
                        }
                     }

                     if(var9.type == 8 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY * 673804999 >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY * 673804999 < var15) {
                        class141.field1888 = var9;
                     }

                     if(var9.scrollHeight > var9.height) {
                        var42 = var10 + var9.width;
                        var20 = var9.height;
                        var43 = var9.scrollHeight;
                        var22 = MouseInput.mouseLastX;
                        var23 = MouseInput.mouseLastY * 673804999;
                        if(Client.field746) {
                           Client.field660 = 32;
                        } else {
                           Client.field660 = 0;
                        }

                        Client.field746 = false;
                        if(MouseInput.mouseCurrentButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseCurrentButton == 4) {
                           if(var22 >= var42 && var22 < var42 + 16 && var23 >= var11 && var23 < var11 + 16) {
                              var9.scrollY -= 4;
                              Player.method1114(var9);
                           } else if(var22 >= var42 && var22 < var42 + 16 && var23 >= var11 + var20 - 16 && var23 < var11 + var20) {
                              var9.scrollY += 4;
                              Player.method1114(var9);
                           } else if(var22 >= var42 - Client.field660 && var22 < var42 + Client.field660 + 16 && var23 >= var11 + 16 && var23 < var11 + var20 - 16) {
                              var24 = var20 * (var20 - 32) / var43;
                              if(var24 < 8) {
                                 var24 = 8;
                              }

                              var25 = var23 - var11 - 16 - var24 / 2;
                              int var48 = var20 - 32 - var24;
                              var9.scrollY = var25 * (var43 - var20) / var48;
                              Player.method1114(var9);
                              Client.field746 = true;
                           }
                        }

                        if(Client.mouseWheelRotation != 0) {
                           var24 = var9.width;
                           if(var22 >= var42 - var24 && var23 >= var11 && var22 < var42 + 16 && var23 <= var20 + var11) {
                              var9.scrollY += Client.mouseWheelRotation * 45;
                              Player.method1114(var9);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1351336355"
   )
   static final void method110(String var0) {
      if(!var0.equals("")) {
         PacketNode var1 = class26.method433(ClientPacket.field2153, Client.field626.field1218);
         var1.packetBuffer.putByte(class316.getLength(var0));
         var1.packetBuffer.putString(var0);
         Client.field626.method1980(var1);
      }
   }
}
