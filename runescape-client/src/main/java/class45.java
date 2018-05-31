import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class45 {
   @ObfuscatedName("z")
   static Applet field378;
   @ObfuscatedName("w")
   static String field379;

   static {
      field378 = null;
      field379 = "";
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;B)V",
      garbageValue = "66"
   )
   static void method747(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = class146.getWidgetChild(var1, var2);
      if(var5 != null) {
         if(var5.onOpListener != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.source = var5;
            var6.op = var0;
            var6.opbase = var4;
            var6.params = var5.onOpListener;
            class68.method1696(var6);
         }

         boolean var11 = true;
         if(var5.contentType > 0) {
            var11 = class25.method426(var5);
         }

         if(var11) {
            int var8 = class24.getWidgetClickMask(var5);
            int var9 = var0 - 1;
            boolean var7 = (var8 >> var9 + 1 & 1) != 0;
            if(var7) {
               PacketNode var10;
               if(var0 == 1) {
                  var10 = class26.method433(ClientPacket.field2149, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 2) {
                  var10 = class26.method433(ClientPacket.field2141, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 3) {
                  var10 = class26.method433(ClientPacket.field2155, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 4) {
                  var10 = class26.method433(ClientPacket.field2144, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 5) {
                  var10 = class26.method433(ClientPacket.field2213, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 6) {
                  var10 = class26.method433(ClientPacket.field2231, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 7) {
                  var10 = class26.method433(ClientPacket.field2160, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 8) {
                  var10 = class26.method433(ClientPacket.field2226, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 9) {
                  var10 = class26.method433(ClientPacket.field2138, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

               if(var0 == 10) {
                  var10 = class26.method433(ClientPacket.field2180, Client.field626.field1218);
                  var10.packetBuffer.putInt(var1);
                  var10.packetBuffer.putShort(var2);
                  var10.packetBuffer.putShort(var3);
                  Client.field626.method1980(var10);
               }

            }
         }
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-65961600"
   )
   static final void method749(int var0) {
      FontName.method5501();
      class6.method75();
      int var1 = Actor.method1549(var0).configType;
      if(var1 != 0) {
         int var2 = class225.clientVarps[var0];
         if(var1 == 1) {
            if(var2 == 1) {
               Graphics3D.setBrightness(0.9D);
               ((TextureProvider)Graphics3D.textureLoader).brightness(0.9D);
            }

            if(var2 == 2) {
               Graphics3D.setBrightness(0.8D);
               ((TextureProvider)Graphics3D.textureLoader).brightness(0.8D);
            }

            if(var2 == 3) {
               Graphics3D.setBrightness(0.7D);
               ((TextureProvider)Graphics3D.textureLoader).brightness(0.7D);
            }

            if(var2 == 4) {
               Graphics3D.setBrightness(0.6D);
               ((TextureProvider)Graphics3D.textureLoader).brightness(0.6D);
            }

            ItemComposition.itemSpriteCache.reset();
         }

         if(var1 == 3) {
            short var3 = 0;
            if(var2 == 0) {
               var3 = 255;
            }

            if(var2 == 1) {
               var3 = 192;
            }

            if(var2 == 2) {
               var3 = 128;
            }

            if(var2 == 3) {
               var3 = 64;
            }

            if(var2 == 4) {
               var3 = 0;
            }

            if(var3 != Client.field811) {
               if(Client.field811 == 0 && Client.field812 != -1) {
                  Actor.method1554(Item.indexTrack1, Client.field812, 0, var3, false);
                  Client.field813 = false;
               } else if(var3 == 0) {
                  class9.method88();
                  Client.field813 = false;
               } else if(class217.field2460 != 0) {
                  class309.field3740 = var3;
               } else {
                  class217.field2459.method4236(var3);
               }

               Client.field811 = var3;
            }
         }

         if(var1 == 4) {
            if(var2 == 0) {
               Client.field814 = 127;
            }

            if(var2 == 1) {
               Client.field814 = 96;
            }

            if(var2 == 2) {
               Client.field814 = 64;
            }

            if(var2 == 3) {
               Client.field814 = 32;
            }

            if(var2 == 4) {
               Client.field814 = 0;
            }
         }

         if(var1 == 5) {
            Client.field715 = var2;
         }

         if(var1 == 6) {
            Client.field742 = var2;
         }

         if(var1 == 9) {
            Client.field743 = var2;
         }

         if(var1 == 10) {
            if(var2 == 0) {
               Client.field815 = 127;
            }

            if(var2 == 1) {
               Client.field815 = 96;
            }

            if(var2 == 2) {
               Client.field815 = 64;
            }

            if(var2 == 3) {
               Client.field815 = 32;
            }

            if(var2 == 4) {
               Client.field815 = 0;
            }
         }

         if(var1 == 17) {
            Client.field748 = var2 & 65535;
         }

         AttackOption[] var4;
         if(var1 == 18) {
            var4 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable};
            Client.playerAttackOption = (AttackOption)class76.forOrdinal(var4, var2);
            if(Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if(var1 == 19) {
            if(var2 == -1) {
               Client.field707 = -1;
            } else {
               Client.field707 = var2 & 2047;
            }
         }

         if(var1 == 22) {
            var4 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable};
            Client.npcAttackOption = (AttackOption)class76.forOrdinal(var4, var2);
            if(Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
