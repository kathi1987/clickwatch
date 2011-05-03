package edu.hu.clickwatch.server;

import java.util.ArrayList;

/**
 * The server component stores the database and network connection configuration as well as
 * a list with node connections
 * 
 * @author Michael Frey
 */
public class Server {
	/**	The array list holds a list of node connections */
	ArrayList<NodeConnection> mConnectionList;
	
	public Server(String pDatabaseConfiguration, String pNetworkConfiguration){
		
	}
	
	public boolean initialize(){
		return false;
	}
	
	public ArrayList<NodeConnection> getConnectionList() {
		return mConnectionList;
	}

	public void setConnectionList(ArrayList<NodeConnection> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}	
}
