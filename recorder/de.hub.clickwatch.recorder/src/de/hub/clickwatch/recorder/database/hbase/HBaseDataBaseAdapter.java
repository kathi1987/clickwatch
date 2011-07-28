package de.hub.clickwatch.recorder.database.hbase;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

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
	@Inject @Named(CWRecorderModule.B_HBASE_WITH_EXTRA_QUUE) private boolean withExtraQueue;
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	@Inject private ILogger logger;
	
	private HBaseRowMap rowMap = null;
	private HTable table = null;
	private Configuration config = null;
	
	private PutThread putThread = null;
	
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
			String hbaseRootDir = experiment.getHbaseRootDir();
			if (!(hbaseRootDir == null || hbaseRootDir.equals(""))) {
				String hbaseSite = ""
						 + "<?xml version='1.0'?>"
						 + "<?xml-stylesheet type='text/xsl' href='configuration.xsl'?>"
						 + "<configuration>"
						 + "  <property>"
						 + "    <name>hbase.zookeeper.quorum</name>"
						 + "    <value>" + hbaseRootDir + "</value>"
						 + "  </property>"
						 + "</configuration>                                                ";
						
				ByteArrayInputStream baos = new ByteArrayInputStream(hbaseSite.getBytes());
				config.addResource(baos);
				try {
					baos.close();
				} catch (IOException e) {
					Throwables.propagate(e);
				}
			}
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
			if (putThread == null) {
				putThread = new PutThread();
				putThread.start();
			}
			putThread.add(puts);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}
	
	private class PutThread extends Thread {
		
		public PutThread() {
			super("Put Thread");
		}

		Queue<Put> queue = new ConcurrentLinkedQueue<Put>();
		boolean isStopped = false;
		
		void add(List<Put> puts) {
			if (withExtraQueue) {
				queue.addAll(puts);
			} else {
				try {
					table.put(puts);
				} catch (IOException e) {
					Throwables.propagate(e);
				}
			}
		}
		
		List<Put> getWholeQueue() {
			List<Put> puts = new ArrayList<Put>();
			while (queue.size() > 0) {
				puts.add(queue.poll());
			}
			return puts;
		}
		
		synchronized void waitForNextPut() {
			try {
				wait(100);
			} catch (InterruptedException e) {
				Throwables.propagate(e);
			}
		}

		@Override
		public void run() {
			while (!isStopped) {
				waitForNextPut();
			
				if (queue.size() >= handlerPerRecord) {
					try {
						table.put(getWholeQueue());
					} catch (IOException e) {
						Throwables.propagate(e);
					}					
				}
			}
			reportClosed();
		}
		
		synchronized void close() {
			isStopped = true;
			notify();
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
	}

	@Override
	public synchronized void close() {
		if (putThread != null) {
			putThread.close();
			try {
				wait();
			} catch (InterruptedException e) {
				Throwables.propagate(e);
			}
		}
		super.close();
	}
	
	private synchronized void reportClosed() {
		notify();
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
			return getHandlerFromResult(handlerId, result);	
		}
	}

	private Handler getHandlerFromResult(String handlerId, Result result) {
		Handler handler = ClickWatchModelFactory.eINSTANCE.createHandler();
		handler.setName(handlerId);
		handler.setTimestamp(rowMap.getTime(result.getRow()));
		String value = new String(result.getValue(colFamily, col));
		dbValueAdapter.setModelValue(handler, value);
		return handler;
	}
	
	@Override
	public Handler[] retrieve(String[] handlerIds) {
		Handler[] result = new Handler[handlerIds.length];
		for (int i = 0; i < handlerIds.length; i++) {
			result[i] = retrieve(handlerIds[i]);
		}
		return result;
	}
	
	public Iterator<Handler> retrieve(String nodeId, String handlerId, long start, long end) {
		byte[] startRow = rowMap.createRow(nodeId, handlerId, start);
		byte[] stopRow = rowMap.createRow(nodeId, handlerId, end);
		Scan scan = new Scan(startRow, stopRow);
		scan.addColumn(colFamily, col);
		try {
			table.setScannerCaching(5000);
			return new ScannerIterator(handlerId, table.getScanner(scan));
		} catch (IOException e) {
			Throwables.propagate(e);
			return null;
		}
	}
	
	private class ScannerIterator implements Iterator<Handler> {
		ResultScanner scanner;
		Result next = null;
		String handlerId;
		
		public ScannerIterator(String handlerId, ResultScanner scanner) {
			super();
			this.handlerId = handlerId;
			this.scanner = scanner;
		}

		@Override
		public boolean hasNext() {
			if (next != null)  {
				return true;
			} else {
				try {
					next = scanner.next();
				} catch (IOException e) {
					Throwables.propagate(e);
				}
				return next != null;
			}
		}

		@Override
		public Handler next() {
			if (next == null) {
				try {
					next = scanner.next();
				} catch (IOException e) {
					Throwables.propagate(e);
				}
			}
			if (next == null) {
				return null;
			}
			Result result = next;
			next = null;
			return getHandlerFromResult(handlerId, result);					
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}		
	}
}
