import java.util.*;

public class LoopProgrammingReview
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int progNum = 0;
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programZero(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programOne(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programTwo(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programThree(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programFour(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programFive(in);
	}



	private static void programZero(Scanner in){
		int num = 0;
		do
		{
			System.out.print("Enter an int in the range [3,8]: "); //NOTE: When checking your program, be sure to check the boundary/edge cases - particulary the value 3 and 8
			//get the next number from scanner
			//if ()	//ADD
			{
				System.out.println("Error - number is less than 3 \n");
			}
			//else if ()	//ADD
			{
				System.out.println("Error - number is greater than 8 \n");
			}
		} while (false); //FIX THIS
		System.out.println("Yay - " + num + " is in the range [3,8] \n");
	}



	private static void programOne(Scanner in){
		String answer;
		do
		{
			System.out.print("Enter a string that does not contain the letter s: ");
			answer = in.nextLine();
			//if ()  //ADD
			{
				System.out.println("Error - string should not contain the letter 's' \n");
			}
		} while (false); //FIX THIS
		System.out.println("Yay - a string with no letter 's' \n");
	}



	private static void programTwo(Scanner in){
		System.out.println("Please enter four negative numbers below.");
		System.out.println("The sum of the negative numbers will be calculated and displayed.");
		int num;				//most recent number entered by user
		int sum = 0;			//sum of the negative numbers entered
		int numNegatives = 0; 	//number of negative numbers entered
		do
		{
			System.out.print("Enter int #" + (numNegatives + 1)+ ": ");
			//get the next number from scanner
			//if ()	//ADD
			{
				//sum = sum + num;
				numNegatives++;
			}
			//else
			{
				System.out.println("Error - number is not negative\n");
			}
		} while (false); //FIX THIS
		System.out.println("The sum of the negative number is: " + sum + "\n");
	}



	private static void programThree(Scanner in){
		String answer = "";
		//lastCharacter; //declare a variable to store the last character
		do
		{
			System.out.print("Enter a string that has length of at least 5 and the last letter is an s: ");
			//get the next line from scanner
			//lastCharacter = ; //ADD code to find the last character and store it in variable lastCharacter
			//if ()	//ADD
			{
				System.out.println("String is too short and the last letter is not an 's' \n");
			}
			//else if ()	//ADD
			{
				System.out.println("String is too short \n");
			}
			//else if()	//ADD
			{
				System.out.println("last letter is not an 's' \n");
			}
		} while (false); //FIX THIS
		System.out.println("Yay - the length is " + answer.length() + " and last letter is an 's' \n");
	}



	private static void programFour(Scanner in){
		/*
		 * Fill in the code to print the Fibonacci sequence up to a stopping point
		 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc...
		 * The next number is found by adding up the two numbers before it.
		 * The 2 is found by adding the two numbers before it (1+1)
		 * The 3 is found by adding the two numbers before it (1+2),
		 * And the 5 is (2+3) and so on!
		 */
		//ArrayList< ADD > myArray = //ADD
		//myArray.add(0)
		//myArray.add(1)
		//int stoppingPoint
		// prompt for an integer to use as a stopping point
		// while scanner does not have next int
		{
			// print "Not an integer number"
			//in.nextLine(); // throw away everything currently in the scanner
			// prompt for an integer to use as a stopping point
		}
		//while(last value of myArray is less than stoppingPoint)
		{
			//add together the last two values of myArray add append the sum to the end of the list
		}
		//print myArray
	}



	private static void programFive(Scanner in){
		// Ask the user for several numbers or Q to quit. Then calculate the average of their numbers.
		//count = 0
		//sum = 0
		//while true // repeat until the use types Q then break
		{
			// prompt for an integer or Q to quit.
			//if ??? // if the scanner has next int
			{
				// get the next int and add it to the sum
				// increment the count
			}
			//else if ??// the scanner's next line is Q
			{
				//exit the loop
			}
			//else
			{
				// print "Not an integer number"
				//in.nextLine(); // throw away everything currently in the scanner
			}
		}
		//if count > 0
		{
			// calculate and print average
		}
	}
}
