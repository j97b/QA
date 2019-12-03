package garage;

public class App {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Car car = new Car(150,4,3,5);
		Car car2 = new Car(65,3,1,2);
		Motorbike bike = new Motorbike(120, 2, 1, 4);
		Motorbike bike2 = new Motorbike(80,2,2,1);
		Plane plane = new Plane(500,3,60,4);
		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(bike);
		garage.addVehicle(bike2);
		garage.addVehicle(plane);
		garage.showVehicles();
		garage.bill();
		bike.doesWheelie();
		garage.bill();
		garage.deleteVehicle(car2);
		garage.showVehicles();
		garage.emptyGarage();
		garage.showVehicles();

	}
}
