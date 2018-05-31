import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("NetWriter")
public class NetWriter {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   @Export("rssocket")
   class157 rssocket;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   @Export("packetBufferNodes")
   CombatInfoList packetBufferNodes;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1758377903
   )
   int field1216;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   @Export("buffer")
   Buffer buffer;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   public ISAACCipher field1218;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   @Export("packetBuffer")
   PacketBuffer packetBuffer;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   @Export("serverPacket")
   ServerPacket serverPacket;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 321778423
   )
   @Export("packetLength")
   int packetLength;
   @ObfuscatedName("x")
   boolean field1222;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 590402107
   )
   int field1228;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -856359331
   )
   int field1224;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPacket field1215;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPacket field1226;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPacket field1227;

   NetWriter() {
      this.packetBufferNodes = new CombatInfoList();
      this.field1216 = 0;
      this.buffer = new Buffer(5000);
      this.packetBuffer = new PacketBuffer(40000);
      this.serverPacket = null;
      this.packetLength = 0;
      this.field1222 = true;
      this.field1228 = 0;
      this.field1224 = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "54"
   )
   final void method1978() {
      this.packetBufferNodes.method4030();
      this.field1216 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "86"
   )
   final void method1979() throws IOException {
      if(this.rssocket != null && this.field1216 > 0) {
         this.buffer.offset = 0;

         while(true) {
            PacketNode var1 = (PacketNode)this.packetBufferNodes.last();
            if(var1 == null || var1.field2255 > this.buffer.payload.length - this.buffer.offset) {
               this.rssocket.vmethod3347(this.buffer.payload, 0, this.buffer.offset);
               this.field1224 = 0;
               break;
            }

            this.buffer.putBytes(var1.packetBuffer.payload, 0, var1.field2255);
            this.field1216 -= var1.field2255;
            var1.unlink();
            var1.packetBuffer.method3531();
            var1.method3460();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lfn;B)V",
      garbageValue = "1"
   )
   public final void method1980(PacketNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.field2255 = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.field1216 += var1.field2255;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lfd;I)V",
      garbageValue = "1571266841"
   )
   @Export("setSocket")
   void setSocket(class157 var1) {
      this.rssocket = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "822"
   )
   @Export("close")
   void close() {
      if(this.rssocket != null) {
         this.rssocket.vmethod3346();
         this.rssocket = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method1984() {
      this.rssocket = null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Lfd;",
      garbageValue = "-1005622173"
   )
   @Export("getSocket")
   class157 getSocket() {
      return this.rssocket;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;ZII)V",
      garbageValue = "1336777365"
   )
   static void method1994(IndexDataBase var0, IndexDataBase var1, boolean var2, int var3) {
      if(class78.field1101) {
         if(var3 == 4) {
            class78.loginIndex = 4;
         }

      } else {
         class78.loginIndex = var3;
         Rasterizer2D.reset();
         byte[] var4 = var0.takeRecordByNames("title.jpg", "");
         class78.field1092 = class284.method5324(var4);
         class78.field1087 = class78.field1092.method5840();
         if((Client.flags & 536870912) != 0) {
            class78.logoSprite = class221.getSprite(var1, "logo_deadman_mode", "");
         } else {
            class78.logoSprite = class221.getSprite(var1, "logo", "");
         }

         class78.field1083 = class221.getSprite(var1, "titlebox", "");
         class78.field1084 = class221.getSprite(var1, "titlebutton", "");
         class78.runeSprites = class13.getIndexedSprites(var1, "runes", "");
         FrameMap.titlemuteSprite = class13.getIndexedSprites(var1, "title_mute", "");
         class235.field2783 = class221.getSprite(var1, "options_radio_buttons,0", "");
         Resampler.field1352 = class221.getSprite(var1, "options_radio_buttons,4", "");
         class78.field1089 = class221.getSprite(var1, "options_radio_buttons,2", "");
         ItemContainer.field472 = class221.getSprite(var1, "options_radio_buttons,6", "");
         FriendManager.field978 = class235.field2783.width;
         Preferences.field966 = class235.field2783.height;
         CombatInfo1.field936 = new int[256];

         int var5;
         for(var5 = 0; var5 < 64; ++var5) {
            CombatInfo1.field936[var5] = var5 * 262144;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            CombatInfo1.field936[var5 + 64] = var5 * 1024 + 16711680;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            CombatInfo1.field936[var5 + 128] = var5 * 4 + 16776960;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            CombatInfo1.field936[var5 + 192] = 16777215;
         }

         class185.field2364 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            class185.field2364[var5] = var5 * 1024;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class185.field2364[var5 + 64] = var5 * 4 + 65280;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class185.field2364[var5 + 128] = var5 * 262144 + 65535;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class185.field2364[var5 + 192] = 16777215;
         }

         class11.field69 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            class11.field69[var5] = var5 * 4;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class11.field69[var5 + 64] = var5 * 262144 + 255;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class11.field69[var5 + 128] = var5 * 1024 + 16711935;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class11.field69[var5 + 192] = 16777215;
         }

         AttackOption.field1077 = new int[256];
         AbstractByteBuffer.field2367 = new int['耀'];
         class81.field1169 = new int['耀'];
         FriendManager.method1682((IndexedSprite)null);
         SoundTaskDataProvider.field357 = new int['耀'];
         class76.field1073 = new int['耀'];
         if(var2) {
            class78.username = "";
            class78.password = "";
         }

         WorldMapType3.field104 = 0;
         MapIcon.field238 = "";
         class78.field1104 = true;
         class78.worldSelectShown = false;
         if(!class10.preferences.muted) {
            WorldMapRegion.method422(2, Item.indexTrack1, "scape main", "", 255, false);
         } else {
            class26.method427(2);
         }

         class222.sendConInfo(false);
         class78.field1101 = true;
         class78.field1082 = (Varcs.canvasWidth - 765) / 2;
         class78.loginWindowX = class78.field1082 + 202;
         class78.field1091 = class78.loginWindowX + 180;
         class78.field1092.method5849(class78.field1082, 0);
         class78.field1087.method5849(class78.field1082 + 382, 0);
         class78.logoSprite.method5829(class78.field1082 + 382 - class78.logoSprite.width / 2, 18);
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-72700836"
   )
   static final void method2005(boolean var0) {
      if(var0) {
         Client.field619 = class78.field1104?class146.field1910:class146.field1905;
      } else {
         Client.field619 = class10.preferences.preferences.containsKey(Integer.valueOf(TotalQuantityComparator.method35(class78.username)))?class146.field1908:class146.field1907;
      }

   }
}
