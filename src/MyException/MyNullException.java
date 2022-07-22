package MyException;

public class MyNullException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyNullException() {
		super();
	}
	
	public MyNullException(String msg) {
		super(msg);
	}

}
