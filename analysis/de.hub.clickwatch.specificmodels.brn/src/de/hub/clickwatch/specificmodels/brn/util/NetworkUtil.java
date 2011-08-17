package de.hub.clickwatch.specificmodels.brn.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.BrnPackage;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator;

@Singleton
public class NetworkUtil {
	
	private final Map<EObject, Map<String, Node>> macAddrMaps = new HashMap<EObject, Map<String, Node>>();
	private @Inject IValueAdapter valueAdapter;
	private @Inject BrnValueAdapter brnValueAdapter;

	public Node navigateMacAddr(Network network, String macAddr) {
		Preconditions.checkArgument(network != null);
		Map<String, Node> macAddrMap = macAddrMaps.get(network);
		if (macAddrMap == null) {
			macAddrMap = new HashMap<String, Node>();
			for (Node node: network.getNodes()) {
				Bcast_stats bcastStats = getSpecificHandler(node, Bcast_stats.class);
				macAddrMap.put(bcastStats.getEntry().getFrom(), node);
			}
			macAddrMaps.put(network, macAddrMap);
		}
		return macAddrMap.get(macAddr);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getSpecificHandler(Node node, Class<T> handlerClass) {
		Preconditions.checkArgument(node != null);
		String javaPackageName = handlerClass.getPackage().getName();
		String packageName = javaPackageName.substring(javaPackageName.lastIndexOf(".") + 1);
		
		for(EPackage subPackage: BrnPackage.eINSTANCE.getESubpackages()) {
			if (subPackage.getName().equals(packageName)) {
				String handlerName = subPackage.getEAnnotation(DefaultTargetObjectCreator.ANNOTATION_SOURCE).
						getDetails().get(BrnValueAdapter.HANDLER_QUALIFIED_NAME);
				Handler handler = node.getHandler(handlerName);
				if (handlerClass.isAssignableFrom(handler.getClass())) {
					return (T)handler;
				} else {
					return (T)brnValueAdapter.create(handler, valueAdapter);
				}
			}
		}
		throw new IllegalArgumentException("Class " + handlerClass + " does not refer to a handler");
	}
}
