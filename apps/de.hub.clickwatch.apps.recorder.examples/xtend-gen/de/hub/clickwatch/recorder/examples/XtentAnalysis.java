package de.hub.clickwatch.recorder.examples;

import com.google.inject.Inject;
import de.hub.clickwatch.analysis.data.Plot;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class XtentAnalysis implements IClickWatchMain {
  
  @Inject
  private DataBaseUtil db;
  
  private ExperimentDescr exp;
  
  public void main(final IClickWatchContext ctx) throws NumberFormatException {
    {
      Plot _plot = new Plot();
      final Plot plot = _plot;
      IExperimentProvider _adapter = ctx.<IExperimentProvider>getAdapter(de.hub.clickwatch.main.IExperimentProvider.class);
      final IExperimentProvider ep = _adapter;
      ExperimentDescr _experiment = ep.getExperiment();
      this.exp = _experiment;
      Network _network = this.exp.getNetwork();
      EList<Node> _nodes = _network.getNodes();
      final Function1<Node,String> _function = new Function1<Node,String>() {
          public String apply(final Node e) {
            String _iNetAddress = e.getINetAddress();
            return _iNetAddress;
          }
        };
      List<String> _map = ListExtensions.<Node, String>map(_nodes, _function);
      for (String nodeId : _map) {
        Iterable<Bcast_stats> _handler = this.db.<Bcast_stats>getHandler(this.exp, nodeId, de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats.class);
        for (Bcast_stats handler : _handler) {
          {
            Entry _entry = handler.getEntry();
            EList<Link> _link = _entry.getLink();
            for (Link link : _link) {
              EList<Link_info> _link_info = link.getLink_info();
              for (Link_info link_info : _link_info) {
                int _rate = link_info.getRate();
                boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_rate), ((Integer)2));
                if (_operator_equals) {
                  Entry _entry_1 = handler.getEntry();
                  String _from = _entry_1.getFrom();
                  int _number = this.number(_from);
                  String _to = link.getTo();
                  int _number_1 = this.number(_to);
                  int _rev = link_info.getRev();
                  plot.addEntry(_number, _number_1, _rev);
                }
              }
            }
            EcoreUtil.delete(handler);
          }
        }
      }
    }
  }
  
  public int number(final String arg) throws NumberFormatException {
    String _replaceAll = arg.replaceAll("-", "");
    int _parseInt = Integer.parseInt(_replaceAll);
    return _parseInt;
  }
}