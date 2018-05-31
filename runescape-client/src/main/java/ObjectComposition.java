import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("ObjectComposition")
public class ObjectComposition extends CacheableNode {
   @ObfuscatedName("z")
   @Export("objectCompositionLowDetail")
   public static boolean objectCompositionLowDetail;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("objects_ref")
   public static IndexDataBase objects_ref;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("objects")
   static NodeCache objects;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field3391;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("cachedModels")
   static NodeCache cachedModels;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static NodeCache field3374;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "[Ldb;"
   )
   static ModelData[] field3375;
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexTextures")
   static IndexData indexTextures;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1656921837
   )
   @Export("id")
   public int id;
   @ObfuscatedName("e")
   @Export("objectModels")
   int[] objectModels;
   @ObfuscatedName("p")
   @Export("objectTypes")
   int[] objectTypes;
   @ObfuscatedName("b")
   @Export("name")
   public String name;
   @ObfuscatedName("n")
   @Export("recolorToFind")
   short[] recolorToFind;
   @ObfuscatedName("f")
   @Export("recolorToReplace")
   short[] recolorToReplace;
   @ObfuscatedName("g")
   @Export("textureToFind")
   short[] textureToFind;
   @ObfuscatedName("m")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 721994233
   )
   @Export("width")
   public int width;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 456178229
   )
   @Export("length")
   public int length;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 148583849
   )
   @Export("clipType")
   public int clipType;
   @ObfuscatedName("y")
   @Export("blocksProjectile")
   public boolean blocksProjectile;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1057444625
   )
   @Export("int1")
   public int int1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 950744915
   )
   @Export("contouredGround")
   int contouredGround;
   @ObfuscatedName("d")
   @Export("nonFlatShading")
   boolean nonFlatShading;
   @ObfuscatedName("h")
   @Export("modelClipped")
   public boolean modelClipped;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 351806005
   )
   @Export("animationId")
   public int animationId;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1502604053
   )
   @Export("decorDisplacement")
   public int decorDisplacement;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 715866131
   )
   @Export("ambient")
   int ambient;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 214580373
   )
   @Export("contrast")
   int contrast;
   @ObfuscatedName("ab")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 850874123
   )
   @Export("mapIconId")
   public int mapIconId;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 234943869
   )
   @Export("mapSceneId")
   public int mapSceneId;
   @ObfuscatedName("as")
   @Export("isRotated")
   boolean isRotated;
   @ObfuscatedName("an")
   @Export("clipped")
   public boolean clipped;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -906006065
   )
   @Export("modelSizeX")
   int modelSizeX;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 514927153
   )
   @Export("modelSizeHeight")
   int modelSizeHeight;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 248486771
   )
   @Export("modelSizeY")
   int modelSizeY;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1517742753
   )
   @Export("offsetX")
   int offsetX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1651974149
   )
   @Export("offsetHeight")
   int offsetHeight;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1857643463
   )
   @Export("offsetY")
   int offsetY;
   @ObfuscatedName("ar")
   @Export("obstructsGround")
   public boolean obstructsGround;
   @ObfuscatedName("au")
   @Export("isHollow")
   boolean isHollow;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1841948515
   )
   @Export("supportItems")
   public int supportItems;
   @ObfuscatedName("al")
   @Export("impostorIds")
   public int[] impostorIds;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2070773273
   )
   @Export("varpId")
   int varpId;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1219242267
   )
   @Export("configId")
   int configId;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -330617759
   )
   @Export("ambientSoundId")
   public int ambientSoundId;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1187149409
   )
   @Export("int4")
   public int int4;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 426053489
   )
   @Export("int5")
   public int int5;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1728385817
   )
   @Export("int6")
   public int int6;
   @ObfuscatedName("am")
   public int[] field3417;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("params")
   IterableHashTable params;

   static {
      objectCompositionLowDetail = false;
      objects = new NodeCache(4096);
      field3391 = new NodeCache(500);
      cachedModels = new NodeCache(30);
      field3374 = new NodeCache(30);
      field3375 = new ModelData[4];
   }

   ObjectComposition() {
      this.name = "null";
      this.width = 1;
      this.length = 1;
      this.clipType = 2;
      this.blocksProjectile = true;
      this.int1 = -1;
      this.contouredGround = -1;
      this.nonFlatShading = false;
      this.modelClipped = false;
      this.animationId = -1;
      this.decorDisplacement = 16;
      this.ambient = 0;
      this.contrast = 0;
      this.actions = new String[5];
      this.mapIconId = -1;
      this.mapSceneId = -1;
      this.isRotated = false;
      this.clipped = true;
      this.modelSizeX = 128;
      this.modelSizeHeight = 128;
      this.modelSizeY = 128;
      this.offsetX = 0;
      this.offsetHeight = 0;
      this.offsetY = 0;
      this.obstructsGround = false;
      this.isHollow = false;
      this.supportItems = -1;
      this.varpId = -1;
      this.configId = -1;
      this.ambientSoundId = -1;
      this.int4 = 0;
      this.int5 = 0;
      this.int6 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "936618965"
   )
   @Export("post")
   void post() {
      if(this.int1 == -1) {
         this.int1 = 0;
         if(this.objectModels != null && (this.objectTypes == null || this.objectTypes[0] == 10)) {
            this.int1 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if(this.actions[var1] != null) {
               this.int1 = 1;
            }
         }
      }

      if(this.supportItems == -1) {
         this.supportItems = this.clipType != 0?1:0;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1600921045"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.loadData(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "-11884"
   )
   @Export("loadData")
   void loadData(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         if(var3 > 0) {
            if(this.objectModels != null && !objectCompositionLowDetail) {
               var1.offset += 3 * var3;
            } else {
               this.objectTypes = new int[var3];
               this.objectModels = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.objectModels[var4] = var1.readUnsignedShort();
                  this.objectTypes[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 5) {
         var3 = var1.readUnsignedByte();
         if(var3 > 0) {
            if(this.objectModels != null && !objectCompositionLowDetail) {
               var1.offset += 2 * var3;
            } else {
               this.objectTypes = null;
               this.objectModels = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.objectModels[var4] = var1.readUnsignedShort();
               }
            }
         }
      } else if(var2 == 14) {
         this.width = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.length = var1.readUnsignedByte();
      } else if(var2 == 17) {
         this.clipType = 0;
         this.blocksProjectile = false;
      } else if(var2 == 18) {
         this.blocksProjectile = false;
      } else if(var2 == 19) {
         this.int1 = var1.readUnsignedByte();
      } else if(var2 == 21) {
         this.contouredGround = 0;
      } else if(var2 == 22) {
         this.nonFlatShading = true;
      } else if(var2 == 23) {
         this.modelClipped = true;
      } else if(var2 == 24) {
         this.animationId = var1.readUnsignedShort();
         if(this.animationId == 65535) {
            this.animationId = -1;
         }
      } else if(var2 == 27) {
         this.clipType = 1;
      } else if(var2 == 28) {
         this.decorDisplacement = var1.readUnsignedByte();
      } else if(var2 == 29) {
         this.ambient = var1.readByte();
      } else if(var2 == 39) {
         this.contrast = var1.readByte();
      } else if(var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readString();
         if(this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.recolorToFind = new short[var3];
         this.recolorToReplace = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.recolorToFind[var4] = (short)var1.readUnsignedShort();
            this.recolorToReplace[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.textureToFind = new short[var3];
         this.textureToReplace = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.textureToFind[var4] = (short)var1.readUnsignedShort();
            this.textureToReplace[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 62) {
         this.isRotated = true;
      } else if(var2 == 64) {
         this.clipped = false;
      } else if(var2 == 65) {
         this.modelSizeX = var1.readUnsignedShort();
      } else if(var2 == 66) {
         this.modelSizeHeight = var1.readUnsignedShort();
      } else if(var2 == 67) {
         this.modelSizeY = var1.readUnsignedShort();
      } else if(var2 == 68) {
         this.mapSceneId = var1.readUnsignedShort();
      } else if(var2 == 69) {
         var1.readUnsignedByte();
      } else if(var2 == 70) {
         this.offsetX = var1.readShort();
      } else if(var2 == 71) {
         this.offsetHeight = var1.readShort();
      } else if(var2 == 72) {
         this.offsetY = var1.readShort();
      } else if(var2 == 73) {
         this.obstructsGround = true;
      } else if(var2 == 74) {
         this.isHollow = true;
      } else if(var2 == 75) {
         this.supportItems = var1.readUnsignedByte();
      } else if(var2 != 77 && var2 != 92) {
         if(var2 == 78) {
            this.ambientSoundId = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
         } else if(var2 == 79) {
            this.int5 = var1.readUnsignedShort();
            this.int6 = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.field3417 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3417[var4] = var1.readUnsignedShort();
            }
         } else if(var2 == 81) {
            this.contouredGround = var1.readUnsignedByte() * 256;
         } else if(var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.params = KeyFocusListener.readStringIntParameters(var1, this.params);
         }
      } else {
         this.varpId = var1.readUnsignedShort();
         if(this.varpId == 65535) {
            this.varpId = -1;
         }

         this.configId = var1.readUnsignedShort();
         if(this.configId == 65535) {
            this.configId = -1;
         }

         var3 = -1;
         if(var2 == 92) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.impostorIds = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.impostorIds[var5] = var1.readUnsignedShort();
            if(this.impostorIds[var5] == 65535) {
               this.impostorIds[var5] = -1;
            }
         }

         this.impostorIds[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1499763930"
   )
   public final boolean method5048(int var1) {
      if(this.objectTypes != null) {
         for(int var4 = 0; var4 < this.objectTypes.length; ++var4) {
            if(this.objectTypes[var4] == var1) {
               return Frames.field1801.tryLoadRecord(this.objectModels[var4] & 65535, 0);
            }
         }

         return true;
      } else if(this.objectModels == null) {
         return true;
      } else if(var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.objectModels.length; ++var3) {
            var2 &= Frames.field1801.tryLoadRecord(this.objectModels[var3] & 65535, 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2013843189"
   )
   public final boolean method5051() {
      if(this.objectModels == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.objectModels.length; ++var2) {
            var1 &= Frames.field1801.tryLoadRecord(this.objectModels[var2] & 65535, 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II[[IIIII)Ldf;",
      garbageValue = "1401656763"
   )
   @Export("getModel")
   public final Renderable getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if(this.objectTypes == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Object var9 = (Renderable)cachedModels.get(var7);
      if(var9 == null) {
         ModelData var10 = this.getModel(var1, var2);
         if(var10 == null) {
            return null;
         }

         if(!this.nonFlatShading) {
            var9 = var10.light(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         } else {
            var10.field1486 = (short)(this.ambient + 64);
            var10.contrast = (short)(this.contrast * 25 + 768);
            var10.computeNormals();
            var9 = var10;
         }

         cachedModels.put((CacheableNode)var9, var7);
      }

      if(this.nonFlatShading) {
         var9 = ((ModelData)var9).method2650();
      }

      if(this.contouredGround >= 0) {
         if(var9 instanceof Model) {
            var9 = ((Model)var9).method2665(var3, var4, var5, var6, true, this.contouredGround);
         } else if(var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method2567(var3, var4, var5, var6, true, this.contouredGround);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II[[IIIIB)Ldc;",
      garbageValue = "-15"
   )
   public final Model method5031(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if(this.objectTypes == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var9 = (Model)field3374.get(var7);
      if(var9 == null) {
         ModelData var10 = this.getModel(var1, var2);
         if(var10 == null) {
            return null;
         }

         var9 = var10.light(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         field3374.put(var9, var7);
      }

      if(this.contouredGround >= 0) {
         var9 = var9.method2665(var3, var4, var5, var6, true, this.contouredGround);
      }

      return var9;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II[[IIIILjn;II)Ldc;",
      garbageValue = "1680442057"
   )
   public final Model method5032(int var1, int var2, int[][] var3, int var4, int var5, int var6, Sequence var7, int var8) {
      long var9;
      if(this.objectTypes == null) {
         var9 = (long)(var2 + (this.id << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var11 = (Model)field3374.get(var9);
      if(var11 == null) {
         ModelData var12 = this.getModel(var1, var2);
         if(var12 == null) {
            return null;
         }

         var11 = var12.light(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         field3374.put(var11, var9);
      }

      if(var7 == null && this.contouredGround == -1) {
         return var11;
      } else {
         if(var7 != null) {
            var11 = var7.transformObjectModel(var11, var8, var2);
         } else {
            var11 = var11.toSharedModel(true);
         }

         if(this.contouredGround >= 0) {
            var11 = var11.method2665(var3, var4, var5, var6, false, this.contouredGround);
         }

         return var11;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIS)Ldb;",
      garbageValue = "1337"
   )
   @Export("getModel")
   final ModelData getModel(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var7;
      if(this.objectTypes == null) {
         if(var1 != 10) {
            return null;
         }

         if(this.objectModels == null) {
            return null;
         }

         var4 = this.isRotated;
         if(var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.objectModels.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.objectModels[var6];
            if(var4) {
               var7 += 65536;
            }

            var3 = (ModelData)field3391.get((long)var7);
            if(var3 == null) {
               var3 = ModelData.method2568(Frames.field1801, var7 & 65535, 0);
               if(var3 == null) {
                  return null;
               }

               if(var4) {
                  var3.method2583();
               }

               field3391.put(var3, (long)var7);
            }

            if(var5 > 1) {
               field3375[var6] = var3;
            }
         }

         if(var5 > 1) {
            var3 = new ModelData(field3375, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.objectTypes.length; ++var5) {
            if(this.objectTypes[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if(var9 == -1) {
            return null;
         }

         var5 = this.objectModels[var9];
         boolean var10 = this.isRotated ^ var2 > 3;
         if(var10) {
            var5 += 65536;
         }

         var3 = (ModelData)field3391.get((long)var5);
         if(var3 == null) {
            var3 = ModelData.method2568(Frames.field1801, var5 & 65535, 0);
            if(var3 == null) {
               return null;
            }

            if(var10) {
               var3.method2583();
            }

            field3391.put(var3, (long)var5);
         }
      }

      if(this.modelSizeX == 128 && this.modelSizeHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if(this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorToFind == null, null == this.textureToFind, true);
      if(var1 == 4 && var2 > 3) {
         var8.method2653(256);
         var8.method2580(45, 0, -45);
      }

      var2 &= 3;
      if(var2 == 1) {
         var8.method2576();
      } else if(var2 == 2) {
         var8.method2573();
      } else if(var2 == 3) {
         var8.method2578();
      }

      if(this.recolorToFind != null) {
         for(var7 = 0; var7 < this.recolorToFind.length; ++var7) {
            var8.recolor(this.recolorToFind[var7], this.recolorToReplace[var7]);
         }
      }

      if(this.textureToFind != null) {
         for(var7 = 0; var7 < this.textureToFind.length; ++var7) {
            var8.method2582(this.textureToFind[var7], this.textureToReplace[var7]);
         }
      }

      if(var4) {
         var8.method2592(this.modelSizeX, this.modelSizeHeight, this.modelSizeY);
      }

      if(var11) {
         var8.method2580(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var8;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Ljj;",
      garbageValue = "504367695"
   )
   @Export("getImpostor")
   public final ObjectComposition getImpostor() {
      int var1 = -1;
      if(this.varpId != -1) {
         var1 = GameSocket.getVarbit(this.varpId);
      } else if(this.configId != -1) {
         var1 = class225.clientVarps[this.configId];
      }

      int var2;
      if(var1 >= 0 && var1 < this.impostorIds.length - 1) {
         var2 = this.impostorIds[var1];
      } else {
         var2 = this.impostorIds[this.impostorIds.length - 1];
      }

      return var2 != -1?FileOnDisk.getObjectDefinition(var2):null;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "11"
   )
   public int method5035(int var1, int var2) {
      return FriendManager.method1668(this.params, var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1578907603"
   )
   public String method5036(int var1, String var2) {
      return WorldMapRectangle.method171(this.params, var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2104848132"
   )
   public boolean method5024() {
      if(this.impostorIds == null) {
         return this.ambientSoundId != -1 || this.field3417 != null;
      } else {
         for(int var1 = 0; var1 < this.impostorIds.length; ++var1) {
            if(this.impostorIds[var1] != -1) {
               ObjectComposition var2 = FileOnDisk.getObjectDefinition(this.impostorIds[var1]);
               if(var2.ambientSoundId != -1 || var2.field3417 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "42"
   )
   @Export("decodeSprite")
   static void decodeSprite(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class319.indexedSpriteCount = var1.readUnsignedShort();
      class7.indexedSpriteOffsetXs = new int[class319.indexedSpriteCount];
      class225.indexedSpriteOffsetYs = new int[class319.indexedSpriteCount];
      class319.indexSpriteWidths = new int[class319.indexedSpriteCount];
      class319.indexedSpriteHeights = new int[class319.indexedSpriteCount];
      class319.spritePixels = new byte[class319.indexedSpriteCount][];
      var1.offset = var0.length - 7 - class319.indexedSpriteCount * 8;
      class305.indexedSpriteWidth = var1.readUnsignedShort();
      class319.indexedSpriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class319.indexedSpriteCount; ++var3) {
         class7.indexedSpriteOffsetXs[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class319.indexedSpriteCount; ++var3) {
         class225.indexedSpriteOffsetYs[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class319.indexedSpriteCount; ++var3) {
         class319.indexSpriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class319.indexedSpriteCount; ++var3) {
         class319.indexedSpriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class319.indexedSpriteCount * 8 - (var2 - 1) * 3;
      PacketNode.indexedSpritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         PacketNode.indexedSpritePalette[var3] = var1.read24BitInt();
         if(PacketNode.indexedSpritePalette[var3] == 0) {
            PacketNode.indexedSpritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class319.indexedSpriteCount; ++var3) {
         int var4 = class319.indexSpriteWidths[var3];
         int var5 = class319.indexedSpriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class319.spritePixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if(var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.readByte();
               }
            }
         }
      }

   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1535960553"
   )
   static final void method5085() {
      for(int var0 = 0; var0 < Client.queuedSoundEffectCount; ++var0) {
         --Client.unknownSoundValues2[var0];
         if(Client.unknownSoundValues2[var0] >= -10) {
            SoundEffect var9 = Client.audioEffects[var0];
            if(var9 == null) {
               Object var10000 = null;
               var9 = SoundEffect.getTrack(UrlRequester.indexCache4, Client.queuedSoundEffectIDs[var0], 0);
               if(var9 == null) {
                  continue;
               }

               Client.unknownSoundValues2[var0] += var9.calculateDelay();
               Client.audioEffects[var0] = var9;
            }

            if(Client.unknownSoundValues2[var0] < 0) {
               int var2;
               if(Client.soundLocations[var0] != 0) {
                  int var3 = (Client.soundLocations[var0] & 255) * 128;
                  int var4 = Client.soundLocations[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class138.localPlayer.x;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = Client.soundLocations[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class138.localPlayer.y;
                  if(var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var7 + var5 - 128;
                  if(var8 > var3) {
                     Client.unknownSoundValues2[var0] = -100;
                     continue;
                  }

                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * Client.field815 / var3;
               } else {
                  var2 = Client.field814;
               }

               if(var2 > 0) {
                  RawAudioNode var10 = var9.method2069().applyResampler(OwnWorldComparator.field577);
                  class103 var11 = class103.method2287(var10, 100, var2);
                  var11.method2258(Client.unknownSoundValues1[var0] - 1);
                  MapIconReference.field310.method2032(var11);
               }

               Client.unknownSoundValues2[var0] = -100;
            }
         } else {
            --Client.queuedSoundEffectCount;

            for(int var1 = var0; var1 < Client.queuedSoundEffectCount; ++var1) {
               Client.queuedSoundEffectIDs[var1] = Client.queuedSoundEffectIDs[var1 + 1];
               Client.audioEffects[var1] = Client.audioEffects[var1 + 1];
               Client.unknownSoundValues1[var1] = Client.unknownSoundValues1[var1 + 1];
               Client.unknownSoundValues2[var1] = Client.unknownSoundValues2[var1 + 1];
               Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
            }

            --var0;
         }
      }

      if(Client.field813) {
         boolean var12;
         if(class217.field2460 != 0) {
            var12 = true;
         } else {
            var12 = class217.field2459.method4203();
         }

         if(!var12) {
            if(Client.field811 != 0 && Client.field812 != -1) {
               Actor.method1554(Item.indexTrack1, Client.field812, 0, Client.field811, false);
            }

            Client.field813 = false;
         }
      }

   }
}
