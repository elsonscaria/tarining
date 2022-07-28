package app.day5;

import java.lang.ArithmeticException;

public class Three {

	public static void main(String[] args) extends ZeroByException {
		try {
			int a = 6/0;
			System.out.println(a);
		}
		catch(ZeroByException e) {
			throw ZeroByException("Zero error");
		}
		

	}

}

class ZeroByException extends Exception {
	
	ZeroByException(String message) {
		super(message);
	}
}