package app.day4;

public class Three {

	public static void main(String[] args) {
		StringBuilder block = new StringBuilder("Hello Friend");
		
		System.out.println(block);
		
		System.out.println("Length : " + block.length());
		System.out.println("Capacity : " + block.capacity());
		
		block.append(" - GURONG.A");
		System.out.println(block);
		
		System.out.println("Length : " + block.length());
		System.out.println("Capacity : " + block.capacity());
		
		block.insert(23, "VIRUS");
		System.out.println(block);
		
		block.reverse();
		System.out.println(block);
		
		block.delete(0, 12);
		System.out.println(block);
		
		block.reverse();
		System.out.println(block);
	}
}