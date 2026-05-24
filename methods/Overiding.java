package methods;

//define a parent class with a method printSchool
class Parent {
    public void printSchool() {
        System.out.println("Multimedia University of Kenya");
    }
}

// define a child class, inherits from the parent and overrides the printSchool
// method
class Child extends Parent {
    @Override
    public void printSchool() {
        System.out.println("Strathmore University");
    }
}

public class Overiding {
    public static void main(String[] args) {
        // create an instance of the parent class
        Parent parentObject = new Parent();
        Child childObject = new Child();

        parentObject.printSchool();
        childObject.printSchool();
    }
}
