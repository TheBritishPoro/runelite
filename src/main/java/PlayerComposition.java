import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("z")
   static final int[] field2618;
   @ObfuscatedName("e")
   @Export("colorsToReplace")
   public static short[][] colorsToReplace;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgo;"
   )
   public static NodeCache field2608;
   @ObfuscatedName("x")
   public static short[][] field2614;
   @ObfuscatedName("d")
   public static short[] field2613;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -343234703
   )
   @Export("transformedNpcId")
   public int transformedNpcId;
   @ObfuscatedName("s")
   @Export("bodyPartColours")
   int[] bodyPartColours;
   @ObfuscatedName("q")
   @Export("isFemale")
   public boolean isFemale;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = -4584684847963398125L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("w")
   @Export("equipmentIds")
   int[] equipmentIds;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = 7206291814291552267L
   )
   long field2611;

   static {
      field2618 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field2608 = new NodeCache(260);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "1568048602"
   )
   public void method4030(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.field3347; ++var6) {
               KitDefinition var7 = Huffman.getKitDefinition(var6);
               if(var7 != null && !var7.nonSelectable && var5 + (var3?7:0) == var7.bodyPartId) {
                  var1[field2618[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipmentIds = var1;
      this.bodyPartColours = var2;
      this.isFemale = var3;
      this.transformedNpcId = var4;
      this.setHash();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1826735834"
   )
   @Export("setHash")
   void setHash() {
      long var1 = this.hash;
      int var3 = this.equipmentIds[5];
      int var4 = this.equipmentIds[9];
      this.equipmentIds[5] = var4;
      this.equipmentIds[9] = var3;
      this.hash = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.hash <<= 4;
         if(this.equipmentIds[var5] >= 256) {
            this.hash += (long)(this.equipmentIds[var5] - 256);
         }
      }

      if(this.equipmentIds[0] >= 256) {
         this.hash += (long)(this.equipmentIds[0] - 256 >> 4);
      }

      if(this.equipmentIds[1] >= 256) {
         this.hash += (long)(this.equipmentIds[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.hash <<= 3;
         this.hash += (long)this.bodyPartColours[var5];
      }

      this.hash <<= 1;
      this.hash += (long)(this.isFemale?1:0);
      this.equipmentIds[5] = var3;
      this.equipmentIds[9] = var4;
      if(var1 != 0L && var1 != this.hash) {
         field2608.remove(var1);
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljt;ILjt;II)Leh;",
      garbageValue = "-1119389324"
   )
   public Model method4032(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.transformedNpcId != -1) {
         return class17.getNpcDefinition(this.transformedNpcId).method4728(var1, var2, var3, var4);
      } else {
         long var5 = this.hash;
         int[] var7 = this.equipmentIds;
         if(var1 != null && (var1.leftHandItem >= 0 || var1.rightHandItem >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.equipmentIds[var8];
            }

            if(var1.leftHandItem >= 0) {
               var5 += (long)(var1.leftHandItem - this.equipmentIds[5] << 40);
               var7[5] = var1.leftHandItem;
            }

            if(var1.rightHandItem >= 0) {
               var5 += (long)(var1.rightHandItem - this.equipmentIds[3] << 48);
               var7[3] = var1.rightHandItem;
            }
         }

         Model var15 = (Model)field2608.get(var5);
         if(var15 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !Huffman.getKitDefinition(var11 - 256).ready()) {
                  var9 = true;
               }

               if(var11 >= 512 && !FaceNormal.getItemDefinition(var11 - 512).readyWorn(this.isFemale)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(this.field2611 != -1L) {
                  var15 = (Model)field2608.get(this.field2611);
               }

               if(var15 == null) {
                  return null;
               }
            }

            if(var15 == null) {
               ModelData[] var16 = new ModelData[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  ModelData var14;
                  if(var13 >= 256 && var13 < 512) {
                     var14 = Huffman.getKitDefinition(var13 - 256).getModelData();
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     var14 = FaceNormal.getItemDefinition(var13 - 512).getWornModelData(this.isFemale);
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               ModelData var18 = new ModelData(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.bodyPartColours[var13] < colorsToReplace[var13].length) {
                     var18.recolor(FaceNormal.colorsToFind[var13], colorsToReplace[var13][this.bodyPartColours[var13]]);
                  }

                  if(this.bodyPartColours[var13] < field2614[var13].length) {
                     var18.recolor(field2613[var13], field2614[var13][this.bodyPartColours[var13]]);
                  }
               }

               var15 = var18.light(64, 850, -30, -50, -30);
               field2608.put(var15, var5);
               this.field2611 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var15;
         } else {
            Model var17;
            if(var1 != null && var3 != null) {
               var17 = var1.method4784(var15, var2, var3, var4);
            } else if(var1 != null) {
               var17 = var1.method4779(var15, var2);
            } else {
               var17 = var3.method4779(var15, var4);
            }

            return var17;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldo;",
      garbageValue = "-2108671823"
   )
   ModelData method4033() {
      if(this.transformedNpcId != -1) {
         return class17.getNpcDefinition(this.transformedNpcId).method4752();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipmentIds[var2];
            if(var3 >= 256 && var3 < 512 && !Huffman.getKitDefinition(var3 - 256).method4439()) {
               var1 = true;
            }

            if(var3 >= 512 && !FaceNormal.getItemDefinition(var3 - 512).method4664(this.isFemale)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.equipmentIds[var4];
               ModelData var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = Huffman.getKitDefinition(var5 - 256).method4455();
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = FaceNormal.getItemDefinition(var5 - 512).method4677(this.isFemale);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.bodyPartColours[var5] < colorsToReplace[var5].length) {
                  var8.recolor(FaceNormal.colorsToFind[var5], colorsToReplace[var5][this.bodyPartColours[var5]]);
               }

               if(this.bodyPartColours[var5] < field2614[var5].length) {
                  var8.recolor(field2613[var5], field2614[var5][this.bodyPartColours[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int method4034() {
      return this.transformedNpcId == -1?(this.equipmentIds[0] << 15) + this.equipmentIds[1] + (this.equipmentIds[11] << 5) + (this.equipmentIds[8] << 10) + (this.bodyPartColours[0] << 25) + (this.bodyPartColours[4] << 20):305419896 + class17.getNpcDefinition(this.transformedNpcId).id;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-413325180"
   )
   public void method4029(int var1, boolean var2) {
      if(var1 != 1 || !this.isFemale) {
         int var3 = this.equipmentIds[field2618[var1]];
         if(var3 != 0) {
            var3 -= 256;

            KitDefinition var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = KitDefinition.field3347 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= KitDefinition.field3347) {
                     var3 = 0;
                  }
               }

               var4 = Huffman.getKitDefinition(var3);
            } while(var4 == null || var4.nonSelectable || var4.bodyPartId != var1 + (this.isFemale?7:0));

            this.equipmentIds[field2618[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-1729210520"
   )
   public void method4056(int var1, boolean var2) {
      int var3 = this.bodyPartColours[var1];
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = colorsToReplace[var1].length - 1;
            }
         } while(!GroundObject.method2540(var1, var3));
      } else {
         do {
            ++var3;
            if(var3 >= colorsToReplace[var1].length) {
               var3 = 0;
            }
         } while(!GroundObject.method2540(var1, var3));
      }

      this.bodyPartColours[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "944009750"
   )
   public void method4044(boolean var1) {
      if(this.isFemale != var1) {
         this.method4030((int[])null, this.bodyPartColours, var1, -1);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lfz;I)V",
      garbageValue = "-1358202712"
   )
   public void method4042(Buffer var1) {
      var1.putByte(this.isFemale?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipmentIds[field2618[var2]];
         if(var3 == 0) {
            var1.putByte(-1);
         } else {
            var1.putByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.putByte(this.bodyPartColours[var2]);
      }

   }
}
