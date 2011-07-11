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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

public class ClickWatchDB implements IClickWatchDB {
	/** The default connection "path" to the postgresql database */
	private String url = "jdbc:postgresql://localhost/";
	/** A list with properties for the database connection */
	private Properties properties = new Properties();
	/** The database connection */
	private Connection connection;

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
				pProperties.getProperty("database"));
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
				}

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
					preparedHandlerStatement.setString(1,
							record.getExperimentId());
					preparedHandlerStatement.setString(2, record.getNodeId());
					preparedHandlerStatement.setLong(3, record.getTimeStamp());
					preparedHandlerStatement.setString(5, record.getMetaData());
				}

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
	public Collection<HandlerRecord> getHandlerRecords(String pExperiment,
			String pNode, String pHandler, long pBegin, long pEnd) {
		try {
			ArrayList<HandlerRecord> result = new ArrayList<HandlerRecord>();
			// Build the query from the parameters
			String query = "SELECT * FROM MetaDataRecord WHERE experimentId = "
					+ "\'" + pExperiment + "\'" + "AND nodeId = " + "\'"
					+ pNode + "\'" + " AND handler = \'" + pHandler
					+ "\' AND timestamp >= " + pBegin
					+ "\' AND timestamp <= \'" + pEnd + "\';";
			// Prepare the query to get the node
			Statement statement = connection.createStatement();
			// Execute the query
			statement.execute(query);
			// Get the results
			ResultSet resultSet = statement.getResultSet();
			// Iterate through the results
			while (resultSet.next()) {
				result.add(new HandlerRecord(resultSet.getString(1), resultSet
						.getString(2), resultSet.getString(3), resultSet
						.getLong(4), resultSet.getString(5)));
			}
			// Close the statement
			statement.close();
			// Return the result
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Collection<MetaDataRecord> getMetaDataRecord(String pExperiment,
			String pNode) {
		try {
			ArrayList<MetaDataRecord> result = new ArrayList<MetaDataRecord>();
			// Build the query from the parameters
			String query = "SELECT * FROM MetaDataRecord WHERE experimentId = "
					+ "\'" + pExperiment + "\'" + "AND nodeId = " + "\'"
					+ pNode + "\'" + ";";

			// Prepare the query to get the node
			Statement statement = connection.createStatement();
			// Execute the query
			statement.execute(query);
			// Get the results
			ResultSet resultSet = statement.getResultSet();
			// Iterate through the results
			while (resultSet.next()) {
				result.add(new MetaDataRecord(resultSet.getString(1), resultSet
						.getString(2), resultSet.getLong(3), resultSet
						.getString(4)));
			}
			// Close the statement
			statement.close();
			// Return the result
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void executeQueryFromFile(final String pFile) {
		// Create a query from the file and excecute it
		executeQuery(readSQLFile(pFile));
	}

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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
