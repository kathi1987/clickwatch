package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.NanoClock;
import de.hub.emfxml.util.EmfXmlUtil;

public class CompoundHandlerEventAdapter extends HandlerEventAdapter {

	private static final int driftMavrSize = 20;	
	@Inject private ILogger logger;
	@Inject @Named(ClickWatchModule.CS_IGNORED_HANDLER_NAMES) private Collection<String> commonHandler;
	@Inject @Named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS) private boolean records;
	@Inject @Named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY) private boolean changesOnly;
	@Inject @Named(ClickWatchModule.I_COMPOUND_HANDLER_LOCAL_UPDATE_DELAY) private int chLocalUpdateDelay;
	
	@Inject private NanoClock clock;
	
	private IValueAdapter valueAdapter = null;
	
	private static final String COMPOUND_HANDLER_ELEMENT = "com";
	private static final String COMPOUND_HANDLER_READ_HANDLER = "read";
	private static final String COMPOUND_HANDLER_RESET_HANDLER = "reset";
	private static final String COMPOUND_HANDLER_INSERT_HANDLER = "insert";
	
	private String currentHandlerName = null;
	
	private long pullTime = 0;
	private long driftMavrSum = 0;
	private ArrayBlockingQueue<Long> driftMavrValues = new ArrayBlockingQueue<Long>(driftMavrSize);
	private boolean inRecordMode = false;
	
	private void configureCompoundHandler(boolean record, int chLocalUpdateDelay) {
		IClickSocket clickSocket = connection.acquireSocket();
		if (clickSocket == null) {
			return;
		}
		try {
			if (record) {
				clickSocket.write(COMPOUND_HANDLER_ELEMENT, "recordmode", "1".toCharArray());
				if (changesOnly) {
					clickSocket.write(COMPOUND_HANDLER_ELEMENT, "updatemode", "2".toCharArray());
				} else {
					clickSocket.write(COMPOUND_HANDLER_ELEMENT, "updatemode", "0".toCharArray());
				}
				clickSocket.write(COMPOUND_HANDLER_ELEMENT, "sampletime", new Integer(chLocalUpdateDelay).toString().toCharArray());
			} else {
				clickSocket.write(COMPOUND_HANDLER_ELEMENT, "recordmode", "0".toCharArray());
				clickSocket.write(COMPOUND_HANDLER_ELEMENT, "updatemode", "0".toCharArray());
			}
		} catch (Exception e) {
			connection.createError("exception while configuring compound handler", e);
		}
		logger.log(ILogger.DEBUG, "configured click compound handler of " + connection + " with " + record + ", " + changesOnly + ", " + chLocalUpdateDelay, null);
	}
	
	@Override
	protected Runnable createListenRunnable() {
		return new Listen();
	}

	private class Listen implements Runnable {
		public void run() {
			createReceivingStartedEvent();
			if (valueAdapter == null) {
				valueAdapter = connection.getAdapter(IValueAdapter.class);
			}
			
			currentHandlerName = null;
			
			char[] compundHandlerRawValue = null;
			try {
				pullTime = clock.currentTimeNanos();
				compundHandlerRawValue = connection.getBlockingSocket().read(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_READ_HANDLER);
			} catch (Exception e) {
				connection.createError("exception while reading compound handler", e);
			}
		
			String rawXml = new String(compundHandlerRawValue);
			XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)EmfXmlUtil.deserializeXml(rawXml);
			traverse(xml.getMixed());
			createReceivingStoppedEvent();
		}
	}
	
	private void traverse(FeatureMap featureMap) {
		for(FeatureMap.Entry fme: featureMap) {
			boolean dive = false;
			if (!fme.getEStructuralFeature().getName().equals("text")) {
				dive = handleFME(fme);
			}
			Object fmeValue = fme.getValue();
			if (fmeValue instanceof AnyType && dive) {
				AnyType value = (AnyType)fmeValue;
				traverse(value.getAny());				
			}
		}
	}
	
	public Map<String, String> getAttributeMap(FeatureMap featureMap) {
		Map<String, String> result = new HashMap<String, String>();
		for (FeatureMap.Entry fme: featureMap) {
			String name = fme.getEStructuralFeature().getName();
			Object value = fme.getValue();
			if (value instanceof String) {
				result.put(name, (String)value);
			}
		}
		return result;
	}
	
	public boolean handleFME(FeatureMap.Entry fme) {
		String elementName = fme.getEStructuralFeature().getName();
		Object value = fme.getValue();
		Map<String, String> attributes = null;
		if (value instanceof AnyType) {
			attributes = getAttributeMap(((AnyType)fme.getValue()).getAnyAttribute());
		}
		if (elementName.equals("compoundhandler")) {
			long drift = pullTime - time(attributes.get("time"));
			if (driftMavrValues.size() == driftMavrSize) {
				driftMavrSum -= driftMavrValues.poll();				
			}
			driftMavrSum += drift;
			driftMavrValues.add(drift);
			inRecordMode = "1".equals(attributes.get("recordmode"));
		} else if (elementName.equals("compoundhandlerinfo")) {
			return false;
		} else if (elementName.equals("handler")) {
			currentHandlerName = attributes.get("name").replace(".", "/");
			if (inRecordMode) {
				if (attributes.get("overflow").equals("true")) {
					logger.log(ILogger.WARNING, "Overflow in compound handler detected"
							+ ", handler: "	+ currentHandlerName 
							+ ", node: " + connection, null);	
				}
			} else {
				createHandlerEvents(value, attributes);
			}
		} else if (elementName.equals("record")) {
			if (!attributes.get("update").equals("false")) {
				createHandlerEvents(value, attributes);
			}						
		}
		return true;
	}

	private void createHandlerEvents(Object value, Map<String, String> attributes) {		
		// set the timestamp
		long drift = driftMavrSum / driftMavrValues.size();
		long timestamp = 0;
		if (inRecordMode) {
			timestamp = time(attributes.get("time")) + drift;
		} else {
			timestamp = pullTime;
		}
		
		// set the value
		String recordStr = null;
		for (FeatureMap.Entry valueFme: ((AnyType)value).getMixed()) {
			if (valueFme.getEStructuralFeature().getName().equals("cDATA")) {
				recordStr = (String)valueFme.getValue();
			}
		}
		Handler newHandler;
		if (recordStr != null) {
			newHandler = valueAdapter.create(currentHandlerName, timestamp, recordStr);
		} else {
			newHandler = valueAdapter.create(currentHandlerName, timestamp, "");
		}
		
		createHandlerReceivedEvent(newHandler);
	}

	private long time(String timestampStr) {
		String[] timestampItems = timestampStr.split("\\.");
		long timestamp = new Long(timestampItems[0])*1000000000 + new Integer(timestampItems[1]);
		return timestamp;
	}
	
	
	
	@Override
	protected void configureRemoteNode(Collection<Handler> configuredHandler) {
		if (configuredHandler.isEmpty()) {
			deConfigureRemoteNode();
			return;
		} 
		
		StringBuffer configurationString = new StringBuffer();		
		loop: for(Handler handler: configuredHandler) {
			String handlerName = handler.getQualifiedName();
			String[] splitQualifiedName = HandlerUtil.getSplitQualifiedName(handlerName);
			String plainHandlerName = splitQualifiedName[1];
			String elementName = splitQualifiedName[0];
			if (commonHandler.contains(plainHandlerName)) {
				continue loop;
			}
			if (handlerName.equals("com/read")) {
				continue loop;
			}
			configurationString.append(elementName + "." + plainHandlerName);
			configurationString.append(" ");
		}
		
		try {
			configureCompoundHandler(records, chLocalUpdateDelay);
			connection.getBlockingSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			connection.getBlockingSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_INSERT_HANDLER, configurationString.toString().trim().toCharArray());
			logger.log(ILogger.DEBUG, "Setting compound handler of " + connection + " with " + configurationString.toString(), null);
		} catch (Exception e) {
			connection.createError("exception while (re)setting the compound handler", e);
		}
		super.configureRemoteNode(configuredHandler);
	}	
	
	private void deConfigureRemoteNode() {
		try {
			connection.getBlockingSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			logger.log(ILogger.DEBUG, "Reseting compound handler of " + connection, null);
		} catch (Exception e) {
			connection.createError("exception while emptying compound handler", e);
		}
	}
}
