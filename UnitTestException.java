package media;

@SuppressWarnings("serial")
public class UnitTestException extends Exception {

	public UnitTestException(String info) {
		UnitTest.reportError(info);
	}
	
	public UnitTestException(String info,String data) {
		UnitTest.reportError(info,data);
	}
}