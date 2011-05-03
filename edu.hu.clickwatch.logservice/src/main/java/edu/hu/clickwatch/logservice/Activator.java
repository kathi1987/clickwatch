package edu.hu.clickwatch.logservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	/** */
	private BundleContext mContext;
	/** */
	private FileLogWriter mFileLogWriter = null;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext pBundleContext) throws Exception {
		this.mContext = pBundleContext;
		//
        ServiceTracker logReaderServiceTracker = new ServiceTracker(mContext, org.osgi.service.log.LogReaderService.class.getName(), null);
        //
        logReaderServiceTracker.open();
        //
        LogReaderService logReaderService = (LogReaderService) logReaderServiceTracker.getService();
        //
        if (logReaderService != null){
        	//
        	this.mFileLogWriter = new FileLogWriter("path/to/configuration/file");
        	//
        	logReaderService.addLogListener(this.mFileLogWriter);
        }
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		if(this.mFileLogWriter != null){
			this.mFileLogWriter.stop();
		}
		this.mContext = null;
	}

}
