import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Sequence")
public class Sequence extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("seq_ref")
   public static IndexDataBase seq_ref;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("skel_ref")
   public static IndexDataBase skel_ref;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("skin_ref")
   public static IndexDataBase skin_ref;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("sequences")
   public static NodeCache sequences;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("skeletons")
   public static NodeCache skeletons;
   @ObfuscatedName("q")
   @Export("frameIDs")
   public int[] frameIDs;
   @ObfuscatedName("k")
   int[] field3542;
   @ObfuscatedName("i")
   @Export("frameLengths")
   public int[] frameLengths;
   @ObfuscatedName("x")
   public int[] field3543;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 375095033
   )
   @Export("frameStep")
   public int frameStep;
   @ObfuscatedName("p")
   @Export("interleaveLeave")
   int[] interleaveLeave;
   @ObfuscatedName("b")
   @Export("stretches")
   public boolean stretches;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2125188827
   )
   @Export("forcedPriority")
   public int forcedPriority;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1256278085
   )
   @Export("leftHandItem")
   public int leftHandItem;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -185139073
   )
   @Export("rightHandItem")
   public int rightHandItem;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2058553279
   )
   @Export("maxLoops")
   public int maxLoops;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1744953403
   )
   @Export("precedenceAnimating")
   public int precedenceAnimating;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1087712135
   )
   @Export("priority")
   public int priority;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1665152249
   )
   @Export("replyMode")
   public int replyMode;

   static {
      sequences = new NodeCache(64);
      skeletons = new NodeCache(100);
   }

   Sequence() {
      this.frameStep = -1;
      this.stretches = false;
      this.forcedPriority = 5;
      this.leftHandItem = -1;
      this.rightHandItem = -1;
      this.maxLoops = 99;
      this.precedenceAnimating = -1;
      this.priority = -1;
      this.replyMode = 2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "243481336"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "39"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedShort();
         this.frameLengths = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameLengths[var4] = var1.readUnsignedShort();
         }

         this.frameIDs = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameIDs[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameIDs[var4] += var1.readUnsignedShort() << 16;
         }
      } else if(var2 == 2) {
         this.frameStep = var1.readUnsignedShort();
      } else if(var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.interleaveLeave = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.interleaveLeave[var4] = var1.readUnsignedByte();
         }

         this.interleaveLeave[var3] = 9999999;
      } else if(var2 == 4) {
         this.stretches = true;
      } else if(var2 == 5) {
         this.forcedPriority = var1.readUnsignedByte();
      } else if(var2 == 6) {
         this.leftHandItem = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.rightHandItem = var1.readUnsignedShort();
      } else if(var2 == 8) {
         this.maxLoops = var1.readUnsignedByte();
      } else if(var2 == 9) {
         this.precedenceAnimating = var1.readUnsignedByte();
      } else if(var2 == 10) {
         this.priority = var1.readUnsignedByte();
      } else if(var2 == 11) {
         this.replyMode = var1.readUnsignedByte();
      } else if(var2 == 12) {
         var3 = var1.readUnsignedByte();
         this.field3542 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3542[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3542[var4] += var1.readUnsignedShort() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.field3543 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3543[var4] = var1.read24BitInt();
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1055944735"
   )
   @Export("post")
   void post() {
      if(this.precedenceAnimating == -1) {
         if(this.interleaveLeave != null) {
            this.precedenceAnimating = 2;
         } else {
            this.precedenceAnimating = 0;
         }
      }

      if(this.priority == -1) {
         if(this.interleaveLeave != null) {
            this.priority = 2;
         } else {
            this.priority = 0;
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "-1433585529"
   )
   @Export("transformActorModel")
   public Model transformActorModel(Model var1, int var2) {
      var2 = this.frameIDs[var2];
      Frames var3 = WorldMapDecoration.getFrames(var2 >> 16);
      var2 &= 65535;
      if(var3 == null) {
         return var1.toSharedModel(true);
      } else {
         Model var4 = var1.toSharedModel(!var3.method3075(var2));
         var4.method2724(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ldc;III)Ldc;",
      garbageValue = "416381559"
   )
   @Export("transformObjectModel")
   Model transformObjectModel(Model var1, int var2, int var3) {
      var2 = this.frameIDs[var2];
      Frames var4 = WorldMapDecoration.getFrames(var2 >> 16);
      var2 &= 65535;
      if(var4 == null) {
         return var1.toSharedModel(true);
      } else {
         Model var5 = var1.toSharedModel(!var4.method3075(var2));
         var3 &= 3;
         if(var3 == 1) {
            var5.rotateY270Ccw();
         } else if(var3 == 2) {
            var5.rotateY180Ccw();
         } else if(var3 == 3) {
            var5.rotateY90Ccw();
         }

         var5.method2724(var4, var2);
         if(var3 == 1) {
            var5.rotateY90Ccw();
         } else if(var3 == 2) {
            var5.rotateY180Ccw();
         } else if(var3 == 3) {
            var5.rotateY270Ccw();
         }

         return var5;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ldc;IB)Ldc;",
      garbageValue = "43"
   )
   @Export("transformSpotAnimModel")
   Model transformSpotAnimModel(Model var1, int var2) {
      var2 = this.frameIDs[var2];
      Frames var3 = WorldMapDecoration.getFrames(var2 >> 16);
      var2 &= 65535;
      if(var3 == null) {
         return var1.toSharedSpotAnimModel(true);
      } else {
         Model var4 = var1.toSharedSpotAnimModel(!var3.method3075(var2));
         var4.method2724(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ldc;ILjn;II)Ldc;",
      garbageValue = "1488793247"
   )
   @Export("applyTransformations")
   public Model applyTransformations(Model var1, int var2, Sequence var3, int var4) {
      var2 = this.frameIDs[var2];
      Frames var5 = WorldMapDecoration.getFrames(var2 >> 16);
      var2 &= 65535;
      if(var5 == null) {
         return var3.transformActorModel(var1, var4);
      } else {
         var4 = var3.frameIDs[var4];
         Frames var6 = WorldMapDecoration.getFrames(var4 >> 16);
         var4 &= 65535;
         Model var7;
         if(var6 == null) {
            var7 = var1.toSharedModel(!var5.method3075(var2));
            var7.method2724(var5, var2);
            return var7;
         } else {
            var7 = var1.toSharedModel(!var5.method3075(var2) & !var6.method3075(var4));
            var7.method2745(var5, var2, var6, var4, this.interleaveLeave);
            return var7;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "1136380155"
   )
   public Model method5219(Model var1, int var2) {
      int var3 = this.frameIDs[var2];
      Frames var4 = WorldMapDecoration.getFrames(var3 >> 16);
      var3 &= 65535;
      if(var4 == null) {
         return var1.toSharedModel(true);
      } else {
         Frames var5 = null;
         int var6 = 0;
         if(this.field3542 != null && var2 < this.field3542.length) {
            var6 = this.field3542[var2];
            var5 = WorldMapDecoration.getFrames(var6 >> 16);
            var6 &= 65535;
         }

         Model var7;
         if(var5 != null && var6 != 65535) {
            var7 = var1.toSharedModel(!var4.method3075(var3) & !var5.method3075(var6));
            var7.method2724(var4, var3);
            var7.method2724(var5, var6);
            return var7;
         } else {
            var7 = var1.toSharedModel(!var4.method3075(var3));
            var7.method2724(var4, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;Lkj;ZI)V",
      garbageValue = "1837948515"
   )
   @Export("drawLoginScreen")
   static void drawLoginScreen(Font var0, Font var1, Font var2, boolean var3) {
      if(var3) {
         class78.field1082 = (Varcs.canvasWidth - 765) / 2;
         class78.loginWindowX = class78.field1082 + 202;
         class78.field1091 = class78.loginWindowX + 180;
      }

      byte var4;
      int var5;
      int var7;
      int var8;
      int var11;
      int var12;
      int var29;
      int var31;
      int var35;
      int var37;
      int var39;
      if(class78.worldSelectShown) {
         if(class166.field2047 == null) {
            class166.field2047 = class21.getSprites(GZipDecompressor.indexSprites, "sl_back", "");
         }

         if(class13.slFlagSprites == null) {
            class13.slFlagSprites = class13.getIndexedSprites(GZipDecompressor.indexSprites, "sl_flags", "");
         }

         if(class126.slArrowSprites == null) {
            class126.slArrowSprites = class13.getIndexedSprites(GZipDecompressor.indexSprites, "sl_arrows", "");
         }

         if(MapIcon.slStarSprites == null) {
            MapIcon.slStarSprites = class13.getIndexedSprites(GZipDecompressor.indexSprites, "sl_stars", "");
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(class78.field1082, 23, 765, 480, 0);
         Rasterizer2D.method5748(class78.field1082, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.method5748(class78.field1082 + 125, 0, 640, 23, 5197647, 2697513);
         var0.drawTextCentered("Select a world", class78.field1082 + 62, 15, 0, -1);
         if(MapIcon.slStarSprites != null) {
            MapIcon.slStarSprites[1].method5829(class78.field1082 + 140, 1);
            var1.method5522("Members only world", class78.field1082 + 152, 10, 16777215, -1);
            MapIcon.slStarSprites[0].method5829(class78.field1082 + 140, 12);
            var1.method5522("Free world", class78.field1082 + 152, 21, 16777215, -1);
         }

         if(class126.slArrowSprites != null) {
            var29 = class78.field1082 + 280;
            if(World.field946[0] == 0 && World.field939[0] == 0) {
               class126.slArrowSprites[2].method5829(var29, 4);
            } else {
               class126.slArrowSprites[0].method5829(var29, 4);
            }

            if(World.field946[0] == 0 && World.field939[0] == 1) {
               class126.slArrowSprites[3].method5829(var29 + 15, 4);
            } else {
               class126.slArrowSprites[1].method5829(var29 + 15, 4);
            }

            var0.method5522("World", var29 + 32, 17, 16777215, -1);
            var5 = class78.field1082 + 390;
            if(World.field946[0] == 1 && World.field939[0] == 0) {
               class126.slArrowSprites[2].method5829(var5, 4);
            } else {
               class126.slArrowSprites[0].method5829(var5, 4);
            }

            if(World.field946[0] == 1 && World.field939[0] == 1) {
               class126.slArrowSprites[3].method5829(var5 + 15, 4);
            } else {
               class126.slArrowSprites[1].method5829(var5 + 15, 4);
            }

            var0.method5522("Players", var5 + 32, 17, 16777215, -1);
            var31 = class78.field1082 + 500;
            if(World.field946[0] == 2 && World.field939[0] == 0) {
               class126.slArrowSprites[2].method5829(var31, 4);
            } else {
               class126.slArrowSprites[0].method5829(var31, 4);
            }

            if(World.field946[0] == 2 && World.field939[0] == 1) {
               class126.slArrowSprites[3].method5829(var31 + 15, 4);
            } else {
               class126.slArrowSprites[1].method5829(var31 + 15, 4);
            }

            var0.method5522("Location", var31 + 32, 17, 16777215, -1);
            var7 = class78.field1082 + 610;
            if(World.field946[0] == 3 && World.field939[0] == 0) {
               class126.slArrowSprites[2].method5829(var7, 4);
            } else {
               class126.slArrowSprites[0].method5829(var7, 4);
            }

            if(World.field946[0] == 3 && World.field939[0] == 1) {
               class126.slArrowSprites[3].method5829(var7 + 15, 4);
            } else {
               class126.slArrowSprites[1].method5829(var7 + 15, 4);
            }

            var0.method5522("Type", var7 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(class78.field1082 + 708, 4, 50, 16, 0);
         var1.drawTextCentered("Cancel", class78.field1082 + 708 + 25, 16, 16777215, -1);
         class78.field1116 = -1;
         if(class166.field2047 != null) {
            var4 = 88;
            byte var38 = 19;
            var31 = 765 / (var4 + 1);
            var7 = 480 / (var38 + 1);

            do {
               var8 = var7;
               var35 = var31;
               if(var7 * (var31 - 1) >= World.worldCount) {
                  --var31;
               }

               if(var31 * (var7 - 1) >= World.worldCount) {
                  --var7;
               }

               if(var31 * (var7 - 1) >= World.worldCount) {
                  --var7;
               }
            } while(var8 != var7 || var31 != var35);

            var8 = (765 - var4 * var31) / (var31 + 1);
            if(var8 > 5) {
               var8 = 5;
            }

            var35 = (480 - var38 * var7) / (var7 + 1);
            if(var35 > 5) {
               var35 = 5;
            }

            var37 = (765 - var4 * var31 - var8 * (var31 - 1)) / 2;
            var11 = (480 - var7 * var38 - var35 * (var7 - 1)) / 2;
            var12 = var11 + 23;
            var39 = var37 + class78.field1082;
            int var40 = 0;
            boolean var41 = false;

            int var42;
            for(var42 = 0; var42 < World.worldCount; ++var42) {
               World var17 = World.worldList[var42];
               boolean var18 = true;
               String var19 = Integer.toString(var17.playerCount);
               if(var17.playerCount == -1) {
                  var19 = "OFF";
                  var18 = false;
               } else if(var17.playerCount > 1980) {
                  var19 = "FULL";
                  var18 = false;
               }

               int var21 = 0;
               byte var20;
               if(var17.method1577()) {
                  if(var17.method1589()) {
                     var20 = 7;
                  } else {
                     var20 = 6;
                  }
               } else if(var17.method1570()) {
                  var21 = 16711680;
                  if(var17.method1589()) {
                     var20 = 5;
                  } else {
                     var20 = 4;
                  }
               } else if(var17.method1568()) {
                  if(var17.method1589()) {
                     var20 = 3;
                  } else {
                     var20 = 2;
                  }
               } else if(var17.method1589()) {
                  var20 = 1;
               } else {
                  var20 = 0;
               }

               if(MouseInput.mouseLastX >= var39 && MouseInput.mouseLastY * 673804999 >= var12 && MouseInput.mouseLastX < var39 + var4 && MouseInput.mouseLastY * 673804999 < var38 + var12 && var18) {
                  class78.field1116 = var42;
                  class166.field2047[var20].method5855(var39, var12, 128, 16777215);
                  var41 = true;
               } else {
                  class166.field2047[var20].method5849(var39, var12);
               }

               if(class13.slFlagSprites != null) {
                  class13.slFlagSprites[(var17.method1589()?8:0) + var17.location].method5829(var39 + 29, var12);
               }

               var0.drawTextCentered(Integer.toString(var17.id), var39 + 15, var38 / 2 + var12 + 5, var21, -1);
               var1.drawTextCentered(var19, var39 + 60, var38 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var38 + var35;
               ++var40;
               if(var40 >= var7) {
                  var12 = var11 + 23;
                  var39 = var39 + var4 + var8;
                  var40 = 0;
               }
            }

            if(var41) {
               var42 = var1.getTextWidth(World.worldList[class78.field1116].activity) + 6;
               int var26 = var1.verticalSpace + 8;
               Rasterizer2D.Rasterizer2D_fillRectangle(MouseInput.mouseLastX - var42 / 2, MouseInput.mouseLastY * 673804999 + 20 + 5, var42, var26, 16777120);
               Rasterizer2D.drawRectangle(MouseInput.mouseLastX - var42 / 2, MouseInput.mouseLastY * 673804999 + 20 + 5, var42, var26, 0);
               var1.drawTextCentered(World.worldList[class78.field1116].activity, MouseInput.mouseLastX, MouseInput.mouseLastY * 673804999 + var1.verticalSpace + 20 + 5 + 4, 0, -1);
            }
         }

         GameSocket.rasterProvider.drawFull(0, 0);
      } else {
         if(var3) {
            class78.field1092.method5849(class78.field1082, 0);
            class78.field1087.method5849(class78.field1082 + 382, 0);
            class78.logoSprite.method5829(class78.field1082 + 382 - class78.logoSprite.width / 2, 18);
         }

         if(Client.gameState == 0 || Client.gameState == 5) {
            var4 = 20;
            var0.drawTextCentered("RuneScape is loading - please wait...", class78.loginWindowX + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            Rasterizer2D.drawRectangle(class78.loginWindowX + 180 - 152, var5, 304, 34, 9179409);
            Rasterizer2D.drawRectangle(class78.loginWindowX + 180 - 151, var5 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(class78.loginWindowX + 180 - 150, var5 + 2, class78.loadingBarPercentage * 3, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(class78.loadingBarPercentage * 3 + (class78.loginWindowX + 180 - 150), var5 + 2, 300 - class78.loadingBarPercentage * 3, 30, 0);
            var0.drawTextCentered(class78.loadingText, class78.loginWindowX + 180, 276 - var4, 16777215, -1);
         }

         String var22;
         short var28;
         short var30;
         if(Client.gameState == 20) {
            class78.field1083.method5829(class78.loginWindowX + 180 - class78.field1083.width / 2, 271 - class78.field1083.height / 2);
            var28 = 201;
            var0.drawTextCentered(class78.loginMessage1, class78.loginWindowX + 180, var28, 16776960, 0);
            var29 = var28 + 15;
            var0.drawTextCentered(class78.loginMessage2, class78.loginWindowX + 180, var29, 16776960, 0);
            var29 += 15;
            var0.drawTextCentered(class78.loginMessage3, class78.loginWindowX + 180, var29, 16776960, 0);
            var29 += 15;
            var29 += 7;
            if(class78.loginIndex != 4) {
               var0.method5522("Login: ", class78.loginWindowX + 180 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var22 = class59.method1076(); var0.getTextWidth(var22) > var30; var22 = var22.substring(0, var22.length() - 1)) {
                  ;
               }

               var0.method5522(FontTypeFace.appendTags(var22), class78.loginWindowX + 180 - 70, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("Password: " + class265.method4976(class78.password), class78.loginWindowX + 180 - 108, var29, 16777215, 0);
               var29 += 15;
            }
         }

         if(Client.gameState == 10 || Client.gameState == 11) {
            class78.field1083.method5829(class78.loginWindowX, 171);
            short var6;
            if(class78.loginIndex == 0) {
               var28 = 251;
               var0.drawTextCentered("Welcome to RuneScape", class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 30;
               var5 = class78.loginWindowX + 180 - 80;
               var6 = 291;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5526("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5526("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class78.loginIndex == 1) {
               var0.drawTextCentered(class78.Login_response0, class78.loginWindowX + 180, 201, 16776960, 0);
               var28 = 236;
               var0.drawTextCentered(class78.loginMessage1, class78.loginWindowX + 180, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.drawTextCentered(class78.loginMessage2, class78.loginWindowX + 180, var29, 16777215, 0);
               var29 += 15;
               var0.drawTextCentered(class78.loginMessage3, class78.loginWindowX + 180, var29, 16777215, 0);
               var29 += 15;
               var5 = class78.loginWindowX + 180 - 80;
               var6 = 321;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Continue", var5, var6 + 5, 16777215, 0);
               var5 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Cancel", var5, var6 + 5, 16777215, 0);
            } else if(class78.loginIndex == 2) {
               var28 = 201;
               var0.drawTextCentered(class78.loginMessage1, class78.field1091, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.drawTextCentered(class78.loginMessage2, class78.field1091, var29, 16776960, 0);
               var29 += 15;
               var0.drawTextCentered(class78.loginMessage3, class78.field1091, var29, 16776960, 0);
               var29 += 15;
               var29 += 7;
               var0.method5522("Login: ", class78.field1091 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var22 = class59.method1076(); var0.getTextWidth(var22) > var30; var22 = var22.substring(1)) {
                  ;
               }

               var0.method5522(FontTypeFace.appendTags(var22) + (class78.currentLoginField == 0 & Client.gameCycle % 40 < 20?class6.getColTags(16776960) + "|":""), class78.field1091 - 70, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("Password: " + class265.method4976(class78.password) + (class78.currentLoginField == 1 & Client.gameCycle % 40 < 20?class6.getColTags(16776960) + "|":""), class78.field1091 - 108, var29, 16777215, 0);
               var29 += 15;
               var28 = 277;
               var7 = class78.field1091 + -117;
               boolean var9 = class78.Login_isUsernameRemembered;
               boolean var10 = class78.field1110;
               IndexedSprite var23 = var9?(var10?ItemContainer.field472:class78.field1089):(var10?Resampler.field1352:class235.field2783);
               var23.method5829(var7, var28);
               var7 = var7 + var23.width + 5;
               var1.method5522("Remember username", var7, var28 + 13, 16776960, 0);
               var7 = class78.field1091 + 24;
               boolean var13 = class10.preferences.hideUsername;
               boolean var14 = class78.field1115;
               IndexedSprite var25 = var13?(var14?ItemContainer.field472:class78.field1089):(var14?Resampler.field1352:class235.field2783);
               var25.method5829(var7, var28);
               var7 = var7 + var25.width + 5;
               var1.method5522("Hide username", var7, var28 + 13, 16776960, 0);
               var29 = var28 + 15;
               int var15 = class78.field1091 - 80;
               short var16 = 321;
               class78.field1084.method5829(var15 - 73, var16 - 20);
               var0.drawTextCentered("Login", var15, var16 + 5, 16777215, 0);
               var15 = class78.field1091 + 80;
               class78.field1084.method5829(var15 - 73, var16 - 20);
               var0.drawTextCentered("Cancel", var15, var16 + 5, 16777215, 0);
               var28 = 357;
               var1.drawTextCentered("Forgotten your password? <col=ffffff>Click here.", class78.field1091, var28, 16776960, 0);
            } else if(class78.loginIndex == 3) {
               var28 = 201;
               var0.drawTextCentered("Invalid username or password.", class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 20;
               var1.drawTextCentered("For accounts created after 24th November 2010, please use your", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var1.drawTextCentered("email address to login. Otherwise please login with your username.", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = class78.loginWindowX + 180;
               var6 = 276;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var2.drawTextCentered("Try again", var5, var6 + 5, 16777215, 0);
               var5 = class78.loginWindowX + 180;
               var6 = 326;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var2.drawTextCentered("Forgotten password?", var5, var6 + 5, 16777215, 0);
            } else if(class78.loginIndex == 4) {
               var0.drawTextCentered("Authenticator", class78.loginWindowX + 180, 201, 16776960, 0);
               var28 = 236;
               var0.drawTextCentered(class78.loginMessage1, class78.loginWindowX + 180, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.drawTextCentered(class78.loginMessage2, class78.loginWindowX + 180, var29, 16777215, 0);
               var29 += 15;
               var0.drawTextCentered(class78.loginMessage3, class78.loginWindowX + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("PIN: " + class265.method4976(MapIcon.field238) + (Client.gameCycle % 40 < 20?class6.getColTags(16776960) + "|":""), class78.loginWindowX + 180 - 108, var29, 16777215, 0);
               var29 -= 8;
               var0.method5522("Trust this computer", class78.loginWindowX + 180 - 9, var29, 16776960, 0);
               var29 += 15;
               var0.method5522("for 30 days: ", class78.loginWindowX + 180 - 9, var29, 16776960, 0);
               var5 = class78.loginWindowX + 180 - 9 + var0.getTextWidth("for 30 days: ") + 15;
               var31 = var29 - var0.verticalSpace;
               IndexedSprite var27;
               if(class78.field1104) {
                  var27 = class78.field1089;
               } else {
                  var27 = class235.field2783;
               }

               var27.method5829(var5, var31);
               var29 += 15;
               var8 = class78.loginWindowX + 180 - 80;
               short var34 = 321;
               class78.field1084.method5829(var8 - 73, var34 - 20);
               var0.drawTextCentered("Continue", var8, var34 + 5, 16777215, 0);
               var8 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var8 - 73, var34 - 20);
               var0.drawTextCentered("Cancel", var8, var34 + 5, 16777215, 0);
               var1.drawTextCentered("<u=ff>Can\'t Log In?</u>", class78.loginWindowX + 180, var34 + 36, 255, 0);
            } else if(class78.loginIndex == 5) {
               var0.drawTextCentered("Forgotten your password?", class78.loginWindowX + 180, 201, 16776960, 0);
               var28 = 221;
               var2.drawTextCentered(class78.loginMessage1, class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.drawTextCentered(class78.loginMessage2, class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var2.drawTextCentered(class78.loginMessage3, class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var29 += 14;
               var0.method5522("Username/email: ", class78.loginWindowX + 180 - 145, var29, 16777215, 0);
               var30 = 174;

               for(var22 = class59.method1076(); var0.getTextWidth(var22) > var30; var22 = var22.substring(1)) {
                  ;
               }

               var0.method5522(FontTypeFace.appendTags(var22) + (Client.gameCycle % 40 < 20?class6.getColTags(16776960) + "|":""), class78.loginWindowX + 180 - 34, var29, 16777215, 0);
               var29 += 15;
               var7 = class78.loginWindowX + 180 - 80;
               short var32 = 321;
               class78.field1084.method5829(var7 - 73, var32 - 20);
               var0.drawTextCentered("Recover", var7, var32 + 5, 16777215, 0);
               var7 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var7 - 73, var32 - 20);
               var0.drawTextCentered("Back", var7, var32 + 5, 16777215, 0);
            } else if(class78.loginIndex == 6) {
               var28 = 201;
               var0.drawTextCentered(class78.loginMessage1, class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.drawTextCentered(class78.loginMessage2, class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var0.drawTextCentered(class78.loginMessage3, class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = class78.loginWindowX + 180;
               var6 = 321;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Back", var5, var6 + 5, 16777215, 0);
            } else if(class78.loginIndex == 7) {
               var28 = 216;
               var0.drawTextCentered("Your date of birth isn\'t set.", class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.drawTextCentered("Please verify your account status by", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var2.drawTextCentered("setting your date of birth.", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = class78.loginWindowX + 180 - 80;
               var6 = 321;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Set Date of Birth", var5, var6 + 5, 16777215, 0);
               var5 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Back", var5, var6 + 5, 16777215, 0);
            } else if(class78.loginIndex == 8) {
               var28 = 216;
               var0.drawTextCentered("Sorry, but your account is not eligible to play.", class78.loginWindowX + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.drawTextCentered("For more information, please take a look at", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var2.drawTextCentered("our privacy policy.", class78.loginWindowX + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = class78.loginWindowX + 180 - 80;
               var6 = 321;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Privacy Policy", var5, var6 + 5, 16777215, 0);
               var5 = class78.loginWindowX + 180 + 80;
               class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.drawTextCentered("Back", var5, var6 + 5, 16777215, 0);
            }
         }

         if(class78.field1097 > 0) {
            var29 = class78.field1097;
            var30 = 256;
            class78.field1095 += var29 * 128;
            if(class78.field1095 > AbstractByteBuffer.field2367.length) {
               class78.field1095 -= AbstractByteBuffer.field2367.length;
               var31 = (int)(Math.random() * 12.0D);
               FriendManager.method1682(class78.runeSprites[var31]);
            }

            var31 = 0;
            var7 = var29 * 128;
            var8 = (var30 - var29) * 128;

            for(var35 = 0; var35 < var8; ++var35) {
               var37 = SoundTaskDataProvider.field357[var7 + var31] - AbstractByteBuffer.field2367[var31 + class78.field1095 & AbstractByteBuffer.field2367.length - 1] * var29 / 6;
               if(var37 < 0) {
                  var37 = 0;
               }

               SoundTaskDataProvider.field357[var31++] = var37;
            }

            for(var35 = var30 - var29; var35 < var30; ++var35) {
               var37 = var35 * 128;

               for(var11 = 0; var11 < 128; ++var11) {
                  var12 = (int)(Math.random() * 100.0D);
                  if(var12 < 50 && var11 > 10 && var11 < 118) {
                     SoundTaskDataProvider.field357[var11 + var37] = 255;
                  } else {
                     SoundTaskDataProvider.field357[var37 + var11] = 0;
                  }
               }
            }

            if(class78.field1088 > 0) {
               class78.field1088 -= var29 * 4;
            }

            if(class78.field1094 > 0) {
               class78.field1094 -= var29 * 4;
            }

            if(class78.field1088 == 0 && class78.field1094 == 0) {
               var35 = (int)(Math.random() * (double)(2000 / var29));
               if(var35 == 0) {
                  class78.field1088 = 1024;
               }

               if(var35 == 1) {
                  class78.field1094 = 1024;
               }
            }

            for(var35 = 0; var35 < var30 - var29; ++var35) {
               class78.field1093[var35] = class78.field1093[var29 + var35];
            }

            for(var35 = var30 - var29; var35 < var30; ++var35) {
               class78.field1093[var35] = (int)(Math.sin((double)class78.field1114 / 14.0D) * 16.0D + Math.sin((double)class78.field1114 / 15.0D) * 14.0D + Math.sin((double)class78.field1114 / 16.0D) * 12.0D);
               ++class78.field1114;
            }

            class78.field1096 += var29;
            var35 = (var29 + (Client.gameCycle & 1)) / 2;
            if(var35 > 0) {
               for(var37 = 0; var37 < class78.field1096 * 100; ++var37) {
                  var11 = (int)(Math.random() * 124.0D) + 2;
                  var12 = (int)(Math.random() * 128.0D) + 128;
                  SoundTaskDataProvider.field357[var11 + (var12 << 7)] = 192;
               }

               class78.field1096 = 0;
               var37 = 0;

               label575:
               while(true) {
                  if(var37 >= var30) {
                     var37 = 0;

                     while(true) {
                        if(var37 >= 128) {
                           break label575;
                        }

                        var11 = 0;

                        for(var12 = -var35; var12 < var30; ++var12) {
                           var39 = var12 * 128;
                           if(var12 + var35 < var30) {
                              var11 += class76.field1073[var35 * 128 + var39 + var37];
                           }

                           if(var12 - (var35 + 1) >= 0) {
                              var11 -= class76.field1073[var39 + var37 - (var35 + 1) * 128];
                           }

                           if(var12 >= 0) {
                              SoundTaskDataProvider.field357[var39 + var37] = var11 / (var35 * 2 + 1);
                           }
                        }

                        ++var37;
                     }
                  }

                  var11 = 0;
                  var12 = var37 * 128;

                  for(var39 = -var35; var39 < 128; ++var39) {
                     if(var35 + var39 < 128) {
                        var11 += SoundTaskDataProvider.field357[var39 + var12 + var35];
                     }

                     if(var39 - (var35 + 1) >= 0) {
                        var11 -= SoundTaskDataProvider.field357[var12 + var39 - (var35 + 1)];
                     }

                     if(var39 >= 0) {
                        class76.field1073[var39 + var12] = var11 / (var35 * 2 + 1);
                     }
                  }

                  ++var37;
               }
            }

            class78.field1097 = 0;
         }

         DecorativeObject.method3098();
         FrameMap.titlemuteSprite[class10.preferences.muted?1:0].method5829(class78.field1082 + 765 - 40, 463);
         if(Client.gameState > 5 && Client.languageId == 0) {
            if(class232.field2752 != null) {
               var29 = class78.field1082 + 5;
               var30 = 463;
               byte var36 = 100;
               byte var33 = 35;
               class232.field2752.method5829(var29, var30);
               var0.drawTextCentered("World" + " " + Client.world, var36 / 2 + var29, var33 / 2 + var30 - 2, 16777215, 0);
               if(class49.listFetcher != null) {
                  var1.drawTextCentered("Loading...", var36 / 2 + var29, var33 / 2 + var30 + 12, 16777215, 0);
               } else {
                  var1.drawTextCentered("Click to switch", var36 / 2 + var29, var33 / 2 + var30 + 12, 16777215, 0);
               }
            } else {
               class232.field2752 = class221.getSprite(GZipDecompressor.indexSprites, "sl_button", "");
            }
         }

      }
   }
}
