package MyException;

public class ContainException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ContainException() {
		super();
	}
	
	public ContainException(String msg) {
		super(msg);
	}
}