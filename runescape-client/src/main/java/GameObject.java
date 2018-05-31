import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1650174027
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 220137999
   )
   @Export("height")
   int height;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -461194739
   )
   @Export("x")
   int x;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1049351685
   )
   @Export("y")
   int y;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2137493405
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1953890163
   )
   @Export("relativeX")
   int relativeX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1165658199
   )
   @Export("offsetX")
   int offsetX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -902758735
   )
   @Export("relativeY")
   int relativeY;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 949196043
   )
   @Export("offsetY")
   int offsetY;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1947694915
   )
   @Export("drawPriority")
   int drawPriority;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1135945905
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -7950024877031331151L
   )
   @Export("hash")
   public long hash;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2116359181
   )
   @Export("flags")
   int flags;

   GameObject() {
      this.hash = 0L;
      this.flags = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lce;",
      garbageValue = "-10"
   )
   static Script method3104(int var0, int var1) {
      Script var2 = (Script)Script.field1190.get((long)(var0 << 16));
      if(var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = Client.indexScripts.getFile(var3);
         if(var4 == -1) {
            return null;
         } else {
            byte[] var5 = Client.indexScripts.takeRecordFlat(var4);
            if(var5 != null) {
               if(var5.length <= 1) {
                  return null;
               }

               var2 = class10.newScript(var5);
               if(var2 != null) {
                  Script.field1190.put(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(Lbu;III)V",
      garbageValue = "-1928445443"
   )
   static void method3102(Player var0, int var1, int var2) {
      if(var0.animation == var1 && var1 != -1) {
         int var3 = TotalQuantityComparator.getAnimation(var1).replyMode;
         if(var3 == 1) {
            var0.actionFrame = 0;
            var0.actionFrameCycle = 0;
            var0.actionAnimationDisable = var2;
            var0.field907 = 0;
         }

         if(var3 == 2) {
            var0.field907 = 0;
         }
      } else if(var1 == -1 || var0.animation == -1 || TotalQuantityComparator.getAnimation(var1).forcedPriority >= TotalQuantityComparator.getAnimation(var0.animation).forcedPriority) {
         var0.animation = var1;
         var0.actionFrame = 0;
         var0.actionFrameCycle = 0;
         var0.actionAnimationDisable = var2;
         var0.field907 = 0;
         var0.field930 = var0.queueSize;
      }

   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "176398255"
   )
   static final void method3103() {
      boolean var0 = false;

      while(!var0) {
         var0 = true;

         for(int var1 = 0; var1 < Client.menuOptionCount - 1; ++var1) {
            if(Client.menuTypes[var1] < 1000 && Client.menuTypes[var1 + 1] > 1000) {
               String var2 = Client.menuTargets[var1];
               Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
               Client.menuTargets[var1 + 1] = var2;
               String var3 = Client.menuOptions[var1];
               Client.menuOptions[var1] = Client.menuOptions[var1 + 1];
               Client.menuOptions[var1 + 1] = var3;
               int var4 = Client.menuTypes[var1];
               Client.menuTypes[var1] = Client.menuTypes[var1 + 1];
               Client.menuTypes[var1 + 1] = var4;
               var4 = Client.menuActionParams0[var1];
               Client.menuActionParams0[var1] = Client.menuActionParams0[var1 + 1];
               Client.menuActionParams0[var1 + 1] = var4;
               var4 = Client.menuActionParams1[var1];
               Client.menuActionParams1[var1] = Client.menuActionParams1[var1 + 1];
               Client.menuActionParams1[var1 + 1] = var4;
               var4 = Client.menuIdentifiers[var1];
               Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
               Client.menuIdentifiers[var1 + 1] = var4;
               boolean var5 = Client.menuBooleanArray[var1];
               Client.menuBooleanArray[var1] = Client.menuBooleanArray[var1 + 1];
               Client.menuBooleanArray[var1 + 1] = var5;
               var0 = false;
            }
         }
      }

   }
}
