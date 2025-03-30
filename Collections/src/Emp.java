//Question4)
//Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary
// as value.

import java.util.*;

class Emp {
    String name;
    int age;
    String role;


    public Emp(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Emp emp = (Emp) obj;
        return age == emp.age && name.equals(emp.name) && role.equals(emp.role);
    }

    public int hashCode() {
        return Objects.hash(name, age, role);
    }

    public String toString() {
        return name + " | " + age + " | " + role;
    }

    public static void main(String[] args) {
        Map<Emp, Double> empSalaries = new HashMap<>();


        empSalaries.put(new Emp("Amit", 30, "Dev"), 85000.0);
        empSalaries.put(new Emp("Priya", 28, "HR"), 95000.0);
        empSalaries.put(new Emp("Rahul", 35, "Manager"), 120000.0);
        empSalaries.put(new Emp("Neha", 25, "Analyst"), 75000.0);


        for (var e : empSalaries.entrySet()) {
            System.out.println(e.getKey() + " | ₹" + e.getValue());
        }
    }
}
