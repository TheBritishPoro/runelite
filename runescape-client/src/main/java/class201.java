import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public final class class201 {
   @ObfuscatedName("z")
   int field2410;
   @ObfuscatedName("w")
   int field2411;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   IterableHashTable field2412;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   IterableDualNodeQueue field2413;

   public class201(int var1, int var2) {
      this.field2413 = new IterableDualNodeQueue();
      this.field2410 = var1;
      this.field2411 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2412 = new IterableHashTable(var3);
   }

   @ObfuscatedName("z")
   public Object method3997(long var1) {
      class212 var3 = (class212)this.field2412.get(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4137();
         if(var4 == null) {
            var3.unlink();
            var3.unlinkDual();
            this.field2411 += var3.field2439;
            return null;
         } else {
            if(var3.vmethod4136()) {
               class196 var5 = new class196(var4, var3.field2439);
               this.field2412.put(var5, var3.hash);
               this.field2413.add(var5);
               var5.field2428 = 0L;
               var3.unlink();
               var3.unlinkDual();
            } else {
               this.field2413.add(var3);
               var3.field2428 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("w")
   void method3993(long var1) {
      class212 var3 = (class212)this.field2412.get(var1);
      this.method3996(var3);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhh;)V"
   )
   void method3996(class212 var1) {
      if(var1 != null) {
         var1.unlink();
         var1.unlinkDual();
         this.field2411 += var1.field2439;
      }

   }

   @ObfuscatedName("l")
   public void method4007(Object var1, long var2) {
      this.method3998(var1, var2, 1);
   }

   @ObfuscatedName("u")
   public void method3998(Object var1, long var2, int var4) {
      if(var4 > this.field2410) {
         throw new IllegalStateException();
      } else {
         this.method3993(var2);
         this.field2411 -= var4;

         while(this.field2411 < 0) {
            class212 var5 = (class212)this.field2413.method4156();
            this.method3996(var5);
         }

         class196 var6 = new class196(var1, var4);
         this.field2412.put(var6, var2);
         this.field2413.add(var6);
         var6.field2428 = 0L;
      }
   }

   @ObfuscatedName("q")
   public void method3999(int var1) {
      for(class212 var2 = (class212)this.field2413.method4177(); var2 != null; var2 = (class212)this.field2413.method4159()) {
         if(var2.vmethod4136()) {
            if(var2.vmethod4137() == null) {
               var2.unlink();
               var2.unlinkDual();
               this.field2411 += var2.field2439;
            }
         } else if(++var2.field2428 > (long)var1) {
            class207 var3 = new class207(var2.vmethod4137(), var2.field2439);
            this.field2412.put(var3, var2.hash);
            Node2LinkedList.method3909(var3, var2);
            var2.unlink();
            var2.unlinkDual();
         }
      }

   }

   @ObfuscatedName("i")
   public void method4006() {
      this.field2413.clear();
      this.field2412.clear();
      this.field2411 = this.field2410;
   }
}
