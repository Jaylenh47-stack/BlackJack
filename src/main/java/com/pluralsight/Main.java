package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Deck deck = new Deck();
        deck.shuffle();

        //Prompt for number of players
        int numberOfPlayers = ConsoleHelper.promptForInt("Enter the number of players ");
        ArrayList<Player> players = new ArrayList<>();

        //Create players and add them to ArrayList
        for(int i = 0; i < numberOfPlayers; i++ ) {
            Player p = new Player(ConsoleHelper.promptForString("Enter player name"), new Hand());
            players.add(p);
            //deal 2 cards to each player
            for(int d = 0; d <2; d++) {
                p.getHand().Deal(deck.deal());
            }
        }

        //display every player's hand and value

        for(Player p : players){
            System.out.println(p.getName() + "'s hand: ");
            p.getHand().displayHand();
            int handValue = p.getHand().getValue();
            System.out.println(p.getName() + "'s hand is worth " + handValue);
        }

        //Ask if they want to hit or stay, deal for hit
        for(Player p : players){
            String hitOrStay = ConsoleHelper.promptForString(String.format("Would you like to hit or stay, %s?", p.getName()));
            if(hitOrStay.equalsIgnoreCase("hit")){
                p.getHand().Deal(deck.deal());
            }
        }

        //Display updated hands and values
        for (Player p :players){
            int handValue = p.getHand().getValue();
            System.out.println(p.getName() + "'s cards: ");
            p.getHand().displayHand();
            System.out.println(p.getName() + "'s hand is worth " + handValue);
        }


        //Determine winner
        ArrayList<Player> possibleWinners = new ArrayList<>();
        for (Player p : players){
            // Add scores into an arrayList if score is <= 21
            int handValue = p.getHand().getValue();
            if (handValue <= 21){
                possibleWinners.add(p);
            }
        }

        //the highest score in possibleWinners is the winner
        Player winningPlayer = possibleWinners.get(0);
        for(Player p : possibleWinners){
            //compare winning player to every players hand value in list
            int handValue = p.getHand().getValue();
        }




        //deck.deal() returns the value of a card that has been removed from the deck.
        //that value is sent into the .Deal method of the hand that belongs to the p1 object.
        //        Card c = deck.deal();
        //        Hand h = p1.getHand();            same as p1.getHand().Deal(deck.deal());
        //        h.Deal(c);



       //show cards in hand and value of hand
//        p1.getHand().displayHand();
//       int handValue1 = p1.getHand().getValue();
//       System.out.printf("Player 1's hand is worth " + handValue1);
//       System.out.println();
//
//       p2.getHand().displayHand();
//       int handValue2 = p2.getHand().getValue();
//       System.out.printf("Player 2's hand is worth " + handValue2);
//        System.out.println();


//        //determine winner
//       if (handValue1 > handValue2){
//           System.out.println("Player 1 wins!");
//       }
//       else if (handValue2 > handValue1){
//           System.out.println("Player 2 wins!");
//       }
//       else{
//           System.out.println("We have a tie!");
//       }







//        System.out.println(p1.getHand());
//        System.out.println(p2.getHand());







//            String hitOrStay = ConsoleHelper.promptForString("Do you want to hit or stand?");
//            if (hitOrStay.equalsIgnoreCase("hit")){
//                Player.hand.Deal(deck.deal());
//            }












    }

}
