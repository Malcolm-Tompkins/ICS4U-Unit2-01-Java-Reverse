/*
* Reverses a given string
*/

import java.util.Scanner;

/**
* Reverse class.
*/

final class Reverse {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Reverses user input string.
    *
    * @param anyString any string input by the user
    * @return The reversed string
    */

    public static String reverse(final String anyString) {
        String returnValue = null;
        // Uses recursion to reverse string
        if (anyString.length() == 0) {
            returnValue = anyString;
        } else {
            returnValue = reverse(anyString.substring(1)) + anyString.charAt(0);
        }
        return returnValue;
    }
    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If user input is invalid
    */

    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Input your string to be converted: ");
        final String userString = myObj.nextLine();
        final String reversedString = reverse(userString);
        // Output
        System.out.println("Your reverse string is: " + reversedString);
        System.out.println("Done.");
    }
}
