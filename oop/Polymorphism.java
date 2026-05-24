package oop;

//The parent class
class Omytech {
    public void welcomeClient() {
        System.out.println("Welcome to the OMYTECH");
    }
}

// The child class
class Omygen extends Omytech {
    public void welcomeClient() {
        System.out.println("Welcome to the OMYGEN");
    }
}

// The grandchild class
class Omylabs extends Omygen {
    public void welcomeClient() {
        System.out.println("Welcome to the OMYLABS");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // create an innstance of all the classes using the Omytech class
        Omytech omytechObject = new Omytech();
        Omytech omygenObject = new Omygen();
        Omytech omylabsObject = new Omylabs();

        omytechObject.welcomeClient();
        omygenObject.welcomeClient();
        omylabsObject.welcomeClient();
    }
}
