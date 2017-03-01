import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("x")
   @Export("composition")
   NPCComposition composition;
   @ObfuscatedName("u")
   static int[] field765;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -1155546779
   )
   static int field766;

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)LModel;",
      garbageValue = "1"
   )
   protected final Model getModel() {
      if(this.composition == null) {
         return null;
      } else {
         Sequence var1 = super.animation != -1 && super.actionAnimationDisable == 0?TextureProvider.getAnimation(super.animation):null;
         Sequence var2 = super.poseAnimation != -1 && (super.poseAnimation != super.idlePoseAnimation || var1 == null)?TextureProvider.getAnimation(super.poseAnimation):null;
         Model var3 = this.composition.method3777(var1, super.actionFrame, var2, super.poseFrame);
         if(var3 == null) {
            return null;
         } else {
            var3.method1649();
            super.field653 = var3.modelHeight;
            if(super.graphic != -1 && super.field648 != -1) {
               Model var4 = class157.method3129(super.graphic).method3535(super.field648);
               if(null != var4) {
                  var4.method1694(0, -super.field616, 0);
                  Model[] var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
               }
            }

            if(this.composition.field3040 == 1) {
               var3.field1388 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "466855216"
   )
   final boolean vmethod794() {
      return this.composition != null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IBI)V",
      garbageValue = "1616424745"
   )
   final void method795(int var1, byte var2) {
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

      if(super.animation != -1 && TextureProvider.getAnimation(super.animation).priority == 1) {
         super.animation = -1;
      }

      if(super.field657 < 9) {
         ++super.field657;
      }

      for(int var5 = super.field657; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.field609[var5] = super.field609[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.field609[0] = var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "-88"
   )
   final void method796(int var1, int var2, boolean var3) {
      if(super.animation != -1 && TextureProvider.getAnimation(super.animation).priority == 1) {
         super.animation = -1;
      }

      if(!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.field657 < 9) {
               ++super.field657;
            }

            for(int var6 = super.field657; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.field609[var6] = super.field609[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.field609[0] = 1;
            return;
         }
      }

      super.field657 = 0;
      super.field662 = 0;
      super.field661 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = 128 * super.pathX[0] + super.field607 * 64;
      super.y = super.field607 * 64 + super.pathY[0] * 128;
   }
}
