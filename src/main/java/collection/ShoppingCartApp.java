/**
 *   File Name: ShoppingCartApp.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aprile 10, 2016
 *
 */

package collection;

import java.util.*;

/**
 * ShoppingCartApp A Shopping Cart type app. This app collects items while you
 * are browsing an online store to be later checked out for processing.
 * <p>
 * The application contains a String[] array to represent the SCU of all the
 * items the user wants to purchase. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The SCUs are entered in insertion order as the user
 * browses the site and adds items to their cart. User can add more than one of
 * the same item. There are minimal additions to the center of the collection
 * however it is common to iterate through all the items as well as add new
 * items to the end of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

// ArrayList
public class ShoppingCartApp {

	private static String[] items = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083", "SQASOL9845", "VACAT9845" };

	/**
	 * A static method to display a elements
	 *
	 * @param cart
	 *            ShoppingCart instance to work with
	 */
	public static void displayElementsStatic(ArrayList al) {
		System.out.println("Contents of this static ArrayList:");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\t" + al.get(i));
		}
		System.out.println("\n");

	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {

		ShoppingCartApp cart = new ShoppingCartApp(items);
		cart.displayElements();
		cart.addElement("MEDIC2541");
		cart.displayElements();
		cart.removeElement("MEDIC2541");
		cart.displayElements();

		ArrayList alStatic = new ArrayList();
		for (int i = 0; i < items.length; i++) {
			alStatic.add(items[i]);
		}
		displayElementsStatic(alStatic);
	}

	ArrayList al = new ArrayList();

	/**
	 * Constructor
	 */
	public ShoppingCartApp(String[] items) {
		for (int i = 0; i < this.items.length; i++) {
			this.al.add(this.items[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String val) {
		this.al.add(val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		int index = this.al.indexOf(val);
		this.al.remove(index);
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		System.out.println("Contents of this ArrayList:");
		for (int i = 0; i < this.al.size(); i++) {
			System.out.println("\t" + this.al.get(i));
		}
		System.out.println("\n");
	}

}
