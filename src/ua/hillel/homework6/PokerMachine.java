package ua.hillel.homework6;

import java.util.Random;

public class PokerMachine {


    public  void serveCardsToPlayers(int noOfPlayers, Deck deck) {
        int index = 0;
        for (int round = 0; round <=5; round++) {
            System.out.println("Round " + round);
            for (int player = 1; player < noOfPlayers; player++) {
                System.out.println(String.format("Players %d gets card %s%n", + player, deck.getCard(index++)));
            }
            System.out.println("");
        }
    }

    public void shuffleDeck(Deck deck) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(52);
            int out = random.nextInt(52);

            Card tempCard = deck.getCard(in);
            deck.setCard(in, deck.getCard(out));
            deck.setCard(out, tempCard);

        }
    }

    public Deck createDeck() {
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        String[] values = {"King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Deuce","Ace",};


        Deck deck = new Deck();
        for (String suit: suits) {
            for (String value: values) {
                Card card = new Card(value, suit);
                deck.addCard(card);
            }
        }
        return deck;
    }
}
