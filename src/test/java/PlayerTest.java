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
    public void playerHasHand__oneCard() {
        playerOne.setHand(cardOne);
        assertEquals(1, playerOne.handCardCount());
    }

    @Test
    public void playerHasHand__twoCards() {
        playerOne.setHand(cardOne);
        playerOne.setHand(cardTwo);
        assertEquals(2, playerOne.handCardCount());
    }
}
