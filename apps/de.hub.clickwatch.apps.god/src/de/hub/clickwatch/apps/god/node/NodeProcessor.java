package de.hub.clickwatch.apps.god.node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.model.Handler;


public class NodeProcessor extends Thread {
	private Server server = null;
	private int maxCounter = 0;
	private NodeInformations nodeInfos = null;
	private INodeConnection nodeConnection;
	private int nodeProcessingTimer = 0;
	private boolean callsSetter = false;
	private boolean readFromFile = false;
	
	
	public NodeProcessor(Server clientLocManager, INodeConnectionProvider nodeConnectionProvider, NodeInformations nodeInfo, boolean i_readFromFile) {
		if ((clientLocManager == null) || (nodeInfo == null)) {
			System.err.println("NodeProcessor constructor cannot be called with null pointer arguments");
			throw new NullPointerException();
		}
		
		nodeInfos = nodeInfo;
		readFromFile = i_readFromFile;
		
		nodeConnection = nodeConnectionProvider.createConnection(nodeInfos.getHost().getHostName(), ""+nodeInfos.getPort());
		server = clientLocManager;
		nodeProcessingTimer = server.getSzenario().get_NODE_POCESSING_TIMER();
	}
	
	public void callsSetter(boolean callsSetter) {
		this.callsSetter = callsSetter;
	}

	public void setNodeProcessingTimer(int nodeProcessingTimer) {
		this.nodeProcessingTimer = nodeProcessingTimer;
	}

	public void run() {
		int calls = 0;
		
		if (nodeConnection == null) {
			System.err.println("Connection to Click-Node is <null>");
			return;
		}
		
		while (true) {
			try {
				if (nodeInfos.getElementFilter().size() == 0) {
					if (callsSetter) {
						break;
					}
					
					System.err.println("element filter is empty ... waiting " + server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()/1000 + "sec, and starting process again");
					try { sleep(server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()); } catch (InterruptedException int_exc) {/*nothing to do*/}	
				}
				
				if (readFromFile) {
					for (String[] handler : nodeInfos.getElementFilter().keySet()) {
						
						if (!callsSetter) {
							String nodeName = nodeInfos.getHost().getHostName().replaceAll("\\.", "_") + "_" + nodeInfos.getPort();
							String elementName = nodeName + "_" + handler[0].replaceAll("/", "_");
							String handlerName = elementName + "_" + handler[1].replaceAll("/", "_");
							String resultAsXML = "";
							
							try {
								BufferedReader buffIn = new BufferedReader(new FileReader(server.getSzenario().get_NODE_PROCESSOR_FILEROOT() + handlerName));
								String strLine;
								while ((strLine = buffIn.readLine()) != null)   {
									resultAsXML += strLine;
								}
							} catch (Exception exc) {
								System.out.println("got exception while reading file: " + exc.getMessage());
							}
							
							//process results
							NodeInformationProcessor proc = nodeInfos.getElementFilter().get(handler).newInstance();
							List<ClientInformations> clInfo = proc.handleGenuineInformations(resultAsXML);
							if ((clInfo != null) && (clInfo.size() > 0)) {
								server.storeInformations(nodeInfos.getElementFilter().get(handler).getName(), clInfo, nodeInfos.getHost().getHostAddress(), "" + nodeInfos.getPort());
							}
						}
					}
					
				} else {
					nodeConnection.connect();
					for (String[] handler : nodeInfos.getElementFilter().keySet()) {
						if (callsSetter) {
							//TODO:_scurow: correct this later ... writeHandler is currently not implemented in ClickWatch
							//call something like: writeHandler(handler[0], handler[1], handler[2]);
						
						} else {
							//ask the node, and process result
							IHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IHandlerAdapter.class);
							Handler resultHandler = handlerAdapter.getHandler(handler[0] + "/" + handler[1]);
							
							//process results
							NodeInformationProcessor proc = nodeInfos.getElementFilter().get(handler).newInstance();
							List<ClientInformations> clInfo = proc.handleInformations(resultHandler);
							if ((clInfo != null) && (clInfo.size() > 0)) {
								server.storeInformations(nodeInfos.getElementFilter().get(handler).getName(), clInfo, nodeInfos.getHost().getHostAddress(), ""+nodeInfos.getPort());
							}
						}
					}
					nodeConnection.disconnect();
				}
				
				//end this thread, if it is planned to end, and the end is right now
				if (((this.maxCounter > 0) && (++calls > this.maxCounter)) || (callsSetter)) {
					break;
				}
				
				//wait the NODE_PROCESSING_TIME
				try {
					sleep(nodeProcessingTimer);
				} catch (InterruptedException int_exc) {
					System.err.println("NodeProcessor received InterruptedException");
					break;
				}
			
				
			} catch (Exception exc) {
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd @ HH:mm:ss");
				System.err.println(dateFormat.format(new Date()) + " -> node '" + nodeInfos.getHost().getHostAddress() + ":" + nodeInfos.getPort() + "' throwed Exception: " + exc.getMessage() +
						" ...waiting " + server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()/1000 + "sec, and starting to ask the node again");
				
				if (nodeConnection.isConnected()) {
					nodeConnection.disconnect();
				}
				
				try { sleep(server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()); } catch (InterruptedException int_exc) {/*nothing to do*/}
			}
		}
	}
}