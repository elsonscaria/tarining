package app.day7;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class SevenTreeSet {

	public static void main(String[] args) {
		
		Set<String> movies = new TreeSet<>();
		
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
		movies.remove("Batman");
		System.out.println(movies);
	}

}
