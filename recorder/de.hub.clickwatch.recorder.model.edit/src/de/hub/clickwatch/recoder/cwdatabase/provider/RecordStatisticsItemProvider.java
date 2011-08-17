/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.provider;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
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

import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.RecordStatistics;

/**
 * This is the item provider adapter for a {@link de.hub.clickwatch.recoder.cwdatabase.RecordStatistics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordStatisticsItemProvider
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
	public RecordStatisticsItemProvider(AdapterFactory adapterFactory) {
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

			addNodesAPropertyDescriptor(object);
			addSamplesNPropertyDescriptor(object);
			addHandlersNPropertyDescriptor(object);
			addHandlersPulledSPropertyDescriptor(object);
			addHandlersRPropertyDescriptor(object);
			addTimeAPropertyDescriptor(object);
			addTimeNPropertyDescriptor(object);
			addTimeSPropertyDescriptor(object);
			addSamplesPerSecondPropertyDescriptor(object);
			addRecordSizePropertyDescriptor(object);
			addSamplesRPropertyDescriptor(object);
			addBytesRequestSPropertyDescriptor(object);
			addTimeRequestSPropertyDescriptor(object);
			addCpuLoadSPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nodes A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodesAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_nodesA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_nodesA_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__NODES_A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	private static final String pattern = "###,###,###,###.##";
	private static final NumberFormat format = new DecimalFormat(pattern);
	private static String format(double number) {
		return format.format(number);
	}
	
	private static IItemLabelProvider summaryStatisticsLabelProvider = new IItemLabelProvider() {
		
		@Override
		public String getText(Object object) {
			SummaryStatistics ss = (SummaryStatistics)object;
			return format(ss.getSum()) + "(sum), " 
					+ format(ss.getMean()) + "(avr), "  
					+ format(ss.getMax()) + "(max), " 
					+ format(ss.getStandardDeviation()) + "(dev), " 
					+ format(ss.getN()) + "(N)";
		}
		
		@Override
		public Object getImage(Object object) {
			return null;
		}
	};

	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		if (feature.getEType() == CWDataBasePackage.eINSTANCE.getESummaryStatistics()) {
			return new ItemPropertyDescriptor(adapterFactory, resourceLocator,
					displayName, description, feature, isSettable, multiLine, sortChoices,
					staticImage, category, filterFlags) {
						@Override
						public IItemLabelProvider getLabelProvider(Object object) {
							return summaryStatisticsLabelProvider;
						}
			};
		} else {
			return super.createItemPropertyDescriptor(adapterFactory, resourceLocator,
					displayName, description, feature, isSettable, multiLine, sortChoices,
					staticImage, category, filterFlags);
		}
	}
	
	/**
	 * This adds a property descriptor for the Samples N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplesNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_samplesN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_samplesN_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__SAMPLES_N,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Handlers N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandlersNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_handlersN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_handlersN_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__HANDLERS_N,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Handlers Pulled S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandlersPulledSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_handlersPulledS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_handlersPulledS_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__HANDLERS_PULLED_S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Handlers R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandlersRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_handlersR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_handlersR_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__HANDLERS_R,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_timeA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_timeA_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__TIME_A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_timeN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_timeN_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__TIME_N,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_timeS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_timeS_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__TIME_S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Samples Per Second feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplesPerSecondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_samplesPerSecond_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_samplesPerSecond_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__SAMPLES_PER_SECOND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_recordSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_recordSize_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__RECORD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Samples R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplesRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_samplesR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_samplesR_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__SAMPLES_R,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bytes Request S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBytesRequestSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_bytesRequestS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_bytesRequestS_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__BYTES_REQUEST_S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Request S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeRequestSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_timeRequestS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_timeRequestS_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__TIME_REQUEST_S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Load S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuLoadSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordStatistics_cpuLoadS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordStatistics_cpuLoadS_feature", "_UI_RecordStatistics_type"),
				 CWDataBasePackage.Literals.RECORD_STATISTICS__CPU_LOAD_S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RecordStatistics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RecordStatistics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SummaryStatistics labelValue = ((RecordStatistics)object).getNodesA();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RecordStatistics_type") :
			getString("_UI_RecordStatistics_type") + " " + label;
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

		switch (notification.getFeatureID(RecordStatistics.class)) {
			case CWDataBasePackage.RECORD_STATISTICS__NODES_A:
			case CWDataBasePackage.RECORD_STATISTICS__SAMPLES_N:
			case CWDataBasePackage.RECORD_STATISTICS__HANDLERS_N:
			case CWDataBasePackage.RECORD_STATISTICS__HANDLERS_PULLED_S:
			case CWDataBasePackage.RECORD_STATISTICS__HANDLERS_R:
			case CWDataBasePackage.RECORD_STATISTICS__TIME_A:
			case CWDataBasePackage.RECORD_STATISTICS__TIME_N:
			case CWDataBasePackage.RECORD_STATISTICS__TIME_S:
			case CWDataBasePackage.RECORD_STATISTICS__SAMPLES_PER_SECOND:
			case CWDataBasePackage.RECORD_STATISTICS__RECORD_SIZE:
			case CWDataBasePackage.RECORD_STATISTICS__SAMPLES_R:
			case CWDataBasePackage.RECORD_STATISTICS__BYTES_REQUEST_S:
			case CWDataBasePackage.RECORD_STATISTICS__TIME_REQUEST_S:
			case CWDataBasePackage.RECORD_STATISTICS__CPU_LOAD_S:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
