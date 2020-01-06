import cs1.Keyboard;

public class ForEachLoopStringExample
{
	public static void main(String[] args)
	{
		String[] wordArray = {"banana", "microwave", "stove", "plate", "fork"};

		System.out.println("\nString array displayed using a traditional for loop: ");
		for (int i = 0; i < wordArray.length; i++)
		{
			System.out.println(wordArray[i]);
		}

		//For-each loop to traverse and display the contents of an array
		System.out.println("\nString array displayed using a for each loop: ");
		for (String curr : wordArray)
		{
			System.out.println(curr);
		}

		System.out.println();

		//Prompt the user for a value.  Seard wordArray.  Display found or not found (once only)

		System.out.print("Enter a string: ");
		String searchWord = Keyboard.readString();
		{
			System.out.println("\nFound or not found using traditional for loop: ");

			boolean found = false;
			for (int i = 0; i < wordArray.length; i++)
			{
				if (searchWord.equals(wordArray[i]))
				{
					found = true;
				}
			}

			if (found)
			{
				System.out.println(searchWord + " was found");
			}
			else
			{
				System.out.println(searchWord + " was NOT found");
			}
		}

		System.out.println();

		System.out.println("\nFound or not found using a for-each loop: ");
		{
			boolean found = false;

			for (String curr : wordArray)
			{
				if (searchWord.equals(curr))
				{
					found = true;
				}
			}

			if (found)
			{
				System.out.println(searchWord + " was found");
			}
			else
			{
				System.out.println(searchWord + " was NOT found");
			}
		}

	}
}