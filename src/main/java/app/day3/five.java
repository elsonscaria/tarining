package app.day3;

public class five {

	public static void main(String[] args) {
		vehicle t3 = new brake();
		t3.press();
		t3.release();
	}
}

abstract class vehicle {
	abstract void press();
	abstract void release();
}

class brake extends vehicle {
	void press() {
		System.out.println("Speed decreases");
	}
	
	void release() {
		System.out.println("Speed Increases");
	}
 	
}