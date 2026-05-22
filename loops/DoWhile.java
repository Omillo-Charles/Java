package loops;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int votingAge = 18;
        int age;

        //create an instance of the scanner class
        Scanner input = new Scanner(System.in);

        //prompt the user to enter his age
        System.out.println("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        do{
            System.out.println("Please enter a valid value: ");
            age = input.nextInt();
            age++;
        }while(age < votingAge);

        System.out.println("Above 18!");
    }
}