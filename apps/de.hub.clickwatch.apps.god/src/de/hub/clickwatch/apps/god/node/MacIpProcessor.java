package de.hub.clickwatch.apps.god.node;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.MacIpInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class MacIpProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> macIpInfos = null;
			macIpInfos = new ArrayList<ClientInformations>();
			Leases leases = (Leases)data;
			
			for (Client client : leases.getDhcpleases().getClient()) {
				MacIpInformation macIp = new MacIpInformation();
				macIp.setClientIP(client.getIp());
				macIp.setClientMac(client.getMac());
				macIp.setTime(System.currentTimeMillis());
				macIpInfos.add(macIp);
			}
			
			return macIpInfos;
		}
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> macIpInfos = null;
			SAXBuilder builder = new SAXBuilder();
			try {
				InputStream is = new ByteArrayInputStream(xmlData.getBytes());
				macIpInfos = new ArrayList<ClientInformations>();
				Document document = (Document) builder.build(is);
				Element xml = document.getRootElement();
				
				if (xml.getName().equals("dhcpleases")) {
					for (Object dhcp_client : xml.getChildren("client")) {
						MacIpInformation macIp = new MacIpInformation();
						macIp.setClientIP(((Element)dhcp_client).getAttributeValue("ip"));
						macIp.setClientMac(((Element)dhcp_client).getAttributeValue("mac"));
						macIp.setTime(System.currentTimeMillis());
						macIpInfos.add(macIp);
					}
					
					return macIpInfos;
				} else {
					return null;
				}
			} catch(IOException io) {
				System.out.println(io.getMessage());
			} catch(JDOMException jdomex) {
				System.out.println(jdomex.getMessage());
			}
			
			return macIpInfos;
		}
		
		return null;
	}
}
