package org.example;

// Katalog med telefonnummer:
//Skapa en Map<String, String> där nyckeln är en persons namn och värdet är
//personens telefonnummer. Låt användaren mata in ett namn och skriv ut
//motsvarande telefonnummer.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class upg3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("Vigor", "0701234568");
        map.put("Adam", "0701337420");
        map.put("Erik", "0731231423");
        map.put("Gunnar", "0701234568");

        System.out.println("Skriv in ett namn för dess telefonnummer:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        if (map.containsKey(scanner)) {
            System.out.println("The number of "+ scanner+ "is" + map.get(scanner));
        } else {
            System.out.println("This person does not have a number");
        }
        // this is going to be input
        //System.out.println(map.get(input));

    }
}
