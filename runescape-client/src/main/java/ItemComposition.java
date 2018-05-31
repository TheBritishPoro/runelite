import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("ItemComposition")
public class ItemComposition extends CacheableNode {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("item_ref")
   public static IndexDataBase item_ref;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("ItemDefinition_modelIndexCache")
   public static IndexDataBase ItemDefinition_modelIndexCache;
   @ObfuscatedName("i")
   @Export("isMembersWorld")
   public static boolean isMembersWorld;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("items")
   static NodeCache items;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("itemModelCache")
   static NodeCache itemModelCache;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   @Export("itemSpriteCache")
   public static NodeCache itemSpriteCache;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   public static Font field3466;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = 1034969199
   )
   static int field3478;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1212562411
   )
   @Export("id")
   public int id;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1410829125
   )
   @Export("inventoryModel")
   int inventoryModel;
   @ObfuscatedName("m")
   @Export("name")
   public String name;
   @ObfuscatedName("r")
   @Export("colourToReplace")
   short[] colourToReplace;
   @ObfuscatedName("t")
   @Export("colourToReplaceWith")
   short[] colourToReplaceWith;
   @ObfuscatedName("o")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("y")
   @Export("textToReplaceWith")
   short[] textToReplaceWith;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 98167349
   )
   @Export("zoom2d")
   public int zoom2d;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1493431975
   )
   @Export("xan2d")
   public int xan2d;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 871832439
   )
   @Export("yan2d")
   public int yan2d;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1182785459
   )
   @Export("zan2d")
   public int zan2d;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 204009171
   )
   @Export("offsetX2d")
   public int offsetX2d;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -737340725
   )
   @Export("offsetY2d")
   public int offsetY2d;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -112366113
   )
   @Export("isStackable")
   public int isStackable;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 467062073
   )
   @Export("price")
   public int price;
   @ObfuscatedName("ab")
   @Export("isMembers")
   public boolean isMembers;
   @ObfuscatedName("aw")
   @Export("groundActions")
   public String[] groundActions;
   @ObfuscatedName("ak")
   @Export("inventoryActions")
   public String[] inventoryActions;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -600511521
   )
   @Export("shiftClickIndex")
   int shiftClickIndex;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1398336319
   )
   @Export("maleModel")
   int maleModel;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1482325187
   )
   @Export("maleModel1")
   int maleModel1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -490406735
   )
   @Export("maleOffset")
   int maleOffset;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1614924913
   )
   @Export("femaleModel")
   int femaleModel;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2077816071
   )
   @Export("femaleModel1")
   int femaleModel1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1214395517
   )
   @Export("femaleOffset")
   int femaleOffset;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -76981219
   )
   @Export("maleModel2")
   int maleModel2;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1753681407
   )
   @Export("femaleModel2")
   int femaleModel2;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -26318993
   )
   @Export("maleHeadModel")
   int maleHeadModel;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 233073807
   )
   @Export("maleHeadModel2")
   int maleHeadModel2;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1173366083
   )
   @Export("femaleHeadModel")
   int femaleHeadModel;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -824448865
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2;
   @ObfuscatedName("aq")
   @Export("countObj")
   int[] countObj;
   @ObfuscatedName("ad")
   @Export("countCo")
   int[] countCo;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -767534637
   )
   @Export("note")
   public int note;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1604304615
   )
   @Export("notedTemplate")
   public int notedTemplate;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -843761873
   )
   @Export("resizeX")
   int resizeX;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1729047309
   )
   @Export("resizeY")
   int resizeY;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1333825381
   )
   @Export("resizeZ")
   int resizeZ;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -165931155
   )
   @Export("ambient")
   public int ambient;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -462099869
   )
   @Export("contrast")
   public int contrast;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1234208423
   )
   @Export("team")
   public int team;
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("params")
   IterableHashTable params;
   @ObfuscatedName("bo")
   @Export("isTradable")
   public boolean isTradable;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 73722835
   )
   @Export("unnotedId")
   int unnotedId;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 670024957
   )
   @Export("notedId")
   int notedId;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1740241681
   )
   @Export("placeholderId")
   public int placeholderId;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1436912899
   )
   @Export("placeholderTemplateId")
   public int placeholderTemplateId;

   static {
      items = new NodeCache(64);
      itemModelCache = new NodeCache(50);
      itemSpriteCache = new NodeCache(200);
   }

   ItemComposition() {
      this.name = "null";
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.isStackable = 0;
      this.price = 1;
      this.isMembers = false;
      this.groundActions = new String[]{null, null, "Take", null, null};
      this.inventoryActions = new String[]{null, null, null, null, "Drop"};
      this.shiftClickIndex = -2;
      this.maleModel = -1;
      this.maleModel1 = -1;
      this.maleOffset = 0;
      this.femaleModel = -1;
      this.femaleModel1 = -1;
      this.femaleOffset = 0;
      this.maleModel2 = -1;
      this.femaleModel2 = -1;
      this.maleHeadModel = -1;
      this.maleHeadModel2 = -1;
      this.femaleHeadModel = -1;
      this.femaleHeadModel2 = -1;
      this.note = -1;
      this.notedTemplate = -1;
      this.resizeX = 128;
      this.resizeY = 128;
      this.resizeZ = 128;
      this.ambient = 0;
      this.contrast = 0;
      this.team = 0;
      this.isTradable = false;
      this.unnotedId = -1;
      this.notedId = -1;
      this.placeholderId = -1;
      this.placeholderTemplateId = -1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "750388690"
   )
   @Export("post")
   @Hook(
      value = "postItemComposition",
      end = true
   )
   void post() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-69"
   )
   @Export("loadBuffer")
   void loadBuffer(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.populateFromBuffer(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "-69"
   )
   @Export("populateFromBuffer")
   void populateFromBuffer(Buffer var1, int var2) {
      if(var2 == 1) {
         this.inventoryModel = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.offsetX2d = var1.readUnsignedShort();
         if(this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if(var2 == 8) {
         this.offsetY2d = var1.readUnsignedShort();
         if(this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if(var2 == 11) {
         this.isStackable = 1;
      } else if(var2 == 12) {
         this.price = var1.readInt();
      } else if(var2 == 16) {
         this.isMembers = true;
      } else if(var2 == 23) {
         this.maleModel = var1.readUnsignedShort();
         this.maleOffset = var1.readUnsignedByte();
      } else if(var2 == 24) {
         this.maleModel1 = var1.readUnsignedShort();
      } else if(var2 == 25) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if(var2 == 26) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.groundActions[var2 - 30] = var1.readString();
         if(this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.inventoryActions[var2 - 35] = var1.readString();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.colourToReplace = new short[var3];
            this.colourToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.colourToReplace[var4] = (short)var1.readUnsignedShort();
               this.colourToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.textureToReplace = new short[var3];
            this.textToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.textureToReplace[var4] = (short)var1.readUnsignedShort();
               this.textToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 42) {
            this.shiftClickIndex = var1.readByte();
         } else if(var2 == 65) {
            this.isTradable = true;
         } else if(var2 == 78) {
            this.maleModel2 = var1.readUnsignedShort();
         } else if(var2 == 79) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if(var2 == 90) {
            this.maleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 91) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 92) {
            this.maleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 93) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if(var2 == 97) {
            this.note = var1.readUnsignedShort();
         } else if(var2 == 98) {
            this.notedTemplate = var1.readUnsignedShort();
         } else if(var2 >= 100 && var2 < 110) {
            if(this.countObj == null) {
               this.countObj = new int[10];
               this.countCo = new int[10];
            }

            this.countObj[var2 - 100] = var1.readUnsignedShort();
            this.countCo[var2 - 100] = var1.readUnsignedShort();
         } else if(var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if(var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if(var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if(var2 == 113) {
            this.ambient = var1.readByte();
         } else if(var2 == 114) {
            this.contrast = var1.readByte() * 5;
         } else if(var2 == 115) {
            this.team = var1.readUnsignedByte();
         } else if(var2 == 139) {
            this.unnotedId = var1.readUnsignedShort();
         } else if(var2 == 140) {
            this.notedId = var1.readUnsignedShort();
         } else if(var2 == 148) {
            this.placeholderId = var1.readUnsignedShort();
         } else if(var2 == 149) {
            this.placeholderTemplateId = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.params = KeyFocusListener.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljt;Ljt;B)V",
      garbageValue = "-109"
   )
   @Export("updateNote")
   void updateNote(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.price = var2.price;
      this.isStackable = 1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljt;Ljt;B)V",
      garbageValue = "0"
   )
   void method5110(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var2.colourToReplace;
      this.colourToReplaceWith = var2.colourToReplaceWith;
      this.textureToReplace = var2.textureToReplace;
      this.textToReplaceWith = var2.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.isStackable = var2.isStackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.maleHeadModel = var2.maleHeadModel;
      this.maleHeadModel2 = var2.maleHeadModel2;
      this.femaleHeadModel = var2.femaleHeadModel;
      this.femaleHeadModel2 = var2.femaleHeadModel2;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.inventoryActions = new String[5];
      if(var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljt;Ljt;B)V",
      garbageValue = "8"
   )
   void method5091(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.isStackable = var1.isStackable;
      this.name = var2.name;
      this.price = 0;
      this.isMembers = false;
      this.isTradable = false;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)Ldb;",
      garbageValue = "25"
   )
   public final ModelData method5092(int var1) {
      int var3;
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return TextureProvider.getItemDefinition(var2).method5092(1);
         }
      }

      ModelData var4 = ModelData.method2568(ItemDefinition_modelIndexCache, this.inventoryModel, 0);
      if(var4 == null) {
         return null;
      } else {
         if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.method2592(this.resizeX, this.resizeY, this.resizeZ);
         }

         if(this.colourToReplace != null) {
            for(var3 = 0; var3 < this.colourToReplace.length; ++var3) {
               var4.recolor(this.colourToReplace[var3], this.colourToReplaceWith[var3]);
            }
         }

         if(this.textureToReplace != null) {
            for(var3 = 0; var3 < this.textureToReplace.length; ++var3) {
               var4.method2582(this.textureToReplace[var3], this.textToReplaceWith[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Ldc;",
      garbageValue = "-2040430719"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return TextureProvider.getItemDefinition(var2).getModel(1);
         }
      }

      Model var5 = (Model)itemModelCache.get((long)this.id);
      if(var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.method2568(ItemDefinition_modelIndexCache, this.inventoryModel, 0);
         if(var6 == null) {
            return null;
         } else {
            if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.method2592(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if(this.colourToReplace != null) {
               for(var4 = 0; var4 < this.colourToReplace.length; ++var4) {
                  var6.recolor(this.colourToReplace[var4], this.colourToReplaceWith[var4]);
               }
            }

            if(this.textureToReplace != null) {
               for(var4 = 0; var4 < this.textureToReplace.length; ++var4) {
                  var6.method2582(this.textureToReplace[var4], this.textToReplaceWith[var4]);
               }
            }

            var5 = var6.light(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            var5.field1603 = true;
            itemModelCache.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Ljt;",
      garbageValue = "-2018272794"
   )
   public ItemComposition method5094(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return TextureProvider.getItemDefinition(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "311009005"
   )
   @Export("readyWorn")
   public final boolean readyWorn(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!ItemDefinition_modelIndexCache.tryLoadRecord(var2, 0)) {
            var5 = false;
         }

         if(var3 != -1 && !ItemDefinition_modelIndexCache.tryLoadRecord(var3, 0)) {
            var5 = false;
         }

         if(var4 != -1 && !ItemDefinition_modelIndexCache.tryLoadRecord(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZB)Ldb;",
      garbageValue = "17"
   )
   @Export("getWornModelData")
   public final ModelData getWornModelData(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.method2568(ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var6 = ModelData.method2568(ItemDefinition_modelIndexCache, var3, 0);
            if(var4 != -1) {
               ModelData var7 = ModelData.method2568(ItemDefinition_modelIndexCache, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if(!var1 && this.maleOffset != 0) {
            var5.method2580(0, this.maleOffset, 0);
         }

         if(var1 && this.femaleOffset != 0) {
            var5.method2580(0, this.femaleOffset, 0);
         }

         int var9;
         if(this.colourToReplace != null) {
            for(var9 = 0; var9 < this.colourToReplace.length; ++var9) {
               var5.recolor(this.colourToReplace[var9], this.colourToReplaceWith[var9]);
            }
         }

         if(this.textureToReplace != null) {
            for(var9 = 0; var9 < this.textureToReplace.length; ++var9) {
               var5.method2582(this.textureToReplace[var9], this.textToReplaceWith[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "584238703"
   )
   public final boolean method5097(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!ItemDefinition_modelIndexCache.tryLoadRecord(var2, 0)) {
            var4 = false;
         }

         if(var3 != -1 && !ItemDefinition_modelIndexCache.tryLoadRecord(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZI)Ldb;",
      garbageValue = "-2143681754"
   )
   public final ModelData method5098(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.method2568(ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var5 = ModelData.method2568(ItemDefinition_modelIndexCache, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if(this.colourToReplace != null) {
            for(var7 = 0; var7 < this.colourToReplace.length; ++var7) {
               var4.recolor(this.colourToReplace[var7], this.colourToReplaceWith[var7]);
            }
         }

         if(this.textureToReplace != null) {
            for(var7 = 0; var7 < this.textureToReplace.length; ++var7) {
               var4.method2582(this.textureToReplace[var7], this.textToReplaceWith[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1055028072"
   )
   public int method5099(int var1, int var2) {
      return FriendManager.method1668(this.params, var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "977767295"
   )
   public String method5121(int var1, String var2) {
      return WorldMapRectangle.method171(this.params, var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1322817925"
   )
   @Export("getShiftClickActionIndex")
   public int getShiftClickActionIndex() {
      return this.shiftClickIndex != -1 && this.inventoryActions != null?(this.shiftClickIndex >= 0?(this.inventoryActions[this.shiftClickIndex] != null?this.shiftClickIndex:-1):("Drop".equalsIgnoreCase(this.inventoryActions[4])?4:-1)):-1;
   }
}
