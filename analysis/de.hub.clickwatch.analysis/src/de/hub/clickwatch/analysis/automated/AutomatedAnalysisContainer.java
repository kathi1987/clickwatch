package de.hub.clickwatch.analysis.automated;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.ui.util.UiThreadder;

public class AutomatedAnalysisContainer extends UiThreadder {
	
	private static AutomatedAnalysisContainer instance = new AutomatedAnalysisContainer();

	public static AutomatedAnalysisContainer getInstance() {
		return instance;
	}
	
	private IAutomatedAnalysis currentAnalysis = null;
	private boolean stopped = false;
	
	public boolean isRunning() {
		return currentAnalysis != null;
	}
	
	public void startAnalysis(IAutomatedAnalysis analysis, final long interval, final Network network) {
		Preconditions.checkState(!isRunning());
		
		stopped = false;
		currentAnalysis = analysis;
		
		runInExtraThread(new Runnable() {
			@Override
			public void run() {
				System.out.println("#Starting automated analysis ...");
				while (!stopped) {
					System.out.println("#Anaylsing next sample ...");
					try {
						currentAnalysis.analyseNextSample(network, AutomatedAnalysisContainer.this);
						Thread.sleep(interval);
					} catch (Throwable e) {
						handleException(e);
					}
				}
				System.out.println("#Stopped automated analysis ...");
			}
			
			public void handleException(Throwable exception) {
				exception.printStackTrace();
				stopped = true;
			}
		});
	}
	
	public void stopAnalyis() {
		stopped = true;
		currentAnalysis = null;
	}
}
