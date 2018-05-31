import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -313553599
   )
   static int field23;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -939579551
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 3949284830848608531L
   )
   public final long field20;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lu;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("l")
   @Export("string1")
   String string1;
   @ObfuscatedName("u")
   @Export("string2")
   String string2;

   @ObfuscatedSignature(
      signature = "(Lgk;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.string1 = var1.readString();
      this.string2 = var1.readString();
      this.world = var1.readUnsignedShort();
      this.field20 = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method44(2);
      this.grandExchangeOffer.method40(var2);
      this.grandExchangeOffer.price = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.quantitySold = 0;
      this.grandExchangeOffer.spent = 0;
      this.grandExchangeOffer.itemId = var3;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1845946507"
   )
   public String method16() {
      return this.string1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1459489481"
   )
   public String method18() {
      return this.string2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljk;",
      garbageValue = "-241404147"
   )
   @Export("getKitDefinition")
   public static KitDefinition getKitDefinition(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.identKits.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.identKit_ref.getConfigData(3, var0);
         var1 = new KitDefinition();
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.identKits.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "127"
   )
   static void method22(String var0, String var1, String var2) {
      class78.loginMessage1 = var0;
      class78.loginMessage2 = var1;
      class78.loginMessage3 = var2;
   }
}
