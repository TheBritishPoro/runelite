import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public final class class68 extends Node {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Deque field985;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = -884199663
   )
   @Export("port2")
   static int port2;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 510585237
   )
   int field984;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1464678261
   )
   int field989;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1060604171
   )
   int field981;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2012590697
   )
   int field988;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2028898983
   )
   int field983;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2130308981
   )
   int field992;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 143905457
   )
   int field991;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 481090733
   )
   int field987;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lcm;"
   )
   class103 field993;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1298002913
   )
   int field982;
   @ObfuscatedName("b")
   int[] field986;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 366883801
   )
   int field990;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcm;"
   )
   class103 field980;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ljj;"
   )
   ObjectComposition field994;

   static {
      field985 = new Deque();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-73"
   )
   void method1688() {
      int var1 = this.field987;
      ObjectComposition var2 = this.field994.getImpostor();
      if(var2 != null) {
         this.field987 = var2.ambientSoundId;
         this.field991 = var2.int4 * 128;
         this.field989 = var2.int5;
         this.field982 = var2.int6;
         this.field986 = var2.field3417;
      } else {
         this.field987 = -1;
         this.field991 = 0;
         this.field989 = 0;
         this.field982 = 0;
         this.field986 = null;
      }

      if(var1 != this.field987 && this.field993 != null) {
         MapIconReference.field310.method2009(this.field993);
         this.field993 = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lbo;I)V",
      garbageValue = "-1000206687"
   )
   public static void method1696(ScriptEvent var0) {
      class309.runScript(var0, 500000);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "53"
   )
   @Export("parseInt")
   public static int parseInt(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(var8 == '-') {
                  var3 = true;
                  continue;
               }

               if(var8 == '+') {
                  continue;
               }
            }

            int var10;
            if(var8 >= '0' && var8 <= '9') {
               var10 = var8 - '0';
            } else if(var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - '7';
            } else {
               if(var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 'W';
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1978013754"
   )
   public static void method1698() {
      Widget.widgetSpriteCache.reset();
      Widget.Widget_cachedModels.reset();
      Widget.Widget_cachedFonts.reset();
      Widget.field2602.reset();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "-1337565581"
   )
   public static final void method1697(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= 48000) {
         AbstractSoundSystem.sampleRate = var0;
         AbstractSoundSystem.audioHighMemory = var1;
         WorldMapType2.field230 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
