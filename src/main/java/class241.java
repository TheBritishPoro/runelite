import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class241 {
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("headIconsPk")
   static SpritePixels[] headIconsPk;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)[Lig;",
      garbageValue = "606896129"
   )
   public static Permission[] method4552() {
      return new Permission[]{Permission.field3332, Permission.field3340, Permission.field3334, Permission.field3336, Permission.field3335, Permission.field3337};
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILct;ZI)I",
      garbageValue = "-1366403166"
   )
   static int method4553(int var0, Script var1, boolean var2) {
      if(var0 == 5000) {
         class81.intStack[++class81.intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else {
         int var4;
         PacketNode var5;
         if(var0 == 5001) {
            class81.intStackSize -= 3;
            Client.publicChatMode = class81.intStack[class81.intStackSize];
            var4 = class81.intStack[class81.intStackSize + 1];
            class320[] var30 = new class320[]{class320.field3926, class320.field3928, class320.field3924};
            class320[] var32 = var30;
            int var34 = 0;

            class320 var36;
            while(true) {
               if(var34 >= var32.length) {
                  var36 = null;
                  break;
               }

               class320 var33 = var32[var34];
               if(var4 == var33.field3927) {
                  var36 = var33;
                  break;
               }

               ++var34;
            }

            BoundingBox.field250 = var36;
            if(BoundingBox.field250 == null) {
               BoundingBox.field250 = class320.field3928;
            }

            Client.field1065 = class81.intStack[class81.intStackSize + 2];
            var5 = WorldMapDecoration.method285(ClientPacket.field2464, Client.field899.field1470);
            var5.packetBuffer.putByte(Client.publicChatMode);
            var5.packetBuffer.putByte(BoundingBox.field250.field3927);
            var5.packetBuffer.putByte(Client.field1065);
            Client.field899.method2082(var5);
            return 1;
         } else {
            String var3;
            int var17;
            if(var0 == 5002) {
               var3 = class81.scriptStringStack[--UrlRequester.scriptStringStackSize];
               class81.intStackSize -= 2;
               var4 = class81.intStack[class81.intStackSize];
               var17 = class81.intStack[class81.intStackSize + 1];
               PacketNode var31 = WorldMapDecoration.method285(ClientPacket.field2472, Client.field899.field1470);
               var31.packetBuffer.putByte(class29.getLength(var3) + 2);
               var31.packetBuffer.putString(var3);
               var31.packetBuffer.putByte(var4 - 1);
               var31.packetBuffer.putByte(var17);
               Client.field899.method2082(var31);
               return 1;
            } else {
               int var18;
               if(var0 == 5003) {
                  class81.intStackSize -= 2;
                  var18 = class81.intStack[class81.intStackSize];
                  var4 = class81.intStack[class81.intStackSize + 1];
                  ChatLineBuffer var6 = (ChatLineBuffer)class95.chatLineMap.get(Integer.valueOf(var18));
                  MessageNode var29 = var6.getMessage(var4);
                  if(var29 != null) {
                     class81.intStack[++class81.intStackSize - 1] = var29.id;
                     class81.intStack[++class81.intStackSize - 1] = var29.tick;
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var29.name != null?var29.name:"";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var29.sender != null?var29.sender:"";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var29.value != null?var29.value:"";
                     class81.intStack[++class81.intStackSize - 1] = var29.method1104()?1:(var29.method1127()?2:0);
                  } else {
                     class81.intStack[++class81.intStackSize - 1] = -1;
                     class81.intStack[++class81.intStackSize - 1] = 0;
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.intStack[++class81.intStackSize - 1] = 0;
                  }

                  return 1;
               } else if(var0 == 5004) {
                  var18 = class81.intStack[--class81.intStackSize];
                  MessageNode var39 = (MessageNode)class95.messages.get((long)var18);
                  if(var39 != null) {
                     class81.intStack[++class81.intStackSize - 1] = var39.type;
                     class81.intStack[++class81.intStackSize - 1] = var39.tick;
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var39.name != null?var39.name:"";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var39.sender != null?var39.sender:"";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var39.value != null?var39.value:"";
                     class81.intStack[++class81.intStackSize - 1] = var39.method1104()?1:(var39.method1127()?2:0);
                  } else {
                     class81.intStack[++class81.intStackSize - 1] = -1;
                     class81.intStack[++class81.intStackSize - 1] = 0;
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = "";
                     class81.intStack[++class81.intStackSize - 1] = 0;
                  }

                  return 1;
               } else if(var0 == 5005) {
                  if(BoundingBox.field250 == null) {
                     class81.intStack[++class81.intStackSize - 1] = -1;
                  } else {
                     class81.intStack[++class81.intStackSize - 1] = BoundingBox.field250.field3927;
                  }

                  return 1;
               } else if(var0 == 5008) {
                  var3 = class81.scriptStringStack[--UrlRequester.scriptStringStackSize];
                  var4 = class81.intStack[--class81.intStackSize];
                  String var28 = var3.toLowerCase();
                  byte var40 = 0;
                  if(var28.startsWith("yellow:")) {
                     var40 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if(var28.startsWith("red:")) {
                     var40 = 1;
                     var3 = var3.substring("red:".length());
                  } else if(var28.startsWith("green:")) {
                     var40 = 2;
                     var3 = var3.substring("green:".length());
                  } else if(var28.startsWith("cyan:")) {
                     var40 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if(var28.startsWith("purple:")) {
                     var40 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if(var28.startsWith("white:")) {
                     var40 = 5;
                     var3 = var3.substring("white:".length());
                  } else if(var28.startsWith("flash1:")) {
                     var40 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if(var28.startsWith("flash2:")) {
                     var40 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if(var28.startsWith("flash3:")) {
                     var40 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if(var28.startsWith("glow1:")) {
                     var40 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if(var28.startsWith("glow2:")) {
                     var40 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if(var28.startsWith("glow3:")) {
                     var40 = 11;
                     var3 = var3.substring("glow3:".length());
                  } else if(Client.languageId != 0) {
                     if(var28.startsWith("yellow:")) {
                        var40 = 0;
                        var3 = var3.substring("yellow:".length());
                     } else if(var28.startsWith("red:")) {
                        var40 = 1;
                        var3 = var3.substring("red:".length());
                     } else if(var28.startsWith("green:")) {
                        var40 = 2;
                        var3 = var3.substring("green:".length());
                     } else if(var28.startsWith("cyan:")) {
                        var40 = 3;
                        var3 = var3.substring("cyan:".length());
                     } else if(var28.startsWith("purple:")) {
                        var40 = 4;
                        var3 = var3.substring("purple:".length());
                     } else if(var28.startsWith("white:")) {
                        var40 = 5;
                        var3 = var3.substring("white:".length());
                     } else if(var28.startsWith("flash1:")) {
                        var40 = 6;
                        var3 = var3.substring("flash1:".length());
                     } else if(var28.startsWith("flash2:")) {
                        var40 = 7;
                        var3 = var3.substring("flash2:".length());
                     } else if(var28.startsWith("flash3:")) {
                        var40 = 8;
                        var3 = var3.substring("flash3:".length());
                     } else if(var28.startsWith("glow1:")) {
                        var40 = 9;
                        var3 = var3.substring("glow1:".length());
                     } else if(var28.startsWith("glow2:")) {
                        var40 = 10;
                        var3 = var3.substring("glow2:".length());
                     } else if(var28.startsWith("glow3:")) {
                        var40 = 11;
                        var3 = var3.substring("glow3:".length());
                     }
                  }

                  var28 = var3.toLowerCase();
                  byte var7 = 0;
                  if(var28.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if(var28.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if(var28.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if(var28.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if(var28.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  } else if(Client.languageId != 0) {
                     if(var28.startsWith("wave:")) {
                        var7 = 1;
                        var3 = var3.substring("wave:".length());
                     } else if(var28.startsWith("wave2:")) {
                        var7 = 2;
                        var3 = var3.substring("wave2:".length());
                     } else if(var28.startsWith("shake:")) {
                        var7 = 3;
                        var3 = var3.substring("shake:".length());
                     } else if(var28.startsWith("scroll:")) {
                        var7 = 4;
                        var3 = var3.substring("scroll:".length());
                     } else if(var28.startsWith("slide:")) {
                        var7 = 5;
                        var3 = var3.substring("slide:".length());
                     }
                  }

                  PacketNode var8 = WorldMapDecoration.method285(ClientPacket.field2426, Client.field899.field1470);
                  var8.packetBuffer.putByte(0);
                  int var9 = var8.packetBuffer.offset;
                  var8.packetBuffer.putByte(var4);
                  var8.packetBuffer.putByte(var40);
                  var8.packetBuffer.putByte(var7);
                  PacketBuffer var10 = var8.packetBuffer;
                  int var11 = var10.offset;
                  int var35 = var3.length();
                  byte[] var14 = new byte[var35];

                  for(int var15 = 0; var15 < var35; ++var15) {
                     char var16 = var3.charAt(var15);
                     if(var16 > 0 && var16 < 128 || var16 >= 160 && var16 <= 255) {
                        var14[var15] = (byte)var16;
                     } else if(var16 == 8364) {
                        var14[var15] = -128;
                     } else if(var16 == 8218) {
                        var14[var15] = -126;
                     } else if(var16 == 402) {
                        var14[var15] = -125;
                     } else if(var16 == 8222) {
                        var14[var15] = -124;
                     } else if(var16 == 8230) {
                        var14[var15] = -123;
                     } else if(var16 == 8224) {
                        var14[var15] = -122;
                     } else if(var16 == 8225) {
                        var14[var15] = -121;
                     } else if(var16 == 710) {
                        var14[var15] = -120;
                     } else if(var16 == 8240) {
                        var14[var15] = -119;
                     } else if(var16 == 352) {
                        var14[var15] = -118;
                     } else if(var16 == 8249) {
                        var14[var15] = -117;
                     } else if(var16 == 338) {
                        var14[var15] = -116;
                     } else if(var16 == 381) {
                        var14[var15] = -114;
                     } else if(var16 == 8216) {
                        var14[var15] = -111;
                     } else if(var16 == 8217) {
                        var14[var15] = -110;
                     } else if(var16 == 8220) {
                        var14[var15] = -109;
                     } else if(var16 == 8221) {
                        var14[var15] = -108;
                     } else if(var16 == 8226) {
                        var14[var15] = -107;
                     } else if(var16 == 8211) {
                        var14[var15] = -106;
                     } else if(var16 == 8212) {
                        var14[var15] = -105;
                     } else if(var16 == 732) {
                        var14[var15] = -104;
                     } else if(var16 == 8482) {
                        var14[var15] = -103;
                     } else if(var16 == 353) {
                        var14[var15] = -102;
                     } else if(var16 == 8250) {
                        var14[var15] = -101;
                     } else if(var16 == 339) {
                        var14[var15] = -100;
                     } else if(var16 == 382) {
                        var14[var15] = -98;
                     } else if(var16 == 376) {
                        var14[var15] = -97;
                     } else {
                        var14[var15] = 63;
                     }
                  }

                  var10.putShortSmart(var14.length);
                  var10.offset += class313.huffman.compress(var14, 0, var14.length, var10.payload, var10.offset);
                  var8.packetBuffer.method3578(var8.packetBuffer.offset - var9);
                  Client.field899.method2082(var8);
                  return 1;
               } else {
                  int var20;
                  if(var0 == 5009) {
                     UrlRequester.scriptStringStackSize -= 2;
                     var3 = class81.scriptStringStack[UrlRequester.scriptStringStackSize];
                     String var38 = class81.scriptStringStack[UrlRequester.scriptStringStackSize + 1];
                     var5 = WorldMapDecoration.method285(ClientPacket.field2407, Client.field899.field1470);
                     var5.packetBuffer.putShort(0);
                     var20 = var5.packetBuffer.offset;
                     var5.packetBuffer.putString(var3);
                     PacketBuffer var41 = var5.packetBuffer;
                     int var22 = var41.offset;
                     int var23 = var38.length();
                     byte[] var24 = new byte[var23];

                     for(int var12 = 0; var12 < var23; ++var12) {
                        char var13 = var38.charAt(var12);
                        if((var13 <= 0 || var13 >= 128) && (var13 < 160 || var13 > 255)) {
                           if(var13 == 8364) {
                              var24[var12] = -128;
                           } else if(var13 == 8218) {
                              var24[var12] = -126;
                           } else if(var13 == 402) {
                              var24[var12] = -125;
                           } else if(var13 == 8222) {
                              var24[var12] = -124;
                           } else if(var13 == 8230) {
                              var24[var12] = -123;
                           } else if(var13 == 8224) {
                              var24[var12] = -122;
                           } else if(var13 == 8225) {
                              var24[var12] = -121;
                           } else if(var13 == 710) {
                              var24[var12] = -120;
                           } else if(var13 == 8240) {
                              var24[var12] = -119;
                           } else if(var13 == 352) {
                              var24[var12] = -118;
                           } else if(var13 == 8249) {
                              var24[var12] = -117;
                           } else if(var13 == 338) {
                              var24[var12] = -116;
                           } else if(var13 == 381) {
                              var24[var12] = -114;
                           } else if(var13 == 8216) {
                              var24[var12] = -111;
                           } else if(var13 == 8217) {
                              var24[var12] = -110;
                           } else if(var13 == 8220) {
                              var24[var12] = -109;
                           } else if(var13 == 8221) {
                              var24[var12] = -108;
                           } else if(var13 == 8226) {
                              var24[var12] = -107;
                           } else if(var13 == 8211) {
                              var24[var12] = -106;
                           } else if(var13 == 8212) {
                              var24[var12] = -105;
                           } else if(var13 == 732) {
                              var24[var12] = -104;
                           } else if(var13 == 8482) {
                              var24[var12] = -103;
                           } else if(var13 == 353) {
                              var24[var12] = -102;
                           } else if(var13 == 8250) {
                              var24[var12] = -101;
                           } else if(var13 == 339) {
                              var24[var12] = -100;
                           } else if(var13 == 382) {
                              var24[var12] = -98;
                           } else if(var13 == 376) {
                              var24[var12] = -97;
                           } else {
                              var24[var12] = 63;
                           }
                        } else {
                           var24[var12] = (byte)var13;
                        }
                     }

                     var41.putShortSmart(var24.length);
                     var41.offset += class313.huffman.compress(var24, 0, var24.length, var41.payload, var41.offset);
                     var5.packetBuffer.method3593(var5.packetBuffer.offset - var20);
                     Client.field899.method2082(var5);
                     return 1;
                  } else if(var0 != 5015) {
                     if(var0 == 5016) {
                        class81.intStack[++class81.intStackSize - 1] = Client.field1065;
                        return 1;
                     } else if(var0 == 5017) {
                        var18 = class81.intStack[--class81.intStackSize];
                        int[] var37 = class81.intStack;
                        var17 = ++class81.intStackSize - 1;
                        ChatLineBuffer var21 = (ChatLineBuffer)class95.chatLineMap.get(Integer.valueOf(var18));
                        if(var21 == null) {
                           var20 = 0;
                        } else {
                           var20 = var21.size();
                        }

                        var37[var17] = var20;
                        return 1;
                     } else if(var0 == 5018) {
                        var18 = class81.intStack[--class81.intStackSize];
                        class81.intStack[++class81.intStackSize - 1] = Client.method1282(var18);
                        return 1;
                     } else if(var0 == 5019) {
                        var18 = class81.intStack[--class81.intStackSize];
                        class81.intStack[++class81.intStackSize - 1] = GraphicsObject.method1841(var18);
                        return 1;
                     } else if(var0 == 5020) {
                        var3 = class81.scriptStringStack[--UrlRequester.scriptStringStackSize];
                        if(var3.equalsIgnoreCase("toggleroof")) {
                           class55.preferences.hideRoofs = !class55.preferences.hideRoofs;
                           MessageNode.method1130();
                           if(class55.preferences.hideRoofs) {
                              class19.sendGameMessage(99, "", "Roofs are now all hidden");
                           } else {
                              class19.sendGameMessage(99, "", "Roofs will only be removed selectively");
                           }
                        }

                        if(var3.equalsIgnoreCase("displayfps")) {
                           Client.displayFps = !Client.displayFps;
                        }

                        if(var3.equalsIgnoreCase("renderself")) {
                           Client.field969 = !Client.field969;
                        }

                        if(var3.equalsIgnoreCase("mouseovertext")) {
                           Client.field1049 = !Client.field1049;
                        }

                        if(Client.rights >= 2) {
                           if(var3.equalsIgnoreCase("aabb")) {
                              if(!class7.drawBoundingBoxes3D) {
                                 class7.drawBoundingBoxes3D = true;
                                 class7.boundingBox3DDrawMode = BoundingBox3DDrawMode.ALWAYS;
                              } else if(BoundingBox3DDrawMode.ALWAYS == class7.boundingBox3DDrawMode) {
                                 class7.drawBoundingBoxes3D = true;
                                 class7.boundingBox3DDrawMode = BoundingBox3DDrawMode.ON_MOUSEOVER;
                              } else {
                                 class7.drawBoundingBoxes3D = false;
                              }
                           }

                           if(var3.equalsIgnoreCase("showcoord")) {
                              class248.renderOverview.field4056 = !class248.renderOverview.field4056;
                           }

                           if(var3.equalsIgnoreCase("fpson")) {
                              Client.displayFps = true;
                           }

                           if(var3.equalsIgnoreCase("fpsoff")) {
                              Client.displayFps = false;
                           }

                           if(var3.equalsIgnoreCase("gc")) {
                              System.gc();
                           }

                           if(var3.equalsIgnoreCase("clientdrop")) {
                              SoundTaskDataProvider.method781();
                           }

                           if(var3.equalsIgnoreCase("cs")) {
                              class19.sendGameMessage(99, "", "" + Client.field902);
                           }

                           if(var3.equalsIgnoreCase("errortest") && Client.socketType == 2) {
                              throw new RuntimeException();
                           }
                        }

                        PacketNode var19 = WorldMapDecoration.method285(ClientPacket.field2468, Client.field899.field1470);
                        var19.packetBuffer.putByte(var3.length() + 1);
                        var19.packetBuffer.putString(var3);
                        Client.field899.method2082(var19);
                        return 1;
                     } else if(var0 == 5021) {
                        Client.field1066 = class81.scriptStringStack[--UrlRequester.scriptStringStackSize].toLowerCase().trim();
                        return 1;
                     } else if(var0 == 5022) {
                        class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = Client.field1066;
                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if(TotalQuantityComparator.localPlayer != null && TotalQuantityComparator.localPlayer.name != null) {
                        var3 = TotalQuantityComparator.localPlayer.name.getName();
                     } else {
                        var3 = "";
                     }

                     class81.scriptStringStack[++UrlRequester.scriptStringStackSize - 1] = var3;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
