import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("World")
public class World {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lbb;"
   )
   @Export("worldList")
   static World[] worldList;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -484083453
   )
   @Export("worldCount")
   static int worldCount;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2045294689
   )
   static int field944;
   @ObfuscatedName("i")
   static int[] field939;
   @ObfuscatedName("x")
   static int[] field946;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1592935297
   )
   @Export("id")
   int id;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1045794303
   )
   @Export("mask")
   int mask;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 405776969
   )
   @Export("playerCount")
   int playerCount;
   @ObfuscatedName("f")
   @Export("address")
   String address;
   @ObfuscatedName("g")
   @Export("activity")
   String activity;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2021362795
   )
   @Export("location")
   int location;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 777704071
   )
   @Export("index")
   int index;

   static {
      worldCount = 0;
      field944 = 0;
      field939 = new int[]{1, 1, 1, 1};
      field946 = new int[]{0, 1, 2, 3};
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "66"
   )
   boolean method1589() {
      return (1 & this.mask) != 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2036146048"
   )
   boolean method1567() {
      return (2 & this.mask) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "83"
   )
   boolean method1568() {
      return (4 & this.mask) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-648432612"
   )
   boolean method1569() {
      return (8 & this.mask) != 0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "185165272"
   )
   boolean method1570() {
      return (536870912 & this.mask) != 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "753404361"
   )
   boolean method1577() {
      return (33554432 & this.mask) != 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;",
      garbageValue = "-8731"
   )
   static File method1583(String var0, String var1, int var2) {
      String var3 = var2 == 0?"":"" + var2;
      class155.jagexClDat = new File(WorldMapType1.userHome, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Buffer var8;
      File var23;
      if(class155.jagexClDat.exists()) {
         try {
            FileOnDisk var7 = new FileOnDisk(class155.jagexClDat, "rw", 10000L);

            int var9;
            for(var8 = new Buffer((int)var7.length()); var8.offset < var8.payload.length; var8.offset += var9) {
               var9 = var7.read(var8.payload, var8.offset, var8.payload.length - var8.offset);
               if(var9 == -1) {
                  throw new IOException();
               }
            }

            var8.offset = 0;
            var9 = var8.readUnsignedByte();
            if(var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if(var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if(var9 <= 2) {
               var4 = var8.getJagString();
               if(var10 == 1) {
                  var5 = var8.getJagString();
               }
            } else {
               var4 = var8.getCESU8();
               if(var10 == 1) {
                  var5 = var8.getCESU8();
               }
            }

            var7.close();
         } catch (IOException var21) {
            var21.printStackTrace();
         }

         if(var4 != null) {
            var23 = new File(var4);
            if(!var23.exists()) {
               var4 = null;
            }
         }

         if(var4 != null) {
            var23 = new File(var4, "test.dat");
            if(!GraphicsObject.method1766(var23, true)) {
               var4 = null;
            }
         }
      }

      if(var4 == null && var2 == 0) {
         label137:
         for(int var15 = 0; var15 < class8.field52.length; ++var15) {
            for(int var16 = 0; var16 < class155.cacheLocations.length; ++var16) {
               File var17 = new File(class155.cacheLocations[var16] + class8.field52[var15] + File.separatorChar + var0 + File.separatorChar);
               if(var17.exists() && GraphicsObject.method1766(new File(var17, "test.dat"), true)) {
                  var4 = var17.toString();
                  var6 = true;
                  break label137;
               }
            }
         }
      }

      if(var4 == null) {
         var4 = WorldMapType1.userHome + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var22;
      if(var5 != null) {
         var22 = new File(var5);
         var23 = new File(var4);

         try {
            File[] var24 = var22.listFiles();
            File[] var18 = var24;

            for(int var11 = 0; var11 < var18.length; ++var11) {
               File var12 = var18[var11];
               File var13 = new File(var23, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if(!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var20) {
            var20.printStackTrace();
         }

         var6 = true;
      }

      if(var6) {
         var22 = new File(var4);
         var8 = null;

         try {
            FileOnDisk var25 = new FileOnDisk(class155.jagexClDat, "rw", 10000L);
            Buffer var26 = new Buffer(500);
            var26.putByte(3);
            var26.putByte(var8 != null?1:0);
            var26.putCESU8(var22.getPath());
            if(var8 != null) {
               var26.putCESU8("");
            }

            var25.write(var26.payload, 0, var26.offset);
            var25.close();
         } catch (IOException var19) {
            var19.printStackTrace();
         }
      }

      return new File(var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgk;IIIIIIS)V",
      garbageValue = "-9209"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class50.tileSettings[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               if(var1 == 0) {
                  int[] var8 = class50.tileHeights[0][var2];
                  int var11 = var2 + var4 + 932731;
                  int var12 = var3 + var5 + 556238;
                  int var13 = class32.getSmoothNoise(45365 + var11, var12 + 91923, 4) - 128 + (class32.getSmoothNoise(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (class32.getSmoothNoise(var11, var12, 1) - 128 >> 2);
                  var13 = (int)((double)var13 * 0.3D) + 35;
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var8[var3] = -var13 * 8;
               } else {
                  class50.tileHeights[var1][var2][var3] = class50.tileHeights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var14 = var0.readUnsignedByte();
               if(var14 == 1) {
                  var14 = 0;
               }

               if(var1 == 0) {
                  class50.tileHeights[0][var2][var3] = -var14 * 8;
               } else {
                  class50.tileHeights[var1][var2][var3] = class50.tileHeights[var1 - 1][var2][var3] - var14 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class165.tileOverlayIds[var1][var2][var3] = var0.readByte();
               class50.tileOverlayPath[var1][var2][var3] = (byte)((var7 - 2) / 4);
               WorldMapDecoration.overlayRotations[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               class50.tileSettings[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class50.tileUnderlayIds[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if(var7 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILir;IIIZB)V",
      garbageValue = "38"
   )
   public static void method1602(int var0, IndexDataBase var1, int var2, int var3, int var4, boolean var5) {
      class217.field2460 = 1;
      class138.field1871 = var1;
      class217.field2461 = var2;
      class217.field2462 = var3;
      class309.field3740 = var4;
      class217.field2463 = var5;
      class6.field37 = var0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "168369"
   )
   static int method1605(int var0, Script var1, boolean var2) {
      Widget var3 = var2?class276.field3561:KitDefinition.field3301;
      if(var0 == 1500) {
         class69.intStack[++class69.intStackSize - 1] = var3.relativeX;
         return 1;
      } else if(var0 == 1501) {
         class69.intStack[++class69.intStackSize - 1] = var3.relativeY;
         return 1;
      } else if(var0 == 1502) {
         class69.intStack[++class69.intStackSize - 1] = var3.width;
         return 1;
      } else if(var0 == 1503) {
         class69.intStack[++class69.intStackSize - 1] = var3.height;
         return 1;
      } else if(var0 == 1504) {
         class69.intStack[++class69.intStackSize - 1] = var3.isHidden?1:0;
         return 1;
      } else if(var0 == 1505) {
         class69.intStack[++class69.intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lev;III)Lcx;",
      garbageValue = "30833833"
   )
   public static final AbstractSoundSystem method1582(Signlink var0, int var1, int var2) {
      if(AbstractSoundSystem.sampleRate == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            AbstractSoundSystem var3 = AbstractSoundSystem.soundTaskDataProvider.vmethod2052();
            var3.samples = new int[(AbstractSoundSystem.audioHighMemory?2:1) * 256];
            var3.field1303 = var2;
            var3.vmethod2176();
            var3.offset = (var2 & -1024) + 1024;
            if(var3.offset > 16384) {
               var3.offset = 16384;
            }

            var3.create(var3.offset);
            if(WorldMapType2.field230 > 0 && class69.task == null) {
               class69.task = new SoundTask();
               UrlRequester.field1855 = Executors.newScheduledThreadPool(1);
               UrlRequester.field1855.scheduleAtFixedRate(class69.task, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class69.task != null) {
               if(class69.task.systems[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class69.task.systems[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new AbstractSoundSystem();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1540740873"
   )
   static void method1604() {
      PacketNode var0 = class26.method433(ClientPacket.field2215, Client.field626.field1218);
      PacketBuffer var1 = var0.packetBuffer;
      int var2 = Client.isResized?2:1;
      var1.putByte(var2);
      var0.packetBuffer.putShort(Varcs.canvasWidth);
      var0.packetBuffer.putShort(BuildType.canvasHeight);
      Client.field626.method1980(var0);
   }
}
