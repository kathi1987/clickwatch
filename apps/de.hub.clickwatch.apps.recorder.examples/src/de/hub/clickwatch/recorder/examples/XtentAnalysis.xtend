package de.hub.clickwatch.recorder.examples

import de.hub.clickwatch.main.IClickWatchMain
import de.hub.clickwatch.main.IClickWatchContext
import com.google.inject.Inject
import de.hub.clickwatch.connection.INodeConnectionProvider
import de.hub.clickwatch.main.IExperimentProvider
import java.util.Iterator
import de.hub.clickwatch.recorder.database.DataBaseUtil
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr
import de.hub.clickwatch.model.Handler
import org.eclipse.emf.ecore.util.EcoreUtil
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.model.ClickWatchModelFactory
import de.hub.clickwatch.analysis.data.Plot

class XtentAnalysis implements IClickWatchMain {
	
	@Inject DataBaseUtil db
	ExperimentDescr exp
	
	override main(IClickWatchContext ctx) {
		val plot = new Plot()
		val ep = ctx.getAdapter(typeof(IExperimentProvider));
		exp = ep.experiment;
		
		for(nodeId: exp.network.nodes.map(e|e.INetAddress)) {			
			for(handler: db.getHandler(exp, nodeId, typeof(Bcast_stats))) {
				for(link: handler.entry.link) {
					for(link_info: link.link_info) {
						if (link_info.rate == 2) { 
							plot.addEntry(
								handler.entry.from.number,
								link.to.number, 
								link_info.rev)
						
						}	
					}
				}
				
				EcoreUtil::delete(handler)
			}
		}	
	}	
	
	def number(String arg) {
		Integer::parseInt(arg.replaceAll("-",""))
	}
}