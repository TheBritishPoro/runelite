import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("FileSystem")
public class FileSystem extends Node {
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 117401965
   )
   static int field3154;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 2021384191
   )
   @Export("type")
   int type;
   @ObfuscatedName("w")
   byte[] field3149;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   @Export("index")
   IndexFile index;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("data")
   IndexData data;

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(ZLgi;B)V",
      garbageValue = "30"
   )
   @Hook("onNpcUpdate")
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field701 = 0;
      Client.pendingNpcFlagsCount = 0;
      PacketBuffer var2 = Client.field626.packetBuffer;
      var2.bitAccess();
      int var3 = var2.getBits(8);
      int var4;
      if(var3 < Client.npcIndexesCount) {
         for(var4 = var3; var4 < Client.npcIndexesCount; ++var4) {
            Client.field702[++Client.field701 - 1] = Client.npcIndices[var4];
         }
      }

      if(var3 > Client.npcIndexesCount) {
         throw new RuntimeException("");
      } else {
         Client.npcIndexesCount = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = Client.npcIndices[var4];
            NPC var6 = Client.cachedNPCs[var5];
            var7 = var2.getBits(1);
            if(var7 == 0) {
               Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
               var6.npcCycle = Client.gameCycle;
            } else {
               var8 = var2.getBits(2);
               if(var8 == 0) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var6.npcCycle = Client.gameCycle;
                  Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
               } else if(var8 == 1) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var6.npcCycle = Client.gameCycle;
                  var9 = var2.getBits(3);
                  var6.method1794(var9, (byte)1);
                  var10 = var2.getBits(1);
                  if(var10 == 1) {
                     Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
                  }
               } else if(var8 == 2) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var6.npcCycle = Client.gameCycle;
                  var9 = var2.getBits(3);
                  var6.method1794(var9, (byte)2);
                  var10 = var2.getBits(3);
                  var6.method1794(var10, (byte)2);
                  var11 = var2.getBits(1);
                  if(var11 == 1) {
                     Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
                  }
               } else if(var8 == 3) {
                  Client.field702[++Client.field701 - 1] = var5;
               }
            }
         }

         WorldMapManager.method500(var0, var1);

         int var14;
         for(var14 = 0; var14 < Client.pendingNpcFlagsCount; ++var14) {
            var3 = Client.pendingNpcFlagsIndices[var14];
            NPC var15 = Client.cachedNPCs[var3];
            var5 = var1.readUnsignedByte();
            int var16;
            if((var5 & 4) != 0) {
               var15.graphic = var1.method3646();
               var16 = var1.method3770();
               var15.field871 = var16 >> 16;
               var15.graphicsDelay = (var16 & 65535) + Client.gameCycle;
               var15.spotAnimFrame = 0;
               var15.spotAnimFrameCycle = 0;
               if(var15.graphicsDelay > Client.gameCycle) {
                  var15.spotAnimFrame = -1;
               }

               if(var15.graphic == 65535) {
                  var15.graphic = -1;
               }
            }

            if((var5 & 1) != 0) {
               var16 = var1.method3585();
               var7 = var1.method3585();
               var8 = var15.x - (var16 - PendingSpawn.baseX - PendingSpawn.baseX) * 64;
               var9 = var15.y - (var7 - Client.baseY - Client.baseY) * 64;
               if(var8 != 0 || var9 != 0) {
                  var15.field920 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if((var5 & 64) != 0) {
               var16 = var1.method3577();
               int var12;
               if(var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.getUSmart();
                     if(var8 == 32767) {
                        var8 = var1.getUSmart();
                        var10 = var1.getUSmart();
                        var9 = var1.getUSmart();
                        var11 = var1.getUSmart();
                     } else if(var8 != 32766) {
                        var10 = var1.getUSmart();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.getUSmart();
                     var15.applyActorHitsplat(var8, var10, var9, var11, Client.gameCycle, var12);
                  }
               }

               var7 = var1.method3577();
               if(var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.getUSmart();
                     var10 = var1.getUSmart();
                     if(var10 != 32767) {
                        var11 = var1.getUSmart();
                        var12 = var1.method3765();
                        int var13 = var10 > 0?var1.method3765():var12;
                        var15.setCombatInfo(var9, Client.gameCycle, var10, var11, var12, var13);
                     } else {
                        var15.method1557(var9);
                     }
                  }
               }
            }

            if((var5 & 8) != 0) {
               var15.composition = HorizontalAlignment.getNpcDefinition(var1.method3613());
               var15.field874 = var15.composition.size;
               var15.field924 = var15.composition.rotation;
               var15.field899 = var15.composition.walkingAnimation;
               var15.field880 = var15.composition.rotate180Animation;
               var15.field870 = var15.composition.rotate90RightAnimation;
               var15.field882 = var15.composition.rotate90LeftAnimation;
               var15.idlePoseAnimation = var15.composition.standingAnimation;
               var15.field877 = var15.composition.field3496;
               var15.field878 = var15.composition.field3486;
            }

            if((var5 & 16) != 0) {
               var15.interacting = var1.method3585();
               if(var15.interacting == 65535) {
                  var15.interacting = -1;
               }
            }

            if((var5 & 32) != 0) {
               var16 = var1.method3613();
               if(var16 == 65535) {
                  var16 = -1;
               }

               var7 = var1.readUnsignedByte();
               if(var16 == var15.animation && var16 != -1) {
                  var8 = TotalQuantityComparator.getAnimation(var16).replyMode;
                  if(var8 == 1) {
                     var15.actionFrame = 0;
                     var15.actionFrameCycle = 0;
                     var15.actionAnimationDisable = var7;
                     var15.field907 = 0;
                  }

                  if(var8 == 2) {
                     var15.field907 = 0;
                  }
               } else if(var16 == -1 || var15.animation == -1 || TotalQuantityComparator.getAnimation(var16).forcedPriority >= TotalQuantityComparator.getAnimation(var15.animation).forcedPriority) {
                  var15.animation = var16;
                  var15.actionFrame = 0;
                  var15.actionFrameCycle = 0;
                  var15.actionAnimationDisable = var7;
                  var15.field907 = 0;
                  var15.field930 = var15.queueSize;
               }
            }

            if((var5 & 2) != 0) {
               var15.overhead = var1.readString();
               var15.overheadTextCyclesRemaining = 100;
            }
         }

         for(var14 = 0; var14 < Client.field701; ++var14) {
            var3 = Client.field702[var14];
            if(Client.cachedNPCs[var3].npcCycle != Client.gameCycle) {
               Client.cachedNPCs[var3].composition = null;
               Client.cachedNPCs[var3] = null;
            }
         }

         if(var1.offset != Client.field626.packetLength) {
            throw new RuntimeException(var1.offset + "," + Client.field626.packetLength);
         } else {
            for(var14 = 0; var14 < Client.npcIndexesCount; ++var14) {
               if(Client.cachedNPCs[Client.npcIndices[var14]] == null) {
                  throw new RuntimeException(var14 + "," + Client.npcIndexesCount);
               }
            }

         }
      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "-2000374394"
   )
   static final void method4620(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if(var3 != null && var3.parentId == var1 && (!var3.hasScript || !class81.method1885(var3))) {
            if(var3.type == 0) {
               if(!var3.hasScript && class81.method1885(var3) && var3 != class143.field1897) {
                  continue;
               }

               method4620(var0, var3.id);
               if(var3.children != null) {
                  method4620(var3.children, var3.id);
               }

               WidgetNode var4 = (WidgetNode)Client.componentTable.get((long)var3.id);
               if(var4 != null) {
                  class21.method270(var4.id);
               }
            }

            if(var3.type == 6) {
               int var5;
               if(var3.field2595 != -1 || var3.field2653 != -1) {
                  boolean var7 = Occluder.method3097(var3);
                  if(var7) {
                     var5 = var3.field2653;
                  } else {
                     var5 = var3.field2595;
                  }

                  if(var5 != -1) {
                     Sequence var6 = TotalQuantityComparator.getAnimation(var5);

                     for(var3.field2613 += Client.field700; var3.field2613 > var6.frameLengths[var3.field2728]; Player.method1114(var3)) {
                        var3.field2613 -= var6.frameLengths[var3.field2728];
                        ++var3.field2728;
                        if(var3.field2728 >= var6.frameIDs.length) {
                           var3.field2728 -= var6.frameStep;
                           if(var3.field2728 < 0 || var3.field2728 >= var6.frameIDs.length) {
                              var3.field2728 = 0;
                           }
                        }
                     }
                  }
               }

               if(var3.field2732 != 0 && !var3.hasScript) {
                  int var8 = var3.field2732 >> 16;
                  var5 = var3.field2732 << 16 >> 16;
                  var8 *= Client.field700;
                  var5 *= Client.field700;
                  var3.rotationX = var8 + var3.rotationX & 2047;
                  var3.rotationZ = var5 + var3.rotationZ & 2047;
                  Player.method1114(var3);
               }
            }
         }
      }

   }
}
