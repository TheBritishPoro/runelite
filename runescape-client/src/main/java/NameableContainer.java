import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("NameableContainer")
public abstract class NameableContainer {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -115006045
   )
   final int field3620;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2097572835
   )
   @Export("count")
   int count;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ljx;"
   )
   @Export("nameables")
   Nameable[] nameables;
   @ObfuscatedName("k")
   HashMap field3618;
   @ObfuscatedName("i")
   HashMap field3622;
   @ObfuscatedName("x")
   Comparator field3621;

   NameableContainer(int var1) {
      this.count = 0;
      this.field3621 = null;
      this.field3620 = var1;
      this.nameables = this.vmethod5462(var1);
      this.field3618 = new HashMap(var1 / 8);
      this.field3622 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   abstract Nameable vmethod5461();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   abstract Nameable[] vmethod5462(int var1);

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1666752471"
   )
   public void method5326() {
      this.count = 0;
      Arrays.fill(this.nameables, (Object)null);
      this.field3618.clear();
      this.field3622.clear();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "821008449"
   )
   @Export("getCount")
   public int getCount() {
      return this.count;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-546371351"
   )
   public boolean method5328() {
      return this.field3620 == this.count;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1323034650"
   )
   @Export("isMember")
   public boolean isMember(Name var1) {
      return !var1.isCleanNameValid()?false:(this.field3618.containsKey(var1)?true:this.field3622.containsKey(var1));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-1029474979"
   )
   public Nameable method5330(Name var1) {
      Nameable var2 = this.method5331(var1);
      return var2 != null?var2:this.method5390(var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-520899073"
   )
   Nameable method5331(Name var1) {
      return !var1.isCleanNameValid()?null:(Nameable)this.field3618.get(var1);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-2122724226"
   )
   Nameable method5390(Name var1) {
      return !var1.isCleanNameValid()?null:(Nameable)this.field3622.get(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-630765365"
   )
   public final boolean method5393(Name var1) {
      Nameable var2 = this.method5331(var1);
      if(var2 == null) {
         return false;
      } else {
         this.method5334(var2);
         return true;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-570676385"
   )
   final void method5334(Nameable var1) {
      int var2 = this.method5339(var1);
      if(var2 != -1) {
         this.method5343(var2);
         this.method5395(var1);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "261191446"
   )
   Nameable method5377(Name var1) {
      return this.method5335(var1, (Name)null);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)Ljx;",
      garbageValue = "2051302762"
   )
   Nameable method5335(Name var1, Name var2) {
      if(this.method5331(var1) != null) {
         throw new IllegalStateException();
      } else {
         Nameable var3 = this.vmethod5461();
         var3.setName(var1, var2);
         this.method5341(var3);
         this.method5342(var3);
         return var3;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IB)Ljx;",
      garbageValue = "99"
   )
   @Export("get")
   public final Nameable get(int var1) {
      if(var1 >= 0 && var1 < this.count) {
         return this.nameables[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1076089262"
   )
   public final void method5337() {
      if(this.field3621 == null) {
         Arrays.sort(this.nameables, 0, this.count);
      } else {
         Arrays.sort(this.nameables, 0, this.count, this.field3621);
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljx;Lkm;Lkm;B)V",
      garbageValue = "15"
   )
   final void method5338(Nameable var1, Name var2, Name var3) {
      this.method5395(var1);
      var1.setName(var2, var3);
      this.method5342(var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "1"
   )
   final int method5339(Nameable var1) {
      for(int var2 = 0; var2 < this.count; ++var2) {
         if(this.nameables[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-1961233435"
   )
   final void method5395(Nameable var1) {
      if(this.field3618.remove(var1.name) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.prevName != null) {
            this.field3622.remove(var1.prevName);
         }

      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "234221683"
   )
   final void method5341(Nameable var1) {
      this.nameables[++this.count - 1] = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-914048201"
   )
   final void method5342(Nameable var1) {
      this.field3618.put(var1.name, var1);
      if(var1.prevName != null) {
         Nameable var2 = (Nameable)this.field3622.put(var1.prevName, var1);
         if(var2 != null && var2 != var1) {
            var2.prevName = null;
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1797268727"
   )
   final void method5343(int var1) {
      --this.count;
      if(var1 < this.count) {
         System.arraycopy(this.nameables, var1 + 1, this.nameables, var1, this.count - var1);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "20160"
   )
   public final void method5346() {
      this.field3621 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;B)V",
      garbageValue = "-105"
   )
   public final void method5347(Comparator var1) {
      if(this.field3621 == null) {
         this.field3621 = var1;
      } else if(this.field3621 instanceof class283) {
         ((class283)this.field3621).method5307(var1);
      }

   }
}
