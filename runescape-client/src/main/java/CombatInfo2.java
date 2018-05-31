import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("CombatInfo2")
public class CombatInfo2 extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field3304;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static IndexDataBase field3314;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3305;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3306;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1290574683
   )
   public int field3317;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 293385999
   )
   public int field3310;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 497866573
   )
   public int field3307;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1257044637
   )
   public int field3312;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1902915669
   )
   public int field3308;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1500429693
   )
   public int field3313;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1619382661
   )
   int field3315;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1784458549
   )
   int field3316;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 555187831
   )
   @Export("healthScale")
   public int healthScale;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -835956497
   )
   public int field3318;

   static {
      field3305 = new NodeCache(64);
      field3306 = new NodeCache(64);
   }

   public CombatInfo2() {
      this.field3310 = 255;
      this.field3307 = 255;
      this.field3312 = -1;
      this.field3308 = 1;
      this.field3313 = 70;
      this.field3315 = -1;
      this.field3316 = -1;
      this.healthScale = 30;
      this.field3318 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2067333055"
   )
   @Export("read")
   public void read(Buffer var1) {
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
      garbageValue = "-2130142641"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field3310 = var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field3307 = var1.readUnsignedByte();
      } else if(var2 == 4) {
         this.field3312 = 0;
      } else if(var2 == 5) {
         this.field3313 = var1.readUnsignedShort();
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field3315 = var1.method3546();
      } else if(var2 == 8) {
         this.field3316 = var1.method3546();
      } else if(var2 == 11) {
         this.field3312 = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.healthScale = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.field3318 = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "-1987129787"
   )
   public SpritePixels method4917() {
      if(this.field3315 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3306.get((long)this.field3315);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3314, this.field3315, 0);
            if(var1 != null) {
               field3306.put(var1, (long)this.field3315);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "879523324"
   )
   public SpritePixels method4918() {
      if(this.field3316 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3306.get((long)this.field3316);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3314, this.field3316, 0);
            if(var1 != null) {
               field3306.put(var1, (long)this.field3316);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "97"
   )
   @Export("loadWidget")
   public static boolean loadWidget(int var0) {
      if(GZipDecompressor.validInterfaces[var0]) {
         return true;
      } else if(!Widget.widgetIndex.containsFile(var0)) {
         return false;
      } else {
         int var1 = Widget.widgetIndex.fileCount(var0);
         if(var1 == 0) {
            GZipDecompressor.validInterfaces[var0] = true;
            return true;
         } else {
            if(GameCanvas.widgets[var0] == null) {
               GameCanvas.widgets[var0] = new Widget[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if(GameCanvas.widgets[var0][var2] == null) {
                  byte[] var3 = Widget.widgetIndex.getConfigData(var0, var2);
                  if(var3 != null) {
                     GameCanvas.widgets[var0][var2] = new Widget();
                     GameCanvas.widgets[var0][var2].id = var2 + (var0 << 16);
                     if(var3[0] == -1) {
                        GameCanvas.widgets[var0][var2].decodeActive(new Buffer(var3));
                     } else {
                        GameCanvas.widgets[var0][var2].decode(new Buffer(var3));
                     }
                  }
               }
            }

            GZipDecompressor.validInterfaces[var0] = true;
            return true;
         }
      }
   }
}
