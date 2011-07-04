package de.hub.clickwatch.server.management;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import de.hub.clickwatch.server.ClickWatchServer;



public class ClickWatchServerMBean implements IClickWatchServerMBean {
	/** A instance of the ClickWatchServer class */
	private ClickWatchServer mServer = null;	
	/** The JMX server which holds mbeans for management purposes */
	private MBeanServer mMBeanServer;
	
	public ClickWatchServerMBean(ClickWatchServer pServer){
		mServer = pServer;
	}
	
	@Override
	public void shutdown() {
		mServer.shutdown();
	}

	@Override
	public void setConfigurationFile(String pFileLocation) {
		synchronized (mServer) {
			this.mServer.setConfigurationFile(pFileLocation);
		}
	}

	@Override
	public String getConfigurationFile() {
		String result= "";
		
		synchronized (mServer) {
			result = this.mServer.getConfigurationFile();
		}
		
		return result;
	}

	@Override
	public String[] getConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startRecording() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopRecording() {
		// TODO Auto-generated method stub
	}
	
	public void bindMBeanServer(final MBeanServer pMBeanServer){
		// Set the MBean server
		this.mMBeanServer = pMBeanServer;
		// Register the ClickWatchServer class as MBean
		try {
			this.mMBeanServer.registerMBean(this, new ObjectName("edu.hu.clickwatch.server.management:Server"));
		} catch (InstanceAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MBeanRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotCompliantMBeanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unbindMBeanServer(final MBeanServer pMBeanServer){
		// Unregister the MBean server
		try {
			this.mMBeanServer.unregisterMBean(new ObjectName("edu.hu.clickwatch.server.management:Server"));
		} catch (MBeanRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
