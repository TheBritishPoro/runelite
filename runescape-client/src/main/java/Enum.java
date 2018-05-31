import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Enum")
public class Enum extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("EnumDefinition_indexCache")
   public static IndexDataBase EnumDefinition_indexCache;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("EnumDefinition_cached")
   static NodeCache EnumDefinition_cached;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static BuildType field3346;
   @ObfuscatedName("s")
   @Export("keyType")
   public char keyType;
   @ObfuscatedName("l")
   @Export("valType")
   public char valType;
   @ObfuscatedName("u")
   @Export("defaultString")
   public String defaultString;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1596194807
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 689327517
   )
   @Export("size")
   public int size;
   @ObfuscatedName("i")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("x")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("e")
   @Export("stringVals")
   public String[] stringVals;

   static {
      EnumDefinition_cached = new NodeCache(64);
   }

   Enum() {
      this.defaultString = "null";
      this.size = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "2"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "1"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      if(var2 == 1) {
         this.keyType = (char)var1.readUnsignedByte();
      } else if(var2 == 2) {
         this.valType = (char)var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.defaultString = var1.readString();
      } else if(var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if(var2 == 5) {
            this.size = var1.readUnsignedShort();
            this.keys = new int[this.size];
            this.stringVals = new String[this.size];

            for(var3 = 0; var3 < this.size; ++var3) {
               this.keys[var3] = var1.readInt();
               this.stringVals[var3] = var1.readString();
            }
         } else if(var2 == 6) {
            this.size = var1.readUnsignedShort();
            this.keys = new int[this.size];
            this.intVals = new int[this.size];

            for(var3 = 0; var3 < this.size; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-530255352"
   )
   public int method4980() {
      return this.size;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(DDIB)[D",
      garbageValue = "2"
   )
   public static double[] method4986(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         double var15 = ((double)var7 - var0) / var2;
         double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var11 = var13 / var2;
         var6[var8] = var11;
         ++var7;
      }

      return var6;
   }
}
