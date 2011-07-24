package de.hub.clickwatch.connection.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.inject.Inject;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class CompoundHandlerAdapter extends HandlerAdapter {
	
	@Inject private XmlModelRepository xmlModelRepository;
	@Inject private ILogger logger;
	
	private IValueAdapter valueAdapter = null;
	
	private static final String COMPOUND_HANDLER_ELEMENT = "com";
	private static final String COMPOUND_HANDLER_READ_HANDLER = "read";
	private static final String COMPOUND_HANDLER_RESET_HANDLER = "reset";
	private static final String COMPOUND_HANDLER_INSERT_HANDLER = "insert";
	
	private List<Handler> handlers = null;
	private String currentHandlerName = null;

	@Override
	public Collection<Handler> pullHandler() {
		if (valueAdapter == null) {
			valueAdapter = connection.getAdapter(IValueAdapter.class);
		}
		
		currentHandlerName = null;
		handlers = new ArrayList<Handler>();
		
		char[] compundHandlerRawValue = null;
		try {
			compundHandlerRawValue = clickSocket.read(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_READ_HANDLER);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	
		XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)xmlModelRepository.deserializeXml(new String(compundHandlerRawValue));
		traverse(xml.getMixed());
				
		return handlers;
	}
	
	private void traverse(FeatureMap featureMap) {
		for(FeatureMap.Entry fme: featureMap) {
			if (!fme.getEStructuralFeature().getName().equals("text")) {
				handleFME(fme);
			}
			Object fmeValue = fme.getValue();
			if (fmeValue instanceof AnyType) {
				AnyType value = (AnyType)fmeValue;
				traverse(value.getMixed());				
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
	
	public void handleFME(FeatureMap.Entry fme) {
		String elementName = fme.getEStructuralFeature().getName();
		Object value = fme.getValue();
		Map<String, String> attributes = null;
		if (value instanceof AnyType) {
			attributes = getAttributeMap(((AnyType)fme.getValue()).getAnyAttribute());
		}
		if (elementName.equals("compoundhandler")) {
			
		} else if (elementName.equals("handler")) {
			currentHandlerName = attributes.get("name").replace(".", "/");
			if (attributes.get("overflow").equals("true")) {
				// TODO handler overflow
				logger.log(ILogger.WARNING, "Overflow in compound handler detected"
						+ ", handler: "	+ currentHandlerName 
						+ ", node: " + connection, null);

			}
		} else if (elementName.equals("record")) {
			if (attributes.get("update").equals("false")) {
				return;
			}
			
			Handler newHandler = ClickWatchModelFactory.eINSTANCE.createHandler();
			// set name of handler
			newHandler.setName(currentHandlerName);
			
			// set the timestamp
			newHandler.setTimestamp(time(attributes.get("time")));
			
			// set the value
			String recordStr = null;
			for (FeatureMap.Entry valueFme: ((AnyType)value).getMixed()) {
				if (valueFme.getEStructuralFeature().getName().equals("cDATA")) {
					recordStr = (String)valueFme.getValue();
				}
			}
			if (recordStr != null) {
				valueAdapter.setModelValue(newHandler, recordStr);	
			}
			handlers.add(newHandler);
		} else {
			
		}
	}

	private long time(String timestampStr) {
		String[] timestampItems = timestampStr.split("\\.");
		long timestamp = new Long(timestampItems[0])*1000000 + new Integer(timestampItems[1]);
		return timestamp;
	}
	
	private static Collection<String> commonHandler = new HashSet<String>(Arrays.asList(new String[] { 
			"debug", "handlers", "ports", "config", "name", "version", "class" 
	}));

	@Override
	public void configure(Collection<Handler> handlerConfig) {		
		StringBuffer configurationString = new StringBuffer();
		loop: for(Handler handler: handlerConfig) {
			String handlerName = handler.getQualifiedName();
			int slash = handlerName.lastIndexOf("/");
			String plainHandlerName = handlerName.substring(slash + 1);
			handlerName = handlerName.substring(0, slash) + "." + plainHandlerName;
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
			clickSocket.write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			clickSocket.write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_INSERT_HANDLER, configurationString.trim().toCharArray());
			logger.log(ILogger.DEBUG, "Setting compound handler of " + connection + " with " + configurationString, null);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public void deconfigure() {
		try {
			clickSocket.write(COMPOUND_HANDLER_ELEMENT, COMPOUND_HANDLER_RESET_HANDLER, "".toCharArray());
			logger.log(ILogger.DEBUG, "Reseting compound handler of " + connection, null);
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

}
