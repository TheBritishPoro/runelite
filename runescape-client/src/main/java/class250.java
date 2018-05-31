import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class250 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   @Export("NetCache_socket")
   public static class157 NetCache_socket;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1110937007
   )
   public static int field3197;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -5739275915681687991L
   )
   public static long field3203;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static HashTable NetCache_pendingPriorityWrites;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1165925
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static HashTable NetCache_pendingPriorityResponses;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1214867787
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lgo;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static Node2LinkedList NetCache_pendingWritesQueue;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("NetCache_pendingWrites")
   static HashTable NetCache_pendingWrites;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 351524551
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("NetCache_pendingResponses")
   public static HashTable NetCache_pendingResponses;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -887226239
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lig;"
   )
   @Export("currentRequest")
   public static FileRequest currentRequest;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 2092860897
   )
   public static int field3210;
   @ObfuscatedName("o")
   @Export("NetCache_crc")
   public static CRC32 NetCache_crc;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lic;"
   )
   @Export("NetCache_indexCaches")
   public static IndexData[] NetCache_indexCaches;
   @ObfuscatedName("j")
   public static byte field3213;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 42575595
   )
   public static int field3214;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1264842351
   )
   public static int field3215;

   static {
      field3197 = 0;
      NetCache_pendingPriorityWrites = new HashTable(4096);
      NetCache_pendingPriorityWritesCount = 0;
      NetCache_pendingPriorityResponses = new HashTable(32);
      NetCache_pendingPriorityResponsesCount = 0;
      NetCache_pendingWritesQueue = new Node2LinkedList();
      NetCache_pendingWrites = new HashTable(4096);
      NetCache_pendingWritesCount = 0;
      NetCache_pendingResponses = new HashTable(4096);
      NetCache_pendingResponsesCount = 0;
      NetCache_responseHeaderBuffer = new Buffer(8);
      field3210 = 0;
      NetCache_crc = new CRC32();
      NetCache_indexCaches = new IndexData[256];
      field3213 = 0;
      field3214 = 0;
      field3215 = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;I)V",
      garbageValue = "1897264020"
   )
   public static void method4766(IndexDataBase var0, IndexDataBase var1, IndexDataBase var2) {
      class267.field3367 = var0;
      class267.field3348 = var1;
      class139.field1877 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "-365895890"
   )
   public static char method4770(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }
}
