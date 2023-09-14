package org.example.Employee;

// 19- Skapa en subklass Enginner som ärver fråm Employee och inkluderar en specialitet (t.ex "Software Enginner").
public class Enginner extends Employee{

    public String EnginnerSpeciallity;
    public Enginner(int hireNr, int salary) {
        super(hireNr, salary);
    }


}
