package org.example;

import java.util.Scanner;

public class upg9 {

    //Skapa ett program där användaren kan välja en av operationerna: addition,
    //subtraktion, multiplikation eller division genom att mata in en bokstav (t.ex. 'A' för
    //addition). Använd switch-case för att utföra den valda operationen på två inmatade
    //tal.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(operation);

        switch (operation) {
            case "+":
                System.out.println("a+b");
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "*/":
                System.out.println(a/b);
                break;

        }

    }
}
