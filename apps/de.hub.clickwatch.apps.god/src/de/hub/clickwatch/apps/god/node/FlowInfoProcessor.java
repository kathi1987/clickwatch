package de.hub.clickwatch.apps.god.node;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.FlowInformation;
import de.hub.clickwatch.apps.god.information.RxFlow;
import de.hub.clickwatch.apps.god.information.TxFlow;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Stats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow;

public class FlowInfoProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> flowInfos = new ArrayList<ClientInformations>();
			Stats flowInfo = (Stats)data;
			
			FlowInformation flow = new FlowInformation();
			flow.setClientMac(flowInfo.getFlowstats().getNode());
        	flow.setTime(System.currentTimeMillis());
        	for (Txflow tx: flowInfo.getFlowstats().getTxflow()) {
        		TxFlow fl = new TxFlow();
        		fl.setAvgHops(tx.getAvg_hops());
        		fl.setDst(tx.getDst());
        		fl.setFlowid(tx.getFlowid());
        		fl.setPacketCount(tx.getPacket_count());
        		fl.setPacketSize(tx.getPacket_size());
        		fl.setReplies(tx.getReplies());
        		fl.setSrc(tx.getSrc());
        		fl.setTime(tx.getTime());
        		
        		flow.getTxflows().add(fl);
        	}
        	
        	for (Rxflow rx: flowInfo.getFlowstats().getRxflow()) {
        		RxFlow rl = new RxFlow();
        		rl.setAvgHops(rx.getAvg_hops());
        		rl.setCrcErrors(rx.getCrc_err());
        		rl.setDst(rx.getDst());
        		rl.setFlowid(rx.getFlowid());
        		rl.setPacketCount(rx.getPacket_count());
        		rl.setPacketSize(rx.getPacket_size());
        		rl.setSrc(rx.getSrc());
        		
        		flow.getRxflows().add(rl);
        	}
        	
        	flowInfos.add(flow);
        	return flowInfos;
        }
        
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		System.err.println("<" + this.getClass().getName() + "> handleGenuineInformations is not supported in FlowInfoProcessor");
		return null;
	}

}
