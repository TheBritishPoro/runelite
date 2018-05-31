import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class142 extends class283 {
   @ObfuscatedName("z")
   final boolean field1890;

   public class142(boolean var1) {
      this.field1890 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-879071974"
   )
   int method3164(ChatPlayer var1, ChatPlayer var2) {
      if(var1.world != 0) {
         if(var2.world == 0) {
            return this.field1890?-1:1;
         }
      } else if(var2.world != 0) {
         return this.field1890?1:-1;
      }

      return this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3164((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "20"
   )
   static String method3161(String var0, boolean var1) {
      String var2 = var1?"https://":"http://";
      if(Client.socketType == 1) {
         var0 = var0 + "-wtrc";
      } else if(Client.socketType == 2) {
         var0 = var0 + "-wtqa";
      } else if(Client.socketType == 3) {
         var0 = var0 + "-wtwip";
      } else if(Client.socketType == 5) {
         var0 = var0 + "-wti";
      } else if(Client.socketType == 4) {
         var0 = "local";
      }

      String var3 = "";
      if(GameSocket.sessionToken != null) {
         var3 = "/p=" + GameSocket.sessionToken;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + Client.languageId + "/a=" + FrameMap.field1709 + var3 + "/";
   }
}
