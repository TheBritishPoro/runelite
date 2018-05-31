import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class13 {
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("slFlagSprites")
   static IndexedSprite[] slFlagSprites;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = -1440413395
   )
   @Export("plane")
   static int plane;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = 1699850059
   )
   @Export("selectedItemIndex")
   static int selectedItemIndex;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1337486339
   )
   int field83;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   Coordinates field88;

   @ObfuscatedSignature(
      signature = "(ILha;)V"
   )
   class13(int var1, Coordinates var2) {
      this.field83 = var1;
      this.field88 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lly;",
      garbageValue = "2135043627"
   )
   @Export("getIndexedSprites")
   public static IndexedSprite[] getIndexedSprites(IndexDataBase var0, String var1, String var2) {
      int var3 = var0.getFile(var1);
      int var4 = var0.getChild(var3, var2);
      return class21.method278(var0, var3, var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;S)Z",
      garbageValue = "-4835"
   )
   static boolean method112(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!class45.field379.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if(var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Object var3 = class41.method700(class45.field378, var2, new Object[]{(new URL(class45.field378.getCodeBase(), var0)).toString()});
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class45.field378.getAppletContext().showDocument(new URL(class45.field378.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            class41.method702(class45.field378, "loggedout");
         } catch (Throwable var9) {
            ;
         }

         try {
            class45.field378.getAppletContext().showDocument(new URL(class45.field378.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILce;ZS)I",
      garbageValue = "12509"
   )
   static int method111(int var0, Script var1, boolean var2) {
      Widget var3 = class26.getWidget(class69.intStack[--class69.intStackSize]);
      if(var0 == 2600) {
         class69.intStack[++class69.intStackSize - 1] = var3.scrollX;
         return 1;
      } else if(var0 == 2601) {
         class69.intStack[++class69.intStackSize - 1] = var3.scrollY;
         return 1;
      } else if(var0 == 2602) {
         class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.text;
         return 1;
      } else if(var0 == 2603) {
         class69.intStack[++class69.intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if(var0 == 2604) {
         class69.intStack[++class69.intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if(var0 == 2605) {
         class69.intStack[++class69.intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if(var0 == 2606) {
         class69.intStack[++class69.intStackSize - 1] = var3.rotationX;
         return 1;
      } else if(var0 == 2607) {
         class69.intStack[++class69.intStackSize - 1] = var3.rotationY;
         return 1;
      } else if(var0 == 2608) {
         class69.intStack[++class69.intStackSize - 1] = var3.rotationZ;
         return 1;
      } else if(var0 == 2609) {
         class69.intStack[++class69.intStackSize - 1] = var3.opacity;
         return 1;
      } else if(var0 == 2610) {
         class69.intStack[++class69.intStackSize - 1] = var3.field2608;
         return 1;
      } else if(var0 == 2611) {
         class69.intStack[++class69.intStackSize - 1] = var3.textColor;
         return 1;
      } else if(var0 == 2612) {
         class69.intStack[++class69.intStackSize - 1] = var3.field2631;
         return 1;
      } else if(var0 == 2613) {
         class69.intStack[++class69.intStackSize - 1] = var3.field2701.rsOrdinal();
         return 1;
      } else if(var0 == 2614) {
         class69.intStack[++class69.intStackSize - 1] = var3.field2726?1:0;
         return 1;
      } else {
         return 2;
      }
   }
}
