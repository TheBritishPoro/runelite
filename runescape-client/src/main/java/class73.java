import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class73 {
   @ObfuscatedName("u")
   static final BigInteger field1039;
   @ObfuscatedName("q")
   static final BigInteger field1044;

   static {
      field1039 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      field1044 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-373456508"
   )
   static int method1799(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 4200) {
         var3 = class69.intStack[--class69.intStackSize];
         class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = TextureProvider.getItemDefinition(var3).name;
         return 1;
      } else {
         int var4;
         ItemComposition var17;
         if(var0 == 4201) {
            class69.intStackSize -= 2;
            var3 = class69.intStack[class69.intStackSize];
            var4 = class69.intStack[class69.intStackSize + 1];
            var17 = TextureProvider.getItemDefinition(var3);
            if(var4 >= 1 && var4 <= 5 && var17.groundActions[var4 - 1] != null) {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var17.groundActions[var4 - 1];
            } else {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            class69.intStackSize -= 2;
            var3 = class69.intStack[class69.intStackSize];
            var4 = class69.intStack[class69.intStackSize + 1];
            var17 = TextureProvider.getItemDefinition(var3);
            if(var4 >= 1 && var4 <= 5 && var17.inventoryActions[var4 - 1] != null) {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var17.inventoryActions[var4 - 1];
            } else {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var3 = class69.intStack[--class69.intStackSize];
            class69.intStack[++class69.intStackSize - 1] = TextureProvider.getItemDefinition(var3).price;
            return 1;
         } else if(var0 == 4204) {
            var3 = class69.intStack[--class69.intStackSize];
            class69.intStack[++class69.intStackSize - 1] = TextureProvider.getItemDefinition(var3).isStackable == 1?1:0;
            return 1;
         } else {
            ItemComposition var13;
            if(var0 == 4205) {
               var3 = class69.intStack[--class69.intStackSize];
               var13 = TextureProvider.getItemDefinition(var3);
               if(var13.notedTemplate == -1 && var13.note >= 0) {
                  class69.intStack[++class69.intStackSize - 1] = var13.note;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4206) {
               var3 = class69.intStack[--class69.intStackSize];
               var13 = TextureProvider.getItemDefinition(var3);
               if(var13.notedTemplate >= 0 && var13.note >= 0) {
                  class69.intStack[++class69.intStackSize - 1] = var13.note;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4207) {
               var3 = class69.intStack[--class69.intStackSize];
               class69.intStack[++class69.intStackSize - 1] = TextureProvider.getItemDefinition(var3).isMembers?1:0;
               return 1;
            } else if(var0 == 4208) {
               var3 = class69.intStack[--class69.intStackSize];
               var13 = TextureProvider.getItemDefinition(var3);
               if(var13.placeholderTemplateId == -1 && var13.placeholderId >= 0) {
                  class69.intStack[++class69.intStackSize - 1] = var13.placeholderId;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4209) {
               var3 = class69.intStack[--class69.intStackSize];
               var13 = TextureProvider.getItemDefinition(var3);
               if(var13.placeholderTemplateId >= 0 && var13.placeholderId >= 0) {
                  class69.intStack[++class69.intStackSize - 1] = var13.placeholderId;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4210) {
               String var14 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
               var4 = class69.intStack[--class69.intStackSize];
               boolean var6 = var4 == 1;
               String var5 = var14.toLowerCase();
               short[] var7 = new short[16];
               int var8 = 0;
               int var9 = 0;

               while(true) {
                  if(var9 >= ChatLineBuffer.field1212) {
                     WorldMapType2.field231 = var7;
                     WidgetNode.field495 = 0;
                     class126.field1778 = var8;
                     String[] var15 = new String[class126.field1778];

                     for(int var16 = 0; var16 < class126.field1778; ++var16) {
                        var15[var16] = TextureProvider.getItemDefinition(var7[var16]).name;
                     }

                     DecorativeObject.method3100(var15, WorldMapType2.field231);
                     break;
                  }

                  ItemComposition var10 = TextureProvider.getItemDefinition(var9);
                  if((!var6 || var10.isTradable) && var10.notedTemplate == -1 && var10.name.toLowerCase().indexOf(var5) != -1) {
                     if(var8 >= 250) {
                        class126.field1778 = -1;
                        WorldMapType2.field231 = null;
                        break;
                     }

                     if(var8 >= var7.length) {
                        short[] var11 = new short[var7.length * 2];

                        for(int var12 = 0; var12 < var8; ++var12) {
                           var11[var12] = var7[var12];
                        }

                        var7 = var11;
                     }

                     var7[var8++] = (short)var9;
                  }

                  ++var9;
               }

               class69.intStack[++class69.intStackSize - 1] = class126.field1778;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  WidgetNode.field495 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(WorldMapType2.field231 != null && WidgetNode.field495 < class126.field1778) {
                  class69.intStack[++class69.intStackSize - 1] = WorldMapType2.field231[++WidgetNode.field495 - 1] & '\uffff';
               } else {
                  class69.intStack[++class69.intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
