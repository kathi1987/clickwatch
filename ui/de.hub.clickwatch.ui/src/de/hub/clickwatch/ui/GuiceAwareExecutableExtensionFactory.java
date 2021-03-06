package de.hub.clickwatch.ui;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class GuiceAwareExecutableExtensionFactory implements IExecutableExtensionFactory, IExecutableExtension {
	
	public static final String GUICEKEY = "guicekey";
	protected String clazzName;
	protected IConfigurationElement config;

	@SuppressWarnings({ "unchecked" })
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
		throws CoreException {
		if (data instanceof String) {
			clazzName = (String) data;
		} else if (data instanceof Map<?, ?>) {
			clazzName = ((Map<String, String>)data).get(GUICEKEY);
		}
		if (clazzName == null) {
			throw new IllegalArgumentException("couldn't handle passed data : "+data);
		}
		this.config = config;
	}
	
	public Object create() throws CoreException {
		try {
			final Class<?> clazz = getBundle().loadClass(clazzName);
			final Injector injector = getInjector();
			final Object result = injector.getInstance(clazz);
			if (result instanceof IExecutableExtension)
                ((IExecutableExtension)result).setInitializationData(config, null, null);
            return result;
        } catch (Throwable e) {
            try {
                Thread.currentThread().getContextClassLoader().loadClass(clazzName);
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            throw new CoreException(new Status(IStatus.ERROR, getBundle().getSymbolicName(), e.getMessage(), e));
        }
	}
	
	protected Bundle getBundle() {
		return PluginActivator.getInstance().getBundle();
	}
	
	protected Injector getInjector() {
		return PluginActivator.getInstance().getInjector();
	}
}
