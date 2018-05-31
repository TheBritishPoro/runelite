import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Coordinates")
public class Coordinates {
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = 1986316761
   )
   static int field2568;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1575232807
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 208134387
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 44298731
   )
   @Export("worldX")
   public int worldX;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -187382705
   )
   @Export("worldY")
   public int worldY;

   @ObfuscatedSignature(
      signature = "(Lha;)V"
   )
   public Coordinates(Coordinates var1) {
      this.plane = var1.plane;
      this.worldX = var1.worldX;
      this.worldY = var1.worldY;
   }

   public Coordinates(int var1, int var2, int var3) {
      this.plane = var1;
      this.worldX = var2;
      this.worldY = var3;
   }

   public Coordinates() {
      this.plane = -1;
   }

   public Coordinates(int var1) {
      if(var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.worldX = var1 >> 14 & 16383;
         this.worldY = var1 & 16383;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-2113986105"
   )
   @Export("set")
   public void set(int var1, int var2, int var3) {
      this.plane = var1;
      this.worldX = var2;
      this.worldY = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1904396734"
   )
   @Export("bitpack")
   public int bitpack() {
      return this.plane << 28 | this.worldX << 14 | this.worldY;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lha;I)Z",
      garbageValue = "-1097701365"
   )
   boolean method4439(Coordinates var1) {
      return this.plane != var1.plane?false:(this.worldX != var1.worldX?false:this.worldY == var1.worldY);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1171766630"
   )
   String method4441(String var1) {
      return this.plane + var1 + (this.worldX >> 6) + var1 + (this.worldY >> 6) + var1 + (this.worldX & 63) + var1 + (this.worldY & 63);
   }

   public int hashCode() {
      return this.bitpack();
   }

   public String toString() {
      return this.method4441(",");
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof Coordinates)?false:this.method4439((Coordinates)var1));
   }
}
