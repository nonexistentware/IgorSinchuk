package ua.hillel.homework10;


public class Main {
    public static void main(String[] args) throws DeckNotShuffleException {
        PokerMachine pokerMachine = new PokerMachine();
        Deck deck = pokerMachine.createDeck();

        pokerMachine.shuffleDeck(deck);

        boolean isShuffleDeck;
        if (isShuffleDeck = true) {
            pokerMachine.serveCardsToPlayers(5, deck);
        } else {
        } throw new DeckNotShuffleException("Deck not shuffle");
    }
}
