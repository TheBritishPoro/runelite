import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
   @ObfuscatedName("i")
   static ScheduledExecutorService field1855;
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexCache4")
   static IndexData indexCache4;
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = 1445652317
   )
   static int field1856;
   @ObfuscatedName("z")
   @Export("thread")
   final Thread thread;
   @ObfuscatedName("w")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("s")
   @Export("requests")
   Queue requests;

   public UrlRequester() {
      this.requests = new LinkedList();
      this.thread = new Thread(this);
      this.thread.setPriority(1);
      this.thread.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Leh;",
      garbageValue = "790678851"
   )
   @Export("request")
   public UrlRequest request(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1955026569"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.thread.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized(this) {
               var1 = (UrlRequest)this.requests.poll();
               if(var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.url.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.response0 = var5;
               }

               var1.isDone0 = true;
            } catch (IOException var14) {
               var1.isDone0 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            UnitPriceComparator.processClientError((String)null, var17);
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "892303579"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if(var0 != -1) {
         if(CombatInfo2.loadWidget(var0)) {
            Widget[] var1 = GameCanvas.widgets[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if(var3.onLoadListener != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.source = var3;
                  var4.params = var3.onLoadListener;
                  class309.runScript(var4, 5000000);
               }
            }

         }
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(III)Ljava/lang/String;",
      garbageValue = "-509659041"
   )
   static final String method3113(int var0, int var1) {
      int var2 = var1 - var0;
      return var2 < -9?class6.getColTags(16711680):(var2 < -6?class6.getColTags(16723968):(var2 < -3?class6.getColTags(16740352):(var2 < 0?class6.getColTags(16756736):(var2 > 9?class6.getColTags(65280):(var2 > 6?class6.getColTags(4259584):(var2 > 3?class6.getColTags(8453888):(var2 > 0?class6.getColTags(12648192):class6.getColTags(16776960))))))));
   }
}
