package exceptionsUtility;

public class TestDataNotFoundException extends FrameworkException {

	public TestDataNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TestDataNotFoundException(String message) {
		super(message);
	}

}
