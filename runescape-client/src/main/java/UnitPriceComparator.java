import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
@Implements("UnitPriceComparator")
final class UnitPriceComparator implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "43"
   )
   int method58(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.price < var2.grandExchangeOffer.price?-1:(var2.grandExchangeOffer.price == var1.grandExchangeOffer.price?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method58((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "53"
   )
   @Export("processClientError")
   public static void processClientError(String var0, Throwable var1) {
      if(var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if(var1 != null) {
               Throwable var4 = var1;
               String var5;
               if(var1 instanceof RunException) {
                  RunException var6 = (RunException)var1;
                  var5 = var6.field1941 + " | ";
                  var4 = var6.parent;
               } else {
                  var5 = "";
               }

               StringWriter var18 = new StringWriter();
               PrintWriter var7 = new PrintWriter(var18);
               var4.printStackTrace(var7);
               var7.close();
               String var8 = var18.toString();
               BufferedReader var9 = new BufferedReader(new StringReader(var8));
               String var10 = var9.readLine();

               label63:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if(var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label63;
                     }

                     int var12 = var11.indexOf(40);
                     int var13 = var11.indexOf(41, var12 + 1);
                     if(var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if(var15 >= 0) {
                           var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                           var5 = var5 + var14 + ' ';
                           continue;
                        }

                        var11 = var11.substring(0, var12);
                     }

                     var11 = var11.trim();
                     var11 = var11.substring(var11.lastIndexOf(32) + 1);
                     var11 = var11.substring(var11.lastIndexOf(9) + 1);
                     var5 = var5 + var11 + ' ';
                  }
               }
            }

            if(var0 != null) {
               if(var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if(RunException.field1938 == null) {
               return;
            }

            URL var3 = new URL(RunException.field1938.getCodeBase(), "clienterror.ws?c=" + GameCanvas.revision + "&u=" + RunException.field1939 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&ct=" + RunException.field1940 + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
            ;
         }

      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "116"
   )
   static int method59(int var0, Script var1, boolean var2) {
      if(var0 == 6500) {
         class69.intStack[++class69.intStackSize - 1] = GrandExchangeOffer.loadWorlds()?1:0;
         return 1;
      } else {
         World var3;
         if(var0 == 6501) {
            World.field944 = 0;
            var3 = class236.method4592();
            if(var3 != null) {
               class69.intStack[++class69.intStackSize - 1] = var3.id;
               class69.intStack[++class69.intStackSize - 1] = var3.mask;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.activity;
               class69.intStack[++class69.intStackSize - 1] = var3.location;
               class69.intStack[++class69.intStackSize - 1] = var3.playerCount;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.address;
            } else {
               class69.intStack[++class69.intStackSize - 1] = -1;
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 6502) {
            var3 = class236.method4592();
            if(var3 != null) {
               class69.intStack[++class69.intStackSize - 1] = var3.id;
               class69.intStack[++class69.intStackSize - 1] = var3.mask;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.activity;
               class69.intStack[++class69.intStackSize - 1] = var3.location;
               class69.intStack[++class69.intStackSize - 1] = var3.playerCount;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.address;
            } else {
               class69.intStack[++class69.intStackSize - 1] = -1;
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.intStack[++class69.intStackSize - 1] = 0;
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else {
            World var4;
            int var5;
            int var11;
            if(var0 == 6506) {
               var11 = class69.intStack[--class69.intStackSize];
               var4 = null;

               for(var5 = 0; var5 < World.worldCount; ++var5) {
                  if(var11 == World.worldList[var5].id) {
                     var4 = World.worldList[var5];
                     break;
                  }
               }

               if(var4 != null) {
                  class69.intStack[++class69.intStackSize - 1] = var4.id;
                  class69.intStack[++class69.intStackSize - 1] = var4.mask;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var4.activity;
                  class69.intStack[++class69.intStackSize - 1] = var4.location;
                  class69.intStack[++class69.intStackSize - 1] = var4.playerCount;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var4.address;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = -1;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 6507) {
               class69.intStackSize -= 4;
               var11 = class69.intStack[class69.intStackSize];
               boolean var15 = class69.intStack[class69.intStackSize + 1] == 1;
               var5 = class69.intStack[class69.intStackSize + 2];
               boolean var6 = class69.intStack[class69.intStackSize + 3] == 1;
               if(World.worldList != null) {
                  class120.method2781(0, World.worldList.length - 1, var11, var15, var5, var6);
               }

               return 1;
            } else if(var0 != 6511) {
               if(var0 == 6512) {
                  Client.field725 = class69.intStack[--class69.intStackSize] == 1;
                  return 1;
               } else {
                  int var12;
                  class264 var13;
                  if(var0 == 6513) {
                     class69.intStackSize -= 2;
                     var11 = class69.intStack[class69.intStackSize];
                     var12 = class69.intStack[class69.intStackSize + 1];
                     var13 = class241.method4603(var12);
                     if(var13.method4951()) {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = HorizontalAlignment.getNpcDefinition(var11).method5167(var12, var13.field3333);
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = HorizontalAlignment.getNpcDefinition(var11).method5166(var12, var13.field3330);
                     }

                     return 1;
                  } else if(var0 == 6514) {
                     class69.intStackSize -= 2;
                     var11 = class69.intStack[class69.intStackSize];
                     var12 = class69.intStack[class69.intStackSize + 1];
                     var13 = class241.method4603(var12);
                     if(var13.method4951()) {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = FileOnDisk.getObjectDefinition(var11).method5036(var12, var13.field3333);
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = FileOnDisk.getObjectDefinition(var11).method5035(var12, var13.field3330);
                     }

                     return 1;
                  } else if(var0 == 6515) {
                     class69.intStackSize -= 2;
                     var11 = class69.intStack[class69.intStackSize];
                     var12 = class69.intStack[class69.intStackSize + 1];
                     var13 = class241.method4603(var12);
                     if(var13.method4951()) {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = TextureProvider.getItemDefinition(var11).method5121(var12, var13.field3333);
                     } else {
                        class69.intStack[++class69.intStackSize - 1] = TextureProvider.getItemDefinition(var11).method5099(var12, var13.field3330);
                     }

                     return 1;
                  } else if(var0 == 6516) {
                     class69.intStackSize -= 2;
                     var11 = class69.intStack[class69.intStackSize];
                     var12 = class69.intStack[class69.intStackSize + 1];
                     var13 = class241.method4603(var12);
                     int var7;
                     class265 var8;
                     class265 var9;
                     byte[] var10;
                     if(var13.method4951()) {
                        String[] var14 = class69.scriptStringStack;
                        var7 = ++WidgetNode.scriptStringStackSize - 1;
                        var9 = (class265)class265.field3334.get((long)var11);
                        if(var9 != null) {
                           var8 = var9;
                        } else {
                           var10 = class7.field42.getConfigData(34, var11);
                           var9 = new class265();
                           if(var10 != null) {
                              var9.method4960(new Buffer(var10));
                           }

                           var9.method4961();
                           class265.field3334.put(var9, (long)var11);
                           var8 = var9;
                        }

                        var14[var7] = var8.method4963(var12, var13.field3333);
                     } else {
                        int[] var16 = class69.intStack;
                        var7 = ++class69.intStackSize - 1;
                        var9 = (class265)class265.field3334.get((long)var11);
                        if(var9 != null) {
                           var8 = var9;
                        } else {
                           var10 = class7.field42.getConfigData(34, var11);
                           var9 = new class265();
                           if(var10 != null) {
                              var9.method4960(new Buffer(var10));
                           }

                           var9.method4961();
                           class265.field3334.put(var9, (long)var11);
                           var8 = var9;
                        }

                        var16[var7] = var8.method4962(var12, var13.field3330);
                     }

                     return 1;
                  } else if(var0 == 6518) {
                     class69.intStack[++class69.intStackSize - 1] = Client.field588?1:0;
                     return 1;
                  } else if(var0 == 6520) {
                     return 1;
                  } else if(var0 == 6521) {
                     return 1;
                  } else if(var0 == 6522) {
                     --WidgetNode.scriptStringStackSize;
                     --class69.intStackSize;
                     return 1;
                  } else if(var0 == 6523) {
                     --WidgetNode.scriptStringStackSize;
                     --class69.intStackSize;
                     return 1;
                  } else if(var0 == 6524) {
                     class69.intStack[++class69.intStackSize - 1] = -1;
                     return 1;
                  } else if(var0 == 6525) {
                     class69.intStack[++class69.intStackSize - 1] = 1;
                     return 1;
                  } else if(var0 == 6526) {
                     class69.intStack[++class69.intStackSize - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var11 = class69.intStack[--class69.intStackSize];
               if(var11 >= 0 && var11 < World.worldCount) {
                  var4 = World.worldList[var11];
                  class69.intStack[++class69.intStackSize - 1] = var4.id;
                  class69.intStack[++class69.intStackSize - 1] = var4.mask;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var4.activity;
                  class69.intStack[++class69.intStackSize - 1] = var4.location;
                  class69.intStack[++class69.intStackSize - 1] = var4.playerCount;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var4.address;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = -1;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
