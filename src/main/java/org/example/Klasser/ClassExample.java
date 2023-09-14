package org.example.Klasser;

import java.util.ArrayList;
import java.util.List;


// 1- Skapa en klass "Car" med medlemsvariablerna "model" och "year".
// 2- Skapa en instans av "Car" - klassen och tilldela värden till medlemsvariablerna.
// 3- Lägg till en constructor i "Car" - klassen och använda den för att skapa en ny instans av "Car".
// 4- Skapa en metod i "Car" klasen som returnerar en sträng med bilens modell och årsmodell.
// 5- Skapa en metod i "Car" klassen som returnerar bilens ålder baserat på dess årsmodell.
public class ClassExample {
    public static void main(String[] args) {

        //list for all vehicles
        List<Vehicle> myVehicles = new ArrayList<>();



        // 2- Skapa en instans av "Car" - klassen och tilldela värden till medlemsvariablerna.
        /*Car car1 = new Car();
        car1.model = "Ford";
        car1.year = 1995;
        System.out.println("Model of your car: "+ car1.model + " year: " + car1.year);*/

        // 3
        Car car2 = new Car("Ford", 2023);
        System.out.println("Model of your car: "+ car2.model + " year: " + car2.year);

        // 4
        Car car3 = new Car("Volvo", 1995);
        String carInfo = car3.carInfo(); //since this method runs, it goes to the method in Car class
        System.out.println(carInfo);


        // 5- Skapa en metod i "Car" klassen som returnerar bilens ålder baserat på dess årsmodell.
        Car car4 = new Car("Skoda", 2004);
        int carAge = car4.carAge();
        System.out.println(carAge);

        //
        //car4.StartEngine();

        Truck truck = new Truck();

        // adds vehicle to the list
        myVehicles.add(truck);
        myVehicles.add(car3);
        myVehicles.add(car4);

        // runs StartEngine method for all vehicles in list
        for (int i = 0; i < myVehicles.size(); i++) {
            myVehicles.get(i).StartEngine();
        }

    }
}
