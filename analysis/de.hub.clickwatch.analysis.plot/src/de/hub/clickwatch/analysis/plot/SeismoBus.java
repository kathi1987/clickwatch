package de.hub.clickwatch.analysis.plot;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.plot.lib.AvgBinning;
import de.hub.clickwatch.analysis.plot.lib.MathTransformation;
import de.hub.clickwatch.analysis.plot.lib.MovingAvg;
import de.hub.clickwatch.analysis.plot.lib.MovingFFT;
import de.hub.clickwatch.analysis.plot.lib.RemoveOffset;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoBus implements IPlotAlgorithm {

    private static final double amplNorm = Math.pow(2, 21)/1000;
    @Inject IValueAdapter valueAdapter;
    @Inject BrnValueAdapter brnValueAdapter;

    MovingFFT mfft = new MovingFFT(100);    
    MovingAvg mavg = new MovingAvg(500);
    boolean plotted = false;
        
    private long start = -1;
    
    // parameter definition
    int sampleRateInHz = 100; // we sample the seismo sensors in all three channels at 100 Hz
    int removeOffsetWindowInSeconds = 10; // this is the window size for the moving average used to null the seismo time signal
    int fftWindowInSeconds = 1; // this is the window size used for continuous FFTing the last x seconds 
    // an FFT of an 100 Hz sample, gives us the spectrum from 0 to 50 Hz (1/2 of the sample rate)
    // we further bin each FFT result
    int bins = 10; // use x bins to bin each FFT result
    int bin = 2; // select the xth bin as the transformation result
    
    // create three transformations, one for each channel
    SeismoFrequenceTransformation[] seismoTrans = new SeismoFrequenceTransformation[] {
        new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin),
        new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin),
        new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin)         
    };


    @Override
    public void add(IPlot plot, Handler handler) {        
        // create a data base iterator that iterates through seismo data sets in the order they were recorded
        Localchannelinfo latestChannelInfo = (Localchannelinfo)brnValueAdapter.create(handler, valueAdapter);
        // iterate to each seismo data set
        for (V value: latestChannelInfo.getC().getV()) {

            // each datum has a timestamp attached, we store the first time as "point 0" on the time scale
            if (start == -1) {
                start = value.getS();
            }
            
            // norm the time based on "point 0"
            long time = value.getT() - start;
            double dtime = time / 1e6;
            
            // apply the seismo transformation on the value from each channel and store the results with the current time
            plot.addResultEntry("z", dtime, seismoTrans[0].transform((double)value.getC0()/amplNorm));
            plot.addResultEntry("x", dtime, seismoTrans[1].transform((double)value.getC1()/amplNorm));
            plot.addResultEntry("y", dtime, seismoTrans[2].transform((double)value.getC2()/amplNorm));
        }
        // this removes the data set read from the db from memory (there might be cycles in the data structure)
        EcoreUtil.delete(latestChannelInfo);
    }
    
    /**
     * This mathematical transformation transforms a time signal into a time
     * signal that plots the average of amplitudes in a specific band of frequencies
     * in the source signal.
     */
    private static class SeismoFrequenceTransformation implements MathTransformation<Double, Double> {
        private final MovingFFT movingFFT;
        private final RemoveOffset removeOffset;
        private final int bins;
        private final int bin;
        
        public SeismoFrequenceTransformation(int removeOffsetWindowSize, int fftWindowSize, int bins, int bin) {
            removeOffset = new RemoveOffset(removeOffsetWindowSize);
            movingFFT = new MovingFFT(fftWindowSize);
            this.bins = bins;
            this.bin = bin;
        }
        
        @Override
        public Double transform(Double value) {
            // first step, we remove the offset from the time signal
            Double valueWithoutOffset = removeOffset.transform(value);
            // second step, we compute the FFT of a window behind the current value
            Double[] fft = movingFFT.transform(valueWithoutOffset);
            // third step, we bin the FFT result into equal bins and calculate
            // the average of all the values in each bin
            Double[] binnings = new AvgBinning(fft.length / bins).transform(fft);
            // forth step, we select the bin that represents the wanted frequencies
            return binnings[bin];
        }       
    }
}
