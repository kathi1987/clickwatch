package edu.hu.clickwatch.server;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

import edu.hu.clickwatch.server.management.ServerMBean;


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
		// Set instance
		mInstance = this;
		// Set bundle context
		mContext = bundleContext;
		
		// Track log service
        ServiceTracker serviceTracker = new ServiceTracker(mContext, org.osgi.service.log.LogService.class.getName(), null);
        // Open service tracker
        serviceTracker.open();
        // Get log service from service tracker
        mLogService = (LogService) serviceTracker.getService();
		// TODO: Fixme. Set configuration directory to the right directory / Setup server component, read configuration
		mServer = new Server("TODO 1");
		// Initialize server
		mServer.initialize();
		// Print status information
		mLogService.log(LogService.LOG_DEBUG, "Plugin: Server Plugin initialized");
		
		// Get service reference for mbean server
		ServiceReference serviceReference = mContext.getServiceReference(javax.management.MBeanServer.class.getName());
		// Get MBean server
		MBeanServer mbs = (javax.management.MBeanServer)mContext.getService(serviceReference);
		// Register MBean
		mbs.registerMBean(new ServerMBean(mServer), new ObjectName("edu.hu.clickwatch.server.management:Server"));

		// Close service tracker
        serviceTracker.close();
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
