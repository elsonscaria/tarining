package app.day4;

public class Four {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int even = 0;
		int odd = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				even += i;
			}
			else odd += i;
		}
		
		System.out.println("The sum of odd numbers : " + odd);
		System.out.println("The sum of even numbers : " + even);
	}
}
