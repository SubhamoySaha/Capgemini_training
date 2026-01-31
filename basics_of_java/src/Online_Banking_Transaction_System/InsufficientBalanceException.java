package Online_Banking_Transaction_System;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
		super(message);
	}
}
