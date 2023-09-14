package org.example.KlasserV2;


// 8- Skapa en subklass Cat som ärver fråm Animal-klassen och överskugga metoden speak() för att returnera "Meow"
public class Cat extends Animal{

    //16- Överskugga speak()-metoden i cat-klassen för att returnera "purr!" när hunden skäller.
    @Override
    public String speak(){
        System.out.println("Purr!");
        return "the cat purrs";
    }

}
