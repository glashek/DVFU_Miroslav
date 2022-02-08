package ru.dvfu.mrcpk.java01.TwentyOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {
    private static int nextId = 1; // first player has index 1, not 0

    private int id;
    private ArrayList<Card> cards;
    private int value; //sum of values of cards in hand

    Hand(Deck deck) {
        this.setId(); // set ID to player (hand)
        cards = new ArrayList<Card>();
        // in the start hand has 2 cards
        for (int i = 0; i <= 1; i++) {
            cards.add(deck.drawFromDeck());
        }
    }

    void setId() {
        id = nextId;
        nextId++;
    }

    int getId() {
        return id;
    }

    void getAdditionalCards(Deck deck) {
        String userAnswer;
        Scanner scan = new Scanner(System.in);
        boolean takeCard = true;

        while (takeCard) {
            System.out.println("\nPlayer #" + this.getId()
                    + ". Sum of your cards: " + this.getValueOfHand()
                    + ". Do you want to take one more card? 'Y' or 'N'...");
            userAnswer = scan.next();
            switch (userAnswer.toUpperCase()) {
                case "Y": cards.add(deck.drawFromDeck());
                    this.showCardsInHand();
                    break;
                case "N": takeCard = false;
                    break;
                default:  System.out.print("Incorrect input. Try again.");
                    break;

            }
        }

    }

    void showCardsInHand() {
        System.out.print("\nCards of player #" + this.getId() + ": ");
        for (Card i : cards) {
            System.out.print(i.getNameOfCard() + "; ");
        }
    }

    int getValueOfHand() {
        value = 0; // reset value when player take additional card
        for (Card i : cards) {
            // e.g. index of Ace equals 0, but value of Ace equals 1
            value += i.getRank() + 1;
        }
        return value;
    }

    void printValueOfHand() {
        System.out.print("Sum of your cards: " + this.getValueOfHand());
    }

    void compareHands(Hand another) {
        if (this.getValueOfHand() == another.getValueOfHand()) {
            System.out.print("Draw!");
        } else if (this.getValueOfHand() == 21) {
            System.out.print("Player #" + this.getId() + " wins!");
        } else if (another.getValueOfHand() == 21) {
            System.out.print("Player #" + another.getId() + " wins!");
        } else if (this.getValueOfHand() > 21 && another.getValueOfHand() < 21) {
            System.out.print("Player #" + another.getId() + " wins!");
        } else if (this.getValueOfHand() < 21 && another.getValueOfHand() > 21) {
            System.out.print("Player #" + this.getId() + " wins!");
        } else if (this.getValueOfHand() < 21 && another.getValueOfHand() < 21) {
            if (this.getValueOfHand() > another.getValueOfHand()) {
                System.out.print("Player #" + this.getId() + " wins!");
            } else {
                System.out.print("Player #" + another.getId() + " wins!");
            }
        } else if (this.getValueOfHand() < another.getValueOfHand()) {
            System.out.print("Player #" + this.getId() + " wins!");
        } else {
            System.out.print("Player #" + another.getId() + " wins!");
        }
    }
}
