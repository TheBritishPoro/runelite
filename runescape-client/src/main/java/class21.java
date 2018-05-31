import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public final class class21 {
   @ObfuscatedName("rb")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   public static class251 field175;
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexModels")
   static IndexData indexModels;
   @ObfuscatedName("w")
   final int[] field178;

   class21() {
      this.field178 = new int[4096];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lan;B)V",
      garbageValue = "-31"
   )
   final void method265(class32 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field178[var2 * 64 + var3] = var1.method547(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "9"
   )
   final int method272(int var1, int var2) {
      return this.field178[var1 * 64 + var2];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;III)[Lly;",
      garbageValue = "-711086556"
   )
   static IndexedSprite[] method278(IndexDataBase var0, int var1, int var2) {
      return !class306.method5660(var0, var1, var2)?null:class49.method950();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "1802927852"
   )
   public static void method277(IndexDataBase var0) {
      Overlay.overlay_ref = var0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Lio;",
      garbageValue = "-116299600"
   )
   public static VarCInt method275(int var0) {
      VarCInt var1 = (VarCInt)VarCInt.field3257.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarCInt.field3258.getConfigData(19, var0);
         var1 = new VarCInt();
         if(var2 != null) {
            var1.method4848(new Buffer(var2));
         }

         VarCInt.field3257.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;B)Z",
      garbageValue = "96"
   )
   static final boolean method273(int var0, int var1, int var2, class166 var3, CollisionData var4) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class165.field2035[var7][var8] = 99;
      class165.field2041[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class165.field2039[var11] = var0;
      int var20 = var11 + 1;
      class165.field2038[var11] = var1;
      int[][] var13 = var4.flags;

      while(true) {
         label313:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            do {
               do {
                  do {
                     label290:
                     do {
                        if(var12 == var20) {
                           WorldMapDecoration.field152 = var5;
                           class165.field2037 = var6;
                           return false;
                        }

                        var5 = class165.field2039[var12];
                        var6 = class165.field2038[var12];
                        var12 = var12 + 1 & 4095;
                        var18 = var5 - var9;
                        var19 = var6 - var10;
                        var14 = var5 - var4.x;
                        var15 = var6 - var4.y;
                        if(var3.vmethod3440(var2, var5, var6, var4)) {
                           WorldMapDecoration.field152 = var5;
                           class165.field2037 = var6;
                           return true;
                        }

                        var16 = class165.field2041[var18][var19] + 1;
                        if(var18 > 0 && class165.field2035[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2 - 1) {
                                 class165.field2039[var20] = var5 - 1;
                                 class165.field2038[var20] = var6;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18 - 1][var19] = 2;
                                 class165.field2041[var18 - 1][var19] = var16;
                                 break;
                              }

                              if((var13[var14 - 1][var17 + var15] & 19136830) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var18 < 128 - var2 && class165.field2035[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2 - 1) {
                                 class165.field2039[var20] = var5 + 1;
                                 class165.field2038[var20] = var6;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18 + 1][var19] = 8;
                                 class165.field2041[var18 + 1][var19] = var16;
                                 break;
                              }

                              if((var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var19 > 0 && class165.field2035[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2 - 1) {
                                 class165.field2039[var20] = var5;
                                 class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18][var19 - 1] = 1;
                                 class165.field2041[var18][var19 - 1] = var16;
                                 break;
                              }

                              if((var13[var14 + var17][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var19 < 128 - var2 && class165.field2035[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2 - 1) {
                                 class165.field2039[var20] = var5;
                                 class165.field2038[var20] = var6 + 1;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18][var19 + 1] = 4;
                                 class165.field2041[var18][var19 + 1] = var16;
                                 break;
                              }

                              if((var13[var17 + var14][var15 + var2] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var18 > 0 && var19 > 0 && class165.field2035[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2) {
                                 class165.field2039[var20] = var5 - 1;
                                 class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18 - 1][var19 - 1] = 3;
                                 class165.field2041[var18 - 1][var19 - 1] = var16;
                                 break;
                              }

                              if((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var18 < 128 - var2 && var19 > 0 && class165.field2035[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if(var17 >= var2) {
                                 class165.field2039[var20] = var5 + 1;
                                 class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 class165.field2035[var18 + 1][var19 - 1] = 9;
                                 class165.field2041[var18 + 1][var19 - 1] = var16;
                                 break;
                              }

                              if((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if(var18 > 0 && var19 < 128 - var2 && class165.field2035[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
                                 continue label290;
                              }
                           }

                           class165.field2039[var20] = var5 - 1;
                           class165.field2038[var20] = var6 + 1;
                           var20 = var20 + 1 & 4095;
                           class165.field2035[var18 - 1][var19 + 1] = 6;
                           class165.field2041[var18 - 1][var19 + 1] = var16;
                        }
                     } while(var18 >= 128 - var2);
                  } while(var19 >= 128 - var2);
               } while(class165.field2035[var18 + 1][var19 + 1] != 0);
            } while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

            for(var17 = 1; var17 < var2; ++var17) {
               if((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                  continue label313;
               }
            }

            class165.field2039[var20] = var5 + 1;
            class165.field2038[var20] = var6 + 1;
            var20 = var20 + 1 & 4095;
            class165.field2035[var18 + 1][var19 + 1] = 12;
            class165.field2041[var18 + 1][var19 + 1] = var16;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lll;",
      garbageValue = "1309811201"
   )
   @Export("getSprites")
   public static SpritePixels[] getSprites(IndexDataBase var0, String var1, String var2) {
      int var3 = var0.getFile(var1);
      int var4 = var0.getChild(var3, var2);
      SpritePixels[] var5;
      if(!class306.method5660(var0, var3, var4)) {
         var5 = null;
      } else {
         SpritePixels[] var7 = new SpritePixels[class319.indexedSpriteCount];

         for(int var8 = 0; var8 < class319.indexedSpriteCount; ++var8) {
            SpritePixels var9 = var7[var8] = new SpritePixels();
            var9.maxWidth = class305.indexedSpriteWidth;
            var9.maxHeight = class319.indexedSpriteHeight;
            var9.offsetX = class7.indexedSpriteOffsetXs[var8];
            var9.offsetY = class225.indexedSpriteOffsetYs[var8];
            var9.width = class319.indexSpriteWidths[var8];
            var9.height = class319.indexedSpriteHeights[var8];
            int var10 = var9.height * var9.width;
            byte[] var11 = class319.spritePixels[var8];
            var9.pixels = new int[var10];

            for(int var12 = 0; var12 < var10; ++var12) {
               var9.pixels[var12] = PacketNode.indexedSpritePalette[var11[var12] & 255];
            }
         }

         class7.indexedSpriteOffsetXs = null;
         class225.indexedSpriteOffsetYs = null;
         class319.indexSpriteWidths = null;
         class319.indexedSpriteHeights = null;
         PacketNode.indexedSpritePalette = null;
         class319.spritePixels = null;
         var5 = var7;
      }

      return var5;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1457560196"
   )
   static int method274(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
      } else {
         var3 = var2?class276.field3561:KitDefinition.field3301;
      }

      int var4;
      if(var0 == 1300) {
         var4 = class69.intStack[--class69.intStackSize] - 1;
         if(var4 >= 0 && var4 <= 9) {
            var3.setAction(var4, class69.scriptStringStack[--WidgetNode.scriptStringStackSize]);
            return 1;
         } else {
            --WidgetNode.scriptStringStackSize;
            return 1;
         }
      } else if(var0 == 1301) {
         class69.intStackSize -= 2;
         var4 = class69.intStack[class69.intStackSize];
         int var5 = class69.intStack[class69.intStackSize + 1];
         var3.dragParent = class146.getWidgetChild(var4, var5);
         return 1;
      } else if(var0 == 1302) {
         var3.dragRenderBehavior = class69.intStack[--class69.intStackSize] == 1;
         return 1;
      } else if(var0 == 1303) {
         var3.dragDeadZone = class69.intStack[--class69.intStackSize];
         return 1;
      } else if(var0 == 1304) {
         var3.dragDeadTime = class69.intStack[--class69.intStackSize];
         return 1;
      } else if(var0 == 1305) {
         var3.opBase = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
         return 1;
      } else if(var0 == 1306) {
         var3.targetVerb = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
         return 1;
      } else if(var0 == 1307) {
         var3.actions = null;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)Lll;",
      garbageValue = "-1686094834"
   )
   @Export("createSprite")
   public static final SpritePixels createSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
      SpritePixels var8;
      if(!var5) {
         var8 = (SpritePixels)ItemComposition.itemSpriteCache.get(var6);
         if(var8 != null) {
            return var8;
         }
      }

      ItemComposition var9 = TextureProvider.getItemDefinition(var0);
      if(var1 > 1 && var9.countObj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.countCo[var11] && var9.countCo[var11] != 0) {
               var10 = var9.countObj[var11];
            }
         }

         if(var10 != -1) {
            var9 = TextureProvider.getItemDefinition(var10);
         }
      }

      Model var21 = var9.getModel(1);
      if(var21 == null) {
         return null;
      } else {
         SpritePixels var22 = null;
         if(var9.notedTemplate != -1) {
            var22 = createSprite(var9.note, 10, 1, 0, 0, true);
            if(var22 == null) {
               return null;
            }
         } else if(var9.notedId != -1) {
            var22 = createSprite(var9.unnotedId, var1, var2, var3, 0, false);
            if(var22 == null) {
               return null;
            }
         } else if(var9.placeholderTemplateId != -1) {
            var22 = createSprite(var9.placeholderId, var1, 0, 0, 0, false);
            if(var22 == null) {
               return null;
            }
         }

         int[] var12 = Rasterizer2D.graphicsPixels;
         int var13 = Rasterizer2D.graphicsPixelsWidth;
         int var14 = Rasterizer2D.graphicsPixelsHeight;
         int[] var15 = new int[4];
         Rasterizer2D.copyDrawRegion(var15);
         var8 = new SpritePixels(36, 32);
         Rasterizer2D.setRasterBuffer(var8.pixels, 36, 32);
         Rasterizer2D.reset();
         Graphics3D.Rasterizer3D_method1();
         Graphics3D.method2827(16, 16);
         Graphics3D.rasterGouraudLowRes = false;
         if(var9.placeholderTemplateId != -1) {
            var22.drawAt(0, 0);
         }

         int var16 = var9.zoom2d;
         if(var5) {
            var16 = (int)(1.5D * (double)var16);
         } else if(var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = var16 * Graphics3D.SINE[var9.xan2d] >> 16;
         int var18 = var16 * Graphics3D.COSINE[var9.xan2d] >> 16;
         var21.calculateBoundsCylinder();
         var21.method2682(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.modelHeight / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
         if(var9.notedId != -1) {
            var22.drawAt(0, 0);
         }

         if(var2 >= 1) {
            var8.method5847(1);
         }

         if(var2 >= 2) {
            var8.method5847(16777215);
         }

         if(var3 != 0) {
            var8.method5848(var3);
         }

         Rasterizer2D.setRasterBuffer(var8.pixels, 36, 32);
         if(var9.notedTemplate != -1) {
            var22.drawAt(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var9.isStackable == 1) {
            Font var19 = ItemComposition.field3466;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.method5522(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            ItemComposition.itemSpriteCache.put(var8, var6);
         }

         Rasterizer2D.setRasterBuffer(var12, var13, var14);
         Rasterizer2D.setDrawRegion(var15);
         Graphics3D.Rasterizer3D_method1();
         Graphics3D.rasterGouraudLowRes = true;
         return var8;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1994445247"
   )
   static final void method271(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      Object var10001 = null;
      String var1 = var10000.append(" is already on your ignore list").toString();
      class143.sendGameMessage(30, "", var1);
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Lhi;",
      garbageValue = "-1594952261"
   )
   static Widget method264(Widget var0) {
      Widget var2 = var0;
      int var3 = ISAACCipher.method3865(class24.getWidgetClickMask(var0));
      Widget var1;
      if(var3 == 0) {
         var1 = null;
      } else {
         int var4 = 0;

         while(true) {
            if(var4 >= var3) {
               var1 = var2;
               break;
            }

            var2 = class26.getWidget(var2.parentId);
            if(var2 == null) {
               var1 = null;
               break;
            }

            ++var4;
         }
      }

      Widget var5 = var1;
      if(var1 == null) {
         var5 = var0.dragParent;
      }

      return var5;
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1316208853"
   )
   static final void method270(int var0) {
      if(CombatInfo2.loadWidget(var0)) {
         FileSystem.method4620(GameCanvas.widgets[var0], -1);
      }
   }
}
