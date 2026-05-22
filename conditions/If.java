package conditions;
import java.util.Scanner;

public class If{
    public static void main(String[] args){
        int votingAge = 18;
        int age;
        
        //create an instance of the scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Are you a Kenyan? ");
        String nationality = input.nextLine();

        if(age > votingAge){
            if(nationality == "Kenyan" || nationality == "kenyan"){
                System.out.println("A Kenyan above 18! Allowed to vote!");
            }else{
                System.out.println("Above 18 but not a Kenyan! Not allowed to vote!");
            }
        }else{
            System.out.println("Below 18! Not allowed to vote!");
        }
    }
}