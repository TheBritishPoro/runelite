import java.util.Calendar;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class69 {
   @ObfuscatedName("s")
   @Export("scriptLocalInts")
   static int[] scriptLocalInts;
   @ObfuscatedName("u")
   static int[] field1000;
   @ObfuscatedName("q")
   @Export("SHAPE_VERTICES")
   static int[][] SHAPE_VERTICES;
   @ObfuscatedName("k")
   @Export("intStack")
   static int[] intStack;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1961233435
   )
   @Export("intStackSize")
   static int intStackSize;
   @ObfuscatedName("x")
   @Export("scriptStringStack")
   static String[] scriptStringStack;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lci;"
   )
   @Export("task")
   static SoundTask task;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 335313073
   )
   @Export("scriptStackCount")
   static int scriptStackCount;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "[Lag;"
   )
   @Export("scriptStack")
   static ScriptState[] scriptStack;
   @ObfuscatedName("g")
   static Calendar field1007;
   @ObfuscatedName("m")
   static final String[] field998;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 362550241
   )
   static int field1009;

   static {
      field1000 = new int[5];
      SHAPE_VERTICES = new int[5][5000];
      intStack = new int[1000];
      scriptStringStack = new String[1000];
      scriptStackCount = 0;
      scriptStack = new ScriptState[50];
      field1007 = Calendar.getInstance();
      field998 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      field1009 = 0;
   }
}
