package de.hub.clickwatch.datamodel.util;

public class HandlerUtil {

	public static String[] getSplitQualifiedName(String qualifiedName) {
		int slash = qualifiedName.lastIndexOf("/");
		String handlerName = qualifiedName.substring(slash + 1);
		String elementName = qualifiedName.substring(0, slash);
		return new String[] {elementName, handlerName};
	}
}
