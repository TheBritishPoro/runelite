import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
@Implements("TotalQuantityComparator")
final class TotalQuantityComparator implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "2100734637"
   )
   int method24(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity?-1:(var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method24((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "1221940475"
   )
   @Export("getAnimation")
   public static Sequence getAnimation(int var0) {
      Sequence var1 = (Sequence)Sequence.sequences.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Sequence.seq_ref.getConfigData(12, var0);
         var1 = new Sequence();
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         Sequence.sequences.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-32"
   )
   public static int method32(int var0) {
      return class37.method662(class120.field1647[var0]);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "1737027052"
   )
   public static int method35(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1924220675"
   )
   public static void method34() {
      ObjectComposition.objects.reset();
      ObjectComposition.field3391.reset();
      ObjectComposition.cachedModels.reset();
      ObjectComposition.field3374.reset();
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "-1623829882"
   )
   static final void method26(Actor var0) {
      if(var0.field924 != 0) {
         if(var0.interacting != -1) {
            Object var1 = null;
            if(var0.interacting < 32768) {
               var1 = Client.cachedNPCs[var0.interacting];
            } else if(var0.interacting >= 32768) {
               var1 = Client.cachedPlayers[var0.interacting - 32768];
            }

            if(var1 != null) {
               int var2 = var0.x - ((Actor)var1).x;
               int var3 = var0.y - ((Actor)var1).y;
               if(var2 != 0 || var3 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if(var0.field898) {
               var0.interacting = -1;
               var0.field898 = false;
            }
         }

         if(var0.field920 != -1 && (var0.queueSize == 0 || var0.field923 > 0)) {
            var0.orientation = var0.field920;
            var0.field920 = -1;
         }

         int var4 = var0.orientation - var0.angle & 2047;
         if(var4 == 0 && var0.field898) {
            var0.interacting = -1;
            var0.field898 = false;
         }

         if(var4 != 0) {
            ++var0.field875;
            boolean var6;
            if(var4 > 1024) {
               var0.angle -= var0.field924;
               var6 = true;
               if(var4 < var0.field924 || var4 > 2048 - var0.field924) {
                  var0.angle = var0.orientation;
                  var6 = false;
               }

               if(var0.idlePoseAnimation == var0.poseAnimation && (var0.field875 > 25 || var6)) {
                  if(var0.field877 != -1) {
                     var0.poseAnimation = var0.field877;
                  } else {
                     var0.poseAnimation = var0.field899;
                  }
               }
            } else {
               var0.angle += var0.field924;
               var6 = true;
               if(var4 < var0.field924 || var4 > 2048 - var0.field924) {
                  var0.angle = var0.orientation;
                  var6 = false;
               }

               if(var0.idlePoseAnimation == var0.poseAnimation && (var0.field875 > 25 || var6)) {
                  if(var0.field878 != -1) {
                     var0.poseAnimation = var0.field878;
                  } else {
                     var0.poseAnimation = var0.field899;
                  }
               }
            }

            var0.angle &= 2047;
         } else {
            var0.field875 = 0;
         }

      }
   }
}
