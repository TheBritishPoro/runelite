import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("MapIcon")
public class MapIcon {
   @ObfuscatedName("ph")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   @Export("soundSystem0")
   static AbstractSoundSystem soundSystem0;
   @ObfuscatedName("bo")
   static String field238;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("slStarSprites")
   static IndexedSprite[] slStarSprites;
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   @Export("region")
   static Region region;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -634505767
   )
   @Export("areaId")
   public final int areaId;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public final Coordinates field236;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public final Coordinates field243;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -39739323
   )
   final int field242;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1039553607
   )
   final int field239;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   final MapLabel field246;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1300917331
   )
   @Export("screenX")
   int screenX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 484533419
   )
   @Export("screenY")
   int screenY;

   @ObfuscatedSignature(
      signature = "(ILha;Lha;Ld;)V"
   )
   MapIcon(int var1, Coordinates var2, Coordinates var3, MapLabel var4) {
      this.areaId = var1;
      this.field243 = var2;
      this.field236 = var3;
      this.field246 = var4;
      Area var5 = Area.mapAreaType[this.areaId];
      SpritePixels var6 = var5.getMapIcon(false);
      if(var6 != null) {
         this.field242 = var6.width;
         this.field239 = var6.height;
      } else {
         this.field242 = 0;
         this.field239 = 0;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2020334736"
   )
   boolean method464(int var1, int var2) {
      return this.method465(var1, var2)?true:this.method466(var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1022312970"
   )
   boolean method465(int var1, int var2) {
      Area var3 = Area.mapAreaType[this.areaId];
      switch(var3.horizontalAlignment.value) {
      case 0:
         if(var1 >= this.screenX - this.field242 / 2 && var1 <= this.field242 / 2 + this.screenX) {
            break;
         }

         return false;
      case 1:
         if(var1 > this.screenX - this.field242 && var1 <= this.screenX) {
            break;
         }

         return false;
      case 2:
         if(var1 < this.screenX || var1 >= this.screenX + this.field242) {
            return false;
         }
      }

      switch(var3.verticalAlignment.value) {
      case 0:
         if(var2 >= this.screenY && var2 < this.screenY + this.field239) {
            break;
         }

         return false;
      case 1:
         if(var2 < this.screenY - this.field239 / 2 || var2 > this.field239 / 2 + this.screenY) {
            return false;
         }
         break;
      case 2:
         if(var2 <= this.screenY - this.field239 || var2 > this.screenY) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "-43"
   )
   boolean method466(int var1, int var2) {
      return this.field246 == null?false:(var1 >= this.screenX - this.field246.field184 / 2 && var1 <= this.field246.field184 / 2 + this.screenX?var2 >= this.screenY && var2 <= this.field246.field182 + this.screenY:false);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1804250172"
   )
   static final void method475() {
      Object var10000 = null;
      String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
      class143.sendGameMessage(30, "", var0);
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(Ljq;IIII)V",
      garbageValue = "-801364707"
   )
   static final void method474(NPCComposition var0, int var1, int var2, int var3) {
      if(Client.menuOptionCount < 400) {
         if(var0.configs != null) {
            var0 = var0.transform();
         }

         if(var0 != null) {
            if(var0.field3504) {
               if(!var0.field3517 || Client.field748 == var1) {
                  String var4 = var0.name;
                  if(var0.combatLevel != 0) {
                     var4 = var4 + UrlRequester.method3113(var0.combatLevel, class138.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")";
                  }

                  if(var0.field3517 && Client.field725) {
                     class50.addMenuEntry("Examine", class6.getColTags(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(Client.itemSelectionState == 1) {
                     class50.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class6.getColTags(16776960) + var4, 7, var1, var2, var3);
                  } else if(Client.spellSelected) {
                     if((Actor.field932 & 2) == 2) {
                        class50.addMenuEntry(Client.field612, Client.field739 + " " + "->" + " " + class6.getColTags(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var5 = var0.field3517 && Client.field725?2000:0;
                     String[] var6 = var0.actions;
                     int var7;
                     int var8;
                     if(var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var6[var7] != null && !var6[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if(var7 == 0) {
                                 var8 = var5 + 9;
                              }

                              if(var7 == 1) {
                                 var8 = var5 + 10;
                              }

                              if(var7 == 2) {
                                 var8 = var5 + 11;
                              }

                              if(var7 == 3) {
                                 var8 = var5 + 12;
                              }

                              if(var7 == 4) {
                                 var8 = var5 + 13;
                              }

                              class50.addMenuEntry(var6[var7], class6.getColTags(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var6[var7] != null && var6[var7].equalsIgnoreCase("Attack")) {
                              short var9 = 0;
                              if(Client.npcAttackOption != AttackOption.AttackOption_hidden) {
                                 if(Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > class138.localPlayer.combatLevel) {
                                    var9 = 2000;
                                 }

                                 var8 = 0;
                                 if(var7 == 0) {
                                    var8 = var9 + 9;
                                 }

                                 if(var7 == 1) {
                                    var8 = var9 + 10;
                                 }

                                 if(var7 == 2) {
                                    var8 = var9 + 11;
                                 }

                                 if(var7 == 3) {
                                    var8 = var9 + 12;
                                 }

                                 if(var7 == 4) {
                                    var8 = var9 + 13;
                                 }

                                 class50.addMenuEntry(var6[var7], class6.getColTags(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.field3517 || !Client.field725) {
                        class50.addMenuEntry("Examine", class6.getColTags(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIIII)V",
      garbageValue = "1699160696"
   )
   @Export("gameDraw")
   static final void gameDraw(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
      Graphics3D.Rasterizer3D_method1();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if(var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.draggedWidget)) {
            int var11;
            if(var8 == -1) {
               Client.widgetPositionX[Client.widgetCount] = var10.relativeX + var6;
               Client.widgetPositionY[Client.widgetCount] = var7 + var10.relativeY;
               Client.widgetBoundsWidth[Client.widgetCount] = var10.width;
               Client.widgetBoundsHeight[Client.widgetCount] = var10.height;
               var11 = ++Client.widgetCount - 1;
            } else {
               var11 = var8;
            }

            var10.boundsIndex = var11;
            var10.loopCycle = Client.gameCycle;
            if(!var10.hasScript || !class81.method1885(var10)) {
               int var12;
               if(var10.contentType > 0) {
                  var12 = var10.contentType;
                  if(var12 == 324) {
                     if(Client.field842 == -1) {
                        Client.field842 = var10.spriteId;
                        Client.field586 = var10.field2641;
                     }

                     if(Client.field841.isFemale) {
                        var10.spriteId = Client.field842;
                     } else {
                        var10.spriteId = Client.field586;
                     }
                  } else if(var12 == 325) {
                     if(Client.field842 == -1) {
                        Client.field842 = var10.spriteId;
                        Client.field586 = var10.field2641;
                     }

                     if(Client.field841.isFemale) {
                        var10.spriteId = Client.field586;
                     } else {
                        var10.spriteId = Client.field842;
                     }
                  } else if(var12 == 327) {
                     var10.rotationX = 150;
                     var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                     var10.modelType = 5;
                     var10.modelId = 0;
                  } else if(var12 == 328) {
                     var10.rotationX = 150;
                     var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                     var10.modelType = 5;
                     var10.modelId = 1;
                  }
               }

               var12 = var10.relativeX + var6;
               int var13 = var7 + var10.relativeY;
               int var14 = var10.opacity;
               int var15;
               int var16;
               if(var10 == Client.draggedWidget) {
                  if(var1 != -1412584499 && !var10.dragRenderBehavior) {
                     Occluder.field1814 = var0;
                     class297.field3687 = var6;
                     GrandExchangeEvents.field15 = var7;
                     continue;
                  }

                  if(Client.draggingWidget && Client.field601) {
                     var15 = MouseInput.mouseLastX;
                     var16 = MouseInput.mouseLastY * 673804999;
                     var15 -= Client.field753;
                     var16 -= Client.field749;
                     if(var15 < Client.field757) {
                        var15 = Client.field757;
                     }

                     if(var15 + var10.width > Client.field757 + Client.field752.width) {
                        var15 = Client.field757 + Client.field752.width - var10.width;
                     }

                     if(var16 < Client.field758) {
                        var16 = Client.field758;
                     }

                     if(var16 + var10.height > Client.field758 + Client.field752.height) {
                        var16 = Client.field758 + Client.field752.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if(!var10.dragRenderBehavior) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var10.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if(var10.type == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.width;
                  var22 = var13 + var10.height;
                  if(var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if(var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2?var19:var2;
                  var16 = var20 > var3?var20:var3;
                  var17 = var21 < var4?var21:var4;
                  var18 = var22 < var5?var22:var5;
               } else {
                  var19 = var12 + var10.width;
                  var20 = var13 + var10.height;
                  var15 = var12 > var2?var12:var2;
                  var16 = var13 > var3?var13:var3;
                  var17 = var19 < var4?var19:var4;
                  var18 = var20 < var5?var20:var5;
               }

               if(!var10.hasScript || var15 < var17 && var16 < var18) {
                  int var23;
                  int var25;
                  int var26;
                  int var27;
                  int var28;
                  int var29;
                  int var30;
                  int var31;
                  int var33;
                  int var34;
                  int var35;
                  int var37;
                  int var39;
                  int var40;
                  int var41;
                  int var43;
                  int var44;
                  int var45;
                  int var49;
                  int var52;
                  if(var10.contentType != 0) {
                     if(var10.contentType == 1336) {
                        if(Client.displayFps) {
                           var13 += 15;
                           Actor.font_p12full.method5524("Fps:" + GameEngine.FPS, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var68 = Runtime.getRuntime();
                           var20 = (int)((var68.totalMemory() - var68.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if(var20 > 327680 && !Client.lowMemory) {
                              var21 = 16711680;
                           }

                           Actor.font_p12full.method5524("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if(var10.contentType == 1337) {
                        Client.field729 = var12;
                        Client.field730 = var13;
                        var21 = var10.width;
                        var22 = var10.height;
                        ++Client.field687;
                        class148.method3198();
                        IndexFile.method3380();
                        class54.method1019();
                        class24.method424(true);
                        FriendManager.method1655();
                        class24.method424(false);

                        for(Projectile var70 = (Projectile)Client.projectiles.getFront(); var70 != null; var70 = (Projectile)Client.projectiles.getNext()) {
                           if(var70.floor == class13.plane && Client.gameCycle <= var70.endCycle) {
                              if(Client.gameCycle >= var70.startMovementCycle) {
                                 if(var70.interacting > 0) {
                                    NPC var59 = Client.cachedNPCs[var70.interacting - 1];
                                    if(var59 != null && var59.x >= 0 && var59.x < 13312 && var59.y >= 0 && var59.y < 13312) {
                                       var70.moveProjectile(var59.x, var59.y, WorldMapType2.getTileHeight(var59.x, var59.y, var70.floor) - var70.endHeight, Client.gameCycle);
                                    }
                                 }

                                 if(var70.interacting < 0) {
                                    var25 = -var70.interacting - 1;
                                    Player var60;
                                    if(var25 == Client.localInteractingIndex) {
                                       var60 = class138.localPlayer;
                                    } else {
                                       var60 = Client.cachedPlayers[var25];
                                    }

                                    if(var60 != null && var60.x >= 0 && var60.x < 13312 && var60.y >= 0 && var60.y < 13312) {
                                       var70.moveProjectile(var60.x, var60.y, WorldMapType2.getTileHeight(var60.x, var60.y, var70.floor) - var70.endHeight, Client.gameCycle);
                                    }
                                 }

                                 var70.update(Client.field700);
                                 region.method2883(class13.plane, (int)var70.x, (int)var70.y, (int)var70.z, 60, var70, var70.rotationX, -1L, false);
                              }
                           } else {
                              var70.unlink();
                           }
                        }

                        for(GraphicsObject var71 = (GraphicsObject)Client.graphicsObjectDeque.getFront(); var71 != null; var71 = (GraphicsObject)Client.graphicsObjectDeque.getNext()) {
                           if(var71.level == class13.plane && !var71.finished) {
                              if(Client.gameCycle >= var71.startCycle) {
                                 var71.method1771(Client.field700);
                                 if(var71.finished) {
                                    var71.unlink();
                                 } else {
                                    region.method2883(var71.level, var71.x, var71.y, var71.height, 60, var71, 0, -1L, false);
                                 }
                              }
                           } else {
                              var71.unlink();
                           }
                        }

                        class43.method714(var12, var13, var21, var22, true);
                        var19 = Client.Viewport_xOffset;
                        var20 = Client.Viewport_yOffset;
                        var21 = Client.viewportWidth;
                        var22 = Client.viewportHeight;
                        Rasterizer2D.setDrawRegion(var19, var20, var21 + var19, var22 + var20);
                        Graphics3D.Rasterizer3D_method1();
                        if(!Client.field822) {
                           var23 = Client.cameraPitchTarget;
                           if(Client.field738 / 256 > var23) {
                              var23 = Client.field738 / 256;
                           }

                           if(Client.field823[4] && Client.field825[4] + 128 > var23) {
                              var23 = Client.field825[4] + 128;
                           }

                           var49 = Client.mapAngle & 2047;
                           class49.method951(CacheFile.field1428, ItemComposition.field3478, GrandExchangeEvent.field23, var23, var49, var23 * 3 + 600);
                        }

                        if(!Client.field822) {
                           var23 = Size.method108();
                        } else {
                           if(class10.preferences.hideRoofs) {
                              var49 = class13.plane;
                           } else {
                              var25 = WorldMapType2.getTileHeight(CacheFile.cameraX, Coordinates.cameraY, class13.plane);
                              if(var25 - SceneTilePaint.cameraZ < 800 && (class50.tileSettings[class13.plane][CacheFile.cameraX >> 7][Coordinates.cameraY >> 7] & 4) != 0) {
                                 var49 = class13.plane;
                              } else {
                                 var49 = 3;
                              }
                           }

                           var23 = var49;
                        }

                        var49 = CacheFile.cameraX;
                        var25 = SceneTilePaint.cameraZ;
                        var26 = Coordinates.cameraY;
                        var27 = class7.cameraPitch;
                        var28 = DynamicObject.cameraYaw;

                        for(var29 = 0; var29 < 5; ++var29) {
                           if(Client.field823[var29]) {
                              var30 = (int)(Math.random() * (double)(Client.field824[var29] * 2 + 1) - (double)Client.field824[var29] + Math.sin((double)Client.field705[var29] * ((double)Client.field826[var29] / 100.0D)) * (double)Client.field825[var29]);
                              if(var29 == 0) {
                                 CacheFile.cameraX += var30;
                              }

                              if(var29 == 1) {
                                 SceneTilePaint.cameraZ += var30;
                              }

                              if(var29 == 2) {
                                 Coordinates.cameraY += var30;
                              }

                              if(var29 == 3) {
                                 DynamicObject.cameraYaw = var30 + DynamicObject.cameraYaw & 2047;
                              }

                              if(var29 == 4) {
                                 class7.cameraPitch += var30;
                                 if(class7.cameraPitch < 128) {
                                    class7.cameraPitch = 128;
                                 }

                                 if(class7.cameraPitch > 383) {
                                    class7.cameraPitch = 383;
                                 }
                              }
                           }
                        }

                        var29 = MouseInput.mouseLastX;
                        var30 = MouseInput.mouseLastY * 673804999;
                        if(MouseInput.mouseLastButton != 0) {
                           var29 = MouseInput.mouseLastPressedX;
                           var30 = MouseInput.mouseLastPressedY;
                        }

                        if(var29 >= var19 && var29 < var19 + var21 && var30 >= var20 && var30 < var20 + var22) {
                           GameEngine.method913(var29 - var19, var30 - var20);
                        } else {
                           class120.Viewport_containsMouse = false;
                           class120.Viewport_entityCountAtMouse = 0;
                        }

                        class54.method1017();
                        Rasterizer2D.Rasterizer2D_fillRectangle(var19, var20, var21, var22, 0);
                        class54.method1017();
                        var31 = Graphics3D.Rasterizer3D_zoom;
                        Graphics3D.Rasterizer3D_zoom = Client.scale;
                        region.drawRegion(CacheFile.cameraX, SceneTilePaint.cameraZ, Coordinates.cameraY, class7.cameraPitch, DynamicObject.cameraYaw, var23);
                        Graphics3D.Rasterizer3D_zoom = var31;
                        class54.method1017();
                        region.clearEntities();
                        Client.overheadTextCount = 0;
                        boolean var62 = false;
                        var33 = -1;
                        var34 = -1;
                        var35 = class81.playerIndexesCount;
                        int[] var36 = class81.playerIndices;

                        for(var37 = 0; var37 < var35 + Client.npcIndexesCount; ++var37) {
                           Object var38;
                           if(var37 < var35) {
                              var38 = Client.cachedPlayers[var36[var37]];
                              if(var36[var37] == Client.field707) {
                                 var62 = true;
                                 var33 = var37;
                                 continue;
                              }

                              if(var38 == class138.localPlayer) {
                                 var34 = var37;
                                 continue;
                              }
                           } else {
                              var38 = Client.cachedNPCs[Client.npcIndices[var37 - var35]];
                           }

                           class35.draw2DExtras((Actor)var38, var37, var19, var20, var21, var22);
                        }

                        if(Client.field699 && var34 != -1) {
                           class35.draw2DExtras(class138.localPlayer, var34, var19, var20, var21, var22);
                        }

                        if(var62) {
                           class35.draw2DExtras(Client.cachedPlayers[Client.field707], var33, var19, var20, var21, var22);
                        }

                        for(var37 = 0; var37 < Client.overheadTextCount; ++var37) {
                           var52 = Client.overheadTextsX[var37];
                           var39 = Client.overheadTextsY[var37];
                           var40 = Client.overheadTextsOffsetX[var37];
                           var41 = Client.overheadTextsOffsetY[var37];
                           boolean var63 = true;

                           while(var63) {
                              var63 = false;

                              for(var43 = 0; var43 < var37; ++var43) {
                                 if(var39 + 2 > Client.overheadTextsY[var43] - Client.overheadTextsOffsetY[var43] && var39 - var41 < Client.overheadTextsY[var43] + 2 && var52 - var40 < Client.overheadTextsOffsetX[var43] + Client.overheadTextsX[var43] && var40 + var52 > Client.overheadTextsX[var43] - Client.overheadTextsOffsetX[var43] && Client.overheadTextsY[var43] - Client.overheadTextsOffsetY[var43] < var39) {
                                    var39 = Client.overheadTextsY[var43] - Client.overheadTextsOffsetY[var43];
                                    var63 = true;
                                 }
                              }
                           }

                           Client.screenX = Client.overheadTextsX[var37];
                           Client.screenY = Client.overheadTextsY[var37] = var39;
                           String var53 = Client.overheadTexts[var37];
                           if(Client.field742 == 0) {
                              var44 = 16776960;
                              if(Client.field673[var37] < 6) {
                                 var44 = Client.field731[Client.field673[var37]];
                              }

                              if(Client.field673[var37] == 6) {
                                 var44 = Client.field687 % 20 < 10?16711680:16776960;
                              }

                              if(Client.field673[var37] == 7) {
                                 var44 = Client.field687 % 20 < 10?255:'\uffff';
                              }

                              if(Client.field673[var37] == 8) {
                                 var44 = Client.field687 % 20 < 10?'뀀':8454016;
                              }

                              if(Client.field673[var37] == 9) {
                                 var45 = 150 - Client.overheadTextsCyclesRemaining[var37];
                                 if(var45 < 50) {
                                    var44 = var45 * 1280 + 16711680;
                                 } else if(var45 < 100) {
                                    var44 = 16776960 - (var45 - 50) * 327680;
                                 } else if(var45 < 150) {
                                    var44 = (var45 - 100) * 5 + 65280;
                                 }
                              }

                              if(Client.field673[var37] == 10) {
                                 var45 = 150 - Client.overheadTextsCyclesRemaining[var37];
                                 if(var45 < 50) {
                                    var44 = var45 * 5 + 16711680;
                                 } else if(var45 < 100) {
                                    var44 = 16711935 - (var45 - 50) * 327680;
                                 } else if(var45 < 150) {
                                    var44 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                                 }
                              }

                              if(Client.field673[var37] == 11) {
                                 var45 = 150 - Client.overheadTextsCyclesRemaining[var37];
                                 if(var45 < 50) {
                                    var44 = 16777215 - var45 * 327685;
                                 } else if(var45 < 100) {
                                    var44 = (var45 - 50) * 327685 + 65280;
                                 } else if(var45 < 150) {
                                    var44 = 16777215 - (var45 - 100) * 327680;
                                 }
                              }

                              if(Client.field674[var37] == 0) {
                                 ClanMemberManager.fontBold12.drawTextCentered(var53, var19 + Client.screenX, var20 + Client.screenY, var44, 0);
                              }

                              if(Client.field674[var37] == 1) {
                                 ClanMemberManager.fontBold12.method5609(var53, var19 + Client.screenX, var20 + Client.screenY, var44, 0, Client.field687);
                              }

                              if(Client.field674[var37] == 2) {
                                 ClanMemberManager.fontBold12.method5575(var53, var19 + Client.screenX, var20 + Client.screenY, var44, 0, Client.field687);
                              }

                              if(Client.field674[var37] == 3) {
                                 ClanMemberManager.fontBold12.method5539(var53, var19 + Client.screenX, var20 + Client.screenY, var44, 0, Client.field687, 150 - Client.overheadTextsCyclesRemaining[var37]);
                              }

                              if(Client.field674[var37] == 4) {
                                 var45 = (150 - Client.overheadTextsCyclesRemaining[var37]) * (ClanMemberManager.fontBold12.getTextWidth(var53) + 100) / 150;
                                 Rasterizer2D.setInnerDrawRegion(var19 + Client.screenX - 50, var20, var19 + Client.screenX + 50, var20 + var22);
                                 ClanMemberManager.fontBold12.method5522(var53, var19 + Client.screenX + 50 - var45, var20 + Client.screenY, var44, 0);
                                 Rasterizer2D.setDrawRegion(var19, var20, var19 + var21, var22 + var20);
                              }

                              if(Client.field674[var37] == 5) {
                                 var45 = 150 - Client.overheadTextsCyclesRemaining[var37];
                                 int var46 = 0;
                                 if(var45 < 25) {
                                    var46 = var45 - 25;
                                 } else if(var45 > 125) {
                                    var46 = var45 - 125;
                                 }

                                 Rasterizer2D.setInnerDrawRegion(var19, var20 + Client.screenY - ClanMemberManager.fontBold12.verticalSpace - 1, var21 + var19, var20 + Client.screenY + 5);
                                 ClanMemberManager.fontBold12.drawTextCentered(var53, var19 + Client.screenX, var46 + var20 + Client.screenY, var44, 0);
                                 Rasterizer2D.setDrawRegion(var19, var20, var19 + var21, var20 + var22);
                              }
                           } else {
                              ClanMemberManager.fontBold12.drawTextCentered(var53, var19 + Client.screenX, var20 + Client.screenY, 16776960, 0);
                           }
                        }

                        if(Client.hintArrowTargetType == 2) {
                           class238.worldToScreen((Client.hintArrowX - PendingSpawn.baseX << 7) + Client.hintArrowOffsetX, (Client.hintArrowY - Client.baseY << 7) + Client.hintArrowOffsetY, Client.hintArrowOffsetZ * 2);
                           if(Client.screenX > -1 && Client.gameCycle % 20 < 10) {
                              MilliTimer.headIconsHint[0].drawAt(var19 + Client.screenX - 12, var20 + Client.screenY - 28);
                           }
                        }

                        ((TextureProvider)Graphics3D.textureLoader).checkTextures(Client.field700);
                        class16.method158(var19, var20, var21, var22);
                        CacheFile.cameraX = var49;
                        SceneTilePaint.cameraZ = var25;
                        Coordinates.cameraY = var26;
                        class7.cameraPitch = var27;
                        DynamicObject.cameraYaw = var28;
                        if(Client.field625 && class185.method3786(true, false) == 0) {
                           Client.field625 = false;
                        }

                        if(Client.field625) {
                           Rasterizer2D.Rasterizer2D_fillRectangle(var19, var20, var21, var22, 0);
                           class83.method1933("Loading - please wait.", false);
                        }

                        Client.field697[var10.boundsIndex] = true;
                        Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1338) {
                        class173.method3473(var10, var12, var13, var11);
                        Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1339) {
                        class224 var67 = var10.method4517(false);
                        if(var67 != null) {
                           if(Client.field810 < 3) {
                              WallObject.compass.method5845(var12, var13, var67.field2553, var67.field2549, 25, 25, Client.mapAngle, 256, var67.field2551, var67.field2550);
                           } else {
                              Rasterizer2D.method5742(var12, var13, 0, var67.field2551, var67.field2550);
                           }
                        }

                        Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1400) {
                        ItemContainer.renderOverview.extractWorldmap(var12, var13, var10.width, var10.height, Client.gameCycle);
                     }

                     if(var10.contentType == 1401) {
                        ItemContainer.renderOverview.extractData(var12, var13, var10.width, var10.height);
                     }
                  }

                  boolean var57;
                  if(var10.type == 0) {
                     if(!var10.hasScript) {
                        var57 = var10.isHidden;
                        if(var57 && var10 != class143.field1897) {
                           continue;
                        }
                     }

                     if(!var10.hasScript) {
                        if(var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if(var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     gameDraw(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if(var10.children != null) {
                        gameDraw(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     WidgetNode var47 = (WidgetNode)Client.componentTable.get((long)var10.id);
                     if(var47 != null) {
                        class35.method630(var47.id, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                     Graphics3D.Rasterizer3D_method1();
                  }

                  if(Client.isResized || Client.field723[var11] || Client.gameDrawingMode > 1) {
                     if(var10.type == 0 && !var10.hasScript && var10.scrollHeight > var10.height) {
                        var19 = var12 + var10.width;
                        var20 = var10.scrollY;
                        var21 = var10.height;
                        var22 = var10.scrollHeight;
                        BuildType.scrollbarSprites[0].method5829(var19, var13);
                        BuildType.scrollbarSprites[1].method5829(var19, var21 + var13 - 16);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var19, var13 + 16, 16, var21 - 32, Client.field643);
                        var23 = var21 * (var21 - 32) / var22;
                        if(var23 < 8) {
                           var23 = 8;
                        }

                        var49 = var20 * (var21 - 32 - var23) / (var22 - var21);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var19, var13 + var49 + 16, 16, var23, Client.field584);
                        Rasterizer2D.method5738(var19, var49 + var13 + 16, var23, Client.field646);
                        Rasterizer2D.method5738(var19 + 1, var13 + var49 + 16, var23, Client.field646);
                        Rasterizer2D.method5736(var19, var13 + var49 + 16, 16, Client.field646);
                        Rasterizer2D.method5736(var19, var49 + var13 + 17, 16, Client.field646);
                        Rasterizer2D.method5738(var19 + 15, var13 + var49 + 16, var23, Client.field836);
                        Rasterizer2D.method5738(var19 + 14, var49 + var13 + 17, var23 - 1, Client.field836);
                        Rasterizer2D.method5736(var19, var13 + var49 + var23 + 15, 16, Client.field836);
                        Rasterizer2D.method5736(var19 + 1, var49 + var13 + var23 + 14, 15, Client.field836);
                     }

                     if(var10.type != 1) {
                        if(var10.type == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.originalHeight; ++var20) {
                              for(var21 = 0; var21 < var10.originalWidth; ++var21) {
                                 var22 = var12 + var21 * (var10.paddingX + 32);
                                 var23 = var20 * (var10.paddingY + 32) + var13;
                                 if(var19 < 20) {
                                    var22 += var10.xSprites[var19];
                                    var23 += var10.field2738[var19];
                                 }

                                 if(var10.itemIds[var19] <= 0) {
                                    if(var10.field2676 != null && var19 < 20) {
                                       SpritePixels var58 = var10.method4509(var19);
                                       if(var58 != null) {
                                          var58.drawAt(var22, var23);
                                       } else if(Widget.field2603) {
                                          Player.method1114(var10);
                                       }
                                    }
                                 } else {
                                    boolean var72 = false;
                                    boolean var61 = false;
                                    var26 = var10.itemIds[var19] - 1;
                                    if(var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class276.field3559 && var19 == Client.field688) {
                                       SpritePixels var50;
                                       if(Client.itemSelectionState == 1 && var19 == class13.selectedItemIndex && var10.id == class187.field2372) {
                                          var50 = class21.createSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                       } else {
                                          var50 = class21.createSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                       }

                                       if(var50 != null) {
                                          if(var10 == class276.field3559 && var19 == Client.field688) {
                                             var49 = MouseInput.mouseLastX - Client.field678;
                                             var25 = MouseInput.mouseLastY * 673804999 - Client.field821;
                                             if(var49 < 5 && var49 > -5) {
                                                var49 = 0;
                                             }

                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(Client.itemPressedDuration < 5) {
                                                var49 = 0;
                                                var25 = 0;
                                             }

                                             var50.drawAtOpacity(var49 + var22, var23 + var25, 128);
                                             if(var1 != -1) {
                                                Widget var51 = var0[var1 & 65535];
                                                if(var25 + var23 < Rasterizer2D.drawingAreaTop && var51.scrollY > 0) {
                                                   var29 = (Rasterizer2D.drawingAreaTop - var23 - var25) * Client.field700 / 3;
                                                   if(var29 > Client.field700 * 10) {
                                                      var29 = Client.field700 * 10;
                                                   }

                                                   if(var29 > var51.scrollY) {
                                                      var29 = var51.scrollY;
                                                   }

                                                   var51.scrollY -= var29;
                                                   Client.field821 += var29;
                                                   Player.method1114(var51);
                                                }

                                                if(var25 + var23 + 32 > Rasterizer2D.drawingAreaRight && var51.scrollY < var51.scrollHeight - var51.height) {
                                                   var29 = (var25 + var23 + 32 - Rasterizer2D.drawingAreaRight) * Client.field700 / 3;
                                                   if(var29 > Client.field700 * 10) {
                                                      var29 = Client.field700 * 10;
                                                   }

                                                   if(var29 > var51.scrollHeight - var51.height - var51.scrollY) {
                                                      var29 = var51.scrollHeight - var51.height - var51.scrollY;
                                                   }

                                                   var51.scrollY += var29;
                                                   Client.field821 -= var29;
                                                   Player.method1114(var51);
                                                }
                                             }
                                          } else if(var10 == class240.field3096 && var19 == Client.pressedItemIndex) {
                                             var50.drawAtOpacity(var22, var23, 128);
                                          } else {
                                             var50.drawAt(var22, var23);
                                          }
                                       } else {
                                          Player.method1114(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if(var10.type == 3) {
                           if(Occluder.method3097(var10)) {
                              var19 = var10.field2631;
                              if(var10 == class143.field1897 && var10.field2633 != 0) {
                                 var19 = var10.field2633;
                              }
                           } else {
                              var19 = var10.textColor;
                              if(var10 == class143.field1897 && var10.field2632 != 0) {
                                 var19 = var10.field2632;
                              }
                           }

                           if(var10.filled) {
                              switch(var10.field2701.field3776) {
                              case 1:
                                 Rasterizer2D.method5728(var12, var13, var10.width, var10.height, var10.textColor, var10.field2631, 256 - (var10.opacity & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 2:
                                 Rasterizer2D.method5729(var12, var13, var10.width, var10.height, var10.textColor, var10.field2631, 256 - (var10.opacity & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 3:
                                 Rasterizer2D.method5739(var12, var13, var10.width, var10.height, var10.textColor, var10.field2631, 256 - (var10.opacity & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 4:
                                 Rasterizer2D.method5726(var12, var13, var10.width, var10.height, var10.textColor, var10.field2631, 256 - (var10.opacity & 255), 256 - (var10.field2608 & 255));
                                 break;
                              default:
                                 if(var14 == 0) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
                                 } else {
                                    Rasterizer2D.fillRectangle(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if(var14 == 0) {
                              Rasterizer2D.drawRectangle(var12, var13, var10.width, var10.height, var19);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                           }
                        } else {
                           Font var64;
                           if(var10.type == 4) {
                              var64 = var10.getFont();
                              if(var64 == null) {
                                 if(Widget.field2603) {
                                    Player.method1114(var10);
                                 }
                              } else {
                                 String var74 = var10.text;
                                 if(Occluder.method3097(var10)) {
                                    var20 = var10.field2631;
                                    if(var10 == class143.field1897 && var10.field2633 != 0) {
                                       var20 = var10.field2633;
                                    }

                                    if(var10.string1.length() > 0) {
                                       var74 = var10.string1;
                                    }
                                 } else {
                                    var20 = var10.textColor;
                                    if(var10 == class143.field1897 && var10.field2632 != 0) {
                                       var20 = var10.field2632;
                                    }
                                 }

                                 if(var10.hasScript && var10.itemId != -1) {
                                    ItemComposition var75 = TextureProvider.getItemDefinition(var10.itemId);
                                    var74 = var75.name;
                                    if(var74 == null) {
                                       var74 = "null";
                                    }

                                    if((var75.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var74 = class6.getColTags(16748608) + var74 + "</col>" + " " + 'x' + class35.method623(var10.itemQuantity);
                                    }
                                 }

                                 if(var10 == Client.field744) {
                                    var74 = "Please wait...";
                                    var20 = var10.textColor;
                                 }

                                 if(!var10.hasScript) {
                                    var74 = GrandExchangeEvents.method11(var74, var10);
                                 }

                                 var64.method5526(var74, var12, var13, var10.width, var10.height, var20, var10.textShadowed?0:-1, var10.field2669, var10.field2681, var10.field2668);
                              }
                           } else if(var10.type == 5) {
                              SpritePixels var65;
                              if(!var10.hasScript) {
                                 var65 = var10.getWidgetSprite(Occluder.method3097(var10));
                                 if(var65 != null) {
                                    var65.drawAt(var12, var13);
                                 } else if(Widget.field2603) {
                                    Player.method1114(var10);
                                 }
                              } else {
                                 if(var10.itemId != -1) {
                                    var65 = class21.createSprite(var10.itemId, var10.itemQuantity, var10.borderThickness, var10.sprite2, var10.field2664, false);
                                 } else {
                                    var65 = var10.getWidgetSprite(false);
                                 }

                                 if(var65 == null) {
                                    if(Widget.field2603) {
                                       Player.method1114(var10);
                                    }
                                 } else {
                                    var20 = var65.maxWidth;
                                    var21 = var65.maxHeight;
                                    if(!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if(var10.textureId != 0) {
                                          var65.method5870(var10.width / 2 + var12, var10.height / 2 + var13, var10.textureId, var22);
                                       } else if(var14 != 0) {
                                          var65.method5856(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if(var20 == var10.width && var21 == var10.height) {
                                          var65.drawAt(var12, var13);
                                       } else {
                                          var65.method5853(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.setInnerDrawRegion(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var49 = 0; var49 < var22; ++var49) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if(var10.textureId != 0) {
                                                var65.method5870(var20 / 2 + var12 + var49 * var20, var21 / 2 + var13 + var21 * var25, var10.textureId, 4096);
                                             } else if(var14 != 0) {
                                                var65.drawAtOpacity(var12 + var49 * var20, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var65.drawAt(var12 + var20 * var49, var13 + var21 * var25);
                                             }
                                          }
                                       }

                                       Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemComposition var48;
                              if(var10.type == 6) {
                                 var57 = Occluder.method3097(var10);
                                 if(var57) {
                                    var20 = var10.field2653;
                                 } else {
                                    var20 = var10.field2595;
                                 }

                                 Model var73 = null;
                                 var22 = 0;
                                 if(var10.itemId != -1) {
                                    var48 = TextureProvider.getItemDefinition(var10.itemId);
                                    if(var48 != null) {
                                       var48 = var48.method5094(var10.itemQuantity);
                                       var73 = var48.getModel(1);
                                       if(var73 != null) {
                                          var73.calculateBoundsCylinder();
                                          var22 = var73.modelHeight / 2;
                                       } else {
                                          Player.method1114(var10);
                                       }
                                    }
                                 } else if(var10.modelType == 5) {
                                    if(var10.modelId == 0) {
                                       var73 = Client.field841.getModel((Sequence)null, -1, (Sequence)null, -1);
                                    } else {
                                       var73 = class138.localPlayer.getModel();
                                    }
                                 } else if(var20 == -1) {
                                    var73 = var10.getModel((Sequence)null, -1, var57, class138.localPlayer.composition);
                                    if(var73 == null && Widget.field2603) {
                                       Player.method1114(var10);
                                    }
                                 } else {
                                    Sequence var69 = TotalQuantityComparator.getAnimation(var20);
                                    var73 = var10.getModel(var69, var10.field2728, var57, class138.localPlayer.composition);
                                    if(var73 == null && Widget.field2603) {
                                       Player.method1114(var10);
                                    }
                                 }

                                 Graphics3D.method2827(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Graphics3D.SINE[var10.rotationX] * var10.modelZoom >> 16;
                                 var49 = Graphics3D.COSINE[var10.rotationX] * var10.modelZoom >> 16;
                                 if(var73 != null) {
                                    if(!var10.hasScript) {
                                       var73.method2682(0, var10.rotationZ, 0, var10.rotationX, 0, var23, var49);
                                    } else {
                                       var73.calculateBoundsCylinder();
                                       if(var10.field2662) {
                                          var73.method2710(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.offsetX2d, var23 + var22 + var10.offsetY2d, var49 + var10.offsetY2d, var10.modelZoom);
                                       } else {
                                          var73.method2682(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.offsetX2d, var22 + var23 + var10.offsetY2d, var49 + var10.offsetY2d);
                                       }
                                    }
                                 }

                                 Graphics3D.Rasterizer3D_method3();
                              } else {
                                 if(var10.type == 7) {
                                    var64 = var10.getFont();
                                    if(var64 == null) {
                                       if(Widget.field2603) {
                                          Player.method1114(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.originalHeight; ++var21) {
                                       for(var22 = 0; var22 < var10.originalWidth; ++var22) {
                                          if(var10.itemIds[var20] > 0) {
                                             var48 = TextureProvider.getItemDefinition(var10.itemIds[var20] - 1);
                                             String var24;
                                             if(var48.isStackable != 1 && var10.itemQuantities[var20] == 1) {
                                                var24 = class6.getColTags(16748608) + var48.name + "</col>";
                                             } else {
                                                var24 = class6.getColTags(16748608) + var48.name + "</col>" + " " + 'x' + class35.method623(var10.itemQuantities[var20]);
                                             }

                                             var25 = var22 * (var10.paddingX + 115) + var12;
                                             var26 = var13 + (var10.paddingY + 12) * var21;
                                             if(var10.field2669 == 0) {
                                                var64.method5522(var24, var25, var26, var10.textColor, var10.textShadowed?0:-1);
                                             } else if(var10.field2669 == 1) {
                                                var64.drawTextCentered(var24, var10.width / 2 + var25, var26, var10.textColor, var10.textShadowed?0:-1);
                                             } else {
                                                var64.method5524(var24, var25 + var10.width - 1, var26, var10.textColor, var10.textShadowed?0:-1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if(var10.type == 8 && var10 == class141.field1888 && Client.field623 == Client.field732) {
                                    var19 = 0;
                                    var20 = 0;
                                    Font var54 = Actor.font_p12full;
                                    String var55 = var10.text;

                                    String var66;
                                    for(var55 = GrandExchangeEvents.method11(var55, var10); var55.length() > 0; var20 = var20 + var54.verticalSpace + 1) {
                                       var49 = var55.indexOf("<br>");
                                       if(var49 != -1) {
                                          var66 = var55.substring(0, var49);
                                          var55 = var55.substring(var49 + 4);
                                       } else {
                                          var66 = var55;
                                          var55 = "";
                                       }

                                       var25 = var54.getTextWidth(var66);
                                       if(var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var49 = var12 + var10.width - 5 - var19;
                                    var25 = var13 + var10.height + 5;
                                    if(var49 < var12 + 5) {
                                       var49 = var12 + 5;
                                    }

                                    if(var19 + var49 > var4) {
                                       var49 = var4 - var19;
                                    }

                                    if(var20 + var25 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var49, var25, var19, var20, 16777120);
                                    Rasterizer2D.drawRectangle(var49, var25, var19, var20, 0);
                                    var55 = var10.text;
                                    var26 = var25 + var54.verticalSpace + 2;

                                    for(var55 = GrandExchangeEvents.method11(var55, var10); var55.length() > 0; var26 = var26 + var54.verticalSpace + 1) {
                                       var27 = var55.indexOf("<br>");
                                       if(var27 != -1) {
                                          var66 = var55.substring(0, var27);
                                          var55 = var55.substring(var27 + 4);
                                       } else {
                                          var66 = var55;
                                          var55 = "";
                                       }

                                       var54.method5522(var66, var49 + 3, var26, 0, -1);
                                    }
                                 }

                                 if(var10.type == 9) {
                                    if(var10.field2639) {
                                       var19 = var12;
                                       var20 = var13 + var10.height;
                                       var21 = var12 + var10.width;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.width;
                                       var22 = var13 + var10.height;
                                    }

                                    if(var10.lineWidth == 1) {
                                       Rasterizer2D.drawLine(var19, var20, var21, var22, var10.textColor);
                                    } else {
                                       var25 = var10.textColor;
                                       var26 = var10.lineWidth;
                                       var27 = var21 - var19;
                                       var28 = var22 - var20;
                                       var29 = var27 >= 0?var27:-var27;
                                       var30 = var28 >= 0?var28:-var28;
                                       var31 = var29;
                                       if(var29 < var30) {
                                          var31 = var30;
                                       }

                                       if(var31 != 0) {
                                          int var32 = (var27 << 16) / var31;
                                          var33 = (var28 << 16) / var31;
                                          if(var33 <= var32) {
                                             var32 = -var32;
                                          } else {
                                             var33 = -var33;
                                          }

                                          var34 = var26 * var33 >> 17;
                                          var35 = var33 * var26 + 1 >> 17;
                                          int var56 = var26 * var32 >> 17;
                                          var37 = var32 * var26 + 1 >> 17;
                                          var23 = var19 - Rasterizer2D.draw_region_x;
                                          var49 = var20 - Rasterizer2D.drawingAreaTop;
                                          var52 = var23 + var34;
                                          var39 = var23 - var35;
                                          var40 = var23 + var27 - var35;
                                          var41 = var34 + var27 + var23;
                                          int var42 = var49 + var56;
                                          var43 = var49 - var37;
                                          var44 = var49 + var28 - var37;
                                          var45 = var49 + var28 + var56;
                                          Graphics3D.setRasterClippingEnabled(var52, var39, var40);
                                          Graphics3D.rasterFlat(var42, var43, var44, var52, var39, var40, var25);
                                          Graphics3D.setRasterClippingEnabled(var52, var40, var41);
                                          Graphics3D.rasterFlat(var42, var44, var45, var52, var40, var41, var25);
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
      }

   }
}
