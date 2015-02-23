/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("6" , "Diamonds" , 6);
		System.out.println("Exected: 6 of Diamonds (point value = 6)");
		System.out.println("Actual: "+ card1.toString());
		Card card2 = new Card("Jack" , "Hearts" , 11);
		System.out.println("\nExected: Jack of Hearts (point value = 11)");
		System.out.println("Actual: "+ card2.toString());
		Card card3 = new Card("6" , "Diamonds" , 6);
		System.out.println("\nExected: 6 of Diamonds (point value = 6)");
		System.out.println("Actual: "+ card1.toString());
		
		System.out.println("\nExpected: false");
		System.out.println("Actual: " + card1.matches(card2));
		System.out.println("\nExpected: true");
		System.out.println("Actual: " + card1.matches(card3));
	}
}
