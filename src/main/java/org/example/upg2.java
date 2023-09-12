package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class upg2 {

    //2. Lista av Studenter:
    //Skapa en List<String> med 5 studentnamn. Låt användaren mata in ett namn och
    //kontrollera om studenten finns i listan. Skriv ut ett meddelande baserat på om
    //studenten finns eller inte. Tips : list.contains(Key)

    public static void main(String[] args) {

        //list and what list should contain
        List<String> students = new ArrayList<String>();
        students.add("kigor");
        students.add("adam");
        students.add("erik");
        students.add("andreas");
        students.add("oscar");

        //System.out.println(list);

        // Can be improved with cap
        System.out.println("Skriv ett namn och se om det finns i listan: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();


        if (students.contains(input)) {
            System.out.println("This person exists in the list!");
        } else {
            System.out.println("This person does not exist in the list!");
        }






    }
}
