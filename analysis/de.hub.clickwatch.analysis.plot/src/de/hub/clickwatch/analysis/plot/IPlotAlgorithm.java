package de.hub.clickwatch.analysis.plot;

import de.hub.clickwatch.model.Handler;

public interface IPlotAlgorithm {

    /**
     * Receives a new handler value and has to update the plot's results (see
     * {@link IPlot#addResultEntry(Object...)}.
     */
    public void add(IPlot plot, Handler handler);
    
}
