import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("ClanMember")
public class ClanMember extends ChatPlayer {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field3608;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   class289 field3609;

   ClanMember() {
      this.field3608 = class289.field3633;
      this.field3609 = class289.field3633;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-255402165"
   )
   void method5272() {
      this.field3608 = class289.field3633;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-818055706"
   )
   public final boolean method5266() {
      if(this.field3608 == class289.field3633) {
         this.method5264();
      }

      return this.field3608 == class289.field3631;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1286872736"
   )
   void method5264() {
      this.field3608 = DState.friendManager.friendContainer.isMember(super.name)?class289.field3631:class289.field3634;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-47"
   )
   void method5273() {
      this.field3609 = class289.field3633;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "924663410"
   )
   public final boolean method5267() {
      if(this.field3609 == class289.field3633) {
         this.method5268();
      }

      return this.field3609 == class289.field3631;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1219918340"
   )
   void method5268() {
      this.field3609 = DState.friendManager.ignoreContainer.isMember(super.name)?class289.field3631:class289.field3634;
   }
}
