package de.hub.clickwatch.tracesexample.linkStats

import scala.collection.JavaConversions._
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.recorder.database.Record
import de.hub.clickwatch.recorder.database.DataBaseUtil
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.model.util.builder.HandlerBuilder
import de.hub.clickwatch.analysis.results.NumericalResult

class LinkStatExample {

  def createTopology(record : Record, dbUtil : DataBaseUtil, result : NumericalResult) = {

    // check all links of all nodes in the network
    for (node <- record.getConfiguration().getNodes()) {
      var bcast_statsHandler = dbUtil.getHandler(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/link_stat/bcast_stats").build(), record.getEnd())).asInstanceOf[Bcast_stats];

      // check all links
      for (link <- bcast_statsHandler.getEntry().getLink()) {

        var linkInfo = link.getLink_info().get(0);

        println("Node[" + bcast_statsHandler.getEntry().getFrom() + "]: rate=" + linkInfo.getRate() + " size=" + linkInfo.getSize() + " fwd=" + linkInfo.getFwd() + " rev=" + linkInfo.getRev() + "")

      }
    }
  }
}