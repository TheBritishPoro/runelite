import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class234 {
   @ObfuscatedName("w")
   public static final boolean[] field2780;
   @ObfuscatedName("s")
   public static int[] field2779;

   static {
      field2780 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
      field2779 = new int[99];
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field2779[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1543629382"
   )
   static void method4590() {
      class78.username = class78.username.trim();
      if(class78.username.length() == 0) {
         GrandExchangeEvent.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = Client.method1535();
         byte var0;
         if(0L == var1) {
            var0 = 5;
         } else {
            String var4 = class78.username;
            Random var5 = new Random();
            Buffer var6 = new Buffer(128);
            Buffer var7 = new Buffer(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.putByte(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.putInt(var5.nextInt());
            }

            var6.putInt(var8[0]);
            var6.putInt(var8[1]);
            var6.putLong(var1);
            var6.putLong(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.putInt(var5.nextInt());
            }

            var6.encryptRsa(class73.field1039, class73.field1044);
            var7.putByte(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.putInt(var5.nextInt());
            }

            var7.putLong(var5.nextLong());
            var7.method3584(var5.nextLong());
            if(Client.field620 != null) {
               var7.putBytes(Client.field620, 0, Client.field620.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  class155.randomDat.seek(0L);
                  class155.randomDat.read(var10);

                  int var11;
                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                     ;
                  }

                  if(var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var31) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var7.putBytes(var10, 0, var10.length);
            }

            var7.putLong(var5.nextLong());
            var7.encryptRsa(class73.field1039, class73.field1044);
            var9 = class316.getLength(var4);
            if(var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Buffer var32 = new Buffer(var9);
            var32.putString(var4);
            var32.offset = var9;
            var32.encryptXtea2(var8);
            Buffer var22 = new Buffer(var7.offset + var6.offset + var32.offset + 5);
            var22.putByte(2);
            var22.putByte(var6.offset);
            var22.putBytes(var6.payload, 0, var6.offset);
            var22.putByte(var7.offset);
            var22.putBytes(var7.payload, 0, var7.offset);
            var22.putShort(var32.offset);
            var22.putBytes(var32.payload, 0, var32.offset);
            byte[] var13 = var22.payload;
            int var15 = var13.length;
            StringBuilder var16 = new StringBuilder();

            int var19;
            for(int var17 = 0; var17 < var15 + 0; var17 += 3) {
               int var18 = var13[var17] & 255;
               var16.append(class304.field3722[var18 >>> 2]);
               if(var17 < var15 - 1) {
                  var19 = var13[var17 + 1] & 255;
                  var16.append(class304.field3722[(var18 & 3) << 4 | var19 >>> 4]);
                  if(var17 < var15 - 2) {
                     int var20 = var13[var17 + 2] & 255;
                     var16.append(class304.field3722[(var19 & 15) << 2 | var20 >>> 6]).append(class304.field3722[var20 & 63]);
                  } else {
                     var16.append(class304.field3722[(var19 & 15) << 2]).append("=");
                  }
               } else {
                  var16.append(class304.field3722[(var18 & 3) << 4]).append("==");
               }
            }

            String var14 = var16.toString();
            var14 = var14;

            byte var3;
            try {
               URL var25 = new URL(class142.method3161("services", false) + "m=accountappeal/login.ws");
               URLConnection var33 = var25.openConnection();
               var33.setDoInput(true);
               var33.setDoOutput(true);
               var33.setConnectTimeout(5000);
               OutputStreamWriter var26 = new OutputStreamWriter(var33.getOutputStream());
               var26.write("data2=" + class304.method5634(var14) + "&dest=" + class304.method5634("passwordchoice.ws"));
               var26.flush();
               InputStream var27 = var33.getInputStream();
               var22 = new Buffer(new byte[1000]);

               while(true) {
                  var19 = var27.read(var22.payload, var22.offset, 1000 - var22.offset);
                  if(var19 == -1) {
                     var26.close();
                     var27.close();
                     String var28 = new String(var22.payload);
                     if(var28.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if(var28.startsWith("WRONG")) {
                        var3 = 7;
                     } else if(var28.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if(var28.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var22.decryptXtea(var8);

                        while(var22.offset > 0 && var22.payload[var22.offset - 1] == 0) {
                           --var22.offset;
                        }

                        var28 = new String(var22.payload, 0, var22.offset);
                        boolean var34;
                        if(var28 == null) {
                           var34 = false;
                        } else {
                           label137: {
                              try {
                                 new URL(var28);
                              } catch (MalformedURLException var29) {
                                 var34 = false;
                                 break label137;
                              }

                              var34 = true;
                           }
                        }

                        if(var34) {
                           HorizontalAlignment.method5156(var28, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var22.offset += var19;
                  if(var22.offset >= 1000) {
                     var3 = 5;
                     break;
                  }
               }
            } catch (Throwable var30) {
               var30.printStackTrace();
               var3 = 5;
            }

            var0 = var3;
         }

         switch(var0) {
         case 2:
            GrandExchangeEvent.method22(class237.field3049, class237.field3050, class237.field3072);
            class78.loginIndex = 6;
            break;
         case 3:
            GrandExchangeEvent.method22("", "Error connecting to server.", "");
            break;
         case 4:
            GrandExchangeEvent.method22("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            GrandExchangeEvent.method22("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            GrandExchangeEvent.method22("", "Error connecting to server.", "");
            break;
         case 7:
            GrandExchangeEvent.method22("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }
}
