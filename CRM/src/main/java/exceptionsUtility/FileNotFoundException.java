package exceptionsUtility;

public class FileNotFoundException extends FrameworkException {

	public FileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileNotFoundException(String message) {
		super(message);
	}

}
