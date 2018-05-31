import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("ScriptState")
public class ScriptState {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lce;"
   )
   @Export("invokedFromScript")
   Script invokedFromScript;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1485415085
   )
   @Export("invokedFromPc")
   int invokedFromPc;
   @ObfuscatedName("s")
   @Export("savedLocalInts")
   int[] savedLocalInts;
   @ObfuscatedName("l")
   @Export("savedLocalStrings")
   String[] savedLocalStrings;

   ScriptState() {
      this.invokedFromPc = -1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)[Ljr;",
      garbageValue = "128"
   )
   public static Parameters[] method996() {
      return new Parameters[]{Parameters.field3596, Parameters.field3580, Parameters.field3582, Parameters.field3585, Parameters.field3593, Parameters.field3587, Parameters.field3583, Parameters.field3595, Parameters.field3592, Parameters.field3588, Parameters.field3586, Parameters.field3590, Parameters.field3594, Parameters.field3589, Parameters.field3581, Parameters.field3584};
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method998(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if(var3 == 2 || Character.isUpperCase(var5)) {
            var5 = Name.method5450(var5);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(var5 != '.' && var5 != '?' && var5 != '!') {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-827181248"
   )
   static final void method995(String var0) {
      StringBuilder var10000 = new StringBuilder();
      Object var10001 = null;
      var10000 = var10000.append("Please remove ").append(var0);
      var10001 = null;
      String var1 = var10000.append(" from your ignore list first").toString();
      class143.sendGameMessage(30, "", var1);
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "1560742456"
   )
   @Export("xteaChanged")
   static final void xteaChanged(boolean var0, PacketBuffer var1) {
      Client.isDynamicRegion = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if(!Client.isDynamicRegion) {
         var2 = var1.method3613();
         var3 = var1.method3646();
         int var4 = var1.readUnsignedShort();
         FriendManager.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               FriendManager.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         class143.mapRegions = new int[var4];
         FontName.landMapFileIds = new int[var4];
         class9.landRegionFileIds = new int[var4];
         class171.field2252 = new byte[var4][];
         MapCacheArchiveNames.field253 = new byte[var4][];
         boolean var16 = false;
         if((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
            var16 = true;
         }

         if(var2 / 8 == 48 && var3 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
            for(var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if(!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class143.mapRegions[var4] = var8;
                  FontName.landMapFileIds[var4] = FileRequest.indexMaps.getFile("m" + var6 + "_" + var7);
                  class9.landRegionFileIds[var4] = FileRequest.indexMaps.getFile("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         PendingSpawn.method1537(var2, var3, true);
      } else {
         var2 = var1.method3585();
         var3 = var1.method3585();
         boolean var15 = var1.readUnsignedByte() == 1;
         var5 = var1.readUnsignedShort();
         var1.bitAccess();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.getBits(1);
                  if(var9 == 1) {
                     Client.instanceTemplateChunks[var6][var7][var8] = var1.getBits(26);
                  } else {
                     Client.instanceTemplateChunks[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.byteAccess();
         FriendManager.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               FriendManager.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         class143.mapRegions = new int[var5];
         FontName.landMapFileIds = new int[var5];
         class9.landRegionFileIds = new int[var5];
         class171.field2252 = new byte[var5][];
         MapCacheArchiveNames.field253 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = Client.instanceTemplateChunks[var6][var7][var8];
                  if(var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if(class143.mapRegions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if(var12 != -1) {
                        class143.mapRegions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        FontName.landMapFileIds[var5] = FileRequest.indexMaps.getFile("m" + var13 + "_" + var14);
                        class9.landRegionFileIds[var5] = FileRequest.indexMaps.getFile("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         PendingSpawn.method1537(var2, var3, !var15);
      }

   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1470602086"
   )
   static final void method997(int var0, int var1) {
      if(Client.menuOptionCount >= 2 || Client.itemSelectionState != 0 || Client.spellSelected) {
         if(Client.field728) {
            int var2 = Client.menuOptionCount - 1;
            String var4;
            if(Client.itemSelectionState == 1 && Client.menuOptionCount < 2) {
               var4 = "Use" + " " + Client.lastSelectedItemName + " " + "->";
            } else if(Client.spellSelected && Client.menuOptionCount < 2) {
               var4 = Client.field612 + " " + Client.field739 + " " + "->";
            } else {
               var4 = WorldMapType1.method176(var2);
            }

            if(Client.menuOptionCount > 2) {
               var4 = var4 + class6.getColTags(16777215) + " " + '/' + " " + (Client.menuOptionCount - 2) + " more options";
            }

            ClanMemberManager.fontBold12.drawRandomizedMouseoverText(var4, var0 + 4, var1 + 15, 16777215, 0, Client.gameCycle / 1000);
         }
      }
   }
}
