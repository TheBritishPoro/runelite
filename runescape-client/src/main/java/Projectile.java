import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1556168027
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -137784953
   )
   @Export("floor")
   int floor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1001488191
   )
   @Export("x1")
   int x1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1246023211
   )
   @Export("y1")
   int y1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 615566251
   )
   @Export("height")
   int height;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 392987725
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -904504589
   )
   @Export("startMovementCycle")
   int startMovementCycle;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -620277071
   )
   @Export("endCycle")
   int endCycle;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1070958121
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 490522177
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1202003677
   )
   @Export("interacting")
   int interacting;
   @ObfuscatedName("b")
   @Export("isMoving")
   boolean isMoving;
   @ObfuscatedName("n")
   @Export("x")
   double x;
   @ObfuscatedName("f")
   @Export("y")
   double y;
   @ObfuscatedName("g")
   @Export("z")
   double z;
   @ObfuscatedName("m")
   @Export("velocityX")
   double velocityX;
   @ObfuscatedName("r")
   @Export("velocityY")
   double velocityY;
   @ObfuscatedName("t")
   @Export("scalar")
   double scalar;
   @ObfuscatedName("o")
   @Export("velocityZ")
   double velocityZ;
   @ObfuscatedName("y")
   @Export("heightOffset")
   double heightOffset;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 82611727
   )
   @Export("rotationX")
   int rotationX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 760033287
   )
   @Export("rotationY")
   int rotationY;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   @Export("animationSequence")
   Sequence animationSequence;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1358664531
   )
   @Export("int7")
   int int7;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -931624513
   )
   @Export("int6")
   int int6;

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.isMoving = false;
      this.int7 = 0;
      this.int6 = 0;
      this.id = var1;
      this.floor = var2;
      this.x1 = var3;
      this.y1 = var4;
      this.height = var5;
      this.startMovementCycle = var6;
      this.endCycle = var7;
      this.slope = var8;
      this.startHeight = var9;
      this.interacting = var10;
      this.endHeight = var11;
      this.isMoving = false;
      int var12 = MouseRecorder.getSpotAnimType(this.id).field3271;
      if(var12 != -1) {
         this.animationSequence = TotalQuantityComparator.getAnimation(var12);
      } else {
         this.animationSequence = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-432568951"
   )
   @Export("moveProjectile")
   @Hook("projectileMoved")
   final void moveProjectile(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.isMoving) {
         var5 = (double)(var1 - this.x1);
         double var7 = (double)(var2 - this.y1);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = (double)this.x1 + (double)this.startHeight * var5 / var9;
         this.y = (double)this.startHeight * var7 / var9 + (double)this.y1;
         this.z = (double)this.height;
      }

      var5 = (double)(this.endCycle + 1 - var4);
      this.velocityX = ((double)var1 - this.x) / var5;
      this.velocityY = ((double)var2 - this.y) / var5;
      this.scalar = Math.sqrt(this.velocityX * this.velocityX + this.velocityY * this.velocityY);
      if(!this.isMoving) {
         this.velocityZ = -this.scalar * Math.tan(0.02454369D * (double)this.slope);
      }

      this.heightOffset = ((double)var3 - this.z - var5 * this.velocityZ) * 2.0D / (var5 * var5);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1768751642"
   )
   @Export("update")
   final void update(int var1) {
      this.isMoving = true;
      this.x += this.velocityX * (double)var1;
      this.y += this.velocityY * (double)var1;
      this.z += (double)var1 * 0.5D * this.heightOffset * (double)var1 + (double)var1 * this.velocityZ;
      this.velocityZ += this.heightOffset * (double)var1;
      this.rotationX = (int)(Math.atan2(this.velocityX, this.velocityY) * 325.949D) + 1024 & 2047;
      this.rotationY = (int)(Math.atan2(this.velocityZ, this.scalar) * 325.949D) & 2047;
      if(this.animationSequence != null) {
         this.int6 += var1;

         while(true) {
            do {
               do {
                  if(this.int6 <= this.animationSequence.frameLengths[this.int7]) {
                     return;
                  }

                  this.int6 -= this.animationSequence.frameLengths[this.int7];
                  ++this.int7;
               } while(this.int7 < this.animationSequence.frameIDs.length);

               this.int7 -= this.animationSequence.frameStep;
            } while(this.int7 >= 0 && this.int7 < this.animationSequence.frameIDs.length);

            this.int7 = 0;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Model getModel() {
      Spotanim var1 = MouseRecorder.getSpotAnimType(this.id);
      Model var2 = var1.getModel(this.int7);
      if(var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.rotationY);
         return var2;
      }
   }
}
