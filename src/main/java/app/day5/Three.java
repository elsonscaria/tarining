package app.day5;

import java.lang.ArithmeticException;

public class Three {

	public static void main(String[] args) throws ArithmeticException {
		try {
			int a = 6/0;
			System.out.println(a);
		}
		catch (Exception e){
			System.out.println("Exception caught: " + e);
		}

	}

}