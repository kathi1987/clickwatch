package de.hub.clickwatch.analysis.plot;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

public class HWBusyPlot implements IPlotAlgorithm {

    @Inject IValueAdapter valueAdapter;
    @Inject BrnValueAdapter brnValueAdapter;
    
    @Override
    public void add(IPlot plot, Handler handler) {
        Stats stats = (Stats)brnValueAdapter.create(handler, valueAdapter);
        int hw_busy = stats.getChannelstats().getPhy().getHwbusy();
        long time_ms = handler.getTimestamp() / (long)1e6;
        
        plot.addResultEntry(time_ms, hw_busy);
    }

}
