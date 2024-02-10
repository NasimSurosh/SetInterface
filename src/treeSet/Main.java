package treeSet;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		// TreeSet with costum bject
		
		TreeSet<SubMain> people = new TreeSet<>();
		
		people.add(new SubMain("John", 32));
		people.add(new SubMain("Alex", 65));
		people.add(new SubMain("Yolia", 45));
		people.add(new SubMain("Alexandra", 55));
		
	for (SubMain person : people) {
		System.out.println(person);
	}

	}

}
