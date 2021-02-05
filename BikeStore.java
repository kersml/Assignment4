package factorydesignpattern;

public class BikeStore extends Bike{
	
	/**
	 * orders a bike from the bike shop
	 * @param type of bike
	 * @return corresponding bike object
	 */
	public Bike orderBike(String type) {
		if(type.equalsIgnoreCase("tricycle")) 
		{
			Tricycle t = new Tricycle();
			t.createBike();
			System.out.println("Price: $" + t.getPrice());
			return t;
		}
		else if(type.equalsIgnoreCase("strider"))
		{
			Strider s = new Strider();
			s.createBike();
			System.out.println("Price: $" + s.getPrice());
			return s;
		}
		else if(type.equalsIgnoreCase("kids bike"))
		{
			KidsBike kb = new KidsBike();
			kb.createBike();
			System.out.println("Price: $" + kb.getPrice());
			return kb;
		}
		else
		{
			return null;
		}
		
	}
	
	
}
