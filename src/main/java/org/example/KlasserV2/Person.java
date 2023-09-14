package org.example.KlasserV2;

public class Person {

    // 1- Skapa en klass Person med egenskaper som namn, ålder och kön
    public String name;
    public int age;
    public String gender;

    // Constructor
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    // we choose how the string should be formated
    @Override
    public String toString() {
        return "Name: " + name+" Age: " + age + "Gender: "+ gender;

    }
    // 13- Skapa en funktion som accepterar en Person som parameter och skriver ut personens information
    // Static only runs the class not on the instance

    public static void personInfo(Person person){
        System.out.println(person.toString());

    }
}
