package de.hub.clickwatch.analysis.composition;

import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public interface Style {

	public static final IColorConstant TEXT_FOREGROUND = new ColorConstant(0, 55, 108); 
	public static final IColorConstant SHAPE_FOREGROUND = new ColorConstant(0, 0, 0);
	public static final IColorConstant SHAPE_BACKGROUND = new ColorConstant(255, 255, 255);
	public static final IColorConstant DELIMETER_FOREGROUND = new ColorConstant(130, 130, 0);
	public static final IColorConstant MODEL_MARKER_BACKGROUND = new ColorConstant(0, 200, 0);; 
}
