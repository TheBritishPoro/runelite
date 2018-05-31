import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("qi")
   @ObfuscatedSignature(
      signature = "Lw;"
   )
   @Export("grandExchangeEvents")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -746355455
   )
   static int field152;
   @ObfuscatedName("k")
   @Export("overlayRotations")
   static byte[][][] overlayRotations;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -628993611
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 982920549
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 454780769
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Lew;",
      garbageValue = "-838426399"
   )
   @Export("getFrames")
   static Frames getFrames(int var0) {
      Frames var1 = (Frames)Sequence.skeletons.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         IndexDataBase var3 = Sequence.skel_ref;
         IndexDataBase var4 = Sequence.skin_ref;
         boolean var5 = true;
         int[] var6 = var3.getChilds(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.getChild(var0, var6[var7]);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.getChild(var9, 0);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         Frames var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               var2 = new Frames(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if(var2 != null) {
            Sequence.skeletons.put(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-185686221"
   )
   public static void method197(int var0, int var1, int var2, boolean var3) {
      PacketNode var4 = class26.method433(ClientPacket.field2156, Client.field626.field1218);
      var4.packetBuffer.method3575(var2);
      var4.packetBuffer.method3594(var3?Client.field853:0);
      var4.packetBuffer.method3583(var1);
      var4.packetBuffer.method3771(var0);
      Client.field626.method1980(var4);
   }
}
