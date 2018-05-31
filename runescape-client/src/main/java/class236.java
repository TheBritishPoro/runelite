import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class236 {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Lbb;",
      garbageValue = "1530358699"
   )
   static World method4592() {
      return World.field944 < World.worldCount?World.worldList[++World.field944 - 1]:null;
   }
}
