package csce247factoryDesignPattern;

/**
 * This is the cake class 
 * @author aniruthsivakumar
 */


import java.util.ArrayList;

public class Cake {

	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;

	
	
	/**
	 * This is the createCake method that creates the cake using 
	 * three separate functions
	 */
	public void createCake() {
		this.createLayers();
		this.frostCake();
		this.addDecorations();

	}
	
	
	/**
	 * This is the Cake constructor to create the ArrayList
	 */
	

	public Cake() {
		decorations = new ArrayList<>();
	}

	/**
	 * This method sets the number of layers
	 */
	
	private void createLayers() {
		switch (shape) {
		case ROUND:
			System.out.println(
					"Creating a " + numLayers + " layered " + shape.toString().toLowerCase() + " " + flavor + " cake");
			break;

		case SHEET:
			if (numLayers != 1) {
				System.out.println("Creating a " + numLayers + " layered " + shape.toString().toLowerCase() + " "
						+ flavor + " cake");
				break;
			} else {
				System.out.println("Creating a 1 layer " + shape.toString().toLowerCase() + " " + flavor + " cake");
				break;
			}
		}
	}

	
	
	/**
	 * This method frosts the cake
	 */
	
	private void frostCake() {
		System.out.println("Frost cake with" + icing + "icing.");

	}

	
	/**
	 * This method outputs the decorations of the cake
	 */
	
	private void addDecorations() {
		for (String item : decorations) {
			System.out.println("Adding " + item);
		}
	}

	/**
	 * This method gets the Price of the cake
	 * @return double price
	 */
	
	public double getPrice() {
		return price;
	}

}
