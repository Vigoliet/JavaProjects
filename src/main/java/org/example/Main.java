package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Dagar i Veckan med switch-case:
        //Skriv ett program som låter användaren mata in ett nummer mellan 1 och 7 och
        //programmet ska skriva ut motsvarande dag i veckan med hjälp av en switch-case.
        //Bonus : Lös samma uppgift med hjälp av en array istället för en switch case.

        System.out.println("Skriv ett tal mellan 1-7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();


        switch (day){
            case 1:
                System.out.println("Måndag");
                break;

            case 2:
                System.out.println("Tisdag");
                break;

            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;

            default:
                System.out.println("Du har inte anget ett tal mellan 1-7");
                break;
        }

    }


}