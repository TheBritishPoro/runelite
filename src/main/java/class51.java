import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("au")
public class class51 extends class68 {
   @ObfuscatedName("x")
   Deque field985 = new Deque();
   @ObfuscatedName("j")
   Deque field986 = new Deque();
   @ObfuscatedName("c")
   int field987 = 0;
   @ObfuscatedName("d")
   int field988 = -1;

   @ObfuscatedName("j")
   public final synchronized void method993(class68 var1) {
      var1.unlink();
   }

   @ObfuscatedName("d")
   void method995(Node var1, class61 var2) {
      while(var1 != this.field986.head && ((class61)var1).field1094 <= var2.field1094) {
         var1 = var1.next;
      }

      Deque.method2441(var2, var1);
      this.field988 = ((class61)this.field986.head.next).field1094;
   }

   @ObfuscatedName("u")
   protected class68 vmethod2723() {
      return (class68)this.field985.method2448();
   }

   @ObfuscatedName("y")
   protected class68 vmethod2724() {
      return (class68)this.field985.method2445();
   }

   @ObfuscatedName("e")
   protected int vmethod2725() {
      return 0;
   }

   @ObfuscatedName("q")
   public final synchronized void vmethod2726(int[] var1, int var2, int var3) {
      do {
         if(this.field988 < 0) {
            this.method1006(var1, var2, var3);
            return;
         }

         if(this.field987 + var3 < this.field988) {
            this.field987 += var3;
            this.method1006(var1, var2, var3);
            return;
         }

         int var4 = this.field988 - this.field987;
         this.method1006(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field987 += var4;
         this.method1030();
         class61 var5 = (class61)this.field986.method2448();
         synchronized(var5) {
            int var7 = var5.method1229(this);
            if(var7 < 0) {
               var5.field1094 = 0;
               this.method1016(var5);
            } else {
               var5.field1094 = var7;
               this.method995(var5.next, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("x")
   public final synchronized void method1001(class68 var1) {
      this.field985.method2444(var1);
   }

   @ObfuscatedName("l")
   public final synchronized void vmethod2729(int var1) {
      do {
         if(this.field988 < 0) {
            this.method1003(var1);
            return;
         }

         if(this.field987 + var1 < this.field988) {
            this.field987 += var1;
            this.method1003(var1);
            return;
         }

         int var2 = this.field988 - this.field987;
         this.method1003(var2);
         var1 -= var2;
         this.field987 += var2;
         this.method1030();
         class61 var3 = (class61)this.field986.method2448();
         synchronized(var3) {
            int var5 = var3.method1229(this);
            if(var5 < 0) {
               var3.field1094 = 0;
               this.method1016(var3);
            } else {
               var3.field1094 = var5;
               this.method995(var3.next, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("s")
   void method1003(int var1) {
      for(class68 var2 = (class68)this.field985.method2448(); var2 != null; var2 = (class68)this.field985.method2445()) {
         var2.vmethod2729(var1);
      }

   }

   @ObfuscatedName("v")
   void method1006(int[] var1, int var2, int var3) {
      for(class68 var4 = (class68)this.field985.method2448(); var4 != null; var4 = (class68)this.field985.method2445()) {
         var4.method1423(var1, var2, var3);
      }

   }

   @ObfuscatedName("w")
   void method1016(class61 var1) {
      var1.unlink();
      var1.method1230();
      Node var2 = this.field986.head.next;
      if(var2 == this.field986.head) {
         this.field988 = -1;
      } else {
         this.field988 = ((class61)var2).field1094;
      }

   }

   @ObfuscatedName("c")
   void method1030() {
      if(this.field987 > 0) {
         for(class61 var1 = (class61)this.field986.method2448(); var1 != null; var1 = (class61)this.field986.method2445()) {
            var1.field1094 -= this.field987;
         }

         this.field988 -= this.field987;
         this.field987 = 0;
      }

   }
}
