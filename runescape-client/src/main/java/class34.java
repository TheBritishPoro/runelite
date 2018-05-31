import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class34 extends class16 {
   @ObfuscatedName("rx")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   @Export("indexStore255")
   static IndexFile indexStore255;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = -1954811163
   )
   static int field301;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 708492455
   )
   int field299;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 890340593
   )
   int field297;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1440084157
   )
   int field298;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -747624987
   )
   int field296;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1293834661"
   )
   void method561(Buffer var1, Buffer var2) {
      int var3 = var2.readUnsignedByte();
      if(var3 != class25.field209.field211) {
         throw new IllegalStateException("");
      } else {
         super.field120 = var2.readUnsignedByte();
         super.field121 = var2.readUnsignedByte();
         super.field127 = var2.readUnsignedShort();
         super.field117 = var2.readUnsignedShort();
         this.field299 = var2.readUnsignedByte();
         this.field297 = var2.readUnsignedByte();
         super.field118 = var2.readUnsignedShort();
         super.field119 = var2.readUnsignedShort();
         this.field298 = var2.readUnsignedByte();
         this.field296 = var2.readUnsignedByte();
         super.field121 = Math.min(super.field121, 4);
         super.field125 = new short[1][64][64];
         super.field123 = new short[super.field121][64][64];
         super.field124 = new byte[super.field121][64][64];
         super.field116 = new byte[super.field121][64][64];
         super.decorations = new WorldMapDecoration[super.field121][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class24.field204.field205) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            int var6 = var1.readUnsignedByte();
            int var7 = var1.readUnsignedByte();
            if(var4 == super.field118 && var5 == super.field119 && var6 == this.field298 && var7 == this.field296) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     this.method150(var8 + this.field298 * 8, var9 + this.field296 * 8, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1697676286"
   )
   boolean method562(int var1, int var2) {
      return var1 < this.field298 * 8?false:(var2 < this.field296 * 8?false:(var1 >= this.field298 * 8 + 8?false:var2 < this.field296 * 8 + 8));
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   int method584() {
      return this.field299;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-552"
   )
   int method564() {
      return this.field297;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "421563863"
   )
   int method565() {
      return this.field298;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2136604695"
   )
   int method563() {
      return this.field296;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class34)) {
         return false;
      } else {
         class34 var2 = (class34)var1;
         return var2.field118 == super.field118 && super.field119 == var2.field119?var2.field298 == this.field298 && var2.field296 == this.field296:false;
      }
   }

   public int hashCode() {
      return super.field118 | super.field119 << 8 | this.field298 << 16 | this.field296 << 24;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1158823389"
   )
   static void method586() {
      if(class78.Login_isUsernameRemembered && class78.username != null && class78.username.length() > 0) {
         class78.currentLoginField = 1;
      } else {
         class78.currentLoginField = 0;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "-10"
   )
   static final int method560(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "995963221"
   )
   static void method585() {
      if(Client.spellSelected) {
         Widget var0 = class146.getWidgetChild(SoundTaskDataProvider.field361, Client.field736);
         if(var0 != null && var0.onTargetLeaveListener != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.source = var0;
            var1.params = var0.onTargetLeaveListener;
            class68.method1696(var1);
         }

         Client.spellSelected = false;
         Player.method1114(var0);
      }
   }
}
