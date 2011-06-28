package edu.hu.clickwatch.model;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class IsRecordedAdapter extends AdapterImpl {

	@Override
	public boolean equals(Object obj) {
		return this.getClass().equals(obj.getClass());
	}

	@Override
	public int hashCode() {
		return 0;
	}

}
