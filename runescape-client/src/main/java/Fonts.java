import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   IndexDataBase field3681;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   IndexDataBase field3679;
   @ObfuscatedName("s")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
   )
   public Fonts(IndexDataBase var1, IndexDataBase var2) {
      this.field3681 = var1;
      this.field3679 = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Lkc;B)Ljava/util/HashMap;",
      garbageValue = "-33"
   )
   @Export("createMap")
   public HashMap createMap(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         FontName var5 = var3[var4];
         if(this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            IndexDataBase var7 = this.field3681;
            IndexDataBase var8 = this.field3679;
            String var9 = var5.field3666;
            int var10 = var7.getFile(var9);
            int var11 = var7.getChild(var10, "");
            Font var6 = MessageNode.method1058(var7, var8, var10, var11);
            if(var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
