package de.hub.clickwatch.apps.god.node;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.PowerInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class PowerProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> powerInfos = new ArrayList<ClientInformations>();
			PowerInformation power = new PowerInformation();
			Systempower systempower = (Systempower)data;
			
			power.setClientMac(systempower.getSettxpower().getId());
			power.setPower(systempower.getSettxpower().getPower());
			power.setTime(System.currentTimeMillis());
			powerInfos.add(power);
			
			return powerInfos;
		}
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> powerInfos = null;
			SAXBuilder builder = new SAXBuilder();
			
			try {
				InputStream is = new ByteArrayInputStream(xmlData.getBytes());
				powerInfos = new ArrayList<ClientInformations>();
				Document document = (Document) builder.build(is);
				Element xml = document.getRootElement();
				PowerInformation power = new PowerInformation();
				if (xml.getName().equals("settxpower")) {
					power.setClientMac(xml.getAttributeValue("id"));
					power.setPower(new Integer(xml.getAttributeValue("power")).intValue());
					power.setTime(System.currentTimeMillis());
					powerInfos.add(power);
					return powerInfos;
				} else {
					return null;
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
