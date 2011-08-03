package de.hub.clickwatch.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Preconditions;

@Deprecated
public class SpecificModelGenerator {
	
	private EFactory factory;
	private EPackage pkg;
	
	private final boolean copyNonSpecificReferences;
	
	public SpecificModelGenerator(boolean copyNonSpecificReferences) {
		super();
		this.copyNonSpecificReferences = copyNonSpecificReferences;
	}
	
	public SpecificModelGenerator() {
		this(true);
	}

	public interface ICopier {
		public EObject copyClass(EObject source);
		public Object copyFeatureValue(EObject source, EObject target, EStructuralFeature feature, int i);
	}
	
	private class PlainCopier implements ICopier {
		@Override
		public EObject copyClass(EObject source) {
			return factory.create((EClass)pkg.getEClassifier(source.eClass().getName()));
		}
		
		private boolean plainCopyFeature(EStructuralFeature feature) {
			if (!copyNonSpecificReferences) {
				if ((feature == ClickWatchModelPackage.eINSTANCE.getElement_Handlers()) ||
						(feature == ClickWatchModelPackage.eINSTANCE.getElement_Children()) ||
						(feature == ClickWatchModelPackage.eINSTANCE.getNode_Elements())) {
					return false;
				}
			}
			return true;
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public Object copyFeatureValue(EObject source, EObject target,
				EStructuralFeature feature, int i) {
			EStructuralFeature targetFeature = target.eClass().getEStructuralFeature(feature.getName());
			Object sourceValue = source.eGet(feature);
			
			if (i == -1) {			
				if (sourceValue != null && targetFeature != null) { // TODO
					Object targetValue = copyValue(sourceValue, targetFeature);
					if (plainCopyFeature(feature)) {
						target.eSet(targetFeature, targetValue);	
					}
					return targetValue;
				}
			} else {
				if (targetFeature != null) { // TODO
					Object targetValue = copyValue(((EList)sourceValue).get(i), targetFeature);
					if (plainCopyFeature(feature)) {
						if (!targetFeature.isMany()) {
							target.eSet(targetFeature, targetValue);
						} else {
							((EList)target.eGet(targetFeature)).add(targetValue);
						}
					}
					return targetValue;
				}
			}
			
			return null;
		}
		
		private Object castValue(EClassifier type, Object value) {
			if (type instanceof EDataType) {
				if (type == EcorePackage.eINSTANCE.getEJavaObject()) {
					return value;
				} else if (type instanceof EEnum) {
					return value;
				} else if (type.eContainer() == XMLTypePackage.eINSTANCE) {
					return value;
				} else {
					return EcoreFactory.eINSTANCE.createFromString((EDataType)type, value.toString());
				}
			} else {
				return value;
			}
		}
		
		protected final Object copyValue(Object source, EStructuralFeature targetFeature) {
			if (source instanceof Network) {
				return copyNetwork((Network)source);
			} else if (source instanceof Node) {
				return copyNode((Node)source);
			} else if (source instanceof Handler) {
				return copyHandler((Handler)source, targetFeature);
			} else if (source instanceof Element) {
				return copyElement((Element)source);
			} else if (source instanceof AnyType) {
				return copyAny((AnyType)source, targetFeature);
			} else if (source instanceof EObject) {
				return new PlainCopier().copy((EObject)source);
			} else {
				if (targetFeature.getEType() == EcorePackage.eINSTANCE.getEString()) {
					return source.toString(); 
				} else if (source instanceof String) {			
					String sourceString = ((String)source).trim();
					EDataType eType = (EDataType)targetFeature.getEType();
					if (pkg.getEClassifiers().contains(eType)) {
						return factory.createFromString(eType, sourceString);
					} else if (XMLTypePackage.eINSTANCE.getEClassifiers().contains(eType)) {
						return XMLTypeFactory.eINSTANCE.createFromString(eType, sourceString);
					} else if (EcorePackage.eINSTANCE.getEClassifiers().contains(eType)) {
						return EcoreFactory.eINSTANCE.createFromString(eType, sourceString);
					} else {
						Preconditions.checkState(false, "data type from unsupported meta-package used");
						return null;
					}
				} else {
					EDataType eType = (EDataType)targetFeature.getEType();
					if (pkg.getEClassifiers().contains(eType)) {
						return factory.createFromString(eType, source.toString());
					} else {
						return castValue(eType, source);
					}
				}
			}
		}
		
		@SuppressWarnings("rawtypes")
		public EObject copy(EObject source) {
			EObject target = copyClass(source);
			FeatureLoop: for (EStructuralFeature feature: source.eClass().getEAllStructuralFeatures()) {
				if (feature.isDerived()) {
					continue FeatureLoop;
				}
				Object sourceFeatureValue = source.eGet(feature);
				if (sourceFeatureValue instanceof EList) {
					EList<?> values = (EList)sourceFeatureValue;
					for (int i = 0; i < values.size(); i++) {
						copyFeatureValue(source, target, feature, i);
					}
				} else {
					copyFeatureValue(source, target, feature, -1);
				}
			}
			return target;
		}
	}
	
	private class AnyCopier extends PlainCopier {
		
		final EStructuralFeature feature;
	
		public AnyCopier(EStructuralFeature feature) {
			super();
			this.feature = feature;
		}

		@Override
		public EObject copyClass(EObject source) {
			return factory.create((EClass)pkg.getEClassifier(feature.getName()));
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void copyFeatureMapValue(EObject source, EObject target,
				EStructuralFeature feature, Object value) {

			String featureName = feature.getName();
			EStructuralFeature targetFeature = target.eClass().getEStructuralFeature(featureName);
			if (targetFeature.isMany()) {
				((EList)target.eGet(targetFeature)).add(copyValue(value, targetFeature));
			} else {
				target.eSet(targetFeature, copyValue(value, targetFeature));
			}	
		}

		@Override
		public EObject copy(EObject source) {
			EObject target = copyClass(source);
			AnyType anySource = (AnyType)source;
			Collection<FeatureMap.Entry> entries = new HashSet<FeatureMap.Entry>();
			for (FeatureMap.Entry entry: anySource.getAnyAttribute()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					copyFeatureMapValue(source, target, entry.getEStructuralFeature(), entry.getValue());
				}
			}
			for (FeatureMap.Entry entry: anySource.getMixed()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					copyFeatureMapValue(source, target, entry.getEStructuralFeature(), entry.getValue());
				}
			}
			for (FeatureMap.Entry entry: anySource.getAny()) {
				if (!entries.contains(entry)) {
					entries.add(entry);
					copyFeatureMapValue(source, target, entry.getEStructuralFeature(), entry.getValue());
				}
			}
			return target;
		}
		
	}
	
	private class HandlerCopier extends PlainCopier {
		
		@Override
		public EObject copyClass(EObject source) {
			String name = ((Handler)source).getName();
			if (Arrays.asList(SpecificMetaModelGenerator.ommitedHandlerNames).contains(name)) {
				return factory.create((EClass)pkg.getEClassifier(ClickWatchModelPackage.eINSTANCE.getHandler().getName()));
			} else {
				return factory.create((EClass)pkg.getEClassifier(name));
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public Object copyFeatureValue(EObject source, EObject target,
				EStructuralFeature feature, int i) {
			if (feature == ClickWatchModelPackage.eINSTANCE.getHandler_Any() || feature == ClickWatchModelPackage.eINSTANCE.getHandler_Mixed()) {
				if (Arrays.asList(SpecificMetaModelGenerator.ommitedHandlerNames).contains(((Handler)source).getName())) {
					// TODO ommited handler values should at least be copied into the abstract Handler classes
					return null;
				}
				FeatureMap.Entry sourceEntry = ((List<FeatureMap.Entry>)source.eGet(feature)).get(i);
				EStructuralFeature sourceFeature = sourceEntry.getEStructuralFeature();
				String featureName = sourceFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text() ? "value" : sourceFeature.getName();
				EStructuralFeature targetFeature = target.eClass().getEStructuralFeature(featureName);
				Object featureValueCopy = copyValue(sourceEntry.getValue(), targetFeature);
				target.eSet(targetFeature, featureValueCopy);
				return featureValueCopy;
			} else {
				return super.copyFeatureValue(source, target, feature, i);
			}
		}
		
	}
	
	private class NodeAndElementCopier extends PlainCopier {
		@Override
		public EObject copyClass(EObject source) {
			if (source instanceof Element) {
				 return factory.create((EClass)pkg.getEClassifier(((Element)source).getName()));
			} else {
				return super.copyClass(source);
			}
		}

		@SuppressWarnings("rawtypes")
		@Override
		public Object copyFeatureValue(EObject source, EObject target,
				EStructuralFeature feature, int i) {
			if (feature == ClickWatchModelPackage.eINSTANCE.getElement_Handlers()) {
				Handler sourceHandler = (Handler)((EList)source.eGet(feature)).get(i);
				if (Arrays.asList(SpecificMetaModelGenerator.ommitedHandlerNames).contains(sourceHandler.getName())) {
					return null;
				}
			}
			Object featureValueCopy = super.copyFeatureValue(source, target, feature, i);
			if (feature == ClickWatchModelPackage.eINSTANCE.getNode_Elements() || feature == ClickWatchModelPackage.eINSTANCE.getElement_Children()) {
				Element element = (Element)((EList)source.eGet(feature)).get(i);
				target.eSet(target.eClass().getEStructuralFeature(element.getName()), featureValueCopy);
			}
			if (feature == ClickWatchModelPackage.eINSTANCE.getElement_Handlers()) {
				Handler sourceHandler = (Handler)((EList)source.eGet(feature)).get(i);
				String sourceHandlerName = sourceHandler.getName();
				if (!Arrays.asList(SpecificMetaModelGenerator.ommitedHandlerNames).contains(sourceHandlerName)) {
					target.eSet(target.eClass().getEStructuralFeature(sourceHandlerName), featureValueCopy);
				}
			}
			
			return featureValueCopy;
		}
	}
	
	public EObject copyNetwork(Network source) {
		return new PlainCopier().copy(source);
	}
	
	public EObject copyNode(Node source) {
		return new NodeAndElementCopier().copy(source);
	}
	
	public EObject copyElement(Element source) {
		return new NodeAndElementCopier().copy(source);
	}
	
	public EObject copyAny(AnyType source, EStructuralFeature feature) {
		return new AnyCopier(feature).copy(source);
	}
	
	public EObject copyHandler(Handler source, EStructuralFeature feature) {
		return new HandlerCopier().copy(source);
	}

	public EObject generateModel(EPackage specificMetaModel, EObject genericModel) {
		this.pkg = specificMetaModel;
		this.factory = specificMetaModel.getEFactoryInstance();
		if (genericModel instanceof Network) {
			return copyNetwork((Network)genericModel);
		} else if (genericModel instanceof Node) {
			return copyNode((Node)genericModel);
		} else {
			Preconditions.checkArgument(false, "not supported");
			return null;
		}
	}
}
