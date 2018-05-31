import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("Preferences")
public class Preferences {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -344414119
   )
   static int field964;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1850992515
   )
   static int field966;
   @ObfuscatedName("s")
   @Export("hideRoofs")
   boolean hideRoofs;
   @ObfuscatedName("l")
   @Export("muted")
   boolean muted;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -514581919
   )
   @Export("screenType")
   int screenType;
   @ObfuscatedName("q")
   @Export("rememberedUsername")
   String rememberedUsername;
   @ObfuscatedName("k")
   @Export("hideUsername")
   boolean hideUsername;
   @ObfuscatedName("i")
   @Export("preferences")
   LinkedHashMap preferences;

   static {
      field964 = 6;
   }

   Preferences() {
      this.screenType = 1;
      this.rememberedUsername = null;
      this.hideUsername = false;
      this.preferences = new LinkedHashMap();
      this.method1613(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   Preferences(Buffer var1) {
      this.screenType = 1;
      this.rememberedUsername = null;
      this.hideUsername = false;
      this.preferences = new LinkedHashMap();
      if(var1 != null && var1.payload != null) {
         int var2 = var1.readUnsignedByte();
         if(var2 >= 0 && var2 <= field964) {
            if(var1.readUnsignedByte() == 1) {
               this.hideRoofs = true;
            }

            if(var2 > 1) {
               this.muted = var1.readUnsignedByte() == 1;
            }

            if(var2 > 3) {
               this.screenType = var1.readUnsignedByte();
            }

            if(var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.preferences.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.rememberedUsername = var1.getNullString();
            }

            if(var2 > 5) {
               this.hideUsername = var1.method3555();
            }
         } else {
            this.method1613(true);
         }
      } else {
         this.method1613(true);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1739738727"
   )
   void method1613(boolean var1) {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lgk;",
      garbageValue = "1661970638"
   )
   @Export("serialize")
   Buffer serialize() {
      Buffer var1 = new Buffer(100);
      var1.putByte(field964);
      var1.putByte(this.hideRoofs?1:0);
      var1.putByte(this.muted?1:0);
      var1.putByte(this.screenType);
      var1.putByte(this.preferences.size());
      Iterator var2 = this.preferences.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.putInt(((Integer)var3.getKey()).intValue());
         var1.putInt(((Integer)var3.getValue()).intValue());
      }

      var1.putString(this.rememberedUsername != null?this.rememberedUsername:"");
      var1.writeBooleanAsByte(this.hideUsername);
      return var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-179570605"
   )
   public static void method1622(int var0) {
      if(var0 != -1) {
         if(GZipDecompressor.validInterfaces[var0]) {
            Widget.widgetIndex.method4639(var0);
            if(GameCanvas.widgets[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < GameCanvas.widgets[var0].length; ++var2) {
                  if(GameCanvas.widgets[var0][var2] != null) {
                     if(GameCanvas.widgets[var0][var2].type != 2) {
                        GameCanvas.widgets[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if(var1) {
                  GameCanvas.widgets[var0] = null;
               }

               GZipDecompressor.validInterfaces[var0] = false;
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1297107509"
   )
   static int method1621(int var0) {
      MessageNode var1 = (MessageNode)class83.messages.get((long)var0);
      return var1 == null?-1:(var1.previous == class83.field1184.sentinel?-1:((MessageNode)var1.previous).id);
   }
}
