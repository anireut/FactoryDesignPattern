package csce247factoryDesignPattern;
/**
 * This is the Carrot cake class
 * @author aniruthsivakumar
 */
import java.util.ArrayList;

public class CarrotCake extends Cake {

	/**
	 * This is the Carrot cake Constructor
	 */
	
	public CarrotCake() {
		name = "Carrot Cake";

		price = 54.99;

		numLayers = 2;

		shape = Shape.ROUND;

		flavor = "Carrot";

		icing = "Cream Cheese";

		decorations.add("Walnuts");
		decorations.add("Candy Carrots");

	}

}
