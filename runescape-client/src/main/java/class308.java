import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class308 implements Comparator {
   @ObfuscatedName("z")
   final boolean field3738;

   public class308(boolean var1) {
      this.field3738 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljx;Ljx;B)I",
      garbageValue = "-98"
   )
   int method5664(Nameable var1, Nameable var2) {
      return this.field3738?var1.vmethod5453(var2):var2.vmethod5453(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5664((Nameable)var1, (Nameable)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
