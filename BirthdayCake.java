package csce247factoryDesignPattern;
/**
 * This is the Birthday cake class
 * @author aniruthsivakumar
 */

import java.util.ArrayList;

public class BirthdayCake extends Cake {

	/**
	 * This is the Birthday cake Constructor
	 */
	
	public BirthdayCake() {
		super();
		name = "Birthday Cake";

		price = 109.99;

		numLayers = 1;

		shape = Shape.ROUND;

		flavor = "Funfetti";

		icing = "Vanilla";

		decorations.add("Sprinkles");
		decorations.add("Icing Writings");
		decorations.add("Candy Flowers");
	}

}
