import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Ignore")
public class Ignore extends Nameable {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 399210531
   )
   int field3624;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkx;I)I",
      garbageValue = "2142390446"
   )
   int method5406(Ignore var1) {
      return this.field3624 - var1.field3624;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Nameable var1) {
      return this.method5406((Ignore)var1);
   }

   public int compareTo(Object var1) {
      return this.method5406((Ignore)var1);
   }
}
