import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class171 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2249;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2242;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2244;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2243;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2245;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2246;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2241;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2248;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2247;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final class171 field2250;
   @ObfuscatedName("fr")
   static byte[][] field2252;

   static {
      field2249 = new class171(5);
      field2242 = new class171(3);
      field2244 = new class171(7);
      field2243 = new class171(4);
      field2245 = new class171(14);
      field2246 = new class171(15);
      field2241 = new class171(6);
      field2248 = new class171(4);
      field2247 = new class171(2);
      field2250 = new class171(5);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "5"
   )
   class171(int var1) {
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIIILdm;Lfk;I)V",
      garbageValue = "1712806345"
   )
   @Export("addObject")
   static final void addObject(int var0, int var1, int var2, int var3, int var4, int var5, Region var6, CollisionData var7) {
      if(!Client.lowMemory || (class50.tileSettings[0][var1][var2] & 2) != 0 || (class50.tileSettings[var0][var1][var2] & 16) == 0) {
         if(var0 < class50.field442) {
            class50.field442 = var0;
         }

         ObjectComposition var8 = FileOnDisk.getObjectDefinition(var3);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.width;
            var10 = var8.length;
         } else {
            var9 = var8.length;
            var10 = var8.width;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = class50.tileHeights[var0];
         int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class76.method1804(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if(var8.supportItems == 1) {
            var21 += 256;
         }

         if(var8.method5024()) {
            DState.method3528(var0, var1, var2, var8, var4);
         }

         Object var22;
         if(var5 == 22) {
            if(!Client.lowMemory || var8.int1 != 0 || var8.clipType == 1 || var8.obstructsGround) {
               if(var8.animationId == -1 && var8.impostorIds == null) {
                  var22 = var8.getModel(22, var4, var15, var17, var16, var18);
               } else {
                  var22 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
               }

               var6.groundObjectSpawned(var0, var1, var2, var16, (Renderable)var22, var19, var21);
               if(var8.clipType == 1 && var7 != null) {
                  var7.method3410(var1, var2);
               }

            }
         } else {
            int var23;
            if(var5 != 10 && var5 != 11) {
               if(var5 >= 12) {
                  if(var8.animationId == -1 && var8.impostorIds == null) {
                     var22 = var8.getModel(var5, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                  }

                  var6.method2882(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
                  if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     class37.field325[var0][var1][var2] |= 2340;
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.addObject(var1, var2, var9, var10, var8.blocksProjectile);
                  }

               } else if(var5 == 0) {
                  if(var8.animationId == -1 && var8.impostorIds == null) {
                     var22 = var8.getModel(0, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                  }

                  var6.addBoundary(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, class50.field450[var4], 0, var19, var21);
                  if(var4 == 0) {
                     if(var8.clipped) {
                        class50.field447[var0][var1][var2] = 50;
                        class50.field447[var0][var1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        class37.field325[var0][var1][var2] |= 585;
                     }
                  } else if(var4 == 1) {
                     if(var8.clipped) {
                        class50.field447[var0][var1][var2 + 1] = 50;
                        class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        class37.field325[var0][var1][var2 + 1] |= 1170;
                     }
                  } else if(var4 == 2) {
                     if(var8.clipped) {
                        class50.field447[var0][var1 + 1][var2] = 50;
                        class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        class37.field325[var0][var1 + 1][var2] |= 585;
                     }
                  } else if(var4 == 3) {
                     if(var8.clipped) {
                        class50.field447[var0][var1][var2] = 50;
                        class50.field447[var0][var1 + 1][var2] = 50;
                     }

                     if(var8.modelClipped) {
                        class37.field325[var0][var1][var2] |= 1170;
                     }
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.removeWall(var1, var2, var5, var4, var8.blocksProjectile);
                  }

                  if(var8.decorDisplacement != 16) {
                     var6.method3053(var0, var1, var2, var8.decorDisplacement);
                  }

               } else if(var5 == 1) {
                  if(var8.animationId == -1 && var8.impostorIds == null) {
                     var22 = var8.getModel(1, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                  }

                  var6.addBoundary(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, class50.field451[var4], 0, var19, var21);
                  if(var8.clipped) {
                     if(var4 == 0) {
                        class50.field447[var0][var1][var2 + 1] = 50;
                     } else if(var4 == 1) {
                        class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     } else if(var4 == 2) {
                        class50.field447[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        class50.field447[var0][var1][var2] = 50;
                     }
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.removeWall(var1, var2, var5, var4, var8.blocksProjectile);
                  }

               } else {
                  int var28;
                  if(var5 == 2) {
                     var28 = var4 + 1 & 3;
                     Object var29;
                     Object var30;
                     if(var8.animationId == -1 && var8.impostorIds == null) {
                        var29 = var8.getModel(2, var4 + 4, var15, var17, var16, var18);
                        var30 = var8.getModel(2, var28, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                        var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Renderable)null);
                     }

                     var6.addBoundary(var0, var1, var2, var16, (Renderable)var29, (Renderable)var30, class50.field450[var4], class50.field450[var28], var19, var21);
                     if(var8.modelClipped) {
                        if(var4 == 0) {
                           class37.field325[var0][var1][var2] |= 585;
                           class37.field325[var0][var1][1 + var2] |= 1170;
                        } else if(var4 == 1) {
                           class37.field325[var0][var1][1 + var2] |= 1170;
                           class37.field325[var0][var1 + 1][var2] |= 585;
                        } else if(var4 == 2) {
                           class37.field325[var0][var1 + 1][var2] |= 585;
                           class37.field325[var0][var1][var2] |= 1170;
                        } else if(var4 == 3) {
                           class37.field325[var0][var1][var2] |= 1170;
                           class37.field325[var0][var1][var2] |= 585;
                        }
                     }

                     if(var8.clipType != 0 && var7 != null) {
                        var7.removeWall(var1, var2, var5, var4, var8.blocksProjectile);
                     }

                     if(var8.decorDisplacement != 16) {
                        var6.method3053(var0, var1, var2, var8.decorDisplacement);
                     }

                  } else if(var5 == 3) {
                     if(var8.animationId == -1 && var8.impostorIds == null) {
                        var22 = var8.getModel(3, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                     }

                     var6.addBoundary(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, class50.field451[var4], 0, var19, var21);
                     if(var8.clipped) {
                        if(var4 == 0) {
                           class50.field447[var0][var1][var2 + 1] = 50;
                        } else if(var4 == 1) {
                           class50.field447[var0][var1 + 1][var2 + 1] = 50;
                        } else if(var4 == 2) {
                           class50.field447[var0][var1 + 1][var2] = 50;
                        } else if(var4 == 3) {
                           class50.field447[var0][var1][var2] = 50;
                        }
                     }

                     if(var8.clipType != 0 && var7 != null) {
                        var7.removeWall(var1, var2, var5, var4, var8.blocksProjectile);
                     }

                  } else if(var5 == 9) {
                     if(var8.animationId == -1 && var8.impostorIds == null) {
                        var22 = var8.getModel(var5, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                     }

                     var6.method2882(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
                     if(var8.clipType != 0 && var7 != null) {
                        var7.addObject(var1, var2, var9, var10, var8.blocksProjectile);
                     }

                     if(var8.decorDisplacement != 16) {
                        var6.method3053(var0, var1, var2, var8.decorDisplacement);
                     }

                  } else if(var5 == 4) {
                     if(var8.animationId == -1 && var8.impostorIds == null) {
                        var22 = var8.getModel(4, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                     }

                     var6.addBoundaryDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, class50.field450[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var31;
                     Object var33;
                     if(var5 == 5) {
                        var28 = 16;
                        var31 = var6.method2898(var0, var1, var2);
                        if(var31 != 0L) {
                           var28 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var31)).decorDisplacement;
                        }

                        if(var8.animationId == -1 && var8.impostorIds == null) {
                           var33 = var8.getModel(4, var4, var15, var17, var16, var18);
                        } else {
                           var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                        }

                        var6.addBoundaryDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, class50.field450[var4], 0, var28 * class50.field452[var4], var28 * class50.field453[var4], var19, var21);
                     } else if(var5 == 6) {
                        var28 = 8;
                        var31 = var6.method2898(var0, var1, var2);
                        if(0L != var31) {
                           var28 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var31)).decorDisplacement / 2;
                        }

                        if(var8.animationId == -1 && var8.impostorIds == null) {
                           var33 = var8.getModel(4, var4 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                        }

                        var6.addBoundaryDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, 256, var4, var28 * class50.field458[var4], var28 * class50.field449[var4], var19, var21);
                     } else if(var5 == 7) {
                        var23 = var4 + 2 & 3;
                        if(var8.animationId == -1 && var8.impostorIds == null) {
                           var22 = var8.getModel(4, var23 + 4, var15, var17, var16, var18);
                        } else {
                           var22 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                        }

                        var6.addBoundaryDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, 256, var23, 0, 0, var19, var21);
                     } else if(var5 == 8) {
                        var28 = 8;
                        var31 = var6.method2898(var0, var1, var2);
                        if(0L != var31) {
                           var28 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var31)).decorDisplacement / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if(var8.animationId == -1 && var8.impostorIds == null) {
                           var33 = var8.getModel(4, var4 + 4, var15, var17, var16, var18);
                           var26 = var8.getModel(4, var27 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                           var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
                        }

                        var6.addBoundaryDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)var26, 256, var4, var28 * class50.field458[var4], var28 * class50.field449[var4], var19, var21);
                     }
                  }
               }
            } else {
               if(var8.animationId == -1 && var8.impostorIds == null) {
                  var22 = var8.getModel(10, var4, var15, var17, var16, var18);
               } else {
                  var22 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
               }

               if(var22 != null && var6.method2882(var0, var1, var2, var16, var9, var10, (Renderable)var22, var5 == 11?256:0, var19, var21) && var8.clipped) {
                  var23 = 15;
                  if(var22 instanceof Model) {
                     var23 = ((Model)var22).method2672() / 4;
                     if(var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if(var23 > class50.field447[var0][var24 + var1][var25 + var2]) {
                           class50.field447[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if(var8.clipType != 0 && var7 != null) {
                  var7.addObject(var1, var2, var9, var10, var8.blocksProjectile);
               }

            }
         }
      }
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(Lbf;III)V",
      garbageValue = "-1489132269"
   )
   static final void method3451(ContextMenuRow var0, int var1, int var2) {
      KeyFocusListener.menuAction(var0.param0, var0.param1, var0.type, var0.identifier, var0.option, var0.option, var1, var2);
   }
}
