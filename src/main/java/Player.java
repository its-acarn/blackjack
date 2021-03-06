import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    //Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //Further logic on player
    public int handCardCount() {
        return this.hand.size();
    }

    public void setStartingHand(ArrayList<Card> startingHand) {
        this.hand = startingHand;
    }

    public void addToHand(Card card) {
        this.hand.add(card);
    }
}
