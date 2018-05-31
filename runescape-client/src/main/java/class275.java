import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class275 {
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1245904188"
   )
   static void method5239() {
      if(ItemContainer.renderOverview != null) {
         ItemContainer.renderOverview.method6011(class13.plane, (class138.localPlayer.x >> 7) + PendingSpawn.baseX, (class138.localPlayer.y >> 7) + Client.baseY, false);
         ItemContainer.renderOverview.method6027();
      }

   }
}
