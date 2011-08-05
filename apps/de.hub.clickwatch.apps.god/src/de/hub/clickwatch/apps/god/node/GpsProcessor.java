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

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.GpsInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord;

public class GpsProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> gpsInfos = new ArrayList<ClientInformations>();
			Gps_coord gps_coord = (Gps_coord)data;
			
			GpsInformation gps = new GpsInformation();
        	gps.setClientMac(gps_coord.getGps().getId());
        	gps.setLat(gps_coord.getGps().getLat());
        	gps.setLon(gps_coord.getGps().getLong());
        	gps.setAlt(gps_coord.getGps().getAlt());
        	gps.setSpeed(gps_coord.getGps().getSpeed());
        	gps.setTime(System.currentTimeMillis());
        	
        	gpsInfos.add(gps);
        	return gpsInfos;
        }
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> gpsInfos = null;
			SAXBuilder builder = new SAXBuilder();
			try {
				gpsInfos = new ArrayList<ClientInformations>();
				
                InputStream is = new ByteArrayInputStream(xmlData.getBytes());
                Document document = (Document) builder.build(is);
                Element xml = document.getRootElement();
                if (xml.getName().equals("gps")) {
                	GpsInformation gps = new GpsInformation();
                	gps.setClientMac(xml.getAttributeValue("id"));
                	gps.setLat(new Double(xml.getAttributeValue("lat")));
                	gps.setLon(new Double(xml.getAttributeValue("long")));
                	gps.setAlt(new Double(xml.getAttributeValue("alt")));
                	gps.setSpeed(new Double(xml.getAttributeValue("speed")));
                	gps.setTime(System.currentTimeMillis());
                	
                	gpsInfos.add(gps);
                	return gpsInfos;
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
