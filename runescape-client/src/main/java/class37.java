import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class37 implements WorldMapSectionBase {
   @ObfuscatedName("g")
   static int[][][] field325;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexSoundEffects")
   static IndexData indexSoundEffects;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -197733351
   )
   int field318;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1775114501
   )
   int field324;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1227159199
   )
   int field319;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -61550559
   )
   int field317;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 121293021
   )
   int field315;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1482436255
   )
   int field320;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 608429445
   )
   int field321;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 412323183
   )
   int field322;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 829826955
   )
   int field316;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1430909947
   )
   int field323;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
   )
   public void vmethod635(WorldMapData var1) {
      if(var1.minX > this.field315) {
         var1.minX = this.field315;
      }

      if(var1.field167 < this.field315) {
         var1.field167 = this.field315;
      }

      if(var1.minY > this.field320) {
         var1.minY = this.field320;
      }

      if(var1.field162 < this.field320) {
         var1.field162 = this.field320;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
   )
   public boolean containsCoord(int var1, int var2, int var3) {
      return var1 >= this.field318 && var1 < this.field318 + this.field324?var2 >= (this.field319 << 6) + (this.field321 << 3) && var2 <= (this.field319 << 6) + (this.field321 << 3) + 7 && var3 >= (this.field317 << 6) + (this.field322 << 3) && var3 <= (this.field317 << 6) + (this.field322 << 3) + 7:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
   )
   public boolean vmethod637(int var1, int var2) {
      return var1 >= (this.field315 << 6) + (this.field316 << 3) && var1 <= (this.field315 << 6) + (this.field316 << 3) + 7 && var2 >= (this.field320 << 6) + (this.field323 << 3) && var2 <= (this.field320 << 6) + (this.field323 << 3) + 7;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
   )
   public int[] vmethod638(int var1, int var2, int var3) {
      if(!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field315 * 64 - this.field319 * 64 + var2 + (this.field316 * 8 - this.field321 * 8), var3 + (this.field320 * 64 - this.field317 * 64) + (this.field323 * 8 - this.field322 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
   )
   public Coordinates vmethod659(int var1, int var2) {
      if(!this.vmethod637(var1, var2)) {
         return null;
      } else {
         int var3 = this.field319 * 64 - this.field315 * 64 + (this.field321 * 8 - this.field316 * 8) + var1;
         int var4 = this.field317 * 64 - this.field320 * 64 + var2 + (this.field322 * 8 - this.field323 * 8);
         return new Coordinates(this.field318, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   public void vmethod639(Buffer var1) {
      this.field318 = var1.readUnsignedByte();
      this.field324 = var1.readUnsignedByte();
      this.field319 = var1.readUnsignedShort();
      this.field321 = var1.readUnsignedByte();
      this.field317 = var1.readUnsignedShort();
      this.field322 = var1.readUnsignedByte();
      this.field315 = var1.readUnsignedShort();
      this.field316 = var1.readUnsignedByte();
      this.field320 = var1.readUnsignedShort();
      this.field323 = var1.readUnsignedByte();
      this.method641();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-49"
   )
   void method641() {
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgi;I)V",
      garbageValue = "-1062831458"
   )
   @Export("initializeGPI")
   static final void initializeGPI(PacketBuffer var0) {
      var0.bitAccess();
      int var1 = Client.localInteractingIndex;
      Player var2 = class138.localPlayer = Client.cachedPlayers[var1] = new Player();
      var2.playerId = var1;
      int var3 = var0.getBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - PendingSpawn.baseX;
      var2.x = (var2.pathX[0] << 7) + (var2.getSize() << 6);
      var2.pathY[0] = var6 - Client.baseY;
      var2.y = (var2.pathY[0] << 7) + (var2.getSize() << 6);
      class13.plane = var2.field567 = var4;
      if(class81.field1157[var1] != null) {
         var2.decodeApperance(class81.field1157[var1]);
      }

      class81.playerIndexesCount = 0;
      class81.playerIndices[++class81.playerIndexesCount - 1] = var1;
      class81.field1156[var1] = 0;
      class81.field1160 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var7 != var1) {
            int var8 = var0.getBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            class81.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
            class81.Players_orientations[var7] = 0;
            class81.Players_targetIndices[var7] = -1;
            class81.field1161[++class81.field1160 - 1] = var7;
            class81.field1156[var7] = 0;
         }
      }

      var0.byteAccess();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "681063668"
   )
   public static int method652() {
      return ++MouseInput.mouseIdleTicks - 1;
   }

   @ObfuscatedName("l")
   public static int method662(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-81"
   )
   static void method640() {
      Iterator var0 = class83.messages.iterator();

      while(var0.hasNext()) {
         MessageNode var1 = (MessageNode)var0.next();
         var1.method1048();
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1520436203"
   )
   protected static int method661() {
      int var0 = 0;
      if(VertexNormal.field1660 == null || !VertexNormal.field1660.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  VertexNormal.field1660 = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if(VertexNormal.field1660 != null) {
         long var9 = Buffer.method3547();
         long var3 = VertexNormal.field1660.getCollectionTime();
         if(-1L != GameEngine.garbageCollectorLastCollectionTime) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if(var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }
}
