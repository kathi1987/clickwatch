package de.hub.clickwatch.merge;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

import com.google.inject.ImplementedBy;

/**
 * {@link Merge} uses instances of implementations of this interface to fulfill
 * different tasks, thus allowing to customize the merge behavior. 
 */
@ImplementedBy(DefaultMergeConfiguration.class)
public interface IMergeConfiguration {

	public static final int NO_INDEX = -1;

	public interface IContext {
		public EObject getContainer();

		public Object getOwner();

		public EStructuralFeature getFeature();
	}

	/**
	 * This is called when ever merge registers a difference.
	 * 
	 * @param oldValue
	 *            The old value of the feature.
	 * @param newValue
	 *            The new value of the feature (the original new value, not the
	 *            value that is necessary used as a replacement, see
	 *            {@link #create(EObject, Object, EStructuralFeature, Object)}).
	 */
	public void handleDiffernce(IContext context, Object oldValue,
			Object newValue, int index);

	/**
	 * Clients can determined, if merge shall take a feature into account or
	 * not.
	 * 
	 * @return <code>true</code>, iff the feature shall be considered for the
	 *         merge.
	 */
	public boolean consider(IContext context);

	/**
	 * Merge does not use new values directly to replace different old values,
	 * but calls this method to potentially create a value from the new value.
	 * 
	 * @param newValue
	 *            The new value that shall replace the old value.
	 * @return The value that will replace the old value.
	 */
	public Object create(IContext context, Object newValue);

	/**
	 * Merge does not just drop old values that are replaced by new ones, but
	 * calls this method for disposal of old values. The method will be called
	 * after the value has been replaced.
	 * 
	 * @param container
	 *            The {@link EObject} that contains the changed feature (either
	 *            direct or via {@link FeatureMap}.
	 * @param owner
	 *            The {@link EObject} or {@link FeatureMap} that contains the
	 *            changed feature.
	 * @param feature
	 *            The changed feature.
	 * @param newValue
	 *            The old value that needs to be disposed.
	 */
	public void dispose(IContext context, Object oldValue);

	/**
	 * Returns the unique identity of an object. Identities are used to identify
	 * two objects as the some object.
	 */
	public Object identity(IContext context, Object value);

	/**
	 * Determines whether values of the given context have identity and shall be merged
	 * bases on their identity.
	 */
	public boolean hasIdentity(IContext context);
	
	/**
	 * Determines whether the given value shall replace (or be replaced) or whether merge shall
	 * simply add new value to exisiting value.
	 */
	public boolean isToAdd(IContext context, Object oldValue, Object newValue);
	
	public void add(IContext context, List<?> list, Object value);
	public void add(IContext context, List<?> list, int index, Object value);
	public void remove(IContext context, List<?> list, int index);
	public void set(IContext context, List<?> list, int index, Object value);
	public void set(IContext context, Object value);
}
