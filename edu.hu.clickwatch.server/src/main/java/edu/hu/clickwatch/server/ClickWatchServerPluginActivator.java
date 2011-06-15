package edu.hu.clickwatch.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class ClickWatchServerPluginActivator implements BundleActivator {
	/** */
	private BundleContext mContext;
	/** */
	private LogService mLogService = null;
	/** */
	private static ClickWatchServerPluginActivator mInstance;
	/** */
	private Injector injector = null;

	public Injector getInjector() {
		return injector;
	}
	
	public BundleContext getContext() {
		return mContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		// Set instance
		mInstance = this;
		// Set bundle context
		mContext = bundleContext;
		// Initialize the module
		ClickWatchServerModule module = new ClickWatchServerModule();
		// Initialize the injector
		injector = Guice.createInjector(module);
		//
		
		
		// Track log service
        //ServiceTracker serviceTracker = new ServiceTracker(mContext, org.osgi.service.log.LogService.class.getName(), null);
        // Open service tracker
        //serviceTracker.open();
        // Get log service from service tracker
        //mLogService = (LogService) serviceTracker.getService();
		// TODO: Fixme. Set configuration directory to the right directory / Setup server component, read configuration
		//mServer = new ClickWatchServer("TODO 1");
		// Initialize server
		//mServer.readConfiguration();
		// Print status information
		//mLogService.log(LogService.LOG_DEBUG, "Plugin: Server Plugin initialized");		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		mContext = null;
	}

	public static ClickWatchServerPluginActivator getInstance(){
		return mInstance;
	}
}
