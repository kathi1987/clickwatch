package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;

import edu.hu.clickwatch.merge.Diff;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.Handler;

/**
 * Implementations of the interface tell {@link AbstractNodeConnection}s how to
 * handle values delivered by {@link INodeAdapter}s. An instance of
 * {@link AbstractNodeConnection} will not read, write, merge or compare handler
 * values itself, but will rely on implementations of this interface.
 * Implementations are provided by respective {@link INodeAdapter}s.
 * 
 * @author Markus Scheidgen
 */
public interface IValueRepresentation {

	/**
	 * Determines whether a notification describes an event that will change the
	 * value and requires clickwatch to forward this change to reality.
	 * 
	 * @param notification
	 *            An EMF notification targeting the handler or an element that
	 *            is part of the handler value.
	 * @return True iff the handler is changed and the change needs to be
	 *         forwarded to reality.
	 */
	public boolean isNotificationChangingValue(Notification notification);

	public Object get(Handler handler);

	/**
	 * @return True if the new value is different from the existing value of the
	 *         handler that is merged into (mergee).
	 */
	public boolean merge(Handler mergee, Object newVaule, Diff diff);
}
