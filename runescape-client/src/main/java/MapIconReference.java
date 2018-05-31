import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("MapIconReference")
public class MapIconReference {
   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      signature = "Lca;"
   )
   static class88 field310;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   @Export("loginType")
   static JagexLoginType loginType;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexCache15")
   static IndexData indexCache15;
   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("mapDots")
   static SpritePixels[] mapDots;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 975450249
   )
   @Export("areaId")
   public int areaId;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public Coordinates field311;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public Coordinates field308;

   @ObfuscatedSignature(
      signature = "(ILha;Lha;)V"
   )
   public MapIconReference(int var1, Coordinates var2, Coordinates var3) {
      this.areaId = var1;
      this.field311 = var2;
      this.field308 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lfd;ZI)V",
      garbageValue = "-2121353984"
   )
   public static void method633(class157 var0, boolean var1) {
      if(class250.NetCache_socket != null) {
         try {
            class250.NetCache_socket.vmethod3346();
         } catch (Exception var6) {
            ;
         }

         class250.NetCache_socket = null;
      }

      class250.NetCache_socket = var0;
      class222.sendConInfo(var1);
      class250.NetCache_responseHeaderBuffer.offset = 0;
      class250.currentRequest = null;
      class301.NetCache_responseArchiveBuffer = null;
      class250.field3210 = 0;

      while(true) {
         FileRequest var2 = (FileRequest)class250.NetCache_pendingPriorityResponses.first();
         if(var2 == null) {
            while(true) {
               var2 = (FileRequest)class250.NetCache_pendingResponses.first();
               if(var2 == null) {
                  if(class250.field3213 != 0) {
                     try {
                        Buffer var7 = new Buffer(4);
                        var7.putByte(4);
                        var7.putByte(class250.field3213);
                        var7.putShort(0);
                        class250.NetCache_socket.vmethod3347(var7.payload, 0, 4);
                     } catch (IOException var5) {
                        try {
                           class250.NetCache_socket.vmethod3346();
                        } catch (Exception var4) {
                           ;
                        }

                        ++class250.field3215;
                        class250.NetCache_socket = null;
                     }
                  }

                  class250.field3197 = 0;
                  class250.field3203 = Buffer.method3547();
                  return;
               }

               class250.NetCache_pendingWritesQueue.setHead(var2);
               class250.NetCache_pendingWrites.put(var2, var2.hash);
               ++class250.NetCache_pendingWritesCount;
               --class250.NetCache_pendingResponsesCount;
            }
         }

         class250.NetCache_pendingPriorityWrites.put(var2, var2.hash);
         ++class250.NetCache_pendingPriorityWritesCount;
         --class250.NetCache_pendingPriorityResponsesCount;
      }
   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(Lhi;III)V",
      garbageValue = "-201841471"
   )
   static final void method632(Widget var0, int var1, int var2) {
      if(Client.field810 == 0 || Client.field810 == 3) {
         if(MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) {
            class224 var3 = var0.method4517(true);
            if(var3 == null) {
               return;
            }

            int var4 = MouseInput.mouseLastPressedX - var1;
            int var5 = MouseInput.mouseLastPressedY - var2;
            if(var3.method4423(var4, var5)) {
               var4 -= var3.field2553 / 2;
               var5 -= var3.field2549 / 2;
               int var6 = Client.mapAngle & 2047;
               int var7 = Graphics3D.SINE[var6];
               int var8 = Graphics3D.COSINE[var6];
               int var9 = var5 * var7 + var4 * var8 >> 11;
               int var10 = var8 * var5 - var4 * var7 >> 11;
               int var11 = var9 + class138.localPlayer.x >> 7;
               int var12 = class138.localPlayer.y - var10 >> 7;
               PacketNode var13 = class26.method433(ClientPacket.field2135, Client.field626.field1218);
               var13.packetBuffer.putByte(18);
               var13.packetBuffer.putShort(var11 + PendingSpawn.baseX);
               var13.packetBuffer.method3575(KeyFocusListener.keyPressed[82]?(KeyFocusListener.keyPressed[81]?2:1):0);
               var13.packetBuffer.method3582(var12 + Client.baseY);
               var13.packetBuffer.putByte(var4);
               var13.packetBuffer.putByte(var5);
               var13.packetBuffer.putShort(Client.mapAngle);
               var13.packetBuffer.putByte(57);
               var13.packetBuffer.putByte(0);
               var13.packetBuffer.putByte(0);
               var13.packetBuffer.putByte(89);
               var13.packetBuffer.putShort(class138.localPlayer.x);
               var13.packetBuffer.putShort(class138.localPlayer.y);
               var13.packetBuffer.putByte(63);
               Client.field626.method1980(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }
}
