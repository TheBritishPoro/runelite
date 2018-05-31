import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class216 {
   @ObfuscatedName("z")
   byte[] field2447;
   @ObfuscatedName("w")
   byte[] field2449;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2049158647
   )
   int field2448;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1438007951
   )
   int field2450;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2031677397
   )
   int field2446;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1415705735
   )
   int field2451;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1604102077
   )
   int field2453;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -560836309
   )
   int field2452;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 341977341
   )
   int field2454;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgi;IB)V",
      garbageValue = "1"
   )
   static final void method4179(PacketBuffer var0, int var1) {
      int var2 = var0.offset;
      class81.field1165 = 0;
      class177.method3512(var0);

      for(int var3 = 0; var3 < class81.field1165; ++var3) {
         int var4 = class81.field1166[var3];
         Player var5 = Client.cachedPlayers[var4];
         int var6 = var0.readUnsignedByte();
         if((var6 & 128) != 0) {
            var6 += var0.readUnsignedByte() << 8;
         }

         byte var7 = -1;
         if((var6 & 512) != 0) {
            var7 = var0.method3610();
         }

         if((var6 & 8) != 0) {
            var5.overhead = var0.readString();
            if(var5.overhead.charAt(0) == '~') {
               var5.overhead = var5.overhead.substring(1);
               class143.sendGameMessage(2, var5.name.getName(), var5.overhead);
            } else if(var5 == class138.localPlayer) {
               class143.sendGameMessage(2, var5.name.getName(), var5.overhead);
            }

            var5.field885 = false;
            var5.field888 = 0;
            var5.field927 = 0;
            var5.overheadTextCyclesRemaining = 150;
         }

         int var8;
         if((var6 & 2048) != 0) {
            var5.graphic = var0.method3646();
            var8 = var0.method3595();
            var5.field871 = var8 >> 16;
            var5.graphicsDelay = (var8 & 65535) + Client.gameCycle;
            var5.spotAnimFrame = 0;
            var5.spotAnimFrameCycle = 0;
            if(var5.graphicsDelay > Client.gameCycle) {
               var5.spotAnimFrame = -1;
            }

            if(var5.graphic == 65535) {
               var5.graphic = -1;
            }
         }

         if((var6 & 1024) != 0) {
            for(var8 = 0; var8 < 3; ++var8) {
               var5.actions[var8] = var0.readString();
            }
         }

         int var9;
         if((var6 & 32) != 0) {
            var8 = var0.method3646();
            if(var8 == 65535) {
               var8 = -1;
            }

            var9 = var0.method3577();
            GameObject.method3102(var5, var8, var9);
         }

         int var11;
         int var12;
         if((var6 & 64) != 0) {
            var8 = var0.method3585();
            Permission var21 = (Permission)class76.forOrdinal(WorldMapData.method216(), var0.method3577());
            boolean var10 = var0.readUnsignedShortOb1() == 1;
            var11 = var0.readUnsignedByte();
            var12 = var0.offset;
            if(var5.name != null && var5.composition != null) {
               boolean var13 = false;
               if(var21.field3127 && DState.friendManager.isIgnored(var5.name)) {
                  var13 = true;
               }

               if(!var13 && Client.myPlayerIndex == 0 && !var5.hidden) {
                  class81.field1154.offset = 0;
                  var0.readBytes(class81.field1154.payload, 0, var11);
                  class81.field1154.offset = 0;
                  Buffer var15 = class81.field1154;

                  String var16;
                  int var17;
                  String var19;
                  try {
                     var17 = var15.getUSmart();
                     if(var17 > 32767) {
                        var17 = 32767;
                     }

                     byte[] var18 = new byte[var17];
                     var15.offset += class300.huffman.decompress(var15.payload, var15.offset, var18, 0, var17);
                     var19 = class78.getString(var18, 0, var17);
                     var16 = var19;
                  } catch (Exception var27) {
                     var16 = "Cabbage";
                  }

                  var16 = FontTypeFace.appendTags(ScriptState.method998(var16));
                  var5.overhead = var16.trim();
                  var5.field888 = var8 >> 8;
                  var5.field927 = var8 & 255;
                  var5.overheadTextCyclesRemaining = 150;
                  var5.field885 = var10;
                  var5.field886 = var5 != class138.localPlayer && var21.field3127 && "" != Client.field796 && var16.toLowerCase().indexOf(Client.field796) == -1;
                  if(var21.field3126) {
                     var17 = var10?91:1;
                  } else {
                     var17 = var10?90:2;
                  }

                  if(var21.field3128 != -1) {
                     int var20 = var21.field3128;
                     var19 = "<img=" + var20 + ">";
                     class143.sendGameMessage(var17, var19 + var5.name.getName(), var16);
                  } else {
                     class143.sendGameMessage(var17, var5.name.getName(), var16);
                  }
               }
            }

            var0.offset = var11 + var12;
         }

         if((var6 & 4096) != 0) {
            class81.field1153[var4] = var0.method3610();
         }

         if((var6 & 1) != 0) {
            var8 = var0.method3577();
            int var24;
            int var28;
            int var30;
            if(var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var11 = -1;
                  var12 = -1;
                  var30 = -1;
                  var28 = var0.getUSmart();
                  if(var28 == 32767) {
                     var28 = var0.getUSmart();
                     var12 = var0.getUSmart();
                     var11 = var0.getUSmart();
                     var30 = var0.getUSmart();
                  } else if(var28 != 32766) {
                     var12 = var0.getUSmart();
                  } else {
                     var28 = -1;
                  }

                  var24 = var0.getUSmart();
                  var5.applyActorHitsplat(var28, var12, var11, var30, Client.gameCycle, var24);
               }
            }

            var9 = var0.readUnsignedByte();
            if(var9 > 0) {
               for(var28 = 0; var28 < var9; ++var28) {
                  var11 = var0.getUSmart();
                  var12 = var0.getUSmart();
                  if(var12 != 32767) {
                     var30 = var0.getUSmart();
                     var24 = var0.method3577();
                     int var25 = var12 > 0?var0.readUnsignedShortOb1():var24;
                     var5.setCombatInfo(var11, Client.gameCycle, var12, var30, var24, var25);
                  } else {
                     var5.method1557(var11);
                  }
               }
            }
         }

         if((var6 & 256) != 0) {
            var5.field913 = var0.method3660();
            var5.field915 = var0.method3610();
            var5.field916 = var0.method3660();
            var5.field929 = var0.method3610();
            var5.field917 = var0.readUnsignedShort() + Client.gameCycle;
            var5.field918 = var0.method3646() + Client.gameCycle;
            var5.field919 = var0.method3646();
            if(var5.field571) {
               var5.field913 += var5.field572;
               var5.field915 += var5.field573;
               var5.field916 += var5.field572;
               var5.field929 += var5.field573;
               var5.queueSize = 0;
            } else {
               var5.field913 += var5.pathX[0];
               var5.field915 += var5.pathY[0];
               var5.field916 += var5.pathX[0];
               var5.field929 += var5.pathY[0];
               var5.queueSize = 1;
            }

            var5.field930 = 0;
         }

         if((var6 & 16) != 0) {
            var5.interacting = var0.method3585();
            if(var5.interacting == 65535) {
               var5.interacting = -1;
            }
         }

         if((var6 & 4) != 0) {
            var8 = var0.method3577();
            byte[] var31 = new byte[var8];
            Buffer var26 = new Buffer(var31);
            var0.readBytes(var31, 0, var8);
            class81.field1157[var4] = var26;
            var5.decodeApperance(var26);
         }

         if((var6 & 2) != 0) {
            var5.field920 = var0.readUnsignedShort();
            if(var5.queueSize == 0) {
               var5.orientation = var5.field920;
               var5.field920 = -1;
            }
         }

         if(var5.field571) {
            if(var7 == 127) {
               var5.method1103(var5.field572, var5.field573);
            } else {
               byte var29;
               if(var7 != -1) {
                  var29 = var7;
               } else {
                  var29 = class81.field1153[var4];
               }

               var5.method1106(var5.field572, var5.field573, var29);
            }
         }
      }

      if(var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1403972661"
   )
   static final void method4178(int var0) {
      if(CombatInfo2.loadWidget(var0)) {
         Widget[] var1 = GameCanvas.widgets[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if(var3 != null) {
               var3.field2728 = 0;
               var3.field2613 = 0;
            }
         }

      }
   }
}
