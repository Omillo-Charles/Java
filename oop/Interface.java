package oop;

interface University {
    public void printUni();
}

class Faculty implements University {
    @Override
    public void printUni() {
        System.out.println("Multimedia University of Kenya");
    }
}

public class Interface {
    public static void main(String[] args) {
        // create an instance of the Faculty class
        Faculty facultyObj = new Faculty();
        facultyObj.printUni();
    }
}
