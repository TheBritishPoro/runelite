import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -2072010263
   )
   int field1238;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1856187045
   )
   @Export("y")
   int y;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -666670005
   )
   @Export("angle")
   int angle;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -638238631
   )
   int field1241;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -80725351
   )
   int field1242;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -176282729
   )
   @Export("idlePoseAnimation")
   int idlePoseAnimation;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -204316763
   )
   int field1244;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -867200963
   )
   int field1245;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -282750585
   )
   int field1246;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 803867111
   )
   int field1247;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -2138404195
   )
   @Export("graphic")
   int graphic;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -60142075
   )
   int field1249;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 139265687
   )
   int field1250;
   @ObfuscatedName("at")
   @Export("overhead")
   String overhead;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -503912733
   )
   int field1252;
   @ObfuscatedName("aa")
   @Export("inSequence")
   boolean inSequence;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -84971179
   )
   int field1254;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1478567939
   )
   int field1255;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -612552921
   )
   int field1256;
   @ObfuscatedName("ae")
   byte field1257;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1057033013
   )
   @Export("animation")
   @Hook("animationChanged")
   int animation;
   @ObfuscatedName("ap")
   @Export("hitsplatTypes")
   int[] hitsplatTypes;
   @ObfuscatedName("af")
   @Export("hitsplatCycles")
   int[] hitsplatCycles;
   @ObfuscatedName("aj")
   int[] field1261;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1261949565
   )
   int field1262;
   @ObfuscatedName("bc")
   @Export("combatInfoList")
   CombatInfoList combatInfoList;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 394170063
   )
   int field1264;
   @ObfuscatedName("bv")
   boolean field1265;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 670042515
   )
   int field1266;
   @ObfuscatedName("an")
   boolean field1267;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -1127349339
   )
   @Export("poseAnimation")
   int poseAnimation;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1885652829
   )
   int field1269;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -2069334963
   )
   int field1270;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1844066105
   )
   @Export("actionFrame")
   int actionFrame;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 2013567793
   )
   @Export("x")
   int x;
   @ObfuscatedName("bb")
   int[] field1273;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 858192367
   )
   int field1274;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1560272857
   )
   int field1275;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1234792359
   )
   @Export("interacting")
   int interacting;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1018192717
   )
   int field1277;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1153149757
   )
   @Export("graphicsDelay")
   int graphicsDelay;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 63376315
   )
   @Export("poseFrame")
   int poseFrame;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -2029145169
   )
   int field1280;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 898574025
   )
   @Export("actionAnimationDisable")
   int actionAnimationDisable;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -599797045
   )
   int field1282;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1566687343
   )
   int field1283;
   @ObfuscatedName("av")
   boolean field1284;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 62294433
   )
   int field1285;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1215104589
   )
   int field1286;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -871603589
   )
   int field1287;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 1036706383
   )
   int field1288;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 1567995467
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 871249179
   )
   int field1290;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -1578032921
   )
   int field1291;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -334899099
   )
   @Export("queueSize")
   int queueSize;
   @ObfuscatedName("ck")
   @Export("pathX")
   int[] pathX;
   @ObfuscatedName("ag")
   int[] field1294;
   @ObfuscatedName("ch")
   @Export("pathY")
   int[] pathY;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 969772235
   )
   int field1296;
   @ObfuscatedName("cn")
   byte[] field1297;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1542087379"
   )
   final void method1534() {
      this.queueSize = 0;
      this.field1269 = 0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2061214073"
   )
   @Export("hasConfig")
   boolean hasConfig() {
      return false;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "-101"
   )
   final void method1536(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.hitsplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class254 var12 = class164.method3059(var1);
         var10 = var12.field3437;
         var11 = var12.field3428;
      }

      int var14;
      if(var8) {
         if(var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.hitsplatCycles[0];
         } else if(var10 == 1) {
            var14 = this.hitsplatTypes[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(var10 == 0) {
               if(this.hitsplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitsplatCycles[var13];
               }
            } else if(var10 == 1 && this.hitsplatTypes[var13] < var14) {
               var9 = var13;
               var14 = this.hitsplatTypes[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if(var7) {
            this.field1257 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field1257;
            this.field1257 = (byte)((this.field1257 + 1) % 4);
            if(this.hitsplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 >= 0) {
         this.field1294[var9] = var1;
         this.hitsplatTypes[var9] = var2;
         this.field1261[var9] = var3;
         this.field1273[var9] = var4;
         this.hitsplatCycles[var9] = var11 + var5 + var6;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "0"
   )
   final void method1537(int var1, int var2, int var3, int var4, int var5, int var6) {
      CombatInfo2 var7 = (CombatInfo2)CombatInfo2.field3375.get((long)var1);
      CombatInfo2 var8;
      if(var7 != null) {
         var8 = var7;
      } else {
         byte[] var9 = CombatInfo2.field3380.getConfigData(33, var1);
         var7 = new CombatInfo2();
         if(var9 != null) {
            var7.method4418(new Buffer(var9));
         }

         CombatInfo2.field3375.put(var7, (long)var1);
         var8 = var7;
      }

      var7 = var8;
      CombatInfoListHolder var14 = null;
      CombatInfoListHolder var10 = null;
      int var11 = var8.field3379;
      int var12 = 0;

      CombatInfoListHolder var13;
      for(var13 = (CombatInfoListHolder)this.combatInfoList.method3547(); var13 != null; var13 = (CombatInfoListHolder)this.combatInfoList.method3558()) {
         ++var12;
         if(var13.combatInfo2.field3376 == var7.field3376) {
            var13.method1685(var2 + var4, var5, var6, var3);
            return;
         }

         if(var13.combatInfo2.field3372 <= var7.field3372) {
            var14 = var13;
         }

         if(var13.combatInfo2.field3379 > var11) {
            var10 = var13;
            var11 = var13.combatInfo2.field3379;
         }
      }

      if(var10 != null || var12 < 4) {
         var13 = new CombatInfoListHolder(var7);
         if(var14 == null) {
            this.combatInfoList.method3544(var13);
         } else {
            CombatInfoList.method3545(var13, var14);
         }

         var13.method1685(var2 + var4, var5, var6, var3);
         if(var12 >= 4) {
            var10.unlink();
         }
      }

   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "775571505"
   )
   static final void method1548() {
      Client.secretPacketBuffer1.putOpcode(73);
      Client.secretPacketBuffer1.putByte(0);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-20"
   )
   final void method1550(int var1) {
      CombatInfo2 var2 = (CombatInfo2)CombatInfo2.field3375.get((long)var1);
      CombatInfo2 var3;
      if(var2 != null) {
         var3 = var2;
      } else {
         byte[] var4 = CombatInfo2.field3380.getConfigData(33, var1);
         var2 = new CombatInfo2();
         if(var4 != null) {
            var2.method4418(new Buffer(var4));
         }

         CombatInfo2.field3375.put(var2, (long)var1);
         var3 = var2;
      }

      var2 = var3;

      for(CombatInfoListHolder var5 = (CombatInfoListHolder)this.combatInfoList.method3547(); var5 != null; var5 = (CombatInfoListHolder)this.combatInfoList.method3558()) {
         if(var5.combatInfo2 == var2) {
            var5.unlink();
            return;
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)LWorld;",
      garbageValue = "-6"
   )
   static World method1556() {
      return World.field1310 < World.worldCount?World.worldList[++World.field1310 - 1]:null;
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   static final void method1557() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if(Client.packetType == 44) {
         var0 = Client.secretPacketBuffer2.readUnsignedByte();
         var1 = (var0 >> 4 & 7) + Player.field900;
         var2 = (var0 & 7) + class29.field428;
         var3 = Client.secretPacketBuffer2.method3292();
         var4 = var3 >> 2;
         var5 = var3 & 3;
         var6 = Client.field989[var4];
         var7 = Client.secretPacketBuffer2.readByteOb1();
         if(var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
            if(var6 == 0) {
               WallObject var9 = class2.region.method2688(WallObject.plane, var1, var2);
               if(var9 != null) {
                  var8 = var9.hash >> 14 & 32767;
                  if(var4 == 2) {
                     var9.renderable1 = new DynamicObject(var8, 2, var5 + 4, WallObject.plane, var1, var2, var7, false, var9.renderable1);
                     var9.renderable2 = new DynamicObject(var8, 2, var5 + 1 & 3, WallObject.plane, var1, var2, var7, false, var9.renderable2);
                  } else {
                     var9.renderable1 = new DynamicObject(var8, var4, var5, WallObject.plane, var1, var2, var7, false, var9.renderable1);
                  }
               }
            }

            if(var6 == 1) {
               DecorativeObject var31 = class2.region.method2689(WallObject.plane, var1, var2);
               if(var31 != null) {
                  var8 = var31.hash >> 14 & 32767;
                  if(var4 != 4 && var4 != 5) {
                     if(var4 == 6) {
                        var31.renderable1 = new DynamicObject(var8, 4, var5 + 4, WallObject.plane, var1, var2, var7, false, var31.renderable1);
                     } else if(var4 == 7) {
                        var31.renderable1 = new DynamicObject(var8, 4, (var5 + 2 & 3) + 4, WallObject.plane, var1, var2, var7, false, var31.renderable1);
                     } else if(var4 == 8) {
                        var31.renderable1 = new DynamicObject(var8, 4, var5 + 4, WallObject.plane, var1, var2, var7, false, var31.renderable1);
                        var31.renderable2 = new DynamicObject(var8, 4, (var5 + 2 & 3) + 4, WallObject.plane, var1, var2, var7, false, var31.renderable2);
                     }
                  } else {
                     var31.renderable1 = new DynamicObject(var8, 4, var5, WallObject.plane, var1, var2, var7, false, var31.renderable1);
                  }
               }
            }

            if(var6 == 2) {
               GameObject var32 = class2.region.method2690(WallObject.plane, var1, var2);
               if(var4 == 11) {
                  var4 = 10;
               }

               if(var32 != null) {
                  var32.renderable = new DynamicObject(var32.hash >> 14 & 32767, var4, var5, WallObject.plane, var1, var2, var7, false, var32.renderable);
               }
            }

            if(var6 == 3) {
               GroundObject var33 = class2.region.method2691(WallObject.plane, var1, var2);
               if(var33 != null) {
                  var33.renderable = new DynamicObject(var33.hash >> 14 & 32767, 22, var5, WallObject.plane, var1, var2, var7, false, var33.renderable);
               }
            }
         }
      } else if(Client.packetType == 82) {
         var0 = Client.secretPacketBuffer2.readUnsignedByte();
         var1 = (var0 >> 4 & 7) + Player.field900;
         var2 = (var0 & 7) + class29.field428;
         var3 = Client.secretPacketBuffer2.readUnsignedShort();
         var4 = Client.secretPacketBuffer2.readUnsignedByte();
         var5 = Client.secretPacketBuffer2.readUnsignedShort();
         if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
            var1 = var1 * 128 + 64;
            var2 = var2 * 128 + 64;
            GraphicsObject var34 = new GraphicsObject(var3, WallObject.plane, var1, var2, WorldMapData.getTileHeight(var1, var2, WallObject.plane) - var4, var5, Client.gameCycle);
            Client.graphicsObjectDeque.addFront(var34);
         }
      } else {
         int var35;
         if(Client.packetType == 56) {
            var0 = Client.secretPacketBuffer2.readUnsignedByte();
            var1 = (var0 >> 4 & 7) + Player.field900;
            var2 = (var0 & 7) + class29.field428;
            var3 = Client.secretPacketBuffer2.readUnsignedShort();
            var4 = Client.secretPacketBuffer2.readUnsignedByte();
            var5 = var4 >> 4 & 15;
            var6 = var4 & 7;
            var7 = Client.secretPacketBuffer2.readUnsignedByte();
            if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               var35 = var5 + 1;
               if(XItemContainer.localPlayer.pathX[0] >= var1 - var35 && XItemContainer.localPlayer.pathX[0] <= var35 + var1 && XItemContainer.localPlayer.pathY[0] >= var2 - var35 && XItemContainer.localPlayer.pathY[0] <= var35 + var2 && Client.field1098 != 0 && var6 > 0 && Client.field1181 < 50) {
                  Client.field1168[Client.field1181] = var3;
                  Client.field1169[Client.field1181] = var6;
                  Client.field1170[Client.field1181] = var7;
                  Client.audioEffects[Client.field1181] = null;
                  Client.field1171[Client.field1181] = var5 + (var2 << 8) + (var1 << 16);
                  ++Client.field1181;
               }
            }
         }

         int var10;
         int var11;
         int var12;
         if(Client.packetType == 202) {
            byte var13 = Client.secretPacketBuffer2.method3207();
            var1 = Client.secretPacketBuffer2.readUnsignedShort();
            var2 = Client.secretPacketBuffer2.method3318();
            var3 = Client.secretPacketBuffer2.method3324();
            var4 = (var3 >> 4 & 7) + Player.field900;
            var5 = (var3 & 7) + class29.field428;
            byte var14 = Client.secretPacketBuffer2.method3172();
            var7 = Client.secretPacketBuffer2.readByteOb1();
            var35 = Client.secretPacketBuffer2.method3318();
            var8 = Client.secretPacketBuffer2.method3292();
            var10 = var8 >> 2;
            var11 = var8 & 3;
            var12 = Client.field989[var10];
            byte var15 = Client.secretPacketBuffer2.method3172();
            byte var16 = Client.secretPacketBuffer2.method3172();
            Player var17;
            if(var2 == Client.localInteractingIndex) {
               var17 = XItemContainer.localPlayer;
            } else {
               var17 = Client.cachedPlayers[var2];
            }

            if(var17 != null) {
               ObjectComposition var18 = class251.getObjectDefinition(var7);
               int var19;
               int var20;
               if(var11 != 1 && var11 != 3) {
                  var19 = var18.sizeX;
                  var20 = var18.sizeY;
               } else {
                  var19 = var18.sizeY;
                  var20 = var18.sizeX;
               }

               int var21 = (var19 >> 1) + var4;
               int var22 = (var19 + 1 >> 1) + var4;
               int var23 = (var20 >> 1) + var5;
               int var24 = var5 + (var20 + 1 >> 1);
               int[][] var25 = class61.tileHeights[WallObject.plane];
               int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2;
               int var27 = (var4 << 7) + (var19 << 6);
               int var28 = (var20 << 6) + (var5 << 7);
               Model var29 = var18.method4518(var10, var11, var25, var27, var26, var28);
               if(var29 != null) {
                  class15.method79(WallObject.plane, var4, var5, var12, -1, 0, 0, var1 + 1, var35 + 1);
                  var17.field898 = Client.gameCycle + var1;
                  var17.field905 = var35 + Client.gameCycle;
                  var17.model = var29;
                  var17.field902 = 64 * var19 + var4 * 128;
                  var17.field892 = var5 * 128 + var20 * 64;
                  var17.field901 = var26;
                  byte var30;
                  if(var16 > var15) {
                     var30 = var16;
                     var16 = var15;
                     var15 = var30;
                  }

                  if(var13 > var14) {
                     var30 = var13;
                     var13 = var14;
                     var14 = var30;
                  }

                  var17.field891 = var4 + var16;
                  var17.field906 = var15 + var4;
                  var17.field899 = var5 + var13;
                  var17.field907 = var5 + var14;
               }
            }
         }

         if(Client.packetType == 194) {
            var0 = Client.secretPacketBuffer2.readUnsignedByte();
            var1 = var0 >> 2;
            var2 = var0 & 3;
            var3 = Client.field989[var1];
            var4 = Client.secretPacketBuffer2.readUnsignedByte();
            var5 = (var4 >> 4 & 7) + Player.field900;
            var6 = class29.field428 + (var4 & 7);
            if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               class15.method79(WallObject.plane, var5, var6, var3, -1, var1, var2, 0, -1);
            }
         } else if(Client.packetType == 215) {
            var0 = Client.secretPacketBuffer2.method3292();
            var1 = var0 >> 2;
            var2 = var0 & 3;
            var3 = Client.field989[var1];
            var4 = Client.secretPacketBuffer2.readUnsignedShortOb1();
            var5 = Client.secretPacketBuffer2.method3173();
            var6 = (var5 >> 4 & 7) + Player.field900;
            var7 = (var5 & 7) + class29.field428;
            if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               class15.method79(WallObject.plane, var6, var7, var3, var4, var1, var2, 0, -1);
            }
         } else {
            Item var36;
            if(Client.packetType == 97) {
               var0 = Client.secretPacketBuffer2.readUnsignedShortOb1();
               var1 = Client.secretPacketBuffer2.method3173();
               var2 = (var1 >> 4 & 7) + Player.field900;
               var3 = (var1 & 7) + class29.field428;
               var4 = Client.secretPacketBuffer2.method3318();
               if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                  var36 = new Item();
                  var36.id = var4;
                  var36.quantity = var0;
                  if(Client.groundItemDeque[WallObject.plane][var2][var3] == null) {
                     Client.groundItemDeque[WallObject.plane][var2][var3] = new Deque();
                  }

                  Client.groundItemDeque[WallObject.plane][var2][var3].addFront(var36);
                  Occluder.groundItemSpawned(var2, var3);
               }
            } else if(Client.packetType == 63) {
               var0 = Client.secretPacketBuffer2.readUnsignedByte();
               var1 = (var0 >> 4 & 7) + Player.field900;
               var2 = (var0 & 7) + class29.field428;
               var3 = var1 + Client.secretPacketBuffer2.readByte();
               var4 = var2 + Client.secretPacketBuffer2.readByte();
               var5 = Client.secretPacketBuffer2.readShort();
               var6 = Client.secretPacketBuffer2.readUnsignedShort();
               var7 = Client.secretPacketBuffer2.readUnsignedByte() * 4;
               var35 = Client.secretPacketBuffer2.readUnsignedByte() * 4;
               var8 = Client.secretPacketBuffer2.readUnsignedShort();
               var10 = Client.secretPacketBuffer2.readUnsignedShort();
               var11 = Client.secretPacketBuffer2.readUnsignedByte();
               var12 = Client.secretPacketBuffer2.readUnsignedByte();
               if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != '\uffff') {
                  var1 = var1 * 128 + 64;
                  var2 = var2 * 128 + 64;
                  var3 = 128 * var3 + 64;
                  var4 = var4 * 128 + 64;
                  Projectile var37 = new Projectile(var6, WallObject.plane, var1, var2, WorldMapData.getTileHeight(var1, var2, WallObject.plane) - var7, var8 + Client.gameCycle, var10 + Client.gameCycle, var11, var12, var5, var35);
                  var37.method1758(var3, var4, WorldMapData.getTileHeight(var3, var4, WallObject.plane) - var35, var8 + Client.gameCycle);
                  Client.projectiles.addFront(var37);
               }
            } else {
               Deque var38;
               if(Client.packetType == 92) {
                  var0 = Client.secretPacketBuffer2.readUnsignedByte();
                  var1 = (var0 >> 4 & 7) + Player.field900;
                  var2 = (var0 & 7) + class29.field428;
                  var3 = Client.secretPacketBuffer2.readUnsignedShortOb1();
                  if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                     var38 = Client.groundItemDeque[WallObject.plane][var1][var2];
                     if(var38 != null) {
                        for(var36 = (Item)var38.getFront(); var36 != null; var36 = (Item)var38.getNext()) {
                           if(var36.id == (var3 & 32767)) {
                              var36.unlink();
                              break;
                           }
                        }

                        if(var38.getFront() == null) {
                           Client.groundItemDeque[WallObject.plane][var1][var2] = null;
                        }

                        Occluder.groundItemSpawned(var1, var2);
                     }
                  }
               } else if(Client.packetType == 58) {
                  var0 = Client.secretPacketBuffer2.readUnsignedByte();
                  var1 = (var0 >> 4 & 7) + Player.field900;
                  var2 = (var0 & 7) + class29.field428;
                  var3 = Client.secretPacketBuffer2.readUnsignedShort();
                  var4 = Client.secretPacketBuffer2.readUnsignedShort();
                  var5 = Client.secretPacketBuffer2.readUnsignedShort();
                  if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                     var38 = Client.groundItemDeque[WallObject.plane][var1][var2];
                     if(var38 != null) {
                        for(Item var39 = (Item)var38.getFront(); var39 != null; var39 = (Item)var38.getNext()) {
                           if((var3 & 32767) == var39.id && var39.quantity == var4) {
                              var39.quantity = var5;
                              break;
                           }
                        }

                        Occluder.groundItemSpawned(var1, var2);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "24"
   )
   public static boolean method1558(int var0) {
      return (var0 >> 21 & 1) != 0;
   }

   Actor() {
      this.field1267 = false;
      this.field1242 = 1;
      this.idlePoseAnimation = -1;
      this.field1290 = -1;
      this.field1245 = -1;
      this.field1246 = -1;
      this.field1283 = -1;
      this.field1270 = -1;
      this.field1249 = -1;
      this.field1250 = -1;
      this.overhead = null;
      this.inSequence = false;
      this.field1264 = 100;
      this.field1255 = 0;
      this.field1256 = 0;
      this.field1257 = 0;
      this.field1294 = new int[4];
      this.hitsplatTypes = new int[4];
      this.hitsplatCycles = new int[4];
      this.field1261 = new int[4];
      this.field1273 = new int[4];
      this.combatInfoList = new CombatInfoList();
      this.interacting = -1;
      this.field1265 = false;
      this.field1266 = -1;
      this.poseAnimation = -1;
      this.poseFrame = 0;
      this.field1254 = 0;
      this.animation = -1;
      this.actionFrame = 0;
      this.field1247 = 0;
      this.actionAnimationDisable = 0;
      this.field1262 = 0;
      this.graphic = -1;
      this.field1244 = 0;
      this.field1277 = 0;
      this.field1287 = 0;
      this.field1288 = 200;
      this.field1252 = 0;
      this.field1291 = 32;
      this.queueSize = 0;
      this.pathX = new int[10];
      this.pathY = new int[10];
      this.field1297 = new byte[10];
      this.field1275 = 0;
      this.field1269 = 0;
   }
}
