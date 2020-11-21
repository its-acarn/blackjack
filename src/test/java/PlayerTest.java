import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player playerOne;
    Player playerTwo;
    Card cardOne;

    @Before
    public void before() {
        playerOne = new Player("Andrew");
        playerTwo = new Player("Iain");
        cardOne = new Card(CardSuit.DIAMONDS, CardRank.ACE);
    }

    @Test
    public void playerCanGetHand() {
        playerOne.setHand(cardOne);
        assertEquals(1, playerOne.handCardCount());
    }
}
