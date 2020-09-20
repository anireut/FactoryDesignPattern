package csce247factoryDesignPattern;
/**
 * The bakery class houses the methods for createCake and orderCake.
 * @author aniruthsivakumar
 *
 */

public class Bakery extends Cake{
	
	/**
	 * This method takes in the type of cake and creates a cake using the createCake method.
	 * The price is outputted to the console.
	 * @param type of cake is passed in
	 * @return the price and cake itself are returned
	 */
	
	public Cake orderCake(String type) {
	
		Cake cake = createCake(type);
		cake.createCake();
		
		System.out.println("Price: $" + cake.getPrice());
		return cake;
	}
	
	/**
	 * This method takes in the type of cake creates the cake itself
	 * @param type of cake is passed in
	 * @return the cake is returned
	 */
	
	
	
	public Cake createCake(String type) {
		
		
		if(type.equalsIgnoreCase("Birthday Cake"))
		{
			return new BirthdayCake();
		}
		else if (type.equalsIgnoreCase("Carrot Cake"))
		{
			return new CarrotCake();
		}
		else if (type.equalsIgnoreCase("Black Forest Cake"))
		{
			return new BlackForestCake();
		}
		else
		{
			return new Cake();
		}
		

	}
}
