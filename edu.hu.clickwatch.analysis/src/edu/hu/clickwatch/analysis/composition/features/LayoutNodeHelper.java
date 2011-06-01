package edu.hu.clickwatch.analysis.composition.features;

public class LayoutNodeHelper {
	
	public static int MIN_HEIGHT = 30;
	public static int MIN_WIDTH = 80;

	public static int getWidth(int width) {
		return width < MIN_WIDTH ? MIN_WIDTH : width;
	}
	
	public static int getHeight(int height) {
		return height < MIN_HEIGHT ? MIN_HEIGHT : height;
	}
	
	public static int[] getRectangularPolylinePoints(int width, int height) {
		return new int[] { 
				0,0, 
				width,0, 
				width,height, 
				0,height, 
				0,0
		};
	}

	public static boolean sizeHasChanges(int width, int height) {
		return width != MIN_WIDTH || height != MIN_HEIGHT;
	}
}
