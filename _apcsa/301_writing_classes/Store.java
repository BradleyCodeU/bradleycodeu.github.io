// <First Name> <Last Name>
// <Class period>


// Directions:   Fill in the missing variables and methods to create the Store class.
// Their will only be 3 pieces of data for each store: the type of store (pet or grocery), the time the store opens and the time the store closes.
// To simplify the opening and closing times, our stores will only open and close on the hour.   The times will be stored in 24-hour format, so we will not be
// storing am or pm.   For example, 7 am will be stored as 7.   7pm will be stored as 19 (because 12 + 7 = 19).
// If a store has been created, you can assume that the closing time is after the opening time (and no stores are open 24 hours a day).


// When your program is complete:
// Double check that you have filled in your first name, last name and class period
// Upload your program to Canvas

public class Store
{
	// 3 instance variables (these will also be private for the AP Comp Sci class)
	// type of store (String)
	// opening time (int)
	// closing time (int)






	// First constructor: One parameter(store type), opening time set to 10 (10am) and closing time set to 21 (9pm)
	public Store(String _type)
	{


	}
	// Second constructor: 3 parameters: store type, opening time and closing time
	public Store(String _type, int _openTime, int _closeTime)
	{


	}

	// Return the type of store
	public String getType()
	{


	}
	// Return the number of hours open.
	// For example, if the store opens at 10 and closes at 18, the number of hours open is 8
	public int getNumHoursOpen()
	{


	}

	// If the store is open at currentTime, return true
	// If the store is not open at currentTime, return false
	public boolean isOpen(int currentTime)
	{



	}

	// If newType is Grocery or Pet (not case sensitive), set the type and return true;
	// Otherwise, the type remains unchanged and false is returned.
	public boolean setType(String newType)
	{


	}

	// if newOpen and newClose are both in the range [0,23] and the opening time is before the closing time,
	// set the open and close times to the new times and return true.
	// Otherwise, no times are changed and return false
	public boolean setHours(int newOpen, int newClose)
	{





	}

	// Converts timeToConvert from 24 hour time to 12 hour time.
	// For example, convertTime(5) will return the value 5am
	// convertTime(14) will return the value 2pm.
	// Note: This method is static.   That means that if you are testing this method from another program, your method
	// call will be similar to:   Store.convertTime(15);
	// If you want to call this method from within the Store class, you can call it like normal.  For example: convertTime(14)
	public static String convertTime(int timeToConvert)
	{



	}

	// toString - returns <store type> store is open from <open time> to <close time>
	// For example: grocery store is open from 10am to 11pm
	// Note: call your convertTime method to convert the time to am and pm
	// Since the convertTime method is in the same class, it can be called by just using the name of the method and the time to convert
	// For example: convertTime(15)  -- the 15 can be replaced by any int variable.  A string will be returned from the convertTime method

	public String toString()
	{

	}




}
