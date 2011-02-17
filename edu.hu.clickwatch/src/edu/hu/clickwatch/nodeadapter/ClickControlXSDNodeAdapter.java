package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;

import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;

public class ClickControlXSDNodeAdapter extends AbstractNodeAdapter {
	
	public static final String XSD_HANDLER_NAME = "schema";

	private IExtendedValueRepresentation valueRep = new IExtendedValueRepresentation() {
		
		@Override
		public void set(Handler handler, Object value) {
			// TODO Auto-generated method stub			
		}
		
		@Override
		public boolean isNotificationChangingValue(Notification notification) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Object get(Handler handler) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean equalsModelValueRealityValue(Object modelValue,
				Object realValue) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public String createPlainRealValue(Object modelValue) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object createModelValue(String plainRealValue) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private String readXSD(Element element) {
		return null; // TODO
	}

	@Override
	protected IExtendedValueRepresentation getExtendedValueRepresentation(Handler handler) {
		return valueRep;
	}
	
}
