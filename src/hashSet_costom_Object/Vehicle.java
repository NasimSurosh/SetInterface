package hashSet_costom_Object;

import java.util.Objects;

public class Vehicle {

	int serialNumber;
	String type;

	public Vehicle(int serialNumber, String type) {
		this.serialNumber = serialNumber;
		this.type = type;
	}

	public String toString() {
		return "Whicle [serialNumber=" + serialNumber + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return serialNumber == other.serialNumber;
	}
	
	
}
