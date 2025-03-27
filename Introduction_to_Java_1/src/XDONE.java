//Q2)Write a program to read user input until user writes XDONE and then show the entered text
// by the user on command line

import java.util.ArrayList;
import java.util.Scanner;

public class XDONE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputs = new ArrayList<>();

        System.out.println("Enter text (type 'XDONE' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("XDONE")) {
                break;
            }

            userInputs.add(input);
        }

        scanner.close();

        // Print all user inputs
        System.out.println("\nYou entered:");
        for (String text : userInputs) {
            System.out.println(text);
        }
    }
}


