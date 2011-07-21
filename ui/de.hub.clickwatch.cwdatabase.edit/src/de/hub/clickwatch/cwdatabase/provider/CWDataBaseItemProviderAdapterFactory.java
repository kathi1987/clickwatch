/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.provider;

import de.hub.clickwatch.cwdatabase.util.CWDataBaseAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CWDataBaseItemProviderAdapterFactory extends CWDataBaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.ExperimentDescr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentDescrItemProvider experimentDescrItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.ExperimentDescr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentDescrAdapter() {
		if (experimentDescrItemProvider == null) {
			experimentDescrItemProvider = new ExperimentDescrItemProvider(this);
		}

		return experimentDescrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.NodeRecord} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRecordItemProvider nodeRecordItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.NodeRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeRecordAdapter() {
		if (nodeRecordItemProvider == null) {
			nodeRecordItemProvider = new NodeRecordItemProvider(this);
		}

		return nodeRecordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.DataBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseItemProvider dataBaseItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.DataBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataBaseAdapter() {
		if (dataBaseItemProvider == null) {
			dataBaseItemProvider = new DataBaseItemProvider(this);
		}

		return dataBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.ExperimentRecord} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentRecordItemProvider experimentRecordItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.ExperimentRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentRecordAdapter() {
		if (experimentRecordItemProvider == null) {
			experimentRecordItemProvider = new ExperimentRecordItemProvider(this);
		}

		return experimentRecordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentNodeRecordTimeTableItemProvider experimentNodeRecordTimeTableItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentNodeRecordTimeTableAdapter() {
		if (experimentNodeRecordTimeTableItemProvider == null) {
			experimentNodeRecordTimeTableItemProvider = new ExperimentNodeRecordTimeTableItemProvider(this);
		}

		return experimentNodeRecordTimeTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStringToExperimentNodeRecordTimeTableMapItemProvider eStringToExperimentNodeRecordTimeTableMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEStringToExperimentNodeRecordTimeTableMapAdapter() {
		if (eStringToExperimentNodeRecordTimeTableMapItemProvider == null) {
			eStringToExperimentNodeRecordTimeTableMapItemProvider = new EStringToExperimentNodeRecordTimeTableMapItemProvider(this);
		}

		return eStringToExperimentNodeRecordTimeTableMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELongObjectToNodeRecordDescrMapItemProvider eLongObjectToNodeRecordDescrMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createELongObjectToNodeRecordDescrMapAdapter() {
		if (eLongObjectToNodeRecordDescrMapItemProvider == null) {
			eLongObjectToNodeRecordDescrMapItemProvider = new ELongObjectToNodeRecordDescrMapItemProvider(this);
		}

		return eLongObjectToNodeRecordDescrMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.ExperimentStatistics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentStatisticsItemProvider experimentStatisticsItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.ExperimentStatistics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentStatisticsAdapter() {
		if (experimentStatisticsItemProvider == null) {
			experimentStatisticsItemProvider = new ExperimentStatisticsItemProvider(this);
		}

		return experimentStatisticsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.hub.clickwatch.cwdatabase.NodeRecordDescr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRecordDescrItemProvider nodeRecordDescrItemProvider;

	/**
	 * This creates an adapter for a {@link de.hub.clickwatch.cwdatabase.NodeRecordDescr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeRecordDescrAdapter() {
		if (nodeRecordDescrItemProvider == null) {
			nodeRecordDescrItemProvider = new NodeRecordDescrItemProvider(this);
		}

		return nodeRecordDescrItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (experimentDescrItemProvider != null) experimentDescrItemProvider.dispose();
		if (nodeRecordItemProvider != null) nodeRecordItemProvider.dispose();
		if (dataBaseItemProvider != null) dataBaseItemProvider.dispose();
		if (experimentRecordItemProvider != null) experimentRecordItemProvider.dispose();
		if (experimentNodeRecordTimeTableItemProvider != null) experimentNodeRecordTimeTableItemProvider.dispose();
		if (eStringToExperimentNodeRecordTimeTableMapItemProvider != null) eStringToExperimentNodeRecordTimeTableMapItemProvider.dispose();
		if (eLongObjectToNodeRecordDescrMapItemProvider != null) eLongObjectToNodeRecordDescrMapItemProvider.dispose();
		if (experimentStatisticsItemProvider != null) experimentStatisticsItemProvider.dispose();
		if (nodeRecordDescrItemProvider != null) nodeRecordDescrItemProvider.dispose();
	}

}
