import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("BuildType")
public class BuildType {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   @Export("RC")
   static final BuildType RC;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   @Export("WIP")
   static final BuildType WIP;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   @Export("LIVE")
   static final BuildType LIVE;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   @Export("BUILD_LIVE")
   static final BuildType BUILD_LIVE;
   @ObfuscatedName("f")
   static int[] field3137;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -848859815
   )
   @Export("canvasHeight")
   public static int canvasHeight;
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("scrollbarSprites")
   static IndexedSprite[] scrollbarSprites;
   @ObfuscatedName("u")
   @Export("identifier")
   public final String identifier;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2135504665
   )
   final int field3133;

   static {
      RC = new BuildType("LIVE", 0);
      WIP = new BuildType("BUILDLIVE", 3);
      LIVE = new BuildType("RC", 1);
      BUILD_LIVE = new BuildType("WIP", 2);
   }

   BuildType(String var1, int var2) {
      this.identifier = var1;
      this.field3133 = var2;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
      garbageValue = "-15"
   )
   static final void method4612(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(!Client.isMenuOpen) {
         if(Client.menuOptionCount < 500) {
            Client.menuOptions[Client.menuOptionCount] = var0;
            Client.menuTargets[Client.menuOptionCount] = var1;
            Client.menuTypes[Client.menuOptionCount] = var2;
            Client.menuIdentifiers[Client.menuOptionCount] = var3;
            Client.menuActionParams0[Client.menuOptionCount] = var4;
            Client.menuActionParams1[Client.menuOptionCount] = var5;
            Client.menuBooleanArray[Client.menuOptionCount] = var6;
            ++Client.menuOptionCount;
         }

      }
   }
}
