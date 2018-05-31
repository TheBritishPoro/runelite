import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public abstract class class16 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 415051583
   )
   int field127;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1630756967
   )
   int field117;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -168585187
   )
   int field118;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 764226753
   )
   int field119;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1927433157
   )
   int field120;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1180650773
   )
   int field121;
   @ObfuscatedName("k")
   short[][][] field125;
   @ObfuscatedName("i")
   short[][][] field123;
   @ObfuscatedName("x")
   byte[][][] field124;
   @ObfuscatedName("e")
   byte[][][] field116;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[[[[Ly;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;

   class16() {
      new LinkedList();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IILgk;I)V",
      garbageValue = "-1870240303"
   )
   void method150(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if(var4 != 0) {
         if((var4 & 1) != 0) {
            this.method167(var1, var2, var3, var4);
         } else {
            this.method152(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IILgk;IB)V",
      garbageValue = "33"
   )
   void method167(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field123[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field125[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILgk;II)V",
      garbageValue = "1447711600"
   )
   void method152(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field125[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.readUnsignedByte();
            if(var10 != 0) {
               this.field123[var9][var1][var2] = (short)var10;
               var11 = var3.readUnsignedByte();
               this.field124[var9][var1][var2] = (byte)(var11 >> 2);
               this.field116[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if(var9 != 0) {
               WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method3546();
                  int var13 = var3.readUnsignedByte();
                  var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   int method153(int var1, int var2) {
      return var1 >= 0 && var2 >= 0?(var1 < 64 && var2 < 64?this.field125[0][var1][var2] - 1:-1):-1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-231958659"
   )
   int method149() {
      return this.field118;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-29"
   )
   int method168() {
      return this.field119;
   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-327616642"
   )
   static final void method158(int var0, int var1, int var2, int var3) {
      if(Client.field621) {
         if(Client.cursorState == 1) {
            class161.crossSprites[Client.field803 / 100].drawAt(Client.lastLeftClickX - 8, Client.lastLeftClickY - 8);
         }

         if(Client.cursorState == 2) {
            class161.crossSprites[Client.field803 / 100 + 4].drawAt(Client.lastLeftClickX - 8, Client.lastLeftClickY - 8);
         }
      }

      Client.myPlayerIndex = 0;
      int var4 = (class138.localPlayer.x >> 7) + PendingSpawn.baseX;
      int var5 = (class138.localPlayer.y >> 7) + Client.baseY;
      if(var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
         Client.myPlayerIndex = 1;
      }

      if(var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
         Client.myPlayerIndex = 1;
      }

      if(Client.myPlayerIndex == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
         Client.myPlayerIndex = 0;
      }

   }
}
