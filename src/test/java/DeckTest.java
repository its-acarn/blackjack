import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card1;

    @Before
    public void before() {
        deck = new Deck();
        card1 = new Card(CardSuit.SPADES, CardRank.ACE);
    }

    @Test
    public void deckHasNoCards() {
        assertEquals(0, deck.getNumOfCards());
    }

    @Test
    public void checkAddOneCardToDeck() {
        deck.addCardToDeck(card1);
        assertEquals(1, deck.getNumOfCards());
    }

    @Test
    public void checkAddMultipleCardsToDeck() {
        deck.addCardToDeck(card1);
        deck.addCardToDeck(card1);
        deck.addCardToDeck(card1);
        deck.addCardToDeck(card1);
        assertEquals(4, deck.getNumOfCards());
    }

    @Test
    public void deckHas52Cards() {
        deck.populate();
        assertEquals(52, deck.getNumOfCards());
    }
}
