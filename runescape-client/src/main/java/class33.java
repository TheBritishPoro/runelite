import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class33 extends WorldMapData {
   @ObfuscatedName("mn")
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   @Export("mouseWheel")
   static MouseWheel mouseWheel;
   @ObfuscatedName("n")
   HashSet field292;
   @ObfuscatedName("f")
   HashSet field291;
   @ObfuscatedName("g")
   List field290;

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgk;Lgk;IZB)V",
      garbageValue = "-46"
   )
   void method550(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5) {
      this.loadMapData(var1, var4);
      int var6 = var3.readUnsignedShort();
      this.field292 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class10 var8 = new class10();

         try {
            var8.method95(var2, var3);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field292.add(var8);
      }

      var7 = var3.readUnsignedShort();
      this.field291 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class34 var9 = new class34();

         try {
            var9.method561(var2, var3);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field291.add(var9);
      }

      this.method551(var2, var5);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(Lgk;ZI)V",
      garbageValue = "-182782257"
   )
   void method551(Buffer var1, boolean var2) {
      this.field290 = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method3546();
         Coordinates var6 = new Coordinates(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if(var2 || !var7) {
            this.field290.add(new class13(var5, var6));
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIII)Z",
      garbageValue = "1833687101"
   )
   static final boolean method557(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label71:
      while(true) {
         int var6 = var4.method3563();
         if(var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.getUSmart();
               if(var9 == 0) {
                  continue label71;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if(var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = FileOnDisk.getObjectDefinition(var5);
                  if(var12 != 22 || !Client.lowMemory || var15.int1 != 0 || var15.clipType == 1 || var15.obstructsGround) {
                     if(!var15.method5051()) {
                        ++Client.field635;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.getUSmart();
            if(var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2008842241"
   )
   static final int method558(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var1 & 65280) * var2 + (var0 & 65280) * var3 & 16711680) + ((var1 & 16711935) * var2 + var3 * (var0 & 16711935) & -16711936) >> 8;
   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2035290647"
   )
   static void method559(int var0) {
      if(var0 == -3) {
         GrandExchangeEvent.method22("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         GrandExchangeEvent.method22("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         GrandExchangeEvent.method22("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class78.loginIndex = 3;
      } else if(var0 == 4) {
         GrandExchangeEvent.method22("Your account has been disabled.", "Please check your message-centre for details.", "");
      } else if(var0 == 5) {
         GrandExchangeEvent.method22("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         GrandExchangeEvent.method22("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         GrandExchangeEvent.method22("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         GrandExchangeEvent.method22("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         GrandExchangeEvent.method22("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         GrandExchangeEvent.method22("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         GrandExchangeEvent.method22("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         GrandExchangeEvent.method22("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         GrandExchangeEvent.method22("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         GrandExchangeEvent.method22("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         GrandExchangeEvent.method22("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         GrandExchangeEvent.method22("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         GrandExchangeEvent.method22("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
      } else if(var0 == 19) {
         GrandExchangeEvent.method22("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         GrandExchangeEvent.method22("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         GrandExchangeEvent.method22("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         GrandExchangeEvent.method22("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         GrandExchangeEvent.method22("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         GrandExchangeEvent.method22("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         GrandExchangeEvent.method22("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         GrandExchangeEvent.method22("", "Service unavailable.", "");
      } else if(var0 == 31) {
         GrandExchangeEvent.method22("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         GrandExchangeEvent.method22("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         GrandExchangeEvent.method22("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         GrandExchangeEvent.method22("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class78.loginIndex = 8;
      } else {
         if(var0 == 56) {
            GrandExchangeEvent.method22("Enter the 6-digit code generated by your", "authenticator app.", "");
            MouseInput.setGameState(11);
            return;
         }

         if(var0 == 57) {
            GrandExchangeEvent.method22("The code you entered was incorrect.", "Please try again.", "");
            MouseInput.setGameState(11);
            return;
         }

         if(var0 == 61) {
            class78.loginIndex = 7;
         } else {
            GrandExchangeEvent.method22("Unexpected server response", "Please try using a different world.", "");
         }
      }

      MouseInput.setGameState(10);
   }
}
