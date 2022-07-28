package app.day7;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class FiveHashSet {

	public static void main(String[] args) {
		
		Set<String> movies = new HashSet<>();
		
		//Add
		movies.add("Batman");
		movies.add("Top Gun");
		movies.add("One Piece");
		System.out.println(movies);
		
		//Iteration
		Iterator<String> it = movies.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Remove
		movies.remove("Batman");
		System.out.println(movies);

	}

}
