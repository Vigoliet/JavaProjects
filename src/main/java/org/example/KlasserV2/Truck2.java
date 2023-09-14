package org.example.KlasserV2;


import org.example.Klasser.Car;

// 7- Skapa en subklass Truck som ärver från Car-klassen och inkluderar en ny egenskap för lastkapacitet.
public class Truck2 extends Car2 {

    public int loadingCapacity;

    public Truck2(String model, int year, String color, int age, int milage, int loadingCapacity) {
        super(model, year, color, age, milage);
        this.loadingCapacity = loadingCapacity;
    }
}
