import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class313 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   @Export("classInfos")
   public static CombatInfoList classInfos;

   static {
      classInfos = new CombatInfoList();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
      garbageValue = "-36"
   )
   public static void method5714(Applet var0, String var1) {
      class45.field378 = var0;
      if(var1 != null) {
         class45.field379 = var1;
      }

   }
}
