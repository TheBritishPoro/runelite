import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
public class class320 {
   @ObfuscatedName("q")
   String field3807;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   IndexDataBase field3805;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1352233263
   )
   int field3803;
   @ObfuscatedName("x")
   boolean field3810;

   @ObfuscatedSignature(
      signature = "(Lir;)V"
   )
   class320(IndexDataBase var1) {
      this.field3803 = 0;
      this.field3810 = false;
      this.field3805 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1415895752"
   )
   void method5995(String var1) {
      if(var1 != null && !var1.isEmpty()) {
         if(var1 != this.field3807) {
            this.field3807 = var1;
            this.field3803 = 0;
            this.field3810 = false;
            this.method5985();
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "30"
   )
   int method5985() {
      if(this.field3803 < 25) {
         if(!this.field3805.tryLoadRecordByNames(MapCacheArchiveNames.COMPOSITE_MAP.name, this.field3807)) {
            return this.field3803;
         }

         this.field3803 = 25;
      }

      if(this.field3803 == 25) {
         if(!this.field3805.tryLoadRecordByNames(this.field3807, MapCacheArchiveNames.AREA.name)) {
            return 25 + this.field3805.archiveLoadPercentByName(this.field3807) * 25 / 100;
         }

         this.field3803 = 50;
      }

      if(this.field3803 == 50) {
         if(this.field3805.method4644(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, this.field3807) && !this.field3805.tryLoadRecordByNames(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, this.field3807)) {
            return 50;
         }

         this.field3803 = 75;
      }

      if(this.field3803 == 75) {
         if(!this.field3805.tryLoadRecordByNames(this.field3807, MapCacheArchiveNames.LABELS.name)) {
            return 75;
         }

         this.field3803 = 100;
         this.field3810 = true;
      }

      return this.field3803;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2033116061"
   )
   boolean method5987() {
      return this.field3810;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2104443590"
   )
   int method5988() {
      return this.field3803;
   }
}
