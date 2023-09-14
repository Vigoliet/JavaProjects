package org.example.Employee;

// 17- SKapa en klass Employee med egenskaper som anställningsnummer och lön.
public class Employee {

    public int employeeNumber;
    public int salary;

    public Employee(int employeeNumber, int salary){
        this.employeeNumber = employeeNumber;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireNr=" + employeeNumber +
                ", salary=" + salary +
                '}';
    }
}
