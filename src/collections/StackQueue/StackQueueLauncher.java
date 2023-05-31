package collections.StackQueue;

import collections.collectionsClass.Card;
import collections.collectionsClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
//        passengerProcessing();
        Queue<Card> cardDeck = new PriorityQueue<>(52,new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.offer(new Card(suit, face));
            }
        }

        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i<10; i++){
            cards.offerLast(cardDeck.poll());
        }
//        for (int i = 0; i<10; i++){
//            System.out.println(cards.peekLast());
//        }
        Card card = new Card(Card.Suit.SPADES,Card.Face.Ten);
        cards.removeFirstOccurrence(card);
        cards.removeLastOccurrence(card);

    }

    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Vasya", "Olibaba");
        bus.push(new Passenger("Alex", "Lion"));
        bus.push(new Passenger("Marty", "Zebra"));
        bus.push(new Passenger("Gloria", "Hipopotam"));
        bus.push(passenger);
        bus.push(new Passenger("Melman", "Giraffe"));

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.println("Last entered passenger is : " + bus.peek());
        while (!bus.empty()) {
            System.out.println("Passenger : " + bus.pop());
        }
    }
}

