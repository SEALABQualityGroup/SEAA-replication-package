package it.univaq.sealab.umlreliability;

public class MissingTagException extends Exception {

	private static final long serialVersionUID = 4084054104380084439L;

	public MissingTagException(final String message) {
		super(message);
	}
	
	public MissingTagException(final String stereotype, final String tag, final String elementName) {
		super(String.format("Stereotype '%s' on element '%s' has no tag '%s'.", stereotype, elementName, tag));
	}
}
