import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("SoundTaskDataProvider")
public class SoundTaskDataProvider implements class89 {
   @ObfuscatedName("aw")
   static int[] field357;
   @ObfuscatedName("ki")
   @ObfuscatedGetter(
      intValue = 172478671
   )
   static int field361;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Lcx;",
      garbageValue = "39"
   )
   public AbstractSoundSystem vmethod2052() {
      return new SourceDataSoundSystem();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void method695() {
      class50.field442 = 99;
      class50.tileUnderlayIds = new byte[4][104][104];
      class165.tileOverlayIds = new byte[4][104][104];
      class50.tileOverlayPath = new byte[4][104][104];
      WorldMapDecoration.overlayRotations = new byte[4][104][104];
      class37.field325 = new int[4][105][105];
      class50.field447 = new byte[4][105][105];
      class50.field448 = new int[105][105];
      class50.floorHues = new int[104];
      class305.floorSaturations = new int[104];
      NPC.field1035 = new int[104];
      Varbit.floorMultiplier = new int[104];
      BuildType.field3137 = new int[104];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IILfw;Lfk;I)Z",
      garbageValue = "-1332801903"
   )
   static final boolean method693(int var0, int var1, class166 var2, CollisionData var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class165.field2035[var6][var7] = 99;
      class165.field2041[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class165.field2039[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class165.field2038[var10001] = var1;
      int[][] var12 = var3.flags;

      while(var11 != var18) {
         var4 = class165.field2039[var11];
         var5 = class165.field2038[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.x;
         int var14 = var5 - var3.y;
         if(var2.vmethod3440(2, var4, var5, var3)) {
            WorldMapDecoration.field152 = var4;
            class165.field2037 = var5;
            return true;
         }

         int var15 = class165.field2041[var16][var17] + 1;
         if(var16 > 0 && class165.field2035[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class165.field2039[var18] = var4 - 1;
            class165.field2038[var18] = var5;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 - 1][var17] = 2;
            class165.field2041[var16 - 1][var17] = var15;
         }

         if(var16 < 126 && class165.field2035[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class165.field2039[var18] = var4 + 1;
            class165.field2038[var18] = var5;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 + 1][var17] = 8;
            class165.field2041[var16 + 1][var17] = var15;
         }

         if(var17 > 0 && class165.field2035[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class165.field2039[var18] = var4;
            class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16][var17 - 1] = 1;
            class165.field2041[var16][var17 - 1] = var15;
         }

         if(var17 < 126 && class165.field2035[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class165.field2039[var18] = var4;
            class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16][var17 + 1] = 4;
            class165.field2041[var16][var17 + 1] = var15;
         }

         if(var16 > 0 && var17 > 0 && class165.field2035[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class165.field2039[var18] = var4 - 1;
            class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 - 1][var17 - 1] = 3;
            class165.field2041[var16 - 1][var17 - 1] = var15;
         }

         if(var16 < 126 && var17 > 0 && class165.field2035[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class165.field2039[var18] = var4 + 1;
            class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 + 1][var17 - 1] = 9;
            class165.field2041[var16 + 1][var17 - 1] = var15;
         }

         if(var16 > 0 && var17 < 126 && class165.field2035[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class165.field2039[var18] = var4 - 1;
            class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 - 1][var17 + 1] = 6;
            class165.field2041[var16 - 1][var17 + 1] = var15;
         }

         if(var16 < 126 && var17 < 126 && class165.field2035[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class165.field2039[var18] = var4 + 1;
            class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2035[var16 + 1][var17 + 1] = 12;
            class165.field2041[var16 + 1][var17 + 1] = var15;
         }
      }

      WorldMapDecoration.field152 = var4;
      class165.field2037 = var5;
      return false;
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "63"
   )
   static boolean method696() {
      return Client.rights >= 2;
   }
}
