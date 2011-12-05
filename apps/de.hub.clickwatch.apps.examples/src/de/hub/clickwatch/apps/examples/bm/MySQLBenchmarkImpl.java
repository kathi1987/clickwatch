package de.hub.clickwatch.apps.examples.bm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class MySQLBenchmarkImpl implements IBenchmarkAdapter {
	
	@Inject @Named(ClickWatchRecorderModule.I_PUTS_BUFFER_SIZE) private int transaction_size;
	@Inject private IValueAdapter valueAdapter;
	@Inject private ILogger logger;
	private Connection connection;
	private long sample = 0;

	@Override
	public void open() {
		sample = 0;
		String connectionURL = "jdbc:mysql://localhost:3306/clickwatch_bm";
		connection = null;

		try {			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "clickwatch_db", "password");
			connection.setAutoCommit(false);
			
			String dropTableSQL = "DROP TABLE experiment";
			logger.log(ILogger.DEBUG, "drop table with SQL: " + dropTableSQL, null);
			Statement dropStatement = connection.createStatement();
			dropStatement.execute(dropTableSQL);
			dropStatement.close();
			
			String createTableSQL = "CREATE TABLE experiment (node varchar(15), handler varchar(200), timestamp bigint, value text)";
			logger.log(ILogger.DEBUG, "create table with SQL: " + createTableSQL, null);
			Statement statement = connection.createStatement();
			statement.execute(createTableSQL);
			statement.close();
			
			connection.commit();
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public void writeSample(Node node, Handler handler, Handler ignore) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
			String sql = "INSERT INTO experiment (node, handler, timestamp, value) VALUES('" 
					+ node.getINetAddress() + "', '" 
					+ handler.getQualifiedName() + "', " 
					+ handler.getTimestamp()/(long)1e9 + ", '"
					+ valueAdapter.getPlainValue(handler).replaceAll("'", "\"") + "');";
			statement.execute(sql);
			statement.close();

			sample++;
			if (sample % transaction_size == 0) {
				connection.commit();
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}		
	}

	@Override
	public void readSample(Node node, Handler handler, long timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scanSample(Node node, Handler handler, long start, long end) {	
		Statement statement = null;
		try {
			for (long time = start/(long)1e9; time < end/(long)1e9; time += 100) {
				statement = connection.createStatement();
				String sql = "SELECT node, handler, timestamp, value FROM experiment WHERE node = '" 
						+ node.getINetAddress() 
						+ "' AND handler='" + handler.getQualifiedName() 
						+ "' AND timestamp >=" + time 
						+ " AND timestamp <=" + Math.min(end, time+100);
				ResultSet result = statement.executeQuery(sql);
				while (result.next()) {
					result.getBlob("value");
				}
				statement.close();
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}
	
	

	@Override
	public void flush() {
		try {
			connection.commit();
		} catch (SQLException e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public void close() {
		flush();
		try {			
			connection.close();
		} catch (SQLException e) {
			Throwables.propagate(e);
		}
	}

}
