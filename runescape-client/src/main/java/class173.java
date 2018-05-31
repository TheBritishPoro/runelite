import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class173 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1423471307"
   )
   @Export("addChatMessage")
   @Hook("addChatMessage")
   static void addChatMessage(int var0, String var1, String var2, String var3) {
      ChatLineBuffer var4 = (ChatLineBuffer)class83.chatLineMap.get(Integer.valueOf(var0));
      if(var4 == null) {
         var4 = new ChatLineBuffer();
         class83.chatLineMap.put(Integer.valueOf(var0), var4);
      }

      MessageNode var5 = var4.addMessage(var0, var1, var2, var3);
      class83.messages.put(var5, (long)var5.id);
      class83.field1184.add(var5);
      Client.chatCycle = Client.cycleCntr;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1923178651"
   )
   static int method3469(int var0, Script var1, boolean var2) {
      if(var0 == 3300) {
         class69.intStack[++class69.intStackSize - 1] = Client.gameCycle;
         return 1;
      } else {
         int var3;
         int var4;
         if(var0 == 3301) {
            class69.intStackSize -= 2;
            var3 = class69.intStack[class69.intStackSize];
            var4 = class69.intStack[class69.intStackSize + 1];
            class69.intStack[++class69.intStackSize - 1] = Widget.method4559(var3, var4);
            return 1;
         } else {
            int[] var5;
            int var6;
            int var7;
            ItemContainer var8;
            if(var0 == 3302) {
               class69.intStackSize -= 2;
               var3 = class69.intStack[class69.intStackSize];
               var4 = class69.intStack[class69.intStackSize + 1];
               var5 = class69.intStack;
               var6 = ++class69.intStackSize - 1;
               var8 = (ItemContainer)ItemContainer.itemContainers.get((long)var3);
               if(var8 == null) {
                  var7 = 0;
               } else if(var4 >= 0 && var4 < var8.stackSizes.length) {
                  var7 = var8.stackSizes[var4];
               } else {
                  var7 = 0;
               }

               var5[var6] = var7;
               return 1;
            } else if(var0 == 3303) {
               class69.intStackSize -= 2;
               var3 = class69.intStack[class69.intStackSize];
               var4 = class69.intStack[class69.intStackSize + 1];
               class69.intStack[++class69.intStackSize - 1] = class139.method3143(var3, var4);
               return 1;
            } else if(var0 == 3304) {
               var3 = class69.intStack[--class69.intStackSize];
               class69.intStack[++class69.intStackSize - 1] = Frames.method3074(var3).size;
               return 1;
            } else if(var0 == 3305) {
               var3 = class69.intStack[--class69.intStackSize];
               class69.intStack[++class69.intStackSize - 1] = Client.boostedSkillLevels[var3];
               return 1;
            } else if(var0 == 3306) {
               var3 = class69.intStack[--class69.intStackSize];
               class69.intStack[++class69.intStackSize - 1] = Client.realSkillLevels[var3];
               return 1;
            } else if(var0 == 3307) {
               var3 = class69.intStack[--class69.intStackSize];
               class69.intStack[++class69.intStackSize - 1] = Client.skillExperiences[var3];
               return 1;
            } else {
               int var9;
               if(var0 == 3308) {
                  var3 = class13.plane;
                  var4 = (class138.localPlayer.x >> 7) + PendingSpawn.baseX;
                  var9 = (class138.localPlayer.y >> 7) + Client.baseY;
                  class69.intStack[++class69.intStackSize - 1] = (var4 << 14) + var9 + (var3 << 28);
                  return 1;
               } else if(var0 == 3309) {
                  var3 = class69.intStack[--class69.intStackSize];
                  class69.intStack[++class69.intStackSize - 1] = var3 >> 14 & 16383;
                  return 1;
               } else if(var0 == 3310) {
                  var3 = class69.intStack[--class69.intStackSize];
                  class69.intStack[++class69.intStackSize - 1] = var3 >> 28;
                  return 1;
               } else if(var0 == 3311) {
                  var3 = class69.intStack[--class69.intStackSize];
                  class69.intStack[++class69.intStackSize - 1] = var3 & 16383;
                  return 1;
               } else if(var0 == 3312) {
                  class69.intStack[++class69.intStackSize - 1] = Client.isMembers?1:0;
                  return 1;
               } else if(var0 == 3313) {
                  class69.intStackSize -= 2;
                  var3 = class69.intStack[class69.intStackSize] + 32768;
                  var4 = class69.intStack[class69.intStackSize + 1];
                  class69.intStack[++class69.intStackSize - 1] = Widget.method4559(var3, var4);
                  return 1;
               } else if(var0 != 3314) {
                  if(var0 == 3315) {
                     class69.intStackSize -= 2;
                     var3 = class69.intStack[class69.intStackSize] + 32768;
                     var4 = class69.intStack[class69.intStackSize + 1];
                     class69.intStack[++class69.intStackSize - 1] = class139.method3143(var3, var4);
                     return 1;
                  } else if(var0 == 3316) {
                     if(Client.rights >= 2) {
                        class69.intStack[++class69.intStackSize - 1] = Client.rights;
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 3317) {
                     class69.intStack[++class69.intStackSize - 1] = Client.field598;
                     return 1;
                  } else if(var0 == 3318) {
                     class69.intStack[++class69.intStackSize - 1] = Client.world;
                     return 1;
                  } else if(var0 == 3321) {
                     class69.intStack[++class69.intStackSize - 1] = Client.energy;
                     return 1;
                  } else if(var0 == 3322) {
                     class69.intStack[++class69.intStackSize - 1] = Client.weight;
                     return 1;
                  } else if(var0 == 3323) {
                     if(Client.field776) {
                        class69.intStack[++class69.intStackSize - 1] = 1;
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 3324) {
                     class69.intStack[++class69.intStackSize - 1] = Client.flags;
                     return 1;
                  } else if(var0 == 3325) {
                     class69.intStackSize -= 4;
                     var3 = class69.intStack[class69.intStackSize];
                     var4 = class69.intStack[class69.intStackSize + 1];
                     var9 = class69.intStack[class69.intStackSize + 2];
                     var6 = class69.intStack[class69.intStackSize + 3];
                     var3 += var4 << 14;
                     var3 += var9 << 28;
                     var3 += var6;
                     class69.intStack[++class69.intStackSize - 1] = var3;
                     return 1;
                  } else {
                     return 2;
                  }
               } else {
                  class69.intStackSize -= 2;
                  var3 = class69.intStack[class69.intStackSize] + 32768;
                  var4 = class69.intStack[class69.intStackSize + 1];
                  var5 = class69.intStack;
                  var6 = ++class69.intStackSize - 1;
                  var8 = (ItemContainer)ItemContainer.itemContainers.get((long)var3);
                  if(var8 == null) {
                     var7 = 0;
                  } else if(var4 >= 0 && var4 < var8.stackSizes.length) {
                     var7 = var8.stackSizes[var4];
                  } else {
                     var7 = 0;
                  }

                  var5[var6] = var7;
                  return 1;
               }
            }
         }
      }
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(Ljn;IIII)V",
      garbageValue = "1672351117"
   )
   @Export("queueAnimationSound")
   static void queueAnimationSound(Sequence var0, int var1, int var2, int var3) {
      if(Client.queuedSoundEffectCount < 50 && Client.field815 != 0) {
         if(var0.field3543 != null && var1 < var0.field3543.length) {
            int var4 = var0.field3543[var1];
            if(var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               Client.queuedSoundEffectIDs[Client.queuedSoundEffectCount] = var5;
               Client.unknownSoundValues1[Client.queuedSoundEffectCount] = var6;
               Client.unknownSoundValues2[Client.queuedSoundEffectCount] = 0;
               Client.audioEffects[Client.queuedSoundEffectCount] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               Client.soundLocations[Client.queuedSoundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
               ++Client.queuedSoundEffectCount;
            }
         }
      }
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   static boolean method3470(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhi;IIIS)V",
      garbageValue = "-9115"
   )
   static final void method3473(Widget var0, int var1, int var2, int var3) {
      class54.method1017();
      class224 var4 = var0.method4517(false);
      if(var4 != null) {
         Rasterizer2D.setDrawRegion(var1, var2, var4.field2553 + var1, var2 + var4.field2549);
         if(Client.field810 != 2 && Client.field810 != 5) {
            int var5 = Client.mapAngle & 2047;
            int var6 = class138.localPlayer.x / 32 + 48;
            int var7 = 464 - class138.localPlayer.y / 32;
            NPC.minimapSprite.method5845(var1, var2, var4.field2553, var4.field2549, var6, var7, var5, 256, var4.field2551, var4.field2550);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < Client.field724; ++var8) {
               var9 = Client.field805[var8] * 4 + 2 - class138.localPlayer.x / 32;
               var10 = Client.field806[var8] * 4 + 2 - class138.localPlayer.y / 32;
               WidgetNode.drawDot(var1, var2, var9, var10, Client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  Deque var15 = Client.groundItemDeque[class13.plane][var8][var9];
                  if(var15 != null) {
                     var11 = var8 * 4 + 2 - class138.localPlayer.x / 32;
                     var12 = var9 * 4 + 2 - class138.localPlayer.y / 32;
                     WidgetNode.drawDot(var1, var2, var11, var12, MapIconReference.mapDots[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < Client.npcIndexesCount; ++var8) {
               NPC var16 = Client.cachedNPCs[Client.npcIndices[var8]];
               if(var16 != null && var16.hasConfig()) {
                  NPCComposition var18 = var16.composition;
                  if(var18 != null && var18.configs != null) {
                     var18 = var18.transform();
                  }

                  if(var18 != null && var18.isMinimapVisible && var18.field3504) {
                     var11 = var16.x / 32 - class138.localPlayer.x / 32;
                     var12 = var16.y / 32 - class138.localPlayer.y / 32;
                     WidgetNode.drawDot(var1, var2, var11, var12, MapIconReference.mapDots[1], var4);
                  }
               }
            }

            var8 = class81.playerIndexesCount;
            int[] var19 = class81.playerIndices;

            for(var10 = 0; var10 < var8; ++var10) {
               Player var17 = Client.cachedPlayers[var19[var10]];
               if(var17 != null && var17.hasConfig() && !var17.hidden && var17 != class138.localPlayer) {
                  var12 = var17.x / 32 - class138.localPlayer.x / 32;
                  int var13 = var17.y / 32 - class138.localPlayer.y / 32;
                  boolean var14 = false;
                  if(class138.localPlayer.team != 0 && var17.team != 0 && var17.team == class138.localPlayer.team) {
                     var14 = true;
                  }

                  if(var17.isFriend()) {
                     WidgetNode.drawDot(var1, var2, var12, var13, MapIconReference.mapDots[3], var4);
                  } else if(var14) {
                     WidgetNode.drawDot(var1, var2, var12, var13, MapIconReference.mapDots[4], var4);
                  } else if(var17.isClanMember()) {
                     WidgetNode.drawDot(var1, var2, var12, var13, MapIconReference.mapDots[5], var4);
                  } else {
                     WidgetNode.drawDot(var1, var2, var12, var13, MapIconReference.mapDots[2], var4);
                  }
               }
            }

            if(Client.hintArrowTargetType != 0 && Client.gameCycle % 20 < 10) {
               if(Client.hintArrowTargetType == 1 && Client.hintArrowNpcTargetIdx >= 0 && Client.hintArrowNpcTargetIdx < Client.cachedNPCs.length) {
                  NPC var20 = Client.cachedNPCs[Client.hintArrowNpcTargetIdx];
                  if(var20 != null) {
                     var11 = var20.x / 32 - class138.localPlayer.x / 32;
                     var12 = var20.y / 32 - class138.localPlayer.y / 32;
                     VertexNormal.worldToMinimap(var1, var2, var11, var12, TextureProvider.mapMarkers[1], var4);
                  }
               }

               if(Client.hintArrowTargetType == 2) {
                  var10 = Client.hintArrowX * 4 - PendingSpawn.baseX * 4 + 2 - class138.localPlayer.x / 32;
                  var11 = Client.hintArrowY * 4 - Client.baseY * 4 + 2 - class138.localPlayer.y / 32;
                  VertexNormal.worldToMinimap(var1, var2, var10, var11, TextureProvider.mapMarkers[1], var4);
               }

               if(Client.hintArrowTargetType == 10 && Client.hintArrowPlayerTargetIdx >= 0 && Client.hintArrowPlayerTargetIdx < Client.cachedPlayers.length) {
                  Player var21 = Client.cachedPlayers[Client.hintArrowPlayerTargetIdx];
                  if(var21 != null) {
                     var11 = var21.x / 32 - class138.localPlayer.x / 32;
                     var12 = var21.y / 32 - class138.localPlayer.y / 32;
                     VertexNormal.worldToMinimap(var1, var2, var11, var12, TextureProvider.mapMarkers[1], var4);
                  }
               }
            }

            if(Client.destinationX != 0) {
               var10 = Client.destinationX * 4 + 2 - class138.localPlayer.x / 32;
               var11 = Client.destinationY * 4 + 2 - class138.localPlayer.y / 32;
               WidgetNode.drawDot(var1, var2, var10, var11, TextureProvider.mapMarkers[0], var4);
            }

            if(!class138.localPlayer.hidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var4.field2553 / 2 + var1 - 1, var4.field2549 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.method5742(var1, var2, 0, var4.field2551, var4.field2550);
         }

         Client.field788[var3] = true;
      }
   }
}
