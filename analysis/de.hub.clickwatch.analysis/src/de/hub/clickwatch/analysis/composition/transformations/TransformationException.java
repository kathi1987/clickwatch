package de.hub.clickwatch.analysis.composition.transformations;

public class TransformationException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransformationException() {
		super();
	}

	public TransformationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TransformationException(String message) {
		super(message);
	}

	public TransformationException(Throwable cause) {
		super(cause);
	}

}
