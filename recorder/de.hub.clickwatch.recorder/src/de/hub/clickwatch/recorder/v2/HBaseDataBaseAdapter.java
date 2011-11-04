package de.hub.clickwatch.recorder.v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.hbase.HBaseUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.TaskQueues;
import de.hub.clickwatch.util.Throwables;

public class HBaseDataBaseAdapter implements IDataBaseAdapter {

    @Inject private HBaseUtil hbaseUtil;
    @Inject private TaskQueues taskQueues;
    @Inject private ILogger logger;
    @Inject private IValueAdapter valueAdapter;
    
    private HBaseRowMap rowMap = null;
    private HTable table = null;
    private List<Put> puts = new ArrayList<Put>();
    
    public synchronized void initialize(Record record, boolean isNew) {        
        if (isNew) {
            rowMap = record.getHBaseRowMap();
            if (rowMap == null) {
                rowMap = new HBaseRowMap();
                record.setHBaseRowMap(rowMap);
            }
            rowMap.reset();
        } else {
            Preconditions.checkArgument(record.getHBaseRowMap() != null);
            rowMap = record.getHBaseRowMap();
        }
        
        hbaseUtil.getHBaseConfig(null);
        if (table == null) {
            table = hbaseUtil.getHBaseTable(record.getName(), isNew);
        }
    }
    
    @Override
    public void record(Node node, Handler handler) {
        Put put = hbaseUtil.createPut(rowMap, node, handler);
        addPut(put);
    }

    private synchronized void addPut(Put put) {
        puts.add(put);        
        if (puts.size() > 1000) {
            performPuts();
        }
    }
    
    private void performPuts() {
        final List<Put> putsCopy = new ArrayList<Put>(puts);
        puts.clear();
        taskQueues.dispatchTask(this, new Runnable() {
            @Override
            public void run() {
                try {
                    table.put(putsCopy);
                    logger.log(ILogger.DEBUG, "putted " + putsCopy.size() + " handler into HBase table", null);
                    putsCopy.clear();
                } catch (IOException e) {
                    logger.log(ILogger.ERROR, "error on putting data into HBase table", e);
                }
            }
        });
    }

    @Override
    public synchronized void close() {
        performPuts();
        final HTable fTable = table;
        taskQueues.dispatchTask(this, new Runnable() {
            @Override
            public void run() {
                try {
                    fTable.close();
                } catch (IOException e) {
                    logger.log(ILogger.DEBUG, "error on closing HBase table", e);
                }
            }
        });            
        rowMap = null;
        table = null;
    }

    @Override
    public Iterator<Handler> retrieve(Node node, Handler handler) {
        String qualifiedHandlerName = handler.getQualifiedName();
        String nodeAddress = node.getINetAddress();
        byte[] startRow = rowMap.createRow(nodeAddress, qualifiedHandlerName, 0, false);
        Scan scan = new Scan(startRow);
        scan.addColumn(HBaseUtil.colFamily, HBaseUtil.col);
        try {
            table.setScannerCaching(100);
            return new ScannerIterator(qualifiedHandlerName, scan, table.getScanner(scan));
        } catch (IOException e) {
            Throwables.propagate(e);
            return null;
        }
    }

    @Override
    public Handler retrieve(Node node, Handler handler, long time) {
        String qualifiedHandlerName = handler.getQualifiedName();
        String nodeAddress = node.getINetAddress();
        byte[] row = rowMap.createRow(nodeAddress, qualifiedHandlerName, time, false);
        Result result = null;
        try {
            result = table.get(new Get(row));
        } catch (IOException e) {
            Throwables.propagate(e);
        }
        return getHandlerFromHBaseResult(qualifiedHandlerName, result);
    }
    
    public Iterator<Handler> retrieve(Node node, Handler handler, long start, long end) {
        String qualifiedHandlerName = handler.getQualifiedName();
        String nodeAddress = node.getINetAddress();
        byte[] startRow = rowMap.createRow(nodeAddress, qualifiedHandlerName, start, false);
        byte[] stopRow = rowMap.createRow(nodeAddress, qualifiedHandlerName, end, false);
        Scan scan = new Scan(startRow, stopRow);
        scan.addColumn(HBaseUtil.colFamily, HBaseUtil.col);
        try {
            table.setScannerCaching(100);
            return new ScannerIterator(qualifiedHandlerName, scan, table.getScanner(scan));
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
        String qualifiedHandlerName;
        
        public ScannerIterator(String handlerId, Scan scan, ResultScanner scanner) {
            super();
            this.qualifiedHandlerName = handlerId;
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
            return getHandlerFromHBaseResult(qualifiedHandlerName, result);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }       
    }
    
    private Handler getHandlerFromHBaseResult(String qualifiedHandlerName, Result result) {
        String value = new String(result.getValue(HBaseUtil.colFamily, HBaseUtil.col));
        return valueAdapter.create(qualifiedHandlerName, rowMap.getTime(result.getRow()), value);
    }
}
