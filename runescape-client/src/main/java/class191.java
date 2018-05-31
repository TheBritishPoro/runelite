import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class191 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Liw;",
      garbageValue = "17"
   )
   public static JagexGame[] method3870() {
      return new JagexGame[]{JagexGame.field3143, JagexGame.field3145, JagexGame.field3146, JagexGame.field3141, JagexGame.field3140, JagexGame.field3142};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-73"
   )
   static int method3866(int var0, Script var1, boolean var2) {
      if(var0 < 1000) {
         return class32.method540(var0, var1, var2);
      } else if(var0 < 1100) {
         return GameEngine.method909(var0, var1, var2);
      } else if(var0 < 1200) {
         return Resampler.method2238(var0, var1, var2);
      } else if(var0 < 1300) {
         return GraphicsObject.method1768(var0, var1, var2);
      } else if(var0 < 1400) {
         return class21.method274(var0, var1, var2);
      } else if(var0 < 1500) {
         return class228.method4495(var0, var1, var2);
      } else if(var0 < 1600) {
         return World.method1605(var0, var1, var2);
      } else {
         byte var3;
         Widget var35;
         if(var0 < 1700) {
            var35 = var2?class276.field3561:KitDefinition.field3301;
            if(var0 == 1600) {
               class69.intStack[++class69.intStackSize - 1] = var35.scrollX;
               var3 = 1;
            } else if(var0 == 1601) {
               class69.intStack[++class69.intStackSize - 1] = var35.scrollY;
               var3 = 1;
            } else if(var0 == 1602) {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var35.text;
               var3 = 1;
            } else if(var0 == 1603) {
               class69.intStack[++class69.intStackSize - 1] = var35.scrollWidth;
               var3 = 1;
            } else if(var0 == 1604) {
               class69.intStack[++class69.intStackSize - 1] = var35.scrollHeight;
               var3 = 1;
            } else if(var0 == 1605) {
               class69.intStack[++class69.intStackSize - 1] = var35.modelZoom;
               var3 = 1;
            } else if(var0 == 1606) {
               class69.intStack[++class69.intStackSize - 1] = var35.rotationX;
               var3 = 1;
            } else if(var0 == 1607) {
               class69.intStack[++class69.intStackSize - 1] = var35.rotationY;
               var3 = 1;
            } else if(var0 == 1608) {
               class69.intStack[++class69.intStackSize - 1] = var35.rotationZ;
               var3 = 1;
            } else if(var0 == 1609) {
               class69.intStack[++class69.intStackSize - 1] = var35.opacity;
               var3 = 1;
            } else if(var0 == 1610) {
               class69.intStack[++class69.intStackSize - 1] = var35.field2608;
               var3 = 1;
            } else if(var0 == 1611) {
               class69.intStack[++class69.intStackSize - 1] = var35.textColor;
               var3 = 1;
            } else if(var0 == 1612) {
               class69.intStack[++class69.intStackSize - 1] = var35.field2631;
               var3 = 1;
            } else if(var0 == 1613) {
               class69.intStack[++class69.intStackSize - 1] = var35.field2701.rsOrdinal();
               var3 = 1;
            } else if(var0 == 1614) {
               class69.intStack[++class69.intStackSize - 1] = var35.field2726?1:0;
               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else {
            Widget var31;
            if(var0 < 1800) {
               var31 = var2?class276.field3561:KitDefinition.field3301;
               if(var0 == 1700) {
                  class69.intStack[++class69.intStackSize - 1] = var31.itemId;
                  var3 = 1;
               } else if(var0 == 1701) {
                  if(var31.itemId != -1) {
                     class69.intStack[++class69.intStackSize - 1] = var31.itemQuantity;
                  } else {
                     class69.intStack[++class69.intStackSize - 1] = 0;
                  }

                  var3 = 1;
               } else if(var0 == 1702) {
                  class69.intStack[++class69.intStackSize - 1] = var31.index;
                  var3 = 1;
               } else {
                  var3 = 2;
               }

               return var3;
            } else if(var0 < 1900) {
               return GameEngine.method914(var0, var1, var2);
            } else if(var0 < 2000) {
               return class305.method5659(var0, var1, var2);
            } else if(var0 < 2100) {
               return GameEngine.method909(var0, var1, var2);
            } else if(var0 < 2200) {
               return Resampler.method2238(var0, var1, var2);
            } else if(var0 < 2300) {
               return GraphicsObject.method1768(var0, var1, var2);
            } else if(var0 < 2400) {
               return class21.method274(var0, var1, var2);
            } else if(var0 < 2500) {
               return class228.method4495(var0, var1, var2);
            } else if(var0 < 2600) {
               var35 = class26.getWidget(class69.intStack[--class69.intStackSize]);
               if(var0 == 2500) {
                  class69.intStack[++class69.intStackSize - 1] = var35.relativeX;
                  var3 = 1;
               } else if(var0 == 2501) {
                  class69.intStack[++class69.intStackSize - 1] = var35.relativeY;
                  var3 = 1;
               } else if(var0 == 2502) {
                  class69.intStack[++class69.intStackSize - 1] = var35.width;
                  var3 = 1;
               } else if(var0 == 2503) {
                  class69.intStack[++class69.intStackSize - 1] = var35.height;
                  var3 = 1;
               } else if(var0 == 2504) {
                  class69.intStack[++class69.intStackSize - 1] = var35.isHidden?1:0;
                  var3 = 1;
               } else if(var0 == 2505) {
                  class69.intStack[++class69.intStackSize - 1] = var35.parentId;
                  var3 = 1;
               } else {
                  var3 = 2;
               }

               return var3;
            } else if(var0 < 2700) {
               return class13.method111(var0, var1, var2);
            } else if(var0 < 2800) {
               return Timer.method3341(var0, var1, var2);
            } else if(var0 < 2900) {
               return OwnWorldComparator.method1126(var0, var1, var2);
            } else if(var0 < 3000) {
               return class305.method5659(var0, var1, var2);
            } else {
               String var4;
               int var6;
               int var13;
               int var14;
               PacketNode var15;
               PacketNode var29;
               boolean var37;
               if(var0 < 3200) {
                  if(var0 == 3100) {
                     var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     class143.sendGameMessage(0, "", var4);
                     var3 = 1;
                  } else if(var0 == 3101) {
                     class69.intStackSize -= 2;
                     GameObject.method3102(class138.localPlayer, class69.intStack[class69.intStackSize], class69.intStack[class69.intStackSize + 1]);
                     var3 = 1;
                  } else if(var0 == 3103) {
                     var29 = class26.method433(ClientPacket.field2195, Client.field626.field1218);
                     Client.field626.method1980(var29);

                     for(WidgetNode var27 = (WidgetNode)Client.componentTable.first(); var27 != null; var27 = (WidgetNode)Client.componentTable.next()) {
                        if(var27.owner == 0 || var27.owner == 3) {
                           WorldMapData.closeWidget(var27, true);
                        }
                     }

                     if(Client.field744 != null) {
                        Player.method1114(Client.field744);
                        Client.field744 = null;
                     }

                     var3 = 1;
                  } else if(var0 == 3104) {
                     var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     var14 = 0;
                     if(Resampler.method2249(var4)) {
                        var6 = class68.parseInt(var4, 10, true);
                        var14 = var6;
                     }

                     var15 = class26.method433(ClientPacket.field2150, Client.field626.field1218);
                     var15.packetBuffer.putInt(var14);
                     Client.field626.method1980(var15);
                     var3 = 1;
                  } else {
                     PacketNode var28;
                     if(var0 == 3105) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        var28 = class26.method433(ClientPacket.field2209, Client.field626.field1218);
                        var28.packetBuffer.putByte(var4.length() + 1);
                        var28.packetBuffer.putString(var4);
                        Client.field626.method1980(var28);
                        var3 = 1;
                     } else if(var0 == 3106) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        var28 = class26.method433(ClientPacket.field2136, Client.field626.field1218);
                        var28.packetBuffer.putByte(var4.length() + 1);
                        var28.packetBuffer.putString(var4);
                        Client.field626.method1980(var28);
                        var3 = 1;
                     } else {
                        String var30;
                        if(var0 == 3107) {
                           var13 = class69.intStack[--class69.intStackSize];
                           var30 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           var6 = class81.playerIndexesCount;
                           int[] var7 = class81.playerIndices;
                           boolean var40 = false;
                           Name var9 = new Name(var30, MapIconReference.loginType);

                           for(int var10 = 0; var10 < var6; ++var10) {
                              Player var11 = Client.cachedPlayers[var7[var10]];
                              if(var11 != null && var11 != class138.localPlayer && var11.name != null && var11.name.equals(var9)) {
                                 PacketNode var12;
                                 if(var13 == 1) {
                                    var12 = class26.method433(ClientPacket.field2206, Client.field626.field1218);
                                    var12.packetBuffer.putByte(0);
                                    var12.packetBuffer.putShort(var7[var10]);
                                    Client.field626.method1980(var12);
                                 } else if(var13 == 4) {
                                    var12 = class26.method433(ClientPacket.field2220, Client.field626.field1218);
                                    var12.packetBuffer.method3771(var7[var10]);
                                    var12.packetBuffer.putByte(0);
                                    Client.field626.method1980(var12);
                                 } else if(var13 == 6) {
                                    var12 = class26.method433(ClientPacket.field2163, Client.field626.field1218);
                                    var12.packetBuffer.method3575(0);
                                    var12.packetBuffer.method3771(var7[var10]);
                                    Client.field626.method1980(var12);
                                 } else if(var13 == 7) {
                                    var12 = class26.method433(ClientPacket.field2222, Client.field626.field1218);
                                    var12.packetBuffer.method3582(var7[var10]);
                                    var12.packetBuffer.method3574(0);
                                    Client.field626.method1980(var12);
                                 }

                                 var40 = true;
                                 break;
                              }
                           }

                           if(!var40) {
                              class143.sendGameMessage(4, "", "Unable to find " + var30);
                           }

                           var3 = 1;
                        } else if(var0 == 3108) {
                           class69.intStackSize -= 3;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           var6 = class69.intStack[class69.intStackSize + 2];
                           var31 = class26.getWidget(var6);
                           ClientPacket.method3447(var31, var13, var14);
                           var3 = 1;
                        } else if(var0 == 3109) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           Widget var38 = var2?class276.field3561:KitDefinition.field3301;
                           ClientPacket.method3447(var38, var13, var14);
                           var3 = 1;
                        } else if(var0 == 3110) {
                           InvType.middleMouseMovesCamera = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3111) {
                           class69.intStack[++class69.intStackSize - 1] = class10.preferences.hideRoofs?1:0;
                           var3 = 1;
                        } else if(var0 == 3112) {
                           class10.preferences.hideRoofs = class69.intStack[--class69.intStackSize] == 1;
                           class54.method1018();
                           var3 = 1;
                        } else if(var0 == 3113) {
                           var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           boolean var41 = class69.intStack[--class69.intStackSize] == 1;
                           HorizontalAlignment.method5156(var4, var41, false);
                           var3 = 1;
                        } else if(var0 == 3115) {
                           var13 = class69.intStack[--class69.intStackSize];
                           var28 = class26.method433(ClientPacket.field2225, Client.field626.field1218);
                           var28.packetBuffer.putShort(var13);
                           Client.field626.method1980(var28);
                           var3 = 1;
                        } else if(var0 == 3116) {
                           var13 = class69.intStack[--class69.intStackSize];
                           WidgetNode.scriptStringStackSize -= 2;
                           var30 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
                           String var39 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
                           if(var30.length() > 500) {
                              var3 = 1;
                           } else if(var39.length() > 500) {
                              var3 = 1;
                           } else {
                              PacketNode var32 = class26.method433(ClientPacket.field2167, Client.field626.field1218);
                              var32.packetBuffer.putShort(1 + class316.getLength(var30) + class316.getLength(var39));
                              var32.packetBuffer.method3575(var13);
                              var32.packetBuffer.putString(var39);
                              var32.packetBuffer.putString(var30);
                              Client.field626.method1980(var32);
                              var3 = 1;
                           }
                        } else if(var0 == 3117) {
                           Client.field726 = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3118) {
                           Client.field728 = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3119) {
                           Client.field699 = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3120) {
                           if(class69.intStack[--class69.intStackSize] == 1) {
                              Client.playerNameMask |= 1;
                           } else {
                              Client.playerNameMask &= -2;
                           }

                           var3 = 1;
                        } else if(var0 == 3121) {
                           if(class69.intStack[--class69.intStackSize] == 1) {
                              Client.playerNameMask |= 2;
                           } else {
                              Client.playerNameMask &= -3;
                           }

                           var3 = 1;
                        } else if(var0 == 3122) {
                           if(class69.intStack[--class69.intStackSize] == 1) {
                              Client.playerNameMask |= 4;
                           } else {
                              Client.playerNameMask &= -5;
                           }

                           var3 = 1;
                        } else if(var0 == 3123) {
                           if(class69.intStack[--class69.intStackSize] == 1) {
                              Client.playerNameMask |= 8;
                           } else {
                              Client.playerNameMask &= -9;
                           }

                           var3 = 1;
                        } else if(var0 == 3124) {
                           Client.playerNameMask = 0;
                           var3 = 1;
                        } else if(var0 == 3125) {
                           Client.field621 = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3126) {
                           Client.field677 = class69.intStack[--class69.intStackSize] == 1;
                           var3 = 1;
                        } else if(var0 == 3127) {
                           var37 = class69.intStack[--class69.intStackSize] == 1;
                           Client.field727 = var37;
                           var3 = 1;
                        } else if(var0 == 3128) {
                           int[] var34 = class69.intStack;
                           var14 = ++class69.intStackSize - 1;
                           boolean var33 = Client.field727;
                           var34[var14] = var33?1:0;
                           var3 = 1;
                        } else if(var0 == 3129) {
                           class69.intStackSize -= 2;
                           Client.field750 = class69.intStack[class69.intStackSize];
                           Client.field661 = class69.intStack[class69.intStackSize + 1];
                           var3 = 1;
                        } else if(var0 == 3130) {
                           class69.intStackSize -= 2;
                           var3 = 1;
                        } else if(var0 == 3131) {
                           --class69.intStackSize;
                           var3 = 1;
                        } else if(var0 == 3132) {
                           class69.intStack[++class69.intStackSize - 1] = Varcs.canvasWidth;
                           class69.intStack[++class69.intStackSize - 1] = BuildType.canvasHeight;
                           var3 = 1;
                        } else if(var0 == 3133) {
                           --class69.intStackSize;
                           var3 = 1;
                        } else {
                           var3 = 2;
                        }
                     }
                  }

                  return var3;
               } else if(var0 < 3300) {
                  if(var0 == 3200) {
                     class69.intStackSize -= 3;
                     var13 = class69.intStack[class69.intStackSize];
                     var14 = class69.intStack[class69.intStackSize + 1];
                     var6 = class69.intStack[class69.intStackSize + 2];
                     if(Client.field814 != 0 && var14 != 0 && Client.queuedSoundEffectCount < 50) {
                        Client.queuedSoundEffectIDs[Client.queuedSoundEffectCount] = var13;
                        Client.unknownSoundValues1[Client.queuedSoundEffectCount] = var14;
                        Client.unknownSoundValues2[Client.queuedSoundEffectCount] = var6;
                        Client.audioEffects[Client.queuedSoundEffectCount] = null;
                        Client.soundLocations[Client.queuedSoundEffectCount] = 0;
                        ++Client.queuedSoundEffectCount;
                     }

                     var3 = 1;
                  } else if(var0 == 3201) {
                     var13 = class69.intStack[--class69.intStackSize];
                     if(var13 == -1 && !Client.field813) {
                        class9.method88();
                     } else if(var13 != -1 && var13 != Client.field812 && Client.field811 != 0 && !Client.field813) {
                        World.method1602(2, Item.indexTrack1, var13, 0, Client.field811, false);
                     }

                     Client.field812 = var13;
                     var3 = 1;
                  } else if(var0 == 3202) {
                     class69.intStackSize -= 2;
                     var13 = class69.intStack[class69.intStackSize];
                     var14 = class69.intStack[class69.intStackSize + 1];
                     if(Client.field811 != 0 && var13 != -1) {
                        Actor.method1554(OwnWorldComparator.indexTrack2, var13, 0, Client.field811, false);
                        Client.field813 = true;
                     }

                     var3 = 1;
                  } else {
                     var3 = 2;
                  }

                  return var3;
               } else if(var0 < 3400) {
                  return class173.method3469(var0, var1, var2);
               } else {
                  int var16;
                  if(var0 < 3500) {
                     if(var0 == 3400) {
                        class69.intStackSize -= 2;
                        var13 = class69.intStack[class69.intStackSize];
                        var14 = class69.intStack[class69.intStackSize + 1];
                        Enum var36 = Buffer.method3603(var13);
                        if(var36.valType != 's') {
                           ;
                        }

                        for(var16 = 0; var16 < var36.size; ++var16) {
                           if(var14 == var36.keys[var16]) {
                              class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var36.stringVals[var16];
                              var36 = null;
                              break;
                           }
                        }

                        if(var36 != null) {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var36.defaultString;
                        }

                        var3 = 1;
                     } else if(var0 == 3408) {
                        class69.intStackSize -= 4;
                        var13 = class69.intStack[class69.intStackSize];
                        var14 = class69.intStack[class69.intStackSize + 1];
                        var6 = class69.intStack[class69.intStackSize + 2];
                        var16 = class69.intStack[class69.intStackSize + 3];
                        Enum var8 = Buffer.method3603(var6);
                        if(var13 == var8.keyType && var14 == var8.valType) {
                           for(int var24 = 0; var24 < var8.size; ++var24) {
                              if(var16 == var8.keys[var24]) {
                                 if(var14 == 115) {
                                    class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var8.stringVals[var24];
                                 } else {
                                    class69.intStack[++class69.intStackSize - 1] = var8.intVals[var24];
                                 }

                                 var8 = null;
                                 break;
                              }
                           }

                           if(var8 != null) {
                              if(var14 == 115) {
                                 class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var8.defaultString;
                              } else {
                                 class69.intStack[++class69.intStackSize - 1] = var8.defaultInt;
                              }
                           }

                           var3 = 1;
                        } else {
                           if(var14 == 115) {
                              class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "null";
                           } else {
                              class69.intStack[++class69.intStackSize - 1] = 0;
                           }

                           var3 = 1;
                        }
                     } else if(var0 == 3411) {
                        var13 = class69.intStack[--class69.intStackSize];
                        Enum var26 = Buffer.method3603(var13);
                        class69.intStack[++class69.intStackSize - 1] = var26.method4980();
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 >= 3700) {
                     if(var0 < 4000) {
                        return MapCacheArchiveNames.method477(var0, var1, var2);
                     } else if(var0 < 4100) {
                        if(var0 == 4000) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var14 + var13;
                           var3 = 1;
                        } else if(var0 == 4001) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 - var14;
                           var3 = 1;
                        } else if(var0 == 4002) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var14 * var13;
                           var3 = 1;
                        } else if(var0 == 4003) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 / var14;
                           var3 = 1;
                        } else if(var0 == 4004) {
                           var13 = class69.intStack[--class69.intStackSize];
                           class69.intStack[++class69.intStackSize - 1] = (int)(Math.random() * (double)var13);
                           var3 = 1;
                        } else if(var0 == 4005) {
                           var13 = class69.intStack[--class69.intStackSize];
                           class69.intStack[++class69.intStackSize - 1] = (int)(Math.random() * (double)(var13 + 1));
                           var3 = 1;
                        } else if(var0 == 4006) {
                           class69.intStackSize -= 5;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           var6 = class69.intStack[class69.intStackSize + 2];
                           var16 = class69.intStack[class69.intStackSize + 3];
                           int var17 = class69.intStack[class69.intStackSize + 4];
                           class69.intStack[++class69.intStackSize - 1] = var13 + (var17 - var6) * (var14 - var13) / (var16 - var6);
                           var3 = 1;
                        } else if(var0 == 4007) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 + var14 * var13 / 100;
                           var3 = 1;
                        } else if(var0 == 4008) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 | 1 << var14;
                           var3 = 1;
                        } else if(var0 == 4009) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 & -1 - (1 << var14);
                           var3 = 1;
                        } else if(var0 == 4010) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = (var13 & 1 << var14) != 0?1:0;
                           var3 = 1;
                        } else if(var0 == 4011) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 % var14;
                           var3 = 1;
                        } else if(var0 == 4012) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           if(var13 == 0) {
                              class69.intStack[++class69.intStackSize - 1] = 0;
                           } else {
                              class69.intStack[++class69.intStackSize - 1] = (int)Math.pow((double)var13, (double)var14);
                           }

                           var3 = 1;
                        } else if(var0 == 4013) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           if(var13 == 0) {
                              class69.intStack[++class69.intStackSize - 1] = 0;
                              var3 = 1;
                           } else {
                              switch(var14) {
                              case 0:
                                 class69.intStack[++class69.intStackSize - 1] = Integer.MAX_VALUE;
                                 break;
                              case 1:
                                 class69.intStack[++class69.intStackSize - 1] = var13;
                                 break;
                              case 2:
                                 class69.intStack[++class69.intStackSize - 1] = (int)Math.sqrt((double)var13);
                                 break;
                              case 3:
                                 class69.intStack[++class69.intStackSize - 1] = (int)Math.cbrt((double)var13);
                                 break;
                              case 4:
                                 class69.intStack[++class69.intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var13));
                                 break;
                              default:
                                 class69.intStack[++class69.intStackSize - 1] = (int)Math.pow((double)var13, 1.0D / (double)var14);
                              }

                              var3 = 1;
                           }
                        } else if(var0 == 4014) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 & var14;
                           var3 = 1;
                        } else if(var0 == 4015) {
                           class69.intStackSize -= 2;
                           var13 = class69.intStack[class69.intStackSize];
                           var14 = class69.intStack[class69.intStackSize + 1];
                           class69.intStack[++class69.intStackSize - 1] = var13 | var14;
                           var3 = 1;
                        } else if(var0 == 4018) {
                           class69.intStackSize -= 3;
                           long var18 = (long)class69.intStack[class69.intStackSize];
                           long var20 = (long)class69.intStack[class69.intStackSize + 1];
                           long var22 = (long)class69.intStack[class69.intStackSize + 2];
                           class69.intStack[++class69.intStackSize - 1] = (int)(var22 * var18 / var20);
                           var3 = 1;
                        } else {
                           var3 = 2;
                        }

                        return var3;
                     } else {
                        return var0 < 4200?MouseRecorder.method1034(var0, var1, var2):(var0 < 4300?class73.method1799(var0, var1, var2):(var0 < 5100?WorldMapType3.method139(var0, var1, var2):(var0 < 5400?class6.method74(var0, var1, var2):(var0 < 5600?DState.method3526(var0, var1, var2):(var0 < 5700?TextureProvider.method2531(var0, var1, var2):(var0 < 6300?class151.method3240(var0, var1, var2):(var0 < 6600?UnitPriceComparator.method59(var0, var1, var2):(var0 < 6700?CombatInfo1.method1558(var0, var1, var2):2))))))));
                     }
                  } else {
                     if(var0 == 3600) {
                        if(DState.friendManager.field976 == 0) {
                           class69.intStack[++class69.intStackSize - 1] = -2;
                        } else if(DState.friendManager.field976 == 1) {
                           class69.intStack[++class69.intStackSize - 1] = -1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = DState.friendManager.friendContainer.getCount();
                        }

                        var3 = 1;
                     } else if(var0 == 3601) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(DState.friendManager.method1624() && var13 >= 0 && var13 < DState.friendManager.friendContainer.getCount()) {
                           Friend var5 = (Friend)DState.friendManager.friendContainer.get(var13);
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var5.method5288();
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var5.method5289();
                        } else {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                        }

                        var3 = 1;
                     } else if(var0 == 3602) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(DState.friendManager.method1624() && var13 >= 0 && var13 < DState.friendManager.friendContainer.getCount()) {
                           class69.intStack[++class69.intStackSize - 1] = ((ChatPlayer)DState.friendManager.friendContainer.get(var13)).world;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3603) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(DState.friendManager.method1624() && var13 >= 0 && var13 < DState.friendManager.friendContainer.getCount()) {
                           class69.intStack[++class69.intStackSize - 1] = ((ChatPlayer)DState.friendManager.friendContainer.get(var13)).rank;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3604) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        var14 = class69.intStack[--class69.intStackSize];
                        var15 = class26.method433(ClientPacket.field2168, Client.field626.field1218);
                        var15.packetBuffer.putByte(class316.getLength(var4) + 1);
                        var15.packetBuffer.method3574(var14);
                        var15.packetBuffer.putString(var4);
                        Client.field626.method1980(var15);
                        var3 = 1;
                     } else if(var0 == 3605) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        DState.friendManager.addToFriendsList(var4);
                        var3 = 1;
                     } else if(var0 == 3606) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        DState.friendManager.removeFriend(var4);
                        var3 = 1;
                     } else if(var0 == 3607) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        DState.friendManager.addToIgnoreList(var4);
                        var3 = 1;
                     } else if(var0 == 3608) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        DState.friendManager.method1636(var4);
                        var3 = 1;
                     } else if(var0 == 3609) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        var4 = class139.method3138(var4);
                        class69.intStack[++class69.intStackSize - 1] = DState.friendManager.isFriended(new Name(var4, MapIconReference.loginType), false)?1:0;
                        var3 = 1;
                     } else if(var0 == 3611) {
                        if(WorldMapType3.clanMemberManager != null) {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = WorldMapType3.clanMemberManager.field3654;
                        } else {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                        }

                        var3 = 1;
                     } else if(var0 == 3612) {
                        if(WorldMapType3.clanMemberManager != null) {
                           class69.intStack[++class69.intStackSize - 1] = WorldMapType3.clanMemberManager.getCount();
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3613) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount()) {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = WorldMapType3.clanMemberManager.get(var13).getRsName().getName();
                        } else {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                        }

                        var3 = 1;
                     } else if(var0 == 3614) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount()) {
                           class69.intStack[++class69.intStackSize - 1] = ((ChatPlayer)WorldMapType3.clanMemberManager.get(var13)).method5414();
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3615) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount()) {
                           class69.intStack[++class69.intStackSize - 1] = ((ChatPlayer)WorldMapType3.clanMemberManager.get(var13)).rank;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3616) {
                        class69.intStack[++class69.intStackSize - 1] = WorldMapType3.clanMemberManager != null?WorldMapType3.clanMemberManager.field3651:0;
                        var3 = 1;
                     } else if(var0 == 3617) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        class177.method3508(var4);
                        var3 = 1;
                     } else if(var0 == 3618) {
                        class69.intStack[++class69.intStackSize - 1] = WorldMapType3.clanMemberManager != null?WorldMapType3.clanMemberManager.field3657:0;
                        var3 = 1;
                     } else if(var0 == 3619) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        Size.method110(var4);
                        var3 = 1;
                     } else if(var0 == 3620) {
                        var29 = class26.method433(ClientPacket.field2153, Client.field626.field1218);
                        var29.packetBuffer.putByte(0);
                        Client.field626.method1980(var29);
                        var3 = 1;
                     } else if(var0 == 3621) {
                        if(!DState.friendManager.method1624()) {
                           class69.intStack[++class69.intStackSize - 1] = -1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = DState.friendManager.ignoreContainer.getCount();
                        }

                        var3 = 1;
                     } else if(var0 == 3622) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(DState.friendManager.method1624() && var13 >= 0 && var13 < DState.friendManager.ignoreContainer.getCount()) {
                           Ignore var25 = (Ignore)DState.friendManager.ignoreContainer.get(var13);
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var25.method5288();
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var25.method5289();
                        } else {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                        }

                        var3 = 1;
                     } else if(var0 == 3623) {
                        var4 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        var4 = class139.method3138(var4);
                        class69.intStack[++class69.intStackSize - 1] = DState.friendManager.isIgnored(new Name(var4, MapIconReference.loginType))?1:0;
                        var3 = 1;
                     } else if(var0 == 3624) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount() && WorldMapType3.clanMemberManager.get(var13).getRsName().equals(class138.localPlayer.name)) {
                           class69.intStack[++class69.intStackSize - 1] = 1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3625) {
                        if(WorldMapType3.clanMemberManager != null && WorldMapType3.clanMemberManager.field3655 != null) {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = WorldMapType3.clanMemberManager.field3655;
                        } else {
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                        }

                        var3 = 1;
                     } else if(var0 == 3626) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount() && ((ClanMember)WorldMapType3.clanMemberManager.get(var13)).method5266()) {
                           class69.intStack[++class69.intStackSize - 1] = 1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3627) {
                        var13 = class69.intStack[--class69.intStackSize];
                        if(WorldMapType3.clanMemberManager != null && var13 < WorldMapType3.clanMemberManager.getCount() && ((ClanMember)WorldMapType3.clanMemberManager.get(var13)).method5267()) {
                           class69.intStack[++class69.intStackSize - 1] = 1;
                        } else {
                           class69.intStack[++class69.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3628) {
                        DState.friendManager.friendContainer.method5346();
                        var3 = 1;
                     } else if(var0 == 3629) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class308(var37));
                        var3 = 1;
                     } else if(var0 == 3630) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class309(var37));
                        var3 = 1;
                     } else if(var0 == 3631) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class143(var37));
                        var3 = 1;
                     } else if(var0 == 3632) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class137(var37));
                        var3 = 1;
                     } else if(var0 == 3633) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class142(var37));
                        var3 = 1;
                     } else if(var0 == 3634) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class145(var37));
                        var3 = 1;
                     } else if(var0 == 3635) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class141(var37));
                        var3 = 1;
                     } else if(var0 == 3636) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class139(var37));
                        var3 = 1;
                     } else if(var0 == 3637) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class138(var37));
                        var3 = 1;
                     } else if(var0 == 3638) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class140(var37));
                        var3 = 1;
                     } else if(var0 == 3639) {
                        DState.friendManager.friendContainer.method5337();
                        var3 = 1;
                     } else if(var0 == 3640) {
                        DState.friendManager.ignoreContainer.method5346();
                        var3 = 1;
                     } else if(var0 == 3641) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.ignoreContainer.method5347(new class308(var37));
                        var3 = 1;
                     } else if(var0 == 3642) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.ignoreContainer.method5347(new class309(var37));
                        var3 = 1;
                     } else if(var0 == 3643) {
                        DState.friendManager.ignoreContainer.method5337();
                        var3 = 1;
                     } else if(var0 == 3644) {
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5346();
                        }

                        var3 = 1;
                     } else if(var0 == 3645) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class308(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3646) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class309(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3647) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class143(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3648) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class137(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3649) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class142(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3650) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class145(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3651) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class141(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3652) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class139(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3653) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class138(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3654) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class140(var37));
                        }

                        var3 = 1;
                     } else if(var0 == 3655) {
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5337();
                        }

                        var3 = 1;
                     } else if(var0 == 3656) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        DState.friendManager.friendContainer.method5347(new class144(var37));
                        var3 = 1;
                     } else if(var0 == 3657) {
                        var37 = class69.intStack[--class69.intStackSize] == 1;
                        if(WorldMapType3.clanMemberManager != null) {
                           WorldMapType3.clanMemberManager.method5347(new class144(var37));
                        }

                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  }
               }
            }
         }
      }
   }
}
