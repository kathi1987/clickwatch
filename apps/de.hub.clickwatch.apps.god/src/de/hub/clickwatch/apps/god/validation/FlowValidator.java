package de.hub.clickwatch.apps.god.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.FlowRoute;
import de.hub.clickwatch.apps.god.information.FlowRouteChildren;
import de.hub.clickwatch.apps.god.information.FlowStatInformation;
import de.hub.clickwatch.apps.god.node.FlowStatProcessor;
import de.hub.clickwatch.apps.god.routing.GlobalLinktable;
import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;
import de.hub.clickwatch.apps.god.test.FlowWrapper;

public class FlowValidator implements Validator {
	private Map<String, String[]> validatingFlows = new HashMap<String, String[]>();
	private Map<String, String> validationDiff= new HashMap<String, String>();
	private List<String> allParticipatingAPs = new ArrayList<String>();
	
	private boolean routeIsAcceptable(String from, String to) {
		return GlobalRoutingtable.getShortestLength(from, to) != -1;
	}
	
	@Override
	public void init() {
		String[][] aps = new String[][] {
				{"06-0F-B5-3F-22-E9", "192.168.3.34"},
				{"06-0F-B5-3F-21-3C", "192.168.3.24"},
				{"06-0F-B5-97-33-6C", "192.168.3.31"},
				{"06-0F-B5-97-34-BC", "192.168.3.73"},
				{"06-0F-B5-3F-58-49", "192.168.3.45"},
				{"06-0B-6B-09-ED-73", "192.168.3.110"},
				{"06-0B-6B-09-F2-94", "192.168.3.111"},
				{"06-0C-42-0C-74-0D", "192.168.3.112"}
		};
		
		this.validatingFlows = new HashMap<String, String[]>();
		this.validationDiff = new HashMap<String, String>();
		this.allParticipatingAPs = new ArrayList<String>();
		Map<String, String> apResetList = new HashMap<String, String>();
		for (String[] ap : aps) {
			allParticipatingAPs.add(ap[1]);
			apResetList.put(ap[0], ap[1]);
			
			for (String[] targetAp : aps) {
				if (!targetAp[0].equals(ap[0])) {
					validatingFlows.put(ap[0] + " -> " + targetAp[0], new String[] {ap[0], targetAp[0], ap[1], targetAp[1]});
				}
			}
		}
		FlowWrapper.resetFlows(apResetList, false, false);
	}

	@Override
	public void startValidation() {
		int flowNum = 1;
		for (String flow : validatingFlows.keySet()) {
			System.out.print((flowNum++) + ". flow:\t" + flow + " -->");
			
			for (String participant : allParticipatingAPs) {
				Server.getInstance().handleSetter(participant, 7777, "lt", "fix_linktable", "false");
			}
			
			try {
				String[] data = validatingFlows.get(flow);
				int routeCheckCounter = 0;
				boolean routeIsUsable = false;
				while (routeCheckCounter < 20) {
					routeCheckCounter++;
					if (routeIsAcceptable(data[0], data[1])) {
						routeIsUsable = true;
						break;
					}
					Thread.sleep(600);
				}
					
				if (!routeIsUsable) {
					System.out.println(" not taken");
					continue;
				}
				
				//1. reset all participant's flowstats and fix their linktables
				System.out.print("\tresetting, ");
				for (String participant : allParticipatingAPs) {
					Server.getInstance().handleSetter(participant, 7777, "lt", "fix_linktable", "true");
					Server.getInstance().handleSetter(participant, 7777, "routing/dsr_stats", "reset", "");
				}
				Thread.sleep(500);
				
				//2. add flow
				System.out.print("adding flow, ");
				Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 300 100 0 100 true");
				Thread.sleep(2000);
				
				//3. stop flow
				System.out.print("stopping flow, ");
				Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 300 100 0 100 false");
				Thread.sleep(2000);
				
				//4. read stats about the flow
				System.out.print("processing results, ");
				boolean gotInfos = false;
				int tries = 0;
				while (!gotInfos && (tries < 20)) {
					tries++;
					HashMap<String, ClientInformations> apInfos = Server.getInstance().getStorageManager().getClientInformations(data[0]);
					if (apInfos.containsKey(FlowStatProcessor.class.getName())) {
						FlowStatInformation fs = (FlowStatInformation)apInfos.get(FlowStatProcessor.class.getName());
						for (FlowRoute route : fs.getFlowRoutes()) {
							if ((route.getSrc().equals(data[0])) && (route.getDst().equals(data[1]))) {
								route.getChildren();
								gotInfos = true;
								
								//found statistics, collect them
								String stats = "real," + data[0] + "," + data[1] + ",";
								
								for (FlowRouteChildren child : route.getChildren()) {
									StringTokenizer tok = new StringTokenizer(child.getHops(), ",");
									String hop = ""; 
									String nextHop = tok.nextToken();
									int realMetric = 0;
									while (tok.hasMoreTokens()) {
										hop = nextHop;
										nextHop = tok.nextToken();
										if (GlobalLinktable.getLinkInfos(hop, nextHop) != null) {
											realMetric += GlobalLinktable.getLinkInfos(hop, nextHop).getMetric();
										} else {
											System.err.println("\n\nhave the 'no control over node' problem");
										}
									}
									stats += realMetric + "," + child.getHop_count() + "," + child.getHops();
								}
								
								stats += "\ngod," + data[0] + "," + data[1] + "," +
										GlobalRoutingtable.getShortestLength(data[0], data[1]) + "," +
										GlobalRoutingtable.getShortestHopCount(data[0], data[1]) + "," +
										GlobalRoutingtable.getShortestPath(data[0], data[1]);
								validationDiff.put(flow, stats);
								
								break;
							}
						}
					}
					Thread.sleep(300);
				}
				
				//5. reactivate linktable of all participants
				System.out.print("finishing flow run ... ");
				for (String participant : allParticipatingAPs) {
					Server.getInstance().handleSetter(participant, 7777, "lt", "fix_linktable", "false");
				}
				
				System.out.println("done");
			} catch (InterruptedException int_exc) {
				//nothing to do
			}
		}
		
		for (String k : validationDiff.keySet()) {
			System.out.println(validationDiff.get(k) + "\n");
		}
	}

}
