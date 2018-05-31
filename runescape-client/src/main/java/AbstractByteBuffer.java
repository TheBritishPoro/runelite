import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("AbstractByteBuffer")
public abstract class AbstractByteBuffer {
   @ObfuscatedName("w")
   @Export("directBufferUnavailable")
   static boolean directBufferUnavailable;
   @ObfuscatedName("ah")
   static int[] field2367;

   static {
      directBufferUnavailable = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-44"
   )
   @Export("get")
   abstract byte[] get();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "339302128"
   )
   @Export("put")
   abstract void put(byte[] var1);

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Laj;I)V",
      garbageValue = "-1775785270"
   )
   static void method3806(GameEngine var0) {
      int var3;
      int var14;
      if(class78.worldSelectShown) {
         if(MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) {
            int var1 = class78.field1082 + 280;
            if(MouseInput.mouseLastPressedX >= var1 && MouseInput.mouseLastPressedX <= var1 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
               class148.method3195(0, 0);
            } else if(MouseInput.mouseLastPressedX >= var1 + 15 && MouseInput.mouseLastPressedX <= var1 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
               class148.method3195(0, 1);
            } else {
               int var2 = class78.field1082 + 390;
               if(MouseInput.mouseLastPressedX >= var2 && MouseInput.mouseLastPressedX <= var2 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  class148.method3195(1, 0);
               } else if(MouseInput.mouseLastPressedX >= var2 + 15 && MouseInput.mouseLastPressedX <= var2 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  class148.method3195(1, 1);
               } else {
                  var3 = class78.field1082 + 500;
                  if(MouseInput.mouseLastPressedX >= var3 && MouseInput.mouseLastPressedX <= var3 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                     class148.method3195(2, 0);
                  } else if(MouseInput.mouseLastPressedX >= var3 + 15 && MouseInput.mouseLastPressedX <= var3 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                     class148.method3195(2, 1);
                  } else {
                     var14 = class78.field1082 + 610;
                     if(MouseInput.mouseLastPressedX >= var14 && MouseInput.mouseLastPressedX <= var14 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                        class148.method3195(3, 0);
                     } else if(MouseInput.mouseLastPressedX >= var14 + 15 && MouseInput.mouseLastPressedX <= var14 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                        class148.method3195(3, 1);
                     } else if(MouseInput.mouseLastPressedX >= class78.field1082 + 708 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedX <= class78.field1082 + 708 + 50 && MouseInput.mouseLastPressedY <= 20) {
                        class78.worldSelectShown = false;
                        class78.field1092.method5849(class78.field1082, 0);
                        class78.field1087.method5849(class78.field1082 + 382, 0);
                        class78.logoSprite.method5829(class78.field1082 + 382 - class78.logoSprite.width / 2, 18);
                     } else if(class78.field1116 != -1) {
                        World var5 = World.worldList[class78.field1116];
                        OwnWorldComparator.changeWorld(var5);
                        class78.worldSelectShown = false;
                        class78.field1092.method5849(class78.field1082, 0);
                        class78.field1087.method5849(class78.field1082 + 382, 0);
                        class78.logoSprite.method5829(class78.field1082 + 382 - class78.logoSprite.width / 2, 18);
                     }
                  }
               }
            }
         }

      } else {
         if((MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= class78.field1082 + 765 - 50 && MouseInput.mouseLastPressedY >= 453) {
            class10.preferences.muted = !class10.preferences.muted;
            class54.method1018();
            if(!class10.preferences.muted) {
               class219.method4325(Item.indexTrack1, "scape main", "", 255, false);
            } else {
               class9.method88();
            }
         }

         if(Client.gameState != 5) {
            if(-1L == class78.field1109) {
               class78.field1109 = Buffer.method3547() + 1000L;
            }

            long var11 = Buffer.method3547();
            if(class10.method92() && class78.field1118 == -1L) {
               class78.field1118 = var11;
               if(class78.field1118 > class78.field1109) {
                  class78.field1109 = class78.field1118;
               }
            }

            ++class78.field1097;
            if(Client.gameState == 10 || Client.gameState == 11) {
               if(Client.languageId == 0) {
                  if(MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) {
                     var3 = class78.field1082 + 5;
                     short var4 = 463;
                     byte var13 = 100;
                     byte var6 = 35;
                     if(MouseInput.mouseLastPressedX >= var3 && MouseInput.mouseLastPressedX <= var3 + var13 && MouseInput.mouseLastPressedY >= var4 && MouseInput.mouseLastPressedY <= var4 + var6) {
                        class59.method1078();
                        return;
                     }
                  }

                  if(class49.listFetcher != null) {
                     class59.method1078();
                  }
               }

               var3 = MouseInput.mouseLastButton;
               var14 = MouseInput.mouseLastPressedX;
               int var21 = MouseInput.mouseLastPressedY;
               if(var3 == 0) {
                  var14 = MouseInput.mouseLastX;
                  var21 = MouseInput.mouseLastY * 673804999;
               }

               if(!InvType.middleMouseMovesCamera && var3 == 4) {
                  var3 = 1;
               }

               int var7;
               short var8;
               if(class78.loginIndex == 0) {
                  boolean var15 = false;

                  while(GrandExchangeEvents.method8()) {
                     if(GameSocket.currentPressedKey == 84) {
                        var15 = true;
                     }
                  }

                  var7 = class78.field1091 - 80;
                  var8 = 291;
                  if(var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                     HorizontalAlignment.method5156(class142.method3161("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var7 = class78.field1091 + 80;
                  if(var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20 || var15) {
                     if((Client.flags & 33554432) != 0) {
                        class78.Login_response0 = "";
                        class78.loginMessage1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class78.loginMessage2 = "Your normal account will not be affected.";
                        class78.loginMessage3 = "";
                        class78.loginIndex = 1;
                        class34.method586();
                     } else if((Client.flags & 4) != 0) {
                        if((Client.flags & 1024) != 0) {
                           class78.loginMessage1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class78.loginMessage2 = "Players can attack each other almost everywhere";
                           class78.loginMessage3 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class78.loginMessage1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class78.loginMessage2 = "Players can attack each other";
                           class78.loginMessage3 = "almost everywhere.";
                        }

                        class78.Login_response0 = "Warning!";
                        class78.loginIndex = 1;
                        class34.method586();
                     } else if((Client.flags & 1024) != 0) {
                        class78.loginMessage1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class78.loginMessage2 = "The Protect Item prayer will";
                        class78.loginMessage3 = "not work on this world.";
                        class78.Login_response0 = "Warning!";
                        class78.loginIndex = 1;
                        class34.method586();
                     } else {
                        ScriptEvent.method1030(false);
                     }
                  }
               } else {
                  int var16;
                  short var18;
                  if(class78.loginIndex != 1) {
                     short var17;
                     if(class78.loginIndex == 2) {
                        var17 = 201;
                        var16 = var17 + 52;
                        if(var3 == 1 && var21 >= var16 - 12 && var21 < var16 + 2) {
                           class78.currentLoginField = 0;
                        }

                        var16 += 15;
                        if(var3 == 1 && var21 >= var16 - 12 && var21 < var16 + 2) {
                           class78.currentLoginField = 1;
                        }

                        var16 += 15;
                        var17 = 361;
                        if(var3 == 1 && var21 >= var17 - 15 && var21 < var17) {
                           GrandExchangeEvent.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.loginIndex = 5;
                           return;
                        }

                        var7 = class78.field1091 - 80;
                        var8 = 321;
                        if(var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                           class78.username = class78.username.trim();
                           if(class78.username.length() == 0) {
                              GrandExchangeEvent.method22("", "Please enter your username/email address.", "");
                              return;
                           }

                           if(class78.password.length() == 0) {
                              GrandExchangeEvent.method22("", "Please enter your password.", "");
                              return;
                           }

                           GrandExchangeEvent.method22("", "Connecting to server...", "");
                           NetWriter.method2005(false);
                           MouseInput.setGameState(20);
                           return;
                        }

                        var7 = class78.loginWindowX + 180 + 80;
                        if(var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                           class78.loginIndex = 0;
                           class78.username = "";
                           class78.password = "";
                           WorldMapType3.field104 = 0;
                           MapIcon.field238 = "";
                           class78.field1104 = true;
                        }

                        var7 = class78.field1091 + -117;
                        var8 = 277;
                        class78.field1110 = var14 >= var7 && var14 < var7 + FriendManager.field978 && var21 >= var8 && var21 < var8 + Preferences.field966;
                        if(var3 == 1 && class78.field1110) {
                           class78.Login_isUsernameRemembered = !class78.Login_isUsernameRemembered;
                           if(!class78.Login_isUsernameRemembered && class10.preferences.rememberedUsername != null) {
                              class10.preferences.rememberedUsername = null;
                              class54.method1018();
                           }
                        }

                        var7 = class78.field1091 + 24;
                        var8 = 277;
                        class78.field1115 = var14 >= var7 && var14 < var7 + FriendManager.field978 && var21 >= var8 && var21 < var8 + Preferences.field966;
                        if(var3 == 1 && class78.field1115) {
                           class10.preferences.hideUsername = !class10.preferences.hideUsername;
                           if(!class10.preferences.hideUsername) {
                              class78.username = "";
                              class10.preferences.rememberedUsername = null;
                              class34.method586();
                           }

                           class54.method1018();
                        }

                        while(true) {
                           while(GrandExchangeEvents.method8()) {
                              boolean var9 = false;

                              for(int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var10) {
                                 if(KeyFocusListener.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var10)) {
                                    var9 = true;
                                    break;
                                 }
                              }

                              if(GameSocket.currentPressedKey == 13) {
                                 class78.loginIndex = 0;
                                 class78.username = "";
                                 class78.password = "";
                                 WorldMapType3.field104 = 0;
                                 MapIcon.field238 = "";
                                 class78.field1104 = true;
                              } else if(class78.currentLoginField == 0) {
                                 if(GameSocket.currentPressedKey == 85 && class78.username.length() > 0) {
                                    class78.username = class78.username.substring(0, class78.username.length() - 1);
                                 }

                                 if(GameSocket.currentPressedKey == 84 || GameSocket.currentPressedKey == 80) {
                                    class78.currentLoginField = 1;
                                 }

                                 if(var9 && class78.username.length() < 320) {
                                    class78.username = class78.username + KeyFocusListener.currentTypedKey;
                                 }
                              } else if(class78.currentLoginField == 1) {
                                 if(GameSocket.currentPressedKey == 85 && class78.password.length() > 0) {
                                    class78.password = class78.password.substring(0, class78.password.length() - 1);
                                 }

                                 if(GameSocket.currentPressedKey == 84 || GameSocket.currentPressedKey == 80) {
                                    class78.currentLoginField = 0;
                                 }

                                 if(GameSocket.currentPressedKey == 84) {
                                    class78.username = class78.username.trim();
                                    if(class78.username.length() == 0) {
                                       GrandExchangeEvent.method22("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if(class78.password.length() == 0) {
                                       GrandExchangeEvent.method22("", "Please enter your password.", "");
                                       return;
                                    }

                                    GrandExchangeEvent.method22("", "Connecting to server...", "");
                                    NetWriter.method2005(false);
                                    MouseInput.setGameState(20);
                                    return;
                                 }

                                 if(var9 && class78.password.length() < 20) {
                                    class78.password = class78.password + KeyFocusListener.currentTypedKey;
                                 }
                              }
                           }

                           return;
                        }
                     } else if(class78.loginIndex == 3) {
                        var16 = class78.loginWindowX + 180;
                        var18 = 276;
                        if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                           ScriptEvent.method1030(false);
                        }

                        var16 = class78.loginWindowX + 180;
                        var18 = 326;
                        if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                           GrandExchangeEvent.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.loginIndex = 5;
                           return;
                        }
                     } else {
                        boolean var19;
                        int var20;
                        if(class78.loginIndex == 4) {
                           var16 = class78.loginWindowX + 180 - 80;
                           var18 = 321;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              MapIcon.field238.trim();
                              if(MapIcon.field238.length() != 6) {
                                 GrandExchangeEvent.method22("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              WorldMapType3.field104 = Integer.parseInt(MapIcon.field238);
                              MapIcon.field238 = "";
                              NetWriter.method2005(true);
                              GrandExchangeEvent.method22("", "Connecting to server...", "");
                              MouseInput.setGameState(20);
                              return;
                           }

                           if(var3 == 1 && var14 >= class78.loginWindowX + 180 - 9 && var14 <= class78.loginWindowX + 180 + 130 && var21 >= 263 && var21 <= 296) {
                              class78.field1104 = !class78.field1104;
                           }

                           if(var3 == 1 && var14 >= class78.loginWindowX + 180 - 34 && var14 <= class78.loginWindowX + 34 + 180 && var21 >= 351 && var21 <= 363) {
                              HorizontalAlignment.method5156(class142.method3161("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var16 = class78.loginWindowX + 180 + 80;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              class78.loginIndex = 0;
                              class78.username = "";
                              class78.password = "";
                              WorldMapType3.field104 = 0;
                              MapIcon.field238 = "";
                           }

                           while(GrandExchangeEvents.method8()) {
                              var19 = false;

                              for(var20 = 0; var20 < "1234567890".length(); ++var20) {
                                 if(KeyFocusListener.currentTypedKey == "1234567890".charAt(var20)) {
                                    var19 = true;
                                    break;
                                 }
                              }

                              if(GameSocket.currentPressedKey == 13) {
                                 class78.loginIndex = 0;
                                 class78.username = "";
                                 class78.password = "";
                                 WorldMapType3.field104 = 0;
                                 MapIcon.field238 = "";
                              } else {
                                 if(GameSocket.currentPressedKey == 85 && MapIcon.field238.length() > 0) {
                                    MapIcon.field238 = MapIcon.field238.substring(0, MapIcon.field238.length() - 1);
                                 }

                                 if(GameSocket.currentPressedKey == 84) {
                                    MapIcon.field238.trim();
                                    if(MapIcon.field238.length() != 6) {
                                       GrandExchangeEvent.method22("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    WorldMapType3.field104 = Integer.parseInt(MapIcon.field238);
                                    MapIcon.field238 = "";
                                    NetWriter.method2005(true);
                                    GrandExchangeEvent.method22("", "Connecting to server...", "");
                                    MouseInput.setGameState(20);
                                    return;
                                 }

                                 if(var19 && MapIcon.field238.length() < 6) {
                                    MapIcon.field238 = MapIcon.field238 + KeyFocusListener.currentTypedKey;
                                 }
                              }
                           }
                        } else if(class78.loginIndex == 5) {
                           var16 = class78.loginWindowX + 180 - 80;
                           var18 = 321;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              class234.method4590();
                              return;
                           }

                           var16 = class78.loginWindowX + 180 + 80;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              ScriptEvent.method1030(true);
                           }

                           while(GrandExchangeEvents.method8()) {
                              var19 = false;

                              for(var20 = 0; var20 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var20) {
                                 if(KeyFocusListener.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var20)) {
                                    var19 = true;
                                    break;
                                 }
                              }

                              if(GameSocket.currentPressedKey == 13) {
                                 ScriptEvent.method1030(true);
                              } else {
                                 if(GameSocket.currentPressedKey == 85 && class78.username.length() > 0) {
                                    class78.username = class78.username.substring(0, class78.username.length() - 1);
                                 }

                                 if(GameSocket.currentPressedKey == 84) {
                                    class234.method4590();
                                    return;
                                 }

                                 if(var19 && class78.username.length() < 320) {
                                    class78.username = class78.username + KeyFocusListener.currentTypedKey;
                                 }
                              }
                           }
                        } else if(class78.loginIndex == 6) {
                           while(true) {
                              do {
                                 if(!GrandExchangeEvents.method8()) {
                                    var17 = 321;
                                    if(var3 == 1 && var21 >= var17 - 20 && var21 <= var17 + 20) {
                                       ScriptEvent.method1030(true);
                                    }

                                    return;
                                 }
                              } while(GameSocket.currentPressedKey != 84 && GameSocket.currentPressedKey != 13);

                              ScriptEvent.method1030(true);
                           }
                        } else if(class78.loginIndex == 7) {
                           var16 = class78.loginWindowX + 180 - 80;
                           var18 = 321;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              HorizontalAlignment.method5156(class142.method3161("secure", true) + "m=dob/set_dob.ws", true, false);
                              GrandExchangeEvent.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class78.loginIndex = 6;
                              return;
                           }

                           var16 = class78.loginWindowX + 180 + 80;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              ScriptEvent.method1030(true);
                           }
                        } else if(class78.loginIndex == 8) {
                           var16 = class78.loginWindowX + 180 - 80;
                           var18 = 321;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              HorizontalAlignment.method5156("https://www.jagex.com/terms/privacy/#eight", true, false);
                              GrandExchangeEvent.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class78.loginIndex = 6;
                              return;
                           }

                           var16 = class78.loginWindowX + 180 + 80;
                           if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              ScriptEvent.method1030(true);
                           }
                        }
                     }
                  } else {
                     while(GrandExchangeEvents.method8()) {
                        if(GameSocket.currentPressedKey == 84) {
                           ScriptEvent.method1030(false);
                        } else if(GameSocket.currentPressedKey == 13) {
                           class78.loginIndex = 0;
                        }
                     }

                     var16 = class78.field1091 - 80;
                     var18 = 321;
                     if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                        ScriptEvent.method1030(false);
                     }

                     var16 = class78.field1091 + 80;
                     if(var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                        class78.loginIndex = 0;
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1067447403"
   )
   @Export("getSmoothNoise2D")
   static final int getSmoothNoise2D(int var0, int var1) {
      int var2 = FileOnDisk.method2511(var0 - 1, var1 - 1) + FileOnDisk.method2511(1 + var0, var1 - 1) + FileOnDisk.method2511(var0 - 1, var1 + 1) + FileOnDisk.method2511(1 + var0, 1 + var1);
      int var3 = FileOnDisk.method2511(var0 - 1, var1) + FileOnDisk.method2511(1 + var0, var1) + FileOnDisk.method2511(var0, var1 - 1) + FileOnDisk.method2511(var0, 1 + var1);
      int var4 = FileOnDisk.method2511(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
