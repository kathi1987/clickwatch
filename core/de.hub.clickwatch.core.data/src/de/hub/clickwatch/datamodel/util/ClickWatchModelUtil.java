package de.hub.clickwatch.datamodel.util;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.datamodel.Node;

public class ClickWatchModelUtil {

    public static Node getContainingNode(EObject object) {
        while (object != null && !(object instanceof Node)) {
            object = object.eContainer();
        }
        return (Node)object;
    }
}
