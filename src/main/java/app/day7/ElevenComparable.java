package app.day7;

import java.util.Comparator;

public class ElevenComparable {

	public static void main(String[] args) {
		
		emplRank comp = new emplRank();
		
		empl a = new empl(4, "John");
		empl b = new empl(1, "Jane");
		empl c = new empl(3, "Kim");
		empl d = new empl(3, "Cade");
		
		comp.compare(a, b);
		comp.compare(b, c);
		comp.compare(c, d);
		comp.compare(a, c);
		comp.compare(b, d);
		comp.compare(d, a);

		
	}
}

class empl implements Comparable<empl> {
	
	private int rank;
	private String name;
	
	empl(int rank, String name) {
		this.rank = rank;
		this.name = name;
	}
	
	public int compares(empl nextEmp) {
		if (nextEmp.rank > this.rank) {
			System.out.println(nextEmp.name + " is ranked higher than " + name + ".");
			return -1;
		} else if (nextEmp.rank == this.rank) {
			System.out.println(name + " is the same rank as " + nextEmp.name + ".");
			return 0;
		} else {
			System.out.println(nextEmp.name + " is ranked lower than " + name + ".");
		}
		return 1;
	}
}

class emplRank implements Comparator<empl> {
	public int compare(empl a, empl b) {
		return a.compares(b);
	}
}