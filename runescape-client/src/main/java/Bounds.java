import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Bounds")
public class Bounds {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 314571957
   )
   public int field3746;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -107586563
   )
   public int field3743;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1771158899
   )
   public int field3747;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2007958137
   )
   public int field3745;

   public Bounds(int var1, int var2, int var3, int var4) {
      this.method5679(var1, var2);
      this.method5680(var3, var4);
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1588913620"
   )
   public void method5679(int var1, int var2) {
      this.field3746 = var1;
      this.field3743 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-997918539"
   )
   public void method5680(int var1, int var2) {
      this.field3747 = var1;
      this.field3745 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lkg;Lkg;I)V",
      garbageValue = "1253988141"
   )
   public void method5681(Bounds var1, Bounds var2) {
      this.method5682(var1, var2);
      this.method5683(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lkg;Lkg;B)V",
      garbageValue = "-2"
   )
   void method5682(Bounds var1, Bounds var2) {
      var2.field3746 = this.field3746;
      var2.field3747 = this.field3747;
      if(this.field3746 < var1.field3746) {
         var2.field3747 -= var1.field3746 - this.field3746;
         var2.field3746 = var1.field3746;
      }

      if(var2.method5684() > var1.method5684()) {
         var2.field3747 -= var2.method5684() - var1.method5684();
      }

      if(var2.field3747 < 0) {
         var2.field3747 = 0;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lkg;Lkg;I)V",
      garbageValue = "-1807714345"
   )
   void method5683(Bounds var1, Bounds var2) {
      var2.field3743 = this.field3743;
      var2.field3745 = this.field3745;
      if(this.field3743 < var1.field3743) {
         var2.field3745 -= var1.field3743 - this.field3743;
         var2.field3743 = var1.field3743;
      }

      if(var2.method5685() > var1.method5685()) {
         var2.field3745 -= var2.method5685() - var1.method5685();
      }

      if(var2.field3745 < 0) {
         var2.field3745 = 0;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-33"
   )
   int method5684() {
      return this.field3746 + this.field3747;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1611748891"
   )
   int method5685() {
      return this.field3743 + this.field3745;
   }

   public String toString() {
      return null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "95"
   )
   public static void method5697() {
      class313.classInfos = new CombatInfoList();
   }
}
