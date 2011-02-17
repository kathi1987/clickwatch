package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;

import edu.hu.clickwatch.model.Handler;

public interface IValueRepresentation {

	public boolean isNotificationChangingValue(Notification notification);
	
	public boolean equalsModelValueRealityValue(Object modelValue, Object realValue);
	
	public Object get(Handler handler);
	
	public void set(Handler handler, Object value);
}
