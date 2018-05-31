import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("OwnWorldComparator")
public class OwnWorldComparator implements Comparator {
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lcu;"
   )
   static Resampler field577;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexTrack2")
   static IndexData indexTrack2;
   @ObfuscatedName("z")
   boolean field575;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "-86"
   )
   int method1123(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if(var2.world == var1.world) {
         return 0;
      } else {
         if(this.field575) {
            if(Client.world == var1.world) {
               return -1;
            }

            if(var2.world == Client.world) {
               return 1;
            }
         }

         return var1.world < var2.world?-1:1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1123((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lbh;",
      garbageValue = "44"
   )
   static MessageNode method1130(int var0) {
      return (MessageNode)class83.messages.get((long)var0);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lbb;B)V",
      garbageValue = "95"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if(var0.method1589() != Client.isMembers) {
         Client.isMembers = var0.method1589();
         boolean var1 = var0.method1589();
         if(var1 != ItemComposition.isMembersWorld) {
            MouseRecorder.method1036();
            ItemComposition.isMembersWorld = var1;
         }
      }

      class54.host = var0.address;
      Client.world = var0.id;
      Client.flags = var0.mask;
      class26.port1 = Client.socketType == 0?43594:var0.id + 40000;
      class68.port2 = Client.socketType == 0?443:var0.id + 50000;
      FriendContainer.myWorldPort = class26.port1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-173135414"
   )
   static int method1126(int var0, Script var1, boolean var2) {
      Widget var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
      if(var0 == 2800) {
         class69.intStack[++class69.intStackSize - 1] = Signlink.method3252(class24.getWidgetClickMask(var3));
         return 1;
      } else if(var0 != 2801) {
         if(var0 == 2802) {
            if(var3.opBase == null) {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            } else {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.opBase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class69.intStack[--class69.intStackSize];
         --var4;
         if(var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.actions[var4];
         } else {
            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
