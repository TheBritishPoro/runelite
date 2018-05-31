import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("MilliTimer")
public class MilliTimer extends Timer {
   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      intValue = 692825213
   )
   static int field1928;
   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("headIconsPk")
   static SpritePixels[] headIconsPk;
   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("headIconsHint")
   static SpritePixels[] headIconsHint;
   @ObfuscatedName("z")
   long[] field1922;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1263861109
   )
   int field1920;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1448416021
   )
   @Export("sleepTime")
   int sleepTime;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -5065002419865856429L
   )
   long field1925;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 699699497
   )
   int field1923;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 918453221
   )
   int field1924;

   MilliTimer() {
      this.field1922 = new long[10];
      this.field1920 = 256;
      this.sleepTime = 1;
      this.field1923 = 0;
      this.field1925 = Buffer.method3547();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1922[var1] = this.field1925;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
   )
   public void vmethod3330() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1922[var1] = 0L;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
   )
   public int vmethod3331(int var1, int var2) {
      int var3 = this.field1920;
      int var4 = this.sleepTime;
      this.field1920 = 300;
      this.sleepTime = 1;
      this.field1925 = Buffer.method3547();
      if(0L == this.field1922[this.field1924]) {
         this.field1920 = var3;
         this.sleepTime = var4;
      } else if(this.field1925 > this.field1922[this.field1924]) {
         this.field1920 = (int)((long)(var1 * 2560) / (this.field1925 - this.field1922[this.field1924]));
      }

      if(this.field1920 < 25) {
         this.field1920 = 25;
      }

      if(this.field1920 > 256) {
         this.field1920 = 256;
         this.sleepTime = (int)((long)var1 - (this.field1925 - this.field1922[this.field1924]) / 10L);
      }

      if(this.sleepTime > var1) {
         this.sleepTime = var1;
      }

      this.field1922[this.field1924] = this.field1925;
      this.field1924 = (this.field1924 + 1) % 10;
      int var5;
      if(this.sleepTime > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(this.field1922[var5] != 0L) {
               this.field1922[var5] += (long)this.sleepTime;
            }
         }
      }

      if(this.sleepTime < var2) {
         this.sleepTime = var2;
      }

      Actor.method1539((long)this.sleepTime);

      for(var5 = 0; this.field1923 < 256; this.field1923 += this.field1920) {
         ++var5;
      }

      this.field1923 &= 255;
      return var5;
   }
}
