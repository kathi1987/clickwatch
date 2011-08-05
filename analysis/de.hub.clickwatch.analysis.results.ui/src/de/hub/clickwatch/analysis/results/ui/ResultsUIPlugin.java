/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.ui;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public final class ResultsUIPlugin extends Plugin {
	
	private static ResultsUIPlugin INSTANCE = null;
	
	private ResourceBundle properties = null;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static ResultsUIPlugin getInstance() {
		return INSTANCE;
	}

	public String getString(String key) {
		if (properties == null) {

			String resourceName = getBundle().getEntry("/").toString()
					+ "plugin.properties";
			try {
				InputStream inputStream = new URL(resourceName).openStream();
				properties = new PropertyResourceBundle(inputStream);
				inputStream.close();
			} catch (IOException ioException) {
				throw new MissingResourceException("Missing properties: "
						+ resourceName, getClass().getName(),
						"plugin.properties");
			}
		}
		return properties.getString(key);
	}
}
