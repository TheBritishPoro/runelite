import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class309 implements Comparator {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -298322265
   )
   public static int field3740;
   @ObfuscatedName("z")
   final boolean field3741;

   public class309(boolean var1) {
      this.field3741 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljx;Ljx;I)I",
      garbageValue = "870668832"
   )
   int method5670(Nameable var1, Nameable var2) {
      return this.field3741?var1.getRsName().compareCleanName(var2.getRsName()):var2.getRsName().compareCleanName(var1.getRsName());
   }

   public int compare(Object var1, Object var2) {
      return this.method5670((Nameable)var1, (Nameable)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lbo;II)V",
      garbageValue = "1199859581"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1) {
      Object[] var2 = var0.params;
      int var5 = var0.field515;
      boolean var4 = var5 == 10 || var5 == 11 || var5 == 12 || var5 == 13 || var5 == 14 || var5 == 15 || var5 == 16 || var5 == 17;
      Script var3;
      int var9;
      int var10;
      int var11;
      int var13;
      int var18;
      if(var4) {
         ClassInfo.scriptMapIconReference = (MapIconReference)var2[0];
         Area var6 = Area.mapAreaType[ClassInfo.scriptMapIconReference.areaId];
         int var8 = var0.field515;
         var9 = var6.id;
         var10 = var6.field3240;
         var11 = WorldMapRectangle.method170(var9, var8);
         Script var12 = GameObject.method3104(var11, var8);
         Script var7;
         if(var12 != null) {
            var7 = var12;
         } else {
            var13 = var8 + (var10 + 40000 << 8);
            var12 = GameObject.method3104(var13, var8);
            if(var12 != null) {
               var7 = var12;
            } else {
               var7 = null;
            }
         }

         var3 = var7;
      } else {
         var18 = ((Integer)var2[0]).intValue();
         var3 = DecorativeObject.method3099(var18);
      }

      if(var3 != null) {
         class69.intStackSize = 0;
         WidgetNode.scriptStringStackSize = 0;
         var18 = -1;
         int[] var29 = var3.instructions;
         int[] var19 = var3.intOperands;
         byte var30 = -1;
         class69.scriptStackCount = 0;

         int var20;
         try {
            class69.scriptLocalInts = new int[var3.localIntCount];
            var10 = 0;
            Frames.scriptLocalStrings = new String[var3.localStringCount];
            var11 = 0;

            String var21;
            for(var20 = 1; var20 < var2.length; ++var20) {
               if(var2[var20] instanceof Integer) {
                  var13 = ((Integer)var2[var20]).intValue();
                  if(var13 == -2147483647) {
                     var13 = var0.mouseX;
                  }

                  if(var13 == -2147483646) {
                     var13 = var0.mouseY;
                  }

                  if(var13 == -2147483645) {
                     var13 = var0.source != null?var0.source.id:-1;
                  }

                  if(var13 == -2147483644) {
                     var13 = var0.op;
                  }

                  if(var13 == -2147483643) {
                     var13 = var0.source != null?var0.source.index:-1;
                  }

                  if(var13 == -2147483642) {
                     var13 = var0.target != null?var0.target.id:-1;
                  }

                  if(var13 == -2147483641) {
                     var13 = var0.target != null?var0.target.index:-1;
                  }

                  if(var13 == -2147483640) {
                     var13 = var0.typedKeyCode;
                  }

                  if(var13 == -2147483639) {
                     var13 = var0.typedKeyChar;
                  }

                  class69.scriptLocalInts[var10++] = var13;
               } else if(var2[var20] instanceof String) {
                  var21 = (String)var2[var20];
                  if(var21.equals("event_opbase")) {
                     var21 = var0.opbase;
                  }

                  Frames.scriptLocalStrings[var11++] = var21;
               }
            }

            var20 = 0;
            class69.field1009 = var0.field514;

            while(true) {
               while(true) {
                  while(true) {
                     while(true) {
                        while(true) {
                           while(true) {
                              while(true) {
                                 while(true) {
                                    while(true) {
                                       while(true) {
                                          while(true) {
                                             while(true) {
                                                while(true) {
                                                   while(true) {
                                                      while(true) {
                                                         while(true) {
                                                            while(true) {
                                                               while(true) {
                                                                  while(true) {
                                                                     while(true) {
                                                                        while(true) {
                                                                           while(true) {
                                                                              while(true) {
                                                                                 while(true) {
                                                                                    while(true) {
                                                                                       label310:
                                                                                       while(true) {
                                                                                          ++var20;
                                                                                          if(var20 > var1) {
                                                                                             throw new RuntimeException();
                                                                                          }

                                                                                          ++var18;
                                                                                          var9 = var29[var18];
                                                                                          int var23;
                                                                                          if(var9 < 100) {
                                                                                             if(var9 != 0) {
                                                                                                if(var9 != 1) {
                                                                                                   if(var9 != 2) {
                                                                                                      if(var9 != 3) {
                                                                                                         if(var9 != 6) {
                                                                                                            if(var9 != 7) {
                                                                                                               if(var9 != 8) {
                                                                                                                  if(var9 != 9) {
                                                                                                                     if(var9 != 10) {
                                                                                                                        if(var9 != 21) {
                                                                                                                           if(var9 != 25) {
                                                                                                                              if(var9 != 27) {
                                                                                                                                 if(var9 != 31) {
                                                                                                                                    if(var9 != 32) {
                                                                                                                                       if(var9 != 33) {
                                                                                                                                          if(var9 != 34) {
                                                                                                                                             if(var9 != 35) {
                                                                                                                                                if(var9 != 36) {
                                                                                                                                                   if(var9 != 37) {
                                                                                                                                                      if(var9 != 38) {
                                                                                                                                                         if(var9 != 39) {
                                                                                                                                                            int var17;
                                                                                                                                                            if(var9 != 40) {
                                                                                                                                                               if(var9 != 42) {
                                                                                                                                                                  if(var9 != 43) {
                                                                                                                                                                     if(var9 == 44) {
                                                                                                                                                                        var13 = var19[var18] >> 16;
                                                                                                                                                                        var23 = var19[var18] & 65535;
                                                                                                                                                                        int var24 = class69.intStack[--class69.intStackSize];
                                                                                                                                                                        if(var24 >= 0 && var24 <= 5000) {
                                                                                                                                                                           class69.field1000[var13] = var24;
                                                                                                                                                                           byte var25 = -1;
                                                                                                                                                                           if(var23 == 105) {
                                                                                                                                                                              var25 = 0;
                                                                                                                                                                           }

                                                                                                                                                                           var17 = 0;

                                                                                                                                                                           while(true) {
                                                                                                                                                                              if(var17 >= var24) {
                                                                                                                                                                                 continue label310;
                                                                                                                                                                              }

                                                                                                                                                                              class69.SHAPE_VERTICES[var13][var17] = var25;
                                                                                                                                                                              ++var17;
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                     } else if(var9 == 45) {
                                                                                                                                                                        var13 = var19[var18];
                                                                                                                                                                        var23 = class69.intStack[--class69.intStackSize];
                                                                                                                                                                        if(var23 < 0 || var23 >= class69.field1000[var13]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.intStack[++class69.intStackSize - 1] = class69.SHAPE_VERTICES[var13][var23];
                                                                                                                                                                     } else if(var9 == 46) {
                                                                                                                                                                        var13 = var19[var18];
                                                                                                                                                                        class69.intStackSize -= 2;
                                                                                                                                                                        var23 = class69.intStack[class69.intStackSize];
                                                                                                                                                                        if(var23 < 0 || var23 >= class69.field1000[var13]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.SHAPE_VERTICES[var13][var23] = class69.intStack[class69.intStackSize + 1];
                                                                                                                                                                     } else if(var9 == 47) {
                                                                                                                                                                        var21 = MapLabel.varcs.getVarcString(var19[var18]);
                                                                                                                                                                        if(var21 == null) {
                                                                                                                                                                           var21 = "null";
                                                                                                                                                                        }

                                                                                                                                                                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var21;
                                                                                                                                                                     } else if(var9 == 48) {
                                                                                                                                                                        MapLabel.varcs.putVarcString(var19[var18], class69.scriptStringStack[--WidgetNode.scriptStringStackSize]);
                                                                                                                                                                     } else {
                                                                                                                                                                        if(var9 != 60) {
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        }

                                                                                                                                                                        IterableHashTable var35 = var3.switches[var19[var18]];
                                                                                                                                                                        IntegerNode var32 = (IntegerNode)var35.get((long)class69.intStack[--class69.intStackSize]);
                                                                                                                                                                        if(var32 != null) {
                                                                                                                                                                           var18 += var32.value;
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  } else {
                                                                                                                                                                     MapLabel.varcs.putVarc(var19[var18], class69.intStack[--class69.intStackSize]);
                                                                                                                                                                  }
                                                                                                                                                               } else {
                                                                                                                                                                  class69.intStack[++class69.intStackSize - 1] = MapLabel.varcs.getVarc(var19[var18]);
                                                                                                                                                               }
                                                                                                                                                            } else {
                                                                                                                                                               var13 = var19[var18];
                                                                                                                                                               Script var31 = DecorativeObject.method3099(var13);
                                                                                                                                                               int[] var15 = new int[var31.localIntCount];
                                                                                                                                                               String[] var16 = new String[var31.localStringCount];

                                                                                                                                                               for(var17 = 0; var17 < var31.intStackCount; ++var17) {
                                                                                                                                                                  var15[var17] = class69.intStack[var17 + (class69.intStackSize - var31.intStackCount)];
                                                                                                                                                               }

                                                                                                                                                               for(var17 = 0; var17 < var31.stringStackCount; ++var17) {
                                                                                                                                                                  var16[var17] = class69.scriptStringStack[var17 + (WidgetNode.scriptStringStackSize - var31.stringStackCount)];
                                                                                                                                                               }

                                                                                                                                                               class69.intStackSize -= var31.intStackCount;
                                                                                                                                                               WidgetNode.scriptStringStackSize -= var31.stringStackCount;
                                                                                                                                                               ScriptState var22 = new ScriptState();
                                                                                                                                                               var22.invokedFromScript = var3;
                                                                                                                                                               var22.invokedFromPc = var18;
                                                                                                                                                               var22.savedLocalInts = class69.scriptLocalInts;
                                                                                                                                                               var22.savedLocalStrings = Frames.scriptLocalStrings;
                                                                                                                                                               class69.scriptStack[++class69.scriptStackCount - 1] = var22;
                                                                                                                                                               var3 = var31;
                                                                                                                                                               var29 = var31.instructions;
                                                                                                                                                               var19 = var31.intOperands;
                                                                                                                                                               var18 = -1;
                                                                                                                                                               class69.scriptLocalInts = var15;
                                                                                                                                                               Frames.scriptLocalStrings = var16;
                                                                                                                                                            }
                                                                                                                                                         } else {
                                                                                                                                                            --WidgetNode.scriptStringStackSize;
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         --class69.intStackSize;
                                                                                                                                                      }
                                                                                                                                                   } else {
                                                                                                                                                      var13 = var19[var18];
                                                                                                                                                      WidgetNode.scriptStringStackSize -= var13;
                                                                                                                                                      String var14 = class251.method4794(class69.scriptStringStack, WidgetNode.scriptStringStackSize, var13);
                                                                                                                                                      class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var14;
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   Frames.scriptLocalStrings[var19[var18]] = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = Frames.scriptLocalStrings[var19[var18]];
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             class69.scriptLocalInts[var19[var18]] = class69.intStack[--class69.intStackSize];
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          class69.intStack[++class69.intStackSize - 1] = class69.scriptLocalInts[var19[var18]];
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       class69.intStackSize -= 2;
                                                                                                                                       if(class69.intStack[class69.intStackSize] >= class69.intStack[class69.intStackSize + 1]) {
                                                                                                                                          var18 += var19[var18];
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    class69.intStackSize -= 2;
                                                                                                                                    if(class69.intStack[class69.intStackSize] <= class69.intStack[class69.intStackSize + 1]) {
                                                                                                                                       var18 += var19[var18];
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var13 = var19[var18];
                                                                                                                                 FriendManager.method1685(var13, class69.intStack[--class69.intStackSize]);
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              var13 = var19[var18];
                                                                                                                              class69.intStack[++class69.intStackSize - 1] = GameSocket.getVarbit(var13);
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           if(class69.scriptStackCount == 0) {
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           ScriptState var34 = class69.scriptStack[--class69.scriptStackCount];
                                                                                                                           var3 = var34.invokedFromScript;
                                                                                                                           var29 = var3.instructions;
                                                                                                                           var19 = var3.intOperands;
                                                                                                                           var18 = var34.invokedFromPc;
                                                                                                                           class69.scriptLocalInts = var34.savedLocalInts;
                                                                                                                           Frames.scriptLocalStrings = var34.savedLocalStrings;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        class69.intStackSize -= 2;
                                                                                                                        if(class69.intStack[class69.intStackSize] > class69.intStack[class69.intStackSize + 1]) {
                                                                                                                           var18 += var19[var18];
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     class69.intStackSize -= 2;
                                                                                                                     if(class69.intStack[class69.intStackSize] < class69.intStack[class69.intStackSize + 1]) {
                                                                                                                        var18 += var19[var18];
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  class69.intStackSize -= 2;
                                                                                                                  if(class69.intStack[class69.intStackSize] == class69.intStack[class69.intStackSize + 1]) {
                                                                                                                     var18 += var19[var18];
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               class69.intStackSize -= 2;
                                                                                                               if(class69.intStack[class69.intStackSize] != class69.intStack[class69.intStackSize + 1]) {
                                                                                                                  var18 += var19[var18];
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            var18 += var19[var18];
                                                                                                         }
                                                                                                      } else {
                                                                                                         class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.stringOperands[var18];
                                                                                                      }
                                                                                                   } else {
                                                                                                      var13 = var19[var18];
                                                                                                      class225.clientVarps[var13] = class69.intStack[--class69.intStackSize];
                                                                                                      class45.method749(var13);
                                                                                                   }
                                                                                                } else {
                                                                                                   var13 = var19[var18];
                                                                                                   class69.intStack[++class69.intStackSize - 1] = class225.clientVarps[var13];
                                                                                                }
                                                                                             } else {
                                                                                                class69.intStack[++class69.intStackSize - 1] = var19[var18];
                                                                                             }
                                                                                          } else {
                                                                                             boolean var33;
                                                                                             if(var3.intOperands[var18] == 1) {
                                                                                                var33 = true;
                                                                                             } else {
                                                                                                var33 = false;
                                                                                             }

                                                                                             var23 = class191.method3866(var9, var3, var33);
                                                                                             switch(var23) {
                                                                                             case 0:
                                                                                                return;
                                                                                             case 1:
                                                                                             default:
                                                                                                break;
                                                                                             case 2:
                                                                                                throw new IllegalStateException();
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
         } catch (Exception var28) {
            StringBuilder var27 = new StringBuilder(30);
            var27.append("").append(var3.hash).append(" ");

            for(var20 = class69.scriptStackCount - 1; var20 >= 0; --var20) {
               var27.append("").append(class69.scriptStack[var20].invokedFromScript.hash).append(" ");
            }

            var27.append("").append(var30);
            UnitPriceComparator.processClientError(var27.toString(), var28);
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1705135152"
   )
   static synchronized void method5671(byte[] var0) {
      if(var0.length == 100 && class183.field2344 < 1000) {
         class183.field2340[++class183.field2344 - 1] = var0;
      } else if(var0.length == 5000 && class183.field2346 < 250) {
         class183.field2343[++class183.field2346 - 1] = var0;
      } else if(var0.length == 30000 && class183.field2342 < 50) {
         class183.field2345[++class183.field2342 - 1] = var0;
      } else {
         if(class183.field2341 != null) {
            for(int var1 = 0; var1 < class183.field2348.length; ++var1) {
               if(var0.length == class183.field2348[var1] && class183.field2347[var1] < class183.field2341[var1].length) {
                  class183.field2341[var1][class183.field2347[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
