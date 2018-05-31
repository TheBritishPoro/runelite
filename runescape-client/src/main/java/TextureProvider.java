import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("TextureProvider")
public class TextureProvider implements ITextureLoader {
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("mapMarkers")
   static SpritePixels[] mapMarkers;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   @Export("deque")
   Deque deque;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 114884877
   )
   @Export("maxSize")
   int maxSize;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1966961957
   )
   @Export("size")
   int size;
   @ObfuscatedName("u")
   @Export("brightness")
   double brightness;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1617478817
   )
   @Export("width")
   int width;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("sprites")
   IndexDataBase sprites;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;IDI)V"
   )
   public TextureProvider(IndexDataBase var1, IndexDataBase var2, int var3, double var4, int var6) {
      this.deque = new Deque();
      this.size = 0;
      this.brightness = 1.0D;
      this.width = 128;
      this.sprites = var2;
      this.maxSize = var3;
      this.size = this.maxSize;
      this.brightness = var4;
      this.width = var6;
      int[] var7 = var1.getChilds(0);
      int var8 = var7.length;
      this.textures = new Texture[var1.fileCount(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.getConfigData(0, var7[var9]));
         this.textures[var7[var9]] = new Texture(var10);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1808085828"
   )
   public int method2530() {
      int var1 = 0;
      int var2 = 0;
      Texture[] var3 = this.textures;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Texture var5 = var3[var4];
         if(var5 != null && var5.fileIds != null) {
            var1 += var5.fileIds.length;
            int[] var6 = var5.fileIds;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if(this.sprites.method4627(var8)) {
                  ++var2;
               }
            }
         }
      }

      if(var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("w")
   @Export("brightness")
   public void brightness(double var1) {
      this.brightness = var1;
      this.reset();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1935357081"
   )
   @Export("load")
   public int[] load(int var1) {
      Texture var2 = this.textures[var1];
      if(var2 != null) {
         if(var2.pixels != null) {
            this.deque.addTail(var2);
            var2.loaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.method2661(this.brightness, this.width, this.sprites);
         if(var3) {
            if(this.size == 0) {
               Texture var4 = (Texture)this.deque.popTail();
               var4.resetPixels();
            } else {
               --this.size;
            }

            this.deque.addTail(var2);
            var2.loaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2017103535"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null?this.textures[var1].field1527:0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "70"
   )
   public boolean vmethod3081(int var1) {
      return this.textures[var1].field1530;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "443897939"
   )
   public boolean vmethod3082(int var1) {
      return this.width == 64;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "566742688"
   )
   @Export("reset")
   public void reset() {
      for(int var1 = 0; var1 < this.textures.length; ++var1) {
         if(this.textures[var1] != null) {
            this.textures[var1].resetPixels();
         }
      }

      this.deque = new Deque();
      this.size = this.maxSize;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   @Hook(
      value = "drawAboveOverheads",
      end = true
   )
   @Export("checkTextures")
   public void checkTextures(int var1) {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         Texture var3 = this.textures[var2];
         if(var3 != null && var3.field1537 != 0 && var3.loaded) {
            var3.method2657(var1);
            var3.loaded = false;
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)Ljt;",
      garbageValue = "56"
   )
   @Export("getItemDefinition")
   public static ItemComposition getItemDefinition(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.items.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = ItemComposition.item_ref.getConfigData(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if(var2 != null) {
            var1.loadBuffer(new Buffer(var2));
         }

         var1.post();
         if(var1.notedTemplate != -1) {
            var1.updateNote(getItemDefinition(var1.notedTemplate), getItemDefinition(var1.note));
         }

         if(var1.notedId != -1) {
            var1.method5110(getItemDefinition(var1.notedId), getItemDefinition(var1.unnotedId));
         }

         if(var1.placeholderTemplateId != -1) {
            var1.method5091(getItemDefinition(var1.placeholderTemplateId), getItemDefinition(var1.placeholderId));
         }

         if(!ItemComposition.isMembersWorld && var1.isMembers) {
            var1.name = "Members object";
            var1.isTradable = false;
            var1.groundActions = null;
            var1.inventoryActions = null;
            var1.shiftClickIndex = -1;
            var1.team = 0;
            if(var1.params != null) {
               boolean var3 = false;

               for(Node var4 = var1.params.getHead(); var4 != null; var4 = var1.params.getTail()) {
                  class264 var5 = class241.method4603((int)var4.hash);
                  if(var5.field3332) {
                     var4.unlink();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.items.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-33"
   )
   static void method2562() {
      class81.playerIndexesCount = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class81.field1157[var0] = null;
         class81.field1153[var0] = 1;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "41"
   )
   static int method2531(int var0, Script var1, boolean var2) {
      if(var0 == 5630) {
         Client.field627 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
