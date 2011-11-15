package de.hub.clickwatch.recorder.examples.lib;

public interface MathTransformation<FromType, ToType>	{

	public ToType transform(FromType value);
}
