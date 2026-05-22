package methods;

public class Overloading {
    // method overloading is whereby methods have the same name but different
    // parameters
    // instead of 2 different methods performing the same operations, we can have
    // one method with different parameters and return types
    // create a method named addNumbers, parse ints then doubles
    static int addNumbers(int x, int y) {
        return x + y;
    }

    static double addNumbers(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int Integers = addNumbers(32, 45);
        double Doubles = addNumbers(32.3d, 47.3d);

        System.out.println(Integers);
        System.out.println(Doubles);
    }
}
