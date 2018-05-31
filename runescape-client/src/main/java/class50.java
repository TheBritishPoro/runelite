import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class class50 {
   @ObfuscatedName("pt")
   @ObfuscatedGetter(
      intValue = 1434136439
   )
   static int field456;
   @ObfuscatedName("z")
   @Export("tileHeights")
   static int[][][] tileHeights;
   @ObfuscatedName("w")
   @Export("tileSettings")
   static byte[][][] tileSettings;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -791731349
   )
   static int field442;
   @ObfuscatedName("l")
   @Export("tileUnderlayIds")
   static byte[][][] tileUnderlayIds;
   @ObfuscatedName("q")
   @Export("tileOverlayPath")
   static byte[][][] tileOverlayPath;
   @ObfuscatedName("i")
   static byte[][][] field447;
   @ObfuscatedName("x")
   static int[][] field448;
   @ObfuscatedName("e")
   @Export("floorHues")
   static int[] floorHues;
   @ObfuscatedName("o")
   static final int[] field450;
   @ObfuscatedName("y")
   static final int[] field451;
   @ObfuscatedName("a")
   static final int[] field452;
   @ObfuscatedName("j")
   static final int[] field453;
   @ObfuscatedName("d")
   static final int[] field458;
   @ObfuscatedName("h")
   static final int[] field449;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 129053467
   )
   static int field457;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1275566919
   )
   static int field455;
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexCache13")
   static IndexData indexCache13;

   static {
      tileHeights = new int[4][105][105];
      tileSettings = new byte[4][104][104];
      field442 = 99;
      field450 = new int[]{1, 2, 4, 8};
      field451 = new int[]{16, 32, 64, 128};
      field452 = new int[]{1, 0, -1, 0};
      field453 = new int[]{0, -1, 0, 1};
      field458 = new int[]{1, -1, -1, 1};
      field449 = new int[]{-1, -1, 1, 1};
      field457 = (int)(Math.random() * 17.0D) - 8;
      field455 = (int)(Math.random() * 33.0D) - 16;
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-29"
   )
   static void method965(int var0, int var1) {
      if(Client.field811 != 0 && var0 != -1) {
         Actor.method1554(OwnWorldComparator.indexTrack2, var0, 0, Client.field811, false);
         Client.field813 = true;
      }

   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-16"
   )
   static void method991(int var0) {
      Client.field791 = 0L;
      if(var0 >= 2) {
         Client.isResized = true;
      } else {
         Client.isResized = false;
      }

      int var1 = Client.isResized?2:1;
      if(var1 == 1) {
         Buffer.clientInstance.method906(765, 503);
      } else {
         Buffer.clientInstance.method906(7680, 2160);
      }

      if(Client.gameState >= 25) {
         PacketNode var2 = class26.method433(ClientPacket.field2215, Client.field626.field1218);
         PacketBuffer var3 = var2.packetBuffer;
         int var4 = Client.isResized?2:1;
         var3.putByte(var4);
         var2.packetBuffer.putShort(Varcs.canvasWidth);
         var2.packetBuffer.putShort(BuildType.canvasHeight);
         Client.field626.method1980(var2);
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "-1119730379"
   )
   @Export("addMenuEntry")
   public static final void addMenuEntry(String var0, String var1, int var2, int var3, int var4, int var5) {
      BuildType.method4612(var0, var1, var2, var3, var4, var5, false);
   }
}
