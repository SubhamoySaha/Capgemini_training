package exception_demo;

public class InvalidPercentageException extends RuntimeException{
	
	public InvalidPercentageException(String msg) {
		super(msg);
	}
}
