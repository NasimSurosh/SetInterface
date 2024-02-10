package treeSet;

public class SubMain implements Comparable<SubMain> {
	String name;
	int age;

	public SubMain(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	/**
	 * // Alphabetical Order
	 * 
	 * @Override public int compareTo(SubMain other) {
	 *  return name.compareTo(other.name);
	 *   }
	 */

	/*
	 * // Reverse Alphabetical Order
	 * 
	 * @Override public int compareTo(SubMain other) {
	 * 
	 * return other.name.compareTo(name); 
	 * }
	 */

	/*
	 * // Natural Integer Order
	 * 
	 * @Override public int compareTo(SubMain other) { 
	 * return ((Integer)age).compareTo(other.age); }
	 */

	// Reverse age

	@Override
	public int compareTo(SubMain other) {
		// TODO Auto-generated method stub
		return ((Integer) other.age).compareTo(age);
	}
}
