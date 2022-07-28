package app.day7;

import java.util.Enumeration;
import java.util.Vector;

public class ThreeVector {

	public static void main(String[] args) {
		
		Vector<String> movies = new Vector<>();
		
		//add
		movies.add("Batman");
		movies.add("Top Gun");
		movies.add("One Piece");
		System.out.println(movies);
		
		//iteration
		Enumeration<String> it = movies.elements();
		while (it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
		
		//remove
		movies.remove(2);
		System.out.println(movies);

	}

}
