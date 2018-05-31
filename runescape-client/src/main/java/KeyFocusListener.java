import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("KeyFocusListener")
public final class KeyFocusListener implements KeyListener, FocusListener {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lar;"
   )
   @Export("keyboard")
   public static KeyFocusListener keyboard;
   @ObfuscatedName("cw")
   @Export("keyPressed")
   public static boolean[] keyPressed;
   @ObfuscatedName("cf")
   @Export("currentTypedKey")
   public static char currentTypedKey;
   @ObfuscatedName("cr")
   public static int[] field343;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -149878467
   )
   public static int field344;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 90351649
   )
   public static int field329;
   @ObfuscatedName("cs")
   static char[] field346;
   @ObfuscatedName("ct")
   static int[] field348;
   @ObfuscatedName("cc")
   public static int[] field338;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 1261945265
   )
   public static int field349;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 2144083495
   )
   public static int field350;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -1066478221
   )
   public static int field351;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 227916931
   )
   public static int field352;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 1163969327
   )
   @Export("keyboardIdleTicks")
   public static volatile int keyboardIdleTicks;
   @ObfuscatedName("cz")
   @Export("KeyHandler_keyCodes")
   static int[] KeyHandler_keyCodes;

   static {
      keyboard = new KeyFocusListener();
      keyPressed = new boolean[112];
      field343 = new int[128];
      field344 = 0;
      field329 = 0;
      field346 = new char[128];
      field348 = new int[128];
      field338 = new int[128];
      field349 = 0;
      field350 = 0;
      field351 = 0;
      field352 = 0;
      keyboardIdleTicks = 0;
      KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   @Export("keyPressed")
   @ObfuscatedName("keyPressed")
   public final synchronized void keyPressed(KeyEvent var1) {
      if(keyboard != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
            var2 = KeyHandler_keyCodes[var2];
            if((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(field329 >= 0 && var2 >= 0) {
            field343[field329] = var2;
            field329 = field329 + 1 & 127;
            if(field344 == field329) {
               field329 = -1;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = field351 + 1 & 127;
            if(var3 != field350) {
               field348[field351] = var2;
               field346[field351] = 0;
               field351 = var3;
            }
         }

         var3 = var1.getModifiers();
         if((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if(keyboard != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
            var2 = KeyHandler_keyCodes[var2] & -129;
         } else {
            var2 = -1;
         }

         if(field329 >= 0 && var2 >= 0) {
            field343[field329] = ~var2;
            field329 = field329 + 1 & 127;
            if(field329 == field344) {
               field329 = -1;
            }
         }
      }

      var1.consume();
   }

   @Export("focusLost")
   @Hook("focusLost")
   @ObfuscatedName("focusLost")
   public final synchronized void focusLost(FocusEvent var1) {
      if(keyboard != null) {
         field329 = -1;
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void keyTyped(KeyEvent var1) {
      if(keyboard != null) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && var2 != '\uffff' && ClanMemberManager.method5496(var2)) {
            int var3 = field351 + 1 & 127;
            if(var3 != field350) {
               field348[field351] = -1;
               field346[field351] = var2;
               field351 = var3;
            }
         }
      }

      var1.consume();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgu;I)Lgu;",
      garbageValue = "123380361"
   )
   @Export("readStringIntParameters")
   static final IterableHashTable readStringIntParameters(Buffer var0, IterableHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if(var1 == null) {
         var3 = class146.nextPowerOfTwo(var2);
         var1 = new IterableHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.read24BitInt();
         Object var6;
         if(var4) {
            var6 = new ObjectNode(var0.readString());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("x")
   public static int method673(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "44"
   )
   @Export("menuAction")
   static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      PacketNode var8;
      if(var2 == 1) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2199, Client.field626.field1218);
         var8.packetBuffer.method3771(class297.field3683);
         var8.packetBuffer.putByte(keyPressed[82]?1:0);
         var8.packetBuffer.method3673(class187.field2372);
         var8.packetBuffer.method3582(var0 + PendingSpawn.baseX);
         var8.packetBuffer.putShort(Client.baseY + var1);
         var8.packetBuffer.method3583(var3);
         var8.packetBuffer.putShort(class13.selectedItemIndex);
         Client.field626.method1980(var8);
      } else if(var2 == 2) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2172, Client.field626.field1218);
         var8.packetBuffer.putByte(keyPressed[82]?1:0);
         var8.packetBuffer.method3594(SoundTaskDataProvider.field361);
         var8.packetBuffer.method3771(Client.baseY + var1);
         var8.packetBuffer.method3771(Client.field736);
         var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
         var8.packetBuffer.method3771(var3);
         Client.field626.method1980(var8);
      } else if(var2 == 3) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2186, Client.field626.field1218);
         var8.packetBuffer.putShort(Client.baseY + var1);
         var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
         var8.packetBuffer.putShort(var3);
         var8.packetBuffer.putByte(keyPressed[82]?1:0);
         Client.field626.method1980(var8);
      } else if(var2 == 4) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2169, Client.field626.field1218);
         var8.packetBuffer.method3582(var0 + PendingSpawn.baseX);
         var8.packetBuffer.putShort(Client.baseY + var1);
         var8.packetBuffer.method3574(keyPressed[82]?1:0);
         var8.packetBuffer.method3771(var3);
         Client.field626.method1980(var8);
      } else if(var2 == 5) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2216, Client.field626.field1218);
         var8.packetBuffer.method3771(Client.baseY + var1);
         var8.packetBuffer.method3771(var0 + PendingSpawn.baseX);
         var8.packetBuffer.method3771(var3);
         var8.packetBuffer.method3575(keyPressed[82]?1:0);
         Client.field626.method1980(var8);
      } else if(var2 == 6) {
         Client.lastLeftClickX = var6;
         Client.lastLeftClickY = var7;
         Client.cursorState = 2;
         Client.field803 = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = class26.method433(ClientPacket.field2232, Client.field626.field1218);
         var8.packetBuffer.method3583(var3);
         var8.packetBuffer.method3575(keyPressed[82]?1:0);
         var8.packetBuffer.method3771(var0 + PendingSpawn.baseX);
         var8.packetBuffer.method3582(Client.baseY + var1);
         Client.field626.method1980(var8);
      } else {
         PacketNode var9;
         NPC var13;
         if(var2 == 7) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2184, Client.field626.field1218);
               var9.packetBuffer.putShort(class13.selectedItemIndex);
               var9.packetBuffer.method3576(keyPressed[82]?1:0);
               var9.packetBuffer.method3582(var3);
               var9.packetBuffer.method3583(class297.field3683);
               var9.packetBuffer.method3594(class187.field2372);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 8) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2204, Client.field626.field1218);
               var9.packetBuffer.putInt(SoundTaskDataProvider.field361);
               var9.packetBuffer.method3583(Client.field736);
               var9.packetBuffer.method3582(var3);
               var9.packetBuffer.putByte(keyPressed[82]?1:0);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 9) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2207, Client.field626.field1218);
               var9.packetBuffer.method3583(var3);
               var9.packetBuffer.method3575(keyPressed[82]?1:0);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 10) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2223, Client.field626.field1218);
               var9.packetBuffer.method3771(var3);
               var9.packetBuffer.method3576(keyPressed[82]?1:0);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 11) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2198, Client.field626.field1218);
               var9.packetBuffer.method3574(keyPressed[82]?1:0);
               var9.packetBuffer.method3771(var3);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 12) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2229, Client.field626.field1218);
               var9.packetBuffer.method3574(keyPressed[82]?1:0);
               var9.packetBuffer.method3582(var3);
               Client.field626.method1980(var9);
            }
         } else if(var2 == 13) {
            var13 = Client.cachedNPCs[var3];
            if(var13 != null) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class26.method433(ClientPacket.field2208, Client.field626.field1218);
               var9.packetBuffer.method3583(var3);
               var9.packetBuffer.method3575(keyPressed[82]?1:0);
               Client.field626.method1980(var9);
            }
         } else {
            Player var15;
            if(var2 == 14) {
               var15 = Client.cachedPlayers[var3];
               if(var15 != null) {
                  Client.lastLeftClickX = var6;
                  Client.lastLeftClickY = var7;
                  Client.cursorState = 2;
                  Client.field803 = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var9 = class26.method433(ClientPacket.field2189, Client.field626.field1218);
                  var9.packetBuffer.method3771(class13.selectedItemIndex);
                  var9.packetBuffer.method3582(class297.field3683);
                  var9.packetBuffer.method3673(class187.field2372);
                  var9.packetBuffer.method3576(keyPressed[82]?1:0);
                  var9.packetBuffer.putShort(var3);
                  Client.field626.method1980(var9);
               }
            } else if(var2 == 15) {
               var15 = Client.cachedPlayers[var3];
               if(var15 != null) {
                  Client.lastLeftClickX = var6;
                  Client.lastLeftClickY = var7;
                  Client.cursorState = 2;
                  Client.field803 = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var9 = class26.method433(ClientPacket.field2212, Client.field626.field1218);
                  var9.packetBuffer.method3687(SoundTaskDataProvider.field361);
                  var9.packetBuffer.method3582(var3);
                  var9.packetBuffer.method3583(Client.field736);
                  var9.packetBuffer.method3574(keyPressed[82]?1:0);
                  Client.field626.method1980(var9);
               }
            } else if(var2 == 16) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2234, Client.field626.field1218);
               var8.packetBuffer.method3771(var3);
               var8.packetBuffer.putByte(keyPressed[82]?1:0);
               var8.packetBuffer.method3583(class297.field3683);
               var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
               var8.packetBuffer.putShort(Client.baseY + var1);
               var8.packetBuffer.putInt(class187.field2372);
               var8.packetBuffer.putShort(class13.selectedItemIndex);
               Client.field626.method1980(var8);
            } else if(var2 == 17) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2143, Client.field626.field1218);
               var8.packetBuffer.method3583(var3);
               var8.packetBuffer.method3582(var0 + PendingSpawn.baseX);
               var8.packetBuffer.method3583(Client.field736);
               var8.packetBuffer.method3771(Client.baseY + var1);
               var8.packetBuffer.method3673(SoundTaskDataProvider.field361);
               var8.packetBuffer.putByte(keyPressed[82]?1:0);
               Client.field626.method1980(var8);
            } else if(var2 == 18) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2210, Client.field626.field1218);
               var8.packetBuffer.method3771(Client.baseY + var1);
               var8.packetBuffer.method3575(keyPressed[82]?1:0);
               var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
               var8.packetBuffer.putShort(var3);
               Client.field626.method1980(var8);
            } else if(var2 == 19) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2214, Client.field626.field1218);
               var8.packetBuffer.method3582(var3);
               var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
               var8.packetBuffer.method3582(Client.baseY + var1);
               var8.packetBuffer.method3576(keyPressed[82]?1:0);
               Client.field626.method1980(var8);
            } else if(var2 == 20) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2161, Client.field626.field1218);
               var8.packetBuffer.putShort(var0 + PendingSpawn.baseX);
               var8.packetBuffer.method3583(var3);
               var8.packetBuffer.method3582(Client.baseY + var1);
               var8.packetBuffer.method3575(keyPressed[82]?1:0);
               Client.field626.method1980(var8);
            } else if(var2 == 21) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2205, Client.field626.field1218);
               var8.packetBuffer.method3583(Client.baseY + var1);
               var8.packetBuffer.method3583(var3);
               var8.packetBuffer.method3582(var0 + PendingSpawn.baseX);
               var8.packetBuffer.method3574(keyPressed[82]?1:0);
               Client.field626.method1980(var8);
            } else if(var2 == 22) {
               Client.lastLeftClickX = var6;
               Client.lastLeftClickY = var7;
               Client.cursorState = 2;
               Client.field803 = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = class26.method433(ClientPacket.field2147, Client.field626.field1218);
               var8.packetBuffer.method3582(var3);
               var8.packetBuffer.method3582(var0 + PendingSpawn.baseX);
               var8.packetBuffer.putShort(Client.baseY + var1);
               var8.packetBuffer.method3576(keyPressed[82]?1:0);
               Client.field626.method1980(var8);
            } else if(var2 == 23) {
               if(Client.isMenuOpen) {
                  MapIcon.region.method2974();
               } else {
                  MapIcon.region.method2909(class13.plane, var0, var1, true);
               }
            } else {
               PacketNode var10;
               Widget var17;
               if(var2 == 24) {
                  var17 = class26.getWidget(var1);
                  boolean var11 = true;
                  if(var17.contentType > 0) {
                     var11 = class25.method426(var17);
                  }

                  if(var11) {
                     var10 = class26.method433(ClientPacket.field2230, Client.field626.field1218);
                     var10.packetBuffer.putInt(var1);
                     Client.field626.method1980(var10);
                  }
               } else {
                  if(var2 == 25) {
                     var17 = class146.getWidgetChild(var1, var0);
                     if(var17 != null) {
                        class34.method585();
                        class155.method3275(var1, var0, Signlink.method3252(class24.getWidgetClickMask(var17)), var17.itemId);
                        Client.itemSelectionState = 0;
                        Client.field612 = class151.method3239(var17);
                        if(Client.field612 == null) {
                           Client.field612 = "Null";
                        }

                        if(var17.hasScript) {
                           Client.field739 = var17.opBase + class6.getColTags(16777215);
                        } else {
                           Client.field739 = class6.getColTags(65280) + var17.spellName + class6.getColTags(16777215);
                        }
                     }

                     return;
                  }

                  if(var2 == 26) {
                     var8 = class26.method433(ClientPacket.field2195, Client.field626.field1218);
                     Client.field626.method1980(var8);

                     for(WidgetNode var14 = (WidgetNode)Client.componentTable.first(); var14 != null; var14 = (WidgetNode)Client.componentTable.next()) {
                        if(var14.owner == 0 || var14.owner == 3) {
                           WorldMapData.closeWidget(var14, true);
                        }
                     }

                     if(Client.field744 != null) {
                        Player.method1114(Client.field744);
                        Client.field744 = null;
                     }
                  } else {
                     int var12;
                     Widget var16;
                     if(var2 == 28) {
                        var8 = class26.method433(ClientPacket.field2230, Client.field626.field1218);
                        var8.packetBuffer.putInt(var1);
                        Client.field626.method1980(var8);
                        var16 = class26.getWidget(var1);
                        if(var16.dynamicValues != null && var16.dynamicValues[0][0] == 5) {
                           var12 = var16.dynamicValues[0][1];
                           class225.clientVarps[var12] = 1 - class225.clientVarps[var12];
                           class45.method749(var12);
                        }
                     } else if(var2 == 29) {
                        var8 = class26.method433(ClientPacket.field2230, Client.field626.field1218);
                        var8.packetBuffer.putInt(var1);
                        Client.field626.method1980(var8);
                        var16 = class26.getWidget(var1);
                        if(var16.dynamicValues != null && var16.dynamicValues[0][0] == 5) {
                           var12 = var16.dynamicValues[0][1];
                           if(class225.clientVarps[var12] != var16.field2720[0]) {
                              class225.clientVarps[var12] = var16.field2720[0];
                              class45.method749(var12);
                           }
                        }
                     } else if(var2 == 30) {
                        if(Client.field744 == null) {
                           Varcs.method1921(var1, var0);
                           Client.field744 = class146.getWidgetChild(var1, var0);
                           Player.method1114(Client.field744);
                        }
                     } else if(var2 == 31) {
                        var8 = class26.method433(ClientPacket.field2196, Client.field626.field1218);
                        var8.packetBuffer.method3687(class187.field2372);
                        var8.packetBuffer.method3582(var0);
                        var8.packetBuffer.method3582(class297.field3683);
                        var8.packetBuffer.method3594(var1);
                        var8.packetBuffer.putShort(class13.selectedItemIndex);
                        var8.packetBuffer.method3582(var3);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 32) {
                        var8 = class26.method433(ClientPacket.field2165, Client.field626.field1218);
                        var8.packetBuffer.method3673(SoundTaskDataProvider.field361);
                        var8.packetBuffer.putShort(Client.field736);
                        var8.packetBuffer.method3594(var1);
                        var8.packetBuffer.method3771(var0);
                        var8.packetBuffer.method3583(var3);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 33) {
                        var8 = class26.method433(ClientPacket.field2175, Client.field626.field1218);
                        var8.packetBuffer.method3771(var0);
                        var8.packetBuffer.method3583(var3);
                        var8.packetBuffer.putInt(var1);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 34) {
                        var8 = class26.method433(ClientPacket.field2193, Client.field626.field1218);
                        var8.packetBuffer.putShort(var0);
                        var8.packetBuffer.method3582(var3);
                        var8.packetBuffer.method3687(var1);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 35) {
                        var8 = class26.method433(ClientPacket.field2166, Client.field626.field1218);
                        var8.packetBuffer.method3582(var0);
                        var8.packetBuffer.method3673(var1);
                        var8.packetBuffer.method3582(var3);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 36) {
                        var8 = class26.method433(ClientPacket.field2191, Client.field626.field1218);
                        var8.packetBuffer.method3771(var3);
                        var8.packetBuffer.method3583(var0);
                        var8.packetBuffer.method3673(var1);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else if(var2 == 37) {
                        var8 = class26.method433(ClientPacket.field2197, Client.field626.field1218);
                        var8.packetBuffer.method3673(var1);
                        var8.packetBuffer.method3582(var0);
                        var8.packetBuffer.method3583(var3);
                        Client.field626.method1980(var8);
                        Client.mouseCrosshair = 0;
                        class240.field3096 = class26.getWidget(var1);
                        Client.pressedItemIndex = var0;
                     } else {
                        if(var2 == 38) {
                           class34.method585();
                           var17 = class26.getWidget(var1);
                           Client.itemSelectionState = 1;
                           class13.selectedItemIndex = var0;
                           class187.field2372 = var1;
                           class297.field3683 = var3;
                           Player.method1114(var17);
                           Client.lastSelectedItemName = class6.getColTags(16748608) + TextureProvider.getItemDefinition(var3).name + class6.getColTags(16777215);
                           if(Client.lastSelectedItemName == null) {
                              Client.lastSelectedItemName = "null";
                           }

                           return;
                        }

                        if(var2 == 39) {
                           var8 = class26.method433(ClientPacket.field2171, Client.field626.field1218);
                           var8.packetBuffer.method3594(var1);
                           var8.packetBuffer.method3583(var3);
                           var8.packetBuffer.method3771(var0);
                           Client.field626.method1980(var8);
                           Client.mouseCrosshair = 0;
                           class240.field3096 = class26.getWidget(var1);
                           Client.pressedItemIndex = var0;
                        } else if(var2 == 40) {
                           var8 = class26.method433(ClientPacket.field2151, Client.field626.field1218);
                           var8.packetBuffer.putInt(var1);
                           var8.packetBuffer.method3582(var3);
                           var8.packetBuffer.method3582(var0);
                           Client.field626.method1980(var8);
                           Client.mouseCrosshair = 0;
                           class240.field3096 = class26.getWidget(var1);
                           Client.pressedItemIndex = var0;
                        } else if(var2 == 41) {
                           var8 = class26.method433(ClientPacket.field2202, Client.field626.field1218);
                           var8.packetBuffer.method3582(var3);
                           var8.packetBuffer.method3582(var0);
                           var8.packetBuffer.method3687(var1);
                           Client.field626.method1980(var8);
                           Client.mouseCrosshair = 0;
                           class240.field3096 = class26.getWidget(var1);
                           Client.pressedItemIndex = var0;
                        } else if(var2 == 42) {
                           var8 = class26.method433(ClientPacket.field2200, Client.field626.field1218);
                           var8.packetBuffer.method3771(var3);
                           var8.packetBuffer.method3594(var1);
                           var8.packetBuffer.putShort(var0);
                           Client.field626.method1980(var8);
                           Client.mouseCrosshair = 0;
                           class240.field3096 = class26.getWidget(var1);
                           Client.pressedItemIndex = var0;
                        } else if(var2 == 43) {
                           var8 = class26.method433(ClientPacket.field2140, Client.field626.field1218);
                           var8.packetBuffer.method3583(var3);
                           var8.packetBuffer.putInt(var1);
                           var8.packetBuffer.method3582(var0);
                           Client.field626.method1980(var8);
                           Client.mouseCrosshair = 0;
                           class240.field3096 = class26.getWidget(var1);
                           Client.pressedItemIndex = var0;
                        } else if(var2 == 44) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2206, Client.field626.field1218);
                              var9.packetBuffer.putByte(keyPressed[82]?1:0);
                              var9.packetBuffer.putShort(var3);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 45) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2181, Client.field626.field1218);
                              var9.packetBuffer.method3576(keyPressed[82]?1:0);
                              var9.packetBuffer.putShort(var3);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 46) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2137, Client.field626.field1218);
                              var9.packetBuffer.method3574(keyPressed[82]?1:0);
                              var9.packetBuffer.method3583(var3);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 47) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2220, Client.field626.field1218);
                              var9.packetBuffer.method3771(var3);
                              var9.packetBuffer.putByte(keyPressed[82]?1:0);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 48) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2217, Client.field626.field1218);
                              var9.packetBuffer.method3576(keyPressed[82]?1:0);
                              var9.packetBuffer.method3771(var3);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 49) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2163, Client.field626.field1218);
                              var9.packetBuffer.method3575(keyPressed[82]?1:0);
                              var9.packetBuffer.method3771(var3);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 50) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2222, Client.field626.field1218);
                              var9.packetBuffer.method3582(var3);
                              var9.packetBuffer.method3574(keyPressed[82]?1:0);
                              Client.field626.method1980(var9);
                           }
                        } else if(var2 == 51) {
                           var15 = Client.cachedPlayers[var3];
                           if(var15 != null) {
                              Client.lastLeftClickX = var6;
                              Client.lastLeftClickY = var7;
                              Client.cursorState = 2;
                              Client.field803 = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = class26.method433(ClientPacket.field2178, Client.field626.field1218);
                              var9.packetBuffer.method3771(var3);
                              var9.packetBuffer.method3575(keyPressed[82]?1:0);
                              Client.field626.method1980(var9);
                           }
                        } else {
                           label961: {
                              if(var2 != 57) {
                                 if(var2 == 58) {
                                    var17 = class146.getWidgetChild(var1, var0);
                                    if(var17 != null) {
                                       var9 = class26.method433(ClientPacket.field2159, Client.field626.field1218);
                                       var9.packetBuffer.method3673(SoundTaskDataProvider.field361);
                                       var9.packetBuffer.method3771(Client.field737);
                                       var9.packetBuffer.method3673(var1);
                                       var9.packetBuffer.method3582(var17.itemId);
                                       var9.packetBuffer.putShort(var0);
                                       var9.packetBuffer.putShort(Client.field736);
                                       Client.field626.method1980(var9);
                                    }
                                    break label961;
                                 }

                                 if(var2 == 1001) {
                                    Client.lastLeftClickX = var6;
                                    Client.lastLeftClickY = var7;
                                    Client.cursorState = 2;
                                    Client.field803 = 0;
                                    Client.destinationX = var0;
                                    Client.destinationY = var1;
                                    var8 = class26.method433(ClientPacket.field2139, Client.field626.field1218);
                                    var8.packetBuffer.method3582(Client.baseY + var1);
                                    var8.packetBuffer.method3771(var3);
                                    var8.packetBuffer.method3583(var0 + PendingSpawn.baseX);
                                    var8.packetBuffer.putByte(keyPressed[82]?1:0);
                                    Client.field626.method1980(var8);
                                    break label961;
                                 }

                                 if(var2 == 1002) {
                                    Client.lastLeftClickX = var6;
                                    Client.lastLeftClickY = var7;
                                    Client.cursorState = 2;
                                    Client.field803 = 0;
                                    var8 = class26.method433(ClientPacket.field2162, Client.field626.field1218);
                                    var8.packetBuffer.putShort(var3);
                                    Client.field626.method1980(var8);
                                    break label961;
                                 }

                                 if(var2 == 1003) {
                                    Client.lastLeftClickX = var6;
                                    Client.lastLeftClickY = var7;
                                    Client.cursorState = 2;
                                    Client.field803 = 0;
                                    var13 = Client.cachedNPCs[var3];
                                    if(var13 != null) {
                                       NPCComposition var18 = var13.composition;
                                       if(var18.configs != null) {
                                          var18 = var18.transform();
                                       }

                                       if(var18 != null) {
                                          var10 = class26.method433(ClientPacket.field2146, Client.field626.field1218);
                                          var10.packetBuffer.method3582(var18.id);
                                          Client.field626.method1980(var10);
                                       }
                                    }
                                    break label961;
                                 }

                                 if(var2 == 1004) {
                                    Client.lastLeftClickX = var6;
                                    Client.lastLeftClickY = var7;
                                    Client.cursorState = 2;
                                    Client.field803 = 0;
                                    var8 = class26.method433(ClientPacket.field2182, Client.field626.field1218);
                                    var8.packetBuffer.method3583(var3);
                                    Client.field626.method1980(var8);
                                    break label961;
                                 }

                                 if(var2 == 1005) {
                                    var17 = class26.getWidget(var1);
                                    if(var17 != null && var17.itemQuantities[var0] >= 100000) {
                                       class143.sendGameMessage(27, "", var17.itemQuantities[var0] + " x " + TextureProvider.getItemDefinition(var3).name);
                                    } else {
                                       var9 = class26.method433(ClientPacket.field2182, Client.field626.field1218);
                                       var9.packetBuffer.method3583(var3);
                                       Client.field626.method1980(var9);
                                    }

                                    Client.mouseCrosshair = 0;
                                    class240.field3096 = class26.getWidget(var1);
                                    Client.pressedItemIndex = var0;
                                    break label961;
                                 }

                                 if(var2 != 1007) {
                                    if(var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
                                       ItemContainer.renderOverview.onMapClicked(var2, var3, new Coordinates(var0), new Coordinates(var1));
                                    }
                                    break label961;
                                 }
                              }

                              var17 = class146.getWidgetChild(var1, var0);
                              if(var17 != null) {
                                 class45.method747(var3, var1, var0, var17.itemId, var5);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if(Client.itemSelectionState != 0) {
         Client.itemSelectionState = 0;
         Player.method1114(class26.getWidget(class187.field2372));
      }

      if(Client.spellSelected) {
         class34.method585();
      }

      if(class240.field3096 != null && Client.mouseCrosshair == 0) {
         Player.method1114(class240.field3096);
      }

   }
}
