package casting;

public class Narrowing{
    public static void main(String[] args){
        //Narrowing Casting means conversion from a bigger data type to a smaller data type
        double grossSalary = 367349.4949d;
        int netSalary = (int) grossSalary;

        System.out.println(grossSalary); //Outputs 367349.4949
        System.out.println(netSalary); //outputs 367349
    }
}