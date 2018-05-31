import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("MapCacheArchiveNames")
public class MapCacheArchiveNames {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   @Export("DETAILS")
   public static final MapCacheArchiveNames DETAILS;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   @Export("COMPOSITE_MAP")
   public static final MapCacheArchiveNames COMPOSITE_MAP;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   @Export("COMPOSITE_TEXTURE")
   public static final MapCacheArchiveNames COMPOSITE_TEXTURE;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   @Export("AREA")
   public static final MapCacheArchiveNames AREA;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   @Export("LABELS")
   public static final MapCacheArchiveNames LABELS;
   @ObfuscatedName("ak")
   static FontMetrics field256;
   @ObfuscatedName("ff")
   static byte[][] field253;
   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "Lde;"
   )
   static TextureProvider field250;
   @ObfuscatedName("q")
   @Export("name")
   public final String name;

   static {
      DETAILS = new MapCacheArchiveNames("details");
      COMPOSITE_MAP = new MapCacheArchiveNames("compositemap");
      COMPOSITE_TEXTURE = new MapCacheArchiveNames("compositetexture");
      AREA = new MapCacheArchiveNames("area");
      LABELS = new MapCacheArchiveNames("labels");
   }

   MapCacheArchiveNames(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1545308790"
   )
   static void method476() {
      try {
         File var0 = new File(WorldMapType1.userHome, "random.dat");
         int var2;
         if(var0.exists()) {
            class155.randomDat = new CacheFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
         } else {
            label38:
            for(int var1 = 0; var1 < class8.field52.length; ++var1) {
               for(var2 = 0; var2 < class155.cacheLocations.length; ++var2) {
                  File var3 = new File(class155.cacheLocations[var2] + class8.field52[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     class155.randomDat = new CacheFile(new FileOnDisk(var3, "rw", 25L), 24, 0);
                     break label38;
                  }
               }
            }
         }

         if(class155.randomDat == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            class155.randomDat = new CacheFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "123"
   )
   static int method477(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 3903) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if(var0 == 3904) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].itemId;
         return 1;
      } else if(var0 == 3905) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].price;
         return 1;
      } else if(var0 == 3906) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if(var0 == 3907) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].quantitySold;
         return 1;
      } else if(var0 == 3908) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.intStack[++class69.intStackSize - 1] = Client.grandExchangeOffers[var3].spent;
         return 1;
      } else {
         int var12;
         if(var0 == 3910) {
            var3 = class69.intStack[--class69.intStackSize];
            var12 = Client.grandExchangeOffers[var3].status();
            class69.intStack[++class69.intStackSize - 1] = var12 == 0?1:0;
            return 1;
         } else if(var0 == 3911) {
            var3 = class69.intStack[--class69.intStackSize];
            var12 = Client.grandExchangeOffers[var3].status();
            class69.intStack[++class69.intStackSize - 1] = var12 == 2?1:0;
            return 1;
         } else if(var0 == 3912) {
            var3 = class69.intStack[--class69.intStackSize];
            var12 = Client.grandExchangeOffers[var3].status();
            class69.intStack[++class69.intStackSize - 1] = var12 == 5?1:0;
            return 1;
         } else if(var0 == 3913) {
            var3 = class69.intStack[--class69.intStackSize];
            var12 = Client.grandExchangeOffers[var3].status();
            class69.intStack[++class69.intStackSize - 1] = var12 == 1?1:0;
            return 1;
         } else {
            boolean var13;
            if(var0 == 3914) {
               var13 = class69.intStack[--class69.intStackSize] == 1;
               if(WorldMapDecoration.grandExchangeEvents != null) {
                  WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field11, var13);
               }

               return 1;
            } else if(var0 == 3915) {
               var13 = class69.intStack[--class69.intStackSize] == 1;
               if(WorldMapDecoration.grandExchangeEvents != null) {
                  WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field13, var13);
               }

               return 1;
            } else if(var0 == 3916) {
               class69.intStackSize -= 2;
               var13 = class69.intStack[class69.intStackSize] == 1;
               boolean var4 = class69.intStack[class69.intStackSize + 1] == 1;
               if(WorldMapDecoration.grandExchangeEvents != null) {
                  Client.field665.field575 = var4;
                  WorldMapDecoration.grandExchangeEvents.sort(Client.field665, var13);
               }

               return 1;
            } else if(var0 == 3917) {
               var13 = class69.intStack[--class69.intStackSize] == 1;
               if(WorldMapDecoration.grandExchangeEvents != null) {
                  WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field9, var13);
               }

               return 1;
            } else if(var0 == 3918) {
               var13 = class69.intStack[--class69.intStackSize] == 1;
               if(WorldMapDecoration.grandExchangeEvents != null) {
                  WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field16, var13);
               }

               return 1;
            } else if(var0 == 3919) {
               class69.intStack[++class69.intStackSize - 1] = WorldMapDecoration.grandExchangeEvents == null?0:WorldMapDecoration.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var11;
               if(var0 == 3920) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.intStack[++class69.intStackSize - 1] = var11.world;
                  return 1;
               } else if(var0 == 3921) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var11.method16();
                  return 1;
               } else if(var0 == 3922) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var11.method18();
                  return 1;
               } else if(var0 == 3923) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  long var5 = Buffer.method3547() - GraphicsObject.field1013 - var11.field20;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var10;
                  return 1;
               } else if(var0 == 3924) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.intStack[++class69.intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if(var0 == 3925) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.intStack[++class69.intStackSize - 1] = var11.grandExchangeOffer.price;
                  return 1;
               } else if(var0 == 3926) {
                  var3 = class69.intStack[--class69.intStackSize];
                  var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
                  class69.intStack[++class69.intStackSize - 1] = var11.grandExchangeOffer.itemId;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "120"
   )
   @Export("load")
   static void load() {
      int var0;
      if(Client.loadingStage == 0) {
         MapIcon.region = new Region(4, 104, 104, class50.tileHeights);

         for(var0 = 0; var0 < 4; ++var0) {
            Client.collisionMaps[var0] = new CollisionData(104, 104);
         }

         NPC.minimapSprite = new SpritePixels(512, 512);
         class78.loadingText = "Starting game engine...";
         class78.loadingBarPercentage = 5;
         Client.loadingStage = 20;
      } else {
         int var1;
         int var2;
         int var3;
         int var4;
         if(Client.loadingStage == 20) {
            int[] var33 = new int[9];

            for(var1 = 0; var1 < 9; ++var1) {
               var2 = var1 * 32 + 15 + 128;
               var3 = var2 * 3 + 600;
               var4 = Graphics3D.SINE[var2];
               var33[var1] = var4 * var3 >> 16;
            }

            Region.buildVisibilityMaps(var33, 500, 800, 512, 334);
            class78.loadingText = "Prepared visibility map";
            class78.loadingBarPercentage = 10;
            Client.loadingStage = 30;
         } else if(Client.loadingStage == 30) {
            AttackOption.indexInterfaces = ItemContainer.openCacheIndex(0, false, true, true);
            class37.indexSoundEffects = ItemContainer.openCacheIndex(1, false, true, true);
            SoundTask.configsIndex = ItemContainer.openCacheIndex(2, true, false, true);
            class224.indexCache3 = ItemContainer.openCacheIndex(3, false, true, true);
            UrlRequester.indexCache4 = ItemContainer.openCacheIndex(4, false, true, true);
            FileRequest.indexMaps = ItemContainer.openCacheIndex(5, true, true, true);
            Item.indexTrack1 = ItemContainer.openCacheIndex(6, true, true, true);
            class21.indexModels = ItemContainer.openCacheIndex(7, false, true, true);
            GZipDecompressor.indexSprites = ItemContainer.openCacheIndex(8, false, true, true);
            ObjectComposition.indexTextures = ItemContainer.openCacheIndex(9, false, true, true);
            MapLabel.indexCache10 = ItemContainer.openCacheIndex(10, false, true, true);
            OwnWorldComparator.indexTrack2 = ItemContainer.openCacheIndex(11, false, true, true);
            Client.indexScripts = ItemContainer.openCacheIndex(12, false, true, true);
            class50.indexCache13 = ItemContainer.openCacheIndex(13, true, false, true);
            class59.vorbisIndex = ItemContainer.openCacheIndex(14, false, true, true);
            MapIconReference.indexCache15 = ItemContainer.openCacheIndex(15, false, true, true);
            class24.indexWorldMap = ItemContainer.openCacheIndex(16, true, true, true);
            class78.loadingText = "Connecting to update server";
            class78.loadingBarPercentage = 20;
            Client.loadingStage = 40;
         } else if(Client.loadingStage == 40) {
            byte var30 = 0;
            var0 = var30 + AttackOption.indexInterfaces.percentage() * 4 / 100;
            var0 += class37.indexSoundEffects.percentage() * 4 / 100;
            var0 += SoundTask.configsIndex.percentage() * 2 / 100;
            var0 += class224.indexCache3.percentage() * 2 / 100;
            var0 += UrlRequester.indexCache4.percentage() * 6 / 100;
            var0 += FileRequest.indexMaps.percentage() * 4 / 100;
            var0 += Item.indexTrack1.percentage() * 2 / 100;
            var0 += class21.indexModels.percentage() * 58 / 100;
            var0 += GZipDecompressor.indexSprites.percentage() * 2 / 100;
            var0 += ObjectComposition.indexTextures.percentage() * 2 / 100;
            var0 += MapLabel.indexCache10.percentage() * 2 / 100;
            var0 += OwnWorldComparator.indexTrack2.percentage() * 2 / 100;
            var0 += Client.indexScripts.percentage() * 2 / 100;
            var0 += class50.indexCache13.percentage() * 2 / 100;
            var0 += class59.vorbisIndex.percentage() * 2 / 100;
            var0 += MapIconReference.indexCache15.percentage() * 2 / 100;
            var0 += class24.indexWorldMap.percentage() * 2 / 100;
            if(var0 != 100) {
               if(var0 != 0) {
                  class78.loadingText = "Checking for updates - " + var0 + "%";
               }

               class78.loadingBarPercentage = 30;
            } else {
               class32.method548(AttackOption.indexInterfaces, "Animations");
               class32.method548(class37.indexSoundEffects, "Skeletons");
               class32.method548(UrlRequester.indexCache4, "Sound FX");
               class32.method548(FileRequest.indexMaps, "Maps");
               class32.method548(Item.indexTrack1, "Music Tracks");
               class32.method548(class21.indexModels, "Models");
               class32.method548(GZipDecompressor.indexSprites, "Sprites");
               class32.method548(OwnWorldComparator.indexTrack2, "Music Jingles");
               class32.method548(class59.vorbisIndex, "Music Samples");
               class32.method548(MapIconReference.indexCache15, "Music Patches");
               class32.method548(class24.indexWorldMap, "World Map");
               class78.loadingText = "Loaded update list";
               class78.loadingBarPercentage = 30;
               Client.loadingStage = 45;
            }
         } else {
            IndexData var25;
            IndexData var27;
            if(Client.loadingStage == 45) {
               class68.method1697(22050, !Client.lowMemory, 2);
               class218 var32 = new class218();
               var32.method4257(9, 128);
               MapIcon.soundSystem0 = World.method1582(GameEngine.taskManager, 0, 22050);
               MapIcon.soundSystem0.method2143(var32);
               var25 = MapIconReference.indexCache15;
               IndexData var26 = class59.vorbisIndex;
               var27 = UrlRequester.indexCache4;
               class177.field2284 = var25;
               class217.field2464 = var26;
               class217.field2458 = var27;
               class217.field2459 = var32;
               Actor.soundSystem1 = World.method1582(GameEngine.taskManager, 1, 2048);
               MapIconReference.field310 = new class88();
               Actor.soundSystem1.method2143(MapIconReference.field310);
               OwnWorldComparator.field577 = new Resampler(22050, AbstractSoundSystem.sampleRate);
               class78.loadingText = "Prepared sound engine";
               class78.loadingBarPercentage = 35;
               Client.loadingStage = 50;
               GrandExchangeEvents.fonts = new Fonts(GZipDecompressor.indexSprites, class50.indexCache13);
            } else if(Client.loadingStage == 50) {
               var0 = FontName.method5498().length;
               Client.fontsMap = GrandExchangeEvents.fonts.createMap(FontName.method5498());
               if(Client.fontsMap.size() < var0) {
                  class78.loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%";
                  class78.loadingBarPercentage = 40;
               } else {
                  class151.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
                  Actor.font_p12full = (Font)Client.fontsMap.get(FontName.FontName_plain12);
                  ClanMemberManager.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
                  WorldMapType2.platformInfo = new MachineInfo(true);
                  class78.loadingText = "Loaded fonts";
                  class78.loadingBarPercentage = 40;
                  Client.loadingStage = 60;
               }
            } else if(Client.loadingStage == 60) {
               var0 = class224.method4426(MapLabel.indexCache10, GZipDecompressor.indexSprites);
               var1 = class11.method99();
               if(var0 < var1) {
                  class78.loadingText = "Loading title screen - " + var0 * 100 / var1 + "%";
                  class78.loadingBarPercentage = 50;
               } else {
                  class78.loadingText = "Loaded title screen";
                  class78.loadingBarPercentage = 50;
                  MouseInput.setGameState(5);
                  Client.loadingStage = 70;
               }
            } else if(Client.loadingStage == 70) {
               if(!SoundTask.configsIndex.method4629()) {
                  class78.loadingText = "Loading config - " + SoundTask.configsIndex.loadPercent() + "%";
                  class78.loadingBarPercentage = 60;
               } else {
                  class21.method277(SoundTask.configsIndex);
                  MessageNode.method1069(SoundTask.configsIndex);
                  VarCString.method4851(SoundTask.configsIndex, class21.indexModels);
                  IndexData var31 = SoundTask.configsIndex;
                  var25 = class21.indexModels;
                  boolean var29 = Client.lowMemory;
                  ObjectComposition.objects_ref = var31;
                  Frames.field1801 = var25;
                  ObjectComposition.objectCompositionLowDetail = var29;
                  var27 = SoundTask.configsIndex;
                  IndexData var28 = class21.indexModels;
                  NPCComposition.NpcDefinition_indexCache = var27;
                  NPCComposition.NpcDefinition_modelIndexCache = var28;
                  IndexData var5 = SoundTask.configsIndex;
                  class7.field42 = var5;
                  IndexData var6 = SoundTask.configsIndex;
                  IndexData var7 = class21.indexModels;
                  boolean var8 = Client.isMembers;
                  Font var9 = class151.fontPlain11;
                  ItemComposition.item_ref = var6;
                  ItemComposition.ItemDefinition_modelIndexCache = var7;
                  ItemComposition.isMembersWorld = var8;
                  ChatLineBuffer.field1212 = ItemComposition.item_ref.fileCount(10);
                  ItemComposition.field3466 = var9;
                  IndexData var10 = SoundTask.configsIndex;
                  IndexData var11 = AttackOption.indexInterfaces;
                  IndexData var12 = class37.indexSoundEffects;
                  Sequence.seq_ref = var10;
                  Sequence.skel_ref = var11;
                  Sequence.skin_ref = var12;
                  IndexData var13 = SoundTask.configsIndex;
                  IndexData var14 = class21.indexModels;
                  Spotanim.SpotAnimationDefinition_indexCache = var13;
                  Spotanim.SpotAnimationDefinition_modelIndexCache = var14;
                  IndexData var15 = SoundTask.configsIndex;
                  Varbit.varbit_ref = var15;
                  IndexData var16 = SoundTask.configsIndex;
                  WorldComparator.varplayer_ref = var16;
                  VarPlayerType.field3232 = WorldComparator.varplayer_ref.fileCount(16);
                  class11.method100(class224.indexCache3, class21.indexModels, GZipDecompressor.indexSprites, class50.indexCache13);
                  Timer.method3344(SoundTask.configsIndex);
                  IndexData var17 = SoundTask.configsIndex;
                  Enum.EnumDefinition_indexCache = var17;
                  FaceNormal.method3072(SoundTask.configsIndex);
                  IndexData var18 = SoundTask.configsIndex;
                  VarCString.field3264 = var18;
                  IndexData var19 = SoundTask.configsIndex;
                  class264.field3327 = var19;
                  MapLabel.varcs = new Varcs();
                  class250.method4766(SoundTask.configsIndex, GZipDecompressor.indexSprites, class50.indexCache13);
                  class144.method3181(SoundTask.configsIndex, GZipDecompressor.indexSprites);
                  IndexData var20 = SoundTask.configsIndex;
                  IndexData var21 = GZipDecompressor.indexSprites;
                  Area.field3237 = var21;
                  if(var20.method4629()) {
                     Area.field3236 = var20.fileCount(35);
                     Area.mapAreaType = new Area[Area.field3236];

                     for(int var22 = 0; var22 < Area.field3236; ++var22) {
                        byte[] var23 = var20.getConfigData(35, var22);
                        if(var23 != null) {
                           Area.mapAreaType[var22] = new Area(var22);
                           Area.mapAreaType[var22].method4816(new Buffer(var23));
                           Area.mapAreaType[var22].method4828();
                        }
                     }
                  }

                  class78.loadingText = "Loaded config";
                  class78.loadingBarPercentage = 60;
                  Client.loadingStage = 80;
               }
            } else if(Client.loadingStage == 80) {
               var0 = 0;
               if(WallObject.compass == null) {
                  WallObject.compass = class137.method3127(GZipDecompressor.indexSprites, "compass", "");
               } else {
                  ++var0;
               }

               if(UrlRequest.mapedge == null) {
                  UrlRequest.mapedge = class137.method3127(GZipDecompressor.indexSprites, "mapedge", "");
               } else {
                  ++var0;
               }

               if(class25.mapscene == null) {
                  class25.mapscene = class13.getIndexedSprites(GZipDecompressor.indexSprites, "mapscene", "");
               } else {
                  ++var0;
               }

               if(MilliTimer.headIconsPk == null) {
                  MilliTimer.headIconsPk = class21.getSprites(GZipDecompressor.indexSprites, "headicons_pk", "");
               } else {
                  ++var0;
               }

               if(class43.headIconsPrayer == null) {
                  class43.headIconsPrayer = class21.getSprites(GZipDecompressor.indexSprites, "headicons_prayer", "");
               } else {
                  ++var0;
               }

               if(MilliTimer.headIconsHint == null) {
                  MilliTimer.headIconsHint = class21.getSprites(GZipDecompressor.indexSprites, "headicons_hint", "");
               } else {
                  ++var0;
               }

               if(TextureProvider.mapMarkers == null) {
                  TextureProvider.mapMarkers = class21.getSprites(GZipDecompressor.indexSprites, "mapmarker", "");
               } else {
                  ++var0;
               }

               if(class161.crossSprites == null) {
                  class161.crossSprites = class21.getSprites(GZipDecompressor.indexSprites, "cross", "");
               } else {
                  ++var0;
               }

               if(MapIconReference.mapDots == null) {
                  MapIconReference.mapDots = class21.getSprites(GZipDecompressor.indexSprites, "mapdots", "");
               } else {
                  ++var0;
               }

               if(BuildType.scrollbarSprites == null) {
                  BuildType.scrollbarSprites = class13.getIndexedSprites(GZipDecompressor.indexSprites, "scrollbar", "");
               } else {
                  ++var0;
               }

               if(JagexLoginType.modIconSprites == null) {
                  JagexLoginType.modIconSprites = class13.getIndexedSprites(GZipDecompressor.indexSprites, "mod_icons", "");
               } else {
                  ++var0;
               }

               if(var0 < 11) {
                  class78.loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
                  class78.loadingBarPercentage = 70;
               } else {
                  FontTypeFace.modIcons = JagexLoginType.modIconSprites;
                  UrlRequest.mapedge.method5843();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;
                  class25.mapscene[0].method5822(var1 + var4, var2 + var4, var3 + var4);
                  class78.loadingText = "Loaded sprites";
                  class78.loadingBarPercentage = 70;
                  Client.loadingStage = 90;
               }
            } else if(Client.loadingStage == 90) {
               if(!ObjectComposition.indexTextures.method4629()) {
                  class78.loadingText = "Loading textures - " + "0%";
                  class78.loadingBarPercentage = 90;
               } else {
                  field250 = new TextureProvider(ObjectComposition.indexTextures, GZipDecompressor.indexSprites, 20, 0.8D, Client.lowMemory?64:128);
                  Graphics3D.method2789(field250);
                  Graphics3D.setBrightness(0.8D);
                  Client.loadingStage = 100;
               }
            } else if(Client.loadingStage == 100) {
               var0 = field250.method2530();
               if(var0 < 100) {
                  class78.loadingText = "Loading textures - " + var0 + "%";
                  class78.loadingBarPercentage = 90;
               } else {
                  class78.loadingText = "Loaded textures";
                  class78.loadingBarPercentage = 90;
                  Client.loadingStage = 110;
               }
            } else if(Client.loadingStage == 110) {
               class26.mouseRecorder = new MouseRecorder();
               GameEngine.taskManager.createRunnable(class26.mouseRecorder, 10);
               class78.loadingText = "Loaded input handler";
               class78.loadingBarPercentage = 92;
               Client.loadingStage = 120;
            } else if(Client.loadingStage == 120) {
               if(!MapLabel.indexCache10.tryLoadRecordByNames("huffman", "")) {
                  class78.loadingText = "Loading wordpack - " + 0 + "%";
                  class78.loadingBarPercentage = 94;
               } else {
                  Huffman var24 = new Huffman(MapLabel.indexCache10.takeRecordByNames("huffman", ""));
                  DState.method3529(var24);
                  class78.loadingText = "Loaded wordpack";
                  class78.loadingBarPercentage = 94;
                  Client.loadingStage = 130;
               }
            } else if(Client.loadingStage == 130) {
               if(!class224.indexCache3.method4629()) {
                  class78.loadingText = "Loading interfaces - " + class224.indexCache3.loadPercent() * 4 / 5 + "%";
                  class78.loadingBarPercentage = 96;
               } else if(!Client.indexScripts.method4629()) {
                  class78.loadingText = "Loading interfaces - " + (80 + Client.indexScripts.loadPercent() / 6) + "%";
                  class78.loadingBarPercentage = 96;
               } else if(!class50.indexCache13.method4629()) {
                  class78.loadingText = "Loading interfaces - " + (96 + class50.indexCache13.loadPercent() / 50) + "%";
                  class78.loadingBarPercentage = 96;
               } else {
                  class78.loadingText = "Loaded interfaces";
                  class78.loadingBarPercentage = 98;
                  Client.loadingStage = 140;
               }
            } else if(Client.loadingStage == 140) {
               class78.loadingBarPercentage = 100;
               if(!class24.indexWorldMap.tryLoadArchiveByName(DETAILS.name)) {
                  class78.loadingText = "Loading world map - " + class24.indexWorldMap.archiveLoadPercentByName(DETAILS.name) / 10 + "%";
               } else {
                  if(ItemContainer.renderOverview == null) {
                     ItemContainer.renderOverview = new RenderOverview();
                     ItemContainer.renderOverview.method6000(class24.indexWorldMap, ClanMemberManager.fontBold12, Client.fontsMap, class25.mapscene);
                  }

                  var0 = ItemContainer.renderOverview.method6094();
                  if(var0 < 100) {
                     class78.loadingText = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                  } else {
                     class78.loadingText = "Loaded world map";
                     Client.loadingStage = 150;
                  }
               }
            } else if(Client.loadingStage == 150) {
               MouseInput.setGameState(10);
            }
         }
      }
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(Lfl;S)V",
      garbageValue = "-22268"
   )
   static final void method479(class171 var0) {
      PacketBuffer var1 = Client.field626.packetBuffer;
      int var2;
      int var3;
      int var4;
      byte var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      int var37;
      int var39;
      if(class171.field2246 == var0) {
         var2 = var1.readUnsignedShort();
         var3 = var1.readShort();
         byte var38 = var1.readByte();
         var5 = var1.method3660();
         var6 = var1.readUnsignedByte() * 4;
         var7 = var1.method3765();
         var8 = var1.method3765();
         var9 = var1.method3765();
         var10 = (var9 >> 4 & 7) + MouseRecorder.field524;
         var39 = (var9 & 7) + Coordinates.field2568;
         var12 = var1.method3613();
         var13 = var1.method3577() * 4;
         int var40 = var1.readUnsignedShort();
         var4 = var38 + var10;
         var37 = var5 + var39;
         if(var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var4 >= 0 && var37 >= 0 && var4 < 104 && var37 < 104 && var12 != 65535) {
            var10 = var10 * 128 + 64;
            var39 = var39 * 128 + 64;
            var4 = var4 * 128 + 64;
            var37 = var37 * 128 + 64;
            Projectile var15 = new Projectile(var12, class13.plane, var10, var39, WorldMapType2.getTileHeight(var10, var39, class13.plane) - var13, var40 + Client.gameCycle, var2 + Client.gameCycle, var7, var8, var3, var6);
            var15.moveProjectile(var4, var37, WorldMapType2.getTileHeight(var4, var37, class13.plane) - var6, var40 + Client.gameCycle);
            Client.projectiles.addFront(var15);
         }

      } else if(class171.field2243 == var0) {
         var2 = var1.readUnsignedShortOb1();
         var3 = (var2 >> 4 & 7) + MouseRecorder.field524;
         var4 = (var2 & 7) + Coordinates.field2568;
         var37 = var1.method3765();
         var6 = var37 >> 2;
         var7 = var37 & 3;
         var8 = Client.field846[var6];
         var9 = var1.method3613();
         if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            class241.method4602(class13.plane, var3, var4, var8, var9, var6, var7, 0, -1);
         }

      } else if(class171.field2248 == var0) {
         var2 = var1.method3646();
         var3 = var1.readUnsignedByte();
         var4 = var3 >> 2;
         var37 = var3 & 3;
         var6 = Client.field846[var4];
         var7 = var1.readUnsignedByte();
         var8 = (var7 >> 4 & 7) + MouseRecorder.field524;
         var9 = (var7 & 7) + Coordinates.field2568;
         if(var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
            if(var6 == 0) {
               WallObject var31 = MapIcon.region.method2894(class13.plane, var8, var9);
               if(var31 != null) {
                  var39 = KeyFocusListener.method673(var31.hash);
                  if(var4 == 2) {
                     var31.renderable1 = new DynamicObject(var39, 2, var37 + 4, class13.plane, var8, var9, var2, false, var31.renderable1);
                     var31.renderable2 = new DynamicObject(var39, 2, var37 + 1 & 3, class13.plane, var8, var9, var2, false, var31.renderable2);
                  } else {
                     var31.renderable1 = new DynamicObject(var39, var4, var37, class13.plane, var8, var9, var2, false, var31.renderable1);
                  }
               }
            }

            if(var6 == 1) {
               DecorativeObject var41 = MapIcon.region.method2895(class13.plane, var8, var9);
               if(var41 != null) {
                  var39 = KeyFocusListener.method673(var41.hash);
                  if(var4 != 4 && var4 != 5) {
                     if(var4 == 6) {
                        var41.renderable1 = new DynamicObject(var39, 4, var37 + 4, class13.plane, var8, var9, var2, false, var41.renderable1);
                     } else if(var4 == 7) {
                        var41.renderable1 = new DynamicObject(var39, 4, (var37 + 2 & 3) + 4, class13.plane, var8, var9, var2, false, var41.renderable1);
                     } else if(var4 == 8) {
                        var41.renderable1 = new DynamicObject(var39, 4, var37 + 4, class13.plane, var8, var9, var2, false, var41.renderable1);
                        var41.renderable2 = new DynamicObject(var39, 4, (var37 + 2 & 3) + 4, class13.plane, var8, var9, var2, false, var41.renderable2);
                     }
                  } else {
                     var41.renderable1 = new DynamicObject(var39, 4, var37, class13.plane, var8, var9, var2, false, var41.renderable1);
                  }
               }
            }

            if(var6 == 2) {
               GameObject var42 = MapIcon.region.method2896(class13.plane, var8, var9);
               if(var4 == 11) {
                  var4 = 10;
               }

               if(var42 != null) {
                  var42.renderable = new DynamicObject(KeyFocusListener.method673(var42.hash), var4, var37, class13.plane, var8, var9, var2, false, var42.renderable);
               }
            }

            if(var6 == 3) {
               GroundObject var43 = MapIcon.region.getFloorDecoration(class13.plane, var8, var9);
               if(var43 != null) {
                  var43.renderable = new DynamicObject(KeyFocusListener.method673(var43.hash), 22, var37, class13.plane, var8, var9, var2, false, var43.renderable);
               }
            }
         }

      } else if(class171.field2241 == var0) {
         var2 = var1.readUnsignedShort();
         var3 = var1.readUnsignedShort();
         var4 = var1.method3765();
         var37 = (var4 >> 4 & 7) + MouseRecorder.field524;
         var6 = (var4 & 7) + Coordinates.field2568;
         var7 = var1.readUnsignedByte();
         if(var37 >= 0 && var6 >= 0 && var37 < 104 && var6 < 104) {
            var37 = var37 * 128 + 64;
            var6 = var6 * 128 + 64;
            GraphicsObject var44 = new GraphicsObject(var2, class13.plane, var37, var6, WorldMapType2.getTileHeight(var37, var6, class13.plane) - var7, var3, Client.gameCycle);
            Client.graphicsObjectDeque.addFront(var44);
         }

      } else {
         Item var33;
         if(class171.field2249 == var0) {
            var2 = var1.method3765();
            var3 = (var2 >> 4 & 7) + MouseRecorder.field524;
            var4 = (var2 & 7) + Coordinates.field2568;
            var37 = var1.method3613();
            var6 = var1.method3585();
            if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
               var33 = new Item();
               var33.id = var37;
               var33.quantity = var6;
               if(Client.groundItemDeque[class13.plane][var3][var4] == null) {
                  Client.groundItemDeque[class13.plane][var3][var4] = new Deque();
               }

               Client.groundItemDeque[class13.plane][var3][var4].addFront(var33);
               InvType.groundItemSpawned(var3, var4);
            }

         } else if(class171.field2247 == var0) {
            var2 = var1.readUnsignedByte();
            var3 = var2 >> 2;
            var4 = var2 & 3;
            var37 = Client.field846[var3];
            var6 = var1.method3765();
            var7 = (var6 >> 4 & 7) + MouseRecorder.field524;
            var8 = (var6 & 7) + Coordinates.field2568;
            if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
               class241.method4602(class13.plane, var7, var8, var37, -1, var3, var4, 0, -1);
            }

         } else if(class171.field2242 == var0) {
            var2 = var1.method3646();
            var3 = var1.method3577();
            var4 = (var3 >> 4 & 7) + MouseRecorder.field524;
            var37 = (var3 & 7) + Coordinates.field2568;
            if(var4 >= 0 && var37 >= 0 && var4 < 104 && var37 < 104) {
               Deque var34 = Client.groundItemDeque[class13.plane][var4][var37];
               if(var34 != null) {
                  for(var33 = (Item)var34.getFront(); var33 != null; var33 = (Item)var34.getNext()) {
                     if((var2 & 32767) == var33.id) {
                        var33.unlink();
                        break;
                     }
                  }

                  if(var34.getFront() == null) {
                     Client.groundItemDeque[class13.plane][var4][var37] = null;
                  }

                  InvType.groundItemSpawned(var4, var37);
               }
            }

         } else {
            if(class171.field2245 == var0) {
               var2 = var1.readUnsignedShortOb1();
               var3 = (var2 >> 4 & 7) + MouseRecorder.field524;
               var4 = (var2 & 7) + Coordinates.field2568;
               var5 = var1.readByte();
               var6 = var1.readUnsignedShort();
               var7 = var1.readUnsignedShortOb1();
               var8 = var7 >> 2;
               var9 = var7 & 3;
               var10 = Client.field846[var8];
               byte var11 = var1.readByte();
               var12 = var1.readUnsignedShort();
               var13 = var1.method3585();
               byte var14 = var1.method3610();
               int var35 = var1.method3613();
               byte var16 = var1.method3660();
               Player var17;
               if(var35 == Client.localInteractingIndex) {
                  var17 = class138.localPlayer;
               } else {
                  var17 = Client.cachedPlayers[var35];
               }

               if(var17 != null) {
                  ObjectComposition var18 = FileOnDisk.getObjectDefinition(var6);
                  int var19;
                  int var20;
                  if(var9 != 1 && var9 != 3) {
                     var19 = var18.width;
                     var20 = var18.length;
                  } else {
                     var19 = var18.length;
                     var20 = var18.width;
                  }

                  int var21 = var3 + (var19 >> 1);
                  int var22 = var3 + (var19 + 1 >> 1);
                  int var23 = var4 + (var20 >> 1);
                  int var24 = var4 + (var20 + 1 >> 1);
                  int[][] var25 = class50.tileHeights[class13.plane];
                  int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
                  int var27 = (var3 << 7) + (var19 << 6);
                  int var28 = (var4 << 7) + (var20 << 6);
                  Model var29 = var18.method5031(var8, var9, var25, var27, var26, var28);
                  if(var29 != null) {
                     class241.method4602(class13.plane, var3, var4, var10, -1, 0, 0, var12 + 1, var13 + 1);
                     var17.animationCycleStart = var12 + Client.gameCycle;
                     var17.animationCycleEnd = var13 + Client.gameCycle;
                     var17.model = var29;
                     var17.field556 = var3 * 128 + var19 * 64;
                     var17.field558 = var4 * 128 + var20 * 64;
                     var17.field557 = var26;
                     byte var30;
                     if(var14 > var5) {
                        var30 = var14;
                        var14 = var5;
                        var5 = var30;
                     }

                     if(var16 > var11) {
                        var30 = var16;
                        var16 = var11;
                        var11 = var30;
                     }

                     var17.field559 = var14 + var3;
                     var17.field565 = var5 + var3;
                     var17.field547 = var16 + var4;
                     var17.field553 = var4 + var11;
                  }
               }
            }

            if(class171.field2250 == var0) {
               var2 = var1.readUnsignedShortOb1();
               var3 = var1.readUnsignedByte();
               var4 = var3 >> 4 & 15;
               var37 = var3 & 7;
               var6 = var1.readUnsignedShortOb1();
               var7 = (var6 >> 4 & 7) + MouseRecorder.field524;
               var8 = (var6 & 7) + Coordinates.field2568;
               var9 = var1.method3646();
               if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                  var10 = var4 + 1;
                  if(class138.localPlayer.pathX[0] >= var7 - var10 && class138.localPlayer.pathX[0] <= var7 + var10 && class138.localPlayer.pathY[0] >= var8 - var10 && class138.localPlayer.pathY[0] <= var10 + var8 && Client.field815 != 0 && var37 > 0 && Client.queuedSoundEffectCount < 50) {
                     Client.queuedSoundEffectIDs[Client.queuedSoundEffectCount] = var9;
                     Client.unknownSoundValues1[Client.queuedSoundEffectCount] = var37;
                     Client.unknownSoundValues2[Client.queuedSoundEffectCount] = var2;
                     Client.audioEffects[Client.queuedSoundEffectCount] = null;
                     Client.soundLocations[Client.queuedSoundEffectCount] = var4 + (var8 << 8) + (var7 << 16);
                     ++Client.queuedSoundEffectCount;
                  }
               }
            }

            if(class171.field2244 == var0) {
               var2 = var1.readUnsignedByte();
               var3 = (var2 >> 4 & 7) + MouseRecorder.field524;
               var4 = (var2 & 7) + Coordinates.field2568;
               var37 = var1.method3613();
               var6 = var1.method3613();
               var7 = var1.method3646();
               if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  Deque var32 = Client.groundItemDeque[class13.plane][var3][var4];
                  if(var32 != null) {
                     for(Item var36 = (Item)var32.getFront(); var36 != null; var36 = (Item)var32.getNext()) {
                        if((var6 & 32767) == var36.id && var7 == var36.quantity) {
                           var36.quantity = var37;
                           break;
                        }
                     }

                     InvType.groundItemSpawned(var3, var4);
                  }
               }

            }
         }
      }
   }
}
