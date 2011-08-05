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

import de.hub.clickwatch.apps.god.information.ChannelInformation;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel;

public class ChannelProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> channelInfos = new ArrayList<ClientInformations>();
			Systemchannel channel = (Systemchannel) data;
			
			ChannelInformation channelInfo = new ChannelInformation();
			channelInfo.setClientMac(channel.getSetchannel().getId());
			channelInfo.setChannel(channel.getSetchannel().getChannel());
			channelInfo.setTime(System.currentTimeMillis());
			channelInfos.add(channelInfo);
			
			return channelInfos;
		}
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> channelInfos = null;
			SAXBuilder builder = new SAXBuilder();
			try {
				channelInfos = new ArrayList<ClientInformations>();
				InputStream is = new ByteArrayInputStream(xmlData.getBytes());
				Document document = (Document) builder.build(is);
				Element xml = document.getRootElement();
				
				if (xml.getName().equals("setchannel")) {
					ChannelInformation channelInfo = new ChannelInformation();
					channelInfo.setClientMac(xml.getAttributeValue("id"));
					channelInfo.setChannel(new Integer(xml.getAttributeValue("channel")).intValue());
					channelInfo.setTime(System.currentTimeMillis());
					channelInfos.add(channelInfo);
					return channelInfos;
				} else {
					return null;
				}
			} catch (IOException io) {
				System.out.println(io.getMessage());
			} catch (JDOMException jdomex) {
				System.out.println(jdomex.getMessage());
			}
		}
		
		return null;
	}
}
