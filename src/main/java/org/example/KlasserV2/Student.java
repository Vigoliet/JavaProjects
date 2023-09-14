package org.example.KlasserV2;


// 6- Skapa en subklass Student som ärver från Person-klassen och inkluderar en ny egenskap för utbildningnivå (education)
public class Student extends Person{

    public String education;
    public Student(String name, int age, String gender, String education) {

        super(name, age, gender);
        this.education = education;
    }

    @Override
    public String toString() {

        return super.toString()+ "Education:" + education;
    }
}
