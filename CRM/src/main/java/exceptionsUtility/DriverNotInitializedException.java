package exceptionsUtility;

public class DriverNotInitializedException extends FrameworkException {

	public DriverNotInitializedException(String message, Throwable cause) {
		super(message, cause);
	}

	public DriverNotInitializedException(String message) {
		super(message);
	}

}
