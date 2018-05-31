import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public class class262 {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIIIIILdm;Lfk;S)V",
      garbageValue = "5648"
   )
   static final void method4939(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Region var7, CollisionData var8) {
      ObjectComposition var9 = FileOnDisk.getObjectDefinition(var4);
      int var10;
      int var11;
      if(var5 != 1 && var5 != 3) {
         var10 = var9.width;
         var11 = var9.length;
      } else {
         var10 = var9.length;
         var11 = var9.width;
      }

      int var12;
      int var13;
      if(var10 + var2 <= 104) {
         var12 = (var10 >> 1) + var2;
         var13 = var2 + (var10 + 1 >> 1);
      } else {
         var12 = var2;
         var13 = var2 + 1;
      }

      int var14;
      int var15;
      if(var3 + var11 <= 104) {
         var14 = var3 + (var11 >> 1);
         var15 = var3 + (var11 + 1 >> 1);
      } else {
         var14 = var3;
         var15 = var3 + 1;
      }

      int[][] var16 = class50.tileHeights[var1];
      int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
      int var18 = (var2 << 7) + (var10 << 6);
      int var19 = (var3 << 7) + (var11 << 6);
      long var20 = class76.method1804(var2, var3, 2, var9.int1 == 0, var4);
      int var22 = (var5 << 6) + var6;
      if(var9.supportItems == 1) {
         var22 += 256;
      }

      Object var23;
      if(var6 == 22) {
         if(var9.animationId == -1 && var9.impostorIds == null) {
            var23 = var9.method5031(22, var5, var16, var18, var17, var19);
         } else {
            var23 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
         }

         var7.groundObjectSpawned(var0, var2, var3, var17, (Renderable)var23, var20, var22);
         if(var9.clipType == 1) {
            var8.method3410(var2, var3);
         }

      } else if(var6 != 10 && var6 != 11) {
         if(var6 >= 12) {
            if(var9.animationId == -1 && var9.impostorIds == null) {
               var23 = var9.method5031(var6, var5, var16, var18, var17, var19);
            } else {
               var23 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
            }

            var7.method2882(var0, var2, var3, var17, 1, 1, (Renderable)var23, 0, var20, var22);
            if(var9.clipType != 0) {
               var8.addObject(var2, var3, var10, var11, var9.blocksProjectile);
            }

         } else if(var6 == 0) {
            if(var9.animationId == -1 && var9.impostorIds == null) {
               var23 = var9.method5031(0, var5, var16, var18, var17, var19);
            } else {
               var23 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
            }

            var7.addBoundary(var0, var2, var3, var17, (Renderable)var23, (Renderable)null, class50.field450[var5], 0, var20, var22);
            if(var9.clipType != 0) {
               var8.removeWall(var2, var3, var6, var5, var9.blocksProjectile);
            }

         } else if(var6 == 1) {
            if(var9.animationId == -1 && var9.impostorIds == null) {
               var23 = var9.method5031(1, var5, var16, var18, var17, var19);
            } else {
               var23 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
            }

            var7.addBoundary(var0, var2, var3, var17, (Renderable)var23, (Renderable)null, class50.field451[var5], 0, var20, var22);
            if(var9.clipType != 0) {
               var8.removeWall(var2, var3, var6, var5, var9.blocksProjectile);
            }

         } else {
            int var29;
            if(var6 == 2) {
               var29 = var5 + 1 & 3;
               Object var24;
               Object var25;
               if(var9.animationId == -1 && var9.impostorIds == null) {
                  var24 = var9.method5031(2, var5 + 4, var16, var18, var17, var19);
                  var25 = var9.method5031(2, var29, var16, var18, var17, var19);
               } else {
                  var24 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, true, (Renderable)null);
                  var25 = new DynamicObject(var4, 2, var29, var1, var2, var3, var9.animationId, true, (Renderable)null);
               }

               var7.addBoundary(var0, var2, var3, var17, (Renderable)var24, (Renderable)var25, class50.field450[var5], class50.field450[var29], var20, var22);
               if(var9.clipType != 0) {
                  var8.removeWall(var2, var3, var6, var5, var9.blocksProjectile);
               }

            } else if(var6 == 3) {
               if(var9.animationId == -1 && var9.impostorIds == null) {
                  var23 = var9.method5031(3, var5, var16, var18, var17, var19);
               } else {
                  var23 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
               }

               var7.addBoundary(var0, var2, var3, var17, (Renderable)var23, (Renderable)null, class50.field451[var5], 0, var20, var22);
               if(var9.clipType != 0) {
                  var8.removeWall(var2, var3, var6, var5, var9.blocksProjectile);
               }

            } else if(var6 == 9) {
               if(var9.animationId == -1 && var9.impostorIds == null) {
                  var23 = var9.method5031(var6, var5, var16, var18, var17, var19);
               } else {
                  var23 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
               }

               var7.method2882(var0, var2, var3, var17, 1, 1, (Renderable)var23, 0, var20, var22);
               if(var9.clipType != 0) {
                  var8.addObject(var2, var3, var10, var11, var9.blocksProjectile);
               }

            } else if(var6 == 4) {
               if(var9.animationId == -1 && var9.impostorIds == null) {
                  var23 = var9.method5031(4, var5, var16, var18, var17, var19);
               } else {
                  var23 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
               }

               var7.addBoundaryDecoration(var0, var2, var3, var17, (Renderable)var23, (Renderable)null, class50.field450[var5], 0, 0, 0, var20, var22);
            } else {
               Object var26;
               long var30;
               if(var6 == 5) {
                  var29 = 16;
                  var30 = var7.method2898(var0, var2, var3);
                  if(var30 != 0L) {
                     var29 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var30)).decorDisplacement;
                  }

                  if(var9.animationId == -1 && var9.impostorIds == null) {
                     var26 = var9.method5031(4, var5, var16, var18, var17, var19);
                  } else {
                     var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
                  }

                  var7.addBoundaryDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, class50.field450[var5], 0, var29 * class50.field452[var5], var29 * class50.field453[var5], var20, var22);
               } else if(var6 == 6) {
                  var29 = 8;
                  var30 = var7.method2898(var0, var2, var3);
                  if(0L != var30) {
                     var29 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var30)).decorDisplacement / 2;
                  }

                  if(var9.animationId == -1 && var9.impostorIds == null) {
                     var26 = var9.method5031(4, var5 + 4, var16, var18, var17, var19);
                  } else {
                     var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, true, (Renderable)null);
                  }

                  var7.addBoundaryDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var29 * class50.field458[var5], var29 * class50.field449[var5], var20, var22);
               } else if(var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if(var9.animationId == -1 && var9.impostorIds == null) {
                     var23 = var9.method5031(4, var32 + 4, var16, var18, var17, var19);
                  } else {
                     var23 = new DynamicObject(var4, 4, var32 + 4, var1, var2, var3, var9.animationId, true, (Renderable)null);
                  }

                  var7.addBoundaryDecoration(var0, var2, var3, var17, (Renderable)var23, (Renderable)null, 256, var32, 0, 0, var20, var22);
               } else if(var6 == 8) {
                  var29 = 8;
                  var30 = var7.method2898(var0, var2, var3);
                  if(0L != var30) {
                     var29 = FileOnDisk.getObjectDefinition(KeyFocusListener.method673(var30)).decorDisplacement / 2;
                  }

                  int var28 = var5 + 2 & 3;
                  Object var27;
                  if(var9.animationId == -1 && var9.impostorIds == null) {
                     var26 = var9.method5031(4, var5 + 4, var16, var18, var17, var19);
                     var27 = var9.method5031(4, var28 + 4, var16, var18, var17, var19);
                  } else {
                     var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, true, (Renderable)null);
                     var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, true, (Renderable)null);
                  }

                  var7.addBoundaryDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var29 * class50.field458[var5], var29 * class50.field449[var5], var20, var22);
               }
            }
         }
      } else {
         if(var9.animationId == -1 && var9.impostorIds == null) {
            var23 = var9.method5031(10, var5, var16, var18, var17, var19);
         } else {
            var23 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, true, (Renderable)null);
         }

         if(var23 != null) {
            var7.method2882(var0, var2, var3, var17, var10, var11, (Renderable)var23, var6 == 11?256:0, var20, var22);
         }

         if(var9.clipType != 0) {
            var8.addObject(var2, var3, var10, var11, var9.blocksProjectile);
         }

      }
   }
}
