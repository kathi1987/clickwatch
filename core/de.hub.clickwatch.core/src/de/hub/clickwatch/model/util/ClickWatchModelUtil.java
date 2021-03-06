package de.hub.clickwatch.model.util;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.Node;

public class ClickWatchModelUtil {

    public static Node getContainingNode(EObject object) {
        while (object != null && !(object instanceof Node)) {
            object = object.eContainer();
        }
        return (Node)object;
    }
}
