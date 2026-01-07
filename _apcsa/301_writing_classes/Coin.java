public class Coin
{
	//These are constants that are provided for your use.  For example, using the constant "TAILS" is the same as typing a 1.
	private final static int HEADS = 0;
	private final static int TAILS = 1;
	private final static int UNKNOWN = -1;

	//ADD: private instance variables, type (String), year (int), face (int)


	// ADD: set type and year to parameters, set face equal to UNKNOWN
	public Coin(String _type, int _year)
	{

	}

	//ADD: set type, year and face to parameters
	public Coin(String _type, int _year, int _face)
	{

	}

	// ADD: return the value of variable type
	public String getType()
	{

	}

	// ADD: if the year is between 1850 and 2015 (inclusive) set the year and retrn true.
	// Otherwise, just return false
	public boolean setYear(int _year)
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
