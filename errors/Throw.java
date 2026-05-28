package errors;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        // create an instance of the Scanenr class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // open an if statement to check if the number is below 1, if yes throw an
        // exception
        try {
            if (number < 1) {
                throw new ArithmeticException("Number less than 1!");
            }
        } catch (Exception e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}