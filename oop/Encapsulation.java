package oop;

public class Encapsulation {
    // create a public and a private attribute
    private String faculyName = "Computing and Information Technology";
    public String universityName = "Multimedia University of Kenya";

    // define a getter to get the value of the facultyName
    public String getFaculty() {
        return faculyName;
    }

    // define a setter and set the value of the facultyName to a param faculty
    public void setFaculty(String faculty) {
        faculyName = faculty;
    }

    // a method to print the university name and faculty to the console
    public void printUni() {
        System.out.println(universityName);
        System.out.println(faculyName);
    }

    // an executable method main
    public static void main(String[] args) {
        // create an instance of the Encapsulation class
        Encapsulation encapsulationObject = new Encapsulation();

        // call the getter method
        encapsulationObject.getFaculty();

        // call the setter method and parse a parameter in it
        encapsulationObject.setFaculty("Computing and Information Technology");

        // call the method that prints the details to the console
        encapsulationObject.printUni();
    }
}
