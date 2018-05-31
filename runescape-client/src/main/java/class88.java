import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class88 extends TaskDataNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Deque field1229;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Deque field1230;
   @ObfuscatedName("l")
   int field1231;
   @ObfuscatedName("u")
   int field1232;

   public class88() {
      this.field1229 = new Deque();
      this.field1230 = new Deque();
      this.field1231 = 0;
      this.field1232 = -1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method2032(TaskDataNode var1) {
      this.field1229.addTail(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method2009(TaskDataNode var1) {
      var1.unlink();
   }

   @ObfuscatedName("s")
   void method2010() {
      if(this.field1231 > 0) {
         for(class100 var1 = (class100)this.field1230.getFront(); var1 != null; var1 = (class100)this.field1230.getNext()) {
            var1.field1338 -= this.field1231;
         }

         this.field1232 -= this.field1231;
         this.field1231 = 0;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;Lcz;)V"
   )
   void method2011(Node var1, class100 var2) {
      while(this.field1230.head != var1 && ((class100)var1).field1338 <= var2.field1338) {
         var1 = var1.next;
      }

      Deque.method4075(var2, var1);
      this.field1232 = ((class100)this.field1230.head.next).field1338;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lcz;)V"
   )
   void method2008(class100 var1) {
      var1.unlink();
      var1.method2231();
      Node var2 = this.field1230.head.next;
      if(var2 == this.field1230.head) {
         this.field1232 = -1;
      } else {
         this.field1232 = ((class100)var2).field1338;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod4382() {
      return (TaskDataNode)this.field1229.getFront();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod4389() {
      return (TaskDataNode)this.field1229.getNext();
   }

   @ObfuscatedName("x")
   protected int vmethod4395() {
      return 0;
   }

   @ObfuscatedName("e")
   public final synchronized void vmethod4385(int[] var1, int var2, int var3) {
      do {
         if(this.field1232 < 0) {
            this.method2042(var1, var2, var3);
            return;
         }

         if(var3 + this.field1231 < this.field1232) {
            this.field1231 += var3;
            this.method2042(var1, var2, var3);
            return;
         }

         int var4 = this.field1232 - this.field1231;
         this.method2042(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1231 += var4;
         this.method2010();
         class100 var5 = (class100)this.field1230.getFront();
         synchronized(var5) {
            int var7 = var5.method2232();
            if(var7 < 0) {
               var5.field1338 = 0;
               this.method2008(var5);
            } else {
               var5.field1338 = var7;
               this.method2011(var5.next, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("p")
   void method2042(int[] var1, int var2, int var3) {
      for(TaskDataNode var4 = (TaskDataNode)this.field1229.getFront(); var4 != null; var4 = (TaskDataNode)this.field1229.getNext()) {
         var4.method2439(var1, var2, var3);
      }

   }

   @ObfuscatedName("b")
   public final synchronized void vmethod4386(int var1) {
      do {
         if(this.field1232 < 0) {
            this.method2025(var1);
            return;
         }

         if(this.field1231 + var1 < this.field1232) {
            this.field1231 += var1;
            this.method2025(var1);
            return;
         }

         int var2 = this.field1232 - this.field1231;
         this.method2025(var2);
         var1 -= var2;
         this.field1231 += var2;
         this.method2010();
         class100 var3 = (class100)this.field1230.getFront();
         synchronized(var3) {
            int var5 = var3.method2232();
            if(var5 < 0) {
               var3.field1338 = 0;
               this.method2008(var3);
            } else {
               var3.field1338 = var5;
               this.method2011(var3.next, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("n")
   void method2025(int var1) {
      for(TaskDataNode var2 = (TaskDataNode)this.field1229.getFront(); var2 != null; var2 = (TaskDataNode)this.field1229.getNext()) {
         var2.vmethod4386(var1);
      }

   }
}
