import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("MouseInput")
public class MouseInput implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lax;"
   )
   @Export("mouse")
   public static MouseInput mouse;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1210703827
   )
   @Export("mouseIdleTicks")
   static volatile int mouseIdleTicks;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -408912375
   )
   @Export("MouseHandler_currentButton")
   public static volatile int MouseHandler_currentButton;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -333703105
   )
   @Export("mouseLastX")
   public static int mouseLastX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1905746791
   )
   @Export("mouseX")
   public static volatile int mouseX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1976419829
   )
   @Export("mouseLastY")
   public static int mouseLastY;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1193765943
   )
   @Export("mouseY")
   public static volatile int mouseY;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -182158863
   )
   @Export("mouseCurrentButton")
   public static int mouseCurrentButton;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -569585645
   )
   @Export("MouseHandler_lastButton")
   public static volatile int MouseHandler_lastButton;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1462111047
   )
   @Export("MouseHandler_lastPressedX")
   public static volatile int MouseHandler_lastPressedX;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 894647401
   )
   @Export("MouseHandler_lastPressedY")
   public static volatile int MouseHandler_lastPressedY;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 2696384854056822279L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static volatile long MouseHandler_lastPressedTimeMillis;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1681711897
   )
   @Export("mouseLastButton")
   public static int mouseLastButton;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1469671121
   )
   @Export("mouseLastPressedX")
   public static int mouseLastPressedX;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2008842241
   )
   @Export("mouseLastPressedY")
   public static int mouseLastPressedY;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      longValue = 7842482435590182425L
   )
   @Export("mouseLastPressedTimeMillis")
   public static long mouseLastPressedTimeMillis;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = -1699928239
   )
   @Export("menuX")
   static int menuX;

   static {
      mouse = new MouseInput();
      mouseIdleTicks = 0;
      MouseHandler_currentButton = 0;
      mouseX = -1;
      mouseY = -1;
      mouseCurrentButton = 0;
      mouseLastX = 0;
      mouseLastY = 0;
      MouseHandler_lastButton = 0;
      MouseHandler_lastPressedX = 0;
      MouseHandler_lastPressedY = 0;
      MouseHandler_lastPressedTimeMillis = 0L;
      mouseLastButton = 0;
      mouseLastPressedX = 0;
      mouseLastPressedY = 0;
      mouseLastPressedTimeMillis = 0L;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1838071369"
   )
   final int method916(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2?(!var1.isMetaDown() && var2 != 3?1:2):4;
   }

   @Export("mousePressed")
   @ObfuscatedName("mousePressed")
   public final synchronized void mousePressed(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_lastPressedX = var1.getX();
         MouseHandler_lastPressedY = var1.getY();
         MouseHandler_lastPressedTimeMillis = Buffer.method3547();
         MouseHandler_lastButton = this.method916(var1);
         if(MouseHandler_lastButton != 0) {
            MouseHandler_currentButton = MouseHandler_lastButton;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_currentButton = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(mouse != null) {
         MouseHandler_currentButton = 0;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = -1;
         mouseY = -1;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "537461702"
   )
   @Export("setGameState")
   static void setGameState(int var0) {
      if(var0 != Client.gameState) {
         if(Client.gameState == 0) {
            Buffer.clientInstance.method842();
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            Client.loginState = 0;
            Client.field616 = 0;
            Client.field617 = 0;
            Client.field804.method5246(var0);
            if(var0 != 20) {
               NetWriter.method2005(false);
            }
         }

         if(var0 != 20 && var0 != 40 && PendingSpawn.field869 != null) {
            PendingSpawn.field869.vmethod3346();
            PendingSpawn.field869 = null;
         }

         if(Client.gameState == 25) {
            Client.field751 = 0;
            Client.field633 = 0;
            Client.field634 = 1;
            Client.field635 = 0;
            Client.field636 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               NetWriter.method1994(MapLabel.indexCache10, GZipDecompressor.indexSprites, true, Client.gameState == 11?4:0);
            } else if(var0 == 11) {
               NetWriter.method1994(MapLabel.indexCache10, GZipDecompressor.indexSprites, false, 4);
            } else {
               class59.method1079();
            }
         } else {
            NetWriter.method1994(MapLabel.indexCache10, GZipDecompressor.indexSprites, true, 0);
         }

         Client.gameState = var0;
      }
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "96"
   )
   static boolean method943() {
      return (Client.playerNameMask & 2) != 0;
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1368654361"
   )
   static final void method948(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.widgetCount; ++var4) {
         if(Client.widgetPositionX[var4] + Client.widgetBoundsWidth[var4] > var0 && Client.widgetPositionX[var4] < var0 + var2 && Client.widgetPositionY[var4] + Client.widgetBoundsHeight[var4] > var1 && Client.widgetPositionY[var4] < var3 + var1) {
            Client.field697[var4] = true;
         }
      }

   }
}
