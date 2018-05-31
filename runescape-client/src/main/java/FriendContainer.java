import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("FriendContainer")
public class FriendContainer extends NameableContainer {
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -2042738183
   )
   @Export("myWorldPort")
   static int myWorldPort;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final JagexLoginType field3635;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -720372311
   )
   int field3637;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   public class208 field3639;

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   public FriendContainer(JagexLoginType var1) {
      super(400);
      this.field3637 = 1;
      this.field3639 = new class208();
      this.field3635 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Nameable vmethod5461() {
      return new Friend();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Nameable[] vmethod5462(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "1240127676"
   )
   public boolean method5423(Name var1, boolean var2) {
      Friend var3 = (Friend)this.method5330(var1);
      return var3 == null?false:!var2 || var3.world != 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1284102001"
   )
   public void method5424(Buffer var1, int var2) {
      while(true) {
         if(var1.offset < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            Name var4 = new Name(var1.readString(), this.field3635);
            Name var5 = new Name(var1.readString(), this.field3635);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if(var6 > 0) {
               var1.readString();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readString();
            if(var4 != null && var4.isCleanNameValid()) {
               Friend var11 = (Friend)this.method5331(var4);
               if(var3) {
                  Friend var12 = (Friend)this.method5331(var5);
                  if(var12 != null && var12 != var11) {
                     if(var11 != null) {
                        this.method5334(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if(var11 != null) {
                  this.method5338(var11, var4, var5);
                  if(var6 != var11.world) {
                     boolean var14 = true;

                     for(class294 var13 = (class294)this.field3639.method4111(); var13 != null; var13 = (class294)this.field3639.method4114()) {
                        if(var13.field3662.equals(var4)) {
                           if(var6 != 0 && var13.field3664 == 0) {
                              var13.method4121();
                              var14 = false;
                           } else if(var6 == 0 && var13.field3664 != 0) {
                              var13.method4121();
                              var14 = false;
                           }
                        }
                     }

                     if(var14) {
                        this.field3639.method4112(new class294(var4, var6));
                     }
                  }
               } else {
                  if(this.getCount() >= 400) {
                     continue;
                  }

                  var11 = (Friend)this.method5335(var4, var5);
               }

               if(var6 != var11.world) {
                  var11.field3627 = ++this.field3637 - 1;
                  if(var11.world == -1 && var6 == 0) {
                     var11.field3627 = -(var11.field3627 * -1772374531) * -745943211;
                  }

                  var11.world = var6;
               }

               var11.rank = var7;
               var11.field3648 = var9;
               var11.field3650 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5337();
         return;
      }
   }
}
