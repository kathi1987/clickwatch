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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
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

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Statistic;

/**
 * This is the item provider adapter for a {@link de.hub.clickwatch.model.Statistic} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticItemProvider
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
    public StatisticItemProvider(AdapterFactory adapterFactory) {
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

            addSumPropertyDescriptor(object);
            addCountPropertyDescriptor(object);
            addMeanPropertyDescriptor(object);
            addSmallestPropertyDescriptor(object);
            addLargestPropertyDescriptor(object);
            addLatestPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Sum feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSumPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_sum_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_sum_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__SUM,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_count_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_count_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__COUNT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mean feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeanPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_mean_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_mean_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__MEAN,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Smallest feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSmallestPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_smallest_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_smallest_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__SMALLEST,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Largest feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLargestPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_largest_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_largest_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__LARGEST,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Latest feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLatestPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Statistic_latest_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Statistic_latest_feature", "_UI_Statistic_type"),
                 ClickWatchModelPackage.Literals.STATISTIC__LATEST,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns Statistic.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Statistic"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Statistic statistic = (Statistic)object;
        return statistic.toString();
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

        switch (notification.getFeatureID(Statistic.class)) {
            case ClickWatchModelPackage.STATISTIC__SUM:
            case ClickWatchModelPackage.STATISTIC__COUNT:
            case ClickWatchModelPackage.STATISTIC__MEAN:
            case ClickWatchModelPackage.STATISTIC__SMALLEST:
            case ClickWatchModelPackage.STATISTIC__LARGEST:
            case ClickWatchModelPackage.STATISTIC__LATEST:
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

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__SUM,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__COUNT,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__MEAN,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__SMALLEST,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__LARGEST,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));

        newChildDescriptors.add
            (createChildParameter
                (ClickWatchModelPackage.Literals.STATISTIC__LATEST,
                 EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, "0")));
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
