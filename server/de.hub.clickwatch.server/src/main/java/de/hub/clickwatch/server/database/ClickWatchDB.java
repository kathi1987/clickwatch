package de.hub.clickwatch.server.database;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Properties;

import com.google.inject.Inject;

public class ClickWatchDB implements IClickWatchDB {
	/** The default connection "path" to the postgresql database */
	private String url = "jdbc:postgresql://localhost";
	/** A list with properties for the database connection */
	private Properties properties = new Properties();
	/** The database connection */
	private Connection connection;
	/***/
	private boolean mStatus = false;

	@Inject
	public ClickWatchDB(){
		
	}
	
	public Connection getConnection(){
		return connection;
	}
	
	/**
	 * The method sets up a database connection based on the given properties.
	 * Basically it calls the setUpDatabaseConnection(String, String, String)
	 * method and therefore is just defined for comfort use.
	 * 
	 * @param pProperties
	 *            A attribute/value list which should contain a property 'user',
	 *            'pass' and 'database'
	 */
	public void setUpDatabaseConnection(final Properties pProperties) {
		setUpDatabaseConnection(pProperties.getProperty("user"),
				pProperties.getProperty("pass"),
				pProperties.getProperty("database"),
				pProperties.getProperty("port"));
	}
	
	public boolean isConnected(){
		return mStatus;
	}

	/**
	 * The method sets up a database connection based on the given arguments.
	 * 
	 * @param pUser
	 *            The user of the database
	 * @param pPass
	 *            The password of the user of the database
	 * @param pDatabase
	 *            The database which will be used
	 */
	public void setUpDatabaseConnection(final String pUser, final String pPass,
			final String pDatabase, final String pPort) {
		properties.setProperty("user", pUser);
		properties.setProperty("password", pPass);

		try {
			connection = DriverManager.getConnection(url + ":" + pPort + "/"+ pDatabase, properties);
			connection.setAutoCommit(false);
			this.mStatus = true;
		} catch (SQLException e) {
			this.mStatus = false;
			e.printStackTrace();
		}
	}

	@Override
	public void addHandlerRecord(final HandlerRecord pHandlerRecord) {
		executeQuery(pHandlerRecord.createInsertStatement());
	}


	@Override
	public void addHandlerRecords(
			final Collection<HandlerRecord> pHandlerRecords) {
		if (pHandlerRecords.size() > 0) {
			try {
				// Create prepared statement
				PreparedStatement preparedHandlerStatement = connection
						.prepareStatement(new HandlerRecord()
								.createPreparedInsertStament());

				for (HandlerRecord record : pHandlerRecords) {
					preparedHandlerStatement.setString(1,
							record.getExperimentId());
					preparedHandlerStatement.setString(2, record.getNodeId());
					preparedHandlerStatement.setString(3,
							record.getQualifiedName());
					preparedHandlerStatement.setLong(4, record.getTimeStamp());
					preparedHandlerStatement.setString(5, record.getValue());
					
					preparedHandlerStatement.addBatch();

				}
				preparedHandlerStatement.executeBatch();
				// Commit the handler record values
				connection.commit();
				// Close the prepared handler
				preparedHandlerStatement.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void addExperimentRecord(final MetaDataRecord pExperimentRecord) {
		executeQuery(pExperimentRecord.createInsertStatement());
	}
	
	@Override
	public void addExperimentRecords(
			final Collection<MetaDataRecord> pExperimentRecords) {
		if (pExperimentRecords.size() > 0) {
			try {
				// Create prepared statement
				PreparedStatement preparedHandlerStatement = connection
						.prepareStatement(new MetaDataRecord()
								.createPreparedInsertStament());

				for (MetaDataRecord record : pExperimentRecords) {
						// Set the experiment id
						preparedHandlerStatement.setString(1, record.getExperimentId());
						// Set the node
						preparedHandlerStatement.setString(2, record.getNode());
						// Set the time stamp
						preparedHandlerStatement.setLong(3, record.getTimeStamp());
						// Set the meta data of the node
						preparedHandlerStatement.setString(4, record.getMetaData());
						// Add prepared handler statement to batch
						preparedHandlerStatement.addBatch();
				}
				preparedHandlerStatement.executeBatch();
				// Commit the handler record values
				connection.commit();
				// Close the prepared handler
				preparedHandlerStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void executeQueryFromFile(final String pFile) {
		// Create a query from the file and excecute it
		executeQuery(readSQLFile(pFile));
	}

	@Override
	public void executeQuery(final String pQuery) {
		try {
			// Check if reading the SQL file failed
			if (pQuery != null) {
				// Prepare the query to get the node
				Statement statement = connection.createStatement();
				// Execute the query
				statement.execute(pQuery);
				// Close the statement
				statement.close();
				//
				connection.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The method parses a sql file, removes comment lines and returns a string
	 * which can be used for a query to the database.
	 * 
	 * @param pFile
	 *            The file which should be read
	 * 
	 * @return A SQL query which can be executed or null if reading the file
	 *         fails
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
	public void close() {
		try {
			connection.close();
			mStatus = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
