package variables;

public class Variables{
    public static void main(String[] args){
        //Integers are declared by int
        int age = 20;
        int academicYear;
        academicYear = 2;

        System.out.println(age);
        System.out.println(academicYear);

        //Words or Strings are declared by String
        String school = "Multimedia University of Kenya";
        String program;
        program = "Software Engineering";

        System.out.println(school);
        System.out.println(program);

        //Floating point numbers are declared by float
        float netWorth = 50123.06f;
        float valuation;
        valuation = 4873467.90f;

        System.out.println(netWorth);
        System.out.println(valuation);

        //The Booleans are declared by boolean
        boolean isStudent = true;
        System.out.print(isStudent);

        //The final keyWord -> The final keyword is used to declare variables whose value should not be changed or will not be changed
        final int MINUTES_PER_HOUR = 60;
        System.out.print(MINUTES_PER_HOUR);
    }
}