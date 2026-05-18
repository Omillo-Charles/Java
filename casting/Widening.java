package casting;

public class Widening{
    public static void main(String[] args){
        int number = 9;
        double myNumber = number; //This is automatic casting -> Widening casting, converting from a smaller data type to a bigger data type

        System.out.println(number); //outputs 9
        System.out.println(myNumber); //outputs 9.0 due to automatic casting
    }
}