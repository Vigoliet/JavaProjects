package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class upg4v2 {
    public static void main(String[] args) {

        //0: F 1:E 2:D 3:C 4:B 5:A

        List<Integer> betyg = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            betyg.add(scanner.nextInt());
        }

        //räkna ut summan av betygen
        int sum = 0;
        for (int i = 0; i < betyg.size(); i++) {
            sum+= betyg.get(i);
        }
        double average = (double)sum/betyg.size();

        switch ((int)average) {
            case 0:
                System.out.println("F");
                break;
            case 1:
                System.out.println("E");
            case 2:
                System.out.println("D");
            case 3:
                System.out.println("C");
            case 4:
                System.out.println("B");
            case 5:
                System.out.println("A");

        }
    }
}
