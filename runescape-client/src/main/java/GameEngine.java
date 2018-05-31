import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lev;"
   )
   @Export("taskManager")
   protected static Signlink taskManager;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Laj;"
   )
   @Export("shell")
   static GameEngine shell;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1414651903
   )
   @Export("shellCount")
   static int shellCount;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -5838759279061655367L
   )
   static long field388;
   @ObfuscatedName("q")
   static boolean field389;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1662117949
   )
   static int field391;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1070405191
   )
   static int field385;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1422310459
   )
   @Export("FPS")
   protected static int FPS;
   @ObfuscatedName("g")
   protected static long[] field394;
   @ObfuscatedName("r")
   protected static long[] field404;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1878379069
   )
   static int field413;
   @ObfuscatedName("az")
   @Export("focused")
   static volatile boolean focused;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -3346366327004911519L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 1928704871308797659L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs;
   @ObfuscatedName("k")
   @Export("hasErrored")
   boolean hasErrored;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 2027069893
   )
   protected int field396;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -81949229
   )
   protected int field397;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1346865451
   )
   int field398;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2128545057
   )
   int field411;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -385865539
   )
   int field395;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1565245549
   )
   int field402;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -318529133
   )
   int field400;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1497598001
   )
   int field414;
   @ObfuscatedName("as")
   @Export("frame")
   java.awt.Frame frame;
   @ObfuscatedName("an")
   @Export("canvas")
   Canvas canvas;
   @ObfuscatedName("ao")
   volatile boolean field406;
   @ObfuscatedName("ac")
   boolean field408;
   @ObfuscatedName("ap")
   volatile boolean field409;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 2801001644697647105L
   )
   volatile long field410;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "Laa;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("al")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("ae")
   @Export("eventQueue")
   final EventQueue eventQueue;

   static {
      shell = null;
      shellCount = 0;
      field388 = 0L;
      field389 = false;
      field391 = 20;
      field385 = 1;
      FPS = 0;
      field394 = new long[32];
      field404 = new long[32];
      field413 = 500;
      focused = true;
      garbageCollectorLastCollectionTime = -1L;
      garbageCollectorLastCheckTimeMs = -1L;
   }

   protected GameEngine() {
      this.hasErrored = false;
      this.field398 = 0;
      this.field411 = 0;
      this.field406 = true;
      this.field408 = false;
      this.field409 = false;
      this.field410 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.eventQueue = var1;
      SoundTaskDataProvider var2 = new SoundTaskDataProvider();
      AbstractSoundSystem.soundTaskDataProvider = var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "349970276"
   )
   protected final void method906(int var1, int var2) {
      if(this.field400 != var1 || var2 != this.field414) {
         this.method784();
      }

      this.field400 = var1;
      this.field414 = var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;B)V",
      garbageValue = "-2"
   )
   final void method768(Object var1) {
      if(this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            Actor.method1539(1L);
         }

         if(var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)Lfp;",
      garbageValue = "10"
   )
   @Export("mouseWheel")
   protected MouseWheel mouseWheel() {
      if(this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1223644500"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "8637"
   )
   protected void method771(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   @Export("setUpKeyboard")
   protected final void setUpKeyboard() {
      if(Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         KeyFocusListener.KeyHandler_keyCodes[186] = 57;
         KeyFocusListener.KeyHandler_keyCodes[187] = 27;
         KeyFocusListener.KeyHandler_keyCodes[188] = 71;
         KeyFocusListener.KeyHandler_keyCodes[189] = 26;
         KeyFocusListener.KeyHandler_keyCodes[190] = 72;
         KeyFocusListener.KeyHandler_keyCodes[191] = 73;
         KeyFocusListener.KeyHandler_keyCodes[192] = 58;
         KeyFocusListener.KeyHandler_keyCodes[219] = 42;
         KeyFocusListener.KeyHandler_keyCodes[220] = 74;
         KeyFocusListener.KeyHandler_keyCodes[221] = 43;
         KeyFocusListener.KeyHandler_keyCodes[222] = 59;
         KeyFocusListener.KeyHandler_keyCodes[223] = 28;
      } else {
         KeyFocusListener.KeyHandler_keyCodes[44] = 71;
         KeyFocusListener.KeyHandler_keyCodes[45] = 26;
         KeyFocusListener.KeyHandler_keyCodes[46] = 72;
         KeyFocusListener.KeyHandler_keyCodes[47] = 73;
         KeyFocusListener.KeyHandler_keyCodes[59] = 57;
         KeyFocusListener.KeyHandler_keyCodes[61] = 27;
         KeyFocusListener.KeyHandler_keyCodes[91] = 42;
         KeyFocusListener.KeyHandler_keyCodes[92] = 74;
         KeyFocusListener.KeyHandler_keyCodes[93] = 43;
         KeyFocusListener.KeyHandler_keyCodes[192] = 28;
         KeyFocusListener.KeyHandler_keyCodes[222] = 58;
         KeyFocusListener.KeyHandler_keyCodes[520] = 59;
      }

      Canvas var1 = this.canvas;
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(KeyFocusListener.keyboard);
      var1.addFocusListener(KeyFocusListener.keyboard);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "45124386"
   )
   @Export("setUpMouse")
   protected final void setUpMouse() {
      Canvas var1 = this.canvas;
      var1.addMouseListener(MouseInput.mouse);
      var1.addMouseMotionListener(MouseInput.mouse);
      var1.addFocusListener(MouseInput.mouse);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1629251833"
   )
   final void method854() {
      Container var1 = this.container();
      if(var1 != null) {
         Bounds var2 = this.method800();
         this.field396 = Math.max(var2.field3747, this.field395);
         this.field397 = Math.max(var2.field3745, this.field402);
         if(this.field396 <= 0) {
            this.field396 = 1;
         }

         if(this.field397 <= 0) {
            this.field397 = 1;
         }

         Varcs.canvasWidth = Math.min(this.field396, this.field400);
         BuildType.canvasHeight = Math.min(this.field397, this.field414);
         this.field398 = (this.field396 - Varcs.canvasWidth) / 2;
         this.field411 = 0;
         this.canvas.setSize(Varcs.canvasWidth, BuildType.canvasHeight);
         GameSocket.rasterProvider = new MainBufferProvider(Varcs.canvasWidth, BuildType.canvasHeight, this.canvas);
         if(var1 == this.frame) {
            Insets var3 = this.frame.getInsets();
            this.canvas.setLocation(this.field398 + var3.left, var3.top + this.field411);
         } else {
            this.canvas.setLocation(this.field398, this.field411);
         }

         this.field406 = true;
         this.vmethod1144();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
   )
   protected abstract void vmethod1144();

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1970135042"
   )
   void method776() {
      int var1 = this.field398;
      int var2 = this.field411;
      int var3 = this.field396 - Varcs.canvasWidth - var1;
      int var4 = this.field397 - BuildType.canvasHeight - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.container();
            int var6 = 0;
            int var7 = 0;
            if(var5 == this.frame) {
               Insets var8 = this.frame.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field397);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field396, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + this.field396 - var3, var7, var3, this.field397);
            }

            if(var4 > 0) {
               var10.fillRect(var6, var7 + this.field397 - var4, this.field396, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method777() {
      Canvas var1 = this.canvas;
      var1.removeKeyListener(KeyFocusListener.keyboard);
      var1.removeFocusListener(KeyFocusListener.keyboard);
      KeyFocusListener.field329 = -1;
      Canvas var2 = this.canvas;
      var2.removeMouseListener(MouseInput.mouse);
      var2.removeMouseMotionListener(MouseInput.mouse);
      var2.removeFocusListener(MouseInput.mouse);
      MouseInput.MouseHandler_currentButton = 0;
      if(this.mouseWheelHandler != null) {
         this.mouseWheelHandler.removeFrom(this.canvas);
      }

      this.replaceCanvas();
      Canvas var3 = this.canvas;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(KeyFocusListener.keyboard);
      var3.addFocusListener(KeyFocusListener.keyboard);
      Canvas var4 = this.canvas;
      var4.addMouseListener(MouseInput.mouse);
      var4.addMouseMotionListener(MouseInput.mouse);
      var4.addFocusListener(MouseInput.mouse);
      if(this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method784();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1907342193"
   )
   @Export("initialize")
   protected final void initialize(int var1, int var2, int var3) {
      try {
         if(shell != null) {
            ++shellCount;
            if(shellCount >= 3) {
               this.error("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         shell = this;
         Varcs.canvasWidth = var1;
         BuildType.canvasHeight = var2;
         GameCanvas.revision = var3;
         RunException.field1938 = this;
         if(taskManager == null) {
            taskManager = new Signlink();
         }

         taskManager.createRunnable(this, 1);
      } catch (Exception var5) {
         UnitPriceComparator.processClientError((String)null, var5);
         this.error("crash");
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1647866935"
   )
   @Export("replaceCanvas")
   final synchronized void replaceCanvas() {
      Container var1 = this.container();
      if(this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      Varcs.canvasWidth = Math.max(var1.getWidth(), this.field395);
      BuildType.canvasHeight = Math.max(var1.getHeight(), this.field402);
      Insets var2;
      if(this.frame != null) {
         var2 = this.frame.getInsets();
         Varcs.canvasWidth -= var2.right + var2.left;
         BuildType.canvasHeight -= var2.bottom + var2.top;
      }

      this.canvas = new GameCanvas(this);
      var1.add(this.canvas);
      this.canvas.setSize(Varcs.canvasWidth, BuildType.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if(var1 == this.frame) {
         var2 = this.frame.getInsets();
         this.canvas.setLocation(var2.left + this.field398, var2.top + this.field411);
      } else {
         this.canvas.setLocation(this.field398, this.field411);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.field406 = true;
      if(GameSocket.rasterProvider != null && Varcs.canvasWidth == GameSocket.rasterProvider.width && BuildType.canvasHeight == GameSocket.rasterProvider.height) {
         ((MainBufferProvider)GameSocket.rasterProvider).replaceComponent(this.canvas);
         GameSocket.rasterProvider.drawFull(0, 0);
      } else {
         GameSocket.rasterProvider = new MainBufferProvider(Varcs.canvasWidth, BuildType.canvasHeight, this.canvas);
      }

      this.field409 = false;
      this.field410 = Buffer.method3547();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "375421429"
   )
   @Export("isValidHost")
   protected final boolean isValidHost() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.error("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2136042033"
   )
   void method781() {
      long var1 = Buffer.method3547();
      long var3 = field404[WorldMapData.field172];
      field404[WorldMapData.field172] = var1;
      WorldMapData.field172 = WorldMapData.field172 + 1 & 31;
      if(0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         WorldMapType1.field146 = focused;
      }

      this.packetHandler();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "243481673"
   )
   void method782() {
      Container var1 = this.container();
      long var2 = Buffer.method3547();
      long var4 = field394[VarCString.field3259];
      field394[VarCString.field3259] = var2;
      VarCString.field3259 = VarCString.field3259 + 1 & 31;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         FPS = ((var6 >> 1) + 32000) / var6;
      }

      if(++field413 - 1 > 50) {
         field413 -= 50;
         this.field406 = true;
         this.canvas.setSize(Varcs.canvasWidth, BuildType.canvasHeight);
         this.canvas.setVisible(true);
         if(var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(this.field398 + var7.left, this.field411 + var7.top);
         } else {
            this.canvas.setLocation(this.field398, this.field411);
         }
      }

      if(this.field409) {
         this.method777();
      }

      this.method783();
      this.methodDraw(this.field406);
      if(this.field406) {
         this.method776();
      }

      this.field406 = false;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-460416978"
   )
   final void method783() {
      Bounds var1 = this.method800();
      if(var1.field3747 != this.field396 || this.field397 != var1.field3745 || this.field408) {
         this.method854();
         this.field408 = false;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method784() {
      this.field408 = true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-199508735"
   )
   final synchronized void method785() {
      if(!field389) {
         field389 = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod1187();
         } catch (Exception var4) {
            ;
         }

         if(this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(taskManager != null) {
            try {
               taskManager.join();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod1132();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
   )
   protected abstract void setUp();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
   )
   protected abstract void packetHandler();

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
   )
   protected abstract void methodDraw(boolean var1);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
   )
   protected abstract void vmethod1187();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZI)V",
      garbageValue = "490645637"
   )
   @Export("drawLoadingScreen")
   protected final void drawLoadingScreen(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if(Signlink.field1961 == null) {
            Signlink.field1961 = new java.awt.Font("Helvetica", 1, 13);
            MapCacheArchiveNames.field256 = this.canvas.getFontMetrics(Signlink.field1961);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, Varcs.canvasWidth, BuildType.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(CombatInfoListHolder.field1028 == null) {
               CombatInfoListHolder.field1028 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = CombatInfoListHolder.field1028.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(Signlink.field1961);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - MapCacheArchiveNames.field256.stringWidth(var2)) / 2, 22);
            var4.drawImage(CombatInfoListHolder.field1028, Varcs.canvasWidth / 2 - 152, BuildType.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = Varcs.canvasWidth / 2 - 152;
            int var8 = BuildType.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(Signlink.field1961);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - MapCacheArchiveNames.field256.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-82"
   )
   protected final void method842() {
      CombatInfoListHolder.field1028 = null;
      Signlink.field1961 = null;
      MapCacheArchiveNames.field256 = null;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1327956818"
   )
   @Export("error")
   protected void error(String var1) {
      if(!this.hasErrored) {
         this.hasErrored = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-1235194173"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null?this.frame:this);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)Lkg;",
      garbageValue = "20"
   )
   Bounds method800() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field395);
      int var3 = Math.max(var1.getHeight(), this.field402);
      if(this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-997320713"
   )
   protected final boolean method801() {
      return this.frame != null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
   )
   protected abstract void vmethod1132();

   public final void destroy() {
      if(this == shell && !field389) {
         field388 = Buffer.method3547();
         Actor.method1539(5000L);
         this.method785();
      }
   }

   @Export("paint")
   @ObfuscatedName("paint")
   public final synchronized void paint(Graphics var1) {
      if(this == shell && !field389) {
         this.field406 = true;
         if(Buffer.method3547() - this.field410 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= Varcs.canvasWidth && var2.height >= BuildType.canvasHeight) {
               this.field409 = true;
            }
         }

      }
   }

   public void run() {
      try {
         if(Signlink.javaVendor != null) {
            String var1 = Signlink.javaVendor.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Signlink.javaVersion;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.error("wrongjava");
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length(); ++var3) {
                     char var5 = var2.charAt(var3);
                     boolean var4 = var5 >= '0' && var5 <= '9';
                     if(!var4) {
                        break;
                     }
                  }

                  String var6 = var2.substring(6, var3);
                  if(Resampler.method2249(var6)) {
                     int var9 = class68.parseInt(var6, 10, true);
                     if(var9 < 10) {
                        this.error("wrongjava");
                        return;
                     }
                  }
               }

               field385 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.replaceCanvas();
         this.setUp();
         class43.timer = class43.method712();

         while(field388 == 0L || Buffer.method3547() < field388) {
            class8.field48 = class43.timer.vmethod3331(field391, field385);

            for(int var7 = 0; var7 < class8.field48; ++var7) {
               this.method781();
            }

            this.method782();
            this.method768(this.canvas);
         }
      } catch (Exception var8) {
         UnitPriceComparator.processClientError((String)null, var8);
         this.error("crash");
      }

      this.method785();
   }

   public final void start() {
      if(this == shell && !field389) {
         field388 = 0L;
      }
   }

   public final void stop() {
      if(this == shell && !field389) {
         field388 = Buffer.method3547() + 4000L;
      }
   }

   @Export("update")
   @ObfuscatedName("update")
   public final void update(Graphics var1) {
      this.paint(var1);
   }

   @Export("focusGained")
   @Hook("focusGained")
   @ObfuscatedName("focusGained")
   public final void focusGained(FocusEvent var1) {
      focused = true;
      this.field406 = true;
   }

   public final void focusLost(FocusEvent var1) {
      focused = false;
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   @ObfuscatedName("init")
   public abstract void init();

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;IIB)Lfd;",
      garbageValue = "-82"
   )
   public static class157 method911(Socket var0, int var1, int var2) throws IOException {
      return new class159(var0, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-7"
   )
   static int method909(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class69.intStack[--class69.intStackSize];
         var4 = class26.getWidget(var3);
      } else {
         var4 = var2?class276.field3561:KitDefinition.field3301;
      }

      if(var0 == 1000) {
         class69.intStackSize -= 4;
         var4.originalX = class69.intStack[class69.intStackSize];
         var4.originalY = class69.intStack[class69.intStackSize + 1];
         var4.dynamicX = class69.intStack[class69.intStackSize + 2];
         var4.dynamicY = class69.intStack[class69.intStackSize + 3];
         Player.method1114(var4);
         Buffer.clientInstance.widgetMethod0(var4);
         if(var3 != -1 && var4.type == 0) {
            GameSocket.method3388(GameCanvas.widgets[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1001) {
         class69.intStackSize -= 4;
         var4.originalWidth = class69.intStack[class69.intStackSize];
         var4.originalHeight = class69.intStack[class69.intStackSize + 1];
         var4.dynamicWidth = class69.intStack[class69.intStackSize + 2];
         var4.buttonType = class69.intStack[class69.intStackSize + 3];
         Player.method1114(var4);
         Buffer.clientInstance.widgetMethod0(var4);
         if(var3 != -1 && var4.type == 0) {
            GameSocket.method3388(GameCanvas.widgets[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var5 = class69.intStack[--class69.intStackSize] == 1;
         if(var5 != var4.isHidden) {
            var4.isHidden = var5;
            Player.method1114(var4);
         }

         return 1;
      } else if(var0 == 1005) {
         var4.noClickThrough = class69.intStack[--class69.intStackSize] == 1;
         return 1;
      } else if(var0 == 1006) {
         var4.noScrollThrough = class69.intStack[--class69.intStackSize] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670224222"
   )
   static void method910() {
      Iterator var0 = class83.messages.iterator();

      while(var0.hasNext()) {
         MessageNode var1 = (MessageNode)var0.next();
         var1.method1042();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
   )
   public static final void method913(int var0, int var1) {
      class120.Viewport_mouseX = var0;
      class120.Viewport_mouseY = var1;
      class120.Viewport_containsMouse = true;
      class120.Viewport_entityCountAtMouse = 0;
      class120.Viewport_false0 = false;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "794717505"
   )
   static int method914(int var0, Script var1, boolean var2) {
      Widget var3 = var2?class276.field3561:KitDefinition.field3301;
      if(var0 == 1800) {
         class69.intStack[++class69.intStackSize - 1] = Signlink.method3252(class24.getWidgetClickMask(var3));
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var3.opBase == null) {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
            } else {
               class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.opBase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class69.intStack[--class69.intStackSize];
         --var4;
         if(var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = var3.actions[var4];
         } else {
            class69.scriptStringStack[++WidgetNode.scriptStringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "-1083003215"
   )
   @Export("decodeContainer")
   static final byte[] decodeContainer(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 < 0 || IndexDataBase.field3176 != 0 && var3 > IndexDataBase.field3176) {
         throw new RuntimeException();
      } else if(var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.readBytes(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.readInt();
         if(var6 >= 0 && (IndexDataBase.field3176 == 0 || var6 <= IndexDataBase.field3176)) {
            byte[] var5 = new byte[var6];
            if(var2 == 1) {
               class176.Bzip2Decompressor_decompress(var5, var6, var0, var3, 9);
            } else {
               IndexDataBase.gzip.decompress(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
