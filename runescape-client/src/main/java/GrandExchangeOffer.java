import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
   @ObfuscatedName("z")
   @Export("state")
   byte state;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -505500629
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1231470581
   )
   @Export("price")
   public int price;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 528031905
   )
   @Export("totalQuantity")
   public int totalQuantity;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1404264417
   )
   @Export("quantitySold")
   public int quantitySold;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1551136007
   )
   @Export("spent")
   public int spent;

   public GrandExchangeOffer() {
   }

   @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "0"
   )
   public GrandExchangeOffer(Buffer var1, boolean var2) {
      this.state = var1.readByte();
      this.itemId = var1.readUnsignedShort();
      this.price = var1.readInt();
      this.totalQuantity = var1.readInt();
      this.quantitySold = var1.readInt();
      this.spent = var1.readInt();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1516792528"
   )
   @Export("status")
   public int status() {
      return this.state & 7;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "63"
   )
   @Export("type")
   public int type() {
      return (this.state & 8) == 8?1:0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-658609218"
   )
   void method44(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "74851290"
   )
   void method40(int var1) {
      this.state &= -9;
      if(var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1218832541"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if(class49.listFetcher == null) {
            class49.listFetcher = MapIcon.urlRequester.request(new URL(class26.field219));
         } else if(class49.listFetcher.isDone()) {
            byte[] var0 = class49.listFetcher.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.worldCount = var1.readUnsignedShort();
            World.worldList = new World[World.worldCount];

            World var3;
            for(int var2 = 0; var2 < World.worldCount; var3.index = var2++) {
               var3 = World.worldList[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.mask = var1.readInt();
               var3.address = var1.readString();
               var3.activity = var1.readString();
               var3.location = var1.readUnsignedByte();
               var3.playerCount = var1.readShort();
            }

            MapLabel.method282(World.worldList, 0, World.worldList.length - 1, World.field946, World.field939);
            class49.listFetcher = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class49.listFetcher = null;
      }

      return false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-106852228"
   )
   static final void method56() {
      if(!class120.Viewport_false0) {
         int var0 = Region.pitchSin;
         int var1 = Region.pitchCos;
         int var2 = Region.yawSin;
         int var3 = Region.yawCos;
         byte var4 = 50;
         short var5 = 3500;
         int var6 = (class120.Viewport_mouseX - Graphics3D.centerX) * var4 / Graphics3D.Rasterizer3D_zoom;
         int var7 = (class120.Viewport_mouseY - Graphics3D.centerY) * var4 / Graphics3D.Rasterizer3D_zoom;
         int var8 = (class120.Viewport_mouseX - Graphics3D.centerX) * var5 / Graphics3D.Rasterizer3D_zoom;
         int var9 = (class120.Viewport_mouseY - Graphics3D.centerY) * var5 / Graphics3D.Rasterizer3D_zoom;
         int var10 = Graphics3D.method2807(var7, var4, var1, var0);
         int var11 = Graphics3D.method2790(var7, var4, var1, var0);
         var7 = var10;
         var10 = Graphics3D.method2807(var9, var5, var1, var0);
         int var12 = Graphics3D.method2790(var9, var5, var1, var0);
         var9 = var10;
         var10 = Graphics3D.method2805(var6, var11, var3, var2);
         var11 = Graphics3D.method2806(var6, var11, var3, var2);
         var6 = var10;
         var10 = Graphics3D.method2805(var8, var12, var3, var2);
         var12 = Graphics3D.method2806(var8, var12, var3, var2);
         class120.field1657 = (var10 + var6) / 2;
         class120.field1659 = (var9 + var7) / 2;
         class177.field2283 = (var12 + var11) / 2;
         class303.field3721 = (var10 - var6) / 2;
         class120.field1651 = (var9 - var7) / 2;
         class120.field1654 = (var12 - var11) / 2;
         class98.field1335 = Math.abs(class303.field3721);
         class120.field1655 = Math.abs(class120.field1651);
         ClassInfo.field3757 = Math.abs(class120.field1654);
      }
   }
}
