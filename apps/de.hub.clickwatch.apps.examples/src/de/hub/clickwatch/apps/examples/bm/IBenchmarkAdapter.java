package de.hub.clickwatch.apps.examples.bm;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public interface IBenchmarkAdapter {

	public void open();
	
	public void writeSample(Node node, Handler handlerPlain, Handler handlerXml);

	public void readSample(Node node, Handler handler, long timestamp);

	public void scanSample(Node node, Handler handler, long start, long end);
	
	public void flush();
	
	public void close();
}
