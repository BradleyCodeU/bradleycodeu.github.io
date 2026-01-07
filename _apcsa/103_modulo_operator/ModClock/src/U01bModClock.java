class 103ModClock {
    
  public static String formatMinutes(int minutes) {
    // Adds a leading zero only when necessary. formatMinutes(9) -> "09" and formatMinutes(10) -> "10"
    // convert int minutes to double. For example, 9 -> 9.0
    double minutesDouble = minutes;
    // TODO multiply by 0.1 so there's a leading zero when needed. 9.0 -> 0.9
    minutesDouble = ???;
    // TODO convert from double to String. 0.9 -> "0.9"
    String minutesString = ???;
    // use substring to extract only the two digits we need. "0.9" -> "09"
    return minutesString.substring(0,1) + minutesString.substring(2,3);
    // Credit to Conlan D. for the above awesome hack that adds a leading zero without if-statement!
  }

  public static String calculateFutureTime(int currentHour, int currentMinute, int hoursLater, int minutesLater) {
    // TODO convert everything to minutes, add all the minutes together, then convert back to hours and minutes using int division and modulus

    // TODO use the formatMinutes method to make sure that the minutes has a leading zero, if needed
    return "";
  }

  
  public static void main(String[] args) {
    // Input current time
    System.out.print("Please input current hour: ");
    // TODO get the user input
    
    System.out.print("Please input current minute: ");
    // TODO get the user input
    
    // Input hours and minutes to add
    System.out.print("Please input number of hours later: ");
    // TODO get the user input
    
    System.out.print("Please input number of minutes later: ");
    // TODO get the user input
    
    // TODO Calculate future time using the methods above
    

    // TODO Display current and future time
    System.out.println("Current time = "); 
    System.out.println("Future time = ");

  }
}