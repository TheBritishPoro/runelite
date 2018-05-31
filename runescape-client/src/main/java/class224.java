import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class224 extends CacheableNode {
   @ObfuscatedName("pr")
   @ObfuscatedGetter(
      intValue = -1966696999
   )
   static int field2555;
   @ObfuscatedName("x")
   static int[] field2554;
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexCache3")
   static IndexData indexCache3;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -260867157
   )
   public final int field2553;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1228930619
   )
   public final int field2549;
   @ObfuscatedName("s")
   public final int[] field2550;
   @ObfuscatedName("l")
   public final int[] field2551;

   class224(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2553 = var1;
      this.field2549 = var2;
      this.field2550 = var3;
      this.field2551 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "1"
   )
   public boolean method4423(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field2551.length) {
         int var3 = this.field2551[var2];
         if(var1 >= var3 && var1 <= var3 + this.field2550[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;I)I",
      garbageValue = "-1700861018"
   )
   static int method4426(IndexDataBase var0, IndexDataBase var1) {
      int var2 = 0;
      if(var0.tryLoadRecordByNames("title.jpg", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("logo", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("logo_deadman_mode", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("titlebox", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("titlebutton", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("runes", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("title_mute", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("options_radio_buttons,0", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("options_radio_buttons,2", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("options_radio_buttons,4", "")) {
         ++var2;
      }

      if(var1.tryLoadRecordByNames("options_radio_buttons,6", "")) {
         ++var2;
      }

      var1.tryLoadRecordByNames("sl_back", "");
      var1.tryLoadRecordByNames("sl_flags", "");
      var1.tryLoadRecordByNames("sl_arrows", "");
      var1.tryLoadRecordByNames("sl_stars", "");
      var1.tryLoadRecordByNames("sl_button", "");
      return var2;
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-1148957073"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = MapIcon.region.method2898(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var14;
      int var25;
      if(var5 != 0L) {
         var7 = MapIcon.region.method2902(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         boolean var12 = var5 != 0L;
         if(var12) {
            boolean var13 = (int)(var5 >>> 16 & 1L) == 1;
            var12 = !var13;
         }

         if(var12) {
            var10 = var4;
         }

         int[] var19 = NPC.minimapSprite.pixels;
         var25 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = KeyFocusListener.method673(var5);
         ObjectComposition var15 = FileOnDisk.getObjectDefinition(var14);
         if(var15.mapSceneId != -1) {
            IndexedSprite var16 = class25.mapscene[var15.mapSceneId];
            if(var16 != null) {
               int var17 = (var15.width * 4 - var16.width) / 2;
               int var18 = (var15.length * 4 - var16.height) / 2;
               var16.method5829(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.length) * 4 + 48);
            }
         } else {
            if(var9 == 0 || var9 == 2) {
               if(var8 == 0) {
                  var19[var25] = var10;
                  var19[var25 + 512] = var10;
                  var19[var25 + 1024] = var10;
                  var19[var25 + 1536] = var10;
               } else if(var8 == 1) {
                  var19[var25] = var10;
                  var19[var25 + 1] = var10;
                  var19[var25 + 2] = var10;
                  var19[var25 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var25 + 3] = var10;
                  var19[var25 + 512 + 3] = var10;
                  var19[var25 + 1024 + 3] = var10;
                  var19[var25 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var19[var25 + 1536] = var10;
                  var19[var25 + 1536 + 1] = var10;
                  var19[var25 + 1536 + 2] = var10;
                  var19[var25 + 1536 + 3] = var10;
               }
            }

            if(var9 == 3) {
               if(var8 == 0) {
                  var19[var25] = var10;
               } else if(var8 == 1) {
                  var19[var25 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var25 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var19[var25 + 1536] = var10;
               }
            }

            if(var9 == 2) {
               if(var8 == 3) {
                  var19[var25] = var10;
                  var19[var25 + 512] = var10;
                  var19[var25 + 1024] = var10;
                  var19[var25 + 1536] = var10;
               } else if(var8 == 0) {
                  var19[var25] = var10;
                  var19[var25 + 1] = var10;
                  var19[var25 + 2] = var10;
                  var19[var25 + 3] = var10;
               } else if(var8 == 1) {
                  var19[var25 + 3] = var10;
                  var19[var25 + 512 + 3] = var10;
                  var19[var25 + 1024 + 3] = var10;
                  var19[var25 + 1536 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var25 + 1536] = var10;
                  var19[var25 + 1536 + 1] = var10;
                  var19[var25 + 1536 + 2] = var10;
                  var19[var25 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = MapIcon.region.method2900(var0, var1, var2);
      if(0L != var5) {
         var7 = MapIcon.region.method2902(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = KeyFocusListener.method673(var5);
         ObjectComposition var20 = FileOnDisk.getObjectDefinition(var10);
         if(var20.mapSceneId != -1) {
            IndexedSprite var26 = class25.mapscene[var20.mapSceneId];
            if(var26 != null) {
               var25 = (var20.width * 4 - var26.width) / 2;
               var14 = (var20.length * 4 - var26.height) / 2;
               var26.method5829(var1 * 4 + var25 + 48, (104 - var2 - var20.length) * 4 + var14 + 48);
            }
         } else if(var9 == 9) {
            int var24 = 15658734;
            if(FriendManager.method1683(var5)) {
               var24 = 15597568;
            }

            int[] var23 = NPC.minimapSprite.pixels;
            var14 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if(var8 != 0 && var8 != 2) {
               var23[var14] = var24;
               var23[var14 + 1 + 512] = var24;
               var23[var14 + 1024 + 2] = var24;
               var23[var14 + 1536 + 3] = var24;
            } else {
               var23[var14 + 1536] = var24;
               var23[var14 + 1 + 1024] = var24;
               var23[var14 + 512 + 2] = var24;
               var23[var14 + 3] = var24;
            }
         }
      }

      var5 = MapIcon.region.method2901(var0, var1, var2);
      if(var5 != 0L) {
         var7 = KeyFocusListener.method673(var5);
         ObjectComposition var21 = FileOnDisk.getObjectDefinition(var7);
         if(var21.mapSceneId != -1) {
            IndexedSprite var22 = class25.mapscene[var21.mapSceneId];
            if(var22 != null) {
               var10 = (var21.width * 4 - var22.width) / 2;
               int var11 = (var21.length * 4 - var22.height) / 2;
               var22.method5829(var1 * 4 + var10 + 48, var11 + (104 - var2 - var21.length) * 4 + 48);
            }
         }
      }

   }
}
