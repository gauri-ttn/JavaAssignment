//Question 3)
//Write a java program to show following menu to the user: *******Menu*******
//        1. Calculate Area of Circle 2. Calculate Circumference of a Circle
//3. Exit. Choose an option (1-3): Take radius as user input. Hint: Use Switch
//statement to act on the menu. Also area and circumference methods should be static.


        import java.util.Scanner;

public class Circle {
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n******* Menu *******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of Circle");
            System.out.println("3. Exit");
            System.out.print("Select an option (1-3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + calculateArea(radius));
                    break;

                case 2:
                    System.out.print("Enter the radius: ");
                    radius = scanner.nextDouble();
                    System.out.println("Circumference of Circle: " + calculateCircumference(radius));
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
            }
        } while (choice != 3);

    }
}


