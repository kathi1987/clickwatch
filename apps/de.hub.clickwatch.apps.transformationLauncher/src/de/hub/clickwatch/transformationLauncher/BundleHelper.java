/**
 * 
 */
package de.hub.clickwatch.transformationLauncher;

import java.util.Dictionary;

import org.eclipse.core.resources.ResourcesPlugin;
import org.osgi.framework.Bundle;

import de.hub.clickwatch.analysis.ui.PluginActivator;

/**
 * This class offers helper method to handle bundles on the fly
 * 
 * @author Lars George
 *
 */
public class BundleHelper {
	/**
	 * Tries to install a bundle in the workspace with the given name. If the bundle is already installed, the reference to this one is returned.
	 * 
	 * @param bundleIdentifier the name of the bundle that should be installed
	 * @return the installed bundle or null if the installation process failed
	 */
	public static Bundle installBundleFromWorkspace(String bundleIdentifier) 
	{		
		Bundle retBundle = null;
		
		try
		{
			// add a slash to the beginning of the identifier if needed
			if( !(bundleIdentifier.startsWith("/") || bundleIdentifier.startsWith("\\")) )
			{
				bundleIdentifier = "/" + bundleIdentifier;				
			}		
			// try to install the bundle
			String bundleLocation = "reference:" + ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toURL().toString();
			
			retBundle = PluginActivator.getInstance().getBundle().getBundleContext().getBundle(bundleLocation + bundleIdentifier);

			// if its already installed, refresh it (maybe the code changed)
			if(retBundle != null)	
			{
				retBundle.update();
			}
			else
				retBundle = PluginActivator.getInstance().getBundle().getBundleContext().installBundle(bundleLocation + bundleIdentifier);									
						
			Dictionary<String, String> dict =  retBundle.getHeaders();
			
			// try to install required bundles, so the dependencies are in the osgi container
			String resources = dict.get("Require-Bundle");
			String[] resourcesArray = resources.split(",");
			for(String res  : resourcesArray)
			{
				String[] parts = res.split(";");
				
				try
				{
					PluginActivator.getInstance().getBundle().getBundleContext().installBundle(bundleLocation + "/" + parts[0]);																									
					
					/*
					IProject project = candidateManifest.getProject();
					IJavaProject javaProject = JavaCore.create(project);
					try {
					    IPath output = javaProject.getOutputLocation();
					    BaseData bundleData = (BaseData)((AbstractBundle)bundle).getBundleData();
					    bundleData.setClassPathString(output.removeFirstSegments(1).toString());
					} catch (JavaModelException e) {
					    Activator.log(e, false);
					}*/
					 
				}
				catch(Exception e)
				{
					// dont do anything, it normal that most parts can not be loaded
				}
			}						
			
			// install all bundles in the workspace (maybe needed depency)
			
			/* 
			IPluginModelBase[] candidates = PluginRegistry.getWorkspaceModels();
			for(IPluginModelBase candidate : candidates)
			{
				IResource candidateManifest = candidate.getUnderlyingResource();

				String candidateLocationReference = "reference:" + candidateManifest.getProject().getLocationURI().toURL().toExternalForm();
				
				Bundle installedBundle = PluginActivator.getInstance().getBundle().getBundleContext().installBundle(candidateLocationReference);
				installedBundle.update();
							
				 
				// add the bin folder as classpath to the project 
				IProject project = candidateManifest.getProject();
				IJavaProject javaProject = JavaCore.create(project);
				try {
				    IPath output = javaProject.getOutputLocation();
				    BaseData bundleData = (BaseData)((AbstractBundle)installedBundle).getBundleData();
				    //bundleData.setClassPathString(output.removeFirstSegments(1).toString());				    				    
				    bundleData.setClassPathString("/bin");
				} catch (JavaModelException e) {
				    System.out.println(e);
				}
				
			}*/
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return retBundle;
}
}
