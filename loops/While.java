package loops;
import java.util.Scanner;

public class While{
    public static void main(String[] args){
        int base = 10;
        int number;

        //create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a number so that we print the numbers from 1 to that number to the console
        System.out.println("Enter a number btn 1 and 10: ");
        number = input.nextInt();
        input.nextLine();

        //create a while loop
        while(number <= base){
            System.out.println(number);
            number++;
        }
    }
}