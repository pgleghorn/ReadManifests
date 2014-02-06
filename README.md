 usage
 
 java -jar ReadManifests.jar directory [manifest-attrib]
 
 where <directory> is the directory to find jars in
 and [manifest-attrib] is an optional manifest attribute name. If specified then only retrieve this attribute from all manifests. If not specified, then retrieve all attributes from all manifests
 
 e.g.
 
 D:\workspace\ReadManifests>java -jar ReadManifests.jar c:\FatWire\JSK\7.6.2\App_Server\apache-tomcat-6.0.32\webapps\cs\WEB-INF\lib Implementation-Version
 
 adf-faces-api.jar | 10_1_3_0_4
 adfshare.jar | no manifest
 alloyui.jar | 7.6.2 Build Date: Jan 29 2012 at 23:39:50 UI-bld- 23 Revision:144617
 analyticscs.jar | Build Date: Oct 12 2011 at 21:15:57 Analytics-bld- 662 Revision:140027
 asm-3.1.jar | 3.1
 assetapi-impl.jar | 7.6.2 Build Date: Jan 29 2012 at 23:15:24 xclG-bld- 28 Revision:144617
 assetapi.jar | 7.6.2 Build Date: Jan 29 2012 at 23:09:20 ContentServer-bld- 37 Revision:144617
 assetframework.jar | 7.6.2 Build Date: Jan 29 2012 at 23:15:24 xclG-bld- 28 Revision:144617
 assetmaker.jar | 7.6.2 Build Date: Jan 29 2012 at 23:15:24 xclG-bld- 28 Revision:144617
 basic.jar | 7.6.2 Build Date: Jan 29 2012 at 23:15:24 xclG-bld- 28 Revision:144617
 batch.jar | 7.6.2 Build Date: Jan 29 2012 at 23:09:20 ContentServer-bld- 37 Revision:144617
 catalog.jar | 7.6.2 Build Date: Jan 29 2012 at 23:15:24 xclG-bld- 28 Revision:144617
 ...
