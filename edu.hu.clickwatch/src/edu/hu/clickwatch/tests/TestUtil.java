package edu.hu.clickwatch.tests;

import click.ControlSocket.HandlerInfo;
import edu.hu.clickcontrol.IClickSocket;

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
}
