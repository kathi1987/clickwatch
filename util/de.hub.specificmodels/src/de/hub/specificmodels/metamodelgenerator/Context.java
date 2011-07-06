package de.hub.specificmodels.metamodelgenerator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;


public class Context {
	
	private final Map<Object, EClass> sourceReferenceMap = new HashMap<Object, EClass>();
	private final Map<Object, EClass> nameMap = new HashMap<Object, EClass>();
	private final Map<Object, EClass> objectMap = new HashMap<Object, EClass>();

	private final IClassCreatorFactory factory;
	private final ISourceReferenceProvider sourceReferenceProvider;

	public Context(IClassCreatorFactory factory, ISourceReferenceProvider sourceReferenceProvider) {
		super();
		this.factory = factory;
		this.sourceReferenceProvider = sourceReferenceProvider;
	}
	
	@SuppressWarnings("unchecked")
	public Object continueOnObject(EObject object) {			
		IClassCreator<EObject> creator = (IClassCreator<EObject>)factory.createClassCreator(this, object);
		return continueOn(creator, object);
	}
	
	private Object continueOn(IClassCreator<EObject> creator, EObject object) {
		EClass result = objectMap.get(object);
		if (result == null) {
			result = creator.create(object);
			objectMap.put(object, result);
			creator.addFeatures(result, object);
		}
		return result;
	}
	
	public EClass getTarget(Object sourceReference) {
		return sourceReferenceMap.get(sourceReference);
	}
	
	public void addTarget(Object key, EClass sourceReference) {
		sourceReferenceMap.put(key, sourceReference);
	}
	
	public EClass getClass(Object name) {
		return nameMap.get(name);
	}
	
	public void addClass(Object name, EClass target) {
		nameMap.put(name, target);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Class<T> theClass) {
		if (theClass == ISourceReferenceProvider.class) {
			return (T)sourceReferenceProvider;
		} else {
			return null;
		}
	}

	public EPackage generatePackage() {
		EPackage result = EcoreFactory.eINSTANCE.createEPackage();
		for (EClass aClass: sourceReferenceMap.values()) {
			result.getEClassifiers().add((EClassifier)aClass);
		}
		return result;
	}
}
