package de.hub.clickwatch.recorder.examples
import java.util.ArrayList
import de.hub.clickwatch.main.IClickWatchMain
import de.hub.clickwatch.main.IClickWatchContext
import de.hub.clickwatch.connection.INodeConnectionProvider
import de.hub.clickwatch.main.ClickWatchExternalLauncher
import com.google.inject.Inject
import de.hub.clickwatch.connection.adapter.IHandlerAdapter
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats

class ScalaAnaylsis extends IClickWatchMain {

  @Inject var ncp: INodeConnectionProvider = null
  
  override def main(ctx: IClickWatchContext) {
	  val nc = ncp.createConnection("localhost", "7777")
	  nc.connect()
	  val handlerAdapter = nc.getAdapter(classOf[IHandlerAdapter])
	  
	  val handler = 
	    	handlerAdapter.getHandler("device_wifi/link_stat/bcast_stats").asInstanceOf[Bcast_stats]
	  
	  println(handler.getEntry().getFrom())
	  nc.disconnect()
  }
}

object Main {
    def main(args: Array[String]) {
    ClickWatchExternalLauncher.launch(Array("-d", "-s", "-r", "../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel"), 
        classOf[ScalaAnaylsis])
  }
}