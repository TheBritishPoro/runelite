import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class209 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   class209 field2432;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   class209 field2433;

   @ObfuscatedName("z")
   public void method4121() {
      if(this.field2433 != null) {
         this.field2433.field2432 = this.field2432;
         this.field2432.field2433 = this.field2433;
         this.field2432 = null;
         this.field2433 = null;
      }
   }
}
