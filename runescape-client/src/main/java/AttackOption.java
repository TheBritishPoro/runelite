import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("AttackOption_dependsOnCombatLevels")
   AttackOption_dependsOnCombatLevels(0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("AttackOption_alwaysRightClick")
   AttackOption_alwaysRightClick(1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("AttackOption_leftClickWhereAvailable")
   AttackOption_leftClickWhereAvailable(2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("AttackOption_hidden")
   AttackOption_hidden(3);

   @ObfuscatedName("j")
   static int[] field1077;
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexInterfaces")
   static IndexData indexInterfaces;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 58517799
   )
   @Export("id")
   final int id;

   AttackOption(int var3) {
      this.id = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.id;
   }
}
