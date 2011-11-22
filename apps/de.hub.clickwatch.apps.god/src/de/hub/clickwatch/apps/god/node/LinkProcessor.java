package de.hub.clickwatch.apps.god.node;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.LinkInformation;
import de.hub.clickwatch.apps.god.information.RateLinkInformation;
import de.hub.clickwatch.apps.god.information.SpecificLinkInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;

public class LinkProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> linkInfos = new ArrayList<ClientInformations>();
		    Bcast_stats bcast_stats = (Bcast_stats)data;
		   
		    LinkInformation linkInf = new LinkInformation();
        	linkInf.setClientMac(bcast_stats.getEntry().getFrom());
        	linkInf.setPeriod(bcast_stats.getEntry().getPeriod());
        	linkInf.setSeq(bcast_stats.getEntry().getSeq());
        	linkInf.setTau(bcast_stats.getEntry().getTau());
        	
        	for (Link link : bcast_stats.getEntry().getLink()) {
        		SpecificLinkInformation specificLinkInf = new SpecificLinkInformation();
        		specificLinkInf.setMac(link.getTo());
        		specificLinkInf.setLast_rx(link.getLast_rx());
        		specificLinkInf.setTau(link.getTau());
        		specificLinkInf.setPeriod(link.getPeriod());
        		specificLinkInf.setSeq(link.getSeq());
        		
        		Map<Integer, RateLinkInformation> rateInfos = new HashMap<Integer, RateLinkInformation>();
        		
        		for (Link_info link_info: link.getLink_info()) {
        			RateLinkInformation rateLinkInf = new RateLinkInformation();
        			rateLinkInf.setFwd(link_info.getFwd());
        			rateLinkInf.setRate(link_info.getRate());
        			rateLinkInf.setRev(link_info.getRev());
        			rateLinkInf.setSize(link_info.getSize());
        			
        			rateInfos.put(rateLinkInf.getRate(), rateLinkInf);
        		}
        		
        		specificLinkInf.setLink_info(rateInfos);
        		linkInf.addLinkListInformation(specificLinkInf);
        	}
        	
        	linkInfos.add(linkInf);
        	return linkInfos;
        }
        
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		if (xmlData != null) {
			List<ClientInformations> linkInfos = null;
			SAXBuilder builder = new SAXBuilder();
            try {
                linkInfos = new ArrayList<ClientInformations>();

                InputStream is = new ByteArrayInputStream(xmlData.getBytes());
                Document document = (Document) builder.build(is);
                Element xml = document.getRootElement();

                if (xml.getName().equals("entry")) {
                	LinkInformation linkInf = new LinkInformation();
                	linkInf.setClientMac(xml.getAttributeValue("from"));
                	linkInf.setPeriod(new Integer(xml.getAttributeValue("period")));
                	linkInf.setSeq(new Integer(xml.getAttributeValue("seq")));
                	linkInf.setTau(new Integer(xml.getAttributeValue("tau")));
                	
                	for (Object child : xml.getChildren("link")) {
                		Element childElement = (Element)child;
                		
                		SpecificLinkInformation specificLinkInf = new SpecificLinkInformation();
                		specificLinkInf.setMac(childElement.getAttributeValue("to"));
                		specificLinkInf.setLast_rx(new Double(childElement.getAttributeValue("last_rx")));
                		specificLinkInf.setTau(new Integer(childElement.getAttributeValue("tau")));
                		specificLinkInf.setPeriod(new Integer(childElement.getAttributeValue("period")));
                		specificLinkInf.setSeq(new Integer(childElement.getAttributeValue("seq")));
                		
                		Map<Integer, RateLinkInformation> rateInfos = new HashMap<Integer, RateLinkInformation>();
                		
                		for (Object rateInfo : childElement.getChildren("link_info")) {
                			Element rateChildElement = (Element)rateInfo;
                			
                			RateLinkInformation rateLinkInf = new RateLinkInformation();
                			rateLinkInf.setFwd(new Integer(rateChildElement.getAttributeValue("fwd")));
                			rateLinkInf.setRate(new Integer(rateChildElement.getAttributeValue("rate")));
                			rateLinkInf.setRev(new Integer(rateChildElement.getAttributeValue("rev")));
                			rateLinkInf.setSize(new Integer(rateChildElement.getAttributeValue("size")));
                			
                			rateInfos.put(rateLinkInf.getRate(), rateLinkInf);
                		}
                		
                		specificLinkInf.setLink_info(rateInfos);
                		linkInf.addLinkListInformation(specificLinkInf);
                	}
                	
                	linkInfos.add(linkInf);
                	return linkInfos;
                }
                
                return null;
            } catch(IOException io) {
            	System.out.println(io.getMessage());
            } catch(JDOMException jdomex) {
            	System.out.println(jdomex.getMessage());
            }
		}
		return null;
	}

}
