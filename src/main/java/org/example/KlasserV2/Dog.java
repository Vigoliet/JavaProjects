package org.example.KlasserV2;

// 9- Skapa en subklass Dog som ärver från Animal- klassen och överskugga metoden speak() för att returnera "Woof!"
public class Dog extends Animal{


    // 15- Överskugga speak()-metoden i dog-klassen för att returnera "bark!" när hunden skäller.
    @Override
    public String speak(){
        System.out.println("Bark!");
        return "The dog barks";
    }
}
