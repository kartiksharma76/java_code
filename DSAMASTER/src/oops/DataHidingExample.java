package oops;

class EmployeeRecord {

    private int salary = 50000;

    public int getSalary() {
        return salary;
    }
}

public class DataHidingExample {

    public static void main(String[] args) {

        EmployeeRecord employee = new EmployeeRecord();

        System.out.println(employee.getSalary());

        // employee.salary;  Compile-time Error
    }
}