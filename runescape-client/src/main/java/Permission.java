import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("Permission")
public enum Permission implements Enumerated {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3125(0, -1, true, false, true),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3119(1, 0, true, true, true),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3121(2, 1, true, true, false),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3120(3, 2, false, false, true),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3122(4, 3, false, false, true),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field3118(5, 10, false, false, true);

   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -609392397
   )
   final int field3124;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1058981555
   )
   public final int field3128;
   @ObfuscatedName("x")
   public final boolean field3126;
   @ObfuscatedName("e")
   public final boolean field3127;

   Permission(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.field3124 = var3;
      this.field3128 = var4;
      this.field3126 = var6;
      this.field3127 = var7;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int rsOrdinal() {
      return this.field3124;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1507833078"
   )
   public static void method4605() {
      if(class250.NetCache_socket != null) {
         class250.NetCache_socket.vmethod3346();
      }

   }
}
