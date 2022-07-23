package app.day4;

public class Two {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello Friend");
		
		System.out.println(buffer);
		
		System.out.println("Length : " + buffer.length());
		System.out.println("Capacity : " + buffer.capacity());
		
		buffer.append(" - GURONG.A");
		System.out.println(buffer);
		
		System.out.println("Length : " + buffer.length());
		System.out.println("Capacity : " + buffer.capacity());
		
		buffer.insert(21, "VIRUS");
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.delete(0, 12);
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
	}
	
}