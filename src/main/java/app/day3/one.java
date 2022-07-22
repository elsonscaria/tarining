package app.day3;

public class one {

	public static void main(String[] args) {
		tesla t = new tesla();
		t.fuel();
		t.color();
	}

}

class car {
	public void color() {
		System.out.println("white");
	}
}

class tesla extends car {
	public void fuel() {
		System.out.println("Electric");
	}
}
