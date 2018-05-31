import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("Node")
public class Node {
   @ObfuscatedName("cs")
   @Export("hash")
   public long hash;
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   @Export("next")
   public Node next;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   @Export("previous")
   Node previous;

   @ObfuscatedName("jm")
   @Export("unlink")
   public void unlink() {
      if(this.previous != null) {
         this.previous.next = this.next;
         this.next.previous = this.previous;
         this.next = null;
         this.previous = null;
      }
   }

   @ObfuscatedName("jw")
   @Export("linked")
   public boolean linked() {
      return this.previous != null;
   }
}
