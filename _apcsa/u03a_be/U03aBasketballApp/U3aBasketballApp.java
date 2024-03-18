import java.awt.Point;


public class U03aBasketballApp {

  // 1. Create a public static method named haveSameJerseyNumber that takes two BasketballPlayer objects as arguments. Return true if the jerseyNumbers are equal otherwise return false.

  // 2. Create a public static method named areOnSameTeam that takes two BasketballPlayer objects as arguments. If either player's team is null, return false. Return true if the teams are equal otherwise return false.

  // 3. Create a public static method named areInSameLocation that takes two BasketballPlayer objects as arguments. If either player's location is null, return false. Using the equals method of the Point class, return true if these locations are equal otherwise return false.

  // 4. Create a public static method findDistance that take two BasketballPlayer objects as arguments. If either player's location is null, return -1 to indicate an invalid distance. Using the distance method of the Point class, calculate and return the distance between the two points.

  // 5. Create a public static method longestName that take two BasketballPlayer objects as arguments. This method takes two BasketballPlayer objects as arguments and returns the name of the player with the longest name. If both players have names of equal length, it returns the message "Equal length"

  // 6. Create public static method tradePlayer that takes two arguments: BasketballPlayer tradedPlayer and String newTeam. This method updates the teamName of the specified BasketballPlayer object to the new team name provided as an argument. If the player is ALREADY on the newTeam, then return false. Otherwise, update the player's team name, generates a random jersey number between 0 and 55 (inclusive) and assign it to the player, then return true.

  
  public static void main(String[] args) {
    
    BasketballPlayer p1 = new BasketballPlayer("Lebron James", "LA Lakers", 23);
    BasketballPlayer p2 = new BasketballPlayer("Diana Taurasi", "Phoenix Mercury", 3);
    BasketballPlayer p3 = new BasketballPlayer("Breanna Stewart", "NY Liberty", 30);
    BasketballPlayer p4 = new BasketballPlayer();
    
    
  }
}