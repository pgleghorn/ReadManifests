package com.oracle.support;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class ReadManifests {

	private void doWork(File dir, String attrib) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				try {
					JarFile jar = new JarFile(f.getCanonicalFile());
					Manifest mf = jar.getManifest();

					if (mf == null) {
						System.out.println(f.getName() + " | " + "no manifest");
					} else {
						Attributes mainAttribs = mf.getMainAttributes();
						Set<Entry<Object, Object>> entries = mainAttribs
								.entrySet();

						for (Entry<Object, Object> e : entries) {

							Name key = (Name) e.getKey();
							String value = (String) e.getValue();
							if (attrib != null) {
								if (attrib.equalsIgnoreCase(key.toString()))
									System.out.println(f.getName() + " | "
											+ value);
							} else {
								System.out.println(f.getName() + " | " + key
										+ "=" + value);
							}
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadManifests rm = new ReadManifests();
		if (args.length < 2) {
			rm.doWork(new File(args[0]), null);
		} else {
			rm.doWork(new File(args[0]), args[1]);
		}
	}

}