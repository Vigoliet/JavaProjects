package org.example.KlasserV2;

import java.time.Year;

public class Car2 {

    // 3- Skapa en klass Car med egenskaper som modell, årsmodell och färg.
    String model;
    int year;
    String color;
    int age;
    int milage;

    //constructor

    public Car2(String model, int year, String color, int age, int milage){
        this.model = model;
        this.year = year;
        this.color = color;
        this.age = age;
        this.milage = milage;

    }

    // 4- Skapa en metod i Car-klassen som beräknar bilens ålder baserat på årsmodellen.
    public int carAge (){

        return Year.now().getValue() - year;
    }

    // 14- Lägg till en metod i Car-klassen för att beräkna försäkringskostnaden baserat på ålder och körssträcka

    public void insuranceCost(){
        if (milage == 0) {

            System.out.println("Din kostnad är: 0kr");
        }
        else{

            System.out.println(milage * year);

        }

    }

}
