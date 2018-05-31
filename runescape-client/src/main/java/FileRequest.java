import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("FileRequest")
public class FileRequest extends CacheableNode {
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexMaps")
   static IndexData indexMaps;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("index")
   public IndexData index;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1013760867
   )
   @Export("crc")
   public int crc;
   @ObfuscatedName("s")
   @Export("padding")
   public byte padding;
}
