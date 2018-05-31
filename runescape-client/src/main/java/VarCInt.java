import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("VarCInt")
public class VarCInt extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static IndexDataBase field3258;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static NodeCache field3257;
   @ObfuscatedName("s")
   public boolean field3256;

   static {
      field3257 = new NodeCache(64);
   }

   VarCInt() {
      this.field3256 = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2142685495"
   )
   void method4848(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4839(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1677882054"
   )
   void method4839(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field3256 = true;
      }

   }
}
