import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class10 extends class16 {
   @ObfuscatedName("qn")
   @ObfuscatedSignature(
      signature = "Lbx;"
   )
   @Export("preferences")
   static Preferences preferences;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1858538420"
   )
   void method95(Buffer var1, Buffer var2) {
      int var3 = var2.readUnsignedByte();
      if(var3 != class25.field212.field211) {
         throw new IllegalStateException("");
      } else {
         super.field120 = var2.readUnsignedByte();
         super.field121 = var2.readUnsignedByte();
         super.field127 = var2.readUnsignedShort();
         super.field117 = var2.readUnsignedShort();
         super.field118 = var2.readUnsignedShort();
         super.field119 = var2.readUnsignedShort();
         super.field121 = Math.min(super.field121, 4);
         super.field125 = new short[1][64][64];
         super.field123 = new short[super.field121][64][64];
         super.field124 = new byte[super.field121][64][64];
         super.field116 = new byte[super.field121][64][64];
         super.decorations = new WorldMapDecoration[super.field121][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class24.field208.field205) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            if(var4 == super.field118 && var5 == super.field119) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     this.method150(var6, var7, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class10)) {
         return false;
      } else {
         class10 var2 = (class10)var1;
         return super.field118 == var2.field118 && var2.field119 == super.field119;
      }
   }

   public int hashCode() {
      return super.field118 | super.field119 << 8;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1588398214"
   )
   @Export("setItemTableSlot")
   static void setItemTableSlot(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if(var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.put(var4, (long)var0);
      }

      if(var4.itemIds.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.itemIds.length; ++var7) {
            var5[var7] = var4.itemIds[var7];
            var6[var7] = var4.stackSizes[var7];
         }

         for(var7 = var4.itemIds.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.itemIds = var5;
         var4.stackSizes = var6;
      }

      var4.itemIds[var1] = var2;
      var4.stackSizes[var1] = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BI)Lce;",
      garbageValue = "-2110987509"
   )
   @Export("newScript")
   static Script newScript(byte[] var0) {
      Script var1 = new Script();
      Buffer var2 = new Buffer(var0);
      var2.offset = var2.payload.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.payload.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intStackCount = var2.readUnsignedShort();
      var1.stringStackCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if(var6 > 0) {
         var1.switches = var1.method1944(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableHashTable var9 = new IterableHashTable(var8 > 0?class146.nextPowerOfTwo(var8):1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var2.getNullString();
      var1.instructions = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.instructions[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if(var8 == 3) {
            var1.stringOperands[var7] = var2.readString();
         } else if(var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1245329475"
   )
   static boolean method92() {
      if(Client.field781 != null && Client.field606 < Client.field781.size()) {
         while(Client.field606 < Client.field781.size()) {
            class52 var0 = (class52)Client.field781.get(Client.field606);
            if(!var0.method1000()) {
               return false;
            }

            ++Client.field606;
         }

         return true;
      } else {
         return true;
      }
   }
}
