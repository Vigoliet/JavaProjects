package org.example.Employee;

import java.util.ArrayList;
import java.util.List;

// 18- Skapa en subklass Manager som ärver från Employee och inkluderar en lista över underordnade anställda.
public class Manager extends Employee {

    //subordinates list
    public List<Employee> subordinates;

    public Manager(int employeeNumber, int salary, List<Employee> subordinates) {
        super(employeeNumber, salary);
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return super.toString()+ "subordinates: " + subordinates;
    }
}


    //method to add employees to the list
   /* public void AddEmployee(Employee newEmployee){
        employeesList.add(newEmployee);
    }
}*/


