package app.day5;

public class Two {

	public static void main(String[] args) {
		int[] Arr1 = new int[10];
		try {
			for(int i = 5; i <= 20; i++) {
				Arr1[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.printf("ERROR! Array Index Exceeds Maximum");
		}
		
	}
}
