package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //Create deck and 2 players
        Deck deck = new Deck();

        int numberOfPlayers = ConsoleHelper.promptForInt("Enter the number of players ");
        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < numberOfPlayers; i++ ) {
            Player p = new Player(ConsoleHelper.promptForString("Enter player name"), new Hand());
            players.add(p);
            //deal 2 cards to each player
            for(int d = 0; d <2; d++) {
                p.getHand().Deal(deck.deal());
            }
        }


        for(Player p : players){
            System.out.println(p.getName());
        }


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

       //show cards in hand and value of hand
        p1.getHand().displayHand();
       int handValue1 = p1.getHand().getValue();
       System.out.printf("Player 1's hand is worth " + handValue1);
       System.out.println();

       p2.getHand().displayHand();
       int handValue2 = p2.getHand().getValue();
       System.out.printf("Player 2's hand is worth " + handValue2);
        System.out.println();


        //determine winner
       if (handValue1 > handValue2){
           System.out.println("Player 1 wins!");
       }
       else if (handValue2 > handValue1){
           System.out.println("Player 2 wins!");
       }
       else{
           System.out.println("We have a tie!");
       }







//        System.out.println(p1.getHand());
//        System.out.println(p2.getHand());







//            String hitOrStay = ConsoleHelper.promptForString("Do you want to hit or stand?");
//            if (hitOrStay.equalsIgnoreCase("hit")){
//                Player.hand.Deal(deck.deal());
//            }












    }

}
