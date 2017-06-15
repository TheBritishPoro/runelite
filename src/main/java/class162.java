import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class162 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -19415391
   )
   static int field2310;
   @ObfuscatedName("t")
   static int[][] field2311;
   @ObfuscatedName("e")
   static int[][] field2314;
   @ObfuscatedName("i")
   static int[] field2315;
   @ObfuscatedName("f")
   static int[] field2316;

   static {
      field2314 = new int[128][128];
      field2311 = new int[128][128];
      field2315 = new int[4096];
      field2316 = new int[4096];
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(LWidget;III)V",
      garbageValue = "-1433074674"
   )
   static final void method2943(Widget var0, int var1, int var2) {
      if(var0.field2769 == 1) {
         class44.addMenuEntry(var0.tooltip, "", 24, 0, 0, var0.id);
      }

      String var3;
      if(var0.field2769 == 2 && !Client.field1061) {
         if(WorldMapType1.method263(class15.method92(var0)) == 0) {
            var3 = null;
         } else if(var0.selectedAction != null && var0.selectedAction.trim().length() != 0) {
            var3 = var0.selectedAction;
         } else {
            var3 = null;
         }

         if(var3 != null) {
            class44.addMenuEntry(var3, class15.method105('\uff00') + var0.field2741, 25, 0, -1, var0.id);
         }
      }

      if(var0.field2769 == 3) {
         class44.addMenuEntry("Close", "", 26, 0, 0, var0.id);
      }

      if(var0.field2769 == 4) {
         class44.addMenuEntry(var0.tooltip, "", 28, 0, 0, var0.id);
      }

      if(var0.field2769 == 5) {
         class44.addMenuEntry(var0.tooltip, "", 29, 0, 0, var0.id);
      }

      if(var0.field2769 == 6 && Client.field1070 == null) {
         class44.addMenuEntry(var0.tooltip, "", 30, 0, -1, var0.id);
      }

      int var5;
      int var6;
      int var14;
      if(var0.type == 2) {
         var14 = 0;

         for(int var15 = 0; var15 < var0.height; ++var15) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               var6 = var5 * (var0.paddingX + 32);
               int var7 = (var0.paddingY + 32) * var15;
               if(var14 < 20) {
                  var6 += var0.field2722[var14];
                  var7 += var0.field2723[var14];
               }

               if(var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  Client.field1022 = var14;
                  Projectile.field1475 = var0;
                  if(var0.itemIds[var14] > 0) {
                     ItemComposition var8 = class224.getItemDefinition(var0.itemIds[var14] - 1);
                     if(Client.itemSelectionState == 1 && WorldMapType2.method497(class15.method92(var0))) {
                        if(var0.id != class33.field480 || var14 != class91.selectedItemIndex) {
                           class44.addMenuEntry("Use", Client.selectedItemName + " " + "->" + " " + class15.method105(16748608) + var8.name, 31, var8.id, var14, var0.id);
                        }
                     } else if(Client.field1061 && WorldMapType2.method497(class15.method92(var0))) {
                        if((class232.spellTargetFlags & 16) == 16) {
                           class44.addMenuEntry(Client.field1064, Client.field1065 + " " + "->" + " " + class15.method105(16748608) + var8.name, 32, var8.id, var14, var0.id);
                        }
                     } else {
                        String[] var9 = var8.inventoryActions;
                        if(Client.field1077) {
                           var9 = class2.method7(var9);
                        }

                        int var10 = var8.method4479();
                        int var11;
                        boolean var12;
                        byte var13;
                        if(WorldMapType2.method497(class15.method92(var0))) {
                           for(var11 = 4; var11 >= 3; --var11) {
                              var12 = var10 == var11;
                              if(var9 != null && var9[var11] != null) {
                                 if(var11 == 3) {
                                    var13 = 36;
                                 } else {
                                    var13 = 37;
                                 }

                                 class87.method1599(var9[var11], class15.method105(16748608) + var8.name, var13, var8.id, var14, var0.id, var12);
                              } else if(var11 == 4) {
                                 class87.method1599("Drop", class15.method105(16748608) + var8.name, 37, var8.id, var14, var0.id, var12);
                              }
                           }
                        }

                        if(class19.method160(class15.method92(var0))) {
                           class44.addMenuEntry("Use", class15.method105(16748608) + var8.name, 38, var8.id, var14, var0.id);
                        }

                        if(WorldMapType2.method497(class15.method92(var0)) && var9 != null) {
                           for(var11 = 2; var11 >= 0; --var11) {
                              var12 = var10 == var11;
                              if(var9[var11] != null) {
                                 var13 = 0;
                                 if(var11 == 0) {
                                    var13 = 33;
                                 }

                                 if(var11 == 1) {
                                    var13 = 34;
                                 }

                                 if(var11 == 2) {
                                    var13 = 35;
                                 }

                                 class87.method1599(var9[var11], class15.method105(16748608) + var8.name, var13, var8.id, var14, var0.id, var12);
                              }
                           }
                        }

                        var9 = var0.field2725;
                        if(Client.field1077) {
                           var9 = class2.method7(var9);
                        }

                        if(var9 != null) {
                           for(var11 = 4; var11 >= 0; --var11) {
                              if(var9[var11] != null) {
                                 byte var19 = 0;
                                 if(var11 == 0) {
                                    var19 = 39;
                                 }

                                 if(var11 == 1) {
                                    var19 = 40;
                                 }

                                 if(var11 == 2) {
                                    var19 = 41;
                                 }

                                 if(var11 == 3) {
                                    var19 = 42;
                                 }

                                 if(var11 == 4) {
                                    var19 = 43;
                                 }

                                 class44.addMenuEntry(var9[var11], class15.method105(16748608) + var8.name, var19, var8.id, var14, var0.id);
                              }
                           }
                        }

                        class44.addMenuEntry("Examine", class15.method105(16748608) + var8.name, 1005, var8.id, var14, var0.id);
                     }
                  }
               }

               ++var14;
            }
         }
      }

      if(var0.hasScript) {
         if(Client.field1061) {
            if(class215.method3878(class15.method92(var0)) && (class232.spellTargetFlags & 32) == 32) {
               class44.addMenuEntry(Client.field1064, Client.field1065 + " " + "->" + " " + var0.name, 58, 0, var0.index, var0.id);
            }
         } else {
            boolean var18;
            for(var14 = 9; var14 >= 5; --var14) {
               var6 = class15.method92(var0);
               var18 = (var6 >> var14 + 1 & 1) != 0;
               String var4;
               if(!var18 && var0.field2657 == null) {
                  var4 = null;
               } else if(var0.actions != null && var0.actions.length > var14 && var0.actions[var14] != null && var0.actions[var14].trim().length() != 0) {
                  var4 = var0.actions[var14];
               } else {
                  var4 = null;
               }

               if(var4 != null) {
                  class44.addMenuEntry(var4, var0.name, 1007, var14 + 1, var0.index, var0.id);
               }
            }

            if(WorldMapType1.method263(class15.method92(var0)) == 0) {
               var3 = null;
            } else if(var0.selectedAction != null && var0.selectedAction.trim().length() != 0) {
               var3 = var0.selectedAction;
            } else {
               var3 = null;
            }

            if(var3 != null) {
               class44.addMenuEntry(var3, var0.name, 25, 0, var0.index, var0.id);
            }

            for(var5 = 4; var5 >= 0; --var5) {
               String var17 = class8.method40(var0, var5);
               if(var17 != null) {
                  class44.addMenuEntry(var17, var0.name, 57, var5 + 1, var0.index, var0.id);
               }
            }

            var6 = class15.method92(var0);
            var18 = (var6 & 1) != 0;
            if(var18) {
               class44.addMenuEntry("Continue", "", 30, 0, var0.index, var0.id);
            }
         }
      }

   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Z",
      garbageValue = "-80"
   )
   static boolean method2946(String var0, boolean var1) {
      if(var0 == null) {
         return false;
      } else {
         String var2 = class109.method1965(var0, class33.field482);

         for(int var3 = 0; var3 < Client.friendCount; ++var3) {
            if(var2.equalsIgnoreCase(class109.method1965(Client.friends[var3].name, class33.field482)) && (!var1 || Client.friends[var3].world != 0)) {
               return true;
            }
         }

         if(var2.equalsIgnoreCase(class109.method1965(class20.localPlayer.name, class33.field482))) {
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(LBuffer;II)Ljava/lang/String;",
      garbageValue = "1044747361"
   )
   public static String method2947(Buffer var0, int var1) {
      try {
         int var2 = var0.method3046();
         if(var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class265.field3660.method2962(var0.payload, var0.offset, var3, 0, var2);
         String var4 = class22.method181(var3, 0, var2);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIIIII)I",
      garbageValue = "829676645"
   )
   public static int method2948(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }
}
