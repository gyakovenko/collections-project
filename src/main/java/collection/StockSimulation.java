/**
 *   File Name: StockSimulation.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *  Created: Aprile 10, 2016
 *
 */

package collection;

import java.util.*;

/**
 * StockSimulation A Stock Simulation software. This software shows securities
 * for a stock simulation where securities are trading amongst traders. A
 * Security represents an element which has a value that changes during the
 * simulation.
 * <p>
 * The application contains two String[] fields which should be converted to a
 * valid collection type to satisfy user requirements: > Optimal performance
 * while satisfying requirements > There CAN NOT be more than one Security with
 * the same name > All securities should remain in natural order based on their
 * security name.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

// Tree Map
public class StockSimulation {

	static String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper", "Iron" };

	static double[] securityValues = { 89.6, 48.39, 24.9, 12.1, 4.0, 24.9 };

	/**
	 * A static method to display a StockSimulation's elements
	 *
	 * @param sim
	 *            StockSimulation instance to work with
	 */
	public static void displayElements(StockSimulation sim) {
		// Provide logic to view elements in collection for StockSimilation
		// instance

	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StockSimulation sim = new StockSimulation();
		// Display Elements
		sim.displayElements();
		// Add and remove few elements to the collection
		sim.addElement("Ore", "30.7");
		sim.displayElements();
		sim.removeElement("Ore", "Lead");
		sim.displayElements();
		// Use a staic method version to view elements
		// displayElements(sim);
	}

	TreeMap tm = new TreeMap();

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		for (int i = 0; i < securityNames.length; i++) {
			this.tm.put(securityNames[i], securityValues[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String... val) {
		for (int i = 0; i < val.length; i = i + 2) {
			this.tm.put(val[i], Double.parseDouble(val[i + 1]));
		}
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String... val) {
		for (int i = 0; i < val.length; i++) {
			this.tm.remove(val[i]);
		}
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {

		System.out.println("Contents of this TreeMap:");
		Set set = this.tm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print("\t" + me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("\n");
	}

}
