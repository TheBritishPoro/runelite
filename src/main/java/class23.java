import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class23 {
   @ObfuscatedName("ru")
   @Export("preferences")
   static Preferences preferences;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = 661739531
   )
   @Export("menuHeight")
   static int menuHeight;
   @ObfuscatedName("gd")
   @Export("pkIcons")
   static SpritePixels[] pkIcons;

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "855699432"
   )
   static void method169(int var0) {
      if(var0 == -3) {
         class2.method6("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class2.method6("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class2.method6("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class92.loginIndex = 3;
      } else if(var0 == 4) {
         class2.method6("Your account has been disabled.", "Please check your message-centre for details.", "");
      } else if(var0 == 5) {
         class2.method6("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         class2.method6("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class2.method6("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class2.method6("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class2.method6("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class2.method6("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class2.method6("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class2.method6("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class2.method6("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class2.method6("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class2.method6("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class2.method6("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class2.method6("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
      } else if(var0 == 19) {
         class2.method6("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class2.method6("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class2.method6("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class2.method6("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class2.method6("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class2.method6("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class2.method6("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class2.method6("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class2.method6("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class2.method6("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class2.method6("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class2.method6("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class2.method6("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!");
      } else {
         if(var0 == 56) {
            class2.method6("Enter the 6-digit code generated by your", "authenticator app.", "");
            WorldMapType2.setGameState(11);
            return;
         }

         if(var0 == 57) {
            class2.method6("The code you entered was incorrect.", "Please try again.", "");
            WorldMapType2.setGameState(11);
            return;
         }

         class2.method6("Unexpected server response", "Please try using a different world.", "");
      }

      WorldMapType2.setGameState(10);
   }
}
