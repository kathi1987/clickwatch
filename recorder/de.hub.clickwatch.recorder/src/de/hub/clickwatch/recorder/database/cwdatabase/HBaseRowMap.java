package de.hub.clickwatch.recorder.database.cwdatabase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class HBaseRowMap implements Serializable {
	
	private static final long serialVersionUID = -2865619707254476225L;
	
	private static final int NODE_KEY_LENGTH = 4;
	private static final int HANDLER_KEY_LENGTH = 4;
	private static final int TIME_KEY_LENGTH = Long.SIZE/8;
	
	private int nodeUnique = 0;
	private int handlerUnique = 0;
	private Map<String, byte[]> nodeKeys = new HashMap<String, byte[]>();
	private Map<String, byte[]> handlerKeys = new HashMap<String, byte[]>();
	
	public byte[] createRow(String nodeId, String handlerId, long time) {
		byte[] nodeKey = nodeKeys.get(nodeId);
		byte[] handlerKey = handlerKeys.get(handlerId);
		byte[] timeKey = createTimeKey(time);  
		
		byte[] row = new byte[nodeKey.length + handlerKey.length + timeKey.length];
		for (int i = 0; i < nodeKey.length; i++) row[i] = nodeKey[i];
		for (int i = 0; i < handlerKey.length; i++) row[i + nodeKey.length] = handlerKey[i];
		for (int i = 0; i < timeKey.length; i++) row[i + nodeKey.length + handlerKey.length] = timeKey[i];
	
		return row;
	}
	
	public byte[] createRow(byte[] row, long time) {
		byte[] timeKey = createTimeKey(time);
		for (int i = 0; i < timeKey.length; i++) row[i + NODE_KEY_LENGTH + HANDLER_KEY_LENGTH] = timeKey[i];
		return row;
	}

	private byte[] createTimeKey(long time) {
		byte [] timeKey = new byte[TIME_KEY_LENGTH];  
		for(int i= 0; i < TIME_KEY_LENGTH; i++){  
			timeKey[TIME_KEY_LENGTH - 1 - i] = (byte)(time);
			time = time >>> 8;
		}
		return timeKey;
	}
	
	private byte[] toByteArray(int value, int length) {
		return ("" + (int)((Math.pow(10, length) - 1) - value)).getBytes();
	}
	
	public synchronized void addNode(Node metaData) {
		nodeKeys.put(metaData.getINetAddress(), toByteArray(nodeUnique++, NODE_KEY_LENGTH));
		for (Handler handler: metaData.getAllHandlers()) {
			String qualifiedName = handler.getQualifiedName();
			byte[] key = handlerKeys.get(qualifiedName);
			if (key == null) {
				handlerKeys.put(qualifiedName, toByteArray(handlerUnique++, HANDLER_KEY_LENGTH));
			}
		}
	}

	public void reset() {
		nodeUnique = 0;
		handlerUnique = 0;
		nodeKeys.clear();
		handlerKeys.clear();
	}

	public long getTime(byte[] row) {
		long time = 0;
		int offset = NODE_KEY_LENGTH + HANDLER_KEY_LENGTH;
		for (int i = offset; i < offset + TIME_KEY_LENGTH; i++) {
			time <<= 8;
			time ^= (long) row[i] & 0xFF;
		}
		
		return time;
	}

	public boolean matches(byte[] row, String handlerId) {
		byte[] handlerKey = handlerKeys.get(handlerId);
		for (int i = 0; i < HANDLER_KEY_LENGTH; i++) {
			if (row[i + NODE_KEY_LENGTH] != handlerKey[i]) {
				return false;
			}
		}
		return true;
	}

	
}
