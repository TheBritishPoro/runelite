import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("SoundTask")
public class SoundTask implements Runnable {
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("configsIndex")
   static IndexData configsIndex;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lcx;"
   )
   @Export("systems")
   volatile AbstractSoundSystem[] systems;

   SoundTask() {
      this.systems = new AbstractSoundSystem[2];
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            AbstractSoundSystem var2 = this.systems[var1];
            if(var2 != null) {
               var2.method2144();
            }
         }
      } catch (Exception var4) {
         UnitPriceComparator.processClientError((String)null, var4);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1865447879"
   )
   public static boolean method2214(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZB)[B",
      garbageValue = "0"
   )
   @Export("toByteArray")
   public static byte[] toByteArray(Object var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])var0);
         return var1?class59.method1075(var3):var3;
      } else if(var0 instanceof AbstractByteBuffer) {
         AbstractByteBuffer var2 = (AbstractByteBuffer)var0;
         return var2.get();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1818249317"
   )
   static final void method2213() {
      Client.field626.close();
      class54.method1020();
      MapIcon.region.reset();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].reset();
      }

      System.gc();
      class26.method427(2);
      Client.field812 = -1;
      Client.field813 = false;

      for(class68 var1 = (class68)class68.field985.getFront(); var1 != null; var1 = (class68)class68.field985.getNext()) {
         if(var1.field993 != null) {
            MapIconReference.field310.method2009(var1.field993);
            var1.field993 = null;
         }

         if(var1.field980 != null) {
            MapIconReference.field310.method2009(var1.field980);
            var1.field980 = null;
         }
      }

      class68.field985.clear();
      MouseInput.setGameState(10);
   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-902888602"
   )
   static void method2215() {
      if(class21.field175 != null) {
         Client.field650 = Client.gameCycle;
         class21.field175.method4774();

         for(int var0 = 0; var0 < Client.cachedPlayers.length; ++var0) {
            if(Client.cachedPlayers[var0] != null) {
               class21.field175.method4773((Client.cachedPlayers[var0].x >> 7) + PendingSpawn.baseX, (Client.cachedPlayers[var0].y >> 7) + Client.baseY);
            }
         }
      }

   }
}
