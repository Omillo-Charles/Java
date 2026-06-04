package projects;

interface theParent {
    // define a methof without any implementation
    public void printRegNo();
}

// create a child class that implements the parent
class Child implements theParent {
    public void printRegNo() {
        System.out.println("11314");
    }
}

public class Parent {
    public static void main(String[] args) {
        // create an instance of the child class
        Child childObject = new Child();
        childObject.printRegNo();
    }
}