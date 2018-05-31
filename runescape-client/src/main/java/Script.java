import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Script")
public class Script extends CacheableNode {
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 1528740431
   )
   static int field1197;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static NodeCache field1190;
   @ObfuscatedName("w")
   @Export("instructions")
   int[] instructions;
   @ObfuscatedName("s")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("l")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1475914653
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1631134769
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 508133827
   )
   @Export("intStackCount")
   int intStackCount;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 546616217
   )
   @Export("stringStackCount")
   int stringStackCount;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   @Export("switches")
   IterableHashTable[] switches;

   static {
      field1190 = new NodeCache(128);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)[Lgu;",
      garbageValue = "-1761127859"
   )
   IterableHashTable[] method1944(int var1) {
      return new IterableHashTable[var1];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "952694011"
   )
   public static void method1955() {
      while(true) {
         Deque var1 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         FileSystem var0;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            var0 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_responseQueue.popFront();
         }

         if(var0 == null) {
            return;
         }

         var0.data.load(var0.index, (int)var0.hash, var0.field3149, false);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-886650438"
   )
   static synchronized byte[] method1943(int var0) {
      return class183.method3773(var0, false);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "2023211616"
   )
   static final void method1956(TaskDataNode var0) {
      var0.field1385 = false;
      if(var0.data != null) {
         var0.data.int1 = 0;
      }

      for(TaskDataNode var1 = var0.vmethod4382(); var1 != null; var1 = var0.vmethod4389()) {
         method1956(var1);
      }

   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "26"
   )
   static final void method1946(int var0, int var1, int var2, boolean var3) {
      if(CombatInfo2.loadWidget(var0)) {
         class304.method5635(GameCanvas.widgets[var0], -1, var1, var2, var3);
      }
   }
}
