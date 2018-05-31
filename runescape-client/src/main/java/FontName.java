import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("FontName")
public class FontName {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("FontName_plain11")
   public static final FontName FontName_plain11;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("FontName_plain12")
   public static final FontName FontName_plain12;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   @Export("FontName_bold12")
   public static final FontName FontName_bold12;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final FontName field3673;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final FontName field3670;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final FontName field3669;
   @ObfuscatedName("fa")
   @Export("landMapFileIds")
   static int[] landMapFileIds;
   @ObfuscatedName("k")
   final String field3671;
   @ObfuscatedName("i")
   String field3666;

   static {
      FontName_plain11 = new FontName("PLAIN11", "p11_full");
      FontName_plain12 = new FontName("PLAIN12", "p12_full");
      FontName_bold12 = new FontName("BOLD12", "b12_full");
      field3673 = new FontName("VERDANA11", "verdana_11pt_regular");
      field3670 = new FontName("VERDANA13", "verdana_13pt_regular");
      field3669 = new FontName("VERDANA15", "verdana_15pt_regular");
   }

   FontName(String var1, String var2) {
      this.field3671 = var1;
      this.field3666 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Lkc;",
      garbageValue = "106"
   )
   public static FontName[] method5498() {
      return new FontName[]{field3673, FontName_bold12, FontName_plain11, FontName_plain12, field3670, field3669};
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "1542414635"
   )
   static final void method5502(Actor var0) {
      var0.field873 = false;
      Sequence var1;
      if(var0.poseAnimation != -1) {
         var1 = TotalQuantityComparator.getAnimation(var0.poseAnimation);
         if(var1 != null && var1.frameIDs != null) {
            ++var0.poseFrameCycle;
            if(var0.poseFrame < var1.frameIDs.length && var0.poseFrameCycle > var1.frameLengths[var0.poseFrame]) {
               var0.poseFrameCycle = 1;
               ++var0.poseFrame;
               class173.queueAnimationSound(var1, var0.poseFrame, var0.x, var0.y);
            }

            if(var0.poseFrame >= var1.frameIDs.length) {
               var0.poseFrameCycle = 0;
               var0.poseFrame = 0;
               class173.queueAnimationSound(var1, var0.poseFrame, var0.x, var0.y);
            }
         } else {
            var0.poseAnimation = -1;
         }
      }

      if(var0.graphic != -1 && Client.gameCycle >= var0.graphicsDelay) {
         if(var0.spotAnimFrame < 0) {
            var0.spotAnimFrame = 0;
         }

         int var3 = MouseRecorder.getSpotAnimType(var0.graphic).field3271;
         if(var3 != -1) {
            Sequence var2 = TotalQuantityComparator.getAnimation(var3);
            if(var2 != null && var2.frameIDs != null) {
               ++var0.spotAnimFrameCycle;
               if(var0.spotAnimFrame < var2.frameIDs.length && var0.spotAnimFrameCycle > var2.frameLengths[var0.spotAnimFrame]) {
                  var0.spotAnimFrameCycle = 1;
                  ++var0.spotAnimFrame;
                  class173.queueAnimationSound(var2, var0.spotAnimFrame, var0.x, var0.y);
               }

               if(var0.spotAnimFrame >= var2.frameIDs.length && (var0.spotAnimFrame < 0 || var0.spotAnimFrame >= var2.frameIDs.length)) {
                  var0.graphic = -1;
               }
            } else {
               var0.graphic = -1;
            }
         } else {
            var0.graphic = -1;
         }
      }

      if(var0.animation != -1 && var0.actionAnimationDisable <= 1) {
         var1 = TotalQuantityComparator.getAnimation(var0.animation);
         if(var1.precedenceAnimating == 1 && var0.field930 > 0 && var0.field917 <= Client.gameCycle && var0.field918 < Client.gameCycle) {
            var0.actionAnimationDisable = 1;
            return;
         }
      }

      if(var0.animation != -1 && var0.actionAnimationDisable == 0) {
         var1 = TotalQuantityComparator.getAnimation(var0.animation);
         if(var1 != null && var1.frameIDs != null) {
            ++var0.actionFrameCycle;
            if(var0.actionFrame < var1.frameIDs.length && var0.actionFrameCycle > var1.frameLengths[var0.actionFrame]) {
               var0.actionFrameCycle = 1;
               ++var0.actionFrame;
               class173.queueAnimationSound(var1, var0.actionFrame, var0.x, var0.y);
            }

            if(var0.actionFrame >= var1.frameIDs.length) {
               var0.actionFrame -= var1.frameStep;
               ++var0.field907;
               if(var0.field907 >= var1.maxLoops) {
                  var0.animation = -1;
               } else if(var0.actionFrame >= 0 && var0.actionFrame < var1.frameIDs.length) {
                  class173.queueAnimationSound(var1, var0.actionFrame, var0.x, var0.y);
               } else {
                  var0.animation = -1;
               }
            }

            var0.field873 = var1.stretches;
         } else {
            var0.animation = -1;
         }
      }

      if(var0.actionAnimationDisable > 0) {
         --var0.actionAnimationDisable;
      }

   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "911738943"
   )
   static void method5501() {
      for(WidgetNode var0 = (WidgetNode)Client.componentTable.first(); var0 != null; var0 = (WidgetNode)Client.componentTable.next()) {
         int var1 = var0.id;
         if(CombatInfo2.loadWidget(var1)) {
            boolean var2 = true;
            Widget[] var3 = GameCanvas.widgets[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] != null) {
                  var2 = var3[var4].hasScript;
                  break;
               }
            }

            if(!var2) {
               var4 = (int)var0.hash;
               Widget var5 = class26.getWidget(var4);
               if(var5 != null) {
                  Player.method1114(var5);
               }
            }
         }
      }

   }
}
