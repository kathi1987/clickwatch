package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter.IExtendedValueRepresentation;

public class ConstantValueRepresentation implements IExtendedValueRepresentation {
	
	private final EObject constant;
	
	protected ConstantValueRepresentation(EObject constant) {
		this.constant = constant;
	}

	@Override
	public boolean isNotificationChangingValue(Notification notification) {
		return false;
	}

	@Override
	public boolean equalsModelValueRealityValue(Object modelValue,
			Object realValue) {
		return true;
	}

	@Override
	public Object get(Handler handler) {
		return constant;
	}

	@Override
	public void set(Handler handler, Object value) {
		// emtpy
	}

	@Override
	public Object createModelValue(String plainRealValue) {
		return constant;
	}

	@Override
	public String createPlainRealValue(Object modelValue) {
		throw new IllegalStateException();
	}

}
