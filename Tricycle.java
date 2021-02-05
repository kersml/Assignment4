package factorydesignpattern;

public class Tricycle extends Bike{
	
	/**
	 * constructs a tricycle bike
	 */
	public Tricycle()
	{
		this.name = "tricycle";
		this.numWheels = 3;
		this.hasPedals = true;
		this.hasTrainingWheels = false;
		this.price = 54.95;
	}
	
}