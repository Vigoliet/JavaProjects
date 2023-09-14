package org.example.Deck;

//1- Skapa en klass som heter card.

//2- Fyll metoden med nödvändig information (Suit och Value) om ett specifikt kort samt
//get-metoder för dessa variabler. Gör även en toString() metod snyggt skriver ut den
//nödvändiga informationen.
//Tips : Låt Suit och Value vara av typen int. Använd sedan en switch i din toString()
//metod


import java.util.Random;

public class Card {

    int suit;

    int value;

    //get suit method
    public void getSuit() {
        Random randomizeSuit = new Random();
        int suit = randomizeSuit.nextInt(1, 5);

        System.out.println(suit);

        /*
        switch (suit) {
            //heart
            case 1:
                System.out.println("Heart");
                break;
            //diamond
            case 2:
                System.out.println("Diamond");
                break;
            //spades
            case 3:
                System.out.println("Spades");
                break;
            //clubs
            case 4:
                System.out.println("Clubs");
                break;
        } */

    }



}
