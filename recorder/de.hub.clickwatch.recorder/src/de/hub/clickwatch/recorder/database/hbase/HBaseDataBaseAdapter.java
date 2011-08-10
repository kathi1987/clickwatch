package de.hub.clickwatch.recorder.database.hbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.HBaseRowMap;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.AbstractDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class HBaseDataBaseAdapter extends AbstractDataBaseRecordAdapter implements IDataBaseRetrieveAdapter {
	
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	@Inject private ILogger logger;
	@Inject HBaseUtil hbaseUtil;
	
	private HBaseRowMap rowMap = null;
	private HTable table = null;
	
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
			put.add(HBaseUtil.colFamily, HBaseUtil.col, handler.getValue().getBytes());
			puts.add(put);
			super.record(handler, sample);
		}
		
		@Override
		protected void save() {	
			HBaseDataBaseAdapter.this.save(puts, start, end);
			super.save();
		}
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
		
		hbaseUtil.getHBaseConfig(experiment.getHbaseRootDir());
		table = hbaseUtil.getHBaseTable(experiment.getName(), overwrite);
		
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

		List<Put> queue = new ArrayList<Put>();
		boolean isStopped = false;
		
		synchronized void add(List<Put> puts) {
			queue.addAll(puts);
			if (queue.size() > handlerPerRecord * 50) {
				logger.log(ILogger.WARNING, "hbase put thread queue is getting veryyyy big, size is " + queue.size(), null);
			}
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
				doPut(false);
			}
			doPut(true);
			reportClosed();
		}

		private void doPut(boolean force) {
			List<Put> puts = null;
			synchronized (this) {
				if (queue.size() >= handlerPerRecord || force) {
					puts = new ArrayList<Put>(queue);
					queue.clear();
				}
			}
			if (puts != null) {
				try {			
					table.put(puts);	
				} catch (IOException e) {
					Throwables.propagate(e);
				}
			}
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
			result = table.getRowOrBefore(row, HBaseUtil.colFamily);
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
		String value = new String(result.getValue(HBaseUtil.colFamily, HBaseUtil.col));
		Handler handler = dbValueAdapter.create(handlerId, rowMap.getTime(result.getRow()), value);
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
		scan.addColumn(HBaseUtil.colFamily, HBaseUtil.col);
		try {
			table.setScannerCaching(100);
			return new ScannerIterator(handlerId, scan, table.getScanner(scan));
		} catch (IOException e) {
			Throwables.propagate(e);
			return null;
		}
	}
	
	private class ScannerIterator implements Iterator<Handler> {
		Scan scan;
		byte[] currentRow = null;
		ResultScanner scanner;
		Result next = null;
		String handlerId;
		
		public ScannerIterator(String handlerId, Scan scan, ResultScanner scanner) {
			super();
			this.handlerId = handlerId;
			this.scan = scan;
			this.currentRow = scan.getStartRow();
			this.scanner = scanner;
		}

		@Override
		public boolean hasNext() {
			if (next != null)  {
				return true;
			} else {
				next = scannerNext();
				return next != null;
			}
		}
		
		private void reset() {
			scan.setStartRow(currentRow);
			try {
				scanner = table.getScanner(scan);
				scanner.next();
			} catch (Exception ex) {
				Throwables.propagate(ex);
			}
		}
		
		private Result scannerNext() {
			Result result = null;
			try {
				result = scanner.next();
			} catch (Exception te) {
				reset();
				return scannerNext();
			}
			if (result != null) {
				currentRow = result.getRow();
			} else {
				currentRow = null;
			}
			return result;
		}

		@Override
		public Handler next() {
			if (next == null) {
				next = scannerNext();
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
