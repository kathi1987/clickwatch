package de.hub.clickwatch.recorder.database.hbase;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;

public class Example {
	
	private final long PUTS = 100000;
	private final int CACHE = 1000;
	private final int VALUE = 1000;
	
	private String value = "<entry from='06-1B-B1-05-3B-9 F' time='1308921284.428582142' seq='649' period='1000' tau='100000'><link to='06-1B-B1-05-3B-8E' seq='651' period='1000' tau='100000' last_rx='0 .098985142'><link_info size='300' rate='2' fwd='79' rev='92'/>    <link_info size='300' rate='12' fwd='75' rev='88'/></link><link to='06-1B-B1-05-3B-96' seq='649' period='1000' tau='100000' last_rx='0 .062244142'>    <link_info size='300' rate='2' fwd='62' rev='99'/>    <link_info size='300' rate='12' fwd='59' rev='83'/></link><link to='06-1B-B1-05-3B-9B' seq='643' period='1000' tau='100000' last_rx='2 .923647142'>    <link_info size='300' rate='12' fwd='0' rev='46'/>    <link_info size='300' rate='2' fwd='0' rev='19'/></link><link to='06-1B-B1-05-46-08' seq='648' period='1000' tau='100000' last_rx='0 .453636142'>    <link_info size='300' rate='2' fwd='99' rev='99'/>    <link_info size='300' rate='12' fwd='99' rev='97'/></link><link to='06-1B-B1-05-46-09' seq='648' period='1000' tau='100000' last_rx='0 .658815142'>    <link_info size='300' rate='2' fwd='80' rev='72'/>    <link_info size='300' rate='12' fwd='86' rev='91'/></link><link to='06-1B-B1-05-46-10' seq='649' period='1000' tau='100000' last_rx='0 .420295142'>    <link_info size='300' rate='2' fwd='99' rev='100'/>    <link_info size='300' rate='12' fwd='100' rev='100'/></link><link to='06-1B-B1-07-CD-97' seq='647' period='1000' tau='100000' last_rx='0 .387439142'>    <link_info size='300' rate='2' fwd='96' rev='57'/>    <link_info size='300' rate='12' fwd='77' rev='12'/></link><link to='06-1B-B1-07-CD-99' seq='651' period='1000' tau='100000' last_rx='0 .407022142'>    <link_info size='300' rate='2' fwd='97' rev='97'/>    <link_info size='300' rate='12' fwd='93' rev='98'/></link></entry>";

	public void run() throws Exception {
		Configuration config = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(config);
		
		HTableDescriptor tableDescr = new HTableDescriptor("test");
		tableDescr.addFamily(new HColumnDescriptor("col"));
		admin.createTable(tableDescr);
		
		HTable table = new HTable("test");
		
		Random random = new Random();
		byte[] value = new byte[VALUE];
		random.nextBytes(value);
		long start = System.nanoTime();
		List<Put> puts = new ArrayList<Put>(CACHE);
		List<byte[]> rows = new ArrayList<byte[]>();
		for (int i = 1; i <= PUTS; i ++) {
			byte[] row = new byte[40];
			random.nextBytes(row);
			rows.add(row);
			
			Put put = new Put(row);
//			byte[] zip = zip(this.value.getBytes());
			put.add("col".getBytes(), "a".getBytes(), this.value.getBytes());
			puts.add(put);
			if (i % CACHE == 0) {
				System.out.println("# " + i);
				table.put(puts);
				puts.clear();
			}		
		}
		System.out.println("duration: " + (System.nanoTime() - start));
		
		start = System.nanoTime();
		int i = 0;
		for (byte[] row: rows) {
//			Get get = new Get(row);
//			get.addColumn("col".getBytes(), "a".getBytes());
			Result result = table.getRowOrBefore(row, "col".getBytes());
			result.getValue("col".getBytes(), "a".getBytes());
			if (i % CACHE == 0) {
				System.out.println("# " + i);
			}
			i++;
		}
		System.out.println("duration: " + (System.nanoTime() - start));
		
		admin.disableTable("test");
		admin.deleteTable("test");
	}
	
	public byte[] zip(byte[] value) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(value.length);
		ZipOutputStream zip = new ZipOutputStream(baos);
		zip.putNextEntry(new ZipEntry("value"));
		zip.write(value);
		zip.closeEntry();
		zip.close();
		return baos.toByteArray();
		
	}
	 
	public static void main(String[] args) throws Exception {
		new Example().run();
	}
}
