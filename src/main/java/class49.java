import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class49 extends class207 {
   @ObfuscatedName("r")
   public static class196 field1100 = new class196(64);
   @ObfuscatedName("g")
   static class170 field1101;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1009541813
   )
   public int field1102;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -204538203
   )
   public int field1104 = 255;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 48203405
   )
   public int field1105 = 255;
   @ObfuscatedName("l")
   public static class170 field1106;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -412912093
   )
   public int field1107 = 1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 238800571
   )
   public int field1108 = 70;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 861759831
   )
   int field1109 = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1712785745
   )
   public int field1110 = 30;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1164188901
   )
   public int field1111 = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1165901679
   )
   int field1112 = -1;
   @ObfuscatedName("s")
   static class170 field1113;
   @ObfuscatedName("e")
   static class196 field1115 = new class196(64);

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lclass122;S)V",
      garbageValue = "-21185"
   )
   public void method1036(class122 var1) {
      while(true) {
         int var2 = var1.method2633();
         if(var2 == 0) {
            return;
         }

         this.method1037(var1, var2);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lclass122;II)V",
      garbageValue = "2123724797"
   )
   void method1037(class122 var1, int var2) {
      if(var2 == 1) {
         var1.method2635();
      } else if(var2 == 2) {
         this.field1104 = var1.method2633();
      } else if(var2 == 3) {
         this.field1105 = var1.method2633();
      } else if(var2 == 4) {
         this.field1111 = 0;
      } else if(var2 == 5) {
         this.field1108 = var1.method2635();
      } else if(var2 == 6) {
         var1.method2633();
      } else if(var2 == 7) {
         this.field1109 = var1.method2698();
      } else if(var2 == 8) {
         this.field1112 = var1.method2698();
      } else if(var2 == 11) {
         this.field1111 = var1.method2635();
      } else if(var2 == 14) {
         this.field1110 = var1.method2633();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Lclass81;",
      garbageValue = "1448829126"
   )
   public class81 method1039() {
      if(this.field1112 < 0) {
         return null;
      } else {
         class81 var1 = (class81)field1115.method3905((long)this.field1112);
         if(null != var1) {
            return var1;
         } else {
            var1 = class32.method699(field1101, this.field1112, 0);
            if(var1 != null) {
               field1115.method3907(var1, (long)this.field1112);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "1183413849"
   )
   static void method1048(int var0, String var1) {
      int var2 = class34.field783;
      int[] var3 = class34.field784;
      boolean var4 = false;

      for(int var5 = 0; var5 < var2; ++var5) {
         class2 var6 = client.field302[var3[var5]];
         if(null != var6 && var6 != class3.field65 && var6.field58 != null && var6.field58.equalsIgnoreCase(var1)) {
            if(var0 == 1) {
               client.field337.method2903(82);
               client.field337.method2783(0);
               client.field337.method2668(var3[var5]);
            } else if(var0 == 4) {
               client.field337.method2903(160);
               client.field337.method2657(0);
               client.field337.method2668(var3[var5]);
            } else if(var0 == 6) {
               client.field337.method2903(201);
               client.field337.method2619(var3[var5]);
               client.field337.method2657(0);
            } else if(var0 == 7) {
               client.field337.method2903(120);
               client.field337.method2658(0);
               client.field337.method2666(var3[var5]);
            }

            var4 = true;
            break;
         }
      }

      if(!var4) {
         class78.method1721(4, "", "Unable to find " + var1);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Lclass81;",
      garbageValue = "-90"
   )
   public class81 method1053() {
      if(this.field1109 < 0) {
         return null;
      } else {
         class81 var1 = (class81)field1115.method3905((long)this.field1109);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class32.method699(field1101, this.field1109, 0);
            if(null != var1) {
               field1115.method3907(var1, (long)this.field1109);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2053458156"
   )
   public static void method1056() {
      class59.field1266.method3754();
      class186.field3010 = 1;
      class111.field1970 = null;
   }
}
