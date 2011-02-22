package edu.hu.clickwatch.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

public class TestUtil {
	
	public static IClickSocket createClickSocket(final int numberOfElements, final int numberOfHandlers) {
		return createClickSocket(numberOfElements, numberOfHandlers, false);
	}
	
	public static IClickSocket createClickSocket(final int numberOfElements, final int numberOfHandlers, final boolean isChanging) {
		return new ClickSocketTestImpl() {	
			int change = 0;
			
			@Override
			public void handleWrite(String element, String handler, String value) {
				// empty
			}
			
			@Override
			public String getValue(String element, String handler) {
				return "<foo><bar>TEXT</bar></foo>";
			}
			
			@Override
			public HandlerInfo[] getHandler(String element) {
				HandlerInfo[] result = new HandlerInfo[numberOfHandlers];
				for (int i = 0; i < numberOfHandlers; i++) {
					result[i] = new HandlerInfo(element, "h" + i, true, true);
				}
				return result;
			}
			
			@Override
			public String[] getElements() {
				String suffix = "";
				if (isChanging) {
					suffix += change++;
				}
				String[] result = new String[numberOfElements];
				for (int i = 0; i < numberOfElements; i++) {
					result[i] = "e" + i + "_" + suffix;
				}
				return result;
			}
		};
	}

	public static String readFileAsString(String filePath) throws java.io.IOException{
	    StringBuffer fileData = new StringBuffer(1000);
	    BufferedReader reader = new BufferedReader(
	            new FileReader(filePath));
	    char[] buf = new char[1024];
	    int numRead=0;
	    while((numRead=reader.read(buf)) != -1){
	        String readData = String.valueOf(buf, 0, numRead);
	        fileData.append(readData);
	        buf = new char[1024];
	    }
	    reader.close();
	    return fileData.toString();
	}
	
	/**
	 * @param pathStr Path syntax is: <elem_name>:e/<elem_name>:e/<handler_name>:h/<xml_elem>:x/<text>:t
	 * 
	 */
	public static EObject query(EObject value, String pathStr) {
		Pattern xmlPattern = Pattern.compile("([a-zA-Z0-9]+)(\\[([a-zA-Z0-9]*)=([a-z-A-Z0-9]+)\\])?");
		TestCase.assertNotNull(value);
		String[] path = pathStr.split("/");
		String head = path[0];
		String tail = path.length > 1 ? pathStr.substring(pathStr.indexOf("/") + 1) : null;
					
		String[] pathItemElements = head.split(":");
		Preconditions.checkArgument(pathItemElements.length == 2, "illegal path");
		String pathItemName = pathItemElements[0];
		String pathItemKind = pathItemElements[1];

		boolean headMatches = false;
		if (pathItemKind.equals("n")) {
			if (value instanceof Node) {
				headMatches = true;
			}
		} else if (pathItemKind.equals("e")) {
			if (value instanceof Element && pathItemName.equals(((Element)value).getName())) {
				headMatches = true;
			}
		} else if (pathItemKind.equals("h")) {
			if (value instanceof Handler && pathItemName.equals(((Handler)value).getName())) {
				headMatches = true;
			}
		} else if (pathItemKind.equals("x")) {
			Matcher matcher = xmlPattern.matcher(pathItemName);
			if (!matcher.matches()) {
				Preconditions.checkArgument(false, "illegal path");
				return null;
			}
			String name = matcher.group(1);			
			if (value.eContainmentFeature().getName().equals(name)) {
				if (matcher.group(4) != null) {
					String attrName = matcher.group(3);
					String attrValue = matcher.group(4);
					FeatureMap fm = null;
					if (value instanceof Handler) {
						fm = ((Handler)value).getMixed();
					} else if (value instanceof AnyType) {
						fm = attrName.equals("") ? ((AnyType)value).getMixed() : ((AnyType)value).getAnyAttribute();
					} else {
						Preconditions.checkState(false, "attributes not supported for " + value.eClass().getName());
					}
					
					for (FeatureMap.Entry entry: fm) {
						if (attrName.equals("") || entry.getEStructuralFeature().getName().equals(attrName)) {
							if (attrValue.equals(entry.getValue())) {
								headMatches = true;
							}
						}
					}
				} else {
					headMatches = true;
				}
			}
		} else if (pathItemKind.equals("t")) {
			
		} else {
			Preconditions.checkArgument(false, "illegal path");
		}
		
		if (headMatches) {
			if (tail == null) {
				return value;
			} else {
				for (EObject valueContents: value.eContents()) {
					EObject tailMatches = query(valueContents, tail);
					if (tailMatches != null) {
						return tailMatches;
					}
				}
				return null;
			}
		} else {
			return null;
		}
	}
}
