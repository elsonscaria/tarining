package app.day3;

public class six {

	public static void main(String[] args) {
		player st1 = new player();
		st1.gain();
		st1.lose();
	}

}

interface power{
	public void gain();
	public void lose();
}

class player implements power{
	public void gain() {
		System.out.println("Minus 5");
	}
	public void lose() {
		System.out.println("Plus 5");
	}
}
