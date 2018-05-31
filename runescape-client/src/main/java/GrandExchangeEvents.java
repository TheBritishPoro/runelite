import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
   @ObfuscatedName("mt")
   @ObfuscatedGetter(
      intValue = -1202584647
   )
   static int field15;
   @ObfuscatedName("w")
   public static Comparator field9;
   @ObfuscatedName("s")
   public static Comparator field13;
   @ObfuscatedName("l")
   public static Comparator field11;
   @ObfuscatedName("u")
   public static Comparator field16;
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "Lkv;"
   )
   @Export("fonts")
   static Fonts fonts;
   @ObfuscatedName("z")
   @Export("events")
   public final List events;

   static {
      field9 = new class7();
      new WorldComparator();
      field13 = new UnitPriceComparator();
      field11 = new class6();
      field16 = new TotalQuantityComparator();
   }

   @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "1"
   )
   public GrandExchangeEvents(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.events = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.events.add(new GrandExchangeEvent(var1, var5, var3));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "48"
   )
   @Export("sort")
   public void sort(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "319934987"
   )
   public static final boolean method8() {
      KeyFocusListener var0 = KeyFocusListener.keyboard;
      synchronized(KeyFocusListener.keyboard) {
         if(KeyFocusListener.field352 == KeyFocusListener.field350) {
            return false;
         } else {
            GameSocket.currentPressedKey = KeyFocusListener.field348[KeyFocusListener.field350];
            KeyFocusListener.currentTypedKey = KeyFocusListener.field346[KeyFocusListener.field350];
            KeyFocusListener.field350 = KeyFocusListener.field350 + 1 & 127;
            return true;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ljv;",
      garbageValue = "1"
   )
   @Export("getOverlayDefinition")
   public static Overlay getOverlayDefinition(int var0) {
      Overlay var1 = (Overlay)Overlay.overlays.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Overlay.overlay_ref.getConfigData(4, var0);
         var1 = new Overlay();
         if(var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.post();
         Overlay.overlays.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhi;I)Ljava/lang/String;",
      garbageValue = "1244240994"
   )
   static String method11(String var0, Widget var1) {
      if(var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if(var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = class137.method3119(var1, var2 - 1);
               String var5;
               if(var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1214880142"
   )
   static final void method13() {
      Client.field828 = Client.cycleCntr;
      class54.field489 = true;
   }
}
