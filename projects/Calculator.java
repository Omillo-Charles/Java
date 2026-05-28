package projects;

import java.util.Scanner;

//create a class that will prompt the user to enter the numbers and perform operations on the user's input
//this class will be a default class -> it will only be accesible within this package: project
class userInput {
    // create an instance of the Scanner class
    Scanner input = new Scanner(System.in);

    // create a method to get the user's input
    public void getData() {
        // prompt the user to enter the numbers
        // the first number
        System.out.println("Enter a number: ");
        int firstNumber = input.nextInt();

        // the second number
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        // perform mathematical operations on the input
        // 1. Addition
        int sum = firstNumber + secondNumber;
        // 2. Subtraction
        int subtraction = firstNumber - secondNumber;
        // 3. division
        int division = firstNumber / secondNumber;
        // 4. multiplication
        int multiplication = firstNumber * secondNumber;

        // print the results of the operations to the console
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(multiplication);
    }
}

public class Calculator {
    public static void main(String[] args) {
        // create an instance of the userInput class
        userInput userInputObject = new userInput();

        // call the method of the object of the userInput class
        userInputObject.getData();
    }
}
