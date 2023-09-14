package org.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> manager1Subordinates = new ArrayList<>();

        Employee employee1 = new Employee(20, 20);
        Employee employee2 = new Employee(21, 202348);


        manager1Subordinates.add(employee1);
        manager1Subordinates.add(employee2);


        Manager manager1 = new Manager(1,2000000, manager1Subordinates);


        //manager1.AddEmployee(employee1);


        System.out.println(manager1);


        //System.out.println(employee1.hireNr);

        // 20- Skapa flera instanser av både Manger- och Engineer-klasserna och bygg en organisation
        // med chefer och ingenjörer.
        

    }

}
