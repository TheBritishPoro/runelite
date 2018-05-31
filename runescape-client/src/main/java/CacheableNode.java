import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("CacheableNode")
public class CacheableNode extends Node {
   @ObfuscatedName("cx")
   long field2428;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("previous")
   public CacheableNode previous;
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("next")
   public CacheableNode next;

   @ObfuscatedName("cz")
   @Export("unlinkDual")
   public void unlinkDual() {
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
