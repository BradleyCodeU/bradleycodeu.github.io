/*
  Coin.java
  Represents a coin with two sides that can be flipped. Each coin has...
  - type: a String such as "penny", "nickel", etc
  - year: an int that stores the year the coin was made
  - face: an int that represents whether the coin is showing HEADS, TAILS, or UNKNOWN
*/
public class Coin
{
	//These are constants that are provided for your use.  For example, using the constant TAILS is the same as typing a 1.
	private final static int HEADS = 0;
	private final static int TAILS = 1;
	private final static int UNKNOWN = -1;

	//ADD: private instance variables including type (String), year (int), and face (int)


  //ADD: set type, year and face to parameters
	public Coin(String _type, int _year, int _face)
	{

	}
	// ADD: set the type and year to any non-empty value you like, set face equal to UNKNOWN
	public Coin()
	{

	}

	// ADD: return the value of variable type
	public String getType()
	{

	}



	// ADD: return the value of the coin.  (.25 for a quarter, .10 for a dime, etc.)
	// Precondition: type will have a valid value of "quarter", "dime", "nickel" or "penny"
	public double getValue()
	{


	}

	// ADD: return the year
	public int getYear()
	{

	}

	// ADD: return the string "heads", "tails" or "unknown"
	public String getFace()
	{


	}

  // ADD: if the year is between 1850 and 2015 (inclusive) set the year and return true.
	// Otherwise, just return false
	public boolean setYear(int _year)
	{

	}

	//ADD: Use Math.random to produce a random int (0 for heads, 1 for tails).  Set face equal to the value and then use the getFace method to return "heads" or "tails"
	//To call the getFace method, the code is simply:   getFace()
	public String flip()
	{

	}


	// ADD: return the year and type of coin.   For example: 1985 quarter
	public String toString()
	{

	}
}