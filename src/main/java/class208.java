import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("he")
public class class208 implements Iterator {
   @ObfuscatedName("g")
   Node field3165;
   @ObfuscatedName("l")
   class205 field3166;
   @ObfuscatedName("r")
   Node field3167 = null;

   class208(class205 var1) {
      this.field3166 = var1;
      this.field3165 = this.field3166.field3161.next;
      this.field3167 = null;
   }

   public Object next() {
      Node var1 = this.field3165;
      if(var1 == this.field3166.field3161) {
         var1 = null;
         this.field3165 = null;
      } else {
         this.field3165 = var1.next;
      }

      this.field3167 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3165 != this.field3166.field3161;
   }

   public void remove() {
      if(this.field3167 == null) {
         throw new IllegalStateException();
      } else {
         this.field3167.unlink();
         this.field3167 = null;
      }
   }
}
