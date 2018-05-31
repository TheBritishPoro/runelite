import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class184 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -7929231222859405373L
   )
   static long field2351;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 2010951404606687319L
   )
   static long field2350;

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "805819777"
   )
   static void method3785(int var0, int var1) {
      int var2 = ClanMemberManager.fontBold12.getTextWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionCount; ++var3) {
         var4 = ClanMemberManager.fontBold12.getTextWidth(WorldMapType1.method176(var3));
         if(var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if(var2 + var4 > Varcs.canvasWidth) {
         var4 = Varcs.canvasWidth - var2;
      }

      if(var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if(var1 + var3 > BuildType.canvasHeight) {
         var5 = BuildType.canvasHeight - var3;
      }

      if(var5 < 0) {
         var5 = 0;
      }

      MouseInput.menuX = var4;
      WorldComparator.menuY = var5;
      UrlRequester.field1856 = var2;
      class151.field1933 = Client.menuOptionCount * 15 + 22;
   }
}
