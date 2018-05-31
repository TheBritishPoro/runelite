import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("Spotanim")
public class Spotanim extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("SpotAnimationDefinition_indexCache")
   public static IndexDataBase SpotAnimationDefinition_indexCache;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("SpotAnimationDefinition_modelIndexCache")
   public static IndexDataBase SpotAnimationDefinition_modelIndexCache;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("spotanims")
   public static NodeCache spotanims;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   public static NodeCache SpotAnimationDefinition_cachedModels;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -222748263
   )
   @Export("id")
   int id;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1890309405
   )
   int field3268;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1738740977
   )
   public int field3271;
   @ObfuscatedName("i")
   short[] field3266;
   @ObfuscatedName("x")
   short[] field3270;
   @ObfuscatedName("e")
   short[] field3274;
   @ObfuscatedName("p")
   short[] field3275;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1496956879
   )
   @Export("widthScale")
   int widthScale;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -3859707
   )
   @Export("heightScale")
   int heightScale;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1793069157
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1287651757
   )
   int field3273;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1462355847
   )
   int field3269;

   static {
      spotanims = new NodeCache(64);
      SpotAnimationDefinition_cachedModels = new NodeCache(30);
   }

   Spotanim() {
      this.field3271 = -1;
      this.widthScale = 128;
      this.heightScale = 128;
      this.orientation = 0;
      this.field3273 = 0;
      this.field3269 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "713149858"
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
      signature = "(Lgk;II)V",
      garbageValue = "269273917"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field3268 = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field3271 = var1.readUnsignedShort();
      } else if(var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.field3273 = var1.readUnsignedByte();
      } else if(var2 == 8) {
         this.field3269 = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.field3266 = new short[var3];
            this.field3270 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3266[var4] = (short)var1.readUnsignedShort();
               this.field3270[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.field3274 = new short[var3];
            this.field3275 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3274[var4] = (short)var1.readUnsignedShort();
               this.field3275[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ldc;",
      garbageValue = "-226282486"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
      if(var2 == null) {
         ModelData var3 = ModelData.method2568(SpotAnimationDefinition_modelIndexCache, this.field3268, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field3266 != null) {
            for(var4 = 0; var4 < this.field3266.length; ++var4) {
               var3.recolor(this.field3266[var4], this.field3270[var4]);
            }
         }

         if(this.field3274 != null) {
            for(var4 = 0; var4 < this.field3274.length; ++var4) {
               var3.method2582(this.field3274[var4], this.field3275[var4]);
            }
         }

         var2 = var3.light(this.field3273 + 64, this.field3269 + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
      }

      Model var5;
      if(this.field3271 != -1 && var1 != -1) {
         var5 = TotalQuantityComparator.getAnimation(this.field3271).transformSpotAnimModel(var2, var1);
      } else {
         var5 = var2.toSharedSpotAnimModel(true);
      }

      if(this.widthScale != 128 || this.heightScale != 128) {
         var5.scale(this.widthScale, this.heightScale, this.widthScale);
      }

      if(this.orientation != 0) {
         if(this.orientation == 90) {
            var5.rotateY90Ccw();
         }

         if(this.orientation == 180) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }

         if(this.orientation == 270) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }
      }

      return var5;
   }
}
