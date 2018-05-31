import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class284 extends NameableContainer {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final JagexLoginType field3615;

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   public class284(JagexLoginType var1) {
      super(400);
      this.field3615 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Nameable vmethod5461() {
      return new Ignore();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Nameable[] vmethod5462(int var1) {
      return new Ignore[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "777447956"
   )
   public void method5317(Buffer var1, int var2) {
      while(true) {
         if(var1.offset < var2) {
            int var3 = var1.readUnsignedByte();
            boolean var4 = (var3 & 1) == 1;
            Name var5 = new Name(var1.readString(), this.field3615);
            Name var6 = new Name(var1.readString(), this.field3615);
            var1.readString();
            if(var5 != null && var5.isCleanNameValid()) {
               Ignore var7 = (Ignore)this.method5331(var5);
               if(var4) {
                  Ignore var8 = (Ignore)this.method5331(var6);
                  if(var8 != null && var8 != var7) {
                     if(var7 != null) {
                        this.method5334(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(var7 != null) {
                  this.method5338(var7, var5, var6);
                  continue;
               }

               if(this.getCount() < 400) {
                  int var9 = this.getCount();
                  var7 = (Ignore)this.method5335(var5, var6);
                  var7.field3624 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BI)Lll;",
      garbageValue = "105126678"
   )
   public static final SpritePixels method5324(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new SpritePixels(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new SpritePixels(0, 0);
   }
}
