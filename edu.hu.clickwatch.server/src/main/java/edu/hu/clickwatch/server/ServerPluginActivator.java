package edu.hu.clickwatch.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;


public class ServerPluginActivator implements BundleActivator {

	private BundleContext mContext;

	private LogService mLogService = null;
	
	private static ServerPluginActivator mInstance;
	
	public BundleContext getContext() {
		return mContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		//
		mInstance = this;
		//
		mContext = bundleContext;
		//
        ServiceTracker logServiceTracker = new ServiceTracker(mContext, org.osgi.service.log.LogService.class.getName(), null);
        //
        logServiceTracker.open();
        //
        mLogService = (LogService) logServiceTracker.getService();

		// Setup server component, read configuration
		Server server = new Server("TODO 1", "TODO 2");
		// Initialize server
		server.initialize();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		mContext = null;
	}

	public LogService getLogService(){
		return this.mLogService;
	}	
	
	public static ServerPluginActivator getInstance(){
		return mInstance;
	}
}
