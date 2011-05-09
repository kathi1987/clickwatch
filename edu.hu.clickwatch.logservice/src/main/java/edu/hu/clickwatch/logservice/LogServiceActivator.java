package edu.hu.clickwatch.logservice;

import java.util.Iterator;
import java.util.LinkedList;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

public class LogServiceActivator implements BundleActivator {
	/** */
	private BundleContext mContext;
	/** */
	private FileLogWriter mFileLogWriter = new FileLogWriter();
	/** */
    private LinkedList<LogReaderService> mReaders = new LinkedList<LogReaderService>();

    /**
     *  We use a ServiceListener to dynamically keep track of all the LogReaderService service being
     *  registered or unregistered
     */
    private ServiceListener mServiceListener = new ServiceListener() {
        public void serviceChanged(ServiceEvent pEvent){
            BundleContext bc = pEvent.getServiceReference().getBundle().getBundleContext();
            LogReaderService lpgReaderService = (LogReaderService)bc.getService(pEvent.getServiceReference());
            if (lpgReaderService != null)
            {
                if (pEvent.getType() == ServiceEvent.REGISTERED)
                {
                    mReaders.add(lpgReaderService);
                    lpgReaderService.addLogListener(mFileLogWriter);
                } else if (pEvent.getType() == ServiceEvent.UNREGISTERING)
                {
                    lpgReaderService.removeLogListener(mFileLogWriter);
                    mReaders.remove(lpgReaderService);
                }
            }
        }
    };

	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext pBundleContext) throws Exception {
		this.mContext = pBundleContext;
		// TODO: Fixme. This should be a customizable parameter  
		this.mFileLogWriter.open("/tmp");
        // Get a list of all the registered LogReaderService, and add the console listener
        ServiceTracker logReaderTracker = new ServiceTracker(this.mContext, org.osgi.service.log.LogReaderService.class.getName(), null);
        // Open tracker
        logReaderTracker.open();
        // 
        Object[] readers = logReaderTracker.getServices();
        
        if(readers != null){
        	for (int i=0; i<readers.length; i++){
                LogReaderService logServiceReader = (LogReaderService)readers[i];
                mReaders.add(logServiceReader);
                logServiceReader.addLogListener(mFileLogWriter);
            }
        }

        logReaderTracker.close();
       
        // Add filter so that only events related to LogReaderService are received
        String filter = "(objectclass=" + LogReaderService.class.getName() + ")";
        try {
        	// Add the service listener
        	mContext.addServiceListener(mServiceListener, filter);
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }

	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		// Define iterator for registered services
		Iterator<LogReaderService> iterator = mReaders.iterator();
		// Unregister the log service reader from registered services
        while(iterator.hasNext()){
            LogReaderService logServiceReader = iterator.next();
            logServiceReader.removeLogListener(mFileLogWriter);
            iterator.remove();
        }
        // Close the log files
        this.mFileLogWriter.close();

		this.mContext = null;
	}

}
