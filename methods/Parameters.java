package methods;

public class Parameters {
    // create a method named university and parse a parameter named faculty
    // to parse a parameter the method must have a return value
    static String university(String faculty) {
        return faculty;
    }

    public static void main(String[] args) {
        String value = university("Computing and Information Technology");
        System.out.println("At multimedia university of Kenya we have the faculty of " + value);
    }
}
