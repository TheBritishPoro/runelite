import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class98 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 866276291
   )
   static int field1335;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("sfx_index")
   IndexDataBase sfx_index;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("vorbis_index")
   IndexDataBase vorbis_index;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   HashTable field1332;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   HashTable field1333;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
   )
   public class98(IndexDataBase var1, IndexDataBase var2) {
      this.field1332 = new HashTable(256);
      this.field1333 = new HashTable(256);
      this.sfx_index = var1;
      this.vorbis_index = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II[IB)Lct;",
      garbageValue = "0"
   )
   RawAudioNode method2223(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      RawAudioNode var7 = (RawAudioNode)this.field1333.get(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var8 = SoundEffect.getTrack(this.sfx_index, var1, var2);
         if(var8 == null) {
            return null;
         } else {
            var7 = var8.method2069();
            this.field1333.put(var7, var5);
            if(var3 != null) {
               var3[0] -= var7.audioBuffer.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II[II)Lct;",
      garbageValue = "70852076"
   )
   RawAudioNode method2218(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      RawAudioNode var7 = (RawAudioNode)this.field1333.get(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class92 var8 = (class92)this.field1332.get(var5);
         if(var8 == null) {
            var8 = class92.getInstrument(this.vorbis_index, var1, var2);
            if(var8 == null) {
               return null;
            }

            this.field1332.put(var8, var5);
         }

         var7 = var8.method2083(var3);
         if(var7 == null) {
            return null;
         } else {
            var8.unlink();
            this.field1333.put(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "2090805346"
   )
   public RawAudioNode method2216(int var1, int[] var2) {
      if(this.sfx_index.size() == 1) {
         return this.method2223(0, var1, var2);
      } else if(this.sfx_index.fileCount(var1) == 1) {
         return this.method2223(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "1187754020"
   )
   public RawAudioNode method2220(int var1, int[] var2) {
      if(this.vorbis_index.size() == 1) {
         return this.method2218(0, var1, var2);
      } else if(this.vorbis_index.fileCount(var1) == 1) {
         return this.method2218(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }
}
