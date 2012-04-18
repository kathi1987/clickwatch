package de.hub.clickwatch.tracesexample.hwbusy

import scala.collection.JavaConversions._
import de.hub.clickwatch.recorder.database.Record
import de.hub.clickwatch.recorder.database.DataBaseUtil
import de.hub.clickwatch.model.util.builder.HandlerBuilder
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link
import scala.collection.mutable.HashMap
import de.hub.clickwatch.analysis.results.ResultsFactory
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.util.builder.GraphNodeBuilder
import java.text.DateFormat
import com.google.common.base.Preconditions
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.analysis.results.util.builder.GraphLinkBuilder
import de.hub.clickwatch.model.Node
import de.hub.clickwatch.analysis.results.NumericalResult
import org.eclipse.core.runtime.SubProgressMonitor
import java.lang.Long
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.LinkedList

/**
 *
 */
class HWBusyExample() {
  private var dataLog = new LinkedList[String]

  /**
   *
   */
  def createHWBusy(record : Record, dbUtil : DataBaseUtil, result : NumericalResult, from : Long, to : Long) = {
    var node = record.getConfiguration().getNodes().get(0)

    var iterator = dbUtil.getHandlerIterator(dbUtil.createHandle(record, node, "device_wifi/wifidevice/cst/stats", from, to));
    while (iterator.hasNext()) {
      var handler = iterator.next().asInstanceOf[Stats]
      var time : Long = handler.getTimestamp() - record.getStart()
      var hwBusy : Integer = handler.getChannelstats().getPhy().getHwbusy()

      result.getData().add(
        handler.getChannelstats().getNode() + "/" + node.getINetAddress(),
        time,
        hwBusy);

      dataLog.add(time + " :: " + hwBusy)
      
      EcoreUtil.delete(handler);
    }

    println(dataLog)
  }

}