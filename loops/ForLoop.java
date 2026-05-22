package loops;

public class ForLoop {
    public static void main(String[] args) {
        // create an array of five uni names
        String[] universityNames = { "Multimedia", "Strathmore", "Daystar" };

        for (int i = 0; i < 3; i++) {
            System.out.println(universityNames[i]);
        }

        // the for of loop
        for (String uni : universityNames) {
            System.out.println(uni);
        }
    }
}
