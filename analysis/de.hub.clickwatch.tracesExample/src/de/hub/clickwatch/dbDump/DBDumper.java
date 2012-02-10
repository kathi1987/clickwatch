package de.hub.clickwatch.dbDump;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.Inject;

import de.hub.clickwatch.datamodel.ClickWatchDataModelFactory;
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;
import de.hub.clickwatch.datamodel.Element;
import de.hub.clickwatch.datamodel.Network;
import de.hub.clickwatch.datamodel.Value;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage;

public class DBDumper implements IClickWatchMain {

	private static Node currentNode;
	private static Record currentRecord;

	private static boolean CREATE_STRUCUTURE = false;

	// deprecated --> using only_use_handlers instead
	private static ArrayList<String> DO_NOT_READ_HANDLERS = new ArrayList<String>() {
		{
			add("handlers");
			add("name");
			add("ports");
			add("read");
			add("debug");
			add("links");
		}
	};

	// which handlers should only be dumoed? The full qualified name is needed
	private static ArrayList<String> ONLY_USE_HANDLERS = new ArrayList<String>() {
		{
			add("device_wifi/data/power/systempower");
			add("device_wifi/wifidevice/cst/stats");
			add("device_wifi/link_stat/bcast_stats");
		}
	};

	@Inject
	DataBaseUtil dbUtil;

	@Override
	public void main(IClickWatchContext ctx) {
		ClickWatchModelPackage.eINSTANCE.eClass();
		ClickWatchDataModelPackage.eINSTANCE.eClass();
		BrnPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resourcePhase1 = null;

		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		currentRecord = record;

		System.out.println("************** Starting DB dump ****************");

		// PHASE 1 read the node structure
		if (CREATE_STRUCUTURE) {
			resourcePhase1 = resSet.createResource(URI
					.createFileURI("dump/nodeStructure.xmi"));
			phase1(record, resourcePhase1);
		} else
			resourcePhase1 = resSet.getResource(
					URI.createFileURI("dump/nodeStructure.xmi"), true);

		// PHASE 2 read the data from the db and fill the new datamodel with it
		Resource resourcePhase2 = resSet.createResource(URI
				.createFileURI("dump/dump.xmi"));
		phase2(record, resourcePhase1, resourcePhase2);
	}

	/**
	 * Converts an Element
	 * 
	 * @param el
	 * @return
	 */
	private Element convertElement(de.hub.clickwatch.model.Element el) {
		Element newEl = ClickWatchDataModelFactory.eINSTANCE.createElement();
		newEl.setName(el.getName());

		for (de.hub.clickwatch.model.Element childEl : el.getChildren()) {
			Element newElement = convertElement(childEl);

			// only add the element if it has handlers
			if (newElement.getAllHandlers().size() > 0)
				newEl.getChildren().add(newElement);
		}

		for (Handler handl : el.getHandlers()) {
			if (ONLY_USE_HANDLERS.contains(handl.getQualifiedName()))
				newEl.getHandlers().add(convertHandler(handl));
		}

		return newEl;
	}

	/**
	 * Converts a Handler
	 * 
	 * @param handler
	 * @return
	 */
	private de.hub.clickwatch.datamodel.Handler convertHandler(Handler handler) {
		de.hub.clickwatch.datamodel.Handler newHandler = ClickWatchDataModelFactory.eINSTANCE
				.createHandler();
		newHandler.setCanRead(handler.isCanRead());
		newHandler.setCanWrite(handler.isCanWrite());
		newHandler.setName(handler.getName());

		// set the handler data
		// Iterator<Handler> iterator =
		// dbUtil.getHandlerIterator(dbUtil.createHandle(currentRecord,
		// currentNode, handler.getQualifiedName(), new
		// Long("1322150509558873386"), new Long("1322150520000000000")));
		Iterator<Handler> iterator = dbUtil
				.getHandlerIterator(dbUtil.createHandle(currentRecord,
						currentNode, handler, 	new Long("1322150509558873386"),
												new Long("1322150520000000000")));
		// Iterator<Handler> iterator =
		// dbUtil.getHandlerIterator(dbUtil.createHandle(currentRecord,
		// currentNode, handler));

		while (iterator.hasNext()) {
			Handler concreteHandler = iterator.next();
			Value newVal = (Value) concreteHandler;
			newHandler.getValues().add(newVal);
			// EcoreUtil.delete(concreteHandler);
		}
		return newHandler;
	}

	/**
	 * Phase2 converts the ClickWatchModel to a ClickWatchDataModel
	 * 
	 * @param record
	 * @param structureResource
	 * @param saveToResource
	 */
	public void phase2(Record record, Resource structureResource,
			Resource saveToResource) {
		System.out
				.println("************** READING DATA FROM DB ****************");

		Network network = ClickWatchDataModelFactory.eINSTANCE
				.createNetwork();
		network.setName("DumpedNetwork");
		
		for (int i = 0; i < structureResource.getContents().size(); i++) {
			Node node = (Node) structureResource.getContents().get(i);

			currentNode = node;
			de.hub.clickwatch.datamodel.Node newNode = ClickWatchDataModelFactory.eINSTANCE
					.createNode();
			newNode.setINetAddress(node.getINetAddress());
			newNode.setPort(node.getPort());

			for (de.hub.clickwatch.model.Element el : node.getElements()) {
				Element newElement = convertElement(el);

				// only add the element if it has handlers
				if (newElement != null
						&& newElement.getAllHandlers().size() > 0)
					newNode.getElements().add(newElement);
			}

			network.getNodes().add(newNode);
		}
		saveToResource.getContents().add(network);

		try {
			saveToResource.save(null);
			System.out
					.println("************** Dump successfully written ****************");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out
					.println("************** ERROR while saving: ****************");
			e.printStackTrace();

		}
	}

	/**
	 * 
	 * @param record
	 * @param resource
	 */
	public void phase1(Record record, Resource resource) {
		System.out
				.println("************** CREATING STRUCTURE ****************");
		LinkedList<Node> nodes = new LinkedList<Node>();
		for (Node node : record.getConfiguration().getNodes()) {
			nodes.add(node);
		}
		for (Node n : nodes) {
			resource.getContents().add(n);
		}

		try {
			resource.save(null);
			System.out.println("phase 1 successfull");
		} catch (IOException e) {
			System.out.println("phase 1 had an error: ");
			e.printStackTrace();
		}
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, DBDumper.class);
	}

}
