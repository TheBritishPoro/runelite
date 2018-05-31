import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
final class class6 implements Comparator {
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -1755726803
   )
   static int field39;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2122998471
   )
   public static int field37;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-1297295614"
   )
   int method66(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.method16().compareTo(var2.method16());
   }

   public int compare(Object var1, Object var2) {
      return this.method66((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1575797810"
   )
   static int method69(int var0, int var1) {
      Overlay var2 = GrandExchangeEvents.getOverlayDefinition(var0);
      if(var2 == null) {
         return var1;
      } else if(var2.otherRgbColor >= 0) {
         return var2.otherRgbColor | -16777216;
      } else {
         int var3;
         int var4;
         byte var5;
         int var7;
         if(var2.texture >= 0) {
            var4 = Graphics3D.textureLoader.getAverageTextureRGB(var2.texture);
            var5 = 96;
            if(var4 == -2) {
               var3 = 12345678;
            } else if(var4 == -1) {
               if(var5 < 0) {
                  var5 = 0;
               } else if(var5 > 127) {
                  var5 = 127;
               }

               var7 = 127 - var5;
               var3 = var7;
            } else {
               var7 = var5 * (var4 & 127) / 128;
               if(var7 < 2) {
                  var7 = 2;
               } else if(var7 > 126) {
                  var7 = 126;
               }

               var3 = var7 + (var4 & 65408);
            }

            return Graphics3D.colorPalette[var3] | -16777216;
         } else if(var2.color == 16711935) {
            return var1;
         } else {
            var3 = KitDefinition.method4908(var2.hue, var2.saturation, var2.lightness);
            var5 = 96;
            if(var3 == -2) {
               var4 = 12345678;
            } else if(var3 == -1) {
               if(var5 < 0) {
                  var5 = 0;
               } else if(var5 > 127) {
                  var5 = 127;
               }

               var7 = 127 - var5;
               var4 = var7;
            } else {
               var7 = var5 * (var3 & 127) / 128;
               if(var7 < 2) {
                  var7 = 2;
               } else if(var7 > 126) {
                  var7 = 126;
               }

               var4 = var7 + (var3 & 65408);
            }

            return Graphics3D.colorPalette[var4] | -16777216;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "2"
   )
   @Export("getColTags")
   static String getColTags(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1623615200"
   )
   static void method75() {
      for(class68 var0 = (class68)class68.field985.getFront(); var0 != null; var0 = (class68)class68.field985.getNext()) {
         if(var0.field994 != null) {
            var0.method1688();
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgi;II)V",
      garbageValue = "392289778"
   )
   @Export("decodeMovement")
   static void decodeMovement(PacketBuffer var0, int var1) {
      boolean var2 = var0.getBits(1) == 1;
      if(var2) {
         class81.field1166[++class81.field1165 - 1] = var1;
      }

      int var3 = var0.getBits(2);
      Player var4 = Client.cachedPlayers[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field571 = false;
         } else if(Client.localInteractingIndex == var1) {
            throw new RuntimeException();
         } else {
            class81.Players_regions[var1] = (var4.field567 << 28) + (PendingSpawn.baseX + var4.pathX[0] >> 13 << 14) + (Client.baseY + var4.pathY[0] >> 13);
            if(var4.field920 != -1) {
               class81.Players_orientations[var1] = var4.field920;
            } else {
               class81.Players_orientations[var1] = var4.orientation;
            }

            class81.Players_targetIndices[var1] = var4.interacting;
            Client.cachedPlayers[var1] = null;
            if(var0.getBits(1) != 0) {
               class240.decodeRegionHash(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.getBits(3);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(var5 == 2) {
               ++var6;
               --var7;
            } else if(var5 == 3) {
               --var6;
            } else if(var5 == 4) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(var5 == 6) {
               ++var7;
            } else if(var5 == 7) {
               ++var6;
               ++var7;
            }

            if(Client.localInteractingIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.method1103(var6, var7);
               var4.field571 = false;
            } else if(var2) {
               var4.field571 = true;
               var4.field572 = var6;
               var4.field573 = var7;
            } else {
               var4.field571 = false;
               var4.method1106(var6, var7, class81.field1153[var1]);
            }

         } else if(var3 == 2) {
            var5 = var0.getBits(4);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if(var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(var5 == 2) {
               var7 -= 2;
            } else if(var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if(var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(var5 == 10) {
               var6 += 2;
               ++var7;
            } else if(var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(var5 == 13) {
               var7 += 2;
            } else if(var5 == 14) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(Client.localInteractingIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.method1103(var6, var7);
               var4.field571 = false;
            } else if(var2) {
               var4.field571 = true;
               var4.field572 = var6;
               var4.field573 = var7;
            } else {
               var4.field571 = false;
               var4.method1106(var6, var7, class81.field1153[var1]);
            }

         } else {
            var5 = var0.getBits(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.getBits(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.pathX[0];
               var11 = var9 + var4.pathY[0];
               if(Client.localInteractingIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.method1103(var10, var11);
                  var4.field571 = false;
               } else if(var2) {
                  var4.field571 = true;
                  var4.field572 = var10;
                  var4.field573 = var11;
               } else {
                  var4.field571 = false;
                  var4.method1106(var10, var11, class81.field1153[var1]);
               }

               var4.field567 = (byte)(var7 + var4.field567 & 3);
               if(Client.localInteractingIndex == var1) {
                  class13.plane = var4.field567;
               }

            } else {
               var6 = var0.getBits(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + PendingSpawn.baseX + var4.pathX[0] & 16383) - PendingSpawn.baseX;
               var11 = (var9 + Client.baseY + var4.pathY[0] & 16383) - Client.baseY;
               if(Client.localInteractingIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.method1103(var10, var11);
                  var4.field571 = false;
               } else if(var2) {
                  var4.field571 = true;
                  var4.field572 = var10;
                  var4.field573 = var11;
               } else {
                  var4.field571 = false;
                  var4.method1106(var10, var11, class81.field1153[var1]);
               }

               var4.field567 = (byte)(var7 + var4.field567 & 3);
               if(Client.localInteractingIndex == var1) {
                  class13.plane = var4.field567;
               }

            }
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-127094665"
   )
   static int method74(int var0, Script var1, boolean var2) {
      if(var0 == 5306) {
         int[] var3 = class69.intStack;
         int var4 = ++class69.intStackSize - 1;
         int var5 = Client.isResized?2:1;
         var3[var4] = var5;
         return 1;
      } else {
         int var6;
         if(var0 == 5307) {
            var6 = class69.intStack[--class69.intStackSize];
            if(var6 == 1 || var6 == 2) {
               class50.method991(var6);
            }

            return 1;
         } else if(var0 == 5308) {
            class69.intStack[++class69.intStackSize - 1] = class10.preferences.screenType;
            return 1;
         } else if(var0 != 5309) {
            return 2;
         } else {
            var6 = class69.intStack[--class69.intStackSize];
            if(var6 == 1 || var6 == 2) {
               class10.preferences.screenType = var6;
               class54.method1018();
            }

            return 1;
         }
      }
   }
}
