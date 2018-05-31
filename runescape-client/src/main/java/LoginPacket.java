import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("LoginPacket")
public class LoginPacket implements class167 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final LoginPacket field2237;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static final LoginPacket field2236;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final LoginPacket field2235;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final LoginPacket field2238;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Lfq;"
   )
   static final LoginPacket[] field2240;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1358043829
   )
   @Export("id")
   public final int id;

   static {
      field2237 = new LoginPacket(14, 0);
      field2236 = new LoginPacket(15, 4);
      field2235 = new LoginPacket(16, -2);
      field2238 = new LoginPacket(18, -2);
      field2240 = new LoginPacket[32];
      LoginPacket[] var0 = new LoginPacket[]{field2235, field2236, field2237, field2238};
      LoginPacket[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field2240[var1[var2].id] = var1[var2];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   LoginPacket(int var1, int var2) {
      this.id = var1;
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(IIIIIIIB)V",
      garbageValue = "15"
   )
   static final void method3449(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if(Client.lowMemory && var0 != class13.plane) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if(var1 == 0) {
            var7 = MapIcon.region.method2898(var0, var2, var3);
         }

         if(var1 == 1) {
            var7 = MapIcon.region.method2899(var0, var2, var3);
         }

         if(var1 == 2) {
            var7 = MapIcon.region.method2900(var0, var2, var3);
         }

         if(var1 == 3) {
            var7 = MapIcon.region.method2901(var0, var2, var3);
         }

         int var12;
         if(var7 != 0L) {
            var12 = MapIcon.region.method2902(var0, var2, var3, var7);
            int var14 = KeyFocusListener.method673(var7);
            int var15 = var12 & 31;
            int var16 = var12 >> 6 & 3;
            ObjectComposition var13;
            if(var1 == 0) {
               MapIcon.region.method2889(var0, var2, var3);
               var13 = FileOnDisk.getObjectDefinition(var14);
               if(var13.clipType != 0) {
                  Client.collisionMaps[var0].method3391(var2, var3, var15, var16, var13.blocksProjectile);
               }
            }

            if(var1 == 1) {
               MapIcon.region.method2890(var0, var2, var3);
            }

            if(var1 == 2) {
               MapIcon.region.method2891(var0, var2, var3);
               var13 = FileOnDisk.getObjectDefinition(var14);
               if(var2 + var13.width > 103 || var3 + var13.width > 103 || var2 + var13.length > 103 || var3 + var13.length > 103) {
                  return;
               }

               if(var13.clipType != 0) {
                  Client.collisionMaps[var0].removeObject(var2, var3, var13.width, var13.length, var16, var13.blocksProjectile);
               }
            }

            if(var1 == 3) {
               MapIcon.region.method2971(var0, var2, var3);
               var13 = FileOnDisk.getObjectDefinition(var14);
               if(var13.clipType == 1) {
                  Client.collisionMaps[var0].method3401(var2, var3);
               }
            }
         }

         if(var4 >= 0) {
            var12 = var0;
            if(var0 < 3 && (class50.tileSettings[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            class262.method4939(var0, var12, var2, var3, var4, var5, var6, MapIcon.region, Client.collisionMaps[var0]);
         }
      }

   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129925873"
   )
   static void method3448() {
      for(int var0 = 0; var0 < Client.menuOptionCount; ++var0) {
         if(class173.method3470(Client.menuTypes[var0])) {
            if(var0 < Client.menuOptionCount - 1) {
               for(int var1 = var0; var1 < Client.menuOptionCount - 1; ++var1) {
                  Client.menuOptions[var1] = Client.menuOptions[var1 + 1];
                  Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
                  Client.menuTypes[var1] = Client.menuTypes[var1 + 1];
                  Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
                  Client.menuActionParams0[var1] = Client.menuActionParams0[var1 + 1];
                  Client.menuActionParams1[var1] = Client.menuActionParams1[var1 + 1];
                  Client.menuBooleanArray[var1] = Client.menuBooleanArray[var1 + 1];
               }
            }

            --var0;
            --Client.menuOptionCount;
         }
      }

      class184.method3785(UrlRequester.field1856 / 2 + MouseInput.menuX, WorldComparator.menuY);
   }
}
