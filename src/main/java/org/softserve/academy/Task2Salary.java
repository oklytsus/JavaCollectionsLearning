package org.softserve.academy;

/**
 * Create class called Employee that should consist of:
 * three private fields: name, rate and hours;
 * a static field called  totalSum
 * properties to access these fields;
 * a	default constructor and two constructors with parameters;
 * Methods:
 * getSalary() - to calculate the salary of an employee (formula rate * hours);
 * toString() - to output information about the employee;
 * getBonuses() – to calculate 10% from salary.
 * <p>
 * In the main() method create 3 objects of type Employee, input information about them.
 * Display the total salary of all employees to the console.
 */
class Employee {
    private String name;
    private double rate;
    private int hours;
    static double totalSum;

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }



    @Override
    public String toString() {
        return "Name: " + name +
                ", Rate: " + rate +
                ", Hours: " + hours;
    }

    double getSalary() {
        return hours * rate;
    }

    double getBonuses() {
        final double BONUS_RATE = 0.1;
        return BONUS_RATE * getSalary();
    }
}

public class Task2Salary {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Alice");
        emp1.setRate(10.5);
        emp1.setHours(160);
        Employee emp2 = new Employee("Bob", 12.0);
        emp2.setHours(180);
        Employee emp3 = new Employee("Charley", 11, 140);

        Employee.totalSum = emp1.getSalary() + emp1.getBonuses() + emp2.getSalary() + emp2.getBonuses() +
                emp3.getSalary() + emp3.getBonuses();
        System.out.println("Employees:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("Total Salary: " + Employee.totalSum);
    }
}
