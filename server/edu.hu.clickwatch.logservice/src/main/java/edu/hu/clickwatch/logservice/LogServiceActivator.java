package edu.hu.clickwatch.logservice;

import java.util.LinkedList;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogReaderService;

public class LogServiceActivator implements BundleActivator {
	/** */
	private BundleContext mContext;
	/** */
	private FileLogWriter mFileLogWriter = new FileLogWriter();
	/** */
    private LinkedList<LogReaderService> mReaders = new LinkedList<LogReaderService>();

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext pBundleContext) throws Exception {
		this.mContext = pBundleContext;
		// TODO: Fixme. This should be a customizable parameter  
		this.mFileLogWriter.open("/tmp");
		/*
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
        }*/

	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {

        // Close the log files
        this.mFileLogWriter.close();

		this.mContext = null;
	}

}
