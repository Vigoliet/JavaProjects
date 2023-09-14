package org.example.KlasserV2;

import org.example.Klasser.Vehicle;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ClassExamplev2 {

    public static void main(String[] args) {
        // Name, age , gender

        // 2- Skapa flera instanser av Person-klassen och ange olika egenskaper för varje person
        Person person1 = new Person("Vigor",21, "Male");
        Person person2 = new Person("Adam",30, "Male");

        Person person3 = new Person("Eva",41, "Female");
        // 13- Skapa en funktion som accepterar en Person som parameter och skriver ut personens information
        Person.personInfo(person3);



        // 10- Skapa en instans av Student-klassen och skriv ut information om studenten
        Student student1 = new Student("Adam", 20, "Male", "Aws");
        System.out.println(student1);

        // 11- Skapa flera instanser av Truck-klassen med olika lastkapacitet och skriu ut information om varje lastbil
        Truck2 truck1 = new Truck2("Volvo", 2021, "Black", 10, 10, 2100);
        //Truck2 truck2 = new Truck2("Volvo", 2021, "Red", 2020);
        //Truck2 truck3 = new Truck2("Volvo", 2021, "White", 2300);

        // to string method
        System.out.println(truck1.model + " test");
        /*System.out.println("Truck 1 color:"+ truck1.color);
        System.out.println("Truck 2 color:"+ truck2.color);
        System.out.println("Truck 3 color:"+ truck3.color);*/

        // 12- Skapa flera instanser av Cat- och Dog-klassen och låt dem "prata" genom att anropa speak()-metoden

        Cat cat1 = new Cat();
        cat1.speak();

        Dog dog1 = new Dog();
        dog1.speak();


        // 14- Lägg till en metod i Car-klassen för att beräkna försäkringskostnaden baserat på ålder och körssträcka
        Car2 car1 = new Car2("Volvo", 2020, "red", 20, 200);

        car1.insuranceCost();

    }



}
