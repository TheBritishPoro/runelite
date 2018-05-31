import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Task")
public class Task {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   @Export("task")
   Task task;
   @ObfuscatedName("u")
   @Export("status")
   public volatile int status;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1948085191
   )
   @Export("type")
   int type;
   @ObfuscatedName("k")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("i")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("x")
   @Export("value")
   public volatile Object value;

   Task() {
      this.status = 0;
   }
}
