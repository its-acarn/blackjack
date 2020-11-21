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

    @Test
    public void gamePlayersZero() {
        assertEquals(0, game.playerCount());
    }

    @Test
    public void gamePlayersTwo() {
        game.addPlayers(2);
        assertEquals(2, game.playerCount());
        System.out.println(game.getPlayers().get(0).getName());
        System.out.println(game.getPlayers().get(1).getName());
    }




    
}
