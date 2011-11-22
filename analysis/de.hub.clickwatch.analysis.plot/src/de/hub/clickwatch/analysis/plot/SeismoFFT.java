package de.hub.clickwatch.analysis.plot;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.plot.lib.MovingAvg;
import de.hub.clickwatch.analysis.plot.lib.MovingFFT;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoFFT implements IPlotAlgorithm {

    private static final double amplNorm = Math.pow(2, 21)/1000;
    @Inject IValueAdapter valueAdapter;
    @Inject BrnValueAdapter brnValueAdapter;
    private long nullTime = -1;

    MovingFFT mfft = new MovingFFT(200);    
    MovingAvg mavg = new MovingAvg(1000);
    boolean plotted = false;

    @Override
    public void add(IPlot plot, Handler handler) {
        long[] mfftTimes = new long[] {188000, 150000};
        Localchannelinfo channelInfo = (Localchannelinfo)brnValueAdapter.create(handler, valueAdapter);

        for (V value : channelInfo.getC().getV()) {
            long time = value.getS() / (long)1e3;
            if (nullTime == -1) {
                nullTime = time;
            }
            time = time - nullTime;

            double normalizedValue = (value.getC0() / amplNorm) - mavg.transform(value.getC0() / amplNorm);
            Double[] fft = mfft.transform(normalizedValue);
            double fftSize = fft.length;
            
            for (long mfftTime: mfftTimes) {
                if (time / 10 == mfftTime / 10) {
                    int i = 0;
                    plotted = true;
                    for (double d: fft) {
                        plot.addResultEntry(time / 1000, ((i++)/fftSize)*50.0, d);        
                    }
                }          
            }
        }
    }
}
