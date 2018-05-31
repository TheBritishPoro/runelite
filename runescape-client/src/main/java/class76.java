import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class76 {
   @ObfuscatedName("z")
   static final BigInteger field1071;
   @ObfuscatedName("w")
   static final BigInteger field1069;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Ldy;"
   )
   @Export("idxFiles")
   public static CacheFile[] idxFiles;
   @ObfuscatedName("ak")
   static int[] field1073;

   static {
      field1071 = new BigInteger("10001", 16);
      field1069 = new BigInteger("97e13ef453eef11c2e2b108891d256c90098b9da343c760762cdc2ccb5b9cc01552ee1f17fef7e9ad45cce00f378db17ae8f17c43fa4bdab098e5022b17175b147560d10c86658c7a471514e0bdce6c95f1b0ba8ceb5322e09b64b6bb30b1f88d2a879f88b871b4519717800df32d7f3e55f492af08025ab7ccd747491e82fe5", 16);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Lgt;IB)Lgt;",
      garbageValue = "0"
   )
   @Export("forOrdinal")
   public static Enumerated forOrdinal(Enumerated[] var0, int var1) {
      Enumerated[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Enumerated var4 = var2[var3];
         if(var1 == var4.rsOrdinal()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZII)J",
      garbageValue = "1782575928"
   )
   public static long method1804(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var5 |= 65536L;
      }

      return var5;
   }
}
