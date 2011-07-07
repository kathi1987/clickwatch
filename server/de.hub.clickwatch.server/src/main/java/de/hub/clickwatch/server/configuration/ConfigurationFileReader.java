package de.hub.clickwatch.server.configuration;

import java.io.File;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

import de.hub.clickwatch.xml.configuration.ConfigurationPackage;
import de.hub.clickwatch.xml.configuration.util.ConfigurationResourceFactoryImpl;



/**
 * 
 * @author Michael Frey
 */
public class ConfigurationFileReader {
	/** Access to the OSGi log service */
//	private LogService mLogService = null;
	/** Resource set for holding resources */
	private ResourceSet mResourceSet;
	/** The configuration file which will be read */
	private File mConfigurationFile;
	
	public ConfigurationFileReader(final String pFileName) {
		// Create a resource set to hold the resources.
		mResourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		mResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new ConfigurationResourceFactoryImpl());
		
		// Register the package to ensure it is available during loading.
		mResourceSet.getPackageRegistry().put
			(ConfigurationPackage.eNS_URI, 
			 ConfigurationPackage.eINSTANCE);	
		
		// mLogService = ServerPluginActivator.getInstance().getLogService();
		
		mConfigurationFile = new File(pFileName);
	}
	

	public File getConfigurationFile() {
		return mConfigurationFile;
	}

	public void setConfigurationFile(final File pConfigurationFile) {
		this.mConfigurationFile = pConfigurationFile;
	}
	
	public Resource readConfigurationFile(){
		// TODO: if this really works
		assert this.mConfigurationFile != null;	
		
		final URI uri = URI.createFileURI(this.mConfigurationFile.getAbsolutePath());

		try {
			// Demand load resource for this file.
			Resource resource = mResourceSet.getResource(uri, true);
			//mLogService.log(LogService.LOG_DEBUG, "Loaded " + this.mConfigurationFile.getAbsolutePath());

			// Validate the contents of the loaded resource.
			for (EObject eObject : resource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					printDiagnostic(diagnostic, "");
				}
			}
			
			return resource;
		}
		catch (RuntimeException exception) {
			//mLogService.log(LogService.LOG_ERROR, "Problem loading " + uri);
			exception.printStackTrace();
		}
		
		return null;
	}
	
	private void printDiagnostic(final Diagnostic pDiagnostic, final String pIndent) {
		System.err.println(pIndent);
		System.err.println(pDiagnostic.getMessage());
		//mLogService.log(LogService.LOG_ERROR, pIndent);
		//mLogService.log(LogService.LOG_ERROR, pDiagnostic.getMessage());
		
		for (Diagnostic child : pDiagnostic.getChildren()) {
			printDiagnostic(child, pIndent + "  ");
		}
	}
}
