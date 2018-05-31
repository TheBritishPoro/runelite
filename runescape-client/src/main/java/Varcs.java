import java.io.EOFException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1811094485
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("s")
   @Export("varcSerials")
   boolean[] varcSerials;
   @ObfuscatedName("l")
   @Export("varcstringSerials")
   boolean[] varcstringSerials;
   @ObfuscatedName("u")
   @Export("varCInts")
   int[] varCInts;
   @ObfuscatedName("q")
   @Export("varCStrings")
   String[] varCStrings;
   @ObfuscatedName("k")
   @Export("changed")
   boolean changed;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 7130902202106963315L
   )
   long field1177;

   Varcs() {
      this.changed = false;
      this.varCInts = new int[SoundTask.configsIndex.fileCount(19)];
      this.varCStrings = new String[SoundTask.configsIndex.fileCount(15)];
      this.varcSerials = new boolean[this.varCInts.length];

      int var1;
      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         VarCInt var2 = class21.method275(var1);
         this.varcSerials[var1] = var2.field3256;
      }

      this.varcstringSerials = new boolean[this.varCStrings.length];

      for(var1 = 0; var1 < this.varCStrings.length; ++var1) {
         VarCString var3 = GZipDecompressor.method3485(var1);
         this.varcstringSerials[var1] = var3.field3261;
      }

      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         this.varCInts[var1] = -1;
      }

      this.deserialize();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1213879855"
   )
   @Export("putVarc")
   void putVarc(int var1, int var2) {
      this.varCInts[var1] = var2;
      if(this.varcSerials[var1]) {
         this.changed = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "82"
   )
   @Export("getVarc")
   int getVarc(int var1) {
      return this.varCInts[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "541625191"
   )
   @Export("putVarcString")
   void putVarcString(int var1, String var2) {
      this.varCStrings[var1] = var2;
      if(this.varcstringSerials[var1]) {
         this.changed = true;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-2060094389"
   )
   @Export("getVarcString")
   String getVarcString(int var1) {
      return this.varCStrings[var1];
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "60637204"
   )
   @Export("reset")
   void reset() {
      int var1;
      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         if(!this.varcSerials[var1]) {
            this.varCInts[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.varCStrings.length; ++var1) {
         if(!this.varcstringSerials[var1]) {
            this.varCStrings[var1] = null;
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ZI)Ldv;",
      garbageValue = "-1191303198"
   )
   @Export("getVarPrefs")
   FileOnDisk getVarPrefs(boolean var1) {
      return MapLabel.getPreferencesFile("2", ItemLayer.field1455.name, var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   @Export("serialize")
   void serialize() {
      FileOnDisk var1 = this.getVarPrefs(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.varCInts.length; ++var4) {
            if(this.varcSerials[var4] && this.varCInts[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.varCStrings.length; ++var5) {
            if(this.varcstringSerials[var5] && this.varCStrings[var5] != null) {
               var2 += 2 + class316.getLength(this.varCStrings[var5]);
               ++var4;
            }
         }

         Buffer var9 = new Buffer(var2);
         var9.putByte(1);
         var9.putShort(var3);

         int var6;
         for(var6 = 0; var6 < this.varCInts.length; ++var6) {
            if(this.varcSerials[var6] && this.varCInts[var6] != -1) {
               var9.putShort(var6);
               var9.putInt(this.varCInts[var6]);
            }
         }

         var9.putShort(var4);

         for(var6 = 0; var6 < this.varCStrings.length; ++var6) {
            if(this.varcstringSerials[var6] && this.varCStrings[var6] != null) {
               var9.putShort(var6);
               var9.putString(this.varCStrings[var6]);
            }
         }

         var1.write(var9.payload, 0, var9.offset);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.close();
         } catch (Exception var16) {
            ;
         }

      }

      this.changed = false;
      this.field1177 = Buffer.method3547();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-505500629"
   )
   @Export("deserialize")
   void deserialize() {
      FileOnDisk var1 = this.getVarPrefs(false);

      label190: {
         try {
            byte[] var2 = new byte[(int)var1.length()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.read(var2, var3, var2.length - var3);
               if(var4 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var13 = new Buffer(var2);
            if(var13.payload.length - var13.offset >= 1) {
               int var14 = var13.readUnsignedByte();
               if(var14 < 0 || var14 > 1) {
                  return;
               }

               int var15 = var13.readUnsignedShort();

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var15; ++var7) {
                  var8 = var13.readUnsignedShort();
                  var9 = var13.readInt();
                  if(this.varcSerials[var8]) {
                     this.varCInts[var8] = var9;
                  }
               }

               var7 = var13.readUnsignedShort();
               var8 = 0;

               while(true) {
                  if(var8 >= var7) {
                     break label190;
                  }

                  var9 = var13.readUnsignedShort();
                  String var10 = var13.readString();
                  if(this.varcstringSerials[var9]) {
                     this.varCStrings[var9] = var10;
                  }

                  ++var8;
               }
            }
         } catch (Exception var24) {
            break label190;
         } finally {
            try {
               var1.close();
            } catch (Exception var23) {
               ;
            }

         }

         return;
      }

      this.changed = false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-196804596"
   )
   @Export("process")
   void process() {
      if(this.changed && this.field1177 < Buffer.method3547() - 60000L) {
         this.serialize();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "9220"
   )
   @Export("changed")
   boolean changed() {
      return this.changed;
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670209353"
   )
   static final void method1894() {
      if(class13.plane != Client.field651) {
         Client.field651 = class13.plane;
         int var0 = class13.plane;
         int[] var1 = NPC.minimapSprite.pixels;
         int var2 = var1.length;

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            var1[var3] = 0;
         }

         int var4;
         int var5;
         for(var3 = 1; var3 < 103; ++var3) {
            var4 = (103 - var3) * 2048 + 24628;

            for(var5 = 1; var5 < 103; ++var5) {
               if((class50.tileSettings[var0][var5][var3] & 24) == 0) {
                  MapIcon.region.drawTile(var1, var4, 512, var0, var5, var3);
               }

               if(var0 < 3 && (class50.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
                  MapIcon.region.drawTile(var1, var4, 512, var0 + 1, var5, var3);
               }

               var4 += 4;
            }
         }

         var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         NPC.minimapSprite.setRaster();

         int var6;
         for(var5 = 1; var5 < 103; ++var5) {
            for(var6 = 1; var6 < 103; ++var6) {
               if((class50.tileSettings[var0][var6][var5] & 24) == 0) {
                  class224.drawObject(var0, var6, var5, var3, var4);
               }

               if(var0 < 3 && (class50.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
                  class224.drawObject(var0 + 1, var6, var5, var3, var4);
               }
            }
         }

         Client.field724 = 0;

         for(var5 = 0; var5 < 104; ++var5) {
            for(var6 = 0; var6 < 104; ++var6) {
               long var7 = MapIcon.region.method2901(class13.plane, var5, var6);
               if(0L != var7) {
                  int var9 = KeyFocusListener.method673(var7);
                  int var10 = FileOnDisk.getObjectDefinition(var9).mapIconId;
                  if(var10 >= 0) {
                     Client.mapIcons[Client.field724] = Area.mapAreaType[var10].getMapIcon(false);
                     Client.field805[Client.field724] = var5;
                     Client.field806[Client.field724] = var6;
                     ++Client.field724;
                  }
               }
            }
         }

         GameSocket.rasterProvider.setRaster();
      }

   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-3"
   )
   static void method1921(int var0, int var1) {
      PacketNode var2 = class26.method433(ClientPacket.field2158, Client.field626.field1218);
      var2.packetBuffer.method3687(var0);
      var2.packetBuffer.method3583(var1);
      Client.field626.method1980(var2);
   }
}
