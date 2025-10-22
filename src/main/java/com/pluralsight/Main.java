package com.pluralsight;

public class Main {

    public static void main(String[] args){

        Deck deck = new Deck();
        Player p1 = new Player(ConsoleHelper.promptForString("Enter player name"), new Hand());
        Player p2 = new Player(ConsoleHelper.promptForString("Enter player name"), new Hand());

        deck.shuffle();
        //deck.deal() returns the value of a card that has been removed from the deck.
        //that value is sent into the .Deal method of the hand that belongs to the p1 object.
        //        Card c = deck.deal();
        //        Hand h = p1.getHand();            same as p1.getHand().Deal(deck.deal());
        //        h.Deal(c);

      //deal 2 cards
       for(int i = 0; i <2; i++) {
           p1.getHand().Deal(deck.deal());
           p2.getHand().Deal(deck.deal());
       }

       //show value of hand and cards in hand
        p1.getHand().displayHand();

       int handValue1 = p1.getHand().getValue();
       int handValue2 = p2.getHand().getValue();
        System.out.printf("This hand is worth " + handValue1);
        System.out.println();
       // System.out.printf("This hand is worth " + handValue2);





//        System.out.println(p1.getHand());
//        System.out.println(p2.getHand());












    }

}
