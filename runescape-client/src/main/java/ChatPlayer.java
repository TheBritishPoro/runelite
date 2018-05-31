import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("ChatPlayer")
public class ChatPlayer extends Nameable {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1986288725
   )
   @Export("world")
   public int world;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -745943211
   )
   public int field3627;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1388711563
   )
   @Export("rank")
   public int rank;

   ChatPlayer() {
      this.world = -1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-414916451"
   )
   void method5412(int var1, int var2) {
      this.world = var1;
      this.field3627 = var2;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1524390251"
   )
   public int method5414() {
      return this.world;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-34"
   )
   public boolean method5415() {
      return this.world > 0;
   }
}
