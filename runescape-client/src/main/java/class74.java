import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class74 {
   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(Lbl;B)V",
      garbageValue = "7"
   )
   static final void method1800(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var0.type == 0) {
         var1 = MapIcon.region.method2898(var0.level, var0.x, var0.y);
      }

      if(var0.type == 1) {
         var1 = MapIcon.region.method2899(var0.level, var0.x, var0.y);
      }

      if(var0.type == 2) {
         var1 = MapIcon.region.method2900(var0.level, var0.x, var0.y);
      }

      if(var0.type == 3) {
         var1 = MapIcon.region.method2901(var0.level, var0.x, var0.y);
      }

      if(0L != var1) {
         int var6 = MapIcon.region.method2902(var0.level, var0.x, var0.y, var1);
         var3 = KeyFocusListener.method673(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field859 = var3;
      var0.field866 = var4;
      var0.field865 = var5;
   }
}
