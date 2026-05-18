package strings;

public class Strings{
    public static void main(String[] args){
        String universityName = "Multimedia University of Kenya";

        //A string is just an object -> It has methods that can perform operations on the data
        //The length method
        System.out.println(universityName.length());

        //the toUppercase and toLowerCase methods
        System.out.println(universityName.toUpperCase());
        System.out.println(universityName.toLowerCase());

        //The index of method -> This returns the first instance of the word in that sentence
        System.out.println(universityName.indexOf("of"));

        //The charAt Method -> This returns the character at a specific index
        System.out.println(universityName.charAt(5));

        //The trim Method -> This removes the whitespaces from the word
        System.out.println(universityName.trim());
    }
}