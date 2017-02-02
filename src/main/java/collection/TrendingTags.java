/**
 *   File Name: TrendingTags.java<br>
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
 * TrendingTags A Twitter type software. This software captures popular tags and
 * collects the top ten most popular words.
 * <p>
 * The application contains a String[] array to represent the top words which
 * should be converted to a valid collection type to satisfy user requirements:
 * > Optimal performance while satisfying requirements > The words are entered
 * in insertion order. There CAN BE duplicate words although other logic in
 * application prevents this from happening. Words will be accessed from within
 * the middle of the collection performing a large amount of additions and
 * removals from within the middle of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TrendingTags {

	/**
	 * A static method to display a TrendingTags's elements
	 *
	 * @param tags
	 *            TrendingTags instance to work with
	 */
	public static void displayElements(TrendingTags tags) {
		// Provide logic to view elements in collection for TrendingTags
		// instance

	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// non-static
		TrendingTags tags = new TrendingTags();
		tags.displayElements();
		tags.addElement("Testing");
		tags.displayElements();
		tags.removeElement("Testing");
		tags.displayElements();

	}

	LinkedList ll = new LinkedList();

	String[] words = { "Money", "SQA", "Solutions", "Java", "Learn", "Collections" };

	/**
	 * Default Constructor
	 */
	public TrendingTags() {
		for (int i = 0; i < this.words.length; i++) {
			this.ll.add(this.words[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String val) {
		this.ll.add(val);
		this.ll.add(1, val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		// removes first occurance of val:
		this.ll.remove(val);
		// removed item index 3
		this.ll.remove(3);
	}

	/**
	 * An instance method to display elements
	 */
	private void displayElements() {
		System.out.println("Contents of this Linked List:");
		for (int i = 0; i < this.ll.size(); i++) {
			System.out.println("\t" + this.ll.get(i));
		}
		System.out.println("\n");
	}
}
