import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("WorldMapType3")
public class WorldMapType3 implements WorldMapSectionBase {
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   @Export("clanMemberManager")
   static ClanMemberManager clanMemberManager;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 892739819
   )
   static int field104;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1521413561
   )
   int field100;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1962269323
   )
   int field90;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1724489905
   )
   int field91;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -691106019
   )
   int field102;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1912646943
   )
   int field93;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1042718987
   )
   int field96;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -476751
   )
   int field95;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -129967555
   )
   int field105;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -892770797
   )
   int field97;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1390874549
   )
   int field98;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -495225415
   )
   int field99;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1910350211
   )
   int field89;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2005192815
   )
   int field101;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -57751229
   )
   int field103;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
   )
   public void vmethod635(WorldMapData var1) {
      if(var1.minX > this.field93) {
         var1.minX = this.field93;
      }

      if(var1.field167 < this.field93) {
         var1.field167 = this.field93;
      }

      if(var1.minY > this.field96) {
         var1.minY = this.field96;
      }

      if(var1.field162 < this.field96) {
         var1.field162 = this.field96;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
   )
   public boolean containsCoord(int var1, int var2, int var3) {
      return var1 >= this.field100 && var1 < this.field90 + this.field100?var2 >= (this.field91 << 6) + (this.field95 << 3) && var2 <= (this.field91 << 6) + (this.field97 << 3) + 7 && var3 >= (this.field102 << 6) + (this.field105 << 3) && var3 <= (this.field102 << 6) + (this.field98 << 3) + 7:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
   )
   public boolean vmethod637(int var1, int var2) {
      return var1 >= (this.field93 << 6) + (this.field99 << 3) && var1 <= (this.field93 << 6) + (this.field101 << 3) + 7 && var2 >= (this.field96 << 6) + (this.field89 << 3) && var2 <= (this.field96 << 6) + (this.field103 << 3) + 7;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
   )
   public int[] vmethod638(int var1, int var2, int var3) {
      if(!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field93 * 64 - this.field91 * 64 + var2 + (this.field99 * 8 - this.field95 * 8), var3 + (this.field96 * 64 - this.field102 * 64) + (this.field89 * 8 - this.field105 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
   )
   public Coordinates vmethod659(int var1, int var2) {
      if(!this.vmethod637(var1, var2)) {
         return null;
      } else {
         int var3 = this.field91 * 64 - this.field93 * 64 + (this.field95 * 8 - this.field99 * 8) + var1;
         int var4 = this.field102 * 64 - this.field96 * 64 + var2 + (this.field105 * 8 - this.field89 * 8);
         return new Coordinates(this.field100, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   public void vmethod639(Buffer var1) {
      this.field100 = var1.readUnsignedByte();
      this.field90 = var1.readUnsignedByte();
      this.field91 = var1.readUnsignedShort();
      this.field95 = var1.readUnsignedByte();
      this.field97 = var1.readUnsignedByte();
      this.field102 = var1.readUnsignedShort();
      this.field105 = var1.readUnsignedByte();
      this.field98 = var1.readUnsignedByte();
      this.field93 = var1.readUnsignedShort();
      this.field99 = var1.readUnsignedByte();
      this.field101 = var1.readUnsignedByte();
      this.field96 = var1.readUnsignedShort();
      this.field89 = var1.readUnsignedByte();
      this.field103 = var1.readUnsignedByte();
      this.method121();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "87"
   )
   void method121() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ljp;",
      garbageValue = "46"
   )
   public static class267 method123(int var0) {
      class267 var1 = (class267)class267.field3349.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class267.field3367.getConfigData(32, var0);
         var1 = new class267();
         if(var2 != null) {
            var1.method4990(new Buffer(var2));
         }

         class267.field3349.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1981801988"
   )
   static int method139(int var0, Script var1, boolean var2) {
      if(var0 == 5000) {
         class69.intStack[++class69.intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if(var0 == 5001) {
         class69.intStackSize -= 3;
         Client.publicChatMode = class69.intStack[class69.intStackSize];
         class143.field1899 = PacketBuffer.method3847(class69.intStack[class69.intStackSize + 1]);
         if(class143.field1899 == null) {
            class143.field1899 = class307.field3734;
         }

         Client.field795 = class69.intStack[class69.intStackSize + 2];
         PacketNode var22 = class26.method433(ClientPacket.field2192, Client.field626.field1218);
         var22.packetBuffer.putByte(Client.publicChatMode);
         var22.packetBuffer.putByte(class143.field1899.field3735);
         var22.packetBuffer.putByte(Client.field795);
         Client.field626.method1980(var22);
         return 1;
      } else {
         String var3;
         int var4;
         int var5;
         if(var0 == 5002) {
            var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
            class69.intStackSize -= 2;
            var4 = class69.intStack[class69.intStackSize];
            var5 = class69.intStack[class69.intStackSize + 1];
            PacketNode var15 = class26.method433(ClientPacket.field2185, Client.field626.field1218);
            var15.packetBuffer.putByte(class316.getLength(var3) + 2);
            var15.packetBuffer.putString(var3);
            var15.packetBuffer.putByte(var4 - 1);
            var15.packetBuffer.putByte(var5);
            Client.field626.method1980(var15);
            return 1;
         } else {
            int var10;
            if(var0 == 5003) {
               class69.intStackSize -= 2;
               var10 = class69.intStack[class69.intStackSize];
               var4 = class69.intStack[class69.intStackSize + 1];
               ChatLineBuffer var6 = (ChatLineBuffer)class83.chatLineMap.get(Integer.valueOf(var10));
               MessageNode var17 = var6.getMessage(var4);
               if(var17 != null) {
                  class69.intStack[++class69.intStackSize - 1] = var17.id;
                  class69.intStack[++class69.intStackSize - 1] = var17.tick;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var17.name != null?var17.name:"";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var17.sender != null?var17.sender:"";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var17.value != null?var17.value:"";
                  class69.intStack[++class69.intStackSize - 1] = var17.method1040()?1:(var17.method1043()?2:0);
               } else {
                  class69.intStack[++class69.intStackSize - 1] = -1;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.intStack[++class69.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 5004) {
               var10 = class69.intStack[--class69.intStackSize];
               MessageNode var19 = OwnWorldComparator.method1130(var10);
               if(var19 != null) {
                  class69.intStack[++class69.intStackSize - 1] = var19.type;
                  class69.intStack[++class69.intStackSize - 1] = var19.tick;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var19.name != null?var19.name:"";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var19.sender != null?var19.sender:"";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var19.value != null?var19.value:"";
                  class69.intStack[++class69.intStackSize - 1] = var19.method1040()?1:(var19.method1043()?2:0);
               } else {
                  class69.intStack[++class69.intStackSize - 1] = -1;
                  class69.intStack[++class69.intStackSize - 1] = 0;
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
                  class69.intStack[++class69.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 5005) {
               if(class143.field1899 == null) {
                  class69.intStack[++class69.intStackSize - 1] = -1;
               } else {
                  class69.intStack[++class69.intStackSize - 1] = class143.field1899.field3735;
               }

               return 1;
            } else if(var0 == 5008) {
               var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
               var4 = class69.intStack[--class69.intStackSize];
               String var16 = var3.toLowerCase();
               byte var21 = 0;
               if(var16.startsWith("yellow:")) {
                  var21 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if(var16.startsWith("red:")) {
                  var21 = 1;
                  var3 = var3.substring("red:".length());
               } else if(var16.startsWith("green:")) {
                  var21 = 2;
                  var3 = var3.substring("green:".length());
               } else if(var16.startsWith("cyan:")) {
                  var21 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if(var16.startsWith("purple:")) {
                  var21 = 4;
                  var3 = var3.substring("purple:".length());
               } else if(var16.startsWith("white:")) {
                  var21 = 5;
                  var3 = var3.substring("white:".length());
               } else if(var16.startsWith("flash1:")) {
                  var21 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if(var16.startsWith("flash2:")) {
                  var21 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if(var16.startsWith("flash3:")) {
                  var21 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if(var16.startsWith("glow1:")) {
                  var21 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if(var16.startsWith("glow2:")) {
                  var21 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if(var16.startsWith("glow3:")) {
                  var21 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if(Client.languageId != 0) {
                  if(var16.startsWith("yellow:")) {
                     var21 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if(var16.startsWith("red:")) {
                     var21 = 1;
                     var3 = var3.substring("red:".length());
                  } else if(var16.startsWith("green:")) {
                     var21 = 2;
                     var3 = var3.substring("green:".length());
                  } else if(var16.startsWith("cyan:")) {
                     var21 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if(var16.startsWith("purple:")) {
                     var21 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if(var16.startsWith("white:")) {
                     var21 = 5;
                     var3 = var3.substring("white:".length());
                  } else if(var16.startsWith("flash1:")) {
                     var21 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if(var16.startsWith("flash2:")) {
                     var21 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if(var16.startsWith("flash3:")) {
                     var21 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if(var16.startsWith("glow1:")) {
                     var21 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if(var16.startsWith("glow2:")) {
                     var21 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if(var16.startsWith("glow3:")) {
                     var21 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var16 = var3.toLowerCase();
               byte var7 = 0;
               if(var16.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if(var16.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if(var16.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if(var16.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if(var16.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if(Client.languageId != 0) {
                  if(var16.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if(var16.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if(var16.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if(var16.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if(var16.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               PacketNode var8 = class26.method433(ClientPacket.field2179, Client.field626.field1218);
               var8.packetBuffer.putByte(0);
               int var9 = var8.packetBuffer.offset;
               var8.packetBuffer.putByte(var4);
               var8.packetBuffer.putByte(var21);
               var8.packetBuffer.putByte(var7);
               PacketBuffer.method3840(var8.packetBuffer, var3);
               var8.packetBuffer.method3545(var8.packetBuffer.offset - var9);
               Client.field626.method1980(var8);
               return 1;
            } else {
               int var13;
               if(var0 == 5009) {
                  WidgetNode.scriptStringStackSize -= 2;
                  var3 = class69.scriptStringStack[WidgetNode.scriptStringStackSize];
                  String var18 = class69.scriptStringStack[WidgetNode.scriptStringStackSize + 1];
                  PacketNode var11 = class26.method433(ClientPacket.field2154, Client.field626.field1218);
                  var11.packetBuffer.putShort(0);
                  var13 = var11.packetBuffer.offset;
                  var11.packetBuffer.putString(var3);
                  PacketBuffer.method3840(var11.packetBuffer, var18);
                  var11.packetBuffer.method3614(var11.packetBuffer.offset - var13);
                  Client.field626.method1980(var11);
                  return 1;
               } else if(var0 != 5015) {
                  if(var0 == 5016) {
                     class69.intStack[++class69.intStackSize - 1] = Client.field795;
                     return 1;
                  } else {
                     int[] var12;
                     if(var0 == 5017) {
                        var10 = class69.intStack[--class69.intStackSize];
                        var12 = class69.intStack;
                        var5 = ++class69.intStackSize - 1;
                        ChatLineBuffer var20 = (ChatLineBuffer)class83.chatLineMap.get(Integer.valueOf(var10));
                        if(var20 == null) {
                           var13 = 0;
                        } else {
                           var13 = var20.size();
                        }

                        var12[var5] = var13;
                        return 1;
                     } else if(var0 == 5018) {
                        var10 = class69.intStack[--class69.intStackSize];
                        class69.intStack[++class69.intStackSize - 1] = Preferences.method1621(var10);
                        return 1;
                     } else if(var0 == 5019) {
                        var10 = class69.intStack[--class69.intStackSize];
                        var12 = class69.intStack;
                        var5 = ++class69.intStackSize - 1;
                        MessageNode var14 = (MessageNode)class83.messages.get((long)var10);
                        if(var14 == null) {
                           var13 = -1;
                        } else if(var14.next == class83.field1184.sentinel) {
                           var13 = -1;
                        } else {
                           var13 = ((MessageNode)var14.next).id;
                        }

                        var12[var5] = var13;
                        return 1;
                     } else if(var0 == 5020) {
                        var3 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize];
                        ScriptEvent.method1031(var3);
                        return 1;
                     } else if(var0 == 5021) {
                        Client.field796 = class69.scriptStringStack[--WidgetNode.scriptStringStackSize].toLowerCase().trim();
                        return 1;
                     } else if(var0 == 5022) {
                        class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = Client.field796;
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               } else {
                  if(class138.localPlayer != null && class138.localPlayer.name != null) {
                     var3 = class138.localPlayer.name.getName();
                  } else {
                     var3 = "";
                  }

                  class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3;
                  return 1;
               }
            }
         }
      }
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "16"
   )
   @Export("flush")
   static final void flush(boolean var0) {
      class54.method1017();
      ++Client.field626.field1224;
      if(Client.field626.field1224 >= 50 || var0) {
         Client.field626.field1224 = 0;
         if(!Client.socketError && Client.field626.getSocket() != null) {
            PacketNode var1 = class26.method433(ClientPacket.field2211, Client.field626.field1218);
            Client.field626.method1980(var1);

            try {
               Client.field626.method1979();
            } catch (IOException var3) {
               Client.socketError = true;
            }
         }

      }
   }
}
