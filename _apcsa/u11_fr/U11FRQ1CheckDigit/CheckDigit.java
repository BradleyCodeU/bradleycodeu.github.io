public class CheckDigit
{
    /**   Returns the check digit for num, as described in part (a).
    *     Precondition: The number of digits in num is between one
    *     and six, inclusive.
    *         num >= 0
    */
    public static int getCheck(int num) {
        // to be implemented in part (a)
    return -999;
    }
    /**   Returns true if numWithCheckDigit is valid, or false
    *     otherwise, as described in part (b).
    *     Precondition: The number of digits in numWithCheckDigit
    *     is between two and seven, inclusive.
    *         numWithCheckDigit >= 0
    */
    public static boolean isValid(int numWithCheckDigit) {
        // to be implemented in part (b)
    return false;
    }

    /** Returns the number of digits in num. */
    public static int getNumberOfDigits(int num) {
        // implementation not shown
        return Integer.toString(num).length();
    }
    /** Returns the nth digit of num.
    *   Precondition: n >= 1 and n <= the number of digits in num
    */
    public static int getDigit(int num, int n) {
        // implementation not shown
        return Integer.parseInt(""+Integer.toString(num).charAt(n-1));
    }
}