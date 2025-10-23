package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }


    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
