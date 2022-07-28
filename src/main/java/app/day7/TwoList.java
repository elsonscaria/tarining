package app.day7;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class TwoList {
	public static void main(String[] args) {
		List<String> movies = new LinkedList<String>();
		
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
		movies.remove(2);
		System.out.println(movies);
	
		
	}
}
