package treeSet;

import java.util.TreeSet;

public class TreeSetGeneral {

	public static void main(String[] args) {
		
		// TreeSet with String
		TreeSet<String> colors = new TreeSet<>();
		
		// treeSet print unorder it prints randomly 
		
		colors.add("white");
		colors.add("blue");
		colors.add("black");
		colors.add("yellow");
		colors.add("AA");
		
		System.out.println(colors.contains("Grey"));
		
		for (String color : colors) {
			System.out.println(color);
		}
		System.out.println("----------");
		
		
		// TreeSet With Integer
		TreeSet<Integer> values = new TreeSet<>();
		
		values.add(13);
		values.add(15);
		values.add(43);
		values.add(32);
		
		for (int value : values) {
			System.out.println(value);
		}

	}

}
