package hashSet_costom_Object;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Vehicle> vehicles = new HashSet<>();

		vehicles.add(new Vehicle(111, "car"));
		vehicles.add(new Vehicle(23432, "bus"));
		vehicles.add(new Vehicle(64345, "Truck"));
		vehicles.add(new Vehicle(23472, "Cycle"));

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}

	}

}
