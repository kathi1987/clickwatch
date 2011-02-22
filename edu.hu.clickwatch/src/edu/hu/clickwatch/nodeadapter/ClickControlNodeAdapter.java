package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.inject.Inject;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;

/**
 * This implementation of {@link INodeAdapter} adapts a node model to a click
 * node. It translates remote click data into {@link ClickWatchModelPackage} and
 * vice versa. Each adapter instance represents a connections to a click node.
 * 
 * The click control API is accessed through a {@link IClickSocket}
 * implementation. The implementation can be bind via DI and {@link GuiceModule}
 * .
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeAdapter extends AbstractNodeAdapter {
	
	@Inject
	private MyDefaultXmlValueRepresentation defaultValueRepresentation;
	
	private static class MyDefaultXmlValueRepresentation extends DefaultXmlValueRepresentation {
		@Override
		public Object createModelValue(String plainRealValue) {
			return new ValueClass(plainRealValue, XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text());
		}		
	}

	@Override
	protected IExtendedValueRepresentation getExtendedValueRepresentation(Handler handler) {
		return defaultValueRepresentation;
	}
}