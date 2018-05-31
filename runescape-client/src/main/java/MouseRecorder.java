import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("fx")
   @ObfuscatedGetter(
      intValue = -245212773
   )
   static int field524;
   @ObfuscatedName("z")
   @Export("isRunning")
   boolean isRunning;
   @ObfuscatedName("w")
   @Export("lock")
   Object lock;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 139404487
   )
   @Export("index")
   int index;
   @ObfuscatedName("l")
   @Export("xs")
   int[] xs;
   @ObfuscatedName("u")
   @Export("ys")
   int[] ys;

   MouseRecorder() {
      this.isRunning = true;
      this.lock = new Object();
      this.index = 0;
      this.xs = new int[500];
      this.ys = new int[500];
   }

   public void run() {
      for(; this.isRunning; Actor.method1539(50L)) {
         Object var1 = this.lock;
         synchronized(this.lock) {
            if(this.index < 500) {
               this.xs[this.index] = MouseInput.mouseLastX;
               this.ys[this.index] = MouseInput.mouseLastY * 673804999;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lib;",
      garbageValue = "-1295663391"
   )
   @Export("getSpotAnimType")
   public static Spotanim getSpotAnimType(int var0) {
      Spotanim var1 = (Spotanim)Spotanim.spotanims.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Spotanim.SpotAnimationDefinition_indexCache.getConfigData(13, var0);
         var1 = new Spotanim();
         var1.id = var0;
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         Spotanim.spotanims.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-332860398"
   )
   static int method1034(int var0, Script var1, boolean var2) {
      String var3;
      int var4;
      if(var0 == 4100) {
         var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
         var4 = class69.intStack[--class69.intStackSize];
         class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3 + var4;
         return 1;
      } else {
         String var27;
         if(var0 == 4101) {
            WidgetNode.scriptStringStackSize -= 2;
            var3 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
            var27 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3 + var27;
            return 1;
         } else {
            int var26;
            if(var0 == 4102) {
               var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
               var4 = class69.intStack[--class69.intStackSize];
               String[] var5 = class69.scriptStringStack;
               var26 = ++WidgetNode.scriptStringStackSize - 1;
               String var8;
               if(var4 < 0) {
                  var8 = Integer.toString(var4);
               } else {
                  int var10 = var4;
                  String var9;
                  if(var4 < 0) {
                     var9 = Integer.toString(var4, 10);
                  } else {
                     int var11 = 2;

                     for(int var12 = var4 / 10; var12 != 0; ++var11) {
                        var12 /= 10;
                     }

                     char[] var13 = new char[var11];
                     var13[0] = '+';

                     for(int var14 = var11 - 1; var14 > 0; --var14) {
                        int var15 = var10;
                        var10 /= 10;
                        int var16 = var15 - var10 * 10;
                        if(var16 >= 10) {
                           var13[var14] = (char)(var16 + 87);
                        } else {
                           var13[var14] = (char)(var16 + 48);
                        }
                     }

                     var9 = new String(var13);
                  }

                  var8 = var9;
               }

               var5[var26] = var3 + var8;
               return 1;
            } else if(var0 == 4103) {
               var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.toLowerCase();
               return 1;
            } else {
               int var18;
               if(var0 == 4104) {
                  var18 = class69.intStack[--class69.intStackSize];
                  long var19 = 86400000L * ((long)var18 + 11745L);
                  class69.field1007.setTime(new Date(var19));
                  var26 = class69.field1007.get(5);
                  int var29 = class69.field1007.get(2);
                  int var22 = class69.field1007.get(1);
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var26 + "-" + class69.field998[var29] + "-" + var22;
                  return 1;
               } else if(var0 == 4105) {
                  WidgetNode.scriptStringStackSize -= 2;
                  var3 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
                  var27 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
                  if(class138.localPlayer.composition != null && class138.localPlayer.composition.isFemale) {
                     class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var27;
                  } else {
                     class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3;
                  }

                  return 1;
               } else if(var0 == 4106) {
                  var18 = class69.intStack[--class69.intStackSize];
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = Integer.toString(var18);
                  return 1;
               } else if(var0 == 4107) {
                  WidgetNode.scriptStringStackSize -= 2;
                  int[] var25 = class69.intStack;
                  var4 = ++class69.intStackSize - 1;
                  var26 = class155.method3269(class69.scriptStringStack[WidgetNode.scriptStringStackSize], class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1], Client.languageId);
                  byte var31;
                  if(var26 > 0) {
                     var31 = 1;
                  } else if(var26 < 0) {
                     var31 = -1;
                  } else {
                     var31 = 0;
                  }

                  var25[var4] = var31;
                  return 1;
               } else {
                  Font var7;
                  int var23;
                  byte[] var24;
                  if(var0 == 4108) {
                     var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     class69.intStackSize -= 2;
                     var4 = class69.intStack[class69.intStackSize];
                     var23 = class69.intStack[class69.intStackSize + 1];
                     var24 = class50.indexCache13.getConfigData(var23, 0);
                     var7 = new Font(var24);
                     class69.intStack[++class69.intStackSize - 1] = var7.method5520(var3, var4);
                     return 1;
                  } else if(var0 == 4109) {
                     var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     class69.intStackSize -= 2;
                     var4 = class69.intStack[class69.intStackSize];
                     var23 = class69.intStack[class69.intStackSize + 1];
                     var24 = class50.indexCache13.getConfigData(var23, 0);
                     var7 = new Font(var24);
                     class69.intStack[++class69.intStackSize - 1] = var7.method5519(var3, var4);
                     return 1;
                  } else if(var0 == 4110) {
                     WidgetNode.scriptStringStackSize -= 2;
                     var3 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
                     var27 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
                     if(class69.intStack[--class69.intStackSize] == 1) {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3;
                     } else {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var27;
                     }

                     return 1;
                  } else if(var0 == 4111) {
                     var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = FontTypeFace.appendTags(var3);
                     return 1;
                  } else if(var0 == 4112) {
                     var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                     var4 = class69.intStack[--class69.intStackSize];
                     class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3 + (char)var4;
                     return 1;
                  } else if(var0 == 4113) {
                     var18 = class69.intStack[--class69.intStackSize];
                     class69.intStack[++class69.intStackSize - 1] = class52.method1002((char)var18)?1:0;
                     return 1;
                  } else if(var0 == 4114) {
                     var18 = class69.intStack[--class69.intStackSize];
                     class69.intStack[++class69.intStackSize - 1] = class161.method3362((char)var18)?1:0;
                     return 1;
                  } else {
                     boolean var6;
                     int[] var17;
                     char var21;
                     if(var0 == 4115) {
                        var18 = class69.intStack[--class69.intStackSize];
                        var17 = class69.intStack;
                        var23 = ++class69.intStackSize - 1;
                        var21 = (char)var18;
                        var6 = var21 >= 'A' && var21 <= 'Z' || var21 >= 'a' && var21 <= 'z';
                        var17[var23] = var6?1:0;
                        return 1;
                     } else if(var0 != 4116) {
                        if(var0 == 4117) {
                           var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           if(var3 != null) {
                              class69.intStack[++class69.intStackSize - 1] = var3.length();
                           } else {
                              class69.intStack[++class69.intStackSize - 1] = 0;
                           }

                           return 1;
                        } else if(var0 == 4118) {
                           var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           class69.intStackSize -= 2;
                           var4 = class69.intStack[class69.intStackSize];
                           var23 = class69.intStack[class69.intStackSize + 1];
                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.substring(var4, var23);
                           return 1;
                        } else if(var0 == 4119) {
                           var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           StringBuilder var28 = new StringBuilder(var3.length());
                           boolean var30 = false;

                           for(var26 = 0; var26 < var3.length(); ++var26) {
                              var21 = var3.charAt(var26);
                              if(var21 == '<') {
                                 var30 = true;
                              } else if(var21 == '>') {
                                 var30 = false;
                              } else if(!var30) {
                                 var28.append(var21);
                              }
                           }

                           class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var28.toString();
                           return 1;
                        } else if(var0 == 4120) {
                           var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                           var4 = class69.intStack[--class69.intStackSize];
                           class69.intStack[++class69.intStackSize - 1] = var3.indexOf(var4);
                           return 1;
                        } else if(var0 == 4121) {
                           WidgetNode.scriptStringStackSize -= 2;
                           var3 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
                           var27 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
                           var23 = class69.intStack[--class69.intStackSize];
                           class69.intStack[++class69.intStackSize - 1] = var3.indexOf(var27, var23);
                           return 1;
                        } else {
                           return 2;
                        }
                     } else {
                        var18 = class69.intStack[--class69.intStackSize];
                        var17 = class69.intStack;
                        var23 = ++class69.intStackSize - 1;
                        var21 = (char)var18;
                        var6 = var21 >= '0' && var21 <= '9';
                        var17[var23] = var6?1:0;
                        return 1;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-113"
   )
   public static void method1036() {
      ItemComposition.items.reset();
      ItemComposition.itemModelCache.reset();
      ItemComposition.itemSpriteCache.reset();
   }
}
