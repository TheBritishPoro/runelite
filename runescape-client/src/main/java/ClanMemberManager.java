import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("ClanMemberManager")
public class ClanMemberManager extends NameableContainer {
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final JagexLoginType field3656;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   final class288 field3652;
   @ObfuscatedName("e")
   public String field3654;
   @ObfuscatedName("p")
   public String field3655;
   @ObfuscatedName("b")
   public byte field3651;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1049775565
   )
   public int field3657;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1251671567
   )
   int field3658;

   @ObfuscatedSignature(
      signature = "(Llm;Lke;)V"
   )
   public ClanMemberManager(JagexLoginType var1, class288 var2) {
      super(100);
      this.field3654 = null;
      this.field3655 = null;
      this.field3658 = 1;
      this.field3656 = var1;
      this.field3652 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Nameable vmethod5461() {
      return new ClanMember();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Nameable[] vmethod5462(int var1) {
      return new ClanMember[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "191342442"
   )
   final void method5477(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if(var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if(var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if(var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if(var5 >= 177917621779460413L) {
            break;
         }
      }

      while(var5 % 37L == 0L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = PacketNode.method3457(var5);
      if(var10 == null) {
         var10 = "";
      }

      this.field3654 = var10;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1517543240"
   )
   final void method5464(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if(var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if(var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if(var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if(var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = PacketNode.method3457(var5);
      if(var10 == null) {
         var10 = "";
      }

      this.field3655 = var10;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-107804510"
   )
   public final void method5463(Buffer var1) {
      this.method5464(var1.readString());
      long var2 = var1.readLong();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(var2 % 37L == 0L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; 0L != var8; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(var5 != 0L) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class303.field3720[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method5477(var4);
      this.field3651 = var1.readByte();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method5326();

         for(int var13 = 0; var13 < var7; ++var13) {
            ClanMember var9 = (ClanMember)this.method5377(new Name(var1.readString(), this.field3656));
            int var14 = var1.readUnsignedShort();
            var9.method5412(var14, ++this.field3658 - 1);
            var9.rank = var1.readByte();
            var1.readString();
            this.method5482(var9);
         }

      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "345415230"
   )
   public final void method5489(Buffer var1) {
      Name var2 = new Name(var1.readString(), this.field3656);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.readByte();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      ClanMember var6;
      if(var5) {
         if(this.getCount() == 0) {
            return;
         }

         var6 = (ClanMember)this.method5331(var2);
         if(var6 != null && var6.method5414() == var3) {
            this.method5334(var6);
         }
      } else {
         var1.readString();
         var6 = (ClanMember)this.method5331(var2);
         if(var6 == null) {
            if(this.getCount() > super.field3620) {
               return;
            }

            var6 = (ClanMember)this.method5377(var2);
         }

         var6.method5412(var3, ++this.field3658 - 1);
         var6.rank = var4;
         this.method5482(var6);
      }

   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-54"
   )
   public final void method5467() {
      for(int var1 = 0; var1 < this.getCount(); ++var1) {
         ((ClanMember)this.get(var1)).method5272();
      }

   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "453420624"
   )
   public final void method5468() {
      for(int var1 = 0; var1 < this.getCount(); ++var1) {
         ((ClanMember)this.get(var1)).method5273();
      }

   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "(Ljz;I)V",
      garbageValue = "-1325604678"
   )
   final void method5482(ClanMember var1) {
      if(var1.getRsName().equals(this.field3652.vmethod5420())) {
         this.field3657 = var1.rank;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "-34"
   )
   public static boolean method5496(char var0) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 != 0) {
            char[] var1 = class301.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if(var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
