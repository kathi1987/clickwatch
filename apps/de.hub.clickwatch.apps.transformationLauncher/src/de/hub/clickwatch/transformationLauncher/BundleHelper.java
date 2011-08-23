/**
 * 
 */
package de.hub.clickwatch.transformationLauncher;

import java.util.Dictionary;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;

import de.hub.clickwatch.ui.PluginActivator;

/**
 * This class offers helper method to handle bundles on the fly
 * 
 * @author Lars George
 * 
 */
public class BundleHelper {
	/**
	 * Tries to install a bundle in the workspace with the given name. If the
	 * bundle is already installed, the reference to this one is returned.
	 * 
	 * @param bundleIdentifier
	 *            the name of the bundle that should be installed
	 * @return the installed bundle or null if the installation process failed
	 */
	public static Bundle installBundleFromWorkspace(String bundleIdentifier) {
		Bundle retBundle = null;

		try {
			// add a slash to the beginning of the identifier if needed
			if (!(bundleIdentifier.startsWith("/") || bundleIdentifier
					.startsWith("\\"))) {
				bundleIdentifier = "/" + bundleIdentifier;
			}

			// String projName = bundleIdentifier;
			// IJavaProject proj = getJavaModel().getJavaProject(projName);
			// for(IClasspathEntry entry : proj.getRawClasspath())
			// System.out.println(entry.toString());

			// proj.setOutputLocation(new Path(bundleIdentifier + "/bin"),
			// null);
			// System.out.println(proj.getOutputLocation());

			// try to install the bundle
			String bundleLocation = "reference:"
					+ ResourcesPlugin.getWorkspace().getRoot().getLocationURI()
							.toURL().toString();

			retBundle = PluginActivator.getInstance().getBundle()
					.getBundleContext()
					.getBundle(bundleLocation + bundleIdentifier);

			// if its already installed, refresh it (maybe the code changed)
			if (retBundle != null) {
				retBundle.update();
			} else
				retBundle = PluginActivator.getInstance().getBundle()
						.getBundleContext()
						.installBundle(bundleLocation + bundleIdentifier);

			Dictionary<String, String> dict = retBundle.getHeaders();

			String classPath = dict.get("Bundle-ClassPath");
			boolean hasBinFolder = false;
			if (classPath != null) {
				String[] classPathArray = classPath.split(",");

				for (String cp : classPathArray) {
					if (cp.trim().equals("bin"))
						hasBinFolder = true;
				}
			} else {
				// no classpath entry in the manifest
				Status s = new Status(IStatus.ERROR, "not_used", "Your plugin project does not have a ClassPath entry in its Manifest.mf", null); 
				StatusManager.getManager().handle(s, StatusManager.SHOW);
				//return null;
			}
			// no bin folder in the manifest of this project?
			if (!hasBinFolder) {
				Status s = new Status(IStatus.ERROR, "not_used", "Your plugin project does not contain the bin folder in the ClassPath entry of the Manifest.mf", null); 
				StatusManager.getManager().handle(s, StatusManager.SHOW);			
			}

			// try to install required bundles, so the dependencies are in the
			// osgi container
			String resources = dict.get("Require-Bundle");
			String[] resourcesArray = resources.split(",");

			for (String res : resourcesArray) {
				String[] parts = res.split(";");

				try {
					PluginActivator.getInstance().getBundle()
							.getBundleContext()
							.installBundle(bundleLocation + "/" + parts[0]);

					/*
					 * IProject project = candidateManifest.getProject();
					 * IJavaProject javaProject = JavaCore.create(project); try
					 * { IPath output = javaProject.getOutputLocation();
					 * BaseData bundleData =
					 * (BaseData)((AbstractBundle)bundle).getBundleData();
					 * bundleData
					 * .setClassPathString(output.removeFirstSegments(1
					 * ).toString()); } catch (JavaModelException e) {
					 * Activator.log(e, false); }
					 */

				} catch (Exception e) {
					// dont do anything, it normal that most parts can not be
					// loaded					
					//Status s = new Status(IStatus.ERROR, "not_used", 0, e.toString(), null); 
					//StatusManager.getManager().handle(s, StatusManager.SHOW);
					
				}
			}

			// install all bundles in the workspace (maybe needed depency)

			/*
			 * IPluginModelBase[] candidates =
			 * PluginRegistry.getWorkspaceModels(); for(IPluginModelBase
			 * candidate : candidates) { IResource candidateManifest =
			 * candidate.getUnderlyingResource();
			 * 
			 * String candidateLocationReference = "reference:" +
			 * candidateManifest
			 * .getProject().getLocationURI().toURL().toExternalForm();
			 * 
			 * Bundle installedBundle =
			 * PluginActivator.getInstance().getBundle()
			 * .getBundleContext().installBundle(candidateLocationReference);
			 * installedBundle.update();
			 * 
			 * 
			 * // add the bin folder as classpath to the project IProject
			 * project = candidateManifest.getProject(); IJavaProject
			 * javaProject = JavaCore.create(project); try { IPath output =
			 * javaProject.getOutputLocation(); BaseData bundleData =
			 * (BaseData)((AbstractBundle)installedBundle).getBundleData();
			 * //bundleData
			 * .setClassPathString(output.removeFirstSegments(1).toString());
			 * bundleData.setClassPathString("/bin"); } catch
			 * (JavaModelException e) { System.out.println(e); }
			 * 
			 * }
			 */

		} catch (Exception e) {
			Status s = new Status(IStatus.ERROR, "not_used", e.toString(), null); 
			StatusManager.getManager().handle(s, StatusManager.SHOW);
			//System.out.println(e);
		}
		return retBundle;
	}

	/**
	 * Convenience method to get access to the java model.
	 */
	private static IJavaModel getJavaModel() {
		return JavaCore.create(getWorkspaceRoot());
	}

	/**
	 * Convenience method to get the workspace root.
	 */
	private static IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}
