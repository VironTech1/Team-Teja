package exceptions;

class NegativeIntegerException extends Exception {
	
	public NegativeIntegerException(String msg) {
		super(msg);
	}
	
}


class NonIntegerException extends Exception {
	
	public NonIntegerException(String msg) {
		super(msg);
	}
	
}
