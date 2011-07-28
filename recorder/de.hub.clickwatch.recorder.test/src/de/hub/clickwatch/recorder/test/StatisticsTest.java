package de.hub.clickwatch.recorder.test;

import java.io.File;
import java.io.PrintWriter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Binder;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.HandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.NodeRecorder;
import de.hub.clickwatch.recorder.database.DummyDataBaseAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;

public class StatisticsTest {
	
	private PrintWriter out = null;
	private static int handlerCound = 0;
	
	@Before
	public void setup() throws Exception {
		out = new PrintWriter(new File("out-5.txt"));
	}

	@Test
	public void test() {
		String[] wiredNodeIds = new String[] { "192.168.3.118",
				"192.168.3.31", "192.168.3.32",
				"192.168.3.33", "192.168.3.70", "192.168.3.78",
				"192.168.3.40", "192.168.3.77",
				"192.168.3.34", "192.168.3.35", "192.168.3.24" };
		
		out.println("compound duration updateInterval nodes samples handlerPerSampleAvr handlerPerSampleDev timeRSAvr timeRSDev bytesRSAvr bytesRSDev");
		
//		performTest(true, 30000, 1000, wiredNodeIds);
//		performTest(false, 30000, 1000, wiredNodeIds);
//		
//		performTest(true, 30000, 0, wiredNodeIds);
//		performTest(false, 30000, 0, wiredNodeIds);
		
		for (int count: new int[]{50, 100, 150, 200}) {
			performTest(true, 30000, 0, new String[] { wiredNodeIds[0] }, count);
			performTest(false, 30000, 0, new String[] { wiredNodeIds[0] }, count);
		}
		
		out.close();
	}
	
	private static class MyNodeRecorder extends NodeRecorder {
		@Override
		protected void configureHandlerAdapter(EList<Handler> allHandlers) {
			int count = Math.min(handlerCound, allHandlers.size());
			EList<Handler> result = new BasicEList<Handler>();
			for (int i = 0; i < count; i++) {
				result.add(allHandlers.get(i));
			}
			super.configureHandlerAdapter(result);
		}		
	}
	
	public void performTest(final boolean compound, final int duration, final int updateInterval, final String[] nodeIds, final int handlerCount) {
		StatisticsTest.handlerCound = handlerCount;
		AbstractDBTest test = new AbstractDataBaseAdapterTest() {
			@Override
			protected Class<? extends IDataBaseRecordAdapter> getDataBaseRecordAdapterClass() {
				return DummyDataBaseAdapter.class;
			}

			@Override
			protected boolean getInMemory() {
				return true;
			}

			@Override
			protected int getExperimentDuration() {
				return duration;
			}

			@Override
			protected Class<? extends IClickSocket> getClickSocketClass() {
				return ClickSocketImpl.class;
			}

			@Override
			protected int getLogLevel() {
				return 4;
			}

			@Override
			protected Integer getUpdateInterval() {
				return updateInterval;
			}

			@Override
			protected Class<? extends IHandlerAdapter> getHandlerAdapterClass() {
				if (compound) {
					return CompoundHandlerAdapter.class;
				} else {
					return HandlerAdapter.class;
				}
			}

			@Override
			protected void adapterTestSetUp() {

			}

			@Override
			protected void configureAdditionalBindings(Binder binder) {
				binder.bind(NodeRecorder.class).to(MyNodeRecorder.class);
			}		
			
			
		};
		test.setUp();
		ExperimentDescr experiment = test.performTest(nodeIds, false);
		
		out.println(
				  (compound ? "1" : "0") + " "
				+ duration + " "
				+ updateInterval + " "
				+ nodeIds.length + " " 
				+ experiment.getStatistics().getSamplesN().getSum() + " "
				+ experiment.getStatistics().getHandlersPulledS().getMean() + " "
				+ experiment.getStatistics().getHandlersPulledS().getStandardDeviation() + " "
				+ experiment.getStatistics().getTimeRequestSample().getMean() + " "
				+ experiment.getStatistics().getTimeRequestSample().getStandardDeviation() + " "
				+ experiment.getStatistics().getBytesRequestSample().getMean() + " "
				+ experiment.getStatistics().getBytesRequestSample().getStandardDeviation());
	}

}
