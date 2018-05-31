import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class267 extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static IndexDataBase field3367;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static IndexDataBase field3348;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3349;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3356;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3351;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1731359987
   )
   int field3353;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 876302883
   )
   public int field3364;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -936204619
   )
   public int field3355;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 953756281
   )
   int field3358;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1421911827
   )
   int field3357;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1039819635
   )
   int field3350;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1076964871
   )
   int field3359;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -2143237969
   )
   public int field3365;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 161849281
   )
   public int field3361;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -86534117
   )
   public int field3354;
   @ObfuscatedName("j")
   String field3363;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 988347075
   )
   public int field3360;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -203018777
   )
   public int field3347;
   @ObfuscatedName("c")
   public int[] field3366;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 738164645
   )
   int field3362;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 606288513
   )
   int field3368;

   static {
      field3349 = new NodeCache(64);
      field3356 = new NodeCache(64);
      field3351 = new NodeCache(20);
   }

   class267() {
      this.field3353 = -1;
      this.field3364 = 16777215;
      this.field3355 = 70;
      this.field3358 = -1;
      this.field3357 = -1;
      this.field3350 = -1;
      this.field3359 = -1;
      this.field3365 = 0;
      this.field3361 = 0;
      this.field3354 = -1;
      this.field3363 = "";
      this.field3360 = -1;
      this.field3347 = 0;
      this.field3362 = -1;
      this.field3368 = -1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   void method4990(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4991(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "67"
   )
   void method4991(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field3353 = var1.method3546();
      } else if(var2 == 2) {
         this.field3364 = var1.read24BitInt();
      } else if(var2 == 3) {
         this.field3358 = var1.method3546();
      } else if(var2 == 4) {
         this.field3350 = var1.method3546();
      } else if(var2 == 5) {
         this.field3357 = var1.method3546();
      } else if(var2 == 6) {
         this.field3359 = var1.method3546();
      } else if(var2 == 7) {
         this.field3365 = var1.readShort();
      } else if(var2 == 8) {
         this.field3363 = var1.getJagString();
      } else if(var2 == 9) {
         this.field3355 = var1.readUnsignedShort();
      } else if(var2 == 10) {
         this.field3361 = var1.readShort();
      } else if(var2 == 11) {
         this.field3354 = 0;
      } else if(var2 == 12) {
         this.field3360 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field3347 = var1.readShort();
      } else if(var2 == 14) {
         this.field3354 = var1.readUnsignedShort();
      } else if(var2 == 17 || var2 == 18) {
         this.field3362 = var1.readUnsignedShort();
         if(this.field3362 == 65535) {
            this.field3362 = -1;
         }

         this.field3368 = var1.readUnsignedShort();
         if(this.field3368 == 65535) {
            this.field3368 = -1;
         }

         int var3 = -1;
         if(var2 == 18) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.field3366 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3366[var5] = var1.readUnsignedShort();
            if(this.field3366[var5] == 65535) {
               this.field3366[var5] = -1;
            }
         }

         this.field3366[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Ljp;",
      garbageValue = "-1562489008"
   )
   public final class267 method4995() {
      int var1 = -1;
      if(this.field3362 != -1) {
         var1 = GameSocket.getVarbit(this.field3362);
      } else if(this.field3368 != -1) {
         var1 = class225.clientVarps[this.field3368];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field3366.length - 1) {
         var2 = this.field3366[var1];
      } else {
         var2 = this.field3366[this.field3366.length - 1];
      }

      return var2 != -1?WorldMapType3.method123(var2):null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-99"
   )
   public String method5014(int var1) {
      String var2 = this.field3363;

      while(true) {
         int var3 = var2.indexOf("%1");
         if(var3 < 0) {
            return var2;
         }

         String var4 = var2.substring(0, var3);
         String var5 = Integer.toString(var1);
         var2 = var4 + var5 + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "2147112407"
   )
   public SpritePixels method4994() {
      if(this.field3358 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3356.get((long)this.field3358);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3348, this.field3358, 0);
            if(var1 != null) {
               field3356.put(var1, (long)this.field3358);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "1102937480"
   )
   public SpritePixels method5000() {
      if(this.field3357 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3356.get((long)this.field3357);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3348, this.field3357, 0);
            if(var1 != null) {
               field3356.put(var1, (long)this.field3357);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Lll;",
      garbageValue = "96"
   )
   public SpritePixels method4996() {
      if(this.field3350 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3356.get((long)this.field3350);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3348, this.field3350, 0);
            if(var1 != null) {
               field3356.put(var1, (long)this.field3350);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "720850716"
   )
   public SpritePixels method4997() {
      if(this.field3359 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3356.get((long)this.field3359);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class229.getSpriteAsSpritePixels(field3348, this.field3359, 0);
            if(var1 != null) {
               field3356.put(var1, (long)this.field3359);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)Lkj;",
      garbageValue = "1"
   )
   public Font method4998() {
      if(this.field3353 == -1) {
         return null;
      } else {
         Font var1 = (Font)field3351.get((long)this.field3353);
         if(var1 != null) {
            return var1;
         } else {
            var1 = MessageNode.method1058(field3348, class139.field1877, this.field3353, 0);
            if(var1 != null) {
               field3351.put(var1, (long)this.field3353);
            }

            return var1;
         }
      }
   }
}
