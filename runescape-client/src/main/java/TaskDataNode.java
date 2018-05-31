import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("TaskDataNode")
public abstract class TaskDataNode extends Node {
   @ObfuscatedName("w")
   volatile boolean field1385;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   TaskDataNode field1382;
   @ObfuscatedName("t")
   int field1384;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ldg;"
   )
   @Export("data")
   AbstractIntegerNode0 data;

   protected TaskDataNode() {
      this.field1385 = true;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected abstract TaskDataNode vmethod4382();

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected abstract TaskDataNode vmethod4389();

   @ObfuscatedName("x")
   protected abstract int vmethod4395();

   @ObfuscatedName("e")
   protected abstract void vmethod4385(int[] var1, int var2, int var3);

   @ObfuscatedName("b")
   protected abstract void vmethod4386(int var1);

   @ObfuscatedName("ax")
   int vmethod2435() {
      return 255;
   }

   @ObfuscatedName("fg")
   final void method2439(int[] var1, int var2, int var3) {
      if(this.field1385) {
         this.vmethod4385(var1, var2, var3);
      } else {
         this.vmethod4386(var3);
      }

   }
}
