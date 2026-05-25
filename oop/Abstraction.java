package oop;

//create the abstract class
abstract class University {
    // create an abstract method which should not have implementation details
    public abstract void printUniversity();
}

// create a child class to inherit from the abstract class
class Faculty extends University {
    public void printUniversity() {
        System.out.println("Multimedia University of Kenya.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // create an instance of the Faculty class
        Faculty facultyObject = new Faculty();
        facultyObject.printUniversity();
    }
}
