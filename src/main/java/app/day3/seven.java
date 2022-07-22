package app.day3;

public class seven {

	public static void main(String[] args) {
		enhancer ging = new enhancer();
		ging.ability();
		ging.exam();
	}
}

class hunter {
	int nen = 1050;
	String rank = "2 Star";
	
	hunter() {
		System.out.println("Registered in association");
	}
	
	void ability() {
		System.out.println("Space Manipulation");
	}
}

class enhancer extends hunter {
	int nen = 1220;
	String rank = "3 star";
	
	enhancer() {
		super();
	}
	
	void ability() {
		System.out.println("Enhanced Strength");
	}
	
	void exam() {
		super.ability();
		System.out.println("Initial Strength " + super.nen);
		System.out.println("Current Strength " + nen);
		System.out.println("Initial Rank " + super.rank);
		System.out.println("Current Rank " + rank);
	}
	
}