/**
 *   File Name: MediaManager.java<br>
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
 * MediaManager A Media Manger Software. This software collects media for a
 * video rental store.
 * <p>
 * The software contains a String[] array to represent the names of all the
 * items the user wants to rent. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The media collection can not have any duplicates as
 * it would not makes sense to rent any of the same two items. All media should
 * be kept in natural order based on the name of the media.
 * <p>
 * There are methods to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

// Tree Set

public class MediaManager {
	/**
	 * A static method to display a elements
	 *
	 * @param mediaManager
	 *            MediaManager instance to work with
	 */
	public static void displayElements(MediaManager mediaManager) {
		// Provide logic to view elements in collection for TrendingTags
		// instance

	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		MediaManager mediaManager = new MediaManager();
		mediaManager.displayElements();
		mediaManager.addElement("MEDIC2541");
		mediaManager.displayElements();
		mediaManager.removeElement("MEDIC2541");
	}

	String[] media = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083", "SQASOL9845", "VACAT9845", "LAMPO3982" };

	TreeSet ts = new TreeSet();

	/**
	 * Default constructor
	 */
	public MediaManager() {
		for (int i = 0; i < this.media.length; i++) {
			this.ts.add(this.media[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String val) {
		this.ts.add(val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		this.ts.remove(val);
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		Iterator iterator;
		iterator = this.ts.iterator();
		// displaying the Tree set data
		System.out.println("Tree set data in ascending order: ");
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}
		System.out.println("\n");
	}
}
