import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class78 {
   @ObfuscatedName("z")
   static boolean field1101;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1570895999
   )
   static int field1082;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static IndexedSprite field1083;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static IndexedSprite field1084;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("runeSprites")
   static IndexedSprite[] runeSprites;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static SpritePixels field1092;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static SpritePixels field1087;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static IndexedSprite field1089;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 497255191
   )
   @Export("loginWindowX")
   static int loginWindowX;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1723235133
   )
   static int field1091;
   @ObfuscatedName("a")
   static int[] field1093;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 176451679
   )
   static int field1088;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1171598757
   )
   static int field1094;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1476562557
   )
   static int field1095;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1033770495
   )
   static int field1096;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1870143355
   )
   static int field1097;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 868889457
   )
   static int field1114;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1434866071
   )
   @Export("loadingBarPercentage")
   static int loadingBarPercentage;
   @ObfuscatedName("ac")
   @Export("loadingText")
   static String loadingText;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1062373165
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("au")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("av")
   @Export("loginMessage1")
   static String loginMessage1;
   @ObfuscatedName("al")
   @Export("loginMessage2")
   static String loginMessage2;
   @ObfuscatedName("ae")
   @Export("loginMessage3")
   static String loginMessage3;
   @ObfuscatedName("az")
   @Export("username")
   static String username;
   @ObfuscatedName("aq")
   @Export("password")
   static String password;
   @ObfuscatedName("ad")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("bp")
   static boolean field1110;
   @ObfuscatedName("bi")
   static boolean field1115;
   @ObfuscatedName("bq")
   static boolean field1104;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -705152905
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("bl")
   @Export("worldSelectShown")
   static boolean worldSelectShown;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 381075233
   )
   static int field1116;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      longValue = -8950576353384891287L
   )
   static long field1109;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      longValue = 8067562351581494099L
   )
   static long field1118;

   static {
      field1082 = 0;
      loginWindowX = field1082 + 202;
      field1093 = new int[256];
      field1088 = 0;
      field1094 = 0;
      field1095 = 0;
      field1096 = 0;
      field1097 = 0;
      field1114 = 0;
      loadingBarPercentage = 10;
      loadingText = "";
      loginIndex = 0;
      Login_response0 = "";
      loginMessage1 = "";
      loginMessage2 = "";
      loginMessage3 = "";
      username = "";
      password = "";
      Login_isUsernameRemembered = false;
      field1110 = false;
      field1115 = false;
      field1104 = true;
      currentLoginField = 0;
      worldSelectShown = false;
      field1116 = -1;
      new DecimalFormat("##0.00");
      new class148();
      field1109 = -1L;
      field1118 = -1L;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "-1849601215"
   )
   @Export("getString")
   public static String getString(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if(var6 != 0) {
            if(var6 >= 128 && var6 < 160) {
               char var7 = class301.cp1252AsciiExtension[var6 - 128];
               if(var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
