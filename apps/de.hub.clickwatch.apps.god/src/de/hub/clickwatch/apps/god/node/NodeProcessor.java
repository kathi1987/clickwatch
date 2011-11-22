package de.hub.clickwatch.apps.god.node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import click.ClickConnection;

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
	private INodeConnection nodeConnection = null;
	private int nodeProcessingTimer = 0;
	private boolean callsSetter = false;
	private boolean readFromFile = false;
	private boolean stopNodeProcessor = false;
	
	public NodeProcessor(Server clientLocManager, INodeConnectionProvider nodeConnectionProvider, NodeInformations nodeInfo, boolean i_readFromFile) {
		if ((clientLocManager == null) || (nodeInfo == null)) {
			System.err.println("NodeProcessor constructor cannot be called with null pointer arguments");
			throw new NullPointerException();
		}
		
		nodeInfos = nodeInfo;
		readFromFile = i_readFromFile;
		
		if (nodeConnectionProvider != null) {
			nodeConnection = nodeConnectionProvider.createConnection(nodeInfos.getHost().getHostName(), ""+nodeInfos.getPort());
		}
		server = clientLocManager;
		nodeProcessingTimer = Server.getSzenario().get_NODE_POCESSING_TIMER();
		stopNodeProcessor = false;
	}
	
	public NodeProcessor(Server clientLocManager, NodeInformations nodeInfo, boolean i_readFromFile) {
		this(clientLocManager, null, nodeInfo, i_readFromFile);
	}
	
	public void callsSetter(boolean callsSetter) {
		this.callsSetter = callsSetter;
	}

	public void setNodeProcessingTimer(int nodeProcessingTimer) {
		this.nodeProcessingTimer = nodeProcessingTimer;
	}
	
	public void stopProcessor() {
		this.stopNodeProcessor = true;
	}
	
	public void setMaxCounter(int count) {
		this.maxCounter = count;
	}
	
	public void resetMaxCounter() {
		this.maxCounter = 0;
	}
	
	public void run() {
		int calls = 0;
		
		if ((nodeConnection == null) && (!callsSetter)) {
			System.err.println("Connection to Click-Node is <null>");
			return;
		}
		
		while (!stopNodeProcessor) {
			String askingFor = "";
			
			try {
				if (nodeInfos.getElementFilter().size() == 0) {
					if (callsSetter) {
						break;
					}
					
					System.err.println("element filter is empty ... waiting " + Server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()/1000 + "sec, and starting process again");
					try { sleep(Server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()); } catch (InterruptedException int_exc) {/*nothing to do*/}	
				}
				
				if (readFromFile) {
					for (String[] handler : nodeInfos.getElementFilter().keySet()) {
						
						if (!callsSetter) {
							String nodeName = nodeInfos.getHost().getHostName().replaceAll("\\.", "_") + "_" + nodeInfos.getPort();
							String elementName = nodeName + "_" + handler[0].replaceAll("/", "_");
							String handlerName = elementName + "_" + handler[1].replaceAll("/", "_");
							String resultAsXML = "";
							
							try {
								BufferedReader buffIn = new BufferedReader(new FileReader(Server.getSzenario().get_NODE_PROCESSOR_FILEROOT() + handlerName));
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
					for (String[] handler : nodeInfos.getElementFilter().keySet()) {
						if (callsSetter) {
							askingFor = "\"write: " + handler[0] + " " + handler[1] + " --> " + handler[2] + "\"";
							
							ClickConnection cc = new ClickConnection(nodeInfos.getHost(), nodeInfos.getPort());
							int res = -1;
							if (cc != null) {
								cc.openClickConnection();
								res = cc.writeHandler(handler[0], handler[1], handler[2]);
								cc.closeClickConnection();
							}
								
							if (res == -1) {
								System.err.println("ERROR while calling writeHandler " + handler[0] + "/" + handler[1] + " with args '" + handler[2] + "' on node " + nodeInfos.getHost().getHostAddress() + ":" + nodeInfos.getPort());
							}
						} else if (nodeConnection != null) {
							//ask the node, and process result
							askingFor = "\"read: " + handler[0] + " " + handler[1] + "\"";
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
					
					if (nodeConnection != null) {
						nodeConnection.close();
					}
				}
				
				//end this thread, if it is planned to end, and the end is right now
				if (((this.maxCounter > 0) && (++calls > this.maxCounter)) || (callsSetter)) {
					return;
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
						" while asking for: " + askingFor + "\t...waiting " + Server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()/1000 + "sec, and starting to ask the node again");
				
				//exc.printStackTrace();
				
				if (nodeConnection != null) {
					nodeConnection.close();
				}
				
				try { sleep(Server.getSzenario().get_WAIT_AFTER_ASKING_ERROR()); } catch (InterruptedException int_exc) {/*nothing to do*/}
			}
		}
	}
}