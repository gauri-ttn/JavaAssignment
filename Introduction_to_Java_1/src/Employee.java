//Question5)
//Create a class named Employee with fields firstname,lastname,age and designation. The class
//should: 1. have all types of constructors to initialize the object 2. class should also have
// setter methods to update a particular field 3. Override its toString method to display a meaningful
//message using all these fields.



public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.designation = "Not Assigned";
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Gauri", "Gupta", 21, "Software Engineer");
        System.out.println(emp1);

        emp1.setAge(22);
        emp1.setDesignation("Senior Software Engineer");
        System.out.println("\nAfter Update:");
        System.out.println(emp1);
    }
}
