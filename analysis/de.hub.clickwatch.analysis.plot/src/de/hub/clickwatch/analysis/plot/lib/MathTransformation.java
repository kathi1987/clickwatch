package de.hub.clickwatch.analysis.plot.lib;

public interface MathTransformation<FromType, ToType>	{

	public ToType transform(FromType value);
}
