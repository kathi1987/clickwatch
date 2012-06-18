package de.digitalforger.smtl.traceabletracer;

import de.digitalforger.smtl.m2m.IRule;
import de.digitalforger.smtl.trace.IAdditionalTracer;
import de.hub.clickwatch.analysis.traceable.Traceable;

/**
 * This tracer plug-in adds Traceable exntries in model elements that to support this functionality
 * These elements must implement the interface Traceable
 * 
 * @author Lars George
 *
 */
public class AnalysisTracer implements IAdditionalTracer {

	public AnalysisTracer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trace(Object from, Object to, IRule byRule) {
		if(to instanceof Traceable && from instanceof Traceable) {
			((Traceable)to).getTracesFrom().add(((Traceable)from));
			((Traceable)from).getTracesFrom().add(((Traceable)to));
		}
		
	}

}
