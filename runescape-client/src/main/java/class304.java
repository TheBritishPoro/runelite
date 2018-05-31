import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class304 {
   @ObfuscatedName("z")
   public static char[] field3722;
   @ObfuscatedName("w")
   static char[] field3723;
   @ObfuscatedName("s")
   static int[] field3724;

   static {
      field3722 = new char[64];

      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3722[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3722[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3722[var0] = (char)(var0 + 48 - 52);
      }

      field3722[62] = '+';
      field3722[63] = '/';
      field3723 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3723[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3723[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3723[var0] = (char)(var0 + 48 - 52);
      }

      field3723[62] = '*';
      field3723[63] = '-';
      field3724 = new int[128];

      for(var0 = 0; var0 < field3724.length; ++var0) {
         field3724[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3724[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3724[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3724[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3724;
      field3724[43] = 62;
      var2[42] = 62;
      int[] var1 = field3724;
      field3724[47] = 63;
      var1[45] = 63;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-7958"
   )
   public static String method5634(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if(var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class166.charToByteCp1252(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIZB)V",
      garbageValue = "-81"
   )
   static void method5635(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if(var6 != null && var6.parentId == var1) {
            CombatInfo1.method1563(var6, var2, var3, var4);
            MapLabel.method281(var6, var2, var3);
            if(var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if(var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if(var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if(var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if(var6.type == 0) {
               GameSocket.method3388(var0, var6, var4);
            }
         }
      }

   }
}
