package ua.hillel.homework6;

public class Main {
    public static void main(String[] args) {
        PokerMachine pokerMachine = new PokerMachine();
        Deck deck = pokerMachine.createDeck();

        pokerMachine.shuffleDeck(deck);
        pokerMachine.serveCardsToPlayers(5, deck);

    }
}
