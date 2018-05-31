import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("IndexData")
public class IndexData extends IndexDataBase {
   @ObfuscatedName("ab")
   @Export("crc32")
   static CRC32 crc32;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 194552531
   )
   static int field3192;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   @Export("indexStore")
   IndexFile indexStore;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   @Export("referenceStore")
   IndexFile referenceStore;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1684100553
   )
   @Export("index")
   int index;
   @ObfuscatedName("v")
   volatile boolean field3188;
   @ObfuscatedName("af")
   boolean field3191;
   @ObfuscatedName("ah")
   @Export("validArchives")
   volatile boolean[] validArchives;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1809929257
   )
   @Export("crcValue")
   int crcValue;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 439984845
   )
   @Export("indexReferenceVersion")
   int indexReferenceVersion;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 856504919
   )
   int field3194;

   static {
      crc32 = new CRC32();
   }

   @ObfuscatedSignature(
      signature = "(Lff;Lff;IZZZ)V"
   )
   public IndexData(IndexFile var1, IndexFile var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3188 = false;
      this.field3191 = false;
      this.field3194 = -1;
      this.indexStore = var1;
      this.referenceStore = var2;
      this.index = var3;
      this.field3191 = var6;
      int var8 = this.index;
      if(class185.NetCache_reference != null) {
         class185.NetCache_reference.offset = var8 * 8 + 5;
         int var9 = class185.NetCache_reference.readInt();
         int var10 = class185.NetCache_reference.readInt();
         this.setInformation(var9, var10);
      } else {
         MapLabel.requestNetFile((IndexData)null, 255, 255, 0, (byte)0, true);
         class250.NetCache_indexCaches[var8] = this;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
   )
   void vmethod4721(int var1) {
      class54.method1021(this.index, var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "35"
   )
   int archiveLoadPercent(int var1) {
      if(super.archives[var1] != null) {
         return 100;
      } else if(this.validArchives[var1]) {
         return 100;
      } else {
         int var3 = this.index;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if(class250.currentRequest != null && var4 == class250.currentRequest.hash) {
            var2 = class301.NetCache_responseArchiveBuffer.offset * 99 / (class301.NetCache_responseArchiveBuffer.payload.length - class250.currentRequest.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "10"
   )
   void loadArchive(int var1) {
      if(this.indexStore != null && this.validArchives != null && this.validArchives[var1]) {
         IndexFile var2 = this.indexStore;
         byte[] var4 = null;
         Deque var5 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            for(FileSystem var6 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.getFront(); var6 != null; var6 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.getNext()) {
               if((long)var1 == var6.hash && var2 == var6.index && var6.type == 0) {
                  var4 = var6.field3149;
                  break;
               }
            }
         }

         if(var4 != null) {
            this.load(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.read(var1);
            this.load(var2, var1, var9, true);
         }
      } else {
         MapLabel.requestNetFile(this, this.index, var1, super.archiveCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "75"
   )
   @Export("percentage")
   public int percentage() {
      if(this.field3188) {
         return 100;
      } else if(super.archives != null) {
         return 99;
      } else {
         int var2 = this.index;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if(class250.currentRequest != null && var3 == class250.currentRequest.hash) {
            var1 = class301.NetCache_responseArchiveBuffer.offset * 99 / (class301.NetCache_responseArchiveBuffer.payload.length - class250.currentRequest.padding) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if(var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1996421048"
   )
   @Export("setInformation")
   public void setInformation(int var1, int var2) {
      this.crcValue = var1;
      this.indexReferenceVersion = var2;
      if(this.referenceStore != null) {
         int var3 = this.index;
         IndexFile var4 = this.referenceStore;
         byte[] var6 = null;
         Deque var7 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            for(FileSystem var8 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.getFront(); var8 != null; var8 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.getNext()) {
               if((long)var3 == var8.hash && var4 == var8.index && var8.type == 0) {
                  var6 = var8.field3149;
                  break;
               }
            }
         }

         if(var6 != null) {
            this.load(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.read(var3);
            this.load(var4, var3, var11, true);
         }
      } else {
         MapLabel.requestNetFile(this, 255, this.index, this.crcValue, (byte)0, true);
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "-1745310697"
   )
   @Export("write")
   public void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.field3188) {
            throw new RuntimeException();
         }

         if(this.referenceStore != null) {
            int var5 = this.index;
            IndexFile var6 = this.referenceStore;
            FileSystem var7 = new FileSystem();
            var7.type = 0;
            var7.hash = (long)var5;
            var7.field3149 = var2;
            var7.index = var6;
            Deque var8 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
            synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
               IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.addFront(var7);
            }

            PacketBuffer.method3848();
         }

         this.setIndexReference(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.archiveRevisions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.archiveRevisions[var1];
         if(this.indexStore != null) {
            IndexFile var11 = this.indexStore;
            FileSystem var14 = new FileSystem();
            var14.type = 0;
            var14.hash = (long)var1;
            var14.field3149 = var2;
            var14.index = var11;
            Deque var15 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
            synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
               IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.addFront(var14);
            }

            PacketBuffer.method3848();
            this.validArchives[var1] = true;
         }

         if(var4) {
            super.archives[var1] = class159.byteArrayToObject(var2, false);
         }
      }

   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "(Lff;I[BZB)V",
      garbageValue = "-91"
   )
   @Export("load")
   void load(IndexFile var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(var1 == this.referenceStore) {
         if(this.field3188) {
            throw new RuntimeException();
         } else if(var3 == null) {
            MapLabel.requestNetFile(this, 255, this.index, this.crcValue, (byte)0, true);
         } else {
            crc32.reset();
            crc32.update(var3, 0, var3.length);
            var5 = (int)crc32.getValue();
            if(var5 != this.crcValue) {
               MapLabel.requestNetFile(this, 255, this.index, this.crcValue, (byte)0, true);
            } else {
               Buffer var9 = new Buffer(GameEngine.decodeContainer(var3));
               int var7 = var9.readUnsignedByte();
               if(var7 != 5 && var7 != 6) {
                  throw new RuntimeException(var7 + "," + this.index + "," + var2);
               } else {
                  int var8 = 0;
                  if(var7 >= 6) {
                     var8 = var9.readInt();
                  }

                  if(var8 != this.indexReferenceVersion) {
                     MapLabel.requestNetFile(this, 255, this.index, this.crcValue, (byte)0, true);
                  } else {
                     this.setIndexReference(var3);
                     this.loadAllLocal();
                  }
               }
            }
         }
      } else {
         if(!var4 && var2 == this.field3194) {
            this.field3188 = true;
         }

         if(var3 != null && var3.length > 2) {
            crc32.reset();
            crc32.update(var3, 0, var3.length - 2);
            var5 = (int)crc32.getValue();
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if(var5 == super.archiveCrcs[var2] && var6 == super.archiveRevisions[var2]) {
               this.validArchives[var2] = true;
               if(var4) {
                  super.archives[var2] = class159.byteArrayToObject(var3, false);
               }

            } else {
               this.validArchives[var2] = false;
               if(this.field3191 || var4) {
                  MapLabel.requestNetFile(this, this.index, var2, super.archiveCrcs[var2], (byte)2, var4);
               }

            }
         } else {
            this.validArchives[var2] = false;
            if(this.field3191 || var4) {
               MapLabel.requestNetFile(this, this.index, var2, super.archiveCrcs[var2], (byte)2, var4);
            }

         }
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-160763890"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validArchives = new boolean[super.archives.length];

      int var1;
      for(var1 = 0; var1 < this.validArchives.length; ++var1) {
         this.validArchives[var1] = false;
      }

      if(this.indexStore == null) {
         this.field3188 = true;
      } else {
         this.field3194 = -1;

         for(var1 = 0; var1 < this.validArchives.length; ++var1) {
            if(super.archiveNumberOfFiles[var1] > 0) {
               IndexFile var2 = this.indexStore;
               FileSystem var4 = new FileSystem();
               var4.type = 1;
               var4.hash = (long)var1;
               var4.index = var2;
               var4.data = this;
               Deque var5 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
               synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
                  IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.addFront(var4);
               }

               PacketBuffer.method3848();
               this.field3194 = var1;
            }
         }

         if(this.field3194 == -1) {
            this.field3188 = true;
         }

      }
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "270216094"
   )
   public boolean method4725(int var1) {
      return this.validArchives[var1];
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1526395619"
   )
   public boolean method4734(int var1) {
      return this.getChilds(var1) != null;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1226405037"
   )
   @Export("loadPercent")
   public int loadPercent() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.archives.length; ++var3) {
         if(super.archiveNumberOfFiles[var3] > 0) {
            var1 += 100;
            var2 += this.archiveLoadPercent(var3);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }
}
