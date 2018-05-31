import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class214 implements Iterator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   IterableDualNodeQueue field2442;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   CacheableNode field2441;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   CacheableNode field2443;

   @ObfuscatedSignature(
      signature = "(Lhj;)V"
   )
   class214(IterableDualNodeQueue var1) {
      this.field2443 = null;
      this.field2442 = var1;
      this.field2441 = this.field2442.sentinel.previous;
      this.field2443 = null;
   }

   public boolean hasNext() {
      return this.field2442.sentinel != this.field2441;
   }

   public Object next() {
      CacheableNode var1 = this.field2441;
      if(var1 == this.field2442.sentinel) {
         var1 = null;
         this.field2441 = null;
      } else {
         this.field2441 = var1.previous;
      }

      this.field2443 = var1;
      return var1;
   }

   public void remove() {
      if(this.field2443 == null) {
         throw new IllegalStateException();
      } else {
         this.field2443.unlinkDual();
         this.field2443 = null;
      }
   }
}
