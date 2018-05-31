import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements class288 {
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -219746745
   )
   @Export("widgetCount")
   static int widgetCount;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1154390057
   )
   static int field830;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      longValue = -91560525507386839L
   )
   static long field791;
   @ObfuscatedName("nd")
   static boolean[] field697;
   @ObfuscatedName("nj")
   static boolean[] field723;
   @ObfuscatedName("nm")
   static boolean[] field788;
   @ObfuscatedName("lz")
   static boolean field772;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = -1835075419
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("nc")
   @Export("isResized")
   static boolean isResized;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 953361159
   )
   static int field647;
   @ObfuscatedName("ro")
   @ObfuscatedGetter(
      intValue = -1150401375
   )
   public static int field650;
   @ObfuscatedName("ls")
   static boolean field601;
   @ObfuscatedName("oq")
   static boolean field813;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -948387719
   )
   static int field753;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -1681068877
   )
   static int field749;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = 1025348025
   )
   static int field757;
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("widgetFlags")
   static HashTable widgetFlags;
   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Widget field752;
   @ObfuscatedName("nv")
   @ObfuscatedGetter(
      intValue = -1675720495
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("np")
   @Export("widgetPositionX")
   static int[] widgetPositionX;
   @ObfuscatedName("nt")
   @Export("widgetBoundsWidth")
   static int[] widgetBoundsWidth;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 333708905
   )
   static int field758;
   @ObfuscatedName("nx")
   @Export("widgetPositionY")
   static int[] widgetPositionY;
   @ObfuscatedName("ne")
   @Export("widgetBoundsHeight")
   static int[] widgetBoundsHeight;
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      signature = "Lbz;"
   )
   static final class59 field849;
   @ObfuscatedName("my")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Deque field638;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 217795627
   )
   static int field696;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -813390517
   )
   static int field760;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 880343809
   )
   static int field815;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -1345621773
   )
   static int field812;
   @ObfuscatedName("ru")
   static int[] field850;
   @ObfuscatedName("rg")
   static int[] field596;
   @ObfuscatedName("mi")
   @Export("interfaceItemTriggers")
   static int[] interfaceItemTriggers;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = -490868275
   )
   static int field767;
   @ObfuscatedName("lp")
   @Export("draggingWidget")
   static boolean draggingWidget;
   @ObfuscatedName("na")
   static long[] field797;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = -2132588897
   )
   @Export("pendingVarbitCount")
   static int pendingVarbitCount;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = 699093181
   )
   static int field651;
   @ObfuscatedName("os")
   @ObfuscatedGetter(
      intValue = -1771806997
   )
   static int field810;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = -1805517847
   )
   static int field842;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      longValue = -4301137644112550077L
   )
   static long field722;
   @ObfuscatedName("pb")
   static boolean field822;
   @ObfuscatedName("qy")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   static PlayerComposition field841;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = -1369280353
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = 2142255299
   )
   @Export("queuedSoundEffectCount")
   static int queuedSoundEffectCount;
   @ObfuscatedName("px")
   @Export("unknownSoundValues2")
   static int[] unknownSoundValues2;
   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = -351528433
   )
   static int field814;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = -1068898215
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = -2039961607
   )
   static int field586;
   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 996143867
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = 1357084131
   )
   static int field798;
   @ObfuscatedName("pc")
   @Export("queuedSoundEffectIDs")
   static int[] queuedSoundEffectIDs;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = -619539199
   )
   static int field811;
   @ObfuscatedName("pd")
   @ObfuscatedSignature(
      signature = "[Lcg;"
   )
   @Export("audioEffects")
   static SoundEffect[] audioEffects;
   @ObfuscatedName("pu")
   @Export("unknownSoundValues1")
   static int[] unknownSoundValues1;
   @ObfuscatedName("pf")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -326408871
   )
   static int field724;
   @ObfuscatedName("rd")
   static ArrayList field781;
   @ObfuscatedName("pe")
   static boolean[] field823;
   @ObfuscatedName("rc")
   @ObfuscatedGetter(
      intValue = 1762427
   )
   static int field606;
   @ObfuscatedName("qd")
   static int[] field824;
   @ObfuscatedName("qr")
   static int[] field825;
   @ObfuscatedName("qe")
   static int[] field826;
   @ObfuscatedName("qv")
   static int[] field705;
   @ObfuscatedName("on")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("od")
   static int[] field805;
   @ObfuscatedName("oc")
   static int[] field806;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -59230609
   )
   static int field775;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      intValue = -1015108907
   )
   static int field799;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -263632309
   )
   @Export("Viewport_xOffset")
   static int Viewport_xOffset;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = 623349101
   )
   @Export("Viewport_yOffset")
   static int Viewport_yOffset;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = -1734003973
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = 1052760379
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("qx")
   static short field802;
   @ObfuscatedName("qc")
   static short field829;
   @ObfuscatedName("ou")
   static int[] field773;
   @ObfuscatedName("om")
   static int[] field800;
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Deque field778;
   @ObfuscatedName("qh")
   static short field834;
   @ObfuscatedName("qj")
   static short field835;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -627411345
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("qt")
   static short field833;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Deque field779;
   @ObfuscatedName("qo")
   static short field848;
   @ObfuscatedName("qz")
   static short field831;
   @ObfuscatedName("qs")
   static short field832;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = 1778572125
   )
   static int field828;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = 119023177
   )
   @Export("scale")
   static int scale;
   @ObfuscatedName("mf")
   @Export("pendingVarbitChanges")
   static int[] pendingVarbitChanges;
   @ObfuscatedName("mm")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = -103494083
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      signature = "[Lu;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1283415023
   )
   static int field793;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 220873495
   )
   static int field795;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = -352691883
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = -1120678843
   )
   static int field774;
   @ObfuscatedName("nb")
   static String field796;
   @ObfuscatedName("rr")
   @ObfuscatedSignature(
      signature = "Lbg;"
   )
   static OwnWorldComparator field665;
   @ObfuscatedName("nu")
   static int[] field731;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfk;"
   )
   @Export("collisionMaps")
   static CollisionData[] collisionMaps;
   @ObfuscatedName("ag")
   static boolean field580;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -33369237
   )
   @Export("world")
   public static int world;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -295549115
   )
   @Export("flags")
   static int flags;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1999635431
   )
   @Export("socketType")
   static int socketType;
   @ObfuscatedName("bh")
   @Export("isMembers")
   public static boolean isMembers;
   @ObfuscatedName("bz")
   @Export("lowMemory")
   static boolean lowMemory;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -2057800147
   )
   @Export("languageId")
   static int languageId;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1305395647
   )
   static int field587;
   @ObfuscatedName("bb")
   static boolean field588;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 1544810619
   )
   @Export("gameState")
   static int gameState;
   @ObfuscatedName("bc")
   static boolean field625;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 181352847
   )
   @Export("gameCycle")
   static int gameCycle;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      longValue = 2452580139566453107L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -381181903
   )
   static int field593;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -1985172807
   )
   static int field594;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1157772735
   )
   static int field595;
   @ObfuscatedName("bw")
   static boolean field847;
   @ObfuscatedName("bf")
   @Export("displayFps")
   static boolean displayFps;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -785638907
   )
   static int field598;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -940910327
   )
   @Export("hintArrowTargetType")
   static int hintArrowTargetType;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 487683979
   )
   @Export("hintArrowNpcTargetIdx")
   static int hintArrowNpcTargetIdx;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 348104391
   )
   @Export("hintArrowPlayerTargetIdx")
   static int hintArrowPlayerTargetIdx;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 304122621
   )
   @Export("hintArrowX")
   static int hintArrowX;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1345747809
   )
   @Export("hintArrowY")
   static int hintArrowY;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1571130755
   )
   @Export("hintArrowOffsetZ")
   static int hintArrowOffsetZ;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -169903469
   )
   @Export("hintArrowOffsetX")
   static int hintArrowOffsetX;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 1735835325
   )
   @Export("hintArrowOffsetY")
   static int hintArrowOffsetY;
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1766129571
   )
   @Export("loadingStage")
   static int loadingStage;
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   @Export("socket")
   static Task socket;
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   @Export("rssocket")
   static class157 rssocket;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1705892515
   )
   @Export("js5State")
   static int js5State;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1149880601
   )
   static int field768;
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexScripts")
   static IndexData indexScripts;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 855035607
   )
   static int field614;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 906778345
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 350834505
   )
   static int field616;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1184123167
   )
   static int field617;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1529742153
   )
   static int field618;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   static class146 field619;
   @ObfuscatedName("di")
   static byte[] field620;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "[Lbr;"
   )
   @Export("cachedNPCs")
   static NPC[] cachedNPCs;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -931637927
   )
   @Export("npcIndexesCount")
   static int npcIndexesCount;
   @ObfuscatedName("dj")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = -1812959769
   )
   @Export("pendingNpcFlagsCount")
   static int pendingNpcFlagsCount;
   @ObfuscatedName("es")
   @Export("pendingNpcFlagsIndices")
   static int[] pendingNpcFlagsIndices;
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   public static final NetWriter field626;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = -872392001
   )
   static int field627;
   @ObfuscatedName("ey")
   @Export("socketError")
   static boolean socketError;
   @ObfuscatedName("ep")
   static boolean field629;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      signature = "Ljb;"
   )
   static class280 field804;
   @ObfuscatedName("eb")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 2118745709
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = -1718380447
   )
   static int field633;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = -1158743607
   )
   static int field634;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = 2017775761
   )
   static int field635;
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = 1254534349
   )
   static int field636;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -757062227
   )
   static int field751;
   @ObfuscatedName("fk")
   @Export("isDynamicRegion")
   static boolean isDynamicRegion;
   @ObfuscatedName("fh")
   @Export("instanceTemplateChunks")
   static int[][][] instanceTemplateChunks;
   @ObfuscatedName("fw")
   static final int[] field846;
   @ObfuscatedName("fi")
   @ObfuscatedGetter(
      intValue = -366074461
   )
   static int field700;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = -1770894231
   )
   static int field643;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = -1167871243
   )
   static int field584;
   @ObfuscatedName("gg")
   @ObfuscatedGetter(
      intValue = -1584882163
   )
   static int field836;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = 480766297
   )
   static int field646;
   @ObfuscatedName("ge")
   static boolean field746;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = -1967538949
   )
   static int field660;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = -873734229
   )
   @Export("cameraPitchTarget")
   static int cameraPitchTarget;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = -956184717
   )
   @Export("mapAngle")
   static int mapAngle;
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = 697061695
   )
   static int field608;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -1956032167
   )
   static int field652;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 555568127
   )
   static int field653;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -423690659
   )
   static int field654;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 2077901199
   )
   static int field655;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = -2071897465
   )
   static int field644;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -588909329
   )
   static int field657;
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = -1066346821
   )
   static int field613;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 170615499
   )
   static int field659;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 980219711
   )
   static int field750;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -1328369009
   )
   static int field661;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = 1143307061
   )
   static int field853;
   @ObfuscatedName("hh")
   static boolean field663;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1162289797
   )
   static int field664;
   @ObfuscatedName("hc")
   static boolean field807;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = 1345648571
   )
   static int field738;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -351366969
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = 1968908975
   )
   static int field648;
   @ObfuscatedName("hg")
   @Export("overheadTextsX")
   static int[] overheadTextsX;
   @ObfuscatedName("hn")
   @Export("overheadTextsY")
   static int[] overheadTextsY;
   @ObfuscatedName("he")
   @Export("overheadTextsOffsetY")
   static int[] overheadTextsOffsetY;
   @ObfuscatedName("hx")
   @Export("overheadTextsOffsetX")
   static int[] overheadTextsOffsetX;
   @ObfuscatedName("hz")
   static int[] field673;
   @ObfuscatedName("hq")
   static int[] field674;
   @ObfuscatedName("hv")
   @Export("overheadTextsCyclesRemaining")
   static int[] overheadTextsCyclesRemaining;
   @ObfuscatedName("hy")
   @Export("overheadTexts")
   static String[] overheadTexts;
   @ObfuscatedName("ha")
   static int[][] field761;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = -1388927477
   )
   static int field687;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -750974575
   )
   @Export("screenX")
   static int screenX;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 43380069
   )
   @Export("screenY")
   static int screenY;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = 693082693
   )
   @Export("lastLeftClickX")
   static int lastLeftClickX;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = -24885111
   )
   @Export("lastLeftClickY")
   static int lastLeftClickY;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1433814191
   )
   static int field803;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = 1652514069
   )
   @Export("cursorState")
   static int cursorState;
   @ObfuscatedName("ih")
   static boolean field621;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = -622016843
   )
   @Export("mouseCrosshair")
   static int mouseCrosshair;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = -956121107
   )
   @Export("pressedItemIndex")
   static int pressedItemIndex;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = -585352053
   )
   static int field688;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = 152338269
   )
   static int field678;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = 552112291
   )
   static int field821;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 1401656763
   )
   static int field691;
   @ObfuscatedName("ig")
   static boolean field689;
   @ObfuscatedName("ir")
   @ObfuscatedGetter(
      intValue = -1783112029
   )
   @Export("itemPressedDuration")
   static int itemPressedDuration;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 478044173
   )
   @Export("myPlayerIndex")
   static int myPlayerIndex;
   @ObfuscatedName("ia")
   static boolean field677;
   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   @Export("cachedPlayers")
   static Player[] cachedPlayers;
   @ObfuscatedName("it")
   @Export("lastSelectedItemName")
   static String lastSelectedItemName;
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = -191538519
   )
   @Export("localInteractingIndex")
   static int localInteractingIndex;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 886576793
   )
   static int field698;
   @ObfuscatedName("ib")
   static boolean field699;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -387109961
   )
   @Export("playerNameMask")
   static int playerNameMask;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = 668394239
   )
   static int field701;
   @ObfuscatedName("ji")
   static int[] field702;
   @ObfuscatedName("jp")
   @Export("playerMenuTypes")
   static final int[] playerMenuTypes;
   @ObfuscatedName("jj")
   @Export("playerOptions")
   static String[] playerOptions;
   @ObfuscatedName("jt")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("jd")
   static int[] field706;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = 1859815185
   )
   static int field707;
   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "[[[Lgn;"
   )
   @Export("groundItemDeque")
   static Deque[][][] groundItemDeque;
   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   @Export("pendingSpawns")
   static Deque pendingSpawns;
   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   @Export("projectiles")
   static Deque projectiles;
   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   @Export("graphicsObjectDeque")
   static Deque graphicsObjectDeque;
   @ObfuscatedName("jm")
   @Export("boostedSkillLevels")
   static int[] boostedSkillLevels;
   @ObfuscatedName("jw")
   @Export("realSkillLevels")
   static int[] realSkillLevels;
   @ObfuscatedName("jg")
   @Export("skillExperiences")
   static int[] skillExperiences;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = 19997195
   )
   static int field715;
   @ObfuscatedName("jb")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -1800746037
   )
   @Export("menuOptionCount")
   static int menuOptionCount;
   @ObfuscatedName("kz")
   @Export("menuActionParams0")
   static int[] menuActionParams0;
   @ObfuscatedName("ke")
   @Export("menuActionParams1")
   static int[] menuActionParams1;
   @ObfuscatedName("kd")
   @Export("menuTypes")
   static int[] menuTypes;
   @ObfuscatedName("kf")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("km")
   @Export("menuOptions")
   static String[] menuOptions;
   @ObfuscatedName("kt")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("kn")
   @Export("menuBooleanArray")
   static boolean[] menuBooleanArray;
   @ObfuscatedName("ky")
   static boolean field725;
   @ObfuscatedName("kv")
   static boolean field726;
   @ObfuscatedName("ka")
   static boolean field727;
   @ObfuscatedName("kj")
   static boolean field728;
   @ObfuscatedName("kk")
   @ObfuscatedGetter(
      intValue = -1794768613
   )
   static int field729;
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = -182788053
   )
   static int field730;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = 1536477871
   )
   static int field623;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = 1797385119
   )
   static int field732;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = -676779145
   )
   @Export("itemSelectionState")
   static int itemSelectionState;
   @ObfuscatedName("kp")
   @Export("spellSelected")
   static boolean spellSelected;
   @ObfuscatedName("kg")
   @ObfuscatedGetter(
      intValue = 553481877
   )
   static int field736;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = 123296823
   )
   static int field737;
   @ObfuscatedName("lj")
   static String field612;
   @ObfuscatedName("lt")
   static String field739;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 312598609
   )
   @Export("widgetRoot")
   static int widgetRoot;
   @ObfuscatedName("li")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   @Export("componentTable")
   static HashTable componentTable;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1361959827
   )
   static int field742;
   @ObfuscatedName("ll")
   @ObfuscatedGetter(
      intValue = -523545729
   )
   static int field743;
   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Widget field744;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = 1214589377
   )
   @Export("energy")
   static int energy;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = 1445722035
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = 1090303845
   )
   @Export("rights")
   public static int rights;
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = -111588181
   )
   static int field748;
   @ObfuscatedName("lg")
   static boolean field776;
   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Widget field784;
   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   @Export("draggedWidget")
   static Widget draggedWidget;

   static {
      field580 = true;
      world = 1;
      flags = 0;
      socketType = 0;
      isMembers = false;
      lowMemory = false;
      languageId = 0;
      field587 = -1;
      field588 = false;
      gameState = 0;
      field625 = true;
      gameCycle = 0;
      mouseLastLastPressedTimeMillis = -1L;
      field593 = -1;
      field594 = -1;
      field595 = -1;
      field847 = true;
      displayFps = false;
      field598 = 0;
      hintArrowTargetType = 0;
      hintArrowNpcTargetIdx = 0;
      hintArrowPlayerTargetIdx = 0;
      hintArrowX = 0;
      hintArrowY = 0;
      hintArrowOffsetZ = 0;
      hintArrowOffsetX = 0;
      hintArrowOffsetY = 0;
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      loadingStage = 0;
      js5State = 0;
      field768 = 0;
      field614 = 0;
      loginState = 0;
      field616 = 0;
      field617 = 0;
      field618 = 0;
      field619 = class146.field1907;
      field620 = null;
      cachedNPCs = new NPC['耀'];
      npcIndexesCount = 0;
      npcIndices = new int['耀'];
      pendingNpcFlagsCount = 0;
      pendingNpcFlagsIndices = new int[250];
      field626 = new NetWriter();
      field627 = 0;
      socketError = false;
      field629 = true;
      field804 = new class280();
      fontsMap = new HashMap();
      field633 = 0;
      field634 = 1;
      field635 = 0;
      field636 = 1;
      field751 = 0;
      collisionMaps = new CollisionData[4];
      isDynamicRegion = false;
      instanceTemplateChunks = new int[4][13][13];
      field846 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field700 = 0;
      field643 = 2301979;
      field584 = 5063219;
      field836 = 3353893;
      field646 = 7759444;
      field746 = false;
      field660 = 0;
      cameraPitchTarget = 128;
      mapAngle = 0;
      field608 = 0;
      field652 = 0;
      field653 = 0;
      field654 = 0;
      field655 = 0;
      field644 = 50;
      field657 = 0;
      field613 = 0;
      field659 = 0;
      field750 = 12;
      field661 = 6;
      field853 = 0;
      field663 = false;
      field664 = 0;
      field807 = false;
      field738 = 0;
      overheadTextCount = 0;
      field648 = 50;
      overheadTextsX = new int[field648];
      overheadTextsY = new int[field648];
      overheadTextsOffsetY = new int[field648];
      overheadTextsOffsetX = new int[field648];
      field673 = new int[field648];
      field674 = new int[field648];
      overheadTextsCyclesRemaining = new int[field648];
      overheadTexts = new String[field648];
      field761 = new int[104][104];
      field687 = 0;
      screenX = -1;
      screenY = -1;
      lastLeftClickX = 0;
      lastLeftClickY = 0;
      field803 = 0;
      cursorState = 0;
      field621 = true;
      mouseCrosshair = 0;
      pressedItemIndex = 0;
      field688 = 0;
      field678 = 0;
      field821 = 0;
      field691 = 0;
      field689 = false;
      itemPressedDuration = 0;
      myPlayerIndex = 0;
      field677 = true;
      cachedPlayers = new Player[2048];
      localInteractingIndex = -1;
      field698 = 0;
      field699 = true;
      playerNameMask = 0;
      field701 = 0;
      field702 = new int[1000];
      playerMenuTypes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerOptions = new String[8];
      playerOptionsPriorities = new boolean[8];
      field706 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field707 = -1;
      groundItemDeque = new Deque[4][104][104];
      pendingSpawns = new Deque();
      projectiles = new Deque();
      graphicsObjectDeque = new Deque();
      boostedSkillLevels = new int[25];
      realSkillLevels = new int[25];
      skillExperiences = new int[25];
      field715 = 0;
      isMenuOpen = false;
      menuOptionCount = 0;
      menuActionParams0 = new int[500];
      menuActionParams1 = new int[500];
      menuTypes = new int[500];
      menuIdentifiers = new int[500];
      menuOptions = new String[500];
      menuTargets = new String[500];
      menuBooleanArray = new boolean[500];
      field725 = false;
      field726 = false;
      field727 = false;
      field728 = true;
      field729 = -1;
      field730 = -1;
      field623 = 0;
      field732 = 50;
      itemSelectionState = 0;
      lastSelectedItemName = null;
      spellSelected = false;
      field736 = -1;
      field737 = -1;
      field612 = null;
      field739 = null;
      widgetRoot = -1;
      componentTable = new HashTable(8);
      field742 = 0;
      field743 = 0;
      field744 = null;
      energy = 0;
      weight = 0;
      rights = 0;
      field748 = -1;
      field776 = false;
      field784 = null;
      draggedWidget = null;
      field752 = null;
      field753 = 0;
      field749 = 0;
      draggedOnWidget = null;
      field601 = false;
      field757 = -1;
      field758 = -1;
      field772 = false;
      field696 = -1;
      field760 = -1;
      draggingWidget = false;
      cycleCntr = 1;
      pendingVarbitChanges = new int[32];
      pendingVarbitCount = 0;
      interfaceItemTriggers = new int[32];
      field767 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      chatCycle = 0;
      field647 = 0;
      field828 = 0;
      field793 = 0;
      field774 = 0;
      field775 = 0;
      mouseWheelRotation = 0;
      field638 = new Deque();
      field778 = new Deque();
      field779 = new Deque();
      widgetFlags = new HashTable(512);
      widgetCount = 0;
      field830 = -2;
      field697 = new boolean[100];
      field788 = new boolean[100];
      field723 = new boolean[100];
      widgetPositionX = new int[100];
      widgetPositionY = new int[100];
      widgetBoundsWidth = new int[100];
      widgetBoundsHeight = new int[100];
      gameDrawingMode = 0;
      field791 = 0L;
      isResized = true;
      field731 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      field795 = 0;
      field796 = "";
      field797 = new long[100];
      field798 = 0;
      field799 = 0;
      field800 = new int[128];
      field773 = new int[128];
      field722 = -1L;
      field651 = -1;
      field724 = 0;
      field805 = new int[1000];
      field806 = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      field810 = 0;
      field811 = 255;
      field812 = -1;
      field813 = false;
      field814 = 127;
      field815 = 127;
      queuedSoundEffectCount = 0;
      queuedSoundEffectIDs = new int[50];
      unknownSoundValues1 = new int[50];
      unknownSoundValues2 = new int[50];
      soundLocations = new int[50];
      audioEffects = new SoundEffect[50];
      field822 = false;
      field823 = new boolean[5];
      field824 = new int[5];
      field825 = new int[5];
      field826 = new int[5];
      field705 = new int[5];
      field802 = 256;
      field829 = 205;
      field848 = 256;
      field831 = 320;
      field832 = 1;
      field833 = 32767;
      field834 = 1;
      field835 = 32767;
      Viewport_xOffset = 0;
      Viewport_yOffset = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      scale = 0;
      field841 = new PlayerComposition();
      field842 = -1;
      field586 = -1;
      grandExchangeOffers = new GrandExchangeOffer[8];
      field665 = new OwnWorldComparator();
      field650 = -1;
      field781 = new ArrayList(10);
      field606 = 0;
      field849 = new class59();
      field850 = new int[50];
      field596 = new int[50];
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
   )
   protected final void vmethod1144() {
      field791 = Buffer.method3547() + 500L;
      this.method1145();
      if(widgetRoot != -1) {
         this.method1151(true);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
   )
   @Export("setUp")
   protected final void setUp() {
      ClientPacket.method3446(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class26.port1 = socketType == 0?43594:world + 40000;
      class68.port2 = socketType == 0?443:world + 50000;
      FriendContainer.myWorldPort = class26.port1;
      PlayerComposition.colorsToFind = class228.field2582;
      PlayerComposition.colorsToReplace = class228.field2583;
      PlayerComposition.field2577 = class228.field2586;
      PlayerComposition.field2578 = class228.field2585;
      MapIcon.urlRequester = new UrlRequester();
      this.setUpKeyboard();
      this.setUpMouse();
      class33.mouseWheel = this.mouseWheel();
      class34.indexStore255 = new IndexFile(255, class155.dat2File, class155.idx255File, 500000);
      class10.preferences = Item.method1859();
      this.setUpClipboard();
      class313.method5714(this, class8.field55);
      if(socketType != 0) {
         displayFps = true;
      }

      class50.method991(class10.preferences.screenType);
      DState.friendManager = new FriendManager(MapIconReference.loginType);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
   )
   @Export("packetHandler")
   protected final void packetHandler() {
      ++gameCycle;
      this.processJS5Connection();
      Script.method1955();

      int var1;
      try {
         if(class217.field2460 == 1) {
            var1 = class217.field2459.method4288();
            if(var1 > 0 && class217.field2459.method4203()) {
               var1 -= class6.field37;
               if(var1 < 0) {
                  var1 = 0;
               }

               class217.field2459.method4236(var1);
            } else {
               class217.field2459.method4202();
               class217.field2459.method4200();
               if(class138.field1871 != null) {
                  class217.field2460 = 2;
               } else {
                  class217.field2460 = 0;
               }

               class177.field2285 = null;
               Item.field1149 = null;
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         class217.field2459.method4202();
         class217.field2460 = 0;
         class177.field2285 = null;
         Item.field1149 = null;
         class138.field1871 = null;
      }

      class54.method1017();
      KeyFocusListener var5 = KeyFocusListener.keyboard;
      synchronized(KeyFocusListener.keyboard) {
         ++KeyFocusListener.keyboardIdleTicks;
         KeyFocusListener.field350 = KeyFocusListener.field352;
         KeyFocusListener.field349 = 0;
         int var2;
         if(KeyFocusListener.field329 >= 0) {
            while(KeyFocusListener.field344 != KeyFocusListener.field329) {
               var2 = KeyFocusListener.field343[KeyFocusListener.field344];
               KeyFocusListener.field344 = KeyFocusListener.field344 + 1 & 127;
               if(var2 < 0) {
                  KeyFocusListener.keyPressed[~var2] = false;
               } else {
                  if(!KeyFocusListener.keyPressed[var2] && KeyFocusListener.field349 < KeyFocusListener.field338.length - 1) {
                     KeyFocusListener.field338[++KeyFocusListener.field349 - 1] = var2;
                  }

                  KeyFocusListener.keyPressed[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               KeyFocusListener.keyPressed[var2] = false;
            }

            KeyFocusListener.field329 = KeyFocusListener.field344;
         }

         if(KeyFocusListener.field349 > 0) {
            KeyFocusListener.keyboardIdleTicks = 0;
         }

         KeyFocusListener.field352 = KeyFocusListener.field351;
      }

      MouseInput var9 = MouseInput.mouse;
      synchronized(MouseInput.mouse) {
         MouseInput.mouseCurrentButton = MouseInput.MouseHandler_currentButton;
         MouseInput.mouseLastX = MouseInput.mouseX;
         MouseInput.mouseLastY = MouseInput.mouseY * -1660309769;
         MouseInput.mouseLastButton = MouseInput.MouseHandler_lastButton;
         MouseInput.mouseLastPressedX = MouseInput.MouseHandler_lastPressedX;
         MouseInput.mouseLastPressedY = MouseInput.MouseHandler_lastPressedY;
         MouseInput.mouseLastPressedTimeMillis = MouseInput.MouseHandler_lastPressedTimeMillis;
         MouseInput.MouseHandler_lastButton = 0;
      }

      if(class33.mouseWheel != null) {
         var1 = class33.mouseWheel.useRotation();
         mouseWheelRotation = var1;
      }

      if(gameState == 0) {
         MapCacheArchiveNames.load();
         class43.timer.vmethod3330();

         for(var1 = 0; var1 < 32; ++var1) {
            GameEngine.field394[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            GameEngine.field404[var1] = 0L;
         }

         class8.field48 = 0;
      } else if(gameState == 5) {
         AbstractByteBuffer.method3806(this);
         MapCacheArchiveNames.load();
         class43.timer.vmethod3330();

         for(var1 = 0; var1 < 32; ++var1) {
            GameEngine.field394[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            GameEngine.field404[var1] = 0L;
         }

         class8.field48 = 0;
      } else if(gameState != 10 && gameState != 11) {
         if(gameState == 20) {
            AbstractByteBuffer.method3806(this);
            this.method1142();
         } else if(gameState == 25) {
            class15.method148();
         }
      } else {
         AbstractByteBuffer.method3806(this);
      }

      if(gameState == 30) {
         this.method1143();
      } else if(gameState == 40 || gameState == 45) {
         this.method1142();
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
   )
   @Hook("clientMainLoop")
   @Export("methodDraw")
   protected final void methodDraw(boolean var1) {
      boolean var2 = class148.method3196();
      if(var2 && field813 && MapIcon.soundSystem0 != null) {
         MapIcon.soundSystem0.tryFlush();
      }

      int var3;
      if((gameState == 10 || gameState == 20 || gameState == 30) && field791 != 0L && Buffer.method3547() > field791) {
         var3 = isResized?2:1;
         class50.method991(var3);
      }

      if(var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field697[var3] = true;
         }
      }

      if(gameState == 0) {
         this.drawLoadingScreen(class78.loadingBarPercentage, class78.loadingText, var1);
      } else if(gameState == 5) {
         Sequence.drawLoginScreen(ClanMemberManager.fontBold12, class151.fontPlain11, Actor.font_p12full, var1);
      } else if(gameState != 10 && gameState != 11) {
         if(gameState == 20) {
            Sequence.drawLoginScreen(ClanMemberManager.fontBold12, class151.fontPlain11, Actor.font_p12full, var1);
         } else if(gameState == 25) {
            if(field751 == 1) {
               if(field633 > field634) {
                  field634 = field633;
               }

               var3 = (field634 * 50 - field633 * 50) / field634;
               class83.method1933("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if(field751 == 2) {
               if(field635 > field636) {
                  field636 = field635;
               }

               var3 = (field636 * 50 - field635 * 50) / field636 + 50;
               class83.method1933("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class83.method1933("Loading - please wait.", false);
            }
         } else if(gameState == 30) {
            this.method1146();
         } else if(gameState == 40) {
            class83.method1933("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if(gameState == 45) {
            class83.method1933("Please wait...", false);
         }
      } else {
         Sequence.drawLoginScreen(ClanMemberManager.fontBold12, class151.fontPlain11, Actor.font_p12full, var1);
      }

      if(gameState == 30 && gameDrawingMode == 0 && !var1 && !isResized) {
         for(var3 = 0; var3 < widgetCount; ++var3) {
            if(field788[var3]) {
               GameSocket.rasterProvider.draw(widgetPositionX[var3], widgetPositionY[var3], widgetBoundsWidth[var3], widgetBoundsHeight[var3]);
               field788[var3] = false;
            }
         }
      } else if(gameState > 0) {
         GameSocket.rasterProvider.drawFull(0, 0);

         for(var3 = 0; var3 < widgetCount; ++var3) {
            field788[var3] = false;
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
   )
   protected final void vmethod1187() {
      if(MapLabel.varcs.changed()) {
         MapLabel.varcs.serialize();
      }

      if(class26.mouseRecorder != null) {
         class26.mouseRecorder.isRunning = false;
      }

      class26.mouseRecorder = null;
      field626.close();
      if(KeyFocusListener.keyboard != null) {
         KeyFocusListener var1 = KeyFocusListener.keyboard;
         synchronized(KeyFocusListener.keyboard) {
            KeyFocusListener.keyboard = null;
         }
      }

      class185.method3787();
      class33.mouseWheel = null;
      if(MapIcon.soundSystem0 != null) {
         MapIcon.soundSystem0.shutdown();
      }

      if(Actor.soundSystem1 != null) {
         Actor.soundSystem1.shutdown();
      }

      Permission.method4605();
      Object var9 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_lock) {
         if(IndexStoreActionHandler.field3179 != 0) {
            IndexStoreActionHandler.field3179 = 1;

            try {
               IndexStoreActionHandler.IndexStoreActionHandler_lock.wait();
            } catch (InterruptedException var5) {
               ;
            }
         }
      }

      if(MapIcon.urlRequester != null) {
         MapIcon.urlRequester.close();
         MapIcon.urlRequester = null;
      }

      try {
         class155.dat2File.close();

         for(int var4 = 0; var4 < class148.idxCount; ++var4) {
            class76.idxFiles[var4].close();
         }

         class155.idx255File.close();
         class155.randomDat.close();
      } catch (Exception var7) {
         ;
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
   )
   protected final void vmethod1132() {
   }

   @Export("init")
   @ObfuscatedName("init")
   public final void init() {
      try {
         if(this.isValidHost()) {
            Parameters[] var1 = ScriptState.method996();

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Parameters var3 = var1[var2];
               String var4 = this.getParameter(var3.key);
               if(var4 != null) {
                  switch(Integer.parseInt(var3.key)) {
                  case 2:
                     if(field587 == -1) {
                        field587 = Integer.parseInt(var4);
                     }
                     break;
                  case 3:
                     socketType = Integer.parseInt(var4);
                     break;
                  case 4:
                     flags = Integer.parseInt(var4);
                     break;
                  case 5:
                     class26.field219 = var4;
                     break;
                  case 6:
                     field629 = Integer.parseInt(var4) != 0;
                     break;
                  case 7:
                     if(var4.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 8:
                     languageId = Integer.parseInt(var4);
                  case 9:
                  case 12:
                  default:
                     break;
                  case 10:
                     GameSocket.sessionToken = var4;
                     break;
                  case 11:
                     Enum.field3346 = class179.method3517(Integer.parseInt(var4));
                     break;
                  case 13:
                     world = Integer.parseInt(var4);
                     break;
                  case 14:
                     if(var4.equalsIgnoreCase("true")) {
                        isMembers = true;
                     } else {
                        isMembers = false;
                     }
                     break;
                  case 15:
                     ItemLayer.field1455 = (JagexGame)class76.forOrdinal(class191.method3870(), Integer.parseInt(var4));
                     if(ItemLayer.field1455 == JagexGame.field3145) {
                        MapIconReference.loginType = JagexLoginType.field3880;
                     } else {
                        MapIconReference.loginType = JagexLoginType.field3878;
                     }
                     break;
                  case 16:
                     FrameMap.field1709 = Integer.parseInt(var4);
                  }
               }
            }

            class177.method3513();
            class54.host = this.getCodeBase().getHost();
            String var7 = Enum.field3346.identifier;
            byte var8 = 0;

            try {
               class177.method3509("oldschool", var7, var8, 17);
            } catch (Exception var5) {
               UnitPriceComparator.processClientError((String)null, var5);
            }

            Buffer.clientInstance = this;
            RunException.field1940 = field587;
            this.initialize(765, 503, 171);
         }
      } catch (RuntimeException var6) {
         throw AbstractSoundSystem.method2195(var6, "client.init(" + ')');
      }
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1481813708"
   )
   @Export("processJS5Connection")
   void processJS5Connection() {
      if(gameState != 1000) {
         long var2 = Buffer.method3547();
         int var4 = (int)(var2 - class250.field3203);
         class250.field3203 = var2;
         if(var4 > 200) {
            var4 = 200;
         }

         class250.field3197 += var4;
         boolean var1;
         if(class250.NetCache_pendingResponsesCount == 0 && class250.NetCache_pendingPriorityResponsesCount == 0 && class250.NetCache_pendingWritesCount == 0 && class250.NetCache_pendingPriorityWritesCount == 0) {
            var1 = true;
         } else if(class250.NetCache_socket == null) {
            var1 = false;
         } else {
            try {
               label245: {
                  if(class250.field3197 > 30000) {
                     throw new IOException();
                  }

                  FileRequest var5;
                  Buffer var6;
                  while(class250.NetCache_pendingPriorityResponsesCount < 200 && class250.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (FileRequest)class250.NetCache_pendingPriorityWrites.first();
                     var6 = new Buffer(4);
                     var6.putByte(1);
                     var6.put24bitInt((int)var5.hash);
                     class250.NetCache_socket.vmethod3347(var6.payload, 0, 4);
                     class250.NetCache_pendingPriorityResponses.put(var5, var5.hash);
                     --class250.NetCache_pendingPriorityWritesCount;
                     ++class250.NetCache_pendingPriorityResponsesCount;
                  }

                  while(class250.NetCache_pendingResponsesCount < 200 && class250.NetCache_pendingWritesCount > 0) {
                     var5 = (FileRequest)class250.NetCache_pendingWritesQueue.peek();
                     var6 = new Buffer(4);
                     var6.putByte(0);
                     var6.put24bitInt((int)var5.hash);
                     class250.NetCache_socket.vmethod3347(var6.payload, 0, 4);
                     var5.unlinkDual();
                     class250.NetCache_pendingResponses.put(var5, var5.hash);
                     --class250.NetCache_pendingWritesCount;
                     ++class250.NetCache_pendingResponsesCount;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = class250.NetCache_socket.vmethod3349();
                     if(var18 < 0) {
                        throw new IOException();
                     }

                     if(var18 == 0) {
                        break;
                     }

                     class250.field3197 = 0;
                     byte var7 = 0;
                     if(class250.currentRequest == null) {
                        var7 = 8;
                     } else if(class250.field3210 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if(var7 > 0) {
                        var8 = var7 - class250.NetCache_responseHeaderBuffer.offset;
                        if(var8 > var18) {
                           var8 = var18;
                        }

                        class250.NetCache_socket.vmethod3351(class250.NetCache_responseHeaderBuffer.payload, class250.NetCache_responseHeaderBuffer.offset, var8);
                        if(class250.field3213 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              class250.NetCache_responseHeaderBuffer.payload[var9 + class250.NetCache_responseHeaderBuffer.offset] ^= class250.field3213;
                           }
                        }

                        class250.NetCache_responseHeaderBuffer.offset += var8;
                        if(class250.NetCache_responseHeaderBuffer.offset < var7) {
                           break;
                        }

                        if(class250.currentRequest == null) {
                           class250.NetCache_responseHeaderBuffer.offset = 0;
                           var9 = class250.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var10 = class250.NetCache_responseHeaderBuffer.readUnsignedShort();
                           int var11 = class250.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = class250.NetCache_responseHeaderBuffer.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           FileRequest var15 = (FileRequest)class250.NetCache_pendingPriorityResponses.get(var13);
                           class192.field2391 = true;
                           if(var15 == null) {
                              var15 = (FileRequest)class250.NetCache_pendingResponses.get(var13);
                              class192.field2391 = false;
                           }

                           if(var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0?5:9;
                           class250.currentRequest = var15;
                           class301.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class250.currentRequest.padding);
                           class301.NetCache_responseArchiveBuffer.putByte(var11);
                           class301.NetCache_responseArchiveBuffer.putInt(var12);
                           class250.field3210 = 8;
                           class250.NetCache_responseHeaderBuffer.offset = 0;
                        } else if(class250.field3210 == 0) {
                           if(class250.NetCache_responseHeaderBuffer.payload[0] == -1) {
                              class250.field3210 = 1;
                              class250.NetCache_responseHeaderBuffer.offset = 0;
                           } else {
                              class250.currentRequest = null;
                           }
                        }
                     } else {
                        var8 = class301.NetCache_responseArchiveBuffer.payload.length - class250.currentRequest.padding;
                        var9 = 512 - class250.field3210;
                        if(var9 > var8 - class301.NetCache_responseArchiveBuffer.offset) {
                           var9 = var8 - class301.NetCache_responseArchiveBuffer.offset;
                        }

                        if(var9 > var18) {
                           var9 = var18;
                        }

                        class250.NetCache_socket.vmethod3351(class301.NetCache_responseArchiveBuffer.payload, class301.NetCache_responseArchiveBuffer.offset, var9);
                        if(class250.field3213 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              class301.NetCache_responseArchiveBuffer.payload[var10 + class301.NetCache_responseArchiveBuffer.offset] ^= class250.field3213;
                           }
                        }

                        class301.NetCache_responseArchiveBuffer.offset += var9;
                        class250.field3210 += var9;
                        if(var8 == class301.NetCache_responseArchiveBuffer.offset) {
                           if(16711935L == class250.currentRequest.hash) {
                              class185.NetCache_reference = class301.NetCache_responseArchiveBuffer;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 IndexData var19 = class250.NetCache_indexCaches[var10];
                                 if(var19 != null) {
                                    class185.NetCache_reference.offset = var10 * 8 + 5;
                                    var12 = class185.NetCache_reference.readInt();
                                    int var20 = class185.NetCache_reference.readInt();
                                    var19.setInformation(var12, var20);
                                 }
                              }
                           } else {
                              class250.NetCache_crc.reset();
                              class250.NetCache_crc.update(class301.NetCache_responseArchiveBuffer.payload, 0, var8);
                              var10 = (int)class250.NetCache_crc.getValue();
                              if(var10 != class250.currentRequest.crc) {
                                 try {
                                    class250.NetCache_socket.vmethod3346();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++class250.field3214;
                                 class250.NetCache_socket = null;
                                 class250.field3213 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label245;
                              }

                              class250.field3214 = 0;
                              class250.field3215 = 0;
                              class250.currentRequest.index.write((int)(class250.currentRequest.hash & 65535L), class301.NetCache_responseArchiveBuffer.payload, 16711680L == (class250.currentRequest.hash & 16711680L), class192.field2391);
                           }

                           class250.currentRequest.unlink();
                           if(class192.field2391) {
                              --class250.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --class250.NetCache_pendingResponsesCount;
                           }

                           class250.field3210 = 0;
                           class250.currentRequest = null;
                           class301.NetCache_responseArchiveBuffer = null;
                        } else {
                           if(class250.field3210 != 512) {
                              break;
                           }

                           class250.field3210 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  class250.NetCache_socket.vmethod3346();
               } catch (Exception var22) {
                  ;
               }

               ++class250.field3215;
               class250.NetCache_socket = null;
               var1 = false;
            }
         }

         if(!var1) {
            this.method1140();
         }

      }
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "118360618"
   )
   void method1140() {
      if(class250.field3214 >= 4) {
         this.error("js5crc");
         gameState = 1000;
      } else {
         if(class250.field3215 >= 4) {
            if(gameState <= 5) {
               this.error("js5io");
               gameState = 1000;
               return;
            }

            field768 = 3000;
            class250.field3215 = 3;
         }

         if(--field768 + 1 <= 0) {
            try {
               if(js5State == 0) {
                  socket = GameEngine.taskManager.createSocket(class54.host, FriendContainer.myWorldPort);
                  ++js5State;
               }

               if(js5State == 1) {
                  if(socket.status == 2) {
                     this.error(-1);
                     return;
                  }

                  if(socket.status == 1) {
                     ++js5State;
                  }
               }

               if(js5State == 2) {
                  if(field629) {
                     rssocket = GameEngine.method911((Socket)socket.value, 40000, 5000);
                  } else {
                     rssocket = new class161((Socket)socket.value, GameEngine.taskManager, 5000);
                  }

                  Buffer var1 = new Buffer(5);
                  var1.putByte(15);
                  var1.putInt(171);
                  rssocket.vmethod3347(var1.payload, 0, 5);
                  ++js5State;
                  class229.field2589 = Buffer.method3547();
               }

               if(js5State == 3) {
                  if(rssocket.vmethod3349() > 0 || !field629 && gameState <= 5) {
                     int var2 = rssocket.vmethod3353();
                     if(var2 != 0) {
                        this.error(var2);
                        return;
                     }

                     ++js5State;
                  } else if(Buffer.method3547() - class229.field2589 > 30000L) {
                     this.error(-2);
                     return;
                  }
               }

               if(js5State == 4) {
                  MapIconReference.method633(rssocket, gameState > 20);
                  socket = null;
                  rssocket = null;
                  js5State = 0;
                  field614 = 0;
               }
            } catch (IOException var3) {
               this.error(-3);
            }

         }
      }
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "656785584"
   )
   @Export("error")
   void error(int var1) {
      socket = null;
      rssocket = null;
      js5State = 0;
      if(FriendContainer.myWorldPort == class26.port1) {
         FriendContainer.myWorldPort = class68.port2;
      } else {
         FriendContainer.myWorldPort = class26.port1;
      }

      ++field614;
      if(field614 >= 2 && (var1 == 7 || var1 == 9)) {
         if(gameState <= 5) {
            this.error("js5connect_full");
            gameState = 1000;
         } else {
            field768 = 3000;
         }
      } else if(field614 >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         gameState = 1000;
      } else if(field614 >= 4) {
         if(gameState <= 5) {
            this.error("js5connect");
            gameState = 1000;
         } else {
            field768 = 3000;
         }
      }

   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2122262374"
   )
   final void method1142() {
      Object var1 = field626.getSocket();
      PacketBuffer var2 = field626.packetBuffer;

      try {
         if(loginState == 0) {
            if(var1 != null) {
               ((class157)var1).vmethod3346();
               var1 = null;
            }

            class225.field2556 = null;
            socketError = false;
            field616 = 0;
            loginState = 1;
         }

         if(loginState == 1) {
            if(class225.field2556 == null) {
               class225.field2556 = GameEngine.taskManager.createSocket(class54.host, FriendContainer.myWorldPort);
            }

            if(class225.field2556.status == 2) {
               throw new IOException();
            }

            if(class225.field2556.status == 1) {
               if(field629) {
                  var1 = GameEngine.method911((Socket)class225.field2556.value, 40000, 5000);
               } else {
                  var1 = new class161((Socket)class225.field2556.value, GameEngine.taskManager, 5000);
               }

               field626.setSocket((class157)var1);
               class225.field2556 = null;
               loginState = 2;
            }
         }

         if(loginState == 2) {
            field626.method1978();
            PacketNode var3 = PendingSpawn.method1536();
            var3.packetBuffer.putByte(LoginPacket.field2237.id);
            field626.method1980(var3);
            field626.method1979();
            var2.offset = 0;
            loginState = 3;
         }

         int var4;
         boolean var13;
         if(loginState == 3) {
            if(MapIcon.soundSystem0 != null) {
               MapIcon.soundSystem0.method2145();
            }

            if(Actor.soundSystem1 != null) {
               Actor.soundSystem1.method2145();
            }

            var13 = true;
            if(field629 && !((class157)var1).vmethod3350(1)) {
               var13 = false;
            }

            if(var13) {
               var4 = ((class157)var1).vmethod3353();
               if(MapIcon.soundSystem0 != null) {
                  MapIcon.soundSystem0.method2145();
               }

               if(Actor.soundSystem1 != null) {
                  Actor.soundSystem1.method2145();
               }

               if(var4 != 0) {
                  class33.method559(var4);
                  return;
               }

               var2.offset = 0;
               loginState = 4;
            }
         }

         int var28;
         if(loginState == 4) {
            if(var2.offset < 8) {
               var28 = ((class157)var1).vmethod3349();
               if(var28 > 8 - var2.offset) {
                  var28 = 8 - var2.offset;
               }

               if(var28 > 0) {
                  ((class157)var1).vmethod3351(var2.payload, var2.offset, var28);
                  var2.offset += var28;
               }
            }

            if(var2.offset == 8) {
               var2.offset = 0;
               class221.field2535 = var2.readLong();
               loginState = 5;
            }
         }

         int var7;
         if(loginState == 5) {
            field626.packetBuffer.offset = 0;
            field626.method1978();
            PacketBuffer var22 = new PacketBuffer(500);
            int[] var14 = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(class221.field2535 >> 32), (int)(class221.field2535 & -1L)};
            var22.offset = 0;
            var22.putByte(1);
            var22.putByte(field619.rsOrdinal());
            var22.putInt(var14[0]);
            var22.putInt(var14[1]);
            var22.putInt(var14[2]);
            var22.putInt(var14[3]);
            switch(field619.field1909) {
            case 0:
            case 1:
               var22.put24bitInt(WorldMapType3.field104);
               var22.offset += 5;
               break;
            case 2:
               var22.offset += 8;
               break;
            case 3:
               var22.putInt(((Integer)class10.preferences.preferences.get(Integer.valueOf(TotalQuantityComparator.method35(class78.username)))).intValue());
               var22.offset += 4;
            }

            var22.putString(class78.password);
            var22.encryptRsa(class76.field1071, class76.field1069);
            PacketNode var5 = PendingSpawn.method1536();
            var5.packetBuffer.offset = 0;
            if(gameState == 40) {
               var5.packetBuffer.putByte(LoginPacket.field2238.id);
            } else {
               var5.packetBuffer.putByte(LoginPacket.field2235.id);
            }

            var5.packetBuffer.putShort(0);
            int var6 = var5.packetBuffer.offset;
            var5.packetBuffer.putInt(171);
            var5.packetBuffer.putBytes(var22.payload, 0, var22.offset);
            var7 = var5.packetBuffer.offset;
            var5.packetBuffer.putString(class78.username);
            var5.packetBuffer.putByte((isResized?1:0) << 1 | (lowMemory?1:0));
            var5.packetBuffer.putShort(Varcs.canvasWidth);
            var5.packetBuffer.putShort(BuildType.canvasHeight);
            PacketBuffer var8 = var5.packetBuffer;
            if(field620 != null) {
               var8.putBytes(field620, 0, field620.length);
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
               } catch (Exception var20) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var8.putBytes(var10, 0, var10.length);
            }

            var5.packetBuffer.putString(GameSocket.sessionToken);
            var5.packetBuffer.putInt(FrameMap.field1709);
            Buffer var9 = new Buffer(WorldMapType2.platformInfo.method6215());
            WorldMapType2.platformInfo.method6217(var9);
            var5.packetBuffer.putBytes(var9.payload, 0, var9.payload.length);
            var5.packetBuffer.putByte(field587);
            var5.packetBuffer.putInt(0);
            var5.packetBuffer.putInt(AttackOption.indexInterfaces.crc);
            var5.packetBuffer.putInt(class37.indexSoundEffects.crc);
            var5.packetBuffer.putInt(SoundTask.configsIndex.crc);
            var5.packetBuffer.putInt(class224.indexCache3.crc);
            var5.packetBuffer.putInt(UrlRequester.indexCache4.crc);
            var5.packetBuffer.putInt(FileRequest.indexMaps.crc);
            var5.packetBuffer.putInt(Item.indexTrack1.crc);
            var5.packetBuffer.putInt(class21.indexModels.crc);
            var5.packetBuffer.putInt(GZipDecompressor.indexSprites.crc);
            var5.packetBuffer.putInt(ObjectComposition.indexTextures.crc);
            var5.packetBuffer.putInt(MapLabel.indexCache10.crc);
            var5.packetBuffer.putInt(OwnWorldComparator.indexTrack2.crc);
            var5.packetBuffer.putInt(indexScripts.crc);
            var5.packetBuffer.putInt(class50.indexCache13.crc);
            var5.packetBuffer.putInt(class59.vorbisIndex.crc);
            var5.packetBuffer.putInt(MapIconReference.indexCache15.crc);
            var5.packetBuffer.putInt(class24.indexWorldMap.crc);
            var5.packetBuffer.encryptXtea(var14, var7, var5.packetBuffer.offset);
            var5.packetBuffer.method3614(var5.packetBuffer.offset - var6);
            field626.method1980(var5);
            field626.method1979();
            field626.field1218 = new ISAACCipher(var14);

            for(int var16 = 0; var16 < 4; ++var16) {
               var14[var16] += 50;
            }

            var2.seed(var14);
            loginState = 6;
         }

         if(loginState == 6 && ((class157)var1).vmethod3349() > 0) {
            var28 = ((class157)var1).vmethod3353();
            if(var28 == 21 && gameState == 20) {
               loginState = 7;
            } else if(var28 == 2) {
               loginState = 9;
            } else if(var28 == 15 && gameState == 40) {
               field626.packetLength = -1;
               loginState = 13;
            } else if(var28 == 23 && field617 < 1) {
               ++field617;
               loginState = 0;
            } else {
               if(var28 != 29) {
                  class33.method559(var28);
                  return;
               }

               loginState = 11;
            }
         }

         if(loginState == 7 && ((class157)var1).vmethod3349() > 0) {
            field618 = (((class157)var1).vmethod3353() + 3) * 60;
            loginState = 8;
         }

         if(loginState == 8) {
            field616 = 0;
            GrandExchangeEvent.method22("You have only just left another world.", "Your profile will be transferred in:", field618 / 60 + " seconds.");
            if(--field618 <= 0) {
               loginState = 0;
            }

         } else {
            int var17;
            if(loginState == 9 && ((class157)var1).vmethod3349() >= 13) {
               var13 = ((class157)var1).vmethod3353() == 1;
               ((class157)var1).vmethod3351(var2.payload, 0, 4);
               var2.offset = 0;
               boolean var24 = false;
               if(var13) {
                  var4 = var2.readOpcode() << 24;
                  var4 |= var2.readOpcode() << 16;
                  var4 |= var2.readOpcode() << 8;
                  var4 |= var2.readOpcode();
                  var17 = TotalQuantityComparator.method35(class78.username);
                  if(class10.preferences.preferences.size() >= 10 && !class10.preferences.preferences.containsKey(Integer.valueOf(var17))) {
                     Iterator var18 = class10.preferences.preferences.entrySet().iterator();
                     var18.next();
                     var18.remove();
                  }

                  class10.preferences.preferences.put(Integer.valueOf(var17), Integer.valueOf(var4));
               }

               if(class78.Login_isUsernameRemembered) {
                  class10.preferences.rememberedUsername = class78.username;
               } else {
                  class10.preferences.rememberedUsername = null;
               }

               class54.method1018();
               rights = ((class157)var1).vmethod3353();
               field776 = ((class157)var1).vmethod3353() == 1;
               localInteractingIndex = ((class157)var1).vmethod3353();
               localInteractingIndex <<= 8;
               localInteractingIndex += ((class157)var1).vmethod3353();
               field698 = ((class157)var1).vmethod3353();
               ((class157)var1).vmethod3351(var2.payload, 0, 1);
               var2.offset = 0;
               ServerPacket[] var26 = new ServerPacket[]{ServerPacket.field2100, ServerPacket.field2050, ServerPacket.field2051, ServerPacket.field2070, ServerPacket.field2053, ServerPacket.field2054, ServerPacket.field2055, ServerPacket.field2122, ServerPacket.field2083, ServerPacket.field2065, ServerPacket.field2059, ServerPacket.field2060, ServerPacket.field2061, ServerPacket.field2062, ServerPacket.field2063, ServerPacket.field2106, ServerPacket.field2107, ServerPacket.field2069, ServerPacket.field2128, ServerPacket.field2105, ServerPacket.field2116, ServerPacket.field2111, ServerPacket.field2071, ServerPacket.field2072, ServerPacket.field2114, ServerPacket.field2074, ServerPacket.field2075, ServerPacket.field2058, ServerPacket.field2077, ServerPacket.field2078, ServerPacket.field2131, ServerPacket.field2080, ServerPacket.field2081, ServerPacket.field2127, ServerPacket.field2079, ServerPacket.field2084, ServerPacket.field2085, ServerPacket.field2086, ServerPacket.field2087, ServerPacket.field2088, ServerPacket.field2089, ServerPacket.field2090, ServerPacket.field2091, ServerPacket.field2092, ServerPacket.field2093, ServerPacket.field2076, ServerPacket.field2095, ServerPacket.field2096, ServerPacket.field2097, ServerPacket.field2098, ServerPacket.field2099, ServerPacket.field2082, ServerPacket.field2101, ServerPacket.field2102, ServerPacket.field2094, ServerPacket.field2104, ServerPacket.field2067, ServerPacket.field2064, ServerPacket.field2119, ServerPacket.field2108, ServerPacket.field2109, ServerPacket.field2049, ServerPacket.field2068, ServerPacket.field2112, ServerPacket.field2113, ServerPacket.field2129, ServerPacket.field2115, ServerPacket.field2073, ServerPacket.field2117, ServerPacket.field2118, ServerPacket.field2124, ServerPacket.field2120, ServerPacket.field2121, ServerPacket.field2103, ServerPacket.field2123, ServerPacket.field2066, ServerPacket.field2125, ServerPacket.field2130, ServerPacket.field2126, ServerPacket.field2057, ServerPacket.field2056, ServerPacket.field2110, ServerPacket.field2052, ServerPacket.field2132};
               var7 = var2.method3841();
               if(var7 < 0 || var7 >= var26.length) {
                  throw new IOException(var7 + " " + var2.offset);
               }

               field626.serverPacket = var26[var7];
               field626.packetLength = field626.serverPacket.packetLength;
               ((class157)var1).vmethod3351(var2.payload, 0, 2);
               var2.offset = 0;
               field626.packetLength = var2.readUnsignedShort();

               try {
                  class41.method702(Buffer.clientInstance, "zap");
               } catch (Throwable var19) {
                  ;
               }

               loginState = 10;
            }

            if(loginState != 10) {
               if(loginState == 11 && ((class157)var1).vmethod3349() >= 2) {
                  var2.offset = 0;
                  ((class157)var1).vmethod3351(var2.payload, 0, 2);
                  var2.offset = 0;
                  IndexData.field3192 = var2.readUnsignedShort();
                  loginState = 12;
               }

               if(loginState == 12 && ((class157)var1).vmethod3349() >= IndexData.field3192) {
                  var2.offset = 0;
                  ((class157)var1).vmethod3351(var2.payload, 0, IndexData.field3192);
                  var2.offset = 0;
                  String var25 = var2.readString();
                  String var30 = var2.readString();
                  String var27 = var2.readString();
                  GrandExchangeEvent.method22(var25, var30, var27);
                  MouseInput.setGameState(10);
               }

               if(loginState == 13) {
                  if(field626.packetLength == -1) {
                     if(((class157)var1).vmethod3349() < 2) {
                        return;
                     }

                     ((class157)var1).vmethod3351(var2.payload, 0, 2);
                     var2.offset = 0;
                     field626.packetLength = var2.readUnsignedShort();
                  }

                  if(((class157)var1).vmethod3349() >= field626.packetLength) {
                     ((class157)var1).vmethod3351(var2.payload, 0, field626.packetLength);
                     var2.offset = 0;
                     var28 = field626.packetLength;
                     field804.method5249();
                     WorldMapManager.method484();
                     class37.initializeGPI(var2);
                     if(var28 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field616;
                  if(field616 > 2000) {
                     if(field617 < 1) {
                        if(class26.port1 == FriendContainer.myWorldPort) {
                           FriendContainer.myWorldPort = class68.port2;
                        } else {
                           FriendContainer.myWorldPort = class26.port1;
                        }

                        ++field617;
                        loginState = 0;
                     } else {
                        class33.method559(-3);
                     }
                  }
               }
            } else {
               if(((class157)var1).vmethod3349() >= field626.packetLength) {
                  var2.offset = 0;
                  ((class157)var1).vmethod3351(var2.payload, 0, field626.packetLength);
                  field804.method5247();
                  mouseLastLastPressedTimeMillis = -1L;
                  field595 = -1;
                  class26.mouseRecorder.index = 0;
                  WorldMapType1.field146 = true;
                  field847 = true;
                  field722 = -1L;
                  Bounds.method5697();
                  field626.method1978();
                  field626.packetBuffer.offset = 0;
                  field626.serverPacket = null;
                  field626.field1215 = null;
                  field626.field1226 = null;
                  field626.field1227 = null;
                  field626.packetLength = 0;
                  field626.field1228 = 0;
                  field598 = 0;
                  field627 = 0;
                  hintArrowTargetType = 0;
                  menuOptionCount = 0;
                  isMenuOpen = false;
                  Item.method1866(0);
                  PacketNode.method3456();
                  itemSelectionState = 0;
                  spellSelected = false;
                  queuedSoundEffectCount = 0;
                  mapAngle = 0;
                  field655 = 0;
                  class21.field175 = null;
                  field810 = 0;
                  field651 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOption = AttackOption.AttackOption_hidden;
                  npcAttackOption = AttackOption.AttackOption_hidden;
                  npcIndexesCount = 0;
                  TextureProvider.method2562();

                  for(var28 = 0; var28 < 2048; ++var28) {
                     cachedPlayers[var28] = null;
                  }

                  for(var28 = 0; var28 < 32768; ++var28) {
                     cachedNPCs[var28] = null;
                  }

                  field707 = -1;
                  projectiles.clear();
                  graphicsObjectDeque.clear();

                  for(var28 = 0; var28 < 4; ++var28) {
                     for(var4 = 0; var4 < 104; ++var4) {
                        for(var17 = 0; var17 < 104; ++var17) {
                           groundItemDeque[var28][var4][var17] = null;
                        }
                     }
                  }

                  pendingSpawns = new Deque();
                  DState.friendManager.method1628();

                  for(var28 = 0; var28 < VarPlayerType.field3232; ++var28) {
                     VarPlayerType var29 = Actor.method1549(var28);
                     if(var29 != null) {
                        class225.serverVarps[var28] = 0;
                        class225.clientVarps[var28] = 0;
                     }
                  }

                  MapLabel.varcs.reset();
                  field748 = -1;
                  if(widgetRoot != -1) {
                     Preferences.method1622(widgetRoot);
                  }

                  for(WidgetNode var23 = (WidgetNode)componentTable.first(); var23 != null; var23 = (WidgetNode)componentTable.next()) {
                     WorldMapData.closeWidget(var23, true);
                  }

                  widgetRoot = -1;
                  componentTable = new HashTable(8);
                  field744 = null;
                  menuOptionCount = 0;
                  isMenuOpen = false;
                  field841.method4462((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var28 = 0; var28 < 8; ++var28) {
                     playerOptions[var28] = null;
                     playerOptionsPriorities[var28] = false;
                  }

                  ItemContainer.itemContainers = new HashTable(32);
                  field625 = true;

                  for(var28 = 0; var28 < 100; ++var28) {
                     field697[var28] = true;
                  }

                  World.method1604();
                  WorldMapType3.clanMemberManager = null;

                  for(var28 = 0; var28 < 8; ++var28) {
                     grandExchangeOffers[var28] = new GrandExchangeOffer();
                  }

                  WorldMapDecoration.grandExchangeEvents = null;
                  class37.initializeGPI(var2);
                  WorldMapType2.field224 = -1;
                  ScriptState.xteaChanged(false, var2);
                  field626.serverPacket = null;
               }

            }
         }
      } catch (IOException var21) {
         if(field617 < 1) {
            if(FriendContainer.myWorldPort == class26.port1) {
               FriendContainer.myWorldPort = class68.port2;
            } else {
               FriendContainer.myWorldPort = class26.port1;
            }

            ++field617;
            loginState = 0;
         } else {
            class33.method559(-2);
         }
      }
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "51"
   )
   final void method1143() {
      if(field598 > 1) {
         --field598;
      }

      if(field627 > 0) {
         --field627;
      }

      if(socketError) {
         socketError = false;
         WorldMapManager.method516();
      } else {
         if(!isMenuOpen) {
            class59.method1077();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1147(field626); ++var1) {
            ;
         }

         if(gameState == 30) {
            while(true) {
               ClassInfo var2 = (ClassInfo)class313.classInfos.last();
               boolean var29;
               if(var2 == null) {
                  var29 = false;
               } else {
                  var29 = true;
               }

               int var3;
               PacketNode var30;
               if(!var29) {
                  PacketNode var14;
                  int var15;
                  if(field804.field3597) {
                     var14 = class26.method433(ClientPacket.field2201, field626.field1218);
                     var14.packetBuffer.putByte(0);
                     var15 = var14.packetBuffer.offset;
                     field804.method5245(var14.packetBuffer);
                     var14.packetBuffer.method3545(var14.packetBuffer.offset - var15);
                     field626.method1980(var14);
                     field804.method5248();
                  }

                  Object var35 = class26.mouseRecorder.lock;
                  int var4;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  synchronized(class26.mouseRecorder.lock) {
                     if(!field580) {
                        class26.mouseRecorder.index = 0;
                     } else if(MouseInput.mouseLastButton != 0 || class26.mouseRecorder.index >= 40) {
                        var30 = class26.method433(ClientPacket.field2228, field626.field1218);
                        var30.packetBuffer.putByte(0);
                        var3 = var30.packetBuffer.offset;
                        var4 = 0;

                        for(var5 = 0; var5 < class26.mouseRecorder.index && var30.packetBuffer.offset - var3 < 240; ++var5) {
                           ++var4;
                           var6 = class26.mouseRecorder.ys[var5];
                           if(var6 < 0) {
                              var6 = 0;
                           } else if(var6 > 502) {
                              var6 = 502;
                           }

                           var7 = class26.mouseRecorder.xs[var5];
                           if(var7 < 0) {
                              var7 = 0;
                           } else if(var7 > 764) {
                              var7 = 764;
                           }

                           var8 = var7 + var6 * 765;
                           if(class26.mouseRecorder.ys[var5] == -1 && class26.mouseRecorder.xs[var5] == -1) {
                              var7 = -1;
                              var6 = -1;
                              var8 = 524287;
                           }

                           if(var7 == field593 && var6 == field594) {
                              if(field595 < 2047) {
                                 ++field595;
                              }
                           } else {
                              var9 = var7 - field593;
                              field593 = var7;
                              var10 = var6 - field594;
                              field594 = var6;
                              if(field595 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                 var9 += 32;
                                 var10 += 32;
                                 var30.packetBuffer.putShort(var10 + (field595 << 12) + (var9 << 6));
                                 field595 = 0;
                              } else if(field595 < 8) {
                                 var30.packetBuffer.put24bitInt((field595 << 19) + var8 + 8388608);
                                 field595 = 0;
                              } else {
                                 var30.packetBuffer.putInt((field595 << 19) + var8 + -1073741824);
                                 field595 = 0;
                              }
                           }
                        }

                        var30.packetBuffer.method3545(var30.packetBuffer.offset - var3);
                        field626.method1980(var30);
                        if(var4 >= class26.mouseRecorder.index) {
                           class26.mouseRecorder.index = 0;
                        } else {
                           class26.mouseRecorder.index -= var4;

                           for(var5 = 0; var5 < class26.mouseRecorder.index; ++var5) {
                              class26.mouseRecorder.xs[var5] = class26.mouseRecorder.xs[var4 + var5];
                              class26.mouseRecorder.ys[var5] = class26.mouseRecorder.ys[var5 + var4];
                           }
                        }
                     }
                  }

                  PacketNode var18;
                  if(MouseInput.mouseLastButton == 1 || !InvType.middleMouseMovesCamera && MouseInput.mouseLastButton == 4 || MouseInput.mouseLastButton == 2) {
                     long var16 = (MouseInput.mouseLastPressedTimeMillis - mouseLastLastPressedTimeMillis) / 50L;
                     if(var16 > 4095L) {
                        var16 = 4095L;
                     }

                     mouseLastLastPressedTimeMillis = MouseInput.mouseLastPressedTimeMillis;
                     var3 = MouseInput.mouseLastPressedY;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > BuildType.canvasHeight) {
                        var3 = BuildType.canvasHeight;
                     }

                     var4 = MouseInput.mouseLastPressedX;
                     if(var4 < 0) {
                        var4 = 0;
                     } else if(var4 > Varcs.canvasWidth) {
                        var4 = Varcs.canvasWidth;
                     }

                     var5 = (int)var16;
                     var18 = class26.method433(ClientPacket.field2188, field626.field1218);
                     var18.packetBuffer.putShort((MouseInput.mouseLastButton == 2?1:0) + (var5 << 1));
                     var18.packetBuffer.putShort(var4);
                     var18.packetBuffer.putShort(var3);
                     field626.method1980(var18);
                  }

                  if(KeyFocusListener.field349 > 0) {
                     var14 = class26.method433(ClientPacket.field2218, field626.field1218);
                     var14.packetBuffer.putShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = Buffer.method3547();

                     for(var5 = 0; var5 < KeyFocusListener.field349; ++var5) {
                        long var21 = var19 - field722;
                        if(var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field722 = var19;
                        var14.packetBuffer.putByte(KeyFocusListener.field338[var5]);
                        var14.packetBuffer.method3731((int)var21);
                     }

                     var14.packetBuffer.method3614(var14.packetBuffer.offset - var15);
                     field626.method1980(var14);
                  }

                  if(field664 > 0) {
                     --field664;
                  }

                  if(KeyFocusListener.keyPressed[96] || KeyFocusListener.keyPressed[97] || KeyFocusListener.keyPressed[98] || KeyFocusListener.keyPressed[99]) {
                     field807 = true;
                  }

                  if(field807 && field664 <= 0) {
                     field664 = 20;
                     field807 = false;
                     var14 = class26.method433(ClientPacket.field2183, field626.field1218);
                     var14.packetBuffer.method3582(cameraPitchTarget);
                     var14.packetBuffer.putShort(mapAngle);
                     field626.method1980(var14);
                  }

                  if(WorldMapType1.field146 && !field847) {
                     field847 = true;
                     var14 = class26.method433(ClientPacket.field2227, field626.field1218);
                     var14.packetBuffer.putByte(1);
                     field626.method1980(var14);
                  }

                  if(!WorldMapType1.field146 && field847) {
                     field847 = false;
                     var14 = class26.method433(ClientPacket.field2227, field626.field1218);
                     var14.packetBuffer.putByte(0);
                     field626.method1980(var14);
                  }

                  if(ItemContainer.renderOverview != null) {
                     ItemContainer.renderOverview.method6013();
                  }

                  if(class54.field489) {
                     if(WorldMapType3.clanMemberManager != null) {
                        WorldMapType3.clanMemberManager.method5337();
                     }

                     for(var1 = 0; var1 < class81.playerIndexesCount; ++var1) {
                        Player var31 = cachedPlayers[class81.playerIndices[var1]];
                        var31.method1086();
                     }

                     class54.field489 = false;
                  }

                  Varcs.method1894();
                  if(gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var37 = (PendingSpawn)pendingSpawns.getFront(); var37 != null; var37 = (PendingSpawn)pendingSpawns.getNext()) {
                     if(var37.hitpoints > 0) {
                        --var37.hitpoints;
                     }

                     ObjectComposition var23;
                     boolean var36;
                     if(var37.hitpoints == 0) {
                        if(var37.field859 >= 0) {
                           var3 = var37.field859;
                           var4 = var37.field866;
                           var23 = FileOnDisk.getObjectDefinition(var3);
                           if(var4 == 11) {
                              var4 = 10;
                           }

                           if(var4 >= 5 && var4 <= 8) {
                              var4 = 4;
                           }

                           var36 = var23.method5048(var4);
                           if(!var36) {
                              continue;
                           }
                        }

                        LoginPacket.method3449(var37.level, var37.type, var37.x, var37.y, var37.field859, var37.field865, var37.field866);
                        var37.unlink();
                     } else {
                        if(var37.delay > 0) {
                           --var37.delay;
                        }

                        if(var37.delay == 0 && var37.x >= 1 && var37.y >= 1 && var37.x <= 102 && var37.y <= 102) {
                           if(var37.id >= 0) {
                              var3 = var37.id;
                              var4 = var37.field864;
                              var23 = FileOnDisk.getObjectDefinition(var3);
                              if(var4 == 11) {
                                 var4 = 10;
                              }

                              if(var4 >= 5 && var4 <= 8) {
                                 var4 = 4;
                              }

                              var36 = var23.method5048(var4);
                              if(!var36) {
                                 continue;
                              }
                           }

                           LoginPacket.method3449(var37.level, var37.type, var37.x, var37.y, var37.id, var37.orientation, var37.field864);
                           var37.delay = -1;
                           if(var37.field859 == var37.id && var37.field859 == -1) {
                              var37.unlink();
                           } else if(var37.field859 == var37.id && var37.orientation == var37.field865 && var37.field866 == var37.field864) {
                              var37.unlink();
                           }
                        }
                     }
                  }

                  ObjectComposition.method5085();
                  ++field626.field1228;
                  if(field626.field1228 > 750) {
                     WorldMapManager.method516();
                     return;
                  }

                  var1 = class81.playerIndexesCount;
                  int[] var32 = class81.playerIndices;

                  for(var3 = 0; var3 < var1; ++var3) {
                     Player var24 = cachedPlayers[var32[var3]];
                     if(var24 != null) {
                        class59.method1080(var24, 1);
                     }
                  }

                  for(var1 = 0; var1 < npcIndexesCount; ++var1) {
                     var15 = npcIndices[var1];
                     NPC var25 = cachedNPCs[var15];
                     if(var25 != null) {
                        class59.method1080(var25, var25.composition.size);
                     }
                  }

                  int[] var38 = class81.playerIndices;

                  for(var15 = 0; var15 < class81.playerIndexesCount; ++var15) {
                     Player var46 = cachedPlayers[var38[var15]];
                     if(var46 != null && var46.overheadTextCyclesRemaining > 0) {
                        --var46.overheadTextCyclesRemaining;
                        if(var46.overheadTextCyclesRemaining == 0) {
                           var46.overhead = null;
                        }
                     }
                  }

                  for(var15 = 0; var15 < npcIndexesCount; ++var15) {
                     var3 = npcIndices[var15];
                     NPC var43 = cachedNPCs[var3];
                     if(var43 != null && var43.overheadTextCyclesRemaining > 0) {
                        --var43.overheadTextCyclesRemaining;
                        if(var43.overheadTextCyclesRemaining == 0) {
                           var43.overhead = null;
                        }
                     }
                  }

                  ++field700;
                  if(cursorState != 0) {
                     field803 += 20;
                     if(field803 >= 400) {
                        cursorState = 0;
                     }
                  }

                  if(class240.field3096 != null) {
                     ++mouseCrosshair;
                     if(mouseCrosshair >= 15) {
                        Player.method1114(class240.field3096);
                        class240.field3096 = null;
                     }
                  }

                  Widget var39 = class143.field1897;
                  Widget var33 = class141.field1888;
                  class143.field1897 = null;
                  class141.field1888 = null;
                  draggedOnWidget = null;
                  field772 = false;
                  field601 = false;
                  field799 = 0;

                  while(GrandExchangeEvents.method8() && field799 < 128) {
                     if(rights >= 2 && KeyFocusListener.keyPressed[82] && GameSocket.currentPressedKey == 66) {
                        String var44 = "";

                        MessageNode var40;
                        for(Iterator var41 = class83.messages.iterator(); var41.hasNext(); var44 = var44 + var40.name + ':' + var40.value + '\n') {
                           var40 = (MessageNode)var41.next();
                        }

                        Buffer.clientInstance.method771(var44);
                     } else if(field655 != 1 || KeyFocusListener.currentTypedKey <= 0) {
                        field773[field799] = GameSocket.currentPressedKey;
                        field800[field799] = KeyFocusListener.currentTypedKey;
                        ++field799;
                     }
                  }

                  if(SoundTaskDataProvider.method696() && KeyFocusListener.keyPressed[82] && KeyFocusListener.keyPressed[81] && mouseWheelRotation != 0) {
                     var3 = class138.localPlayer.field567 - mouseWheelRotation;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > 3) {
                        var3 = 3;
                     }

                     if(var3 != class138.localPlayer.field567) {
                        WorldMapDecoration.method197(class138.localPlayer.pathX[0] + PendingSpawn.baseX, class138.localPlayer.pathY[0] + baseY, var3, false);
                     }

                     mouseWheelRotation = 0;
                  }

                  if(widgetRoot != -1) {
                     var3 = widgetRoot;
                     var4 = Varcs.canvasWidth;
                     var5 = BuildType.canvasHeight;
                     if(CombatInfo2.loadWidget(var3)) {
                        Size.method102(GameCanvas.widgets[var3], -1, 0, 0, var4, var5, 0, 0);
                     }
                  }

                  ++cycleCntr;

                  while(true) {
                     Widget var42;
                     Widget var47;
                     ScriptEvent var48;
                     do {
                        var48 = (ScriptEvent)field778.popFront();
                        if(var48 == null) {
                           while(true) {
                              do {
                                 var48 = (ScriptEvent)field779.popFront();
                                 if(var48 == null) {
                                    while(true) {
                                       do {
                                          var48 = (ScriptEvent)field638.popFront();
                                          if(var48 == null) {
                                             this.method1233();
                                             class275.method5239();
                                             if(draggedWidget != null) {
                                                this.method1448();
                                             }

                                             PacketNode var45;
                                             if(class276.field3559 != null) {
                                                Player.method1114(class276.field3559);
                                                ++itemPressedDuration;
                                                if(MouseInput.mouseCurrentButton == 0) {
                                                   if(field689) {
                                                      if(Occluder.field1819 == class276.field3559 && field688 != field691) {
                                                         Widget var49 = class276.field3559;
                                                         byte var34 = 0;
                                                         if(field743 == 1 && var49.contentType == 206) {
                                                            var34 = 1;
                                                         }

                                                         if(var49.itemIds[field691] <= 0) {
                                                            var34 = 0;
                                                         }

                                                         if(class140.method3150(class24.getWidgetClickMask(var49))) {
                                                            var5 = field688;
                                                            var6 = field691;
                                                            var49.itemIds[var6] = var49.itemIds[var5];
                                                            var49.itemQuantities[var6] = var49.itemQuantities[var5];
                                                            var49.itemIds[var5] = -1;
                                                            var49.itemQuantities[var5] = 0;
                                                         } else if(var34 == 1) {
                                                            var5 = field688;
                                                            var6 = field691;

                                                            while(var6 != var5) {
                                                               if(var5 > var6) {
                                                                  var49.method4507(var5 - 1, var5);
                                                                  --var5;
                                                               } else if(var5 < var6) {
                                                                  var49.method4507(var5 + 1, var5);
                                                                  ++var5;
                                                               }
                                                            }
                                                         } else {
                                                            var49.method4507(field691, field688);
                                                         }

                                                         var45 = class26.method433(ClientPacket.field2170, field626.field1218);
                                                         var45.packetBuffer.method3576(var34);
                                                         var45.packetBuffer.method3582(field688);
                                                         var45.packetBuffer.method3687(class276.field3559.id);
                                                         var45.packetBuffer.method3582(field691);
                                                         field626.method1980(var45);
                                                      }
                                                   } else if(this.method1149()) {
                                                      this.openMenu(field678, field821);
                                                   } else if(menuOptionCount > 0) {
                                                      Player.method1120(field678, field821);
                                                   }

                                                   mouseCrosshair = 10;
                                                   MouseInput.mouseLastButton = 0;
                                                   class276.field3559 = null;
                                                } else if(itemPressedDuration >= 5 && (MouseInput.mouseLastX > field678 + 5 || MouseInput.mouseLastX < field678 - 5 || MouseInput.mouseLastY * 673804999 > field821 + 5 || MouseInput.mouseLastY * 673804999 < field821 - 5)) {
                                                   field689 = true;
                                                }
                                             }

                                             if(Region.method2911()) {
                                                var3 = Region.selectedRegionTileX;
                                                var4 = Region.selectedRegionTileY;
                                                var45 = class26.method433(ClientPacket.field2219, field626.field1218);
                                                var45.packetBuffer.putByte(5);
                                                var45.packetBuffer.putShort(var3 + PendingSpawn.baseX);
                                                var45.packetBuffer.method3575(KeyFocusListener.keyPressed[82]?(KeyFocusListener.keyPressed[81]?2:1):0);
                                                var45.packetBuffer.method3582(var4 + baseY);
                                                field626.method1980(var45);
                                                Region.method2972();
                                                lastLeftClickX = MouseInput.mouseLastPressedX;
                                                lastLeftClickY = MouseInput.mouseLastPressedY;
                                                cursorState = 1;
                                                field803 = 0;
                                                destinationX = var3;
                                                destinationY = var4;
                                             }

                                             if(var39 != class143.field1897) {
                                                if(var39 != null) {
                                                   Player.method1114(var39);
                                                }

                                                if(class143.field1897 != null) {
                                                   Player.method1114(class143.field1897);
                                                }
                                             }

                                             if(var33 != class141.field1888 && field623 == field732) {
                                                if(var33 != null) {
                                                   Player.method1114(var33);
                                                }

                                                if(class141.field1888 != null) {
                                                   Player.method1114(class141.field1888);
                                                }
                                             }

                                             if(class141.field1888 != null) {
                                                if(field623 < field732) {
                                                   ++field623;
                                                   if(field732 == field623) {
                                                      Player.method1114(class141.field1888);
                                                   }
                                                }
                                             } else if(field623 > 0) {
                                                --field623;
                                             }

                                             DynamicObject.method1962();
                                             if(field822) {
                                                var3 = class24.field203 * 128 + 64;
                                                var4 = MilliTimer.field1928 * 128 + 64;
                                                var5 = WorldMapType2.getTileHeight(var3, var4, class13.plane) - class224.field2555;
                                                if(CacheFile.cameraX < var3) {
                                                   CacheFile.cameraX = (var3 - CacheFile.cameraX) * Script.field1197 / 1000 + CacheFile.cameraX + FileSystem.field3154;
                                                   if(CacheFile.cameraX > var3) {
                                                      CacheFile.cameraX = var3;
                                                   }
                                                }

                                                if(CacheFile.cameraX > var3) {
                                                   CacheFile.cameraX -= Script.field1197 * (CacheFile.cameraX - var3) / 1000 + FileSystem.field3154;
                                                   if(CacheFile.cameraX < var3) {
                                                      CacheFile.cameraX = var3;
                                                   }
                                                }

                                                if(SceneTilePaint.cameraZ < var5) {
                                                   SceneTilePaint.cameraZ = (var5 - SceneTilePaint.cameraZ) * Script.field1197 / 1000 + SceneTilePaint.cameraZ + FileSystem.field3154;
                                                   if(SceneTilePaint.cameraZ > var5) {
                                                      SceneTilePaint.cameraZ = var5;
                                                   }
                                                }

                                                if(SceneTilePaint.cameraZ > var5) {
                                                   SceneTilePaint.cameraZ -= Script.field1197 * (SceneTilePaint.cameraZ - var5) / 1000 + FileSystem.field3154;
                                                   if(SceneTilePaint.cameraZ < var5) {
                                                      SceneTilePaint.cameraZ = var5;
                                                   }
                                                }

                                                if(Coordinates.cameraY < var4) {
                                                   Coordinates.cameraY = (var4 - Coordinates.cameraY) * Script.field1197 / 1000 + Coordinates.cameraY + FileSystem.field3154;
                                                   if(Coordinates.cameraY > var4) {
                                                      Coordinates.cameraY = var4;
                                                   }
                                                }

                                                if(Coordinates.cameraY > var4) {
                                                   Coordinates.cameraY -= Script.field1197 * (Coordinates.cameraY - var4) / 1000 + FileSystem.field3154;
                                                   if(Coordinates.cameraY < var4) {
                                                      Coordinates.cameraY = var4;
                                                   }
                                                }

                                                var3 = class50.field456 * 128 + 64;
                                                var4 = class237.field3082 * 128 + 64;
                                                var5 = WorldMapType2.getTileHeight(var3, var4, class13.plane) - class11.field68;
                                                var6 = var3 - CacheFile.cameraX;
                                                var7 = var5 - SceneTilePaint.cameraZ;
                                                var8 = var4 - Coordinates.cameraY;
                                                var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
                                                var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
                                                int var26 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
                                                if(var10 < 128) {
                                                   var10 = 128;
                                                }

                                                if(var10 > 383) {
                                                   var10 = 383;
                                                }

                                                if(class7.cameraPitch < var10) {
                                                   class7.cameraPitch = (var10 - class7.cameraPitch) * DecorativeObject.field1834 / 1000 + class7.cameraPitch + NPC.field1033;
                                                   if(class7.cameraPitch > var10) {
                                                      class7.cameraPitch = var10;
                                                   }
                                                }

                                                if(class7.cameraPitch > var10) {
                                                   class7.cameraPitch -= DecorativeObject.field1834 * (class7.cameraPitch - var10) / 1000 + NPC.field1033;
                                                   if(class7.cameraPitch < var10) {
                                                      class7.cameraPitch = var10;
                                                   }
                                                }

                                                int var12 = var26 - DynamicObject.cameraYaw;
                                                if(var12 > 1024) {
                                                   var12 -= 2048;
                                                }

                                                if(var12 < -1024) {
                                                   var12 += 2048;
                                                }

                                                if(var12 > 0) {
                                                   DynamicObject.cameraYaw = var12 * DecorativeObject.field1834 / 1000 + DynamicObject.cameraYaw + NPC.field1033;
                                                   DynamicObject.cameraYaw &= 2047;
                                                }

                                                if(var12 < 0) {
                                                   DynamicObject.cameraYaw -= -var12 * DecorativeObject.field1834 / 1000 + NPC.field1033;
                                                   DynamicObject.cameraYaw &= 2047;
                                                }

                                                int var13 = var26 - DynamicObject.cameraYaw;
                                                if(var13 > 1024) {
                                                   var13 -= 2048;
                                                }

                                                if(var13 < -1024) {
                                                   var13 += 2048;
                                                }

                                                if(var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
                                                   DynamicObject.cameraYaw = var26;
                                                }
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field705[var3];
                                             }

                                             MapLabel.varcs.process();
                                             var3 = class37.method652();
                                             var4 = KeyFocusListener.keyboardIdleTicks;
                                             if(var3 > 15000 && var4 > 15000) {
                                                field627 = 250;
                                                Item.method1866(14500);
                                                var18 = class26.method433(ClientPacket.field2152, field626.field1218);
                                                field626.method1980(var18);
                                             }

                                             DState.friendManager.method1627();
                                             ++field626.field1224;
                                             if(field626.field1224 > 50) {
                                                var18 = class26.method433(ClientPacket.field2211, field626.field1218);
                                                field626.method1980(var18);
                                             }

                                             try {
                                                field626.method1979();
                                             } catch (IOException var27) {
                                                WorldMapManager.method516();
                                             }

                                             return;
                                          }

                                          var47 = var48.source;
                                          if(var47.index < 0) {
                                             break;
                                          }

                                          var42 = class26.getWidget(var47.parentId);
                                       } while(var42 == null || var42.children == null || var47.index >= var42.children.length || var47 != var42.children[var47.index]);

                                       class68.method1696(var48);
                                    }
                                 }

                                 var47 = var48.source;
                                 if(var47.index < 0) {
                                    break;
                                 }

                                 var42 = class26.getWidget(var47.parentId);
                              } while(var42 == null || var42.children == null || var47.index >= var42.children.length || var47 != var42.children[var47.index]);

                              class68.method1696(var48);
                           }
                        }

                        var47 = var48.source;
                        if(var47.index < 0) {
                           break;
                        }

                        var42 = class26.getWidget(var47.parentId);
                     } while(var42 == null || var42.children == null || var47.index >= var42.children.length || var47 != var42.children[var47.index]);

                     class68.method1696(var48);
                  }
               }

               var30 = class26.method433(ClientPacket.field2145, field626.field1218);
               var30.packetBuffer.putByte(0);
               var3 = var30.packetBuffer.offset;
               SceneTilePaint.encodeClassVerifier(var30.packetBuffer);
               var30.packetBuffer.method3545(var30.packetBuffer.offset - var3);
               field626.method1980(var30);
            }
         }
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-681857594"
   )
   void method1145() {
      int var1 = Varcs.canvasWidth;
      int var2 = BuildType.canvasHeight;
      if(super.field396 < var1) {
         var1 = super.field396;
      }

      if(super.field397 < var2) {
         var2 = super.field397;
      }

      if(class10.preferences != null) {
         try {
            Client var3 = Buffer.clientInstance;
            int var4 = isResized?2:1;
            class41.method700(var3, "resize", new Object[]{Integer.valueOf(var4)});
         } catch (Throwable var5) {
            ;
         }
      }

   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   final void method1146() {
      if(widgetRoot != -1) {
         class21.method270(widgetRoot);
      }

      int var1;
      for(var1 = 0; var1 < widgetCount; ++var1) {
         if(field697[var1]) {
            field788[var1] = true;
         }

         field723[var1] = field697[var1];
         field697[var1] = false;
      }

      field830 = gameCycle;
      field729 = -1;
      field730 = -1;
      Occluder.field1819 = null;
      if(widgetRoot != -1) {
         widgetCount = 0;
         class35.method630(widgetRoot, 0, 0, Varcs.canvasWidth, BuildType.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.noClip();
      if(!isMenuOpen) {
         if(field729 != -1) {
            ScriptState.method997(field729, field730);
         }
      } else {
         class83.method1940();
      }

      if(gameDrawingMode == 3) {
         for(var1 = 0; var1 < widgetCount; ++var1) {
            if(field723[var1]) {
               Rasterizer2D.fillRectangle(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711935, 128);
            } else if(field788[var1]) {
               Rasterizer2D.fillRectangle(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711680, 128);
            }
         }
      }

      var1 = class13.plane;
      int var2 = class138.localPlayer.x;
      int var3 = class138.localPlayer.y;
      int var4 = field700;

      for(class68 var5 = (class68)class68.field985.getFront(); var5 != null; var5 = (class68)class68.field985.getNext()) {
         if(var5.field987 != -1 || var5.field986 != null) {
            int var6 = 0;
            if(var2 > var5.field984) {
               var6 += var2 - var5.field984;
            } else if(var2 < var5.field988) {
               var6 += var5.field988 - var2;
            }

            if(var3 > var5.field992) {
               var6 += var3 - var5.field992;
            } else if(var3 < var5.field983) {
               var6 += var5.field983 - var3;
            }

            if(var6 - 64 <= var5.field991 && field815 != 0 && var1 == var5.field981) {
               var6 -= 64;
               if(var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field991 - var6) * field815 / var5.field991;
               Object var10000;
               if(var5.field993 == null) {
                  if(var5.field987 >= 0) {
                     var10000 = null;
                     SoundEffect var8 = SoundEffect.getTrack(UrlRequester.indexCache4, var5.field987, 0);
                     if(var8 != null) {
                        RawAudioNode var9 = var8.method2069().applyResampler(OwnWorldComparator.field577);
                        class103 var10 = class103.method2287(var9, 100, var7);
                        var10.method2258(-1);
                        MapIconReference.field310.method2032(var10);
                        var5.field993 = var10;
                     }
                  }
               } else {
                  var5.field993.method2267(var7);
               }

               if(var5.field980 == null) {
                  if(var5.field986 != null && (var5.field990 -= var4) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field986.length);
                     var10000 = null;
                     SoundEffect var13 = SoundEffect.getTrack(UrlRequester.indexCache4, var5.field986[var12], 0);
                     if(var13 != null) {
                        RawAudioNode var14 = var13.method2069().applyResampler(OwnWorldComparator.field577);
                        class103 var11 = class103.method2287(var14, 100, var7);
                        var11.method2258(0);
                        MapIconReference.field310.method2032(var11);
                        var5.field980 = var11;
                        var5.field990 = var5.field989 + (int)(Math.random() * (double)(var5.field982 - var5.field989));
                     }
                  }
               } else {
                  var5.field980.method2267(var7);
                  if(!var5.field980.linked()) {
                     var5.field980 = null;
                  }
               }
            } else {
               if(var5.field993 != null) {
                  MapIconReference.field310.method2009(var5.field993);
                  var5.field993 = null;
               }

               if(var5.field980 != null) {
                  MapIconReference.field310.method2009(var5.field980);
                  var5.field980 = null;
               }
            }
         }
      }

      field700 = 0;
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(Lcf;B)Z",
      garbageValue = "115"
   )
   final boolean method1147(NetWriter var1) {
      class157 var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if(var2 == null) {
         return false;
      } else {
         String var5;
         int var6;
         try {
            if(var1.serverPacket == null) {
               if(var1.field1222) {
                  if(!var2.vmethod3350(1)) {
                     return false;
                  }

                  var2.vmethod3351(var1.packetBuffer.payload, 0, 1);
                  var1.field1228 = 0;
                  var1.field1222 = false;
               }

               var3.offset = 0;
               if(var3.method3821()) {
                  if(!var2.vmethod3350(1)) {
                     return false;
                  }

                  var2.vmethod3351(var1.packetBuffer.payload, 1, 1);
                  var1.field1228 = 0;
               }

               var1.field1222 = true;
               ServerPacket[] var4 = new ServerPacket[]{ServerPacket.field2100, ServerPacket.field2050, ServerPacket.field2051, ServerPacket.field2070, ServerPacket.field2053, ServerPacket.field2054, ServerPacket.field2055, ServerPacket.field2122, ServerPacket.field2083, ServerPacket.field2065, ServerPacket.field2059, ServerPacket.field2060, ServerPacket.field2061, ServerPacket.field2062, ServerPacket.field2063, ServerPacket.field2106, ServerPacket.field2107, ServerPacket.field2069, ServerPacket.field2128, ServerPacket.field2105, ServerPacket.field2116, ServerPacket.field2111, ServerPacket.field2071, ServerPacket.field2072, ServerPacket.field2114, ServerPacket.field2074, ServerPacket.field2075, ServerPacket.field2058, ServerPacket.field2077, ServerPacket.field2078, ServerPacket.field2131, ServerPacket.field2080, ServerPacket.field2081, ServerPacket.field2127, ServerPacket.field2079, ServerPacket.field2084, ServerPacket.field2085, ServerPacket.field2086, ServerPacket.field2087, ServerPacket.field2088, ServerPacket.field2089, ServerPacket.field2090, ServerPacket.field2091, ServerPacket.field2092, ServerPacket.field2093, ServerPacket.field2076, ServerPacket.field2095, ServerPacket.field2096, ServerPacket.field2097, ServerPacket.field2098, ServerPacket.field2099, ServerPacket.field2082, ServerPacket.field2101, ServerPacket.field2102, ServerPacket.field2094, ServerPacket.field2104, ServerPacket.field2067, ServerPacket.field2064, ServerPacket.field2119, ServerPacket.field2108, ServerPacket.field2109, ServerPacket.field2049, ServerPacket.field2068, ServerPacket.field2112, ServerPacket.field2113, ServerPacket.field2129, ServerPacket.field2115, ServerPacket.field2073, ServerPacket.field2117, ServerPacket.field2118, ServerPacket.field2124, ServerPacket.field2120, ServerPacket.field2121, ServerPacket.field2103, ServerPacket.field2123, ServerPacket.field2066, ServerPacket.field2125, ServerPacket.field2130, ServerPacket.field2126, ServerPacket.field2057, ServerPacket.field2056, ServerPacket.field2110, ServerPacket.field2052, ServerPacket.field2132};
               var6 = var3.method3841();
               if(var6 < 0 || var6 >= var4.length) {
                  throw new IOException(var6 + " " + var3.offset);
               }

               var1.serverPacket = var4[var6];
               var1.packetLength = var1.serverPacket.packetLength;
            }

            if(var1.packetLength == -1) {
               if(!var2.vmethod3350(1)) {
                  return false;
               }

               var1.getSocket().vmethod3351(var3.payload, 0, 1);
               var1.packetLength = var3.payload[0] & 255;
            }

            if(var1.packetLength == -2) {
               if(!var2.vmethod3350(2)) {
                  return false;
               }

               var1.getSocket().vmethod3351(var3.payload, 0, 2);
               var3.offset = 0;
               var1.packetLength = var3.readUnsignedShort();
            }

            if(!var2.vmethod3350(var1.packetLength)) {
               return false;
            }

            var3.offset = 0;
            var2.vmethod3351(var3.payload, 0, var1.packetLength);
            var1.field1228 = 0;
            field804.method5244();
            var1.field1227 = var1.field1226;
            var1.field1226 = var1.field1215;
            var1.field1215 = var1.serverPacket;
            long var7;
            long var10;
            int var13;
            int var15;
            String var17;
            int var18;
            long var20;
            String var49;
            if(ServerPacket.field2131 == var1.serverPacket) {
               var49 = var3.readString();
               var20 = (long)var3.readUnsignedShort();
               var7 = (long)var3.read24BitInt();
               Permission var58 = (Permission)class76.forOrdinal(WorldMapData.method216(), var3.readUnsignedByte());
               var10 = (var20 << 32) + var7;
               boolean var60 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if(var10 == field797[var13]) {
                     var60 = true;
                     break;
                  }
               }

               if(DState.friendManager.isIgnored(new Name(var49, MapIconReference.loginType))) {
                  var60 = true;
               }

               if(!var60 && myPlayerIndex == 0) {
                  field797[field798] = var10;
                  field798 = (field798 + 1) % 100;

                  String var14;
                  try {
                     var15 = var3.getUSmart();
                     if(var15 > 32767) {
                        var15 = 32767;
                     }

                     byte[] var62 = new byte[var15];
                     var3.offset += class300.huffman.decompress(var3.payload, var3.offset, var62, 0, var15);
                     var17 = class78.getString(var62, 0, var15);
                     var14 = var17;
                  } catch (Exception var46) {
                     var14 = "Cabbage";
                  }

                  var14 = FontTypeFace.appendTags(ScriptState.method998(var14));
                  byte var61;
                  if(var58.field3126) {
                     var61 = 7;
                  } else {
                     var61 = 3;
                  }

                  if(var58.field3128 != -1) {
                     var18 = var58.field3128;
                     var17 = "<img=" + var18 + ">";
                     class143.sendGameMessage(var61, var17 + var49, var14);
                  } else {
                     class143.sendGameMessage(var61, var49, var14);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var64;
            if(ServerPacket.field2103 == var1.serverPacket) {
               var64 = var3.method3555();
               if(var64) {
                  if(class21.field175 == null) {
                     class21.field175 = new class251();
                  }
               } else {
                  class21.field175 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            int var8;
            int var25;
            int var26;
            int var27;
            long var28;
            if(ServerPacket.field2084 == var1.serverPacket) {
               var25 = var3.method3613();
               if(var25 == 65535) {
                  var25 = -1;
               }

               var26 = var3.method3609();
               var6 = var3.method3770();
               var27 = var3.method3646();
               if(var27 == 65535) {
                  var27 = -1;
               }

               for(var8 = var25; var8 <= var27; ++var8) {
                  var28 = ((long)var26 << 32) + (long)var8;
                  Node var59 = widgetFlags.get(var28);
                  if(var59 != null) {
                     var59.unlink();
                  }

                  widgetFlags.put(new IntegerNode(var6), var28);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var30;
            int var31;
            if(ServerPacket.field2071 == var1.serverPacket) {
               var25 = var3.readInt();
               var26 = var3.readUnsignedShort();
               if(var25 < -70000) {
                  var26 += 32768;
               }

               if(var25 >= 0) {
                  var30 = class26.getWidget(var25);
               } else {
                  var30 = null;
               }

               for(; var3.offset < var1.packetLength; class10.setItemTableSlot(var26, var27, var8 - 1, var31)) {
                  var27 = var3.getUSmart();
                  var8 = var3.readUnsignedShort();
                  var31 = 0;
                  if(var8 != 0) {
                     var31 = var3.readUnsignedByte();
                     if(var31 == 255) {
                        var31 = var3.readInt();
                     }
                  }

                  if(var30 != null && var27 >= 0 && var27 < var30.itemIds.length) {
                     var30.itemIds[var27] = var8;
                     var30.itemQuantities[var27] = var31;
                  }
               }

               if(var30 != null) {
                  Player.method1114(var30);
               }

               FontName.method5501();
               interfaceItemTriggers[++field767 - 1 & 31] = var26 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2108 == var1.serverPacket) {
               Coordinates.field2568 = var3.readUnsignedByte();
               MouseRecorder.field524 = var3.method3577();

               while(var3.offset < var1.packetLength) {
                  var25 = var3.readUnsignedByte();
                  class171[] var56 = new class171[]{class171.field2249, class171.field2242, class171.field2244, class171.field2243, class171.field2245, class171.field2246, class171.field2241, class171.field2248, class171.field2247, class171.field2250};
                  class171 var70 = var56[var25];
                  MapCacheArchiveNames.method479(var70);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2117 == var1.serverPacket) {
               SoundTask.method2213();
               var1.serverPacket = null;
               return false;
            }

            if(ServerPacket.field2100 == var1.serverPacket) {
               var25 = var3.method3770();
               var26 = var3.method3613();
               var30 = class26.getWidget(var25);
               if(var30.modelType != 2 || var26 != var30.modelId) {
                  var30.modelType = 2;
                  var30.modelId = var26;
                  Player.method1114(var30);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2085 == var1.serverPacket) {
               ScriptState.xteaChanged(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            boolean var71;
            if(ServerPacket.field2116 == var1.serverPacket) {
               var25 = var3.method3609();
               var71 = var3.readUnsignedShortOb1() == 1;
               var30 = class26.getWidget(var25);
               if(var71 != var30.isHidden) {
                  var30.isHidden = var71;
                  Player.method1114(var30);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2070 == var1.serverPacket) {
               var49 = var3.readString();
               Object[] var55 = new Object[var49.length() + 1];

               for(var6 = var49.length() - 1; var6 >= 0; --var6) {
                  if(var49.charAt(var6) == 's') {
                     var55[var6 + 1] = var3.readString();
                  } else {
                     var55[var6 + 1] = new Integer(var3.readInt());
                  }
               }

               var55[0] = new Integer(var3.readInt());
               ScriptEvent var69 = new ScriptEvent();
               var69.params = var55;
               class68.method1696(var69);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2110 == var1.serverPacket) {
               ScriptState.xteaChanged(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2121 == var1.serverPacket) {
               for(var25 = 0; var25 < VarPlayerType.field3232; ++var25) {
                  VarPlayerType var54 = Actor.method1549(var25);
                  if(var54 != null) {
                     class225.serverVarps[var25] = 0;
                     class225.clientVarps[var25] = 0;
                  }
               }

               FontName.method5501();
               pendingVarbitCount += 32;
               var1.serverPacket = null;
               return true;
            }

            long var32;
            int var35;
            if(ServerPacket.field2114 == var1.serverPacket) {
               var49 = var3.readString();
               var20 = var3.readLong();
               var7 = (long)var3.readUnsignedShort();
               var28 = (long)var3.read24BitInt();
               Permission var11 = (Permission)class76.forOrdinal(WorldMapData.method216(), var3.readUnsignedByte());
               var32 = var28 + (var7 << 32);
               boolean var68 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if(var32 == field797[var15]) {
                     var68 = true;
                     break;
                  }
               }

               if(var11.field3127 && DState.friendManager.isIgnored(new Name(var49, MapIconReference.loginType))) {
                  var68 = true;
               }

               if(!var68 && myPlayerIndex == 0) {
                  field797[field798] = var32;
                  field798 = (field798 + 1) % 100;

                  String var16;
                  try {
                     var35 = var3.getUSmart();
                     if(var35 > 32767) {
                        var35 = 32767;
                     }

                     byte[] var36 = new byte[var35];
                     var3.offset += class300.huffman.decompress(var3.payload, var3.offset, var36, 0, var35);
                     String var19 = class78.getString(var36, 0, var35);
                     var16 = var19;
                  } catch (Exception var45) {
                     var16 = "Cabbage";
                  }

                  var16 = FontTypeFace.appendTags(ScriptState.method998(var16));
                  if(var11.field3128 != -1) {
                     var18 = var11.field3128;
                     var17 = "<img=" + var18 + ">";
                     class173.addChatMessage(9, var17 + var49, var16, PacketNode.method3457(var20));
                  } else {
                     class173.addChatMessage(9, var49, var16, PacketNode.method3457(var20));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2052 == var1.serverPacket) {
               field810 = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            String var65;
            String var74;
            if(ServerPacket.field2111 == var1.serverPacket) {
               var25 = var3.getUSmart();
               var71 = var3.readUnsignedByte() == 1;
               var65 = "";
               boolean var67 = false;
               if(var71) {
                  var65 = var3.readString();
                  if(DState.friendManager.isIgnored(new Name(var65, MapIconReference.loginType))) {
                     var67 = true;
                  }
               }

               var74 = var3.readString();
               if(!var67) {
                  class143.sendGameMessage(var25, var65, var74);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2126 == var1.serverPacket) {
               var25 = var3.readUnsignedShort();
               var26 = var3.readUnsignedByte();
               var6 = var3.readUnsignedShort();
               if(field814 != 0 && var26 != 0 && queuedSoundEffectCount < 50) {
                  queuedSoundEffectIDs[queuedSoundEffectCount] = var25;
                  unknownSoundValues1[queuedSoundEffectCount] = var26;
                  unknownSoundValues2[queuedSoundEffectCount] = var6;
                  audioEffects[queuedSoundEffectCount] = null;
                  soundLocations[queuedSoundEffectCount] = 0;
                  ++queuedSoundEffectCount;
               }

               var1.serverPacket = null;
               return true;
            }

            int var38;
            if(ServerPacket.field2097 == var1.serverPacket) {
               field822 = true;
               class50.field456 = var3.readUnsignedByte();
               class237.field3082 = var3.readUnsignedByte();
               class11.field68 = var3.readUnsignedShort();
               NPC.field1033 = var3.readUnsignedByte();
               DecorativeObject.field1834 = var3.readUnsignedByte();
               if(DecorativeObject.field1834 >= 100) {
                  var25 = class50.field456 * 128 + 64;
                  var26 = class237.field3082 * 128 + 64;
                  var6 = WorldMapType2.getTileHeight(var25, var26, class13.plane) - class11.field68;
                  var27 = var25 - CacheFile.cameraX;
                  var8 = var6 - SceneTilePaint.cameraZ;
                  var31 = var26 - Coordinates.cameraY;
                  var38 = (int)Math.sqrt((double)(var31 * var31 + var27 * var27));
                  class7.cameraPitch = (int)(Math.atan2((double)var8, (double)var38) * 325.949D) & 2047;
                  DynamicObject.cameraYaw = (int)(Math.atan2((double)var27, (double)var31) * -325.949D) & 2047;
                  if(class7.cameraPitch < 128) {
                     class7.cameraPitch = 128;
                  }

                  if(class7.cameraPitch > 383) {
                     class7.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2066 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2242);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2067 == var1.serverPacket) {
               class216.method4179(var3, var1.packetLength);
               SoundTask.method2215();
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2061 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2248);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2056 == var1.serverPacket) {
               MouseRecorder.field524 = var3.method3765();
               Coordinates.field2568 = var3.method3577();

               for(var25 = MouseRecorder.field524; var25 < MouseRecorder.field524 + 8; ++var25) {
                  for(var26 = Coordinates.field2568; var26 < Coordinates.field2568 + 8; ++var26) {
                     if(groundItemDeque[class13.plane][var25][var26] != null) {
                        groundItemDeque[class13.plane][var25][var26] = null;
                        InvType.groundItemSpawned(var25, var26);
                     }
                  }
               }

               for(PendingSpawn var51 = (PendingSpawn)pendingSpawns.getFront(); var51 != null; var51 = (PendingSpawn)pendingSpawns.getNext()) {
                  if(var51.x >= MouseRecorder.field524 && var51.x < MouseRecorder.field524 + 8 && var51.y >= Coordinates.field2568 && var51.y < Coordinates.field2568 + 8 && var51.level == class13.plane) {
                     var51.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2049 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2249);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2118 == var1.serverPacket) {
               var25 = var3.readUnsignedByte();
               var26 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var27 = var3.readUnsignedByte();
               field823[var25] = true;
               field824[var25] = var26;
               field825[var25] = var6;
               field826[var25] = var27;
               field705[var25] = 0;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2069 == var1.serverPacket) {
               var25 = var3.method3765();
               var26 = var3.readUnsignedShortOb1();
               var65 = var3.readString();
               if(var26 >= 1 && var26 <= 8) {
                  if(var65.equalsIgnoreCase("null")) {
                     var65 = null;
                  }

                  playerOptions[var26 - 1] = var65;
                  playerOptionsPriorities[var26 - 1] = var25 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2105 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2244);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2092 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2250);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2075 == var1.serverPacket) {
               destinationX = var3.readUnsignedByte();
               if(destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if(destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2122 == var1.serverPacket) {
               var25 = var3.readInt();
               var26 = var3.readUnsignedShort();
               if(var25 < -70000) {
                  var26 += 32768;
               }

               if(var25 >= 0) {
                  var30 = class26.getWidget(var25);
               } else {
                  var30 = null;
               }

               if(var30 != null) {
                  for(var27 = 0; var27 < var30.itemIds.length; ++var27) {
                     var30.itemIds[var27] = 0;
                     var30.itemQuantities[var27] = 0;
                  }
               }

               VertexNormal.method2782(var26);
               var27 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var27; ++var8) {
                  var31 = var3.readUnsignedByte();
                  if(var31 == 255) {
                     var31 = var3.method3609();
                  }

                  var38 = var3.readUnsignedShort();
                  if(var30 != null && var8 < var30.itemIds.length) {
                     var30.itemIds[var8] = var38;
                     var30.itemQuantities[var8] = var31;
                  }

                  class10.setItemTableSlot(var26, var8, var38 - 1, var31);
               }

               if(var30 != null) {
                  Player.method1114(var30);
               }

               FontName.method5501();
               interfaceItemTriggers[++field767 - 1 & 31] = var26 & 32767;
               var1.serverPacket = null;
               return true;
            }

            Widget var73;
            if(ServerPacket.field2101 == var1.serverPacket) {
               var25 = var3.method3770();
               var26 = var3.readUnsignedShort();
               var6 = var3.method3646();
               var27 = var3.method3585();
               var73 = class26.getWidget(var25);
               if(var27 != var73.rotationX || var26 != var73.rotationZ || var6 != var73.modelZoom) {
                  var73.rotationX = var27;
                  var73.rotationZ = var26;
                  var73.modelZoom = var6;
                  Player.method1114(var73);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var77;
            if(ServerPacket.field2090 == var1.serverPacket) {
               var25 = var3.readShort();
               var26 = var3.method3595();
               var6 = var3.method3533();
               var77 = class26.getWidget(var26);
               if(var6 != var77.originalX || var25 != var77.originalY || var77.dynamicX != 0 || var77.dynamicY != 0) {
                  var77.originalX = var6;
                  var77.originalY = var25;
                  var77.dynamicX = 0;
                  var77.dynamicY = 0;
                  Player.method1114(var77);
                  this.widgetMethod0(var77);
                  if(var77.type == 0) {
                     GameSocket.method3388(GameCanvas.widgets[var26 >> 16], var77, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2112 == var1.serverPacket) {
               var3.offset += 28;
               if(var3.checkCrc()) {
                  GZipDecompressor.method3487(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2054 == var1.serverPacket) {
               field598 = var3.method3585() * 30;
               field775 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2094 == var1.serverPacket) {
               var25 = var3.method3613();
               if(var25 == 65535) {
                  var25 = -1;
               }

               var26 = var3.readInt();
               var6 = var3.method3595();
               var77 = class26.getWidget(var26);
               ItemComposition var76;
               if(!var77.hasScript) {
                  if(var25 == -1) {
                     var77.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var76 = TextureProvider.getItemDefinition(var25);
                  var77.modelType = 4;
                  var77.modelId = var25;
                  var77.rotationX = var76.xan2d;
                  var77.rotationZ = var76.yan2d;
                  var77.modelZoom = var76.zoom2d * 100 / var6;
                  Player.method1114(var77);
               } else {
                  var77.itemId = var25;
                  var77.itemQuantity = var6;
                  var76 = TextureProvider.getItemDefinition(var25);
                  var77.rotationX = var76.xan2d;
                  var77.rotationZ = var76.yan2d;
                  var77.rotationY = var76.zan2d;
                  var77.offsetX2d = var76.offsetX2d;
                  var77.offsetY2d = var76.offsetY2d;
                  var77.modelZoom = var76.zoom2d;
                  if(var76.isStackable == 1) {
                     var77.field2664 = 1;
                  } else {
                     var77.field2664 = 2;
                  }

                  if(var77.field2660 > 0) {
                     var77.modelZoom = var77.modelZoom * 32 / var77.field2660;
                  } else if(var77.originalWidth > 0) {
                     var77.modelZoom = var77.modelZoom * 32 / var77.originalWidth;
                  }

                  Player.method1114(var77);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2058 == var1.serverPacket) {
               class143.field1899 = PacketBuffer.method3847(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2104 == var1.serverPacket) {
               var25 = var3.readUnsignedByte();
               Occluder.method3096(var25);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2083 == var1.serverPacket) {
               FileSystem.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2073 == var1.serverPacket) {
               field822 = true;
               class24.field203 = var3.readUnsignedByte();
               MilliTimer.field1928 = var3.readUnsignedByte();
               class224.field2555 = var3.readUnsignedShort();
               FileSystem.field3154 = var3.readUnsignedByte();
               Script.field1197 = var3.readUnsignedByte();
               if(Script.field1197 >= 100) {
                  CacheFile.cameraX = class24.field203 * 128 + 64;
                  Coordinates.cameraY = MilliTimer.field1928 * 128 + 64;
                  SceneTilePaint.cameraZ = WorldMapType2.getTileHeight(CacheFile.cameraX, Coordinates.cameraY, class13.plane) - class224.field2555;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2074 == var1.serverPacket) {
               var25 = var3.readInt();
               if(var25 != field853) {
                  field853 = var25;
                  if(field655 == 1) {
                     field663 = true;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2109 == var1.serverPacket) {
               hintArrowTargetType = var3.readUnsignedByte();
               if(hintArrowTargetType == 1) {
                  hintArrowNpcTargetIdx = var3.readUnsignedShort();
               }

               if(hintArrowTargetType >= 2 && hintArrowTargetType <= 6) {
                  if(hintArrowTargetType == 2) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 3) {
                     hintArrowOffsetX = 0;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 4) {
                     hintArrowOffsetX = 128;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 5) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 0;
                  }

                  if(hintArrowTargetType == 6) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 128;
                  }

                  hintArrowTargetType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  hintArrowOffsetZ = var3.readUnsignedByte();
               }

               if(hintArrowTargetType == 10) {
                  hintArrowPlayerTargetIdx = var3.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2055 == var1.serverPacket) {
               WorldMapRectangle.method172(var3, var1.packetLength);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2086 == var1.serverPacket) {
               var25 = var3.readInt();
               var5 = var3.readString();
               var30 = class26.getWidget(var25);
               if(!var5.equals(var30.text)) {
                  var30.text = var5;
                  Player.method1114(var30);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2099 == var1.serverPacket) {
               var25 = var3.method3595();
               var26 = var3.method3585();
               class225.serverVarps[var26] = var25;
               if(class225.clientVarps[var26] != var25) {
                  class225.clientVarps[var26] = var25;
               }

               class45.method749(var26);
               pendingVarbitChanges[++pendingVarbitCount - 1 & 31] = var26;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2107 == var1.serverPacket) {
               var25 = var3.readUnsignedShort();
               widgetRoot = var25;
               this.method1151(false);
               class216.method4178(var25);
               UrlRequester.runWidgetOnLoadListener(widgetRoot);

               for(var26 = 0; var26 < 100; ++var26) {
                  field697[var26] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2060 == var1.serverPacket) {
               var25 = var3.readInt();
               WidgetNode var53 = (WidgetNode)componentTable.get((long)var25);
               if(var53 != null) {
                  WorldMapData.closeWidget(var53, true);
               }

               if(field744 != null) {
                  Player.method1114(field744);
                  field744 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2106 == var1.serverPacket) {
               if(WorldMapType3.clanMemberManager != null) {
                  WorldMapType3.clanMemberManager.method5489(var3);
               }

               GrandExchangeEvents.method13();
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2129 == var1.serverPacket) {
               var25 = var3.method3588();
               var26 = var3.method3609();
               var30 = class26.getWidget(var26);
               if(var25 != var30.field2595 || var25 == -1) {
                  var30.field2595 = var25;
                  var30.field2728 = 0;
                  var30.field2613 = 0;
                  Player.method1114(var30);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2072 == var1.serverPacket) {
               for(var25 = 0; var25 < cachedPlayers.length; ++var25) {
                  if(cachedPlayers[var25] != null) {
                     cachedPlayers[var25].animation = -1;
                  }
               }

               for(var25 = 0; var25 < cachedNPCs.length; ++var25) {
                  if(cachedNPCs[var25] != null) {
                     cachedNPCs[var25].animation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2123 == var1.serverPacket) {
               DState.friendManager.method1625();
               field647 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2059 == var1.serverPacket) {
               FontName.method5501();
               var25 = var3.method3770();
               var26 = var3.method3577();
               var6 = var3.readUnsignedShortOb1();
               skillExperiences[var26] = var25;
               boostedSkillLevels[var26] = var6;
               realSkillLevels[var26] = 1;

               for(var27 = 0; var27 < 98; ++var27) {
                  if(var25 >= class234.field2779[var27]) {
                     realSkillLevels[var26] = var27 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var26;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2089 == var1.serverPacket) {
               var25 = var3.readInt();
               var26 = var3.readInt();
               var6 = class37.method661();
               PacketNode var80 = class26.method433(ClientPacket.field2176, field626.field1218);
               var80.packetBuffer.method3574(GameEngine.FPS);
               var80.packetBuffer.method3673(var25);
               var80.packetBuffer.method3673(var26);
               var80.packetBuffer.method3574(var6);
               field626.method1980(var80);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2102 == var1.serverPacket) {
               FontName.method5501();
               weight = var3.readShort();
               field775 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2076 == var1.serverPacket) {
               if(widgetRoot != -1) {
                  var25 = widgetRoot;
                  if(CombatInfo2.loadWidget(var25)) {
                     class83.method1923(GameCanvas.widgets[var25], 0);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2120 == var1.serverPacket) {
               DState.friendManager.method1679(var3, var1.packetLength);
               field647 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2119 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2247);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2125 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2243);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2113 == var1.serverPacket) {
               if(var1.packetLength == 0) {
                  WorldMapType3.clanMemberManager = null;
               } else {
                  if(WorldMapType3.clanMemberManager == null) {
                     WorldMapType3.clanMemberManager = new ClanMemberManager(MapIconReference.loginType, Buffer.clientInstance);
                  }

                  WorldMapType3.clanMemberManager.method5463(var3);
               }

               GrandExchangeEvents.method13();
               var1.serverPacket = null;
               return true;
            }

            String var9;
            int var34;
            if(ServerPacket.field2115 == var1.serverPacket) {
               var49 = var3.readString();
               GameSocket.sessionToken = var49;

               try {
                  var5 = Buffer.clientInstance.getParameter(Parameters.field3596.key);
                  var65 = Buffer.clientInstance.getParameter(Parameters.field3581.key);
                  String var78 = var5 + "settings=" + var49 + "; version=1; path=/; domain=" + var65;
                  if(var49.length() == 0) {
                     var78 = var78 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                  } else {
                     var74 = var78 + "; Expires=";
                     var10 = Buffer.method3547() + 94608000000L;
                     class192.field2389.setTime(new Date(var10));
                     int var12 = class192.field2389.get(7);
                     var13 = class192.field2389.get(5);
                     var34 = class192.field2389.get(2);
                     var15 = class192.field2389.get(1);
                     int var24 = class192.field2389.get(11);
                     var35 = class192.field2389.get(12);
                     var18 = class192.field2389.get(13);
                     var9 = class192.field2390[var12 - 1] + ", " + var13 / 10 + var13 % 10 + "-" + class192.field2392[0][var34] + "-" + var15 + " " + var24 / 10 + var24 % 10 + ":" + var35 / 10 + var35 % 10 + ":" + var18 / 10 + var18 % 10 + " GMT";
                     var78 = var74 + var9 + "; Max-Age=" + 94608000L;
                  }

                  Client var75 = Buffer.clientInstance;
                  var9 = "document.cookie=\"" + var78 + "\"";
                  JSObject.getWindow(var75).eval(var9);
               } catch (Throwable var44) {
                  ;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2080 == var1.serverPacket) {
               var25 = var3.readUnsignedByte();
               if(var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var25] = new GrandExchangeOffer();
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var25] = new GrandExchangeOffer(var3, false);
               }

               field793 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2050 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2245);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2095 == var1.serverPacket) {
               FontName.method5501();
               energy = var3.readUnsignedByte();
               field775 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            Widget var52;
            if(ServerPacket.field2088 == var1.serverPacket) {
               var25 = var3.method3595();
               var52 = class26.getWidget(var25);

               for(var6 = 0; var6 < var52.itemIds.length; ++var6) {
                  var52.itemIds[var6] = -1;
                  var52.itemIds[var6] = 0;
               }

               Player.method1114(var52);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2068 == var1.serverPacket) {
               Coordinates.field2568 = var3.method3577();
               MouseRecorder.field524 = var3.method3765();
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2078 == var1.serverPacket) {
               var25 = var3.method3613();
               if(var25 == 65535) {
                  var25 = -1;
               }

               if(var25 == -1 && !field813) {
                  class9.method88();
               } else if(var25 != -1 && var25 != field812 && field811 != 0 && !field813) {
                  World.method1602(2, Item.indexTrack1, var25, 0, field811, false);
               }

               field812 = var25;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2051 == var1.serverPacket) {
               var25 = var3.method3591();
               var26 = var3.method3585();
               if(var26 == 65535) {
                  var26 = -1;
               }

               class50.method965(var26, var25);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2082 == var1.serverPacket) {
               field822 = false;

               for(var25 = 0; var25 < 5; ++var25) {
                  field823[var25] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2053 == var1.serverPacket) {
               var25 = var3.method3770();
               var26 = var3.method3646();
               var6 = var26 >> 10 & 31;
               var27 = var26 >> 5 & 31;
               var8 = var26 & 31;
               var31 = (var27 << 11) + (var6 << 19) + (var8 << 3);
               Widget var79 = class26.getWidget(var25);
               if(var31 != var79.textColor) {
                  var79.textColor = var31;
                  Player.method1114(var79);
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2124 == var1.serverPacket) {
               var25 = var3.method3609();
               var52 = class26.getWidget(var25);
               var52.modelType = 3;
               var52.modelId = class138.localPlayer.composition.method4483();
               Player.method1114(var52);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2127 == var1.serverPacket) {
               FileSystem.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2065 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2246);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2081 == var1.serverPacket) {
               MapCacheArchiveNames.method479(class171.field2241);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2093 == var1.serverPacket) {
               field795 = var3.readUnsignedShortOb1();
               publicChatMode = var3.readUnsignedShortOb1();
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2132 == var1.serverPacket) {
               var64 = var3.readUnsignedByte() == 1;
               if(var64) {
                  GraphicsObject.field1013 = Buffer.method3547() - var3.readLong();
                  WorldMapDecoration.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  WorldMapDecoration.grandExchangeEvents = null;
               }

               field774 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2098 == var1.serverPacket) {
               byte var63 = var3.method3610();
               var26 = var3.method3585();
               class225.serverVarps[var26] = var63;
               if(class225.clientVarps[var26] != var63) {
                  class225.clientVarps[var26] = var63;
               }

               class45.method749(var26);
               pendingVarbitChanges[++pendingVarbitCount - 1 & 31] = var26;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2077 == var1.serverPacket) {
               var25 = var3.method3613();
               class177.method3507(var25);
               interfaceItemTriggers[++field767 - 1 & 31] = var25 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2087 == var1.serverPacket) {
               var25 = var3.readUnsignedShort();
               var26 = var3.method3595();
               var6 = var3.method3585();
               var77 = class26.getWidget(var26);
               var77.field2732 = var6 + (var25 << 16);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2062 == var1.serverPacket) {
               DState.friendManager.ignoreContainer.method5317(var3, var1.packetLength);
               GameEngine.method910();
               if(WorldMapType3.clanMemberManager != null) {
                  WorldMapType3.clanMemberManager.method5468();
               }

               field647 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            WidgetNode var39;
            if(ServerPacket.field2063 == var1.serverPacket) {
               var25 = var3.method3609();
               var26 = var3.method3770();
               WidgetNode var66 = (WidgetNode)componentTable.get((long)var25);
               var39 = (WidgetNode)componentTable.get((long)var26);
               if(var39 != null) {
                  WorldMapData.closeWidget(var39, var66 == null || var66.id != var39.id);
               }

               if(var66 != null) {
                  var66.unlink();
                  componentTable.put(var66, (long)var26);
               }

               var73 = class26.getWidget(var25);
               if(var73 != null) {
                  Player.method1114(var73);
               }

               var73 = class26.getWidget(var26);
               if(var73 != null) {
                  Player.method1114(var73);
                  GameSocket.method3388(GameCanvas.widgets[var73.id >>> 16], var73, true);
               }

               if(widgetRoot != -1) {
                  var31 = widgetRoot;
                  if(CombatInfo2.loadWidget(var31)) {
                     class83.method1923(GameCanvas.widgets[var31], 1);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2096 == var1.serverPacket) {
               World var50 = new World();
               var50.address = var3.readString();
               var50.id = var3.readUnsignedShort();
               var26 = var3.readInt();
               var50.mask = var26;
               MouseInput.setGameState(45);
               var2.vmethod3346();
               var2 = null;
               OwnWorldComparator.changeWorld(var50);
               var1.serverPacket = null;
               return false;
            }

            if(ServerPacket.field2057 == var1.serverPacket) {
               var25 = var3.method3765();
               var26 = var3.method3595();
               var6 = var3.method3613();
               var39 = (WidgetNode)componentTable.get((long)var26);
               if(var39 != null) {
                  WorldMapData.closeWidget(var39, var6 != var39.id);
               }

               WidgetNode var72 = new WidgetNode();
               var72.id = var6;
               var72.owner = var25;
               componentTable.put(var72, (long)var26);
               class216.method4178(var6);
               Widget var57 = class26.getWidget(var26);
               Player.method1114(var57);
               if(field744 != null) {
                  Player.method1114(field744);
                  field744 = null;
               }

               LoginPacket.method3448();
               GameSocket.method3388(GameCanvas.widgets[var26 >> 16], var57, false);
               UrlRequester.runWidgetOnLoadListener(var6);
               if(widgetRoot != -1) {
                  var38 = widgetRoot;
                  if(CombatInfo2.loadWidget(var38)) {
                     class83.method1923(GameCanvas.widgets[var38], 1);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2128 == var1.serverPacket) {
               var25 = var3.method3770();
               var26 = var3.method3613();
               var30 = class26.getWidget(var25);
               if(var30 != null && var30.type == 0) {
                  if(var26 > var30.scrollHeight - var30.height) {
                     var26 = var30.scrollHeight - var30.height;
                  }

                  if(var26 < 0) {
                     var26 = 0;
                  }

                  if(var26 != var30.scrollY) {
                     var30.scrollY = var26;
                     Player.method1114(var30);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2091 == var1.serverPacket) {
               var49 = var3.readString();

               try {
                  var27 = var3.getUSmart();
                  if(var27 > 32767) {
                     var27 = 32767;
                  }

                  byte[] var37 = new byte[var27];
                  var3.offset += class300.huffman.decompress(var3.payload, var3.offset, var37, 0, var27);
                  var9 = class78.getString(var37, 0, var27);
                  var65 = var9;
               } catch (Exception var43) {
                  var65 = "Cabbage";
               }

               var65 = FontTypeFace.appendTags(ScriptState.method998(var65));
               class143.sendGameMessage(6, var49, var65);
               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2079 == var1.serverPacket) {
               var25 = var3.offset + var1.packetLength;
               var26 = var3.readUnsignedShort();
               var6 = var3.readUnsignedShort();
               if(var26 != widgetRoot) {
                  widgetRoot = var26;
                  this.method1151(false);
                  class216.method4178(widgetRoot);
                  UrlRequester.runWidgetOnLoadListener(widgetRoot);

                  for(var27 = 0; var27 < 100; ++var27) {
                     field697[var27] = true;
                  }
               }

               WidgetNode var40;
               for(; var6-- > 0; var40.field496 = true) {
                  var27 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var31 = var3.readUnsignedByte();
                  var40 = (WidgetNode)componentTable.get((long)var27);
                  if(var40 != null && var8 != var40.id) {
                     WorldMapData.closeWidget(var40, true);
                     var40 = null;
                  }

                  if(var40 == null) {
                     WidgetNode var41 = new WidgetNode();
                     var41.id = var8;
                     var41.owner = var31;
                     componentTable.put(var41, (long)var27);
                     class216.method4178(var8);
                     Widget var23 = class26.getWidget(var27);
                     Player.method1114(var23);
                     if(field744 != null) {
                        Player.method1114(field744);
                        field744 = null;
                     }

                     LoginPacket.method3448();
                     GameSocket.method3388(GameCanvas.widgets[var27 >> 16], var23, false);
                     UrlRequester.runWidgetOnLoadListener(var8);
                     if(widgetRoot != -1) {
                        var34 = widgetRoot;
                        if(CombatInfo2.loadWidget(var34)) {
                           class83.method1923(GameCanvas.widgets[var34], 1);
                        }
                     }

                     var40 = var41;
                  }
               }

               for(var39 = (WidgetNode)componentTable.first(); var39 != null; var39 = (WidgetNode)componentTable.next()) {
                  if(var39.field496) {
                     var39.field496 = false;
                  } else {
                     WorldMapData.closeWidget(var39, true);
                  }
               }

               widgetFlags = new HashTable(512);

               while(var3.offset < var25) {
                  var27 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var31 = var3.readUnsignedShort();
                  var38 = var3.readInt();

                  for(int var42 = var8; var42 <= var31; ++var42) {
                     var32 = ((long)var27 << 32) + (long)var42;
                     widgetFlags.put(new IntegerNode(var38), var32);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2064 == var1.serverPacket) {
               for(var25 = 0; var25 < class225.clientVarps.length; ++var25) {
                  if(class225.clientVarps[var25] != class225.serverVarps[var25]) {
                     class225.clientVarps[var25] = class225.serverVarps[var25];
                     class45.method749(var25);
                     pendingVarbitChanges[++pendingVarbitCount - 1 & 31] = var25;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if(ServerPacket.field2130 == var1.serverPacket) {
               var25 = var3.method3770();
               var26 = var3.readUnsignedShort();
               var30 = class26.getWidget(var25);
               if(var30.modelType != 1 || var26 != var30.modelId) {
                  var30.modelType = 1;
                  var30.modelId = var26;
                  Player.method1114(var30);
               }

               var1.serverPacket = null;
               return true;
            }

            UnitPriceComparator.processClientError("" + (var1.serverPacket != null?var1.serverPacket.packetId:-1) + "," + (var1.field1226 != null?var1.field1226.packetId:-1) + "," + (var1.field1227 != null?var1.field1227.packetId:-1) + "," + var1.packetLength, (Throwable)null);
            SoundTask.method2213();
         } catch (IOException var47) {
            WorldMapManager.method516();
         } catch (Exception var48) {
            var5 = "" + (var1.serverPacket != null?var1.serverPacket.packetId:-1) + "," + (var1.field1226 != null?var1.field1226.packetId:-1) + "," + (var1.field1227 != null?var1.field1227.packetId:-1) + "," + var1.packetLength + "," + (class138.localPlayer.pathX[0] + PendingSpawn.baseX) + "," + (class138.localPlayer.pathY[0] + baseY) + ",";

            for(var6 = 0; var6 < var1.packetLength && var6 < 50; ++var6) {
               var5 = var5 + var3.payload[var6] + ",";
            }

            UnitPriceComparator.processClientError(var5, var48);
            SoundTask.method2213();
         }

         return true;
      }
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "652063494"
   )
   final void method1233() {
      GameObject.method3103();
      if(class276.field3559 == null) {
         if(draggedWidget == null) {
            int var1 = MouseInput.mouseLastButton;
            int var2;
            int var4;
            int var5;
            int var6;
            if(isMenuOpen) {
               int var3;
               if(var1 != 1 && (InvType.middleMouseMovesCamera || var1 != 4)) {
                  var2 = MouseInput.mouseLastX;
                  var3 = MouseInput.mouseLastY * 673804999;
                  if(var2 < MouseInput.menuX - 10 || var2 > UrlRequester.field1856 + MouseInput.menuX + 10 || var3 < WorldComparator.menuY - 10 || var3 > class151.field1933 + WorldComparator.menuY + 10) {
                     isMenuOpen = false;
                     MouseInput.method948(MouseInput.menuX, WorldComparator.menuY, UrlRequester.field1856, class151.field1933);
                  }
               }

               if(var1 == 1 || !InvType.middleMouseMovesCamera && var1 == 4) {
                  var2 = MouseInput.menuX;
                  var3 = WorldComparator.menuY;
                  var4 = UrlRequester.field1856;
                  var5 = MouseInput.mouseLastPressedX;
                  var6 = MouseInput.mouseLastPressedY;
                  int var7 = -1;

                  for(int var8 = 0; var8 < menuOptionCount; ++var8) {
                     int var9 = var3 + (menuOptionCount - 1 - var8) * 15 + 31;
                     if(var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
                        var7 = var8;
                     }
                  }

                  if(var7 != -1) {
                     ItemLayer.method2564(var7);
                  }

                  isMenuOpen = false;
                  MouseInput.method948(MouseInput.menuX, WorldComparator.menuY, UrlRequester.field1856, class151.field1933);
               }
            } else {
               var2 = menuOptionCount - 1;
               if((var1 == 1 || !InvType.middleMouseMovesCamera && var1 == 4) && var2 >= 0) {
                  var4 = menuTypes[var2];
                  if(var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                     var5 = menuActionParams0[var2];
                     var6 = menuActionParams1[var2];
                     Widget var10 = class26.getWidget(var6);
                     if(class7.method83(class24.getWidgetClickMask(var10)) || class140.method3150(class24.getWidgetClickMask(var10))) {
                        if(class276.field3559 != null && !field689 && menuOptionCount > 0 && !this.method1149()) {
                           Player.method1120(field678, field821);
                        }

                        field689 = false;
                        itemPressedDuration = 0;
                        if(class276.field3559 != null) {
                           Player.method1114(class276.field3559);
                        }

                        class276.field3559 = class26.getWidget(var6);
                        field688 = var5;
                        field678 = MouseInput.mouseLastPressedX;
                        field821 = MouseInput.mouseLastPressedY;
                        if(var2 >= 0) {
                           class229.topContextMenuRow = new ContextMenuRow();
                           class229.topContextMenuRow.param0 = menuActionParams0[var2];
                           class229.topContextMenuRow.param1 = menuActionParams1[var2];
                           class229.topContextMenuRow.type = menuTypes[var2];
                           class229.topContextMenuRow.identifier = menuIdentifiers[var2];
                           class229.topContextMenuRow.option = menuOptions[var2];
                        }

                        Player.method1114(class276.field3559);
                        return;
                     }
                  }
               }

               if((var1 == 1 || !InvType.middleMouseMovesCamera && var1 == 4) && this.method1149()) {
                  var1 = 2;
               }

               if((var1 == 1 || !InvType.middleMouseMovesCamera && var1 == 4) && menuOptionCount > 0) {
                  ItemLayer.method2564(var2);
               }

               if(var1 == 2 && menuOptionCount > 0) {
                  this.openMenu(MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
               }
            }

         }
      }
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "62"
   )
   final boolean method1149() {
      int var1 = menuOptionCount - 1;
      return (field715 == 1 && menuOptionCount > 2 || class43.method713(var1)) && !menuBooleanArray[var1];
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "762160951"
   )
   @Export("openMenu")
   @Hook("menuOpened")
   final void openMenu(int var1, int var2) {
      class184.method3785(var1, var2);
      MapIcon.region.method2909(class13.plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1642962644"
   )
   final void method1151(boolean var1) {
      Script.method1946(widgetRoot, Varcs.canvasWidth, BuildType.canvasHeight, var1);
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "-1711634701"
   )
   @Export("widgetMethod0")
   void widgetMethod0(Widget var1) {
      Widget var2 = var1.parentId == -1?null:class26.getWidget(var1.parentId);
      int var3;
      int var4;
      if(var2 == null) {
         var3 = Varcs.canvasWidth;
         var4 = BuildType.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      CombatInfo1.method1563(var1, var3, var4, false);
      MapLabel.method281(var1, var3, var4);
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-114951756"
   )
   final void method1448() {
      Player.method1114(draggedWidget);
      ++class6.field39;
      if(field772 && field601) {
         int var1 = MouseInput.mouseLastX;
         int var2 = MouseInput.mouseLastY * 673804999;
         var1 -= field753;
         var2 -= field749;
         if(var1 < field757) {
            var1 = field757;
         }

         if(var1 + draggedWidget.width > field757 + field752.width) {
            var1 = field757 + field752.width - draggedWidget.width;
         }

         if(var2 < field758) {
            var2 = field758;
         }

         if(var2 + draggedWidget.height > field758 + field752.height) {
            var2 = field758 + field752.height - draggedWidget.height;
         }

         int var3 = var1 - field696;
         int var4 = var2 - field760;
         int var5 = draggedWidget.dragDeadZone;
         if(class6.field39 > draggedWidget.dragDeadTime && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            draggingWidget = true;
         }

         int var6 = var1 - field757 + field752.scrollX;
         int var7 = var2 - field758 + field752.scrollY;
         ScriptEvent var8;
         if(draggedWidget.onDragListener != null && draggingWidget) {
            var8 = new ScriptEvent();
            var8.source = draggedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.params = draggedWidget.onDragListener;
            class68.method1696(var8);
         }

         if(MouseInput.mouseCurrentButton == 0) {
            if(draggingWidget) {
               if(draggedWidget.onDragCompleteListener != null) {
                  var8 = new ScriptEvent();
                  var8.source = draggedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.target = draggedOnWidget;
                  var8.params = draggedWidget.onDragCompleteListener;
                  class68.method1696(var8);
               }

               if(draggedOnWidget != null) {
                  Widget var9 = draggedWidget;
                  int var10 = ISAACCipher.method3865(class24.getWidgetClickMask(var9));
                  Widget var13;
                  if(var10 == 0) {
                     var13 = null;
                  } else {
                     int var11 = 0;

                     while(true) {
                        if(var11 >= var10) {
                           var13 = var9;
                           break;
                        }

                        var9 = class26.getWidget(var9.parentId);
                        if(var9 == null) {
                           var13 = null;
                           break;
                        }

                        ++var11;
                     }
                  }

                  if(var13 != null) {
                     PacketNode var12 = class26.method433(ClientPacket.field2164, field626.field1218);
                     var12.packetBuffer.method3583(draggedWidget.index);
                     var12.packetBuffer.method3771(draggedWidget.itemId);
                     var12.packetBuffer.method3673(draggedOnWidget.id);
                     var12.packetBuffer.method3582(draggedOnWidget.itemId);
                     var12.packetBuffer.method3594(draggedWidget.id);
                     var12.packetBuffer.putShort(draggedOnWidget.index);
                     field626.method1980(var12);
                  }
               }
            } else if(this.method1149()) {
               this.openMenu(field696 + field753, field749 + field760);
            } else if(menuOptionCount > 0) {
               Player.method1120(field753 + field696, field749 + field760);
            }

            draggedWidget = null;
         }

      } else {
         if(class6.field39 > 1) {
            draggedWidget = null;
         }

      }
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1900287408"
   )
   public Name vmethod5420() {
      return class138.localPlayer != null?class138.localPlayer.name:null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1512027623"
   )
   static long method1535() {
      try {
         URL var0 = new URL(class142.method3161("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.payload, var4.offset, 1000 - var4.offset);
            if(var5 == -1) {
               var4.offset = 0;
               long var7 = var4.readLong();
               return var7;
            }

            var4.offset += var5;
         } while(var4.offset < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }
}
