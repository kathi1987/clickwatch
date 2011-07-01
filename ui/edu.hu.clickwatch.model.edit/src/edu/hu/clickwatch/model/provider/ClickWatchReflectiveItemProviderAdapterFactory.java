package edu.hu.clickwatch.model.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.FeatureMapEntryWrapperItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

import edu.hu.clickwatch.model.IsRecordedAdapter;

/**
 * This is a customized {@link ReflectiveItemProviderAdapterFactory}. It serves
 * customized {@link ReflectiveItemProvider}s in order to customize the
 * presentation of reflective objects (dynamic {@link EObject}s and
 * {@link AnyType} xml objects). The goal is to create a coherent look for all
 * kinds of handler values.
 * 
 * @generated NOT
 * @author Markus Scheidgen
 */
public class ClickWatchReflectiveItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {
	private static final Object attributeImage = EMFEditPlugin.INSTANCE.getImage("full/obj16/GenericValue");
	private final ReflectiveItemProvider itemProviderInstance = new ClickWatchReflectiveItemProvider();
	
	private class ClickWatchReflectiveItemProvider extends ReflectiveItemProvider {
		public ClickWatchReflectiveItemProvider() {
			super(ClickWatchReflectiveItemProviderAdapterFactory.this);
		}
		
		class ClickWatchFeatureMapEntryWrapperItemProvider extends 
				FeatureMapEntryWrapperItemProvider implements IItemColorProvider {
			
			public ClickWatchFeatureMapEntryWrapperItemProvider(Entry entry,
					EObject owner, EAttribute attribute, int index,
					AdapterFactory adapterFactory,
					ResourceLocator resourceLocator) {
				super(entry, owner, attribute, index, adapterFactory, resourceLocator);
			}

			@Override
			public String getText(Object object) {
				if (((FeatureMap.Entry)value).getValue() instanceof AnyType) {
					return ((FeatureMap.Entry) value).getEStructuralFeature().getName();
				} else {
					return value.toString();
				}
			}

			@Override
			public Object getForeground(Object object) {
				Object result = null;
				if (object instanceof FeatureMapEntryWrapperItemProvider) {
					FeatureMap.Entry entry = (FeatureMap.Entry) 
							((FeatureMapEntryWrapperItemProvider)object).getValue();
					EObject owner = (EObject)
							((FeatureMapEntryWrapperItemProvider)object).getOwner();
					result = ClickWatchReflectiveItemProviderAdapterFactory.this.
							getForeground(owner, entry.getEStructuralFeature(), entry.getValue());
				}
				
				return result == null ? super.getForeground(object) : result;
			}

			@Override
			public Object getBackground(Object object) {
				Object result = null;
				if (object instanceof FeatureMapEntryWrapperItemProvider) {
					FeatureMap.Entry entry = (FeatureMap.Entry) 
							((FeatureMapEntryWrapperItemProvider)object).getValue();
					EObject owner = (EObject)
							((FeatureMapEntryWrapperItemProvider)object).getOwner();
					result = ClickWatchReflectiveItemProviderAdapterFactory.this.
							getBackground(owner, entry.getEStructuralFeature(), entry.getValue());
				}
				
				return result == null ? super.getForeground(object) : result;
			}
		
		}
		
		class AttributeWrapperItemProvider extends DelegatingWrapperItemProvider 
				implements IItemColorProvider {

			public AttributeWrapperItemProvider(Object value, Object owner,
					EStructuralFeature feature, int index,
					AdapterFactory adapterFactory) {
				super(value, owner, feature, index, adapterFactory);
			}

			@Override
			public String getText(Object object) {
				return feature.getName() + "='" + value + "'";
			}
			
			@Override
			public Object getImage(Object object) {
				return attributeImage;
			}
			
			@Override
			public Object getForeground(Object object) {
				Object result = 
						ClickWatchReflectiveItemProviderAdapterFactory.this.
						getForeground((EObject)owner, feature, value);
				return result == null ? super.getForeground(object) : result;
			}

			@Override
			public Object getBackground(Object object) {
				Object result = 
						ClickWatchReflectiveItemProviderAdapterFactory.this.
						getBackground((EObject)owner, feature, value);
				return result == null ? super.getBackground(object) : result;
			}
		}
		
		@Override
		public String getText(Object object) {
			if (object instanceof EObject) {
				String result = ((EObject)object).eClass().getName() ;
				if (result == null) {
					return super.getText(object);
				} else {
					return result;
				}
			} else {
				return super.getText(object);
			}
		}
		
		@Override
		public Object getImage(Object object) {
			if (object instanceof EObject) {
				for (Adapter adapter: ((EObject)object).eAdapters()) {
					if (adapter.equals(new IsRecordedAdapter())) {
						List<Object> images = new ArrayList<Object>();
						images.add(super.getImage(object));
						images.add(NewEditPlugin.INSTANCE.getImage("full/ovr16/recording"));
						return new ComposedImage(images);
					}
				}
			}
			return super.getImage(object);
		}

		@Override
		public Collection<?> getChildren(Object object) {
			Collection<Object> result = new ArrayList<Object>();
			for(Object child: super.getChildren(object)) {	
				boolean ommit = false;
				if (child instanceof FeatureMapEntryWrapperItemProvider) {
					Object value = ((FeatureMap.Entry)((FeatureMapEntryWrapperItemProvider)child).getValue()).getValue();
					if (value instanceof String && ((String)value).trim().equals("")) {
						ommit = true;
					}
				}
				if (!ommit) {
					result.add(child);
				}
			}
			
			// don't know what this code does, but it causes the double
			// appearance of all elements in the tree (at least when the tree
			// displays specific models
//			if (object instanceof EObject) {
//				EObject eObject = (EObject)object;
//				for (EStructuralFeature feature: eObject.eClass().getEAllAttributes()) {
//					if (feature.isMany()) {
//						List<?> children = (List<?>) eObject.eGet(feature);
//						int index = 0;
//						for (Object unwrappedChild : children) {
//							Object child = wrap(eObject, feature, unwrappedChild, index);
//							result.add(child);
//							index++;
//						}
//					} else {
//						Object child = eObject.eGet(feature);
//						if (child != null) {
//							child = wrap(eObject, feature, child, CommandParameter.NO_INDEX);
//							result.add(child);
//						}
//					}
//				}
//			}
			
			
			return result;
		}
		
		@Override
		protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
			if (FeatureMapUtil.isFeatureMap(feature)) {
				return new ClickWatchFeatureMapEntryWrapperItemProvider(
						(FeatureMap.Entry) value, object, (EAttribute) feature,
						index, adapterFactory, getResourceLocator());
			} else if (feature instanceof EAttribute) {
				return new AttributeWrapperItemProvider(
						value, object, (EAttribute) feature, index, adapterFactory);
			} else {
				return super.createWrapper(object, feature, value, index);
			}
		}
	}
	
	public Object getForeground(EObject object, EStructuralFeature feature, Object value) {
		return null;
	}

	public Object getBackground(EObject object, EStructuralFeature feature, Object value) {
		return null;
	}

	@Override
	public Adapter createAdapter(Notifier target) {
		return itemProviderInstance;
	}
}
