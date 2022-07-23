package app.day4;

public class One {

	public static void main(String[] args) {
		String test = "Hello Friend";
		
		//Prints the initial string
		System.out.println(test);
		
		//Prints the string length
		System.out.println("String length: " + test.length());
		
		//Prints the character at given index
		System.out.println("The character at index 3 is " + test.charAt(3));
		
		//concatenates to the string
		test = test.concat(" - GURONG.A");
		System.out.println(test);
		
		//converts to a char array and prints
		char[] arr1 = test.toCharArray();
		System.out.println(arr1);
		
		//Prints the index of 'Friend'
		System.out.println("First index of 'Friend': " + test.indexOf("Friend"));
		
		//trims the string
		test = test.trim();
		System.out.println(test);
		
		//converts to upper case
		test = test.toUpperCase();
		System.out.println(test);
		
		//converts to lower case
		test = test.toLowerCase();
		System.out.println(test);
		
		//checks if the string ends with a "A"
		System.out.println(test.endsWith("A"));
		
		//creates a substring of the first sentence
		test = test.substring(0, 10);
		System.out.println(test);
		
		
		//replaces e with E
		test = test.replace("e", "E");
		System.out.println(test);
		
		
		//converts the value to a string
		double d = 12.35;
		System.out.println(test.valueOf(d));
		
		//splits the string into an array of strings
		test = "Hello Friend - GURONG.A";
		String[] splitSt = test.split(" ");
		for(String t : splitSt)
			System.out.println(t);
		
		//compares the 2 strings both case sensitive and not case sensitive
		String capS = "HELLO";
		String lowS = "hello";
		System.out.println("case sensitive: " + capS.equals(lowS));
		System.out.println("case insensitive: " + capS.equalsIgnoreCase(lowS));
	}
}