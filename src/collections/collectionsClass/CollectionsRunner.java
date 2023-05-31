package collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {

    public static void main(String[] args) {
        List<Card> deckOfCard = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCard.add(new Card(suit, face));
            }
        }

        System.out.println("Original deck of cards");
        printOutput(deckOfCard);
        Collections.shuffle(deckOfCard);

        System.out.println("\n\nCards after shuffle");
        printOutput(deckOfCard);

        Collections.sort(deckOfCard, new CardComparator());
        Collections.sort(deckOfCard);
        System.out.println("\n\nCards after sorting");
        printOutput(deckOfCard);
        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCard, card);
        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found");
        }
        List<Card> cardList = new ArrayList<>(deckOfCard);
        Collections.fill(cardList,card);
        printOutput(cardList);

    }

    private static void printOutput(List<Card> deckOfCard) {
        for (int i = 0; i < deckOfCard.size(); i++) {
            System.out.printf("%-20s %s", deckOfCard.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}
