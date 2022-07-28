package app.day7;

import java.util.Stack;
import java.util.Iterator;

public class FourStack {

	public static void main(String[] args) {
		Stack<String> movies = new Stack<>();
		
		//add
		movies.push("Batman");
		movies.push("Top Gun");
		movies.push("One Piece");
		movies.push("Nope");
		System.out.println(movies);
		
		//iteration
		Iterator<String> it = movies.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove
		movies.pop();
		movies.pop();
		System.out.println(movies);
	}

}
