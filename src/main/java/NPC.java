import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ljc;"
   )
   @Export("composition")
   NPCComposition composition;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IBB)V",
      garbageValue = "76"
   )
   final void method1781(int var1, byte var2) {
      int var3 = super.pathX[0];
      int var4 = super.pathY[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(var1 == 2) {
         ++var3;
         ++var4;
      }

      if(var1 == 3) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(var1 == 5) {
         --var3;
         --var4;
      }

      if(var1 == 6) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(super.animation != -1 && ItemLayer.getAnimation(super.animation).priority == 1) {
         super.animation = -1;
      }

      if(super.queueSize < 9) {
         ++super.queueSize;
      }

      for(int var5 = super.queueSize; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.field1189[var5] = super.field1189[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.field1189[0] = var2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "-37"
   )
   final void method1774(int var1, int var2, boolean var3) {
      if(super.animation != -1 && ItemLayer.getAnimation(super.animation).priority == 1) {
         super.animation = -1;
      }

      if(!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.queueSize < 9) {
               ++super.queueSize;
            }

            for(int var6 = super.queueSize; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.field1189[var6] = super.field1189[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.field1189[0] = 1;
            return;
         }
      }

      super.queueSize = 0;
      super.field1186 = 0;
      super.field1157 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1201 * 64 + super.pathX[0] * 128;
      super.y = super.field1201 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Len;",
      garbageValue = "-1864051962"
   )
   protected final Model getModel() {
      if(this.composition == null) {
         return null;
      } else {
         Sequence var1 = super.animation != -1 && super.actionAnimationDisable == 0?ItemLayer.getAnimation(super.animation):null;
         Sequence var2 = super.poseAnimation != -1 && (super.poseAnimation != super.idlePoseAnimation || var1 == null)?ItemLayer.getAnimation(super.poseAnimation):null;
         Model var3 = this.composition.method4826(var1, super.actionFrame, var2, super.poseFrame);
         if(var3 == null) {
            return null;
         } else {
            var3.method2616();
            super.field1161 = var3.modelHeight;
            if(super.graphic != -1 && super.field1181 != -1) {
               Model var4 = class285.getSpotAnimType(super.graphic).method4520(super.field1181);
               if(var4 != null) {
                  var4.method2643(0, -super.field1184, 0);
                  Model[] var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
               }
            }

            if(this.composition.field3625 == 1) {
               var3.field1860 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "762696752"
   )
   @Export("hasConfig")
   final boolean hasConfig() {
      return this.composition != null;
   }
}
