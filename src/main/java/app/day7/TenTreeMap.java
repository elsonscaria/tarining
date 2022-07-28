package app.day7;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class TenTreeMap {

	public static void main(String[] args) {
		
		Map<String, Integer> emp = new TreeMap<>();
		
		//add
		emp.put("John", 11);
		emp.put("Jane", 12);
		emp.put("Sam", 17);
		
		for(Map.Entry<String, Integer> entry : emp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Iteration
		System.out.println("\nIteration : ");
		Iterator<Map.Entry<String, Integer>> it = emp.entrySet().iterator();
		while(it.hasNext() ) {
			System.out.println(it.next());
		}
		
		emp.remove("John");
		System.out.println("\n" + emp);
	}

}
