// NOTE: In my for-each loops, I usually use variable "curr" to hold the current element of the array.
// Others will choose to use a different variable name instead of curr, but I prefer it over the use of a variable like "e"

import cs1.Keyboard;

public class ForEachLoopIntArrayExample
{
	public static void main(String[] args)
	{
		int[] numArray = {5,9,2,3,0,5,1};


		//Traditional for loop to traverse and display the contents of an array
		System.out.println("Int array displayed with traditional for loop: ");
		for (int i = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
		}

		System.out.println();

		//For-each loop to traverse and display the contents of an array
		System.out.println("\nInt array displayed using for each loop: ");
		for (int curr : numArray)
		{
			System.out.println(curr);
		}

		//Traditional for loop to calculate and display sum of the elements of an array
		System.out.println("Sum calculated and displayed using traditional for loop: ");

		int traditionalSum = 0;

		for (int i = 0; i < numArray.length; i++)
		{
			traditionalSum = traditionalSum + numArray[i];	//the first iteration of the loop, curr will have the value in numArray[0], second iteration curr will have the value in numArray[1] and so on.
		}

		System.out.println("The sum using a traditional for loop is: " + traditionalSum);
		System.out.println();


		//For-each loop used to calculate and display sum of the elements of an array
		System.out.println("\nSum calculated and displayed using for each loop: ");

		int forEachSum = 0;

		for (int curr : numArray)
		{
			forEachSum = forEachSum + curr;	  //the first iteration of the loop, curr will have the value in numArray[0], second iteration curr will have the value in numArray[1] and so on.
		}

		System.out.println("The sum using a for-each loop is: " + forEachSum);
	}
}