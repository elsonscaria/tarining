package app.day7;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class SixLHSet {

	public static void main(String[] args) {
		
		Set<String> movies = new LinkedHashSet<>();
		
		//add
		movies.add("Batman");
		movies.add("Top Gun");
		movies.add("One Piece");
		System.out.println(movies);
		
		//iteration
		Iterator<String> it = movies.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove
		movies.remove("Top Gun");
		System.out.println(movies);

	}

}
