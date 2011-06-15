package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import com.google.common.base.Preconditions;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.ClickWatchModule;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;

/**
 * This implementation of {@link INodeAdapter} adapts a node model to a click
 * node. It translates remote click data into {@link ClickWatchModelPackage} and
 * vice versa. Each adapter instance represents a connections to a click node.
 * 
 * The click control API is accessed through a {@link IClickSocket}
 * implementation. The implementation can be bind via DI and {@link ClickWatchModule}
 * .
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeAdapter extends AbstractNodeAdapter {

	@Override
	protected void createAndSetModelValue(Handler handler, String string) {
		if (string == null) {
			return;
		}
		
		FeatureMap.Entry entry = FeatureMapUtil.createTextEntry(string);
		if (!handler.getMixed().isEmpty()) {
			handler.getMixed().set(0, entry);
		} else {
			handler.getMixed().add(entry);
		}
	}

	@Override
	protected String createPlainRealValue(Handler handler) {
		if (handler.getMixed().isEmpty()) {
			return null;
		} else {
			Object value = handler.getMixed().getValue(0);
			Preconditions.checkState(value instanceof String);
			return (String)value;
		}
	}
	
	
}