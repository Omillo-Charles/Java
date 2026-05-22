package methods;

public class Definition {
    // A method is defined before the main class which is executed
    // static -> means that the method is not an objet of the class rather part of
    // the class
    static void printSchool() {
        System.out.println("Multimedia University of Kenya");
    }

    public static void main(String[] args) {
        // call the printSchool() method here
        printSchool();
    }
}
