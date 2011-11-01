/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.FeatureMapEntryWrapperItemProvider;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;

/**
 * This is the item provider adapter for a {@link de.hub.clickwatch.model.Handler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HandlerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	
	/**
	 * @generated NOT
	 */
	@Override
	public Object getCreateChildImage(Object owner, Object feature,
			Object child, Collection<?> selection) {
		// TODO not only forbid images
		return null;
	}

	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HandlerItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addNamePropertyDescriptor(object);
            addCanReadPropertyDescriptor(object);
            addCanWritePropertyDescriptor(object);
            addChangedPropertyDescriptor(object);
            addValuePropertyDescriptor(object);
            addTimestampPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Handler_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Handler_name_feature", "_UI_Handler_type"),
                 ClickWatchModelPackage.Literals.HANDLER__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Can Read feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCanReadPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Handler_canRead_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Handler_canRead_feature", "_UI_Handler_type"),
                 ClickWatchModelPackage.Literals.HANDLER__CAN_READ,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Can Write feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCanWritePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Handler_canWrite_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Handler_canWrite_feature", "_UI_Handler_type"),
                 ClickWatchModelPackage.Literals.HANDLER__CAN_WRITE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Handler_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Handler_value_feature", "_UI_Handler_type"),
                 ClickWatchModelPackage.Literals.HANDLER__VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Handler_timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Handler_timestamp_feature", "_UI_Handler_type"),
				 ClickWatchModelPackage.Literals.HANDLER__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null) {
					@Override
					public IItemLabelProvider getLabelProvider(Object object) {
						return new TimeStampLabelProvider();
					}
		});
	}
	
	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ClickWatchModelPackage.Literals.HANDLER__MIXED);
			childrenFeatures.add(ClickWatchModelPackage.Literals.HANDLER__ANY);
		}
		return childrenFeatures;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

	/**
     * This adds a property descriptor for the Changed feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addChangedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Handler_changed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Handler_changed_feature", "_UI_Handler_type"),
                 ClickWatchModelPackage.Literals.HANDLER__CHANGED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This returns Handler.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Handler"));
    }

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Handler handler = (Handler)object;
		String result = handler.getName();
		return result;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Handler.class)) {
			case ClickWatchModelPackage.HANDLER__NAME:
			case ClickWatchModelPackage.HANDLER__CAN_READ:
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
			case ClickWatchModelPackage.HANDLER__CHANGED:
			case ClickWatchModelPackage.HANDLER__MIXED:
			case ClickWatchModelPackage.HANDLER__ANY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {

	}

	/**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceLocator getResourceLocator() {
        return ClickWatchModelEditPlugin.INSTANCE;
    }

	/**
	 * @generated NOT
	 */
	protected Object createWrapper(EObject object, EStructuralFeature feature,
			Object value, int index) {
		if (feature == ClickWatchModelPackage.eINSTANCE.getHandler_Any()) {
			return new FeatureMapEntryWrapperItemProvider(
					(FeatureMap.Entry) value, object, (EAttribute) feature,
					index, adapterFactory, getResourceLocator()) {
				@Override
				public String getText(Object object) {
					return ((FeatureMap.Entry) value).getEStructuralFeature().getName();
				}
			};
		} else {
			return super.createWrapper(object, feature, value, index);
		}
	}

//	@Override
//	public Collection<?> getChildren(Object object) {
//		IsRecordedAdapter isRecordedAdapter = new IsRecordedAdapter();
//		Collection<Object> children = new ArrayList<Object>();
//		for(Object child: super.getChildren(object)) {
//			boolean isRecorded = false;
//			Object value = ((FeatureMapEntryWrapperItemProvider)child).getValue();
//			if (value instanceof FeatureMap.Entry) {
//				Object fmeValue = ((FeatureMap.Entry)value).getValue();
//				if (fmeValue instanceof EObject) {
//					AdapterLoop: for(Object adapter: ((EObject)fmeValue).eAdapters()) {
//						if (adapter.equals(isRecordedAdapter)) {
//							isRecorded = true;
//							break AdapterLoop;
//						}
//					}
//				}
//			}
//				
//			if (!isRecorded) {
//				children.add(child);
//			}
//		}
//		return children;
//	}
}
