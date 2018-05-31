import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class35 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 543504023
   )
   int field303;
   @ObfuscatedName("w")
   byte[][][] field304;

   class35(int var1) {
      this.field303 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "600681554"
   )
   void method606(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && this.field303 != 0 && this.field304 != null) {
         var8 = this.method590(var8, var7);
         var7 = this.method591(var7);
         Rasterizer2D.method5733(var1, var2, var5, var6, var3, var4, this.field304[var7 - 1][var8], this.field303);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "103"
   )
   int method590(int var1, int var2) {
      if(var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if(var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1021725892"
   )
   int method591(int var1) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1956759512"
   )
   void method592() {
      if(this.field304 == null) {
         this.field304 = new byte[8][4][];
         this.method593();
         this.method625();
         this.method607();
         this.method596();
         this.method612();
         this.method598();
         this.method629();
         this.method595();
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-515491785"
   )
   void method593() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][3] = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2050739130"
   )
   void method625() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var2 >= 0 && var2 < var1.length) {
               if(var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field304[1][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][3] = var1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method607() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][3] = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1650929653"
   )
   void method596() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method612() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1963710771"
   )
   void method598() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var3 <= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var3 >= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][3] = var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2053571695"
   )
   void method629() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][3] = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "335208223"
   )
   void method595() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if(var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][3] = var1;
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-96"
   )
   static final void method609(Actor var0) {
      var0.poseAnimation = var0.idlePoseAnimation;
      if(var0.queueSize == 0) {
         var0.field923 = 0;
      } else {
         if(var0.animation != -1 && var0.actionAnimationDisable == 0) {
            Sequence var1 = TotalQuantityComparator.getAnimation(var0.animation);
            if(var0.field930 > 0 && var1.precedenceAnimating == 0) {
               ++var0.field923;
               return;
            }

            if(var0.field930 <= 0 && var1.priority == 0) {
               ++var0.field923;
               return;
            }
         }

         int var10 = var0.x;
         int var2 = var0.y;
         int var3 = var0.pathX[var0.queueSize - 1] * 128 + var0.field874 * 64;
         int var4 = var0.pathY[var0.queueSize - 1] * 128 + var0.field874 * 64;
         if(var10 < var3) {
            if(var2 < var4) {
               var0.orientation = 1280;
            } else if(var2 > var4) {
               var0.orientation = 1792;
            } else {
               var0.orientation = 1536;
            }
         } else if(var10 > var3) {
            if(var2 < var4) {
               var0.orientation = 768;
            } else if(var2 > var4) {
               var0.orientation = 256;
            } else {
               var0.orientation = 512;
            }
         } else if(var2 < var4) {
            var0.orientation = 1024;
         } else if(var2 > var4) {
            var0.orientation = 0;
         }

         byte var5 = var0.pathTraversed[var0.queueSize - 1];
         if(var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            int var6 = var0.orientation - var0.angle & 2047;
            if(var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var0.field880;
            if(var6 >= -256 && var6 <= 256) {
               var7 = var0.field899;
            } else if(var6 >= 256 && var6 < 768) {
               var7 = var0.field882;
            } else if(var6 >= -768 && var6 <= -256) {
               var7 = var0.field870;
            }

            if(var7 == -1) {
               var7 = var0.field899;
            }

            var0.poseAnimation = var7;
            int var8 = 4;
            boolean var9 = true;
            if(var0 instanceof NPC) {
               var9 = ((NPC)var0).composition.isClickable;
            }

            if(var9) {
               if(var0.orientation != var0.angle && var0.interacting == -1 && var0.field924 != 0) {
                  var8 = 2;
               }

               if(var0.queueSize > 2) {
                  var8 = 6;
               }

               if(var0.queueSize > 3) {
                  var8 = 8;
               }

               if(var0.field923 > 0 && var0.queueSize > 1) {
                  var8 = 8;
                  --var0.field923;
               }
            } else {
               if(var0.queueSize > 1) {
                  var8 = 6;
               }

               if(var0.queueSize > 2) {
                  var8 = 8;
               }

               if(var0.field923 > 0 && var0.queueSize > 1) {
                  var8 = 8;
                  --var0.field923;
               }
            }

            if(var5 == 2) {
               var8 <<= 1;
            }

            if(var8 >= 8 && var0.field899 == var0.poseAnimation && var0.field883 != -1) {
               var0.poseAnimation = var0.field883;
            }

            if(var10 != var3 || var2 != var4) {
               if(var10 < var3) {
                  var0.x += var8;
                  if(var0.x > var3) {
                     var0.x = var3;
                  }
               } else if(var10 > var3) {
                  var0.x -= var8;
                  if(var0.x < var3) {
                     var0.x = var3;
                  }
               }

               if(var2 < var4) {
                  var0.y += var8;
                  if(var0.y > var4) {
                     var0.y = var4;
                  }
               } else if(var2 > var4) {
                  var0.y -= var8;
                  if(var0.y < var4) {
                     var0.y = var4;
                  }
               }
            }

            if(var3 == var0.x && var4 == var0.y) {
               --var0.queueSize;
               if(var0.field930 > 0) {
                  --var0.field930;
               }
            }

         } else {
            var0.x = var3;
            var0.y = var4;
            --var0.queueSize;
            if(var0.field930 > 0) {
               --var0.field930;
            }

         }
      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Lba;IIIIIB)V",
      garbageValue = "13"
   )
   @Export("draw2DExtras")
   static final void draw2DExtras(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 != null && var0.hasConfig()) {
         if(var0 instanceof NPC) {
            NPCComposition var6 = ((NPC)var0).composition;
            if(var6.configs != null) {
               var6 = var6.transform();
            }

            if(var6 == null) {
               return;
            }
         }

         int var75 = class81.playerIndexesCount;
         int[] var7 = class81.playerIndices;
         byte var8 = 0;
         Player var10;
         if(var1 < var75 && var0.field889 == Client.gameCycle) {
            var10 = (Player)var0;
            boolean var9;
            if(Client.playerNameMask == 0) {
               var9 = false;
            } else {
               boolean var77;
               if(var10 == class138.localPlayer) {
                  var77 = (Client.playerNameMask & 8) != 0;
                  var9 = var77;
               } else {
                  var77 = WorldMapData.method260();
                  if(!var77) {
                     boolean var78 = (Client.playerNameMask & 1) != 0;
                     var77 = var78 && var10.isFriend();
                  }

                  var9 = var77 || MouseInput.method943() && var10.isClanMember();
               }
            }

            if(var9) {
               Player var11 = (Player)var0;
               if(var1 < var75) {
                  MessageNode.characterToScreen(var0, var0.logicalHeight + 15);
                  FontTypeFace var12 = (FontTypeFace)Client.fontsMap.get(FontName.FontName_plain12);
                  byte var13 = 9;
                  var12.drawTextCentered(var11.name.getName(), var2 + Client.screenX, var3 + Client.screenY - var13, 16777215, 0);
                  var8 = 18;
               }
            }
         }

         int var87 = -2;
         int var15;
         int var22;
         int var23;
         if(!var0.combatInfoList.isEmpty()) {
            MessageNode.characterToScreen(var0, var0.logicalHeight + 15);

            for(CombatInfoListHolder var88 = (CombatInfoListHolder)var0.combatInfoList.last(); var88 != null; var88 = (CombatInfoListHolder)var0.combatInfoList.previous()) {
               CombatInfo1 var89 = var88.method1773(Client.gameCycle);
               if(var89 == null) {
                  if(var88.method1774()) {
                     var88.unlink();
                  }
               } else {
                  CombatInfo2 var91 = var88.combatInfo2;
                  SpritePixels var76 = var91.method4918();
                  SpritePixels var14 = var91.method4917();
                  int var16 = 0;
                  if(var76 != null && var14 != null) {
                     if(var91.field3318 * 2 < var14.width) {
                        var16 = var91.field3318;
                     }

                     var15 = var14.width - var16 * 2;
                  } else {
                     var15 = var91.healthScale;
                  }

                  int var17 = 255;
                  boolean var18 = true;
                  int var19 = Client.gameCycle - var89.cycle;
                  int var20 = var15 * var89.health / var91.healthScale;
                  int var21;
                  int var92;
                  if(var89.int2 > var19) {
                     var21 = var91.field3308 == 0?0:var91.field3308 * (var19 / var91.field3308);
                     var22 = var15 * var89.healthRatio / var91.healthScale;
                     var92 = var21 * (var20 - var22) / var89.int2 + var22;
                  } else {
                     var92 = var20;
                     var21 = var91.field3313 + var89.int2 - var19;
                     if(var91.field3312 >= 0) {
                        var17 = (var21 << 8) / (var91.field3313 - var91.field3312);
                     }
                  }

                  if(var89.health > 0 && var92 < 1) {
                     var92 = 1;
                  }

                  if(var76 != null && var14 != null) {
                     if(var15 == var92) {
                        var92 += var16 * 2;
                     } else {
                        var92 += var16;
                     }

                     var21 = var76.height;
                     var87 += var21;
                     var22 = var2 + Client.screenX - (var15 >> 1);
                     var23 = var3 + Client.screenY - var87;
                     var22 -= var16;
                     if(var17 >= 0 && var17 < 255) {
                        var76.drawAtOpacity(var22, var23, var17);
                        Rasterizer2D.setInnerDrawRegion(var22, var23, var22 + var92, var23 + var21);
                        var14.drawAtOpacity(var22, var23, var17);
                     } else {
                        var76.drawAt(var22, var23);
                        Rasterizer2D.setInnerDrawRegion(var22, var23, var92 + var22, var21 + var23);
                        var14.drawAt(var22, var23);
                     }

                     Rasterizer2D.setDrawRegion(var2, var3, var2 + var4, var3 + var5);
                     var87 += 2;
                  } else {
                     var87 += 5;
                     if(Client.screenX > -1) {
                        var21 = var2 + Client.screenX - (var15 >> 1);
                        var22 = var3 + Client.screenY - var87;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var21, var22, var92, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var21 + var92, var22, var15 - var92, 5, 16711680);
                     }

                     var87 += 2;
                  }
               }
            }
         }

         if(var87 == -2) {
            var87 += 7;
         }

         var87 += var8;
         if(var1 < var75) {
            var10 = (Player)var0;
            if(var10.hidden) {
               return;
            }

            if(var10.skullIcon != -1 || var10.overheadIcon != -1) {
               MessageNode.characterToScreen(var0, var0.logicalHeight + 15);
               if(Client.screenX > -1) {
                  if(var10.skullIcon != -1) {
                     var87 += 25;
                     MilliTimer.headIconsPk[var10.skullIcon].drawAt(var2 + Client.screenX - 12, var3 + Client.screenY - var87);
                  }

                  if(var10.overheadIcon != -1) {
                     var87 += 25;
                     class43.headIconsPrayer[var10.overheadIcon].drawAt(var2 + Client.screenX - 12, var3 + Client.screenY - var87);
                  }
               }
            }

            if(var1 >= 0 && Client.hintArrowTargetType == 10 && var7[var1] == Client.hintArrowPlayerTargetIdx) {
               MessageNode.characterToScreen(var0, var0.logicalHeight + 15);
               if(Client.screenX > -1) {
                  var87 += MilliTimer.headIconsHint[1].height;
                  MilliTimer.headIconsHint[1].drawAt(var2 + Client.screenX - 12, var3 + Client.screenY - var87);
               }
            }
         } else {
            NPCComposition var90 = ((NPC)var0).composition;
            if(var90.configs != null) {
               var90 = var90.transform();
            }

            if(var90.headIcon >= 0 && var90.headIcon < class43.headIconsPrayer.length) {
               MessageNode.characterToScreen(var0, var0.logicalHeight + 15);
               if(Client.screenX > -1) {
                  class43.headIconsPrayer[var90.headIcon].drawAt(var2 + Client.screenX - 12, var3 + Client.screenY - 30);
               }
            }

            if(Client.hintArrowTargetType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcTargetIdx && Client.gameCycle % 20 < 10) {
               MessageNode.characterToScreen(var0, var0.logicalHeight + 15);
               if(Client.screenX > -1) {
                  MilliTimer.headIconsHint[0].drawAt(var2 + Client.screenX - 12, var3 + Client.screenY - 28);
               }
            }
         }

         if(var0.overhead != null && (var1 >= var75 || !var0.field886 && (Client.publicChatMode == 4 || !var0.field885 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            MessageNode.characterToScreen(var0, var0.logicalHeight);
            if(Client.screenX > -1 && Client.overheadTextCount < Client.field648) {
               Client.overheadTextsOffsetX[Client.overheadTextCount] = ClanMemberManager.fontBold12.getTextWidth(var0.overhead) / 2;
               Client.overheadTextsOffsetY[Client.overheadTextCount] = ClanMemberManager.fontBold12.verticalSpace;
               Client.overheadTextsX[Client.overheadTextCount] = Client.screenX;
               Client.overheadTextsY[Client.overheadTextCount] = Client.screenY;
               Client.field673[Client.overheadTextCount] = var0.field888;
               Client.field674[Client.overheadTextCount] = var0.field927;
               Client.overheadTextsCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadTexts[Client.overheadTextCount] = var0.overhead;
               ++Client.overheadTextCount;
            }
         }

         for(int var79 = 0; var79 < 4; ++var79) {
            int var95 = var0.hitsplatCycles[var79];
            int var96 = var0.hitsplatTypes[var79];
            class267 var94 = null;
            int var80 = 0;
            if(var96 >= 0) {
               if(var95 <= Client.gameCycle) {
                  continue;
               }

               var94 = WorldMapType3.method123(var0.hitsplatTypes[var79]);
               var80 = var94.field3355;
               if(var94 != null && var94.field3366 != null) {
                  var94 = var94.method4995();
                  if(var94 == null) {
                     var0.hitsplatCycles[var79] = -1;
                     continue;
                  }
               }
            } else if(var95 < 0) {
               continue;
            }

            var15 = var0.field894[var79];
            class267 var81 = null;
            if(var15 >= 0) {
               var81 = WorldMapType3.method123(var15);
               if(var81 != null && var81.field3366 != null) {
                  var81 = var81.method4995();
               }
            }

            if(var95 - var80 <= Client.gameCycle) {
               if(var94 == null) {
                  var0.hitsplatCycles[var79] = -1;
               } else {
                  MessageNode.characterToScreen(var0, var0.logicalHeight / 2);
                  if(Client.screenX > -1) {
                     if(var79 == 1) {
                        Client.screenY -= 20;
                     }

                     if(var79 == 2) {
                        Client.screenX -= 15;
                        Client.screenY -= 10;
                     }

                     if(var79 == 3) {
                        Client.screenX += 15;
                        Client.screenY -= 10;
                     }

                     SpritePixels var82 = null;
                     SpritePixels var83 = null;
                     SpritePixels var84 = null;
                     SpritePixels var85 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     SpritePixels var30 = null;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     SpritePixels var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var82 = var94.method4994();
                     int var43;
                     if(var82 != null) {
                        var22 = var82.width;
                        var43 = var82.height;
                        if(var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var82.offsetX;
                     }

                     var83 = var94.method5000();
                     if(var83 != null) {
                        var23 = var83.width;
                        var43 = var83.height;
                        if(var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var83.offsetX;
                     }

                     var84 = var94.method4996();
                     if(var84 != null) {
                        var24 = var84.width;
                        var43 = var84.height;
                        if(var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var84.offsetX;
                     }

                     var85 = var94.method4997();
                     if(var85 != null) {
                        var25 = var85.width;
                        var43 = var85.height;
                        if(var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var85.offsetX;
                     }

                     if(var81 != null) {
                        var30 = var81.method4994();
                        if(var30 != null) {
                           var34 = var30.width;
                           var43 = var30.height;
                           if(var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.offsetX;
                        }

                        var31 = var81.method5000();
                        if(var31 != null) {
                           var35 = var31.width;
                           var43 = var31.height;
                           if(var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.offsetX;
                        }

                        var32 = var81.method4996();
                        if(var32 != null) {
                           var36 = var32.width;
                           var43 = var32.height;
                           if(var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.offsetX;
                        }

                        var33 = var81.method4997();
                        if(var33 != null) {
                           var37 = var33.width;
                           var43 = var33.height;
                           if(var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.offsetX;
                        }
                     }

                     Font var86 = var94.method4998();
                     if(var86 == null) {
                        var86 = class151.fontPlain11;
                     }

                     Font var44;
                     if(var81 != null) {
                        var44 = var81.method4998();
                        if(var44 == null) {
                           var44 = class151.fontPlain11;
                        }
                     } else {
                        var44 = class151.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var94.method5014(var0.hitsplatValues[var79]);
                     int var93 = var86.getTextWidth(var45);
                     if(var81 != null) {
                        var46 = var81.method5014(var0.field921[var79]);
                        var48 = var44.getTextWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if(var23 > 0) {
                        if(var84 == null && var85 == null) {
                           var49 = 1;
                        } else {
                           var49 = var93 / var23 + 1;
                        }
                     }

                     if(var81 != null && var35 > 0) {
                        if(var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if(var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if(var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if(var23 > 0) {
                        var56 = var49 * var23;
                        var51 += var56;
                        var55 += (var56 - var93) / 2;
                     } else {
                        var51 += var93;
                     }

                     var56 = var51;
                     if(var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if(var81 != null) {
                        var51 += 2;
                        var57 = var51;
                        if(var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if(var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if(var35 > 0) {
                           var62 = var50 * var35;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if(var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.hitsplatCycles[var79] - Client.gameCycle;
                     int var63 = var94.field3365 - var62 * var94.field3365 / var94.field3355;
                     int var64 = var62 * var94.field3361 / var94.field3355 + -var94.field3361;
                     int var65 = var63 + (var2 + Client.screenX - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.screenY - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var94.field3347 + 15;
                     int var70 = var69 - var86.minSpacing;
                     int var71 = var69 + var86.maxSpacing;
                     if(var70 < var66) {
                        var67 = var70;
                     }

                     if(var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if(var81 != null) {
                        var72 = var66 + var81.field3347 + 15;
                        var73 = var72 - var44.minSpacing;
                        var74 = var72 + var44.maxSpacing;
                        if(var73 < var67) {
                           ;
                        }

                        if(var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if(var94.field3354 >= 0) {
                        var73 = (var62 << 8) / (var94.field3355 - var94.field3354);
                     }

                     if(var73 >= 0 && var73 < 255) {
                        if(var82 != null) {
                           var82.drawAtOpacity(var65 + var52 - var26, var66, var73);
                        }

                        if(var84 != null) {
                           var84.drawAtOpacity(var65 + var53 - var28, var66, var73);
                        }

                        if(var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.drawAtOpacity(var23 * var74 + (var54 + var65 - var27), var66, var73);
                           }
                        }

                        if(var85 != null) {
                           var85.drawAtOpacity(var56 + var65 - var29, var66, var73);
                        }

                        var86.method5523(var45, var65 + var55, var69, var94.field3364, 0, var73);
                        if(var81 != null) {
                           if(var30 != null) {
                              var30.drawAtOpacity(var65 + var57 - var38, var66, var73);
                           }

                           if(var32 != null) {
                              var32.drawAtOpacity(var58 + var65 - var40, var66, var73);
                           }

                           if(var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawAtOpacity(var74 * var35 + (var59 + var65 - var39), var66, var73);
                              }
                           }

                           if(var33 != null) {
                              var33.drawAtOpacity(var65 + var60 - var41, var66, var73);
                           }

                           var44.method5523(var46, var61 + var65, var72, var81.field3364, 0, var73);
                        }
                     } else {
                        if(var82 != null) {
                           var82.drawAt(var65 + var52 - var26, var66);
                        }

                        if(var84 != null) {
                           var84.drawAt(var65 + var53 - var28, var66);
                        }

                        if(var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.drawAt(var23 * var74 + (var65 + var54 - var27), var66);
                           }
                        }

                        if(var85 != null) {
                           var85.drawAt(var65 + var56 - var29, var66);
                        }

                        var86.method5522(var45, var65 + var55, var69, var94.field3364 | -16777216, 0);
                        if(var81 != null) {
                           if(var30 != null) {
                              var30.drawAt(var57 + var65 - var38, var66);
                           }

                           if(var32 != null) {
                              var32.drawAt(var58 + var65 - var40, var66);
                           }

                           if(var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawAt(var74 * var35 + (var59 + var65 - var39), var66);
                              }
                           }

                           if(var33 != null) {
                              var33.drawAt(var60 + var65 - var41, var66);
                           }

                           var44.method5522(var46, var65 + var61, var72, var81.field3364 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "46"
   )
   static final void method630(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(CombatInfo2.loadWidget(var0)) {
         Occluder.field1814 = null;
         MapIcon.gameDraw(GameCanvas.widgets[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if(Occluder.field1814 != null) {
            MapIcon.gameDraw(Occluder.field1814, -1412584499, var1, var2, var3, var4, class297.field3687, GrandExchangeEvents.field15, var7);
            Occluder.field1814 = null;
         }

      } else {
         if(var7 != -1) {
            Client.field697[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               Client.field697[var8] = true;
            }
         }

      }
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "1"
   )
   static final String method623(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      return var1.length() > 9?" " + class6.getColTags(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>":(var1.length() > 6?" " + class6.getColTags(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>":" " + class6.getColTags(16776960) + var1 + "</col>");
   }
}
