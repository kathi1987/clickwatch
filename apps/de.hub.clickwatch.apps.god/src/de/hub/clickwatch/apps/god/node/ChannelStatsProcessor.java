package de.hub.clickwatch.apps.god.node;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import de.hub.clickwatch.apps.god.information.ChannelStatInformation;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

public class ChannelStatsProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> chStatsInfos = new ArrayList<ClientInformations>();
			Stats channelstats = (Stats) data;
			
			ChannelStatInformation chStatInfo = new ChannelStatInformation(); 
			chStatInfo.setClientMac(channelstats.getChannelstats().getNode());
			chStatInfo.setAvg_noise(channelstats.getChannelstats().getPhy().getAvg_noise());
			chStatInfo.setChannelLoad(channelstats.getChannelstats().getPhy().getHwbusy());
			
			for (Nb nbs: channelstats.getChannelstats().getNeighbourstats().getNb()) {
				String nbMac = nbs.getAddr();
	        	int rssi = nbs.getRssi();
	        	  
	        	chStatInfo.addRssi(nbMac, rssi);
			}
			
			chStatsInfos.add(chStatInfo);
			
			return chStatsInfos;
		}
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> chStatsInfos = null;
			SAXBuilder builder = new SAXBuilder();
			
			try {
				InputStream is = new ByteArrayInputStream(xmlData.getBytes());
				chStatsInfos = new ArrayList<ClientInformations>();
				Document document = (Document) builder.build(is);
				Element xml = document.getRootElement();

				if (xml.getName().equals("channelstats")) {
					ChannelStatInformation chStatInfo = new ChannelStatInformation(); 
					chStatInfo.setClientMac(xml.getAttributeValue("node"));
					chStatInfo.setAvg_noise(new Integer(xml.getChild("phy").getAttributeValue("avg_noise")));
					chStatInfo.setChannelLoad(new Integer(xml.getChild("phy").getAttributeValue("hwbusy")));
					
					for (Object nbs : xml.getChild("neighbourstats").getChildren("nb")) {
						Element xmlElement = (Element)nbs;
			        	String nbMac = xmlElement.getAttributeValue("addr");
			        	int rssi = new Integer(xmlElement.getAttributeValue("rssi"));
			        	  
			        	chStatInfo.addRssi(nbMac, rssi);
					}
					
					chStatsInfos.add(chStatInfo);
				}
				
				return chStatsInfos;
			} catch (IOException io) {
				System.out.println(io.getMessage());
			} catch (JDOMException jdomex) {
				System.out.println(jdomex.getMessage());
			}
		}
		
		return null;
	}

}
