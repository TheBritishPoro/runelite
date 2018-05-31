import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      longValue = 6136871153165894453L
   )
   static long field1013;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -904369215
   )
   @Export("height")
   int height;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -975901259
   )
   @Export("id")
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -975475893
   )
   @Export("startCycle")
   int startCycle;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1389377337
   )
   @Export("level")
   int level;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1930171125
   )
   @Export("x")
   int x;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1202134777
   )
   @Export("y")
   int y;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   Sequence field1018;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1404768991
   )
   int field1019;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1843616515
   )
   int field1020;
   @ObfuscatedName("e")
   @Export("finished")
   boolean finished;

   @Hook(
      value = "onGraphicsObjectCreated",
      end = true
   )
   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1019 = 0;
      this.field1020 = 0;
      this.finished = false;
      this.id = var1;
      this.level = var2;
      this.x = var3;
      this.y = var4;
      this.height = var5;
      this.startCycle = var7 + var6;
      int var8 = MouseRecorder.getSpotAnimType(this.id).field3271;
      if(var8 != -1) {
         this.finished = false;
         this.field1018 = TotalQuantityComparator.getAnimation(var8);
      } else {
         this.finished = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-58"
   )
   final void method1771(int var1) {
      if(!this.finished) {
         this.field1020 += var1;

         while(this.field1020 > this.field1018.frameLengths[this.field1019]) {
            this.field1020 -= this.field1018.frameLengths[this.field1019];
            ++this.field1019;
            if(this.field1019 >= this.field1018.frameIDs.length) {
               this.finished = true;
               break;
            }
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
      Model var2;
      if(!this.finished) {
         var2 = var1.getModel(this.field1019);
      } else {
         var2 = var1.getModel(-1);
      }

      return var2 == null?null:var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "307061840"
   )
   static boolean method1766(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "5"
   )
   static int method1768(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
      } else {
         var3 = var2?class276.field3561:KitDefinition.field3301;
      }

      Player.method1114(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.modelType = 2;
            var3.modelId = class69.intStack[--class69.intStackSize];
            return 1;
         } else if(var0 == 1202) {
            var3.modelType = 3;
            var3.modelId = class138.localPlayer.composition.method4483();
            return 1;
         } else {
            return 2;
         }
      } else {
         class69.intStackSize -= 2;
         int var4 = class69.intStack[class69.intStackSize];
         int var5 = class69.intStack[class69.intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = TextureProvider.getItemDefinition(var4);
         var3.rotationX = var6.xan2d;
         var3.rotationZ = var6.yan2d;
         var3.rotationY = var6.zan2d;
         var3.offsetX2d = var6.offsetX2d;
         var3.offsetY2d = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if(var0 == 1205) {
            var3.field2664 = 0;
         } else if(var0 == 1212 | 1 == var6.isStackable) {
            var3.field2664 = 1;
         } else {
            var3.field2664 = 2;
         }

         if(var3.field2660 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field2660;
         } else if(var3.originalWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.originalWidth;
         }

         return 1;
      }
   }
}
