---
layout: project
category: 115_strings
title: Phone Number App
---


Practice using String methods indexOf, length, equals, substring, and compareTo as well as using basic if statements.

Define the following four static methods


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



    // public static String numberStringToPhoneFormat(String numberString)
    // Focus: Practice using length, substring, equals, basic if statements
    // This method takes a string of digits and "beautifies" it into a standard phone format.
    // Use isPhoneFormat to check the input. If it was already in phone format, then return it as is.
    // If the input equals "911" then return "911"
    // If the input is any length other than 10, return the error message: "Error: Not a 10-digit number string"
    // Otherwise use substring to reformat the number.
    // For example, numberStringToPhoneFormat("1234567890") --> "(123) 456-7890"



    // public static String phoneFormatToNumberString(String phoneFormat)
    // Focus: Practice using length, substring, equals, basic if statements
    // This method takes a formatted string like (415) 555-1212 and strips it down to just the digits.
    // Use isPhoneFormat to check the input. If false, return the error message: "Error: Not a 14-digit phone format string"
    // If the input equals "911" then return "911"
    // Otherwise use substring to reformat the number.
    // For example, phoneFormatToNumberString("(678) 567-4321") --> "6785674321"



    // public static int compareAreaCodes(String phone1, String phone2)
    // Focus: Using substring, compareTo
    // This method compares two phone format numbers to see which one's area code comes first numerically.
    // The area code is the first three digits inside of the parentheses.
    // Use substring to compare ONLY the first three digits inside of the parentheses.
    // Use compareTo to find the order of the two area codes.
    // Return the resulting integer (a negative int, zero, or a positive int).
    // For example, compareAreaCodes("(614) 789-6543", "(614) 555-1234") --> 0
