import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("DState")
public final class DState {
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "Lbc;"
   )
   @Export("friendManager")
   public static FriendManager friendManager;
   @ObfuscatedName("z")
   final int field2333;
   @ObfuscatedName("w")
   final int field2320;
   @ObfuscatedName("s")
   final int field2327;
   @ObfuscatedName("l")
   final int field2300;
   @ObfuscatedName("u")
   final int field2298;
   @ObfuscatedName("q")
   final int field2299;
   @ObfuscatedName("k")
   @Export("strm")
   byte[] strm;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -189685229
   )
   @Export("next_in")
   int next_in;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1713666481
   )
   @Export("total_out_lo32")
   int total_out_lo32;
   @ObfuscatedName("e")
   @Export("out")
   byte[] out;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 218244667
   )
   @Export("next_out")
   int next_out;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1013289063
   )
   int field2310;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2020780463
   )
   @Export("total_out_hi32")
   int total_out_hi32;
   @ObfuscatedName("f")
   @Export("out_ch")
   byte out_ch;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1896627185
   )
   @Export("out_len")
   int out_len;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1154279369
   )
   @Export("total_in_hi32")
   int total_in_hi32;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -195550973
   )
   @Export("total_in_lo32")
   int total_in_lo32;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 823456491
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1804401527
   )
   int field2312;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1057581785
   )
   @Export("tPos")
   int tPos;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1763458429
   )
   @Export("k0")
   int k0;
   @ObfuscatedName("j")
   int[] field2315;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1198980805
   )
   @Export("nblock_used")
   int nblock_used;
   @ObfuscatedName("h")
   int[] field2317;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1095083449
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("af")
   @Export("inUse")
   boolean[] inUse;
   @ObfuscatedName("ah")
   boolean[] field2296;
   @ObfuscatedName("ab")
   @Export("seqToUnseq")
   byte[] seqToUnseq;
   @ObfuscatedName("aw")
   byte[] field2322;
   @ObfuscatedName("ak")
   int[] field2323;
   @ObfuscatedName("as")
   byte[] field2324;
   @ObfuscatedName("an")
   byte[] field2328;
   @ObfuscatedName("ao")
   byte[][] field2303;
   @ObfuscatedName("at")
   int[][] field2301;
   @ObfuscatedName("ai")
   int[][] field2297;
   @ObfuscatedName("ac")
   int[][] field2329;
   @ObfuscatedName("ap")
   int[] field2330;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -784898283
   )
   int field2331;

   DState() {
      this.field2333 = 4096;
      this.field2320 = 16;
      this.field2327 = 258;
      this.field2300 = 6;
      this.field2298 = 50;
      this.field2299 = 18002;
      this.next_in = 0;
      this.next_out = 0;
      this.field2315 = new int[256];
      this.field2317 = new int[257];
      this.inUse = new boolean[256];
      this.field2296 = new boolean[16];
      this.seqToUnseq = new byte[256];
      this.field2322 = new byte[4096];
      this.field2323 = new int[16];
      this.field2324 = new byte[18002];
      this.field2328 = new byte[18002];
      this.field2303 = new byte[6][258];
      this.field2301 = new int[6][258];
      this.field2297 = new int[6][258];
      this.field2329 = new int[6][258];
      this.field2330 = new int[6];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lfy;S)V",
      garbageValue = "-23215"
   )
   public static void method3529(Huffman var0) {
      class300.huffman = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIILjj;II)V",
      garbageValue = "-596460194"
   )
   static void method3528(int var0, int var1, int var2, ObjectComposition var3, int var4) {
      class68 var5 = new class68();
      var5.field981 = var0;
      var5.field988 = var1 * 128;
      var5.field983 = var2 * 128;
      int var6 = var3.width;
      int var7 = var3.length;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.length;
         var7 = var3.width;
      }

      var5.field984 = (var6 + var1) * 128;
      var5.field992 = (var7 + var2) * 128;
      var5.field987 = var3.ambientSoundId;
      var5.field991 = var3.int4 * 128;
      var5.field989 = var3.int5;
      var5.field982 = var3.int6;
      var5.field986 = var3.field3417;
      if(var3.impostorIds != null) {
         var5.field994 = var3;
         var5.method1688();
      }

      class68.field985.addFront(var5);
      if(var5.field986 != null) {
         var5.field990 = var5.field989 + (int)(Math.random() * (double)(var5.field982 - var5.field989));
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-852209287"
   )
   static int method3526(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 5504) {
         class69.intStackSize -= 2;
         var3 = class69.intStack[class69.intStackSize];
         int var4 = class69.intStack[class69.intStackSize + 1];
         if(!Client.field822) {
            Client.cameraPitchTarget = var3;
            Client.mapAngle = var4;
         }

         return 1;
      } else if(var0 == 5505) {
         class69.intStack[++class69.intStackSize - 1] = Client.cameraPitchTarget;
         return 1;
      } else if(var0 == 5506) {
         class69.intStack[++class69.intStackSize - 1] = Client.mapAngle;
         return 1;
      } else if(var0 == 5530) {
         var3 = class69.intStack[--class69.intStackSize];
         if(var3 < 0) {
            var3 = 0;
         }

         Client.field644 = var3;
         return 1;
      } else if(var0 == 5531) {
         class69.intStack[++class69.intStackSize - 1] = Client.field644;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "799584462"
   )
   static void method3527() {
      if(Client.field663 && class138.localPlayer != null) {
         int var0 = class138.localPlayer.pathX[0];
         int var1 = class138.localPlayer.pathY[0];
         if(var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         CacheFile.field1428 = class138.localPlayer.x;
         int var2 = WorldMapType2.getTileHeight(class138.localPlayer.x, class138.localPlayer.y, class13.plane) - Client.field644;
         if(var2 < ItemComposition.field3478) {
            ItemComposition.field3478 = var2;
         }

         GrandExchangeEvent.field23 = class138.localPlayer.y;
         Client.field663 = false;
      }

   }
}
