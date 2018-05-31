import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("Timer")
public abstract class Timer {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
   )
   public abstract void vmethod3330();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
   )
   public abstract int vmethod3331(int var1, int var2);

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;B)V",
      garbageValue = "-42"
   )
   public static void method3344(IndexDataBase var0) {
      InvType.field3226 = var0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1518279696"
   )
   static final void method3338(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            class50.tileHeights[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            class50.tileHeights[var0][var1][var3 + var2] = class50.tileHeights[var0][var1 - 1][var3 + var2];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            class50.tileHeights[var0][var3 + var1][var2] = class50.tileHeights[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && class50.tileHeights[var0][var1 - 1][var2] != 0) {
         class50.tileHeights[var0][var1][var2] = class50.tileHeights[var0][var1 - 1][var2];
      } else if(var2 > 0 && class50.tileHeights[var0][var1][var2 - 1] != 0) {
         class50.tileHeights[var0][var1][var2] = class50.tileHeights[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && class50.tileHeights[var0][var1 - 1][var2 - 1] != 0) {
         class50.tileHeights[var0][var1][var2] = class50.tileHeights[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-39289384"
   )
   static int method3341(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 == 2700) {
         var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
         class69.intStack[++class69.intStackSize - 1] = var3.itemId;
         return 1;
      } else if(var0 == 2701) {
         var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
         if(var3.itemId != -1) {
            class69.intStack[++class69.intStackSize - 1] = var3.itemQuantity;
         } else {
            class69.intStack[++class69.intStackSize - 1] = 0;
         }

         return 1;
      } else if(var0 == 2702) {
         int var5 = class69.intStack[--class69.intStackSize];
         WidgetNode var4 = (WidgetNode)Client.componentTable.get((long)var5);
         if(var4 != null) {
            class69.intStack[++class69.intStackSize - 1] = 1;
         } else {
            class69.intStack[++class69.intStackSize - 1] = 0;
         }

         return 1;
      } else if(var0 == 2706) {
         class69.intStack[++class69.intStackSize - 1] = Client.widgetRoot;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1653590324"
   )
   static final void method3342() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.getFront(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.getNext()) {
         if(var0.hitpoints == -1) {
            var0.delay = 0;
            class74.method1800(var0);
         } else {
            var0.unlink();
         }
      }

   }
}
