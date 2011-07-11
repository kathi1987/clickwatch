package de.hub.clickwatch.server.database;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ClickWatchDB implements IClickWatchDB {
	/** The default connection "path" to the postgresql database */
	private String url = "jdbc:postgresql://localhost/";
	/** A list with properties for the database connection */
	private Properties properties = new Properties();
	/** The database connection */
	private Connection connection;
	/** A temporary counter for the number of inserted nodes */
	private int counter = 0;
	
	
	/**
	 * The method sets up a database connection based on the given properties. Basically
	 * it calls the setUpDatabaseConnection(String, String, String) method and therefore
	 * is just defined for comfort use.
	 * 
	 * @param pProperties A attribute/value list which should contain a property 'user', 'pass' and
	 *   'database'
	 */
	public void setUpDatabaseConnection(final Properties pProperties) {
		setUpDatabaseConnection(pProperties.getProperty("user"),
				pProperties.getProperty("pass"),
				pProperties.getProperty("database"));
	}
	
	/**
	 * The method sets up a database connection based on the given arguments. 
	 * 
	 * @param pUser The user of the database
	 * @param pPass The password of the user of the database
	 * @param pDatabase The database which will be used
	 */
	public void setUpDatabaseConnection(final String pUser, final String pPass,
			final String pDatabase) {
		properties.setProperty("user", pUser);
		properties.setProperty("password", pPass);

		try {
			connection = DriverManager.getConnection(url + pDatabase,
					properties);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addHandlerRecord() {
		
	}

	@Override
	public void addExperimentRecord() {
		
	}

	@Override
	public void getHandlerRecords(String pExperiment, String pNode,
			String pHandler, long pBegin, long pEnd) {
		
	}

	@Override
	public void getMetaDataRecord(String pExperiment, String pNode) {
		
	}
	
	public void createTables(final String pFile){
		// Create a query from the file
		String query = readSQLFile(pFile);
		try {
			// Check if reading the SQL file failed
			if(query != null){
				// Prepare the query to get the node
				Statement statement = connection.createStatement();
				// Execute the query
				statement.execute(query);
				// Close the statement
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * The method parses a sql file, removes comment lines and returns
	 * a string which can be used for a query to the database.
	 * 
	 * @param pFile The file which should be read
	 * 
	 * @return A SQL query which can be executed or null if reading the file fails
	 */
	private String readSQLFile(final String pFile) {
		try {
			FileInputStream fileStream = new FileInputStream(pFile);
			DataInputStream inputStream = new DataInputStream(fileStream);
			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(inputStream));

			String fileString = "";
			String resultString = "";

			try {
				while ((fileString = bufferReader.readLine()) != null) {
					// Only if a line is not a comment line add the 
					if (!fileString.startsWith("--")) {
						resultString += fileString;
					}
				}

				inputStream.close();
				return resultString;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * The method closes the connection to a database.
	 */
	public void close(){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
