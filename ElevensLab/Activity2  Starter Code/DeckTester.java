/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {3,4,5};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.toString());
		System.out.println("Expected Size: 6\t Actual: " + deck1.size() + "\n\n");
		deck1.deal();
		System.out.println("Expected Size: 5\t Actual: " + deck1.size() + "\n\n");
		
		ranks = new String[] {"D", "E", "F"};
		suits = new String[] {"Zack", "Michael" , "Swartz"};
		values = new int[] {5,12,13};
		Deck deck2 = new Deck(ranks, suits, values);
		System.out.println(deck2.toString());
		
		ranks = new String[] {"X", "Y", "Z"};
		suits = new String[] {"Something", "Something Else" , "Another Thing"};
		values = new int[] {8,15,17};
		Deck deck3 = new Deck(ranks, suits, values);
		
		deck3.deal();
		System.out.println(deck3.toString());
	}
}
