import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("VarCString")
public class VarCString extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field3264;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static NodeCache field3260;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1654146755
   )
   static int field3259;
   @ObfuscatedName("s")
   public boolean field3261;

   static {
      field3260 = new NodeCache(64);
   }

   VarCString() {
      this.field3261 = false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "75"
   )
   void method4852(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4854(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "1000"
   )
   void method4854(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field3261 = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;I)V",
      garbageValue = "-1839091252"
   )
   public static void method4851(IndexDataBase var0, IndexDataBase var1) {
      KitDefinition.identKit_ref = var0;
      KitDefinition.field3290 = var1;
      KitDefinition.field3294 = KitDefinition.identKit_ref.fileCount(3);
   }
}
