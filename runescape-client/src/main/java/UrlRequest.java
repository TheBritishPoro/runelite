import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UrlRequest")
public class UrlRequest {
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   @Export("mapedge")
   static SpritePixels mapedge;
   @ObfuscatedName("z")
   @Export("url")
   final URL url;
   @ObfuscatedName("w")
   @Export("isDone0")
   volatile boolean isDone0;
   @ObfuscatedName("s")
   @Export("response0")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.url = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "3647"
   )
   @Export("isDone")
   public boolean isDone() {
      return this.isDone0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "228107899"
   )
   @Export("getResponse")
   public byte[] getResponse() {
      return this.response0;
   }
}
