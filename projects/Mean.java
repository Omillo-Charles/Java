package projects;

import java.util.Scanner;

//create the first class to calculate mean using the normal arrays
class getMean {
    // create an array of integers possible of holding upto 5 values
    int[] ages = new int[5];

    // create an instance of the Scanner class
    Scanner input = new Scanner(System.in);

    // create a method to get user input and perform operations
    public void getAges() {
        // prompt the user to enter five numbers as per our array size
        System.out.println("Enter upto 5 numbers: ");

        // loop over the numbers while storing them in the array -> use the for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println((i + 1) + "st number");
            ages[i] = input.nextInt();
        }
    }

    // since we have gotten all the ages from the user, we need to perform
    // operations, first print the ages to the console the find the mean
    public void getTheMean() {
        // loop over all the ages and print them to the console -> we will use the for
        // each loop
        for (int theNumbers : ages) {
            System.out.println(theNumbers);
        }

        // we will now find the sum of the numbers
        // 1. find the sum first
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        // print the sum to the console
        System.out.println("The sum of the numbers is: " + sum);

        // find the mean now
        int arrayLength = ages.length;
        int theMean = sum / arrayLength;
        // print the mean to the console
        System.out.println("The mean of the numbers is: " + theMean);
    }
}

// create the Mean class now
public class Mean {
    public static void main(String[] args) {
        // create an instance of the getMean class
        getMean getMeanObject = new getMean();

        // call both the functions
        getMeanObject.getAges();
        getMeanObject.getTheMean();
    }
}