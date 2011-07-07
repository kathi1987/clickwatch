package de.hub.clickwatch.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import java.util.Properties;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.AbstractNodeConnection;
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
	/** A temporary counter for the number of inserted nodes*/	
	private int counter = 0;
	
	
	public DBNodeConnection(){

	}

	// TODO: Port should be handled
	public void setUpDatabaseConnection(final Properties pProperties){
		setUpDatabaseConnection(pProperties.getProperty("user"), pProperties.getProperty("pass"), pProperties.getProperty("database"));
	}


	public void setUpDatabaseConnection(final String pUser, final String pPass, final String pDatabase){
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		properties.setProperty("user", pUser);
		properties.setProperty("password", pPass);
		
		try {
			connection = DriverManager.getConnection(url + pDatabase, properties);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Override
	public void setUp(Node node) {
		super.setUp(node);

		EObject eContainer = node.eContainer();
		int timeout = 6000;
		if (eContainer != null && eContainer instanceof Network) {
			timeout = ((Network)eContainer).getTimeout();
		}
		((AbstractNodeAdapter)getNodeAdapter()).setUp(node.getINetAddress(), node.getPort(), timeout);
	}

	public void initialize(){
		// Temporary
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		properties.setProperty("user", "cdo");
		properties.setProperty("password", ".,Br1t4#-?4ss3rf1lt3r|");
		try {
			connection = DriverManager.getConnection(url + "clickplain", properties);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Override
	protected void updateNode(Node pNode) {
		// Temporary counter
		System.out.println(counter++);
		
		try {		 
			// Create SQL date object
			Timestamp date = new Timestamp(System.currentTimeMillis());
			// Create SQL statement
			Statement statement = connection.createStatement();
			// Execute SQL statement
			statement.execute("INSERT INTO node (inetaddress, timestamp, port) VALUES (" + "\'" + pNode.getINetAddress() + "\'" +   
					"," + "\'" + date + "\'" + "," + "\'" +  pNode.getPort()+ "\'" + ");");
			// Build up handler statement for prepared statement
			String handlerStatement = "INSERT INTO handler (inetaddress, timestamp, name, canread, canwrite, changed, watch, value) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
			// create prepared statement
			PreparedStatement preparedHandlerStatement = connection.prepareStatement(handlerStatement);
			// cast to the pg extension interface
			org.postgresql.PGStatement postgresqlPreparedHandlerStatement = (org.postgresql.PGStatement)preparedHandlerStatement;
			// Set a threshold when psql will compile the prepared handler statement 
			postgresqlPreparedHandlerStatement.setPrepareThreshold(3);
			// Close the insert statement
			statement.close();
			// Commit the node to the node table in order to use the inetaddress in the handler table (foreign key)
			connection.commit();				

			// Iterate through the element list
			for(Element element : pNode.getElements()){
				// Iterate through the handler list
				for(Handler handler : element.getHandlers()){
					preparedHandlerStatement.setString(1, pNode.getINetAddress());
					preparedHandlerStatement.setTimestamp(2, date);
					preparedHandlerStatement.setString(3, handler.getName());
					preparedHandlerStatement.setBoolean(4, handler.isCanRead());
					preparedHandlerStatement.setBoolean(5, handler.isCanWrite());
					preparedHandlerStatement.setBoolean(6, handler.isChanged());
					preparedHandlerStatement.setBoolean(7, handler.isWatch());
					preparedHandlerStatement.setString(8, handler.getValue());
					// TODO: This should be checked
					//preparedHandlerStatement.setString(9, handler.getMixed().toString());
					// Execute the preparte statement
					preparedHandlerStatement.execute();
				}				
			}
			// Commit the handler values
			connection.commit();						
			// Close the prepared handler
			preparedHandlerStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void connect(Object context) {
		// TODO CDO: this.mDatabaseHandler.openSession();
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
}
