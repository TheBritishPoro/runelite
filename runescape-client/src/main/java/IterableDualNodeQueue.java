import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("IterableDualNodeQueue")
public class IterableDualNodeQueue implements Iterable {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("sentinel")
   public CacheableNode sentinel;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   CacheableNode field2444;

   public IterableDualNodeQueue() {
      this.sentinel = new CacheableNode();
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("z")
   @Export("clear")
   public void clear() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.unlinkDual();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   @Export("add")
   public void add(CacheableNode var1) {
      if(var1.next != null) {
         var1.unlinkDual();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   CacheableNode method4156() {
      CacheableNode var1 = this.sentinel.previous;
      if(var1 == this.sentinel) {
         return null;
      } else {
         var1.unlinkDual();
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   CacheableNode method4177() {
      return this.method4160((CacheableNode)null);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgw;)Lgw;"
   )
   CacheableNode method4160(CacheableNode var1) {
      CacheableNode var2;
      if(var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if(var2 == this.sentinel) {
         this.field2444 = null;
         return null;
      } else {
         this.field2444 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   CacheableNode method4159() {
      CacheableNode var1 = this.field2444;
      if(var1 == this.sentinel) {
         this.field2444 = null;
         return null;
      } else {
         this.field2444 = var1.previous;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class214(this);
   }
}
