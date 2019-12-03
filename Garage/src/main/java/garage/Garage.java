package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void deleteVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void deleteVehicleType(Class<?> vehicleType) {
		for (Vehicle v : vehicles) {
			if (v.getClass() == vehicleType) {
				deleteVehicle(v);
			}
		}
	}

	public void emptyGarage() {
		this.vehicles.clear();
	}
	


	public void showVehicles() {
		
		int carCount = 0;
		int bikeCount = 0;
		int planeCount = 0;
		
		if (vehicles.size() < 1) {
			System.out.println("The garage is currently empty");
		} else {
			
			for (Vehicle v : vehicles) {
			if (v instanceof Car) {
				carCount++;
			} else if (v instanceof Motorbike) {
				bikeCount++;
			} else if (v instanceof Plane) {
				planeCount++;
			}
			}
			System.out.println("The garage contains " + carCount + " cars, " + bikeCount + " motorbikes, and " + planeCount + " planes.");	
			
		}
	}

	public void bill() {
		int bill = 0;
		for (Vehicle v : vehicles) {
			bill += v.calculateBill();
		}
		System.out.println("Your total bill is: £" + bill);
	}

}
