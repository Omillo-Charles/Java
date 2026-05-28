package errors;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // create the try catch statement here
        try {
            // prompt the user to enter a random number and print the number to the console
            // create an instance of the Scanner class and store the input to a variable
            // number
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a random number: ");
            int number = input.nextInt();
            input.nextLine();

            System.out.println("You entered " + number);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}