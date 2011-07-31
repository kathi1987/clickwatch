package de.hub.clickwatch.connection.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class CompoundHandlerAdapter extends PullHandlerAdapter {

	private static final int driftMavrSize = 20;
	@Inject private XmlModelRepository xmlModelRepository;
	@Inject private ILogger logger;
	@Inject @Named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS) private boolean records;
	@Inject @Named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY) private boolean changesOnly;
	@Inject @Named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME) private int sampletime;
	
	private IValueAdapter valueAdapter = null;
	
	private static final String COMPOUND_HANDLER_ELEMENT = "com";
	private static final String COMPOUND_HANDLER_READ_HANDLER = "read";
	private static final String COMPOUND_HANDLER_RESET_HANDLER = "reset";
	private static final String COMPOUND_HANDLER_INSERT_HANDLER = "insert";
	
	private List<Handler> handlers = null;
	private String currentHandlerName = null;
	
	private long pullTime = 0;
	private long driftMavrSum = 0;
	private ArrayBlockingQueue<Long> driftMavrValues = new ArrayBlockingQueue<Long>(driftMavrSize);
	private boolean inRecordMode = false;
	
	public void configureCompoundHandler(boolean record, int sampletime) {
		try {
			if (record) {
				clickSocket().write(COMPOUND_HANDLER_ELEMENT, "recordmode", "1".toCharArray());
				if (changesOnly) {
					clickSocket().write(COMPOUND_HANDLER_ELEMENT, "updatemode", "2".toCharArray());
				} else {
					clickSocket().write(COMPOUND_HANDLER_ELEMENT, "updatemode", "0".toCharArray());
				}
				clickSocket().write(COMPOUND_HANDLER_ELEMENT, "sampletime", new Integer(sampletime).toString().toCharArray());
			} else {
				clickSocket().write(COMPOUND_HANDLER_ELEMENT, "recordmode", "0".toCharArray());
				clickSocket().write(COMPOUND_HANDLER_ELEMENT, "updatemode", "0".toCharArray());
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public Collection<Handler> pullHandler() {
		if (valueAdapter == null) {
			valueAdapter = connection.getAdapter(IValueAdapter.class);
		}
		
		currentHandlerName = null;
		handlers = new ArrayList<Handler>();
		
		char[] compundHandlerRawValue = null;
		try {
			pullTime = System.nanoTime();
			compundHandlerRawValue = clickSocket().read(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_READ_HANDLER);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	
		String rawXml = new String(compundHandlerRawValue);
		XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)xmlModelRepository.deserializeXml(rawXml);
		traverse(xml.getMixed());
				
		return handlers;
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
				createAndAddHandler(value, attributes);
			}
		} else if (elementName.equals("record")) {
			if (!attributes.get("update").equals("false")) {
				createAndAddHandler(value, attributes);
			}						
		}
		return true;
	}

	private void createAndAddHandler(Object value, Map<String, String> attributes) {		
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
		handlers.add(newHandler);
	}

	private long time(String timestampStr) {
		String[] timestampItems = timestampStr.split("\\.");
		long timestamp = new Long(timestampItems[0])*1000000000 + new Integer(timestampItems[1]);
		return timestamp;
	}
	
	@Override
	public void configure(Collection<Handler> handlerConfig) {		
		StringBuffer configurationString = new StringBuffer();
		loop: for(Handler handler: handlerConfig) {
			String handlerName = handler.getQualifiedName();
			String plainHandlerName = HandlerUtil.getSplitQualifiedName(handlerName)[1];
			if (commonHandler.contains(plainHandlerName)) {
				continue loop;
			}
			if (handlerName.equals("com.read")) {
				continue loop;
			}
			configurationString.append(handlerName);
			configurationString.append(" ");
		}
		
		resetCompoundHandler(configurationString.toString());
	}	
	
	private void resetCompoundHandler(String configurationString) {
		try {
			configureCompoundHandler(records, sampletime);
			clickSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			clickSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_INSERT_HANDLER, configurationString.trim().toCharArray());
			logger.log(ILogger.DEBUG, "Setting compound handler of " + connection + " with " + configurationString, null);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public void deconfigure() {
		try {
			clickSocket().write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			logger.log(ILogger.DEBUG, "Reseting compound handler of " + connection, null);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

}
