import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class11 {
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1317413597
   )
   static int field68;
   @ObfuscatedName("c")
   static int[] field69;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;Lir;S)V",
      garbageValue = "22982"
   )
   public static void method100(IndexDataBase var0, IndexDataBase var1, IndexDataBase var2, IndexDataBase var3) {
      Widget.widgetIndex = var0;
      Widget.field2642 = var1;
      Signlink.field1956 = var2;
      Widget.field2598 = var3;
      GameCanvas.widgets = new Widget[Widget.widgetIndex.size()][];
      GZipDecompressor.validInterfaces = new boolean[Widget.widgetIndex.size()];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1543564143"
   )
   static int method99() {
      return 11;
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(Lbu;ZI)V",
      garbageValue = "-863688081"
   )
   static void method98(Player var0, boolean var1) {
      if(var0 != null && var0.hasConfig() && !var0.hidden) {
         var0.isLowDetail = false;
         if((Client.lowMemory && class81.playerIndexesCount > 50 || class81.playerIndexesCount > 200) && var1 && var0.idlePoseAnimation == var0.poseAnimation) {
            var0.isLowDetail = true;
         }

         int var2 = var0.x >> 7;
         int var3 = var0.y >> 7;
         if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class76.method1804(0, 0, 0, false, var0.playerId);
            if(var0.model != null && Client.gameCycle >= var0.animationCycleStart && Client.gameCycle < var0.animationCycleEnd) {
               var0.isLowDetail = false;
               var0.field562 = WorldMapType2.getTileHeight(var0.x, var0.y, class13.plane);
               var0.field889 = Client.gameCycle;
               MapIcon.region.method3010(class13.plane, var0.x, var0.y, var0.field562, 60, var0, var0.angle, var4, var0.field559, var0.field547, var0.field565, var0.field553);
            } else {
               if((var0.x & 127) == 64 && (var0.y & 127) == 64) {
                  if(Client.field761[var2][var3] == Client.field687) {
                     return;
                  }

                  Client.field761[var2][var3] = Client.field687;
               }

               var0.field562 = WorldMapType2.getTileHeight(var0.x, var0.y, class13.plane);
               var0.field889 = Client.gameCycle;
               MapIcon.region.method2883(class13.plane, var0.x, var0.y, var0.field562, 60, var0, var0.angle, var4, var0.field873);
            }
         }
      }

   }
}
