import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class class54 {
   @ObfuscatedName("ov")
   static boolean field489;
   @ObfuscatedName("dd")
   @Export("host")
   static String host;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1976820406"
   )
   static void method1021(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      FileRequest var4 = (FileRequest)class250.NetCache_pendingWrites.get(var2);
      if(var4 != null) {
         class250.NetCache_pendingWritesQueue.setHead(var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "152334198"
   )
   static void method1018() {
      FileOnDisk var0 = null;

      try {
         var0 = MapLabel.getPreferencesFile("", ItemLayer.field1455.name, true);
         Buffer var1 = class10.preferences.serialize();
         var0.write(var1.payload, 0, var1.offset);
      } catch (Exception var3) {
         ;
      }

      try {
         if(var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
         ;
      }

   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2135811490"
   )
   static final void method1020() {
      class43.method715();
      FloorUnderlayDefinition.underlays.reset();
      KitDefinition.identKits.reset();
      TotalQuantityComparator.method34();
      NPCComposition.npcs.reset();
      NPCComposition.npcModelCache.reset();
      MouseRecorder.method1036();
      Sequence.sequences.reset();
      Sequence.skeletons.reset();
      Spotanim.spotanims.reset();
      Spotanim.SpotAnimationDefinition_cachedModels.reset();
      Varbit.varbits.reset();
      VarPlayerType.varplayers.reset();
      class267.field3349.reset();
      class267.field3356.reset();
      class267.field3351.reset();
      CombatInfo2.field3305.reset();
      CombatInfo2.field3306.reset();
      class265.field3334.reset();
      class264.field3328.reset();
      ServerPacket.method3444();
      class192.method3871();
      class68.method1698();
      ((TextureProvider)Graphics3D.textureLoader).reset();
      Script.field1190.reset();
      AttackOption.indexInterfaces.reset();
      class37.indexSoundEffects.reset();
      class224.indexCache3.reset();
      UrlRequester.indexCache4.reset();
      FileRequest.indexMaps.reset();
      Item.indexTrack1.reset();
      class21.indexModels.reset();
      GZipDecompressor.indexSprites.reset();
      ObjectComposition.indexTextures.reset();
      MapLabel.indexCache10.reset();
      OwnWorldComparator.indexTrack2.reset();
      Client.indexScripts.reset();
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2123313201"
   )
   static final void method1017() {
      if(Actor.soundSystem1 != null) {
         Actor.soundSystem1.method2144();
      }

      if(MapIcon.soundSystem0 != null) {
         MapIcon.soundSystem0.method2144();
      }

   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-93"
   )
   static void method1019() {
      if(Client.field707 >= 0 && Client.cachedPlayers[Client.field707] != null) {
         class11.method98(Client.cachedPlayers[Client.field707], false);
      }

   }
}
