import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("MachineInfo")
public class MachineInfo extends Node {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -438996515
   )
   @Export("osType")
   int osType;
   @ObfuscatedName("k")
   @Export("os64Bit")
   boolean os64Bit;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -778326201
   )
   @Export("osVersionType")
   int osVersionType;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1703178915
   )
   @Export("javaVendorType")
   int javaVendorType;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2041961125
   )
   @Export("javaVersionMajor")
   int javaVersionMajor;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1684217887
   )
   @Export("javaVersionMinor")
   int javaVersionMinor;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 546169143
   )
   @Export("javaVersionPatch")
   int javaVersionPatch;
   @ObfuscatedName("ac")
   boolean field3891;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1784732867
   )
   @Export("maxMemoryMB")
   int maxMemoryMB;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 170995375
   )
   int field3902;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -397278319
   )
   int field3906;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 7624373
   )
   int field3904;
   @ObfuscatedName("ae")
   String field3905;
   @ObfuscatedName("az")
   String field3914;
   @ObfuscatedName("aq")
   String field3907;
   @ObfuscatedName("ad")
   String field3908;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2092428531
   )
   int field3909;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1126186449
   )
   int field3910;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1538474183
   )
   int field3889;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 351520139
   )
   int field3912;
   @ObfuscatedName("ag")
   String field3913;
   @ObfuscatedName("bk")
   String field3894;
   @ObfuscatedName("bp")
   int[] field3915;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1130492829
   )
   int field3916;

   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public MachineInfo(boolean var1) {
      this.field3915 = new int[3];
      if(ContextMenuRow.osNameLC.startsWith("win")) {
         this.osType = 1;
      } else if(ContextMenuRow.osNameLC.startsWith("mac")) {
         this.osType = 2;
      } else if(ContextMenuRow.osNameLC.startsWith("linux")) {
         this.osType = 3;
      } else {
         this.osType = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var13) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var12) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var11) {
         ;
      }

      if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         this.os64Bit = false;
      } else {
         this.os64Bit = true;
      }

      if(this.osType == 1) {
         if(var3.indexOf("4.0") != -1) {
            this.osVersionType = 1;
         } else if(var3.indexOf("4.1") != -1) {
            this.osVersionType = 2;
         } else if(var3.indexOf("4.9") != -1) {
            this.osVersionType = 3;
         } else if(var3.indexOf("5.0") != -1) {
            this.osVersionType = 4;
         } else if(var3.indexOf("5.1") != -1) {
            this.osVersionType = 5;
         } else if(var3.indexOf("5.2") != -1) {
            this.osVersionType = 8;
         } else if(var3.indexOf("6.0") != -1) {
            this.osVersionType = 6;
         } else if(var3.indexOf("6.1") != -1) {
            this.osVersionType = 7;
         } else if(var3.indexOf("6.2") != -1) {
            this.osVersionType = 9;
         } else if(var3.indexOf("6.3") != -1) {
            this.osVersionType = 10;
         } else if(var3.indexOf("10.0") != -1) {
            this.osVersionType = 11;
         }
      } else if(this.osType == 2) {
         if(var3.indexOf("10.4") != -1) {
            this.osVersionType = 20;
         } else if(var3.indexOf("10.5") != -1) {
            this.osVersionType = 21;
         } else if(var3.indexOf("10.6") != -1) {
            this.osVersionType = 22;
         } else if(var3.indexOf("10.7") != -1) {
            this.osVersionType = 23;
         } else if(var3.indexOf("10.8") != -1) {
            this.osVersionType = 24;
         } else if(var3.indexOf("10.9") != -1) {
            this.osVersionType = 25;
         } else if(var3.indexOf("10.10") != -1) {
            this.osVersionType = 26;
         } else if(var3.indexOf("10.11") != -1) {
            this.osVersionType = 27;
         }
      }

      if(var4.toLowerCase().indexOf("sun") != -1) {
         this.javaVendorType = 1;
      } else if(var4.toLowerCase().indexOf("microsoft") != -1) {
         this.javaVendorType = 2;
      } else if(var4.toLowerCase().indexOf("apple") != -1) {
         this.javaVendorType = 3;
      } else if(var4.toLowerCase().indexOf("oracle") != -1) {
         this.javaVendorType = 5;
      } else {
         this.javaVendorType = 4;
      }

      int var9 = 2;
      int var7 = 0;

      char var8;
      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if(var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - '0');
            ++var9;
         }
      } catch (Exception var16) {
         ;
      }

      this.javaVersionMajor = var7;
      var9 = var5.indexOf(46, 2) + 1;
      var7 = 0;

      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if(var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - '0');
            ++var9;
         }
      } catch (Exception var15) {
         ;
      }

      this.javaVersionMinor = var7;
      var9 = var5.indexOf(95, 4) + 1;
      var7 = 0;

      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if(var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - '0');
            ++var9;
         }
      } catch (Exception var14) {
         ;
      }

      this.javaVersionPatch = var7;
      this.field3891 = false;
      Runtime.getRuntime();
      this.maxMemoryMB = (int)((long)((new Random()).nextInt(31457280) + 230686720) / 1048576L) + 1;
      if(this.javaVersionMajor > 3) {
         this.field3902 = Runtime.getRuntime().availableProcessors();
      } else {
         this.field3902 = 0;
      }

      this.field3906 = 0;
      if(this.field3905 == null) {
         this.field3905 = "";
      }

      if(this.field3914 == null) {
         this.field3914 = "";
      }

      if(this.field3907 == null) {
         this.field3907 = "";
      }

      if(this.field3908 == null) {
         this.field3908 = "";
      }

      if(this.field3913 == null) {
         this.field3913 = "";
      }

      if(this.field3894 == null) {
         this.field3894 = "";
      }

      this.method6211();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-5446469"
   )
   void method6211() {
      if(this.field3905.length() > 40) {
         this.field3905 = this.field3905.substring(0, 40);
      }

      if(this.field3914.length() > 40) {
         this.field3914 = this.field3914.substring(0, 40);
      }

      if(this.field3907.length() > 10) {
         this.field3907 = this.field3907.substring(0, 10);
      }

      if(this.field3908.length() > 10) {
         this.field3908 = this.field3908.substring(0, 10);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;S)V",
      garbageValue = "8212"
   )
   public void method6217(Buffer var1) {
      var1.putByte(6);
      var1.putByte(this.osType);
      var1.putByte(this.os64Bit?1:0);
      var1.putByte(this.osVersionType);
      var1.putByte(this.javaVendorType);
      var1.putByte(this.javaVersionMajor);
      var1.putByte(this.javaVersionMinor);
      var1.putByte(this.javaVersionPatch);
      var1.putByte(this.field3891?1:0);
      var1.putShort(this.maxMemoryMB);
      var1.putByte(this.field3902);
      var1.put24bitInt(this.field3906);
      var1.putShort(this.field3904);
      var1.putJagString(this.field3905);
      var1.putJagString(this.field3914);
      var1.putJagString(this.field3907);
      var1.putJagString(this.field3908);
      var1.putByte(this.field3910);
      var1.putShort(this.field3909);
      var1.putJagString(this.field3913);
      var1.putJagString(this.field3894);
      var1.putByte(this.field3889);
      var1.putByte(this.field3912);

      for(int var2 = 0; var2 < this.field3915.length; ++var2) {
         var1.putInt(this.field3915[var2]);
      }

      var1.putInt(this.field3916);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-782378364"
   )
   public int method6215() {
      byte var1 = 38;
      String var4 = this.field3905;
      int var3 = var4.length() + 2;
      int var20 = var3 + var1;
      String var7 = this.field3914;
      int var6 = var7.length() + 2;
      var20 += var6;
      String var10 = this.field3907;
      int var9 = var10.length() + 2;
      var20 += var9;
      String var13 = this.field3908;
      int var12 = var13.length() + 2;
      var20 += var12;
      String var16 = this.field3913;
      int var15 = var16.length() + 2;
      var20 += var15;
      String var19 = this.field3894;
      int var18 = var19.length() + 2;
      var20 += var18;
      return var20;
   }
}
