import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Nameable")
public class Nameable implements Comparable {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   @Export("name")
   Name name;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   @Export("prevName")
   Name prevName;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1680166277"
   )
   @Export("getRsName")
   public Name getRsName() {
      return this.name;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "109"
   )
   public String method5288() {
      return this.name == null?"":this.name.getName();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-92"
   )
   public String method5289() {
      return this.prevName == null?"":this.prevName.getName();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)V",
      garbageValue = "224434676"
   )
   @Export("setName")
   void setName(Name var1, Name var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.name = var1;
         this.prevName = var2;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Nameable var1) {
      return this.name.compareCleanName(var1.name);
   }

   public int compareTo(Object var1) {
      return this.vmethod5453((Nameable)var1);
   }
}
