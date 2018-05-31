import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class26 {
   @ObfuscatedName("bg")
   static String field219;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = 1566983967
   )
   @Export("port1")
   static int port1;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lfi;Lgs;I)Lfn;",
      garbageValue = "-1221349687"
   )
   public static PacketNode method433(ClientPacket var0, ISAACCipher var1) {
      PacketNode var2;
      if(PacketNode.field2258 == 0) {
         var2 = new PacketNode();
      } else {
         var2 = PacketNode.packetBufferNodes[--PacketNode.field2258];
      }

      var2.clientPacket = var0;
      var2.field2253 = var0.packetLength;
      if(var2.field2253 == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if(var2.field2253 == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if(var2.field2253 <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if(var2.field2253 <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.putOpcode(var2.clientPacket.packetId);
      var2.field2255 = 0;
      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Lhi;",
      garbageValue = "-49"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & 65535;
      if(GameCanvas.widgets[var1] == null || GameCanvas.widgets[var1][var2] == null) {
         boolean var3 = CombatInfo2.loadWidget(var1);
         if(!var3) {
            return null;
         }
      }

      return GameCanvas.widgets[var1][var2];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1481626830"
   )
   public static void method427(int var0) {
      class217.field2460 = 1;
      class138.field1871 = null;
      class217.field2461 = -1;
      class217.field2462 = -1;
      class309.field3740 = 0;
      class217.field2463 = false;
      class6.field37 = var0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZB)I",
      garbageValue = "30"
   )
   static int method428(World var0, World var1, int var2, boolean var3) {
      if(var2 == 1) {
         int var4 = var0.playerCount;
         int var5 = var1.playerCount;
         if(!var3) {
            if(var4 == -1) {
               var4 = 2001;
            }

            if(var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else {
         return var2 == 2?var0.location - var1.location:(var2 == 3?(var0.activity.equals("-")?(var1.activity.equals("-")?0:(var3?-1:1)):(var1.activity.equals("-")?(var3?1:-1):var0.activity.compareTo(var1.activity))):(var2 == 4?(var0.method1569()?(var1.method1569()?0:1):(var1.method1569()?-1:0)):(var2 == 5?(var0.method1567()?(var1.method1567()?0:1):(var1.method1567()?-1:0)):(var2 == 6?(var0.method1568()?(var1.method1568()?0:1):(var1.method1568()?-1:0)):(var2 == 7?(var0.method1589()?(var1.method1589()?0:1):(var1.method1589()?-1:0)):var0.id - var1.id)))));
      }
   }
}
