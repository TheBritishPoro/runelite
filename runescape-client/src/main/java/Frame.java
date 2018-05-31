import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Frame")
public class Frame {
   @ObfuscatedName("z")
   static int[] field1551;
   @ObfuscatedName("w")
   static int[] field1543;
   @ObfuscatedName("s")
   static int[] field1544;
   @ObfuscatedName("l")
   static int[] field1545;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   @Export("skin")
   FrameMap skin;
   @ObfuscatedName("q")
   @Export("transformCount")
   int transformCount;
   @ObfuscatedName("k")
   @Export("transformTypes")
   int[] transformTypes;
   @ObfuscatedName("i")
   @Export("translator_x")
   int[] translator_x;
   @ObfuscatedName("x")
   @Export("translator_y")
   int[] translator_y;
   @ObfuscatedName("e")
   @Export("translator_z")
   int[] translator_z;
   @ObfuscatedName("p")
   @Export("showing")
   boolean showing;

   static {
      field1551 = new int[500];
      field1543 = new int[500];
      field1544 = new int[500];
      field1545 = new int[500];
   }

   @ObfuscatedSignature(
      signature = "([BLdt;)V"
   )
   Frame(byte[] var1, FrameMap var2) {
      this.skin = null;
      this.transformCount = -1;
      this.showing = false;
      this.skin = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var5 + var3.offset;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if(var9 > 0) {
            if(this.skin.types[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.skin.types[var10] == 0) {
                     field1551[var7] = var10;
                     field1543[var7] = 0;
                     field1544[var7] = 0;
                     field1545[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1551[var7] = var8;
            short var11 = 0;
            if(this.skin.types[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field1543[var7] = var4.readShortSmart();
            } else {
               field1543[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field1544[var7] = var4.readShortSmart();
            } else {
               field1544[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field1545[var7] = var4.readShortSmart();
            } else {
               field1545[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.skin.types[var8] == 5) {
               this.showing = true;
            }
         }
      }

      if(var1.length != var4.offset) {
         throw new RuntimeException();
      } else {
         this.transformCount = var7;
         this.transformTypes = new int[var7];
         this.translator_x = new int[var7];
         this.translator_y = new int[var7];
         this.translator_z = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.transformTypes[var8] = field1551[var8];
            this.translator_x[var8] = field1543[var8];
            this.translator_y[var8] = field1544[var8];
            this.translator_z[var8] = field1545[var8];
         }

      }
   }
}
