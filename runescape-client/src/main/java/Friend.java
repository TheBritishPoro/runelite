import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Friend")
public class Friend extends ChatPlayer {
   @ObfuscatedName("z")
   boolean field3648;
   @ObfuscatedName("w")
   boolean field3650;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkt;I)I",
      garbageValue = "1391171788"
   )
   int method5452(Friend var1) {
      return super.world == Client.world && Client.world != var1.world?-1:(Client.world == var1.world && super.world != Client.world?1:(super.world != 0 && var1.world == 0?-1:(var1.world != 0 && super.world == 0?1:(this.field3648 && !var1.field3648?-1:(!this.field3648 && var1.field3648?1:(this.field3650 && !var1.field3650?-1:(!this.field3650 && var1.field3650?1:(super.world != 0?super.field3627 - var1.field3627:var1.field3627 - super.field3627))))))));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Nameable var1) {
      return this.method5452((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.method5452((Friend)var1);
   }
}
