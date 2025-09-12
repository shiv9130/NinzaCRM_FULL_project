package exceptionsUtility;

public class ElementNotFoundException extends FrameworkException {
	
	public ElementNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public ElementNotFoundException(String message) {
        super(message);
    }
}
