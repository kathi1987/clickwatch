package de.hub.clickwatch.recorder.database.hbase;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;

import com.google.common.base.Throwables;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.util.ILogger;

@Singleton
public class HBaseUtil {
	
	private @Inject ILogger logger;
	private Configuration config = null;
	
	public static final byte[] colFamily = "value".getBytes();
	public static final byte[] col = "value".getBytes();
	
	public Configuration getHBaseConfig(String hbaseRootDir) {
		if (config == null) {
			config = HBaseConfiguration.create();
//			config.clear();
//			config.set("hbase.zookeeper.quorum", "testbed-slave2");
//			config.set("hbase.zookeeper.property.clientPort","2181");
			
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
		return config;
	}

	public HTable getHBaseTable(String tableName, boolean overwrite) {
		HTable table = null;
		try {
			if (config == null) {
				getHBaseConfig(null);
			}
			if (overwrite) {		
				HBaseAdmin admin = new HBaseAdmin(config);
				
				boolean tableExists = admin.tableExists(tableName);
				if (tableExists && overwrite) {
					logger.log(ILogger.WARNING, "table for experiment already exists, i am dropping the existing table", null);
					admin.disableTable(tableName);
					admin.deleteTable(tableName);
					tableExists = false;
				}
				
				if (!tableExists) {
					HTableDescriptor tableDescr = new HTableDescriptor(tableName);
					tableDescr.addFamily(new HColumnDescriptor(colFamily));
					admin.createTable(tableDescr);
				}
				table = new HTable(config, tableName);	
			} else {
				if (table == null || !compare(table.getTableDescriptor().getName(), tableName)) {
					table = new HTable(config, tableName); 
				}
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		return table;
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
}
