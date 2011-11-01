/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.hub.clickwatch.model.BackboneType;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Node;


/**
 * This is the item provider adapter for a {@link de.hub.clickwatch.model.Node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NodeItemProvider(AdapterFactory adapterFactory) {
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

            addINetAddressPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addBackbonePropertyDescriptor(object);
            addActiveListenersPropertyDescriptor(object);
            addChangesPropertyDescriptor(object);
            addErrorsPropertyDescriptor(object);
            addConnectionPropertyDescriptor(object);
            addRetrievingPropertyDescriptor(object);
            addListeningPropertyDescriptor(object);
            addRecordingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the INet Address feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addINetAddressPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_iNetAddress_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_iNetAddress_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__INET_ADDRESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_port_feature", "_UI_Node_type"),
				 ClickWatchModelPackage.Literals.NODE__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				if (value instanceof String) {
					try {
						Integer integer = new Integer((String)value);						
						if (integer > 0 && integer <= 65556) {
							super.setPropertyValue(object, value);		
						}
					} catch (NumberFormatException e) {
						
					}
				}
			}			
		});
	}

	/**
     * This adds a property descriptor for the Connection feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addConnectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_connection_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_connection_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__CONNECTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Retrieving feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetrievingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_retrieving_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_retrieving_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__RETRIEVING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Listening feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListeningPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_listening_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_listening_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__LISTENING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Recording feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_recording_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_recording_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__RECORDING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Backbone feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addBackbonePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_backbone_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_backbone_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__BACKBONE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Active Listeners feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActiveListenersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_activeListeners_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_activeListeners_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__ACTIVE_LISTENERS,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Changes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_changes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_changes_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__CHANGES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Errors feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addErrorsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Node_errors_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Node_errors_feature", "_UI_Node_type"),
                 ClickWatchModelPackage.Literals.NODE__ERRORS,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(ClickWatchModelPackage.Literals.NODE__ELEMENTS);
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
	 * @generated NOT
	 */
	private static class NodeImage extends ComposedImage {
		private static final int NODE = 0;
		private static final int CONNECTED = 1;
		private static final int BACKBONE = 2;
		private static final int RECORD = 3;
		
		Map<Object, Integer> imageMap;

		public NodeImage(List<Object> images, Map<Object, Integer> imageMap) {
			super(images);
			this.imageMap = imageMap;
		}

		@Override
		public List<Point> getDrawPoints(Size size) {
			List<Point> result = new ArrayList<ComposedImage.Point>();
			for (Object image: images) {				
				Integer pos = imageMap.get(image);
				if (pos.equals(NODE)) {
					result.add(new Point());
				} else if (pos.equals(CONNECTED)) {
					result.add(new Point());
				} else if (pos.equals(BACKBONE)) {
					Point point = new Point();
					point.x = size.width - 7;
					point.y = size.height - 7;
					result.add(point);
				} else if (pos.equals(RECORD)) {
					Point point = new Point();
					point.x = 0;
					point.y = size.height - 7;
					result.add(point);
				}
			}
			return result;
		}
	}

	/**
	 * This returns Node.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Map<Object, Integer> imageMap = new HashMap<Object, Integer>();
		List<Object> images = new ArrayList<Object>();
		Node node = (Node)object;
		if (node.getBackbone() == BackboneType.WIRELESS) {
			imageMap.put(getResourceLocator().getImage("full/ovr16/wireless"), NodeImage.BACKBONE);
		}
		if (node.isListening() && !node.isRetrieving()) {
			imageMap.put(getResourceLocator().getImage("full/ovr16/connected"), NodeImage.CONNECTED);
		} else if (node.isRetrieving()) {
			imageMap.put(getResourceLocator().getImage("full/ovr16/retrieving"), NodeImage.CONNECTED);
		}
		if (node.isRecording()) {
			imageMap.put(getResourceLocator().getImage("full/ovr16/recording"), NodeImage.RECORD);
		} 
//		else if (node.isHasRecord()) {
//			imageMap.put(getResourceLocator().getImage("full/ovr16/hasrecord"), NodeImage.RECORD);
//		}
		images.add(getResourceLocator().getImage("full/obj16/Node"));
		images.addAll(imageMap.keySet());
		imageMap.put(getResourceLocator().getImage("full/obj16/Node"), NodeImage.NODE);
		
		return new NodeImage(images, imageMap);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Node node = (Node)object;
		String address = "[no address]";
		if (node.getINetAddress() != null) {
			address = node.getINetAddress();
		}
		if (node.getPort() != null) {
			address += ":" + node.getPort();
		}
		
		StringBuffer result = new StringBuffer(address + " (");
		if (node.isListening()) {
			result.append("connected");
		} else {
			result.append("not connected");
		}
//		if (node.isHasRecord()) {
//			result.append(", has record");
//		}
		if (node.isRecording()) {
			result.append(", is recording");
		}
		result.append(")");
		
		return result.toString();
	}

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Node.class)) {
            case ClickWatchModelPackage.NODE__INET_ADDRESS:
            case ClickWatchModelPackage.NODE__PORT:
            case ClickWatchModelPackage.NODE__BACKBONE:
            case ClickWatchModelPackage.NODE__ACTIVE_LISTENERS:
            case ClickWatchModelPackage.NODE__CHANGES:
            case ClickWatchModelPackage.NODE__ERRORS:
            case ClickWatchModelPackage.NODE__CONNECTION:
            case ClickWatchModelPackage.NODE__RETRIEVING:
            case ClickWatchModelPackage.NODE__LISTENING:
            case ClickWatchModelPackage.NODE__RECORDING:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ClickWatchModelPackage.NODE__ELEMENTS:
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
     * @generated
     */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.NODE__ELEMENTS,
                 ClickWatchModelFactory.eINSTANCE.createElement()));
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

}
