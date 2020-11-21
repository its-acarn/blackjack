import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Player dealer;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.dealer = new Player("DEALER");
        this.players = new ArrayList<>();
    }

//  Getters & Setters
    public Deck getDeck() {
        return this.deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player getDealer() {
        return this.dealer;
    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

//  Game Logic
    public int playerCount() {
        return this.players.size();
    }

    public void prepareDeck() {
        this.deck.populate();
        this.deck.shuffle();
    }

    public void addPlayers(int num_of_players) {
        for(int i = 1; i < (num_of_players + 1); i++) {
            this.players.add(new Player(Integer.toString(i)));
        }
    }

    public ArrayList<Card> startDeal() {
        ArrayList<Card> twoCards = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            Card cardDealt = this.deck.getCardDeck().get(i);
            this.deck.getCardDeck().remove(cardDealt);
            twoCards.add(cardDealt);
        }

        return twoCards;
    }

    public void playersStartingHand() {
        for(int i = 0; i < this.playerCount(); i++) {
            this.players.get(i).setStartingHand(this.startDeal());
        }
    }

    public void dealerStartingHand() {
        this.dealer.setStartingHand(this.startDeal());
    }

    public void totalPlayerScores() {
        for(int i = 0; i < this.playerCount(); i++) {
            Player player = this.players.get(i);
            int totalScore = player.getScore();

            for(int j = 0; j < player.handCardCount(); j++) {
                totalScore = totalScore + player.getHand().get(j).getValueRank();
                player.setScore(totalScore);
            }
        }
    }

    public void totalDealerScore() {
        int dealerScore = this.dealer.getScore();

        for(int i = 0; i < this.dealer.handCardCount(); i++) {
            dealerScore = dealerScore + this.dealer.getHand().get(i).getValueRank();
            this.dealer.setScore(dealerScore);
        }
    }

    public String determineWinner() {
        int dealerScore = this.dealer.getScore();
        int playerScore = this.players.get(0).getScore();

        if(dealerScore > playerScore) {
            System.out.println(this.dealer.getName());
            return "Dealer";
        } else if (playerScore > dealerScore) {
            System.out.println(this.players.get(0).getName());
            return "Player";
        } else {
            System.out.println("DRAW");
            return "DRAW";
        }
    }
}
