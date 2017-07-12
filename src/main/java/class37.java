import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class37 {
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = -1000797245
   )
   static int field529;
   @ObfuscatedName("ei")
   @Export("font_p12full")
   static Font font_p12full;
   @ObfuscatedName("b")
   @Export("cacheLocations")
   public static String[] cacheLocations;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILScript;ZI)I",
      garbageValue = "-1401348934"
   )
   static int method510(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 5306) {
         int[] var6 = class83.intStack;
         var3 = ++class46.intStackSize - 1;
         int var5 = Client.isResized?2:1;
         var6[var3] = var5;
         return 1;
      } else {
         int var4;
         if(var0 == 5307) {
            var4 = class83.intStack[--class46.intStackSize];
            if(var4 == 1 || var4 == 2) {
               Client.field1140 = 0L;
               if(var4 >= 2) {
                  Client.isResized = true;
               } else {
                  Client.isResized = false;
               }

               var3 = Client.isResized?2:1;
               if(var3 == 1) {
                  class261.clientInstance.method869(765, 503);
               } else {
                  class261.clientInstance.method869(7680, 2160);
               }

               if(Client.gameState >= 25) {
                  class5.method18();
               }
            }

            return 1;
         } else if(var0 == 5308) {
            class83.intStack[++class46.intStackSize - 1] = class8.settings.screenType;
            return 1;
         } else if(var0 != 5309) {
            return 2;
         } else {
            var4 = class83.intStack[--class46.intStackSize];
            if(var4 == 1 || var4 == 2) {
               class8.settings.screenType = var4;
               class1.method3();
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BIIB)Ljava/lang/String;",
      garbageValue = "36"
   )
   @Export("decodeCESU8")
   public static String decodeCESU8(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var6;
      for(int var7 = var2 + var1; var5 < var7; var3[var4++] = (char)var6) {
         int var8 = var0[var5++] & 255;
         if(var8 < 128) {
            if(var8 == 0) {
               var6 = '�';
            } else {
               var6 = var8;
            }
         } else if(var8 < 192) {
            var6 = '�';
         } else if(var8 < 224) {
            if(var5 < var7 && (var0[var5] & 192) == 128) {
               var6 = (var8 & 31) << 6 | var0[var5++] & 63;
               if(var6 < 128) {
                  var6 = '�';
               }
            } else {
               var6 = '�';
            }
         } else if(var8 < 240) {
            if(var5 + 1 < var7 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
               var6 = (var8 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var6 < 2048) {
                  var6 = '�';
               }
            } else {
               var6 = '�';
            }
         } else if(var8 < 248) {
            if(var5 + 2 < var7 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
               var6 = (var8 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var6 >= 65536 && var6 <= 1114111) {
                  var6 = '�';
               } else {
                  var6 = '�';
               }
            } else {
               var6 = '�';
            }
         } else {
            var6 = '�';
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-14"
   )
   public static byte[] method514() {
      byte[] var0 = new byte[24];

      try {
         class155.field2258.seek(0L);
         class155.field2258.read(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
            ;
         }

         if(var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(LActor;I)V",
      garbageValue = "1466683699"
   )
   static final void method515(Actor var0) {
      if(var0.field1285 == Client.gameCycle || var0.animation == -1 || var0.actionAnimationDisable != 0 || var0.field1247 + 1 > class224.getAnimation(var0.animation).frameLenghts[var0.actionFrame]) {
         int var1 = var0.field1285 - var0.field1274;
         int var2 = Client.gameCycle - var0.field1274;
         int var3 = var0.field1280 * 128 + var0.field1242 * 64;
         int var4 = var0.field1282 * 128 + var0.field1242 * 64;
         int var5 = var0.field1296 * 128 + var0.field1242 * 64;
         int var6 = var0.field1241 * 128 + var0.field1242 * 64;
         var0.x = (var3 * (var1 - var2) + var5 * var2) / var1;
         var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1;
      }

      var0.field1275 = 0;
      var0.orientation = var0.field1286;
      var0.angle = var0.orientation;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "-1727166789"
   )
   static long method516(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if(var5 >= 65 && var5 <= 90) {
            var1 += (long)(var5 + 1 - 65);
         } else if(var5 >= 97 && var5 <= 122) {
            var1 += (long)(var5 + 1 - 97);
         } else if(var5 >= 48 && var5 <= 57) {
            var1 += (long)(var5 + 27 - 48);
         }

         if(var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }
}
