package garage;

public class Plane extends Vehicle{

	private int noOfEngines;
	
	public Plane(int topSpeed, int noOfWheels, int engineSize, int noOfEngines) {
		super(topSpeed, noOfWheels, engineSize);
		this.noOfEngines = noOfEngines;
	}
	
	public int getNoOfEngines() {
		return noOfEngines;
	}

	public void setNoOfEngines(int noOfEngines) {
		this.noOfEngines = noOfEngines;
	}

	@Override
	public int calculateBill() {
		return getTopSpeed() * getEngineSize() * (noOfEngines ^ 2);
	}

}
