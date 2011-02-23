package edu.hu.clickwatch.tests.clicksockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import click.ControlSocket.HandlerInfo;

import com.google.common.base.Throwables;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.tests.XmlModelRepositoryTest;

public class ClickSocketXSDDummy extends ClickSocketTestImpl {

	private static String XSD_ELEM = "link_stat";
	private static String NORMAL_ELEM = "foo";
	
	private XmlModelRepository xmlModelRepository = new XmlModelRepository();
	
	private Map<String, String> handlerXml;
	
	@SuppressWarnings("unchecked")
	private void initialize() {
		if (handlerXml == null) {
			handlerXml = new HashMap<String, String>();
			
			String schemaStr = readEntry(XmlModelRepositoryTest.LINK_STAT_XSD);
			EPackage metaModel = xmlModelRepository.loadMetaModelFromXSD(getSchemaURI(), schemaStr);
			
			EObject model = xmlModelRepository.deserializeModel(metaModel, readEntry(getDummyXmlEntry()));
			EFactory factory = metaModel.getEFactoryInstance();
			EClass documentRootClass = (EClass)metaModel.getEClassifier("DocumentRoot");
			EStructuralFeature xMLNSPrefixMapFeature = documentRootClass.getEStructuralFeature("xMLNSPrefixMap");
			EStructuralFeature xSISchemaLocation = documentRootClass.getEStructuralFeature("xSISchemaLocation");
			
			EObject handlers = model.eContents().get(0);
			for (EObject handler: handlers.eContents()) {
				String name = ((EEnumLiteral)handler.eGet(handler.eClass().getEStructuralFeature("name"))).getLiteral();
				EObject content = handler.eContents().iterator().next();
				
				EStructuralFeature contentFeature = documentRootClass.getEStructuralFeature(content.eContainmentFeature().getName());
				EObject documentRoot = factory.create(documentRootClass);
				
				documentRoot.eSet(xMLNSPrefixMapFeature, copyEMap((EMap<?, ?>)model.eGet(xMLNSPrefixMapFeature)));
				EMap<?, String> copyEMapXSISchemaLoction = copyEMap((EMap<?, String>)model.eGet(xSISchemaLocation));
				copyEMapXSISchemaLoction.get(0).setValue("link_stat.xsd");
				documentRoot.eSet(xSISchemaLocation, copyEMapXSISchemaLoction);
				documentRoot.eSet(contentFeature, content);
				String serializedHandlerValue = xmlModelRepository.serializeModel(metaModel, documentRoot);
				handlerXml.put(name, serializedHandlerValue);		
			}
			handlerXml.put(ClickControlXSDNodeAdapter.XSD_HANDLER_NAME, schemaStr);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private <X,Y> EMap<X, Y> copyEMap(EMap<X, Y> orig) {
		EMap<X, Y> result = new BasicEMap<X, Y>();
		Iterator<Map.Entry<X, Y>> it = orig.entrySet().iterator();
		while(it.hasNext()) {
			result.add((Map.Entry)EcoreUtil.copy((EObject)it.next()));
		} 
		return result;
	}
	
	protected URI getSchemaURI() {
		return URI.createURI("platform:/plugin/edu.hu.clickwatch/" + XmlModelRepositoryTest.LINK_STAT_XSD);
	}
	
	protected String getDummyXmlEntry() {
		return "src/" + getClass().getPackage().getName().replace(".", "/") + "/link_stat_runtime.xml";
	}
	
	protected String readEntry(String entry) {
		try {
			return convertStreamToString(ClickWatchPluginActivator.getInstance().getBundle().getEntry(entry).openStream());
		} catch (IOException e) {
			Throwables.propagate(e);
			return null;
		}
	}
	
	private String convertStreamToString(InputStream is) throws IOException {
		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(new InputStreamReader(is,
						"UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {
			return "";
		}
	}
	
	@Override
	public void handleWrite(String element, String handler, String value) {
		// TODO Auto-generated method stub
		// empty
	}
	
	@Override
	public String getValue(String element, String handler) {
		initialize();
		if (element.equals(NORMAL_ELEM)) {
			return "<foo><bar>TEXT</bar></foo>";
		} else {
			return handlerXml.get(handler);
		}
	}
	
	@Override
	public HandlerInfo[] getHandler(String element) {
		initialize();
		if (element.equals(NORMAL_ELEM)) {
			return new HandlerInfo[] { new HandlerInfo(element, "bar", true, true)};
		} else {
			HandlerInfo[] result = new HandlerInfo[handlerXml.keySet().size()];
			int i = 0;
			for (String handlerName: handlerXml.keySet()) {
				result[i++] = new HandlerInfo(element, handlerName, true, false);
			}
			return result;
		}
	}
	
	@Override
	public String[] getElements() {
		initialize();
		return new String[] { XSD_ELEM, NORMAL_ELEM };
	}
}
