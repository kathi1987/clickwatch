package de.hub.clickwatch.apps.examples.bm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;

import com.google.inject.Inject;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.HBaseRowMap;
import de.hub.clickwatch.recorder.recorder.HBaseUtil;
import de.hub.clickwatch.util.Throwables;

public class HBaseBenchmarkImpl implements IBenchmarkAdapter {

	@Inject HBaseUtil hbaseUtil;
	private HTable table;
	private List<Put> puts = null;
	private HBaseRowMap rowMap = null;
	
	@Override
	public void open() {
		hbaseUtil.getHBaseConfig(null);
        if (table == null) {
            table = hbaseUtil.getHBaseTable("clickwatch_bm", true);
        }
        puts = new ArrayList<Put>();
        rowMap = new HBaseRowMap();
	}

	@Override
	public void writeSample(Node node, Handler handler, Handler ignore) {
		puts.add(hbaseUtil.createPut(rowMap, node, handler));
		if (puts.size() > 1000) {
			flush();
			puts.clear();
		}
	}

	@Override
	public void readSample(Node node, Handler handler, long timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scanSample(Node node, Handler handler, long start, long end) {
		
		String qualifiedHandlerName = handler.getQualifiedName();
        String nodeAddress = node.getINetAddress();
        byte[] startRow = rowMap.createRow(nodeAddress, qualifiedHandlerName, start, false);
        byte[] stopRow = rowMap.createRow(nodeAddress, qualifiedHandlerName, end, false);
        Scan scan = new Scan(startRow, stopRow);
        scan.addColumn(HBaseUtil.colFamily, HBaseUtil.col);
        try {
            table.setScannerCaching(100);
            Iterator<Result> iterator = table.getScanner(scan).iterator();
            while(iterator.hasNext()) {
            	iterator.next().getBytes();
            }
        } catch (IOException e) {
            Throwables.propagate(e);
        }
	}

	@Override
	public void close() {
		flush();
	}

	@Override
	public void flush() {
		try {
			table.put(puts);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	
	}
	
	

}
