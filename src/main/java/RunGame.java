public class RunGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Game game = new Game(deck);
//Intro to game
        System.out.println("Welcome to AC's Blackjack!");
        System.out.println("It is you against the Dealer, who will win?!");
        System.out.println("*Functionality for more than one player is currently under development");

        game.prepareDeck();
        game.addPlayers(1);
        game.playersStartingHand();
        game.dealerStartingHand();
        game.showCards();
        game.totalPlayerScores();
        game.totalDealerScore();
        game.determineWinnerWithOnePlayer();


    }
}
