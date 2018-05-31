import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class144 extends class283 {
   @ObfuscatedName("z")
   final boolean field1902;

   public class144(boolean var1) {
      this.field1902 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "66"
   )
   int method3175(ChatPlayer var1, ChatPlayer var2) {
      return var2.rank != var1.rank?(this.field1902?var1.rank - var2.rank:var2.rank - var1.rank):this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3175((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;B)V",
      garbageValue = "15"
   )
   public static void method3181(IndexDataBase var0, IndexDataBase var1) {
      CombatInfo2.field3304 = var0;
      CombatInfo2.field3314 = var1;
   }
}
