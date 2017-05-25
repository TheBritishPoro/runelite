import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ga")
@Implements("CacheableNode")
public class CacheableNode extends Node {
   @ObfuscatedName("ce")
   @Export("next")
   public CacheableNode next;
   @ObfuscatedName("cr")
   @Export("previous")
   public CacheableNode previous;

   @ObfuscatedName("co")
   public void method3687() {
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
