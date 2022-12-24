package ua.hillel.homework10;

public class DeckNotShuffleException extends Exception {
    public DeckNotShuffleException(String deckShuffleException) {
        super(deckShuffleException);
    }
}
