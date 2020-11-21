import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardDeck;

//    Constructor
    public Deck(){
        this.cardDeck = new ArrayList<>();
    }

//    Getter and setter
    public ArrayList<Card> getCardDeck() {
        return this.cardDeck;
    }

    public void setCardDeck(ArrayList<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    //  Deck logic
    public int getNumOfCards() {
        return this.cardDeck.size();
    }

    public void populate() {
        CardSuit[] suits = CardSuit.values();
        CardRank[] ranks = CardRank.values();

        for (int i=0; i < suits.length; i++) {
            for (int j=0; j < ranks.length; j++) {
                this.cardDeck.add(new Card(suits[i], ranks[j]));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cardDeck);
    }
}
