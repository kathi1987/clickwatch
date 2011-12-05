package de.hub.clickwatch.apps.examples.bm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.ElementBuilder;
import de.hub.clickwatch.model.util.builder.HandlerBuilder;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.NanoClock;
import de.hub.clickwatch.util.Throwables;

public class BenchmarkMain implements IClickWatchMain {

	@Inject XmlValueAdapter xmlValueAdapter;
	@Inject IValueAdapter valueAdapter;
	@Inject MySQLBenchmarkImpl sqlBenchmarkImpl;
	@Inject HBaseBenchmarkImpl hbaseBenchmarkImpl;
	@Inject LogFileBenchmarkAdapter logfileBenchmarkImpl;
	@Inject NanoClock clock;
	@Inject ILogger logger;
	private static int sampleRate = 100;
	
	IClickWatchContext ctx = null;
	
	private Handler createSeismoSample() {
		StringBuffer xmlValue = new StringBuffer();
		xmlValue.append("<c>\n");
		for (int i = 0; i < sampleRate; i++) {
			xmlValue.append("\t<v c0='" + (int)(Math.random()*4e6 - 2e6) + "' c1='" + (int)(Math.random()*4e6 - 2e6) + "' c2='" + (int)(Math.random()*4e6 - 2e6) + "' timestamp='" + (long)(new Date().getTime()*1e6) + "'/>");
		}
		xmlValue.append("</c>");
		return valueAdapter.create("latestchannelinfo", new Date().getTime()*(long)1e6, xmlValue.toString());		
	}
	
	private Node createCompleteNodeSample(boolean seismoOnly) {
		Node node = null;
		if (seismoOnly) {
			node = NodeBuilder.newNodeBuilder().withINetAddress("192.168.1.1").build();	
		} else {
			node = (Node)ctx.getAdapter(IClickWatchModelProvider.class).getInputObject();
		}
		
		node.getElements().add(ElementBuilder.newElementBuilder().withName("seismo").withHandlers(createSeismoSample()).build());
		return node;		
	}
	
	private long performWriteMeassure(IBenchmarkAdapter adapter, Node sample, long startInSeconds, int samples) {
		long start = clock.currentTimeNanos();
		for (int i = 0; i < samples; i++) {
			for (Handler handler: sample.getAllHandlers()) {
				Handler xmlHandler = null;
				String plainValue = valueAdapter.getPlainValue(handler);
				if (plainValue == null || "".equals(plainValue)) {
					plainValue = xmlValueAdapter.getPlainValue(handler);
					xmlHandler = handler;
				}
				Handler handlerWithTime = valueAdapter.create(handler.getQualifiedName(), startInSeconds*(long)1e9 + i*(long)1e9, plainValue);
				adapter.writeSample(sample, handlerWithTime, xmlHandler);
			}			
		}
		long stop = clock.currentTimeNanos();
		return stop - start;
	}
	
	private int[] getDurations() {
		return new int[] { 1 }; //, 60, 120, 240, 480, 960, 2000, 3600 };
	}
	
	private IBenchmarkAdapter[] getBenchmarAdapters() {
		return new IBenchmarkAdapter[] { sqlBenchmarkImpl, hbaseBenchmarkImpl, logfileBenchmarkImpl };
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		this.ctx = ctx;
		PrintWriter out = null;;
		try {
			out = new PrintWriter(new File("out.txt"));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		out.println("run seismoOnly adapter seconds write read");
		
		IBenchmarkAdapter[] adapters = getBenchmarAdapters();
		for (int run = 0; run < 23; run++) {
			for (int duration: getDurations()) {
				int adapter_i = 0;
				for (IBenchmarkAdapter adapter: adapters) {
					adapter.open();
					
					long startInSeconds = clock.currentTimeNanos()/(long)1e9;
					
					long writeResult = performWriteMeassure(adapter, createCompleteNodeSample(false), startInSeconds, duration);								
					adapter.flush();
					long readResult = performReadMeasure(adapter, startInSeconds, duration);
					out.println(run + " 0 " + adapter_i + " " + duration + " " + writeResult + " " + readResult);								
					
					writeResult = performWriteMeassure(adapter, createCompleteNodeSample(false), startInSeconds, duration);
					adapter.flush();
					readResult = performReadMeasure(adapter, startInSeconds, duration);
					out.println(run + " 1 " + adapter_i + " " + duration + " " + writeResult + " " + readResult);
					
					adapter.close();
					adapter_i++;
				}
				out.flush();
			}
		}
		out.close();
	}
	
	private long performReadMeasure(IBenchmarkAdapter adapter, long startInSeconds, int duration) {
		long start = clock.currentTimeNanos();
		adapter.scanSample(createCompleteNodeSample(true), HandlerBuilder.newHandlerBuilder().withName("seismo/latestchannelinfo").build(), startInSeconds*(long)1e9, (startInSeconds + duration)*(long)1e9);
		long stop = clock.currentTimeNanos();
		return stop - start;
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, BenchmarkMain.class);
	}

}
