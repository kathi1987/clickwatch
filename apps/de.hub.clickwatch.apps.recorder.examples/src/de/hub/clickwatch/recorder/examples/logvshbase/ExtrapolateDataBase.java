package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.HBaseRowMap;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.hbase.HBaseUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class ExtrapolateDataBase implements IClickWatchMain, IApplication {
	
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) int handlerPerRecord;
	@Inject HBaseUtil hbaseUtil;
	@Inject ILogger logger;
	
	@Override
	public void main(IClickWatchContext ctx) {
		ExperimentDescr sourceExperiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		ExperimentDescr targetExperiment = EcoreUtil.copy(sourceExperiment);
		
		HBaseRowMap sourceRowMap = sourceExperiment.getHBaseRowMap();
		
		String[] args = ctx.getAdapter(IArgumentsProvider.class).getArguments();
		String targetExperimentName = args[0];
		int factor = Integer.parseInt(args[1]);
		long offset = sourceExperiment.getEnd() - sourceExperiment.getStart();
		
		targetExperiment.setName(targetExperimentName);
		
		HTable targetTable = hbaseUtil.getHBaseTable(targetExperimentName, true);
		HTable sourceTable = hbaseUtil.getHBaseTable(sourceExperiment.getName(), false);

		List<Put> puts = new ArrayList<Put>();
		try {
			ResultScanner scanner = sourceTable.getScanner(HBaseUtil.colFamily, HBaseUtil.col);
			Result result = scanner.next();
			while (result != null) {
				byte[] row = result.getRow();
				byte[] value = result.getValue(HBaseUtil.colFamily, HBaseUtil.col);
				
				long time = sourceRowMap.getTime(row);
				
				for (int i = 0; i < factor; i++) {
					long newTime = time + (i * offset);
					row = sourceRowMap.createRow(row, newTime);
					Put put = new Put(row);
					put.add(HBaseUtil.colFamily, HBaseUtil.col, value);
					puts.add(put);
					
					if (puts.size() > handlerPerRecord) {
						logger.log(ILogger.DEBUG, "put row, puts size is " + puts.size(), null);
						targetTable.put(puts);
						puts.clear();
					}
				}
				
				result = scanner.next();
			} 			
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		
		targetExperiment.setEnd(sourceExperiment.getStart() + (factor*offset));		
		sourceExperiment.getDataBase().getExperiments().add(targetExperiment);
		try {
			targetExperiment.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
	    ClickWatchExternalLauncher.launch(args, ExtrapolateDataBase.class);
	    return EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("forced to stop ... rude by OSGI!");
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, ExtrapolateDataBase.class);
	}
}
