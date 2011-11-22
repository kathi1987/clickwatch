package de.hub.clickwatch.analysis.plot;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoPlot implements IPlotAlgorithm {

    private static final double amplNorm = Math.pow(2, 21)/1000;
    @Inject IValueAdapter valueAdapter;
    @Inject BrnValueAdapter brnValueAdapter;
    private long nullTime = -1;
    
    @Override
    public void add(IPlot plot, Handler handler) {
        Localchannelinfo channelInfo = (Localchannelinfo)brnValueAdapter.create(handler, valueAdapter);
        for (V value: channelInfo.getC().getV()) { 
            long time = value.getS() / (long)1e3;
            if (nullTime == -1) {
                nullTime = time;
            }
            time = time - nullTime;
            
            plot.addResultEntry("z", time / 1000.0, (-1)* value.getC0() / amplNorm);
            plot.addResultEntry("x", time / 1000.0, value.getC1() / amplNorm);
            plot.addResultEntry("y", time / 1000.0, value.getC2() / amplNorm);           
        }                
    }    
}
