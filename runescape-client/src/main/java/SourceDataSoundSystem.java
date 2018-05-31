import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("SourceDataSoundSystem")
public class SourceDataSoundSystem extends AbstractSoundSystem {
   @ObfuscatedName("z")
   @Export("audioFormat")
   AudioFormat audioFormat;
   @ObfuscatedName("w")
   @Export("source")
   SourceDataLine source;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1571871947
   )
   @Export("size")
   int size;
   @ObfuscatedName("l")
   @Export("bytes")
   byte[] bytes;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2015063069"
   )
   protected void vmethod2176() {
      this.audioFormat = new AudioFormat((float)AbstractSoundSystem.sampleRate, 16, AbstractSoundSystem.audioHighMemory?2:1, true, false);
      this.bytes = new byte[256 << (AbstractSoundSystem.audioHighMemory?2:1)];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "255"
   )
   @Export("create")
   protected void create(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.audioFormat, var1 << (AbstractSoundSystem.audioHighMemory?2:1));
         this.source = (SourceDataLine)AudioSystem.getLine(var2);
         this.source.open();
         this.source.start();
         this.size = var1;
      } catch (LineUnavailableException var5) {
         int var4 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765);
         var4 = (var4 >>> 2 & 858993459) + (var4 & 858993459);
         var4 = (var4 >>> 4) + var4 & 252645135;
         var4 += var4 >>> 8;
         var4 += var4 >>> 16;
         int var3 = var4 & 255;
         if(var3 != 1) {
            this.create(class146.nextPowerOfTwo(var1));
         } else {
            this.source = null;
            throw var5;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "83"
   )
   @Export("size")
   protected int size() {
      return this.size - (this.source.available() >> (AbstractSoundSystem.audioHighMemory?2:1));
   }

   @ObfuscatedName("l")
   @Export("write")
   protected void write() {
      int var1 = 256;
      if(AbstractSoundSystem.audioHighMemory) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.samples[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.bytes[var2 * 2] = (byte)(var3 >> 8);
         this.bytes[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.source.write(this.bytes, 0, var1 << 1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1323448603"
   )
   @Export("close")
   protected void close() {
      if(this.source != null) {
         this.source.close();
         this.source = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047206903"
   )
   @Export("flush")
   protected void flush() {
      this.source.flush();
   }
}
