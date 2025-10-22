package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        // only return the suit if the card is face up
        if(isFaceUp) {
            return suit;
        }
        else{
            return "#";
        }
    }

    public String getValue(){
            return value;
    }

    public int getPointValue(){
        switch(this.value){
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 10;
            case "Q":
                return 10;
            case "K":
                return 10;
            case "A":
                return 11;

        }
            // determine point value and return it
            // A = 11
            // K, Q, J = 10
            // all numeric cards are equal to their face value

            return 0;
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",this.value, this.suit);
    }
}
