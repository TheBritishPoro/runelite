import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3484(1, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3479(0, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3481(2, 2);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1528745209
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1338680937
   )
   final int field3483;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.field3483 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field3483;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "1922127141"
   )
   @Export("getNpcDefinition")
   public static NPCComposition getNpcDefinition(int var0) {
      NPCComposition var1 = (NPCComposition)NPCComposition.npcs.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_indexCache.getConfigData(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         NPCComposition.npcs.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZZI)V",
      garbageValue = "-1107846037"
   )
   public static void method5156(String var0, boolean var1, boolean var2) {
      MessageNode.method1053(var0, var1, "openjs", var2);
   }
}
