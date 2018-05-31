import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class179 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lid;",
      garbageValue = "909001219"
   )
   public static BuildType method3517(int var0) {
      BuildType[] var1 = new BuildType[]{BuildType.WIP, BuildType.LIVE, BuildType.RC, BuildType.BUILD_LIVE};
      BuildType[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         BuildType var4 = var2[var3];
         if(var0 == var4.field3133) {
            return var4;
         }
      }

      return null;
   }
}
