package hashMap;


import java.util.HashMap;
import java.util.Map;

public class HashMapGeneral {

	public static void main(String[] args) {
		
		      // key     value
		HashMap<Integer, String> emploeeIDs = new HashMap<>();
		
		emploeeIDs.put(5434535, "Alex");
		emploeeIDs.put(5345353, "Yang");
		emploeeIDs.put(564145236, "Gongdo");
	
		emploeeIDs.put(345345325, "Alex");
		
		System.out.println(emploeeIDs);
		
		// in HashMap we can use get method but not indexes.
		System.out.println(emploeeIDs.get(453453253));
		
		System.out.println(emploeeIDs.containsKey(345345325));
		System.out.println(emploeeIDs.containsValue("Alex"));
		
		emploeeIDs.put(5434535, "Bob");
		System.out.println(emploeeIDs);
		
		emploeeIDs.putIfAbsent(1234, "Kamil");
		System.out.println(emploeeIDs);
		
		emploeeIDs.remove(1234);
		System.out.println(emploeeIDs);
		
		for (Map.Entry<Integer, String> map: emploeeIDs.entrySet()) {
			System.out.println(map.getKey() + " , " + map.getValue());
			
		}
	}

}
