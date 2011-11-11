package de.hub.clickwatch.model.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.ClickWatchReflectiveItemProviderAdapterFactory;
import de.hub.clickwatch.model.util.ClickWatchModelUtil;

/**
 * This specialization of {@link ClickWatchReflectiveItemProviderAdapterFactory}
 * colors objects when they got recently changes. The change information is
 * obtained form the containing {@link Node}s {@link INodeConnection} and its
 * {@link IMergeAdapter}.
 */
public class ColoredReflectiveItemProviderAdapterFactory extends ClickWatchReflectiveItemProviderAdapterFactory {

    private static final Object black = Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
    private static final Object red = Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);

    @Override
    public Object getForeground(EObject object, EStructuralFeature feature, Object value) {
        Node containingNode = ClickWatchModelUtil.getContainingNode(object);
        if (containingNode == null) {
            return black;
        }
        INodeConnection connection = containingNode.getConnection();
        if (connection == null) {
            return black;
        }
        if (connection.getAdapter(IMergeAdapter.class).hasChanged(object, feature)) {
            return red;
        } else {
            return black;
        }
    }
}
