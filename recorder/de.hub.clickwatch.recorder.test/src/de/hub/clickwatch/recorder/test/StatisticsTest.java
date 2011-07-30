package de.hub.clickwatch.recorder.test;

import java.io.File;
import java.io.PrintWriter;

import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionField;
import org.apache.commons.math.linear.BlockFieldMatrix;
import org.apache.commons.math.linear.FieldMatrix;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentStatistics;
import de.hub.clickwatch.recorder.NodeRecorder;
import de.hub.clickwatch.recorder.database.DummyDataBaseAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;

public class StatisticsTest {
	
	private PrintWriter out = null;
	private static int handlerCount = 0;
	private int updateInterval = 500;
	private int duration = updateInterval * 100;
	String[] nodeIds = new String[] { "192.168.3.32", "192.168.3.118" };
//			, "192.168.3.32", "192.168.3.118",
//			"192.168.3.33", "192.168.3.70", "192.168.3.78",
//			"192.168.3.40", "192.168.3.77", "192.168.3.24", 
//			"192.168.3.34", "192.168.3.35" };
	
	private static int localGlobalUpdateIntervalFactor = 10;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private FieldMatrix<Fraction> time = new BlockFieldMatrix(FractionField.getInstance(), 4, 4);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private FieldMatrix<Fraction> cpu = new BlockFieldMatrix(FractionField.getInstance(), 4, 4);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private FieldMatrix<Fraction> bytes = new BlockFieldMatrix(FractionField.getInstance(), 4, 4);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private FieldMatrix<Fraction> handler = new BlockFieldMatrix(FractionField.getInstance(), 4, 4);
	
	@Ignore("on demand only")
	@Test
	public void test() throws Exception {
		for(String nodeId: nodeIds) {
			out = new PrintWriter(new File("out-" + nodeId + ".txt"));
			
			int i = 0;
			for (int count: new int[]{50, 100, 150, 200}) {
				performExperiment(false, false, false, count, 0, i, nodeId);
				performExperiment(true, false, false, count, 1, i, nodeId);
				performExperiment(true, true, false, count, 2, i, nodeId);
				performExperiment(true, true, true, count, 3, i, nodeId);			
				i++;
			}
			
			printResult(time, "time");
			printResult(cpu, "cpu");
			printResult(bytes, "bytes");
//			printResult(handler, "handler");
			out.close();
		}
	}
	
	private void performExperiment(final boolean compound, final boolean record, final boolean changesOnly, int handlerCount, int experiment, int i, String nodeId) throws Exception {
		ExperimentStatistics statistics = performTest(compound, record, changesOnly, handlerCount, new String[] {nodeId});
		double timeInMillies = statistics.getTimeRequestS().getMean()/1000000;
		if (record) {
			time.setEntry(experiment, i, new Fraction(timeInMillies/localGlobalUpdateIntervalFactor));
		} else {
			time.setEntry(experiment, i, new Fraction(timeInMillies));
		}
		if (record) {
			bytes.setEntry(experiment, i, new Fraction(statistics.getBytesRequestS().getMean()/localGlobalUpdateIntervalFactor));
		} else {
			bytes.setEntry(experiment, i, new Fraction(statistics.getBytesRequestS().getMean()));
		}
		
		cpu.setEntry(experiment, i, new Fraction(statistics.getCpuLoadS().getMean()));
		handler.setEntry(experiment, i, new Fraction(statistics.getHandlersPulledS().getSum()));
		
		out.println(compound + ", " + record + ", " + changesOnly);
		out.println(statistics.toString());
		out.println("");
	}
	
	private void printResult(FieldMatrix<Fraction> result, String name) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name + "=[");
		for (int i = 0; i < result.getColumnDimension(); i++) {			
			for (int ii = 0; ii < result.getRowDimension(); ii++) {
				stringBuffer.append(result.getEntry(ii, i).doubleValue() + " ");
			}
			stringBuffer.append(";");
		}
		stringBuffer.append("]\n");
		out.println(stringBuffer.toString());
	}

	private static class MyNodeRecorder extends NodeRecorder {
		@Override
		protected void configureHandlerAdapter(EList<Handler> allHandlers) {
			int count = Math.min(handlerCount, allHandlers.size());
			EList<Handler> result = new BasicEList<Handler>();
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
			super.configureHandlerAdapter(result);
		}		
	}
	
	public ExperimentStatistics performTest(final boolean compound, final boolean record, final boolean changesOnly, final int handlerCount, final String[] nodeIds) {
		StatisticsTest.handlerCount = handlerCount;
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
				if (record) {
					return updateInterval * localGlobalUpdateIntervalFactor;
				} else {
					return updateInterval;
				}
			}

			@Override
			protected void configureHandlerAdapter(Binder binder) {
				if (compound) {
					binder.bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
					binder.bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(record);
					binder.bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(updateInterval);
					binder.bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(changesOnly);
				} else { 
					binder.bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
				}
			}

			@Override
			protected Class<? extends IPullHandlerAdapter> getHandlerAdapterClass() {
				if (compound) {
					return CompoundHandlerAdapter.class;
				} else {
					return PullHandlerAdapter.class;
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
		
		return experiment.getStatistics();
	}

}
