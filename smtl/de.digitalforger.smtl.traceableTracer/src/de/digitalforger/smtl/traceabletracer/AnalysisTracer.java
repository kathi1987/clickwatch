package de.digitalforger.smtl.traceabletracer;

import de.digitalforger.smtl.m2m.IRule;
import de.digitalforger.smtl.trace.IAdditionalTracer;
import de.hub.clickwatch.analysis.traceable.Traceable;

public class AnalysisTracer implements IAdditionalTracer {

	public AnalysisTracer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trace(Object from, Object to, IRule byRule) {
		System.out.println("ADDITIONAL TRACING !!!!!!!!!!!!!!!!!!!!!");
		if(to instanceof Traceable && from instanceof Traceable) {
			System.out.println("successfull");
			((Traceable)to).getTracesFrom().add(((Traceable)from));
			((Traceable)from).getTracesFrom().add(((Traceable)to));
		}
		
	}

}
