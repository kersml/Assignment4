package factorydesignpattern;

public class KidsBike extends Bike{

	/**
	 * constructs a kids bike
	 */
	public KidsBike()
	{
		this.name = "kids bike";
		this.numWheels = 2;
		this.hasPedals = true;
		this.hasTrainingWheels = true;
		this.price = 80.99;
	}
}
