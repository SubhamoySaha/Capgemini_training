package Online_Banking_Transaction_System;

public class InvalidTransactionException extends RuntimeException {

	InvalidTransactionException(String message){
		super(message);
	}
}
