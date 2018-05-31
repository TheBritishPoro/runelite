import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class280 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -2788066611507117795L
   )
   long field3599;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -9141763007911040395L
   )
   long field3598;
   @ObfuscatedName("s")
   public boolean field3597;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 7389818107012479155L
   )
   long field3600;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = 5136999404285714875L
   )
   long field3601;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -6017885431335410913L
   )
   long field3602;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1130447619
   )
   int field3604;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 866548259
   )
   int field3603;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -646636543
   )
   int field3605;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1822961763
   )
   int field3606;

   public class280() {
      this.field3599 = -1L;
      this.field3598 = -1L;
      this.field3597 = false;
      this.field3600 = 0L;
      this.field3601 = 0L;
      this.field3602 = 0L;
      this.field3604 = 0;
      this.field3603 = 0;
      this.field3605 = 0;
      this.field3606 = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "92"
   )
   public void method5244() {
      this.field3599 = Buffer.method3547();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-92"
   )
   public void method5262() {
      if(-1L != this.field3599) {
         this.field3601 = Buffer.method3547() - this.field3599;
         this.field3599 = -1L;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2082197473"
   )
   public void method5246(int var1) {
      this.field3598 = Buffer.method3547();
      this.field3604 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-222960010"
   )
   public void method5247() {
      if(this.field3598 != -1L) {
         this.field3600 = Buffer.method3547() - this.field3598;
         this.field3598 = -1L;
      }

      ++this.field3605;
      this.field3597 = true;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-656792455"
   )
   public void method5248() {
      this.field3597 = false;
      this.field3603 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-450246624"
   )
   public void method5249() {
      this.method5247();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "58"
   )
   public void method5245(Buffer var1) {
      long var2 = this.field3601;
      var2 /= 10L;
      if(var2 < 0L) {
         var2 = 0L;
      } else if(var2 > 65535L) {
         var2 = 65535L;
      }

      var1.putShort((int)var2);
      long var4 = this.field3600;
      var4 /= 10L;
      if(var4 < 0L) {
         var4 = 0L;
      } else if(var4 > 65535L) {
         var4 = 65535L;
      }

      var1.putShort((int)var4);
      long var6 = this.field3602;
      var6 /= 10L;
      if(var6 < 0L) {
         var6 = 0L;
      } else if(var6 > 65535L) {
         var6 = 65535L;
      }

      var1.putShort((int)var6);
      var1.putShort(this.field3604);
      var1.putShort(this.field3603);
      var1.putShort(this.field3605);
      var1.putShort(this.field3606);
   }
}
