package garage;

public class Motorbike extends Vehicle {

	private int noOfWheelies;

	public Motorbike(int topSpeed, int noOfWheels, int engineSize, int noOfWheelies) {
		super(topSpeed, noOfWheels, engineSize);
		this.noOfWheelies = noOfWheelies;
	}

	public int getNoOfWheelies() {
		return noOfWheelies;
	}

	public void setNoOfWheelies(int noOfWheelies) {
		this.noOfWheelies = noOfWheelies;
	}
	
	public void doesWheelie() {
		System.out.println("I am wheelie cool");
		setNoOfWheelies(noOfWheelies + 1);
	}

	@Override
	public int calculateBill() {
		return getTopSpeed() * getNoOfWheels() * getEngineSize() * ((noOfWheelies - 1) ^ 2);
	}
	
}
