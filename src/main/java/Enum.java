import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("Enum")
public class Enum extends CacheableNode {
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   public static IndexDataBase field3475;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static NodeCache field3466;
   @ObfuscatedName("o")
   @Export("userHome")
   static String userHome;
   @ObfuscatedName("k")
   @Export("keyType")
   public char keyType;
   @ObfuscatedName("z")
   @Export("valType")
   public char valType;
   @ObfuscatedName("v")
   @Export("defaultString")
   public String defaultString;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1709671563
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1222350313
   )
   @Export("size")
   public int size;
   @ObfuscatedName("t")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("p")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("r")
   @Export("stringVals")
   public String[] stringVals;

   static {
      field3466 = new NodeCache(64);
   }

   public Enum() {
      this.defaultString = "null";
      this.size = 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lfr;I)V",
      garbageValue = "-93868231"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4642(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lfr;II)V",
      garbageValue = "778882397"
   )
   void method4642(Buffer var1, int var2) {
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
}
