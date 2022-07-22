package app.day3;

public class four {

	public static void main(String[] args) {
		food cal = new bread();
		cal.spread();
		food cole = new food();
		cole.spread();
	}
}

class food {
	public void spread() {
		System.out.println("Butter");
	}
}

class bread extends food {
	public void spread() {
		System.out.println("Jam");
	}
}