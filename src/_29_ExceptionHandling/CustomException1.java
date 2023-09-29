package _29_ExceptionHandling;

public class CustomException1 extends Throwable {
	
	
	int code;
	String errorMsg;
	
	public CustomException1() {
		System.out.println("cunstrocter of CustomException1 with no param");
	}
	
	public CustomException1(String message) {
		super(message);
	}
	
	public CustomException1(int code, String errorMsg) {
		super(errorMsg);
		this.code=code;
		this.errorMsg=errorMsg;
	}
	
}
