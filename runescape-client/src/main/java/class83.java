import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class83 {
   @ObfuscatedName("z")
   @Export("chatLineMap")
   static final Map chatLineMap;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("messages")
   static final IterableHashTable messages;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   static final IterableDualNodeQueue field1184;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 556765175
   )
   static int field1186;

   static {
      chatLineMap = new HashMap();
      messages = new IterableHashTable(1024);
      field1184 = new IterableDualNodeQueue();
      field1186 = 0;
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1049390668"
   )
   static final void method1933(String var0, boolean var1) {
      if(Client.field677) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = Actor.font_p12full.method5519(var0, 250);
         int var6 = Actor.font_p12full.method5520(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
         Rasterizer2D.drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 16777215);
         Actor.font_p12full.method5526(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         MouseInput.method948(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
         if(var1) {
            GameSocket.rasterProvider.drawFull(0, 0);
         } else {
            int var7 = var3;
            int var8 = var4;
            int var9 = var5;
            int var10 = var6;

            for(int var11 = 0; var11 < Client.widgetCount; ++var11) {
               if(Client.widgetBoundsWidth[var11] + Client.widgetPositionX[var11] > var7 && Client.widgetPositionX[var11] < var7 + var9 && Client.widgetBoundsHeight[var11] + Client.widgetPositionY[var11] > var8 && Client.widgetPositionY[var11] < var10 + var8) {
                  Client.field788[var11] = true;
               }
            }
         }

      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1621920950"
   )
   static final void method1940() {
      int var0 = MouseInput.menuX;
      int var1 = WorldComparator.menuY;
      int var2 = UrlRequester.field1856;
      int var3 = class151.field1933;
      int var4 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
      Rasterizer2D.drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
      ClanMemberManager.fontBold12.method5522("Choose Option", var0 + 3, var1 + 14, var4, -1);
      int var5 = MouseInput.mouseLastX;
      int var6 = MouseInput.mouseLastY * 673804999;

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < Client.menuOptionCount; ++var7) {
         var8 = var1 + (Client.menuOptionCount - 1 - var7) * 15 + 31;
         var9 = 16777215;
         if(var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         ClanMemberManager.fontBold12.method5522(WorldMapType1.method176(var7), var0 + 3, var8, var9, 0);
      }

      var7 = MouseInput.menuX;
      var8 = WorldComparator.menuY;
      var9 = UrlRequester.field1856;
      int var10 = class151.field1933;

      for(int var11 = 0; var11 < Client.widgetCount; ++var11) {
         if(Client.widgetBoundsWidth[var11] + Client.widgetPositionX[var11] > var7 && Client.widgetPositionX[var11] < var7 + var9 && Client.widgetBoundsHeight[var11] + Client.widgetPositionY[var11] > var8 && Client.widgetPositionY[var11] < var8 + var10) {
            Client.field788[var11] = true;
         }
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "1406653934"
   )
   static final void method1923(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if(var3 != null) {
            if(var3.type == 0) {
               if(var3.children != null) {
                  method1923(var3.children, var1);
               }

               WidgetNode var4 = (WidgetNode)Client.componentTable.get((long)var3.id);
               if(var4 != null) {
                  int var5 = var4.id;
                  if(CombatInfo2.loadWidget(var5)) {
                     method1923(GameCanvas.widgets[var5], var1);
                  }
               }
            }

            ScriptEvent var6;
            if(var1 == 0 && var3.onDialogAbortListener != null) {
               var6 = new ScriptEvent();
               var6.source = var3;
               var6.params = var3.onDialogAbortListener;
               class68.method1696(var6);
            }

            if(var1 == 1 && var3.onSubChangeListener != null) {
               if(var3.index >= 0) {
                  Widget var7 = class26.getWidget(var3.id);
                  if(var7 == null || var7.children == null || var3.index >= var7.children.length || var3 != var7.children[var3.index]) {
                     continue;
                  }
               }

               var6 = new ScriptEvent();
               var6.source = var3;
               var6.params = var3.onSubChangeListener;
               class68.method1696(var6);
            }
         }
      }

   }
}
