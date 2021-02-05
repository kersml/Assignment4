package factorydesignpattern;

public class Strider extends Bike{
	
	/**
	 * constructs a strider bike
	 */
	public Strider()
	{
		this.name = "strider";
		this.numWheels = 2;
		this.hasPedals = false;
		this.hasTrainingWheels = false;
		this.price = 65.99;
	}
}
