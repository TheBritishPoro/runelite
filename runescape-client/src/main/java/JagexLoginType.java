import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("JagexLoginType")
public class JagexLoginType {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   public static final JagexLoginType field3880;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3876;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3873;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3870;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3874;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3875;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3872;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static final JagexLoginType field3877;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   public static final JagexLoginType field3878;
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1572012483
   )
   public final int field3879;
   @ObfuscatedName("p")
   @Export("identifier")
   final String identifier;

   static {
      field3880 = new JagexLoginType(0, 0, "", "");
      field3876 = new JagexLoginType(2, 1, "", "");
      field3873 = new JagexLoginType(3, 2, "", "");
      field3870 = new JagexLoginType(7, 3, "", "");
      field3874 = new JagexLoginType(6, 4, "", "");
      field3875 = new JagexLoginType(4, 5, "", "");
      field3872 = new JagexLoginType(1, 6, "", "");
      field3877 = new JagexLoginType(8, 7, "", "");
      field3878 = new JagexLoginType(5, -1, "", "", true, new JagexLoginType[]{field3880, field3876, field3873, field3874, field3870});
   }

   JagexLoginType(int var1, int var2, String var3, String var4) {
      this.field3879 = var1;
      this.identifier = var4;
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/String;Ljava/lang/String;Z[Llm;)V"
   )
   JagexLoginType(int var1, int var2, String var3, String var4, boolean var5, JagexLoginType[] var6) {
      this.field3879 = var1;
      this.identifier = var4;
   }

   public String toString() {
      return this.identifier;
   }
}
