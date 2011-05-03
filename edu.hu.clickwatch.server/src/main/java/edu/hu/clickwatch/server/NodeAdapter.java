package edu.hu.clickwatch.server;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

public class NodeAdapter implements INodeAdapter {
	/** */
	@Inject private IClickSocket mClickSocket;
	/** */
	private String mHost = null;
	/** */
	private String mPort = null;
	/** */
	private boolean isConnected = false;
	/** */
	private Node mInternalNodeCopy = null;

	
	/** 
	 * 
	 */
	public synchronized void setUp(String pHost, String pPort) {
		this.mHost = pHost;
		this.mPort = pPort;
	}
	
	public void connect() {
		/** */
		Preconditions.checkState(!isConnected);
		/** */
		Preconditions.checkNotNull(mHost);
		/** */
		Preconditions.checkNotNull(mPort);

		try {
			mClickSocket.connect(InetAddress.getByName(mHost.trim()), new Integer(mPort.trim()));
			isConnected = true;
		} catch (IOException e) {
			Throwables.propagate(e);
		}	
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void disconnect() {
		if (mClickSocket == null || !isConnected) {
			return;
		}
		mClickSocket.close();
		isConnected = false;
		if (mInternalNodeCopy != null) {
			EcoreUtil.delete(mInternalNodeCopy, true);
		}
		mInternalNodeCopy = null;		
	}

	public Node retrieve(String pElememtFilter, String pHandlerFilter) {
		// TODO Auto-generated method stub
		return mInternalNodeCopy;
	}

	public void updateHandlerValue(Handler pHandler) {
		// TODO Auto-generated method stub
		
	}
}
