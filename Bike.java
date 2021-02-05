package factorydesignpattern;
/**
 * Bike object class
 * @author miller
 */
public class Bike {
	//attributes
	String name;
	double price;
	int numWheels;
	boolean hasPedals;
	boolean hasTrainingWheels;
	
	/**
	 * triggers the creation process of the bike
	 */
	public void createBike()
	{
		this.createFrame();
		this.addWheels();
		this.addPedals();
	}
	
	/**
	 * displays the frame being created
	 */
	public void createFrame()
	{
		System.out.println("Assembling " + this.name + " frame");
	}
	
	/**
	 * displays the wheels being added
	 */
	public void addWheels()
	{
		if (this.numWheels > 0)
		{
			System.out.println("Adding " + this.numWheels + " wheel(s)");
			if (this.hasTrainingWheels == true)
			{
				System.out.println("Adding Training Wheels");
			}
		}
	}
	
	/**
	 * displays the pedals being added
	 */
	public void addPedals()
	{
		if (this.hasPedals == true)
		{
			System.out.println("adding Pedals");
		}
	}
	
	/**
	 * gets the price of the bike
	 * @return price of the bike
	 */
	public double getPrice()
	{
		return this.price;
	}
}
