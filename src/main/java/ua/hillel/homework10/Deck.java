package ua.hillel.homework10;



public class Deck {
    private int noOfCards = 52;
    private int noOfPlayers = 4;
    private int inIndex = 0;
    private int outIndex = 0;

    private Card[] deck = new Card[noOfCards];

    public void addCard(Card card) {
        if (!(inIndex >= noOfCards)) {
            deck[inIndex++] = card;
        }
    }

    public Card getCard(int i) {
        return deck[i];
    }

    public void setCard(int index, Card card) {
        deck[index] = card;
    }
}
