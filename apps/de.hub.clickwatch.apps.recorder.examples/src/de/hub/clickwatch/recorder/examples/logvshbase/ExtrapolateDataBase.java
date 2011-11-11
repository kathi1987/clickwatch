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
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.database.DataBase;
import de.hub.clickwatch.recorder.database.HBaseRowMap;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.recorder.HBaseUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.util.EmfXmlUtil;

public class ExtrapolateDataBase implements IClickWatchMain, IApplication {
	
	@Inject @Named(ClickWatchRecorderModule.I_PUTS_BUFFER_SIZE) int handlerPerRecord;
	@Inject HBaseUtil hbaseUtil;
	@Inject ILogger logger;
	
	@Override
	public void main(IClickWatchContext ctx) {
		Record sourceRecord = ctx.getAdapter(IRecordProvider.class).getRecord();
		Record targetRecord = EcoreUtil.copy(sourceRecord);
		
		HBaseRowMap sourceRowMap = sourceRecord.getHBaseRowMap();
		
		String[] args = ctx.getAdapter(IArgumentsProvider.class).getArguments();
		String targetRecordName = args[0];
		int factor = Integer.parseInt(args[1]);
		long offset = sourceRecord.getEnd() - sourceRecord.getStart();
		
		targetRecord.setName(targetRecordName);
		
		HTable targetTable = hbaseUtil.getHBaseTable(targetRecordName, true);
		HTable sourceTable = hbaseUtil.getHBaseTable(sourceRecord.getName(), false);

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
		
		targetRecord.setEnd(sourceRecord.getStart() + (factor*offset));		
		((DataBase)sourceRecord.eContainer()).getRecords().add(targetRecord);
		try {
			targetRecord.eResource().save(EmfXmlUtil.defaultLoadSaveOptions());
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
