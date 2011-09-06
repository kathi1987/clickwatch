package de.hub.clickwatch.apps.god.node;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.SzenarioHWL;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.LinktableInformation;
import de.hub.clickwatch.apps.god.information.LinktableLinkInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.lt_links.Links;
import de.hub.clickwatch.specificmodels.brn.lt_links.Link;

public class LinktableProcessor implements NodeInformationProcessor {
	
	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> linktableInfos = new ArrayList<ClientInformations>();
			Links links = (Links)data;
			
			LinktableInformation linktable = new LinktableInformation();
			linktable.setClientMac(links.getLinktable().getId());
        	linktable.setTime(System.currentTimeMillis());
        	for (Link l : links.getLinktable().getLink()) {
        		LinktableLinkInformation linkInf = new LinktableLinkInformation();
        		linkInf.setAge(l.getAge());
        		linkInf.setMetric(l.getMetric());
        		linkInf.setSeq(l.getSeq());
        		linktable.getLinktable().put(l.getFrom() + SzenarioHWL.LINKTABLE_SEPARATOR + l.getTo(), linkInf);
        	}
        	linktableInfos.add(linktable);
        	return linktableInfos;
        }
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		System.err.println("<" + this.getClass().getName() + "> handleGenuineInformations is not supported in LinktableProcessor");
		return null;
	}

}
