import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;


    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    public String formatUser() {
        return firstName + " | " + lastName + " | " + age + " | " + phoneNumber;
    }
}


public class UserDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "users.txt";


        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            while (true) {
                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine().trim();


                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine().trim();


                System.out.print("Enter Age: ");
                int age;
                try {
                    age = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age. Please enter a number.");
                    continue;
                }


                System.out.print("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine().trim();


                User user = new User(firstName, lastName, age, phoneNumber);
                fileWriter.write(user.formatUser() + "\n");
                fileWriter.flush();


                System.out.println("User added successfully!");
                System.out.println("Do you want to add another user? (Type QUIT to stop)");


                String response = scanner.nextLine().trim();
                if (response.equalsIgnoreCase("QUIT")) {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } finally {
            scanner.close();
        }
    }
}
