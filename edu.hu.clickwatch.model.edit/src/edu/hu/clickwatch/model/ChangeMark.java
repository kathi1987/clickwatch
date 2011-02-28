package edu.hu.clickwatch.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class ChangeMark extends AdapterImpl {
	

	
	private static class RemoveChangeMarks extends Thread {
		@Override
		public void run() {
			while (true) {
				changeMarksContainerInstance.update();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static ChangeMarksContainer changeMarksContainerInstance = new ChangeMarksContainer();
	
	private static class ChangeMarksContainer {
		private static Collection<ChangeMark> changeMarks = new HashSet<ChangeMark>();
		
		private synchronized void update() {
			Iterator<ChangeMark> it = changeMarks.iterator();
			while (it.hasNext()) {
				final ChangeMark mark = it.next();
				if (!mark.isActive()) {
					it.remove();
					Display display = PlatformUI.getWorkbench().getDisplay();
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							mark.notifyMarkedObject();	
						}
					});						
				}
			}
		}
		
		private synchronized void add(ChangeMark changeMark) {
			changeMarks.add(changeMark);
		}
	}
	
	private final EObject object;
	private final EStructuralFeature feature;
	private final Object value;
	
	private final long timeStamp;
	
	private static boolean isInitialized = false;
	
	private static void initialize() {
		if (!isInitialized) {
			new RemoveChangeMarks().start();
			isInitialized = true;
		}
	}

	private ChangeMark(EObject object, EStructuralFeature feature, Object value) {
		super();
		this.object = object;
		this.feature = feature;
		this.value = value;
		
		timeStamp = System.currentTimeMillis();
	}
	
	public static class ChangeMarkNotification extends ENotificationImpl {

		public ChangeMarkNotification(InternalEObject notifier, int eventType,
				EStructuralFeature feature, Object oldValue, Object newValue) {
			super(notifier, eventType, feature, oldValue, newValue);
		}
		
	}
	
	public synchronized void notifyMarkedObject() {
		if (object instanceof InternalEObject) {
			((InternalEObject)object).eNotify(new ChangeMarkNotification((InternalEObject)object, ENotificationImpl.SET, 
					feature, value, value));
		}
	}

	public boolean isDirectChange(EObject object) {
		return object == this.object;
	}
	
	public boolean isActive() {
		return System.currentTimeMillis() - timeStamp < 2000;
	}
	
	public EObject getObject() {
		return object;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public Object getValue() {
		return value;
	}

	public static void addChangeMark(EObject object, EStructuralFeature feature, Object value) {
		initialize();
		Iterator<Adapter> it = object.eAdapters().iterator();
		while (it.hasNext()) {
			if (it.next() instanceof ChangeMark) {
				it.remove();
			}
		}
		ChangeMark changeMark = new ChangeMark(object, feature, value);
		while (object != null) {
			object.eAdapters().add(changeMark);
			changeMarksContainerInstance.add(changeMark);
			changeMark.notifyMarkedObject();
			object = object.eContainer();
		}
	}

	public static ChangeMark getChangeMark(EObject object) {
		initialize();
		Iterator<Adapter> it = object.eAdapters().iterator();
		while (it.hasNext()) {
			Adapter next = it.next();
			if (next instanceof ChangeMark) {
				return (ChangeMark)next; 
			}
		}
		return null;
	}
}
