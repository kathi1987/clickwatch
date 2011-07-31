package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;

public abstract class NamedElement {
	
	protected final Collection<NamedElement> collidingElements = new ArrayList<NamedElement>();
	
	public abstract String getName();

	public void addCollision(NamedElement collidee) {
		collidingElements.add(collidee);
	}
	
	public abstract void resolveCollisions();
}
