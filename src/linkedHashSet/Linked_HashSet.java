package linkedHashSet;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> colors = new LinkedHashSet<>();

		colors.add("blue");
		colors.add("white");
		colors.add("red");
		colors.add("green");

		System.out.println(colors.contains("yellow"));

		for (String color : colors) {
			System.out.println(color);
		}
	}
}