import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
@Implements("WorldMapData")
public class WorldMapData {
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 589485321
   )
   static int field172;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -569300431
   )
   @Export("fileId")
   int fileId;
   @ObfuscatedName("w")
   @Export("identifier")
   String identifier;
   @ObfuscatedName("s")
   @Export("name")
   String name;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 332294683
   )
   int field163;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -851588879
   )
   @Export("initialMapSurfaceZoom")
   int initialMapSurfaceZoom;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   Coordinates field165;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1049310257
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1487084263
   )
   int field167;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1973252047
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1303313193
   )
   int field162;
   @ObfuscatedName("p")
   boolean field173;
   @ObfuscatedName("b")
   LinkedList field160;

   public WorldMapData() {
      this.fileId = -1;
      this.field163 = -1;
      this.initialMapSurfaceZoom = -1;
      this.field165 = null;
      this.minX = Integer.MAX_VALUE;
      this.field167 = 0;
      this.minY = Integer.MAX_VALUE;
      this.field162 = 0;
      this.field173 = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1965636190"
   )
   @Export("loadMapData")
   public void loadMapData(Buffer var1, int var2) {
      this.fileId = var2;
      this.identifier = var1.readString();
      this.name = var1.readString();
      this.field165 = new Coordinates(var1.readInt());
      this.field163 = var1.readInt();
      var1.readUnsignedByte();
      this.field173 = var1.readUnsignedByte() == 1;
      this.initialMapSurfaceZoom = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.field160 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field160.add(this.method201(var1));
      }

      this.method206();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)Las;",
      garbageValue = "2074726298"
   )
   WorldMapSectionBase method201(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      class15 var3 = (class15)class76.forOrdinal(class15.getWorldMapTypes(), var2);
      Object var4 = null;
      switch(var3.worldMapType) {
      case 0:
         var4 = new WorldMapType3();
         break;
      case 1:
         var4 = new class37();
         break;
      case 2:
         var4 = new WorldMapType1();
         break;
      case 3:
         var4 = new WorldMapType2();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((WorldMapSectionBase)var4).vmethod639(var1);
      return (WorldMapSectionBase)var4;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "8"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      Iterator var4 = this.field160.iterator();

      WorldMapSectionBase var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (WorldMapSectionBase)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1006376583"
   )
   @Export("surfaceContainsPosition")
   public boolean surfaceContainsPosition(int x, int y) {
      int var3 = x / 64;
      int var4 = y / 64;
      if(var3 >= this.minX && var3 <= this.field167) {
         if(var4 >= this.minY && var4 <= this.field162) {
            Iterator var5 = this.field160.iterator();

            WorldMapSectionBase var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (WorldMapSectionBase)var5.next();
            } while(!var6.vmethod637(x, y));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "-19"
   )
   public int[] method213(int var1, int var2, int var3) {
      Iterator var4 = this.field160.iterator();

      WorldMapSectionBase var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSectionBase)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5.vmethod638(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "-2056689977"
   )
   public Coordinates method205(int var1, int var2) {
      Iterator var3 = this.field160.iterator();

      WorldMapSectionBase var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapSectionBase)var3.next();
      } while(!var4.vmethod637(var1, var2));

      return var4.vmethod659(var1, var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1897199586"
   )
   void method206() {
      Iterator var1 = this.field160.iterator();

      while(var1.hasNext()) {
         WorldMapSectionBase var2 = (WorldMapSectionBase)var1.next();
         var2.vmethod635(this);
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-31"
   )
   @Export("getFileId")
   public int getFileId() {
      return this.fileId;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-8"
   )
   public boolean method208() {
      return this.field173;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "210931606"
   )
   @Export("getIdentifier")
   public String getIdentifier() {
      return this.identifier;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1948906738"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "118"
   )
   int method211() {
      return this.field163;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "57"
   )
   @Export("getInitialMapSurfaceZoom")
   public int getInitialMapSurfaceZoom() {
      return this.initialMapSurfaceZoom;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-162318051"
   )
   @Export("getMinX")
   public int getMinX() {
      return this.minX;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2125416250"
   )
   public int method214() {
      return this.field167;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "308300610"
   )
   @Export("getMinY")
   public int getMinY() {
      return this.minY;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "255269420"
   )
   public int method249() {
      return this.field162;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1363563177"
   )
   public int method217() {
      return this.field165.worldX;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "825438900"
   )
   public int method218() {
      return this.field165.plane;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-108"
   )
   public int method219() {
      return this.field165.worldY;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Lha;",
      garbageValue = "-1421911827"
   )
   public Coordinates method256() {
      return new Coordinates(this.field165);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Liz;",
      garbageValue = "-4"
   )
   public static Permission[] method216() {
      return new Permission[]{Permission.field3125, Permission.field3118, Permission.field3121, Permission.field3120, Permission.field3122, Permission.field3119};
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)J",
      garbageValue = "-1525705371"
   )
   public static long method262(int var0) {
      return class120.field1647[var0];
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2118827798"
   )
   static boolean method260() {
      return (Client.playerNameMask & 4) != 0;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(Lbj;ZI)V",
      garbageValue = "1846472560"
   )
   @Export("closeWidget")
   static final void closeWidget(WidgetNode var0, boolean var1) {
      int var2 = var0.id;
      int var3 = (int)var0.hash;
      var0.unlink();
      if(var1) {
         Preferences.method1622(var2);
      }

      Frames.method3077(var2);
      Widget var4 = class26.getWidget(var3);
      if(var4 != null) {
         Player.method1114(var4);
      }

      LoginPacket.method3448();
      if(Client.widgetRoot != -1) {
         int var5 = Client.widgetRoot;
         if(CombatInfo2.loadWidget(var5)) {
            class83.method1923(GameCanvas.widgets[var5], 1);
         }
      }

   }
}
