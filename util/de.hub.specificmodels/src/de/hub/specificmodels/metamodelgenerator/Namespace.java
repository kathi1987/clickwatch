package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Namespace<T extends NamedElement> extends NamedElement {

	private Multimap<String, T> names = HashMultimap.create();
	private Collection<T> collisions = new ArrayList<T>();
	private Collection<T> elements = new HashSet<T>();
	
	public void inherit(Namespace<T> otherNameSpace) {
		for (String key: otherNameSpace.names.keySet()) {
			names.get(key).addAll(otherNameSpace.names.get(key));
		}
	}
	
	public void addName(T namedElement) {
		elements.add(namedElement);
		names.put(namedElement.getName(), namedElement);
	}

	public Collection<String> getNames() {
		return names.keySet();
	}
	
	public Collection<T> getNamedElements(String name) {
		return names.get(name);
	}
	
	public final void handleCollisions() {
		for(String name: getNames()) {
			Collection<T> namedElements = names.get(name);
			for(T element: namedElements) {
				if (elements.contains(element)) {
					boolean hasCollision = false;
					for(T collidingElement: namedElements) {
						if (element != collidingElement) {
							element.addCollision(collidingElement);
							hasCollision = true;
						}
					}
					if (hasCollision) {
						collisions.add(element);
					}
				}
			}
		}
		for (T collision: collisions) {
			collision.resolveCollisions();
		}
	}


	@Override
	public void resolveCollisions() {
		
	}

	@Override
	public String getName() {
		return null;
	}
	
}
