import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class199 implements Iterator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   CombatInfoList field2404;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Node field2403;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Node field2402;

   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   class199(CombatInfoList var1) {
      this.field2402 = null;
      this.field2404 = var1;
      this.field2403 = this.field2404.node.next;
      this.field2402 = null;
   }

   public Object next() {
      Node var1 = this.field2403;
      if(var1 == this.field2404.node) {
         var1 = null;
         this.field2403 = null;
      } else {
         this.field2403 = var1.next;
      }

      this.field2402 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2404.node != this.field2403;
   }

   public void remove() {
      if(this.field2402 == null) {
         throw new IllegalStateException();
      } else {
         this.field2402.unlink();
         this.field2402 = null;
      }
   }
}
