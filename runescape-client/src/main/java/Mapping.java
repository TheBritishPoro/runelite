import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dz")
@Implements("Mapping")
public class Mapping {
   @ObfuscatedName("z")
   int field1388;
   @ObfuscatedName("w")
   @Export("mux")
   int mux;
   @ObfuscatedName("s")
   @Export("submapFloors")
   int[] submapFloors;
   @ObfuscatedName("l")
   int[] field1386;

   Mapping() {
      class92.getInt(16);
      this.field1388 = class92.getBit() != 0?class92.getInt(4) + 1:1;
      if(class92.getBit() != 0) {
         class92.getInt(8);
      }

      class92.getInt(2);
      if(this.field1388 > 1) {
         this.mux = class92.getInt(4);
      }

      this.submapFloors = new int[this.field1388];
      this.field1386 = new int[this.field1388];

      for(int var1 = 0; var1 < this.field1388; ++var1) {
         class92.getInt(8);
         this.submapFloors[var1] = class92.getInt(8);
         this.field1386[var1] = class92.getInt(8);
      }

   }
}
