
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
		String[] Suits1 = {"spades", "diamonds"};
		String[] Ranks1 = {"seven"};
		int[] Points1 = {7};
		Deck deck = new Deck(Ranks1,Suits1,Points1);
		
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		System.out.println(deck.deal());
		System.out.println("\n");
		
		String[] Suits2 = {"spades", "spades"};
		String[] Ranks2 = {"jack", "jack"};
		int[] Points2 = {11,11};
		Deck deck2 = new Deck(Ranks2,Suits2,Points2);
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println("\n");
		
		String[] Suits3 = {"clubs", "hearts"};
		String[] Ranks3 = {"jack", "ace"};
		int[] Points3 = {11,1};
		Deck deck3 = new Deck(Ranks3,Suits3,Points3);
		
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		System.out.println("\n");
		
		String[] SuitsDeck = {"clubs", "hearts", "diamonds", "spades"};
		String[] RanksDeck = {"ace", "two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
		int[] PointsDeck = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck fullDeck = new Deck(RanksDeck,SuitsDeck,PointsDeck);
		System.out.println(fullDeck.isEmpty());
		System.out.println(fullDeck.size());
		System.out.println(fullDeck.deal());
		System.out.println(fullDeck);
		
	}
}
