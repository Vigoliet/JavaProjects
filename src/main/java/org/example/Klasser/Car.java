package org.example.Klasser;

// 1- Skapa en klass "Car" med medlemsvariablerna "model" och "year".

public class Car {

    String model;
    int year;

    // 3- Lägg till en constructor i "Car" - klassen och använda den för att skapa en ny instans av "Car".

    public Car(String model, int year){
        this.model = model;
        this.year = year;

    }
    // 4- Skapa en metod i "Car" klasen som returnerar en sträng med bilens modell och årsmodell.

    public String carInfo(){
        return (model + year);

    }
    // 5- Skapa en metod i "Car" klassen som returnerar bilens ålder baserat på dess årsmodell.
    public int carAge(){
        return 2023 - year;
    }

}
