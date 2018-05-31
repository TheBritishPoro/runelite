import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class24 {
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -1187037229
   )
   static int field203;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lc;"
   )
   static final class24 field208;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lc;"
   )
   static final class24 field204;
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexWorldMap")
   static IndexData indexWorldMap;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -636830447
   )
   final int field205;

   static {
      field208 = new class24(0);
      field204 = new class24(1);
   }

   class24(int var1) {
      this.field205 = var1;
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1818336157"
   )
   static final void method424(boolean var0) {
      for(int var1 = 0; var1 < Client.npcIndexesCount; ++var1) {
         NPC var2 = Client.cachedNPCs[Client.npcIndices[var1]];
         if(var2 != null && var2.hasConfig() && var2.composition.isVisible == var0 && var2.composition.method5165()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if(var2.field874 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if(Client.field761[var3][var4] == Client.field687) {
                     continue;
                  }

                  Client.field761[var3][var4] = Client.field687;
               }

               long var5 = class76.method1804(0, 0, 1, !var2.composition.field3504, Client.npcIndices[var1]);
               var2.field889 = Client.gameCycle;
               MapIcon.region.method2883(class13.plane, var2.x, var2.y, WorldMapType2.getTileHeight(var2.field874 * 64 - 64 + var2.x, var2.field874 * 64 - 64 + var2.y, class13.plane), var2.field874 * 64 - 64 + 60, var2, var2.angle, var5, var2.field873);
            }
         }
      }

   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(Lhi;B)I",
      garbageValue = "-51"
   )
   @Export("getWidgetClickMask")
   static int getWidgetClickMask(Widget var0) {
      IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.index + ((long)var0.id << 32));
      return var1 != null?var1.value:var0.clickMask;
   }
}
