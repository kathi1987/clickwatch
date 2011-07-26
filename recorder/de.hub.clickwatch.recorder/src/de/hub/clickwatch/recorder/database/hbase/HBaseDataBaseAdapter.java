package de.hub.clickwatch.recorder.database.hbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;

import com.google.common.base.Throwables;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.HBaseRowMap;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.AbstractDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.emfxml.XmlModelRepository;

public class HBaseDataBaseAdapter extends AbstractDataBaseRecordAdapter implements IDataBaseRetrieveAdapter {
	
	private static final byte[] colFamily = "value".getBytes();
	private static final byte[] col = "value".getBytes();
	
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject private ILogger logger;
	
	private HBaseRowMap rowMap = null;
	private HTable table = null;
	private Configuration config = null;
	
	
	private class NodeDBAdapter extends AbstractNodeDataBaseAdapter {
		private long start = 0;
		private long end = 0;
		private List<Put> puts = new ArrayList<Put>();
		
		@Override
		protected void reinitialize() {
			super.reinitialize();
			puts.clear();
		}
		
		@Override
		protected void record(Handler handler, int sample) {
			long time = handler.getTimestamp();
			if (this.start <= 0 || time < this.start) {
				this.start = time;
			}
			if (time > this.end) {
				this.end = time;
			}
			byte[] row = rowMap.createRow(nodeId, handler.getQualifiedName(), time);
			Put put = new Put(row);
			put.add(colFamily, col, handler.getValue().getBytes());
			puts.add(put);
			super.record(handler, sample);
		}
		
		@Override
		protected void save() {	
			HBaseDataBaseAdapter.this.save(puts, start, end);
			super.save();
		}
	}
	
	private boolean compare(byte[] bytes, String name) {
		if (name.length() != bytes.length) {
			return false;
		}
		byte[] stringBytes = name.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			if (stringBytes[i] != bytes[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void initialize(ExperimentDescr experiment, boolean overwrite) {	
		rowMap = experiment.getHBaseRowMap();
		if (rowMap == null) {
			rowMap = new HBaseRowMap();
			experiment.setHBaseRowMap(rowMap);
		}
		if (overwrite) {
			rowMap.reset();
		}
		
		if (config == null) {
			config = HBaseConfiguration.create();
		}
	
		try {
			if (overwrite) {		
				HBaseAdmin admin = new HBaseAdmin(config);
				
				boolean tableExists = admin.tableExists(experiment.getName().getBytes());
				if (tableExists && overwrite) {
					logger.log(ILogger.WARNING, "table for experiment already exists, i am dropping the existing table", null);
					admin.disableTable(experiment.getName());
					admin.deleteTable(experiment.getName());
					tableExists = false;
				}
				
				if (!tableExists) {
					HTableDescriptor tableDescr = new HTableDescriptor(experiment.getName());
					tableDescr.addFamily(new HColumnDescriptor(colFamily));
					admin.createTable(tableDescr);
				}
				table = new HTable(config, experiment.getName());	
			} else {
				if (table == null || !compare(table.getTableDescriptor().getName(), experiment.getName())) {
					table = new HTable(config, experiment.getName()); 
				}
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		
		super.initialize(experiment, overwrite);	
	}
	
	private synchronized void save(List<Put> puts, long start, long end) {
		try {
			if (experiment.getStart() <= 0 || start < experiment.getStart()) {
				experiment.setStart(start);
			}
			if (end > experiment.getEnd()) {
				experiment.setEnd(end);
			}
			logger.log(ILogger.DEBUG, "Writing puts to hbase, number of puts: " + puts.size(), null);
			logger.log(ILogger.DEBUG, "also saving the experiment file", null);
			experiment.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
			table.put(puts); // TODO run in extra thread for more performance
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public synchronized Object addNode(Node metaData) {
		rowMap.addNode(metaData);	
		return super.addNode(metaData);
	}

	@Override
	protected AbstractNodeDataBaseAdapter createNodeDataBaseAdapter() {
		return new NodeDBAdapter();
	}

	@Override
	public void close(Object nodeAdapter) {
		super.close(nodeAdapter);
		// TODO
	}

	@Override
	public void close() {
		super.close();
		// TODO
	}
	
	private String nodeId = null;
	private long time = 0;

	@Override
	public void initialize(ExperimentDescr experiment) {
		this.initialize(experiment, false);
	}

	@Override
	public void set(String nodeId, long time) {
		this.nodeId = nodeId;
		this.time = time;
	}

	@Override
	public Handler retrieve(String handlerId) {

		byte[] row = rowMap.createRow(nodeId, handlerId, time);
		
		Result result = null;
		try {
			result = table.getRowOrBefore(row, colFamily);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		if (result == null || result.isEmpty() || !rowMap.matches(result.getRow(), handlerId)) {
			return null;
		} else {
			Handler handler = ClickWatchModelFactory.eINSTANCE.createHandler();
			handler.setName(handlerId);
			handler.setTimestamp(rowMap.getTime(result.getRow()));
			String value = new String(result.getValue(colFamily, col));
			dbValueAdapter.setModelValue(handler, value);
			return handler;	
		}
		
		
	}
}
