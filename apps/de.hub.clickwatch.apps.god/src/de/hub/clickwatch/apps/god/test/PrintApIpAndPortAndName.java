package de.hub.clickwatch.apps.god.test;

import java.util.StringTokenizer;

public class PrintApIpAndPortAndName {

	public void printApIpAndPortAndName() {
		try {
			String nameMac = 
				"sk110 ath0 06-0B-6B-09-ED-73 8\n" +
				"sk111 ath0 06-0B-6B-09-F2-94 9\n" +
				"sk112 ath0 06-0C-42-0C-74-0D 10\n" +
				"wgt23 ath0 06-0F-B5-3F-42-62 11\n" +
				"wgt24 ath0 06-0F-B5-3F-21-3C 12\n" +
				"wgt25 ath0 06-0F-B5-0B-95-29 13\n" +
				"wgt28 ath0 06-0F-B5-97-33-1D 14\n" +
				"wgt29 ath0 06-0F-B5-97-36-9A 15\n" +
				"wgt31 ath0 06-0F-B5-97-33-6C 16\n" +
				"wgt32 ath0 06-0F-B5-3F-45-57 17\n" +
				"wgt33 ath0 06-0F-B5-3F-1E-C7 18\n" +
				"wgt34 ath0 06-0F-B5-3F-22-E9 19\n" +
				"wgt35 ath0 06-0F-B5-3F-22-EC 33\n" +
				"wgt37 ath0 06-0F-B5-97-33-D2 21\n" +
				"wgt38 ath0 06-0F-B5-97-25-7B 22\n" +
				"wgt39 ath0 06-0F-B5-97-38-5A 23\n" +
				"wgt40 ath0 06-0F-B5-97-37-FC 24\n" +
				"wgt42 ath0 06-0F-B5-3F-20-D6 26\n" +
				"wgt43 ath0 06-0F-B5-3F-21-81 27\n" +
				"wgt44 ath0 06-0F-B5-3F-56-B1 28\n" +
				"wgt45 ath0 06-0F-B5-3F-58-49 29\n" +
				"wgt46 ath0 06-0F-B5-97-36-77 30\n" +
				"wgt47 ath0 06-0F-B5-97-36-83 31\n" +
				"wgt49 ath0 06-0F-B5-3F-1F-1C 32\n" +
				"wgt51 ath0 06-0F-B5-3F-45-72 20\n" +
				"wgt52 ath0 06-0F-B5-97-34-E9 34\n" +
				"wgt53 ath0 06-0F-B5-97-36-D9 35\n" +
				"wgt54 ath0 06-0F-B5-97-35-86 36\n" +
				"wgt55 ath0 06-0F-B5-97-35-8C 37\n" +
				"wgt61 ath0 06-0F-B5-3F-1D-3B 38\n" +
				"wgt63 ath0 06-0F-B5-97-37-5C 39\n" +
				"wgt70 ath0 06-0F-B5-0D-AE-34 40\n" +
				"wgt72 ath0 06-0F-B5-97-36-7D 42\n" +
				"wgt73 ath0 06-0F-B5-97-34-BC 43\n" +
				"wgt74 ath0 06-0F-B5-97-37-37 44\n" +
				"wgt77 ath0 06-0F-B5-97-36-D8 46\n" +
				"wgt78 ath0 06-0F-B5-97-36-54 47\n" +
				"wgt80 ath0 06-0F-B5-97-35-E1 49\n" +
				"wgt82 ath0 06-0F-B5-97-25-42 51\n" +
				"wgt201 ath0 06-0F-B5-97-25-82 52\n" +
				"seismo162 ath0 00-1B-B1-05-3B-75\n" +
				"seismo151 ath0 00-1B-B1-05-3B-5D\n";
			StringTokenizer macTok = new StringTokenizer(nameMac, "\n");
			while (macTok.hasMoreTokens()) {
				String line = macTok.nextToken();
				StringTokenizer elem = new StringTokenizer(line, " ");
				String name = elem.nextToken();
				elem.nextToken();
				String mac = elem.nextToken();
				
				if (!name.startsWith("pc")) {
					String ipNum = name.replaceAll("wndr", "").replaceAll("wrt", "").replaceAll("seismo", "").replaceAll("sk", "").replaceAll("wgt", "");
					//System.out.println("{\"192.168.3." + ipNum + "\", \"7777\", \"" + name + "\"},");
					System.out.println("{\"" + mac + "\", \"192.168.3." + ipNum + "\"},");
				}
			}
			
			
			
		} catch (Exception exc) {
			System.out.println("have exception: " + exc.getMessage());
		}
		System.exit(0);
	}
}
