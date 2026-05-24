package oop;

import java.util.Scanner;

//create a default parent class
class Parent {
    public String universityName = "Multimedia University of Kenya";
    protected String facultyName = "Computing and Information Technology";
    protected String department = "Software Engineering";
    private String registrationNumber;

    // a getter to get the value of the registrationNumber
    public String getNumber() {
        return registrationNumber;
    }

    // a setter to set the number to a param set
    public void setNumber(String number) {
        registrationNumber = number;
    }
}

// create a child class that inherits from the parent class
class Child extends Parent {
    // create a method to prompt the user to enter is reg no.
    public void enterReg() {
        // prompt the student to enter his registration number
        // user the Scanner class
        // Create an instance of the scanner class from java.util package
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your registration number: ");
        String userInput = input.nextLine();
        input.nextLine();

        // get the registration number and set it to the userInput
        getNumber();
        setNumber(userInput);

        System.out.println(userInput);
    }

    // since all the methods and attributes are inherited create a method to print
    // the details to the console
    public void printDetails() {
        enterReg();
        System.out.println(universityName);
        System.out.println(facultyName);
        System.out.println(department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // create an instance of the Child class
        Child childObject = new Child();

        // call the printDetails method
        childObject.printDetails();
    }
}
