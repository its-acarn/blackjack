import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Deck deck;
    Player playerOne;
    Player playerTwo;
    Game game;

    @Before
    public void before() {
        deck = new Deck();
        playerOne = new Player("Iain");
        playerTwo = new Player("Andrew");
        game = new Game(deck);
    }





    
}
