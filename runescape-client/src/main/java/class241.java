import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public final class class241 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IS)Ljo;",
      garbageValue = "-21845"
   )
   public static class264 method4603(int var0) {
      class264 var1 = (class264)class264.field3328.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class264.field3327.getConfigData(11, var0);
         var1 = new class264();
         if(var2 != null) {
            var1.method4948(new Buffer(var2));
         }

         var1.method4954();
         class264.field3328.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIB)V",
      garbageValue = "-35"
   )
   static final void method4602(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      PendingSpawn var9 = null;

      for(PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.getFront(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.getNext()) {
         if(var0 == var10.level && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
            var9 = var10;
            break;
         }
      }

      if(var9 == null) {
         var9 = new PendingSpawn();
         var9.level = var0;
         var9.type = var3;
         var9.x = var1;
         var9.y = var2;
         class74.method1800(var9);
         Client.pendingSpawns.addFront(var9);
      }

      var9.id = var4;
      var9.field864 = var5;
      var9.orientation = var6;
      var9.delay = var7;
      var9.hitpoints = var8;
   }
}
