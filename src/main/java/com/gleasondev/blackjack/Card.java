package com.gleasondev.blackjack;

public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card card1 = new Card("Clubs", "King");
        Card card2 = new Card("Diamonds", "10");
        

    }
}
