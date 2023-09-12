package org.example;

//Ta bort från en Lista:
//Skapa en List<String> med några fruktnamn. Låt användaren mata in ett fruktnamn
//för att ta bort det från listan. Om frukten inte finns, informera användaren om det
// Bonus: Gör så att användaren kan lägga till nya frukter genom att skriva +fruktnamn,
//och -fruktnamn för att ta bort

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class upg6 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Pear");

        System.out.println(fruits);

        Scanner scanner = new Scanner(System.in);


        //+äpple måste seperera
        String operation = scanner.nextLine();

        //+Apple
        if (operation.startsWith ("+")){
            String fruitToAdd = operation.substring(1);
            System.out.println("vi ska lägga in " +fruitToAdd);
            fruits.add(fruitToAdd);
            System.out.println(fruits);

        } else if (operation.startsWith ("-")) {

        String fruitToRemove = operation.substring(1);
        System.out.println("Vi ska ta bort " + fruitToRemove);

        if (fruits.contains(fruitToRemove)) {
            System.out.println(fruits);
            fruits.remove(fruitToRemove);
        }

        } else {
            System.out.println("Du har gjort fel, gör om!");
        }
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }




    }
}
