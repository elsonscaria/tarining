package app.day4;

public class Six {

	public static void main(String[] args) {
		int[][] matrix = {{7, 9, 5},
				  {5, 1, 2},
				  {11, 9, 4}};
for (int i[] : matrix) {
	for (int j : i) {
		System.out.print(j + "\t");
	}
	System.out.print("\n");
}
}
}
