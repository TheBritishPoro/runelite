import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("FriendManager")
public class FriendManager {
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 973416531
   )
   static int field978;
   @ObfuscatedName("fu")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   @Export("jagexLoginType")
   final JagexLoginType jagexLoginType;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkf;"
   )
   @Export("friendContainer")
   public final FriendContainer friendContainer;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   @Export("ignoreContainer")
   public final class284 ignoreContainer;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1943530059
   )
   int field976;

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   FriendManager(JagexLoginType var1) {
      this.field976 = 0;
      this.jagexLoginType = var1;
      this.friendContainer = new FriendContainer(var1);
      this.ignoreContainer = new class284(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2083457181"
   )
   boolean method1624() {
      return this.field976 == 2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1458971090"
   )
   final void method1625() {
      this.field976 = 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2029618051"
   )
   final void method1679(Buffer var1, int var2) {
      this.friendContainer.method5424(var1, var2);
      this.field976 = 2;
      ItemContainer.method1012();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "916911588"
   )
   final void method1627() {
      for(class294 var1 = (class294)this.friendContainer.field3639.method4111(); var1 != null; var1 = (class294)this.friendContainer.field3639.method4114()) {
         if((long)var1.field3665 < Buffer.method3547() / 1000L - 5L) {
            if(var1.field3664 > 0) {
               class143.sendGameMessage(5, "", var1.field3662 + " has logged in.");
            }

            if(var1.field3664 == 0) {
               class143.sendGameMessage(5, "", var1.field3662 + " has logged out.");
            }

            var1.method4121();
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-746063861"
   )
   final void method1628() {
      this.field976 = 0;
      this.friendContainer.method5326();
      this.ignoreContainer.method5326();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "-1961233435"
   )
   @Export("isFriended")
   final boolean isFriended(Name var1, boolean var2) {
      return var1 == null?false:(var1.equals(class138.localPlayer.name)?true:this.friendContainer.method5423(var1, var2));
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1614375319"
   )
   @Export("isIgnored")
   final boolean isIgnored(Name var1) {
      return var1 == null?false:this.ignoreContainer.isMember(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "25"
   )
   @Export("addToFriendsList")
   final void addToFriendsList(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.isCleanNameValid()) {
            Object var10000;
            String var4;
            if(this.isFriendsListFull()) {
               var10000 = null;
               var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
               class143.sendGameMessage(30, "", var4);
            } else if(class138.localPlayer.name.equals(var2)) {
               var10000 = null;
               var4 = "You can\'t add yourself to your own friend list";
               class143.sendGameMessage(30, "", var4);
            } else if(this.isFriended(var2, false)) {
               WorldMapDecorationType.method4588(var1);
            } else if(this.isIgnored(var2)) {
               ScriptState.method995(var1);
            } else {
               PacketNode var3 = class26.method433(ClientPacket.field2194, Client.field626.field1218);
               var3.packetBuffer.putByte(class316.getLength(var1));
               var3.packetBuffer.putString(var1);
               Client.field626.method1980(var3);
            }
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1546113149"
   )
   @Export("isFriendsListFull")
   final boolean isFriendsListFull() {
      return this.friendContainer.method5328() || this.friendContainer.getCount() >= 200 && Client.field698 != 1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   @Export("addToIgnoreList")
   final void addToIgnoreList(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.isCleanNameValid()) {
            if(this.method1634()) {
               MapIcon.method475();
            } else {
               StringBuilder var10000;
               String var4;
               if(class138.localPlayer.name.equals(var2)) {
                  var10000 = null;
                  var4 = "You can\'t add yourself to your own ignore list";
                  class143.sendGameMessage(30, "", var4);
               } else if(this.isIgnored(var2)) {
                  class21.method271(var1);
               } else if(this.isFriended(var2, false)) {
                  var10000 = new StringBuilder();
                  Object var10001 = null;
                  var10000 = var10000.append("Please remove ").append(var1);
                  var10001 = null;
                  var4 = var10000.append(" from your friend list first").toString();
                  class143.sendGameMessage(30, "", var4);
               } else {
                  PacketNode var3 = class26.method433(ClientPacket.field2221, Client.field626.field1218);
                  var3.packetBuffer.putByte(class316.getLength(var1));
                  var3.packetBuffer.putString(var1);
                  Client.field626.method1980(var3);
               }
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "128"
   )
   final boolean method1634() {
      return this.ignoreContainer.method5328() || this.ignoreContainer.getCount() >= 100 && Client.field698 != 1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-434645488"
   )
   @Export("removeFriend")
   final void removeFriend(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.isCleanNameValid()) {
            if(this.friendContainer.method5393(var2)) {
               Client.field647 = Client.cycleCntr;
               PacketNode var3 = class26.method433(ClientPacket.field2203, Client.field626.field1218);
               var3.packetBuffer.putByte(class316.getLength(var1));
               var3.packetBuffer.putString(var1);
               Client.field626.method1980(var3);
            }

            ItemContainer.method1012();
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-636186966"
   )
   final void method1636(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.isCleanNameValid()) {
            if(this.ignoreContainer.method5393(var2)) {
               Client.field647 = Client.cycleCntr;
               PacketNode var3 = class26.method433(ClientPacket.field2157, Client.field626.field1218);
               var3.packetBuffer.putByte(class316.getLength(var1));
               var3.packetBuffer.putString(var1);
               Client.field626.method1980(var3);
            }

            GameEngine.method910();
            if(WorldMapType3.clanMemberManager != null) {
               WorldMapType3.clanMemberManager.method5468();
            }

         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "1644898931"
   )
   final boolean method1637(Name var1) {
      Friend var2 = (Friend)this.friendContainer.method5330(var1);
      return var2 != null && var2.method5415();
   }

   @ObfuscatedName("z")
   public static boolean method1683(long var0) {
      boolean var2 = var0 != 0L;
      if(var2) {
         boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
         var2 = !var3;
      }

      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;IIS)I",
      garbageValue = "-17706"
   )
   static int method1668(IterableHashTable var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         IntegerNode var3 = (IntegerNode)var0.get((long)var1);
         return var3 == null?var2:var3.value;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1734020068"
   )
   public static void method1685(int var0, int var1) {
      Varbit var3 = (Varbit)Varbit.varbits.get((long)var0);
      Varbit var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = Varbit.varbit_ref.getConfigData(14, var0);
         var3 = new Varbit();
         if(var8 != null) {
            var3.decode(new Buffer(var8));
         }

         Varbit.varbits.put(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.configId;
      int var5 = var2.leastSignificantBit;
      int var6 = var2.mostSignificantBit;
      int var7 = class225.varpsMasks[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class225.clientVarps[var4] = class225.clientVarps[var4] & ~var7 | var1 << var5 & var7;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lly;B)V",
      garbageValue = "-7"
   )
   static final void method1682(IndexedSprite var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < AbstractByteBuffer.field2367.length; ++var2) {
         AbstractByteBuffer.field2367[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         AbstractByteBuffer.field2367[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class81.field1169[var5] = (AbstractByteBuffer.field2367[var5 - 128] + AbstractByteBuffer.field2367[var5 + 1] + AbstractByteBuffer.field2367[var5 + 128] + AbstractByteBuffer.field2367[var5 - 1]) / 4;
            }
         }

         int[] var8 = AbstractByteBuffer.field2367;
         AbstractByteBuffer.field2367 = class81.field1169;
         class81.field1169 = var8;
      }

      if(var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.height; ++var3) {
            for(var4 = 0; var4 < var0.width; ++var4) {
               if(var0.pixels[var2++] != 0) {
                  var5 = var4 + var0.offsetX + 16;
                  int var6 = var3 + var0.offsetY + 16;
                  int var7 = var5 + (var6 << 7);
                  AbstractByteBuffer.field2367[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1786186478"
   )
   static void method1655() {
      int var0 = class81.playerIndexesCount;
      int[] var1 = class81.playerIndices;

      for(int var2 = 0; var2 < var0; ++var2) {
         if(var1[var2] != Client.field707 && var1[var2] != Client.localInteractingIndex) {
            class11.method98(Client.cachedPlayers[var1[var2]], true);
         }
      }

   }
}
