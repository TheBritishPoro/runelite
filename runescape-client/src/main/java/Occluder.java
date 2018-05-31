import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      signature = "[Lhi;"
   )
   static Widget[] field1814;
   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Widget field1819;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1489724317
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1317247961
   )
   @Export("maxTIleX")
   int maxTIleX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -496376973
   )
   @Export("minTileZ")
   int minTileZ;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 793292825
   )
   @Export("maxTileZ")
   int maxTileZ;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1286710007
   )
   @Export("type")
   int type;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 236157701
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1746982005
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -927006489
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -422885885
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2060892371
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2060435561
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1832511085
   )
   @Export("testDirection")
   int testDirection;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -376026905
   )
   int field1815;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1668773103
   )
   int field1816;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1826745175
   )
   @Export("minNormalX")
   int minNormalX;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1352607471
   )
   @Export("maxNormalX")
   int maxNormalX;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -690074873
   )
   @Export("minNormalY")
   int minNormalY;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -972074235
   )
   @Export("maxNormalY")
   int maxNormalY;

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Z",
      garbageValue = "-2063892769"
   )
   static final boolean method3097(Widget var0) {
      if(var0.tableActions == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.tableActions.length; ++var1) {
            int var2 = class137.method3119(var0, var1);
            int var3 = var0.field2720[var1];
            if(var0.tableActions[var1] == 2) {
               if(var2 >= var3) {
                  return false;
               }
            } else if(var0.tableActions[var1] == 3) {
               if(var2 <= var3) {
                  return false;
               }
            } else if(var0.tableActions[var1] == 4) {
               if(var3 == var2) {
                  return false;
               }
            } else if(var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1450282680"
   )
   static void method3096(int var0) {
      Client.field655 = var0;
   }
}
