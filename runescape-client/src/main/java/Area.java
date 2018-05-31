import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("Area")
public class Area extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field3237;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lie;"
   )
   @Export("mapAreaType")
   public static Area[] mapAreaType;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 238787811
   )
   public static int field3236;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("areaSpriteCache")
   static NodeCache areaSpriteCache;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -38826489
   )
   @Export("id")
   public final int id;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1319997115
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 437595613
   )
   int field3234;
   @ObfuscatedName("i")
   @Export("name")
   public String name;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 984232407
   )
   public int field3242;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1009560253
   )
   public int field3243;
   @ObfuscatedName("b")
   public String[] field3244;
   @ObfuscatedName("n")
   public String field3255;
   @ObfuscatedName("f")
   int[] field3245;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 257365583
   )
   int field3247;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -164184983
   )
   int field3235;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -571209577
   )
   int field3249;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1516283323
   )
   int field3248;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("a")
   int[] field3250;
   @ObfuscatedName("j")
   byte[] field3254;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1537771069
   )
   public int field3240;

   static {
      areaSpriteCache = new NodeCache(256);
   }

   public Area(int var1) {
      this.spriteId = -1;
      this.field3234 = -1;
      this.field3243 = 0;
      this.field3244 = new String[5];
      this.field3247 = Integer.MAX_VALUE;
      this.field3235 = Integer.MAX_VALUE;
      this.field3249 = Integer.MIN_VALUE;
      this.field3248 = Integer.MIN_VALUE;
      this.horizontalAlignment = HorizontalAlignment.field3479;
      this.verticalAlignment = VerticalAlignment.field3222;
      this.field3240 = -1;
      this.id = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "248610403"
   )
   public void method4816(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4817(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "4032"
   )
   void method4817(Buffer var1, int var2) {
      if(var2 == 1) {
         this.spriteId = var1.method3546();
      } else if(var2 == 2) {
         this.field3234 = var1.method3546();
      } else if(var2 == 3) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.field3242 = var1.read24BitInt();
      } else if(var2 == 5) {
         var1.read24BitInt();
      } else if(var2 == 6) {
         this.field3243 = var1.readUnsignedByte();
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.readUnsignedByte();
            if((var3 & 1) == 0) {
               ;
            }

            if((var3 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.readUnsignedByte();
         } else if(var2 >= 10 && var2 <= 14) {
            this.field3244[var2 - 10] = var1.readString();
         } else if(var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field3245 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3245[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field3250 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3250.length; ++var5) {
               this.field3250[var5] = var1.readInt();
            }

            this.field3254 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3254[var5] = var1.readByte();
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.field3255 = var1.readString();
            } else if(var2 == 18) {
               var1.method3546();
            } else if(var2 == 19) {
               this.field3240 = var1.readUnsignedShort();
            } else if(var2 == 21) {
               var1.readInt();
            } else if(var2 == 22) {
               var1.readInt();
            } else if(var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if(var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if(var2 == 25) {
               var1.method3546();
            } else if(var2 == 28) {
               var1.readUnsignedByte();
            } else if(var2 == 29) {
               HorizontalAlignment[] var6 = new HorizontalAlignment[]{HorizontalAlignment.field3479, HorizontalAlignment.field3484, HorizontalAlignment.field3481};
               this.horizontalAlignment = (HorizontalAlignment)class76.forOrdinal(var6, var1.readUnsignedByte());
            } else if(var2 == 30) {
               VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field3221, VerticalAlignment.field3222, VerticalAlignment.field3224};
               this.verticalAlignment = (VerticalAlignment)class76.forOrdinal(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1083458707"
   )
   public void method4828() {
      if(this.field3245 != null) {
         for(int var1 = 0; var1 < this.field3245.length; var1 += 2) {
            if(this.field3245[var1] < this.field3247) {
               this.field3247 = this.field3245[var1];
            } else if(this.field3245[var1] > this.field3249) {
               this.field3249 = this.field3245[var1];
            }

            if(this.field3245[var1 + 1] < this.field3235) {
               this.field3235 = this.field3245[var1 + 1];
            } else if(this.field3245[var1 + 1] > this.field3248) {
               this.field3248 = this.field3245[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZB)Lll;",
      garbageValue = "-62"
   )
   @Export("getMapIcon")
   public SpritePixels getMapIcon(boolean var1) {
      int var2 = this.spriteId;
      return this.method4820(var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Lll;",
      garbageValue = "-1422561199"
   )
   SpritePixels method4820(int var1) {
      if(var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)areaSpriteCache.get((long)var1);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class229.getSpriteAsSpritePixels(field3237, var1, 0);
            if(var2 != null) {
               areaSpriteCache.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-51"
   )
   public int method4821() {
      return this.id;
   }
}
