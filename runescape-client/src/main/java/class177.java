import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class177 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field2284;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1679580901
   )
   static int field2283;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   public static Track1 field2285;

   static {
      new HashMap();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "29"
   )
   public static void method3509(String var0, String var1, int var2, int var3) throws IOException {
      class148.idxCount = var3;
      class141.field1885 = var2;

      try {
         class229.osName = System.getProperty("os.name");
      } catch (Exception var13) {
         class229.osName = "Unknown";
      }

      ContextMenuRow.osNameLC = class229.osName.toLowerCase();

      try {
         WorldMapType1.userHome = System.getProperty("user.home");
         if(WorldMapType1.userHome != null) {
            WorldMapType1.userHome = WorldMapType1.userHome + "/";
         }
      } catch (Exception var12) {
         ;
      }

      try {
         if(ContextMenuRow.osNameLC.startsWith("win")) {
            if(WorldMapType1.userHome == null) {
               WorldMapType1.userHome = System.getenv("USERPROFILE");
            }
         } else if(WorldMapType1.userHome == null) {
            WorldMapType1.userHome = System.getenv("HOME");
         }

         if(WorldMapType1.userHome != null) {
            WorldMapType1.userHome = WorldMapType1.userHome + "/";
         }
      } catch (Exception var11) {
         ;
      }

      if(WorldMapType1.userHome == null) {
         WorldMapType1.userHome = "~/";
      }

      class155.cacheLocations = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", WorldMapType1.userHome, "/tmp/", ""};
      class8.field52 = new String[]{".jagex_cache_" + class141.field1885, ".file_store_" + class141.field1885};
      int var9 = 0;

      label92:
      while(var9 < 4) {
         class155.field1966 = World.method1583(var0, var1, var9);
         if(!class155.field1966.exists()) {
            class155.field1966.mkdirs();
         }

         File[] var5 = class155.field1966.listFiles();
         if(var5 == null) {
            break;
         }

         File[] var6 = var5;
         int var7 = 0;

         while(true) {
            if(var7 >= var6.length) {
               break label92;
            }

            File var8 = var6[var7];
            if(!GraphicsObject.method1766(var8, false)) {
               ++var9;
               break;
            }

            ++var7;
         }
      }

      File var4 = class155.field1966;
      class158.field1974 = var4;
      if(!class158.field1974.exists()) {
         throw new RuntimeException("");
      } else {
         class158.field1979 = true;
         MapCacheArchiveNames.method476();
         class155.dat2File = new CacheFile(new FileOnDisk(class151.method3238("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         class155.idx255File = new CacheFile(new FileOnDisk(class151.method3238("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class76.idxFiles = new CacheFile[class148.idxCount];

         for(int var10 = 0; var10 < class148.idxCount; ++var10) {
            class76.idxFiles[var10] = new CacheFile(new FileOnDisk(class151.method3238("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgi;I)V",
      garbageValue = "-2137286029"
   )
   static final void method3512(PacketBuffer var0) {
      int var1 = 0;
      var0.bitAccess();

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < class81.playerIndexesCount; ++var2) {
         var3 = class81.playerIndices[var2];
         if((class81.field1156[var3] & 1) == 0) {
            if(var1 > 0) {
               --var1;
               class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
            } else {
               var4 = var0.getBits(1);
               if(var4 == 0) {
                  var1 = ServerPacket.method3445(var0);
                  class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
               } else {
                  class6.decodeMovement(var0, var3);
               }
            }
         }
      }

      var0.byteAccess();
      if(var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.bitAccess();

         for(var2 = 0; var2 < class81.playerIndexesCount; ++var2) {
            var3 = class81.playerIndices[var2];
            if((class81.field1156[var3] & 1) != 0) {
               if(var1 > 0) {
                  --var1;
                  class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
               } else {
                  var4 = var0.getBits(1);
                  if(var4 == 0) {
                     var1 = ServerPacket.method3445(var0);
                     class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                  } else {
                     class6.decodeMovement(var0, var3);
                  }
               }
            }
         }

         var0.byteAccess();
         if(var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.bitAccess();

            for(var2 = 0; var2 < class81.field1160; ++var2) {
               var3 = class81.field1161[var2];
               if((class81.field1156[var3] & 1) != 0) {
                  if(var1 > 0) {
                     --var1;
                     class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                  } else {
                     var4 = var0.getBits(1);
                     if(var4 == 0) {
                        var1 = ServerPacket.method3445(var0);
                        class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                     } else if(class240.decodeRegionHash(var0, var3)) {
                        class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                     }
                  }
               }
            }

            var0.byteAccess();
            if(var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.bitAccess();

               for(var2 = 0; var2 < class81.field1160; ++var2) {
                  var3 = class81.field1161[var2];
                  if((class81.field1156[var3] & 1) == 0) {
                     if(var1 > 0) {
                        --var1;
                        class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                     } else {
                        var4 = var0.getBits(1);
                        if(var4 == 0) {
                           var1 = ServerPacket.method3445(var0);
                           class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                        } else if(class240.decodeRegionHash(var0, var3)) {
                           class81.field1156[var3] = (byte)(class81.field1156[var3] | 2);
                        }
                     }
                  }
               }

               var0.byteAccess();
               if(var1 != 0) {
                  throw new RuntimeException();
               } else {
                  class81.playerIndexesCount = 0;
                  class81.field1160 = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     class81.field1156[var2] = (byte)(class81.field1156[var2] >> 1);
                     Player var5 = Client.cachedPlayers[var2];
                     if(var5 != null) {
                        class81.playerIndices[++class81.playerIndexesCount - 1] = var2;
                     } else {
                        class81.field1161[++class81.field1160 - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "885632790"
   )
   static final void method3510(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class50.field447[0][var5][var4] = 127;
               if(var0 == var5 && var5 > 0) {
                  class50.tileHeights[0][var5][var4] = class50.tileHeights[0][var5 - 1][var4];
               }

               if(var5 == var0 + var2 && var5 < 103) {
                  class50.tileHeights[0][var5][var4] = class50.tileHeights[0][var5 + 1][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  class50.tileHeights[0][var5][var4] = class50.tileHeights[0][var5][var4 - 1];
               }

               if(var3 + var1 == var4 && var4 < 103) {
                  class50.tileHeights[0][var5][var4] = class50.tileHeights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1945852899"
   )
   static void method3507(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if(var1 != null) {
         var1.unlink();
      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2097572835"
   )
   static final void method3513() {
      Region.regionLowMemory = false;
      Client.lowMemory = false;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-280665232"
   )
   static final void method3508(String var0) {
      if(WorldMapType3.clanMemberManager != null) {
         PacketNode var1 = class26.method433(ClientPacket.field2174, Client.field626.field1218);
         var1.packetBuffer.putByte(class316.getLength(var0));
         var1.packetBuffer.putString(var0);
         Client.field626.method1980(var1);
      }
   }
}
