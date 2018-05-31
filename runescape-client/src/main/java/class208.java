import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class208 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   class209 field2431;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   class209 field2430;

   public class208() {
      this.field2431 = new class209();
      this.field2431.field2432 = this.field2431;
      this.field2431.field2433 = this.field2431;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lhk;)V"
   )
   public void method4112(class209 var1) {
      if(var1.field2433 != null) {
         var1.method4121();
      }

      var1.field2433 = this.field2431.field2433;
      var1.field2432 = this.field2431;
      var1.field2433.field2432 = var1;
      var1.field2432.field2433 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhk;"
   )
   public class209 method4111() {
      class209 var1 = this.field2431.field2432;
      if(var1 == this.field2431) {
         this.field2430 = null;
         return null;
      } else {
         this.field2430 = var1.field2432;
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhk;"
   )
   public class209 method4114() {
      class209 var1 = this.field2430;
      if(var1 == this.field2431) {
         this.field2430 = null;
         return null;
      } else {
         this.field2430 = var1.field2432;
         return var1;
      }
   }
}
