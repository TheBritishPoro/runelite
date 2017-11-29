import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class273 {
   @ObfuscatedName("d")
   @Export("cp1252AsciiExtension")
   public static final char[] cp1252AsciiExtension;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   @Export("skin_ref")
   static IndexDataBase skin_ref;

   static {
      cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   }
}
