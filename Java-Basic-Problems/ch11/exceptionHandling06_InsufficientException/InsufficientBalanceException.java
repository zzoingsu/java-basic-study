package ch11.exceptionHandling06_InsufficientException;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String message) {
		super(message);
	}

}
