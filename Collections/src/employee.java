//Question2)
//Given the following class Employee class{ Double Age; Double Salary; String Name} Design the class in such a way that
//the default sorting should work on firstname and lastname. Also, Write a program to sort Employee objects based on salary
// using Comparator.

import java.util.*;


class employee implements Comparable<employee> {
    private Double age;
    private Double salary;
    private String firstName;
    private String lastName;


    public employee(Double age, Double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Double getAge() {
        return age;
    }


    public Double getSalary() {
        return salary;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public int compareTo(employee other) {
        int firstCompare = this.firstName.compareTo(other.firstName);
        return (firstCompare != 0) ? firstCompare : this.lastName.compareTo(other.lastName);
    }
    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Salary: ₹" + salary;
    }


    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();
        employees.add(new employee(30.0, 850000.0, "Amit", "Sharma"));
        employees.add(new employee(28.0, 1200000.0, "Priya", "Verma"));
        employees.add(new employee(35.0, 950000.0, "Rahul", "Singh"));
        employees.add(new employee(25.0, 1100000.0, "Neha", "Iyer"));
        employees.add(new employee(40.0, 750000.0, "Suresh", "Pillai"));


        Collections.sort(employees);
        System.out.println("Employees sorted by Name:");
        employees.forEach(System.out::println);


        employees.sort(Comparator.comparing(employee::getSalary));
        System.out.println("\nEmployees sorted by Salary:");
        employees.forEach(System.out::println);
    }
}
