package de.hub.clickwatch.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;

public class DBNodeConnection extends AbstractNodeConnection {
	/** The default connection "path" to the postgresql database */
	private String url = "jdbc:postgresql://localhost/";
	/** A list with properties for the database connection */
	private Properties properties = new Properties();
	/** The database connection */
	private Connection connection;
	/** A temporary counter for the number of inserted nodes */
	private int counter = 0;

	// TODO: Port should be handled
	public void setUpDatabaseConnection(final Properties pProperties) {
		setUpDatabaseConnection(pProperties.getProperty("user"),
				pProperties.getProperty("pass"),
				pProperties.getProperty("database"));
	}

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
	public void setUp(Node node) {
		super.setUp(node);

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		EObject eContainer = node.eContainer();
		int timeout = 6000;
		if (eContainer != null && eContainer instanceof Network) {
			timeout = ((Network) eContainer).getTimeout();
		}
		((AbstractNodeAdapter) getNodeAdapter()).setUp(node.getINetAddress(),
				node.getPort(), timeout);
	}

	@Override
	protected void updateNode(Node pNode) {
		long start = System.currentTimeMillis();
		// Temporary counter
		// System.out.println(counter++);

		try {
			// Create SQL date object
			Timestamp date = new Timestamp(System.currentTimeMillis());
			// Create SQL statement
			Statement statement = connection.createStatement();
			// Execute SQL statement
			statement
					.execute("INSERT INTO node (inetaddress, timestamp, port) VALUES ("
							+ "\'"
							+ pNode.getINetAddress()
							+ "\'"
							+ ","
							+ "\'"
							+ date
							+ "\'"
							+ ","
							+ "\'"
							+ pNode.getPort()
							+ "\'"
							+ ");");
			// Build up handler statement for prepared statement
			String handlerStatement = "INSERT INTO handler (inetaddress, timestamp, name, canread, canwrite, changed, watch, value) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
			// create prepared statement
			PreparedStatement preparedHandlerStatement = connection
					.prepareStatement(handlerStatement);
			// cast to the pg extension interface
			org.postgresql.PGStatement postgresqlPreparedHandlerStatement = (org.postgresql.PGStatement) preparedHandlerStatement;
			// Set a threshold when psql will compile the prepared handler
			// statement
			postgresqlPreparedHandlerStatement.setPrepareThreshold(3);
			// Close the insert statement
			statement.close();
			// Commit the node to the node table in order to use the inetaddress
			// in the handler table (foreign key)
			connection.commit();

			// Iterate through the element list
			for (Element element : pNode.getElements()) {
				// Iterate through the handler list
				for (Handler handler : element.getHandlers()) {
					preparedHandlerStatement.setString(1,
							pNode.getINetAddress());
					preparedHandlerStatement.setTimestamp(2, date);
					preparedHandlerStatement.setString(3, handler.getName());
					preparedHandlerStatement.setBoolean(4, handler.isCanRead());
					preparedHandlerStatement
							.setBoolean(5, handler.isCanWrite());
					preparedHandlerStatement.setBoolean(6, handler.isChanged());
					preparedHandlerStatement.setBoolean(7, handler.isWatch());
					preparedHandlerStatement.setString(8, handler.getValue());
					// Execute the prepare statement
					preparedHandlerStatement.execute();
				}
			}
			// Commit the handler values
			connection.commit();
			// Close the prepared handler
			preparedHandlerStatement.close();
			long stop = System.currentTimeMillis();

			System.out.println(counter++ + ", " + (stop - start));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Node getNode(final String pInetAddress, final Timestamp pTimeStamp) {
		try {
			// Prepare the query to get the node
			Statement statement = connection.createStatement();

			// Build up the query
			String queryString = "SELECT * FROM node WHERE inetaddress = \'"
					+ pInetAddress + "\' AND \'" + pTimeStamp + "\';";
			// Execute the query
			ResultSet resultSet = statement.executeQuery(queryString);
			// Create a result node
			Node resultNode = ClickWatchModelFactory.eINSTANCE.createNode();

			// Iterate through the result set, but there should be only one
			// result
			while (resultSet.next()) {
				resultNode.setINetAddress(resultSet.getString(1));
				resultNode.setPort(resultSet.getString(3));
			}

			resultSet.close();
			statement.close();

			// Deactivate auto commit
			connection.setAutoCommit(false);
			// Prepare the query to get the node
			statement = connection.createStatement();
			// Activate cursor, fetch size should be determined (has probably an
			// impact on the performance
			statement.setFetchSize(50);
			// Build up the query
			queryString = "SELECT * FROM handler WHERE inetaddress = \'"
					+ pInetAddress + "\' AND \'" + pTimeStamp + "\';";
			// Execute the query
			resultSet = statement.executeQuery(queryString);

			// Iterate through the result set
			while (resultSet.next()) {
				// Add the handlers to the node

			}

			resultSet.close();
			statement.close();

			return resultNode;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void connect(Object context) {
		super.connect(context);
	}

	@Override
	public void cleanUp() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String readSQLFile(final String pFile) {
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

	public void createTables(final String pQuery){
		try {
			// Check if reading the SQL file failed
			if(pQuery != null){
				// Prepare the query to get the node
				Statement statement = connection.createStatement();
				// Execute the query
				statement.execute(pQuery);
				// Commit
				connection.commit();
				// Close the statement
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
