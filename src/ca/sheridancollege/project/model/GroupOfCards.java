/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card.Suit;
import ca.sheridancollege.project.model.Card.Value;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Furkan Gonul
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Elisha Nesci Feb 2021
 * @author Omama EizEddin
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private static ArrayList<Card> cards;
    private int size;//the size of the grouping
    Value[] cardValues = Value.values();
    Suit[] cardSuits = Suit.values();

    public GroupOfCards(int size) {
        this.size = size;
        
    }
    
    /**
     * initial 52 Group of poker Cards
     */
    public GroupOfCards() {
        cards = new ArrayList();
        for (int i = 0; i < cardSuits.length; i++) {
            for (int j = 0; j < cardValues.length; j++) {
                Card card = new BlackjackCard(cardValues[j], cardSuits[i]);
                cards.add(card);
            }
        }
        shuffle();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public static ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
