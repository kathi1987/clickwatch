package edu.hu.clickwatch.server;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class RecordedModelReader {
	public final static long UPDATE_INTERVAL = 1000;

	private Resource resource = null;

	private long start = -1;
	
	public RecordedModelReader() {
		if (!EPackage.Registry.INSTANCE.containsKey(ClickWatchModelPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ClickWatchModelPackage.eINSTANCE.getNsURI(), ClickWatchModelPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("clickwatchmodel", new XMIResourceFactoryImpl());
	}
	
	public static class PlayerModule extends AbstractModule {
		@Override
		protected void configure() {
			String record = 
						"src/" + RecordedModelReader.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel";
			
			RecordedModelReader player = new RecordedModelReader();
			player.initialize(URI.createFileURI(record));
			bind(RecordedModelReader.class).toInstance(player);
		}		
	};


	public void initialize(URI recordUri) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource = rs.getResource(recordUri, true);

		Preconditions.checkState(resource.getContents().get(0) instanceof Network);
	}

	public Node getNode(String host, String port, long update) {
		Preconditions.checkState(resource != null);
		Network currentNetwork = (Network)resource.getContents().get((int)(update % resource.getContents().size()));
		
		Preconditions.checkState(currentNetwork != null);
		
		for (Node node : currentNetwork.getNodes()) {
			if (node.getINetAdress().equals(host) && node.getPort().equals(port)) {
				return node;
			}
		}
		return null;
	}

	public long getCurrentUpdate() {
		if (start == -1) {
			start = System.currentTimeMillis();
		}
		return (System.currentTimeMillis() - start) / UPDATE_INTERVAL;
	}
}
