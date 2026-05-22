package conditions;
import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        int number;

        //create an instance of the Scanner class
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        input.nextLine();

        switch(number){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Smile weekend is here!");
        }
    }
}