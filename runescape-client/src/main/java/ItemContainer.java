import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ItemContainer")
public class ItemContainer extends Node {
   @ObfuscatedName("ri")
   @ObfuscatedSignature(
      signature = "Llw;"
   )
   @Export("renderOverview")
   static RenderOverview renderOverview;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("itemContainers")
   static HashTable itemContainers;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static IndexedSprite field472;
   @ObfuscatedName("w")
   @Export("itemIds")
   int[] itemIds;
   @ObfuscatedName("s")
   @Export("stackSizes")
   int[] stackSizes;

   static {
      itemContainers = new HashTable(32);
   }

   ItemContainer() {
      this.itemIds = new int[]{-1};
      this.stackSizes = new int[]{0};
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(IZZZB)Lic;",
      garbageValue = "95"
   )
   @Export("openCacheIndex")
   static IndexData openCacheIndex(int var0, boolean var1, boolean var2, boolean var3) {
      IndexFile var4 = null;
      if(class155.dat2File != null) {
         var4 = new IndexFile(var0, class155.dat2File, class76.idxFiles[var0], 1000000);
      }

      return new IndexData(var4, class34.indexStore255, var0, var1, var2, var3);
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1595845951"
   )
   static final void method1012() {
      for(int var0 = 0; var0 < class81.playerIndexesCount; ++var0) {
         Player var1 = Client.cachedPlayers[class81.playerIndices[var0]];
         var1.method1084();
      }

      class37.method640();
      if(WorldMapType3.clanMemberManager != null) {
         WorldMapType3.clanMemberManager.method5467();
      }

   }
}
