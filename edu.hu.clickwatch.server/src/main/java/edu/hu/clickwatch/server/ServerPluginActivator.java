package edu.hu.clickwatch.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;


public class ServerPluginActivator implements BundleActivator {
	/** */
	private BundleContext mContext;
	/** */
	private LogService mLogService = null;
	/** */
	private Server mServer = null;
	/** */
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
		// TODO: Fixme. Set configuration directory to the right directory / Setup server component, read configuration
		mServer = new Server("TODO 1");
		// Initialize server
		mServer.initialize();
		// Print status information
        mLogService.log(LogService.LOG_DEBUG, "Plugin: Server Plugin initialized");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		if(mServer != null){
			mServer.shutdown();
		}
		mContext = null;
	}

	public LogService getLogService(){
		return this.mLogService;
	}	
	
	public static ServerPluginActivator getInstance(){
		return mInstance;
	}
}
