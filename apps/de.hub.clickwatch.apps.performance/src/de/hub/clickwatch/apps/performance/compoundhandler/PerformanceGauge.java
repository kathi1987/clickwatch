package de.hub.clickwatch.apps.performance.compoundhandler;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.google.common.base.Preconditions;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.NodeRecorder;
import de.hub.clickwatch.recorder.database.DummyDataBaseAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics;
import de.hub.clickwatch.recorder.database.cwdatabase.util.RecordUtil;
import de.hub.clickwatch.util.ILogger;

public class PerformanceGauge {
	
	public enum RetrievalType { BASE_LINE, ON_DEMAND, COMPOUND_HANDLER, DELTA_COMPOUND_HANDLER};
	private static int handlerCount = 0;
	private final int remoteLocalUpdateIntervalFactor;

	public PerformanceGauge(int remoteLocalUpdateIntervalFactor) {
		super();
		this.remoteLocalUpdateIntervalFactor = remoteLocalUpdateIntervalFactor;
	}

	public RecordStatistics measure(RetrievalType retrievalType, int duration, int updateInterval, int handler, String nodeId) {
		handlerCount = handler;
		int localUpdateInterval = (retrievalType == RetrievalType.COMPOUND_HANDLER || retrievalType == RetrievalType.DELTA_COMPOUND_HANDLER) ? updateInterval * remoteLocalUpdateIntervalFactor : updateInterval;
		int remoteUpdateInterval = updateInterval;
		Injector injector = createInjector(retrievalType, remoteUpdateInterval);
		Record record = RecordUtil.buildRecord("test", duration, localUpdateInterval, nodeId);
		injector.getInstance(NetworkRecorder.class).record(record);
		return record.getStatistics();
	}
	
	private Injector createInjector(final RetrievalType retrievalType, final int remoteUpdateInterval) {
		ClickWatchModule clickWatchModule = new ClickWatchModule() {

			@Override
			protected ILogger getLogger() {
				return new ILogger() {					
					@Override
					public void log(int status, String message, Throwable exception) {
						System.out.print(DateFormat.getDateTimeInstance().format(new Date()) + " ");
						
						if (status == ILogger.DEBUG) {
							System.out.print("[DEBUG] ");
						} else if (status == ILogger.INFO) {
							System.out.print("[INFO] ");
						} else if (status == ILogger.WARNING) {
							System.out.print("[WARNING] ");
						} else if (status == ILogger.ERROR) {
							System.out.print("[ERROR] ");
						}
						
						System.out.print(message);
						if (exception != null) {
							System.out.println(": " + exception.getMessage());
							exception.printStackTrace();
						}
						System.out.println("");
					}
				};
			}

			@Override
			protected void bindHandlerAdapter() {
				switch (retrievalType) {
				case BASE_LINE:
					bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(false);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
					break;
				case ON_DEMAND:
					bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(false);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
					break;
				case COMPOUND_HANDLER:
					bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(true);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
					break;
				case DELTA_COMPOUND_HANDLER:
					bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(true);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(true);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);					
					break;
				default:
					Preconditions.checkState(false, "unreachable code");
				}	
				bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(remoteUpdateInterval);
			}
			
		};
		CWRecorderModule cwRecorderModule = new CWRecorderModule() {

			@Override
			protected void configureDataBaseRecordAdapter() {
				bind(IDataBaseRecordAdapter.class).to(DummyDataBaseAdapter.class);
			}

			@Override
			protected void configure() {
				super.configure();
				bind(NodeRecorder.class).to(MyNodeRecorder.class);
			}
			
		};
		return Guice.createInjector(clickWatchModule, cwRecorderModule);
	}
	
	private static Map<Integer, List<Handler>> handlerSubSets = new HashMap<Integer, List<Handler>>();
	
	private static class MyNodeRecorder extends NodeRecorder {
		
		@Override
		protected List<Handler> filterHandler(EList<Handler> allHandlers) {
			List<Handler> result = handlerSubSets.get(handlerCount);
			if (result == null) {			
				int count = Math.min(handlerCount, allHandlers.size());
				result = new BasicEList<Handler>();
				int i = 0;
				for (Handler handler: allHandlers) {
					if (!PullHandlerAdapter.commonHandler.contains(handler.getName())) {
						if (i++ < count) {
							result.add(handler);
						} else if (handler.getQualifiedName().equals("sys_info/systeminfo")) {
							i++;
							result.add(handler);
						}
					}
					
				}
				handlerSubSets.put(handlerCount, result);
			}
			return result;
		}
	}

}
