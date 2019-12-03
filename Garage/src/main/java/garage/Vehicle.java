package garage;

public abstract class Vehicle {
	
	private int topSpeed;
	private int noOfWheels;
	private int engineSize;
	
	public Vehicle(int topSpeed, int noOfWheels, int engineSize) {
		this.topSpeed = topSpeed;
		this.noOfWheels = noOfWheels;
		this.engineSize = engineSize;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public abstract int calculateBill();

}
