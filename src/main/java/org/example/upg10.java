package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class upg10 {
    public static void main(String[] args) {

        // produkt pris
        Map<String, Double> products = new HashMap<>();





        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input your action (Add/Remove/Get)");

            String action = scanner.nextLine();

            switch (action) {
                case "Add":

                    System.out.println("Input Product name : ");
                    String productNameToAdd = scanner.nextLine();
                    System.out.println("Input Product cost: ");
                    double costToAdd = scanner.nextDouble();
                    products.put(productNameToAdd, costToAdd);
                    break;
                case "Remove":

                    System.out.println("Input Product name : ");
                    String productNameToRemove = scanner.nextLine();
                    products.remove(productNameToRemove);
                    break;

                case "Get":
                    System.out.println("Input Product name : ");
                    String productNameToGet = scanner.nextLine();
                    double cost = products.get(productNameToGet);
                    System.out.println(productNameToGet+" Cost is : "+ cost);
                    break;
            }

        }


    }
}
