import java.util.Scanner;

public class PhoneNumberApp {

    // DEFINE THE FOLLOWING STATIC METHODS


    // public static boolean isPhoneFormat(String anyFormat)
    // Focus: Practice using indexOf, length, basic if statements
    // This method acts as a validator. It checks if a given string is "well-formed" according to the standard: "(XXX) XXX-XXXX"
    // Logic Requirements: To return true, the string MUST pass the following "spot checks" using indexOf:
    // Length Check: The total length MUST be exactly 14 characters. If not, return false.
    // Parentheses: The open parenthesis ( MUST be at index 0. If not, return false.
    // The closing parenthesis ) MUST be at index 4. If not, return false.
    // Blank Space: There MUST be a space at index 5. If not, return false.
    // Hyphen: The hyphen - MUST be at index 9. If not, return false.
    // If all characters are in their correct positions, return true.
    // For example, isPhoneFormat("555-9876") --> false
    // TODO


    // public static String numberStringToPhoneFormat(String numberString)
    // Focus: Practice using length, substring, equals, basic if statements
    // This method takes a string of digits and "beautifies" it into a standard phone format.
    // Use isPhoneFormat to check the input. If it was already in phone format, then return it as is.
    // If the input equals "911" then return "911"
    // If the input is any length other than 10, return the error message: "Error: Not a 10-digit number string"
    // Otherwise use substring to reformat the number.
    // For example, numberStringToPhoneFormat("1234567890") --> "(123) 456-7890"
    // TODO


    // public static String phoneFormatToNumberString(String phoneFormat)
    // Focus: Practice using length, substring, equals, basic if statements
    // This method takes a formatted string like (415) 555-1212 and strips it down to just the digits.
    // Use isPhoneFormat to check the input. If false, return the error message: "Error: Not a 14-digit phone format string"
    // If the input equals "911" then return "911"
    // Otherwise use substring to reformat the number.
    // For example, phoneFormatToNumberString("(678) 567-4321") --> "6785674321"
    // TODO


    // public static int compareAreaCodes(String phone1, String phone2)
    // Focus: Using substring, compareTo
    // This method compares two phone format numbers to see which one's area code comes first numerically.
    // The area code is the first three digits inside of the parentheses.
    // Use substring to compare ONLY the first three digits inside of the parentheses.
    // Use compareTo to find the order of the two area codes.
    // Return the resulting integer (a negative int, zero, or a positive int).
    // For example, compareAreaCodes("(614) 789-6543", "(614) 555-1234") --> 0
    // TODO

    



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a phone number: ");
        String userString1 = input.nextLine();

        System.out.println("true or false, was that in Phone Format?");
        // TODO call isPhoneFormat to check userString1 and print the result

        System.out.println("converting...");
        // TODO use numberStringToPhoneFormat to convert it, save it in userPhoneFormat1, print it
        // String userPhoneFormat1 = ???

        // System.out.println(userPhoneFormat1);
        System.out.println("true or false, is it now in Phone Format? expected true");
        // TODO call isPhoneFormat to check userPhoneFormat1 and print the result

        System.out.println("converting...");
        // TODO use phoneFormatToNumberString to convert it, save it in userNumberString1, print it
        // String userNumberString1 = ???

        // System.out.println(userNumberString1);
        System.out.println("true or false, is it now in Phone Format? expected false");
        // TODO call isPhoneFormat to check userNumberString1 and print the result


        System.out.print("Please type ANOTHER phone number: ");
        String userString2 = input.nextLine();

        System.out.println("converting...");
        // TODO use numberStringToPhoneFormat to convert userString2, save it in userPhoneFormat2, print it
        // String userPhoneFormat2 = ???

        // System.out.println(userPhoneFormat2);

        System.out.println("checking area codes...");
        // TODO use compareAreaCodes to compare userPhoneFormat2 and userPhoneFormat and print the result

        input.close();
    }
}
