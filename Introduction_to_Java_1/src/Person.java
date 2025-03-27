//Q1)
//Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block,
//static method & static variable respectively.


public class Person {
    static String firstName;
    static String lastName;
    static int age;

    // Static block
    static {
        firstName = "Gauri"; // Assigning a value directly
        System.out.println("First Name (from static block): " + firstName);
    }

    // Static method
    static void printLastName() {
        lastName = "Gupta"; // Assigning a value directly
        System.out.println("Last Name (from static method): " + lastName);
    }

    public static void main(String[] args) {
        // Calling static method
        printLastName();


        age = 21;
        System.out.println("Age (from static variable): " + age);
    }
}
