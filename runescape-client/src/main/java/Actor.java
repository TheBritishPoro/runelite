import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("pg")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   @Export("soundSystem1")
   static AbstractSoundSystem soundSystem1;
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   @Export("font_p12full")
   static Font font_p12full;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 1597177489
   )
   static int field932;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -353812825
   )
   @Export("x")
   int x;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -135314995
   )
   @Export("y")
   int y;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1566108753
   )
   @Export("angle")
   int angle;
   @ObfuscatedName("an")
   boolean field873;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 808497001
   )
   int field874;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1062831597
   )
   int field889;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1027122581
   )
   @Export("idlePoseAnimation")
   int idlePoseAnimation;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1892304885
   )
   int field877;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1941432163
   )
   int field878;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1474836853
   )
   int field899;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 674108011
   )
   int field880;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1928030999
   )
   int field870;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1369484479
   )
   int field882;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -559116125
   )
   int field883;
   @ObfuscatedName("ae")
   @Export("overhead")
   String overhead;
   @ObfuscatedName("az")
   boolean field885;
   @ObfuscatedName("aq")
   boolean field886;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 87062957
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1694129739
   )
   int field888;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 471818867
   )
   int field927;
   @ObfuscatedName("ay")
   byte field890;
   @ObfuscatedName("ag")
   @Export("hitsplatTypes")
   int[] hitsplatTypes;
   @ObfuscatedName("bk")
   @Export("hitsplatValues")
   int[] hitsplatValues;
   @ObfuscatedName("bp")
   @Export("hitsplatCycles")
   int[] hitsplatCycles;
   @ObfuscatedName("bi")
   int[] field894;
   @ObfuscatedName("bj")
   int[] field921;
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   @Export("combatInfoList")
   CombatInfoList combatInfoList;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1120664331
   )
   @Export("interacting")
   int interacting;
   @ObfuscatedName("bh")
   boolean field898;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 2101458875
   )
   int field920;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 78044413
   )
   @Export("poseAnimation")
   int poseAnimation;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1384170691
   )
   @Export("poseFrame")
   int poseFrame;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1568961233
   )
   @Export("poseFrameCycle")
   int poseFrameCycle;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -960665687
   )
   @Export("animation")
   int animation;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1053759299
   )
   @Export("actionFrame")
   int actionFrame;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1035623959
   )
   @Export("actionFrameCycle")
   int actionFrameCycle;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1172686273
   )
   @Export("actionAnimationDisable")
   int actionAnimationDisable;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -324712873
   )
   int field907;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -713878969
   )
   @Export("graphic")
   int graphic;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1209259789
   )
   @Export("spotAnimFrame")
   int spotAnimFrame;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1065899935
   )
   @Export("spotAnimFrameCycle")
   int spotAnimFrameCycle;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -186780303
   )
   @Export("graphicsDelay")
   int graphicsDelay;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -2078330443
   )
   int field871;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1724264335
   )
   int field913;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1469967635
   )
   int field916;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 685581775
   )
   int field915;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1320408917
   )
   int field929;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -554628483
   )
   int field917;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -1704660021
   )
   int field918;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 603572245
   )
   int field919;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -1097398609
   )
   @Export("npcCycle")
   int npcCycle;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1650929653
   )
   @Export("logicalHeight")
   int logicalHeight;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 287586055
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1130486837
   )
   int field875;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 618793723
   )
   int field924;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 978362049
   )
   @Export("queueSize")
   int queueSize;
   @ObfuscatedName("cw")
   @Export("pathX")
   int[] pathX;
   @ObfuscatedName("cf")
   @Export("pathY")
   int[] pathY;
   @ObfuscatedName("ca")
   @Export("pathTraversed")
   byte[] pathTraversed;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -1156127679
   )
   int field923;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -707245841
   )
   int field930;

   Actor() {
      this.field873 = false;
      this.field874 = 1;
      this.idlePoseAnimation = -1;
      this.field877 = -1;
      this.field878 = -1;
      this.field899 = -1;
      this.field880 = -1;
      this.field870 = -1;
      this.field882 = -1;
      this.field883 = -1;
      this.overhead = null;
      this.field886 = false;
      this.overheadTextCyclesRemaining = 100;
      this.field888 = 0;
      this.field927 = 0;
      this.field890 = 0;
      this.hitsplatTypes = new int[4];
      this.hitsplatValues = new int[4];
      this.hitsplatCycles = new int[4];
      this.field894 = new int[4];
      this.field921 = new int[4];
      this.combatInfoList = new CombatInfoList();
      this.interacting = -1;
      this.field898 = false;
      this.field920 = -1;
      this.poseAnimation = -1;
      this.poseFrame = 0;
      this.poseFrameCycle = 0;
      this.animation = -1;
      this.actionFrame = 0;
      this.actionFrameCycle = 0;
      this.actionAnimationDisable = 0;
      this.field907 = 0;
      this.graphic = -1;
      this.spotAnimFrame = 0;
      this.spotAnimFrameCycle = 0;
      this.npcCycle = 0;
      this.logicalHeight = 200;
      this.field875 = 0;
      this.field924 = 32;
      this.queueSize = 0;
      this.pathX = new int[10];
      this.pathY = new int[10];
      this.pathTraversed = new byte[10];
      this.field923 = 0;
      this.field930 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
   )
   @Export("hasConfig")
   boolean hasConfig() {
      return false;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2028787845"
   )
   final void method1540() {
      this.queueSize = 0;
      this.field930 = 0;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "77"
   )
   @Export("applyActorHitsplat")
   @Hook(
      value = "onActorHitsplat",
      end = true
   )
   final void applyActorHitsplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.hitsplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class267 var12 = WorldMapType3.method123(var1);
         var10 = var12.field3360;
         var11 = var12.field3355;
      }

      int var14;
      if(var8) {
         if(var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.hitsplatCycles[0];
         } else if(var10 == 1) {
            var14 = this.hitsplatValues[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(var10 == 0) {
               if(this.hitsplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitsplatCycles[var13];
               }
            } else if(var10 == 1 && this.hitsplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitsplatValues[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if(var7) {
            this.field890 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field890;
            this.field890 = (byte)((this.field890 + 1) % 4);
            if(this.hitsplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 >= 0) {
         this.hitsplatTypes[var9] = var1;
         this.hitsplatValues[var9] = var2;
         this.field894[var9] = var3;
         this.field921[var9] = var4;
         this.hitsplatCycles[var9] = var5 + var11 + var6;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-872169209"
   )
   @Export("setCombatInfo")
   final void setCombatInfo(int var1, int var2, int var3, int var4, int var5, int var6) {
      CombatInfo2 var8 = (CombatInfo2)CombatInfo2.field3305.get((long)var1);
      CombatInfo2 var7;
      if(var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = CombatInfo2.field3304.getConfigData(33, var1);
         var8 = new CombatInfo2();
         if(var9 != null) {
            var8.read(new Buffer(var9));
         }

         CombatInfo2.field3305.put(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      CombatInfoListHolder var14 = null;
      CombatInfoListHolder var10 = null;
      int var11 = var7.field3307;
      int var12 = 0;

      CombatInfoListHolder var13;
      for(var13 = (CombatInfoListHolder)this.combatInfoList.last(); var13 != null; var13 = (CombatInfoListHolder)this.combatInfoList.previous()) {
         ++var12;
         if(var13.combatInfo2.field3317 == var8.field3317) {
            var13.method1772(var2 + var4, var5, var6, var3);
            return;
         }

         if(var13.combatInfo2.field3310 <= var8.field3310) {
            var14 = var13;
         }

         if(var13.combatInfo2.field3307 > var11) {
            var10 = var13;
            var11 = var13.combatInfo2.field3307;
         }
      }

      if(var10 != null || var12 < 4) {
         var13 = new CombatInfoListHolder(var8);
         if(var14 == null) {
            this.combatInfoList.addLast(var13);
         } else {
            CombatInfoList.method4036(var13, var14);
         }

         var13.method1772(var2 + var4, var5, var6, var3);
         if(var12 >= 4) {
            var10.unlink();
         }

      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "631506734"
   )
   final void method1557(int var1) {
      CombatInfo2 var3 = (CombatInfo2)CombatInfo2.field3305.get((long)var1);
      CombatInfo2 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = CombatInfo2.field3304.getConfigData(33, var1);
         var3 = new CombatInfo2();
         if(var4 != null) {
            var3.read(new Buffer(var4));
         }

         CombatInfo2.field3305.put(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(CombatInfoListHolder var5 = (CombatInfoListHolder)this.combatInfoList.last(); var5 != null; var5 = (CombatInfoListHolder)this.combatInfoList.previous()) {
         if(var3 == var5.combatInfo2) {
            var5.unlink();
            return;
         }
      }

   }

   @ObfuscatedName("z")
   public static final void method1539(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
               ;
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
               ;
            }
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lit;",
      garbageValue = "327770594"
   )
   public static VarPlayerType method1549(int var0) {
      VarPlayerType var1 = (VarPlayerType)VarPlayerType.varplayers.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldComparator.varplayer_ref.getConfigData(16, var0);
         var1 = new VarPlayerType();
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarPlayerType.varplayers.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lir;IIIZS)V",
      garbageValue = "-16201"
   )
   public static void method1554(IndexDataBase var0, int var1, int var2, int var3, boolean var4) {
      class217.field2460 = 1;
      class138.field1871 = var0;
      class217.field2461 = var1;
      class217.field2462 = var2;
      class309.field3740 = var3;
      class217.field2463 = var4;
      class6.field37 = 10000;
   }
}
