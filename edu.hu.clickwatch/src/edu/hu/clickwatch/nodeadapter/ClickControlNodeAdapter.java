package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Preconditions;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.XmlUtil;
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

	private IExtendedValueRepresentation defaultValueRepresentation = new IExtendedValueRepresentation() {
		
		@Override
		public void set(Handler handler, Object value) {
			handler.setValue((EObject)value);
		}
		
		@Override
		public boolean isNotificationChangingValue(Notification notification) {
			if (notification.getNotifier() instanceof Handler) {
				return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Value();
			} else {
				return true;
			}
		}
		
		@Override
		public Object get(Handler handler) {
			return handler.getValue();
		}
		
		@Override
		public boolean equalsModelValueRealityValue(Object modelValue,
				Object realValue) {
			return createPlainRealValue(modelValue).equals(createPlainRealValue(realValue));
		}
		
		@Override
		public String createPlainRealValue(Object modelValue) {
			Preconditions.checkArgument(modelValue instanceof AnyType);
			AnyType value = (AnyType)modelValue;
			return (String)value.getMixed().getValue(0);
		}
		
		@Override
		public Object createModelValue(String plainRealValue) {
			return XmlUtil.createXMLText(plainRealValue);
		}
	};

	@Override
	protected IExtendedValueRepresentation getExtendedValueRepresentation(Handler handler) {
		return defaultValueRepresentation;
	}
}