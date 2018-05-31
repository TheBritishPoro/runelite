import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("Name")
public class Name implements Comparable {
   @ObfuscatedName("z")
   @Export("name")
   String name;
   @ObfuscatedName("w")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Llm;)V"
   )
   public Name(String var1, JagexLoginType var2) {
      this.name = var1;
      String var4;
      if(var1 == null) {
         var4 = null;
      } else {
         int var5 = 0;

         int var6;
         boolean var7;
         char var8;
         for(var6 = var1.length(); var5 < var6; ++var5) {
            var8 = var1.charAt(var5);
            var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
            if(!var7) {
               break;
            }
         }

         while(var6 > var5) {
            var8 = var1.charAt(var6 - 1);
            var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
            if(!var7) {
               break;
            }

            --var6;
         }

         int var17 = var6 - var5;
         if(var17 >= 1 && var17 <= class8.method84(var2)) {
            StringBuilder var15 = new StringBuilder(var17);

            for(int var9 = var5; var9 < var6; ++var9) {
               char var10 = var1.charAt(var9);
               boolean var11;
               if(Character.isISOControl(var10)) {
                  var11 = false;
               } else if(class161.method3362(var10)) {
                  var11 = true;
               } else {
                  char[] var16 = class302.field3719;
                  int var13 = 0;

                  label79:
                  while(true) {
                     char var14;
                     if(var13 >= var16.length) {
                        var16 = class302.field3717;

                        for(var13 = 0; var13 < var16.length; ++var13) {
                           var14 = var16[var13];
                           if(var14 == var10) {
                              var11 = true;
                              break label79;
                           }
                        }

                        var11 = false;
                        break;
                     }

                     var14 = var16[var13];
                     if(var14 == var10) {
                        var11 = true;
                        break;
                     }

                     ++var13;
                  }
               }

               if(var11) {
                  char var12 = class250.method4770(var10);
                  if(var12 != 0) {
                     var15.append(var12);
                  }
               }
            }

            if(var15.length() == 0) {
               var4 = null;
            } else {
               var4 = var15.toString();
            }
         } else {
            var4 = null;
         }
      }

      this.cleanName = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-39"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "777472606"
   )
   @Export("isCleanNameValid")
   public boolean isCleanNameValid() {
      return this.cleanName != null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lkm;I)I",
      garbageValue = "915724174"
   )
   @Export("compareCleanName")
   public int compareCleanName(Name var1) {
      return this.cleanName == null?(var1.cleanName == null?0:1):(var1.cleanName == null?-1:this.cleanName.compareTo(var1.cleanName));
   }

   public boolean equals(Object var1) {
      if(var1 instanceof Name) {
         Name var2 = (Name)var1;
         return this.cleanName == null?var2.cleanName == null:(var2.cleanName == null?false:(this.hashCode() != var2.hashCode()?false:this.cleanName.equals(var2.cleanName)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.cleanName == null?0:this.cleanName.hashCode();
   }

   public String toString() {
      return this.getName();
   }

   public int compareTo(Object var1) {
      return this.compareCleanName((Name)var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CB)C",
      garbageValue = "-41"
   )
   static char method5450(char var0) {
      return var0 != 181 && var0 != 131?Character.toTitleCase(var0):var0;
   }
}
