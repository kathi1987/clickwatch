/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;

/**
 * This is the item provider adapter for a {@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentDescrItemProvider
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
	public ExperimentDescrItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addRecordPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addHBaseRowMapPropertyDescriptor(object);
			addHbaseRootDirPropertyDescriptor(object);
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
				 getString("_UI_ExperimentDescr_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_name_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_description_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_start_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__START,
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
	 * This adds a property descriptor for the Record feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_record_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_record_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__RECORD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_duration_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_end_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_end_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__END,
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
	 * This adds a property descriptor for the HBase Row Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHBaseRowMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_hBaseRowMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_hBaseRowMap_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__HBASE_ROW_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hbase Root Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHbaseRootDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExperimentDescr_hbaseRootDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExperimentDescr_hbaseRootDir_feature", "_UI_ExperimentDescr_type"),
				 CWDataBasePackage.Literals.EXPERIMENT_DESCR__HBASE_ROOT_DIR,
				 true,
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
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK);
			childrenFeatures.add(CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK_TIME_COPY);
			childrenFeatures.add(CWDataBasePackage.Literals.EXPERIMENT_DESCR__STATISTICS);
//			childrenFeatures.add(CWDataBasePackage.Literals.EXPERIMENT_DESCR__META_DATA);
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
	 * This returns ExperimentDescr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExperimentDescr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExperimentDescr)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExperimentDescr_type") :
			getString("_UI_ExperimentDescr_type") + " " + label;
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

		switch (notification.getFeatureID(ExperimentDescr.class)) {
			case CWDataBasePackage.EXPERIMENT_DESCR__NAME:
			case CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION:
			case CWDataBasePackage.EXPERIMENT_DESCR__START:
			case CWDataBasePackage.EXPERIMENT_DESCR__DURATION:
			case CWDataBasePackage.EXPERIMENT_DESCR__END:
			case CWDataBasePackage.EXPERIMENT_DESCR__HBASE_ROW_MAP:
			case CWDataBasePackage.EXPERIMENT_DESCR__HBASE_ROOT_DIR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
			case CWDataBasePackage.EXPERIMENT_DESCR__META_DATA:
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
				(CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK,
				 ClickWatchModelFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK_TIME_COPY,
				 ClickWatchModelFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CWDataBasePackage.Literals.EXPERIMENT_DESCR__STATISTICS,
				 CWDataBaseFactory.eINSTANCE.createExperimentStatistics()));

		newChildDescriptors.add
			(createChildParameter
				(CWDataBasePackage.Literals.EXPERIMENT_DESCR__META_DATA,
				 ClickWatchModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(CWDataBasePackage.Literals.EXPERIMENT_DESCR__META_DATA,
				 ClickWatchModelFactory.eINSTANCE.createMultiNode()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK ||
			childFeature == CWDataBasePackage.Literals.EXPERIMENT_DESCR__NETWORK_TIME_COPY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CWDataBaseEditPlugin.INSTANCE;
	}

}
