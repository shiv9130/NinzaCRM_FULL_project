package exceptionsUtility;

public class PageNotFoundException extends FrameworkException {
	
	public PageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public PageNotFoundException(String message) {
        super(message);
    }

}
