import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player playerOne;
    Player playerTwo;
    Card cardOne;
    Card cardTwo;

    @Before
    public void before() {
        playerOne = new Player("Andrew");
        playerTwo = new Player("Iain");
        cardOne = new Card(CardSuit.DIAMONDS, CardRank.ACE);
        cardTwo = new Card(CardSuit.CLUBS, CardRank.ACE);
    }

    @Test
    public void checkStartingHand() {
        assertEquals(0, playerOne.handCardCount());
    }

    @Test
    public void canAddCardToHand__oneCard() {
        playerOne.addToHand(cardOne);
        assertEquals(1, playerOne.handCardCount());
    }

    @Test
    public void canAddCardToHand__twoCards() {
        playerOne.addToHand(cardOne);
        playerOne.addToHand(cardTwo);
        assertEquals(2, playerOne.handCardCount());
    }


}
