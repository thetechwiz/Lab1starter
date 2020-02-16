package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 *        cardsInDeck - attribute keeping track of the cards that are in the
	 *        deck. The attribute is valued in the Constructor for the class, and
	 *        items are removed from the collection in the 'Draw' method
	 */
	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 *        Default no-arg constructor. Create a single deck of cards, make sure
	 *        it's shuffled.
	 */
	public Deck() {
		this(1);
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @param iNbrOfDecks - Number of decks to include in the cardsInDeck attribute.
	 * 
	 *                    One argument Constructor... If '2' is passed in, make sure
	 *                    cardsInDeck contains two 52-card decks. Make sure the deck
	 *                    is shuffled.
	 */
	public Deck(int iNbrOfDecks) {
		//TODO - Implement the constructor
		for(int i = 0; i<iNbrOfDecks; i++) {
			for(eRank tempRank : eRank.values()) {
				for(eSuit tempSuit : eSuit.values()) {
					if(!tempRank.equals(eRank.JOKER) && !tempSuit.equals(eSuit.JOKER)) {
						Card temp = new Card(tempSuit,tempRank);
						this.cardsInDeck.add(temp);
					}
				}
			}
		}
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return Card object
	 * @throws DeckException
	 */
	public Card Draw() throws DeckException {
		//Implement this method.  Shouldn't return null, return the right value
		Card temp = this.cardsInDeck.get(0);
		this.cardsInDeck.remove(0);
		return temp;
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return Number of cards remaining in the deck
	 * 
	 * getiDeckCount - Return the number of cards remaining in the deck.
	 */
	public int getiDeckCount() {
		//houldn't return 0, return the right value
		return this.cardsInDeck.size();
	}

 
	/**
	 * getCardsInDeck - getter for cardsInDeck.  It's private, must be invoked
	 * with reflections.
	 * 
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * @return - the cards in the deck.
	 */
	private ArrayList<Card> getCardsInDeck() {
		//Implement this method.  Shouldn't return 0, return the right value
		return this.cardsInDeck;
	}
 
	
	
}