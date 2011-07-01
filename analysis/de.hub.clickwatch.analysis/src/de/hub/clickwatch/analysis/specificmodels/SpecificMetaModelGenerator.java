package de.hub.clickwatch.analysis.specificmodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;


public class SpecificMetaModelGenerator {
	
	public static final String[] ommitedHandlerNames = new String[] { "name", "handlers", "watch" };
	
	private interface ITypeDescription {
		public boolean isOfType(String sample);
		public EClassifier getEType();
		public ITypeDescription[] getChildren();
		public EClassifier maxType(EClassifier one, EClassifier two);
	}
	
	private static class TypeDescriptionImpl implements ITypeDescription {
		final Pattern typePattern;
		final EClassifier type;
		final ITypeDescription[] children;
		
		public TypeDescriptionImpl(String typePattern, EClassifier type,
				ITypeDescription[] children) {
			super();
			this.typePattern = Pattern.compile(typePattern, Pattern.DOTALL);
			this.type = type;
			this.children = children;
		}

		@Override
		public boolean isOfType(String sample) {
			return typePattern.matcher(sample).matches();
		}

		@Override
		public EClassifier getEType() {
			return type;
		}

		@Override
		public ITypeDescription[] getChildren() {
			return children;
		}

		@Override
		public EClassifier maxType(EClassifier one, EClassifier two) {
			if (one == type) {
				return isChild(two) ? one : null;
			} else if (two == type) {
				return isChild(one) ? two : null;
			} else {
				EClassifier result = null;
				for (ITypeDescription child: children) {
					result = child.maxType(one, two);
					if (result != null) {
						return result;
					}
				}
				return null;
			}
		}		
		
		private boolean isChild(EClassifier type) {
			if (type == this.type) {
				return true;
			} else {
				boolean result = false;
				for(ITypeDescription child: children) {
					result |= ((TypeDescriptionImpl)child).isChild(type);
				}
				return result;
			}
		}
	}
	
	private EPackage pkg = null;
	
	private void initialize() {
		if (pkg == null) {
			this.pkg = EcoreFactory.eINSTANCE.createEPackage();
			pkg.setName("SpecificMetaModel");
		}
	}
	
	private EClass abstractElementClass() {
		EClass abstractElementClass = newClass(ClickWatchModelPackage.eINSTANCE.getElement());
		((EReference)abstractElementClass.getEStructuralFeature(ClickWatchModelPackage.eINSTANCE.getElement_Children().getName())).setContainment(false);
		((EReference)abstractElementClass.getEStructuralFeature(ClickWatchModelPackage.eINSTANCE.getElement_Handlers().getName())).setContainment(false);
		return abstractElementClass;
	}
	
	private EClass abstractHandlerClass() {
		EClass abstractHandlerClass = newClass(ClickWatchModelPackage.eINSTANCE.getHandler());
		abstractHandlerClass.getEStructuralFeatures().remove(abstractHandlerClass.getEStructuralFeature(ClickWatchModelPackage.eINSTANCE.getHandler_Any().getName()));
		abstractHandlerClass.getEStructuralFeatures().remove(abstractHandlerClass.getEStructuralFeature(ClickWatchModelPackage.eINSTANCE.getHandler_Mixed().getName()));
		return abstractHandlerClass;
	}
	
	private EClass newClass(String name) {
		initialize();
		EClass existing = (EClass)pkg.getEClassifier(name);
		if (existing == null) {
			EClass newClass = EcoreFactory.eINSTANCE.createEClass();
			newClass.setName(name);
			pkg.getEClassifiers().add(newClass);
			Preconditions.checkState(newClass.getEPackage() == pkg);
			return newClass;
		} else {
			return existing;
		}
	}
	
	private EClass newClass(EClass clazz) {
		initialize();
		EClass result = (EClass)pkg.getEClassifier(clazz.getName());
		if (result != null) {
			return result;
		} else {
			result = newClass(clazz.getName());
			for (EStructuralFeature feature: clazz.getEStructuralFeatures()) {
				feature = EcoreUtil.copy(feature);
				result.getEStructuralFeatures().add(feature);
				if (ClickWatchModelPackage.eINSTANCE.getEClassifiers().contains(feature.getEType())) {
					if (feature.getEType() instanceof EClass) {
						feature.setEType(newClass((EClass)feature.getEType()));
					} else {
						feature.setEType(EcoreUtil.copy(feature.getEType()));
						pkg.getEClassifiers().add(feature.getEType());
					}
				}
			}
			return result;
		}
	}
	
	private static final ITypeDescription types = 
		new TypeDescriptionImpl("^.*$", EcorePackage.eINSTANCE.getEString(), new ITypeDescription[] {
			new TypeDescriptionImpl("^\\w\\w(-\\w\\w){6}$", EcorePackage.eINSTANCE.getEString(), new ITypeDescription[]{}),
			new TypeDescriptionImpl("^(-)?\\d+$", EcorePackage.eINSTANCE.getEBigInteger(), new ITypeDescription[] {
				new TypeDescriptionImpl("^(-)?\\d+$", EcorePackage.eINSTANCE.getEInt(), new ITypeDescription[] {}) {
					@Override
					public boolean isOfType(String sample) {
						try {
							return super.isOfType(sample) && new Integer(sample) < Integer.MAX_VALUE;
						} catch (Exception e) {
							return false;
						}
					}
				},
				new TypeDescriptionImpl("^(-)?\\d*\\.\\d*$", EcorePackage.eINSTANCE.getEBigDecimal(), new ITypeDescription[] {})
			})
		});
	
	private EClassifier typeForSample(String sample) {
		EClassifier result = typeForSample(types, sample.trim());
		Preconditions.checkArgument(result != null, "could not determined type of " + sample + ", this should be impossible");
		return result;
	}
	
	private EClassifier typeForSample(ITypeDescription type, String sample) {
		if (type.isOfType(sample)) {
			EClassifier result = null;
			for (ITypeDescription childType: type.getChildren()) {
				result = typeForSample(childType, sample);
				if (result != null) {
					return result;
				}
			}
			return type.getEType();
		}
		return null;
	}

	private void addFeature(EClass clazz, FeatureMap.Entry entry, String featureName, Object context) {
		EStructuralFeature feature = clazz.getEStructuralFeature(featureName);
		Object value = entry.getValue();
		Collection<String> contextFeatures = featureContexts.get(context);
		if (contextFeatures == null) {
			contextFeatures = new HashSet<String>();
			featureContexts.put(context, contextFeatures);
		}
		if (feature == null) {
			if (value instanceof EObject) {
				EReference ref = EcoreFactory.eINSTANCE.createEReference();
				ref.setContainment(true);
				ref.setEType(getClass((EObject)value, featureName));
				feature = ref;
			} else if (value instanceof String) {
				feature = EcoreFactory.eINSTANCE.createEAttribute();
				feature.setEType(typeForSample((String)value));
			} else {
				Preconditions.checkState(false);
			}
			feature.setName(featureName);
			clazz.getEStructuralFeatures().add(feature);
			if (feature instanceof EReference) {
				addContainerRef(clazz, feature.getName());
			}
			contextFeatures.add(featureName);
		} else {
			if (value instanceof EObject) {
				if (feature.getEType() != getClass((EObject)value, featureName)) {
					// TODO
					Preconditions.checkState(false, "non EOBject, non String values are not supported");
				}
			} else if (value instanceof String) {
				EClassifier newType = typeForSample((String)value);
				EClassifier maxType = maxType(feature.getEType(), newType);
				if (maxType == null) {
					// TODO
					Preconditions.checkState(false, "non compatible types detected -> should not be really possible");
				}
				feature.setEType(maxType);
			} else {
				Preconditions.checkState(false);
			}
			if (contextFeatures.contains(featureName)) {
				if (!feature.isMany()) {
					feature.setUpperBound(-1);
				}
			} else {
				contextFeatures.add(featureName);
			}
		}
	} 
	
	private void addContainerRef(EClass clazz, String featureName) {
		EReference containmentFeature = (EReference)clazz.getEStructuralFeature(featureName);
		EClass containedClass = (EClass)containmentFeature.getEType();
		EReference containerFeature = EcoreFactory.eINSTANCE.createEReference();
		containerFeature.setName("eContainer_" + clazz.getName());
		containerFeature.setEType(clazz);
		containedClass.getEStructuralFeatures().add(containerFeature);
		containerFeature.setEOpposite(containmentFeature);
		containmentFeature.setEOpposite(containerFeature);
	}
	
	private void addNetwork(Network network) {
		newClass(ClickWatchModelPackage.eINSTANCE.getNetwork());
		for (Network subNetwork: network.getSubnetworks()) {
			addNetwork(subNetwork);
		}
		for (Node node: network.getNodes()) {
			addNode(node);
		}
	}
	
	private void addNode(Node node) {
		EClass nodeClass = newClass(ClickWatchModelPackage.eINSTANCE.getNode());
		((EReference)nodeClass.getEStructuralFeature(ClickWatchModelPackage.eINSTANCE.getNode_Elements().getName())).setContainment(false);
		for (Element element: node.getElements()) {
			addElement(nodeClass, element);
		}
	}
	
	private void addElement(EClass clazz, Element element) {
		String name = element.getName();
		EClass elementClass = null;
		if (clazz.getEStructuralFeature(name) != null) {
			elementClass = (EClass)clazz.getEStructuralFeature(name).getEType();
		} else {
			elementClass = newClass(name);
			if (!elementClass.getEAllSuperTypes().contains(abstractElementClass())) {
				elementClass.getESuperTypes().add(abstractElementClass());
			}	
			EReference feature = EcoreFactory.eINSTANCE.createEReference();
			feature.setName(name);
			feature.setEType(elementClass);
			feature.setContainment(true);
			clazz.getEStructuralFeatures().add(feature);
			addContainerRef(clazz, feature.getName());
		}
		for (Element child: element.getChildren()) {
			addElement(elementClass, child);
		}
		for (Handler handler: element.getHandlers()) {
			addHandler(elementClass, handler);
		}
	}
	
	private void addHandler(EClass clazz, Handler handler) {
		String name = handler.getName();
		if (Arrays.asList(ommitedHandlerNames).contains(name)) {
			return;
		}
		EClass handlerClass = null;
		if (clazz.getEStructuralFeature(name) != null) {
			handlerClass = (EClass)clazz.getEStructuralFeature(name).getEType();			
		} else {
			handlerClass = newClass(name);
			if (!handlerClass.getEAllSuperTypes().contains(abstractHandlerClass())) {
				handlerClass.getESuperTypes().add(abstractHandlerClass());
			}
			EReference feature = EcoreFactory.eINSTANCE.createEReference();
			feature.setName(name);
			feature.setContainment(true);
			feature.setEType(handlerClass);
			clazz.getEStructuralFeatures().add(feature);
			addContainerRef(clazz, feature.getName());
		}
		Preconditions.checkState(handlerClass != null && handlerClass.eContainer() == pkg);
		List<FeatureMap.Entry> entries = new ArrayList<FeatureMap.Entry>();
		entries.addAll(handler.getMixed());
		entries.addAll(handler.getAny());
		for (FeatureMap.Entry entry: entries) {				
			if (entry.getEStructuralFeature() == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
				addFeature(handlerClass, entry, "value", handler);
			} else {
				addFeature(handlerClass, entry, entry.getEStructuralFeature().getName(), handler);
			}
		}
	}
	
	private EClassifier maxType(EClassifier one, EClassifier two) {
		return  types.maxType(one, two);
	}
	
	private Map<Object, Collection<String>> featureContexts = new HashMap<Object, Collection<String>>();

	private EClass getClass(EObject value, String name) {
		if (value instanceof AnyType) {
			EClass result = newClass(name);
			Collection<FeatureMap.Entry> entries = new HashSet<FeatureMap.Entry>();
			for(FeatureMap.Entry entry: ((AnyType)value).getMixed()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					addFeature(result, entry, entry.getEStructuralFeature().getName(), value);
				}
			}
			for(FeatureMap.Entry entry: ((AnyType)value).getAny()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					addFeature(result, entry, entry.getEStructuralFeature().getName(), value);
				}
			}
			for(FeatureMap.Entry entry: ((AnyType)value).getAnyAttribute()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					addFeature(result, entry, entry.getEStructuralFeature().getName(), value);
				}
			}
			return result;
		} else {
			return newClass(value.eClass());
		}
	}	
	
	public EPackage generateMetaModel(EObject model) {
		initialize();
		if (model instanceof Network) {
			addNetwork((Network)model);
		} else if (model instanceof Node) {
			addNode((Node)model);
		} else {
			Preconditions.checkArgument(false);
		}
		return pkg;
	}
}
