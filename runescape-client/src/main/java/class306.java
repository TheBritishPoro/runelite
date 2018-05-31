import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class306 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lir;III)Z",
      garbageValue = "-1104652703"
   )
   static boolean method5660(IndexDataBase var0, int var1, int var2) {
      byte[] var3 = var0.getConfigData(var1, var2);
      if(var3 == null) {
         return false;
      } else {
         ObjectComposition.decodeSprite(var3);
         return true;
      }
   }
}
