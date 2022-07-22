package MyException;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public MyException() {
		super();
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
