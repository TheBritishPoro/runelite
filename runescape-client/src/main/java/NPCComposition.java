import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("NPCComposition")
public class NPCComposition extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("NpcDefinition_indexCache")
   public static IndexDataBase NpcDefinition_indexCache;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("NpcDefinition_modelIndexCache")
   public static IndexDataBase NpcDefinition_modelIndexCache;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("npcs")
   public static NodeCache npcs;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("npcModelCache")
   public static NodeCache npcModelCache;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 791272887
   )
   @Export("id")
   public int id;
   @ObfuscatedName("q")
   @Export("name")
   public String name;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -254804359
   )
   @Export("size")
   public int size;
   @ObfuscatedName("i")
   @Export("models")
   int[] models;
   @ObfuscatedName("x")
   @Export("additionalModels")
   int[] additionalModels;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1114292373
   )
   @Export("standingAnimation")
   public int standingAnimation;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1340441257
   )
   public int field3496;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1278546655
   )
   public int field3486;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -549599927
   )
   @Export("walkingAnimation")
   public int walkingAnimation;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1839913521
   )
   @Export("rotate180Animation")
   public int rotate180Animation;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -420302217
   )
   @Export("rotate90RightAnimation")
   public int rotate90RightAnimation;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 116081011
   )
   @Export("rotate90LeftAnimation")
   public int rotate90LeftAnimation;
   @ObfuscatedName("r")
   @Export("colors")
   short[] colors;
   @ObfuscatedName("t")
   @Export("modifiedColors")
   short[] modifiedColors;
   @ObfuscatedName("o")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("y")
   @Export("textureToReplaceWith")
   short[] textureToReplaceWith;
   @ObfuscatedName("a")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("j")
   @Export("isMinimapVisible")
   public boolean isMinimapVisible;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -152867383
   )
   @Export("combatLevel")
   public int combatLevel;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1933108527
   )
   @Export("widthScale")
   int widthScale;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 680879601
   )
   @Export("heightScale")
   int heightScale;
   @ObfuscatedName("v")
   @Export("isVisible")
   public boolean isVisible;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1940547865
   )
   @Export("ambient")
   int ambient;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1338723887
   )
   @Export("contrast")
   int contrast;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -543090749
   )
   @Export("headIcon")
   public int headIcon;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1117793583
   )
   @Export("rotation")
   public int rotation;
   @ObfuscatedName("ak")
   @Export("configs")
   public int[] configs;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1305673173
   )
   @Export("varpIndex")
   int varpIndex;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -332297953
   )
   @Export("varp32Index")
   int varp32Index;
   @ObfuscatedName("ao")
   public boolean field3504;
   @ObfuscatedName("at")
   @Export("isClickable")
   public boolean isClickable;
   @ObfuscatedName("ai")
   public boolean field3517;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("params")
   IterableHashTable params;

   static {
      npcs = new NodeCache(64);
      npcModelCache = new NodeCache(50);
   }

   NPCComposition() {
      this.name = "null";
      this.size = 1;
      this.standingAnimation = -1;
      this.field3496 = -1;
      this.field3486 = -1;
      this.walkingAnimation = -1;
      this.rotate180Animation = -1;
      this.rotate90RightAnimation = -1;
      this.rotate90LeftAnimation = -1;
      this.actions = new String[5];
      this.isMinimapVisible = true;
      this.combatLevel = -1;
      this.widthScale = 128;
      this.heightScale = 128;
      this.isVisible = false;
      this.ambient = 0;
      this.contrast = 0;
      this.headIcon = -1;
      this.rotation = 32;
      this.varpIndex = -1;
      this.varp32Index = -1;
      this.field3504 = true;
      this.isClickable = true;
      this.field3517 = false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "392"
   )
   @Export("post")
   void post() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1539738926"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1656965495"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.models = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.models[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 12) {
         this.size = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.standingAnimation = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.walkingAnimation = var1.readUnsignedShort();
      } else if(var2 == 15) {
         this.field3496 = var1.readUnsignedShort();
      } else if(var2 == 16) {
         this.field3486 = var1.readUnsignedShort();
      } else if(var2 == 17) {
         this.walkingAnimation = var1.readUnsignedShort();
         this.rotate180Animation = var1.readUnsignedShort();
         this.rotate90RightAnimation = var1.readUnsignedShort();
         this.rotate90LeftAnimation = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readString();
         if(this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.colors = new short[var3];
         this.modifiedColors = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.colors[var4] = (short)var1.readUnsignedShort();
            this.modifiedColors[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.textureToReplace = new short[var3];
         this.textureToReplaceWith = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.textureToReplace[var4] = (short)var1.readUnsignedShort();
            this.textureToReplaceWith[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.additionalModels = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.additionalModels[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 93) {
         this.isMinimapVisible = false;
      } else if(var2 == 95) {
         this.combatLevel = var1.readUnsignedShort();
      } else if(var2 == 97) {
         this.widthScale = var1.readUnsignedShort();
      } else if(var2 == 98) {
         this.heightScale = var1.readUnsignedShort();
      } else if(var2 == 99) {
         this.isVisible = true;
      } else if(var2 == 100) {
         this.ambient = var1.readByte();
      } else if(var2 == 101) {
         this.contrast = var1.readByte();
      } else if(var2 == 102) {
         this.headIcon = var1.readUnsignedShort();
      } else if(var2 == 103) {
         this.rotation = var1.readUnsignedShort();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field3504 = false;
         } else if(var2 == 109) {
            this.isClickable = false;
         } else if(var2 == 111) {
            this.field3517 = true;
         } else if(var2 == 249) {
            this.params = KeyFocusListener.readStringIntParameters(var1, this.params);
         }
      } else {
         this.varpIndex = var1.readUnsignedShort();
         if(this.varpIndex == 65535) {
            this.varpIndex = -1;
         }

         this.varp32Index = var1.readUnsignedShort();
         if(this.varp32Index == 65535) {
            this.varp32Index = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.configs = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.configs[var5] = var1.readUnsignedShort();
            if(this.configs[var5] == 65535) {
               this.configs[var5] = -1;
            }
         }

         this.configs[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljn;ILjn;II)Ldc;",
      garbageValue = "-639258306"
   )
   @Export("getModel")
   public final Model getModel(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.configs != null) {
         NPCComposition var12 = this.transform();
         return var12 == null?null:var12.getModel(var1, var2, var3, var4);
      } else {
         Model var5 = (Model)npcModelCache.get((long)this.id);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.models.length; ++var7) {
               if(!NpcDefinition_modelIndexCache.tryLoadRecord(this.models[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            ModelData[] var8 = new ModelData[this.models.length];

            int var9;
            for(var9 = 0; var9 < this.models.length; ++var9) {
               var8[var9] = ModelData.method2568(NpcDefinition_modelIndexCache, this.models[var9], 0);
            }

            ModelData var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new ModelData(var8, var8.length);
            }

            if(this.colors != null) {
               for(var9 = 0; var9 < this.colors.length; ++var9) {
                  var11.recolor(this.colors[var9], this.modifiedColors[var9]);
               }
            }

            if(this.textureToReplace != null) {
               for(var9 = 0; var9 < this.textureToReplace.length; ++var9) {
                  var11.method2582(this.textureToReplace[var9], this.textureToReplaceWith[var9]);
               }
            }

            var5 = var11.light(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
            npcModelCache.put(var5, (long)this.id);
         }

         Model var10;
         if(var1 != null && var3 != null) {
            var10 = var1.applyTransformations(var5, var2, var3, var4);
         } else if(var1 != null) {
            var10 = var1.transformActorModel(var5, var2);
         } else if(var3 != null) {
            var10 = var3.transformActorModel(var5, var4);
         } else {
            var10 = var5.toSharedModel(true);
         }

         if(this.widthScale != 128 || this.heightScale != 128) {
            var10.scale(this.widthScale, this.heightScale, this.widthScale);
         }

         return var10;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "-30"
   )
   public final ModelData method5158() {
      if(this.configs != null) {
         NPCComposition var1 = this.transform();
         return var1 == null?null:var1.method5158();
      } else if(this.additionalModels == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.additionalModels.length; ++var2) {
            if(!NpcDefinition_modelIndexCache.tryLoadRecord(this.additionalModels[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            ModelData[] var6 = new ModelData[this.additionalModels.length];

            for(int var3 = 0; var3 < this.additionalModels.length; ++var3) {
               var6[var3] = ModelData.method2568(NpcDefinition_modelIndexCache, this.additionalModels[var3], 0);
            }

            ModelData var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new ModelData(var6, var6.length);
            }

            int var4;
            if(this.colors != null) {
               for(var4 = 0; var4 < this.colors.length; ++var4) {
                  var7.recolor(this.colors[var4], this.modifiedColors[var4]);
               }
            }

            if(this.textureToReplace != null) {
               for(var4 = 0; var4 < this.textureToReplace.length; ++var4) {
                  var7.method2582(this.textureToReplace[var4], this.textureToReplaceWith[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Ljq;",
      garbageValue = "-1834963481"
   )
   @Export("transform")
   public final NPCComposition transform() {
      int var1 = -1;
      if(this.varpIndex != -1) {
         var1 = GameSocket.getVarbit(this.varpIndex);
      } else if(this.varp32Index != -1) {
         var1 = class225.clientVarps[this.varp32Index];
      }

      int var2;
      if(var1 >= 0 && var1 < this.configs.length - 1) {
         var2 = this.configs[var1];
      } else {
         var2 = this.configs[this.configs.length - 1];
      }

      return var2 != -1?HorizontalAlignment.getNpcDefinition(var2):null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "981349968"
   )
   public boolean method5165() {
      if(this.configs == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.varpIndex != -1) {
            var1 = GameSocket.getVarbit(this.varpIndex);
         } else if(this.varp32Index != -1) {
            var1 = class225.clientVarps[this.varp32Index];
         }

         return var1 >= 0 && var1 < this.configs.length?this.configs[var1] != -1:this.configs[this.configs.length - 1] != -1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "33823014"
   )
   public int method5166(int var1, int var2) {
      return FriendManager.method1668(this.params, var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "37"
   )
   public String method5167(int var1, String var2) {
      return WorldMapRectangle.method171(this.params, var1, var2);
   }
}
