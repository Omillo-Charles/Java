package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // There are multiple ways of declaring arrays in Java
        String[] unis = new String[4];
        String[] universities = { "Multimedia", "Maseno", "TUK", "TUM" };

        // We need to manipulate the first array declaration method by prompting the
        // user to enter the universities he knows using the Scanner class of the
        // java.util package
        // create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the 4 unis
        System.out.println("Enter any 4 universities you know: ");
        // loop over the unis array and store each value
        for (int i = 0; i < unis.length; i++) {
            unis[i] = input.nextLine();
        }
        // loop over the stored universities and print them to the console
        for (String theUni : unis) {
            System.out.println(theUni);
        }

        // loop over the universities and print them to the console
        // we will use the for each loop
        for (String univ : universities) {
            System.out.println(univ);
        }
    }
}
