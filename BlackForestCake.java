package csce247factoryDesignPattern;
/**
 * This is the Black Forest cake class
 * @author aniruthsivakumar
 */

import java.util.ArrayList;

public class BlackForestCake extends Cake {

	/**
	 * This is the Birthday cake Constructor
	 */
	
	public BlackForestCake() {
		name = "Black Forest Cake";

		price = 47.99;

		numLayers = 3;

		shape = Shape.ROUND;

		flavor = "Black Forest";

		icing = "Whipped Cream";

		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
}
