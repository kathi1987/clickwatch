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

import de.hub.clickwatch.apps.god.information.APInformations;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.StatsInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

public class StatsProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> statsInfos = new ArrayList<ClientInformations>();
			Stats stats = (Stats)data;
			
			String apName = stats.getChannelstats().getNode();
			int avg_noise = stats.getChannelstats().getPhy().getAvg_noise(); 
			int std_noise = stats.getChannelstats().getPhy().getStd_noise();
			int channelLoad = stats.getChannelstats().getPhy().getHwbusy();
			String timeStamp = "" + stats.getChannelstats().getTime();
			
			//add node itself to get info
			APInformations apInfoSelf = new APInformations(apName);
			apInfoSelf.setRssi(0);
			apInfoSelf.setStd_rssi(0);
			apInfoSelf.setMin_rssi(0);
			apInfoSelf.setMax_rssi(0);
			apInfoSelf.setPkt_cnt(0);
			apInfoSelf.setAvg_noise(avg_noise);
			apInfoSelf.setStd_noise(std_noise);
			apInfoSelf.setTimeStamp(timeStamp);
			apInfoSelf.setTime(System.currentTimeMillis());
			
			StatsInformation statInfoSelf = new StatsInformation();
			statInfoSelf.setChannelLoad(channelLoad);
			statInfoSelf.addApInformation(apInfoSelf);
			statInfoSelf.setTime(System.currentTimeMillis());
			statInfoSelf.setClientMac(apName);
			
			statsInfos.add(statInfoSelf);
			
			// now add the neighbours (stuff for neighbours)
			for (Nb nbs : stats.getChannelstats().getNeighbourstats().getNb()) {
				if ((nbs.getPkt_cnt() > 1) &&	//add only clients, that send more, than one package
					(nbs.getRssi() > 0)) {		//add only clients with higher rssi value than 0
					APInformations apInfo = new APInformations(apName);
					apInfo.setRssi(nbs.getRssi());
					apInfo.setStd_rssi(nbs.getStd_rssi());
					apInfo.setMin_rssi(nbs.getMin_rssi());
					apInfo.setMax_rssi(nbs.getMax_rssi());
					apInfo.setPkt_cnt(nbs.getPkt_cnt());
					apInfo.setAvg_noise(avg_noise);
					apInfo.setStd_noise(std_noise);
					apInfo.setTimeStamp(timeStamp);
					apInfo.setTime(System.currentTimeMillis());
					
					StatsInformation statInfo = new StatsInformation();
					statInfo.setChannelLoad(channelLoad);
					statInfo.addApInformation(apInfo);
					statInfo.setTime(System.currentTimeMillis());
					statInfo.setClientMac(nbs.getAddr());
					
					statsInfos.add(statInfo);
				}
			}
			
			return statsInfos;	
		}
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> statsInfos = null;
			SAXBuilder builder = new SAXBuilder();
			try {
				InputStream is = new ByteArrayInputStream(xmlData.getBytes());
				statsInfos = new ArrayList<ClientInformations>();
				Document document = (Document) builder.build(is);
				Element xml = document.getRootElement();
				
				if (xml.getName().equals("channelstats")) {
					String apName = xml.getAttributeValue("node");
					int avg_noise = new Integer(xml.getChild("phy").getAttributeValue("avg_noise")).intValue();
					int std_noise = new Integer(xml.getChild("phy").getAttributeValue("std_noise")).intValue();
					int channelLoad = new Integer(xml.getChild("phy").getAttributeValue("hwbusy")).intValue();
					String timeStamp = xml.getAttributeValue("time");
					
					//add node itself to get info
					APInformations apInfoSelf = new APInformations(apName);
					apInfoSelf.setRssi(0);
					apInfoSelf.setStd_rssi(0);
					apInfoSelf.setMin_rssi(0);
					apInfoSelf.setMax_rssi(0);
					apInfoSelf.setPkt_cnt(0);
					apInfoSelf.setAvg_noise(avg_noise);
					apInfoSelf.setStd_noise(std_noise);
					apInfoSelf.setTimeStamp(timeStamp);
					apInfoSelf.setTime(System.currentTimeMillis());
					
					StatsInformation statInfoSelf = new StatsInformation();
					statInfoSelf.setChannelLoad(channelLoad);
					statInfoSelf.addApInformation(apInfoSelf);
					statInfoSelf.setTime(System.currentTimeMillis());
					statInfoSelf.setClientMac(apName);
					
					statsInfos.add(statInfoSelf);
					
					// now add the neighbours (stuff for neighbours)
					for (Object nbs : xml.getChild("neighbourstats").getChildren("nb")) {
						if ((new Integer(((Element)nbs).getAttributeValue("pkt_cnt")).intValue() > 1) &&	//add only clients, that send more, than one package
							(new Integer(((Element)nbs).getAttributeValue("rssi")).intValue() > 0)) {		//add only clients with higher rssi value than 0
							APInformations apInfo = new APInformations(apName);
							apInfo.setRssi((new Integer(((Element)nbs).getAttributeValue("rssi")).intValue()));
							apInfo.setStd_rssi((new Integer(((Element)nbs).getAttributeValue("std_rssi")).intValue()));
							apInfo.setMin_rssi((new Integer(((Element)nbs).getAttributeValue("min_rssi")).intValue()));
							apInfo.setMax_rssi((new Integer(((Element)nbs).getAttributeValue("max_rssi")).intValue()));
							apInfo.setPkt_cnt((new Integer(((Element)nbs).getAttributeValue("pkt_cnt")).intValue()));
							apInfo.setAvg_noise(avg_noise);
							apInfo.setStd_noise(std_noise);
							apInfo.setTimeStamp(timeStamp);
							apInfo.setTime(System.currentTimeMillis());
							
							StatsInformation statInfo = new StatsInformation();
							statInfo.setChannelLoad(channelLoad);
							statInfo.addApInformation(apInfo);
							statInfo.setTime(System.currentTimeMillis());
							statInfo.setClientMac(((Element)nbs).getAttributeValue("addr"));
							
							statsInfos.add(statInfo);
						}
					}
					
					return statsInfos;
				}
			} catch(IOException io) {
				System.out.println(io.getMessage());
			} catch(JDOMException jdomex) {
				System.out.println(jdomex.getMessage());
			}
		}
		
		return null;
	}
}
