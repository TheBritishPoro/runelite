import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class264 extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static IndexDataBase field3327;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3328;
   @ObfuscatedName("s")
   char field3331;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 916691841
   )
   public int field3330;
   @ObfuscatedName("u")
   public String field3333;
   @ObfuscatedName("q")
   boolean field3332;

   static {
      field3328 = new NodeCache(64);
   }

   class264() {
      this.field3332 = true;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "99"
   )
   void method4954() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-16"
   )
   void method4948(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4950(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "-29"
   )
   void method4950(Buffer var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.readByte();
         int var5 = var4 & 255;
         if(var5 == 0) {
            throw new IllegalArgumentException("");
         }

         if(var5 >= 128 && var5 < 160) {
            char var6 = class301.cp1252AsciiExtension[var5 - 128];
            if(var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field3331 = var3;
      } else if(var2 == 2) {
         this.field3330 = var1.readInt();
      } else if(var2 == 4) {
         this.field3332 = false;
      } else if(var2 == 5) {
         this.field3333 = var1.readString();
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1271827872"
   )
   public boolean method4951() {
      return this.field3331 == 's';
   }
}
