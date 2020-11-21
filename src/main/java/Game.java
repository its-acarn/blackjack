import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
    }

//  Getters & Setters
    public Deck getDeck() {
        return this.deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
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
        for(int i = 1; i < num_of_players +1; i++) {
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

    public void playerStartingHand() {
        for(int i = 0; i < this.playerCount(); i++) {
            this.players.get(i).setStartingHand(this.startDeal());
        }
    }

//    public void dealCards() {
//        for (Player player : players) {
//            player.setHand(deck.deal());
//        }
//    }
}
