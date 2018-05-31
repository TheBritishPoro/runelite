import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("Varbit")
public class Varbit extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("varbit_ref")
   public static IndexDataBase varbit_ref;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("varbits")
   public static NodeCache varbits;
   @ObfuscatedName("n")
   @Export("floorMultiplier")
   static int[] floorMultiplier;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -738108461
   )
   @Export("configId")
   public int configId;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 676822163
   )
   @Export("leastSignificantBit")
   public int leastSignificantBit;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1532826907
   )
   @Export("mostSignificantBit")
   public int mostSignificantBit;

   static {
      varbits = new NodeCache(64);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1902884964"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1481115001"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      if(var2 == 1) {
         this.configId = var1.readUnsignedShort();
         this.leastSignificantBit = var1.readUnsignedByte();
         this.mostSignificantBit = var1.readUnsignedByte();
      }

   }
}
