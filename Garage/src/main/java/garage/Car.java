package garage;

public class Car extends Vehicle {
	
	private int noOfDoors;
	
	public Car(int topSpeed, int noOfWheels, int engineSize, int noOfDoors) {
		super(topSpeed, noOfWheels, engineSize);
		this.noOfDoors = noOfDoors;
	}


	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	@Override
	public int calculateBill() {
		return getTopSpeed() * getNoOfWheels() * (getEngineSize() + noOfDoors);
	}

}
