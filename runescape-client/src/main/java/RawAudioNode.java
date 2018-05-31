import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("RawAudioNode")
public class RawAudioNode extends AbstractIntegerNode0 {
   @ObfuscatedName("z")
   @Export("sampleRate")
   public int sampleRate;
   @ObfuscatedName("w")
   @Export("audioBuffer")
   public byte[] audioBuffer;
   @ObfuscatedName("s")
   @Export("startPosition")
   public int startPosition;
   @ObfuscatedName("l")
   @Export("endPosition")
   int endPosition;
   @ObfuscatedName("u")
   public boolean field1281;

   RawAudioNode(int var1, byte[] var2, int var3, int var4) {
      this.sampleRate = var1;
      this.audioBuffer = var2;
      this.startPosition = var3;
      this.endPosition = var4;
   }

   RawAudioNode(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.sampleRate = var1;
      this.audioBuffer = var2;
      this.startPosition = var3;
      this.endPosition = var4;
      this.field1281 = var5;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lcu;)Lct;"
   )
   @Export("applyResampler")
   public RawAudioNode applyResampler(Resampler var1) {
      this.audioBuffer = var1.resampleIfNecessary(this.audioBuffer);
      this.sampleRate = var1.method2240(this.sampleRate);
      if(this.startPosition == this.endPosition) {
         this.startPosition = this.endPosition = var1.method2241(this.startPosition);
      } else {
         this.startPosition = var1.method2241(this.startPosition);
         this.endPosition = var1.method2241(this.endPosition);
         if(this.startPosition == this.endPosition) {
            --this.startPosition;
         }
      }

      return this;
   }
}
