import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class174 {
   class174() throws Throwable {
      throw new Error();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lclass18;IB)V",
      garbageValue = "28"
   )
   static void method3275(class18 var0, int var1) {
      Object[] var2 = var0.field209;
      int var3 = ((Integer)var2[0]).intValue();
      Script var4 = class182.method3378(var3);
      if(var4 != null) {
         class103.scriptIntStackSize = 0;
         class32.scriptStringStackSize = 0;
         int pc = -1;
         int[] instructions = var4.instructions;
         int[] intOpands = var4.intOperands;
         byte var8 = -1;
         class32.scriptStackCount = 0;

         int var11;
         try {
            class3.field37 = new int[var4.localIntCount];
            int var9 = 0;
            class32.field757 = new String[var4.localStringCount];
            int var10 = 0;

            int var12;
            String var21;
            for(var11 = 1; var11 < var2.length; ++var11) {
               if(var2[var11] instanceof Integer) {
                  var12 = ((Integer)var2[var11]).intValue();
                  if(var12 == -2147483647) {
                     var12 = var0.field205;
                  }

                  if(var12 == -2147483646) {
                     var12 = var0.field200;
                  }

                  if(var12 == -2147483645) {
                     var12 = var0.field198 != null?var0.field198.id:-1;
                  }

                  if(var12 == -2147483644) {
                     var12 = var0.field201;
                  }

                  if(var12 == -2147483643) {
                     var12 = var0.field198 != null?var0.field198.index:-1;
                  }

                  if(var12 == -2147483642) {
                     var12 = null != var0.field210?var0.field210.id:-1;
                  }

                  if(var12 == -2147483641) {
                     var12 = null != var0.field210?var0.field210.index:-1;
                  }

                  if(var12 == -2147483640) {
                     var12 = var0.field203;
                  }

                  if(var12 == -2147483639) {
                     var12 = var0.field204;
                  }

                  class3.field37[var9++] = var12;
               } else if(var2[var11] instanceof String) {
                  var21 = (String)var2[var11];
                  if(var21.equals("event_opbase")) {
                     var21 = var0.field202;
                  }

                  class32.field757[var10++] = var21;
               }
            }

            var11 = 0;
            class32.field754 = var0.field197;

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
                                                                                       label301:
                                                                                       while(true) {
                                                                                          ++var11;
                                                                                          if(var11 > var1) {
                                                                                             throw new RuntimeException();
                                                                                          }

                                                                                          ++pc;
                                                                                          int var31 = instructions[pc];
                                                                                          int var26;
                                                                                          if(var31 < 100) {
                                                                                             if(var31 != 0) {
                                                                                                if(var31 != 1) {
                                                                                                   if(var31 != 2) {
                                                                                                      if(var31 != 3) {
                                                                                                         if(var31 != 6) {
                                                                                                            if(var31 != 7) {
                                                                                                               if(var31 != 8) {
                                                                                                                  if(var31 != 9) {
                                                                                                                     if(var31 != 10) {
                                                                                                                        if(var31 != 21) {
                                                                                                                           if(var31 != 25) {
                                                                                                                              if(var31 != 27) {
                                                                                                                                 if(var31 != 31) {
                                                                                                                                    if(var31 != 32) {
                                                                                                                                       if(var31 != 33) {
                                                                                                                                          if(var31 != 34) {
                                                                                                                                             if(var31 != 35) {
                                                                                                                                                if(var31 != 36) {
                                                                                                                                                   int var22;
                                                                                                                                                   if(var31 != 37) {
                                                                                                                                                      if(var31 != 38) {
                                                                                                                                                         if(var31 != 39) {
                                                                                                                                                            if(var31 != 40) {
                                                                                                                                                               if(var31 != 42) {
                                                                                                                                                                  if(var31 != 43) {
                                                                                                                                                                     if(var31 == 44) {
                                                                                                                                                                        var12 = intOpands[pc] >> 16;
                                                                                                                                                                        var26 = intOpands[pc] & '\uffff';
                                                                                                                                                                        int var27 = class32.scriptIntStack[--class103.scriptIntStackSize];
                                                                                                                                                                        if(var27 >= 0 && var27 <= 5000) {
                                                                                                                                                                           class32.field752[var12] = var27;
                                                                                                                                                                           byte var34 = -1;
                                                                                                                                                                           if(var26 == 105) {
                                                                                                                                                                              var34 = 0;
                                                                                                                                                                           }

                                                                                                                                                                           var22 = 0;

                                                                                                                                                                           while(true) {
                                                                                                                                                                              if(var22 >= var27) {
                                                                                                                                                                                 continue label301;
                                                                                                                                                                              }

                                                                                                                                                                              class32.field746[var12][var22] = var34;
                                                                                                                                                                              ++var22;
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                     } else if(var31 == 45) {
                                                                                                                                                                        var12 = intOpands[pc];
                                                                                                                                                                        var26 = class32.scriptIntStack[--class103.scriptIntStackSize];
                                                                                                                                                                        if(var26 < 0 || var26 >= class32.field752[var12]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class32.scriptIntStack[++class103.scriptIntStackSize - 1] = class32.field746[var12][var26];
                                                                                                                                                                     } else if(var31 == 46) {
                                                                                                                                                                        var12 = intOpands[pc];
                                                                                                                                                                        class103.scriptIntStackSize -= 2;
                                                                                                                                                                        var26 = class32.scriptIntStack[class103.scriptIntStackSize];
                                                                                                                                                                        if(var26 < 0 || var26 >= class32.field752[var12]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class32.field746[var12][var26] = class32.scriptIntStack[1 + class103.scriptIntStackSize];
                                                                                                                                                                     } else if(var31 == 47) {
                                                                                                                                                                        var21 = class20.chatMessages.method910(intOpands[pc]);
                                                                                                                                                                        if(null == var21) {
                                                                                                                                                                           var21 = "null";
                                                                                                                                                                        }

                                                                                                                                                                        class32.scriptStringStack[++class32.scriptStringStackSize - 1] = var21;
                                                                                                                                                                     } else {
                                                                                                                                                                        if(var31 != 48) {
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        }

                                                                                                                                                                        class20.chatMessages.method909(intOpands[pc], class32.scriptStringStack[--class32.scriptStringStackSize]);
                                                                                                                                                                     }
                                                                                                                                                                  } else {
																					  //43
                                                                                                                                                                     class20.chatMessages.method907(intOpands[pc], class32.scriptIntStack[--class103.scriptIntStackSize]);
                                                                                                                                                                  }
                                                                                                                                                               } else {
																				       //42
                                                                                                                                                                  class32.scriptIntStack[++class103.scriptIntStackSize - 1] = class20.chatMessages.method921(intOpands[pc]);
                                                                                                                                                               }
                                                                                                                                                            } else {
																				    //40
                                                                                                                                                               var12 = intOpands[pc];
                                                                                                                                                               Script var33 = class182.method3378(var12);
                                                                                                                                                               int[] var32 = new int[var33.localIntCount];
                                                                                                                                                               String[] var25 = new String[var33.localStringCount];

                                                                                                                                                               for(var22 = 0; var22 < var33.intStackCount; ++var22) {
                                                                                                                                                                  var32[var22] = class32.scriptIntStack[class103.scriptIntStackSize - var33.intStackCount + var22];
                                                                                                                                                               }

                                                                                                                                                               for(var22 = 0; var22 < var33.stringStackCount; ++var22) {
                                                                                                                                                                  var25[var22] = class32.scriptStringStack[class32.scriptStringStackSize - var33.stringStackCount + var22];
                                                                                                                                                               }

                                                                                                                                                               class103.scriptIntStackSize -= var33.intStackCount;
                                                                                                                                                               class32.scriptStringStackSize -= var33.stringStackCount;
                                                                                                                                                               ScriptState var35 = new ScriptState();
                                                                                                                                                               var35.field121 = var4;
                                                                                                                                                               var35.field124 = pc;
                                                                                                                                                               var35.field134 = class3.field37;
                                                                                                                                                               var35.field123 = class32.field757;
                                                                                                                                                               class32.scriptStack[++class32.scriptStackCount - 1] = var35;
                                                                                                                                                               var4 = var33;
                                                                                                                                                               instructions = var33.instructions;
                                                                                                                                                               intOpands = var33.intOperands;
                                                                                                                                                               pc = -1;
                                                                                                                                                               class3.field37 = var32;
                                                                                                                                                               class32.field757 = var25;
                                                                                                                                                            }
                                                                                                                                                         } else {
																				 //39
                                                                                                                                                            --class32.scriptStringStackSize;
                                                                                                                                                         }
                                                                                                                                                      } else {
																			      //38
                                                                                                                                                         --class103.scriptIntStackSize;
                                                                                                                                                      }
                                                                                                                                                   } else {
																			   //37
                                                                                                                                                      var12 = intOpands[pc];
                                                                                                                                                      class32.scriptStringStackSize -= var12;
                                                                                                                                                      String[] var14 = class32.scriptStringStack;
                                                                                                                                                      int var15 = class32.scriptStringStackSize;
                                                                                                                                                      String var13;
                                                                                                                                                      if(var12 == 0) {
                                                                                                                                                         var13 = "";
                                                                                                                                                      } else if(var12 == 1) {
                                                                                                                                                         String var16 = var14[var15];
                                                                                                                                                         if(var16 == null) {
                                                                                                                                                            var13 = "null";
                                                                                                                                                         } else {
                                                                                                                                                            var13 = var16.toString();
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         var22 = var12 + var15;
                                                                                                                                                         int var17 = 0;

                                                                                                                                                         for(int var18 = var15; var18 < var22; ++var18) {
                                                                                                                                                            String var19 = var14[var18];
                                                                                                                                                            if(var19 == null) {
                                                                                                                                                               var17 += 4;
                                                                                                                                                            } else {
                                                                                                                                                               var17 += var19.length();
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         StringBuilder var23 = new StringBuilder(var17);

                                                                                                                                                         for(int var24 = var15; var24 < var22; ++var24) {
                                                                                                                                                            String var20 = var14[var24];
                                                                                                                                                            if(var20 == null) {
                                                                                                                                                               var23.append("null");
                                                                                                                                                            } else {
                                                                                                                                                               var23.append(var20);
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         var13 = var23.toString();
                                                                                                                                                      }

                                                                                                                                                      class32.scriptStringStack[++class32.scriptStringStackSize - 1] = var13;
                                                                                                                                                   }
                                                                                                                                                } else {
																			//36
                                                                                                                                                   class32.field757[intOpands[pc]] = class32.scriptStringStack[--class32.scriptStringStackSize];
                                                                                                                                                }
                                                                                                                                             } else {
																		     //35
                                                                                                                                                class32.scriptStringStack[++class32.scriptStringStackSize - 1] = class32.field757[intOpands[pc]];
                                                                                                                                             }
                                                                                                                                          } else {
																		  //34
                                                                                                                                             class3.field37[intOpands[pc]] = class32.scriptIntStack[--class103.scriptIntStackSize];
                                                                                                                                          }
                                                                                                                                       } else {
																	       //33
                                                                                                                                          class32.scriptIntStack[++class103.scriptIntStackSize - 1] = class3.field37[intOpands[pc]];
                                                                                                                                       }
                                                                                                                                    } else {
																	    //32
                                                                                                                                       class103.scriptIntStackSize -= 2;
                                                                                                                                       if(class32.scriptIntStack[class103.scriptIntStackSize] >= class32.scriptIntStack[class103.scriptIntStackSize + 1]) {
                                                                                                                                          pc += intOpands[pc];
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
																	 //31
                                                                                                                                    class103.scriptIntStackSize -= 2;
                                                                                                                                    if(class32.scriptIntStack[class103.scriptIntStackSize] <= class32.scriptIntStack[class103.scriptIntStackSize + 1]) {
                                                                                                                                       pc += intOpands[pc];
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
																      //27
                                                                                                                                 var12 = intOpands[pc];
                                                                                                                                 ItemComposition.method3718(var12, class32.scriptIntStack[--class103.scriptIntStackSize]);
                                                                                                                              }
                                                                                                                           } else {
																   //25
                                                                                                                              var12 = intOpands[pc];
                                                                                                                              class32.scriptIntStack[++class103.scriptIntStackSize - 1] = class109.method2109(var12);
                                                                                                                           }
                                                                                                                        } else {
																//21
                                                                                                                           if(class32.scriptStackCount == 0) {
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           ScriptState var37 = class32.scriptStack[--class32.scriptStackCount];
                                                                                                                           var4 = var37.field121;
                                                                                                                           instructions = var4.instructions;
                                                                                                                           intOpands = var4.intOperands;
                                                                                                                           pc = var37.field124;
                                                                                                                           class3.field37 = var37.field134;
                                                                                                                           class32.field757 = var37.field123;
                                                                                                                        }
                                                                                                                     } else {
															     //10
                                                                                                                        class103.scriptIntStackSize -= 2;
                                                                                                                        if(class32.scriptIntStack[class103.scriptIntStackSize] > class32.scriptIntStack[class103.scriptIntStackSize + 1]) {
                                                                                                                           pc += intOpands[pc];
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
															  //9
                                                                                                                     class103.scriptIntStackSize -= 2;
                                                                                                                     if(class32.scriptIntStack[class103.scriptIntStackSize] < class32.scriptIntStack[1 + class103.scriptIntStackSize]) {
                                                                                                                        pc += intOpands[pc];
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
														       //8
                                                                                                                  class103.scriptIntStackSize -= 2;
                                                                                                                  if(class32.scriptIntStack[class103.scriptIntStackSize] == class32.scriptIntStack[1 + class103.scriptIntStackSize]) {
                                                                                                                     pc += intOpands[pc];
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
														    //7
                                                                                                               class103.scriptIntStackSize -= 2;
                                                                                                               if(class32.scriptIntStack[class103.scriptIntStackSize + 1] != class32.scriptIntStack[class103.scriptIntStackSize]) {
                                                                                                                  pc += intOpands[pc];
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
														 //6
                                                                                                            pc += intOpands[pc];
                                                                                                         }
                                                                                                      } else {
													      //3
                                                                                                         class32.scriptStringStack[++class32.scriptStringStackSize - 1] = var4.stringOperands[pc];
                                                                                                      }
                                                                                                   } else {
													   //2
                                                                                                      var12 = intOpands[pc];
                                                                                                      class165.widgetSettings[var12] = class32.scriptIntStack[--class103.scriptIntStackSize];
                                                                                                      class145.method2760(var12);
                                                                                                   }
                                                                                                } else {
													//1
                                                                                                   var12 = intOpands[pc];
                                                                                                   class32.scriptIntStack[++class103.scriptIntStackSize - 1] = class165.widgetSettings[var12];
                                                                                                }
                                                                                             } else {
												     //0
                                                                                                class32.scriptIntStack[++class103.scriptIntStackSize - 1] = intOpands[pc];
                                                                                             }
                                                                                          } else {
                                                                                             boolean var36;
                                                                                             if(var4.intOperands[pc] == 1) {
                                                                                                var36 = true;
                                                                                             } else {
                                                                                                var36 = false;
                                                                                             }

                                                                                             var26 = XClanMember.method254(var31, var4, var36);
                                                                                             switch(var26) {
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
         } catch (Exception var30) {
            StringBuilder var29 = new StringBuilder(30);
            var29.append("").append(var4.hash).append(" ");

            for(var11 = class32.scriptStackCount - 1; var11 >= 0; --var11) {
               var29.append("").append(class32.scriptStack[var11].field121.hash).append(" ");
            }

            var29.append("").append(var8);
            class37.method822(var29.toString(), var30);
         }
      }
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "(LWidget;I)V",
      garbageValue = "1981648532"
   )
   static void method3276(Widget var0) {
      if(var0.field2337 == Client.field509) {
         Client.field510[var0.boundsIndex] = true;
      }

   }
}
