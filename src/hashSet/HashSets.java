package hashSet;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		
		/*
		 *  Java HashSet class implement the set interface.
		 *  to store unique objects. it will not store duplicates.
		 *  you don't get an error, simply nothing happens, the element is discarded.
		 *  HashSet dosen't store element in particular order.
		 *  there is no get method to access a particular index
		 */
		
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("watermelon");
		
		
		for (String fru : fruits) {
			System.out.println(fru);
		}
		

	}

}
