import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Player")
public final class Player extends Actor {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   @Export("name")
   Name name;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   @Export("composition")
   PlayerComposition composition;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1998294681
   )
   @Export("skullIcon")
   int skullIcon;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1980153081
   )
   @Export("overheadIcon")
   int overheadIcon;
   @ObfuscatedName("q")
   @Export("actions")
   String[] actions;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2003980775
   )
   @Export("combatLevel")
   int combatLevel;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1248875317
   )
   @Export("totalLevel")
   int totalLevel;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2078576503
   )
   int field562;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1490301437
   )
   @Export("animationCycleStart")
   int animationCycleStart;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1922127141
   )
   @Export("animationCycleEnd")
   int animationCycleEnd;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -479135119
   )
   int field556;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -316850739
   )
   int field557;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 265765217
   )
   int field558;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldc;"
   )
   @Export("model")
   Model model;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 668730737
   )
   int field559;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 293985015
   )
   int field547;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1873032529
   )
   int field565;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1295532419
   )
   int field553;
   @ObfuscatedName("y")
   @Export("isLowDetail")
   boolean isLowDetail;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1403765271
   )
   @Export("team")
   int team;
   @ObfuscatedName("j")
   @Export("hidden")
   boolean hidden;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 723692473
   )
   int field567;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2042887495
   )
   @Export("playerId")
   int playerId;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field569;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field554;
   @ObfuscatedName("af")
   boolean field571;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -672131463
   )
   int field572;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 329940333
   )
   int field573;

   Player() {
      this.skullIcon = -1;
      this.overheadIcon = -1;
      this.actions = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.actions[var1] = "";
      }

      this.combatLevel = 0;
      this.totalLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isLowDetail = false;
      this.team = 0;
      this.hidden = false;
      this.field569 = class289.field3633;
      this.field554 = class289.field3633;
      this.field571 = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "833204307"
   )
   @Export("decodeApperance")
   final void decodeApperance(Buffer var1) {
      var1.offset = 0;
      int var2 = var1.readUnsignedByte();
      this.skullIcon = var1.readByte();
      this.overheadIcon = var1.readByte();
      int var3 = -1;
      this.team = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readUnsignedByte();
         if(var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.readUnsignedByte();
            var4[var5] = var7 + (var6 << 8);
            if(var5 == 0 && var4[0] == 65535) {
               var3 = var1.readUnsignedShort();
               break;
            }

            if(var4[var5] >= 512) {
               int var8 = TextureProvider.getItemDefinition(var4[var5] - 512).team;
               if(var8 != 0) {
                  this.team = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.readUnsignedByte();
         if(var7 < 0 || var7 >= PlayerComposition.colorsToReplace[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.idlePoseAnimation = var1.readUnsignedShort();
      if(super.idlePoseAnimation == 65535) {
         super.idlePoseAnimation = -1;
      }

      super.field877 = var1.readUnsignedShort();
      if(super.field877 == 65535) {
         super.field877 = -1;
      }

      super.field878 = super.field877;
      super.field899 = var1.readUnsignedShort();
      if(super.field899 == 65535) {
         super.field899 = -1;
      }

      super.field880 = var1.readUnsignedShort();
      if(super.field880 == 65535) {
         super.field880 = -1;
      }

      super.field870 = var1.readUnsignedShort();
      if(super.field870 == 65535) {
         super.field870 = -1;
      }

      super.field882 = var1.readUnsignedShort();
      if(super.field882 == 65535) {
         super.field882 = -1;
      }

      super.field883 = var1.readUnsignedShort();
      if(super.field883 == 65535) {
         super.field883 = -1;
      }

      this.name = new Name(var1.readString(), MapIconReference.loginType);
      this.method1084();
      this.method1086();
      if(this == class138.localPlayer) {
         RunException.field1939 = this.name.getName();
      }

      this.combatLevel = var1.readUnsignedByte();
      this.totalLevel = var1.readUnsignedShort();
      this.hidden = var1.readUnsignedByte() == 1;
      if(Client.socketType == 0 && Client.rights >= 2) {
         this.hidden = false;
      }

      if(this.composition == null) {
         this.composition = new PlayerComposition();
      }

      this.composition.method4462(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-514053088"
   )
   @Export("isFriend")
   boolean isFriend() {
      if(this.field569 == class289.field3633) {
         this.method1085();
      }

      return this.field569 == class289.field3631;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-540228134"
   )
   void method1084() {
      this.field569 = class289.field3633;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-35"
   )
   void method1085() {
      this.field569 = DState.friendManager.method1637(this.name)?class289.field3631:class289.field3634;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1597718431"
   )
   @Export("isClanMember")
   boolean isClanMember() {
      if(this.field554 == class289.field3633) {
         this.method1087();
      }

      return this.field554 == class289.field3631;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "480560408"
   )
   void method1086() {
      this.field554 = class289.field3633;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1372893329"
   )
   void method1087() {
      this.field554 = WorldMapType3.clanMemberManager != null && WorldMapType3.clanMemberManager.isMember(this.name)?class289.field3631:class289.field3634;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-77"
   )
   @Export("getSize")
   int getSize() {
      return this.composition != null && this.composition.transformedNpcId != -1?HorizontalAlignment.getNpcDefinition(this.composition.transformedNpcId).size:1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   @Export("getModel")
   protected final Model getModel() {
      if(this.composition == null) {
         return null;
      } else {
         Sequence var1 = super.animation != -1 && super.actionAnimationDisable == 0?TotalQuantityComparator.getAnimation(super.animation):null;
         Sequence var2 = super.poseAnimation == -1 || this.isLowDetail || super.poseAnimation == super.idlePoseAnimation && var1 != null?null:TotalQuantityComparator.getAnimation(super.poseAnimation);
         Model var3 = this.composition.getModel(var1, super.actionFrame, var2, super.poseFrame);
         if(var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.logicalHeight = var3.modelHeight;
            Model var4;
            Model[] var5;
            if(!this.isLowDetail && super.graphic != -1 && super.spotAnimFrame != -1) {
               var4 = MouseRecorder.getSpotAnimType(super.graphic).getModel(super.spotAnimFrame);
               if(var4 != null) {
                  var4.offsetBy(0, -super.field871, 0);
                  var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
               }
            }

            if(!this.isLowDetail && this.model != null) {
               if(Client.gameCycle >= this.animationCycleEnd) {
                  this.model = null;
               }

               if(Client.gameCycle >= this.animationCycleStart && Client.gameCycle < this.animationCycleEnd) {
                  var4 = this.model;
                  var4.offsetBy(this.field556 - super.x, this.field557 - this.field562, this.field558 - super.y);
                  if(super.orientation == 512) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if(super.orientation == 1024) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if(super.orientation == 1536) {
                     var4.rotateY90Ccw();
                  }

                  var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
                  if(super.orientation == 512) {
                     var4.rotateY90Ccw();
                  } else if(super.orientation == 1024) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if(super.orientation == 1536) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  }

                  var4.offsetBy(super.x - this.field556, this.field562 - this.field557, super.y - this.field558);
               }
            }

            var3.field1603 = true;
            return var3;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "-1440413395"
   )
   final void method1106(int var1, int var2, byte var3) {
      if(super.animation != -1 && TotalQuantityComparator.getAnimation(super.animation).priority == 1) {
         super.animation = -1;
      }

      super.field920 = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if(var3 == 2) {
               PendingSpawn.method1538(this, var1, var2, (byte)2);
            }

            this.method1105(var1, var2, var3);
         } else {
            this.method1103(var1, var2);
         }
      } else {
         this.method1103(var1, var2);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2124327900"
   )
   void method1103(int var1, int var2) {
      super.queueSize = 0;
      super.field930 = 0;
      super.field923 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.getSize();
      super.x = var3 * 64 + super.pathX[0] * 128;
      super.y = var3 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "12"
   )
   final void method1105(int var1, int var2, byte var3) {
      if(super.queueSize < 9) {
         ++super.queueSize;
      }

      for(int var4 = super.queueSize; var4 > 0; --var4) {
         super.pathX[var4] = super.pathX[var4 - 1];
         super.pathY[var4] = super.pathY[var4 - 1];
         super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.pathTraversed[0] = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
   )
   @Export("hasConfig")
   final boolean hasConfig() {
      return this.composition != null;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1852538691"
   )
   static void method1120(int var0, int var1) {
      class171.method3451(class229.topContextMenuRow, var0, var1);
      class229.topContextMenuRow = null;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "941710605"
   )
   static void method1114(Widget var0) {
      if(var0.loopCycle == Client.field830) {
         Client.field697[var0.boundsIndex] = true;
      }

   }
}
