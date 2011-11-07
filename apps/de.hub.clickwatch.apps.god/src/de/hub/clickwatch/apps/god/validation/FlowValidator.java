package de.hub.clickwatch.apps.god.validation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.SzenarioHWL;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.FlowRoute;
import de.hub.clickwatch.apps.god.information.FlowRouteChildren;
import de.hub.clickwatch.apps.god.information.FlowStatInformation;
import de.hub.clickwatch.apps.god.node.FlowStatProcessor;
import de.hub.clickwatch.apps.god.routing.GlobalLinktable;
import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;

public class FlowValidator implements Validator {
	private Map<String, String[]> validatingFlows = new HashMap<String, String[]>();
	private List<String> allParticipatingAPs = new ArrayList<String>();
	private Map<String, Integer> validatedFlows = new HashMap<String, Integer>();
	private static String srcDstFiller = " -> ";
	private static String notFoundToken = "NOT_FOUND";
	//private static String notTakenToken = "NOT_TAKEN";
	//private static String noControlToken = "NO_CONTROL";
	private static String resultFilename = "resultsFlowRun.csv";
	private static String alternativeRoutesFilename = "alternativeRoutes.csv";
	private static int flowTestCount = 25;
	
	private boolean routeIsAcceptable(String from, String to) {
		GlobalRoutingtable.runManualDijkstra();
		return GlobalRoutingtable.getShortestLength(from, to) != -1;
	}
	
	@Override
	public void init() {
		String[][] aps = new String[][] {
				{"06-0B-6B-09-ED-73", "192.168.3.110"},
				{"06-0B-6B-09-F2-94", "192.168.3.111"},
				{"06-0C-42-0C-74-0D", "192.168.3.112"},
				//{"06-0F-B5-3F-42-62", "192.168.3.23"},
				{"06-0F-B5-3F-21-3C", "192.168.3.24"},
				{"06-0F-B5-0B-95-29", "192.168.3.25"},
				{"06-0F-B5-97-33-1D", "192.168.3.28"},
				//{"06-0F-B5-97-36-9A", "192.168.3.29"},
				{"06-0F-B5-97-33-6C", "192.168.3.31"},
				{"06-0F-B5-3F-45-57", "192.168.3.32"},
				{"06-0F-B5-3F-1E-C7", "192.168.3.33"},
				{"06-0F-B5-3F-22-E9", "192.168.3.34"},
				{"06-0F-B5-3F-22-EC", "192.168.3.35"},
				//{"06-0F-B5-97-33-D2", "192.168.3.37"},
				{"06-0F-B5-97-25-7B", "192.168.3.38"},
				{"06-0F-B5-97-38-5A", "192.168.3.39"},
				{"06-0F-B5-97-37-FC", "192.168.3.40"},
				{"06-0F-B5-3F-20-D6", "192.168.3.42"},
				{"06-0F-B5-3F-21-81", "192.168.3.43"},
				{"06-0F-B5-3F-56-B1", "192.168.3.44"},
				{"06-0F-B5-3F-58-49", "192.168.3.45"},
				//{"06-0F-B5-97-36-77", "192.168.3.46"},
				{"06-0F-B5-97-36-83", "192.168.3.47"},
				{"06-0F-B5-3F-1F-1C", "192.168.3.49"},
				{"06-0F-B5-3F-45-72", "192.168.3.51"},
				{"06-0F-B5-97-34-E9", "192.168.3.52"},
				{"06-0F-B5-97-36-D9", "192.168.3.53"},
				{"06-0F-B5-97-35-86", "192.168.3.54"},
				{"06-0F-B5-97-35-8C", "192.168.3.55"},
				{"06-0F-B5-3F-1D-3B", "192.168.3.61"},
				{"06-0F-B5-97-37-5C", "192.168.3.63"},
				{"06-0F-B5-0D-AE-34", "192.168.3.70"},
				{"06-0F-B5-97-36-7D", "192.168.3.72"},
				{"06-0F-B5-97-34-BC", "192.168.3.73"},
				{"06-0F-B5-97-37-37", "192.168.3.74"},
				{"06-0F-B5-97-36-D8", "192.168.3.77"},
				{"06-0F-B5-97-36-54", "192.168.3.78"},
				//{"06-0F-B5-97-35-E1", "192.168.3.80"},
				{"06-0F-B5-97-25-42", "192.168.3.82"},
				//{"06-0F-B5-97-25-82", "192.168.3.201"}
				{"06-11-6B-61-CF-C4", "192.168.3.118"}
		};
		
		this.validatingFlows = new HashMap<String, String[]>();
		this.allParticipatingAPs = new ArrayList<String>();
		
		validatedFlows = new HashMap<String, Integer>();
		try {
			BufferedReader fRead = new BufferedReader(new FileReader(resultFilename));
			String curr;
			while ((curr = fRead.readLine()) != null)   {
				StringTokenizer tok = new StringTokenizer(curr, ",");
				
				String type = tok.nextToken();
				String src = tok.nextToken();
				String dst = tok.nextToken();
				String metr = tok.nextToken();
				
				if ((type.equals("real")) && (!metr.equals(notFoundToken)))  {
					noticeFlowRun(src, dst);
				}
			}
		} catch (IOException ioExc) {
			//nothing
		}
		
		for (String[] ap : aps) {
			allParticipatingAPs.add(ap[1]);
			
			for (String[] targetAp : aps) {
				if ((!targetAp[0].equals(ap[0])) && (!validatingFlows.containsKey(targetAp[0] + srcDstFiller + ap[0]))) {
					if ((flowHasRunsLeft(ap[0], targetAp[0])) && (flowHasRunsLeft(targetAp[0], ap[0]))) {
						validatingFlows.put(ap[0] + srcDstFiller + targetAp[0], new String[] {ap[0], targetAp[0], ap[1], targetAp[1]});
					}
				}
			}
		}
		
		GlobalRoutingtable.setAutoDijkstra(false);
		SzenarioHWL.LINK_UPDATE_MIN_THRESHOLD = 0f;
		
		try {
			fixLinkTables(false);
			resetRouteCache();
			resetDsrStats();
		} catch (Exception e) {
			//nothing
		}
	}
	
	private boolean flowHasRunsLeft(String src, String dst) {
		if (!validatedFlows.containsKey(src + srcDstFiller + dst)) {
			return true;
		} else if (validatedFlows.get(src + srcDstFiller + dst) < flowTestCount) {
			
			return true;
		}
		
		return false;
	}
	
	private void fixLinkTables(boolean onOff) throws Exception {
		/*
		if (onOff) {
			for (String participant : allParticipatingAPs) {
				Server.getInstance().handleSetter(participant, 7777, "lt", "fix_linktable", "true");
			}
		} else {
			for (String participant : allParticipatingAPs) {
				Server.getInstance().handleSetter(participant, 7777, "lt", "fix_linktable", "false");
			}
		}
		*/
	}
	
	private class RouteCacheResetter extends Thread {
		String participant = "";
		
		public RouteCacheResetter(String part) {
			participant = part;
		}
		
		@Override
		public void run() {
			Server.getInstance().handleSetter(participant, 7777, "rc", "reset", "");
		}
	}
	
	private void resetRouteCache() throws Exception {
		for (String participant : allParticipatingAPs) {
			RouteCacheResetter rcReset = new RouteCacheResetter(participant);
			rcReset.run();
			try {
				rcReset.join(10000l);
			} catch (Exception e) {
				//nothing
			}
			
			if (rcReset.isAlive()) {
				rcReset.interrupt();
			}
			//Server.getInstance().handleSetter(participant, 7777, "rc", "reset", "");
		}
	}
	
	private class DsrResetter extends Thread {
		String participant = "";
		
		public DsrResetter(String part) {
			participant = part;
		}
		
		@Override
		public void run() {
			Server.getInstance().handleSetter(participant, 7777, "routing/dsr_stats", "reset", "");
		}
	}
	
	private void resetDsrStats() {
		for (String participant : allParticipatingAPs) {
			DsrResetter dsrReset = new DsrResetter(participant);
			dsrReset.run();
			try {
				dsrReset.join(10000l);
			} catch (Exception e) {
				//nothing
			}
			
			if (dsrReset.isAlive()) {
				dsrReset.interrupt();
			}
			//Server.getInstance().handleSetter(participant, 7777, "routing/dsr_stats", "reset", "");
		}
	}
	
	private void noticeFlowRun(String src, String dst) {
		if (validatedFlows.containsKey(src + srcDstFiller + dst)) {
			validatedFlows.put(src + srcDstFiller + dst, validatedFlows.get(src + srcDstFiller + dst) + 1);
		} else {
			validatedFlows.put(src + srcDstFiller + dst, 1);
		}
	}
	
	private void processStats(String src, String dst) {
		boolean gotInfos = false;
		int tries = 0;
		GlobalLinktable.acceptChanges(false);	//from now on no changes on linktable will be accepted
		while (!gotInfos && (tries < 50)) {
			tries++;
			HashMap<String, ClientInformations> apInfos = Server.getInstance().getStorageManager().getClientInformations(src);
			
			if (apInfos.containsKey(FlowStatProcessor.class.getName())) {
				FlowStatInformation fs = (FlowStatInformation)apInfos.get(FlowStatProcessor.class.getName());
				
				for (FlowRoute route : fs.getFlowRoutes()) {
					if ((route.getSrc().equals(src)) && (route.getDst().equals(dst))) {
						gotInfos = true;
						double foundRouteHasTime = 0;
						long foundRouteHasMetric = -1;
						String foundRouteHasHops = "";
						long foundRouteHasUsage = 0;
						long foundRouteHasHopCount = -1;
						boolean noControlProblem = false;
						boolean noticeAlternativeRoutes = false;
						
						for (FlowRouteChildren child : route.getChildren()) {
							StringTokenizer tok = new StringTokenizer(child.getHops(), ",");
							String hop = ""; 
							String nextHop = tok.nextToken();
							int realMetric = 0;
							
							if (noticeAlternativeRoutes) {
								writeAlternativeRouteToFile(src, dst, foundRouteHasTime, foundRouteHasUsage, foundRouteHasMetric, foundRouteHasHopCount, foundRouteHasHops);
							}
							
							if (child.getLast_usage() > foundRouteHasTime) {
								while (tok.hasMoreTokens()) {
									hop = nextHop;
									nextHop = tok.nextToken();
									if (GlobalLinktable.getLinkInfos(hop, nextHop) != null) {
										realMetric += GlobalLinktable.getLinkInfos(hop, nextHop).getMetric();
									} else {
										noControlProblem = true;
										break;
									}
								}
								
								foundRouteHasTime = child.getLast_usage();
								foundRouteHasMetric = realMetric;
								foundRouteHasHops = child.getHops();
								foundRouteHasHopCount = child.getHop_count();
								foundRouteHasUsage = child.getUsage();
								noticeAlternativeRoutes = true;
							}
						}
						
						if (!noControlProblem) {
							SzenarioHWL.LINK_USE_IN_DIJKSTRA_MAX_VALUE = Integer.MAX_VALUE;
							GlobalRoutingtable.runManualDijkstra();
							writeToResultFile(src, dst, foundRouteHasUsage, foundRouteHasMetric, foundRouteHasHopCount, foundRouteHasHops);
							writeAlternativeRouteToFile(src, dst, foundRouteHasTime, foundRouteHasUsage, foundRouteHasMetric, foundRouteHasHopCount, foundRouteHasHops);
							noticeFlowRun(src, dst);
							SzenarioHWL.LINK_USE_IN_DIJKSTRA_MAX_VALUE = 200;
							System.out.print("[added] ");
							return;
						} else {
							//writeToResultFile(src, dst, -1, GlobalRoutingtable.getShortestLength(src, dst), -1, GlobalRoutingtable.getShortestHopCount(src, dst), noControlToken, GlobalRoutingtable.getShortestPath(src, dst));
							noticeFlowRun(src, dst);
							System.out.print("[flow over uncontrolled node problem] ");
							return;
						}
					}
				}	
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException inExc) {
				//nothing to do
			}
		}
		//writeToResultFile(src, dst, -1, GlobalRoutingtable.getShortestLength(src, dst), -1, GlobalRoutingtable.getShortestHopCount(src, dst), notFoundToken, GlobalRoutingtable.getShortestPath(src, dst));
		
		GlobalLinktable.acceptChanges(true);	//turn acception for changes on linktable back on again
		System.out.print("[NOT added] ");
	}
	
	@Override
	public void startValidation() {
		int flowNum = 1;
		boolean waitAfterThisRun = false;
		boolean godValuesFresh = false;
		
		for (String flow : validatingFlows.keySet()) {
			System.out.print("\n\n\n" + (flowNum++) + ".flow (of " + validatingFlows.size() + "):\t" + flow + " --> ");
			
			String[] data = validatingFlows.get(flow);
			
			while (flowHasRunsLeft(data[0], data[1])) {
				try {
					if (waitAfterThisRun) {
						//1. reset
						System.out.print("\tresetting and waiting 1min (@" + new Date() + "), ");
						resetDsrStats();
						resetRouteCache();
						fixLinkTables(false);
						waitAfterThisRun = false;
						Thread.sleep(1000*60); //wait 1min
						fixLinkTables(true);
					}
					
					Thread.sleep(2000);
					GlobalRoutingtable.runManualDijkstra();
					
					godValuesFresh = false;
					if (!routeIsAcceptable(data[0], data[1])) {
						System.out.print("not taken, ");
						while (flowHasRunsLeft(data[0], data[1])) {
							noticeFlowRun(data[0], data[1]);
							waitAfterThisRun = false;
							//writeToResultFile(data[0], data[1], -1, -1, -1, -1, notTakenToken, notTakenToken);
						}
						continue;
					} else {
						if (GlobalRoutingtable.getShortestPath(data[0], data[1]) != null) {
							godValuesFresh = true;
						}
					}
					
					waitAfterThisRun = true;
					
					
					//2. add flow
					System.out.print("adding flow, ");
					Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 2000 100 0 100 true");
					Thread.sleep(8000);
					
					
					//3. stop flow
					System.out.print("stopping flow, ");
					Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 2000 100 0 100 false");
					Thread.sleep(2000);
					
					
					//4. process stats about the flow
					System.out.print("processing results ... ");
					if (godValuesFresh) {
						processStats(data[0], data[1]);
					} else {
						System.out.print("[failure while getting GlobalRoutingTable Values] ");
					}
					
					System.out.println("done");
				} catch (Exception exc) {
					//nothing to do
					System.out.println("\nglobal exception: " + exc.getMessage());
					exc.printStackTrace();
				}
			}
		}
	}
	
	private void writeToResultFile(String src, String dst, long real_usage, long real_metric, long real_hop_count, String real_route) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(resultFilename, true);
			
			//fw.write("real,"+ src + "," + dst + "," + real_metric + "," + real_hop_count + "," + real_route  + "\n");
			//fw.write("god,"+ src + "," + dst + "," + god_metric + "," + god_hop_count + "," + god_route.replaceAll(";", ",")  + "\n");
			fw.write(src + "," + dst + "," + real_metric + "," + real_usage + "," + real_hop_count + "," + real_route.replaceAll(",", ";") + "," + GlobalRoutingtable.getShortestLength(src, dst) + "," + GlobalRoutingtable.getShortestHopCount(src, dst) + "," + GlobalRoutingtable.getShortestPath(src, dst).replaceAll(",", ";") + "," + GlobalLinktable.getLinktableAsString() + "\n");
			
			fw.close();
		} catch (Exception exc) {
			//nothing
		} finally { 
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					//nothing
				}
			}
		}
	}
	
	private void writeAlternativeRouteToFile(String src, String dst, double time, long usage, long metric, long hop_count, String route) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(alternativeRoutesFilename, true);
			
			//fw.write("real,"+ src + "," + dst + "," + real_metric + "," + real_hop_count + "," + real_route  + "\n");
			//fw.write("god,"+ src + "," + dst + "," + god_metric + "," + god_hop_count + "," + god_route.replaceAll(";", ",")  + "\n");
			fw.write(src + "," + dst + "," + time + "," + usage + "," + metric + "," + hop_count + "," + route.replaceAll(",", ";") + "," + GlobalLinktable.getLinktableAsString() + "\n");
			
			fw.close();
		} catch (Exception exc) {
			//nothing
		} finally { 
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					//nothing
				}
			}
		}
	}
}
