import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("z")
   @Export("params")
   Object[] params;
   @ObfuscatedName("w")
   @Export("boolean1")
   boolean boolean1;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   @Export("source")
   Widget source;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1049191845
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1598662979
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 879102033
   )
   @Export("op")
   int op;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   @Export("target")
   Widget target;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1181936113
   )
   @Export("typedKeyCode")
   int typedKeyCode;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1478440877
   )
   @Export("typedKeyChar")
   int typedKeyChar;
   @ObfuscatedName("e")
   @Export("opbase")
   String opbase;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1140422785
   )
   int field514;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 285302449
   )
   int field515;

   public ScriptEvent() {
      this.field515 = 76;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;B)V",
      garbageValue = "-106"
   )
   public void method1024(Object[] var1) {
      this.params = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-529454320"
   )
   public void method1025(int var1) {
      this.field515 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1438520718"
   )
   static void method1030(boolean var0) {
      class78.loginMessage1 = "";
      class78.loginMessage2 = "Enter your username/email & password.";
      class78.loginMessage3 = "";
      class78.loginIndex = 2;
      if(var0) {
         class78.password = "";
      }

      if(class78.username == null || class78.username.length() <= 0) {
         if(class10.preferences.rememberedUsername != null) {
            class78.username = class10.preferences.rememberedUsername;
            class78.Login_isUsernameRemembered = true;
         } else {
            class78.Login_isUsernameRemembered = false;
         }
      }

      class34.method586();
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "54"
   )
   static final void method1031(String var0) {
      if(var0.equalsIgnoreCase("toggleroof")) {
         class10.preferences.hideRoofs = !class10.preferences.hideRoofs;
         class54.method1018();
         if(class10.preferences.hideRoofs) {
            class143.sendGameMessage(99, "", "Roofs are now all hidden");
         } else {
            class143.sendGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if(var0.equalsIgnoreCase("displayfps")) {
         Client.displayFps = !Client.displayFps;
      }

      if(var0.equalsIgnoreCase("renderself")) {
         Client.field699 = !Client.field699;
      }

      if(var0.equalsIgnoreCase("mouseovertext")) {
         Client.field728 = !Client.field728;
      }

      if(Client.rights >= 2) {
         if(var0.equalsIgnoreCase("showcoord")) {
            ItemContainer.renderOverview.field3839 = !ItemContainer.renderOverview.field3839;
         }

         if(var0.equalsIgnoreCase("fpson")) {
            Client.displayFps = true;
         }

         if(var0.equalsIgnoreCase("fpsoff")) {
            Client.displayFps = false;
         }

         if(var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(var0.equalsIgnoreCase("clientdrop")) {
            WorldMapManager.method516();
         }
      }

      PacketNode var1 = class26.method433(ClientPacket.field2187, Client.field626.field1218);
      var1.packetBuffer.putByte(var0.length() + 1);
      var1.packetBuffer.putString(var0);
      Client.field626.method1980(var1);
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Lhi;Ljt;IIZI)V",
      garbageValue = "-2096518256"
   )
   static final void method1027(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if(var5 != null && var5[var3] != null) {
         if(var3 == 0) {
            var6 = 33;
         } else if(var3 == 1) {
            var6 = 34;
         } else if(var3 == 2) {
            var6 = 35;
         } else if(var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if(var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if(var6 != -1 && var7 != null) {
         BuildType.method4612(var7, class6.getColTags(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
      }

   }
}
