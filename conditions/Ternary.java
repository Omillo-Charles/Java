package conditions;
import java.util.Scanner;

public class Ternary{
    public static void main(String[] args){
        int votingAge = 18;
        String Nationality = "Kenyan";
        
        //Variables user to enter
        int age;
        String nationality;

        //Create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        //Get user's age
        System.out.println("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        //Get user's nationality
        System.out.println("Enter your nationality: ");
        nationality = input.nextLine();

        //Conditions to validate details
        String ageOutput = (age >= votingAge) ? "Allowed to vote" : "Not allowed to vote";
        String nationalityOutput = (nationality == Nationality) ? "A Kenyan, allowed to vote!" : "Not a Kenyan, not allowed to vote!";

        System.out.println(ageOutput);
        System.out.println(nationalityOutput);
    }
}